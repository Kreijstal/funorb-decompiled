/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends dg {
    private int field_m;
    private bua field_p;
    static int field_n;
    static int field_o;

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        ka var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8Lifetime1;
        try {
          if (null == this.field_p) {
            return;
          }
          var7 = -80 / ((param4 + 38) / 47);
          var9 = this.field_p.b((byte) 74);
          if (var9 != null) {
            var8 = dfa.a(4096 - this.field_h.g(-25787) >> 2, 2048, -40);
            gqa.a(var8, -83584144, param1, param2, var9, param3);
          }
          if (this.field_m != 1) {
            return;
          }
          var10 = wma.a(49, 12166, 1);
          var8Lifetime1 = dfa.a(4096 - this.field_h.g(-25787) >> 2, 2048, 86);
          gqa.a(var8Lifetime1, -83584144, param1, param2, var10, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("am.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, int param1, uw param2) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qea var9 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          super.a((byte) 52, param1, param2);
          if (param0 <= 50) {
            field_n = -110;
          }
          var9 = this.a(46).e(true);
          this.field_g = var9.a(100, 0);
          var5 = 0;
          var7 = this.field_m;
          if (var7 == 1) {
            this.field_p = new bua(1, 48);
            this.field_p.a(3, true, (byte) -109, 1);
            var5Lifetime1 = var9.a(20, 0);
            this.field_p.b(-125, var5Lifetime1);
            return;
          }
          if (2 == var7) {
            this.field_p = new bua(1, 50);
            this.field_p.a(3, true, (byte) 62, 2);
            var5Lifetime2 = var9.a(20, 0);
            this.field_p.b(-83, var5Lifetime2);
            return;
          }
          if (0 == var7) {
            this.field_p = new bua(1, 47);
            this.field_p.a(3, true, (byte) -90, 0);
            var5Lifetime3 = var9.a(20, 0);
            this.field_p.b(125, var5Lifetime3);
            return;
          }
          if (var7 != 3) {
            return;
          }
          var6 = 77;
          if (33 > this.field_g) {
            var6Lifetime1 = 77;
          }
          var6Lifetime2 = (this.field_g >= 66) ? 79 : 78;
          this.field_p = new bua(1, var6Lifetime2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("am.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public final void f(int param0) {
        super.f(param0);
        if (this.field_p != null) {
          this.field_p.a(0);
        }
    }

    final void b(int param0, byte param1) {
        this.field_m = param0;
        if (param1 != 77) {
          field_n = -49;
        }
    }

    final void a(int param0, la param1, kh param2) {
        super.a(124, param1, param2);
        if (param0 < 119) {
          this.field_m = 77;
        }
        if (param1.field_E <= 17) {
          return;
        }
        try {
          this.field_m = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "am.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
          int var3_int = -114 % ((-8 - param0) / 40);
          super.a((byte) -105, param1);
          param1.a((byte) 30, this.field_m, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "am.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    am(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    am(int param0) {
        super(param0);
    }

    static {
    }
}
