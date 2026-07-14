/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static ea[] field_a;
    static String field_b;
    static int field_c;
    static int field_d;

    final static String a(boolean param0) {
        if (!il.field_n) {
          if (pe.field_pb >= ch.field_f) {
            if (pe.field_pb >= od.field_o + ch.field_f) {
              if (param0) {
                return null;
              } else {
                field_d = -59;
                return null;
              }
            } else {
              return fa.field_c;
            }
          } else {
            if (param0) {
              return null;
            } else {
              field_d = -59;
              return null;
            }
          }
        } else {
          if (param0) {
            return null;
          } else {
            field_d = -59;
            return null;
          }
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param2 = ke.a('_', (byte) 75, param2, "");
        var4 = 123 % ((param0 - 59) / 55);
        var3 = re.a(param1, 0);
        if ((param2.indexOf(param1) ^ -1) == 0) {
          if ((param2.indexOf(var3) ^ -1) != 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Pause Menu";
    }
}
