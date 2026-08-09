/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    private java.math.BigInteger field_c;
    static la field_d;
    private hk[] field_e;
    private n field_b;
    private s field_h;
    private kk field_a;
    private sb field_f;
    private java.math.BigInteger field_g;

    public static void b(boolean param0) {
        if (!param0) {
            field_d = (la) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        var3 = EscapeVector.field_A;
        if (this.field_e != null) {
          var2 = 0;
          L0: while (true) {
            if (this.field_e.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (this.field_e.length <= var4) {
                  if (param0 == 12) {
                    return;
                  } else {
                    this.a(false);
                    return;
                  }
                } else {
                  if (this.field_e[var4] != null) {
                    this.field_e[var4].c(-26);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != this.field_e[var2]) {
                this.field_e[var2].d(param0 + -13);
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

    final hk a(boolean param0, int param1, jg param2, int param3, jg param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        hk var9 = null;
        byte[] var13 = null;
        hk stackIn_8_0 = null;
        hk stackIn_11_0 = null;
        hk stackIn_13_0 = null;
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
        try {
          L0: {
            if (this.field_b != null) {
              L1: {
                if (0 > param3) {
                  break L1;
                } else {
                  if (param3 >= this.field_e.length) {
                    break L1;
                  } else {
                    if (this.field_e[param3] == null) {
                      this.field_b.field_m = 6 + param3 * 72;
                      var6_int = this.field_b.g(param1 ^ -4932);
                      var7 = this.field_b.g(-5053);
                      var13 = new byte[64];
                      this.field_b.a(var13, (byte) -96, 0, 64);
                      var9 = new hk(param3, param4, param2, this.field_f, this.field_a, var6_int, var13, var7, param0);
                      if (param1 == 255) {
                        this.field_e[param3] = var9;
                        stackIn_13_0 = (hk) (var9);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_11_0 = (hk) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      stackIn_8_0 = this.field_e[param3];
                      decompiledRegionSelector0 = 0;
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
          L2: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("sk.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    sk(sb param0, kk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        n var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var16;
        byte[] var17;
        var8 = EscapeVector.field_A;
        if (null != this.field_b) {
          return true;
        } else {
          L0: {
            if (null == this.field_h) {
              if (this.field_f.c(20)) {
                return false;
              } else {
                this.field_h = this.field_f.a(255, true, (byte) 0, 255, (byte) 0);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_h.field_u) {
            L1: {
              var10 = new n(this.field_h.a(true));
              var10.field_m = 5;
              var3 = var10.e(0);
              var10.field_m = var10.field_m + 72 * var3;
              var13 = new byte[var10.field_g.length - var10.field_m];
              var11 = var13;
              var4 = var11;
              var10.a(var4, (byte) -96, 0, var13.length);
              if (this.field_g == null) {
                var5 = var4;
                break L1;
              } else {
                if (null != this.field_c) {
                  var12 = new java.math.BigInteger(var13);
                  var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_c);
                  var5 = var7_ref_java_math_BigInteger.toByteArray();
                  break L1;
                } else {
                  var5 = var4;
                  if (65 == var5.length) {
                    if (!param0) {
                      var16 = vn.a(var10.field_g, 5, -5 + (-var13.length + var10.field_m), 0);
                      var7 = 0;
                      L2: while (true) {
                        if (-65 < (var7 ^ -1)) {
                          if (var5[1 + var7] == var16[var7]) {
                            var7++;
                            continue L2;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          this.field_e = new hk[var3];
                          this.field_b = var10;
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            if (65 == var5.length) {
              if (!param0) {
                var17 = vn.a(var10.field_g, 5, -5 + (-var13.length + var10.field_m), 0);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    if (var5[1 + var7] == var17[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    this.field_e = new hk[var3];
                    this.field_b = var10;
                    return true;
                  }
                }
              } else {
                return true;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        }
    }

    private sk(sb param0, kk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a = param1;
            this.field_f = param0;
            this.field_c = param3;
            this.field_g = param2;
            if (!this.field_f.c(20)) {
              this.field_h = this.field_f.a(255, true, (byte) 0, 255, (byte) 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("sk.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
    }

    static {
    }
}
