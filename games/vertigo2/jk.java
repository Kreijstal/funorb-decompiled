/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_c;
    static id field_b;
    static String field_a;

    final static String a(int param0, String param1) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = nf.a(106, uh.field_oc, fn.field_z);
          if (1 == var2) {
            param1 = "<img=0>" + param1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 15709) {
          L1: {
            var3 = null;
            String discarded$6 = jk.a(-43, (String) null);
            if (var2 == 2) {
              param1 = "<img=1>" + param1;
              break L1;
            } else {
              break L1;
            }
          }
          return param1;
        } else {
          L2: {
            if (var2 == 2) {
              param1 = "<img=1>" + param1;
              break L2;
            } else {
              break L2;
            }
          }
          return param1;
        }
    }

    final static void a(int param0, int param1) {
        if (jo.field_h == null) {
          jo.field_h = new int[param1];
          if (param0 == 2) {
            return;
          } else {
            field_b = null;
            return;
          }
        } else {
          if (jo.field_h.length >= param1) {
            if (param0 != 2) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            jo.field_h = new int[param1];
            if (param0 == 2) {
              return;
            } else {
              field_b = null;
              return;
            }
          }
        }
    }

    final static void a(int param0, byte param1, ub param2) {
        Object var4 = null;
        ob.field_Q.a((li) (Object) param2, false);
        if (param1 != 44) {
          var4 = null;
          jk.a(-25, (byte) -73, (ub) null);
          he.a(param0, param2, param1 ^ -27055);
          return;
        } else {
          he.a(param0, param2, param1 ^ -27055);
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != 2) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Type your password again to make sure it's correct";
        field_a = "Only show lobby chat from my friends";
    }
}
