/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends br {
    static th field_i;
    static java.awt.Frame field_m;
    static cj field_f;
    private th field_k;
    private int field_g;
    static ul field_n;
    static String field_j;
    private int field_h;
    static boolean field_l;

    final void a(int param0) {
        if (param0 != -1) {
            field_f = (cj) null;
            this.a(true);
            return;
        }
        this.a(true);
    }

    final void b(boolean param0) {
        int var3 = 0;
        rq var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (rq) ((Object) this.field_k.c(125));
        L0: while (true) {
          if (var4 == null) {
            if (param0) {
              cg.a(80, -116, 26L);
              return;
            } else {
              return;
            }
          } else {
            var4.a((byte) 95);
            var4 = (rq) ((Object) this.field_k.b(6));
            if (var3 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var5 = 0;
        rq var6 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackOut_5_0 = false;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= 54) {
          var6 = (rq) ((Object) this.field_k.c(87));
          L0: while (true) {
            if (var6 != null) {
              stackOut_5_0 = var6.a(param1, (byte) 5, param2);
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 == 0) {
                if (stackIn_7_0) {
                  return true;
                } else {
                  var6 = (rq) ((Object) this.field_k.b(6));
                  continue L0;
                }
              } else {
                return stackIn_6_0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, long param2) {
        ga var4 = null;
        int var5 = 0;
        var4 = ma.field_a;
        var4.b((byte) -35, param0);
        if (param1 != -27404) {
          cg.a(-60, -93, 81L);
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.a(-59, 7);
          var4.a(param2, true);
          var4.e(29, -var5 + var4.field_j);
          return;
        } else {
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.a(-59, 7);
          var4.a(param2, true);
          var4.e(29, -var5 + var4.field_j);
          return;
        }
    }

    cg(int param0, int param1, int param2) {
        this.field_h = param1;
        this.field_g = param2;
        if (oq.field_u != null) {
            this.a((byte) 108);
        }
    }

    public static void c(byte param0) {
        if (param0 > -33) {
          cg.c((byte) -103);
          field_m = null;
          field_j = null;
          field_f = null;
          field_n = null;
          field_i = null;
          return;
        } else {
          field_m = null;
          field_j = null;
          field_f = null;
          field_n = null;
          field_i = null;
          return;
        }
    }

    final void a(nm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rq var4 = null;
        int var5 = 0;
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
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 81 / ((param1 - -32) / 51);
            var4 = (rq) ((Object) this.field_k.c(123));
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                var4.a(param0, (byte) -75);
                var4 = (rq) ((Object) this.field_k.b(6));
                if (var5 == 0) {
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
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("cg.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final boolean a(gm param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        rq var5 = null;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.g(73);
              if (!param1) {
                break L1;
              } else {
                field_l = true;
                break L1;
              }
            }
            var4 = param0.h(81);
            var5 = (rq) ((Object) this.field_k.c(80));
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var5.a(var4, (byte) 111, var3_int);
                    stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        var5 = (rq) ((Object) this.field_k.b(6));
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("cg.D(");
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        boolean[][] var4 = null;
        int var5 = 0;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[][] var15 = null;
        boolean[][] var16 = null;
        boolean[][] var17 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_k != null) {
          return;
        } else {
          var2 = this.field_h / 24;
          var3 = this.field_g / 24;
          var5 = 109 / ((param0 - 55) / 47);
          var17 = new boolean[1 + 2 * wn.field_t][1 + 2 * wn.field_t];
          var16 = var17;
          var15 = var16;
          var4 = var15;
          var6 = new boolean[var17.length][var17[0].length];
          var7 = -wn.field_t + var2;
          var8 = var3 - wn.field_t;
          var15[wn.field_t][wn.field_t] = true;
          var9 = 0;
          L0: while (true) {
            stackOut_4_0 = var9;
            stackIn_5_0 = stackOut_4_0;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_5_0 >= wn.field_t) {
                    break L3;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_37_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var14 != 0) {
                      break L2;
                    } else {
                      var10 = stackIn_7_0;
                      L4: while (true) {
                        stackOut_8_0 = var10;
                        stackOut_8_1 = var4.length;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        L5: while (true) {
                          L6: {
                            if (stackIn_9_0 >= stackIn_9_1) {
                              break L6;
                            } else {
                              stackOut_10_0 = 0;
                              stackIn_5_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var14 != 0) {
                                continue L1;
                              } else {
                                var11 = stackIn_11_0;
                                L7: while (true) {
                                  L8: {
                                    if (var11 >= var4[0].length) {
                                      break L8;
                                    } else {
                                      var12 = var11 + var7;
                                      var13 = var8 + var10;
                                      stackOut_13_0 = var12 ^ -1;
                                      stackOut_13_1 = -1;
                                      stackIn_9_0 = stackOut_13_0;
                                      stackIn_9_1 = stackOut_13_1;
                                      stackIn_14_0 = stackOut_13_0;
                                      stackIn_14_1 = stackOut_13_1;
                                      if (var14 != 0) {
                                        continue L5;
                                      } else {
                                        L9: {
                                          if (stackIn_14_0 >= stackIn_14_1) {
                                            break L9;
                                          } else {
                                            if (var13 <= 0) {
                                              break L9;
                                            } else {
                                              if (oq.field_u[0].length <= var12) {
                                                break L9;
                                              } else {
                                                if (oq.field_u.length <= var13) {
                                                  break L9;
                                                } else {
                                                  if (-1 == (oq.field_u[var13][var12] & 1 ^ -1)) {
                                                    break L9;
                                                  } else {
                                                    L10: {
                                                      if (var4[var10][var11]) {
                                                        break L10;
                                                      } else {
                                                        L11: {
                                                          if (0 >= var11) {
                                                            break L11;
                                                          } else {
                                                            if (var4[var10][-1 + var11]) {
                                                              break L10;
                                                            } else {
                                                              break L11;
                                                            }
                                                          }
                                                        }
                                                        L12: {
                                                          if ((var10 ^ -1) >= -1) {
                                                            break L12;
                                                          } else {
                                                            if (var4[-1 + var10][var11]) {
                                                              break L10;
                                                            } else {
                                                              break L12;
                                                            }
                                                          }
                                                        }
                                                        L13: {
                                                          if (var11 >= -1 + var4[0].length) {
                                                            break L13;
                                                          } else {
                                                            if (var4[var10][var11 - -1]) {
                                                              break L10;
                                                            } else {
                                                              break L13;
                                                            }
                                                          }
                                                        }
                                                        if (var10 >= var4.length - 1) {
                                                          break L9;
                                                        } else {
                                                          if (var4[var10 + 1][var11]) {
                                                            break L10;
                                                          } else {
                                                            break L9;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var6[var10][var11] = true;
                                                    break L9;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var11++;
                                        if (var14 == 0) {
                                          continue L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  var10++;
                                  if (var14 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var10_ref_boolean____ = var4;
                          var4 = var6;
                          var6 = var10_ref_boolean____;
                          var9++;
                          if (var14 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_k = new th();
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L2;
              }
              var9 = stackIn_37_0;
              L14: while (true) {
                stackOut_38_0 = var9;
                stackOut_38_1 = var4.length;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                L15: while (true) {
                  if (stackIn_39_0 < stackIn_39_1) {
                    if (var14 == 0) {
                      var10 = 0;
                      L16: while (true) {
                        if (var4[0].length <= var10) {
                          var9++;
                          continue L14;
                        } else {
                          var11 = var7 + var10;
                          var12 = var9 + var8;
                          var13 = (var3 + -var12) * (var3 - var12) + (var2 + -var11) * (var2 - var11);
                          stackOut_45_0 = var13;
                          stackOut_45_1 = 81;
                          stackIn_39_0 = stackOut_45_0;
                          stackIn_39_1 = stackOut_45_1;
                          stackIn_46_0 = stackOut_45_0;
                          stackIn_46_1 = stackOut_45_1;
                          if (var14 != 0) {
                            continue L15;
                          } else {
                            L17: {
                              if (stackIn_46_0 >= stackIn_46_1) {
                                break L17;
                              } else {
                                if (var4[var9][var10]) {
                                  this.field_k.a(new rq(var11, var12, var13), false);
                                  break L17;
                                } else {
                                  var10++;
                                  continue L16;
                                }
                              }
                            }
                            var10++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_j = "Rating";
    }
}
