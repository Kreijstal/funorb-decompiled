/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    private boolean field_c;
    private boolean field_d;
    static int field_b;
    static int field_a;
    static String field_f;
    private String field_e;

    final boolean b(int param0) {
        int var2 = 12 / ((-44 - param0) / 59);
        return ((h) this).field_c;
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (!qb.field_b) {
            break L0;
          } else {
            if (fd.field_o[param0]) {
              break L0;
            } else {
              if (ck.field_b < 0) {
                fd.field_o[param0] = true;
                uj.field_h = 1;
                ck.field_b = param0;
                jk.field_u = 0;
                return;
              } else {
                break L0;
              }
            }
          }
        }
    }

    final void b(int param0, boolean param1) {
        ((h) this).field_c = param1 ? true : false;
        if (param0 != 16564) {
            ((h) this).field_d = true;
        }
        ((h) this).field_d = true;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            h.a(-89, 11, 65, false, -65, -84, -84, (le) null);
        }
        return ((h) this).field_d;
    }

    final static kc a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        int var6 = 0;
        Object var7 = null;
        CharSequence var8 = null;
        kc stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        kc stackOut_3_0 = null;
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
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = 103 / ((param0 - -4) / 54);
              var7 = null;
              if (param3.indexOf('@') == -1) {
                var8 = (CharSequence) (Object) param3;
                var4_long = sd.a(37, var8);
                break L1;
              } else {
                var7 = (Object) (Object) param3;
                break L1;
              }
            }
            stackOut_3_0 = sk.a(param2, var4_long, param1, true, (String) var7);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("h.D(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        int var1 = 106;
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        param0 = ((-1431655765 & param0) >>> 1) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((param0 & -858993459) >>> 2);
        param0 = 252645135 & param0 - -(param0 >>> 4);
        param0 = param0 + (param0 >>> 8);
        if (param1 < 98) {
            field_a = 83;
        }
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, le param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        le var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < ge.field_a) {
                param6 = param6 - (-param2 + ge.field_a);
                param2 = ge.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 - -param6 > ge.field_j) {
                param6 = ge.field_j + -param2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~ge.field_f < ~param5) {
                param4 = param4 - (-param5 + ge.field_f);
                param5 = ge.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~ge.field_k <= ~(param4 + param5)) {
                break L4;
              } else {
                param4 = ge.field_k - param5;
                break L4;
              }
            }
            L5: {
              if (param6 <= 0) {
                break L5;
              } else {
                if (param4 <= 0) {
                  break L5;
                } else {
                  L6: {
                    if (!param3) {
                      break L6;
                    } else {
                      int discarded$1 = h.a(31, (byte) 107);
                      break L6;
                    }
                  }
                  var21 = param7.d();
                  var32 = ge.field_i;
                  var10 = ge.field_h;
                  var11 = ge.field_g;
                  var30 = new int[4];
                  ge.b(var30);
                  param7.e();
                  ge.c(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param5 * param7.field_k + param2;
                  var14 = -param6 + param7.field_k;
                  var31 = var21.field_s;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param5;
                  L7: while (true) {
                    if (var16 >= param5 + param4) {
                      var21.c(-param7.field_r, -param7.field_q);
                      ge.a(var32, var10, var11);
                      ge.a(var30);
                      break L0;
                    } else {
                      var17 = param2;
                      L8: while (true) {
                        if (param2 + param6 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L7;
                        } else {
                          L9: {
                            var18 = var31[var13];
                            if (var18 == 0) {
                              break L9;
                            } else {
                              L10: {
                                L11: {
                                  if (var17 <= 0) {
                                    break L11;
                                  } else {
                                    if (var15[-1 + var13] == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var16 <= 0) {
                                    break L12;
                                  } else {
                                    if (0 == var15[-param7.field_k + var13]) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (~(param7.field_k - 1) >= ~var17) {
                                    break L13;
                                  } else {
                                    if (var15[var13 + 1] == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                if (~(param7.field_j + -1) >= ~var16) {
                                  break L9;
                                } else {
                                  if (var15[var13 + param7.field_k] == 0) {
                                    break L10;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ge.f(var17, var16, param0, param1);
                              break L9;
                            }
                          }
                          var13++;
                          var17++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var8 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var8;
            stackOut_40_1 = new StringBuilder().append("h.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param7 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          throw la.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((h) this).field_e;
    }

    h(String param0) {
        ((h) this).field_c = false;
        ((h) this).field_d = false;
        try {
            ((h) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "h.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Waiting for extra data";
    }
}
