/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ti extends he implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static cm field_t;
    static int field_w;
    static mg field_m;
    static long field_p;
    static String field_o;
    static String[] field_A;
    static nk field_B;
    static String field_r;
    static int[] field_n;
    static byte[] field_s;
    static volatile boolean field_x;
    static byte[] field_u;
    static String field_q;
    static ul field_z;
    static int field_y;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_v;

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((ti) this).field_l = param0;
            param0.setDimensions(((ti) this).field_c, ((ti) this).field_i);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((ti) this).field_v);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ti.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((ti) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ti.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_q = null;
        field_o = null;
        field_z = null;
        field_s = null;
        field_t = null;
        field_u = null;
        field_A = null;
        field_n = null;
        field_r = null;
        field_B = null;
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
            if (((ti) this).field_l == param0) {
              ((ti) this).field_l = null;
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
            stackOut_4_1 = new StringBuilder().append("ti.removeConsumer(");
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
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(int param0, byte param1, java.awt.Component param2, int param3) {
        try {
            ((ti) this).field_i = param3;
            ((ti) this).field_a = new int[1 + param3 * param0];
            ((ti) this).field_c = param0;
            ((ti) this).field_v = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            if (param1 >= -55) {
                field_A = null;
            }
            ((ti) this).field_b = param2.createImage((java.awt.image.ImageProducer) this);
            this.c(0);
            boolean discarded$0 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
            this.c(0);
            boolean discarded$1 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
            this.c(0);
            boolean discarded$2 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
            ((ti) this).b((byte) 122);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ti.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((ti) this).field_l == param0;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void d(int param0) {
        if (!(fc.field_a == null)) {
            fc.field_a.c();
        }
        if (cm.field_j != null) {
            cm.field_j.c();
            return;
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
            stackOut_2_1 = new StringBuilder().append("ti.imageUpdate(");
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
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        this.c(0);
        if (param0 != -51) {
            return;
        }
        try {
            boolean discarded$0 = param1.drawImage(((ti) this).field_b, param2, param3, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ti.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final synchronized void c(int param0) {
        if (null == ((ti) this).field_l) {
          return;
        } else {
          ((ti) this).field_l.setPixels(0, 0, ((ti) this).field_c, ((ti) this).field_i, ((ti) this).field_v, ((ti) this).field_a, 0, ((ti) this).field_c);
          ((ti) this).field_l.imageComplete(2);
          return;
        }
    }

    ti() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[4];
        field_r = "Add <%0> to friend list";
        field_q = "Offensive account name";
        field_x = false;
        field_u = new byte[]{(byte) 2, (byte) 3, (byte) 6};
        field_o = "Wingslot";
        field_y = 200;
        field_z = new ul();
    }
}
