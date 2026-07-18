/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends qc {
    static String field_H;
    static byte[] field_G;
    private Object field_J;
    static fp field_E;
    static int[] field_F;
    static String field_D;
    static int field_I;

    oq(Object param0, int param1) {
        super(param1);
        try {
            ((oq) this).field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "oq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a() {
        rh.b(-14, 4);
    }

    final static void a(od param0, int param1, int param2, int param3, String param4, int[] param5, cr param6, long param7, String param8) {
        try {
            wq.field_M = param0;
            un.field_Lb = new b(param6, param7, param8, param4, param3, param1, param5);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "oq.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 4462 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static ch a(int param0, String[] param1) {
        ch var2 = null;
        RuntimeException var2_ref = null;
        ch stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new ch(false);
            var2.field_b = param1;
            stackOut_0_0 = (ch) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("oq.L(").append(-11).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param0 < param1) {
          ki.a(-110, param0, vl.field_e[param3], param1, param4);
          if (param2 < -40) {
            return;
          } else {
            field_H = null;
            return;
          }
        } else {
          ki.a(-82, param1, vl.field_e[param3], param0, param4);
          if (param2 < -40) {
            return;
          } else {
            field_H = null;
            return;
          }
        }
    }

    final static String a(CharSequence[] param0) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 1039685793;
            stackOut_0_0 = lr.a(param0.length, 0, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("oq.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 86 + ')');
        }
        return stackIn_1_0;
    }

    final Object a(byte param0) {
        if (param0 != 121) {
            field_D = null;
            return ((oq) this).field_J;
        }
        return ((oq) this).field_J;
    }

    final static void a(byte param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              un.field_Ib = false;
              ed.field_t = false;
              if (null == df.field_l) {
                break L1;
              } else {
                if (df.field_l.field_I) {
                  L2: {
                    if (param2 == 8) {
                      L3: {
                        param2 = 2;
                        if (tk.field_e) {
                          param1 = lr.field_M;
                          break L3;
                        } else {
                          param1 = rr.field_y;
                          break L3;
                        }
                      }
                      eb.field_d.a((byte) -79, ff.field_u);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if (param2 != 10) {
                      break L4;
                    } else {
                      int discarded$2 = 83;
                      pc.a();
                      var3_int = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (!un.field_Ib) {
                          break L6;
                        } else {
                          param1 = Vertigo2.a(new String[1], ri.field_o, -128);
                          break L6;
                        }
                      }
                      L7: {
                        if (!bf.field_a) {
                          break L7;
                        } else {
                          param1 = am.field_m;
                          break L7;
                        }
                      }
                      df.field_l.a(param2, true, param1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param2 == 256) {
                    break L1;
                  } else {
                    if (param2 == 10) {
                      break L1;
                    } else {
                      if (tk.field_e) {
                        break L1;
                      } else {
                        eb.field_d.i(15);
                        return;
                      }
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
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("oq.F(").append(102).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final boolean i(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public static void b() {
        field_H = null;
        field_G = null;
        field_D = null;
        field_F = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Won";
        field_H = "Offer unrated rematch";
        field_F = new int[128];
    }
}
