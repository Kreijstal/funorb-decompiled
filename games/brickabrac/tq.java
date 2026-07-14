/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    static boolean field_c;
    static wq field_f;
    static String field_b;
    static String field_a;
    static nc field_d;
    static String field_h;
    static String field_g;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = BrickABrac.field_J ? 1 : 0;
        if (param9 >= -51) {
          tq.a(82);
          if (param8 >= param14) {
            if (param8 >= param6) {
              if (param6 <= param14) {
                vi.a(param0, param11, param6, (byte) -111, param4, param7, param3, param2, param15, lb.field_l, param5, param12, param1, param10, param14, param8, param13);
                return;
              } else {
                vi.a(param10, param11, param14, (byte) -111, param2, param3, param7, param4, param15, lb.field_l, param13, param12, param1, param0, param6, param8, param5);
                return;
              }
            } else {
              vi.a(param10, param2, param14, (byte) -111, param11, param3, param1, param4, param13, lb.field_l, param15, param0, param7, param12, param8, param6, param5);
              return;
            }
          } else {
            if (param14 >= param6) {
              if (param6 > param8) {
                vi.a(param12, param4, param8, (byte) -111, param2, param1, param7, param11, param5, lb.field_l, param13, param10, param3, param0, param6, param14, param15);
                return;
              } else {
                vi.a(param0, param4, param6, (byte) -111, param11, param7, param1, param2, param5, lb.field_l, param15, param10, param3, param12, param8, param14, param13);
                return;
              }
            } else {
              vi.a(param12, param2, param8, (byte) -111, param4, param1, param3, param11, param13, lb.field_l, param5, param0, param7, param10, param14, param6, param15);
              return;
            }
          }
        } else {
          if (param8 >= param14) {
            if (param8 >= param6) {
              if (param6 <= param14) {
                vi.a(param0, param11, param6, (byte) -111, param4, param7, param3, param2, param15, lb.field_l, param5, param12, param1, param10, param14, param8, param13);
                return;
              } else {
                vi.a(param10, param11, param14, (byte) -111, param2, param3, param7, param4, param15, lb.field_l, param13, param12, param1, param0, param6, param8, param5);
                return;
              }
            } else {
              vi.a(param10, param2, param14, (byte) -111, param11, param3, param1, param4, param13, lb.field_l, param15, param0, param7, param12, param8, param6, param5);
              return;
            }
          } else {
            if (param14 >= param6) {
              if (param6 > param8) {
                vi.a(param12, param4, param8, (byte) -111, param2, param1, param7, param11, param5, lb.field_l, param13, param10, param3, param0, param6, param14, param15);
                return;
              } else {
                vi.a(param0, param4, param6, (byte) -111, param11, param7, param1, param2, param5, lb.field_l, param15, param10, param3, param12, param8, param14, param13);
                return;
              }
            } else {
              vi.a(param12, param2, param8, (byte) -111, param4, param1, param3, param11, param13, lb.field_l, param5, param0, param7, param10, param14, param6, param15);
              return;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 != 1024) {
          return;
        } else {
          field_a = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, ie param2, tg param3, int param4, java.awt.Component param5) {
        il.a(param2, param3, param0, param4, param0, param4 ^ 2024, param5, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new wq(256);
        field_b = "Quick Chat lobby";
        field_g = "Offensive account name";
        field_a = "Please remove <%0> from your friend list first.";
        field_e = "You need to play <%0> more rated games to unlock this option.";
    }
}
