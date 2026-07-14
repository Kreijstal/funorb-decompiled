/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ng {
    static boolean field_b;
    static boolean[] field_a;

    final static tg[] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Bounce.field_N;
        tg[] var1 = new tg[nj.field_p];
        for (var2 = 0; var2 < nj.field_p; var2++) {
            var3 = qh.field_i[var2] * ih.field_V[var2];
            var4 = ph.field_c[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = he.field_k[da.b((int) var4[var6], 255)];
            }
            var1[var2] = new tg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var5);
        }
        if (param0 > -47) {
            return null;
        }
        vb.a((byte) 122);
        return var1;
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 108) {
            break L0;
          } else {
            ng.b(51);
            break L0;
          }
        }
        L1: {
          L2: {
            if (vd.field_b == null) {
              break L2;
            } else {
              if (!vd.field_b.b((byte) 121)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    abstract sb b(byte param0);

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == bl.field_e) {
              break L1;
            } else {
              if (bl.field_e.length >= param2) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          bl.field_e = new int[param2 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == sj.field_j) {
              break L3;
            } else {
              if (sj.field_j.length >= param2) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          sj.field_j = new int[2 * param2];
          break L2;
        }
        L4: {
          L5: {
            if (null == nh.field_S) {
              break L5;
            } else {
              if (param2 <= nh.field_S.length) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          nh.field_S = new int[param2 * 2];
          break L4;
        }
        L6: {
          if (param0 == -15936) {
            break L6;
          } else {
            tg[] discarded$1 = ng.a((byte) -73);
            break L6;
          }
        }
        L7: {
          L8: {
            if (gk.field_i == null) {
              break L8;
            } else {
              if (gk.field_i.length < param2) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          gk.field_i = new int[2 * param2];
          break L7;
        }
        L9: {
          L10: {
            if (th.field_c == null) {
              break L10;
            } else {
              if (th.field_c.length < param2) {
                break L10;
              } else {
                break L9;
              }
            }
          }
          th.field_c = new int[2 * param2];
          break L9;
        }
        L11: {
          L12: {
            if (null == ij.field_b) {
              break L12;
            } else {
              if (param2 <= ij.field_b.length) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          ij.field_b = new int[2 * param2];
          break L11;
        }
        L13: {
          L14: {
            if (w.field_f == null) {
              break L14;
            } else {
              if (param1 + param2 > w.field_f.length) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          w.field_f = new int[2 * (param2 - -param1)];
          break L13;
        }
        L15: {
          L16: {
            if (pg.field_a == null) {
              break L16;
            } else {
              if (pg.field_a.length >= param2) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          pg.field_a = new boolean[param2 * 2];
          break L15;
        }
        mg.field_n = 2147483647;
        va.field_b = 2147483647;
        w.field_d = -2147483648;
        q.field_M = 0;
        uc.field_A = -2147483648;
    }

    abstract void a(boolean param0, wi param1);

    public static void b(int param0) {
        if (param0 != 2) {
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Bounce.field_N;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (!(!md.a(106, param1))) {
            return true;
        }
        char[] var6 = a.field_b;
        char[] var2 = var6;
        if (param0 != -95) {
            field_a = null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        var2 = nh.field_O;
        for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new boolean[112];
        field_b = false;
    }
}
