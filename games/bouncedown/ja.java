/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static java.math.BigInteger field_a;
    static int[] field_c;
    static int field_d;
    static String field_b;

    public static void a(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          boolean discarded$2 = ja.a((fb) null, 3, (fb) null);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(fb param0, int param1, fb param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var4 = Bounce.field_N;
          if (param1 == 200) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          var3 = param2.field_mb + -param0.field_mb;
          if (param2.field_kb == u.field_d) {
            var3 -= 200;
            break L1;
          } else {
            if (null != param2.field_kb) {
              break L1;
            } else {
              var3 += 200;
              break L1;
            }
          }
        }
        if (param0.field_kb != u.field_d) {
          if (param0.field_kb == null) {
            L2: {
              var3 -= 200;
              if (var3 <= 0) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L2;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L2;
              }
            }
            return stackIn_19_0 != 0;
          } else {
            L3: {
              if (var3 <= 0) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            return stackIn_15_0 != 0;
          }
        } else {
          L4: {
            var3 += 200;
            if (var3 <= 0) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          return stackIn_10_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        bc discarded$0 = new bc();
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_d = 64;
        field_c = new int[1024];
    }
}
