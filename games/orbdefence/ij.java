/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends fh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_i;
    static byte[] field_h;
    static int field_g;
    private java.awt.image.ColorModel field_j;

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        mj var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -34) {
                break L1;
              } else {
                ij.a((byte) -53, 0);
                break L1;
              }
            }
            var4 = (mj) (Object) nd.field_b.b((byte) -77);
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                nk.a(param1, var4, 14);
                var4 = (mj) (Object) nd.field_b.d(853);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ij.J(" + param0 + ',' + param1 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((ij) this).field_i = param0;
            param0.setDimensions(((ij) this).field_e, ((ij) this).field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((ij) this).field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ij.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            ((ij) this).field_f = param1;
            ((ij) this).field_d = new int[param1 * param2 + 1];
            ((ij) this).field_e = param2;
            ((ij) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((ij) this).field_a = param3.createImage((java.awt.image.ImageProducer) this);
            this.c(-123);
            boolean discarded$0 = param3.prepareImage(((ij) this).field_a, (java.awt.image.ImageObserver) this);
            this.c(-123);
            boolean discarded$1 = param3.prepareImage(((ij) this).field_a, (java.awt.image.ImageObserver) this);
            this.c(-126);
            boolean discarded$2 = param3.prepareImage(((ij) this).field_a, (java.awt.image.ImageObserver) this);
            int var5_int = -113 / ((0 - param0) / 52);
            ((ij) this).a(-40);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        vh.field_q[4] = new int[1];
        nc.field_cb[4] = new ja(4);
        kg.a(30, 468, 32, (byte) -128, new int[4], 2, 400);
        nc.field_cb[2] = new ja(2);
        if (0 < tc.field_b) {
          if (ug.a((byte) 94, wc.field_c)) {
            kg.a(50, 288, 32, (byte) -96, new int[7], 1, 200);
            nc.field_cb[1] = new ja(1);
            vh.field_q[8] = new int[7];
            nc.field_cb[8] = new ja(8);
            if (tc.field_b > 0) {
              if (bk.field_e != 7) {
                return;
              } else {
                bk.field_e = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            vh.field_q[8] = new int[7];
            nc.field_cb[8] = new ja(8);
            if (tc.field_b > 0) {
              if (bk.field_e != 7) {
                return;
              } else {
                bk.field_e = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          vh.field_q[8] = new int[7];
          nc.field_cb[8] = new ja(8);
          if (tc.field_b > 0) {
            if (bk.field_e != 7) {
              return;
            } else {
              bk.field_e = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((ij) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ij.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, hj param2) {
        try {
            hc.field_l = param2;
            pj.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ij.L(" + -63 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public static void b(byte param0) {
        field_h = null;
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
            stackOut_2_1 = new StringBuilder().append("ij.imageUpdate(");
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
          throw dd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    private final synchronized void c(int param0) {
        if (param0 > -119) {
            field_h = null;
            if (!(((ij) this).field_i != null)) {
                return;
            }
            ((ij) this).field_i.setPixels(0, 0, ((ij) this).field_e, ((ij) this).field_f, ((ij) this).field_j, ((ij) this).field_d, 0, ((ij) this).field_e);
            ((ij) this).field_i.imageComplete(2);
            return;
        }
        if (!(((ij) this).field_i != null)) {
            return;
        }
        ((ij) this).field_i.setPixels(0, 0, ((ij) this).field_e, ((ij) this).field_f, ((ij) this).field_j, ((ij) this).field_d, 0, ((ij) this).field_e);
        ((ij) this).field_i.imageComplete(2);
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
              if (((ij) this).field_i != param0) {
                break L1;
              } else {
                ((ij) this).field_i = null;
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
            stackOut_3_1 = new StringBuilder().append("ij.removeConsumer(");
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
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((ij) this).field_i;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, boolean param3) {
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
              this.c(-122);
              boolean discarded$3 = param2.drawImage(((ij) this).field_a, param0, param1, (java.awt.image.ImageObserver) this);
              if (param3) {
                break L1;
              } else {
                field_g = -68;
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
            stackOut_3_1 = new StringBuilder().append("ij.H(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ')');
        }
    }

    ij() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 256;
    }
}
