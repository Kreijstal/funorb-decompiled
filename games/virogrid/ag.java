/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends java.awt.Canvas {
    private java.awt.Component field_k;
    static mg field_g;
    static int[] field_f;
    static int[] field_b;
    static int[][] field_j;
    static int[] field_i;
    static int field_c;
    static int field_e;
    static int[] field_a;
    static int[] field_h;
    static km field_d;

    final static boolean c(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 <= -95) {
          if (md.field_e == null) {
            if (!md.a(false)) {
              L0: {
                if (null != km.field_yb) {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L0;
                } else {
                  if (!af.a(false)) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_20_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ag.b(55);
          if (md.field_e == null) {
            if (!md.a(false)) {
              L1: {
                if (null != km.field_yb) {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                } else {
                  if (!af.a(false)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_10_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((ag) this).field_k.update(param0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ag.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            fk.a();
            dm.field_x = new int[260];
            gb.field_N = 11;
            var1_int = 0;
            L1: while (true) {
              if (256 <= var1_int) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= dm.field_x.length) {
                    break L0;
                  } else {
                    dm.field_x[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                dm.field_x[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ag.D(" + 255 + ')');
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        field_i = null;
        field_a = null;
        field_f = null;
        if (param0 != 25) {
            return;
        }
        field_g = null;
        field_b = null;
        field_d = null;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((ag) this).field_k.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ag.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0) {
        return nf.field_d;
    }

    ag(java.awt.Component param0) {
        try {
            ((ag) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ag.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new mg(540, 140);
        field_b = new int[12];
        field_f = new int[12];
        field_h = new int[12];
        field_a = new int[12];
        field_i = new int[8192];
        field_c = 256;
        field_j = new int[12][];
        int discarded$0 = 150;
        og.a(0, 490, 116, new int[8], 32, (byte) 126);
        int discarded$1 = 150;
        og.a(1, 490, 136, new int[6], 32, (byte) 97);
        int discarded$2 = 150;
        og.a(2, 490, 102, new int[8], 32, (byte) 90);
        int discarded$3 = 150;
        og.a(3, 490, 88, new int[9], 29, (byte) 66);
        int discarded$4 = 150;
        og.a(4, 490, 92, new int[8], 32, (byte) 71);
        int discarded$5 = 150;
        og.a(5, 490, 92, new int[7], 32, (byte) 61);
        int discarded$6 = 150;
        og.a(6, 490, 328, new int[2], 32, (byte) 90);
        int discarded$7 = 150;
        og.a(7, 490, 330, new int[2], 32, (byte) 106);
        int discarded$8 = 150;
        og.a(8, 490, 328, new int[2], 32, (byte) 109);
        int discarded$9 = 150;
        og.a(9, 490, 300, new int[1], 32, (byte) 58);
        int discarded$10 = 150;
        og.a(10, 490, 300, new int[0], 32, (byte) 103);
        int discarded$11 = 150;
        og.a(11, 490, 116, new int[5], 32, (byte) 78);
    }
}
