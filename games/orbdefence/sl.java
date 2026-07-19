/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends sf {
    static int field_ab;
    static String field_Z;

    final static void a(int param0, hj param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        hj[] discarded$5 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (0 != ((param1.field_p | (param1.field_k | param1.field_o) | param1.field_u) & 3)) {
              var2_int = param1.field_o + (param1.field_p & 3);
              var3 = param1.field_k + (param1.field_u & 3);
              var2_int = 4 - ((var2_int & 3) - var2_int);
              var3 = var3 + (-(var3 & 3) + 4);
              var4 = new int[var2_int * var3];
              var5 = 0;
              var6 = (3 & param1.field_p) + var2_int * (3 & param1.field_u);
              var7 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7 >= param1.field_k) {
                      break L3;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_14_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        var8 = stackIn_6_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (param1.field_o <= var8) {
                                break L6;
                              } else {
                                incrementValue$3 = var6;
                                var6++;
                                incrementValue$4 = var5;
                                var5++;
                                var4[incrementValue$3] = param1.field_v[incrementValue$4];
                                var8++;
                                if (var9 != 0) {
                                  break L5;
                                } else {
                                  if (var9 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var6 = var6 + (var2_int - param1.field_o);
                            var7++;
                            break L5;
                          }
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = param0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                L7: {
                  if (stackIn_14_0 == 2408) {
                    break L7;
                  } else {
                    discarded$5 = sl.d((byte) -106);
                    break L7;
                  }
                }
                param1.field_u = param1.field_u & -4;
                param1.field_p = param1.field_p & -4;
                param1.field_k = var3;
                param1.field_o = var2_int;
                param1.field_v = var4;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("sl.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_Z = null;
        if (param0 >= 118) {
            return;
        }
        hj var2 = (hj) null;
        sl.a(16, (hj) null);
    }

    final static hj[] d(byte param0) {
        hj[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        hj var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        boolean stackIn_4_0 = false;
        int stackIn_23_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_45_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_44_0 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_22_0 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        var1 = new hj[ec.field_K];
        var2 = 0;
        if (param0 < -82) {
          L0: while (true) {
            L1: {
              L2: {
                if (var2 >= ec.field_K) {
                  break L2;
                } else {
                  var3 = wh.field_b[var2] * m.field_a[var2];
                  var28 = fl.field_a[var2];
                  stackOut_25_0 = ha.field_g[var2];
                  stackIn_45_0 = stackOut_25_0 ? 1 : 0;
                  stackIn_26_0 = stackOut_25_0;
                  if (var8 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (!stackIn_26_0) {
                            break L5;
                          } else {
                            var29 = md.field_i[var2];
                            var15 = new int[var3];
                            var13 = var15;
                            var6_ref_int__ = var13;
                            var7 = 0;
                            L6: while (true) {
                              L7: {
                                if (var7 >= var3) {
                                  var1[var2] = (hj) ((Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var15));
                                  break L7;
                                } else {
                                  var6_ref_int__[var7] = ge.a(vc.field_g[vi.a(255, (int) var28[var7])], vi.a(-16777216, var29[var7] << 862549368));
                                  var7++;
                                  if (var8 != 0) {
                                    break L7;
                                  } else {
                                    continue L6;
                                  }
                                }
                              }
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var11 = new int[var3];
                        var6 = 0;
                        L8: while (true) {
                          if (var6 >= var3) {
                            var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var11);
                            break L4;
                          } else {
                            var11[var6] = vc.field_g[vi.a(255, (int) var28[var6])];
                            var6++;
                            if (var8 != 0) {
                              break L3;
                            } else {
                              continue L8;
                            }
                          }
                        }
                      }
                      var2++;
                      break L3;
                    }
                    if (var8 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_44_0 = -127;
              stackIn_45_0 = stackOut_44_0;
              break L1;
            }
            md.a((byte) stackIn_45_0);
            return var1;
          }
        } else {
          var9 = (hj) null;
          sl.a(16, (hj) null);
          L9: while (true) {
            L10: {
              L11: {
                if (var2 >= ec.field_K) {
                  break L11;
                } else {
                  var3 = wh.field_b[var2] * m.field_a[var2];
                  var30 = fl.field_a[var2];
                  stackOut_3_0 = ha.field_g[var2];
                  stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8 != 0) {
                    break L10;
                  } else {
                    L12: {
                      L13: {
                        L14: {
                          if (!stackIn_4_0) {
                            break L14;
                          } else {
                            var31 = md.field_i[var2];
                            var15 = new int[var3];
                            var13 = var15;
                            var6_ref_int__ = var13;
                            var7 = 0;
                            L15: while (true) {
                              L16: {
                                if (var7 >= var3) {
                                  var1[var2] = (hj) ((Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var15));
                                  break L16;
                                } else {
                                  var6_ref_int__[var7] = ge.a(vc.field_g[vi.a(255, (int) var30[var7])], vi.a(-16777216, var31[var7] << 862549368));
                                  var7++;
                                  if (var8 != 0) {
                                    break L16;
                                  } else {
                                    continue L15;
                                  }
                                }
                              }
                              if (var8 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        var11 = new int[var3];
                        var6 = 0;
                        L17: while (true) {
                          if (var6 >= var3) {
                            var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var11);
                            break L13;
                          } else {
                            var11[var6] = vc.field_g[vi.a(255, (int) var30[var6])];
                            var6++;
                            if (var8 != 0) {
                              break L12;
                            } else {
                              continue L17;
                            }
                          }
                        }
                      }
                      var2++;
                      break L12;
                    }
                    if (var8 == 0) {
                      continue L9;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              stackOut_22_0 = -127;
              stackIn_23_0 = stackOut_22_0;
              break L10;
            }
            md.a((byte) stackIn_23_0);
            return var1;
          }
        }
    }

    private sl() throws Throwable {
        super(0L, (sf) null);
        throw new Error();
    }

    static {
        field_ab = -1;
        field_Z = "CONGRATULATIONS!<br><br>You have managed to defeat all the Norbs thus far. To continue you must become a member!";
    }
}
