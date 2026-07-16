/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik {
    int field_a;
    int field_b;
    static int field_e;
    int field_c;
    static wj[] field_g;
    int field_d;
    static String field_f;

    final static String[] a(String param0, byte param1, char param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = CrazyCrystals.field_B;
        CharSequence var11 = (CharSequence) (Object) param0;
        int var3 = lp.a(var11, (byte) -40, param2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            int incrementValue$0 = var5;
            var5++;
            var4[incrementValue$0] = param0.substring(var6, var8);
            var6 = var8 - -1;
        }
        if (param1 != -76) {
            Object var10 = null;
            String[] discarded$1 = ik.a((String) null, (byte) 127, 'ﾸ');
        }
        var4[var3] = param0.substring(var6);
        return var4;
    }

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (qh.field_i < ((ik) this).field_a) {
                break L1;
              } else {
                if (qh.field_i >= ((ik) this).field_a + ((ik) this).field_b) {
                  break L1;
                } else {
                  if (bm.field_h < ((ik) this).field_d) {
                    break L1;
                  } else {
                    if (bm.field_h >= ((ik) this).field_c + ((ik) this).field_d) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -59) {
            break L0;
          } else {
            ((ik) this).a(false, -29, -81);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ik) this).field_a > to.field_a) {
              break L2;
            } else {
              if (to.field_a >= ((ik) this).field_b + ((ik) this).field_a) {
                break L2;
              } else {
                if (dp.field_h < ((ik) this).field_d) {
                  break L2;
                } else {
                  if (((ik) this).field_d + ((ik) this).field_c <= dp.field_h) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    abstract void a(boolean param0, int param1, int param2);

    public static void a(byte param0) {
        if (param0 <= 99) {
            field_e = -126;
        }
        field_f = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "To server list";
    }
}
