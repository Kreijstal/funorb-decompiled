/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends fe {
    static gh field_L;
    static int field_O;
    int field_I;
    byte field_K;
    static int field_M;
    static long field_P;
    static int field_H;
    static wk[] field_J;
    static gh field_N;
    gi field_G;

    final static void a(String param0, boolean param1, hk param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        dd var7 = null;
        String var8 = null;
        dd var9 = null;
        String var10 = null;
        dd var11 = null;
        String var12 = null;
        dd var13 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              kk.a((gh) (Object) param2, param2.j(-13), -1, (int[]) null, (String) null, (String) null, 1073741824, 0L, rn.field_y);
              if (!param2.field_rc) {
                break L1;
              } else {
                L2: {
                  if (param2.field_sc == 2) {
                    break L2;
                  } else {
                    if (ul.field_d < 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = an.field_i;
                var8 = db.a(sl.field_o, -71, new String[1]);
                var7.field_j.a(2, 10, var8);
                break L1;
              }
            }
            L3: {
              an.field_i.a((byte) 64);
              if (param1) {
                if (bj.field_j != an.field_i.field_g) {
                  var11 = an.field_i;
                  var12 = db.a(ej.field_u, -39, new String[1]);
                  var11.field_j.a(2, 15, var12);
                  break L3;
                } else {
                  var9 = an.field_i;
                  var10 = db.a(ia.field_m, -88, new String[1]);
                  var9.field_j.a(2, 16, var10);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              var13 = an.field_i;
              var5 = oa.field_S;
              if (param3 > 78) {
                break L4;
              } else {
                field_J = null;
                break L4;
              }
            }
            var6 = rj.field_j;
            var13.field_j.a(0, 0, var6, (byte) -119, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("qa.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
    }

    public static void h(int param0) {
        field_J = null;
        field_N = null;
        field_L = null;
    }

    final byte[] d(byte param0) {
        if (!((qa) this).field_z) {
          if (((qa) this).field_G.field_t.length + -((qa) this).field_K <= ((qa) this).field_G.field_p) {
            if (param0 >= -49) {
              field_M = -48;
              return ((qa) this).field_G.field_t;
            } else {
              return ((qa) this).field_G.field_t;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static String a(int param0, int param1) {
        int var2 = 0;
        if (param0 != -1) {
          return null;
        } else {
          var2 = param1 / 60;
          param1 = param1 % 60;
          return db.a(ui.field_S, -36, new String[3]);
        }
    }

    qa() {
    }

    final int g(int param0) {
        Object var3 = null;
        if (param0 == 16) {
          if (((qa) this).field_G == null) {
            return 0;
          } else {
            return ((qa) this).field_G.field_p * 100 / (-((qa) this).field_K + ((qa) this).field_G.field_t.length);
          }
        } else {
          var3 = null;
          qa.a((String) null, false, (hk) null, 114);
          if (((qa) this).field_G == null) {
            return 0;
          } else {
            return ((qa) this).field_G.field_p * 100 / (-((qa) this).field_K + ((qa) this).field_G.field_t.length);
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        qa.a((byte) 43, true);
        fa.a(true, (byte) 67, true);
    }

    final static void a(wk param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
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
              qi.field_i = param0;
              if (param1 == 69) {
                break L1;
              } else {
                var3 = null;
                qa.a((wk) null, (byte) -94);
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
            stackOut_3_1 = new StringBuilder().append("qa.F(");
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
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = 0L;
        field_M = 62;
    }
}
