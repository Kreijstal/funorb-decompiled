/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    kd field_b;
    private kd field_a;

    final static void a(int param0, le param1, byte param2, le param3) {
        try {
          int var4_int = 88 % ((35 - param2) / 55);
          nb.field_x = param0;
          fb.field_m = param1;
          pb.field_i = param3;
          Lexicominos.a(lf.field_f / 2, 67, lf.field_a / 2);
          vc.a(-5094, param1.field_t, param1.field_t + param1.field_G, param3.field_t, param3.field_G + param3.field_t);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final kd a(byte param0) {
        int var3 = -7 / ((param0 - 3) / 33);
        kd var2 = this.field_b.field_f;
        if (var2 != this.field_b) {
          var2.b((byte) -120);
          return var2;
        }
        return null;
    }

    private final void a(kd param0, ng param1, byte param2) {
        kd var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -9) {
            this.g(-7);
          }
          var4 = this.field_b.field_c;
          this.field_b.field_c = param0.field_c;
          param0.field_c.field_f = this.field_b;
          if (param0 == this.field_b) {
            return;
          }
          param0.field_c = param1.field_b.field_c;
          param0.field_c.field_f = param0;
          param1.field_b.field_c = var4;
          var4.field_f = param1.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("ng.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        le var5 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = 1;
          while (1 < param1) {
            if (0 != (param1 & 1)) {
              var3_int = var3_int * param2;
            }
            param2 = param2 * param2;
            param1 = param1 >> 1;
          }
          if (param0 != -11) {
            var5 = (le) null;
            ng.a(56, (le) null, (byte) 99, (le) null);
          }
          if (param1 != 1) {
            stackIn_14_0 = var3_int;
            return stackIn_14_0;
          }
          stackIn_12_0 = var3_int * param2;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "ng.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final kd d(int param0) {
        kd var2 = this.field_a;
        if (var2 == this.field_b) {
          this.field_a = null;
          return null;
        }
        if (param0 == 0) {
          this.field_a = var2.field_c;
          return var2;
        }
        return (kd) null;
    }

    final void a(ng param0, int param1) {
        try {
          int var3_int = -10 / ((-70 - param1) / 50);
          this.a(this.field_b.field_f, param0, (byte) -9);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ng.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        kd var2 = null;
        int var3 = Lexicominos.field_L ? 1 : 0;
        while (true) {
          var2 = this.field_b.field_f;
          if (this.field_b == var2) {
            break;
          }
          var2.b((byte) -117);
        }
        this.field_a = null;
        if (param0 > -74) {
          ng var4 = (ng) null;
          this.a((ng) null, 9);
          return;
        }
    }

    final kd a(int param0) {
        kd var2 = null;
        kd var2Lifetime1;
        if (param0 != 31334) {
          this.f(-3);
          var2 = this.field_b.field_c;
          if (var2 != this.field_b) {
            var2.b((byte) -126);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_b.field_c;
        if (var2Lifetime1 != this.field_b) {
          var2Lifetime1.b((byte) -126);
          return var2Lifetime1;
        }
        return null;
    }

    final void b(int param0, kd param1) {
        if (param1.field_c != null) {
          param1.b((byte) -117);
        }
        if (param0 < 98) {
          return;
        }
        try {
          param1.field_c = this.field_b.field_c;
          param1.field_f = this.field_b;
          param1.field_c.field_f = param1;
          param1.field_f.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ng.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, kd param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_c) {
            param1.b((byte) -128);
          }
          param1.field_f = this.field_b.field_f;
          param1.field_c = this.field_b;
          param1.field_c.field_f = param1;
          param1.field_f.field_c = param1;
          if (param0 <= -56) {
            return;
          }
          this.field_b = (kd) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ng.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final kd c(int param0) {
        kd var2 = this.field_b.field_c;
        if (param0 != 2) {
          this.field_a = (kd) null;
          if (this.field_b != var2) {
            this.field_a = var2.field_c;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        if (this.field_b != var2) {
          this.field_a = var2.field_c;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final kd f(int param0) {
        kd var2 = null;
        kd var2Lifetime1;
        if (param0 != 2) {
          this.field_a = (kd) null;
          var2 = this.field_a;
          if (this.field_b != var2) {
            this.field_a = var2.field_f;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_a;
        if (this.field_b != var2Lifetime1) {
          this.field_a = var2Lifetime1.field_f;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    final boolean e(int param0) {
        int var2 = 113 / ((31 - param0) / 57);
        return this.field_b.field_f == this.field_b ? true : false;
    }

    final kd a(boolean param0) {
        kd var2 = this.field_b.field_f;
        if (!param0) {
          this.field_a = (kd) null;
          if (this.field_b != var2) {
            this.field_a = var2.field_f;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        if (this.field_b != var2) {
          this.field_a = var2.field_f;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final int b(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = 0;
        kd var3 = this.field_b.field_f;
        if (param0 != 2) {
          return 80;
        }
        while (var3 != this.field_b) {
          var3 = var3.field_f;
          var2++;
        }
        return var2;
    }

    public ng() {
        this.field_b = new kd();
        this.field_b.field_c = this.field_b;
        this.field_b.field_f = this.field_b;
    }

    static {
    }
}
