/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    private p[] field_a;
    private ob field_i;
    private ar field_e;
    static u field_b;
    private rn field_d;
    private java.math.BigInteger field_g;
    private java.math.BigInteger field_j;
    static qr field_f;
    private tk field_c;
    static int field_h;

    public static void a(byte param0) {
        field_f = null;
        int var1 = -35 / ((param0 - 66) / 45);
        field_b = null;
    }

    final p a(boolean param0, int param1, ua param2, ua param3, boolean param4) {
        p stackIn_9_0 = null;
        p stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        p var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_i != null) {
              L1: {
                if (-1 < (param1 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_a.length <= param1) {
                    break L1;
                  } else {
                    if (null != this.field_a[param1]) {
                      stackIn_9_0 = this.field_a[param1];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_i.field_j = 72 * param1 + 6;
                        var6_int = this.field_i.a(16711680);
                        if (!param0) {
                          break L2;
                        } else {
                          this.field_j = (java.math.BigInteger) null;
                          break L2;
                        }
                      }
                      var7 = this.field_i.a(16711680);
                      var13 = new byte[64];
                      this.field_i.a(64, 0, 17469032, var13);
                      var9 = new p(param1, param3, param2, this.field_e, this.field_d, var6_int, var13, var7, param4);
                      this.field_a[param1] = var9;
                      stackIn_13_0 = (p) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("tj.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static bi[] a(boolean param0, int param1, boolean param2, int param3, int param4, byte param5) {
        bi var13 = null;
        bi var14 = null;
        int[] var16 = gf.field_h;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = gf.field_b;
        int var8 = gf.field_k;
        bi var9 = new bi(16, param3);
        var9.e();
        gf.i(0, 0, 16, param3, param4, param1);
        Object var10 = null;
        if (param0) {
            var13 = var9.g();
            var10 = var13;
            var13.e();
            gf.f(0, 0, 5, 0);
            gf.f(0, 1, 3, 0);
            gf.f(0, 2, 2, 0);
            gf.f(0, 3, 1, 0);
            gf.f(0, 4, 1, 0);
        }
        if (param5 >= -22) {
            field_b = (u) null;
        }
        Object var11 = null;
        if (param2) {
            var14 = var9.g();
            var11 = var14;
            var14.e();
            gf.f(11, 0, 5, 0);
            gf.f(13, 1, 3, 0);
            gf.f(14, 2, 2, 0);
            gf.f(15, 3, 1, 0);
            gf.f(15, 4, 1, 0);
        }
        gf.a(var16, var7, var8);
        return new bi[]{null, null, null, (bi) (var10), var9, (bi) (var11), null, null, null};
    }

    final static int a(int param0) {
        if (param0 != 0) {
            field_f = (qr) null;
        }
        return (int)(1000000000L / vg.field_i);
    }

    tj(ar param0, rn param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0, int param1, long param2) {
        sl var4 = js.field_f;
        var4.h(param1, 255);
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        int var6 = 1 % ((30 - param0) / 59);
        var4.c(6, (byte) -72);
        var4.b(-16426, param2);
        var4.b(-var5 + var4.field_j, (byte) 118);
    }

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == this.field_a) {
          return;
        } else {
          var3 = -3 % ((-53 - param0) / 38);
          var2 = 0;
          L0: while (true) {
            if (this.field_a.length <= var2) {
              var2 = 0;
              L1: while (true) {
                if (this.field_a.length <= var2) {
                  return;
                } else {
                  if (null != this.field_a[var2]) {
                    this.field_a[var2].b(false);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (this.field_a[var2] != null) {
                this.field_a[var2].a((byte) 65);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        ob var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != this.field_i) {
          return true;
        } else {
          L0: {
            if (null != this.field_c) {
              break L0;
            } else {
              if (this.field_e.c(27356)) {
                return false;
              } else {
                this.field_c = this.field_e.a(true, 255, (byte) 0, -2057056416, 255);
                break L0;
              }
            }
          }
          if (this.field_c.field_u) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new ob(this.field_c.e((byte) 91));
                var10.field_j = 5;
                var3 = var10.j(-120);
                var10.field_j = var10.field_j + 72 * var3;
                var13 = new byte[-var10.field_j + var10.field_h.length];
                var11 = var13;
                var4 = var11;
                var10.a(var13.length, 0, 17469032, var13);
                if (null == this.field_g) {
                  break L2;
                } else {
                  if (null == this.field_j) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_j);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length == 65) {
              var15 = dp.a(var10.field_h, -5 + -var13.length + var10.field_j, -26131, 5);
              var7 = 0;
              L3: while (true) {
                if (var7 >= 64) {
                  this.field_a = new p[var3];
                  this.field_i = var10;
                  if (param0 >= 86) {
                    return true;
                  } else {
                    field_h = -8;
                    return true;
                  }
                } else {
                  if ((var5[var7 - -1] ^ -1) != (var15[var7] ^ -1)) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    private tj(ar param0, rn param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_d = param1;
              this.field_j = param3;
              this.field_e = param0;
              this.field_g = param2;
              if (this.field_e.c(27356)) {
                break L1;
              } else {
                this.field_c = this.field_e.a(true, 255, (byte) 0, -2057056416, 255);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("tj.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_b = new u();
    }
}
