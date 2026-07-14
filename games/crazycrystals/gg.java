/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_e;
    static mb field_d;
    static int field_c;
    static String field_a;
    static String field_b;

    final static Boolean a(int param0) {
        Boolean var1 = null;
        if (param0 != -23387) {
            Boolean discarded$0 = gg.a(73);
            var1 = ja.field_f;
            ja.field_f = null;
            return var1;
        }
        var1 = ja.field_f;
        ja.field_f = null;
        return var1;
    }

    final static fb a(fq param0, byte param1, f param2, f[][] param3) {
        if (param1 > 115) {
          if (!(param2 instanceof qf)) {
            if (!(param2 instanceof de)) {
              if (!(param2 instanceof mi)) {
                if (!(param2 instanceof ig)) {
                  if (!(param2 instanceof cd)) {
                    if (param2 instanceof gh) {
                      sa.field_mb.a(128, param0.field_o * param0.field_m + param0.field_A * 12, param0.field_s * param0.field_m + param0.field_t * 12, 0, (byte) -111);
                      return (fb) (Object) new em(param0);
                    } else {
                      ec.field_k.a(128, param0.field_m * param0.field_o + param0.field_A * 12, param0.field_s * param0.field_m + 12 * param0.field_t, 0, (byte) -111);
                      return (fb) (Object) new jk(param0);
                    }
                  } else {
                    sa.field_mb.a(128, param0.field_o * param0.field_m + param0.field_A * 12, param0.field_s * param0.field_m + param0.field_t * 12, 0, (byte) -111);
                    return (fb) (Object) new em(param0);
                  }
                } else {
                  jo.field_p.a(128, 12 * param0.field_A - -(param0.field_m * param0.field_o), param0.field_t * 12 + param0.field_m * param0.field_s, 0, (byte) -111);
                  return (fb) (Object) new uo(param0);
                }
              } else {
                tl.field_a.a(128, param0.field_m * param0.field_o + 12 * param0.field_A, param0.field_m * param0.field_s + param0.field_t * 12, 0, (byte) -111);
                return (fb) (Object) new qo(param0, (mi) (Object) param2);
              }
            } else {
              return (fb) (Object) new nl(param0, param3);
            }
          } else {
            vl.field_f.a(128, 12 * param0.field_A + param0.field_o * param0.field_m, 12 * param0.field_t - -(param0.field_s * param0.field_m), 0, (byte) -111);
            return (fb) (Object) new el(param0, 20);
          }
        } else {
          return null;
        }
    }

    final static int a(boolean param0, byte param1, int param2, String param3, int param4, String param5, String param6) {
        rh var7 = null;
        rh var8 = null;
        if (param1 < 119) {
          return -2;
        } else {
          var7 = new rh(param5);
          var8 = new rh(param3);
          return ai.a(var7, param0, param6, param2, var8, (byte) 92, param4);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 > -104) {
            fb discarded$0 = gg.a((fq) null, (byte) -7, (f) null, (f[][]) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This is a laser beam.<br>Do you wish to pass?<br>You may be able to block<br>it with something.";
        field_c = 0;
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new mb("email");
        field_b = "Connection lost - attempting to reconnect";
    }
}
