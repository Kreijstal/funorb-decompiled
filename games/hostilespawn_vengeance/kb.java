/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb {
    static String[] field_c;
    static String field_a;
    static String field_b;
    static int field_d;

    final static void a(int param0, int param1, int param2, vh param3) {
        try {
          ac.field_a = param2;
          if (param1 <= 123) {
            field_b = (String) null;
          }
          ac.field_g = param0;
          ne.field_j = param3;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "kb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(byte param0);

    public static void c(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = 71 % ((param0 + 8) / 46);
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, vm param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          for (var7_int = param3; param4.length() > var7_int; var7_int++) {
            param5.a(param4.charAt(var7_int), param6, param1, param2);
            param6 = param6 + param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("kb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (im.field_e != null) {
          im.field_e.l(-115);
          if (null != hj.field_t) {
            hj.field_t.f((byte) -79);
          }
          if (param0 == -43) {
            ch.a((byte) 115);
            return;
          }
          return;
        }
        if (null != hj.field_t) {
          hj.field_t.f((byte) -79);
        }
        if (param0 == -43) {
          ch.a((byte) 115);
          return;
        }
    }

    final static pg a(pg param0, int[] param1, byte param2) {
        pg var3 = null;
        RuntimeException var3_ref = null;
        pg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new pg(0, 0, 0);
          var3.field_h = param0.field_h;
          var3.field_j = param0.field_j;
          var3.field_i = param0.field_i;
          var3.field_b = param0.field_b;
          if (param2 < 98) {
            field_d = 34;
          }
          var3.field_a = param0.field_a;
          var3.field_f = param0.field_f;
          var3.field_c = param0.field_c;
          var3.field_k = param1;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("kb.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, byte param1);

    static {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_a = "Blast doors and turrets are invulnerable to small arms fire, but can be destroyed with heavier weapons.";
    }
}
