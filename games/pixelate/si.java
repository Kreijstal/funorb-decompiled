/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends qm {
    int field_O;
    static boolean field_U;
    int field_T;
    int field_N;
    int field_V;
    static boolean field_P;
    int field_R;
    int field_Q;
    static String field_S;

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (!(11 != el.field_b)) {
                int discarded$0 = 98;
                am.b();
            }
            mi.a(go.field_f, bf.field_o, -1, ad.field_r);
            fj.a(0, 0, (byte) 113, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "si.D(" + -1913 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static double a(double param0) {
        return rl.field_f[(int)(param0 * 32768.0 / 3.141592653589793) & 65535];
    }

    final static void a(int param0, byte[] param1, int param2) {
        pc var6 = aa.field_f;
        var6.g(param0, 15514);
        var6.field_m = var6.field_m + 1;
        int var7 = var6.field_m;
        var6.e(160, 4);
        var6.e(160, param2);
        int var8 = 0;
        var8 += 128;
        try {
            var6.e(160, var8);
            var6.a(param1.length, 0, -3493, param1);
            var6.f(var6.field_m + -var7, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "si.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + 0 + 44 + 1 + 44 + -76 + 41);
        }
    }

    public static void a(byte param0) {
        field_S = null;
        if (param0 == 95) {
            return;
        }
        si.a((byte) 28);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -param5 - (((si) this).field_z + ((si) this).field_O) + param4;
                var9 = param6 + (-((si) this).field_R + (-param3 - ((si) this).field_p));
                if (var8_int * var8_int - -(var9 * var9) >= ((si) this).field_N * ((si) this).field_N) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - of.field_f;
                    if (0.0 <= var10) {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((si) this).field_V;
                        break L2;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)((si) this).field_V;
                      break L2;
                    }
                  }
                  ((si) this).field_T = (int)((double)((si) this).field_V * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((si) this).field_V > ((si) this).field_T) {
                      L4: while (true) {
                        if (0 <= ((si) this).field_T) {
                          break L1;
                        } else {
                          ((si) this).field_T = ((si) this).field_T + ((si) this).field_V;
                          continue L4;
                        }
                      }
                    } else {
                      ((si) this).field_T = ((si) this).field_T - ((si) this).field_V;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("si.N(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_14_0 != 0;
    }

    private si() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (param1 <= 36) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    if (param0 == -26629) {
                      break L2;
                    } else {
                      var12 = null;
                      boolean discarded$1 = si.a(30, 48, (CharSequence) null, false);
                      break L2;
                    }
                  }
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      stackOut_41_0 = var5;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param2.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 != 45) {
                              if (43 != var9) {
                                break L5;
                              } else {
                                if (param3) {
                                  var8++;
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            } else {
                              var4_int = 1;
                              var8++;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (97 > var9) {
                              break L9;
                            } else {
                              if (122 < var9) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackOut_24_0 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0 != 0;
                        }
                        if (param1 <= var9) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0 != 0;
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = param1 * var6 - -var9;
                          if (var10 / param1 == var6) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0 != 0;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("si.B(").append(param0).append(44).append(param1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param3 + 41);
        }
        return stackIn_42_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = false;
        field_P = true;
        field_S = "Email (Login):";
    }
}
