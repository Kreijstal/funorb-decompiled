/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends tc {
    int[] field_p;
    static uv field_n;
    int field_k;
    private boolean[] field_q;
    static String field_m;
    int[][] field_l;
    static ru field_t;
    static String field_r;
    int[] field_s;
    int field_o;

    public static void e(int param0) {
        field_m = null;
        field_n = null;
        field_t = null;
        field_r = null;
        if (param0 < 1) {
            field_m = (String) null;
        }
    }

    final static g a(Throwable param0, String param1) {
        g var2 = null;
        if (param0 instanceof g) {
            var2 = (g) ((Object) param0);
            var2.field_g = var2.field_g + ' ' + param1;
        } else {
            var2 = new g(param0, param1);
        }
        return var2;
    }

    ig(int param0, byte[] param1) {
        int[] array$1 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vh var7 = null;
        vh var8 = null;
        Object stackIn_8_0 = null;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_13_0 = null;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_k = param0;
            var7 = new vh(param1);
            var8 = var7;
            this.field_o = var8.k(0);
            this.field_l = new int[this.field_o][];
            this.field_q = new boolean[this.field_o];
            this.field_p = new int[this.field_o];
            this.field_s = new int[this.field_o];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= this.field_o) {
                    break L3;
                  } else {
                    this.field_p[var4] = var7.k(0);
                    var4++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
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
                    L7: {
                      if (var4 >= this.field_o) {
                        break L7;
                      } else {
                        stackOut_7_0 = this;
                        stackIn_14_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var6 != 0) {
                          L8: while (true) {
                            if (((ig) (this)).field_o <= var4) {
                              break L6;
                            } else {
                              this.field_s[var4] = var7.e((byte) -104);
                              var4++;
                              if (var6 != 0) {
                                break L5;
                              } else {
                                if (var6 == 0) {
                                  stackOut_13_0 = this;
                                  stackIn_14_0 = stackOut_13_0;
                                  continue L8;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        } else {
                          L9: {
                            stackOut_8_0 = ((ig) (this)).field_q;
                            stackOut_8_1 = var4;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if ((var8.k(0) ^ -1) != -2) {
                              stackOut_10_0 = (boolean[]) ((Object) stackIn_10_0);
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              stackIn_11_2 = stackOut_10_2;
                              break L9;
                            } else {
                              stackOut_9_0 = (boolean[]) ((Object) stackIn_9_0);
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = 1;
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              stackIn_11_2 = stackOut_9_2;
                              break L9;
                            }
                          }
                          stackIn_11_0[stackIn_11_1] = stackIn_11_2 != 0;
                          var4++;
                          if (var6 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    L10: while (true) {
                      stackOut_13_0 = this;
                      stackIn_14_0 = stackOut_13_0;
                      if (((ig) (this)).field_o <= var4) {
                        break L6;
                      } else {
                        this.field_s[var4] = var7.e((byte) -104);
                        var4++;
                        if (var6 != 0) {
                          break L5;
                        } else {
                          if (var6 == 0) {
                            continue L10;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L5;
                }
                L11: while (true) {
                  L12: {
                    L13: {
                      if (var4 >= this.field_o) {
                        break L13;
                      } else {
                        array$1 = new int[var7.k(0)];
                        this.field_l[var4] = array$1;
                        var4++;
                        if (var6 != 0) {
                          break L12;
                        } else {
                          if (var6 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L12;
                  }
                  L14: while (true) {
                    L15: {
                      if (this.field_o <= var4) {
                        break L15;
                      } else {
                        if (var6 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var5 = 0;
                          L16: while (true) {
                            L17: {
                              L18: {
                                if (var5 >= this.field_l[var4].length) {
                                  break L18;
                                } else {
                                  this.field_l[var4][var5] = var7.k(0);
                                  var5++;
                                  if (var6 != 0) {
                                    break L17;
                                  } else {
                                    if (var6 == 0) {
                                      continue L16;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              var4++;
                              break L17;
                            }
                            if (var6 == 0) {
                              continue L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L19;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L19;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        g discarded$0 = null;
        if (param0 != -8327) {
            String var2 = (String) null;
            discarded$0 = ig.a((Throwable) null, (String) null);
        }
        return da.a(23660, ag.d((byte) 16));
    }

    static {
        field_m = "Tutorial";
        field_r = "Scamming";
    }
}
