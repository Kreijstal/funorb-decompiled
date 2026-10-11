/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bia extends fqa {
    static u[] field_J;

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eia var5 = null;
        jma var6 = null;
        int var7 = 0;
        mfa var8 = null;
        cv var9 = null;
        fsa var10 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new fsa(param2, param0);
          var10.b((byte) -11, this.field_k, this.field_l);
          var10.h(3, param1 ^ param1);
          var10.a(1, (byte) -12, false);
          var10.e(false, param1 + 112);
          var10.b((byte) 17, false);
          var10.a((byte) -3, 6);
          var10.a((byte) 83, (nv) (new eq(param2, param0)));
          var5 = new eia(param2, param0);
          var5.a(true, 3, (byte) -122);
          var5.a(true, 4, -81);
          var5.a(10, 1, 5, param1 - 2032);
          this.a(var5, (byte) -118);
          var6 = var5.k((byte) -101);
          var7 = 25;
          var6.a(var7, 0, 0, 0, 5, 0);
          var10.a((byte) 83, (nv) (var5));
          var8 = rm.field_a;
          var9 = (cv) (var8.a(9, 123));
          var9.b(1, (byte) -112);
          var10.a(var5, (byte) 124, var9);
          stackIn_1_0 = var10;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("bia.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          field_J = (u[]) null;
          return false;
        }
        return false;
    }

    bia(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return false;
    }

    final static int a(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0) {
          var2 += 16;
          param1 = param1 >>> 16;
        } else {
          if (65536 <= param1) {
            var2 += 16;
            param1 = param1 >>> 16;
          }
        }
        if (param0 != 93) {
          bia.a((byte) 58, 116);
        }
        if (256 <= param1) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bia.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
          la var3 = (la) null;
          this.a(false, -105, (la) null);
          return 7;
        }
        return 7;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    public static void C(int param0) {
        field_J = null;
        if (param0 != 4194304) {
          field_J = (u[]) null;
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
          field_J = (u[]) null;
          return true;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(-117, 4194304, 4194304);
    }

    bia(la param0, int param1) {
        super(param0, param1);
    }

    final int B(int param0) {
        if (param0 != 31609) {
          return -38;
        }
        return 3;
    }

    static {
    }
}
