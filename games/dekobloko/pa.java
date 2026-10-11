/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends qi {
    static af field_V;
    static volatile int field_bb;
    static int field_Z;
    private int field_cb;
    static int field_Y;
    private nb field_X;
    static ck field_U;
    private ck field_eb;
    static String[] field_db;
    private String field_ab;
    static String[] field_gb;
    static int field_fb;
    static String field_W;

    pa(nb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, vh.a(1424));
        try {
          this.field_ab = param1;
          this.field_X = param0;
          this.b(param5, param4, param2, param3, -16555);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        tb var6;
        int var9;
        int var10;
        int var13;
        ce var14;
        String var18;
        Object var19;
        ck var20;
        ck var21;
        Object var26;
        Object var33;
        nl var40;
        String var5;
        int var11;
        int var12;
        ck var17;
        ck var22;
        ck var23;
        ck var24;
        ck var25;
        ck var27;
        ck var28;
        ck var29;
        ck var30;
        ck var31;
        ck var32;
        ck var34;
        ck var35;
        ck var36;
        ck var37;
        ck var38;
        ck var39;
        nl var41;
        nl var42;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var10Lifetime4;
        int var11Lifetime4;
        int var12Lifetime4;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        tb var6Lifetime1;
        tb var6Lifetime2;
        ce var14Lifetime1;
        ce var14Lifetime2;
        var19 = null;
        var26 = null;
        var33 = null;
        var13 = client.field_A ? 1 : 0;
        var6 = this.field_X.a(20350);
        if (var6 == le.field_o) {
          var18 = qi.field_T;
          if (!var18.equals(this.field_E)) {
            this.field_E = var18;
            this.a(2874);
          }
          super.a(param0, -105, param2, param3);
          var6 = this.field_X.a(20350);
          var40 = (nl) ((Object) this.field_p);
          var9 = this.field_u + param0;
          if (param1 >= -103) {
            var14 = (ce) null;
            this.a(true, (ce) null);
            var10 = var40.a(param3, 0, (ce) (this)) + (var40.a((ce) (this), (byte) 44).b(-1) >> 1);
            if (le.field_o != var6 &&
              jb.field_j != var6) {
              if (var6 == vm.field_u) {
                var20 = tl.field_u[2];
                var20.f(var9, var10 - (var20.field_H >> 1), 256);
                return;
              }
              if (var6 != dc.field_b) {
                return;
              }
              var21 = tl.field_u[1];
              var21.f(var9, var10 - (var21.field_H >> 1), 256);
              return;
            }
            var22 = tl.field_u[0];
            var11 = var22.field_K << 1;
            var12 = var22.field_C << 1;
            if (this.field_eb != null &&
              var11 <= this.field_eb.field_I &&
              var12 <= this.field_eb.field_H) {
              tb.a(true, this.field_eb);
              hk.b();
            } else {
              this.field_eb = new ck(var11, var12);
              tb.a(true, this.field_eb);
            }
            var22.a(112, 144, var22.field_K << 4, var22.field_C << 4, -this.field_cb << 10, 4096);
            mk.a((byte) -5);
            this.field_eb.f(var9 - (var22.field_K >> 1), var10 - var22.field_C, 256);
            return;
          }
          var10Lifetime4 = var40.a(param3, 0, (ce) (this)) + (var40.a((ce) (this), (byte) 44).b(-1) >> 1);
          if (le.field_o != var6 &&
            jb.field_j != var6) {
            if (var6 == vm.field_u) {
              var23 = tl.field_u[2];
              var23.f(var9, var10Lifetime4 - (var23.field_H >> 1), 256);
              return;
            }
            if (var6 != dc.field_b) {
              return;
            }
            var24 = tl.field_u[1];
            var24.f(var9, var10Lifetime4 - (var24.field_H >> 1), 256);
            return;
          }
          var25 = tl.field_u[0];
          var11Lifetime4 = var25.field_K << 1;
          var12Lifetime4 = var25.field_C << 1;
          if (this.field_eb == null) {
            this.field_eb = new ck(var11Lifetime4, var12Lifetime4);
            tb.a(true, this.field_eb);
          } else {
            if (var11Lifetime4 > this.field_eb.field_I) {
              this.field_eb = new ck(var11Lifetime4, var12Lifetime4);
              tb.a(true, this.field_eb);
            } else {
              if (var12Lifetime4 > this.field_eb.field_H) {
                this.field_eb = new ck(var11Lifetime4, var12Lifetime4);
                tb.a(true, this.field_eb);
              } else {
                tb.a(true, this.field_eb);
                hk.b();
              }
            }
          }
          var25.a(112, 144, var25.field_K << 4, var25.field_C << 4, -this.field_cb << 10, 4096);
          mk.a((byte) -5);
          this.field_eb.f(var9 - (var25.field_K >> 1), var10Lifetime4 - var25.field_C, 256);
          return;
        }
        if (jb.field_j != var6) {
          var5 = this.field_X.b((byte) 107);
          if (var5 == null) {
            var5 = this.field_ab;
          }
        } else {
          var5 = qi.field_T;
        }
        if (var5.equals(this.field_E)) {
          super.a(param0, -105, param2, param3);
          var6Lifetime1 = this.field_X.a(20350);
          var41 = (nl) ((Object) this.field_p);
          var9Lifetime1 = this.field_u + param0;
          if (param1 >= -103) {
            var14Lifetime1 = (ce) null;
            this.a(true, (ce) null);
            var10Lifetime1 = var41.a(param3, 0, (ce) (this)) + (var41.a((ce) (this), (byte) 44).b(-1) >> 1);
            if (le.field_o != var6Lifetime1 &&
              jb.field_j != var6Lifetime1) {
              if (var6Lifetime1 == vm.field_u) {
                var27 = tl.field_u[2];
                var27.f(var9Lifetime1, var10Lifetime1 - (var27.field_H >> 1), 256);
                return;
              }
              if (var6Lifetime1 != dc.field_b) {
                return;
              }
              var28 = tl.field_u[1];
              var28.f(var9Lifetime1, var10Lifetime1 - (var28.field_H >> 1), 256);
              return;
            }
            var29 = tl.field_u[0];
            var11Lifetime1 = var29.field_K << 1;
            var12Lifetime1 = var29.field_C << 1;
            if (this.field_eb != null &&
              var11Lifetime1 <= this.field_eb.field_I &&
              var12Lifetime1 <= this.field_eb.field_H) {
              tb.a(true, this.field_eb);
              hk.b();
            } else {
              this.field_eb = new ck(var11Lifetime1, var12Lifetime1);
              tb.a(true, this.field_eb);
            }
            var29.a(112, 144, var29.field_K << 4, var29.field_C << 4, -this.field_cb << 10, 4096);
            mk.a((byte) -5);
            this.field_eb.f(var9Lifetime1 - (var29.field_K >> 1), var10Lifetime1 - var29.field_C, 256);
            return;
          }
          var10Lifetime1Lifetime1 = var41.a(param3, 0, (ce) (this)) + (var41.a((ce) (this), (byte) 44).b(-1) >> 1);
          if (le.field_o != var6Lifetime1 &&
            jb.field_j != var6Lifetime1) {
            if (var6Lifetime1 == vm.field_u) {
              var30 = tl.field_u[2];
              var30.f(var9Lifetime1, var10Lifetime1Lifetime1 - (var30.field_H >> 1), 256);
              return;
            }
            if (var6Lifetime1 != dc.field_b) {
              return;
            }
            var31 = tl.field_u[1];
            var31.f(var9Lifetime1, var10Lifetime1Lifetime1 - (var31.field_H >> 1), 256);
            return;
          }
          var32 = tl.field_u[0];
          var11Lifetime1Lifetime1 = var32.field_K << 1;
          var12Lifetime1Lifetime1 = var32.field_C << 1;
          if (this.field_eb == null) {
            this.field_eb = new ck(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            tb.a(true, this.field_eb);
          } else {
            if (var11Lifetime1Lifetime1 > this.field_eb.field_I) {
              this.field_eb = new ck(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              tb.a(true, this.field_eb);
            } else {
              if (var12Lifetime1Lifetime1 > this.field_eb.field_H) {
                this.field_eb = new ck(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
                tb.a(true, this.field_eb);
              } else {
                tb.a(true, this.field_eb);
                hk.b();
              }
            }
          }
          var32.a(112, 144, var32.field_K << 4, var32.field_C << 4, -this.field_cb << 10, 4096);
          mk.a((byte) -5);
          this.field_eb.f(var9Lifetime1 - (var32.field_K >> 1), var10Lifetime1Lifetime1 - var32.field_C, 256);
          return;
        }
        this.field_E = var5;
        this.a(2874);
        super.a(param0, -105, param2, param3);
        var6Lifetime2 = this.field_X.a(20350);
        var42 = (nl) ((Object) this.field_p);
        var9Lifetime2 = this.field_u + param0;
        if (param1 < -103) {
          var10Lifetime2 = var42.a(param3, 0, (ce) (this)) + (var42.a((ce) (this), (byte) 44).b(-1) >> 1);
          if (le.field_o != var6Lifetime2 &&
            jb.field_j != var6Lifetime2) {
            if (var6Lifetime2 == vm.field_u) {
              var37 = tl.field_u[2];
              var37.f(var9Lifetime2, var10Lifetime2 - (var37.field_H >> 1), 256);
              return;
            }
            if (var6Lifetime2 != dc.field_b) {
              return;
            }
            var38 = tl.field_u[1];
            var38.f(var9Lifetime2, var10Lifetime2 - (var38.field_H >> 1), 256);
            return;
          }
          var39 = tl.field_u[0];
          var11Lifetime2 = var39.field_K << 1;
          var12Lifetime2 = var39.field_C << 1;
          if (this.field_eb == null) {
            this.field_eb = new ck(var11Lifetime2, var12Lifetime2);
            tb.a(true, this.field_eb);
          } else {
            if (var11Lifetime2 > this.field_eb.field_I) {
              this.field_eb = new ck(var11Lifetime2, var12Lifetime2);
              tb.a(true, this.field_eb);
            } else {
              if (var12Lifetime2 <= this.field_eb.field_H) {
                tb.a(true, this.field_eb);
                hk.b();
              } else {
                this.field_eb = new ck(var11Lifetime2, var12Lifetime2);
                tb.a(true, this.field_eb);
              }
            }
          }
          var39.a(112, 144, var39.field_K << 4, var39.field_C << 4, -this.field_cb << 10, 4096);
          mk.a((byte) -5);
          this.field_eb.f(var9Lifetime2 - (var39.field_K >> 1), var10Lifetime2 - var39.field_C, 256);
          return;
        }
        var14Lifetime2 = (ce) null;
        this.a(true, (ce) null);
        var10Lifetime3 = var42.a(param3, 0, (ce) (this)) + (var42.a((ce) (this), (byte) 44).b(-1) >> 1);
        if (le.field_o != var6Lifetime2 &&
          jb.field_j != var6Lifetime2) {
          if (var6Lifetime2 == vm.field_u) {
            var34 = tl.field_u[2];
            var34.f(var9Lifetime2, var10Lifetime3 - (var34.field_H >> 1), 256);
            return;
          }
          if (var6Lifetime2 != dc.field_b) {
            return;
          }
          var35 = tl.field_u[1];
          var35.f(var9Lifetime2, var10Lifetime3 - (var35.field_H >> 1), 256);
          return;
        }
        var36 = tl.field_u[0];
        var17 = var36;
        var11Lifetime3 = var36.field_K << 1;
        var12Lifetime3 = var36.field_C << 1;
        if (this.field_eb == null) {
          this.field_eb = new ck(var11Lifetime3, var12Lifetime3);
          tb.a(true, this.field_eb);
        } else {
          if (var11Lifetime3 > this.field_eb.field_I) {
            this.field_eb = new ck(var11Lifetime3, var12Lifetime3);
            tb.a(true, this.field_eb);
          } else {
            if (var12Lifetime3 <= this.field_eb.field_H) {
              tb.a(true, this.field_eb);
              hk.b();
            } else {
              this.field_eb = new ck(var11Lifetime3, var12Lifetime3);
              tb.a(true, this.field_eb);
            }
          }
        }
        var36.a(112, 144, var36.field_K << 4, var36.field_C << 4, -this.field_cb << 10, 4096);
        mk.a((byte) -5);
        this.field_eb.f(var9Lifetime2 - (var36.field_K >> 1), var10Lifetime3 - var36.field_C, 256);
        return;
    }

    public static void h(byte param0) {
        field_U = null;
        field_db = null;
        field_gb = null;
        if (param0 > 19) {
          field_V = null;
          field_W = null;
          return;
        }
        field_bb = -63;
        field_V = null;
        field_W = null;
    }

    final static int b(int param0, int param1) {
        if (param0 < 4) {
          throw new IllegalArgumentException();
        }
        if (param1 > 45) {
          return 400 + 50 * (-2 + param0) * (param0 - 3);
        }
        field_W = (String) null;
        return 400 + 50 * (-2 + param0) * (param0 - 3);
    }

    final boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pa.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final String c(byte param0) {
        if (param0 == 113) {
          return null;
        }
        ce var3 = (ce) null;
        this.a((ce) null, -51, 86, -72);
        return null;
    }

    final static void g(byte param0) {
        int var1 = (-640 + wj.field_Lb) / 2;
        int var2 = dl.field_M * dl.field_M;
        int var3 = var2 - lg.field_W * lg.field_W;
        int var4 = 50 / ((param0 - 51) / 46);
        g.field_R.a(199, 0, 90, -90 + (-120 + hk.field_i) - 4, -(var3 * 199 / var2) + var1);
        wm.field_h.a(438, 0, 0, -4 + (hk.field_i - 120), 202 + (var1 + 438 * var3 / var2));
    }

    final void a(ce param0, int param1, int param2, int param3) {
        try {
          this.field_cb = this.field_cb + 1;
          if (param1 <= 38) {
            field_gb = (String[]) null;
          }
          super.a(param0, 109, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "pa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_bb = 0;
        field_Z = -1;
        field_V = new af();
        field_gb = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_W = "Eight-bit";
    }
}
