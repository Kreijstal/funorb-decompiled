/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ra {
    static su field_M;
    static char[] field_O;
    static int field_N;

    final static int c(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 15) {
            uk.s((byte) 58);
          }
          var3_int = 0;
          while (param2 > 0) {
            var3_int = 1 & param0 | var3_int << 1;
            param2--;
            param0 = param0 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "uk.TB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    uk(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          return true;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
          field_M = (su) null;
          return 7;
        }
        return 7;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        ro var5 = null;
        fra var6 = null;
        up var7 = null;
        fsa var8 = null;
        eq var9 = null;
        mfa var10 = null;
        fu var11 = null;
        fsa var12 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var12 = new fsa(param2, param0);
          var12.b((byte) -11, this.field_k, this.field_l);
          var12.h(0, param1 ^ param1);
          var12.a(4, (byte) -12, true);
          var12.a((byte) -3, 0);
          var12.b((byte) 17, true);
          var5 = this.a((byte) 125, param2, param0);
          var12.a(var5, 0);
          var6 = new fra(param2, param0);
          var7 = new up(0, 10);
          var7.b(1, 15);
          var6.a(true, var7);
          var6.a((byte) -24, true);
          var12.a((byte) 83, (nv) (var6));
          var8 = new fsa(param2, param0);
          var8.b((byte) -11, 1048576, 1048576);
          var8.h(3, param1 ^ 3);
          var8.a(3, (byte) -12, true);
          var8.a((byte) -3, 0);
          var8.b((byte) 17, true);
          var9 = new eq(param2, param0);
          var8.a((byte) 83, (nv) (var9));
          var12.a(-128, var8);
          var10 = rm.field_a;
          var11 = (fu) (var10.a(8, param1 + 119));
          var11.a(false, 1);
          var12.a(var6, (byte) 124, var11);
          stackIn_1_0 = var12;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uk.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
          return false;
        }
        return true;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          field_O = (char[]) null;
          return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          uk.s((byte) -72);
          return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uk.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean A(int param0) {
        int var2 = 16 % ((0 - param0) / 60);
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(66, 4194304, 4194304);
    }

    uk(la param0, int param1) {
        super(param0, param1);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          this.A(-19);
          return false;
        }
        return false;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -102 / ((-92 - param1) / 34);
        return false;
    }

    public static void s(byte param0) {
        field_M = null;
        field_O = null;
        if (param0 < 112) {
          uk.a(27, (byte) 64, 114);
        }
    }

    static {
        field_O = new char[128];
        field_M = new su(0, 2, 2, 1);
    }
}
