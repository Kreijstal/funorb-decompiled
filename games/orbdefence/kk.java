/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends te {
    private ga field_T;
    static String field_Y;
    private String field_R;
    static im field_X;
    private int field_Q;
    private hj field_W;
    static qg[] field_P;
    static int[] field_U;
    static char[] field_V;
    static int field_S;

    kk(ga param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, kd.a(false));
        try {
            this.field_R = param1;
            this.field_T = param0;
            this.a(param2, param3, param5, (byte) -90, param4);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == -81) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_Q = 3;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("kk.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static int a(int param0, int param1) {
        int var3 = OrbDefence.field_D ? 1 : 0;
        cf.field_a = null;
        dd.field_A = null;
        mc.field_j = 0;
        if (param0 != -30179) {
            return 72;
        }
        int var2 = ta.field_z;
        ta.field_z = hf.field_k;
        hf.field_k = var2;
        kg.field_h.field_b = kg.field_h.field_b + 1;
        if ((param1 ^ -1) == -52) {
            kg.field_h.field_n = 2;
        } else {
            if ((param1 ^ -1) == -51) {
                kg.field_h.field_n = 5;
            } else {
                kg.field_h.field_n = 1;
            }
        }
        if (2 <= kg.field_h.field_b) {
            if (!(param1 != 51)) {
                return 2;
            }
        }
        if ((kg.field_h.field_b ^ -1) <= -3) {
            if (!((param1 ^ -1) != -51)) {
                return 5;
            }
        }
        if (4 <= kg.field_h.field_b) {
            return 1;
        }
        return -1;
    }

    public static void l(int param0) {
        field_Y = null;
        field_U = null;
        field_X = null;
        if (param0 <= 71) {
            return;
        }
        field_P = null;
        field_V = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        qd var6 = null;
        rj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var14 = null;
        hj var15 = null;
        hj var16 = null;
        L0: {
          L1: {
            L2: {
              var13 = OrbDefence.field_D ? 1 : 0;
              var6 = this.field_T.d(-7847);
              if (ml.field_a == var6) {
                break L2;
              } else {
                if (var6 == uj.field_b) {
                  break L2;
                } else {
                  var5 = this.field_T.a(param2 ^ 1048451);
                  if (var5 == null) {
                    var5 = this.field_R;
                    break L1;
                  } else {
                    if (var5.equals(this.field_l)) {
                      break L0;
                    } else {
                      this.field_l = var5;
                      this.a((byte) -127);
                      break L0;
                    }
                  }
                }
              }
            }
            var5 = pi.field_g;
            break L1;
          }
          if (var5.equals(this.field_l)) {
            break L0;
          } else {
            this.field_l = var5;
            this.a((byte) -127);
            break L0;
          }
        }
        L3: {
          super.a(param0, param1, param2 ^ 0, param3);
          if (param2 == 1048575) {
            break L3;
          } else {
            this.field_R = (String) null;
            break L3;
          }
        }
        L4: {
          L5: {
            var6 = this.field_T.d(-7847);
            var8 = (rj) ((Object) this.field_j);
            var9 = param3 - -this.field_s;
            var10 = var8.a((pj) (this), 9534, param0) - -(var8.a((pj) (this), true).b(122) >> 358868577);
            if (var6 == ml.field_a) {
              break L5;
            } else {
              if (uj.field_b == var6) {
                break L5;
              } else {
                if (vh.field_h != var6) {
                  if (var6 != nc.field_bb) {
                    break L4;
                  } else {
                    var15 = wd.field_C[1];
                    var15.e(var9, -(var15.field_k >> -252404159) + var10, 256);
                    break L4;
                  }
                } else {
                  var14 = wd.field_C[2];
                  var14.e(var9, var10 - (var14.field_k >> 577066561), 256);
                  break L4;
                }
              }
            }
          }
          L6: {
            L7: {
              var16 = wd.field_C[0];
              var11 = var16.field_s << -359941919;
              var12 = var16.field_t << -859856799;
              if (null == this.field_W) {
                break L7;
              } else {
                if (var11 > this.field_W.field_o) {
                  break L7;
                } else {
                  if (this.field_W.field_k >= var12) {
                    de.a(-123, this.field_W);
                    ul.d();
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            this.field_W = new hj(var11, var12);
            de.a(param2 + -1048697, this.field_W);
            break L6;
          }
          var16.b(112, 144, var16.field_s << -316343036, var16.field_t << 1497717828, -this.field_Q << -1522496918, 4096);
          oc.g((byte) -105);
          this.field_W.e(-(var16.field_s >> -1855429215) + var9, -var16.field_t + var10, 256);
          break L4;
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int discarded$1 = 0;
        int var9 = 0;
        hj[] var10 = null;
        hj[] var11_ref_hj__ = null;
        int var11 = 0;
        int var12 = 0;
        hj var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = OrbDefence.field_D ? 1 : 0;
        var9 = param3 + (param1 - -param6);
        var10 = new hj[]{new hj(var9, var9), new hj(param0, var9), new hj(var9, var9), new hj(var9, param0), new hj(64, 64), new hj(var9, param0), new hj(var9, var9), new hj(param0, var9), new hj(var9, var9)};
        var11_ref_hj__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_hj__.length) {
            L1: {
              var11 = 0;
              if (param4 >= 28) {
                break L1;
              } else {
                discarded$1 = kk.a(-33, 100);
                break L1;
              }
            }
            L2: while (true) {
              if (param1 <= var11) {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param1) {
                    var11 = 0;
                    L4: while (true) {
                      if (param0 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param0 >> 1171161633) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param3) {
                                var10[1].field_v[param0 * (-1 + var9 + -var12) - -var11] = param8;
                                var10[3].field_v[var11 * var9 + (-var12 + -1) + var9] = param8;
                                var10[7].field_v[var11 + var12 * param0] = param8;
                                var10[5].field_v[var9 * var11 - -var12] = param8;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param1 <= var12) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_v[param0 * (-1 + (var9 + -var12)) - -var11] = param7;
                            var10[5].field_v[var9 - (1 - (-var12 + var11 * var9))] = param7;
                            var10[1].field_v[var11 + var12 * param0] = param2;
                            var10[3].field_v[var9 * var11 + var12] = param2;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 > var12) {
                        var10[0].field_v[var12 - -(var11 * var9)] = param2;
                        var10[0].field_v[var12 * var9 + var11] = param2;
                        if (var9 + -var11 > var12) {
                          var10[2].field_v[var11 * var9 + var12] = param2;
                          var10[6].field_v[var11 + var9 * var12] = param2;
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
                  if (var9 <= var12) {
                    var11++;
                    continue L2;
                  } else {
                    var10[6].field_v[var9 * (-var11 + (var9 + -1)) - -var12] = param7;
                    var10[8].field_v[var9 * (-1 + (var9 - var11)) - -var12] = param7;
                    var10[2].field_v[-var11 + (-1 + var9) + var12 * var9] = param7;
                    var10[8].field_v[var12 * var9 - var11 - 1 - -var9] = param7;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_hj__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_v.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_v[var14] = param5;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (md.a(-20767, param1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (me.a(param1, (byte) -44)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!mm.a(param1, (byte) 51)) {
                  if (param2 == (param0.length() ^ -1)) {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!df.a(param1, (byte) 117, param0)) {
                      if (!vh.a(false, param0, param1)) {
                        if (!l.a(117, param1, param0)) {
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("kk.O(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L1;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L1;
            }
          }
          L2: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      return stackIn_25_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final String g(int param0) {
        if (param0 == -8235) {
            return null;
        }
        return (String) null;
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
            this.field_Q = this.field_Q + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "kk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_X = new im();
        field_V = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
