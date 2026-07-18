/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ob {
    static String field_J;
    static java.awt.Color field_H;
    static String field_K;
    static String field_I;
    static String[] field_L;

    final int b(byte param0, int param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
              if (param0 == 6) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            if (null == var3) {
              stackOut_6_0 = ((cm) this).field_x;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.field_ib;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "cm.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static eg[] a(eg param0, int[] param1, boolean param2) {
        RuntimeException var3 = null;
        eg[] var3_array = null;
        eg var4 = null;
        eg var5 = null;
        eg var6 = null;
        eg var7 = null;
        eg var8 = null;
        int var9 = 0;
        int var10 = 0;
        eg var11_ref_eg = null;
        int var11 = 0;
        eg var12_ref_eg = null;
        int var12 = 0;
        eg var13 = null;
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_25_0 = 0;
        eg stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_27_0 = 0;
        eg stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        eg stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        eg[] stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_24_0 = 0;
        eg stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_27_0 = 0;
        eg stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_25_0 = 0;
        eg stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        eg[] stackOut_32_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var14 = Pool.field_O;
        try {
          L0: {
            if (param2) {
              var3_array = new eg[param1[0] * param1[1] * param1[2]];
              var9 = 0;
              var5 = new eg(param0, false, false, false, false);
              var10 = 0;
              L1: while (true) {
                stackOut_5_0 = var10;
                stackOut_5_1 = param1[0];
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                L2: while (true) {
                  L3: {
                    if (stackIn_6_0 >= stackIn_6_1) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          if (-1 + param1[0] <= var10) {
                            break L5;
                          } else {
                            var4 = hq.b((byte) 122);
                            var11_ref_eg = hq.b((byte) 124);
                            ej.a(0, var4, param0.field_D + (1 - -var10) * (param0.field_w + -param0.field_D) / param1[0], false, 0, 0, 1, 0, var11_ref_eg, var5);
                            var5 = var11_ref_eg;
                            if (var14 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4 = var5;
                        break L4;
                      }
                      var7 = var4;
                      var11 = 0;
                      L6: while (true) {
                        stackOut_11_0 = ~param1[1];
                        stackOut_11_1 = ~var11;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        L7: while (true) {
                          L8: {
                            if (stackIn_12_0 >= stackIn_12_1) {
                              break L8;
                            } else {
                              stackOut_13_0 = var11;
                              stackOut_13_1 = param1[1] - 1;
                              stackIn_6_0 = stackOut_13_0;
                              stackIn_6_1 = stackOut_13_1;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              if (var14 != 0) {
                                continue L2;
                              } else {
                                L9: {
                                  L10: {
                                    if (stackIn_14_0 < stackIn_14_1) {
                                      break L10;
                                    } else {
                                      var6 = var7;
                                      if (var14 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  var6 = hq.b((byte) 123);
                                  var12_ref_eg = hq.b((byte) 125);
                                  ej.a((1 - -var11) * (-param0.field_y + param0.field_S) / param1[1] + param0.field_y, var6, 0, false, 0, 1, 0, 0, var12_ref_eg, var7);
                                  var7 = var12_ref_eg;
                                  break L9;
                                }
                                var8 = var6;
                                var12 = 0;
                                L11: while (true) {
                                  L12: {
                                    if (~var12 <= ~param1[2]) {
                                      break L12;
                                    } else {
                                      stackOut_19_0 = ~var12;
                                      stackOut_19_1 = ~(param1[2] - 1);
                                      stackIn_12_0 = stackOut_19_0;
                                      stackIn_12_1 = stackOut_19_1;
                                      stackIn_20_0 = stackOut_19_0;
                                      stackIn_20_1 = stackOut_19_1;
                                      if (var14 != 0) {
                                        continue L7;
                                      } else {
                                        L13: {
                                          L14: {
                                            if (stackIn_20_0 > stackIn_20_1) {
                                              break L14;
                                            } else {
                                              var3_array[var9] = var8;
                                              if (var14 == 0) {
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L15: {
                                            var3_array[var9] = hq.b((byte) 124);
                                            var13 = hq.b((byte) 126);
                                            stackOut_24_0 = 0;
                                            stackOut_24_1 = var3_array[var9];
                                            stackOut_24_2 = 0;
                                            stackIn_27_0 = stackOut_24_0;
                                            stackIn_27_1 = stackOut_24_1;
                                            stackIn_27_2 = stackOut_24_2;
                                            stackIn_25_0 = stackOut_24_0;
                                            stackIn_25_1 = stackOut_24_1;
                                            stackIn_25_2 = stackOut_24_2;
                                            if (param2) {
                                              stackOut_27_0 = stackIn_27_0;
                                              stackOut_27_1 = (eg) (Object) stackIn_27_1;
                                              stackOut_27_2 = stackIn_27_2;
                                              stackOut_27_3 = 0;
                                              stackIn_28_0 = stackOut_27_0;
                                              stackIn_28_1 = stackOut_27_1;
                                              stackIn_28_2 = stackOut_27_2;
                                              stackIn_28_3 = stackOut_27_3;
                                              break L15;
                                            } else {
                                              stackOut_25_0 = stackIn_25_0;
                                              stackOut_25_1 = (eg) (Object) stackIn_25_1;
                                              stackOut_25_2 = stackIn_25_2;
                                              stackOut_25_3 = 1;
                                              stackIn_28_0 = stackOut_25_0;
                                              stackIn_28_1 = stackOut_25_1;
                                              stackIn_28_2 = stackOut_25_2;
                                              stackIn_28_3 = stackOut_25_3;
                                              break L15;
                                            }
                                          }
                                          ej.a(stackIn_28_0, stackIn_28_1, stackIn_28_2, stackIn_28_3 != 0, param0.field_V + (var12 + 1) * (-param0.field_V + param0.field_x) / param1[2], 0, 0, 1, var13, var8);
                                          var8 = var13;
                                          break L13;
                                        }
                                        var9++;
                                        var12++;
                                        if (var14 == 0) {
                                          continue L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  if (var14 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var10++;
                          if (var14 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_32_0 = (eg[]) var3_array;
                  stackIn_33_0 = stackOut_32_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (eg[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("cm.S(");
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L16;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L16;
            }
          }
          L17: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L17;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L17;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param2 + ')');
        }
        return stackIn_33_0;
    }

    final static boolean f(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        dd var1_ref = null;
        int var2 = 0;
        dd var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            if (cr.field_m == null) {
              if (!hr.field_q.a("benefits", 0)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (rl.field_h.a("benefits/", 0)) {
                  cr.field_m = lb.a(hr.field_q, param0 + -29, "benefits", "members_benefits_borders");
                  var1_int = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var1_int >= cr.field_m.field_D.length) {
                          break L3;
                        } else {
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (0 == (-16777216 & cr.field_m.field_D[var1_int])) {
                                cr.field_m.field_D[var1_int] = 0;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var1_int++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      rf.field_g = pf.a("benefits", (byte) 118, "members_benefits_logo", hr.field_q);
                      qp.field_Rb = pf.a("benefits", (byte) 69, "members_benefits_price", hr.field_q);
                      break L2;
                    }
                    var1_ref = new dd(rl.field_h.a(false, "members_benefits_screenshots.jpg", "benefits/"), (java.awt.Component) (Object) vj.a((byte) -67));
                    dn.field_o = new dd[3];
                    var2 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (~var2 <= ~dn.field_o.length) {
                            break L7;
                          } else {
                            var3 = new dd(var1_ref.field_w, var1_ref.field_y / dn.field_o.length);
                            var3.e();
                            var1_ref.a(0, -var2 * var1_ref.field_y / dn.field_o.length);
                            dn.field_o[var2] = var3;
                            var2++;
                            if (var4 != 0) {
                              break L6;
                            } else {
                              if (var4 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (param0 == 109) {
                          sh.field_P.b(15100);
                          ef.a(-2107, cr.field_m, wm.field_Yb);
                          bq.a(40, qp.field_Rb, 80, 80, 15, -2400, 2, -1, 40);
                          kq.a(dn.field_o, -58);
                          hl.a(rf.field_g, 106);
                          break L6;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0 != 0;
                        }
                      }
                      stackOut_33_0 = 1;
                      stackIn_34_0 = stackOut_33_0;
                      break L0;
                    }
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "cm.W(" + param0 + ')');
        }
        return stackIn_34_0 != 0;
    }

    final int a(byte param0, int param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
              if (param0 == 69) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            if (null != var3) {
              stackOut_6_0 = var3.field_Db;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 36;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "cm.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void b(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                L11: {
                                  var4_int = ((cm) this).field_h[param2];
                                  if (var4_int != 65) {
                                    break L11;
                                  } else {
                                    if (var5 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var4_int != 64) {
                                    break L12;
                                  } else {
                                    if (var5 == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (var4_int == 63) {
                                  break L8;
                                } else {
                                  L13: {
                                    if (27 != var4_int) {
                                      break L13;
                                    } else {
                                      if (var5 == 0) {
                                        break L7;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (28 != var4_int) {
                                      break L14;
                                    } else {
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (44 != var4_int) {
                                      break L15;
                                    } else {
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  if (var4_int == 45) {
                                    break L4;
                                  } else {
                                    if (var4_int != 46) {
                                      break L2;
                                    } else {
                                      if (var5 == 0) {
                                        break L3;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              if (!((cm) this).field_B.b((byte) 64)) {
                                break L1;
                              } else {
                                if (!dl.a(0)) {
                                  break L1;
                                } else {
                                  ((cm) this).c(param0 ^ -16474, param1);
                                  if (var5 == 0) {
                                    break L1;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (!((cm) this).field_B.b((byte) 59)) {
                              break L1;
                            } else {
                              if (2 >= fr.field_n) {
                                break L1;
                              } else {
                                fr.field_n = fr.field_n - 1;
                                rj.c((byte) -45);
                                if (var5 == 0) {
                                  break L1;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (!((cm) this).field_B.b((byte) 89)) {
                            break L1;
                          } else {
                            if (fr.field_n >= 8) {
                              break L1;
                            } else {
                              fr.field_n = fr.field_n + 1;
                              rj.c((byte) -45);
                              if (var5 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (((cm) this).field_B.b((byte) 76)) {
                          er.field_W = (er.field_W + 1) % 3;
                          this.g(4);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        } else {
                          break L1;
                        }
                      }
                      if (!((cm) this).field_B.b((byte) 115)) {
                        break L1;
                      } else {
                        er.field_W = (er.field_W + 2) % 3;
                        this.g(param0 + 16474);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (!((cm) this).field_B.b((byte) 68)) {
                      break L1;
                    } else {
                      if (la.field_a > 0) {
                        la.field_a = la.field_a - 1;
                        kn.c(13);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (!((cm) this).field_B.b((byte) 71)) {
                    break L1;
                  } else {
                    if (~la.field_a > ~(te.field_p[0] - 1)) {
                      la.field_a = la.field_a + 1;
                      kn.c(param0 ^ -16473);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (!((cm) this).field_B.b((byte) 64)) {
                  break L1;
                } else {
                  un.field_e = 1 - un.field_e;
                  mb.d(param0 ^ 16424);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              super.b(-16470, param1, param2);
              break L1;
            }
            L16: {
              if (param0 == -16470) {
                break L16;
              } else {
                field_H = null;
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "cm.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              ((cm) this).field_p = false;
              var2_int = 20;
              var3 = 100;
              ((cm) this).a(var2_int, var3, -10);
              if (((cm) this).field_z == null) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = ((cm) this).field_z.field_y;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_4_0;
              if (param0 < -62) {
                break L2;
              } else {
                int discarded$7 = ((cm) this).d(4, 111);
                break L2;
              }
            }
            nm.field_a = new vh(-1L, (vh) null, var2_int, var3, qh.field_l + -(2 * var2_int), -var3 + var4 + (qh.field_f - var3), (String) null);
            bm.field_e = new vh(-1L, (vh) null, 40, 50, 240, 200, (String) null);
            bm.field_e.field_Fb = 1;
            bm.field_e.field_F = rm.field_g;
            bm.field_e.field_Kb = ln.field_s;
            nm.field_a.a(-114, bm.field_e);
            vh dupTemp$8 = u.a((byte) 68, 10, 55, false, 28);
            cj.field_V = dupTemp$8;
            bm.field_e.a(-102, dupTemp$8);
            vh dupTemp$9 = u.a((byte) 120, 210, 55, true, 27);
            we.field_f = dupTemp$9;
            bm.field_e.a(122, dupTemp$9);
            va.a(false, bm.field_e, cj.field_V);
            va.a(false, bm.field_e, we.field_f);
            jq.field_f = new vh(-1L, (vh) null, 0, 0, 160, 150, (String) null);
            jq.field_f.field_Fb = 1;
            jq.field_f.field_cb = 1;
            jq.field_f.field_F = mp.field_N;
            bm.field_e.a(-116, jq.field_f);
            this.g(4);
            al.field_v = new vh(-1L, (vh) null, 290, bm.field_e.field_eb, 270, 60, (String) null);
            al.field_v.field_hb = dq.a(4, 0, ab.field_h);
            al.field_v.field_hb.field_G = 10;
            al.field_v.field_F = rm.field_g;
            dk.a(al.field_v, (byte) 93);
            qk.field_f = new vh(-1L, (vh) null, 130, 10, 100, 40, (String) null);
            qk.field_f.field_cb = 1;
            qk.field_f.field_Fb = 1;
            qk.field_f.field_F = mp.field_N;
            al.field_v.a(-106, qk.field_f);
            va.a(false, al.field_v, qk.field_f);
            vh dupTemp$10 = u.a((byte) 67, 100, 10, false, 64);
            tn.field_w = dupTemp$10;
            al.field_v.a(114, dupTemp$10);
            vh dupTemp$11 = u.a((byte) 112, 235, 10, true, 63);
            ih.field_e = dupTemp$11;
            al.field_v.a(33, dupTemp$11);
            va.a(false, al.field_v, tn.field_w);
            va.a(false, al.field_v, ih.field_e);
            rj.c((byte) -45);
            nm.field_a.a(-111, al.field_v);
            hg.field_c = new vh(0L, (vh) null, al.field_v.field_qb, al.field_v.field_eb - (-al.field_v.field_Db - 10), al.field_v.field_gb, al.field_v.field_Db, (String) null);
            hg.field_c.field_Fb = 0;
            hg.field_c.field_F = rm.field_g;
            hg.field_c.field_hb = dq.a(4, 0, bf.field_e);
            hg.field_c.field_hb.field_G = al.field_v.field_hb.field_G;
            dk.a(hg.field_c, (byte) 93);
            nm.field_a.a(-99, hg.field_c);
            db.field_Nb = new vh(-1L, (vh) null, qk.field_f.field_qb, qk.field_f.field_eb, qk.field_f.field_gb, qk.field_f.field_Db, (String) null);
            db.field_Nb.field_Fb = 1;
            db.field_Nb.field_F = mp.field_N;
            db.field_Nb.field_cb = 1;
            hg.field_c.a(49, db.field_Nb);
            vh dupTemp$12 = u.a((byte) 102, tn.field_w.field_qb, tn.field_w.field_eb, false, 45);
            tk.field_f = dupTemp$12;
            hg.field_c.a(112, dupTemp$12);
            vh dupTemp$13 = u.a((byte) 124, ih.field_e.field_qb, tn.field_w.field_eb, true, 44);
            kb.field_i = dupTemp$13;
            hg.field_c.a(84, dupTemp$13);
            va.a(false, hg.field_c, tk.field_f);
            va.a(false, hg.field_c, kb.field_i);
            kn.c(13);
            kk.field_x = new vh(46L, (vh) null, al.field_v.field_qb, hg.field_c.field_eb - -hg.field_c.field_Db + 10, al.field_v.field_gb, al.field_v.field_Db, (String) null);
            kk.field_x.field_F = rm.field_g;
            kk.field_x.field_Fb = 0;
            kk.field_x.field_Kb = ln.field_s;
            kk.field_x.field_hb = dq.a(4, 0, s.field_d[3]);
            kk.field_x.field_yb = dq.a(3, 0, s.field_d[3]);
            kk.field_x.field_hb.field_G = al.field_v.field_hb.field_G;
            kk.field_x.field_yb.field_G = al.field_v.field_hb.field_G;
            dk.a(kk.field_x, (byte) 93);
            dp.field_c = new vh(-1L, (vh) null, qk.field_f.field_qb, qk.field_f.field_eb, qk.field_f.field_gb, qk.field_f.field_Db, (String) null);
            dp.field_c.field_Fb = 1;
            dp.field_c.field_F = mp.field_N;
            dp.field_c.field_cb = 1;
            mb.d(-113);
            kk.field_x.a(14, dp.field_c);
            nm.field_a.a(-118, kk.field_x);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "cm.AA(" + param0 + ')');
        }
    }

    final boolean a(int param0, boolean param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_7_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1) {
              var3 = nm.field_a.a((long)((cm) this).field_h[param0], (byte) 31);
              if (null == var3) {
                if (65 == ((cm) this).field_h[param0]) {
                  stackOut_9_0 = dl.a(0);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = var3.field_pb;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "cm.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    private final void g(int param0) {
        try {
            bm.field_e.field_hb = dq.a(param0, 0, im.field_ic[er.field_W]);
            jq.field_f.field_hb = sb.field_c[er.field_W];
            dp.a(bm.field_e, jq.field_f, -89);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cm.U(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            ((cm) this).a(false);
            nm.field_a.a((byte) -79, false);
            if (param0 >= 36) {
              var2_int = ((cm) this).field_B.field_e + -2;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((cm) this).field_B.field_e <= var2_int) {
                      break L3;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (((cm) this).e(var2_int, 48)) {
                            ((cm) this).b(true, var2_int);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var2_int++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "cm.J(" + param0 + ')');
        }
    }

    public static void g(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_K = null;
              field_H = null;
              field_I = null;
              field_J = null;
              if (param0 == 74) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            field_L = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "cm.V(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              nm.field_a.a(true, false);
              super.d(-1);
              if (~((cm) this).field_B.field_h > param0) {
                stackOut_3_0 = -1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = ((cm) this).field_h[((cm) this).field_B.field_h];
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            ek.a(nm.field_a, (byte) -111, var2_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "cm.K(" + param0 + ')');
        }
    }

    cm(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(db.field_Wb, param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.h(-108);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cm.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final int d(int param0, int param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                int discarded$2 = ((cm) this).a((byte) -23, 61);
                break L1;
              }
            }
            var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
            if (null == var3) {
              stackOut_6_0 = ((cm) this).field_t - -((-7 + param1) * 250);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.field_sb;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "cm.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 >= 16) {
              stackOut_3_0 = ib.field_u.a(false, param0, "");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("cm.P(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, boolean param2) {
        try {
            super.a(param0, param1, param2);
            mb.d(param0 ^ -107);
            rj.c((byte) -45);
            this.g(4);
            kn.c(13);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cm.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
              if (!param0) {
                break L1;
              } else {
                ((cm) this).a(16, -44, false);
                break L1;
              }
            }
            if (null == var3) {
              stackOut_6_0 = ((cm) this).field_C + (param1 + -7) * 280;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.field_sb - -var3.field_gb;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "cm.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void f(int param0) {
        oq var3 = null;
        bj var1 = (bj) (Object) tm.field_i.c((byte) -105);
        int var2 = -46 / ((-18 - param0) / 38);
        if (null == var1) {
            dn.c(-127);
            return;
        }
        try {
            var3 = kn.field_e;
            int discarded$0 = var3.b(true);
            int discarded$1 = var3.b(true);
            int discarded$2 = var3.b(true);
            int discarded$3 = var3.b(true);
            var1.a((byte) -117);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cm.T(" + param0 + ')');
        }
    }

    final boolean e(int param0, int param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_2_0 = false;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_1_0 = false;
        try {
          L0: {
            var3 = nm.field_a.a((long)((cm) this).field_h[param0], (byte) 31);
            var4 = 124 % ((param1 - -42) / 49);
            if (null == var3) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = var3.field_pb;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "cm.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_K = null;
        field_H = new java.awt.Color(10040319);
    }
}
