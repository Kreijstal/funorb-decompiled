/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    static tf field_b;
    static ii field_e;
    static boolean field_d;
    static int field_a;
    static int field_c;
    static String field_f;

    final static void a(int param0, boolean param1) {
        pc var2;
        var2 = aa.field_f;
        var2.g(param0, 15514);
        var2.e(160, 2);
        var2.e(160, 4);
        if (!param1) {
          ro.b(16, true);
          var2.e(160, hk.a((byte) -102));
          return;
        } else {
          var2.e(160, hk.a((byte) -102));
          return;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        if (param0) {
            field_b = (tf) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        pc var2;
        var2 = aa.field_f;
        var2.g(param1, 15514);
        if (param0 <= 124) {
          return;
        } else {
          var2.e(160, 1);
          var2.e(160, 2);
          return;
        }
    }

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (fm.field_b == null) {
                break L1;
              } else {
                fm.field_b.field_W.a((byte) -98, args);
                break L1;
              }
            }
            if (param1 == 2) {
              if (aa.field_c != null) {
                aa.field_c.field_S.a((byte) -90, args);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ro.F(");

            if (args == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, tf[][] param1, int param2, int param3, fm param4, String[] param5, int[] param6, String[][] param7, hh[] param8, int param9, int[] param10, byte[] param11, String[][] param12, fm param13, tf[][] param14, byte[] param15, fm param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        String[] var19 = null;
        try {
          L0: {
            L1: {
              var19 = (String[]) null;
              d.a(param16, param13, true, param11, param7, param2, param8, param6, (String[]) null, 1, param0, param12, param9, param10, param1, param4, param5, param15, param14);
              if (param3 == -15690) {
                break L1;
              } else {
                var18 = (String[]) null;
                ro.a((String[]) null, -104);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var17);

            stackIn_5_1 = new StringBuilder().append("ro.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param15 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param16 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_42_2 + ')');
        }
    }

    final static int b(int param0, boolean param1) {
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_84_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            oe.field_Sb = oe.field_Sb + 65536;
            L1: while (true) {
              if (fp.a(true, ui.field_j, oe.field_Sb) < 65536) {
                L2: {
                  var2_int = -1;
                  if (wg.field_g != null) {
                    var2_int = wg.field_g.length;
                    break L2;
                  } else {
                    if (li.field_a == null) {
                      break L2;
                    } else {
                      var2_int = li.field_a.length;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 != var2_int) {
                    L4: {
                      if (ui.field_a > jn.field_q) {
                        L5: {
                          jn.field_q = jn.field_q + 1;
                          if (ui.field_k >= jn.field_q) {
                            break L5;
                          } else {
                            L6: {
                              if (null == wg.field_g) {
                                break L6;
                              } else {
                                if (null == wg.field_g[ae.field_b]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            jn.field_q = jn.field_q - 1;
                            break L4;
                          }
                        }
                        if (jn.field_q < ui.field_a) {
                          break L4;
                        } else {
                          if (wg.field_g[(ae.field_b + 1) % var2_int] != null) {
                            break L4;
                          } else {
                            jn.field_q = jn.field_q - 1;
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      if (ui.field_a > jn.field_q) {
                        break L7;
                      } else {
                        L8: {
                          jc.field_b = ae.field_b;
                          if (!pm.field_e) {
                            ae.field_b = ae.field_b - 1;
                            if (ae.field_b < 0) {
                              ae.field_b = ae.field_b + var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            ae.field_b = ae.field_b + 1;
                            if (ae.field_b >= var2_int) {
                              ae.field_b = ae.field_b - var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        jn.field_q = jn.field_q - ui.field_a;
                        break L7;
                      }
                    }
                    if (jn.field_q > ui.field_k) {
                      pm.field_e = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L9: {
                  if (param0 < -21) {
                    break L9;
                  } else {
                    field_c = 69;
                    break L9;
                  }
                }
                L10: {
                  if (gp.field_Kb == null) {
                    break L10;
                  } else {
                    L11: {
                      var3 = 357 - gp.field_Kb.field_B / 2;
                      var4 = 0;
                      if (-1 == (nm.field_c ^ -1)) {
                        break L11;
                      } else {
                        if (ji.field_c <= var3) {
                          break L11;
                        } else {
                          if (ji.field_c < gp.field_Kb.field_E + var3) {
                            L12: {
                              if (-gp.field_Kb.field_F + 269 >= uo.field_a) {
                                break L12;
                              } else {
                                if (269 <= uo.field_a) {
                                  break L12;
                                } else {
                                  jn.field_q = ui.field_a;
                                  pm.field_e = false;
                                  var4 = 1;
                                  break L12;
                                }
                              }
                            }
                            if (586 >= uo.field_a) {
                              break L11;
                            } else {
                              if (uo.field_a < 586 + gp.field_Kb.field_F) {
                                var4 = 1;
                                pm.field_e = true;
                                jn.field_q = ui.field_a;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (jn.field_q <= ui.field_k) {
                        break L10;
                      } else {
                        if (bg.field_k <= var3) {
                          break L10;
                        } else {
                          if (var3 - -gp.field_Kb.field_E > bg.field_k) {
                            L13: {
                              if (uf.field_d <= -gp.field_Kb.field_F + 269) {
                                break L13;
                              } else {
                                if (269 <= uf.field_d) {
                                  break L13;
                                } else {
                                  jn.field_q = ui.field_k;
                                  break L13;
                                }
                              }
                            }
                            if (uf.field_d <= 586) {
                              break L10;
                            } else {
                              if (uf.field_d < gp.field_Kb.field_F + 586) {
                                jn.field_q = ui.field_k;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                L14: {
                  if (!param1) {
                    break L14;
                  } else {
                    L15: {
                      a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
                      if (!a.field_I.a(19)) {
                        break L15;
                      } else {
                        if (a.field_I.field_j == 0) {
                          stackIn_63_0 = 3;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          if ((a.field_I.field_j ^ -1) == -2) {
                            stackIn_67_0 = 2;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    stackIn_70_0 = 116;
                    L16: while (true) {
                      if (!bh.b((byte) stackIn_70_0)) {
                        break L14;
                      } else {
                        L17: {
                          a.field_I.a(99, 0);
                          if (a.field_I.a(57)) {
                            if (-1 != (a.field_I.field_j ^ -1)) {
                              if (a.field_I.field_j == 1) {
                                stackIn_79_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L17;
                              }
                            } else {
                              stackIn_75_0 = 3;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          } else {
                            break L17;
                          }
                        }
                        if (ke.field_a != 13) {
                          stackIn_70_0 = 116;
                          continue L16;
                        } else {
                          stackIn_82_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackIn_84_0 = 0;
                decompiledRegionSelector0 = 5;
                break L0;
              } else {
                oe.field_Sb = oe.field_Sb - ui.field_j;
                qk.field_e = qk.field_e + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ro.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_63_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_67_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_75_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_79_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_82_0;
                } else {
                  return stackIn_84_0;
                }
              }
            }
          }
        }
    }

    static {
        field_f = "Twisted Logic";
    }
}
