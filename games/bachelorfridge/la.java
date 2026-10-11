/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends bca {
    static vr field_s;
    static int field_r;
    int field_t;
    int field_q;

    final static void a(int param0, pia param1) {
        int var2_int = 0;
        int var3 = 0;
        try {
          lo.field_b = param1;
          if (param0 != 3) {
            la.d(-39);
          }
          var2_int = 1000;
          var3 = 6 + (lo.field_b.field_B + lo.field_b.field_F);
          if (1 == (var3 & 1)) {
            var3++;
          }
          sca.field_a = new kv(var2_int, var3);
          ap.field_c = new kv(var2_int, var3);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != 2) {
          pia var2 = (pia) null;
          la.a(109, (pia) null);
        }
    }

    la(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l.a(78, param0);
          stackIn_3_1 = !(param0.e(this.field_q, this.field_t, -11066));
          this.field_p = stackIn_3_1;
          var3_int = -82 % ((param1 - 12) / 35);
          if (this.field_p) {
            return;
          }
          param0.b((byte) 103, 35, this.field_q, this.field_t);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("la.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (dm.field_f <= 0) {
          if (bp.e(param1 ^ -29917)) {
            var2 = 0;
            if (qt.field_l == null &&
              ai.field_e) {
              tfa.a(var2, param1 ^ 3, param0);
            }
            if (param1 == 2) {
              return;
            }
            field_r = -88;
            return;
          }
          var2 = 1;
        } else {
          if (null == qt.field_l) {
            kga.field_c = mfa.a(true, 640, 0, 480, ju.field_r, 0);
          } else {
            kga.field_c = qt.field_l.c((byte) -91);
            fga.a(2, (byte) -2);
          }
          if (kga.field_c == null) {
            var2 = 3;
          } else {
            nl.a(kga.field_c, (byte) 92);
            var2 = 2;
          }
        }
        if (qt.field_l == null &&
          ai.field_e) {
          tfa.a(var2, param1 ^ 3, param0);
        }
        if (param1 == 2) {
          return;
        }
        field_r = -88;
    }

    final void a(byte param0, lu param1) {
        try {
          super.a((byte) -48, param1);
          param1.d(this.field_q, 0);
          if (param0 >= -12) {
            this.field_t = -45;
          }
          param1.d(this.field_t, 0);
          param1.d(this.field_p ? 1 : 0, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "la.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        dca stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            field_s = (vr) null;
          }
          stackIn_3_0 = new dca(param1, this, this.field_p);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("la.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    la(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 100);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_q = param0.b(16711935);
          this.field_t = param0.b(16711935);
          this.field_p = 1 == param0.b(16711935) ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = -1;
    }
}
