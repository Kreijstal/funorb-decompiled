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
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        uia var10 = null;
        byte[] var11 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        java.math.BigInteger var17 = null;
        java.math.BigInteger var18 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        java.math.BigInteger var23 = null;
        java.math.BigInteger var24 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        byte[] var32 = null;
        byte[] var33 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (((fma) this).field_g != null) {
          return true;
        } else {
          L0: {
            if (null != ((fma) this).field_b) {
              break L0;
            } else {
              if (!((fma) this).field_h.d(-21)) {
                ((fma) this).field_b = ((fma) this).field_h.a(255, true, 255, -21, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (((fma) this).field_b.field_m) {
            return false;
          } else {
            var10 = new uia(((fma) this).field_b.b((byte) -126));
            if (!param0) {
              L1: {
                var10.field_h = 5;
                var3 = var10.h(255);
                var10.field_h = var10.field_h + 72 * var3;
                var30 = new byte[-var10.field_h + var10.field_g.length];
                var20 = var30;
                var13 = var20;
                var11 = var13;
                var4 = var11;
                var10.a(var4, 0, -116, var30.length);
                if (null == ((fma) this).field_e) {
                  var5 = var4;
                  break L1;
                } else {
                  if (((fma) this).field_a != null) {
                    var23 = new java.math.BigInteger(var30);
                    var24 = var23.modPow(((fma) this).field_e, ((fma) this).field_a);
                    var5 = var24.toByteArray();
                    break L1;
                  } else {
                    var31 = var4;
                    var21 = var31;
                    var5 = var21;
                    if (var31.length != 65) {
                      throw new RuntimeException();
                    } else {
                      var32 = fja.a(-5 + (var10.field_h - var30.length), var10.field_g, 5, 8);
                      var7 = 0;
                      L2: while (true) {
                        if (var7 < 64) {
                          if (var32[var7] != var5[var7 - -1]) {
                            throw new RuntimeException();
                          } else {
                            var7++;
                            continue L2;
                          }
                        } else {
                          ((fma) this).field_i = new js[var3];
                          ((fma) this).field_g = var10;
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
                var33 = fja.a(-5 + (var10.field_h - var30.length), var10.field_g, 5, 8);
                var7 = 0;
                L3: while (true) {
                  if (var7 < 64) {
                    if (var33[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  } else {
                    ((fma) this).field_i = new js[var3];
                    ((fma) this).field_g = var10;
                    return true;
                  }
                }
              }
            } else {
              ((fma) this).field_g = null;
              var10.field_h = 5;
              var3 = var10.h(255);
              var10.field_h = var10.field_h + 72 * var3;
              var26 = new byte[-var10.field_h + var10.field_g.length];
              var14 = var26;
              var13 = var14;
              var11 = var13;
              var4 = var11;
              var10.a(var4, 0, -116, var26.length);
              if (null != ((fma) this).field_e) {
                L4: {
                  if (((fma) this).field_a != null) {
                    var17 = new java.math.BigInteger(var26);
                    var18 = var17.modPow(((fma) this).field_e, ((fma) this).field_a);
                    var5 = var18.toByteArray();
                    break L4;
                  } else {
                    var5 = var4;
                    break L4;
                  }
                }
                if (var5.length != 65) {
                  throw new RuntimeException();
                } else {
                  var29 = fja.a(-5 + (var10.field_h - var26.length), var10.field_g, 5, 8);
                  var7 = 0;
                  L5: while (true) {
                    if (var7 < 64) {
                      if (var29[var7] != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L5;
                      }
                    } else {
                      ((fma) this).field_i = new js[var3];
                      ((fma) this).field_g = var10;
                      return true;
                    }
                  }
                }
              } else {
                var27 = var4;
                var15 = var27;
                var5 = var15;
                if (var27.length != 65) {
                  throw new RuntimeException();
                } else {
                  var28 = fja.a(-5 + (var10.field_h - var26.length), var10.field_g, 5, 8);
                  var16 = var28;
                  var9 = var16;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 < 64) {
                      if (var28[var7] != var5[var7 - -1]) {
                        throw new RuntimeException();
                      } else {
                        var7++;
                        continue L6;
                      }
                    } else {
                      ((fma) this).field_i = new js[var3];
                      ((fma) this).field_g = var10;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        js stackOut_9_0 = null;
        js stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (((fma) this).field_g == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (((fma) this).field_i.length > param1) {
                    if (null != ((fma) this).field_i[param1]) {
                      stackOut_9_0 = ((fma) this).field_i[param1];
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      L2: {
                        if (param4 > 42) {
                          break L2;
                        } else {
                          fma.a((byte) -48);
                          break L2;
                        }
                      }
                      ((fma) this).field_g.field_h = param1 * 72 + 6;
                      var6_int = ((fma) this).field_g.e(121);
                      var7 = ((fma) this).field_g.e(-88);
                      var13 = new byte[64];
                      ((fma) this).field_g.a(var13, 0, -107, 64);
                      var9 = new js(param1, param0, param2, ((fma) this).field_h, ((fma) this).field_c, var6_int, var13, var7, param3);
                      ((fma) this).field_i[param1] = var9;
                      stackOut_13_0 = (js) var9;
                      stackIn_14_0 = stackOut_13_0;
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
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("fma.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_14_0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (((fma) this).field_i != null) {
          var2 = 0;
          L0: while (true) {
            if (((fma) this).field_i.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((fma) this).field_i.length <= var4) {
                  if (param0 < -106) {
                    return;
                  } else {
                    ((fma) this).field_h = null;
                    return;
                  }
                } else {
                  if (((fma) this).field_i[var4] == null) {
                    var4++;
                    var4++;
                    continue L1;
                  } else {
                    ((fma) this).field_i[var4].b(1000);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null == ((fma) this).field_i[var2]) {
                var2++;
                var2++;
                continue L0;
              } else {
                ((fma) this).field_i[var2].c(-28613);
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              ((fma) this).field_e = param2;
              ((fma) this).field_h = param0;
              ((fma) this).field_a = param3;
              ((fma) this).field_c = param1;
              if (((fma) this).field_h.d(-21)) {
                break L1;
              } else {
                ((fma) this).field_b = ((fma) this).field_h.a(255, true, 255, -21, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("fma.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "1st";
        field_f = new iw();
    }
}
