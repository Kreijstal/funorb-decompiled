/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends k {
    static cj field_r;
    static String field_t;
    static gp field_u;
    static String field_w;
    static int[] field_s;
    private o field_p;
    static String field_q;
    static int[] field_v;
    private int field_o;

    final void a(byte param0, int[] param1) {
        try {
            int var3_int = -83 / ((26 - param0) / 43);
            this.field_p = new o(param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ga.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void l(int param0) {
        if (param0 != -3093) {
          field_u = (gp) null;
          this.field_j = (7 + this.field_o) / 8;
          return;
        } else {
          this.field_j = (7 + this.field_o) / 8;
          return;
        }
    }

    final static void i(byte param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ga var13 = null;
        ga var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_39_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_38_0 = 0;
        boolean stackOut_33_0 = false;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 31) {
                break L1;
              } else {
                ga.j(81);
                break L1;
              }
            }
            var13 = s.field_e;
            var14 = var13;
            var2 = var14.g(31365);
            var3 = (vg) ((Object) ag.field_i.c(116));
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var2 ^ -1;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var12 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0 == (var3.field_i ^ -1)) {
                        break L4;
                      } else {
                        var3 = (vg) ((Object) ag.field_i.b(6));
                        if (var12 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (var3 == null) {
                  stackOut_10_0 = -123;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  L5: {
                    L6: {
                      var4 = var14.g(31365);
                      if (var4 != 0) {
                        kk.field_v[0] = ta.field_lb;
                        var5 = var3.field_p;
                        var6_int = 1;
                        L7: while (true) {
                          L8: {
                            if (var4 <= var6_int) {
                              s.a(var4, (byte) 111, var5);
                              break L8;
                            } else {
                              kk.field_v[var6_int] = var13.f((byte) -116);
                              var6_int++;
                              if (var12 != 0) {
                                break L8;
                              } else {
                                continue L7;
                              }
                            }
                          }
                          var6_int = 0;
                          L9: while (true) {
                            L10: {
                              if (var6_int >= var4) {
                                stackOut_30_0 = var5;
                                stackOut_30_1 = -109;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                break L10;
                              } else {
                                sn.a(4050, var14);
                                stackOut_23_0 = -1;
                                stackOut_23_1 = var6_int ^ -1;
                                stackIn_31_0 = stackOut_23_0;
                                stackIn_31_1 = stackOut_23_1;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                if (var12 != 0) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (stackIn_24_0 != stackIn_24_1) {
                                      k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                                      break L11;
                                    } else {
                                      var3.field_m = vn.field_e;
                                      var3.field_g = jq.field_a;
                                      var3.field_o = ao.field_c;
                                      var3.field_l = qc.field_q;
                                      k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                                      if (var12 == 0) {
                                        break L11;
                                      } else {
                                        k.a(1000, ao.field_c, vn.field_e, qc.field_q, var6_int, jq.field_a);
                                        break L11;
                                      }
                                    }
                                  }
                                  var6_int++;
                                  continue L9;
                                }
                              }
                            }
                            md.a(stackIn_31_0, stackIn_31_1);
                            dupTemp$2 = new String[2][var5];
                            var3.field_t = dupTemp$2;
                            var6 = dupTemp$2;
                            dupTemp$3 = new int[2][4 * var5];
                            var3.field_k = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = lj.field_n;
                            var9 = 0;
                            var10 = 0;
                            L12: while (true) {
                              L13: {
                                if (var9 >= var8) {
                                  var9 = 0;
                                  stackOut_38_0 = 0;
                                  stackIn_39_0 = stackOut_38_0;
                                  break L13;
                                } else {
                                  var11 = la.field_c[var9];
                                  var6[0][var10] = kk.field_v[var11];
                                  var7[0][var10 * 4] = lb.field_c[var11];
                                  var7[0][1 + 4 * var10] = vk.field_J[var11];
                                  var7[0][2 + var10 * 4] = kj.field_p[var11];
                                  var7[0][3 + 4 * var10] = ie.field_ob[var11];
                                  stackOut_33_0 = sf.a(1, kk.field_v[var11]);
                                  stackIn_39_0 = stackOut_33_0 ? 1 : 0;
                                  stackIn_34_0 = stackOut_33_0;
                                  if (var12 != 0) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (!stackIn_34_0) {
                                        break L14;
                                      } else {
                                        if (vk.field_J[var11] - -kj.field_p[var11] - -ie.field_ob[var11] != 0) {
                                          break L14;
                                        } else {
                                          var6[0][var10] = null;
                                          var10--;
                                          break L14;
                                        }
                                      }
                                    }
                                    var9++;
                                    var10++;
                                    continue L12;
                                  }
                                }
                              }
                              var10 = stackIn_39_0;
                              L15: while (true) {
                                if (var9 >= var8) {
                                  break L6;
                                } else {
                                  var11 = la.field_c[var9 + var5];
                                  var6[1][var10] = kk.field_v[var11];
                                  var7[1][var10 * 4] = lb.field_c[var11];
                                  var7[1][4 * var10 + 1] = vk.field_J[var11];
                                  var7[1][2 + 4 * var10] = kj.field_p[var11];
                                  var7[1][3 + var10 * 4] = ie.field_ob[var11];
                                  if (var12 != 0) {
                                    break L5;
                                  } else {
                                    L16: {
                                      if (sf.a(1, kk.field_v[var11])) {
                                        if (0 == vk.field_J[var11] - -kj.field_p[var11] + ie.field_ob[var11]) {
                                          var6[1][var10] = null;
                                          var10--;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var9++;
                                    var10++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    var3.field_j = true;
                    var3.a(true);
                    break L5;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              ak.a((byte) stackIn_11_0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ga.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$2 = 0;
        if (param0 != -35) {
          return;
        } else {
          fieldTemp$2 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_m[fieldTemp$2] = (byte)(param1 + this.field_p.a(-48));
          return;
        }
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (param0 <= var5_int) {
                break L0;
              } else {
                fieldTemp$5 = this.field_j;
                this.field_j = this.field_j + 1;
                param3[var5_int + param2] = (byte)(this.field_m[fieldTemp$5] + -this.field_p.a(-90));
                var5_int++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static uc a(String param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        uc stackIn_9_0 = null;
        uc stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        String stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        uc stackOut_10_0 = null;
        uc stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!tg.field_g.d(-99)) {
                break L1;
              } else {
                if (!param0.equals(tg.field_g.a(31027))) {
                  L2: {
                    stackOut_3_0 = (String) (param0);
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (param1) {
                      stackOut_5_0 = (String) ((Object) stackIn_5_0);
                      stackOut_5_1 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L2;
                    } else {
                      stackOut_4_0 = (String) ((Object) stackIn_4_0);
                      stackOut_4_1 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L2;
                    }
                  }
                  tg.field_g = tg.a(stackIn_6_0, stackIn_6_1 != 0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (!param1) {
              stackOut_10_0 = tg.field_g;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_8_0 = (uc) null;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("ga.K(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final int h(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == 14862) {
          var3 = this.field_o >> 1350894083;
          var4 = 8 - (7 & this.field_o);
          var5 = 0;
          this.field_o = this.field_o + param0;
          L0: while (true) {
            if (var4 < param0) {
              incrementValue$1 = var3;
              var3++;
              var5 = var5 + ((mb.field_n[var4] & this.field_m[incrementValue$1]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L0;
              } else {
                var5 = var5 + (mb.field_n[var4] & this.field_m[var3]);
                return var5;
              }
            } else {
              L1: {
                L2: {
                  if (param0 == var4) {
                    break L2;
                  } else {
                    var5 = var5 + (this.field_m[var3] >> var4 - param0 & mb.field_n[param0]);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var5 + (mb.field_n[var4] & this.field_m[var3]);
                break L1;
              }
              return var5;
            }
          }
        } else {
          return -77;
        }
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param0 != 0) {
            break L0;
          } else {
            var2 = li.field_C;
            break L0;
          }
        }
        L1: {
          if (-2 == (param0 ^ -1)) {
            var2 = qe.field_g;
            break L1;
          } else {
            break L1;
          }
        }
        if (!param1) {
          L2: {
            field_r = (cj) null;
            if (param0 != 2) {
              break L2;
            } else {
              var2 = ba.field_q;
              break L2;
            }
          }
          return var2;
        } else {
          L3: {
            if (param0 != 2) {
              break L3;
            } else {
              var2 = ba.field_q;
              break L3;
            }
          }
          return var2;
        }
    }

    final int m(int param0) {
        int var2 = 114 % ((param0 - -34) / 50);
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_m[fieldTemp$0] + -this.field_p.a(-25) & 255;
    }

    final void k(int param0) {
        this.field_o = this.field_j * 8;
        if (param0 != -1136) {
            field_u = (gp) null;
        }
    }

    public static void j(int param0) {
        int discarded$0 = 0;
        field_t = null;
        field_u = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_w = null;
        field_v = null;
        if (param0 > -34) {
            discarded$0 = ga.a(-13, true);
        }
    }

    ga(byte[] param0) {
        super(param0);
    }

    ga(int param0) {
        super(param0);
    }

    static {
        field_t = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "You have entered another game.";
        field_w = "Error connecting to server. Please try using a different server.";
        field_s = new int[]{42, 43, 38};
        field_v = new int[]{98, 214, 334, 455, 577};
    }
}
