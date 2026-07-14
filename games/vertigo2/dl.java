/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static String field_c;
    static boolean[][] field_b;
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 96 / ((-42 - param0) / 60);
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -14) {
          un.field_Hb = oe.field_qb;
          if (-256 != param3) {
            if ((param3 ^ -1) <= -101) {
              if (param3 > 105) {
                mp.field_f = fn.a(param3, true, param2);
                return;
              } else {
                mp.field_f = oq.a(param0 ^ 7, param1);
                return;
              }
            } else {
              mp.field_f = fn.a(param3, true, param2);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = -2956;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (-14 <= ea.field_e) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            mp.field_f = gi.a(stackIn_16_0, stackIn_16_1 != 0);
            return;
          }
        } else {
          field_a = null;
          un.field_Hb = oe.field_qb;
          if (-256 != param3) {
            if ((param3 ^ -1) <= -101) {
              if (param3 > 105) {
                mp.field_f = fn.a(param3, true, param2);
                return;
              } else {
                mp.field_f = oq.a(param0 ^ 7, param1);
                return;
              }
            } else {
              mp.field_f = fn.a(param3, true, param2);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = -2956;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (-14 <= ea.field_e) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            mp.field_f = gi.a(stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        }
    }

    final static void a(double param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param1 > -100) {
          return;
        } else {
          L0: {
            if (ob.field_F != param0) {
              var3 = 0;
              L1: while (true) {
                if (256 <= var3) {
                  ob.field_F = param0;
                  break L0;
                } else {
                  L2: {
                    var4 = (int)(Math.pow((double)var3 / 255.0, param0) * 255.0);
                    stackOut_5_0 = li.field_l;
                    stackOut_5_1 = var3;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var4 <= 255) {
                      stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = var4;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L2;
                    } else {
                      stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 255;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L2;
                    }
                  }
                  stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                  var3++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ri var4 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -5996) {
          var4 = (ri) (Object) ob.field_M.a((byte) 100);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              tg.a(param1, var4, param0 + 5996);
              var4 = (ri) (Object) ob.field_M.b(42);
              continue L0;
            }
          }
        } else {
          dl.a((byte) -91);
          var4 = (ri) (Object) ob.field_M.a((byte) 100);
          L1: while (true) {
            if (var4 == null) {
              return;
            } else {
              tg.a(param1, var4, param0 + 5996);
              var4 = (ri) (Object) ob.field_M.b(42);
              continue L1;
            }
          }
        }
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        if (!(-1 != ca.field_b)) {
            if (!c.a(1, (byte) -104)) {
                return false;
            }
            ca.field_b = id.field_f.h(-11);
            id.field_f.field_u = 0;
        }
        if (1 != (ca.field_b ^ -1)) {
            var1 = -112 % ((param0 - 11) / 52);
            return c.a(ca.field_b, (byte) -104);
        }
        if (!(c.a(2, (byte) -104))) {
            return false;
        }
        ca.field_b = id.field_f.a((byte) -11);
        id.field_f.field_u = 0;
        var1 = -112 % ((param0 - 11) / 52);
        return c.a(ca.field_b, (byte) -104);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_a = "Score";
    }
}
