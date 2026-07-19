/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends nt {
    static ki field_s;
    private boolean field_u;
    private static long[] field_v;
    static da field_t;

    final void a(ha param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        ha var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (int)((double)this.field_p / 100.0 * 255.0);
              if (param1 <= -121) {
                break L1;
              } else {
                var5 = (ha) null;
                this.a((ha) null, 95);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int += 20;
                var4 = 0;
                if (!this.field_u) {
                  break L3;
                } else {
                  var4 = (int)((double)(100 + -this.field_p) / 100.0 * 4096.0);
                  if (!Sumoblitz.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = (int)(4096.0 * ((double)this.field_p / 100.0));
              break L2;
            }
            vl.field_c.a((float)this.field_k, (float)this.field_o, var4, 0, 0, (var3_int << -1521415720) + this.field_q, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("be.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static int a(boolean param0, int param1) {
        int discarded$2 = 0;
        L0: {
          if (6407 == param1) {
            break L0;
          } else {
            if (param1 == 34843) {
              break L0;
            } else {
              if (param1 == 34837) {
                break L0;
              } else {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    discarded$2 = be.a(true, -56);
                    break L1;
                  }
                }
                L2: {
                  if (6408 == param1) {
                    break L2;
                  } else {
                    if (param1 == 34842) {
                      break L2;
                    } else {
                      if (34836 == param1) {
                        break L2;
                      } else {
                        L3: {
                          if (6406 == param1) {
                            break L3;
                          } else {
                            if (-34845 != (param1 ^ -1)) {
                              L4: {
                                if ((param1 ^ -1) == -6410) {
                                  break L4;
                                } else {
                                  if ((param1 ^ -1) == -34847) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (6410 == param1) {
                                        break L5;
                                      } else {
                                        if (34847 != param1) {
                                          if (-6403 != (param1 ^ -1)) {
                                            throw new IllegalArgumentException("");
                                          } else {
                                            return 6402;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    return 6410;
                                  }
                                }
                              }
                              return 6409;
                            } else {
                              break L3;
                            }
                          }
                        }
                        return 6406;
                      }
                    }
                  }
                }
                return 6408;
              }
            }
          }
        }
        return 6407;
    }

    public static void e(int param0) {
        field_t = null;
        field_v = null;
        if (param0 != 6408) {
            field_t = (da) null;
        }
        field_s = null;
    }

    be(int param0, int param1, int param2, boolean param3) {
        super(100, param0, param1, param2);
        this.field_u = param3 ? true : false;
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_v = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= 8) {
                    field_v[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0) != 1L) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = -3932672073523589310L ^ var0 >>> -840473343;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
