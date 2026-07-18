/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vua extends qr {
    static jpa field_y;
    static String field_z;
    static String field_C;
    static int field_B;
    static String[] field_D;
    static nh field_A;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 > 70) {
              L1: {
                L2: {
                  if (!((vua) this).a(param6, param1, -123, param3, param2)) {
                    break L2;
                  } else {
                    if (!super.a(119, param1, param2, param3, param4, param5, param6)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var8;
            stackOut_8_1 = new StringBuilder().append("vua.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 == 0) {
          if (null != ((vua) this).field_r) {
            ((vua) this).field_r.a((ae) this, param0, 16777215, param1, true);
            if (param2 == 0) {
              if (((vua) this).field_m != 0) {
                if (((vua) this).field_p != 0) {
                  afa.field_c.a((byte) 125, ((vua) this).field_p + ((vua) this).field_n + param1, param0 + ((vua) this).field_i, ((vua) this).field_n + param1, ((vua) this).field_i + (param0 + ((vua) this).field_m));
                  ((vua) this).field_x.a(param0 + ((vua) this).field_i, ((vua) this).field_n + param1, param2, param3);
                  afa.field_c.a((byte) 38);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (param2 == 0) {
              if (((vua) this).field_m != 0) {
                if (((vua) this).field_p != 0) {
                  afa.field_c.a((byte) 125, ((vua) this).field_p + ((vua) this).field_n + param1, param0 + ((vua) this).field_i, ((vua) this).field_n + param1, ((vua) this).field_i + (param0 + ((vua) this).field_m));
                  ((vua) this).field_x.a(param0 + ((vua) this).field_i, ((vua) this).field_n + param1, param2, param3);
                  afa.field_c.a((byte) 38);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (param2 == 0) {
            if (((vua) this).field_m != 0) {
              if (((vua) this).field_p == 0) {
                return;
              } else {
                afa.field_c.a((byte) 125, ((vua) this).field_p + ((vua) this).field_n + param1, param0 + ((vua) this).field_i, ((vua) this).field_n + param1, ((vua) this).field_i + (param0 + ((vua) this).field_m));
                ((vua) this).field_x.a(param0 + ((vua) this).field_i, ((vua) this).field_n + param1, param2, param3);
                afa.field_c.a((byte) 38);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_D = null;
        field_y = null;
        field_z = null;
        if (param0 != -4) {
          vua.a((byte) -41);
          field_C = null;
          return;
        } else {
          field_C = null;
          return;
        }
    }

    final void c(int param0) {
        ((vua) this).field_x.c((byte) -47);
        if (param0 <= 91) {
            ((vua) this).c(75);
        }
    }

    final static boolean e(int param0, int param1) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (we.b(param0, param1, 2048)) {
          L0: {
            stackOut_2_0 = o.a(-1, param1, param0);
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if ((45056 & param0) == 0) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          if (stackIn_5_0 | stackIn_5_1 != 0 | mpa.a(false, param1, param0)) {
            return true;
          } else {
            L1: {
              if ((param1 & 55) != 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            int discarded$2 = 8000;
            return stackIn_9_0 != 0 & (cra.a(param1, -28, param0) | wq.b(param1, param0));
          }
        } else {
          return false;
        }
    }

    vua(int param0, int param1, int param2, int param3, isa param4, ae param5) {
        super(param0, param1, param2, param3, param4, (qc) null);
        try {
            ((vua) this).field_x = param5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vua.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "If you can't take the heat, don't practise your backstroke in the lagoons of lava. I heard Arnie met his end here.";
        field_B = -1;
        field_D = new String[]{"<%0> was punctured", "<%0> was popped", "<%0> got the point", "<%0> served as an impromptu dartboard", "<%0> didn't judge the timings correctly"};
        field_z = "Spectate";
    }
}
