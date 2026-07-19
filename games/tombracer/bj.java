/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ci {
    private int field_q;
    private int[] field_o;
    static sla field_p;
    private int field_r;
    private int[] field_m;
    private int field_n;
    static ti[] field_s;

    public bj() {
        super(0, true);
        this.field_q = 0;
        this.field_r = 2048;
        this.field_n = 10;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var13 = this.field_i.a((byte) -113, param1);
          var12 = var13;
          var11 = var12;
          var3 = var11;
          if (param0 == 1) {
            break L0;
          } else {
            this.c(-75);
            break L0;
          }
        }
        L1: {
          if (!this.field_i.field_d) {
            break L1;
          } else {
            L2: {
              var4 = sj.field_b[param1];
              if (-1 == (this.field_q ^ -1)) {
                break L2;
              } else {
                var5 = 0;
                L3: while (true) {
                  stackOut_5_0 = ns.field_g;
                  stackOut_5_1 = var5;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  L4: while (true) {
                    if (stackIn_6_0 <= stackIn_6_1) {
                      if (var10 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      var6 = 0;
                      var7 = 0;
                      var8 = ht.field_Fb[var5];
                      var9 = this.field_q;
                      if (var10 != 0) {
                        break L1;
                      } else {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                if (-2 != (var9 ^ -1)) {
                                  break L8;
                                } else {
                                  if (var10 == 0) {
                                    var6 = var8;
                                    if (var10 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (var9 != 2) {
                                  break L9;
                                } else {
                                  if (var10 == 0) {
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if ((var9 ^ -1) == -4) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                            var6 = (var8 - -var4 - 4096 >> 824038273) + 2048;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                          var6 = (var8 - var4 >> -1382297183) + 2048;
                          break L5;
                        }
                        var9 = 0;
                        L10: while (true) {
                          L11: {
                            if (this.field_n <= var9) {
                              break L11;
                            } else {
                              stackOut_21_0 = var6;
                              stackOut_21_1 = this.field_o[var9];
                              stackIn_6_0 = stackOut_21_0;
                              stackIn_6_1 = stackOut_21_1;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              if (var10 != 0) {
                                continue L4;
                              } else {
                                L12: {
                                  if (stackIn_22_0 < stackIn_22_1) {
                                    break L12;
                                  } else {
                                    if (this.field_o[var9 + 1] > var6) {
                                      if (this.field_m[var9] <= var6) {
                                        break L11;
                                      } else {
                                        var7 = 4096;
                                        if (var10 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    } else {
                                      var9++;
                                      continue L10;
                                    }
                                  }
                                }
                                var9++;
                                continue L10;
                              }
                            }
                          }
                          var13 = var12;
                          var13[var5] = var7;
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
            var5 = 0;
            var6 = 0;
            L13: while (true) {
              L14: {
                L15: {
                  if (this.field_n <= var6) {
                    break L15;
                  } else {
                    stackOut_33_0 = this.field_o;
                    stackOut_33_1 = var6;
                    stackIn_42_0 = stackOut_33_0;
                    stackIn_42_1 = stackOut_33_1;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    if (var10 != 0) {
                      break L14;
                    } else {
                      L16: {
                        if (stackIn_34_0[stackIn_34_1] > var4) {
                          break L16;
                        } else {
                          if (var4 >= this.field_o[1 + var6]) {
                            break L16;
                          } else {
                            if (var4 < this.field_m[var6]) {
                              var5 = 4096;
                              if (var10 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      var6++;
                      if (var10 == 0) {
                        continue L13;
                      } else {
                        lua.a(var13, 0, ns.field_g, var5);
                        return var11;
                      }
                    }
                  }
                }
                stackOut_41_0 = (int[]) (var13);
                stackOut_41_1 = 0;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                break L14;
              }
              lua.a(stackIn_42_0, stackIn_42_1, ns.field_g, var5);
              break L1;
            }
          }
        }
        return var11;
    }

    final void b(byte param0) {
        this.c(param0 ^ -117);
        if (param0 != 116) {
            this.field_o = (int[]) null;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        this.field_o = new int[this.field_n - param0];
        this.field_m = new int[1 + this.field_n];
        var2 = 0;
        var3 = 4096 / this.field_n;
        var4 = var3 * this.field_r >> 792561100;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_n <= var5) {
                break L2;
              } else {
                this.field_o[var5] = var2;
                this.field_m[var5] = var2 - -var4;
                var2 = var2 + var3;
                var5++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.field_o[this.field_n] = 4096;
            this.field_m[this.field_n] = this.field_m[0] + 4096;
            break L1;
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_s = null;
        if (!param0) {
            bj.a(true);
        }
        field_p = null;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var4_int = param2;
                    if (-1 == (var4_int ^ -1)) {
                      break L4;
                    } else {
                      if (var4_int == 1) {
                        break L3;
                      } else {
                        if (2 != var4_int) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.field_n = param1.h(255);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_r = param1.d(121);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_q = param1.h(255);
              break L1;
            }
            L5: {
              if (param0 == 107) {
                break L5;
              } else {
                this.field_q = 15;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("bj.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_p = new sla();
        field_s = new ti[255];
        for (var0 = 0; var0 < field_s.length; var0++) {
            field_s[var0] = new ti();
        }
    }
}
