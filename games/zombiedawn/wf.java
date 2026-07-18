/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends hm {
    static boolean[] field_P;
    private String field_Q;
    private vn field_O;
    private vc field_R;
    private int field_T;

    final boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 67) {
                break L1;
              } else {
                ((wf) this).field_T = 52;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wf.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public static void h(int param0) {
        try {
            field_P = null;
            if (param0 < 62) {
                wf.h(-102);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "wf.R(" + param0 + ')');
        }
    }

    wf(vc param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (io) (Object) tp.c(113));
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((wf) this).field_Q = param1;
            ((wf) this).field_R = param0;
            ((wf) this).a(-119, param3, param2, param4, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wf.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = 101 / ((46 - param1) / 42);
            ((wf) this).field_T = ((wf) this).field_T + 1;
            super.a(param0, (byte) -91, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wf.D(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        String var5_ref = null;
        rh var6 = null;
        vn var7 = null;
        ak var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                var6 = ((wf) this).field_R.a((byte) -73);
                if (var6 == se.field_l) {
                  break L2;
                } else {
                  if (var6 == gj.field_v) {
                    break L2;
                  } else {
                    var5_ref = ((wf) this).field_R.b((byte) 78);
                    if (var5_ref != null) {
                      break L1;
                    } else {
                      var5_ref = ((wf) this).field_Q;
                      if (var13 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var5_ref = no.field_E;
              break L1;
            }
            L3: {
              if (!var5_ref.equals((Object) (Object) ((wf) this).field_o)) {
                ((wf) this).field_o = var5_ref;
                ((wf) this).d((byte) -36);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                super.a(param0, param1, param2, param3);
                var6 = ((wf) this).field_R.a((byte) -120);
                var8 = (ak) (Object) ((wf) this).field_h;
                var9 = ((wf) this).field_k + param2;
                var10 = var8.a((ga) this, param3 + 1, param0) + (var8.a(112, (ga) this).a((byte) 102) >> 600768609);
                if (var6 == se.field_l) {
                  break L5;
                } else {
                  if (gj.field_v == var6) {
                    break L5;
                  } else {
                    L6: {
                      if (var6 == uc.field_b) {
                        break L6;
                      } else {
                        if (mc.field_g == var6) {
                          var7 = dj.field_k[1];
                          var7.b(var9, -(var7.field_t >> 1758093441) + var10, 256);
                          if (var13 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    var7 = dj.field_k[2];
                    var7.b(var9, -(var7.field_t >> 808486785) + var10, 256);
                    if (var13 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L7: {
                L8: {
                  L9: {
                    var7 = dj.field_k[0];
                    var11 = var7.field_r << -1320692991;
                    var12 = var7.field_q << 1842606081;
                    if (((wf) this).field_O == null) {
                      break L9;
                    } else {
                      if (~var11 < ~((wf) this).field_O.field_w) {
                        break L9;
                      } else {
                        if (~var12 >= ~((wf) this).field_O.field_t) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  ((wf) this).field_O = new vn(var11, var12);
                  ki.a((byte) -118, ((wf) this).field_O);
                  if (var13 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
                ki.a((byte) -103, ((wf) this).field_O);
                bi.d();
                break L7;
              }
              var7.a(112, 144, var7.field_r << 1763612836, var7.field_q << 395885220, -((wf) this).field_T << 1505528266, 4096);
              pa.a(-21189);
              ((wf) this).field_O.b(-(var7.field_r >> -1586282143) + var9, var10 - var7.field_q, 256);
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var5, "wf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 44 / ((10 - param0) / 58);
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "wf.A(" + param0 + ')');
        }
        return (String) (Object) stackIn_1_0;
    }

    final static Boolean e(byte param0) {
        Boolean var1 = null;
        RuntimeException var1_ref = null;
        Boolean stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Boolean stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var1 = ba.field_g;
              ba.field_g = null;
              if (param0 >= 22) {
                break L1;
              } else {
                field_P = null;
                break L1;
              }
            }
            stackOut_3_0 = (Boolean) var1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "wf.S(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new boolean[32];
    }
}
