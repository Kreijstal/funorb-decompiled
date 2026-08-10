/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fwa {
    private pfa field_i;
    static llb field_a;
    static coa field_g;
    private java.math.BigInteger field_e;
    static int field_h;
    private ga[] field_f;
    private java.math.BigInteger field_b;
    private ona field_j;
    private km field_d;
    private ds field_c;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 5) {
            int[] var2 = (int[]) null;
            fwa.a(69, -75, (int[]) null);
        }
        field_g = null;
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        ds var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = VoidHunters.field_G;
        if (null == this.field_c) {
          L0: {
            if (null != this.field_d) {
              break L0;
            } else {
              if (this.field_j.d(74)) {
                return false;
              } else {
                this.field_d = this.field_j.a(true, -21, 255, (byte) 0, 255);
                break L0;
              }
            }
          }
          if (this.field_d.field_n) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new ds(this.field_d.a(-94));
                var10.field_e = 5;
                var3 = var10.e((byte) -108);
                var10.field_e = var10.field_e + 72 * var3;
                var13 = new byte[var10.field_h.length + -var10.field_e];
                var11 = var13;
                var4 = var11;
                var10.a(0, var4, (byte) -59, var13.length);
                if (null == this.field_b) {
                  break L2;
                } else {
                  if (null == this.field_e) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_e);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var15 = fqb.a((byte) 25, -var13.length + (var10.field_e - 5), var10.field_h, 5);
              if (param0) {
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    this.field_c = var10;
                    this.field_f = new ga[var3];
                    return true;
                  } else {
                    if (var15[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return true;
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        var3 = VoidHunters.field_G;
        if (this.field_f != null) {
          var2 = param0;
          L0: while (true) {
            if (this.field_f.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (var4 >= this.field_f.length) {
                  return;
                } else {
                  if (this.field_f[var4] != null) {
                    this.field_f[var4].b(-83);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != this.field_f[var2]) {
                this.field_f[var2].c(param0 + 0);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final ga a(int param0, int param1, fo param2, fo param3, boolean param4) {
        ga stackIn_8_0 = null;
        ga stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ga var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_c != null) {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (this.field_f.length > param0) {
                    if (null == this.field_f[param0]) {
                      L2: {
                        this.field_c.field_e = 6 + 72 * param0;
                        var6_int = this.field_c.h(param1 ^ 20);
                        var7 = this.field_c.h(47);
                        var13 = new byte[64];
                        this.field_c.a(0, var13, (byte) -59, 64);
                        var9 = new ga(param0, param3, param2, this.field_j, this.field_i, var6_int, var13, var7, param4);
                        if (param1 == 5) {
                          break L2;
                        } else {
                          this.a(false);
                          break L2;
                        }
                      }
                      this.field_f[param0] = var9;
                      stackIn_12_0 = (ga) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_8_0 = this.field_f[param0];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
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
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("fwa.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param2 == null) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-1 != (param2.length ^ -1)) {
                var3_int = -1;
                var4 = 0;
                L1: while (true) {
                  L2: {
                    if (param2.length <= var4) {
                      break L2;
                    } else {
                      if (param0 == param2[var4]) {
                        var3_int = var4;
                        break L2;
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  }
                  if (-1 == var3_int) {
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var6 = var3_int + param1;
                    var4 = var6;
                    L3: while (true) {
                      if (param2.length <= var6) {
                        param2[param2.length - 1] = param0;
                        stackIn_21_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param2[-1 + var6] = param2[var6];
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("fwa.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    fwa(ona param0, pfa param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private fwa(ona param0, pfa param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_e = param3;
            this.field_b = param2;
            this.field_i = param1;
            this.field_j = param0;
            if (!this.field_j.d(52)) {
                this.field_d = this.field_j.a(true, -21, 255, (byte) 0, 255);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fwa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 6;
    }
}
