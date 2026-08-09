/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gna extends sna {
    private sna field_wb;
    sna field_vb;

    final static void f(byte param0) {
        int var1 = 20 % ((-9 - param0) / 54);
        bja.a(new kv(fi.field_p, (java.awt.Component) ((Object) dca.field_y)), 6, ep.field_m);
    }

    gna(long param0, sna param1, sna param2, sna param3, kv param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_wb = new sna(0L, param2);
                this.field_wb.field_v = param4;
                this.a(-1, this.field_wb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_vb = new sna(0L, param3, param5);
                this.a(-1, this.field_vb);
                this.d((byte) 121);
                break L2;
              } else {
                this.d((byte) 121);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("gna.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, kv param6, int param7, int param8) {
        try {
            if (param1 >= -90) {
                gna.a(11, (byte) 124, -90, -102);
            }
            lu.a(0, param6, 0, (byte) -4, 0, param0, param7, 0, param2, 0, param4, dg.field_e, param5, param6.field_v, param3, param8, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gna.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        if (param0) {
          L0: {
            var4 = -param1;
            var5 = -param1;
            if (null == this.field_wb) {
              break L0;
            } else {
              var4 = this.field_wb.e(-1);
              break L0;
            }
          }
          L1: {
            if (this.field_vb == null) {
              break L1;
            } else {
              var5 = this.field_vb.b(-param2 + (-var4 + -param2 + this.field_sb + -param1), 127);
              break L1;
            }
          }
          L2: {
            var6 = param2 + (param2 + (var4 - -param1 - -var5));
            if (this.field_sb < var6) {
              var5 = var5 + (this.field_sb - var6);
              var6 = this.field_sb;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (1 == this.field_N) {
              param2 = param2 + (-var6 + this.field_sb) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (2 != this.field_N) {
              break L4;
            } else {
              param2 = param2 + (this.field_sb - var6);
              break L4;
            }
          }
          L5: {
            if (this.field_wb != null) {
              this.field_wb.a(this.field_p, 31407, var4, param2, 0);
              this.field_wb.field_Y = this.field_Y;
              break L5;
            } else {
              break L5;
            }
          }
          if (null != this.field_vb) {
            this.field_vb.a(this.field_p, 31407, var5, param1 + param2 - -var4, 0);
            this.field_vb.field_Y = this.field_Y;
            if (this.field_wb != null) {
              this.field_vb.field_N = 0;
              return;
            } else {
              this.field_vb.field_N = this.field_N;
              return;
            }
          } else {
            return;
          }
        } else {
          L6: {
            this.field_wb = (sna) null;
            var4 = -param1;
            var5 = -param1;
            if (null == this.field_wb) {
              break L6;
            } else {
              var4 = this.field_wb.e(-1);
              break L6;
            }
          }
          L7: {
            if (this.field_vb == null) {
              break L7;
            } else {
              var5 = this.field_vb.b(-param2 + (-var4 + -param2 + this.field_sb + -param1), 127);
              break L7;
            }
          }
          L8: {
            var6 = param2 + (param2 + (var4 - -param1 - -var5));
            if (this.field_sb < var6) {
              var5 = var5 + (this.field_sb - var6);
              var6 = this.field_sb;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (1 == this.field_N) {
              param2 = param2 + (-var6 + this.field_sb) / 2;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (2 != this.field_N) {
              break L10;
            } else {
              param2 = param2 + (this.field_sb - var6);
              break L10;
            }
          }
          L11: {
            if (this.field_wb != null) {
              this.field_wb.a(this.field_p, 31407, var4, param2, 0);
              this.field_wb.field_Y = this.field_Y;
              break L11;
            } else {
              break L11;
            }
          }
          if (null != this.field_vb) {
            this.field_vb.a(this.field_p, 31407, var5, param1 + param2 - -var4, 0);
            this.field_vb.field_Y = this.field_Y;
            if (this.field_wb != null) {
              this.field_vb.field_N = 0;
              return;
            } else {
              this.field_vb.field_N = this.field_N;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, int[] param1, String param2, int param3, boolean param4, int param5) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        try {
          L0: {
            L1: {
              k.c(3685);
              var12 = dg.field_e;
              var11 = var12;
              var10 = var11;
              var6 = var10;
              var7 = dg.field_i;
              var8 = dg.field_c;
              if (null == sca.field_a) {
                break L1;
              } else {
                if (lo.field_b == null) {
                  break L1;
                } else {
                  L2: {
                    param5 = param5 - (lo.field_b.field_F + -lo.field_b.field_B);
                    var9 = lo.field_b.a(param2) - -10;
                    sca.field_a.b();
                    if (-2 == (1 & var9 ^ -1)) {
                      var9++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    dg.d();
                    lo.field_b.c(param2, 5, 3 + lo.field_b.field_u, 0, -1);
                    dg.a(var12, var7, var8);
                    fk.d((byte) -111);
                    if (!param4) {
                      break L3;
                    } else {
                      gna.f((byte) -62);
                      break L3;
                    }
                  }
                  if (param0) {
                    cn.a((byte) -63, var9, ap.field_c, param1, param3, param5, sca.field_a);
                    return;
                  } else {
                    uma.a(var9, param3, 0, sca.field_a, param5, param1);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6_ref);

            stackIn_15_1 = new StringBuilder().append("gna.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        var4 = -param1;
        var5 = -param1;
        if (param0 <= 117) {
          L0: {
            gna.f((byte) 127);
            if (this.field_wb == null) {
              break L0;
            } else {
              var4 = this.field_wb.e(-1);
              break L0;
            }
          }
          L1: {
            if (null == this.field_vb) {
              break L1;
            } else {
              var5 = this.field_vb.e(-1);
              break L1;
            }
          }
          return var5 + (var4 + param2 + (param1 - -param2));
        } else {
          L2: {
            if (this.field_wb == null) {
              break L2;
            } else {
              var4 = this.field_wb.e(-1);
              break L2;
            }
          }
          L3: {
            if (null == this.field_vb) {
              break L3;
            } else {
              var5 = this.field_vb.e(-1);
              break L3;
            }
          }
          return var5 + (var4 + param2 + (param1 - -param2));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        this.a(param2, 31407, param0, param3, param6);
        int var8 = -127 / ((param5 - -43) / 32);
        this.a(true, param4, param1);
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == 255) {
              var3_int = 0;
              L1: while (true) {
                if (0 >= param1) {
                  stackIn_8_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = var3_int << 522560609 | param2 & 1;
                  param1--;
                  param2 = param2 >>> 1;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 109;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "gna.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        int var4 = 23 / ((18 - param1) / 44);
        return param0 << -1449851728 & 16766326 | (1409286399 & param3) << -989012056 | 255 & param2;
    }

    static {
    }
}
