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
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 == (var4_int ^ -1)) {
                this.field_r = param1.h(255);
                break L1;
              } else {
                if ((var4_int ^ -1) != -2) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    this.field_m = param1.d(124);
                    break L1;
                  }
                } else {
                  this.field_t = param1.h(255);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                this.field_t = -73;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("vc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        var11 = TombRacer.field_G ? 1 : 0;
        var13 = this.field_i.a((byte) 28, param1);
        var12 = var13;
        var3 = var12;
        if (param0 == 1) {
          if (this.field_i.field_d) {
            var4 = 0;
            L0: while (true) {
              if (ns.field_g > var4) {
                L1: {
                  L2: {
                    var5 = ht.field_Fb[var4];
                    var6 = sj.field_b[param1];
                    var7 = var5 * this.field_r >> 1270905772;
                    var8 = this.field_t * var6 >> 1264450924;
                    var9 = var5 % (4096 / this.field_r) * this.field_r;
                    var10 = var6 % (4096 / this.field_t) * this.field_t;
                    if (var10 >= this.field_m) {
                      break L2;
                    } else {
                      var7 = var7 - var8;
                      L3: while (true) {
                        if (var7 >= 0) {
                          L4: while (true) {
                            if (-4 <= (var7 ^ -1)) {
                              if (1 != var7) {
                                break L1;
                              } else {
                                if (var9 >= this.field_m) {
                                  break L2;
                                } else {
                                  var13[var4] = 0;
                                  var4++;
                                  continue L0;
                                }
                              }
                            } else {
                              var7 -= 4;
                              continue L4;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L3;
                        }
                      }
                    }
                  }
                  L5: {
                    if (var9 < this.field_m) {
                      var7 = var7 - var8;
                      L6: while (true) {
                        if (-1 >= (var7 ^ -1)) {
                          L7: while (true) {
                            if (var7 <= 3) {
                              if (var7 > 0) {
                                break L1;
                              } else {
                                break L5;
                              }
                            } else {
                              var7 -= 4;
                              continue L7;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L6;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  var13[var4] = 4096;
                  var4++;
                  continue L0;
                }
                var13[var4] = 0;
                var4++;
                continue L0;
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        } else {
          this.field_m = 74;
          if (this.field_i.field_d) {
            var4 = 0;
            L8: while (true) {
              if (ns.field_g > var4) {
                L9: {
                  L10: {
                    var5 = ht.field_Fb[var4];
                    var6 = sj.field_b[param1];
                    var7 = var5 * this.field_r >> 1270905772;
                    var8 = this.field_t * var6 >> 1264450924;
                    var9 = var5 % (4096 / this.field_r) * this.field_r;
                    var10 = var6 % (4096 / this.field_t) * this.field_t;
                    if (var10 >= this.field_m) {
                      break L10;
                    } else {
                      var7 = var7 - var8;
                      L11: while (true) {
                        if (var7 >= 0) {
                          L12: while (true) {
                            if (-4 <= (var7 ^ -1)) {
                              if (1 != var7) {
                                break L9;
                              } else {
                                if (var9 >= this.field_m) {
                                  break L10;
                                } else {
                                  var13[var4] = 0;
                                  var4++;
                                  continue L8;
                                }
                              }
                            } else {
                              var7 -= 4;
                              continue L12;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L11;
                        }
                      }
                    }
                  }
                  if (var9 < this.field_m) {
                    var7 = var7 - var8;
                    L13: while (true) {
                      if (-1 >= (var7 ^ -1)) {
                        L14: while (true) {
                          if (var7 <= 3) {
                            if (var7 > 0) {
                              break L9;
                            } else {
                              var13[var4] = 4096;
                              var4++;
                              continue L8;
                            }
                          } else {
                            var7 -= 4;
                            continue L14;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L13;
                      }
                    }
                  } else {
                    var13[var4] = 4096;
                    var4++;
                    continue L8;
                  }
                }
                var13[var4] = 0;
                var4++;
                continue L8;
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
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
