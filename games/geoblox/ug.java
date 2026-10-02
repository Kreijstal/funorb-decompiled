/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static int field_c;
    static vg field_a;
    static String field_b;

    final static StringBuilder a(StringBuilder param0, byte param1, char param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        String var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.field_C;
        try {
          if (param1 >= -125) {
            var7 = (String) null;
            ug.a((String) null, (rh) null, (byte) 14, (String) null);
          }
          var4_int = param0.length();
          param0.setLength(param3);
          for (var5 = var4_int; param3 > var5; var5++) {
            param0.setCharAt(var5, param2);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var4);

          stackIn_10_1 = new StringBuilder().append("ug.D(");

          if (param0 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        me var5 = (me) ((Object) ue.field_f.e(1));
        if (!(var5 != null)) {
            el.field_o.a((byte) 127, param0);
            return;
        }
        var5.field_k = 0.0f;
        var5.field_f = param0;
        var5.field_m = Integer.toString(param0);
        var5.field_n = (float)param4;
        var5.field_h = param3;
        if (param1) {
            var5.field_i = (float)param2;
            md.field_a.a(-95, var5);
            return;
        }
        field_b = (String) null;
        var5.field_i = (float)param2;
        md.field_a.a(-95, var5);
    }

    final static dm a(String param0, rh param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dm stackIn_2_0 = null;
        dm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a((byte) 127, param3);
          var5 = param1.a(param0, -57, var4_int);
          if (param2 == -78) {
            stackIn_4_0 = qc.a(var4_int, param2 ^ -95, var5, param1);
            return stackIn_4_0;
          } else {
            stackIn_2_0 = (dm) null;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var4);

          stackIn_7_1 = new StringBuilder().append("ug.C(");

          if (param0 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }


          stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 9144) {
            String var2 = (String) null;
            ug.a((String) null, (rh) null, (byte) 53, (String) null);
        }
    }

    static {
        field_b = "Email (Login):";
    }
}
