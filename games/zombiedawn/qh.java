/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends vo {
    static long field_e;
    int field_g;
    static int field_f;

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                var4 = null;
                qh.a(24, 51, (String) null);
                break L1;
              }
            }
            L2: {
              ce.field_q = false;
              mp.field_e = false;
              if (kk.field_i == null) {
                break L2;
              } else {
                if (kk.field_i.field_H) {
                  L3: {
                    if (param1 != 8) {
                      break L3;
                    } else {
                      L4: {
                        param1 = 2;
                        if (!nm.field_c) {
                          param2 = fl.field_b;
                          break L4;
                        } else {
                          param2 = tl.field_e;
                          break L4;
                        }
                      }
                      he.field_a.a(m.field_B, 20);
                      break L3;
                    }
                  }
                  L5: {
                    var3_int = 1;
                    if (param1 != 10) {
                      break L5;
                    } else {
                      var3_int = 0;
                      jp.a((byte) -70);
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int == 0) {
                      break L6;
                    } else {
                      L7: {
                        if (mp.field_e) {
                          param2 = s.a(1938762664, nd.field_e, new String[1]);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (pk.field_J) {
                          param2 = fe.field_L;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      kk.field_i.a(param2, param1, param0 ^ 27);
                      break L6;
                    }
                  }
                  if (param1 == 256) {
                    break L2;
                  } else {
                    if (param1 != 10) {
                      if (nm.field_c) {
                        break L2;
                      } else {
                        he.field_a.h(-123);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("qh.N(").append(param0).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    qh() {
    }

    final static void a(float param0, String param1, byte param2, boolean param3) {
        if (!(null != vi.field_c)) {
            vi.field_c = new sa(e.field_S, ed.field_c);
            e.field_S.a((ga) (Object) vi.field_c, true);
        }
        vi.field_c.a(param3, param0, (byte) -97, param1);
        if (param2 >= -18) {
            return;
        }
        try {
            bi.d();
            rc.a(true, (byte) -63);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "qh.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
    }
}
