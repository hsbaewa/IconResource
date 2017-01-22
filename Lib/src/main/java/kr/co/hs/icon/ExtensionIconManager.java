package kr.co.hs.icon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import java.io.File;


/**
 * 생성된 시간 2017-01-20, Bae 에 의해 생성됨
 * 프로젝트 이름 : IconResource
 * 패키지명 : kr.co.hs.icon
 */

public class ExtensionIconManager implements ExtensionIconManagerConst{

    private static ExtensionIconManager instance = null;
    public static ExtensionIconManager getInstance(){
        if(instance == null)
            instance = new ExtensionIconManager();
        return instance;
    }

    private String getExtension(String fileName){
        int pos = fileName.lastIndexOf( "." );
        String ext = fileName.substring( pos + 1 );
        return ext;
    }


    public int getResource(String path){
        String extension = getExtension(path);
        if(AAC.equalsIgnoreCase(extension)){
            return R.drawable.ic_aac;
        }
        else if(ACE.equalsIgnoreCase(extension)){
            return R.drawable.ic_ace;
        }
        else if(AI.equalsIgnoreCase(extension)){
            return R.drawable.ic_ai;
        }
        else if(AUT.equalsIgnoreCase(extension)){
            return R.drawable.ic_aut;
        }
        else if(AVI.equalsIgnoreCase(extension)){
            return R.drawable.ic_avi;
        }
        else if(BIN.equalsIgnoreCase(extension)){
            return R.drawable.ic_bin;
        }
        else if(BMP.equalsIgnoreCase(extension)){
            return R.drawable.ic_bmp;
        }
        else if(CAD.equalsIgnoreCase(extension)){
            return R.drawable.ic_cad;
        }
        else if(CDR.equalsIgnoreCase(extension)){
            return R.drawable.ic_cdr;
        }
        else if(CSS.equalsIgnoreCase(extension)){
            return R.drawable.ic_css;
        }
        else if(DB.equalsIgnoreCase(extension)){
            return R.drawable.ic_db;
        }
        else if(DMG.equalsIgnoreCase(extension)){
            return R.drawable.ic_dmg;
        }
        else if(DOC.equalsIgnoreCase(extension)){
            return R.drawable.ic_word;
        }
        else if(DOCX.equalsIgnoreCase(extension)){
            return R.drawable.ic_word;
        }
        else if(DWF.equalsIgnoreCase(extension)){
            return R.drawable.ic_dwf;
        }
        else if(DWG.equalsIgnoreCase(extension)){
            return R.drawable.ic_dwg;
        }
        else if(EPS.equalsIgnoreCase(extension)){
            return R.drawable.ic_eps;
        }
        else if(EXE.equalsIgnoreCase(extension)){
            return R.drawable.ic_exe;
        }
        else if(FLAC.equalsIgnoreCase(extension)){
            return R.drawable.ic_flac;
        }
        else if(GIF.equalsIgnoreCase(extension)){
            return R.drawable.ic_gif;
        }
        else if(HLP.equalsIgnoreCase(extension)){
            return R.drawable.ic_hlp;
        }
        else if(HTM.equalsIgnoreCase(extension)){
            return R.drawable.ic_htm;
        }
        else if(HTML.equalsIgnoreCase(extension)){
            return R.drawable.ic_html;
        }
        else if(INI.equalsIgnoreCase(extension)){
            return R.drawable.ic_ini;
        }
        else if(ISO.equalsIgnoreCase(extension)){
            return R.drawable.ic_iso;
        }
        else if(JAVA.equalsIgnoreCase(extension)){
            return R.drawable.ic_java;
        }
        else if(JPG.equalsIgnoreCase(extension)){
            return R.drawable.ic_jpg;
        }
        else if(JS.equalsIgnoreCase(extension)){
            return R.drawable.ic_js;
        }
        else if(MKV.equalsIgnoreCase(extension)){
            return R.drawable.ic_mkv;
        }
        else if(MOV.equalsIgnoreCase(extension)){
            return R.drawable.ic_mov;
        }
        else if(MP3.equalsIgnoreCase(extension)){
            return R.drawable.ic_mp3;
        }
        else if(MP4.equalsIgnoreCase(extension)){
            return R.drawable.ic_mp4;
        }
        else if(MPG.equalsIgnoreCase(extension)){
            return R.drawable.ic_mpg;
        }
        else if(PDF.equalsIgnoreCase(extension)){
            return R.drawable.ic_pdf;
        }
        else if(PHP.equalsIgnoreCase(extension)){
            return R.drawable.ic_php;
        }
        else if(PNG.equalsIgnoreCase(extension)){
            return R.drawable.ic_png;
        }
        else if(PPT.equalsIgnoreCase(extension)){
            return R.drawable.ic_powerpoint;
        }
        else if(PPTX.equalsIgnoreCase(extension)){
            return R.drawable.ic_powerpoint;
        }
        else if(PS.equalsIgnoreCase(extension)){
            return R.drawable.ic_ps;
        }
        else if(PSD.equalsIgnoreCase(extension)){
            return R.drawable.ic_psd;
        }
        else if(RAR.equalsIgnoreCase(extension)){
            return R.drawable.ic_rar;
        }
        else if(RSS.equalsIgnoreCase(extension)){
            return R.drawable.ic_rss;
        }
        else if(RTF.equalsIgnoreCase(extension)){
            return R.drawable.ic_rtf;
        }
        else if(SVG.equalsIgnoreCase(extension)){
            return R.drawable.ic_svg;
        }
        else if(SWF.equalsIgnoreCase(extension)){
            return R.drawable.ic_swf;
        }
        else if(SYS.equalsIgnoreCase(extension)){
            return R.drawable.ic_sys;
        }
        else if(TIFF.equalsIgnoreCase(extension)){
            return R.drawable.ic_tiff;
        }
        else if(TXT.equalsIgnoreCase(extension)){
            return R.drawable.ic_txt;
        }
        else if(XLS.equalsIgnoreCase(extension)){
            return R.drawable.ic_excel;
        }
        else if(XLSX.equalsIgnoreCase(extension)){
            return R.drawable.ic_excel;
        }
        else if(ZIP.equalsIgnoreCase(extension)) {
            return R.drawable.ic_zip;
        }
        else if(HWP.equalsIgnoreCase(extension)){
            return R.drawable.ic_hwp;
        }
        else if(LOG.equalsIgnoreCase(extension)){
            return R.drawable.ic_log;
        }
        else
            return R.drawable.ic_unknown;
    }

