/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends cb {
    int field_kb;
    String field_lb;
    static String field_jb;
    String field_ib;

    public static void g(int param0) {
        field_jb = null;
        if (param0 >= -1) {
            oh.d((byte) 87);
        }
    }

    final static void a(byte[] param0, int param1, java.math.BigInteger param2, de param3, int param4, int param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var10 = ZombieDawn.field_J;
          var7 = ip.a(param4, -1);
          if (null == oc.field_a) {
            oc.field_a = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var16 = new int[4];
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var8 = var13;
        var9 = 0;
        L1: while (true) {
          if (var9 >= 4) {
            L2: {
              if (param5 == 31857) {
                break L2;
              } else {
                var11 = null;
                oh.a((byte[]) null, 73, (java.math.BigInteger) null, (de) null, -53, 65, (java.math.BigInteger) null);
                break L2;
              }
            }
            L3: {
              L4: {
                if (null == bb.field_h) {
                  break L4;
                } else {
                  if (var7 > bb.field_h.field_h.length) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              bb.field_h = new de(var7);
              break L3;
            }
            L5: {
              L6: {
                bb.field_h.field_j = 0;
                bb.field_h.a(param0, param4, param1, param5 + -59700);
                bb.field_h.b(var7, 0);
                bb.field_h.a(var16, 30044);
                if (null == ip.field_l) {
                  break L6;
                } else {
                  if ((ip.field_l.field_h.length ^ -1) > -101) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              ip.field_l = new de(100);
              break L5;
            }
            ip.field_l.field_j = 0;
            ip.field_l.i(10, 52);
            var12 = 0;
            var9 = var12;
            L7: while (true) {
              if (var12 >= 4) {
                ip.field_l.a(param4, (byte) 105);
                ip.field_l.a(param2, false, param6);
                param3.a(ip.field_l.field_h, ip.field_l.field_j, 0, param5 ^ -4276);
                param3.a(bb.field_h.field_h, bb.field_h.field_j, 0, -27843);
                return;
              } else {
                ip.field_l.h(param5 ^ 31772, var16[var12]);
                var12++;
                continue L7;
              }
            }
          } else {
            var8[var9] = oc.field_a.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    oh() {
        super(0L, (cb) null);
    }

    final static void d(byte param0) {
        if (param0 > -71) {
            return;
        }
        hg.b(31431);
    }

    final static lp a(int param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        if (param0 != 29506) {
            return null;
        }
        lp var2 = new lp(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, j.field_a, vj.field_m);
        no.f((byte) -73);
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "Game Over";
    }
}
