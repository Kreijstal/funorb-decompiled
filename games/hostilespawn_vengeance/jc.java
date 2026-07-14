/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static ci field_b;
    static String field_e;
    static jb[] field_c;
    static String field_d;
    static bd field_a;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 == 89) {
            return;
        }
        jc.a((byte) 73);
    }

    final static void a(int[] param0, int param1, int param2, byte[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          if (mn.field_a.length <= var5) {
            if (param4 == 8965) {
              return;
            } else {
              field_c = null;
              return;
            }
          } else {
            param1 = mn.field_a[var5];
            var6 = var5 << 1942939940;
            L1: while (true) {
              param1--;
              if (param1 == 0) {
                var5++;
                var5++;
                continue L0;
              } else {
                var6++;
                param2 = lh.field_d[var6];
                param0[param3[param2]] = param0[param3[param2]] + 1;
                lh.field_d[param0[param3[param2]]] = param2;
                continue L1;
              }
            }
          }
        }
    }

    final static bd a(gb param0, int param1, int param2, int param3) {
        if (param1 == 65) {
          if (!rl.a(2884, param0, param3, param2)) {
            return null;
          } else {
            return rf.a(-58);
          }
        } else {
          field_c = null;
          if (!rl.a(2884, param0, param3, param2)) {
            return null;
          } else {
            return rf.a(-58);
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var1 = mn.field_a[0];
        var2 = 1;
        if (param0 >= -94) {
          field_c = null;
          L0: while (true) {
            if (mn.field_a.length > var2) {
              var3 = mn.field_a[var2];
              kf.a(lh.field_d, var2 << -1259934556, lh.field_d, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (mn.field_a.length > var2) {
              var3 = mn.field_a[var2];
              kf.a(lh.field_d, var2 << -1259934556, lh.field_d, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static jj a(boolean param0) {
        if (od.field_I == e.field_q) {
          throw new IllegalStateException();
        } else {
          if (!param0) {
            if (od.field_I != ee.field_b) {
              return null;
            } else {
              od.field_I = e.field_q;
              return wj.field_H;
            }
          } else {
            field_a = null;
            if (od.field_I != ee.field_b) {
              return null;
            } else {
              od.field_I = e.field_q;
              return wj.field_H;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This password contains your Player Name, and would be easy to guess";
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = new jb[65];
        field_b = new ci();
    }
}
