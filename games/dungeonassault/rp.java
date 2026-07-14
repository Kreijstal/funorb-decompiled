/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    static ef field_d;
    static byte[][] field_c;
    static String[] field_b;
    static String field_a;
    static java.security.SecureRandom field_g;
    static String[] field_f;
    static String field_h;
    static int[] field_e;

    final static boolean a(char param0, byte param1) {
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (!(!pp.a(-111, param0))) {
            return true;
        }
        if (param0 != 45) {
            // if_icmpeq L55
            // if_icmpeq L55
            // if_icmpeq L55
        } else {
            return true;
        }
        if (param1 >= -102) {
            field_f = null;
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int[][] param5, int param6) {
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        jh.a(jh.field_l);
        if (param2 != 108) {
            return;
        }
        for (var7 = 0; var7 < param5.length / param0 + 1; var7++) {
            gf.b(-1 + (-var7 + param3), param6 - (1 - -var7), param1 - -(2 * var7) - -2, 59416);
            gf.c(param3 + (-var7 - 1), param6 - var7, param4 + var7 * 2, 15204376);
            gf.b(-1 + (param3 + -var7), param4 + (param6 + var7), 2 + (param1 - -(var7 * 2)), 6168);
            gf.c(var7 + param3 + param1, -var7 + param6, 2 * var7 + param4, 1572888);
        }
        jh.b();
        var7 = 0;
        while (var7 < param5.length) {
            te.a(-1 + param3, param6 + -1, 2 + param1, param5[var7]);
            te.b(-1 + param3, param6, param4, param5[var7]);
            te.a(param3 - 1, param6 + param4, 2 + param1, param5[var7]);
            te.b(param1 + param3, param6, param4, param5[var7]);
            var7 = var7 + param0;
            param6--;
            param4 += 2;
            param3--;
            param1 += 2;
        }
    }

    final static void a(byte param0) {
        if (!(null == a.field_n)) {
            a.field_n.j((byte) 73);
        }
        if (param0 > -33) {
            Object var2 = null;
            byte[] discarded$0 = rp.a((String) null, -9);
        }
        pj.field_c = new gk();
        ta.field_a.b(1, (lm) (Object) pj.field_c);
    }

    final static boolean a(int param0, int param1) {
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == 15204376) {
            break L0;
          } else {
            boolean discarded$2 = rp.a(-31, -32);
            break L0;
          }
        }
        L1: {
          if (4 == param1) {
            break L1;
          } else {
            if (3 != param1) {
              if (22 != param1) {
                if (23 == param1) {
                  return of.field_k;
                } else {
                  return true;
                }
              } else {
                L2: {
                  L3: {
                    if (gm.field_d.field_m < ak.field_o[0]) {
                      break L3;
                    } else {
                      if (of.field_k) {
                        break L3;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                }
                return stackIn_15_0 != 0;
              }
            } else {
              break L1;
            }
          }
        }
        L4: {
          L5: {
            if (null == gm.field_d) {
              break L5;
            } else {
              if (gm.field_d.field_K == 0) {
                break L5;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L4;
        }
        return stackIn_9_0 != 0;
    }

    final static byte[] a(String param0, int param1) {
        if (param1 < 39) {
            rp.a(-93, 97, (byte) -14, 21, 98, (int[][]) null, 14);
        }
        return bb.field_b.a("", param0, (byte) -113);
    }

    public static void b(byte param0) {
        field_g = null;
        field_h = null;
        field_d = null;
        field_f = null;
        if (param0 != -68) {
            rp.a((byte) 9);
        }
        field_c = null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ef();
        field_c = new byte[250][];
        field_b = new String[]{"Gift of the Trees", "Double target <%sneak> in the next room. (Single use)"};
        field_a = "Your <col=FF8000><%0></col> was caught and eaten.";
        field_f = new String[]{"Revive", "Return a killed raider to your stable. (Single use)"};
        field_h = "Members' Benefits";
        field_e = new int[4];
    }
}
