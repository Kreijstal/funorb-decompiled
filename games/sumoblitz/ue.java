/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends gm {
    private int field_n;
    private int field_s;
    private int field_q;
    static ri field_p;
    static volatile boolean field_o;
    private wb[] field_r;

    public ue() {
        this(2188450, 2591221, 9543);
    }

    public static void b(int param0) {
        if (param0 < 100) {
            field_o = true;
        }
        field_p = null;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (!param0.field_k) {
                if (param0.d(-1)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param2 == 5592405) {
                break L2;
              } else {
                this.field_s = 88;
                break L2;
              }
            }
            L3: {
              if (param0 instanceof wp) {
                param3 = param3 & ((wp) ((Object) param0)).field_x;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param3) {
                stackOut_15_0 = this.field_q;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                if (var6_int != 0) {
                  stackOut_14_0 = this.field_s;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = this.field_n;
                  stackIn_16_0 = stackOut_13_0;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_16_0;
              if (!param3) {
                stackOut_18_0 = 7105644;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 16777215;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            nn.a(var7, param0.field_q, param0.field_v + (param1 - -(-this.field_r[0].field_w + param0.field_p >> -1940644703)), 67, this.field_r, param0.field_r + param4);
            discarded$1 = this.field_e.a(param0.field_m, param4 - -param0.field_r, param0.field_v + (param1 + -2), param0.field_q, param0.field_p, var8, -1, 1, 1, this.field_e.field_s);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("ue.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        of var4_ref_of = null;
        long var4 = 0L;
        int var5 = 0;
        id var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pl var28 = null;
        pl var29 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_65_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_64_0 = 0;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -70) {
                break L1;
              } else {
                ue.b(-111);
                break L1;
              }
            }
            L2: {
              L3: {
                var28 = ig.field_a;
                var29 = var28;
                var2 = var29.e(-31302);
                if (0 != var2) {
                  break L3;
                } else {
                  var3 = var29.a(255);
                  var4_ref_of = (of) ((Object) oi.field_b.b(74));
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var4_ref_of == null) {
                          break L6;
                        } else {
                          stackOut_6_0 = var3;
                          stackIn_12_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var26 != 0) {
                            break L5;
                          } else {
                            if (stackIn_7_0 == var4_ref_of.field_p) {
                              break L6;
                            } else {
                              var4_ref_of = (of) ((Object) oi.field_b.d((byte) 18));
                              if (var26 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      if (var4_ref_of == null) {
                        stackOut_11_0 = -124;
                        stackIn_12_0 = stackOut_11_0;
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            var5 = var29.e(-31302);
                            if (0 != var5) {
                              var6_int = var4_ref_of.field_l;
                              var7 = var4_ref_of.field_s;
                              jh.field_B[0].field_a = null;
                              jh.field_B[0].field_c = qv.field_o;
                              jh.field_B[0].field_b = false;
                              var8_int = 1;
                              L9: while (true) {
                                L10: {
                                  if (var8_int >= var5) {
                                    break L10;
                                  } else {
                                    jh.field_B[var8_int].field_c = var28.d(-1);
                                    jh.field_B[var8_int].field_b = false;
                                    if (var26 != 0) {
                                      break L7;
                                    } else {
                                      L11: {
                                        L12: {
                                          if (var29.e(-31302) == 1) {
                                            break L12;
                                          } else {
                                            jh.field_B[var8_int].field_a = null;
                                            if (var26 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        jh.field_B[var8_int].field_a = var29.d(param0 + 69);
                                        break L11;
                                      }
                                      var8_int++;
                                      if (var26 == 0) {
                                        continue L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                dupTemp$6 = new String[3][var6_int];
                                var4_ref_of.field_o = dupTemp$6;
                                var8 = dupTemp$6;
                                var9 = new String[3][var6_int];
                                dupTemp$7 = new long[3][var6_int];
                                var4_ref_of.field_r = dupTemp$7;
                                var10 = dupTemp$7;
                                dupTemp$8 = new int[3][var6_int * var7];
                                var4_ref_of.field_m = dupTemp$8;
                                var11 = dupTemp$8;
                                var12 = 0;
                                var13 = 0;
                                var14 = 0;
                                var15 = 0;
                                var16 = 0;
                                var17 = 0;
                                var18 = var29.e(-31302);
                                if ((var18 ^ -1) < -1) {
                                  var19 = 0;
                                  L13: while (true) {
                                    if (var19 >= var18) {
                                      break L8;
                                    } else {
                                      var20 = var28.e(-31302);
                                      var21 = jh.field_B[var20].field_c;
                                      var22 = var29.a((byte) 113);
                                      var24 = var29.field_p;
                                      if (var26 != 0) {
                                        break L7;
                                      } else {
                                        L14: {
                                          if (var6_int > var19) {
                                            var8[0][var12] = var21;
                                            var9[0][var12] = jh.field_B[var20].field_a;
                                            var10[0][var12] = var22;
                                            var25 = 0;
                                            L15: while (true) {
                                              if (var25 >= var7) {
                                                var12++;
                                                break L14;
                                              } else {
                                                incrementValue$9 = var15;
                                                var15++;
                                                var11[0][incrementValue$9] = var28.c(true);
                                                var25++;
                                                if (var26 != 0) {
                                                  break L14;
                                                } else {
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L16: {
                                          L17: {
                                            if (var21 == null) {
                                              break L17;
                                            } else {
                                              if (!ea.a(var21, (byte) -25)) {
                                                break L17;
                                              } else {
                                                var8[1][var13] = qv.field_o;
                                                var9[1][var13] = null;
                                                var10[1][var13] = var22;
                                                var29.field_p = var24;
                                                var13++;
                                                var25 = 0;
                                                L18: while (true) {
                                                  if (var25 >= var7) {
                                                    break L17;
                                                  } else {
                                                    incrementValue$10 = var16;
                                                    var16++;
                                                    var11[1][incrementValue$10] = var28.c(true);
                                                    var25++;
                                                    if (var26 != 0) {
                                                      break L16;
                                                    } else {
                                                      continue L18;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var6_int <= var14) {
                                              break L19;
                                            } else {
                                              if (!jh.field_B[var20].field_b) {
                                                jh.field_B[var20].field_b = true;
                                                var8[2][var14] = var21;
                                                var9[2][var14] = jh.field_B[var20].field_a;
                                                var10[2][var14] = var22;
                                                var29.field_p = var24;
                                                var14++;
                                                var25 = 0;
                                                L20: while (true) {
                                                  if (var7 <= var25) {
                                                    break L19;
                                                  } else {
                                                    incrementValue$11 = var17;
                                                    var17++;
                                                    var11[2][incrementValue$11] = var28.c(true);
                                                    var25++;
                                                    if (var26 != 0) {
                                                      break L16;
                                                    } else {
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var19++;
                                          break L16;
                                        }
                                        continue L13;
                                      }
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          var4_ref_of.field_q = true;
                          var4_ref_of.b(false);
                          break L7;
                        }
                        if (var26 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    kk.a((byte) stackIn_12_0);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L21: {
                if (-2 != (var2 ^ -1)) {
                  break L21;
                } else {
                  var3 = var29.a(255);
                  var4 = var29.a((byte) 111);
                  var6 = (id) ((Object) ow.field_f.b(127));
                  L22: while (true) {
                    L23: {
                      L24: {
                        if (var6 == null) {
                          break L24;
                        } else {
                          stackOut_59_0 = var6.field_r ^ -1;
                          stackIn_65_0 = stackOut_59_0;
                          stackIn_60_0 = stackOut_59_0;
                          if (var26 != 0) {
                            break L23;
                          } else {
                            if (stackIn_60_0 == (var3 ^ -1)) {
                              break L24;
                            } else {
                              var6 = (id) ((Object) ow.field_f.d((byte) 18));
                              if (var26 == 0) {
                                continue L22;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var6 == null) {
                        stackOut_64_0 = -121;
                        stackIn_65_0 = stackOut_64_0;
                        break L23;
                      } else {
                        var6.field_s = var4;
                        var6.b(false);
                        if (var26 == 0) {
                          break L2;
                        } else {
                          break L21;
                        }
                      }
                    }
                    kk.a((byte) stackIn_65_0);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              ms.a("HS1: " + di.b((byte) -124), (Throwable) null, 0);
              kk.a((byte) -121);
              break L2;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ue.C(" + param0 + ')');
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

    private ue(int param0, int param1, int param2) {
        this.field_q = param2;
        this.field_r = jp.field_j;
        this.field_e = tq.field_a;
        this.field_s = param1;
        this.field_n = param0;
    }

    static {
        field_o = true;
    }
}
