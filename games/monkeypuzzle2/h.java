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
        return this.field_c;
    }

    final static void a(int param0, boolean param1) {
        if (qb.field_b) {
          if (!fd.field_o[param0]) {
            if ((ck.field_b ^ -1) <= -1) {
              return;
            } else {
              fd.field_o[param0] = param1;
              uj.field_h = 1;
              ck.field_b = param0;
              jk.field_u = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0, boolean param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((h) (this)).field_c = stackIn_3_1 != 0;
        if (param0 != 16564) {
          this.field_d = true;
          this.field_d = true;
          return;
        } else {
          this.field_d = true;
          return;
        }
    }

    final boolean a(int param0) {
        le var3 = null;
        if (param0 != 0) {
          var3 = (le) null;
          h.a(-89, 11, 65, false, -65, -84, -84, (le) null);
          return this.field_d;
        } else {
          return this.field_d;
        }
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
                var8 = (CharSequence) ((Object) param3);
                var4_long = sd.a(37, var8);
                break L1;
              } else {
                var7 = param3;
                break L1;
              }
            }
            stackOut_3_0 = sk.a(param2, var4_long, param1, true, (String) (var7));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("h.D(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        int var1 = -106 / ((36 - param0) / 34);
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        param0 = ((-1431655765 & param0) >>> 1881365889) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((param0 & -858993459) >>> -1793960350);
        param0 = 252645135 & param0 - -(param0 >>> 1269921124);
        param0 = param0 + (param0 >>> -1079646840);
        if (param1 < 98) {
          field_a = 83;
          param0 = param0 + (param0 >>> 151476976);
          return param0 & 255;
        } else {
          param0 = param0 + (param0 >>> 151476976);
          return param0 & 255;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, le param7) {
        int discarded$1 = 0;
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
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_24_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
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
              if (ge.field_f > param5) {
                param4 = param4 - (-param5 + ge.field_f);
                param5 = ge.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ge.field_k >= param4 + param5) {
                break L4;
              } else {
                param4 = ge.field_k - param5;
                break L4;
              }
            }
            L5: {
              if ((param6 ^ -1) >= -1) {
                break L5;
              } else {
                if (-1 <= (param4 ^ -1)) {
                  break L5;
                } else {
                  L6: {
                    if (!param3) {
                      break L6;
                    } else {
                      discarded$1 = h.a(31, (byte) 107);
                      break L6;
                    }
                  }
                  var21 = param7.d();
                  var30 = ge.field_i;
                  var10 = ge.field_h;
                  var11 = ge.field_g;
                  var29 = new int[4];
                  ge.b(var29);
                  param7.e();
                  ge.c(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param5 * param7.field_k + param2;
                  var14 = -param6 + param7.field_k;
                  var25 = var21.field_s;
                  var22 = var25;
                  var15 = var22;
                  var16 = param5;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var16 >= param5 + param4) {
                          break L9;
                        } else {
                          if (var19 != 0) {
                            break L8;
                          } else {
                            var17 = param2;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (param2 + param6 <= var17) {
                                    break L12;
                                  } else {
                                    var18 = var25[var13];
                                    stackOut_23_0 = var18;
                                    stackIn_40_0 = stackOut_23_0;
                                    stackIn_24_0 = stackOut_23_0;
                                    if (var19 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (stackIn_24_0 == 0) {
                                          break L13;
                                        } else {
                                          L14: {
                                            L15: {
                                              if ((var17 ^ -1) >= -1) {
                                                break L15;
                                              } else {
                                                if (var15[-1 + var13] == 0) {
                                                  break L14;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            L16: {
                                              if ((var16 ^ -1) >= -1) {
                                                break L16;
                                              } else {
                                                if (0 == var15[-param7.field_k + var13]) {
                                                  break L14;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              if (param7.field_k - 1 <= var17) {
                                                break L17;
                                              } else {
                                                if (-1 == (var15[var13 + 1] ^ -1)) {
                                                  break L14;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            if (param7.field_j + -1 <= var16) {
                                              break L13;
                                            } else {
                                              if (var15[var13 + param7.field_k] == 0) {
                                                break L14;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          ge.f(var17, var16, param0, param1);
                                          break L13;
                                        }
                                      }
                                      var13++;
                                      var17++;
                                      if (var19 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_39_0 = var13 + var14;
                                stackIn_40_0 = stackOut_39_0;
                                break L11;
                              }
                              var13 = stackIn_40_0;
                              var16++;
                              if (var19 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      var21.c(-param7.field_r, -param7.field_q);
                      ge.a(var30, var10, var11);
                      ge.a(var29);
                      break L8;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var8);
            stackOut_43_1 = new StringBuilder().append("h.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param7 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L18;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L18;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        return this.field_e;
    }

    h(String param0) {
        this.field_c = false;
        this.field_d = false;
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Waiting for extra data";
    }
}
