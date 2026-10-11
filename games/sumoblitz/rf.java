/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends Exception {
    static ts field_e;
    static String[] field_b;
    static String field_c;
    static dg field_a;
    static int field_d;

    public rf() {
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return mi.field_a == 1 ? true : false;
        }
        field_b = (String[]) null;
        return mi.field_a == 1 ? true : false;
    }

    public static void a(int param0) {
        if (param0 == 1) {
          field_a = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = (String) null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static g a(String param0, int param1, boolean param2) {
        nw var3 = null;
        RuntimeException var3_ref = null;
        nw stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new nw();
          if (!param2) {
            field_b = (String[]) null;
          }
          ((g) ((Object) var3)).field_b = param0;
          ((g) ((Object) var3)).field_d = param1;
          stackIn_3_0 = var3;
          return (g) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("rf.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = new ts(8, 0, 4, 1);
        field_c = "Menu";
        field_b = new String[255];
    }
}
