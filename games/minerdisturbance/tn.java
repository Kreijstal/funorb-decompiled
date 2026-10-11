/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tn extends hc {
    private lb field_N;
    static boolean field_M;
    static ea[] field_K;
    static boolean field_J;
    private String[] field_L;
    private ta field_I;

    final static boolean a(int param0, int param1) {
        if (param1 != -3236) {
          field_K = (ea[]) null;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param1 - this.field_u;
        int var6 = param2 - this.field_t;
        lb var7 = this.b(var6, -2, var5);
        if (var7 != null &&
          this.field_y != null) {
          ((be) ((Object) this.field_y)).a(this, param3, 12278, var7.field_n);
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
          field_M = false;
        }
        field_K = null;
    }

    String h(int param0) {
        if (this.field_N == null) {
          return null;
        }
        if (this.field_L == null) {
          return null;
        }
        if (param0 != -27867) {
          tn.a(-77);
        }
        if (this.field_N.field_n >= this.field_L.length) {
          return null;
        }
        return this.field_L[this.field_N.field_n];
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        String[] var4 = null;
        int var6 = 0;
        fe var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = MinerDisturbance.field_ab;
        try {
          if (null == this.field_L ||
            param1 >= this.field_L.length) {
            var8 = new String[1 + param1];
            var9 = var8;
            var4 = var9;
            if (null != this.field_L) {
              for (var5 = 0; this.field_L.length > var5; var5++) {
                var8[var5] = this.field_L[var5];
              }
            }
            this.field_L = var9;
          }
          this.field_L[param1] = param2;
          if (param0 >= -9) {
            var7 = (fe) null;
            this.a(-120, 41, (byte) -117, (fe) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("tn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final lb b(int param0, int param1, int param2) {
        lb var4;
        lb var5;
        int var6;
        var6 = MinerDisturbance.field_ab;
        if (param1 != -2) {
          tn.a(53, 94);
        }
        var4 = (lb) (this.field_I.b(82));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_s &&
              param0 >= var5.field_u &&
              var5.field_p + var5.field_s > param2 &&
              var5.field_u + var5.field_o >= param0) {
              return var4;
            }
            var5 = var5.field_v;
          }
          var4 = (lb) (this.field_I.b((byte) 56));
        }
        return null;
    }

    void a(int param0, int param1, byte param2, fe param3) {
        lb discarded$1 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, (byte) 105, param3);
          this.field_N = null;
          if (param2 < 49) {
            discarded$1 = this.b(38, 48, -19);
          }
          if (this.field_x) {
            var5_int = -this.field_u + (-param1 + nk.field_w);
            var6 = -this.field_t - param0 + gb.field_e;
            this.field_N = this.b(var6, -2, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("tn.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        cf var5 = (cf) ((Object) this.field_A);
        lb var6 = this.field_N;
        if (var6 == null) {
        } else {
          var7 = var5.a(28793, (fe) (this), param1);
          var8 = var5.b(100, (fe) (this), param2);
          do {
            se.c(var6.field_s + var7 - 2, 2, -2 + var6.field_u + var8, var6.field_p + 2, 2 + var6.field_o);
            var6 = var6.field_v;
          } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        cf var3;
        nf var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        mg var12;
        int var13;
        int var14;
        lb var15;
        int var16;
        int var7Lifetime1;
        var16 = MinerDisturbance.field_ab;
        this.field_I = new ta();
        var2 = 0;
        var3 = (cf) ((Object) this.field_A);
        var4 = var3.c(0, (fe) (this));
        while (true) {
          var5 = this.field_s.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            if (param0 > -52) {
              this.a((byte) 82);
            }
            return;
          }
          var7 = this.field_s.indexOf(">", var5);
          var6 = this.field_s.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_s.indexOf("</hotspot>", var5);
          var8 = var4.a((byte) 39, var5);
          var9 = var4.a((byte) 39, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_f[var11];
            if (~var11 == ~var8) {
              stackIn_8_0 = var4.a(var5, (byte) -125);
            } else {
              stackIn_8_0 = var12.field_d[0];
            }
            var13 = stackIn_8_0;
            if (var11 == var9) {
              stackIn_13_0 = var4.a(var2, (byte) -125);
            } else {
              if (var12 != null) {
                stackIn_13_0 = var12.field_d[-1 + var12.field_d.length];
              } else {
                stackIn_13_0 = 0;
              }
            }
            var14 = stackIn_13_0;
            var15 = new lb(var7Lifetime1, var13, var12.field_h, -var13 + var14, Math.max(var3.a(-89), var12.field_i - var12.field_h));
            if (var10 != null) {
              ((lb) (var10)).field_v = var15;
            }
            var10 = var15;
            this.field_I.a((byte) 51, var15);
          }
        }
    }

    tn(String param0, ad param1) {
        super(param0, (rm) null);
        this.field_N = null;
        try {
          this.field_A = param1;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "tn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(((cf) ((Object) this.field_A)).b(63, (fe) (this)), -73, param0, param1, param3);
        if (param2 != 32088) {
          this.field_L = (String[]) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        lb discarded$0 = null;
        super.a(param0, -97, param2, param3, param4);
        this.a((byte) -107);
        if (param1 > -33) {
          discarded$0 = this.b(6, -124, -71);
        }
    }

    final static void c(byte param0) {
        int var1 = -9 / ((param0 - 56) / 37);
        ng.a((byte) -99);
        if (ef.field_c != null) {
          ci.a(ef.field_c, 0);
        }
        bf.c(109);
        ll.a(-118);
        bl.a(true);
        if (ob.l(-1)) {
          sn.field_c.d((byte) -75, 1);
          bk.a((byte) 83, 0);
        }
        si.a(-126);
    }

    boolean a(fe param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 119) {
            return false;
          }
          this.field_N = (lb) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tn.UA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_J = false;
    }
}
