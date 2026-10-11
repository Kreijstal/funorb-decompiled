/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends rb {
    private int field_H;
    private sk field_I;
    private t field_G;
    static sm[] field_L;
    private String field_J;
    static String field_K;

    final void a(int param0, gm param1, int param2, int param3) {
        try {
          this.field_H = this.field_H + 1;
          int var5_int = 44 / ((-28 - param0) / 43);
          super.a(-88, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bj.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        cd var6;
        int var9;
        int var10;
        int var13;
        gm var14;
        String var18;
        Object var19;
        t var20;
        t var21;
        Object var26;
        Object var31;
        fe var35;
        int var11;
        int var12;
        t var17;
        t var22;
        String var25;
        t var27;
        t var28;
        t var29;
        String var30;
        t var32;
        t var33;
        t var34;
        fe var36;
        fe var37;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        cd var6Lifetime1;
        t var17Lifetime1;
        var19 = null;
        var26 = null;
        var31 = null;
        var13 = Torquing.field_u;
        if (param1 > -7) {
          var14 = (gm) null;
          this.a(-111, (gm) null, -90, 97);
        }
        var6 = this.field_I.a((byte) -88);
        if (q.field_a != var6 &&
          gn.field_h != var6) {
          var25 = this.field_I.a(126);
          if (var25 == null) {
            var30 = this.field_J;
            if (!var30.equals(this.field_m)) {
              this.field_m = var30;
              this.a((byte) -36);
            }
            super.a(param0, (byte) -63, param2, param3);
            var6 = this.field_I.a((byte) -84);
            var37 = (fe) ((Object) this.field_q);
            var9 = this.field_w + param3;
            var10 = var37.a((gm) (this), param2, -101) + (var37.b((byte) 116, (gm) (this)).b(false) >> 1);
            if (var6 != q.field_a &&
              var6 != gn.field_h) {
              if (var6 == so.field_u) {
                var33 = wj.field_h[2];
                var33.a(var9, -(var33.field_t >> 1) + var10, 256);
                return;
              }
              if (var6 != so.field_s) {
                return;
              }
              var32 = wj.field_h[1];
              var32.a(var9, -(var32.field_t >> 1) + var10, 256);
              return;
            }
            var34 = wj.field_h[0];
            var11 = var34.field_w << 1;
            var12 = var34.field_u << 1;
            if (this.field_G == null) {
              this.field_G = new t(var11, var12);
              tm.a((byte) 97, this.field_G);
            } else {
              if (var11 > this.field_G.field_s) {
                this.field_G = new t(var11, var12);
                tm.a((byte) 97, this.field_G);
              } else {
                if (var12 > this.field_G.field_t) {
                  this.field_G = new t(var11, var12);
                  tm.a((byte) 97, this.field_G);
                } else {
                  tm.a((byte) 31, this.field_G);
                  ph.b();
                }
              }
            }
            var34.c(112, 144, var34.field_w << 4, var34.field_u << 4, -this.field_H << 10, 4096);
            r.a(126);
            this.field_G.a(var9 - (var34.field_w >> 1), var10 - var34.field_u, 256);
            return;
          }
          if (!var25.equals(this.field_m)) {
            this.field_m = var25;
            this.a((byte) -36);
          }
          super.a(param0, (byte) -63, param2, param3);
          var6 = this.field_I.a((byte) -84);
          var36 = (fe) ((Object) this.field_q);
          var9Lifetime2 = this.field_w + param3;
          var10Lifetime2 = var36.a((gm) (this), param2, -101) + (var36.b((byte) 116, (gm) (this)).b(false) >> 1);
          if (var6 != q.field_a &&
            var6 != gn.field_h) {
            if (var6 == so.field_u) {
              var28 = wj.field_h[2];
              var28.a(var9Lifetime2, -(var28.field_t >> 1) + var10Lifetime2, 256);
              return;
            }
            if (var6 != so.field_s) {
              return;
            }
            var27 = wj.field_h[1];
            var27.a(var9Lifetime2, -(var27.field_t >> 1) + var10Lifetime2, 256);
            return;
          }
          var29 = wj.field_h[0];
          var17 = var29;
          var11Lifetime2 = var29.field_w << 1;
          var12Lifetime2 = var29.field_u << 1;
          if (this.field_G == null) {
            this.field_G = new t(var11Lifetime2, var12Lifetime2);
            tm.a((byte) 97, this.field_G);
          } else {
            if (var11Lifetime2 > this.field_G.field_s) {
              this.field_G = new t(var11Lifetime2, var12Lifetime2);
              tm.a((byte) 97, this.field_G);
            } else {
              if (var12Lifetime2 <= this.field_G.field_t) {
                tm.a((byte) 31, this.field_G);
                ph.b();
              } else {
                this.field_G = new t(var11Lifetime2, var12Lifetime2);
                tm.a((byte) 97, this.field_G);
              }
            }
          }
          var29.c(112, 144, var29.field_w << 4, var29.field_u << 4, -this.field_H << 10, 4096);
          r.a(126);
          this.field_G.a(var9Lifetime2 - (var29.field_w >> 1), var10Lifetime2 - var29.field_u, 256);
          return;
        }
        var18 = rg.field_C;
        if (!var18.equals(this.field_m)) {
          this.field_m = var18;
          this.a((byte) -36);
        }
        super.a(param0, (byte) -63, param2, param3);
        var6Lifetime1 = this.field_I.a((byte) -84);
        var35 = (fe) ((Object) this.field_q);
        var9Lifetime1 = this.field_w + param3;
        var10Lifetime1 = var35.a((gm) (this), param2, -101) + (var35.b((byte) 116, (gm) (this)).b(false) >> 1);
        if (var6Lifetime1 != q.field_a &&
          var6Lifetime1 != gn.field_h) {
          if (var6Lifetime1 == so.field_u) {
            var21 = wj.field_h[2];
            var21.a(var9Lifetime1, -(var21.field_t >> 1) + var10Lifetime1, 256);
          } else {
            if (var6Lifetime1 != so.field_s) {
              return;
            }
            var20 = wj.field_h[1];
            var20.a(var9Lifetime1, -(var20.field_t >> 1) + var10Lifetime1, 256);
          }
          return;
        }
        var22 = wj.field_h[0];
        var17Lifetime1 = var22;
        var11Lifetime1 = var22.field_w << 1;
        var12Lifetime1 = var22.field_u << 1;
        if (this.field_G == null) {
          this.field_G = new t(var11Lifetime1, var12Lifetime1);
          tm.a((byte) 97, this.field_G);
        } else {
          if (var11Lifetime1 > this.field_G.field_s) {
            this.field_G = new t(var11Lifetime1, var12Lifetime1);
            tm.a((byte) 97, this.field_G);
          } else {
            if (var12Lifetime1 <= this.field_G.field_t) {
              tm.a((byte) 31, this.field_G);
              ph.b();
            } else {
              this.field_G = new t(var11Lifetime1, var12Lifetime1);
              tm.a((byte) 97, this.field_G);
            }
          }
        }
        var22.c(112, 144, var22.field_w << 4, var22.field_u << 4, -this.field_H << 10, 4096);
        r.a(126);
        this.field_G.a(var9Lifetime1 - (var22.field_w >> 1), var10Lifetime1 - var22.field_u, 256);
    }

    public static void f(byte param0) {
        if (param0 != -37) {
          bj.f((byte) 58);
          field_L = null;
          field_K = null;
          return;
        }
        field_L = null;
        field_K = null;
    }

    bj(sk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, no.b(true));
        try {
          this.field_J = param1;
          this.field_I = param0;
          this.a((byte) 125, param2, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String b(int param0) {
        if (param0 == 0) {
          return null;
        }
        gm var3 = (gm) null;
        this.a(102, (gm) null, -69, -47);
        return null;
    }

    final boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.a(94, (byte) 61, 68, 60);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bj.JA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_K = "Confirm Password: ";
    }
}
