/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static le field_e;
    private int field_b;
    static String field_a;
    private boolean field_f;
    private int field_d;
    private int[] field_c;

    final static String a(int param0) {
        if (!(vh.field_n >= 2)) {
          return nc.field_Z;
        }
        if (null != lf.field_a) {
          if (!lf.field_a.b(-1)) {
            return de.field_b;
          }
          return mi.field_e;
        }
        if (!og.field_g.b(-1)) {
          return jj.field_B;
        }
        if (!og.field_g.b((byte) 91, "commonui")) {
          return kj.field_z + " - " + og.field_g.a((byte) -41, "commonui") + "%";
        }
        if (!am.field_b.b(-1)) {
          return bk.field_a;
        }
        if (!am.field_b.b((byte) -103, "commonui")) {
          return hi.field_e + " - " + am.field_b.a((byte) -97, "commonui") + "%";
        }
        int var1 = 87 % ((param0 + 3) / 57);
        if (!wb.field_b.b(-1)) {
          return ge.field_i;
        }
        if (!wb.field_b.c(7715)) {
          return fa.field_c + " - " + wb.field_b.a(20147) + "%";
        }
        return ql.field_f;
    }

    final int b(int param0) {
        if (param0 != 1) {
          field_e = (le) null;
        }
        return this.field_b + 1;
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 > this.field_b) {
          this.field_b = param0;
        }
        if (this.field_c.length <= param0) {
          this.a(param0, true);
        }
        this.field_c[param0] = param1;
        if (param2 != -11784) {
          this.field_f = true;
        }
    }

    private final int c(int param0, int param1) {
        int var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param1 != -1) {
          field_e = (le) null;
        }
        var3 = this.field_c.length;
        while (var3 <= param0) {
          if (!this.field_f) {
            var3 = var3 + this.field_d;
            continue;
          }
          if (0 == var3) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_d;
        }
        return var3;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          this.field_b = -70;
        }
        if (this.field_b < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        return this.field_c[param1];
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param1) {
          var4 += 2;
        }
        if (param0 != -14189) {
          return (String) null;
        }
        if (param3) {
          var4++;
        }
        return ee.field_d[var4];
    }

    final static void a(be param0, java.awt.Frame param1, int param2) {
        eb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        CharSequence var5 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a((byte) -120, param1);
            while (var3.field_a == 0) {
              hb.a(10L, 109);
            }
            if (var3.field_a != 1) {
              hb.a(100L, 101);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          param1.dispose();
          if (param2 != -23144) {
            var5 = (CharSequence) null;
            tj.a(false, -4, (CharSequence) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tj.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        if (!param1) {
          field_a = (String) null;
        }
        int[] var4 = new int[this.c(param0, -1)];
        int[] var3 = var4;
        mk.a(this.field_c, 0, var4, 0, this.field_c.length);
        this.field_c = var4;
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 != -58) {
          tj.a(28);
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          var4 = new char[param0];
          var5 = 0;
          for (var6 = param2; var6 < param0; var6++) {
            var7 = 255 & param3[var6 + param1];
            if (var7 != 0) {
              if (128 <= var7 &&
                var7 < 160) {
                var8 = fe.field_a[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_14_0 = new String(var4, 0, var5);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("tj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!vl.a(param0, param2, -125)) {
            return false;
          }
          for (var3_int = param1; var3_int < param2.length(); var3_int++) {
            if (!vg.a(param2.charAt(var3_int), -22118)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        this.a(this.field_b + param0, param1, param0 ^ -11783);
    }

    final static hj c(int param0) {
        int var4_int = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        int var1 = wh.field_b[0] * m.field_a[0];
        byte[] var2 = fl.field_a[0];
        int[] var3 = new int[var1];
        if (param0 < 95) {
          field_a = (String) null;
        }
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = vc.field_g[vi.a(255, (int) var2[var4_int])];
        }
        hj var4 = new hj(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], var3);
        md.$cfr$intArgs$a$6121ff5511c4(-125);
        return var4;
    }

    private tj() throws Throwable {
        throw new Error();
    }

    final void a(int param0, int param1) {
        if (param0 >= 0 &&
          this.field_b >= param0) {
          if (param1 != -3344) {
            tj.a(-117);
          }
          if (param0 != this.field_b) {
            mk.a(this.field_c, 1 + param0, this.field_c, param0, this.field_b - param0);
          }
          this.field_b = this.field_b - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    static {
        field_a = null;
        field_e = new le();
    }
}
