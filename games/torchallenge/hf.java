/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf implements j {
    static ka field_a;
    static int field_c;
    static byte[] field_d;
    static int[][] field_f;
    static int field_e;
    static ne field_b;

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 4) {
          L0: {
            L1: {
              if (qf.field_a == null) {
                break L1;
              } else {
                if (qc.field_d != aj.field_c) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(byte param0, boolean param1, int param2, String param3, String param4, boolean param5) {
        int var7 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (param0 == -73) {
            break L0;
          } else {
            field_c = -14;
            break L0;
          }
        }
        L1: {
          if (!param1) {
            break L1;
          } else {
            L2: {
              if (param4 != null) {
                break L2;
              } else {
                if (param3 == null) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param4 == param3) {
                break L3;
              } else {
                if (param3 == null) {
                  break L3;
                } else {
                  param2--;
                  if ((param2 ^ -1) >= -1) {
                    param3 = param4;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L4: {
              if (30 <= param2) {
                break L4;
              } else {
                param2++;
                break L4;
              }
            }
            param3 = param4;
            break L1;
          }
        }
        L5: {
          if (!param5) {
            cd.field_c = param2;
            ci.field_q = param3;
            gf.field_v = param4;
            break L5;
          } else {
            pi.field_c = param3;
            ng.field_I = param2;
            rj.field_d = param4;
            break L5;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 < 11) {
            return;
        }
        int var3 = 1 << param2;
        if (!(0 == (var3 & jj.field_c))) {
            return;
        }
        ac.field_d = ac.field_d ^ 4;
        ae.field_z = ae.field_z ^ 4;
        jj.field_c = jj.field_c | var3;
        eh.field_l = eh.field_l | var3;
        db.field_D.a((da) (Object) new ul(param2), -83);
        if (!(bh.field_p)) {
            wc.field_g.a((da) (Object) new rd(param2, param0, al.field_z, pi.field_a, pi.field_f, ub.field_j), -53);
        }
    }

    final static byte[] a(int param0, byte[] param1, int param2, pa param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        var4 = param3.e(param2, 119);
        if ((var4 ^ -1) != param0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param3.e(3, param0 + 5);
            var6 = (byte)param3.e(8, 100);
            if (0 < var5) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param1[var7] = (byte)(param3.e(var5, 119) + var6);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 19199) {
            return;
        }
        field_f = null;
    }

    final static void a(byte param0) {
        ba.c((byte) 15);
        if (param0 >= -105) {
            return;
        }
        fk.a(true, 4);
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int var6 = param0.field_m + param2;
        if (param3 != 97) {
            field_c = -88;
        }
        int var7 = param1 - -param0.field_i;
        v.b(var6, 12105912, param0.field_p, var7, param0.field_l);
        ka var8 = ub.field_f[1];
        if (param0 instanceof ng) {
            if (((ng) (Object) param0).field_D) {
                var8.b(var6 - -1 - -(param0.field_p - var8.field_q >> -180256799), (-var8.field_v + param0.field_l >> 1420933345) + (var7 - -1), 256);
            }
        }
        if (!(!param0.c(param3 + -11))) {
            jc.a((byte) -115, var6 + 2, param0.field_l - 4, param0.field_p - 4, 2 + var7);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_f = new int[][]{new int[2], new int[2], new int[2]};
        field_b = new ne();
    }
}
