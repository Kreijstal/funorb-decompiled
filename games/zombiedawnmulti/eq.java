/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    private ai field_d;
    private java.math.BigInteger field_e;
    static ri field_c;
    private qb field_i;
    static int field_g;
    private tn field_h;
    private k field_b;
    private cn[] field_f;
    private java.math.BigInteger field_a;

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) um.field_c);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) um.field_c);
            qf.field_f = -1;
            int var2_int = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "eq.D(" + (param0 != null ? "{...}" : "null") + ',' + 127 + ')');
        }
    }

    eq(qb param0, ai param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final cn a(int param0, bq param1, int param2, bq param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        cn var9 = null;
        Object var10 = null;
        byte[] var14 = null;
        cn stackIn_11_0 = null;
        cn stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_12_0 = null;
        cn stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -15893) {
                break L1;
              } else {
                var10 = null;
                String discarded$1 = eq.a((CharSequence[]) null, 8, 88, 1);
                break L1;
              }
            }
            if (null == ((eq) this).field_b) {
              throw new RuntimeException();
            } else {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (((eq) this).field_f.length <= param0) {
                    break L2;
                  } else {
                    if (null == ((eq) this).field_f[param0]) {
                      ((eq) this).field_b.field_j = 6 + 72 * param0;
                      var6_int = ((eq) this).field_b.i(-1478490344);
                      var7 = ((eq) this).field_b.i(param2 + -1478474451);
                      var14 = new byte[64];
                      ((eq) this).field_b.a(0, param2 ^ 9946, 64, var14);
                      var9 = new cn(param0, param3, param1, ((eq) this).field_i, ((eq) this).field_d, var6_int, var14, var7, param4);
                      ((eq) this).field_f[param0] = var9;
                      stackOut_12_0 = (cn) var9;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_10_0 = ((eq) this).field_f[param0];
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
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
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("eq.F(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ')');
        }
        return stackIn_13_0;
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_30_0 = null;
        Object stackOut_28_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              if (param3 == 1) {
                var10 = param0[param1];
                var4_ref = var10;
                if (var4_ref != null) {
                  stackOut_9_0 = ((Object) (Object) var10).toString();
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                var4_int = param3 - -param1;
                var5 = 0;
                var6_int = param1;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      var7 = param1;
                      if (var4_int <= var7) {
                        break L2;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            StringBuilder discarded$2 = var6.append("null");
                            var7++;
                            break L3;
                          } else {
                            StringBuilder discarded$3 = var6.append(var8);
                            var7++;
                            break L3;
                          }
                        }
                        var7++;
                        var7++;
                        break L2;
                      }
                    }
                    if (param2 == 4) {
                      stackOut_30_0 = var6.toString();
                      stackIn_31_0 = stackOut_30_0;
                      break L0;
                    } else {
                      stackOut_28_0 = null;
                      stackIn_29_0 = stackOut_28_0;
                      return (String) (Object) stackIn_29_0;
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        var6_int++;
                        break L4;
                      } else {
                        var5 += 4;
                        var6_int++;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("eq.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L5;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_31_0;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            eq.a(-117);
        }
    }

    private eq(qb param0, ai param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            ((eq) this).field_d = param1;
            ((eq) this).field_i = param0;
            ((eq) this).field_e = param3;
            ((eq) this).field_a = param2;
            if (!((eq) this).field_i.e(82)) {
              ((eq) this).field_h = ((eq) this).field_i.a(487989472, 255, true, 255, (byte) 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("eq.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final boolean c(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        k var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var17 = null;
        byte[] var19 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((eq) this).field_b) {
          return true;
        } else {
          L0: {
            if (null == ((eq) this).field_h) {
              if (!((eq) this).field_i.e(54)) {
                ((eq) this).field_h = ((eq) this).field_i.a(487989472, 255, true, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (((eq) this).field_h.field_t) {
            return false;
          } else {
            var10 = new k(((eq) this).field_h.e(0));
            var10.field_j = 5;
            var3 = var10.g(31365);
            var10.field_j = var10.field_j + var3 * 72;
            var21 = new byte[var10.field_m.length - var10.field_j];
            var14 = var21;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            var10.a(0, -6351, var21.length, var21);
            if (null != ((eq) this).field_a) {
              if (null != ((eq) this).field_e) {
                var12 = new java.math.BigInteger(var21);
                var7_ref_java_math_BigInteger = var12.modPow(((eq) this).field_a, ((eq) this).field_e);
                var26 = var7_ref_java_math_BigInteger.toByteArray();
                var19 = var26;
                var5 = var19;
                if (var26.length != 65) {
                  throw new RuntimeException();
                } else {
                  var27 = ho.a(4246, 5, var10.field_m, -var21.length + (var10.field_j + -5));
                  var7 = 0;
                  L1: while (true) {
                    if (64 <= var7) {
                      if (param0 > -113) {
                        ((eq) this).field_h = null;
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      } else {
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      }
                    } else {
                      if (var27[var7] == var5[var7 - -1]) {
                        var7++;
                        continue L1;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
              } else {
                var24 = var4;
                var17 = var24;
                var5 = var17;
                if (var24.length != 65) {
                  throw new RuntimeException();
                } else {
                  var25 = ho.a(4246, 5, var10.field_m, -var21.length + (var10.field_j + -5));
                  var7 = 0;
                  L2: while (true) {
                    if (64 <= var7) {
                      if (param0 > -113) {
                        ((eq) this).field_h = null;
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      } else {
                        ((eq) this).field_b = var10;
                        ((eq) this).field_f = new cn[var3];
                        return true;
                      }
                    } else {
                      if (var25[var7] == var5[var7 - -1]) {
                        var7++;
                        continue L2;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
              }
            } else {
              var22 = var4;
              var15 = var22;
              var5 = var15;
              if (var22.length != 65) {
                throw new RuntimeException();
              } else {
                var23 = ho.a(4246, 5, var10.field_m, -var21.length + (var10.field_j + -5));
                var7 = 0;
                L3: while (true) {
                  if (64 <= var7) {
                    if (param0 > -113) {
                      ((eq) this).field_h = null;
                      ((eq) this).field_b = var10;
                      ((eq) this).field_f = new cn[var3];
                      return true;
                    } else {
                      ((eq) this).field_b = var10;
                      ((eq) this).field_f = new cn[var3];
                      return true;
                    }
                  } else {
                    if (var23[var7] == var5[var7 - -1]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((eq) this).field_f == null) {
          return;
        } else {
          var2 = param0;
          L0: while (true) {
            if (((eq) this).field_f.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((eq) this).field_f.length <= var4) {
                  return;
                } else {
                  if (((eq) this).field_f[var4] == null) {
                    var4++;
                    var4++;
                    var4++;
                    continue L1;
                  } else {
                    ((eq) this).field_f[var4].b(-2);
                    var4++;
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((eq) this).field_f[var2] != null) {
                ((eq) this).field_f[var2].c(90);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 9;
    }
}
