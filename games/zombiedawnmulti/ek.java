/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ek extends ff {
    int field_D;
    int field_C;
    static String field_y;
    int field_E;
    static ja field_J;
    static cj field_z;
    int field_x;
    int field_G;
    static String field_I;
    int field_B;
    static tq field_H;
    static long field_K;
    static String field_F;
    rl field_A;

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, int param6) {
        hf var7 = null;
        RuntimeException var7_ref = null;
        hf var8 = null;
        int var9 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = -51 % ((param3 + 75) / 50);
          var7 = new hf(param5);
          var8 = new hf(param2);
          stackIn_1_0 = mg.a(param0, var7, param6, var8, param4, param1, (byte) -92);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("ek.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_J = null;
        field_F = null;
        if (param0 < -63) {
          field_z = null;
          field_I = null;
          field_y = null;
          field_H = null;
          return;
        }
        field_K = -50L;
        field_z = null;
        field_I = null;
        field_y = null;
        field_H = null;
    }

    final void d(byte param0) {
        int var4 = 0;
        int var2 = this.field_G >> 24;
        int var3 = this.field_E >> 24;
        int var4Lifetime1;
        int var4Lifetime2;
        if (var2 != this.field_C) {
          this.field_C = var2;
          this.field_B = var3;
          this.field_A.a(-44, this);
          var4 = -126 % ((-59 - param0) / 46);
          return;
        }
        if (var3 == this.field_B) {
          var4Lifetime1 = -126 % ((-59 - param0) / 46);
          return;
        }
        this.field_C = var2;
        this.field_B = var3;
        this.field_A.a(-44, this);
        var4Lifetime2 = -126 % ((-59 - param0) / 46);
    }

    abstract void h(int param0);

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        me.field_h = param4;
        if (param2 == 1829947600) {
          nc.field_h = param0;
          se.field_C = param1;
          bf.field_g = param3;
          return;
        }
        field_z = (cj) null;
        nc.field_h = param0;
        se.field_C = param1;
        bf.field_g = param3;
    }

    final int g(int param0) {
        if (param0 == 1829947600) {
          return this.field_E >> 16;
        }
        String var3 = (String) null;
        ek.a(false, -35, (String) null, -111, (String) null, (String) null, -17);
        return this.field_E >> 16;
    }

    final static void i(int param0) {
        q.field_a = null;
        aa.field_n = null;
        ik.field_a = null;
        if (param0 >= 45) {
          bq.field_c = false;
          ud.field_N = null;
          return;
        }
        String var2 = (String) null;
        ek.a(false, 8, (String) null, -49, (String) null, (String) null, -19);
        bq.field_c = false;
        ud.field_N = null;
    }

    void a(int param0, rl param1) {
        try {
          this.field_A = param1;
          this.d((byte) -105);
          if (param0 != -9019) {
            field_J = (ja) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ek.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int e(byte param0) {
        if (param0 != -112) {
          ek.i(98);
          return this.field_G >> 16;
        }
        return this.field_G >> 16;
    }

    ek(int param0, int param1, int param2) {
        this.field_C = -1;
        this.field_G = param0 << 16;
        this.field_B = -1;
        this.field_D = param2;
        this.field_E = param1 << 16;
    }

    static {
        field_y = "<%0> would need a rating of <%1> to play with the current options.";
        field_I = "You have withdrawn your request to join.";
        field_F = "Speed";
    }
}
