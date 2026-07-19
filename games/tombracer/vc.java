/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends ci {
    static StringBuilder field_n;
    private int field_r;
    static String field_o;
    static kh field_q;
    static cn field_p;
    private int field_m;
    static String field_s;
    private int field_t;

    public static void c(int param0) {
        field_o = null;
        field_p = null;
        field_q = null;
        field_s = null;
        field_n = null;
        if (param0 == 3) {
            return;
        }
        field_n = (StringBuilder) null;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4_int = param2;
                  if (-1 == (var4_int ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if ((var4_int ^ -1) != -2) {
                        break L4;
                      } else {
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (2 != var4_int) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        this.field_m = param1.d(124);
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_r = param1.h(255);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_t = param1.h(255);
              if (var5 == 0) {
                break L1;
              } else {
                this.field_m = param1.d(124);
                break L1;
              }
            }
            if (param0 == 107) {
              break L0;
            } else {
              this.field_t = -73;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("vc.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
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
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_9_0 = null;
        int[] stackOut_7_0 = null;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var13 = this.field_i.a((byte) 28, param1);
          var12 = var13;
          var3 = var12;
          if (param0 == 1) {
            break L0;
          } else {
            this.field_m = 74;
            break L0;
          }
        }
        L1: {
          if (this.field_i.field_d) {
            var4 = 0;
            L2: while (true) {
              if (ns.field_g > var4) {
                var5 = ht.field_Fb[var4];
                stackOut_7_0 = sj.field_b;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var11 == 0) {
                  L3: {
                    L4: {
                      var6 = stackIn_9_0[param1];
                      var7 = var5 * this.field_r >> 1270905772;
                      var8 = this.field_t * var6 >> 1264450924;
                      var9 = var5 % (4096 / this.field_r) * this.field_r;
                      var10 = var6 % (4096 / this.field_t) * this.field_t;
                      if (var10 >= this.field_m) {
                        break L4;
                      } else {
                        var7 = var7 - var8;
                        L5: while (true) {
                          L6: {
                            L7: {
                              L8: {
                                if (var7 >= 0) {
                                  L9: while (true) {
                                    if (-4 <= (var7 ^ -1)) {
                                      break L8;
                                    } else {
                                      var7 -= 4;
                                      if (var11 != 0) {
                                        break L7;
                                      } else {
                                        continue L9;
                                      }
                                    }
                                  }
                                } else {
                                  var7 += 4;
                                  if (var11 != 0) {
                                    break L8;
                                  } else {
                                    continue L5;
                                  }
                                }
                              }
                              if (1 != var7) {
                                var13 = var12;
                                var13[var4] = 0;
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                            var13 = var12;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                          var13 = var12;
                          if (var9 >= this.field_m) {
                            break L4;
                          } else {
                            var13[var4] = 0;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (var9 < this.field_m) {
                      var7 = var7 - var8;
                      L10: while (true) {
                        L11: {
                          L12: {
                            L13: {
                              L14: {
                                if (-1 >= (var7 ^ -1)) {
                                  break L14;
                                } else {
                                  var7 += 4;
                                  if (var11 != 0) {
                                    break L13;
                                  } else {
                                    if (var11 == 0) {
                                      continue L10;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              L15: while (true) {
                                if (var7 <= 3) {
                                  break L13;
                                } else {
                                  var7 -= 4;
                                  if (var11 != 0) {
                                    break L12;
                                  } else {
                                    continue L15;
                                  }
                                }
                              }
                            }
                            if (var7 > 0) {
                              var13[var4] = 0;
                              break L12;
                            } else {
                              break L11;
                            }
                          }
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L11;
                          }
                        }
                        var13[var4] = 4096;
                        break L3;
                      }
                    } else {
                      var13[var4] = 4096;
                      break L3;
                    }
                  }
                  var4++;
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                } else {
                  return stackIn_8_0;
                }
              } else {
                return var3;
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    public vc() {
        super(0, true);
        this.field_r = 1;
        this.field_m = 204;
        this.field_t = 1;
    }

    static {
        field_o = "Kick";
        field_s = "Accept";
        field_n = new StringBuilder(80);
    }
}
