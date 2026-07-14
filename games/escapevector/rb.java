/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends hg {
    static int[] field_h;
    static qh[] field_k;
    static String[] field_j;
    String field_g;
    int field_i;

    public static void a(byte param0) {
        if (param0 != -85) {
            return;
        }
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (pg.field_c != null) {
            if (al.field_d != ck.field_t) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          rb.a((byte) -76);
          if (pg.field_c != null) {
            if (al.field_d != ck.field_t) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(dk[] param0, int param1, int param2, byte param3) {
        dk[] var4 = null;
        int var5 = 0;
        dk var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dk[] var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var10 = EscapeVector.field_A;
        if (param0 == null) {
          return;
        } else {
          var11 = param0;
          var4 = var11;
          var5 = 0;
          L0: while (true) {
            if (var11.length <= var5) {
              L1: {
                if (param3 <= -5) {
                  break L1;
                } else {
                  field_k = null;
                  break L1;
                }
              }
              return;
            } else {
              var6 = var11[var5];
              if (var6 != null) {
                L2: {
                  var7 = var6.field_c;
                  if (param2 != var7) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_8_0;
                  if (var7 != param1) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  }
                }
                var9 = stackIn_11_0;
                var6.a(var8 != 0, var9 != 0, (byte) 81);
                var5++;
                var5++;
                continue L0;
              } else {
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    rb(String param0, int param1) {
        ((rb) this).field_g = param0;
        ((rb) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Congratulations on your success in the asteroid belt. Given your success thus far, we are extending your mission. You must now cripple the alien's mining operations.", "Target and eliminate their ore extraction machinery."};
    }
}