    public Drawable getDrawable(Context context, String path){
        int res = getResource(path);
        if(res >= 0)
            return ContextCompat.getDrawable(context, res);
        else
            return null;
    }

    public Drawable getDrawable(Context context, File file){
        if(file.isDirectory()){
            return ContextCompat.getDrawable(context, R.drawable.ic_folder);
        }else
            return getDrawable(context, file.getAbsolutePath());
    }

/*
    public int getResource(Context context, String path){
        String extension = getExtension(path);
        if(AAC.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_aac);
        }
        else if(ACE.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_ace);
        }
        else if(AI.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_ai);
        }
        else if(AUT.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_aut);
        }
        else if(AVI.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_avi);
        }
        else if(BIN.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_bin);
        }
        else if(BMP.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_bmp);
        }
        else if(CAD.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_cad);
        }
        else if(CDR.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_cdr);
        }
        else if(CSS.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_css);
        }
        else if(DB.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_db);
        }
        else if(DMG.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_dmg);
        }
        else if(DOC.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_doc);
        }
        else if(DOCX.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_docx);
        }
        else if(DWF.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_dwf);
        }
        else if(DWG.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_dwg);
        }
        else if(EPS.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_eps);
        }
        else if(EXE.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_exe);
        }
        else if(FLAC.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_flac);
        }
        else if(GIF.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_gif);
        }
        else if(HLP.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_hlp);
        }
        else if(HTM.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_htm);
        }
        else if(HTML.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_html);
        }
        else if(INI.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_ini);
        }
        else if(ISO.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_iso);
        }
        else if(JAVA.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_java);
        }
        else if(JPG.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_jpg);
        }
        else if(JS.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_js);
        }
        else if(MKV.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_mkv);
        }
        else if(MOV.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_mov);
        }
        else if(MP3.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_mp3);
        }
        else if(MP4.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_mp4);
        }
        else if(MPG.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_mpg);
        }
        else if(PDF.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_pdf);
        }
        else if(PHP.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_php);
        }
        else if(PNG.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_png);
        }
        else if(PPT.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_ppt);
        }
        else if(PPTX.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_ppt);
        }
        else if(PS.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_ps);
        }
        else if(PSD.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_psd);
        }
        else if(RAR.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_rar);
        }
        else if(RSS.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_rss);
        }
        else if(RTF.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_rtf);
        }
        else if(SVG.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_svg);
        }
        else if(SWF.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_swf);
        }
        else if(SYS.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_sys);
        }
        else if(TIFF.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_tiff);
        }
        else if(TXT.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_txt);
        }
        else if(XLS.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_xls);
        }
        else if(XLSX.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_xlsx);
        }
        else if(ZIP.equalsIgnoreCase(extension)){
            return ContextCompat.getDrawable(context, R.drawable.ic_zip);
        }else
            return null;
    }
    */
}
