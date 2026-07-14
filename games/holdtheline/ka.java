/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static String field_a;
    static hj field_f;
    static int field_g;
    static boolean field_d;
    static qj field_b;
    static String field_e;
    static long field_c;

    final static int a(byte param0, String param1) {
        int var2 = 0;
        CharSequence var3 = null;
        var2 = 3 % ((-74 - param0) / 40);
        if (param1.equalsIgnoreCase("auto")) {
          return -1;
        } else {
          var3 = (CharSequence) (Object) param1;
          return mo.a(var3, (byte) -116);
        }
    }

    final static float a(int param0, int param1, qm param2, wd[] param3) {
        int var4 = 21 % ((param1 - 4) / 58);
        return hi.a(param3.length, 0.0f, 1, param3, -24659, param2, param0);
    }

    final static void a(int param0) {
        uk.b(-114);
        ci.field_o = true;
        fi.field_nb = true;
        field_b.a(false);
        if (param0 != -1) {
          field_e = null;
          da.a(false, we.field_t, 22676);
          return;
        } else {
          da.a(false, we.field_t, 22676);
          return;
        }
    }

    final static int a(int param0, String param1) {
        if (!param1.equals((Object) (Object) "<")) {
          if (!param1.equals((Object) (Object) "==")) {
            if (!param1.equals((Object) (Object) ">")) {
              if (param0 == 5) {
                if (param1.equals((Object) (Object) "<=")) {
                  return 3;
                } else {
                  if (param1.equals((Object) (Object) ">=")) {
                    return 6;
                  } else {
                    if (param1.equals((Object) (Object) "!=")) {
                      return 5;
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                }
              } else {
                field_d = false;
                if (param1.equals((Object) (Object) "<=")) {
                  return 3;
                } else {
                  if (param1.equals((Object) (Object) ">=")) {
                    return 6;
                  } else {
                    if (param1.equals((Object) (Object) "!=")) {
                      return 5;
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                }
              }
            } else {
              return 4;
            }
          } else {
            return 2;
          }
        } else {
          return 1;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        if (param0 != 5) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        var3 = hc.a(param2, (byte) 30);
        if (param1 >= 97) {
          if (param0.indexOf(param2) == -1) {
            if (param0.indexOf(var3) == -1) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var4 = null;
          float discarded$4 = ka.a(82, -43, (qm) null, (wd[]) null);
          if (param0.indexOf(param2) == -1) {
            if (param0.indexOf(var3) == -1) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_a = "<img=13>";
        field_e = "End Game";
    }
}
