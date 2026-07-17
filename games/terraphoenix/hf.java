/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends fd {
    static cm field_s;
    private bd field_v;
    private bd[] field_A;
    static int[] field_B;
    static String field_z;
    static String field_u;
    static boolean field_x;
    static ci field_y;
    static ci[] field_w;
    static boolean field_t;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        bd var7 = null;
        bd var9 = null;
        eb var10 = null;
        bd var11 = null;
        bd var12 = null;
        bd var13 = null;
        bd var14 = null;
        gl stackIn_5_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        gl stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -24381) {
                break L1;
              } else {
                field_t = false;
                break L1;
              }
            }
            L2: {
              if (param1 instanceof eb) {
                stackOut_4_0 = (gl) param1;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = null;
                stackIn_5_0 = (gl) (Object) stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var10 = (eb) (Object) stackIn_5_0;
              di.a(param1.field_p + param1.field_w + param2, param0 + param1.field_u, 16105, param1.field_n + param1.field_u + param0, param1.field_w + param2);
              if (var10 == null) {
                break L3;
              } else {
                param4 = param4 & var10.field_A;
                break L3;
              }
            }
            L4: {
              var7 = ((hf) this).field_A[0];
              ((hf) this).field_v.a(param3 ^ -24369);
              var7.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -127, param2);
              if (var10 != null) {
                L5: {
                  if (var10.field_C) {
                    var11 = ((hf) this).field_A[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -128, param2);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (!var10.field_s) {
                  break L4;
                } else {
                  L6: {
                    var12 = ((hf) this).field_A[3];
                    if (var10.field_j == 0) {
                      break L6;
                    } else {
                      if (var12 == null) {
                        break L6;
                      } else {
                        var12.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -126, param2);
                        break L4;
                      }
                    }
                  }
                  var9 = ((hf) this).field_A[2];
                  if (var9 != null) {
                    var9.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -126, param2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (param1.d(-111)) {
                var13 = ((hf) this).field_A[5];
                if (var13 != null) {
                  var13.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -127, param2);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param4) {
                break L8;
              } else {
                var14 = ((hf) this).field_A[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -127, param2);
                  break L8;
                }
              }
            }
            ((hf) this).field_v.a(param0, param1, param2, 1, (hf) this);
            ij.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("hf.E(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    hf(hf param0, boolean param1) {
        this();
        try {
            param0.a(param1, (hf) this, (byte) -126);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "hf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, ci[] param2) {
        int var4_int = 0;
        if (param0 != -26108) {
            return;
        }
        try {
            var4_int = param1;
            if (((hf) this).field_A[var4_int] == null) {
                ((hf) this).field_A[var4_int] = new bd();
            }
            ((hf) this).field_A[param1].field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "hf.DA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static ok a(int param0, byte param1) {
        ok var2 = new ok();
        vc.field_g.a((uf) (Object) var2, -16611);
        eb.a(param0, (byte) 126);
        int var3 = 116 % ((param1 - -59) / 35);
        return var2;
    }

    final void a(int param0, ci param1) {
        bd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        bd var5 = null;
        int var6 = 0;
        bd[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var7 = ((hf) this).field_A;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    var5.field_c = param1;
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("hf.B(").append(param0).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -11) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = hf.a((CharSequence) null, (byte) 93);
                break L1;
              }
            }
            stackOut_2_0 = im.a(param0, (byte) -14, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("hf.GA(");
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
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public hf() {
        ((hf) this).field_A = new bd[6];
        ((hf) this).field_v = new bd();
        bd dupTemp$0 = new bd();
        ((hf) this).field_A[0] = dupTemp$0;
        bd var1 = dupTemp$0;
        var1.a(15);
    }

    public static void a(byte param0) {
        field_z = null;
        field_u = null;
        field_s = null;
        field_w = null;
        field_y = null;
        field_B = null;
        int var1 = 40 / ((-66 - param0) / 44);
    }

    final void a(ci[] param0, byte param1) {
        bd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        bd var6 = null;
        int var7 = 0;
        bd[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var8 = ((hf) this).field_A;
            var3 = var8;
            var5 = -100 % ((param1 - 63) / 62);
            var4 = 0;
            L1: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var4];
                  if (var6 != null) {
                    var6.field_b = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("hf.FA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    private final void a(boolean param0, hf param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        bd var5 = null;
        bd var6 = null;
        int var7 = 0;
        bd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        bd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        bd stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        bd stackIn_10_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        bd stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        bd stackOut_9_2 = null;
        bd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        bd stackOut_8_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              super.a((fd) (Object) param1, -111);
              if (param0) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((hf) this).field_A[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L4: {
                          var6 = param1.field_A[var4_int];
                          stackOut_7_0 = (bd) var5;
                          stackOut_7_1 = -46;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if (var6 != null) {
                            stackOut_9_0 = (bd) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (bd) var6;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L4;
                          } else {
                            bd dupTemp$17 = new bd();
                            param1.field_A[var4_int] = dupTemp$17;
                            stackOut_8_0 = (bd) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (bd) dupTemp$17;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            break L4;
                          }
                        }
                        ((bd) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2);
                        break L3;
                      } else {
                        param1.field_A[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                ka.a((Object[]) (Object) ((hf) this).field_A, 0, (Object[]) (Object) param1.field_A, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("hf.CA(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + -126 + 41);
        }
    }

    final bd a(int param0, int param1) {
        if (param1 != 3) {
            hf.a((byte) -125);
        }
        bd dupTemp$0 = new bd();
        ((hf) this).field_A[param0] = dupTemp$0;
        return dupTemp$0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new cm(2);
        field_u = "Reload game";
        field_t = true;
        field_z = "Not yet achieved";
    }
}
