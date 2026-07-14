/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static nc field_a;
    static String[] field_c;
    static o[] field_b;
    static String field_d;

    final static Object a(byte[] param0, byte param1, boolean param2) {
        f var3 = null;
        if (param1 == 7) {
          if (param0 != null) {
            if (param0.length <= 136) {
              if (param2) {
                return (Object) (Object) na.a(123, param0);
              } else {
                return (Object) (Object) param0;
              }
            } else {
              var3 = new f();
              ((rk) (Object) var3).a(0, param0);
              return (Object) (Object) var3;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 53) {
            field_c = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = SolKnight.field_L ? 1 : 0;
        if (param0 < param13) {
          if (param13 >= param15) {
            if (param0 >= param15) {
              hf.a(param1, param2, param8, param12, param15, param7, 1517200784, param3, param13, param9, param4, param10, mi.field_f, param5, param14, param11, param0);
              if (param6 > -13) {
                w.a((byte) 9);
                return;
              } else {
                return;
              }
            } else {
              hf.a(param9, param5, param7, param12, param0, param8, 1517200784, param14, param13, param1, param4, param10, mi.field_f, param2, param3, param11, param15);
              if (param6 > -13) {
                w.a((byte) 9);
                return;
              } else {
                return;
              }
            }
          } else {
            hf.a(param9, param5, param7, param8, param0, param12, 1517200784, param11, param15, param4, param1, param2, mi.field_f, param10, param3, param14, param13);
            if (param6 > -13) {
              w.a((byte) 9);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param15 <= param0) {
            if (param13 < param15) {
              hf.a(param4, param10, param12, param7, param13, param8, 1517200784, param14, param0, param1, param9, param5, mi.field_f, param2, param11, param3, param15);
              if (param6 <= -13) {
                return;
              } else {
                w.a((byte) 9);
                return;
              }
            } else {
              hf.a(param1, param2, param8, param7, param15, param12, 1517200784, param11, param0, param4, param9, param5, mi.field_f, param10, param14, param3, param13);
              if (param6 <= -13) {
                return;
              } else {
                w.a((byte) 9);
                return;
              }
            }
          } else {
            hf.a(param4, param10, param12, param8, param13, param7, 1517200784, param3, param15, param9, param1, param2, mi.field_f, param5, param11, param14, param0);
            if (param6 > -13) {
              w.a((byte) 9);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nc();
        field_c = new String[16];
        field_d = "VICTORY<br>BONUS";
    }
}
