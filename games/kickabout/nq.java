/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends i {
    static ut field_G;
    static int field_I;
    static String field_H;
    static int field_J;
    static al field_F;

    final static boolean i(int param0) {
        if (param0 >= -55) {
            field_H = null;
        }
        return 250 < up.field_p ? true : false;
    }

    final static boolean a(boolean param0, String param1, long param2) {
        gg var4 = null;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        var4 = tr.a(param1, (byte) 40);
        if (!param0) {
          L0: {
            if (var4 == null) {
              break L0;
            } else {
              if (var4.field_zb == null) {
                break L0;
              } else {
                return true;
              }
            }
          }
          L1: {
            L2: {
              if (null == uv.field_i) {
                break L2;
              } else {
                if (nk.a(31253, param2) == null) {
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final static short[] a(short[] param0, ml param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        var4 = 46 % ((-4 - param3) / 47);
        var5 = param1.l(param2, 59);
        if (0 != var5) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != var5) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new short[var5];
            break L0;
          }
          L2: {
            var6 = param1.l(4, 59);
            var7 = (short)param1.l(16, 59);
            if (var6 > 0) {
              var8 = 0;
              L3: while (true) {
                if (var5 <= var8) {
                  break L2;
                } else {
                  param0[var8] = (short)(var7 + param1.l(var6, 59));
                  var8++;
                  continue L3;
                }
              }
            } else {
              var8 = 0;
              L4: while (true) {
                if (var8 >= var5) {
                  break L2;
                } else {
                  param0[var8] = (short)var7;
                  var8++;
                  continue L4;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    nq(String param0) {
        super(42);
        String var2 = vo.a((byte) -18, gd.field_e[42], new String[1]);
        ut var3 = kb.field_E[6];
        ((nq) this).a(var2, ((nq) this).field_t, var3, -99, ((nq) this).field_u);
        ((nq) this).a(ds.a(((nq) this).field_y, 1), pg.a(false, 42), 1054928844);
    }

    final static void a(int param0, int param1, nl param2, int param3, byte param4, int param5) {
        if (param4 <= 36) {
            field_G = null;
        }
        int var6 = param2.f(-95);
        int var7 = param2.a(true);
        param2.field_G = (param1 - -param0 >= var7 ? 0 : 4) | ((var6 < param5 - param0 ? 8 : 0) | (var6 <= param5 + param0 ? 0 : 2) | (-param0 + param1 <= var7 ? 0 : 1));
        if (-1 == (param2.field_G ^ -1)) {
            param2.a(param3, 26214);
        }
    }

    final static void b(int param0, int param1) {
        if (!(!la.a(100))) {
            return;
        }
        if (!(!uv.field_f)) {
            return;
        }
        or.field_d.b(77, (byte) 85);
        or.field_d.a(105, param0);
        ri.field_t = param1;
        uv.field_f = true;
    }

    final static void b(int param0, int param1, int param2) {
        lj.field_h = param0;
        ji.field_Hb = param2;
        if (param1 != 0) {
            nq.h(-29);
        }
    }

    public static void h(int param0) {
        if (param0 != 0) {
            field_G = null;
        }
        field_H = null;
        field_G = null;
        field_F = null;
    }

    final static int g(int param0) {
        if (param0 != 0) {
            return 9;
        }
        return tl.a(-127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 0;
        field_H = "Experience cannot be used when a player is in an auction.";
    }
}
