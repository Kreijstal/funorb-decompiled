/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends java.awt.Canvas {
    static int[] field_c;
    static boolean field_f;
    private java.awt.Component field_a;
    static vo field_e;
    static vo field_d;
    static int field_b;

    public final void paint(java.awt.Graphics param0) {
        ((rm) this).field_a.paint(param0);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_f = false;
        }
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, rc param2) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        am var7 = dp.field_e;
        am var8 = var7;
        var8.j(11, param1);
        var8.field_j = var8.field_j + 1;
        int var4 = var8.field_j;
        var8.i(1, 100);
        var8.a(param2.field_i, (byte) 105);
        var8.a(param2.field_o, (byte) 105);
        var8.a(param2.field_n, (byte) 105);
        var8.h(104, param2.field_q);
        var8.h(-124, param2.field_m);
        var8.h(-118, param2.field_l);
        if (param0 >= -47) {
            return;
        }
        var8.h(40, param2.field_t);
        var8.i(param2.field_k.length, 87);
        for (var5 = 0; var5 < param2.field_k.length; var5++) {
            var7.h(30, param2.field_k[var5]);
        }
        int discarded$0 = var8.e(-123, var4);
        var8.d(50, -var4 + var8.field_j);
    }

    final static int a(int param0, int param1, boolean param2) {
        if (param2) {
            Object var4 = null;
            rm.a((byte) -68, 88, (rc) null);
        }
        int var3 = param1 >>> 1802605695;
        return (var3 + param1) / param0 - var3;
    }

    public final void update(java.awt.Graphics param0) {
        ((rm) this).field_a.update(param0);
    }

    final static boolean a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_10_1 = false;
        L0: {
          var3 = ZombieDawn.field_J;
          var1 = param0 ? 1 : 0;
          if (we.o((byte) -80)) {
            hi.a((byte) 120);
            var1 = 1;
            break L0;
          } else {
            if (!dl.a(false)) {
              if (ac.d(50)) {
                bi.h(0, 0, bi.field_f, bi.field_a);
                oe.a((byte) -116);
                var1 = 1;
                break L0;
              } else {
                break L0;
              }
            } else {
              ql.d(-160793343);
              var1 = 1;
              break L0;
            }
          }
        }
        L1: {
          if (!nk.b(15000)) {
            break L1;
          } else {
            if (dl.a(false)) {
              break L1;
            } else {
              L2: {
                stackOut_9_0 = 80;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (cn.field_b != null) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L2;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = mp.field_c;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1 ? 1 : 0;
                  break L2;
                }
              }
              dm.a((byte) stackIn_12_0, stackIn_12_1 != 0);
              var1 = 1;
              break L1;
            }
          }
        }
        L3: {
          if (!bg.a(2)) {
            break L3;
          } else {
            var2 = (ln.field_b + -1 << 1442659304) / 16;
            if ((var2 ^ -1) >= -1) {
              break L3;
            } else {
              bi.a(0, 0, bi.field_f, bi.field_a, 0, var2);
              var1 = 1;
              break L3;
            }
          }
        }
        return var1 != 0;
    }

    rm(java.awt.Component param0) {
        ((rm) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_f = false;
        field_e = new vo();
        field_d = new vo();
    }
}
