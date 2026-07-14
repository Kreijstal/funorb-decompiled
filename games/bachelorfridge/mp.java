/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends td {
    static String field_t;
    static String field_p;
    static String field_r;
    static int[] field_q;
    static kv field_s;

    mp(int param0, aga param1) {
        super(param0, param1);
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            mp.b(-30);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (45 != param1) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final ii a(op param0, int param1) {
        kh var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        var8 = BachelorFridge.field_y;
        var9 = ((mp) this).field_h.a(39, param0);
        var4 = new kh(((mp) this).field_g, new nq(var9));
        if (param1 == 3) {
          var5 = 0;
          L0: while (true) {
            if (param0.field_z <= var5) {
              return (ii) (Object) var4;
            } else {
              var6 = 0;
              L1: while (true) {
                if (var6 >= param0.field_B) {
                  var5++;
                  continue L0;
                } else {
                  if (null != param0.field_a[var5][var6].field_l) {
                    var7 = param0.field_a[var5][var6].field_l;
                    var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 0, 1), true);
                    var6++;
                    continue L1;
                  } else {
                    var6++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static long a(CharSequence param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        long var2 = 0L;
        int var4 = param0.length();
        for (var5 = 0; var4 > var5; var5++) {
            var2 = var2 * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65) {
                // if_icmplt L73
                var2 = var2 + (long)(var6 + -64);
            } else {
                if (var6 >= 97) {
                    // if_icmpgt L101
                    var2 = var2 + (long)(1 + var6 - 97);
                } else {
                    if (var6 >= 48) {
                        if (!(57 < var6)) {
                            var2 = var2 + (long)(-21 + var6);
                        }
                    }
                }
            }
            if (177917621779460413L <= var2) {
                break;
            }
        }
        while (0L == var2 % 37L) {
            // ifeq L169
            var2 = var2 / 37L;
        }
        if (!param1) {
            return 97L;
        }
        return var2;
    }

    public static void b(int param0) {
        if (param0 != 95) {
            field_q = null;
        }
        field_p = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Password: ";
        field_t = "Options Menu";
        field_q = new int[]{100, 40, 20};
    }
}
