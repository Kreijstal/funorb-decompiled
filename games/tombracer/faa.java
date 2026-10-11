/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa implements fo {
    static String field_g;
    int field_e;
    int field_b;
    vsa field_c;
    int field_d;
    bua field_f;
    int field_a;

    public final void f(int param0) {
        if (param0 != -4366) {
          this.field_a = 43;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 67) {
            faa.a(true);
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = jd.a(1, var5);
          var6 = (CharSequence) ((Object) param2);
          var4 = jd.a(1, var6);
          if (var3 == null &&
            var4 == null) {
            return true;
          }
          if (var3 == null) {
            return false;
          }
          if (var4 == null) {
            return false;
          }
          stackIn_13_0 = var3.equals(var4);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("faa.B(");
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
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final int b(byte param0) {
        int var3 = 0;
        int var2 = 3 % ((param0 + 23) / 53);
        if (this.field_b == 0) {
          var3 = 0;
        } else {
          var3 = this.field_c.o((byte) 122);
        }
        return var3 + (this.field_c.b((byte) -86) + this.field_d);
    }

    public static void a(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          faa.a((String) null, -123, (String) null);
          field_g = null;
          return;
        }
        field_g = null;
    }

    public final int c(byte param0) {
        int var2 = 0;
        if (this.field_b == 0) {
          var2 = 0;
        } else {
          var2 = this.field_c.p((byte) 68);
        }
        if (param0 >= 91) {
          return this.field_c.c((byte) 124) + this.field_a + var2;
        }
        return 78;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          field_g = (String) null;
          return this.field_c.d((byte) 48);
        }
        return this.field_c.d((byte) 48);
    }

    public final int e(byte param0) {
        if (param0 > -86) {
          faa.a(true);
          if (this.field_b != 0) {
            return this.field_c.e((byte) -104);
          }
          return 0;
        }
        if (this.field_b != 0) {
          return this.field_c.e((byte) -104);
        }
        return 0;
    }

    public final void a(int param0, iq param1) {
        if (param0 <= 103) {
          this.field_f = (bua) null;
        }
        gr var3 = this.field_c.c(-98);
        if (var3 != null &&
          !var3.a(-127)) {
          return;
        }
        if (null == this.field_f) {
          return;
        }
        try {
          gqa.a(this.field_e, -83584144, this.c((byte) 105), this.b((byte) -102), this.field_f.b((byte) 74), this.e((byte) -98));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "faa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
