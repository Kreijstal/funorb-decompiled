/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int[][] field_d;
    static String field_a;
    static int field_c;
    static boolean field_b;

    public static void b(int param0) {
        if (param0 != 8421504) {
            return;
        }
        try {
            field_a = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ef.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ef.a((byte) -118);
                break L1;
              }
            }
            L2: {
              ll.field_q = param1;
              if (null == q.field_f) {
                break L2;
              } else {
                q.field_f.a(param1, 1000000);
                break L2;
              }
            }
            L3: {
              if (ja.field_g != null) {
                ja.field_g.a(param1, param0 + -2);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ef.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ef.toString()");
        }
    }

    final static int a(nk param0, int param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.i(-110);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= var4) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~param2[var5];
                    stackOut_3_1 = -1;
                    stackIn_30_0 = stackOut_3_0;
                    stackIn_30_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
                          var3_int++;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (param2[var5] != 1) {
                          break L5;
                        } else {
                          var3_int += 2;
                          break L5;
                        }
                      }
                      L6: {
                        if (2 != param2[var5]) {
                          break L6;
                        } else {
                          var3_int += 3;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2[var5] != 3) {
                          break L7;
                        } else {
                          var3_int += 4;
                          break L7;
                        }
                      }
                      L8: {
                        if (param2[var5] == 4) {
                          var3_int += 5;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (20 != param2[var5]) {
                          break L9;
                        } else {
                          var3_int += 10;
                          break L9;
                        }
                      }
                      L10: {
                        if (param2[var5] != 34) {
                          break L10;
                        } else {
                          var3_int += 25;
                          break L10;
                        }
                      }
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_29_0 = param1;
                stackOut_29_1 = 12258;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                break L2;
              }
              L11: {
                if (stackIn_30_0 == stackIn_30_1) {
                  break L11;
                } else {
                  ef.a(-71);
                  break L11;
                }
              }
              var3_int++;
              stackOut_33_0 = var3_int;
              stackIn_34_0 = stackOut_33_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("ef.D(");
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L12;
            }
          }
          L13: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L13;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ')');
        }
        return stackIn_34_0;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = 1;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 >= 30) {
                    break L3;
                  } else {
                    stackOut_3_0 = -1;
                    stackOut_3_1 = ~(var1_int & jb.field_P);
                    stackIn_23_0 = stackOut_3_0;
                    stackIn_23_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 != stackIn_4_1) {
                            L6: {
                              L7: {
                                mm.field_g.a(71, (byte) -117);
                                mm.field_g.a((byte) 122, var2);
                                if (var2 < 10) {
                                  break L7;
                                } else {
                                  mm.field_g.d(jh.field_a[var2 + -10], 31);
                                  if (var4 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              mm.field_g.d(0, 105);
                              break L6;
                            }
                            var3 = 0;
                            L8: while (true) {
                              if (var3 >= 4) {
                                break L5;
                              } else {
                                mm.field_g.b(true, 0);
                                var3++;
                                if (var4 != 0) {
                                  break L4;
                                } else {
                                  if (var4 == 0) {
                                    continue L8;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var1_int = var1_int << 787347489;
                        var2++;
                        break L4;
                      }
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_22_0 = -70;
                stackOut_22_1 = (param0 - 40) / 32;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L2;
              }
              var3 = stackIn_23_0 / stackIn_23_1;
              jb.field_P = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ef.A(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gh var7 = null;
        int var7_int = 0;
        int var8 = 0;
        gh var8_ref_gh = null;
        int var9_int = 0;
        qh var9 = null;
        int var10 = 0;
        qh var10_ref_qh = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        gh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        gh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        gh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_23_0 = 0;
        int stackIn_65_0 = 0;
        qh stackIn_69_0 = null;
        qh stackIn_94_0 = null;
        qh stackIn_112_0 = null;
        int stackIn_113_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        gh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        gh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        gh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_22_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        qh stackOut_68_0 = null;
        qh stackOut_93_0 = null;
        gh stackOut_111_0 = null;
        int stackOut_112_0 = 0;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              sf.field_t = pb.field_j;
              re.field_Z = pb.field_c;
              stackOut_1_0 = 61;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param1) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = bd.field_c;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = fj.field_f;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              vb.a((byte) stackIn_5_0, stackIn_5_1);
              fg.field_Tb.a(-2 + (ql.field_ec.field_Lb + -40), 0, ql.field_ec.field_zb, param0 ^ 3, 0);
              uj.field_e.a(0, 0, db.field_b, 0, m.field_i.field_zb);
              stackOut_5_0 = gl.field_u;
              stackOut_5_1 = 0;
              stackOut_5_2 = db.field_b + 2;
              stackOut_5_3 = 18;
              stackOut_5_4 = 0;
              stackOut_5_5 = m.field_i.field_zb;
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              stackIn_8_3 = stackOut_5_3;
              stackIn_8_4 = stackOut_5_4;
              stackIn_8_5 = stackOut_5_5;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              stackIn_6_4 = stackOut_5_4;
              stackIn_6_5 = stackOut_5_5;
              if (!rm.field_p) {
                stackOut_8_0 = (gh) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                stackIn_9_5 = stackOut_8_5;
                stackIn_9_6 = stackOut_8_6;
                break L2;
              } else {
                stackOut_6_0 = (gh) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = stackIn_6_5;
                stackOut_6_6 = 40 + (ua.field_G + 2) - -2;
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_9_2 = stackOut_6_2;
                stackIn_9_3 = stackOut_6_3;
                stackIn_9_4 = stackOut_6_4;
                stackIn_9_5 = stackOut_6_5;
                stackIn_9_6 = stackOut_6_6;
                break L2;
              }
            }
            L3: {
              ((gh) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5 - stackIn_9_6);
              ei.field_p.a(0, db.field_b + 2, 18, -2 + (m.field_i.field_zb - (ua.field_G + 40)), 42 + ua.field_G);
              gl.field_t.a(m.field_i.field_zb, -2048, ua.field_G, -2 + (-db.field_b + m.field_i.field_Lb) + -20, 2, 0, db.field_b + 22);
              mn.field_E.a(0, -40 + ql.field_ec.field_Lb, 40, 0, ql.field_ec.field_zb);
              nm.field_q.a(0, 0, 30, 0, gl.field_y.field_zb);
              qa.field_L.a(0, 30, -30 + gl.field_y.field_Lb + -42, 0, gl.field_y.field_zb);
              var2_int = 3 + be.field_a;
              if (jg.field_l.length >= 2) {
                break L3;
              } else {
                var2_int--;
                break L3;
              }
            }
            L4: {
              if (param1) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = -2 + ((var2_int + 1) / 2 + -8 + (-5 + (qa.field_L.field_Lb - 5))) / (var2_int - -1);
              if (var3 <= 30) {
                break L5;
              } else {
                var3 = 30;
                break L5;
              }
            }
            L6: {
              var4 = -(var2_int * (2 + var3)) + (qa.field_L.field_Lb + -5 - 5);
              if (var4 <= 40) {
                break L6;
              } else {
                var4 = 40;
                break L6;
              }
            }
            bj.field_d.a(param0 + -1, 5, var4, 5, -10 + qa.field_L.field_zb);
            var5 = 2 + (5 + var4);
            var6 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  L10: {
                    if (~var6 <= ~(4 + be.field_a)) {
                      break L10;
                    } else {
                      stackOut_22_0 = ~var6;
                      stackIn_113_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (var13 != 0) {
                        break L8;
                      } else {
                        L11: {
                          L12: {
                            L13: {
                              if (stackIn_23_0 != -2) {
                                break L13;
                              } else {
                                if (2 > jg.field_l.length) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              if (var6 != 3) {
                                break L14;
                              } else {
                                if (tc.field_z > 1) {
                                  break L14;
                                } else {
                                  if (var13 == 0) {
                                    break L12;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            L15: {
                              L16: {
                                if (param1) {
                                  break L16;
                                } else {
                                  if (var6 == 3) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                L18: {
                                  if (!param1) {
                                    break L18;
                                  } else {
                                    if (0 == var6) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  L20: {
                                    if (!param1) {
                                      break L20;
                                    } else {
                                      if (var6 < 4) {
                                        break L20;
                                      } else {
                                        if (ch.field_G == null) {
                                          break L20;
                                        } else {
                                          if (!ch.field_G[var6 + -4]) {
                                            break L20;
                                          } else {
                                            stackOut_62_0 = 1;
                                            stackIn_65_0 = stackOut_62_0;
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_64_0 = 0;
                                  stackIn_65_0 = stackOut_64_0;
                                  break L19;
                                }
                                L21: {
                                  L22: {
                                    var7_int = stackIn_65_0;
                                    if (var7_int == 0) {
                                      break L22;
                                    } else {
                                      var8_ref_gh = sl.field_k[var6];
                                      sl.field_k[var6].field_Lb = 0;
                                      var8_ref_gh.field_zb = 0;
                                      var9_int = 0;
                                      L23: while (true) {
                                        L24: {
                                          if (un.field_h[var6].length <= var9_int) {
                                            break L24;
                                          } else {
                                            stackOut_68_0 = un.field_h[var6][var9_int];
                                            stackIn_112_0 = stackOut_68_0;
                                            stackIn_69_0 = stackOut_68_0;
                                            if (var13 != 0) {
                                              break L9;
                                            } else {
                                              L25: {
                                                if (stackIn_69_0 != null) {
                                                  var10_ref_qh = un.field_h[var6][var9_int];
                                                  un.field_h[var6][var9_int].field_Lb = 0;
                                                  var10_ref_qh.field_zb = 0;
                                                  break L25;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                              var9_int++;
                                              if (var13 == 0) {
                                                continue L23;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                        if (var13 == 0) {
                                          break L21;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                  L26: {
                                    L27: {
                                      sl.field_k[var6].a(0, var5, var3, 5, 103);
                                      var8 = 110;
                                      if (param1) {
                                        break L27;
                                      } else {
                                        if (null == un.field_h[var6][0]) {
                                          break L26;
                                        } else {
                                          var9 = un.field_h[var6][0];
                                          un.field_h[var6][0].field_Lb = 0;
                                          var9.field_zb = 0;
                                          if (var13 == 0) {
                                            break L26;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                    un.field_h[var6][0].a(var3, 38, 2, var8, va.field_e, var5, (byte) 122);
                                    var8 += 40;
                                    break L26;
                                  }
                                  var9_int = 2 + gl.field_y.field_zb - (5 + var8);
                                  var10 = un.field_h[var6].length - 1;
                                  var11 = 0;
                                  L28: while (true) {
                                    L29: {
                                      if (var11 >= var10) {
                                        break L29;
                                      } else {
                                        var12 = var9_int * var11 / var10;
                                        un.field_h[var6][var11 + 1].a(var3, -var12 + (1 + var11) * var9_int / var10 + -2, 2, var8 - -var12, va.field_e, var5, (byte) 121);
                                        var11++;
                                        if (var13 != 0) {
                                          break L21;
                                        } else {
                                          if (var13 == 0) {
                                            continue L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                    var5 = var5 + (var3 - -2);
                                    break L21;
                                  }
                                }
                                if (var13 == 0) {
                                  break L12;
                                } else {
                                  break L17;
                                }
                              }
                              var7 = sl.field_k[var6];
                              sl.field_k[var6].field_Lb = 0;
                              var7.field_zb = 0;
                              var8 = 0;
                              L30: while (true) {
                                L31: {
                                  if (un.field_h[var6].length <= var8) {
                                    break L31;
                                  } else {
                                    stackOut_93_0 = un.field_h[var6][var8];
                                    stackIn_112_0 = stackOut_93_0;
                                    stackIn_94_0 = stackOut_93_0;
                                    if (var13 != 0) {
                                      break L9;
                                    } else {
                                      L32: {
                                        if (stackIn_94_0 != null) {
                                          var9 = un.field_h[var6][var8];
                                          un.field_h[var6][var8].field_Lb = 0;
                                          var9.field_zb = 0;
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      var8++;
                                      if (var13 == 0) {
                                        continue L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                if (var13 == 0) {
                                  break L12;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var7 = sl.field_k[var6];
                            sl.field_k[var6].field_Lb = 0;
                            var7.field_zb = 0;
                            var8 = 0;
                            L33: while (true) {
                              if (~var8 <= ~un.field_h[var6].length) {
                                break L12;
                              } else {
                                if (var13 != 0) {
                                  break L11;
                                } else {
                                  L34: {
                                    if (null == un.field_h[var6][var8]) {
                                      break L34;
                                    } else {
                                      var9 = un.field_h[var6][var8];
                                      un.field_h[var6][var8].field_Lb = 0;
                                      var9.field_zb = 0;
                                      break L34;
                                    }
                                  }
                                  var8++;
                                  if (var13 == 0) {
                                    continue L33;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          break L11;
                        }
                        if (var13 == 0) {
                          continue L7;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  fb.field_r.a(0, 10, -134 + (pb.field_j - 10), pb.field_c - 360 >> 1631134849, 360);
                  tf.field_a.a(0, 0, 24, 0, fb.field_r.field_zb);
                  nd.field_a.a(0, 24, fb.field_r.field_Lb - 24, 0, fb.field_r.field_zb);
                  nd.field_a.field_I = se.a(3, param0, 11579568, nd.field_a.field_Lb, 8421504, 13574);
                  fl.field_c.a(0, 5, -26 + (-10 + nd.field_a.field_Lb), 5, -10 + nd.field_a.field_zb);
                  stackOut_111_0 = ta.field_i;
                  stackIn_112_0 = (qh) (Object) stackOut_111_0;
                  break L9;
                }
                ((gh) (Object) stackIn_112_0).a(0, -29 + nd.field_a.field_Lb, 24, (-80 + nd.field_a.field_zb) / 2, 80);
                stackOut_112_0 = 1;
                stackIn_113_0 = stackOut_112_0;
                break L8;
              }
              ql.b(stackIn_113_0 != 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ef.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (mg.field_ac) {
              L1: {
                ck.field_a = true;
                if (param0 == 12) {
                  break L1;
                } else {
                  field_b = true;
                  break L1;
                }
              }
              nj.a(false, 40);
              uj.field_d = 0;
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ef.F(" + param0 + ')');
        }
    }

    final static boolean b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (param1 >= 0) {
              if (param1 >= 1582) {
                if (param1 % 4 != 0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                } else {
                  if (param1 % 100 == 0) {
                    if (param1 % 400 != 0) {
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      return stackIn_28_0 != 0;
                    } else {
                      if (param0 == -15020) {
                        stackOut_32_0 = 1;
                        stackIn_33_0 = stackOut_32_0;
                        break L0;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        return stackIn_31_0 != 0;
                      }
                    }
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  }
                }
              } else {
                L1: {
                  if (param1 % 4 != 0) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L1;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_15_0 = stackOut_12_0;
                    break L1;
                  }
                }
                return stackIn_15_0 != 0;
              }
            } else {
              L2: {
                if ((param1 + 1) % 4 != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              }
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ef.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_33_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[][]{new int[3], new int[4], new int[4], new int[3], new int[4], new int[3], new int[3], new int[5], new int[5], new int[3], new int[3], new int[3], new int[4], new int[2], new int[5], new int[5], new int[5], new int[5], new int[4], new int[4], new int[4], new int[2], new int[5], new int[1], new int[5], new int[5], new int[5], new int[3], new int[5], new int[5], new int[5], new int[3], new int[6], new int[5], new int[5], new int[2], new int[6], new int[3], new int[5], new int[9], new int[7], new int[1]};
        field_c = 0;
        field_b = false;
        field_a = "You have withdrawn your request to join.";
    }
}
