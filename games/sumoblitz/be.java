/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends nt {
    static ki field_s;
    private boolean field_u;
    private static long[] field_v;
    static da field_t;

    final void a(ha param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            var3_int = (int)((double)((be) this).field_p / 100.0 * 255.0);
            if (param1 > -121) {
                Object var5 = null;
                ((be) this).a((ha) null, 95);
            }
            var3_int += 20;
            var4 = 0;
            if (((be) this).field_u) {
                var4 = (int)((double)(100 + -((be) this).field_p) / 100.0 * 4096.0);
            } else {
                var4 = (int)(4096.0 * ((double)((be) this).field_p / 100.0));
            }
            vl.field_c.a((float)((be) this).field_k, (float)((be) this).field_o, var4, 0, 0, (var3_int << 24) + ((be) this).field_q, 1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "be.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(boolean param0, int param1) {
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
                    int discarded$2 = be.a(true, -56);
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
                            if (param1 != 34844) {
                              L4: {
                                if (param1 == 6409) {
                                  break L4;
                                } else {
                                  if (param1 == 34846) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (6410 == param1) {
                                        break L5;
                                      } else {
                                        if (34847 != param1) {
                                          if (param1 != 6402) {
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

    public static void e() {
        field_t = null;
        field_v = null;
        field_s = null;
    }

    be(int param0, int param1, int param2, boolean param3) {
        super(100, param0, param1, param2);
        ((be) this).field_u = param3 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_v = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
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
                  var0 = -3932672073523589310L ^ var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
