/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fma {
    private qqa field_b;
    private java.math.BigInteger field_a;
    static String field_d;
    private java.math.BigInteger field_e;
    static iw field_f;
    private ss field_c;
    private qda field_h;
    private uia field_g;
    private js[] field_i;

    public static void a(byte param0) {
        int var1 = 82 % ((-34 - param0) / 61);
        field_f = null;
        field_d = null;
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        int var7;
        int var8;
        byte[] var9;
        uia var10;
        byte[] var11;
        byte[] var13;
        byte[] var14;
        java.math.BigInteger var15;
        java.math.BigInteger var16;
        java.math.BigInteger var19;
        java.math.BigInteger var20;
        byte[] var22;
        byte[] var23;
        byte[] var24;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.field_g != null) {
          return true;
        } else {
          L0: {
            if (null != this.field_b) {
              break L0;
            } else {
              if (!this.field_h.d(-21)) {
                this.field_b = this.field_h.a(255, true, 255, -21, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (this.field_b.field_m) {
            return false;
          } else {
            var10 = new uia(this.field_b.b((byte) -126));
            if (!param0) {
              L1: {
                var10.field_h = 5;
                var3 = var10.h(255);
                var10.field_h = var10.field_h + 72 * var3;
                var13 = new byte[-var10.field_h + var10.field_g.length];
                var11 = var13;
                var4 = var11;
                var10.a(var4, 0, -116, var13.length);
                if (null == this.field_e) {
                  var5 = var4;
                  break L1;
                } else {
                  if (this.field_a != null) {
                    var19 = new java.math.BigInteger(var13);
                    var20 = var19.modPow(this.field_e, this.field_a);
                    var5 = var20.toByteArray();
                    break L1;
                  } else {
                    var5 = var4;
                    if (var5.length != 65) {
                      throw new RuntimeException();
                    } else {
                      var23 = fja.a(-5 + (var10.field_h - var13.length), var10.field_g, 5, 8);
                      var7 = 0;
                      L2: while (true) {
                        if (-65 < (var7 ^ -1)) {
                          if (var23[var7] != var5[var7 - -1]) {
                            throw new RuntimeException();
                          } else {
                            var7++;
                            continue L2;
                          }
                        } else {
                          this.field_i = new js[var3];
                          this.field_g = var10;
                          return true;
                        }
                      }
                    }
                  }
                }
              }
              if (var5.length != 65) {
                throw new RuntimeException();
              } else {
                var24 = fja.a(-5 + (var10.field_h - var13.length), var10.field_g, 5, 8);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    if (var24[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  } else {
                    this.field_i = new js[var3];
                    this.field_g = var10;
                    return true;
                  }
                }
              }
            } else {
              this.field_g = (uia) null;
              var10.field_h = 5;
              var3 = var10.h(255);
              var10.field_h = var10.field_h + 72 * var3;
              var13 = new byte[-var10.field_h + var10.field_g.length];
              var11 = var13;
              var4 = var11;
              var10.a(var4, 0, -116, var13.length);
              if (null != this.field_e) {
                L4: {
                  if (this.field_a != null) {
                    var15 = new java.math.BigInteger(var13);
                    var16 = var15.modPow(this.field_e, this.field_a);
                    var5 = var16.toByteArray();
                    break L4;
                  } else {
                    var5 = var4;
                    break L4;
                  }
                }
                if (var5.length != 65) {
                  throw new RuntimeException();
                } else {
                  var22 = fja.a(-5 + (var10.field_h - var13.length), var10.field_g, 5, 8);
                  var7 = 0;
                  L5: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var22[var7] != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L5;
                      }
                    } else {
                      this.field_i = new js[var3];
                      this.field_g = var10;
                      return true;
                    }
                  }
                }
              } else {
                var5 = var4;
                if (var5.length != 65) {
                  throw new RuntimeException();
                } else {
                  var14 = fja.a(-5 + (var10.field_h - var13.length), var10.field_g, 5, 8);
                  var9 = var14;
                  var7 = 0;
                  L6: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var14[var7] != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L6;
                      }
                    } else {
                      this.field_i = new js[var3];
                      this.field_g = var10;
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final js a(ppa param0, int param1, ppa param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        js var9 = null;
        byte[] var13 = null;
        js stackIn_10_0 = null;
        js stackIn_14_0 = null;
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
        try {
          L0: {
            if (this.field_g == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (this.field_i.length > param1) {
                    if (null != this.field_i[param1]) {
                      stackIn_10_0 = this.field_i[param1];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        if (param4 > 42) {
                          break L2;
                        } else {
                          fma.a((byte) -48);
                          break L2;
                        }
                      }
                      this.field_g.field_h = param1 * 72 + 6;
                      var6_int = this.field_g.e(121);
                      var7 = this.field_g.e(-88);
                      var13 = new byte[64];
                      this.field_g.a(var13, 0, -107, 64);
                      var9 = new js(param1, param0, param2, this.field_h, this.field_c, var6_int, var13, var7, param3);
                      this.field_i[param1] = var9;
                      stackIn_14_0 = (js) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
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

            stackIn_17_1 = new StringBuilder().append("fma.C(");

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


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_i != null) {
          var2 = 0;
          L0: while (true) {
            if (this.field_i.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (this.field_i.length <= var4) {
                  if (param0 < -106) {
                    return;
                  } else {
                    this.field_h = (qda) null;
                    return;
                  }
                } else {
                  if (this.field_i[var4] != null) {
                    this.field_i[var4].b(1000);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != this.field_i[var2]) {
                this.field_i[var2].c(-28613);
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

    fma(qda param0, ss param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private fma(qda param0, ss param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_e = param2;
              this.field_h = param0;
              this.field_a = param3;
              this.field_c = param1;
              if (this.field_h.d(-21)) {
                break L1;
              } else {
                this.field_b = this.field_h.a(255, true, 255, -21, (byte) 0);
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

            stackIn_6_1 = new StringBuilder().append("fma.<init>(");

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_d = "1st";
        field_f = new iw();
    }
}
