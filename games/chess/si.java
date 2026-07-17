/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class si extends vj implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static ci field_l;
    private java.awt.image.ImageConsumer field_m;
    static int field_n;
    static volatile int field_o;
    private java.awt.image.ColorModel field_k;

    public static void c(int param0) {
        field_l = null;
        int var1 = -63 % ((param0 - -32) / 55);
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            ((si) this).field_e = param3;
            int var5_int = -68 % ((param1 - 16) / 60);
            ((si) this).field_b = new int[param2 * param3 - -1];
            ((si) this).field_i = param2;
            ((si) this).field_k = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((si) this).field_j = param0.createImage((java.awt.image.ImageProducer) this);
            this.e(126);
            boolean discarded$0 = param0.prepareImage(((si) this).field_j, (java.awt.image.ImageObserver) this);
            this.e(125);
            boolean discarded$1 = param0.prepareImage(((si) this).field_j, (java.awt.image.ImageObserver) this);
            this.e(98);
            boolean discarded$2 = param0.prepareImage(((si) this).field_j, (java.awt.image.ImageObserver) this);
            ((si) this).b(48);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "si.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == ((si) this).field_m) {
              ((si) this).field_m = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("si.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static void d(int param0) {
        if (param0 != 65280) {
            return;
        }
        if (!(lj.field_a == null)) {
            lj.field_a.a(-1);
            lj.field_a = null;
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            this.e(118);
            if (param1 != 12105912) {
                si.c(65);
            }
            boolean discarded$0 = param2.drawImage(((si) this).field_j, param0, param3, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "si.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static String f() {
        if (g.field_a == ci.field_ub) {
            return ih.field_Q;
        }
        return gg.field_a;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, int param1) {
        nk var2 = qn.field_U;
        var2.f(param1, -68);
        var2.field_l = var2.field_l + 1;
        int var3 = 0;
        int var4 = var2.field_l;
        var2.c(5, (byte) -79);
        var2.c(pd.field_Rb.field_hc, (byte) 66);
        int var5 = (pd.field_Rb.field_Mb << 6) + pd.field_Rb.field_ic;
        var2.c(var5, (byte) -62);
        var2.a(pd.field_Rb.field_sc, (byte) -45, 0, pd.field_Rb.field_sc.length);
        var2.a(var2.field_l - var4, -1);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((si) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "si.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final synchronized void e(int param0) {
        if (param0 >= 97) {
          if (null == ((si) this).field_m) {
            return;
          } else {
            ((si) this).field_m.setPixels(0, 0, ((si) this).field_e, ((si) this).field_i, ((si) this).field_k, ((si) this).field_b, 0, ((si) this).field_e);
            ((si) this).field_m.imageComplete(2);
            return;
          }
        } else {
          si.a((byte) 127);
          if (null == ((si) this).field_m) {
            return;
          } else {
            ((si) this).field_m.setPixels(0, 0, ((si) this).field_e, ((si) this).field_i, ((si) this).field_k, ((si) this).field_b, 0, ((si) this).field_e);
            ((si) this).field_m.imageComplete(2);
            return;
          }
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("si.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((si) this).field_m;
    }

    final static void a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -52) {
          L0: {
            field_n = -122;
            qf.field_b = false;
            if (tk.field_h.i(-122) != 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          kh.field_o = stackIn_8_0 != 0;
          return;
        } else {
          L1: {
            qf.field_b = false;
            if (tk.field_h.i(-122) != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          kh.field_o = stackIn_4_0 != 0;
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((si) this).field_m = param0;
            param0.setDimensions(((si) this).field_e, ((si) this).field_i);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((si) this).field_k);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "si.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
