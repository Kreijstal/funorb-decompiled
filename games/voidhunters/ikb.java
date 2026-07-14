/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ikb extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = null;
        }
        return new nc((Object) (Object) frb.a(221, 113));
    }

    final static boolean a(int[] param0, int[] param1, boolean param2) {
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var6 = VoidHunters.field_G;
        if (param0 == null) {
          L0: {
            if (param1 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_5_0;
            if (var3 != 0) {
              System.out.println("Before=" + param1 + ", after=" + param0);
              break L1;
            } else {
              break L1;
            }
          }
          return var3 != 0;
        } else {
          if (param0 == param1) {
            System.out.println("Using duplicate array reference in debug diffs!");
            new Throwable().printStackTrace();
            return false;
          } else {
            if (param1 == null) {
              System.out.println("Before=" + param1 + ", after=" + param0);
              return true;
            } else {
              if (param1.length == param0.length) {
                var3 = param2 ? 1 : 0;
                var4 = new StringBuilder();
                StringBuilder discarded$5 = var4.append("{");
                var5 = 0;
                L2: while (true) {
                  if (var5 >= param0.length) {
                    L3: {
                      StringBuilder discarded$6 = var4.append("}");
                      if (var3 == 0) {
                        break L3;
                      } else {
                        System.out.println((Object) (Object) var4);
                        break L3;
                      }
                    }
                    return var3 != 0;
                  } else {
                    L4: {
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        StringBuilder discarded$7 = var4.append(",");
                        break L4;
                      }
                    }
                    if (param1[var5] == param0[var5]) {
                      StringBuilder discarded$8 = var4.append("_");
                      var5++;
                      continue L2;
                    } else {
                      StringBuilder discarded$9 = var4.append(param1[var5] + "->" + param0[var5]);
                      var3 = 1;
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                System.out.println("Before length=" + param1.length + ", after length=" + param0.length);
                return true;
              }
            }
          }
        }
    }

    ikb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 221) {
            Object var2 = null;
            boolean discarded$0 = ikb.a((int[]) null, (int[]) null, false);
        }
    }

    final static void e(byte param0) {
        if (param0 > -116) {
            return;
        }
        if (null != hg.field_b) {
            hg.field_b.b(-85);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Open";
    }
}
