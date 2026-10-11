/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_e;
    static mb field_d;
    static int field_c;
    static String field_a;
    static String field_b;

    final static Boolean a(int param0) {
        Boolean var1 = null;
        Boolean var1Lifetime1;
        if (param0 != -23387) {
          gg.a(73);
          var1 = ja.field_f;
          ja.field_f = null;
          return var1;
        }
        var1Lifetime1 = ja.field_f;
        ja.field_f = null;
        return var1Lifetime1;
    }

    final static fb a(fq param0, byte param1, f param2, f[][] param3) {
        fb stackIn_2_0 = null;
        nl stackIn_6_0 = null;
        qo stackIn_9_0 = null;
        uo stackIn_12_0 = null;
        jk stackIn_16_0 = null;
        em stackIn_18_0 = null;
        el stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 <= 115) {
            stackIn_2_0 = (fb) null;
            return stackIn_2_0;
          }
          if (param2 instanceof qf) {
            vl.field_f.a(128, 12 * param0.field_A + param0.field_o * param0.field_m, 12 * param0.field_t + param0.field_s * param0.field_m, 0, (byte) -111);
            stackIn_20_0 = new el(param0, 20);
            return (fb) ((Object) stackIn_20_0);
          }
          if (param2 instanceof de) {
            stackIn_6_0 = new nl(param0, param3);
            return (fb) ((Object) stackIn_6_0);
          }
          if (param2 instanceof mi) {
            tl.field_a.a(128, param0.field_m * param0.field_o + 12 * param0.field_A, param0.field_m * param0.field_s + param0.field_t * 12, 0, (byte) -111);
            stackIn_9_0 = new qo(param0, (mi) (param2));
            return (fb) ((Object) stackIn_9_0);
          }
          if (param2 instanceof ig) {
            jo.field_p.a(128, 12 * param0.field_A + param0.field_m * param0.field_o, param0.field_t * 12 + param0.field_m * param0.field_s, 0, (byte) -111);
            stackIn_12_0 = new uo(param0);
            return (fb) ((Object) stackIn_12_0);
          }
          if (!(param2 instanceof cd) &&
            !(param2 instanceof gh)) {
            ec.field_k.a(128, param0.field_m * param0.field_o + param0.field_A * 12, param0.field_s * param0.field_m + 12 * param0.field_t, 0, (byte) -111);
            stackIn_16_0 = new jk(param0);
            return (fb) ((Object) stackIn_16_0);
          }
          sa.field_mb.a(128, param0.field_o * param0.field_m + param0.field_A * 12, param0.field_s * param0.field_m + param0.field_t * 12, 0, (byte) -111);
          stackIn_18_0 = new em(param0);
          return (fb) ((Object) stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("gg.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static int a(boolean param0, byte param1, int param2, String param3, int param4, String param5, String param6) {
        rh var7 = null;
        RuntimeException var7_ref = null;
        rh var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 119) {
            stackIn_2_0 = -2;
            return stackIn_2_0;
          }
          var7 = new rh(param5);
          var8 = new rh(param3);
          stackIn_4_0 = ai.a(var7, param0, param6, param2, var8, (byte) 92, param4);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("gg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 > -104) {
          gg.a((fq) null, (byte) -7, (f) null, (f[][]) null);
        }
    }

    static {
        field_e = "This is a laser beam.<br>Do you wish to pass?<br>You may be able to block<br>it with something.";
        field_c = 0;
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new mb("email");
        field_b = "Connection lost - attempting to reconnect";
    }
}
