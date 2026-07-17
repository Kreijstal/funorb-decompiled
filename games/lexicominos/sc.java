/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static int field_f;
    static int field_b;
    static wh field_d;
    static String field_a;
    static boolean field_e;
    static int field_g;
    static String field_c;

    final static void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              gb.field_d = false;
              dl.field_g = false;
              var3_int = 38 / ((-9 - param1) / 61);
              if (null == jj.field_a) {
                break L1;
              } else {
                if (!jj.field_a.field_D) {
                  break L1;
                } else {
                  L2: {
                    var4 = 1;
                    if (param0 == 8) {
                      L3: {
                        param0 = 2;
                        if (!ca.field_k) {
                          param2 = l.field_C;
                          break L3;
                        } else {
                          param2 = fk.field_j;
                          break L3;
                        }
                      }
                      eb.field_b.a(3, dd.field_d);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (param0 == 10) {
                      var4 = 0;
                      qf.g(-94);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var4 != 0) {
                      L6: {
                        if (!dl.field_g) {
                          break L6;
                        } else {
                          param2 = da.a(new String[1], Lexicominos.field_F, false);
                          break L6;
                        }
                      }
                      L7: {
                        if (!lh.field_w) {
                          break L7;
                        } else {
                          param2 = id.field_u;
                          break L7;
                        }
                      }
                      jj.field_a.a(-109, param0, param2);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param0 == 256) {
                    break L1;
                  } else {
                    if (param0 != 10) {
                      if (!ca.field_k) {
                        eb.field_b.d((byte) -100);
                        break L1;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) runtimeException;
            stackOut_25_1 = new StringBuilder().append("sc.A(").append(param0).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        g.field_n = param1;
        if (param0 >= -32) {
            return;
        }
        ec.field_c = param2;
        ea.field_b = param3;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -110;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Password: ";
        field_f = 0;
        field_e = false;
    }
}
