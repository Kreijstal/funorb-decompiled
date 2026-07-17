/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class ve extends ug {
    String field_jb;
    int field_R;
    String field_ib;

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_36_0 = null;
        Class stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_3_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_35_0 = null;
        Class stackOut_37_0 = null;
        Class stackOut_29_0 = null;
        Class stackOut_21_0 = null;
        Class stackOut_14_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_6_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            if (param1.equals((Object) (Object) "B")) {
              stackOut_3_0 = Byte.TYPE;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!param1.equals((Object) (Object) "I")) {
                if (!param1.equals((Object) (Object) "S")) {
                  if (!param1.equals((Object) (Object) "J")) {
                    L1: {
                      if (param0 == 11) {
                        break L1;
                      } else {
                        ve.a(-101, 122, 42, (pf) null, false);
                        break L1;
                      }
                    }
                    if (!param1.equals((Object) (Object) "Z")) {
                      if (param1.equals((Object) (Object) "F")) {
                        stackOut_26_0 = Float.TYPE;
                        stackIn_27_0 = stackOut_26_0;
                        return stackIn_27_0;
                      } else {
                        if (!param1.equals((Object) (Object) "D")) {
                          if (param1.equals((Object) (Object) "C")) {
                            stackOut_35_0 = Character.TYPE;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0;
                          } else {
                            stackOut_37_0 = Class.forName(param1);
                            stackIn_38_0 = stackOut_37_0;
                            break L0;
                          }
                        } else {
                          stackOut_29_0 = Double.TYPE;
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0;
                        }
                      }
                    } else {
                      stackOut_21_0 = Boolean.TYPE;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0;
                    }
                  } else {
                    stackOut_14_0 = Long.TYPE;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                } else {
                  stackOut_10_0 = Short.TYPE;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("ve.B(").append(param0).append(44);
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L2;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
        return stackIn_38_0;
    }

    final static void a(int param0, int param1, int param2, pf param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        int var20 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_47_0 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var20 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ea.b(false, 3 * (param2 + -param1));
              var7 = -112 % ((0 - param0) / 41);
              var6 = param1 * 3;
              var8 = -10 + var5_int;
              ud.a(-119);
              if (param3.field_a <= 0) {
                break L1;
              } else {
                if (null != param3.field_x) {
                  nj.a((byte) 125);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ug.field_Q = 0;
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param3.field_E >= ~var9) {
                    break L4;
                  } else {
                    var10 = param3.field_O[var9];
                    var11 = param3.field_g[var9];
                    var12 = param3.field_d[var9];
                    stackOut_10_0 = param4;
                    stackIn_48_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var20 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (!stackIn_11_0) {
                            break L6;
                          } else {
                            var13 = qa.field_b[var10];
                            var14 = ui.field_r[var10];
                            var15 = -var13 + qa.field_b[var11];
                            var16 = -var13 + qa.field_b[var12];
                            var17 = -var14 + ui.field_r[var11];
                            var18 = ui.field_r[var12] - var14;
                            if (-(var16 * var17) + var15 * var18 >= 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var13 = od.field_c[var10];
                        if (-2147483648 == var13) {
                          break L5;
                        } else {
                          L7: {
                            var14 = od.field_c[var11];
                            if (-2147483648 != var14) {
                              break L7;
                            } else {
                              if (var20 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var15 = od.field_c[var12];
                            if (var15 != -2147483648) {
                              break L8;
                            } else {
                              if (var20 == 0) {
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            var16 = var15 + var14 + (var13 + -var6);
                            stackOut_24_0 = -1;
                            stackOut_24_1 = rf.field_a.length;
                            stackIn_27_0 = stackOut_24_0;
                            stackIn_27_1 = stackOut_24_1;
                            stackIn_25_0 = stackOut_24_0;
                            stackIn_25_1 = stackOut_24_1;
                            if (var8 < 0) {
                              stackOut_27_0 = stackIn_27_0;
                              stackOut_27_1 = stackIn_27_1;
                              stackOut_27_2 = var16 << -var8;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              stackIn_28_2 = stackOut_27_2;
                              break L9;
                            } else {
                              stackOut_25_0 = stackIn_25_0;
                              stackOut_25_1 = stackIn_25_1;
                              stackOut_25_2 = var16 >> var8;
                              stackIn_28_0 = stackOut_25_0;
                              stackIn_28_1 = stackOut_25_1;
                              stackIn_28_2 = stackOut_25_2;
                              break L9;
                            }
                          }
                          var17 = stackIn_28_0 + (stackIn_28_1 + -stackIn_28_2);
                          var18 = rf.field_a[var17];
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var18 >> 4 == 0) {
                                  break L12;
                                } else {
                                  var17--;
                                  stackOut_30_0 = ~var17;
                                  stackOut_30_1 = -1;
                                  stackIn_39_0 = stackOut_30_0;
                                  stackIn_39_1 = stackOut_30_1;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  if (var20 != 0) {
                                    break L11;
                                  } else {
                                    L13: {
                                      if (stackIn_31_0 <= stackIn_31_1) {
                                        break L13;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var20 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var18 = rf.field_a[var17];
                                    if (var20 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_38_0 = var17 << 4;
                              stackOut_38_1 = var18;
                              stackIn_39_0 = stackOut_38_0;
                              stackIn_39_1 = stackOut_38_1;
                              break L11;
                            }
                            L14: {
                              var19 = stackIn_39_0 + stackIn_39_1;
                              gk.field_b[var19] = var9;
                              rf.field_a[var17] = 1 + var18;
                              if (param3.field_a <= 0) {
                                break L14;
                              } else {
                                if (null == param3.field_x) {
                                  break L14;
                                } else {
                                  ok.field_F[param3.field_x[var9]] = ok.field_F[param3.field_x[var9]] + 1;
                                  break L14;
                                }
                              }
                            }
                            ug.field_Q = ug.field_Q + 1;
                            break L5;
                          }
                        }
                      }
                      var9++;
                      if (var20 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_47_0 = -1;
                stackIn_48_0 = stackOut_47_0;
                break L3;
              }
              L15: {
                L16: {
                  if (stackIn_48_0 <= ~param3.field_a) {
                    break L16;
                  } else {
                    if (param3.field_x == null) {
                      break L16;
                    } else {
                      var9 = 0;
                      var10 = 0;
                      L17: while (true) {
                        if (var10 >= ok.field_F.length) {
                          break L16;
                        } else {
                          var11 = ok.field_F[var10];
                          ok.field_F[var10] = var9;
                          var9 = var9 + var11;
                          var10++;
                          if (var20 != 0) {
                            break L15;
                          } else {
                            if (var20 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L15;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5;
            stackOut_59_1 = new StringBuilder().append("ve.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param3 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L18;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L18;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        be var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_91_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        byte stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_90_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        var15 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_ref = new be(param1);
            var2_ref.field_k = -2 + param1.length;
            gi.field_o = var2_ref.d((byte) -46);
            fk.field_d = new byte[gi.field_o][];
            ka.field_f = new int[gi.field_o];
            j.field_f = new int[gi.field_o];
            cf.field_p = new int[gi.field_o];
            ga.field_b = new boolean[gi.field_o];
            qk.field_M = new byte[gi.field_o][];
            vb.field_a = new int[gi.field_o];
            var2_ref.field_k = -(gi.field_o * 8) + (param1.length + -7);
            ab.field_a = var2_ref.d((byte) -57);
            qe.field_p = var2_ref.d((byte) -119);
            var3 = (var2_ref.h(16383) & 255) - -1;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~gi.field_o) {
                    break L3;
                  } else {
                    ka.field_f[var4] = var2_ref.d((byte) -111);
                    var4++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (gi.field_o <= var4) {
                      break L6;
                    } else {
                      vb.field_a[var4] = var2_ref.d((byte) -101);
                      var4++;
                      if (var15 != 0) {
                        break L5;
                      } else {
                        if (var15 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (~gi.field_o >= ~var4) {
                        break L9;
                      } else {
                        cf.field_p[var4] = var2_ref.d((byte) -66);
                        var4++;
                        if (var15 != 0) {
                          break L8;
                        } else {
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L8;
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (~var4 <= ~gi.field_o) {
                          break L12;
                        } else {
                          j.field_f[var4] = var2_ref.d((byte) -62);
                          var4++;
                          if (var15 != 0) {
                            break L11;
                          } else {
                            if (var15 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var2_ref.field_k = param1.length - 7 + -(gi.field_o * 8) - -3 - var3 * 3;
                      qe.field_z = new int[var3];
                      break L11;
                    }
                    var4 = 1;
                    L13: while (true) {
                      L14: {
                        L15: {
                          if (~var3 >= ~var4) {
                            break L15;
                          } else {
                            qe.field_z[var4] = var2_ref.e(8);
                            stackOut_34_0 = ~qe.field_z[var4];
                            stackOut_34_1 = -1;
                            stackIn_42_0 = stackOut_34_0;
                            stackIn_42_1 = stackOut_34_1;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            if (var15 != 0) {
                              break L14;
                            } else {
                              L16: {
                                if (stackIn_35_0 != stackIn_35_1) {
                                  break L16;
                                } else {
                                  qe.field_z[var4] = 1;
                                  break L16;
                                }
                              }
                              var4++;
                              if (var15 == 0) {
                                continue L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        stackOut_41_0 = param0;
                        stackOut_41_1 = -28;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        break L14;
                      }
                      L17: {
                        if (stackIn_42_0 == stackIn_42_1) {
                          break L17;
                        } else {
                          ve.a((byte) -62, (byte[]) null);
                          break L17;
                        }
                      }
                      var2_ref.field_k = 0;
                      var4 = 0;
                      L18: while (true) {
                        stackOut_46_0 = var4;
                        stackIn_47_0 = stackOut_46_0;
                        L19: while (true) {
                          L20: {
                            L21: {
                              if (stackIn_47_0 >= gi.field_o) {
                                break L21;
                              } else {
                                var5 = cf.field_p[var4];
                                var6 = j.field_f[var4];
                                var7 = var6 * var5;
                                var8 = new byte[var7];
                                qk.field_M[var4] = var8;
                                var9 = new byte[var7];
                                fk.field_d[var4] = var9;
                                var10 = 0;
                                var11 = var2_ref.h(16383);
                                if (var15 != 0) {
                                  break L20;
                                } else {
                                  stackOut_49_0 = 0;
                                  stackOut_49_1 = var11;
                                  stackOut_49_2 = 1;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  L22: while (true) {
                                    L23: {
                                      L24: {
                                        L25: {
                                          if (stackIn_51_0 != (stackIn_51_1 & stackIn_51_2)) {
                                            break L25;
                                          } else {
                                            var12 = 0;
                                            L26: while (true) {
                                              L27: {
                                                if (var12 >= var7) {
                                                  break L27;
                                                } else {
                                                  var8[var12] = var2_ref.f(-126);
                                                  var12++;
                                                  if (var15 != 0) {
                                                    break L23;
                                                  } else {
                                                    if (var15 == 0) {
                                                      continue L26;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var11 & 2) == 0) {
                                                break L24;
                                              } else {
                                                var12 = 0;
                                                L28: while (true) {
                                                  L29: {
                                                    if (~var12 <= ~var7) {
                                                      break L29;
                                                    } else {
                                                      byte dupTemp$2 = var2_ref.f(param0 + -99);
                                                      var9[var12] = dupTemp$2;
                                                      var13 = dupTemp$2;
                                                      stackOut_61_0 = var10;
                                                      stackOut_61_1 = 0;
                                                      stackOut_61_2 = ~var13;
                                                      stackIn_51_0 = stackOut_61_0;
                                                      stackIn_51_1 = stackOut_61_1;
                                                      stackIn_51_2 = stackOut_61_2;
                                                      stackIn_62_0 = stackOut_61_0;
                                                      stackIn_62_1 = stackOut_61_1;
                                                      stackIn_62_2 = stackOut_61_2;
                                                      if (var15 != 0) {
                                                        continue L22;
                                                      } else {
                                                        L30: {
                                                          stackOut_62_0 = stackIn_62_0;
                                                          stackIn_65_0 = stackOut_62_0;
                                                          stackIn_63_0 = stackOut_62_0;
                                                          if (stackIn_62_1 == stackIn_62_2) {
                                                            stackOut_65_0 = stackIn_65_0;
                                                            stackOut_65_1 = 0;
                                                            stackIn_66_0 = stackOut_65_0;
                                                            stackIn_66_1 = stackOut_65_1;
                                                            break L30;
                                                          } else {
                                                            stackOut_63_0 = stackIn_63_0;
                                                            stackOut_63_1 = 1;
                                                            stackIn_66_0 = stackOut_63_0;
                                                            stackIn_66_1 = stackOut_63_1;
                                                            break L30;
                                                          }
                                                        }
                                                        var10 = stackIn_66_0 | stackIn_66_1;
                                                        var12++;
                                                        if (var15 == 0) {
                                                          continue L28;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var15 == 0) {
                                                    break L24;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var12 = 0;
                                        L31: while (true) {
                                          L32: {
                                            L33: {
                                              if (~var12 <= ~var5) {
                                                break L33;
                                              } else {
                                                stackOut_70_0 = 0;
                                                stackIn_80_0 = stackOut_70_0;
                                                stackIn_71_0 = stackOut_70_0;
                                                if (var15 != 0) {
                                                  break L32;
                                                } else {
                                                  var13 = stackIn_71_0;
                                                  L34: while (true) {
                                                    L35: {
                                                      L36: {
                                                        if (var6 <= var13) {
                                                          break L36;
                                                        } else {
                                                          var8[var12 - -(var13 * var5)] = var2_ref.f(-125);
                                                          var13++;
                                                          if (var15 != 0) {
                                                            break L35;
                                                          } else {
                                                            if (var15 == 0) {
                                                              continue L34;
                                                            } else {
                                                              break L36;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var12++;
                                                      break L35;
                                                    }
                                                    if (var15 == 0) {
                                                      continue L31;
                                                    } else {
                                                      break L33;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_79_0 = -1;
                                            stackIn_80_0 = stackOut_79_0;
                                            break L32;
                                          }
                                          if (stackIn_80_0 != ~(2 & var11)) {
                                            var12 = 0;
                                            L37: while (true) {
                                              stackOut_84_0 = ~var5;
                                              stackOut_84_1 = var12;
                                              stackOut_84_2 = -1;
                                              stackIn_85_0 = stackOut_84_0;
                                              stackIn_85_1 = stackOut_84_1;
                                              stackIn_85_2 = stackOut_84_2;
                                              L38: while (true) {
                                                if (stackIn_85_0 >= (stackIn_85_1 ^ stackIn_85_2)) {
                                                  break L24;
                                                } else {
                                                  stackOut_86_0 = 0;
                                                  stackIn_47_0 = stackOut_86_0;
                                                  stackIn_87_0 = stackOut_86_0;
                                                  if (var15 != 0) {
                                                    continue L19;
                                                  } else {
                                                    var13 = stackIn_87_0;
                                                    L39: while (true) {
                                                      L40: {
                                                        if (~var13 <= ~var6) {
                                                          break L40;
                                                        } else {
                                                          byte dupTemp$3 = var2_ref.f(-125);
                                                          var9[var13 * var5 + var12] = dupTemp$3;
                                                          var14 = dupTemp$3;
                                                          stackOut_89_0 = var10;
                                                          stackOut_89_1 = -1;
                                                          stackOut_89_2 = var14;
                                                          stackIn_85_0 = stackOut_89_0;
                                                          stackIn_85_1 = stackOut_89_1;
                                                          stackIn_85_2 = stackOut_89_2;
                                                          stackIn_90_0 = stackOut_89_0;
                                                          stackIn_90_1 = stackOut_89_1;
                                                          stackIn_90_2 = stackOut_89_2;
                                                          if (var15 != 0) {
                                                            continue L38;
                                                          } else {
                                                            L41: {
                                                              stackOut_90_0 = stackIn_90_0;
                                                              stackIn_93_0 = stackOut_90_0;
                                                              stackIn_91_0 = stackOut_90_0;
                                                              if (stackIn_90_1 == stackIn_90_2) {
                                                                stackOut_93_0 = stackIn_93_0;
                                                                stackOut_93_1 = 0;
                                                                stackIn_94_0 = stackOut_93_0;
                                                                stackIn_94_1 = stackOut_93_1;
                                                                break L41;
                                                              } else {
                                                                stackOut_91_0 = stackIn_91_0;
                                                                stackOut_91_1 = 1;
                                                                stackIn_94_0 = stackOut_91_0;
                                                                stackIn_94_1 = stackOut_91_1;
                                                                break L41;
                                                              }
                                                            }
                                                            var10 = stackIn_94_0 | stackIn_94_1;
                                                            var13++;
                                                            if (var15 == 0) {
                                                              continue L39;
                                                            } else {
                                                              break L40;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var12++;
                                                      if (var15 == 0) {
                                                        continue L37;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      ga.field_b[var4] = var10 != 0;
                                      var4++;
                                      break L23;
                                    }
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                            }
                            break L20;
                          }
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var2 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var2;
            stackOut_99_1 = new StringBuilder().append("ve.A(").append(param0).append(44);
            stackIn_102_0 = stackOut_99_0;
            stackIn_102_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L42;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_103_0 = stackOut_100_0;
              stackIn_103_1 = stackOut_100_1;
              stackIn_103_2 = stackOut_100_2;
              break L42;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_103_0, stackIn_103_2 + 41);
        }
    }

    ve() {
        super(0L, (ug) null);
    }

    static {
    }
}
