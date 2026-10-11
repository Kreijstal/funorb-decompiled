/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends kna {
    private int field_G;
    static ica field_F;
    static long field_H;

    public static void B(int param0) {
        field_F = null;
        if (param0 != 15) {
          ln.A(112);
        }
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -128, this.field_G, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ln.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          return false;
        }
        return false;
    }

    final static void a(vg param0, vg param1, byte param2) {
        try {
          if (null != param1.field_e) {
            param1.p(63);
          }
          param1.field_e = param0.field_e;
          int var3_int = -97 % ((-39 - param2) / 63);
          param1.field_a = param0;
          param1.field_e.field_a = param1;
          param1.field_a.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ln.VB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void A(int param0) {
        ij.j((byte) -116);
        int var1 = -6 / ((-10 - param0) / 45);
    }

    final static mg b(int param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param1 != 23688) {
          ln.A(-122);
        }
        var2 = param0;
        if (var2 == 0) {
          return new mg(new int[]{});
        }
        if (1 == var2) {
          return new mg(new int[]{60, 60});
        }
        if (var2 == 2) {
          return new mg(new int[]{30, 30});
        }
        if (3 == var2) {
          return new mg(new int[]{15, 15});
        }
        if (var2 == 4) {
          return new mg(new int[]{40, 40, 20, 20});
        }
        if (var2 == 5) {
          return new mg(new int[]{40, 40, 20, 20, 20, 20});
        }
        if (var2 == 6) {
          return new mg(new int[]{40, 40, 20, 40, 20, 20});
        }
        if (var2 == 7) {
          return new mg(new int[]{5, 10, 10, 15, 5, 15, 10, 5, 10, 5, 20, 5});
        }
        if (var2 != 8) {
          return new mg(new int[]{});
        }
        return new mg(new int[]{15, 10, 10, 15, 10, 5, 10, 5, 15, 5, 10, 10});
    }

    ln(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
          this.field_G = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    ln(la param0, int param1) {
        super(param0, param1);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          field_F = (ica) null;
          return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        lpa var5 = null;
        mfa var6 = null;
        ce var7 = null;
        fsa stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fsa(param2, param0);
          var4.b((byte) -11, this.field_k, this.field_l);
          var5 = new lpa(param2, false);
          var5.b(-5, this.field_G);
          var4.a((byte) 83, (nv) (var5));
          var6 = rm.field_a;
          if (param1 != 3) {
            this.t(49);
          }
          if (60 != this.field_m) {
            var7 = (ce) (var6.a(17, param1 ^ 93));
            var7.b(2, (byte) 23);
            var4.a(var5, (byte) 124, var7);
          }
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("ln.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void q(byte param0) {
        super.q(param0);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
          this.z(45);
          return 3;
        }
        return 3;
    }

    static {
        field_F = new ica();
    }
}
