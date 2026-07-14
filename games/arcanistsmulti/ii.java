/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii implements pf {
    static boolean field_f;
    static kc field_b;
    static qb field_d;
    static int field_c;
    static int field_a;
    static String field_e;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        var6 = param2 - -param0.field_n;
        if (param1 == 5592405) {
          L0: {
            var7 = param3 + param0.field_j;
            kh.a(param0.field_v, var6, var7, param0.field_k, param1 + -5592532);
            var8 = qk.field_lb[1];
            if (!(param0 instanceof ag)) {
              break L0;
            } else {
              if (((ag) (Object) param0).field_z) {
                var8.b((-var8.field_n + param0.field_v >> 1549596449) + 1 + var6, (param0.field_k + -var8.field_w >> 360001057) + (var7 - -1), 256);
                break L0;
              } else {
                if (!param0.d(param1 ^ -5594391)) {
                  return;
                } else {
                  oj.a(param1 + -5624576, var7 + 2, var6 - -2, param0.field_k - 4, -4 + param0.field_v);
                  return;
                }
              }
            }
          }
          if (param0.d(param1 ^ -5594391)) {
            oj.a(param1 + -5624576, var7 + 2, var6 - -2, param0.field_k - 4, -4 + param0.field_v);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int a(byte param0) {
        if (param0 >= -109) {
            field_c = -37;
            return lo.field_q;
        }
        return lo.field_q;
    }

    final static fk a(int param0, boolean param1, wf param2, int param3) {
        if (param1) {
          int discarded$2 = ii.a((byte) 81);
          return sc.a(kd.a(param2, param0, param3), (byte) 68);
        } else {
          return sc.a(kd.a(param2, param0, param3), (byte) 68);
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = 53 / ((26 - param0) / 49);
        L0: while (true) {
          if (ib.b(false)) {
            L1: {
              if (-17 == (vn.field_d ^ -1)) {
                io.a(65, (byte) -84);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (vn.field_d != 17) {
                break L2;
              } else {
                io.a(73, (byte) 112);
                break L2;
              }
            }
            L3: {
              if ((vn.field_d ^ -1) != -19) {
                break L3;
              } else {
                io.a(97, (byte) -93);
                break L3;
              }
            }
            L4: {
              if ((vn.field_d ^ -1) == -20) {
                io.a(69, (byte) 76);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (vn.field_d != -21) {
                break L5;
              } else {
                io.a(67, (byte) 89);
                break L5;
              }
            }
            L6: {
              if (-22 != vn.field_d) {
                break L6;
              } else {
                io.a(17, (byte) 31);
                break L6;
              }
            }
            L7: {
              if (vn.field_d != 13) {
                break L7;
              } else {
                if ((ch.field_b & 64 ^ -1) >= -1) {
                  break L7;
                } else {
                  return 2;
                }
              }
            }
            vf.field_g.a((byte) -76);
            if (!vf.field_g.b(true)) {
              continue L0;
            } else {
              continue L0;
            }
          } else {
            L8: {
              vf.field_g.a(rl.a(me.field_I, an.field_g, -123), rl.a(ja.field_s, pb.field_h, -74), -97);
              if (!vf.field_g.b(true)) {
                break L8;
              } else {
                break L8;
              }
            }
            var2 = 0;
            return var2;
          }
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != 106) {
            field_a = 84;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = field_c;
        field_e = "Loading music";
    }
}
