/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aa extends dd implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_k;
    static ih[] field_i;
    static qa field_g;
    private java.awt.image.ImageConsumer field_h;
    static int field_j;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, java.awt.Graphics param1, byte param2, int param3) {
        try {
          int var5_int = 91 % ((param2 - 26) / 52);
          this.c((byte) -95);
          param1.drawImage(this.field_e, param0, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("aa.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 > -125) {
          field_i = (ih[]) null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_h = param0;
          param0.setDimensions(this.field_a, this.field_c);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_k);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "aa.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(nk param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -41) {
            field_i = (ih[]) null;
          }
          stackIn_3_0 = param0.b(param1, -118);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aa.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(-65 + var5 + 97);
            } else if ((97 > var5 ||
              var5 > 122) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param1 > -5) {
            field_g = (qa) null;
          }
          stackIn_23_0 = new String(var8);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("aa.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_h == param0;
    }

    final void a(boolean param0, int param1, int param2, java.awt.Component param3) {
        this.field_b = new int[1 + param1 * param2];
        if (param0) {
          return;
        }
        try {
          this.field_c = param1;
          this.field_a = param2;
          this.field_k = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_e = param3.createImage((java.awt.image.ImageProducer) (this));
          this.c((byte) -113);
          param3.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.c((byte) -104);
          param3.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.c((byte) -115);
          param3.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.b(1);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "aa.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_h == param0) {
            this.field_h = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "aa.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 < 73) {
          return 125;
        }
        if (wf.field_i < 2) {
          return 0;
        }
        if (ri.field_e != 0) {
          if (eh.field_d != null) {
            if (!eh.field_d.c(-43)) {
              return 14;
            }
            if (!eh.field_d.a("", (byte) -124)) {
              return 29;
            }
            if (!eh.field_d.a("", 10762)) {
              return 29;
            }
          }
          if (!we.field_h.c(-52)) {
            return 43;
          }
          if (!we.field_h.a("commonui", 10762)) {
            return 57;
          }
          if (!gk.field_a.c(-91)) {
            return 71;
          }
          if (!gk.field_a.a("commonui", 10762)) {
            return 80;
          }
          if (!ej.field_d.c(108)) {
            return 82;
          }
          if (!ej.field_d.a((byte) 119)) {
            return 86;
          }
        } else {
          if (!we.field_h.c(94)) {
            return 20;
          }
          if (!we.field_h.a("commonui", 10762)) {
            return 40;
          }
          if (!gk.field_a.c(76)) {
            return 50;
          }
          if (!gk.field_a.a("commonui", 10762)) {
            return 60;
          }
          if (!ej.field_d.c(-84)) {
            return 70;
          }
          if (!ej.field_d.a((byte) 23)) {
            return 80;
          }
        }
        return 100;
    }

    private final synchronized void c(byte param0) {
        if (param0 > -93) {
          return;
        }
        if (null == this.field_h) {
          return;
        }
        this.field_h.setPixels(0, 0, this.field_a, this.field_c, this.field_k, this.field_b, 0, this.field_a);
        this.field_h.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "aa.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    aa() {
    }

    static {
        field_i = new ih[8];
    }
}
