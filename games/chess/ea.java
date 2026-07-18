/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends se {
    private vb field_fb;
    static String field_P;
    static bn field_cb;
    static ok field_bb;
    private String field_eb;
    private int field_db;
    private km field_T;

    final void a(int param0, int param1, mf param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ea) this).field_db = ((ea) this).field_db + 1;
              super.a(param0, -32, param2, param3);
              if (param1 < -6) {
                break L1;
              } else {
                ((ea) this).a(95, -66, (mf) null, 75);
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
            stackOut_3_1 = new StringBuilder().append("ea.G(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
        }
    }

    public static void g(byte param0) {
        try {
            int var1_int = 101 / ((param0 - 37) / 53);
            field_bb = null;
            field_P = null;
            field_cb = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ea.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        String var5_ref = null;
        mk var6 = null;
        km var7 = null;
        mg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = Chess.field_G;
        try {
          L0: {
            if (param2 < -80) {
              L1: {
                L2: {
                  var6 = ((ea) this).field_fb.a(21314);
                  if (in.field_g == var6) {
                    break L2;
                  } else {
                    if (var6 == ek.field_d) {
                      break L2;
                    } else {
                      var5_ref = ((ea) this).field_fb.a(false);
                      if (null != var5_ref) {
                        break L1;
                      } else {
                        var5_ref = ((ea) this).field_eb;
                        if (var13 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5_ref = cc.field_v;
                break L1;
              }
              L3: {
                if (!var5_ref.equals((Object) (Object) ((ea) this).field_v)) {
                  ((ea) this).field_v = var5_ref;
                  ((ea) this).f((byte) 105);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  super.a(param0, param1, -109, param3);
                  var6 = ((ea) this).field_fb.a(21314);
                  var8 = (mg) (Object) ((ea) this).field_n;
                  var9 = param3 - -((ea) this).field_u;
                  var10 = var8.a(0, param0, (mf) this) + (var8.a((mf) this, -23159).a((byte) 34) >> -1420287551);
                  if (in.field_g == var6) {
                    break L5;
                  } else {
                    if (var6 == ek.field_d) {
                      break L5;
                    } else {
                      L6: {
                        if (var6 != qk.field_b) {
                          break L6;
                        } else {
                          var7 = uh.field_p[2];
                          var7.d(var9, -(var7.field_t >> -830288991) + var10, 256);
                          if (var13 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (oa.field_a == var6) {
                        var7 = uh.field_p[1];
                        var7.d(var9, -(var7.field_t >> -588563903) + var10, 256);
                        if (var13 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    L9: {
                      var7 = uh.field_p[0];
                      var11 = var7.field_v << 1087088929;
                      var12 = var7.field_u << -1443206655;
                      if (null == ((ea) this).field_T) {
                        break L9;
                      } else {
                        if (var11 > ((ea) this).field_T.field_w) {
                          break L9;
                        } else {
                          if (~var12 >= ~((ea) this).field_T.field_t) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    ((ea) this).field_T = new km(var11, var12);
                    tl.a((byte) -67, ((ea) this).field_T);
                    if (var13 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                  tl.a((byte) -67, ((ea) this).field_T);
                  wb.b();
                  break L7;
                }
                var7.b(112, 144, var7.field_v << 326496996, var7.field_u << 458774724, -((ea) this).field_db << 1059493738, 4096);
                fd.a(28773);
                ((ea) this).field_T.d(-(var7.field_v >> 1940217569) + var9, -var7.field_u + var10, 256);
                break L4;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var5, "ea.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String g(int param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                String discarded$2 = ((ea) this).g(93);
                break L1;
              }
            }
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "ea.E(" + param0 + ')');
        }
        return (String) (Object) stackIn_4_0;
    }

    final boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ea.D(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static int h(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -16) {
                break L1;
              } else {
                field_bb = null;
                break L1;
              }
            }
            stackOut_3_0 = si.field_o;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "ea.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    ea(vb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (jm) (Object) je.d(false));
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
            ((ea) this).field_fb = param0;
            ((ea) this).field_eb = param1;
            ((ea) this).a(param3, 34, param5, param4, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ea.<init>(");
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
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static long i(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            var1_int = 40 % ((-84 - param0) / 36);
            stackOut_0_0 = -ml.field_d + ud.a(2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "ea.C(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Shortcut Reference";
    }
}
