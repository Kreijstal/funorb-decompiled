/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wh extends uh {
    static int[] field_x;
    static boolean[] field_v;
    static he[] field_u;
    int field_w;

    final static boolean a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = nj.a(nb.a(73), 8);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "wh.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                mf.field_u = null;
                oi.field_c = false;
                if (!sg.field_a) {
                  break L2;
                } else {
                  ol.field_a.c(false);
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var1_int = rh.field_a;
                if ((var1_int ^ -1) >= -1) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (var1_int == 1) {
                        break L5;
                      } else {
                        mf.field_u = a.a(5044, hi.field_i, new String[]{Integer.toString(var1_int)});
                        if (var2 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    mf.field_u = sj.field_b;
                    break L4;
                  }
                  mf.field_u = dm.a(0, new CharSequence[]{(CharSequence) ((Object) mf.field_u), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) fm.field_b)});
                  break L3;
                }
              }
              ol.field_a.d(true);
              sd.a((byte) -124);
              break L1;
            }
            L6: {
              if (param0) {
                break L6;
              } else {
                field_x = (int[]) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "wh.H(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2, ja param3, int param4) {
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
        boolean stackIn_11_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        byte stackOut_52_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = oi.a((param4 + -param0) * 3, (byte) 1);
              var6 = 3 * param0;
              vg.d((byte) 103);
              var7 = var5_int - 10;
              if (0 >= param3.field_G) {
                break L1;
              } else {
                if (null != param3.field_O) {
                  ff.a((byte) -2);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            eg.field_i = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var8 ^ -1) <= (param3.field_m ^ -1)) {
                    break L4;
                  } else {
                    var9 = param3.field_h[var8];
                    var10 = param3.field_a[var8];
                    var11 = param3.field_K[var8];
                    stackOut_10_0 = param1;
                    stackIn_53_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_11_0) {
                            var12 = fa.field_j[var9];
                            var13 = gf.field_p[var9];
                            var14 = fa.field_j[var10] - var12;
                            var15 = fa.field_j[var11] + -var12;
                            var16 = -var13 + gf.field_p[var10];
                            var17 = gf.field_p[var11] - var13;
                            if (-1 >= (-(var16 * var15) + var14 * var17 ^ -1)) {
                              break L5;
                            } else {
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var12 = aj.field_b[var9];
                          if (-2147483648 != var12) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var13 = aj.field_b[var10];
                          if ((var13 ^ -1) != 2147483647) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var14 = aj.field_b[var11];
                          if (2147483647 != (var14 ^ -1)) {
                            break L9;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var15 = var12 + (var13 - -var14 + -var6);
                          if (-1 >= (var7 ^ -1)) {
                            stackOut_31_0 = var15 >> var7;
                            stackIn_32_0 = stackOut_31_0;
                            break L10;
                          } else {
                            stackOut_29_0 = var15 << -var7;
                            stackIn_32_0 = stackOut_29_0;
                            break L10;
                          }
                        }
                        var16 = -stackIn_32_0 + (of.field_w.length + -1);
                        var17 = of.field_w[var16];
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var17 >> -1460360956 == 0) {
                                break L13;
                              } else {
                                var16--;
                                stackOut_34_0 = var16 ^ -1;
                                stackOut_34_1 = -1;
                                stackIn_43_0 = stackOut_34_0;
                                stackIn_43_1 = stackOut_34_1;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                if (var19 != 0) {
                                  break L12;
                                } else {
                                  L14: {
                                    if (stackIn_35_0 <= stackIn_35_1) {
                                      break L14;
                                    } else {
                                      System.err.println("Out of range!");
                                      if (var19 == 0) {
                                        break L5;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var17 = of.field_w[var16];
                                  if (var19 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            stackOut_42_0 = var16 << -1094679996;
                            stackOut_42_1 = -var17;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            break L12;
                          }
                          L15: {
                            var18 = stackIn_43_0 - stackIn_43_1;
                            p.field_c[var18] = var8;
                            of.field_w[var16] = 1 + var17;
                            if (param3.field_G <= 0) {
                              break L15;
                            } else {
                              if (param3.field_O != null) {
                                uh.field_h[param3.field_O[var8]] = uh.field_h[param3.field_O[var8]] + 1;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          eg.field_i = eg.field_i + 1;
                          break L5;
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_52_0 = param2;
                stackIn_53_0 = stackOut_52_0;
                break L3;
              }
              L16: {
                if (stackIn_53_0 > 71) {
                  break L16;
                } else {
                  wh.b(true);
                  break L16;
                }
              }
              L17: {
                L18: {
                  if (-1 <= (param3.field_G ^ -1)) {
                    break L18;
                  } else {
                    if (null == param3.field_O) {
                      break L18;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L19: while (true) {
                        if ((var9 ^ -1) <= (uh.field_h.length ^ -1)) {
                          break L18;
                        } else {
                          var10 = uh.field_h[var9];
                          uh.field_h[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L17;
                          } else {
                            if (var19 == 0) {
                              continue L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var5);
            stackOut_67_1 = new StringBuilder().append("wh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L20;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, String param1, byte param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 96) {
                break L1;
              } else {
                field_x = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                fk.field_q = wg.field_u;
                if (255 == param0) {
                  break L3;
                } else {
                  L4: {
                    if (-101 < (param0 ^ -1)) {
                      break L4;
                    } else {
                      if ((param0 ^ -1) < -106) {
                        break L4;
                      } else {
                        jj.field_d = sa.a((byte) 3, param3);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  jj.field_d = kj.a(param0, 4, param1);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (13 <= rd.field_z) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L5;
                } else {
                  stackOut_20_0 = 1;
                  stackIn_23_0 = stackOut_20_0;
                  break L5;
                }
              }
              jj.field_d = b.a(stackIn_23_0 != 0, 77);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("wh.F(").append(param0).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    abstract boolean a(byte param0);

    public static void c(byte param0) {
        try {
            field_v = null;
            field_u = null;
            field_x = null;
            if (param0 != -86) {
                field_x = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "wh.G(" + param0 + ')');
        }
    }

    abstract Object b(byte param0);

    wh(int param0) {
        try {
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "wh.<init>(" + param0 + ')');
        }
    }

    final static void a(int param0, vj param1, vj param2, vj param3, boolean param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            ib.field_f = ug.a("", param0 ^ param0);
            ib.field_f.a(false, -87);
            kk.a(param0 + 168, param3, param1, param2);
            lc.c((byte) 109);
            lc.field_h = pj.field_D;
            fk.field_q = pj.field_D;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (runtimeException);
            stackOut_2_1 = new StringBuilder().append("wh.J(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    static {
        field_x = new int[]{100, 50, 75, 75, 110, 10000, 8, 200, 10, 40, 160, 20000, 100, 250, 300, 350, 400, 30000, 50000, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, 0, 0, 0, 0, 100, 300, 15, 75, 100, 25, 75, 125, 75, 150, 150, 25, 75, 25, 25, 25, 25, 25, 25, 50, 50, 25, 25, 25, 25, 25, 75, 75, 75, 10, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80};
        field_v = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }
}
