/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class taa extends vg {
    private int field_f;
    private int field_h;
    static nc field_g;

    final void a(uia param0, int param1) {
        try {
            if (param1 != 32654) {
                taa.a((byte) -36);
            }
            param0.i(((taa) this).field_h, 0);
            param0.i(((taa) this).field_f, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "taa.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int c(int param0) {
        if (param0 != 16) {
            return -13;
        }
        return ((taa) this).field_h;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 10) {
                param3 = param3 - (id.field_h[0].a() * 2 - -(id.field_h[0].a() / 2));
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 4) {
                    break L1;
                  } else {
                    var5 = var4_int + 12;
                    id.field_h[var5].a(param3, param1 - (id.field_h[var5].c() >> 1));
                    param3 = param3 + id.field_h[var5].a();
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                if (param2 != 9) {
                  if (param2 != 8) {
                    L3: {
                      if (param2 < 0) {
                        break L3;
                      } else {
                        if (7 < param2) {
                          break L3;
                        } else {
                          id.field_h[param2].a(-(id.field_h[param2].a() >> 1) + param3, -(id.field_h[param2].c() >> 1) + param1);
                          break L1;
                        }
                      }
                    }
                    if (param2 != 11) {
                      break L1;
                    } else {
                      id.field_h[16].a(-(id.field_h[16].a() >> 1) + param3, -(id.field_h[16].c() >> 1) + param1);
                      break L1;
                    }
                  } else {
                    param3 = param3 - (id.field_h[0].a() + id.field_h[0].a() / 2);
                    var4_int = 0;
                    L4: while (true) {
                      if (var4_int >= 2) {
                        break L1;
                      } else {
                        var5 = var4_int + 8;
                        id.field_h[var5].a(param3, -(id.field_h[var5].c() >> 1) + param1);
                        param3 = param3 + id.field_h[var5].a();
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  param3 = param3 - (id.field_h[0].a() - -(id.field_h[0].a() / 2));
                  var4_int = 0;
                  L5: while (true) {
                    if (var4_int >= 2) {
                      break L1;
                    } else {
                      var5 = var4_int + 10;
                      id.field_h[var5].a(param3, -(id.field_h[var5].c() >> 1) + param1);
                      param3 = param3 + id.field_h[var5].a();
                      var4_int++;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 < -106) {
                break L6;
              } else {
                taa.a((byte) -56, 127, 63, -18);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "taa.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    taa(int param0, int param1) {
        ((taa) this).field_h = param0;
        ((taa) this).field_f = param1;
    }

    final boolean b(int param0) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              L2: {
                if (((taa) this).field_h != 0) {
                  break L2;
                } else {
                  if (!di.field_f[((taa) this).field_f]) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (((taa) this).field_h != 1) {
                  break L3;
                } else {
                  if (wk.field_i[((taa) this).field_f]) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return false;
        }
    }

    final int a(int param0) {
        if (param0 != -13939) {
            ((taa) this).field_f = 74;
        }
        return ((taa) this).field_f;
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = 122 % ((69 - param0) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        eqa discarded$0 = new eqa();
    }
}
