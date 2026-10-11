/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sua extends kna {
    private int field_F;
    static double field_J;
    static vna field_H;
    static int field_L;
    static fta field_G;
    static jea field_K;
    static int field_I;

    public static void B(int param0) {
        if (param0 > 19) {
          field_G = null;
          field_K = null;
          field_H = null;
          return;
        }
        sua.r((byte) 98);
        field_G = null;
        field_K = null;
        field_H = null;
    }

    final void a(la param0, int param1) {
        try {
          super.a(param0, param1);
          this.field_F = -this.field_F;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sua.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-113, 2097152, 2097152);
        this.a((byte) 89, new mka[]{new mka(0, 0, 2097152, 0, 8)});
    }

    final static void r(byte param0) {
        int var1 = 0;
        if (ot.field_v < 224) {
          var1 = ot.field_v % 32;
          mp.a(2, -var1 + (ot.field_v + 32));
          if (param0 != 63) {
            sua.A(63);
            return;
          }
          return;
        }
        mp.a(2, 256);
        if (param0 != 63) {
          sua.A(63);
          return;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          field_K = (jea) null;
          return true;
        }
        return true;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -38, dqa.a(!param0 ? true : false, this.field_F, 5), 5);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sua.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        spa var5 = null;
        mfa var6 = null;
        nq var7 = null;
        fsa var8 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new fsa(param2, param0);
          var8.b((byte) -11, this.field_k, this.field_l);
          var8.h(param1, 0);
          var8.a(1, (byte) -12, true);
          var8.a((byte) -3, 6);
          var8.b((byte) 17, false);
          var8.g(param1 ^ 109, 2);
          var8.a((byte) 83, (nv) (new eq(param2, param0)));
          var5 = new spa(param2, param0);
          var5.a((byte) -124, this.field_F * 8);
          var8.a(var5, 0);
          var6 = rm.field_a;
          var7 = (nq) (var6.a(16, 124));
          var7.b(8022, 2);
          var8.a(var5, (byte) 124, var7);
          stackIn_1_0 = var8;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("sua.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    sua(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        this.field_F = 4;
        try {
          this.field_F = bla.a(true, 5, param2.b((byte) 44, 5));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          field_H = (vna) null;
          return false;
        }
        return false;
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        uia var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new uia(param0);
          var3 = var9.h(255);
          var4 = var9.e(124);
          if (param1 > -99) {
            sua.A(-108);
          }
          if (var4 >= 0 && (0 == oma.field_H ||
            !(oma.field_H < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(var13, 0, -86, var4);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var9.e(-127);
            if (var5_int >= 0 && (oma.field_H == 0 ||
              !(var5_int > oma.field_H))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                kr.a(var12, var5_int, param0, var4, 9);
              } else {
                var7 = sma.field_e;
                synchronized (var7) {
                  sma.field_e.a((byte) -34, var12, var9);
                }
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("sua.UB(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
          la var3 = (la) null;
          this.a((la) null, -35);
          return 7;
        }
        return 7;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          return true;
        }
        return false;
    }

    sua(la param0, int param1) {
        super(param0, param1);
        this.field_F = 4;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return true;
    }

    final static goa A(int param0) {
        String var1 = cs.a((byte) -112);
        if (param0 < 46) {
          return (goa) null;
        }
        if (var1 == null) {
          return new goa(cs.a((byte) 94), npa.a(32));
        }
        if (var1.indexOf('@') >= 0) {
          var1 = "";
          return new goa(cs.a((byte) 94), npa.a(32));
        }
        return new goa(cs.a((byte) 94), npa.a(32));
    }

    static {
        field_J = 0.0;
        field_H = new vna();
        field_G = new fta();
    }
}
