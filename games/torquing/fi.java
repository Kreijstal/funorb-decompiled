/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private la field_a;
    private eb field_d;
    private la field_b;
    static String field_f;
    private eb field_e;
    static String field_c;

    final gg a(int param0, int param1, byte param2) {
        if (param2 == -84) {
          return this.a((int[]) null, param2 ^ -21825, param0, param1);
        }
        this.field_e = (eb) null;
        return this.a((int[]) null, param2 ^ -21825, param0, param1);
    }

    final gg b(int param0, int param1, byte param2) {
        if (param2 == 122) {
          return this.a(param1, param0, (int[]) null, (byte) 73);
        }
        int[] var5 = (int[]) null;
        gg discarded$0 = this.a((int[]) null, -25, -2, -31);
        return this.a(param1, param0, (int[]) null, (byte) 73);
    }

    private final gg a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gg var8 = null;
        cg var9 = null;
        gg var10 = null;
        gg stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        gg stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg var8Lifetime1;
        try {
          var5_int = ((param3 & -805302273) << 4 | param3 >>> 12) ^ param2;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (gg) (this.field_e.a(var6, (byte) 98));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_7_0 = null;
            return (gg) (stackIn_7_0);
          }
          var9 = cg.a(this.field_b, param3, param2);
          if (var9 == null) {
            stackIn_10_0 = null;
            return (gg) (stackIn_10_0);
          }
          if (param1 != 21779) {
            this.field_a = (la) null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_e.a(false, var6, var8Lifetime1);
          if (param0 != null) {
            param0[0] = param0[0] - var10.field_n.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("fi.J(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final gg a(String param0, String param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_5_0 = null;
        gg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 59 / ((param3 - 53) / 36);
          var5_int = this.field_a.a(-1, param1);
          if (var5_int < 0) {
            return null;
          }
          var7 = this.field_a.a(param0, -115, var5_int);
          if (0 <= var7) {
            stackIn_7_0 = this.a(var5_int, var7, param2, (byte) 77);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (gg) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fi.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final static bp a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        bp var7 = null;
        int var8 = 0;
        q var9 = null;
        bp stackIn_3_0 = null;
        bp stackIn_6_0 = null;
        bp stackIn_9_0 = null;
        bp stackIn_16_0 = null;
        bp stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = oj.field_l;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_6_0 = wn.field_s;
            return stackIn_6_0;
          }
          var3 = kc.a('.', param1, 0);
          if (2 > var3.length) {
            stackIn_9_0 = oj.field_l;
            return stackIn_9_0;
          }
          if (param0 > -90) {
            var9 = (q) null;
            fi.a((q) null, (q) null, 124);
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var4.length <= var5) {
              stackIn_19_0 = vb.a(4, var3[-1 + var3.length]);
              return stackIn_19_0;
            }
            var6 = var4[var5];
            var7 = lc.a(false, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_16_0 = var7;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("fi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final gg a(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gg var8 = null;
        ho var9 = null;
        int var10 = 0;
        gg stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        gg stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg var8Lifetime1;
        try {
          var5_int = (param0 << 4 & 65528 | param0 >>> 12) ^ param1;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (gg) (this.field_e.a(var6, (byte) 91));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            return null;
          }
          var10 = -73 % ((param3 + 23) / 49);
          var9 = (ho) (this.field_d.a(var6, (byte) 83));
          if (var9 == null) {
            var9 = ho.a(this.field_a, param0, param1);
            if (var9 == null) {
              stackIn_11_0 = null;
              return (gg) (stackIn_11_0);
            }
            this.field_d.a(false, var6, var9);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.f(0);
          this.field_e.a(false, var6, var8Lifetime1);
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("fi.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(q param0, q param1, int param2) {
        try {
          if (null != param0.field_h) {
            param0.f(0);
          }
          if (param2 != -1240266932) {
            field_f = (String) null;
          }
          param0.field_h = param1.field_h;
          param0.field_e = param1;
          param0.field_h.field_e = param0;
          param0.field_e.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fi.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 62) {
          byte[] var2 = (byte[]) null;
          fi.a((byte) 36, (byte[]) null);
          field_c = null;
          return;
        }
        field_c = null;
    }

    fi(la param0, la param1) {
        this.field_d = new eb(256);
        this.field_e = new eb(256);
        try {
          this.field_a = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final gg a(String param0, int param1, String param2) {
        RuntimeException var4 = null;
        gg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -66) {
            this.field_e = (eb) null;
          }
          stackIn_3_0 = this.a(param0, param2, (int[]) null, (byte) 115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fi.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static vn a(byte param0, byte[] param1) {
        vn var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_2_0 = null;
        vn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (vn) (stackIn_2_0);
          }
          var2 = new vn(param1, fj.field_o, na.field_G, vo.field_b, ij.field_o, pn.field_b);
          if (param0 != -9) {
            var3 = (byte[]) null;
            fi.a((byte) 17, (byte[]) null);
          }
          go.b(0);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("fi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_f = "This password contains your email address, and would be easy to guess";
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
