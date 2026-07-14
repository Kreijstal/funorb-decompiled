/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -10) {
          field_c = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        sa var3 = null;
        if (param2 != null) {
          if (param2.length > param0) {
            var3 = new sa();
            ((i) (Object) var3).a(param2, (byte) -122);
            return (Object) (Object) var3;
          } else {
            if (!param1) {
              return (Object) (Object) param2;
            } else {
              return (Object) (Object) cl.a(0, param2);
            }
          }
        } else {
          return null;
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          var4 = param3;
          if (param1) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2) {
          L1: {
            var4 += 2;
            if (param0) {
              var4++;
              break L1;
            } else {
              break L1;
            }
          }
          return td.field_c[var4];
        } else {
          L2: {
            if (param0) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return td.field_c[var4];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fullscreen";
        field_c = "to over <%0> great games";
        field_d = "Sound Off";
        field_b = "More suggestions";
    }
}
