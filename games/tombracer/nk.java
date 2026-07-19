/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends vg {
    int field_j;
    int[] field_h;
    private boolean[] field_g;
    static jpa[] field_k;
    int[] field_i;
    int field_l;
    int[][] field_f;

    final static boolean c(int param0) {
        lqa var1 = null;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 <= -26) {
            break L0;
          } else {
            field_k = (jpa[]) null;
            break L0;
          }
        }
        var1 = uv.b(false);
        if (var1 == null) {
          return false;
        } else {
          L1: {
            L2: {
              if (ara.field_wb) {
                break L2;
              } else {
                if (!var1.field_e) {
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          return stackIn_9_0 != 0;
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 20) {
            field_k = (jpa[]) null;
        }
    }

    final static vpa a(int param0) {
        if (param0 != -21819) {
            return (vpa) null;
        }
        if (!(ur.field_a != null)) {
            ur.field_a = new vpa(eka.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, eka.field_o.field_w, -1, 2147483647, true);
        }
        return ur.field_a;
    }

    final static float a(byte param0, float param1) {
        if (param0 != 14) {
            field_k = (jpa[]) null;
        }
        return (10.0f + (-15.0f + param1 * 6.0f) * param1) * (param1 * (param1 * param1));
    }

    nk(int param0, byte[] param1) {
        int[] array$1 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        uia var7 = null;
        uia var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        boolean[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_10_0 = null;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_l = param0;
            var7 = new uia(param1);
            var8 = var7;
            this.field_j = var8.h(255);
            this.field_h = new int[this.field_j];
            this.field_i = new int[this.field_j];
            this.field_f = new int[this.field_j][];
            this.field_g = new boolean[this.field_j];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (this.field_j <= var4) {
                      break L4;
                    } else {
                      this.field_h[var4] = var7.h(255);
                      stackOut_3_0 = this.field_h[var4];
                      stackOut_3_1 = 6;
                      stackIn_9_0 = stackOut_3_0;
                      stackIn_9_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var6 != 0) {
                        L5: while (true) {
                          if (stackIn_9_0 <= stackIn_9_1) {
                            break L3;
                          } else {
                            stackOut_10_0 = this;
                            stackIn_22_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var6 != 0) {
                              break L2;
                            } else {
                              L6: {
                                stackOut_11_0 = ((nk) (this)).field_g;
                                stackOut_11_1 = var4;
                                stackIn_13_0 = stackOut_11_0;
                                stackIn_13_1 = stackOut_11_1;
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                if ((var8.h(255) ^ -1) != -2) {
                                  stackOut_13_0 = (boolean[]) ((Object) stackIn_13_0);
                                  stackOut_13_1 = stackIn_13_1;
                                  stackOut_13_2 = 0;
                                  stackIn_14_0 = stackOut_13_0;
                                  stackIn_14_1 = stackOut_13_1;
                                  stackIn_14_2 = stackOut_13_2;
                                  break L6;
                                } else {
                                  stackOut_12_0 = (boolean[]) ((Object) stackIn_12_0);
                                  stackOut_12_1 = stackIn_12_1;
                                  stackOut_12_2 = 1;
                                  stackIn_14_0 = stackOut_12_0;
                                  stackIn_14_1 = stackOut_12_1;
                                  stackIn_14_2 = stackOut_12_2;
                                  break L6;
                                }
                              }
                              stackIn_14_0[stackIn_14_1] = stackIn_14_2 != 0;
                              var4++;
                              if (var6 == 0) {
                                stackOut_8_0 = this.field_j;
                                stackOut_8_1 = var4;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                continue L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          if (stackIn_4_0 != stackIn_4_1) {
                            break L7;
                          } else {
                            this.field_h[var4] = 2;
                            break L7;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  L8: while (true) {
                    stackOut_8_0 = this.field_j;
                    stackOut_8_1 = var4;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (stackIn_9_0 <= stackIn_9_1) {
                      break L3;
                    } else {
                      stackOut_10_0 = this;
                      stackIn_22_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L9: {
                          stackOut_11_0 = ((nk) (this)).field_g;
                          stackOut_11_1 = var4;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if ((var8.h(255) ^ -1) != -2) {
                            stackOut_13_0 = (boolean[]) ((Object) stackIn_13_0);
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            break L9;
                          } else {
                            stackOut_12_0 = (boolean[]) ((Object) stackIn_12_0);
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            break L9;
                          }
                        }
                        stackIn_14_0[stackIn_14_1] = stackIn_14_2 != 0;
                        var4++;
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var4 = 0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if ((var4 ^ -1) <= (this.field_j ^ -1)) {
                        break L12;
                      } else {
                        this.field_i[var4] = var7.d(124);
                        var4++;
                        if (var6 != 0) {
                          break L11;
                        } else {
                          if (var6 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L11;
                  }
                  stackOut_20_0 = this;
                  stackIn_22_0 = stackOut_20_0;
                  break L2;
                }
              }
              L13: while (true) {
                L14: {
                  L15: {
                    if ((((nk) (this)).field_j ^ -1) >= (var4 ^ -1)) {
                      break L15;
                    } else {
                      array$1 = new int[var7.h(255)];
                      this.field_f[var4] = array$1;
                      var4++;
                      if (var6 != 0) {
                        break L14;
                      } else {
                        if (var6 == 0) {
                          stackOut_21_0 = this;
                          stackIn_22_0 = stackOut_21_0;
                          continue L13;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L14;
                }
                L16: while (true) {
                  L17: {
                    if (var4 >= this.field_j) {
                      break L17;
                    } else {
                      if (var6 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var5 = 0;
                        L18: while (true) {
                          L19: {
                            L20: {
                              if ((this.field_f[var4].length ^ -1) >= (var5 ^ -1)) {
                                break L20;
                              } else {
                                this.field_f[var4][var5] = var7.h(255);
                                var5++;
                                if (var6 != 0) {
                                  break L19;
                                } else {
                                  if (var6 == 0) {
                                    continue L18;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            var4++;
                            break L19;
                          }
                          if (var6 == 0) {
                            continue L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L21;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L21;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
