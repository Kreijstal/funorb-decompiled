/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static uh field_j;
    private cd field_i;
    private mg field_f;
    private ge field_h;
    private java.math.BigInteger field_a;
    private java.math.BigInteger field_e;
    static String field_g;
    static String field_c;
    private vl field_d;
    private ak[] field_b;

    public static void a(boolean param0) {
        field_j = null;
        field_c = null;
        field_g = null;
        if (param0) {
            return;
        }
        pi.a(true);
    }

    final boolean a(int param0) {
        int stackIn_19_0 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        mg var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (null == this.field_f) {
          L0: {
            if (this.field_i != null) {
              break L0;
            } else {
              if (!this.field_h.d(-114)) {
                this.field_i = this.field_h.a(15937, 255, true, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!this.field_i.field_l) {
            L1: {
              L2: {
                var10 = new mg(this.field_i.f(0));
                var10.field_i = 5;
                var3 = var10.b((byte) 90);
                var10.field_i = var10.field_i + var3 * 72;
                var13 = new byte[var10.field_j.length + -var10.field_i];
                var11 = var13;
                var4 = var11;
                var10.a((byte) 126, var4, 0, var13.length);
                if (this.field_e == null) {
                  break L2;
                } else {
                  if (this.field_a == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_a);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if ((var5.length ^ -1) == -66) {
              var15 = ee.a(-1, -var13.length + (var10.field_i + -5), 5, var10.field_j);
              var7 = param0;
              L3: while (true) {
                if (var7 < 64) {
                  stackIn_19_0 = var15[var7] ^ -1;

                  if (var8 == 0) {
                    if (stackIn_19_0 == (var5[var7 - -1] ^ -1)) {
                      var7++;
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        this.field_f = var10;
                        this.field_b = new ak[var3];
                        return true;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    return stackIn_19_0 != 0;
                  }
                } else {
                  this.field_f = var10;
                  this.field_b = new ak[var3];
                  return true;
                }
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    pi(ge param0, vl param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final ak a(boolean param0, int param1, boolean param2, eh param3, eh param4) {
        ak stackIn_8_0 = null;
        ak stackIn_12_0 = null;
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
        ak var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (null != this.field_f) {
              L1: {
                if (-1 < (param1 ^ -1)) {
                  break L1;
                } else {
                  if (param1 >= this.field_b.length) {
                    break L1;
                  } else {
                    if (null == this.field_b[param1]) {
                      L2: {
                        this.field_f.field_i = 6 + param1 * 72;
                        var6_int = this.field_f.l(0);
                        var7 = this.field_f.l(0);
                        if (!param2) {
                          break L2;
                        } else {
                          this.field_f = (mg) null;
                          break L2;
                        }
                      }
                      var13 = new byte[64];
                      this.field_f.a((byte) 123, var13, 0, 64);
                      var9 = new ak(param1, param4, param3, this.field_h, this.field_d, var6_int, var13, var7, param0);
                      this.field_b[param1] = var9;
                      stackIn_12_0 = (ak) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_8_0 = this.field_b[param1];
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("pi.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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

            if (param4 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void b(int param0) {
        int var2;
        int var3;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (null != this.field_b) {
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var2 >= this.field_b.length) {
                  break L2;
                } else {
                  if (var3 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (null != this.field_b[var2]) {
                        this.field_b[var2].e((byte) 57);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var2 = param0;
              break L1;
            }
            L4: while (true) {
              if (var2 < this.field_b.length) {
                if (var3 == 0) {
                  L5: {
                    if (this.field_b[var2] == null) {
                      break L5;
                    } else {
                      this.field_b[var2].a(true);
                      break L5;
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        lc.field_r = 1;
        dm.field_a = param2;
        da.field_B = param0;
        if (param1 == 19741) {
            return;
        }
        field_g = (String) null;
    }

    private pi(ge param0, vl param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
            this.field_h = param0;
            this.field_e = param2;
            this.field_a = param3;
            this.field_d = param1;
            if (!this.field_h.d(-92)) {
              this.field_i = this.field_h.a(15937, 255, true, 255, (byte) 0);
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

            stackIn_7_1 = new StringBuilder().append("pi.<init>(");

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
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_g = "Checking";
        field_c = "Age:";
    }
}
