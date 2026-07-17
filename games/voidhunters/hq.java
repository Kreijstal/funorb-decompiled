/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hq extends gpb implements java.awt.image.ImageProducer {
    private java.awt.image.ColorModel field_h;
    static String field_i;
    private java.awt.Image field_j;
    private java.awt.image.ImageConsumer field_g;
    private java.awt.Canvas field_k;

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((hq) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hq.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final synchronized void e() {
        if (!(((hq) this).field_g != null)) {
            return;
        }
        ((hq) this).field_g.setPixels(0, 0, ((hq) this).field_e, ((hq) this).field_d, ((hq) this).field_h, ((hq) this).field_f, 0, ((hq) this).field_e);
        ((hq) this).field_g.imageComplete(2);
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Shape var9 = null;
        try {
            this.a(param2, param4, (byte) 31, param1, param7);
            var9 = param0.getClip();
            param0.clipRect(param6, param5, param1, param7);
            if (param3 != 32255) {
                ((hq) this).field_j = null;
            }
            boolean discarded$0 = param0.drawImage(((hq) this).field_j, -param4 + param6, param5 - param2, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
            param0.setClip(var9);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hq.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void d() {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (vsa.field_r == null) {
                break L0;
              } else {
                try {
                  L1: {
                    vsa.field_r.a(0, 0L);
                    vsa.field_r.a(24, qga.field_b.field_e, (byte) -88, qga.field_b.field_h);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  qga.field_b.field_e = qga.field_b.field_e + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            qga.field_b.field_e = qga.field_b.field_e + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((hq) this).field_g;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((hq) this).field_g = param0;
            param0.setDimensions(((hq) this).field_e, ((hq) this).field_d);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((hq) this).field_h);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hq.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        ((hq) this).field_k = param3;
        ((hq) this).field_e = param1;
        ((hq) this).field_d = param2;
        ((hq) this).field_f = new int[((hq) this).field_d * ((hq) this).field_e];
        ((hq) this).field_h = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((hq) this).field_j = ((hq) this).field_k.createImage((java.awt.image.ImageProducer) this);
        int discarded$0 = 105;
        this.e();
        boolean discarded$10 = ((hq) this).field_k.prepareImage(((hq) this).field_j, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
        if (param0 != 4904) {
            return;
        }
        try {
            int discarded$11 = 105;
            this.e();
            boolean discarded$12 = ((hq) this).field_k.prepareImage(((hq) this).field_j, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
            int discarded$13 = 105;
            this.e();
            boolean discarded$14 = ((hq) this).field_k.prepareImage(((hq) this).field_j, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hq.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c() {
        int var1 = 59;
        field_i = null;
    }

    private final synchronized void a(int param0, int param1, byte param2, int param3, int param4) {
        if (((hq) this).field_g == null) {
          return;
        } else {
          ((hq) this).field_g.setPixels(param1, param0, param3, param4, ((hq) this).field_h, ((hq) this).field_f, ((hq) this).field_e * param0 + param1, ((hq) this).field_e);
          ((hq) this).field_g.imageComplete(2);
          return;
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
              if (param0 != ((hq) this).field_g) {
                break L1;
              } else {
                ((hq) this).field_g = null;
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
            stackOut_3_1 = new StringBuilder().append("hq.removeConsumer(");
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    hq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Spawn enemy ship at mouse";
    }
}
