/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nta implements fo {
    private int field_g;
    static String field_e;
    private int field_a;
    private bua field_f;
    private int field_i;
    static String[] field_b;
    private int field_c;
    static int field_d;
    private int field_j;
    static int field_h;

    final void a(byte param0, uw param1, int param2) {
        if (param1 == null) {
          return;
        }
        try {
          param1.a((byte) -100, 2, (fo) (this));
          int var4_int = 5 / ((-52 - param0) / 57);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nta.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          field_e = (String) null;
          return this.field_g;
        }
        return this.field_g;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -25821) {
          return;
        }
        field_b = null;
    }

    public final void f(int param0) {
        if (this.field_a > 0) {
          this.field_a = this.field_a - 1;
        }
        this.field_f.a(0);
        if (param0 == -4366) {
          return;
        }
        field_d = -24;
    }

    public final void a(int param0, iq param1) {
        ka var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_f.b((byte) 74);
          gqa.a(this.field_c, -83584144, this.c((byte) 106), this.b((byte) 90), var3, this.e((byte) -106));
          if (param0 >= 103) {
            return;
          }
          this.field_j = -39;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("nta.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
          this.f(-64);
          return this.field_i;
        }
        return this.field_i;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          field_b = (String[]) null;
          if (this.field_a != 0) {
            return false;
          }
          return true;
        }
        if (this.field_a != 0) {
          return false;
        }
        return true;
    }

    public final int b(byte param0) {
        int var2 = -32 % ((-23 - param0) / 53);
        return this.field_j;
    }

    nta(int param0, int param1, int param2, bua param3, int param4, int param5) {
        try {
          this.field_a = param5;
          this.field_j = param0;
          this.field_c = param4;
          this.field_i = param1;
          this.field_g = param2;
          this.field_f = param3;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nta.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_b = new String[]{"<%0> went squish", "<%0> was smushed", "<%0> became two-dimensional", "<%0> was pulverised", "<%0> got stuck between a rock and a hard place", "<%0> couldn't take the pressure", "<%0> felt the squeeze", "<%0> always wanted to be thinner"};
        field_e = "The invitation has been withdrawn.";
        field_h = -2073743619;
    }
}
