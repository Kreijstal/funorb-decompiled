/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_f;
    private fm[] field_h;
    static gn field_d;
    static String field_i;
    static int[] field_g;
    static lg field_k;
    static String field_j;
    private we field_e;
    static kc field_c;
    static String field_a;
    static int[] field_b;

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (-1 < (param3 ^ -1)) {
                break L1;
              } else {
                if (this.field_h.length > param3) {
                  L2: {
                    if (param0 < param1) {
                      break L2;
                    } else {
                      if (this.field_e.field_c.length <= param0) {
                        break L2;
                      } else {
                        this.field_h[param3].field_b[param0] = param2;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("th.E(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        qb[] var10 = null;
        qb[] var11_ref_qb__ = null;
        int var11 = 0;
        int var12 = 0;
        qb var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        var9 = param1 + param7 - -param6;
        var10 = new qb[]{new qb(var9, var9), new qb(param2, var9), new qb(var9, var9), new qb(var9, param2), new qb(64, 64), new qb(var9, param2), new qb(var9, var9), new qb(param2, var9), new qb(var9, var9)};
        var11_ref_qb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_qb__.length <= var12) {
            var10 = var11_ref_qb__;
            var11 = 0;
            L1: while (true) {
              if (param7 <= var11) {
                L2: {
                  if (param4 == -32573) {
                    break L2;
                  } else {
                    field_d = (gn) null;
                    break L2;
                  }
                }
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param7) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param2) {
                        var11 = 0;
                        L5: while (true) {
                          if (param2 >> 1812807105 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 >= param1) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_A[var11 + (-1 + -var12 + var9) * param2] = param0;
                                var10[3].field_A[var9 - 1 + (-var12 + var11 * var9)] = param0;
                                var10[7].field_A[param2 * var12 + var11] = param0;
                                var10[5].field_A[var11 * var9 + var12] = param0;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 < param7) {
                            var10[7].field_A[var11 + param2 * (-1 + var9 - var12)] = param5;
                            var10[5].field_A[var9 - 1 - (var12 - var9 * var11)] = param5;
                            var10[1].field_A[var11 + var12 * param2] = param3;
                            var10[3].field_A[var11 * var9 + var12] = param3;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 < var9) {
                        var10[0].field_A[var12 - -(var11 * var9)] = param3;
                        var10[0].field_A[var9 * var12 - -var11] = param3;
                        if (var9 - var11 > var12) {
                          var10[2].field_A[var12 + var9 * var11] = param3;
                          var10[6].field_A[var9 * var12 + var11] = param3;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_A[var12 + (-1 + var9 - var11) * var9] = param5;
                    var10[8].field_A[var12 + (-var11 + var9 + -1) * var9] = param5;
                    var10[2].field_A[-1 - -var9 - (var11 - var12 * var9)] = param5;
                    var10[8].field_A[-var11 - (-var9 + 1) + var12 * var9] = param5;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_qb__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_A.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_A[var14] = param8;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static void a(eg param0, eg param1, eg param2, byte param3, boolean param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              wn.field_z = nj.a("", param3 + 133);
              wn.field_z.a(false, (byte) -59);
              aa.a(param3 ^ -121, param2, param1, param0);
              ci.a((byte) 50);
              hb.field_Gb = uj.field_h;
              in.field_Gb = uj.field_h;
              if (param3 == -40) {
                break L1;
              } else {
                field_c = (kc) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("th.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 > param1) {
          return false;
        } else {
          if (param1 < this.field_h.length) {
            if (-1L != this.field_h[param1].field_f) {
              return false;
            } else {
              this.field_h[param1].field_f = this.field_e.a(0);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_k = null;
        field_a = null;
        field_i = null;
        field_d = null;
        field_b = null;
        if (param0 != -113) {
            ll var2 = (ll) null;
            th.a((nf) null, (ll) null, -127, -97, -25, -84);
        }
        field_j = null;
        field_c = null;
    }

    final static void a(nf param0, ll param1, int param2, int param3, int param4, int param5) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 <= param3) {
                  break L1;
                } else {
                  param3 = -param3;
                  break L1;
                }
              }
              L2: {
                var6_int = -param3 + param5;
                if (0 <= var6_int) {
                  break L2;
                } else {
                  var6_int = 0;
                  break L2;
                }
              }
              L3: {
                var7 = 1 + (param5 + param3);
                if (param2 + param0.field_H >= var7) {
                  break L3;
                } else {
                  var7 = -1 + param0.field_H;
                  break L3;
                }
              }
              L4: {
                var8 = var6_int;
                var9 = param3 * param3;
                var10 = 0;
                var11 = -var8 + param5;
                var12 = var11 * var11;
                if (param5 <= var7) {
                  break L4;
                } else {
                  param5 = var7;
                  break L4;
                }
              }
              var13 = var12 + -var11;
              L5: while (true) {
                if (var8 >= param5) {
                  var11 = -param5 + var8;
                  var10 = param3;
                  var13 = var9 + var11 * var11;
                  var12 = var13 - var10;
                  var13 = var13 - var11;
                  L6: while (true) {
                    if (var7 <= var8) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L7: while (true) {
                        L8: {
                          if (var9 >= var13) {
                            break L8;
                          } else {
                            if (var9 >= var12) {
                              break L8;
                            } else {
                              incrementValue$4 = var10;
                              var10--;
                              var13 = var13 - (incrementValue$4 - -var10);
                              var12 = var12 - (var10 + var10);
                              continue L7;
                            }
                          }
                        }
                        L9: {
                          var14 = param4 - var10;
                          if (var14 < 0) {
                            var14 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          var15 = param4 - -var10;
                          if (-1 + param0.field_y < var15) {
                            var15 = -1 + param0.field_y;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var19 = var14 + var8 * param0.field_y;
                        var16 = var19;
                        var17 = var14;
                        L11: while (true) {
                          if (var17 > var15) {
                            var13 = var13 + (var11 + var11);
                            var8++;
                            incrementValue$5 = var11;
                            var11++;
                            var12 = var12 + (incrementValue$5 - -var11);
                            continue L6;
                          } else {
                            L12: {
                              if (0 != param1.field_m[var19]) {
                                param1.field_m[var19] = (byte)-4;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var19++;
                            var17++;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L13: while (true) {
                    L14: {
                      if (var13 <= var9) {
                        break L14;
                      } else {
                        if (var9 < var12) {
                          L15: {
                            var14 = 1 + param4 - var10;
                            if (-1 >= (var14 ^ -1)) {
                              break L15;
                            } else {
                              var14 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            var15 = param4 - -var10;
                            if (var15 <= param0.field_y + -1) {
                              break L16;
                            } else {
                              var15 = param0.field_y + -1;
                              break L16;
                            }
                          }
                          var16 = var8 * param0.field_y + var14;
                          incrementValue$6 = var11;
                          var11--;
                          var12 = var12 - (incrementValue$6 - -var11);
                          var17 = var14;
                          L17: while (true) {
                            if (var17 >= var15) {
                              var8++;
                              var13 = var13 - (var11 - -var11);
                              continue L5;
                            } else {
                              L18: {
                                if (0 == param1.field_m[var16]) {
                                  break L18;
                                } else {
                                  param1.field_m[var16] = (byte)-2;
                                  break L18;
                                }
                              }
                              var16++;
                              var17++;
                              continue L17;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    var12 = var12 + (var10 + var10);
                    incrementValue$7 = var10;
                    var10++;
                    var13 = var13 + (incrementValue$7 + var10);
                    continue L13;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var6 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var6);
            stackOut_47_1 = new StringBuilder().append("th.F(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L19;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L19;
            }
          }
          L20: {
            stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L20;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L20;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String a(byte param0, int param1) {
        if (param0 <= 107) {
            return (String) null;
        }
        if ((param1 ^ -1) > -1) {
            return null;
        }
        if (param1 >= this.field_h.length) {
            return null;
        }
        return fd.a(false, this.field_h[param1]);
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "Music: ";
        field_j = "Hair";
        field_g = new int[]{13, 14, 15, 16, 17, 18, 43, 44, 59, 40};
        field_a = "GAME DRAWN<br><br>";
        field_b = new int[]{4};
    }
}
