/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends nk implements wk {
    static oa field_T;
    static int[] field_Y;
    private int field_V;
    static ga field_X;
    static String field_S;
    private ia field_W;
    static int field_U;

    final void a(int param0, n param1, int param2, byte param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_V = -param0 + (nc.field_g - this.field_k);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "jb.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void p(int param0) {
        field_Y = null;
        field_X = null;
        field_S = null;
        if (param0 != 7950) {
            return;
        }
        field_T = null;
    }

    final void f(byte param0) {
        super.f((byte) -104);
        int var2 = -106 % ((param0 - -44) / 59);
        if (!(this.field_W == null)) {
            this.field_W.a(21871);
        }
    }

    final void a(byte param0, ia param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_W = param1;
              if (param0 > 35) {
                break L1;
              } else {
                field_X = (ga) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jb.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final ia a(int param0) {
        if (param0 != 1) {
            this.a(106);
            return this.field_W;
        }
        return this.field_W;
    }

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        vd var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ug.a(param0, 0);
              da.a(false, qd.field_g, 22676);
              if (param1 < -46) {
                break L1;
              } else {
                var3 = (vd) null;
                jb.a((wd[]) null, -122, false, 107, (vd) null, 44);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jb.G(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    jb(String param0, tb param1, int param2) {
        super(param0, param1, param2);
    }

    final String f(int param0) {
        if (this.field_p) {
          if (null == this.field_z) {
            return null;
          } else {
            uh.a(rf.field_X, param0, this.field_x + -this.field_V + nc.field_g);
            return this.field_z;
          }
        } else {
          return null;
        }
    }

    final static void a(wd[] param0, int param1, boolean param2, int param3, vd param4, int param5) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        uh var6 = null;
        RuntimeException var6_ref = null;
        uh var7 = null;
        wd var8 = null;
        qm var9 = null;
        qm var10 = null;
        int var11 = 0;
        int var12 = 0;
        wd var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        uh var19 = null;
        qm var20 = null;
        uh var21 = null;
        qm var22 = null;
        uh var23 = null;
        uh var24 = null;
        qm var25 = null;
        qm var26 = null;
        qm var27 = null;
        qm var28 = null;
        var18 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param5 < param1) {
                jb.a(param0, param1, param2, 116, param4, param0.length);
                jb.a(param0, 0, param2, 107, param4, param5);
                break L1;
              } else {
                break L1;
              }
            }
            var19 = o.a((byte) 37);
            var6 = var19;
            var21 = o.a((byte) 18);
            var7 = var21;
            var8 = param0[param1];
            var20 = var8.k(255);
            var9 = var20;
            if (param3 > 103) {
              var22 = var8.n(3337);
              var10 = var22;
              var19.a(var20.field_h, (byte) 67);
              var19.a(var20.field_f, (byte) 88);
              var21.a(var22.field_h, (byte) 94);
              var21.a(var22.field_f, (byte) 92);
              var11 = var8.field_k;
              var12 = param1;
              L2: while (true) {
                if (param5 <= var12) {
                  param4.a(0.0f, var7.a(-58), var11, var6.a(-52), (byte) 49);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var13 = param0[var12];
                    if (var13.field_k == var11) {
                      break L3;
                    } else {
                      if (param2) {
                        param4.a(0.0f, var7.a(-92), var11, var6.a(-81), (byte) 49);
                        var23 = o.a((byte) 29);
                        var6 = var23;
                        var24 = o.a((byte) 105);
                        var7 = var24;
                        var23.a(var9.field_h, (byte) 101);
                        var23.a(var9.field_f, (byte) 104);
                        var24.a(var10.field_h, (byte) 100);
                        var24.a(var10.field_f, (byte) 99);
                        var11 = var13.field_k;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var14 = var13.f(50);
                  var15 = (int)(var14 / 5.0f) + 1;
                  var16 = 1.0f / (float)var15;
                  var17 = var16;
                  L4: while (true) {
                    if (1.0f <= var17) {
                      var27 = var13.l(8421504);
                      var28 = var13.m(-14);
                      var6.a(var27.field_h, (byte) 101);
                      var6.a(var27.field_f, (byte) 67);
                      var7.a(var28.field_h, (byte) 95);
                      var7.a(var28.field_f, (byte) 108);
                      var12++;
                      continue L2;
                    } else {
                      var25 = var13.c(var17, 109);
                      var26 = var13.a(-851, var17);
                      var6.a(var25.field_h, (byte) 123);
                      var6.a(var25.field_f, (byte) 123);
                      var7.a(var26.field_h, (byte) 83);
                      var7.a(var26.field_f, (byte) 93);
                      var17 = var17 + var16;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6_ref);

            stackIn_20_1 = new StringBuilder().append("jb.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_Y = new int[8192];
        field_U = 0;
        field_S = "Members' Benefits";
    }
}
