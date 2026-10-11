/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pta implements fo {
    static String field_g;
    private la field_e;
    vna field_b;
    private c field_f;
    private vna field_c;
    static String field_d;
    private boolean field_a;

    public static void b(boolean param0) {
        field_d = null;
        field_g = null;
        if (param0) {
          return;
        }
        field_d = (String) null;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
          this.field_e = (la) null;
          return 0;
        }
        return 0;
    }

    public final void f(int param0) {
        if (param0 == -4366) {
          return;
        }
        field_g = (String) null;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          CharSequence var3 = (CharSequence) null;
          pta.a((CharSequence) null, -61);
          return 0;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = -68 % ((-41 - param1) / 42);
        c var4 = (c) (this.field_b.f(-80));
        while (var4 != null) {
          param0 = var4.a(param0, (byte) -39);
          var4 = (c) (this.field_b.e(121));
        }
        return param0;
    }

    final void a(uw param0, byte param1, boolean param2, int param3) {
        try {
          this.field_a = param2 ? true : false;
          if (!param2) {
            param0.a((byte) 83, param3, (fo) (this));
          }
          int var5_int = -45 / ((59 - param1) / 63);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pta.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0) {
        c var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          var2 = (c) (this.field_b.f(-80));
          while (var2 != null) {
            System.out.println(var2);
            var2 = (c) (this.field_b.e(116));
          }
        } else {
          field_d = (String) null;
          var2 = (c) (this.field_b.f(-80));
          while (var2 != null) {
            System.out.println(var2);
            var2 = (c) (this.field_b.e(116));
          }
        }
    }

    final void a(boolean param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        c var3 = (c) (this.field_b.f(-80));
        while (var3 != null) {
          var3.a(-1, param0);
          if (var3.h(18407)) {
            var3.p(76);
            this.field_c.b((byte) -88, var3);
          }
          var3 = (c) (this.field_b.e(127));
        }
        if (param1 >= -19) {
          field_d = (String) null;
          return;
        }
    }

    final void a(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        c var2 = (c) (this.field_b.f(-80));
        while (var2 != null) {
          var2.p(88);
          this.field_c.b((byte) -60, var2);
          var2 = (c) (this.field_b.e(112));
        }
        if (param0 > 111) {
          return;
        }
        uw var4 = (uw) null;
        this.a((uw) null, (byte) -42, false, 21);
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          this.field_e = (la) null;
          return false;
        }
        return false;
    }

    final c a(int param0, int param1, int param2, uw param3, int param4) {
        c var6 = null;
        RuntimeException var6_ref = null;
        c stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2698) {
            this.a((byte) 28);
          }
          if (!this.field_c.d((byte) 14)) {
            var6 = (c) (this.field_c.c(param0 ^ 2800));
            var6.p(param0 + 2821);
          } else {
            var6 = this.field_f.d(true);
          }
          var6.a(param4, (byte) -78, param1, param2);
          if (this.field_a &&
            param3 != null) {
            var6.a(param3, param0 + 8163);
          }
          this.field_b.b((byte) -109, var6);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("pta.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, iq param1) {
        int var4 = 0;
        c var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = (c) (this.field_b.f(-80));
          if (param0 <= 103) {
            return;
          }
          while (var5 != null) {
            var5.a(104, param1);
            var5 = (c) (this.field_b.e(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pta.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final int b(byte param0) {
        int var2 = 35 / ((param0 + 23) / 53);
        return 0;
    }

    final void a(int param0) {
        int var3;
        c var4;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 > 93) {
          var4 = (c) (this.field_b.f(-80));
          while (var4 != null) {
            var4.a(this.field_e, -63);
            var4 = (c) (this.field_b.e(109));
          }
        } else {
          this.e((byte) 14);
          var4 = (c) (this.field_b.f(-80));
          while (var4 != null) {
            var4.a(this.field_e, -63);
            var4 = (c) (this.field_b.e(109));
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_g = (String) null;
          }
          stackIn_3_0 = lg.a(false, param0, param1 + 1617);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pta.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    pta(la param0, c param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_b = new vna();
        this.field_c = new vna();
        try {
          this.field_e = param0;
          this.field_f = param1;
          for (var4_int = 0; param2 > var4_int; var4_int++) {
            this.field_c.b((byte) -81, param1.d(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pta.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_g = "Name";
        field_d = "Similar rating";
    }
}
