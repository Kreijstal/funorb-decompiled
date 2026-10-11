/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ia extends v implements fd {
    static String field_i;
    private jf field_k;
    static String field_j;
    static String field_m;
    static String field_h;
    static int field_l;

    final vd b(int param0) {
        if (param0 == -31992) {
          return this.a(this.field_k.field_y, -1);
        }
        this.b(-105);
        return this.a(this.field_k.field_y, -1);
    }

    public static void c(byte param0) {
        field_m = null;
        field_j = null;
        if (param0 >= 85) {
          field_h = null;
          field_i = null;
          return;
        }
        sk var2 = (sk) null;
        ia.a(55, (sk) null);
        field_h = null;
        field_i = null;
    }

    public final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        if (null == this.field_k.field_y) {
          return true;
        }
        if (this.field_k.field_y.length() != 0) {
          return false;
        }
        return true;
    }

    public final void a(boolean param0, jf param1) {
        try {
          if (!param0) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ia.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ak param0, ak param1, ak param2, BitmapFont param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, BitmapFont param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          if (param11 != -1) {
            return;
          }
          re.field_ib = param3;
          a.field_a = param18;
          rj.a(param14, param19, param7, param12, (byte) -89);
          mj.a(param1, param10, param16, -89);
          en.a((byte) -55, param2, param15, param4, param0, param5);
          of.a(param9, param6, 11);
          dk.a(-92, param17, param13, param8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("ia.Q(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param19).append(')').toString());
        }
    }

    abstract String a(int param0, String param1);

    ia(jf param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static pc a(int param0, sk param1) {
        RuntimeException var2 = null;
        pc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 6940) {
            field_j = (String) null;
          }
          stackIn_3_0 = on.a(em.a(param1, 100, 96), -48);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ia.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    abstract vd a(String param0, int param1);

    final String b(byte param0) {
        if (param0 != -42) {
          return (String) null;
        }
        return this.a(100, this.field_k.field_y);
    }

    public final void a(jf param0, byte param1) {
        if (param1 != 89) {
          return;
        }
        try {
          this.a(-17382);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ia.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = "<%0> is not a member, and cannot play with the current options.";
        field_m = "Hide players in <%0>'s game";
        field_j = "Members' Benefits";
        field_h = "Invalid password.";
    }
}
