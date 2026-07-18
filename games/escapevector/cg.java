/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cg extends vn implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_k;
    static java.awt.Font field_l;
    private java.awt.image.ColorModel field_j;

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((cg) this).field_k;
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
              if (param0 != ((cg) this).field_k) {
                break L1;
              } else {
                ((cg) this).field_k = null;
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final synchronized void b(int param0) {
        if (!(((cg) this).field_k != null)) {
            return;
        }
        ((cg) this).field_k.setPixels(0, 0, ((cg) this).field_d, ((cg) this).field_h, ((cg) this).field_j, ((cg) this).field_i, 0, ((cg) this).field_d);
        ((cg) this).field_k.imageComplete(2);
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public static void f(int param0) {
        field_l = null;
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            ((cg) this).field_i = new int[1 + param3 * param1];
            ((cg) this).field_h = param3;
            ((cg) this).field_d = param1;
            ((cg) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((cg) this).field_f = param2.createImage((java.awt.image.ImageProducer) this);
            this.b(2);
            boolean discarded$0 = param2.prepareImage(((cg) this).field_f, (java.awt.image.ImageObserver) this);
            this.b(2);
            boolean discarded$8 = param2.prepareImage(((cg) this).field_f, (java.awt.image.ImageObserver) this);
            if (param0 != 1018) {
                Object var6 = null;
                boolean discarded$9 = ((cg) this).imageUpdate((java.awt.Image) null, 84, -46, -64, -30, -50);
            }
            this.b(2);
            boolean discarded$10 = param2.prepareImage(((cg) this).field_f, (java.awt.image.ImageObserver) this);
            ((cg) this).a(param0 + -895);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "cg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((cg) this).field_k = param0;
            param0.setDimensions(((cg) this).field_d, ((cg) this).field_h);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((cg) this).field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "cg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((cg) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "cg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        jc.field_a[46] = 72;
        jc.field_a[47] = 73;
        jc.field_a[92] = 74;
        jc.field_a[45] = 26;
        jc.field_a[93] = 43;
        int var1 = -51 / ((46 - param0) / 32);
        jc.field_a[59] = 57;
        jc.field_a[61] = 27;
        jc.field_a[44] = 71;
        jc.field_a[91] = 42;
        jc.field_a[192] = 28;
        jc.field_a[520] = 59;
        jc.field_a[222] = 58;
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        this.b(2);
        if (param1 != 0) {
            return;
        }
        try {
            boolean discarded$0 = param3.drawImage(((cg) this).field_f, param0, param2, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "cg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        bo.field_F.l(17415);
        if (jb.field_r == null) {
          jb.field_r = new w(bo.field_F, dj.field_b);
          bo.field_F.b((hm) (Object) jb.field_r, 61);
          return;
        } else {
          bo.field_F.b((hm) (Object) jb.field_r, 61);
          return;
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        c var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        qd var12 = null;
        jh var13 = null;
        c var14 = null;
        jh var15 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var14 = om.field_g;
            var2 = var14.e(0);
            if (var2 != 0) {
              if (var2 != 1) {
                if (var2 == 2) {
                  var15 = (jh) (Object) bc.field_b.a(false);
                  if (var15 != null) {
                    var15.field_i = v.a(-92);
                    var15.field_g = true;
                    var15.field_h = true;
                    var15.c((byte) -77);
                    break L0;
                  } else {
                    nm.a(16);
                    return;
                  }
                } else {
                  pf.a(false, "A1: " + hf.b((byte) 58), (Throwable) null);
                  nm.a(16);
                  return;
                }
              } else {
                var12 = (qd) (Object) mi.field_l.a(false);
                if (var12 == null) {
                  nm.a(16);
                  return;
                } else {
                  var12.c((byte) -64);
                  return;
                }
              }
            } else {
              var11 = v.a(-84);
              var3 = var11;
              var10 = var11;
              var4 = var10;
              var5 = var14;
              var6 = ((n) (Object) var5).e(0);
              var7 = 0;
              L1: while (true) {
                if (var6 <= var7) {
                  var13 = (jh) (Object) bc.field_b.a(false);
                  if (var13 != null) {
                    var13.field_i = var3;
                    var13.field_g = false;
                    var13.field_h = true;
                    var13.c((byte) -86);
                    return;
                  } else {
                    nm.a(16);
                    return;
                  }
                } else {
                  var10[var7] = ((n) (Object) var5).g(-5053);
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "cg.J(" + 103 + ')');
        }
    }

    cg() {
    }

    static {
    }
}
