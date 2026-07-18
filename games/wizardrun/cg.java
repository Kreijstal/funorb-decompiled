/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cg extends df implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static int[] field_k;
    private java.awt.image.ColorModel field_l;
    static int[] field_m;
    private java.awt.image.ImageConsumer field_j;
    static int[] field_n;
    static String[] field_o;

    private final synchronized void c() {
        if (!(null != ((cg) this).field_j)) {
            return;
        }
        ((cg) this).field_j.setPixels(0, 0, ((cg) this).field_d, ((cg) this).field_h, ((cg) this).field_l, ((cg) this).field_f, 0, ((cg) this).field_d);
        ((cg) this).field_j.imageComplete(2);
    }

    final static boolean c(byte param0) {
        if (param0 == 54) {
          if (!e.a(-111)) {
            if (f.field_e) {
              if (e.field_a) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void d() {
        field_k = null;
        field_o = null;
        field_n = null;
        field_m = null;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((cg) this).field_j = param0;
            param0.setDimensions(((cg) this).field_d, ((cg) this).field_h);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((cg) this).field_l);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != ((cg) this).field_j) {
                break L1;
              } else {
                ((cg) this).field_j = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cg.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((cg) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$7 = 0;
              this.c();
              boolean discarded$8 = param0.drawImage(((cg) this).field_g, param2, param3, (java.awt.image.ImageObserver) this);
              if (param1 == -29402) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$9 = ((cg) this).imageUpdate((java.awt.Image) null, -29, -34, 122, 69, 70);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cg.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
            ((cg) this).field_h = param1;
            ((cg) this).field_f = new int[param1 * param3 + 1];
            ((cg) this).field_d = param3;
            ((cg) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((cg) this).field_g = param2.createImage((java.awt.image.ImageProducer) this);
            int discarded$0 = 0;
            this.c();
            boolean discarded$1 = param2.prepareImage(((cg) this).field_g, (java.awt.image.ImageObserver) this);
            int var5_int = -33 / ((-53 - param0) / 36);
            int discarded$2 = 0;
            this.c();
            boolean discarded$3 = param2.prepareImage(((cg) this).field_g, (java.awt.image.ImageObserver) this);
            int discarded$4 = 0;
            this.c();
            boolean discarded$5 = param2.prepareImage(((cg) this).field_g, (java.awt.image.ImageObserver) this);
            ((cg) this).b(91);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "cg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
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
            stackOut_2_1 = new StringBuilder().append("cg.imageUpdate(");
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
          throw bd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    cg() {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((cg) this).field_j == param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_o = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
