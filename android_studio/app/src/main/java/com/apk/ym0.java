package com.apk;

import androidx.appcompat.view.SupportMenuInflater;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Html5TagProvider.java */
/* loaded from: classes7.dex */
public class ym0 implements cn0 {

    /* renamed from: if  reason: not valid java name */
    public static final ym0 f6006if = new ym0();

    /* renamed from: do  reason: not valid java name */
    public ConcurrentMap<String, jn0> f6007do;

    public ym0() {
        lm0 lm0Var = lm0.HEAD_AND_BODY;
        um0 um0Var = um0.text;
        vm0 vm0Var = vm0.inline;
        vm0 vm0Var2 = vm0.none;
        rm0 rm0Var = rm0.optional;
        vm0 vm0Var3 = vm0.any;
        rm0 rm0Var2 = rm0.forbidden;
        um0 um0Var2 = um0.none;
        vm0 vm0Var4 = vm0.block;
        lm0 lm0Var2 = lm0.BODY;
        um0 um0Var3 = um0.all;
        rm0 rm0Var3 = rm0.required;
        this.f6007do = new ConcurrentHashMap();
        jn0 jn0Var = new jn0("svg", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var.m1364for("animate,animateMotion,animateTransform,discard,set,desc,title,metadata,linearGradient,radialGradient,pattern,circle,ellipse,line,path,polygon,polyline,rect,defs,g,svg,symbol,use,a,audio,canvas,clipPath,filter,foreignObject,iframe,image,marker,mask,script,style,switch,text,video,view");
        jn0Var.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var.f2376const = "http://www.w3.org/2000/svg";
        this.f6007do.put("svg", jn0Var);
        jn0 jn0Var2 = new jn0("math", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var2.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var2.m1369try("math,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var2.f2376const = "http://www.w3.org/1998/Math/MathML";
        this.f6007do.put("math", jn0Var2);
        jn0 jn0Var3 = new jn0("section", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var3.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var3.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("section", jn0Var3);
        jn0 jn0Var4 = new jn0("nav", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var4.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var4.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("nav", jn0Var4);
        jn0 jn0Var5 = new jn0("article", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var5.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var5.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var5.m1365goto(SupportMenuInflater.XML_MENU);
        this.f6007do.put("article", jn0Var5);
        jn0 jn0Var6 = new jn0("aside", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var6.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var6.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var6.m1365goto(SupportMenuInflater.XML_MENU);
        jn0Var6.m1365goto("address");
        this.f6007do.put("aside", jn0Var6);
        jn0 jn0Var7 = new jn0("h1", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var7.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var7.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml,h1,h2,h3,h4,h5,h6");
        this.f6007do.put("h1", jn0Var7);
        jn0 jn0Var8 = new jn0("h2", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var8.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var8.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml,h1,h2,h3,h4,h5,h6");
        this.f6007do.put("h2", jn0Var8);
        jn0 jn0Var9 = new jn0("h3", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var9.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var9.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml,h1,h2,h3,h4,h5,h6");
        this.f6007do.put("h3", jn0Var9);
        jn0 jn0Var10 = new jn0("h4", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var10.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var10.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml,h1,h2,h3,h4,h5,h6");
        this.f6007do.put("h4", jn0Var10);
        jn0 jn0Var11 = new jn0("h5", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var11.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var11.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml,h1,h2,h3,h4,h5,h6");
        this.f6007do.put("h5", jn0Var11);
        jn0 jn0Var12 = new jn0("h6", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var12.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var12.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml,h1,h2,h3,h4,h5,h6");
        this.f6007do.put("h6", jn0Var12);
        jn0 jn0Var13 = new jn0("hgroup", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var13.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var13.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var13.m1364for("h1,h2,h3,h4,h5,h6");
        this.f6007do.put("hgroup", jn0Var13);
        jn0 jn0Var14 = new jn0("header", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var14.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var14.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var14.m1365goto("menu,header,footer");
        this.f6007do.put("header", jn0Var14);
        jn0 jn0Var15 = new jn0("footer", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var15.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var15.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var15.m1365goto("menu,header,footer");
        this.f6007do.put("footer", jn0Var15);
        jn0 jn0Var16 = new jn0("main", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var16.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var16.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("main", jn0Var16);
        jn0 jn0Var17 = new jn0("address", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var17.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var17.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var17.m1365goto("address");
        this.f6007do.put("address", jn0Var17);
        jn0 jn0Var18 = new jn0("details", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var18.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var18.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("details", jn0Var18);
        jn0 jn0Var19 = new jn0("summary", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var19.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var19.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var19.m1360break("details");
        jn0Var19.m1365goto("summary");
        this.f6007do.put("summary", jn0Var19);
        jn0 jn0Var20 = new jn0("command", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var20.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var20.m1365goto("command");
        jn0Var20.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("command", jn0Var20);
        jn0 jn0Var21 = new jn0(SupportMenuInflater.XML_MENU, um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var21.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var21.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var21.m1364for("menuitem,li");
        this.f6007do.put(SupportMenuInflater.XML_MENU, jn0Var21);
        jn0 jn0Var22 = new jn0("menuitem", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var22.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var22.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var22.m1360break(SupportMenuInflater.XML_MENU);
        this.f6007do.put("menuitem", jn0Var22);
        jn0 jn0Var23 = new jn0("dialog", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var23.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("dialog", jn0Var23);
        jn0 jn0Var24 = new jn0("div", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var24.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var24.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("div", jn0Var24);
        jn0 jn0Var25 = new jn0("figure", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var25.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var25.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("figure", jn0Var25);
        jn0 jn0Var26 = new jn0("figcaption", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var26.m1360break("figure");
        this.f6007do.put("figcaption", jn0Var26);
        jn0 jn0Var27 = new jn0(com.umeng.analytics.pro.ak.ax, um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var27.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var27.m1369try("p,address,summary,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml,time");
        this.f6007do.put(com.umeng.analytics.pro.ak.ax, jn0Var27);
        jn0 jn0Var28 = new jn0("pre", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var28.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var28.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("pre", jn0Var28);
        jn0 jn0Var29 = new jn0("ul", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var29.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var29.m1369try("dl,p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var29.m1364for("li,ul,ol,div");
        jn0Var29.f2375class = "li";
        this.f6007do.put("ul", jn0Var29);
        jn0 jn0Var30 = new jn0("ol", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var30.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var30.m1369try("dl,p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var30.m1364for("li,ul,ol,div");
        jn0Var30.f2375class = "li";
        this.f6007do.put("ol", jn0Var30);
        jn0 jn0Var31 = new jn0("li", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        jn0Var31.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var31.m1369try("li,p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var31.m1360break("ol,menu,ul");
        this.f6007do.put("li", jn0Var31);
        jn0 jn0Var32 = new jn0("dl", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var32.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var32.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var32.m1364for("dt,dd,div,script,template");
        jn0Var32.f2375class = "div";
        this.f6007do.put("dl", jn0Var32);
        jn0 jn0Var33 = new jn0("dt", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        jn0Var33.m1369try("dt,dd");
        jn0Var33.m1364for("a,abbr,address,area,article,aside,audio,b,bdi,bdo,blockquote,br,button,canvas,cite,code,data,datalist,del,dfn,div,dl,em,embed,fieldset,figure,footer,form,h1,h2,h3,h4,h5,h6,header,hr,i,iframe,img,input,ins,kbd,keygen,label,main,map,mark,math,meter,nav,noscript,object,ol,output,p,pre,progress,q,ruby,s,samp,script,section,select,small,span,strong,sub,sup,svg,table,template,textarea,time,u,ul,var,video,wbr,text");
        jn0Var33.m1360break("dl");
        this.f6007do.put("dt", jn0Var33);
        jn0 jn0Var34 = new jn0("dd", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        jn0Var34.m1369try("dt,dd");
        jn0Var34.m1364for("a,abbr,address,area,article,aside,audio,b,bdi,bdo,blockquote,br,button,canvas,cite,code,data,datalist,del,dfn,div,dl,em,embed,fieldset,figure,footer,form,h1,h2,h3,h4,h5,h6,header,hr,i,iframe,img,input,ins,kbd,keygen,label,main,map,mark,math,meter,nav,noscript,object,ol,output,p,pre,progress,q,ruby,s,samp,script,section,select,small,span,strong,sub,sup,svg,table,template,textarea,time,u,ul,var,video,wbr,text");
        jn0Var34.m1360break("dl");
        this.f6007do.put("dd", jn0Var34);
        jn0 jn0Var35 = new jn0("hr", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var4);
        jn0Var35.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var35.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("hr", jn0Var35);
        jn0 jn0Var36 = new jn0("blockquote", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var36.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var36.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("blockquote", jn0Var36);
        jn0 jn0Var37 = new jn0("em", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var37.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("em", jn0Var37);
        jn0 jn0Var38 = new jn0("strong", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var38.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("strong", jn0Var38);
        jn0 jn0Var39 = new jn0("small", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var39.m1361case("b,u,i,sub,sup,blink,s");
        jn0Var39.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("small", jn0Var39);
        jn0 jn0Var40 = new jn0(com.umeng.analytics.pro.ak.aB, um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var40.m1361case("b,u,i,sub,sup,small,blink");
        jn0Var40.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put(com.umeng.analytics.pro.ak.aB, jn0Var40);
        jn0 jn0Var41 = new jn0("a", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var41.m1369try("a");
        this.f6007do.put("a", jn0Var41);
        jn0 jn0Var42 = new jn0("wbr", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var2);
        jn0Var42.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("wbr", jn0Var42);
        jn0 jn0Var43 = new jn0("mark", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var43.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("mark", jn0Var43);
        jn0 jn0Var44 = new jn0("bdi", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var44.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("bdi", jn0Var44);
        jn0 jn0Var45 = new jn0("time", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var45.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("time", jn0Var45);
        jn0 jn0Var46 = new jn0("data", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var46.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var46.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("data", jn0Var46);
        jn0 jn0Var47 = new jn0("cite", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var47.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("cite", jn0Var47);
        jn0 jn0Var48 = new jn0("q", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var48.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("q", jn0Var48);
        jn0 jn0Var49 = new jn0(PluginConstants.KEY_ERROR_CODE, um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var49.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put(PluginConstants.KEY_ERROR_CODE, jn0Var49);
        this.f6007do.put("span", new jn0("span", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var));
        jn0 jn0Var50 = new jn0("bdo", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var50.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("bdo", jn0Var50);
        jn0 jn0Var51 = new jn0("dfn", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var51.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("dfn", jn0Var51);
        jn0 jn0Var52 = new jn0("kbd", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var52.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("kbd", jn0Var52);
        jn0 jn0Var53 = new jn0("abbr", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var53.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("abbr", jn0Var53);
        jn0 jn0Var54 = new jn0("var", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var54.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("var", jn0Var54);
        jn0 jn0Var55 = new jn0("samp", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var55.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("samp", jn0Var55);
        this.f6007do.put("br", new jn0("br", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var2));
        jn0 jn0Var56 = new jn0("sub", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var56.m1361case("b,u,i,sup,small,blink,s");
        jn0Var56.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("sub", jn0Var56);
        jn0 jn0Var57 = new jn0("sup", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var57.m1361case("b,u,i,sub,small,blink,s");
        jn0Var57.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("sup", jn0Var57);
        jn0 jn0Var58 = new jn0("b", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var58.m1361case("u,i,sub,sup,small,blink,s");
        jn0Var58.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("b", jn0Var58);
        jn0 jn0Var59 = new jn0(com.umeng.analytics.pro.ak.aC, um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var59.m1361case("b,u,sub,sup,small,blink,s");
        jn0Var59.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put(com.umeng.analytics.pro.ak.aC, jn0Var59);
        jn0 jn0Var60 = new jn0(com.umeng.analytics.pro.ak.aG, um0Var3, lm0Var2, true, false, rm0Var3, vm0Var);
        jn0Var60.m1361case("b,i,sub,sup,small,blink,s");
        jn0Var60.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put(com.umeng.analytics.pro.ak.aG, jn0Var60);
        jn0 jn0Var61 = new jn0("ruby", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var61.m1364for("rt,rp,rb,rtc");
        this.f6007do.put("ruby", jn0Var61);
        jn0 jn0Var62 = new jn0("rtc", um0Var3, lm0Var2, false, false, rm0Var, vm0Var);
        jn0Var62.m1360break("ruby");
        jn0Var62.m1364for("rt,a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("rtc", jn0Var62);
        jn0 jn0Var63 = new jn0("rb", um0Var3, lm0Var2, false, false, rm0Var, vm0Var);
        jn0Var63.m1360break("ruby");
        this.f6007do.put("rb", jn0Var63);
        jn0 jn0Var64 = new jn0("rt", um0Var, lm0Var2, false, false, rm0Var, vm0Var);
        jn0Var64.m1360break("ruby");
        jn0Var64.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("rt", jn0Var64);
        jn0 jn0Var65 = new jn0("rp", um0Var, lm0Var2, false, false, rm0Var, vm0Var);
        jn0Var65.m1360break("ruby");
        jn0Var65.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("rp", jn0Var65);
        this.f6007do.put("img", new jn0("img", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var));
        this.f6007do.put("iframe", new jn0("iframe", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3));
        jn0 jn0Var66 = new jn0("embed", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var4);
        jn0Var66.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var66.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("embed", jn0Var66);
        this.f6007do.put("object", new jn0("object", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3));
        jn0 jn0Var67 = new jn0("param", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var2);
        jn0Var67.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var67.m1369try("p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        jn0Var67.m1360break("object");
        this.f6007do.put("param", jn0Var67);
        jn0 jn0Var68 = new jn0("audio", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var68.m1361case("audio,video,object,source");
        this.f6007do.put("audio", jn0Var68);
        jn0 jn0Var69 = new jn0("picture", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var69.m1361case("audio,video,object,source");
        this.f6007do.put("picture", jn0Var69);
        jn0 jn0Var70 = new jn0("video", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var70.m1361case("audio,video,object,source");
        this.f6007do.put("video", jn0Var70);
        jn0 jn0Var71 = new jn0("source", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var3);
        jn0Var71.m1360break("audio,video,object");
        this.f6007do.put("source", jn0Var71);
        jn0 jn0Var72 = new jn0("track", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var3);
        jn0Var72.m1360break("audio,video,object,source");
        this.f6007do.put("track", jn0Var72);
        this.f6007do.put("canvas", new jn0("canvas", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3));
        jn0 jn0Var73 = new jn0("area", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var2);
        jn0Var73.m1363else("map");
        jn0Var73.m1369try("area");
        this.f6007do.put("area", jn0Var73);
        jn0 jn0Var74 = new jn0("map", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var74.m1369try("map");
        jn0Var74.m1364for("area");
        this.f6007do.put("map", jn0Var74);
        this.f6007do.put("ins", new jn0("ins", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3));
        this.f6007do.put("del", new jn0("del", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3));
        jn0 jn0Var75 = new jn0("meter", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var75.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        jn0Var75.m1369try("meter");
        this.f6007do.put("meter", jn0Var75);
        jn0 jn0Var76 = new jn0("form", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var76.m1365goto("form");
        jn0Var76.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var76.m1369try("option,optgroup,textarea,select,fieldset,p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("form", jn0Var76);
        jn0 jn0Var77 = new jn0("input", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var);
        jn0Var77.m1369try("select,optgroup,option");
        this.f6007do.put("input", jn0Var77);
        jn0 jn0Var78 = new jn0("textarea", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var78.m1369try("select,optgroup,option");
        this.f6007do.put("textarea", jn0Var78);
        jn0 jn0Var79 = new jn0("select", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var79.m1364for("option,optgroup");
        jn0Var79.m1369try("option,optgroup,select");
        this.f6007do.put("select", jn0Var79);
        jn0 jn0Var80 = new jn0("option", um0Var, lm0Var2, false, false, rm0Var, vm0Var);
        jn0Var80.m1363else("select,datalist");
        jn0Var80.m1369try("option");
        this.f6007do.put("option", jn0Var80);
        jn0 jn0Var81 = new jn0("optgroup", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        Cgoto.m1015strictfp(jn0Var81, "select", "option", "optgroup");
        this.f6007do.put("optgroup", jn0Var81);
        jn0 jn0Var82 = new jn0("button", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var82.m1369try("select,optgroup,option");
        this.f6007do.put("button", jn0Var82);
        this.f6007do.put("label", new jn0("label", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var));
        jn0 jn0Var83 = new jn0("legend", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var83.m1360break("fieldset");
        jn0Var83.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        this.f6007do.put("legend", jn0Var83);
        jn0 jn0Var84 = new jn0("fieldset", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var84.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var84.m1369try("p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("fieldset", jn0Var84);
        jn0 jn0Var85 = new jn0(NotificationCompat.CATEGORY_PROGRESS, um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var85.m1364for("a,abbr,area,audio,b,bdi,bdo,br,button,canvas,cite,code,command,datalist,del,dfn,em,i,input,ins,kbd,keygen,label,link,map,mark,meta,meter,noscript,output,progress,p,ruby,samp,s,script,select,small,span,strong,sub,sup,template,textarea,time,u,var,wbr");
        jn0Var85.m1369try(NotificationCompat.CATEGORY_PROGRESS);
        this.f6007do.put(NotificationCompat.CATEGORY_PROGRESS, jn0Var85);
        jn0 jn0Var86 = new jn0("datalist", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var86.m1364for("option");
        jn0Var86.m1369try("datalist");
        this.f6007do.put("datalist", jn0Var86);
        this.f6007do.put("keygen", new jn0("keygen", um0Var3, lm0Var2, false, false, rm0Var2, vm0Var3));
        jn0 jn0Var87 = new jn0("output", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var3);
        jn0Var87.m1369try("output,p,summary,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("output", jn0Var87);
        jn0 jn0Var88 = new jn0("table", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var88.m1364for("tr,tbody,thead,tfoot,col,colgroup,caption");
        jn0Var88.m1367new("bdo,strong,em,q,b,i,sub,sup,small,s");
        jn0Var88.m1369try("tr,thead,tbody,tfoot,caption,colgroup,table,p,address,label,abbr,acronym,dfn,kbd,samp,var,cite,code,param,xml");
        this.f6007do.put("table", jn0Var88);
        jn0 jn0Var89 = new jn0("tr", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        jn0Var89.m1363else("table");
        jn0Var89.m1360break("tbody");
        jn0Var89.m1364for("td,th");
        jn0Var89.f2375class = "td";
        jn0Var89.m1368this("thead,tfoot");
        jn0Var89.m1369try("tr,td,th,caption,colgroup");
        this.f6007do.put("tr", jn0Var89);
        jn0 jn0Var90 = new jn0("td", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var4);
        jn0Var90.m1363else("table");
        jn0Var90.m1360break("tr");
        jn0Var90.m1368this("tr");
        jn0Var90.m1369try("td,th,caption,colgroup");
        this.f6007do.put("td", jn0Var90);
        jn0 jn0Var91 = new jn0("th", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        jn0Var91.m1363else("table");
        jn0Var91.m1360break("tr");
        jn0Var91.m1369try("td,th,caption,colgroup");
        this.f6007do.put("th", jn0Var91);
        jn0 jn0Var92 = new jn0("tbody", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        Cgoto.m1015strictfp(jn0Var92, "table", "tr,form", "td,th,tr,tbody,thead,tfoot,caption,colgroup");
        this.f6007do.put("tbody", jn0Var92);
        jn0 jn0Var93 = new jn0("thead", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        Cgoto.m1015strictfp(jn0Var93, "table", "tr,form", "td,th,tr,tbody,thead,tfoot,caption,colgroup");
        this.f6007do.put("thead", jn0Var93);
        jn0 jn0Var94 = new jn0("tfoot", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        Cgoto.m1015strictfp(jn0Var94, "table", "tr,form", "td,th,tr,tbody,thead,tfoot,caption,colgroup");
        this.f6007do.put("tfoot", jn0Var94);
        jn0 jn0Var95 = new jn0("col", um0Var2, lm0Var2, false, false, rm0Var2, vm0Var4);
        jn0Var95.m1363else("colgroup");
        this.f6007do.put("col", jn0Var95);
        jn0 jn0Var96 = new jn0("colgroup", um0Var3, lm0Var2, false, false, rm0Var, vm0Var4);
        Cgoto.m1015strictfp(jn0Var96, "table", "col", "td,th,tr,tbody,thead,tfoot,caption,colgroup");
        this.f6007do.put("colgroup", jn0Var96);
        jn0 jn0Var97 = new jn0("caption", um0Var3, lm0Var2, false, false, rm0Var3, vm0Var);
        jn0Var97.m1363else("table");
        jn0Var97.m1369try("td,th,tr,tbody,thead,tfoot,caption,colgroup");
        this.f6007do.put("caption", jn0Var97);
        lm0 lm0Var3 = lm0.HEAD;
        this.f6007do.put(TTDownloadField.TT_META, new jn0(TTDownloadField.TT_META, um0Var2, lm0Var, false, false, rm0Var2, vm0Var2));
        this.f6007do.put("link", new jn0("link", um0Var2, lm0Var, false, false, rm0Var2, vm0Var2));
        this.f6007do.put(NotificationCompatJellybean.KEY_TITLE, new jn0(NotificationCompatJellybean.KEY_TITLE, um0Var, lm0Var3, false, true, rm0Var3, vm0Var2));
        this.f6007do.put("style", new jn0("style", um0Var, lm0Var, false, false, rm0Var3, vm0Var2));
        this.f6007do.put("base", new jn0("base", um0Var2, lm0Var3, false, false, rm0Var2, vm0Var2));
        this.f6007do.put("script", new jn0("script", um0Var3, lm0Var, false, false, rm0Var3, vm0Var2));
        this.f6007do.put("noscript", new jn0("noscript", um0Var3, lm0Var, false, false, rm0Var3, vm0Var4));
    }

    @Override // com.apk.cn0
    /* renamed from: do */
    public jn0 mo373do(String str) {
        if (str == null) {
            return null;
        }
        return this.f6007do.get(str.toLowerCase());
    }
}
