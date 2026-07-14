/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lcb extends rqa {
    static String field_p;
    static phb[] field_t;
    static llb field_r;
    static ml[] field_q;
    static String field_s;
    static boolean field_o;

    public static void a(int param0) {
        field_t = null;
        field_q = null;
        if (param0 != 0) {
            Object var2 = null;
            lcb.a((boolean[]) null, (boolean[]) null, (byte) 62);
        }
        field_p = null;
        field_s = null;
        field_r = null;
    }

    lcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            Object var4 = null;
            lcb.a((boolean[]) null, (boolean[]) null, (byte) -94);
        }
        return new nc((Object) (Object) frb.a(151, 103));
    }

    final static void a(boolean[] param0, boolean[] param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (!param0[86]) {
            break L0;
          } else {
            var3 = 0;
            L1: while (true) {
              if (var3 >= ecb.field_a.length) {
                break L0;
              } else {
                var4 = ecb.field_a[var3];
                if (!param1[var4]) {
                  if (param0[var4]) {
                    L2: {
                      var5 = 1 << var3;
                      if (param0[81]) {
                        var5 = var5 << 10;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      stackOut_10_0 = var5;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (pqa.a(var5, 11284)) {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      } else {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L3;
                      }
                    }
                    ucb.a(stackIn_13_0, stackIn_13_1 != 0, 11585);
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
        L4: {
          if (param2 == 79) {
            break L4;
          } else {
            lcb.a(-53);
            break L4;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_q = new ml[5];
        field_s = "Your email address is used to identify this account";
        field_o = true;
    }
}
