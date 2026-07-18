/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends pd {
    private int field_h;
    static String[] field_l;
    private int field_k;
    static byte[][] field_i;
    static sj field_j;
    static String field_m;

    final void a(byte param0) {
        tb.field_d.a(de.field_l, 100, ((mn) this).field_h * gi.field_m * 48, ((mn) this).field_k / ((mn) this).field_h);
        ((mn) this).field_h = 0;
        ((mn) this).field_k = 0;
        int var2 = 123 % ((param0 - 29) / 42);
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            mn.b(true);
        }
        return (pb) (Object) new ti();
    }

    final static dl[] c(int param0) {
        dl[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = CrazyCrystals.field_B;
        var1 = new dl[mg.field_a];
        var2 = 0;
        L0: while (true) {
          if (var2 >= mg.field_a) {
            int discarded$1 = 2188450;
            ok.a();
            return var1;
          } else {
            var3 = je.field_c[var2] * uo.field_l[var2];
            var23 = ui.field_c[var2];
            if (!rh.field_a[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new dl(km.field_c, bo.field_o, uo.field_k[var2], jm.field_a[var2], uo.field_l[var2], je.field_c[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = gh.field_z[pf.b((int) var23[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var24 = ng.field_g[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (dl) (Object) new vi(km.field_c, bo.field_o, uo.field_k[var2], jm.field_a[var2], uo.field_l[var2], je.field_c[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = hm.a(gh.field_z[pf.b((int) var23[var7], 255)], pf.b((int) var24[var7], 255) << 24);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void b(boolean param0) {
        vl.field_f.a((byte) -116);
        vl.field_f = null;
        if (param0) {
            field_l = null;
        }
        be.field_d.a((byte) -21);
        be.field_d = null;
        tl.field_a.a((byte) -87);
        tl.field_a = null;
        jo.field_p.a((byte) -96);
        jo.field_p = null;
        sa.field_mb.a((byte) -54);
        sa.field_mb = null;
        io.field_M.a((byte) -98);
        io.field_M = null;
        ec.field_k.a((byte) -43);
        ec.field_k = null;
    }

    public static void c() {
        field_l = null;
        field_i = null;
        field_m = null;
        field_j = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var6 = CrazyCrystals.field_B;
        if (!param0) {
            field_j = null;
        }
        param2 = param2 + param3;
        while (param2 > param3) {
            pd.field_g[param1] = pd.field_g[param1] + (4 > q.field_a[ma.field_n[param1]].field_c[param3] ? 50 : 100);
            param3++;
        }
    }

    mn() {
        ((mn) this).field_h = 0;
        ((mn) this).field_k = 0;
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        f stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        f stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                ((mn) this).field_k = ((mn) this).field_k + param3;
                ((mn) this).field_h = ((mn) this).field_h + 1;
                if (q.field_a[ma.field_n[param1]].field_c[param2] < 4) {
                  stackOut_5_0 = 50;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 100;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              ph.a(stackIn_6_0, (byte) 107, param1, param4);
              stackOut_6_0 = bm.field_g;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (f) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("mn.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_i = new byte[1000][];
        field_j = new sj(0, 2, 2, 1);
        field_m = "All Spiders";
    }
}
