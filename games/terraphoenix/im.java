/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static String[] field_d;
    static int field_c;
    static String field_b;
    static String field_a;

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param0 = param0 & 8191;
        if (param1) {
          if (param0 >= 4096) {
            L0: {
              if ((param0 ^ -1) > -6145) {
                stackOut_18_0 = -va.field_d[-param0 + 6144];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = va.field_d[-6144 + param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param0 ^ -1) > -2049) {
                stackOut_14_0 = va.field_d[-param0 + 2048];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -va.field_d[-2048 + param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          im.a(true);
          if (param0 >= 4096) {
            L2: {
              if ((param0 ^ -1) > -6145) {
                stackOut_8_0 = -va.field_d[-param0 + 6144];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = va.field_d[-6144 + param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param0 ^ -1) > -2049) {
                stackOut_4_0 = va.field_d[-param0 + 2048];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -va.field_d[-2048 + param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
            field_d = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        var3 = jl.a(param0, 121, param2);
        if (var3 == null) {
          var4 = 0;
          L0: while (true) {
            if (param0.length() <= var4) {
              if (param1 == -14) {
                return null;
              } else {
                return null;
              }
            } else {
              if (qb.a(param0.charAt(var4), (byte) -76)) {
                var4++;
                continue L0;
              } else {
                return gd.field_d;
              }
            }
          }
        } else {
          return var3;
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (param1 != -24538) {
            int discarded$9 = im.a(95, true);
            if (!(var2 != 0)) {
                throw new IllegalArgumentException("" + Integer.toString(var2, 16));
            }
            if (-129 >= (var2 ^ -1)) {
                if (var2 < 160) {
                    var3 = oj.field_s[var2 - 128];
                    if (0 == var3) {
                        var3 = 63;
                    }
                    var2 = var3;
                }
            }
            return (char)var2;
        }
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (-129 >= (var2 ^ -1)) {
            if (var2 < 160) {
                var3 = oj.field_s[var2 - 128];
                if (0 == var3) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "HE";
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_d = new String[]{"By rating", "By win percentage"};
    }
}
