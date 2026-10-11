/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vja extends ii {
    int field_q;
    boolean field_s;
    boolean field_r;
    int field_p;
    boolean field_n;
    eaa field_o;

    void a(byte param0, lu param1) {
        int var3_int = 0;
        pp var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 > -12) {
            this.field_p = -45;
          }
          var3_int = this.field_q;
          if (this.field_r) {
            var3_int = var3_int | 128;
          }
          if (this.field_n) {
            var3_int = var3_int | 64;
          }
          if (this.field_s) {
            var3_int = var3_int | 32;
          }
          param1.d(var3_int, 0);
          param1.d(this.field_p, 0);
          param1.d(this.field_o.g(0), 0);
          var4 = (pp) (this.field_o.b((byte) 90));
          while (var4 != null) {
            var4.a(param1, (byte) -80);
            var4 = (pp) (this.field_o.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vja.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static char a(byte param0, byte param1) {
        int var2;
        int var3;
        var2 = 255 & param0;
        if (0 == var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (param1 <= -31) {
          if (var2 >= 128 &&
            var2 < 160) {
            var3 = on.field_s[var2 - 128];
            if (0 == var3) {
              var3 = 63;
            }
            var2 = var3;
          }
        } else {
          vja.a((byte) 40, true);
          if (var2 >= 128 &&
            var2 < 160) {
            var3 = on.field_s[var2 - 128];
            if (0 == var3) {
              var3 = 63;
            }
            var2 = var3;
          }
        }
        return (char)var2;
    }

    vja(int param0, nq param1, int param2, int param3, boolean param4, boolean param5, boolean param6) {
        super(1, param0, param1);
        try {
          this.field_n = param5 ? true : false;
          this.field_p = param3;
          this.field_r = param4 ? true : false;
          this.field_q = param2;
          this.field_s = param6 ? true : false;
          this.field_o = new eaa();
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vja.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        vla stackIn_5_0 = null;
        mv stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            stackIn_2_0 = (at) null;
            return stackIn_2_0;
          }
          if (4 != ((t) (al.a(-121, this.field_k))).field_p) {
            stackIn_7_0 = new mv(param1, this);
            return (at) ((Object) stackIn_7_0);
          }
          stackIn_5_0 = new vla(param1, this);
          return (at) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vja.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 >= 84) {
          if (null != jea.field_c) {
            dg.g(dg.field_f, dg.field_j, -dg.field_f + dg.field_h, dg.field_k - dg.field_j);
            jea.field_c.a(param1, 7802);
          }
          return;
        }
    }

    vja(int param0, lu param1) {
        super(1, param0, param1);
        int var3_int = 0;
        int var4 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.b(16711935);
          this.field_q = 7 & var3_int;
          stackIn_4_1 = ((64 & var3_int) != 0);
          this.field_n = stackIn_4_1;
          stackIn_7_1 = ((var3_int & 128) != 0);
          this.field_r = stackIn_7_1;
          stackIn_10_1 = ((32 & var3_int) != 0);
          this.field_s = stackIn_10_1;
          this.field_p = param1.b(16711935);
          this.field_o = new eaa();
          var4 = param1.b(16711935);
          while (true) {
            var4--;
            if (var4 < 0) {
              return;
            }
            this.field_o.a(dca.a((byte) 102, param1), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("vja.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    void a(op param0, boolean param1) {
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        pp var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var6_ref_aga = null;
        int var7 = 0;
        int var8 = 0;
        lu var9 = null;
        aga var10 = null;
        var8 = BachelorFridge.field_y;
        try {
          if (param1) {
            var9 = (lu) null;
            this.a((byte) 108, (lu) null);
          }
          var10 = this.field_l.a(20, param0);
          if (var10.i(55)) {
            return;
          }
          if (0 != this.field_q) {
            var10.field_s = this.field_q;
          }
          var4 = (pp) (this.field_o.b((byte) 90));
          var10.d(this.field_k, (byte) -94);
          if (!this.field_r &&
            !this.field_n) {
            var5 = 0;
            while (true) {
              if (var4 == null) {
                if ((0 == var5 ||
                  this.field_k != 68) &&
                  (this.field_k != 69 &&
                  this.field_k != 70)) {
                  var6 = ((t) (al.a(-67, this.field_k))).field_s;
                  if (this.field_p == 31) {
                    var6 = 0;
                  }
                  if (var6 == 0) {
                    return;
                  }
                  var10.a(var6, var10, (byte) 2);
                  return;
                }
                var10.a(-var5, var10, (byte) 2);
                return;
              }
              if (!(var4 instanceof iv)) {
                var4.a(var10, param0, 12);
                var4 = (pp) (this.field_o.c(0));
                continue;
              }
              var6_ref_aga = var4.field_h.a(91, param0);
              if (!((iv) (var4)).field_j) {
                if (var6_ref_aga.a(13, (byte) -95)) {
                  var10.a(5, var6_ref_aga, (byte) 2);
                }
                var5 = var4.field_f;
                if (var6_ref_aga.i(-120)) {
                  var5 = 0;
                }
              }
              if (!(this instanceof hba)) {
                ((iv) (var4)).a((byte) -66, var10, param0, this.field_q);
                var4 = (pp) (this.field_o.c(0));
                continue;
              }
              var7 = nn.a(var6_ref_aga, var10, (byte) 104);
              ((iv) (var4)).a((byte) -21, var10, param0, var7);
              var4 = (pp) (this.field_o.c(0));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("vja.K(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        if (param0 >= -20) {
          this.field_s = false;
          if (this.field_r) {
            return true;
          }
          if (!this.field_n) {
            return this.field_s ? true : false;
          }
          return true;
        }
        if (this.field_r) {
          return true;
        }
        if (this.field_n) {
          return true;
        }
        if (!this.field_s) {
          return false;
        }
        return true;
    }

    static {
    }
}
