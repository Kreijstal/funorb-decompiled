/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static ml field_b;
    static jb[] field_d;
    static String field_c;
    static int field_a;
    static int field_e;

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -127) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    abstract long c(int param0);

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    final static boolean a(byte param0, ae param1, ae param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = Torquing.field_u;
          var3 = param1.field_kb + -param2.field_kb;
          if (param1.field_jb == og.field_m) {
            // wide iinc 3 -200
            break L0;
          } else {
            if (param1.field_jb == null) {
              // wide iinc 3 200
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 > 66) {
            break L1;
          } else {
            ha.a(-19);
            break L1;
          }
        }
        if (param2.field_jb != og.field_m) {
          if (null != param2.field_jb) {
            L2: {
              if (-1 <= (var3 ^ -1)) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              // wide iinc 3 -200
              if (-1 >= var3) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if (-1 <= var3) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    final int a(byte param0, long param1) {
        long var4 = ((ha) this).c(20520);
        if (param0 >= -97) {
            return 126;
        }
        if (!(var4 <= 0L)) {
            ub.a(1976, var4);
        }
        return ((ha) this).a(param1, true);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var11 = Torquing.field_u;
        int var6 = ln.a(qk.field_p, j.field_q, param4, 91);
        int var7 = ln.a(qk.field_p, j.field_q, param5, 97);
        int var8 = ln.a(qg.field_z, kn.field_e, param0, 81);
        int var9 = ln.a(qg.field_z, kn.field_e, param3, 81);
        if (param2 > -45) {
            field_c = null;
            for (var10 = var6; var10 <= var7; var10++) {
                di.a(var8, (byte) -113, param1, qd.field_a[var10], var9);
            }
            return;
        }
        for (var10 = var6; var10 <= var7; var10++) {
            di.a(var8, (byte) -113, param1, qd.field_a[var10], var9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Just play";
        field_a = -1;
        field_b = new ml();
    }
}
