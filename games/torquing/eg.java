/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends am {
    private int field_s;
    static int field_w;
    static int field_x;
    static la field_v;
    static long field_u;
    static String field_y;
    static la field_t;

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 == (var4_int ^ -1)) {
                this.field_s = param0.i(7088);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 35) {
                break L2;
              } else {
                field_u = -102L;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("eg.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public eg() {
        super(0, true);
        this.field_s = 585;
    }

    final static void a(int param0, int param1, fn param2, int param3, fn param4, boolean param5) {
        try {
            hn.field_z = param1;
            id.field_b = param4;
            aq.field_b = param3;
            ln.field_D = param0;
            kc.field_x = param2;
            if (!param5) {
                field_v = (la) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "eg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final int[] a(byte param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        L0: {
          var8 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            eg.b(-24);
            break L0;
          }
        }
        L1: {
          var11 = this.field_l.a(param1, 25657);
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (!this.field_l.field_b) {
            break L1;
          } else {
            var4 = dp.field_a[param1];
            var5 = 0;
            L2: while (true) {
              if (var5 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  var6 = q.field_b[var5];
                  if (this.field_s >= var6) {
                    break L3;
                  } else {
                    if (var6 >= -this.field_s + 4096) {
                      break L3;
                    } else {
                      if (-this.field_s + 2048 >= var4) {
                        break L3;
                      } else {
                        if (2048 + this.field_s <= var4) {
                          break L3;
                        } else {
                          L4: {
                            var7 = -var6 + 2048;
                            if (0 > var7) {
                              var9 = var3;
                              stackIn_12_0 = -var7;
                              break L4;
                            } else {
                              stackIn_12_0 = var7;
                              break L4;
                            }
                          }
                          var9 = var3;
                          var7 = stackIn_12_0;
                          var7 = var7 << 12;
                          var7 = var7 / (2048 + -this.field_s);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (var6 <= -this.field_s + 2048) {
                    break L5;
                  } else {
                    if (var6 >= 2048 + this.field_s) {
                      break L5;
                    } else {
                      L6: {
                        var7 = -2048 + var4;
                        if (0 <= var7) {
                          stackIn_18_0 = var7;
                          break L6;
                        } else {
                          stackIn_18_0 = -var7;
                          break L6;
                        }
                      }
                      var7 = stackIn_18_0;
                      var7 = var7 - this.field_s;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (2048 - this.field_s);
                      var5++;
                      continue L2;
                    }
                  }
                }
                L7: {
                  if (var4 < this.field_s) {
                    break L7;
                  } else {
                    if (4096 + -this.field_s < var4) {
                      break L7;
                    } else {
                      L8: {
                        if (this.field_s > var6) {
                          break L8;
                        } else {
                          if (var6 > -this.field_s + 4096) {
                            break L8;
                          } else {
                            var11[var5] = 0;
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      L9: {
                        var7 = 2048 - var4;
                        if (0 <= var7) {
                          stackIn_32_0 = var7;
                          break L9;
                        } else {
                          stackIn_32_0 = -var7;
                          break L9;
                        }
                      }
                      var7 = stackIn_32_0;
                      var7 = var7 << 12;
                      var7 = var7 / (-this.field_s + 2048);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L2;
                    }
                  }
                }
                L10: {
                  var7 = var6 + -2048;
                  if (-1 >= (var7 ^ -1)) {
                    stackIn_25_0 = var7;
                    break L10;
                  } else {
                    stackIn_25_0 = -var7;
                    break L10;
                  }
                }
                var7 = stackIn_25_0;
                var7 = var7 - this.field_s;
                var7 = var7 << 12;
                var9[var5] = var7 / (-this.field_s + 2048);
                var5++;
                continue L2;
              }
            }
          }
        }
        var9 = var3;
        return var9;
    }

    public static void b(int param0) {
        if (param0 >= -17) {
            field_t = (la) null;
        }
        field_v = null;
        field_y = null;
        field_t = null;
    }

    static {
        field_y = "Achievements";
        field_u = 20000000L;
    }
}
