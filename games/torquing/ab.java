/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends gf {
    static hh field_l;

    public static void e(int param0) {
        if (param0 != 64) {
            field_l = null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final String a(byte param0, String param1) {
        if (((ab) this).a(param0 ^ -19, param1) == so.field_u) {
            return oj.field_a;
        }
        if (param0 == -121) {
            return null;
        }
        return null;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        if (param0 > -85) {
          L0: {
            field_l = null;
            var2 = kp.a((byte) -87, mm.a(param1, (byte) 121));
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = kp.a((byte) -87, mm.a(param1, (byte) 121));
            if (var2 == null) {
              var2 = "";
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    ab(tk param0) {
        super(param0);
    }

    final cd a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var4 = (CharSequence) (Object) param1;
        if (!ip.a((byte) -31, var4)) {
          return so.field_u;
        } else {
          if (param0 > 62) {
            var6 = (CharSequence) (Object) param1;
            var3 = kc.a((byte) 121, var6);
            if ((var3 ^ -1) < -1) {
              if (130 < var3) {
                return so.field_u;
              } else {
                return so.field_s;
              }
            } else {
              return so.field_u;
            }
          } else {
            cd discarded$2 = ((ab) this).a(85, (String) null);
            var5 = (CharSequence) (Object) param1;
            var3 = kc.a((byte) 121, var5);
            if ((var3 ^ -1) < -1) {
              if (130 < var3) {
                return so.field_u;
              } else {
                return so.field_s;
              }
            } else {
              return so.field_u;
            }
          }
        }
    }

    final static bc a(String param0, String param1, int param2, boolean param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        var4 = 0L;
        var6 = null;
        if (param2 != 130) {
          return null;
        } else {
          L0: {
            L1: {
              if (param0.indexOf('@') != -1) {
                break L1;
              } else {
                var7 = (CharSequence) (Object) param0;
                var4 = mm.a(var7, (byte) 91);
                if (Torquing.field_u == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (Object) (Object) param0;
            break L0;
          }
          return tp.a((byte) -51, param3, param1, (String) var6, var4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new hh();
    }
}
