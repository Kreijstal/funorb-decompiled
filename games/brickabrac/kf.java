/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends k {
    static int field_k;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        var21 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              param12 = param12 + param7;
              var13_int = 0;
              var14 = 0;
              var15 = -param4;
              if (param10 == 8) {
                break L1;
              } else {
                var22 = (int[]) null;
                kf.a((int[]) null, 92, 50, 37, -19, 126, (int[]) null, 74, 68, -55, 33, -74, 59);
                break L1;
              }
            }
            L2: while (true) {
              if (-1 >= (var15 ^ -1)) {
                break L0;
              } else {
                var13_int = var13_int - param7;
                var16 = param5 >> 2126854952;
                var17 = 256 - var16;
                var18 = var16 * (param11 & 16711935);
                var19 = var16 * (param11 & 65280);
                L3: while (true) {
                  if (param8 <= var13_int) {
                    L4: while (true) {
                      if (param2 <= var13_int) {
                        param12 = param12 + lb.field_c;
                        param5 = param5 + param1;
                        var15++;
                        continue L2;
                      } else {
                        incrementValue$0 = param9;
                        param9++;
                        param3 = param6[incrementValue$0];
                        if (param3 > 0) {
                          var14 = 0;
                          L5: while (true) {
                            if (var14 >= param3) {
                              continue L4;
                            } else {
                              L6: {
                                if ((var13_int ^ -1) > (param2 ^ -1)) {
                                  var20 = param0[param12 - -var13_int];
                                  param0[param12 - -var13_int] = ik.a(-16711936, var17 * ik.a(var20, 16711935) + var18) + ik.a(var19 + ik.a(var20, 65280) * var17, 16711680) >>> 977035464;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var13_int++;
                              var14++;
                              continue L5;
                            }
                          }
                        } else {
                          var13_int = var13_int - param3;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    incrementValue$1 = param9;
                    param9++;
                    param3 = param6[incrementValue$1];
                    if (-1 > (param3 ^ -1)) {
                      var14 = 0;
                      L7: while (true) {
                        if (var14 >= param3) {
                          continue L3;
                        } else {
                          if ((var13_int ^ -1) <= (param8 ^ -1)) {
                            var20 = param0[param12 - -var13_int];
                            param0[param12 - -var13_int] = ik.a(var17 * ik.a(65280, var20) - -var19, 16711680) + ik.a(ik.a(var20, 16711935) * var17 + var18, -16711936) >>> -1313728280;
                            var13_int++;
                            var14++;
                            continue L7;
                          } else {
                            var13_int++;
                            var14++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var13_int = var13_int - param3;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var13 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var13);

            stackIn_27_1 = new StringBuilder().append("kf.E(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final qh a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mf var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        qh stackIn_2_0 = null;
        qh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (dc.a(var5, -125)) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var3_int = fl.a(var6, -28734);
                if (param1 == 106) {
                  break L1;
                } else {
                  var4 = (mf) null;
                  kf.a((String) null, (String) null, (mf) null, -17);
                  break L1;
                }
              }
              L2: {
                if ((var3_int ^ -1) >= -1) {
                  break L2;
                } else {
                  if (-131 > (var3_int ^ -1)) {
                    break L2;
                  } else {
                    return ae.field_c;
                  }
                }
              }
              stackIn_9_0 = lp.field_xb;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = lp.field_xb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kf.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    kf(vb param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, (byte) 106) == lp.field_xb) {
              stackIn_3_0 = qb.field_y;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -11 / ((param0 - -16) / 50);
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("kf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (String) ((Object) stackIn_5_0);
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = km.field_o;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      var4 = gb.a(param1, param2 + 111);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) <= -2) {
                          L3: {
                            if (ik.a((byte) -9, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (ik.a((byte) -9, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param2 == 3) {
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param1.length()) {
                                      if ((var5 ^ -1) < -1) {
                                        stackIn_36_0 = q.field_g;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param1.charAt(var6);
                                        if (ik.a((byte) -9, (char) var7)) {
                                          var5++;
                                          break L5;
                                        } else {
                                          var5 = 0;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (2 > var5) {
                                          break L6;
                                        } else {
                                          if (param0) {
                                            break L6;
                                          } else {
                                            stackIn_31_0 = pq.field_n;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackIn_22_0 = (String) null;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackIn_19_0 = q.field_g;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_14_0 = km.field_o;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_9_0 = km.field_o;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("kf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param1 <= -111) {
                      var3 = new java.net.URL(param2.getCodeBase(), param0);
                      var3 = hg.a(param2, var3, -1);
                      fk.a((byte) 94, param2, var3.toString(), true);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("kf.D(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static jp[] a(String param0, String param1, mf param2, int param3) {
        jp[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        jp[] var6 = null;
        jp[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = cr.a(param1, param2, param0, 2);
            var4 = var6;
            var6[3].field_z = var6[3].field_C;
            var6[1].field_x = var6[1].field_D;
            var6[5].field_z = var6[5].field_C;
            var6[7].field_x = var6[7].field_D;
            var6[1] = qb.a(var6[1], false, 8);
            var6[7] = qb.a(var6[7], false, 8);
            var6[3] = k.a(var6[3], 101, 8);
            var6[5] = k.a(var6[5], 89, 8);
            var5 = -92 / ((-45 - param3) / 34);
            stackIn_1_0 = (jp[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("kf.F(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    static {
    }
}
