/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cd extends rb implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static char[] field_m;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_p;
    static String field_k;
    static String field_n;
    static int[] field_j;
    static nf[] field_o;

    public static void a(int param0) {
        if (param0 > -40) {
          cd.a(32);
          field_o = null;
          field_k = null;
          field_n = null;
          field_j = null;
          field_m = null;
          return;
        } else {
          field_o = null;
          field_k = null;
          field_n = null;
          field_j = null;
          field_m = null;
          return;
        }
    }

    final static boolean c(byte param0) {
        return dh.field_vb.a(false);
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
            if (((cd) this).field_l == param0) {
              ((cd) this).field_l = null;
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
            stackOut_4_1 = new StringBuilder().append("cd.removeConsumer(");
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        try {
            this.d((byte) 126);
            int var5_int = 57 / ((param0 - 36) / 52);
            boolean discarded$0 = param1.drawImage(((cd) this).field_e, param3, param2, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cd.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((cd) this).field_f = new int[1 + param1 * param3];
        ((cd) this).field_b = param1;
        ((cd) this).field_c = param3;
        if (param2 > -53) {
            return;
        }
        try {
            ((cd) this).field_p = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((cd) this).field_e = param0.createImage((java.awt.image.ImageProducer) this);
            this.d((byte) 120);
            boolean discarded$0 = param0.prepareImage(((cd) this).field_e, (java.awt.image.ImageObserver) this);
            this.d((byte) 125);
            boolean discarded$1 = param0.prepareImage(((cd) this).field_e, (java.awt.image.ImageObserver) this);
            this.d((byte) 116);
            boolean discarded$2 = param0.prepareImage(((cd) this).field_e, (java.awt.image.ImageObserver) this);
            ((cd) this).a((byte) 106);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cd.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((cd) this).field_l = param0;
            param0.setDimensions(((cd) this).field_b, ((cd) this).field_c);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((cd) this).field_p);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cd.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final synchronized void d(byte param0) {
        if (param0 <= 103) {
            return;
        }
        if (!(((cd) this).field_l != null)) {
            return;
        }
        ((cd) this).field_l.setPixels(0, 0, ((cd) this).field_b, ((cd) this).field_c, ((cd) this).field_p, ((cd) this).field_f, 0, ((cd) this).field_b);
        ((cd) this).field_l.imageComplete(2);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((cd) this).field_l == param0;
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
            stackOut_2_1 = new StringBuilder().append("cd.imageUpdate(");
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
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    cd() {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((cd) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cd.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_n = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_j = new int[]{0, 60, 0, 120};
        field_k = "The journey went smoothly.#You have reached the fifth planet#of the system of Yonderia.";
    }
}
