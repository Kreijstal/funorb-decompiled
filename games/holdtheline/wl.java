/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static String[] field_a;
    static String field_d;
    static String field_b;
    static String field_e;
    static int field_c;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        if (param2 != 102) {
          field_a = null;
          if (param0 >= param7) {
            if (param5 <= param0) {
              if (param7 >= param5) {
                qe.a(param6, param5, param0, param3, tc.field_b, false, param4, param7, param1);
                return;
              } else {
                qe.a(param4, param7, param0, param3, tc.field_b, false, param6, param5, param1);
                return;
              }
            } else {
              qe.a(param3, param7, param5, param4, tc.field_b, false, param6, param0, param1);
              return;
            }
          } else {
            if (param7 >= param5) {
              if (param0 < param5) {
                qe.a(param4, param0, param7, param6, tc.field_b, false, param3, param5, param1);
                return;
              } else {
                qe.a(param3, param5, param7, param6, tc.field_b, false, param4, param0, param1);
                return;
              }
            } else {
              qe.a(param6, param0, param5, param4, tc.field_b, false, param3, param7, param1);
              return;
            }
          }
        } else {
          if (param0 >= param7) {
            if (param5 <= param0) {
              if (param7 >= param5) {
                qe.a(param6, param5, param0, param3, tc.field_b, false, param4, param7, param1);
                return;
              } else {
                qe.a(param4, param7, param0, param3, tc.field_b, false, param6, param5, param1);
                return;
              }
            } else {
              qe.a(param3, param7, param5, param4, tc.field_b, false, param6, param0, param1);
              return;
            }
          } else {
            if (param7 >= param5) {
              if (param0 < param5) {
                qe.a(param4, param0, param7, param6, tc.field_b, false, param3, param5, param1);
                return;
              } else {
                qe.a(param3, param5, param7, param6, tc.field_b, false, param4, param0, param1);
                return;
              }
            } else {
              qe.a(param6, param0, param5, param4, tc.field_b, false, param3, param7, param1);
              return;
            }
          }
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        if (!param0.equals((Object) (Object) "B")) {
          if (!param0.equals((Object) (Object) "I")) {
            if (!param0.equals((Object) (Object) "S")) {
              if (!param0.equals((Object) (Object) "J")) {
                if (param0.equals((Object) (Object) "Z")) {
                  return Boolean.TYPE;
                } else {
                  if (!param0.equals((Object) (Object) "F")) {
                    if (!param0.equals((Object) (Object) "D")) {
                      if (param0.equals((Object) (Object) "C")) {
                        return Character.TYPE;
                      } else {
                        if (param1 < 8) {
                          return null;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    } else {
                      return Double.TYPE;
                    }
                  } else {
                    return Float.TYPE;
                  }
                }
              } else {
                return Long.TYPE;
              }
            } else {
              return Short.TYPE;
            }
          } else {
            return Integer.TYPE;
          }
        } else {
          return Byte.TYPE;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = 15 / ((param0 - -86) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_d = "to return to the normal view.";
        field_e = "Shield";
        field_b = "Loading fonts";
        field_c = 0;
    }
}
