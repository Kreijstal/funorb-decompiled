/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends nf {
    private int field_h;
    static dl field_j;
    private int field_i;
    static String field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        f stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = this.field_i + param3;
          if (param0) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          this.field_h = this.field_h + 1;
          if (q.field_a[ma.field_n[param1]].a((byte) 105, param2)) {
            stackIn_6_0 = new cd(bm.field_g, 0, 0, 0, 0);
          } else {
            stackIn_6_0 = new gh(bm.field_g, 0, 0);
          }
          return (f) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ac.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        ah var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = CrazyCrystals.field_B;
        try {
          if (param1 > 0) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; var5_int < param2; var5_int++) {
              var8[var5_int] = param0[param1 + var5_int];
            }
          } else {
            var4 = param0;
          }
          var5 = new ah();
          var5.b((byte) 117);
          var5.a((byte) -82, (long)(8 * param2), var4);
          if (param3 != -127) {
            stackIn_8_0 = (byte[]) null;
            return stackIn_8_0;
          }
          var6 = new byte[64];
          var5.a(var6, true, 0);
          stackIn_10_0 = var6;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("ac.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
          return (pb) null;
        }
        return (pb) ((Object) new fg());
    }

    public static void d(byte param0) {
        if (param0 != 23) {
          return;
        }
        field_j = null;
        field_k = null;
    }

    final static String c(int param0) {
        if (lc.field_c == l.field_b) {
          return dg.field_a;
        }
        int var1 = 17 % ((param0 + 79) / 38);
        if (!gk.field_e.b(-67)) {
          return gk.field_e.a(120);
        }
        if (sg.field_b == l.field_b) {
          return gk.field_e.a(124);
        }
        return jd.field_G;
    }

    final void a(byte param0) {
        tb.field_d.a(lp.field_b, 100, this.field_h * 48 * gi.field_m, this.field_i / this.field_h);
        this.field_i = 0;
        this.field_h = 0;
        int var2 = -33 % ((29 - param0) / 42);
    }

    ac() {
        this.field_i = 0;
        this.field_h = 0;
    }

    static {
        field_k = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
