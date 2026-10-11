/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static fc field_a;
    static String field_c;
    static String field_b;

    final static void a(boolean param0) {
        if (!param0) {
          field_b = (String) null;
          mg.field_N = new nj();
          return;
        }
        mg.field_N = new nj();
    }

    final static String a(boolean param0, String param1, r param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.b(0)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          if (!param0) {
            stackIn_8_0 = param4 + " - " + param2.b(param3, 100) + "%";
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("en.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -6) {
            en.a(25);
          }
          stackIn_3_0 = po.field_e.a("", param1, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("en.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 4096) {
          return;
        }
        field_b = null;
    }

    final static String a(String param0, byte param1, String param2, int param3) {
        RuntimeException var4 = null;
        mi var5 = null;
        int var6 = 0;
        int var7 = 0;
        tp var8 = null;
        CharSequence var9 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param0);
          if (!hi.a((byte) 126, var9)) {
            stackIn_3_0 = or.field_a;
            return stackIn_3_0;
          }
          if (ba.field_d != 2) {
            stackIn_7_0 = t.field_n;
            return stackIn_7_0;
          }
          var8 = or.a(90, param2);
          if (var8 == null) {
            stackIn_11_0 = Vertigo2.a(new String[]{param2}, jp.field_R, -114);
            return stackIn_11_0;
          }
          var8.c(2);
          var8.a(-124);
          vd.field_a = vd.field_a - 1;
          var6 = 97 % ((param1 + 39) / 55);
          var5 = uh.field_Wb;
          var5.j(param3, 120);
          var5.field_u = var5.field_u + 1;
          var7 = var5.field_u;
          var5.f(3, 81);
          var5.a((byte) 0, param0);
          var5.b((byte) -96, -var7 + var5.field_u);
          stackIn_13_0 = null;
          return (String) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("en.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "Accept rematch";
        field_a = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_b = "<col=ee9d32>Multiplayer</col>";
    }
}
