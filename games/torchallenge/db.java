/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends sh {
    byte field_F;
    static int[][] field_x;
    static int field_y;
    int field_C;
    static sl field_D;
    static int field_B;
    uf field_A;
    static int field_z;
    static int[] field_E;

    final int f(int param0) {
        if (param0 != 100) {
            db.h(115);
        }
        if (!(((db) this).field_A != null)) {
            return 0;
        }
        return ((db) this).field_A.field_q * 100 / (-((db) this).field_F + ((db) this).field_A.field_m.length);
    }

    final static void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        int var1 = vf.field_b[0];
        for (var2 = 1; vf.field_b.length > var2; var2++) {
            var3 = vf.field_b[var2];
            he.a(k.field_e, var2 << 1607896580, k.field_e, var1, var3);
            var1 = var1 + var3;
        }
        if (param0 != 2) {
            field_E = null;
        }
    }

    final static void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        eh var4_ref_eh = null;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        byte[] var8 = null;
        eb var9 = null;
        pa var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          var10 = id.field_b;
          var2 = var10.j(-99);
          if (var2 == 0) {
            var9 = (eb) (Object) ga.field_w.c((byte) -71);
            if (var9 != null) {
              L1: {
                var4 = var10.j(-119);
                if (0 == var4) {
                  var5_array = null;
                  break L1;
                } else {
                  var14 = new byte[var4];
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var8 = var11;
                  var5_array = var8;
                  var10.a(111, var14, var4, 0);
                  break L1;
                }
              }
              var10.field_q = var10.field_q + 4;
              if (!var10.e(0)) {
                ob.b(-90);
                return;
              } else {
                var9.field_j = true;
                var9.field_q = var5_array;
                var9.a(true);
                break L0;
              }
            } else {
              ob.b(-128);
              return;
            }
          } else {
            if ((var2 ^ -1) != -2) {
              td.a("A1: " + ck.a(-13299), (Throwable) null, (byte) -85);
              ob.b(-96);
              break L0;
            } else {
              var3 = var10.i(30);
              var4_ref_eh = (eh) (Object) nh.field_cb.c((byte) 105);
              L2: while (true) {
                L3: {
                  if (var4_ref_eh == null) {
                    break L3;
                  } else {
                    if (var4_ref_eh.field_j == var3) {
                      break L3;
                    } else {
                      var4_ref_eh = (eh) (Object) nh.field_cb.c(-270);
                      continue L2;
                    }
                  }
                }
                if (var4_ref_eh != null) {
                  var4_ref_eh.a(true);
                  break L0;
                } else {
                  ob.b(-114);
                  return;
                }
              }
            }
          }
        }
        var3 = -65 % ((param0 - -75) / 32);
    }

    public static void h(int param0) {
        field_x = null;
        int var1 = 106 % ((74 - param0) / 41);
        field_E = null;
        field_D = null;
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        qe var7 = null;
        qe var8 = null;
        qe var9 = null;
        qe var10 = null;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          var2 = 68 / ((param0 - -12) / 39);
          var3 = 5;
          if (null == vk.field_i) {
            break L0;
          } else {
            if (eb.field_n) {
              var7 = vk.field_i;
              var9 = var7;
              var1 = qk.a(-1, var9.field_o, var9.field_H, -1, 123, wb.field_p.field_H, -1, wb.field_p.field_o);
              var1 = sh.field_r * var1 / 256;
              fh.field_h[1] = var1;
              fj.field_p[1] = var7.field_y;
              break L0;
            } else {
              break L0;
            }
          }
        }
        fh.field_h[0] = 0;
        var5 = 0;
        L1: while (true) {
          if (var5 >= var3) {
            return;
          } else {
            if (null != ie.field_e[var5]) {
              if (ie.field_e[var5].field_nb) {
                var8 = ie.field_e[var5];
                var10 = var8;
                var1 = qk.a(-1, var10.field_o, var10.field_H, -1, -3, wb.field_p.field_H, -1, wb.field_p.field_o);
                var1 = var1 * sh.field_r / 256;
                if (fh.field_h[0] <= var1) {
                  fh.field_h[0] = var1;
                  fj.field_p[0] = var8.field_y;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final byte[] e(int param0) {
        if (!((db) this).field_v) {
            // if_icmpgt L34
        } else {
            throw new RuntimeException();
        }
        if (param0 != 2) {
            field_z = 54;
        }
        return ((db) this).field_A.field_m;
    }

    db() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_D = new sl();
        field_E = new int[]{-5, -5, -5};
        field_z = -1;
    }
}
