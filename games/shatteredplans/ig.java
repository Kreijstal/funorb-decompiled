/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String field_b;
    static s field_a;
    static int[] field_c;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 <= 87) {
          field_d = 79;
        }
    }

    final static boolean a(bc param0, int param1, bc param2, bc param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -7526) {
            return false;
          }
          if (!param0.b((byte) 114)) {
            return false;
          }
          if (!param0.a("commonui", -51)) {
            return false;
          }
          if (param2.b((byte) 113) &&
            param2.a("commonui", -116)) {
            if (param3.b((byte) 107) &&
              param3.a("button.gif", param1 + 7620)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ig.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        le.field_e.k(81);
        if (param0 != 7655) {
          return;
        }
        if (ed.field_h != null) {
          le.field_e.a(true, ed.field_h);
          return;
        }
        ed.field_h = new eo(le.field_e, tl.field_z);
        le.field_e.a(true, ed.field_h);
    }

    static {
        field_b = "Please check if address is correct";
        field_a = new s();
    }
}
