/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kia {
    static String field_a;
    static String field_b;

    final static void a(byte param0) {
        String var1 = null;
        if (tla.field_c) {
          if (param0 != 63) {
            return;
          } else {
            L0: {
              if (null != hwa.field_o) {
                hwa.field_o.l((byte) -106);
                break L0;
              } else {
                break L0;
              }
            }
            var1 = mr.m((byte) -118);
            jt.field_o = new vla(var1, (String) null, true, false, false);
            klb.field_r.a(false, (shb) (Object) s.field_o);
            s.field_o.b((shb) (Object) jt.field_o, -110);
            s.field_o.e(param0 + -10394);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static im a(int param0, qfa param1, int param2, byte[] param3, int param4, boolean param5, int param6, int param7) {
        if (param6 == 21989) {
          if (!param1.field_n) {
            if (!bd.a(param2, (byte) -95)) {
              if (param1.field_g) {
                return new im(param1, 34037, param7, param2, param0, param5, param3, param4);
              } else {
                return new im(param1, param7, param2, param0, hj.a(param2, (byte) -95), hj.a(param0, (byte) -109), param3, param4);
              }
            } else {
              if (!bd.a(param0, (byte) -95)) {
                if (param1.field_g) {
                  return new im(param1, 34037, param7, param2, param0, param5, param3, param4);
                } else {
                  return new im(param1, param7, param2, param0, hj.a(param2, (byte) -95), hj.a(param0, (byte) -109), param3, param4);
                }
              } else {
                return new im(param1, 3553, param7, param2, param0, param5, param3, param4);
              }
            }
          } else {
            return new im(param1, 3553, param7, param2, param0, param5, param3, param4);
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 3553) {
            field_a = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Message game";
        field_a = "<%0> has won the round!";
    }
}
