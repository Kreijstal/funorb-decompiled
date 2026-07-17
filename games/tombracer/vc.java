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
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((vc) this).field_r = param1.h(255);
                break L1;
              } else {
                if (var4_int != 1) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    ((vc) this).field_m = param1.d(124);
                    break L1;
                  }
                } else {
                  ((vc) this).field_t = param1.h(255);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                ((vc) this).field_t = -73;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("vc.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
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
        int[] var14 = null;
        int[] var15 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        var15 = ((vc) this).field_i.a((byte) 28, param1);
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (param0 == 1) {
          if (!((vc) this).field_i.field_d) {
            return var3;
          } else {
            var4 = 0;
            L0: while (true) {
              if (ns.field_g <= var4) {
                return var3;
              } else {
                L1: {
                  var5 = ht.field_Fb[var4];
                  var6 = sj.field_b[param1];
                  var7 = var5 * ((vc) this).field_r >> 12;
                  var8 = ((vc) this).field_t * var6 >> 12;
                  var9 = var5 % (4096 / ((vc) this).field_r) * ((vc) this).field_r;
                  var10 = var6 % (4096 / ((vc) this).field_t) * ((vc) this).field_t;
                  if (var10 >= ((vc) this).field_m) {
                    break L1;
                  } else {
                    var7 = var7 - var8;
                    L2: while (true) {
                      if (var7 >= 0) {
                        L3: while (true) {
                          if (var7 <= 3) {
                            if (1 != var7) {
                              var15[var4] = 0;
                              var4++;
                              var4++;
                              continue L0;
                            } else {
                              if (var9 >= ((vc) this).field_m) {
                                break L1;
                              } else {
                                var15[var4] = 0;
                                var4++;
                                continue L0;
                              }
                            }
                          } else {
                            var7 -= 4;
                            continue L3;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L2;
                      }
                    }
                  }
                }
                L4: {
                  if (var9 < ((vc) this).field_m) {
                    var7 = var7 - var8;
                    L5: while (true) {
                      if (var7 >= 0) {
                        L6: while (true) {
                          if (var7 <= 3) {
                            if (var7 > 0) {
                              var15[var4] = 0;
                              var4++;
                              continue L0;
                            } else {
                              break L4;
                            }
                          } else {
                            var7 -= 4;
                            continue L6;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var15[var4] = 4096;
                var4++;
                continue L0;
              }
            }
          }
        } else {
          L7: {
            ((vc) this).field_m = 74;
            if (((vc) this).field_i.field_d) {
              var4 = 0;
              if (ns.field_g > var4) {
                L8: {
                  L9: {
                    L10: {
                      var5 = ht.field_Fb[var4];
                      var6 = sj.field_b[param1];
                      var7 = var5 * ((vc) this).field_r >> 12;
                      var8 = ((vc) this).field_t * var6 >> 12;
                      var9 = var5 % (4096 / ((vc) this).field_r) * ((vc) this).field_r;
                      var10 = var6 % (4096 / ((vc) this).field_t) * ((vc) this).field_t;
                      if (var10 >= ((vc) this).field_m) {
                        break L10;
                      } else {
                        var7 = var7 - var8;
                        L11: while (true) {
                          if (var7 >= 0) {
                            L12: while (true) {
                              if (var7 <= 3) {
                                if (1 != var7) {
                                  var15[var4] = 0;
                                  var4++;
                                  break L8;
                                } else {
                                  if (var9 >= ((vc) this).field_m) {
                                    break L10;
                                  } else {
                                    var15[var4] = 0;
                                    var4++;
                                    var4++;
                                    break L9;
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
                    if (var9 < ((vc) this).field_m) {
                      var7 = var7 - var8;
                      L13: while (true) {
                        if (var7 >= 0) {
                          L14: while (true) {
                            if (var7 <= 3) {
                              if (var7 <= 0) {
                                var15[var4] = 4096;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                return var3;
                              } else {
                                var15[var4] = 0;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                return var3;
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
                      var15[var4] = 4096;
                      break L9;
                    }
                  }
                  var4++;
                  break L8;
                }
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                break L7;
              } else {
                return var3;
              }
            } else {
              break L7;
            }
          }
          return var3;
        }
    }

    public vc() {
        super(0, true);
        ((vc) this).field_r = 1;
        ((vc) this).field_m = 204;
        ((vc) this).field_t = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Kick";
        field_s = "Accept";
        field_n = new StringBuilder(80);
    }
}
