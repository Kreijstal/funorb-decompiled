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
        this.field_v = 204;
        this.field_x = 1;
        this.field_u = 1;
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
        fj var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        var11 = Torquing.field_u;
        var14 = this.field_l.a(param1, 25657);
        var13 = var14;
        var3 = var13;
        if (param0 > 86) {
          if (this.field_l.field_b) {
            var4 = 0;
            L0: while (true) {
              if (ci.field_c > var4) {
                L1: {
                  L2: {
                    var5 = q.field_b[var4];
                    var6 = dp.field_a[param1];
                    var7 = this.field_u * var5 >> -1854255092;
                    var8 = this.field_x * var6 >> 1895656140;
                    var9 = this.field_u * (var5 % (4096 / this.field_u));
                    var10 = this.field_x * (var6 % (4096 / this.field_x));
                    if (this.field_v > var10) {
                      var7 = var7 - var8;
                      L3: while (true) {
                        if (-1 >= (var7 ^ -1)) {
                          L4: while (true) {
                            if (3 >= var7) {
                              if (-2 != (var7 ^ -1)) {
                                break L1;
                              } else {
                                if (this.field_v > var9) {
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
                    if (var9 < this.field_v) {
                      var7 = var7 - var8;
                      L6: while (true) {
                        if (var7 >= 0) {
                          L7: while (true) {
                            if ((var7 ^ -1) >= -4) {
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
                  var14[var4] = 4096;
                  var4++;
                  continue L0;
                }
                var14[var4] = 0;
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
          var12 = (fj) null;
          this.a((fj) null, -77, 90);
          if (this.field_l.field_b) {
            var4 = 0;
            L8: while (true) {
              if (ci.field_c > var4) {
                L9: {
                  L10: {
                    var5 = q.field_b[var4];
                    var6 = dp.field_a[param1];
                    var7 = this.field_u * var5 >> -1854255092;
                    var8 = this.field_x * var6 >> 1895656140;
                    var9 = this.field_u * (var5 % (4096 / this.field_u));
                    var10 = this.field_x * (var6 % (4096 / this.field_x));
                    if (this.field_v > var10) {
                      var7 = var7 - var8;
                      L11: while (true) {
                        if (-1 >= (var7 ^ -1)) {
                          L12: while (true) {
                            if (3 >= var7) {
                              if (-2 != (var7 ^ -1)) {
                                break L9;
                              } else {
                                if (this.field_v > var9) {
                                  break L9;
                                } else {
                                  break L10;
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
                    } else {
                      break L10;
                    }
                  }
                  if (var9 < this.field_v) {
                    var7 = var7 - var8;
                    L13: while (true) {
                      if (var7 >= 0) {
                        L14: while (true) {
                          if ((var7 ^ -1) >= -4) {
                            if (var7 > 0) {
                              break L9;
                            } else {
                              var14[var4] = 4096;
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
                    var14[var4] = 4096;
                    var4++;
                    continue L8;
                  }
                }
                var14[var4] = 0;
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
                  if ((var4_int ^ -1) != -3) {
                    break L2;
                  } else {
                    this.field_v = param0.i(param1 + 7053);
                    break L2;
                  }
                } else {
                  this.field_x = param0.i((byte) -101);
                  break L2;
                }
              } else {
                this.field_u = param0.i((byte) -101);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("bd.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void c(int param0) {
        qd.field_d = param0;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (-21 > (of.field_m ^ -1)) {
          ea.b(-60, of.field_m + -20);
          var1 = -12 % ((40 - param0) / 47);
          return;
        } else {
          ea.b(-19, 0);
          var1 = -12 % ((40 - param0) / 47);
          return;
        }
    }

    static {
        field_t = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_s = new ei();
    }
}
