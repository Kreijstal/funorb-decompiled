/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends fe {
    private ko field_O;
    private String[] field_N;
    private qa field_P;

    void a(ei param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          this.field_P = null;
          if (this.field_s) {
            var5_int = -this.field_C - param2 + wn.field_i;
            var6 = -this.field_D + (-param3 + gg.field_f);
            this.field_P = this.a(var6, var5_int, -31244);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("mh.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (param3) {
          return;
        }
        this.g((byte) 28);
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -107 / ((param1 + 43) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("mh.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          qh.f(param0, param1, 1 + param3, 10000536);
          qh.f(param0, param1 + param2, 1 + param3, 12105912);
          var5_int = 1;
          var6 = param2;
          if (qh.field_c > var5_int + param1) {
            var5_int = -param1 + qh.field_c;
          }
          if (param1 + var6 > qh.field_g) {
            var6 = qh.field_g - param1;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 152 + 48 * var7 / param2;
            var9 = var8 << 8 | var8 << 16 | var8;
            qh.field_d[qh.field_l * (var7 + param1) + param0] = var9;
            qh.field_d[(param1 + var7) * qh.field_l + param0 + param3] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5), "mh.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void g(byte param0) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        int var3;
        io var4;
        op var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        vj var13;
        int var14;
        int var15;
        qa var16;
        int var8Lifetime1;
        var2 = -46 / ((param0 + 35) / 50);
        this.field_O = new ko();
        var3 = 0;
        var4 = (io) ((Object) this.field_z);
        var5 = var4.b(0, (ei) (this));
        while (true) {
          var6 = this.field_m.indexOf("<hotspot=", var3);
          if (-1 == var6) {
            return;
          }
          var8 = this.field_m.indexOf(">", var6);
          var7 = this.field_m.substring(var6 + 9, var8);
          var8Lifetime1 = Integer.parseInt(var7);
          var3 = this.field_m.indexOf("</hotspot>", var6);
          var9 = var5.a(var6, 0);
          var10 = var5.a(var3, 0);
          var11 = null;
          for (var12 = var9; var12 <= var10; var12++) {
            var13 = var5.field_b[var12];
            if (var9 != var12) {
              stackIn_7_0 = var13.field_h[0];
            } else {
              stackIn_7_0 = var5.a(var6, (byte) -73);
            }
            var14 = stackIn_7_0;
            if (var10 != var12) {
              if (var13 != null) {
                stackIn_12_0 = var13.field_h[-1 + var13.field_h.length];
              } else {
                stackIn_12_0 = 0;
              }
            } else {
              stackIn_12_0 = var5.a(var3, (byte) -104);
            }
            var15 = stackIn_12_0;
            var16 = new qa(var8Lifetime1, var14, var13.field_e, var15 - var14, Math.max(var4.a(-10492), var13.field_i - var13.field_e));
            if (var11 != null) {
              ((qa) (var11)).field_l = var16;
            }
            this.field_O.b((byte) 82, var16);
            var11 = var16;
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        super.a(param0, (byte) 50, param2, param3);
        int var5 = -21 % ((param1 + 42) / 53);
        if (param0 != 0) {
          return;
        }
        io var6 = (io) ((Object) this.field_z);
        qa var7 = this.field_P;
        if (var7 == null) {
        } else {
          var8 = var6.a(5286, (ei) (this), param2);
          var9 = var6.a(param3, (ei) (this), (byte) -7);
          do {
            bj.a(var9 + var7.field_p - 2, var7.field_q + 2, 2 + var7.field_w, var7.field_n + (var8 - 2), 2187);
            var7 = var7.field_l;
          } while (var7 != null);
        }
    }

    String e(int param0) {
        if (null == this.field_P) {
          return null;
        }
        if (this.field_N == null) {
          return null;
        }
        if (this.field_N.length <= this.field_P.field_s) {
          return null;
        }
        if (param0 > -10) {
          return (String) null;
        }
        return this.field_N[this.field_P.field_s];
    }

    private final qa a(int param0, int param1, int param2) {
        qa var5 = null;
        int var6 = Pool.field_O;
        qa var4 = (qa) (this.field_O.c((byte) -21));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param1 >= var5.field_n && param0 >= var5.field_p && param1 < var5.field_n + var5.field_w &&
              !(param0 > var5.field_q + var5.field_p)) {
              return var4;
            }
            var5 = var5.field_l;
          }
          var4 = (qa) (this.field_O.f((byte) -5));
        }
        if (param2 == -31244) {
          return null;
        }
        return (qa) null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param1 - this.field_C;
        int var6 = -this.field_D + param2;
        qa var7 = this.a(var6, var5, param0 - 31260);
        if (var7 != null &&
          null != this.field_t) {
          ((jb) ((Object) this.field_t)).a(param3, this, param0 - 12163, var7.field_s);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = -72 / ((param3 + 62) / 41);
        this.a(param2, param0, ((io) ((Object) this.field_z)).a(1, (ei) (this)), false, param1);
    }

    mh(String param0, fp param1) {
        super(param0, (cc) null);
        this.field_P = null;
        try {
          this.field_z = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        String[] var5 = null;
        int var6 = 0;
        int var7 = Pool.field_O;
        try {
          int var4_int = -75 % ((param0 + 66) / 49);
          if (null == this.field_N ||
            this.field_N.length <= param2) {
            var5 = new String[1 + param2];
            if (this.field_N != null) {
              for (var6 = 0; var6 < this.field_N.length; var6++) {
                var5[var6] = this.field_N[var6];
              }
            }
            this.field_N = var5;
          }
          this.field_N[param2] = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "mh.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
