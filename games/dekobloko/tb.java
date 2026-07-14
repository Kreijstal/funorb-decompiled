/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static nm field_b;
    static w field_c;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param5 > param0) {
          if (param1 > param5) {
            ib.a(param2, param5, param7, param1, param3, (byte) 117, param4, param0, hk.field_l);
            if (param6 <= 8) {
              field_c = null;
              return;
            } else {
              return;
            }
          } else {
            if (param0 >= param1) {
              ib.a(param7, param0, param4, param5, param3, (byte) 117, param2, param1, hk.field_l);
              if (param6 <= 8) {
                field_c = null;
                return;
              } else {
                return;
              }
            } else {
              ib.a(param2, param1, param4, param5, param3, (byte) 117, param7, param0, hk.field_l);
              if (param6 <= 8) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param0 < param1) {
            ib.a(param4, param0, param7, param1, param3, (byte) 117, param2, param5, hk.field_l);
            if (param6 > 8) {
              return;
            } else {
              field_c = null;
              return;
            }
          } else {
            if (param1 <= param5) {
              ib.a(param7, param5, param2, param0, param3, (byte) 117, param4, param1, hk.field_l);
              if (param6 > 8) {
                return;
              } else {
                field_c = null;
                return;
              }
            } else {
              ib.a(param4, param1, param2, param0, param3, (byte) 117, param7, param5, hk.field_l);
              if (param6 <= 8) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        af.field_f = param0;
        kk.field_e = param2;
        if (param1 != -25073) {
            tb.a(-106, -58, 44, 19, 93, -115, 108, -54);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0, ck param1) {
        uh.a(-9074);
        hk.a(param1.field_D, param1.field_K, param1.field_C);
        if (!param0) {
            tb.a(60, 93, -89);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 20908) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "NEW THEME<br>UNLOCKED!";
    }
}
