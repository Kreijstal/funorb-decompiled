/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends ff {
    static java.security.SecureRandom field_N;
    static String field_Q;
    private o field_R;
    static ok field_S;
    private int field_U;
    private String field_L;
    static o field_M;
    static String field_K;
    static String[] field_O;
    private dk field_T;
    static int field_P;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (param1 != -3567) {
            field_O = null;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (!(!param2)) {
            var4++;
        }
        return sk.field_y[var4];
    }

    final static kl a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != -1784753947) {
            field_M = null;
        }
        return sc.a(param0, 12000, param3, false, param2, true);
    }

    public static void a(byte param0) {
        if (param0 <= 59) {
            kl discarded$0 = l.a(-35, -95, true, 66, true);
        }
        field_M = null;
        field_S = null;
        field_K = null;
        field_Q = null;
        field_O = null;
        field_N = null;
    }

    l(dk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (bf) (Object) ml.a((byte) -87));
        try {
            ((l) this).field_L = param1;
            ((l) this).field_T = param0;
            ((l) this).a(125, param3, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (ed.field_c > param3) {
                param4 = param4 - (-param3 + ed.field_c);
                param3 = ed.field_c;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 + param4 > ed.field_l) {
                param4 = -param3 + ed.field_l;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ed.field_i > param2) {
                param0 = param0 - (ed.field_i - param2);
                param2 = ed.field_i;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 == -105) {
                break L4;
              } else {
                l.a((byte) -126);
                break L4;
              }
            }
            L5: {
              if (ed.field_b < param2 - -param0) {
                param0 = -param2 + ed.field_b;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 >= param4) {
                break L6;
              } else {
                if (param0 > 0) {
                  var6_int = param3 + ed.field_h * param2;
                  var7 = -param4 + ed.field_h;
                  param2 = -param0;
                  L7: while (true) {
                    if (0 <= param2) {
                      break L0;
                    } else {
                      param3 = -param4;
                      L8: while (true) {
                        if (param3 >= 0) {
                          var6_int = var6_int + var7;
                          param2++;
                          continue L7;
                        } else {
                          L9: {
                            var8 = ed.field_k[var6_int];
                            if ((var8 & 65280) >> 8 <= param5) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var6_int++;
                          param3++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var6, "l.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String c(boolean param0) {
        if (!param0) {
            return null;
        }
        l.a(23, (byte) -128, -52, 32, 59, 33);
        return null;
    }

    final void a(int param0, int param1, int param2, ub param3) {
        try {
            ((l) this).field_U = ((l) this).field_U + 1;
            if (param0 != 10000536) {
                field_S = null;
            }
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "l.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        ok var6 = null;
        qe var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        o var14 = null;
        o var15 = null;
        o var16 = null;
        L0: {
          L1: {
            var13 = wizardrun.field_H;
            var6 = ((l) this).field_T.a(true);
            if (var6 == nf.field_c) {
              break L1;
            } else {
              if (var6 == field_S) {
                break L1;
              } else {
                var5 = ((l) this).field_T.a(-2864);
                if (var5 == null) {
                  var5 = ((l) this).field_L;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = ke.field_v;
          break L0;
        }
        L2: {
          if (!var5.equals((Object) (Object) ((l) this).field_k)) {
            ((l) this).field_k = var5;
            ((l) this).e(param1);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            super.a(param0, param1, param2, param3);
            var6 = ((l) this).field_T.a(true);
            var8 = (qe) (Object) ((l) this).field_w;
            var9 = param0 - -((l) this).field_o;
            var10 = var8.a(true, param3, (ub) this) + (var8.a((ub) this, (byte) 96).b(126) >> 1);
            if (var6 == nf.field_c) {
              break L4;
            } else {
              if (field_S == var6) {
                break L4;
              } else {
                if (var6 != hg.field_c) {
                  if (gf.field_V != var6) {
                    break L3;
                  } else {
                    var15 = te.field_k[1];
                    var15.a(var9, -(var15.field_p >> 1) + var10, 256);
                    break L3;
                  }
                } else {
                  var14 = te.field_k[2];
                  var14.a(var9, var10 + -(var14.field_p >> 1), 256);
                  break L3;
                }
              }
            }
          }
          L5: {
            L6: {
              var16 = te.field_k[0];
              var11 = var16.field_x << 1;
              var12 = var16.field_s << 1;
              if (((l) this).field_R == null) {
                break L6;
              } else {
                if (((l) this).field_R.field_z < var11) {
                  break L6;
                } else {
                  if (var12 > ((l) this).field_R.field_p) {
                    break L6;
                  } else {
                    ud.a(((l) this).field_R, false);
                    ed.d();
                    break L5;
                  }
                }
              }
            }
            ((l) this).field_R = new o(var11, var12);
            ud.a(((l) this).field_R, false);
            break L5;
          }
          var16.b(112, 144, var16.field_x << 4, var16.field_s << 4, -((l) this).field_U << 10, 4096);
          bb.b(4);
          ((l) this).field_R.a(-(var16.field_x >> 1) + var9, -var16.field_s + var10, 256);
          break L3;
        }
    }

    final boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 8) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("l.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Tutorial";
        field_S = new ok();
        field_O = new String[]{"Four new worlds to battle though", "Meet fearsome enemies", "Travel to the icy mountains", "Save your master"};
        field_P = -1;
    }
}
