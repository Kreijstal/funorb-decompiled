/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends lg {
    private int field_Q;
    static int field_P;
    private String field_S;
    static int field_Y;
    static jp[] field_W;
    static boolean field_V;
    private jp field_X;
    private ia field_R;
    static String field_T;
    static jp field_U;

    final boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nf.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final String d(int param0) {
        if (param0 > 6) {
          return null;
        }
        return (String) null;
    }

    nf(ia param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, dn.g(-23009));
        try {
          this.field_R = param0;
          this.field_S = param1;
          this.a(param5, param2, param3, (byte) -119, param4);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "nf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        po.a(13);
        if (param0 != 109) {
          field_T = (String) null;
        }
    }

    public static void f(byte param0) {
        field_W = null;
        field_U = null;
        field_T = null;
        if (param0 >= -18) {
          nf.a((byte) 48);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        qh var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        qe var18_ref;
        jp var19;
        jp var20;
        Object var22;
        Object var27;
        Object var31;
        Object var36;
        Object var40;
        Object var44;
        Object var50;
        String var5;
        int var11;
        int var12;
        jp var16;
        jp var21;
        qe var22_ref;
        jp var23;
        jp var24;
        jp var25;
        String var26;
        qe var27_ref;
        jp var28;
        jp var29;
        jp var30;
        qe var31_ref;
        jp var32;
        jp var33;
        jp var34;
        String var35;
        qe var36_ref;
        jp var37;
        jp var38;
        jp var39;
        qe var40_ref;
        jp var41;
        jp var42;
        jp var43;
        qe var44_ref;
        jp var45;
        jp var46;
        jp var47;
        qe var50_ref;
        jp var51;
        jp var52;
        jp var53;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var9Lifetime5;
        int var10Lifetime5;
        int var11Lifetime5;
        int var12Lifetime5;
        int var9Lifetime1Lifetime1;
        int var9Lifetime2Lifetime1;
        int var10Lifetime1Lifetime1;
        int var10Lifetime2Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime2Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        qh var6Lifetime1;
        qh var6Lifetime2;
        qh var6Lifetime3;
        String var5Lifetime1;
        qh var6Lifetime1Lifetime1;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var40 = null;
        var44 = null;
        var50 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        var6 = this.field_R.b((byte) -31);
        if (var6 == m.field_c) {
          var17 = jb.field_G;
          if (!var17.equals(this.field_A)) {
            this.field_A = var17;
            this.i(param3 + 10);
            super.a(param0, param1, param2, param3);
            var6 = this.field_R.b((byte) -31);
            var18_ref = (qe) ((Object) this.field_l);
            var9 = param1 + this.field_o;
            var10 = var18_ref.a(param0, (byte) -107, (oc) (this)) + (var18_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
            if (var6 != m.field_c &&
              var6 != hq.field_z) {
              if (lp.field_xb == var6) {
                var19 = df.field_a[2];
                var19.f(var9, var10 - (var19.field_C >> 1), 256);
                return;
              }
              if (ae.field_c != var6) {
                return;
              }
              var20 = df.field_a[1];
              var20.f(var9, -(var20.field_C >> 1) + var10, 256);
              return;
            }
            var21 = df.field_a[0];
            var11 = var21.field_x << 1;
            var12 = var21.field_z << 1;
            if (this.field_X != null &&
              var11 <= this.field_X.field_D &&
              this.field_X.field_C >= var12) {
              fc.a(-70, this.field_X);
              lb.d();
            } else {
              this.field_X = new jp(var11, var12);
              fc.a(-86, this.field_X);
            }
            var21.a(112, 144, var21.field_x << 4, var21.field_z << 4, -this.field_Q << 10, 4096);
            sc.b(-111);
            this.field_X.f(-(var21.field_x >> 1) + var9, -var21.field_z + var10, 256);
            return;
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_R.b((byte) -31);
          var22_ref = (qe) ((Object) this.field_l);
          var9Lifetime5 = param1 + this.field_o;
          var10Lifetime5 = var22_ref.a(param0, (byte) -107, (oc) (this)) + (var22_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
          if (var6 != m.field_c &&
            var6 != hq.field_z) {
            if (lp.field_xb == var6) {
              var23 = df.field_a[2];
              var23.f(var9Lifetime5, var10Lifetime5 - (var23.field_C >> 1), 256);
              return;
            }
            if (ae.field_c != var6) {
              return;
            }
            var24 = df.field_a[1];
            var24.f(var9Lifetime5, -(var24.field_C >> 1) + var10Lifetime5, 256);
            return;
          }
          var25 = df.field_a[0];
          var11Lifetime5 = var25.field_x << 1;
          var12Lifetime5 = var25.field_z << 1;
          if (this.field_X == null) {
            this.field_X = new jp(var11Lifetime5, var12Lifetime5);
            fc.a(-86, this.field_X);
          } else {
            if (var11Lifetime5 > this.field_X.field_D) {
              this.field_X = new jp(var11Lifetime5, var12Lifetime5);
              fc.a(-86, this.field_X);
            } else {
              if (this.field_X.field_C >= var12Lifetime5) {
                fc.a(-70, this.field_X);
                lb.d();
              } else {
                this.field_X = new jp(var11Lifetime5, var12Lifetime5);
                fc.a(-86, this.field_X);
              }
            }
          }
          var25.a(112, 144, var25.field_x << 4, var25.field_z << 4, -this.field_Q << 10, 4096);
          sc.b(-111);
          this.field_X.f(-(var25.field_x >> 1) + var9Lifetime5, -var25.field_z + var10Lifetime5, 256);
          return;
        }
        if (var6 == hq.field_z) {
          var26 = jb.field_G;
          if (!var26.equals(this.field_A)) {
            this.field_A = var26;
            this.i(param3 + 10);
            super.a(param0, param1, param2, param3);
            var6 = this.field_R.b((byte) -31);
            var27_ref = (qe) ((Object) this.field_l);
            var9Lifetime1 = param1 + this.field_o;
            var10Lifetime1 = var27_ref.a(param0, (byte) -107, (oc) (this)) + (var27_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
            if (var6 != m.field_c &&
              var6 != hq.field_z) {
              if (lp.field_xb == var6) {
                var28 = df.field_a[2];
                var28.f(var9Lifetime1, var10Lifetime1 - (var28.field_C >> 1), 256);
                return;
              }
              if (ae.field_c != var6) {
                return;
              }
              var29 = df.field_a[1];
              var29.f(var9Lifetime1, -(var29.field_C >> 1) + var10Lifetime1, 256);
              return;
            }
            var30 = df.field_a[0];
            var11Lifetime1 = var30.field_x << 1;
            var12Lifetime1 = var30.field_z << 1;
            if (this.field_X != null &&
              var11Lifetime1 <= this.field_X.field_D &&
              this.field_X.field_C >= var12Lifetime1) {
              fc.a(-70, this.field_X);
              lb.d();
            } else {
              this.field_X = new jp(var11Lifetime1, var12Lifetime1);
              fc.a(-86, this.field_X);
            }
            var30.a(112, 144, var30.field_x << 4, var30.field_z << 4, -this.field_Q << 10, 4096);
            sc.b(-111);
            this.field_X.f(-(var30.field_x >> 1) + var9Lifetime1, -var30.field_z + var10Lifetime1, 256);
            return;
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_R.b((byte) -31);
          var31_ref = (qe) ((Object) this.field_l);
          var9Lifetime1Lifetime1 = param1 + this.field_o;
          var10Lifetime1Lifetime1 = var31_ref.a(param0, (byte) -107, (oc) (this)) + (var31_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
          if (var6 != m.field_c &&
            var6 != hq.field_z) {
            if (lp.field_xb == var6) {
              var32 = df.field_a[2];
              var32.f(var9Lifetime1Lifetime1, var10Lifetime1Lifetime1 - (var32.field_C >> 1), 256);
              return;
            }
            if (ae.field_c != var6) {
              return;
            }
            var33 = df.field_a[1];
            var33.f(var9Lifetime1Lifetime1, -(var33.field_C >> 1) + var10Lifetime1Lifetime1, 256);
            return;
          }
          var34 = df.field_a[0];
          var11Lifetime1Lifetime1 = var34.field_x << 1;
          var12Lifetime1Lifetime1 = var34.field_z << 1;
          if (this.field_X == null) {
            this.field_X = new jp(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            fc.a(-86, this.field_X);
          } else {
            if (var11Lifetime1Lifetime1 > this.field_X.field_D) {
              this.field_X = new jp(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              fc.a(-86, this.field_X);
            } else {
              if (this.field_X.field_C >= var12Lifetime1Lifetime1) {
                fc.a(-70, this.field_X);
                lb.d();
              } else {
                this.field_X = new jp(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
                fc.a(-86, this.field_X);
              }
            }
          }
          var34.a(112, 144, var34.field_x << 4, var34.field_z << 4, -this.field_Q << 10, 4096);
          sc.b(-111);
          this.field_X.f(-(var34.field_x >> 1) + var9Lifetime1Lifetime1, -var34.field_z + var10Lifetime1Lifetime1, 256);
          return;
        }
        var5 = this.field_R.a(-118);
        if (var5 != null) {
          if (var5.equals(this.field_A)) {
            super.a(param0, param1, param2, param3);
            var6Lifetime1 = this.field_R.b((byte) -31);
            var50_ref = (qe) ((Object) this.field_l);
            var9Lifetime2 = param1 + this.field_o;
            var10Lifetime2 = var50_ref.a(param0, (byte) -107, (oc) (this)) + (var50_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
            if (var6Lifetime1 != m.field_c &&
              var6Lifetime1 != hq.field_z) {
              if (lp.field_xb == var6Lifetime1) {
                var51 = df.field_a[2];
                var51.f(var9Lifetime2, var10Lifetime2 - (var51.field_C >> 1), 256);
                return;
              }
              if (ae.field_c != var6Lifetime1) {
                return;
              }
              var52 = df.field_a[1];
              var52.f(var9Lifetime2, -(var52.field_C >> 1) + var10Lifetime2, 256);
              return;
            }
            var53 = df.field_a[0];
            var11Lifetime2 = var53.field_x << 1;
            var12Lifetime2 = var53.field_z << 1;
            if (this.field_X != null &&
              var11Lifetime2 <= this.field_X.field_D &&
              this.field_X.field_C >= var12Lifetime2) {
              fc.a(-70, this.field_X);
              lb.d();
            } else {
              this.field_X = new jp(var11Lifetime2, var12Lifetime2);
              fc.a(-86, this.field_X);
            }
            var53.a(112, 144, var53.field_x << 4, var53.field_z << 4, -this.field_Q << 10, 4096);
            sc.b(-111);
            this.field_X.f(-(var53.field_x >> 1) + var9Lifetime2, -var53.field_z + var10Lifetime2, 256);
            return;
          }
          this.field_A = var5;
          this.i(param3 + 10);
          super.a(param0, param1, param2, param3);
          var6Lifetime1Lifetime1 = this.field_R.b((byte) -31);
          var44_ref = (qe) ((Object) this.field_l);
          var9Lifetime2Lifetime1 = param1 + this.field_o;
          var10Lifetime2Lifetime1 = var44_ref.a(param0, (byte) -107, (oc) (this)) + (var44_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
          if (var6Lifetime1Lifetime1 != m.field_c &&
            var6Lifetime1Lifetime1 != hq.field_z) {
            if (lp.field_xb == var6Lifetime1Lifetime1) {
              var45 = df.field_a[2];
              var45.f(var9Lifetime2Lifetime1, var10Lifetime2Lifetime1 - (var45.field_C >> 1), 256);
              return;
            }
            if (ae.field_c != var6Lifetime1Lifetime1) {
              return;
            }
            var46 = df.field_a[1];
            var46.f(var9Lifetime2Lifetime1, -(var46.field_C >> 1) + var10Lifetime2Lifetime1, 256);
            return;
          }
          var47 = df.field_a[0];
          var16 = var47;
          var11Lifetime2Lifetime1 = var47.field_x << 1;
          var12Lifetime2Lifetime1 = var47.field_z << 1;
          if (this.field_X == null) {
            this.field_X = new jp(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
            fc.a(-86, this.field_X);
          } else {
            if (var11Lifetime2Lifetime1 > this.field_X.field_D) {
              this.field_X = new jp(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
              fc.a(-86, this.field_X);
            } else {
              if (this.field_X.field_C >= var12Lifetime2Lifetime1) {
                fc.a(-70, this.field_X);
                lb.d();
              } else {
                this.field_X = new jp(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
                fc.a(-86, this.field_X);
              }
            }
          }
          var47.a(112, 144, var47.field_x << 4, var47.field_z << 4, -this.field_Q << 10, 4096);
          sc.b(-111);
          this.field_X.f(-(var47.field_x >> 1) + var9Lifetime2Lifetime1, -var47.field_z + var10Lifetime2Lifetime1, 256);
          return;
        }
        var35 = this.field_S;
        var5Lifetime1 = var35;
        if (!var35.equals(this.field_A)) {
          this.field_A = var35;
          this.i(param3 + 10);
          super.a(param0, param1, param2, param3);
          var6Lifetime2 = this.field_R.b((byte) -31);
          var36_ref = (qe) ((Object) this.field_l);
          var9Lifetime3 = param1 + this.field_o;
          var10Lifetime3 = var36_ref.a(param0, (byte) -107, (oc) (this)) + (var36_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
          if (var6Lifetime2 != m.field_c &&
            var6Lifetime2 != hq.field_z) {
            if (lp.field_xb == var6Lifetime2) {
              var37 = df.field_a[2];
              var37.f(var9Lifetime3, var10Lifetime3 - (var37.field_C >> 1), 256);
              return;
            }
            if (ae.field_c != var6Lifetime2) {
              return;
            }
            var38 = df.field_a[1];
            var38.f(var9Lifetime3, -(var38.field_C >> 1) + var10Lifetime3, 256);
            return;
          }
          var39 = df.field_a[0];
          var11Lifetime3 = var39.field_x << 1;
          var12Lifetime3 = var39.field_z << 1;
          if (this.field_X != null &&
            var11Lifetime3 <= this.field_X.field_D &&
            this.field_X.field_C >= var12Lifetime3) {
            fc.a(-70, this.field_X);
            lb.d();
          } else {
            this.field_X = new jp(var11Lifetime3, var12Lifetime3);
            fc.a(-86, this.field_X);
          }
          var39.a(112, 144, var39.field_x << 4, var39.field_z << 4, -this.field_Q << 10, 4096);
          sc.b(-111);
          this.field_X.f(-(var39.field_x >> 1) + var9Lifetime3, -var39.field_z + var10Lifetime3, 256);
          return;
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime3 = this.field_R.b((byte) -31);
        var40_ref = (qe) ((Object) this.field_l);
        var9Lifetime4 = param1 + this.field_o;
        var10Lifetime4 = var40_ref.a(param0, (byte) -107, (oc) (this)) + (var40_ref.c((oc) (this), param3 ^ 32).a(0) >> 1);
        if (var6Lifetime3 != m.field_c &&
          var6Lifetime3 != hq.field_z) {
          if (lp.field_xb == var6Lifetime3) {
            var41 = df.field_a[2];
            var41.f(var9Lifetime4, var10Lifetime4 - (var41.field_C >> 1), 256);
            return;
          }
          if (ae.field_c != var6Lifetime3) {
            return;
          }
          var42 = df.field_a[1];
          var42.f(var9Lifetime4, -(var42.field_C >> 1) + var10Lifetime4, 256);
          return;
        }
        var43 = df.field_a[0];
        var11Lifetime4 = var43.field_x << 1;
        var12Lifetime4 = var43.field_z << 1;
        if (this.field_X == null) {
          this.field_X = new jp(var11Lifetime4, var12Lifetime4);
          fc.a(-86, this.field_X);
        } else {
          if (var11Lifetime4 > this.field_X.field_D) {
            this.field_X = new jp(var11Lifetime4, var12Lifetime4);
            fc.a(-86, this.field_X);
          } else {
            if (this.field_X.field_C < var12Lifetime4) {
              this.field_X = new jp(var11Lifetime4, var12Lifetime4);
              fc.a(-86, this.field_X);
            } else {
              fc.a(-70, this.field_X);
              lb.d();
            }
          }
        }
        var43.a(112, 144, var43.field_x << 4, var43.field_z << 4, -this.field_Q << 10, 4096);
        sc.b(-111);
        this.field_X.f(-(var43.field_x >> 1) + var9Lifetime4, -var43.field_z + var10Lifetime4, 256);
        return;
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
          this.field_Q = this.field_Q + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "nf.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_V = false;
        field_T = "You have been removed from <%0>'s game.";
    }
}
