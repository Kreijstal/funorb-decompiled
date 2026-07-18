/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends am {
    static char[] field_t;
    static ei field_s;
    private int field_v;
    private int field_x;
    private int field_u;
    static t field_w;
    static double field_y;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_s = null;
        field_t = null;
        field_w = null;
    }

    final static void a(boolean param0, int param1) {
        on.field_c = param1;
        if (!param0) {
            return;
        }
        bd.a(true, 46);
    }

    public bd() {
        super(0, true);
        ((bd) this).field_v = 204;
        ((bd) this).field_x = 1;
        ((bd) this).field_u = 1;
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var11 = Torquing.field_u;
        var16 = ((bd) this).field_l.a(param1, 25657);
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var3 = var13;
        if (param0 > 86) {
          if (((bd) this).field_l.field_b) {
            var4 = 0;
            L0: while (true) {
              if (ci.field_c <= var4) {
                return var3;
              } else {
                L1: {
                  L2: {
                    var5 = q.field_b[var4];
                    var6 = dp.field_a[param1];
                    var7 = ((bd) this).field_u * var5 >> 12;
                    var8 = ((bd) this).field_x * var6 >> 12;
                    var9 = ((bd) this).field_u * (var5 % (4096 / ((bd) this).field_u));
                    var10 = ((bd) this).field_x * (var6 % (4096 / ((bd) this).field_x));
                    if (((bd) this).field_v > var10) {
                      var7 = var7 - var8;
                      L3: while (true) {
                        if (var7 >= 0) {
                          L4: while (true) {
                            if (3 >= var7) {
                              if (var7 != 1) {
                                var16[var4] = 0;
                                var4++;
                                break L1;
                              } else {
                                if (~((bd) this).field_v < ~var9) {
                                  var16[var4] = 0;
                                  break L1;
                                } else {
                                  break L2;
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
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    if (var9 < ((bd) this).field_v) {
                      var7 = var7 - var8;
                      L6: while (true) {
                        if (var7 >= 0) {
                          L7: while (true) {
                            if (var7 <= 3) {
                              if (var7 > 0) {
                                var16[var4] = 0;
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
                  var16[var4] = 4096;
                  break L1;
                }
                var4++;
                continue L0;
              }
            }
          } else {
            return var3;
          }
        } else {
          L8: {
            var12 = null;
            ((bd) this).a((fj) null, -77, 90);
            if (((bd) this).field_l.field_b) {
              var4 = 0;
              if (ci.field_c > var4) {
                var5 = q.field_b[var4];
                var6 = dp.field_a[param1];
                var7 = ((bd) this).field_u * var5 >> 12;
                var8 = ((bd) this).field_x * var6 >> 12;
                var9 = ((bd) this).field_u * (var5 % (4096 / ((bd) this).field_u));
                var10 = ((bd) this).field_x * (var6 % (4096 / ((bd) this).field_x));
                if (((bd) this).field_v > var10) {
                  var7 = var7 - var8;
                  L9: while (true) {
                    if (var7 >= 0) {
                      L10: while (true) {
                        if (3 >= var7) {
                          L11: {
                            if (var7 != 1) {
                              var16[var4] = 0;
                              var4++;
                              break L11;
                            } else {
                              if (~((bd) this).field_v < ~var9) {
                                var16[var4] = 0;
                                var4++;
                                var4++;
                                var4++;
                                break L11;
                              } else {
                                L12: {
                                  if (var9 < ((bd) this).field_v) {
                                    var7 = var7 - var8;
                                    L13: while (true) {
                                      if (var7 >= 0) {
                                        L14: while (true) {
                                          if (var7 <= 3) {
                                            if (var7 > 0) {
                                              var16[var4] = 0;
                                              var4++;
                                              break L12;
                                            } else {
                                              var16[var4] = 4096;
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
                                    var16[var4] = 4096;
                                    break L12;
                                  }
                                }
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                var4++;
                                return var3;
                              }
                            }
                          }
                          var4++;
                          var4++;
                          var4++;
                          var4++;
                          var4++;
                          break L8;
                        } else {
                          var7 -= 4;
                          continue L10;
                        }
                      }
                    } else {
                      var7 += 4;
                      continue L9;
                    }
                  }
                } else {
                  L15: {
                    if (var9 < ((bd) this).field_v) {
                      var7 = var7 - var8;
                      L16: while (true) {
                        if (var7 >= 0) {
                          L17: while (true) {
                            if (var7 <= 3) {
                              if (var7 > 0) {
                                var16[var4] = 0;
                                var4++;
                                break L15;
                              } else {
                                var16[var4] = 4096;
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
                              continue L17;
                            }
                          }
                        } else {
                          var7 += 4;
                          continue L16;
                        }
                      }
                    } else {
                      var16[var4] = 4096;
                      break L15;
                    }
                  }
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              break L8;
            }
          }
          return var3;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                bd.a(true);
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int != 0) {
                if (var4_int != 1) {
                  if (var4_int != 2) {
                    break L2;
                  } else {
                    ((bd) this).field_v = param0.i(param1 + 7053);
                    break L2;
                  }
                } else {
                  ((bd) this).field_x = param0.i((byte) -101);
                  break L2;
                }
              } else {
                ((bd) this).field_u = param0.i((byte) -101);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("bd.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void c(int param0) {
        qd.field_d = 0;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (of.field_m > 20) {
          ea.b(-60, of.field_m + -20);
          var1 = 0;
          return;
        } else {
          ea.b(-19, 0);
          var1 = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_s = new ei();
    }
}
