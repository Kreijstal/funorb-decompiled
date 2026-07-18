/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static wk[] field_a;
    static String field_c;
    static int field_g;
    static String field_f;
    static String field_h;
    static String[] field_e;
    static String field_d;
    static String field_b;

    public static void a(int param0) {
        if (param0 != -3) {
          field_b = null;
          field_h = null;
          field_c = null;
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_h = null;
          field_c = null;
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
            String discarded$0 = db.a(false, '!');
            return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (sm.field_d >= param4) {
          if (param2 >= sm.field_d) {
            if (ko.field_b >= param1) {
              if (ko.field_b <= param0) {
                var5 = param2 + param4 >> 1;
                var6 = param0 + param1 >> 1;
                var7 = -param4 + param2 >> 1;
                var8 = -param1 + param0 >> 1;
                if (var8 < var7) {
                  L0: {
                    if (Math.abs(var5 + -sm.field_d) + Math.abs(var6 + -ko.field_b) * var7 / var8 > var7) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L0;
                    }
                  }
                  return stackIn_13_0 != 0;
                } else {
                  if (Math.abs(var6 - ko.field_b) - -(Math.abs(var5 - sm.field_d) * var8 / var7) > var8) {
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static hl a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        hl stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (null != bk.field_a) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              var2 = k.a(var6, false);
              if (var2 != null) {
                break L0;
              } else {
                var2 = param0;
                break L0;
              }
            }
            L1: {
              var3 = (hl) (Object) bk.field_a.a((byte) -27, (long)var2.hashCode());
              if (param1 <= -40) {
                break L1;
              } else {
                db.a(-88);
                break L1;
              }
            }
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var7 = (CharSequence) (Object) var3.field_Mb;
                  var4 = k.a(var7, false);
                  if (var4 != null) {
                    break L3;
                  } else {
                    var4 = var3.field_Mb;
                    break L3;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (hl) (Object) bk.field_a.d(-348);
                  continue L2;
                } else {
                  stackOut_13_0 = (hl) var3;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (hl) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2_ref;
            stackOut_17_1 = new StringBuilder().append("db.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
            return -83;
        }
        return param1 + (so.field_b.field_a - rs.field_k >> 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_h = "Offer rematch";
        field_g = 20;
        field_d = "AnimateBattle";
    }
}
