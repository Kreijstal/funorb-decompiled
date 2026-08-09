/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static String field_b;
    static bd field_a;

    final static void a(byte param0, int param1) {
        jg.a(23);
        if (param0 != 112) {
            vi var3 = (vi) null;
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
        ll stackIn_6_0 = null;
        ll stackIn_9_0 = null;
        ll stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        ll stackIn_28_0 = null;
        ll stackIn_42_0 = null;
        ll stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 < -43) {
                break L1;
              } else {
                field_a = (bd) null;
                break L1;
              }
            }
            if (var2_int == 0) {
              stackIn_6_0 = gf.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 <= (var2_int ^ -1)) {
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(var2_int - 1) != 34) {
                    stackIn_15_0 = we.field_g;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L2: while (true) {
                      if (var4 < var2_int + -1) {
                        L3: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L4: {
                              if (var3 != 0) {
                                stackIn_24_0 = 0;
                                break L4;
                              } else {
                                stackIn_24_0 = 1;
                                break L4;
                              }
                            }
                            var3 = stackIn_24_0;
                            break L3;
                          } else {
                            L5: {
                              if (var5 != 34) {
                                break L5;
                              } else {
                                if (var3 != 0) {
                                  break L5;
                                } else {
                                  stackIn_28_0 = we.field_g;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          }
                        }
                        var4++;
                        continue L2;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L6: while (true) {
                    if (var2_int > var4) {
                      L7: {
                        var5 = param1.charAt(var4);
                        if (var5 == 46) {
                          L8: {
                            if (var4 == 0) {
                              break L8;
                            } else {
                              if (var4 == var2_int + -1) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackIn_42_0 = we.field_g;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (0 != (e.field_A.indexOf(var5) ^ -1)) {
                            var3 = 0;
                            break L7;
                          } else {
                            stackIn_46_0 = we.field_g;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L6;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackIn_9_0 = hb.field_v;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var2);

            stackIn_52_1 = new StringBuilder().append("ml.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L9;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L9;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  return stackIn_46_0;
                }
              }
            }
          }
        }
    }

    final static void a(vi param0, java.math.BigInteger param1, int param2, java.math.BigInteger param3, vi param4) {
        try {
            hg.a(param4.field_n, -120, param4.field_i, param2, param0, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ml.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -110) {
              stackIn_4_0 = gm.a(param1, -116, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ml.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        CharSequence var9 = null;
        vi var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              var10 = new vi(param0);
              var3 = var10.l(param1 ^ -32326);
              var4 = var10.d(8195);
              if (param1 == -76) {
                break L1;
              } else {
                var9 = (CharSequence) null;
                ml.a((byte) -45, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (var4 < 0) {
                break L2;
              } else {
                L3: {
                  if (mk.field_H == 0) {
                    break L3;
                  } else {
                    if (var4 > mk.field_H) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  var14 = new byte[var4];
                  var12 = var14;
                  var5 = var12;
                  var10.a(var4, 0, var14, -18181);
                  stackIn_23_0 = (byte[]) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var10.d(8195);
                    if (-1 < (var5_int ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if (mk.field_H == 0) {
                          break L5;
                        } else {
                          if (var5_int <= mk.field_H) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var13 = new byte[var5_int];
                        var11 = var13;
                        var6 = var11;
                        if (-2 != (var3 ^ -1)) {
                          var7 = tg.field_b;
                          synchronized (var7) {
                            L7: {
                              tg.field_b.a(124, var13, var10);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          wf.a(var13, var5_int, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 0;
                      break L0;
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
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ml.G(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static void a(byte param0, double param1, double param2, p param3, int[] param4, oj param5, int param6) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var12 = 0;
        p var13 = null;
        p var14 = null;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 != (param4[param3.field_j.b(-4)] ^ -1)) {
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
                field_a = (bd) null;
                break L4;
              }
            }
            L5: {
              if (param3.a(param1, param2, 29821)) {
                L6: {
                  if ((param3.field_i ^ -1) != -15) {
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
            stackIn_30_0 = (RuntimeException) (var9);

            stackIn_30_1 = new StringBuilder().append("ml.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param5 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ',' + param6 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, int param15) {
        int var17;
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
        field_b = "Orb points: ";
    }
}
