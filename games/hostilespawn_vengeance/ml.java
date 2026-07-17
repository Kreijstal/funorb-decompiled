/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static String field_b;
    static bd field_a;

    final static void a(byte param0, int param1) {
        int discarded$4 = jg.a(23);
        if (param0 != 112) {
            Object var3 = null;
            ml.a((vi) null, (java.math.BigInteger) null, 8, (java.math.BigInteger) null, (vi) null);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -67) {
            return;
        }
        field_a = null;
    }

    final static ll a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ll stackIn_6_0 = null;
        ll stackIn_9_0 = null;
        ll stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        ll stackIn_28_0 = null;
        ll stackIn_42_0 = null;
        ll stackIn_46_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_5_0 = null;
        ll stackOut_14_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        ll stackOut_27_0 = null;
        ll stackOut_41_0 = null;
        ll stackOut_45_0 = null;
        ll stackOut_8_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (param0 < -43) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          if (var2_int == 0) {
            stackOut_5_0 = gf.field_f;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } else {
            if (var2_int <= 64) {
              if (param1.charAt(0) == 34) {
                if (param1.charAt(var2_int - 1) != 34) {
                  stackOut_14_0 = we.field_g;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L1: while (true) {
                    if (var4 < var2_int + -1) {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L3: {
                            if (var3 != 0) {
                              stackOut_23_0 = 0;
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = 1;
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          var3 = stackIn_24_0;
                          break L2;
                        } else {
                          L4: {
                            if (var5 != 34) {
                              break L4;
                            } else {
                              if (var3 != 0) {
                                break L4;
                              } else {
                                stackOut_27_0 = we.field_g;
                                stackIn_28_0 = stackOut_27_0;
                                return stackIn_28_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L2;
                        }
                      }
                      var4++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var3 = 0;
                var4 = 0;
                L5: while (true) {
                  if (~var2_int < ~var4) {
                    L6: {
                      var5 = param1.charAt(var4);
                      if (var5 == 46) {
                        L7: {
                          if (var4 == 0) {
                            break L7;
                          } else {
                            if (var4 == var2_int + -1) {
                              break L7;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_41_0 = we.field_g;
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
                      } else {
                        if (e.field_A.indexOf(var5) != -1) {
                          var3 = 0;
                          break L6;
                        } else {
                          stackOut_45_0 = we.field_g;
                          stackIn_46_0 = stackOut_45_0;
                          return stackIn_46_0;
                        }
                      }
                    }
                    var4++;
                    continue L5;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_8_0 = hb.field_v;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("ml.F(").append(param0).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L8;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    final static void a(vi param0, java.math.BigInteger param1, int param2, java.math.BigInteger param3, vi param4) {
        try {
            hg.a(param4.field_n, -120, param4.field_i, param2, param0, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ml.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -110) {
              stackOut_3_0 = gm.a(param1, -116, false);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ml.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static byte[] a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        vi var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new vi(param0);
              var3 = var9.l(32270);
              var4 = var9.d(8195);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (mk.field_H == 0) {
                    break L2;
                  } else {
                    if (var4 > mk.field_H) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == 0) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(var4, 0, var17, -18181);
                  stackOut_20_0 = (byte[]) var5;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.d(8195);
                    if (var5_int < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (mk.field_H == 0) {
                          break L4;
                        } else {
                          if (var5_int <= mk.field_H) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (var3 != 1) {
                          var7 = (Object) (Object) tg.field_b;
                          synchronized (var7) {
                            L6: {
                              tg.field_b.a(124, var16, var9);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$1 = wf.a(var16, var5_int, param0, var4, 9);
                          break L5;
                        }
                      }
                      stackOut_18_0 = (byte[]) var6;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ml.G(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -76 + 41);
        }
        return stackIn_21_0;
    }

    final static void a(byte param0, double param1, double param2, p param3, int[] param4, oj param5, int param6) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var12 = 0;
        p var13 = null;
        p var14 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4[param3.field_j.b(-4)] != 2) {
                param3.field_l.a(6, (byte) 94, param3.field_c);
                break L1;
              } else {
                param3.field_i = 14;
                param3.field_e = 1;
                var9_int = 16;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var9_int) {
                    break L1;
                  } else {
                    L3: {
                      var13 = jn.field_F[ib.field_c];
                      var13.field_c = Math.random() * 256.0;
                      if (var13.field_c >= 0.0) {
                        if (256.0 > var13.field_c) {
                          break L3;
                        } else {
                          var13.field_c = var13.field_c - 256.0;
                          break L3;
                        }
                      } else {
                        var13.field_c = var13.field_c + 256.0;
                        break L3;
                      }
                    }
                    var13.field_j.a((byte) 46, param3.field_j);
                    var13.field_l.a(param3.field_l, -28860);
                    var13.field_h = 0;
                    var13.field_i = 37;
                    var13.field_e = 0;
                    ib.field_c = ib.field_c + 1;
                    var10++;
                    continue L2;
                  }
                }
              }
            }
            L4: {
              param3.a(8573);
              param4[param6] = 0;
              if (param0 <= -96) {
                break L4;
              } else {
                field_a = null;
                break L4;
              }
            }
            L5: {
              if (param3.a(param1, param2, 29821)) {
                L6: {
                  if (param3.field_i != 14) {
                    var9_int = 16;
                    var10 = 0;
                    L7: while (true) {
                      if (var9_int <= var10) {
                        break L6;
                      } else {
                        L8: {
                          var14 = jn.field_F[ib.field_c];
                          var14.field_c = 256.0 * Math.random();
                          if (0.0 <= var14.field_c) {
                            if (var14.field_c < 256.0) {
                              break L8;
                            } else {
                              var14.field_c = var14.field_c - 256.0;
                              break L8;
                            }
                          } else {
                            var14.field_c = var14.field_c + 256.0;
                            break L8;
                          }
                        }
                        var14.field_j.a((byte) 46, param3.field_j);
                        var14.field_l.a(param3.field_l, -28860);
                        ib.field_c = ib.field_c + 1;
                        var14.field_i = 37;
                        var14.field_e = 0;
                        var14.field_h = 0;
                        var10++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                param5.field_F = 255;
                param5.field_z = 4;
                param3.field_i = 14;
                param3.field_e = 1;
                tk.a(1, fg.field_b, 0, true);
                break L5;
              } else {
                break L5;
              }
            }
            L9: {
              param4[param6] = 3;
              param3.field_e = param3.field_e + 1;
              if (param3.field_e > 32) {
                param3.field_i = -1;
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var9;
            stackOut_28_1 = new StringBuilder().append("ml.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param5 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param6 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = HostileSpawn.field_I ? 1 : 0;
          if (param8 < param0) {
            if (param0 < param6) {
              tg.a(param5, param3, param11, param7, param0, param15, param10, param9, param8, param13, 1299210768, si.field_i, param4, param12, param1, param2, param6);
              break L0;
            } else {
              if (param8 < param6) {
                tg.a(param9, param3, param11, param7, param6, param10, param15, param5, param8, param1, 1299210768, si.field_i, param12, param4, param13, param2, param0);
                break L0;
              } else {
                tg.a(param9, param5, param12, param1, param8, param10, param2, param3, param6, param7, 1299210768, si.field_i, param11, param4, param13, param15, param0);
                break L0;
              }
            }
          } else {
            if (param8 >= param6) {
              if (param6 > param0) {
                tg.a(param3, param9, param4, param13, param6, param2, param15, param5, param0, param1, 1299210768, si.field_i, param12, param11, param7, param10, param8);
                break L0;
              } else {
                tg.a(param3, param5, param12, param1, param0, param2, param10, param9, param6, param13, 1299210768, si.field_i, param4, param11, param7, param15, param8);
                break L0;
              }
            } else {
              tg.a(param5, param9, param4, param13, param8, param15, param2, param3, param0, param7, 1299210768, si.field_i, param11, param12, param1, param10, param6);
              break L0;
            }
          }
        }
        L1: {
          if (!param14) {
            break L1;
          } else {
            ml.a((byte) -43);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Orb points: ";
    }
}
