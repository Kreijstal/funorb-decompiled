/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wv extends af {
    private long field_f;
    static wk[] field_h;
    static String field_d;
    private String field_i;
    static int[] field_g;
    static String field_e;

    final void a(vh param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(((wv) this).field_f, 38359632);
              param0.a(-28, ((wv) this).field_i);
              if (param1 == -11436) {
                break L1;
              } else {
                var4 = null;
                ((wv) this).a((vh) null, 16);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wv.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 != -3) {
          wv.c((byte) 69);
          field_e = null;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (param1 == 10) {
                break L1;
              } else {
                var4 = null;
                wv.a((String) null, -77, -29);
                break L1;
              }
            }
            L2: {
              pl.field_A = false;
              ac.field_n = false;
              if (qc.field_a == null) {
                break L2;
              } else {
                if (!qc.field_a.field_L) {
                  break L2;
                } else {
                  L3: {
                    if (8 == param2) {
                      L4: {
                        if (fh.field_i) {
                          param0 = rq.field_o;
                          break L4;
                        } else {
                          param0 = rs.field_x;
                          break L4;
                        }
                      }
                      param2 = 2;
                      np.field_Qb.a(-17376, ga.field_d);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    var3_int = 1;
                    if (param2 != 10) {
                      break L5;
                    } else {
                      ek.a((byte) -99);
                      var3_int = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (!pl.field_A) {
                          break L7;
                        } else {
                          param0 = fo.a(4800, field_d, new String[1]);
                          break L7;
                        }
                      }
                      L8: {
                        if (se.field_f) {
                          param0 = be.field_D;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      qc.field_a.a(param2, (byte) 98, param0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param2 == 256) {
                    break L2;
                  } else {
                    if (10 == param2) {
                      break L2;
                    } else {
                      if (fh.field_i) {
                        break L2;
                      } else {
                        np.field_Qb.a((byte) -111);
                        return;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("wv.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    h a(byte param0) {
        int var2 = -93 / ((param0 - -63) / 45);
        return fl.field_u;
    }

    wv(long param0, String param1) {
        try {
            ((wv) this).field_i = param1;
            ((wv) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[]{0, 130, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, -30, 120, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 30, -30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_d = "Connection lost. <%0>";
        field_e = "Purchase";
    }
}
