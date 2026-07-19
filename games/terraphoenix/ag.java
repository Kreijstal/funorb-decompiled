/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static java.awt.Image field_a;
    static String field_b;

    public static void a(byte param0) {
        if (param0 < 10) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 != 8468) {
          ag.a((byte) -118);
          dh.g((byte) -124);
          qi.field_b = true;
          dj.field_d = true;
          jl.field_I.b(false);
          ta.a(jh.field_o, false, 10);
          return;
        } else {
          dh.g((byte) -124);
          qi.field_b = true;
          dj.field_d = true;
          jl.field_I.b(false);
          ta.a(jh.field_o, false, 10);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Terraphoenix.field_V;
        if (param4 != 29842) {
          ag.a((byte) -90);
          if (param1 <= param3) {
            if (param6 <= param3) {
              if (param6 <= param1) {
                ph.a(param6, param1, param7, (byte) -113, param5, param3, l.field_i, param0, param2);
                return;
              } else {
                ph.a(param1, param6, param0, (byte) -123, param5, param3, l.field_i, param7, param2);
                return;
              }
            } else {
              ph.a(param1, param3, param0, (byte) -121, param5, param6, l.field_i, param2, param7);
              return;
            }
          } else {
            if (param1 >= param6) {
              if (param3 < param6) {
                ph.a(param3, param6, param2, (byte) -111, param5, param1, l.field_i, param7, param0);
                return;
              } else {
                ph.a(param6, param3, param7, (byte) -124, param5, param1, l.field_i, param2, param0);
                return;
              }
            } else {
              ph.a(param3, param1, param2, (byte) -123, param5, param6, l.field_i, param0, param7);
              return;
            }
          }
        } else {
          if (param1 <= param3) {
            if (param6 <= param3) {
              if (param6 <= param1) {
                ph.a(param6, param1, param7, (byte) -113, param5, param3, l.field_i, param0, param2);
                return;
              } else {
                ph.a(param1, param6, param0, (byte) -123, param5, param3, l.field_i, param7, param2);
                return;
              }
            } else {
              ph.a(param1, param3, param0, (byte) -121, param5, param6, l.field_i, param2, param7);
              return;
            }
          } else {
            if (param1 >= param6) {
              if (param3 < param6) {
                ph.a(param3, param6, param2, (byte) -111, param5, param1, l.field_i, param7, param0);
                return;
              } else {
                ph.a(param6, param3, param7, (byte) -124, param5, param1, l.field_i, param2, param0);
                return;
              }
            } else {
              ph.a(param3, param1, param2, (byte) -123, param5, param6, l.field_i, param0, param7);
              return;
            }
          }
        }
    }

    static {
        field_b = "Player Name: ";
    }
}
