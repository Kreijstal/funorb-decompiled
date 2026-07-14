/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class la extends wd {
    private uh field_B;
    static gk field_D;
    private int field_F;
    static Random field_C;
    static tg[] field_E;

    public static void d(byte param0) {
        field_D = null;
        if (param0 != -59) {
            return;
        }
        try {
            field_E = null;
            field_C = null;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "la.F(" + param0 + 41);
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        RuntimeException runtimeException = null;
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
          ((la) this).field_F = ((la) this).field_F + 1;
          super.a(param0, param1, param2, param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("la.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final String d(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          if (((la) this).field_g) {
            stackOut_3_0 = ((la) this).field_B.c((byte) 66);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (param0 == 0) {
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
            } else {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (String) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "la.S(" + param0 + 41);
        }
        return (String) (Object) stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        tg var7 = null;
        vf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Bounce.field_N;
        try {
          super.a(param0, param1, 119, param3);
          if (-1 == (param0 ^ -1)) {
            L0: {
              var5_int = (((la) this).field_k >> -1216831583) + (((la) this).field_r + param3);
              var6 = (((la) this).field_m >> -1885576191) + param1 - -((la) this).field_i;
              var8 = ((la) this).field_B.a((byte) 125);
              if (param2 >= 33) {
                break L0;
              } else {
                ((la) this).a(54, -73, 123, 16);
                break L0;
              }
            }
            L1: {
              L2: {
                if (ui.field_o == var8) {
                  break L2;
                } else {
                  if (var8 == mi.field_c) {
                    break L2;
                  } else {
                    L3: {
                      if (a.field_e != var8) {
                        break L3;
                      } else {
                        var7 = field_E[2];
                        var7.a(var5_int - (var7.field_s >> 876323393), -(var7.field_q >> -990239455) + var6, 256);
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (mc.field_a != var8) {
                      break L1;
                    } else {
                      var7 = field_E[1];
                      var7.a(-(var7.field_s >> 1724835265) + var5_int, -(var7.field_q >> -1108905727) + var6, 256);
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              L4: {
                L5: {
                  L6: {
                    var7 = field_E[0];
                    var9 = var7.field_t << -204073759;
                    var10 = var7.field_o << -42131423;
                    if (sj.field_c == null) {
                      break L6;
                    } else {
                      if ((var9 ^ -1) < (sj.field_c.field_s ^ -1)) {
                        break L6;
                      } else {
                        if (var10 <= sj.field_c.field_q) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  sj.field_c = new tg(var9, var10);
                  kh.a(sj.field_c, 1);
                  if (var11 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
                kh.a(sj.field_c, 1);
                na.a();
                break L4;
              }
              var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
              ve.a(-121);
              sj.field_c.a(var5_int - var7.field_t, var6 + -var7.field_o, 256);
              break L1;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var5, "la.AA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            var1_ref = "(" + ak.field_z + " " + i.field_f + " " + ck.field_b + ") " + wa.field_d;
            if (param0 <= -104) {
              break L0;
            } else {
              we[] discarded$1 = la.a(-118, -34, (gk) null, (byte) -39);
              break L0;
            }
          }
          L1: {
            L2: {
              if (-1 <= (pe.field_d ^ -1)) {
                break L2;
              } else {
                var1_ref = var1_ref + ":";
                var2 = 0;
                L3: while (true) {
                  if ((pe.field_d ^ -1) >= (var2 ^ -1)) {
                    break L2;
                  } else {
                    stackOut_7_0 = var1_ref + 32;
                    stackIn_22_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L4: {
                        L5: {
                          var1_ref = stackIn_8_0;
                          var3 = jc.field_g.field_i[var2] & 255;
                          var4 = var3 >> 1227938436;
                          var3 = var3 & 15;
                          if (10 > var4) {
                            break L5;
                          } else {
                            var4 += 55;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4 += 48;
                        break L4;
                      }
                      L6: {
                        L7: {
                          var1_ref = var1_ref + (char)var4;
                          if (10 <= var3) {
                            break L7;
                          } else {
                            var3 += 48;
                            if (var5 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var3 += 55;
                        break L6;
                      }
                      var1_ref = var1_ref + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackOut_21_0 = (String) var1_ref;
            stackIn_22_0 = stackOut_21_0;
            break L1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "la.B(" + param0 + 41);
        }
        return stackIn_22_0;
    }

    final boolean a(lk param0, boolean param1) {
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
            if (!param1) {
              break L0;
            } else {
              ((la) this).field_F = 61;
              break L0;
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("la.PA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            if (param1 == 2) {
              break L0;
            } else {
              field_E = null;
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              L3: {
                param2--;
                if ((param2 ^ -1) > -1) {
                  break L3;
                } else {
                  var5 = param4;
                  var6 = param3;
                  var7 = param0;
                  var5[var6] = var7 - -(da.b(var5[var6], 16711422) >> -1965231103);
                  param3++;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    if (var8 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("la.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          if (param0 == 640) {
            L0: {
              L1: {
                if (-1 <= (ui.field_m ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (null != vd.field_b) {
                        break L3;
                      } else {
                        sj.field_f = qd.a(0, 640, ck.field_e, 127, 0, 480);
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    sj.field_f = vd.field_b.c((byte) 105);
                    bi.a(0, 2);
                    break L2;
                  }
                  L4: {
                    if (null == sj.field_f) {
                      break L4;
                    } else {
                      l.a(param0 + -640, (java.awt.Canvas) (Object) sj.field_f);
                      var2_int = 2;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2_int = 3;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L5: {
                if (jh.b(param0 ^ 767564705)) {
                  break L5;
                } else {
                  var2_int = 1;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              var2_int = 0;
              break L0;
            }
            L6: {
              if (vd.field_b != null) {
                break L6;
              } else {
                if (!kg.field_i) {
                  break L6;
                } else {
                  nj.a(param1, -25698, var2_int);
                  break L6;
                }
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "la.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static we[] a(int param0, int param1, gk param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        we[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        we[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          if (!c.a(param2, false, param1, param0)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (we[]) (Object) stackIn_4_0;
          } else {
            var4_int = 112 % ((param3 - 31) / 34);
            stackOut_5_0 = pe.b(0);
            stackIn_6_0 = stackOut_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("la.C(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L0;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    la(uh param0) {
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
          ((la) this).field_B = param0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("la.<init>(");
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
              break L0;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new Random();
    }
}
