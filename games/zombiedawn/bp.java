/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    private og field_e;
    private java.math.BigInteger field_b;
    static String[] field_a;
    static jk field_h;
    private java.math.BigInteger field_c;
    private sh field_i;
    private om[] field_g;
    static String field_j;
    private de field_d;
    private pc field_f;

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        if (param0 != -16785) {
            bp.a(23);
        }
        field_a = null;
    }

    final om a(na param0, byte param1, boolean param2, int param3, na param4) {
        om stackIn_10_0 = null;
        om stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        om var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_d == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  if (this.field_g.length <= param3) {
                    break L1;
                  } else {
                    if (this.field_g[param3] != null) {
                      stackIn_10_0 = this.field_g[param3];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_d.field_j = 72 * param3 - -6;
                        if (param1 < -99) {
                          break L2;
                        } else {
                          this.field_b = (java.math.BigInteger) null;
                          break L2;
                        }
                      }
                      var6_int = this.field_d.c(89);
                      var7 = this.field_d.c(-95);
                      var13 = new byte[64];
                      this.field_d.a(64, 0, var13, 11240);
                      var9 = new om(param3, param0, param4, this.field_f, this.field_i, var6_int, var13, var7, param2);
                      this.field_g[param3] = var9;
                      stackIn_14_0 = (om) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("bp.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    bp(pc param0, sh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        de var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ZombieDawn.field_J;
        if (this.field_d != null) {
          return true;
        } else {
          L0: {
            if (null == this.field_e) {
              if (!this.field_f.b(107)) {
                this.field_e = this.field_f.a((byte) 0, true, 255, (byte) -102, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_e.field_q) {
            L1: {
              L2: {
                var10 = new de(this.field_e.d(0));
                var10.field_j = 5;
                var3 = var10.d((byte) -118);
                var10.field_j = var10.field_j + 72 * var3;
                var13 = new byte[var10.field_h.length + -var10.field_j];
                var11 = var13;
                var4 = var11;
                var10.a(var13.length, 0, var13, 11240);
                if (null == this.field_b) {
                  break L2;
                } else {
                  if (this.field_c != null) {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_c);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var15 = nl.a(5, -5 + (var10.field_j - var13.length), -117, var10.field_h);
              var7 = 0;
              L3: while (true) {
                if (var7 >= 64) {
                  L4: {
                    if (param0 == 0) {
                      break L4;
                    } else {
                      field_j = (String) null;
                      break L4;
                    }
                  }
                  this.field_g = new om[var3];
                  this.field_d = var10;
                  return true;
                } else {
                  if (var15[var7] == var5[var7 - -1]) {
                    var7++;
                    continue L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        var3 = ZombieDawn.field_J;
        if (this.field_g == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (this.field_g.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (this.field_g.length <= var4) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      bp.a(79);
                      break L2;
                    }
                  }
                  return;
                } else {
                  if (this.field_g[var4] != null) {
                    this.field_g[var4].a(84);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != this.field_g[var2]) {
                this.field_g[var2].b(0);
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

    private bp(pc param0, sh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_f = param0;
              this.field_c = param3;
              this.field_i = param1;
              this.field_b = param2;
              if (this.field_f.b(105)) {
                break L1;
              } else {
                this.field_e = this.field_f.a((byte) 0, true, 255, (byte) 50, 255);
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

            stackIn_6_1 = new StringBuilder().append("bp.<init>(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_j = "Age:";
    }
}
