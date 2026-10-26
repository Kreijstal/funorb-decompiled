/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class br extends oe implements java.awt.image.ImageProducer {
    private java.awt.image.ColorModel field_l;
    private java.awt.image.ImageConsumer field_k;
    private java.awt.Canvas field_i;
    private java.awt.Image field_j;

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "br.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (this.field_k == null) {
          return;
        }
        this.field_k.setPixels(param1, param3, param2, param0, this.field_l, this.field_e, this.field_g * param3 + param1, this.field_g);
        if (param4) {
          return;
        }
        this.field_k.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 == this.field_k) {
            this.field_k = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("br.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final synchronized void e(int param0) {
        if (param0 > -101) {
          this.field_k = (java.awt.image.ImageConsumer) null;
        }
        if (null == this.field_k) {
          return;
        }
        this.field_k.setPixels(0, 0, this.field_g, this.field_h, this.field_l, this.field_e, 0, this.field_g);
        this.field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        try {
          this.field_i = param2;
          this.field_h = param3;
          this.field_g = param1;
          this.field_e = new int[this.field_h * this.field_g];
          this.field_l = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_j = this.field_i.createImage((java.awt.image.ImageProducer) (this));
          if (param0 != -12189) {
            aq[] var6 = (aq[]) null;
            br.a((wl) null, (aq[]) null, (byte) -2);
          }
          this.e(param0 + 12078);
          this.field_i.prepareImage(this.field_j, (java.awt.image.ImageObserver) ((Object) this.field_i));
          this.e(-113);
          this.field_i.prepareImage(this.field_j, (java.awt.image.ImageObserver) ((Object) this.field_i));
          this.e(-115);
          this.field_i.prepareImage(this.field_j, (java.awt.image.ImageObserver) ((Object) this.field_i));
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "br.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static in a(wl param0, aq[] param1, byte param2) {
        int var3_int = 0;
        Object stackIn_23_0 = null;
        in stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        try {
          for (var3_int = 0; var3_int < param1.length; var3_int++) {
            if (param1[var3_int] == null) {
              return null;
            }
            if (0L >= param1[var3_int].field_a) {
              return null;
            }
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; param1.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param1[var5].field_a);
          }
          var6 = 70 % ((param2 + 51) / 47);
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, mh.field_l, 0);
          if (0 == mh.field_l[0]) {
            if (0 == mh.field_l[0]) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, mh.field_l, 1);
            if (mh.field_l[1] > 1) {
              var11 = new byte[mh.field_l[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, mh.field_l[1], mh.field_l, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (mh.field_l[0] == 0) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (param1.length > var7) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param1[var7].field_a);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_23_0 = null;
              return (in) (stackIn_23_0);
            }
          }
          stackIn_25_0 = new in(param0, var3_long, param1);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("br.G(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Graphics param5, int param6, int param7) {
        java.awt.Shape var9 = null;
        try {
          int var10 = -117 / ((param4 - 65) / 59);
          this.a(param3, param6, param0, param1, false);
          var9 = param5.getClip();
          param5.clipRect(param2, param7, param0, param3);
          param5.drawImage(this.field_j, param2 - param6, -param1 + param7, (java.awt.image.ImageObserver) ((Object) this.field_i));
          param5.setClip(var9);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "br.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_k == param0;
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        ClientException var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 instanceof ClientException) {
          var14 = (ClientException) ((Object) param0);
          var2 = var14.field_a + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
          param0 = var14.field_c;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime3 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            if (param1 != -29) {
              return (String) null;
            }
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', var9 + 1);
          if (-1 != var9) {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8;
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var16;
          var2Lifetime3Lifetime3 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (-1 != var9) {
            if (-1 == var10) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    final static void f(int param0) {
        fp var1 = (fp) (ks.field_d.first(268435455));
        if (var1 == null) {
          te.b(true);
          return;
        }
        if (param0 <= 88) {
          return;
        }
        CipherPacketBuffer var2 = IntKeyLookup.field_c;
        var2.readInt((byte) 115);
        var2.readInt((byte) 107);
        var2.readInt((byte) 113);
        var2.readInt((byte) 109);
        var1.unlink(-125);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_k = param0;
          param0.setDimensions(this.field_g, this.field_h);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_l);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "br.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    br() {
    }

    static {
    }
}
