/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_b;
    static String field_a;
    static String field_c;

    final static tl a(String param0, byte param1, int param2) {
        q var3 = null;
        RuntimeException var3_ref = null;
        q stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new q();
          if (param1 != 40) {
            field_b = (String) null;
          }
          ((tl) ((Object) var3)).field_d = param2;
          ((tl) ((Object) var3)).field_c = param0;
          stackIn_3_0 = var3;
          return (tl) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("nc.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static nk a(int param0, int param1, String param2) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        nk stackIn_2_0 = null;
        nk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new nk(false);
          var3.field_g = param0;
          var3.field_d = param2;
          if (param1 == 0) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (nk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("nc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          if (param2 < 99) {
            return false;
          }
          if (!re.a(param0, -102, param1)) {
            return false;
          }
          for (var3_int = 0; param1.length() > var3_int; var3_int++) {
            if (!fd.a(true, param1.charAt(var3_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("nc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        String var2 = (String) null;
        nc.a(14, -121, (String) null);
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_b = "Loading fonts";
        field_a = "You have <%0> unread messages!";
        field_c = "Updates will sent to the email address you've given";
    }
}
