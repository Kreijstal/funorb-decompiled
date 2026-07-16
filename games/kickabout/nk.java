/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends dg {
    static int field_h;
    static String field_g;

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        var1 = (Object) (Object) nr.field_q;
        synchronized (var1) {
          L0: {
            L1: {
              if (param0 == -59) {
                break L1;
              } else {
                nk.a(114);
                break L1;
              }
            }
            if (vb.field_b == wl.field_n) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              cc.field_e = bt.field_a[wl.field_n];
              il.field_c = up.field_a[wl.field_n];
              wl.field_n = 127 & 1 + wl.field_n;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    final static he a(int param0, long param1) {
        if (param0 != 31253) {
            return null;
        }
        return (he) (Object) pu.field_Eb.a(param0 + -34864, param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = Kickabout.field_G;
        eo.a(mk.field_a, param0, param2, param3, param1, 256, mk.field_a.field_v - param1);
        var13 = new int[4];
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var6 = var9;
        on.a(var13);
        if (param4 == 3) {
          on.e(param0, param2, param3 + param0, param2 + param1);
          cq.field_j.c(-40 + param0, param2 - 290, 32);
          on.b(var13);
          var7 = 0;
          L0: while (true) {
            if ((var7 ^ -1) <= -3) {
              return;
            } else {
              on.e(var7 + param0, var7 + param2, -var7 + -var7 + param3, param1 + -var7 - var7, 65793);
              var7++;
              continue L0;
            }
          }
        } else {
          boolean discarded$1 = nk.b((byte) 94);
          on.e(param0, param2, param3 + param0, param2 + param1);
          cq.field_j.c(-40 + param0, param2 - 290, 32);
          on.b(var13);
          var7 = 0;
          L1: while (true) {
            if ((var7 ^ -1) <= -3) {
              return;
            } else {
              on.e(var7 + param0, var7 + param2, -var7 + -var7 + param3, param1 + -var7 - var7, 65793);
              var7++;
              continue L1;
            }
          }
        }
    }

    nk() {
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -15207) {
            boolean discarded$0 = nk.b((byte) 110);
        }
    }

    final static void c(byte param0) {
        int var3 = Kickabout.field_G;
        if (!(!la.a(param0 + 156))) {
            wk.a(50);
            return;
        }
        if (param0 != -56) {
            return;
        }
        or.field_d.b(81, (byte) 99);
        or.field_d.field_n = or.field_d.field_n + 2;
        int var1 = or.field_d.field_n;
        or.field_d.a(109, da.field_h.a(false));
        hn var2 = (hn) (Object) da.field_h.g(param0 + 24065);
        while (var2 != null) {
            var2.a(1, (iw) (Object) or.field_d);
            var2 = (hn) (Object) da.field_h.c(param0 ^ -23);
        }
        or.field_d.d(or.field_d.field_n - var1, param0 + 118);
        da.field_h.b(param0 + 23053);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "players";
        field_h = 0;
    }
}
