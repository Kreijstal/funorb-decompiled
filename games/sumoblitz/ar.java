/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ar extends wp {
    static te field_N;
    private s field_J;
    static String field_F;
    private String[] field_I;
    static int field_G;
    private jn field_H;
    static String field_M;
    static wb field_E;
    static tf field_L;

    final void a(int param0, boolean param1, int param2, int param3) {
        this.a(-50, param2, param0, ((de) ((Object) this.field_w)).b((pk) (this), (byte) 116), param3);
        if (param1) {
          pk var6 = (pk) null;
          this.a(-89, -87, (pk) null, -5);
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_M = null;
        field_N = null;
        if (param0 >= -115) {
          field_E = (wb) null;
        }
        field_F = null;
        field_L = null;
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, -117, param2, param3);
          var5_int = 65 % ((param1 + 25) / 45);
          this.field_J = null;
          if (this.field_k) {
            var6 = -this.field_r + (-param0 + ko.field_p);
            var7 = -param3 + (pi.field_e - this.field_v);
            this.field_J = this.b(-40, var6, var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ar.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        db var5_ref_db = null;
        Object var6 = null;
        int var7 = 0;
        byte[] var9 = null;
        lh var10 = null;
        pl var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var11 = ig.field_a;
          var2 = var11.e(-31302);
          var3 = 99 / ((-33 - param0) / 36);
          if (var2 == 0) {
            var10 = (lh) (no.field_d.b(-110));
            if (var10 == null) {
              kk.a((byte) -109);
              return;
            }
            var5 = var11.e(-31302);
            if (var5 != 0) {
              var13 = new byte[var5];
              var12 = var13;
              var9 = var12;
              var6 = var9;
              var11.a(var13, var5, 0, (byte) -47);
            } else {
              var6 = null;
            }
            var11.field_p = var11.field_p + 4;
            if (!var11.e((byte) -9)) {
              kk.a((byte) -127);
              return;
            }
            var10.field_o = true;
            var10.field_m = (byte[]) (var6);
            var10.b(false);
          } else {
            if (var2 == 1) {
              var4 = var11.c(true);
              var5_ref_db = (db) (jj.field_a.b(83));
              while (var5_ref_db != null) {
                if (var4 != var5_ref_db.field_m) {
                  var5_ref_db = (db) (jj.field_a.d((byte) 18));
                  continue;
                }
                break;
              }
              if (var5_ref_db == null) {
                kk.a((byte) -123);
                return;
              }
              var5_ref_db.b(false);
              return;
            }
            ms.a("A1: " + di.b((byte) -9), (Throwable) null, 0);
            kk.a((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ar.E(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        de var3;
        ag var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        tk var12;
        int var13;
        int var14;
        s var15;
        int var16;
        int var7Lifetime1;
        var16 = Sumoblitz.field_L ? 1 : 0;
        this.field_H = new jn();
        var2 = 0;
        var3 = (de) ((Object) this.field_w);
        var4 = var3.b(-3, (pk) (this));
        if (param0 != 9) {
          field_F = (String) null;
        }
        while (true) {
          var5 = this.field_m.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_m.indexOf(">", var5);
          var6 = this.field_m.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_m.indexOf("</hotspot>", var5);
          var8 = var4.b(var5, -17500);
          var9 = var4.b(var2, param0 - 17509);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_a[var11];
            if (~var11 == ~var8) {
              stackIn_8_0 = var4.a((byte) 125, var5);
            } else {
              stackIn_8_0 = var12.field_b[0];
            }
            var13 = stackIn_8_0;
            if (var9 != var11) {
              if (var12 == null) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = var12.field_b[-1 + var12.field_b.length];
              }
            } else {
              stackIn_13_0 = var4.a((byte) 126, var2);
            }
            var14 = stackIn_13_0;
            var15 = new s(var7Lifetime1, var13, var12.field_d, -var13 + var14, Math.max(var3.a(14763), -var12.field_d + var12.field_a));
            if (var10 != null) {
              ((s) (var10)).field_r = var15;
            }
            this.field_H.a((ms) (var15), (byte) 39);
            var10 = var15;
          }
        }
    }

    ar(String param0, mh param1) {
        super(param0, (qm) null);
        this.field_J = null;
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ar.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-114, param1, param2, param3, param4);
        int var6 = -60 / ((param0 - 28) / 63);
        this.a(9);
    }

    boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 61) {
            return false;
          }
          field_N = (te) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ar.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final s b(int param0, int param1, int param2) {
        int var4;
        s var5;
        s var6;
        int var7;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var4 = 22 / ((88 - param0) / 35);
        var5 = (s) (this.field_H.b(124));
        while (var5 != null) {
          var6 = var5;
          while (var6 != null) {
            if (var6.field_s <= param1 &&
              var6.field_l <= param2 &&
              var6.field_t + var6.field_s > param1 &&
              param2 <= var6.field_l + var6.field_p) {
              return var5;
            }
            var6 = var6.field_r;
          }
          var5 = (s) (this.field_H.d((byte) 18));
        }
        return null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) -113, param3);
        if (param3 != 0) {
          return;
        }
        de var9 = (de) ((Object) this.field_w);
        if (param2 >= -35) {
          field_L = (tf) null;
        }
        s var6 = this.field_J;
        if (var6 != null) {
          var7 = var9.a(param0, (pk) (this), 16098);
          var8 = var9.b(param1, (pk) (this), 0);
          do {
            pp.a(-2 + (var6.field_l + var8), var6.field_t + 2, -13181, -2 + (var7 + var6.field_s), 2 + var6.field_p);
            var6 = var6.field_r;
          } while (var6 != null);
        }
    }

    final void a(int param0, String param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 > -44) {
            field_F = (String) null;
          }
          if (null == this.field_I ||
            this.field_I.length <= param2) {
            var7 = new String[1 + param2];
            var8 = var7;
            var4 = var8;
            if (null != this.field_I) {
              for (var5 = 0; var5 < this.field_I.length; var5++) {
                var7[var5] = this.field_I[var5];
              }
            }
            this.field_I = var8;
          }
          this.field_I[param2] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ar.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -this.field_r + param1;
        int var6 = param3 - this.field_v;
        s var7 = this.b(126, var5, var6);
        if (var7 != null &&
          this.field_o != null) {
          ((ca) ((Object) this.field_o)).a(var7.field_q, this, param0, -20036);
        }
    }

    String c(int param0) {
        if (null == this.field_J) {
          return null;
        }
        if (this.field_I == null) {
          return null;
        }
        if (param0 != -6696) {
          field_F = (String) null;
        }
        if (this.field_I.length <= this.field_J.field_q) {
          return null;
        }
        return this.field_I[this.field_J.field_q];
    }

    static {
        field_F = "Connection timed out. Please try using a different server.";
        field_G = 0;
        field_M = "points remaining: <%0>";
        field_N = new te(8);
        field_L = new tf();
    }
}
