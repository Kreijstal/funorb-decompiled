/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends kna {
    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        eq var5 = null;
        mfa var6 = null;
        am var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fsa(param2, param0);
          var4.b((byte) -11, this.field_k, this.field_l);
          var4.a((byte) -3, 20);
          var5 = new eq(param2, param0);
          var4.a((byte) 83, (nv) (var5));
          var4.b((byte) 17, false);
          var4.a(1, (byte) -12, false);
          var4.h(3, param1 - 3);
          var6 = rm.field_a;
          var7 = (am) (var6.a(4, 108));
          var7.b(param1, (byte) 77);
          var4.a((gr) null, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("m.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "m.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    m(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          this.q((byte) -16);
          return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return true;
    }

    final static int A(int param0) {
        if (!lca.a(false)) {
          return -1;
        }
        if (param0 == -7111) {
          return wu.field_a.e(param0 ^ 7110);
        }
        String var2 = (String) null;
        m.a((String) null, 34, (cn) null, (String) null);
        return wu.field_a.e(param0 ^ 7110);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return false;
    }

    m(la param0, int param1) {
        super(param0, param1);
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-91, 2097152, 2097152);
    }

    final static fq a(int param0, kh param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fq stackIn_2_0 = null;
        fq stackIn_5_0 = null;
        fq stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = new fq();
            return stackIn_2_0;
          }
          var2_int = param1.b((byte) 44, 8);
          if (param0 == -1) {
            stackIn_7_0 = new fq(var2_int, param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = (fq) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("m.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
          return 47;
        }
        return 7;
    }

    final static dk a(String param0, int param1, cn param2, String param3) {
        RuntimeException var4 = null;
        dk stackIn_2_0 = null;
        dk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -123) {
            stackIn_4_0 = new dk(param2, param3, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (dk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("m.SB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    static {
    }
}
