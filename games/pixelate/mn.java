/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    int field_b;
    static String field_a;
    static bd field_c;
    int[] field_g;
    int field_d;
    static String field_f;
    static int field_e;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -26) {
            field_c = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        if (null != ((mn) this).field_g) {
          if (((mn) this).field_g.length != 0) {
            var3 = 1;
            L0: while (true) {
              if (((mn) this).field_g.length <= var3) {
                if (param1 != 27760) {
                  var5 = null;
                  String discarded$2 = mn.a(-39, (fm) null, (String) null, (String) null, (String) null);
                  return -1 + ((mn) this).field_g.length;
                } else {
                  return -1 + ((mn) this).field_g.length;
                }
              } else {
                if (param0 >= ((mn) this).field_g[var3] + ((mn) this).field_g[-1 + var3] >> 309538785) {
                  var3++;
                  continue L0;
                } else {
                  return -1 + var3;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final int a(byte param0) {
        if (param0 == 86) {
          if (((mn) this).field_g != null) {
            if (((mn) this).field_g.length == 0) {
              return 0;
            } else {
              return ((mn) this).field_g[((mn) this).field_g.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          int discarded$6 = ((mn) this).a((byte) -107);
          if (((mn) this).field_g != null) {
            if (((mn) this).field_g.length == 0) {
              return 0;
            } else {
              return ((mn) this).field_g[((mn) this).field_g.length + -1];
            }
          } else {
            return 0;
          }
        }
    }

    final static cm a(int param0, pp param1) {
        cm var2 = null;
        if (param0 != -21317) {
          field_a = null;
          var2 = new cm(param1, (fa) (Object) param1);
          bo.field_d.a(22125, (fa) (Object) var2);
          wi.field_d.a((sj) (Object) param1);
          return var2;
        } else {
          var2 = new cm(param1, (fa) (Object) param1);
          bo.field_d.a(22125, (fa) (Object) var2);
          wi.field_d.a((sj) (Object) param1);
          return var2;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        var7 = 46 / ((-78 - param2) / 35);
        if (param4 <= param0) {
          if (param4 - -param6 > param0) {
            if (param1 <= param5) {
              if (param5 >= param1 + param3) {
                return false;
              } else {
                return true;
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

    final static String a(int param0, fm param1, String param2, String param3, String param4) {
        if (!param1.b(-3)) {
          return param4;
        } else {
          if (param0 <= 43) {
            field_f = null;
            return param2 + " - " + param1.c(109, param3) + "%";
          } else {
            return param2 + " - " + param1.c(109, param3) + "%";
          }
        }
    }

    mn(int param0, int param1, int param2) {
        ((mn) this).field_b = param0;
        ((mn) this).field_d = param1;
        ((mn) this).field_g = new int[param2 - -1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = new bd();
        field_e = -1;
    }
}
