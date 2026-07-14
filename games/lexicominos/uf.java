/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends tj {
    static String field_o;
    static dg field_m;
    static String field_l;
    static int field_n;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Lexicominos.field_L ? 1 : 0;
        if (param9 < param6) {
          if (param15 > param6) {
            ul.a(param2, param15, param0, param9, lf.field_b, param11, param6, param10, param14, param8, param7, param12, -1464114640, param1, param5, param13, param4);
            if (param3 != -28) {
              field_n = -121;
              return;
            } else {
              return;
            }
          } else {
            if (param15 > param9) {
              ul.a(param7, param6, param13, param9, lf.field_b, param11, param15, param10, param5, param4, param2, param12, -1464114640, param1, param14, param0, param8);
              if (param3 != -28) {
                field_n = -121;
                return;
              } else {
                return;
              }
            } else {
              ul.a(param7, param6, param13, param15, lf.field_b, param2, param9, param14, param5, param1, param11, param0, -1464114640, param4, param10, param12, param8);
              if (param3 != -28) {
                field_n = -121;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param15 > param9) {
            ul.a(param2, param15, param0, param6, lf.field_b, param7, param9, param5, param14, param1, param11, param13, -1464114640, param8, param10, param12, param4);
            if (param3 == -28) {
              return;
            } else {
              field_n = -121;
              return;
            }
          } else {
            if (param6 < param15) {
              ul.a(param11, param9, param12, param6, lf.field_b, param7, param15, param5, param10, param4, param2, param13, param3 + -1464114612, param8, param14, param0, param1);
              if (param3 == -28) {
                return;
              } else {
                field_n = -121;
                return;
              }
            } else {
              ul.a(param11, param9, param12, param15, lf.field_b, param2, param6, param14, param10, param8, param7, param0, param3 + -1464114612, param4, param5, param13, param1);
              if (param3 != -28) {
                field_n = -121;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_l = null;
        field_o = null;
        if (param0) {
            return;
        }
        field_m = null;
    }

    final String a(byte param0, String param1) {
        if (((uf) this).a(param0 ^ -126, param1) == ni.field_b) {
            return ok.field_d;
        }
        if (param0 == -126) {
            return null;
        }
        return null;
    }

    uf(rl param0) {
        super(param0);
    }

    final sc a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (param0 == 0) {
          var6 = (CharSequence) (Object) param1;
          if (bc.a(false, var6)) {
            var7 = (CharSequence) (Object) param1;
            var3 = si.a((byte) 123, var7);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return ni.field_b;
              } else {
                return rh.field_p;
              }
            } else {
              return ni.field_b;
            }
          } else {
            return ni.field_b;
          }
        } else {
          field_m = null;
          var4 = (CharSequence) (Object) param1;
          if (bc.a(false, var4)) {
            var5 = (CharSequence) (Object) param1;
            var3 = si.a((byte) 123, var5);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return ni.field_b;
              } else {
                return rh.field_p;
              }
            } else {
              return ni.field_b;
            }
          } else {
            return ni.field_b;
          }
        }
    }

    final static void a(String param0, int param1, String param2, boolean param3) {
        dd.field_d = param0;
        rf.field_b = param2;
        m.a(ca.field_o, -118, param3);
        int var4 = -15 % ((param1 - 43) / 40);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Age:";
        field_l = "This password contains your Player Name, and would be easy to guess";
        field_n = -1;
    }
}
