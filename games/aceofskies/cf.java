/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends sk {
    static int field_g;
    static String field_h;
    static gk field_f;

    public static void f(int param0) {
        field_f = null;
        field_h = null;
        int var1 = -94 % ((-48 - param0) / 41);
    }

    final static void a(ll[] param0, int param1, byte param2, int param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param0 != null &&
            0 < param4) {
            var5_int = param0[0].field_v;
            var6 = param0[2].field_v;
            var7 = param0[1].field_v;
            param0[0].b(param1, param3);
            param0[2].b(param1 + param4 - var6, param3);
            vp.b(rl.field_a);
            vp.a(param1 + var5_int, param3, param4 + (param1 - var6), param0[1].field_q + param3);
            var8 = param1 + var5_int;
            var9 = -var6 + param1 + param4;
            param1 = var8;
            if (param2 > -108) {
              cf.f(78);
            }
            while (var9 > param1) {
              param0[1].b(param1, param3);
              param1 = param1 + var7;
            }
            vp.a(rl.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, jj param2) {
        try {
          this.field_b.a(param2, -9135);
          if (param1 <= 66) {
            ll[] var5 = (ll[]) null;
            cf.a((ll[]) null, -3, (byte) -124, 39, -48);
          }
          this.field_b.b(param0, false);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "cf.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 == 1786747298) {
          return;
        }
        field_h = (String) null;
    }

    final void a(boolean param0, byte param1) {
        this.field_b.a(true, -26973);
        if (param1 >= 2) {
          return;
        }
        this.a(-1, 10, -110);
    }

    cf(bf param0) {
        super(param0);
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        this.a(false, (byte) 24);
    }

    final void a(boolean param0) {
        this.field_b.a(false, -26973);
        if (!param0) {
          ll[] var3 = (ll[]) null;
          cf.a((ll[]) null, 33, (byte) -18, -72, -45);
          return;
        }
    }

    static {
        field_g = 0;
    }
}
