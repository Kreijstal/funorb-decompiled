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

    public static void d() {
        field_D = null;
        field_E = null;
        field_C = null;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        try {
            ((la) this).field_F = ((la) this).field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "la.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (!(!((la) this).field_g)) {
            return ((la) this).field_B.c((byte) 66);
        }
        if (param0 == 0) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        tg var7 = null;
        vf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        super.a(param0, param1, 119, param3);
        if (param0 == 0) {
          var5 = (((la) this).field_k >> 1) + (((la) this).field_r + param3);
          var6 = (((la) this).field_m >> 1) + param1 - -((la) this).field_i;
          var8 = ((la) this).field_B.a((byte) 125);
          if (param2 >= 33) {
            L0: {
              if (ui.field_o == var8) {
                break L0;
              } else {
                if (var8 == mi.field_c) {
                  break L0;
                } else {
                  if (a.field_e != var8) {
                    if (mc.field_a == var8) {
                      var7 = field_E[1];
                      var7.a(-(var7.field_s >> 1) + var5, -(var7.field_q >> 1) + var6, 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var7 = field_E[2];
                    var7.a(var5 - (var7.field_s >> 1), -(var7.field_q >> 1) + var6, 256);
                    return;
                  }
                }
              }
            }
            var7 = field_E[0];
            var9 = var7.field_t << 1;
            var10 = var7.field_o << 1;
            if (sj.field_c != null) {
              if (var9 <= sj.field_c.field_s) {
                if (var10 > sj.field_c.field_q) {
                  sj.field_c = new tg(var9, var10);
                  int discarded$8 = 1;
                  kh.a(sj.field_c);
                  var7.b(112, 144, var7.field_t << 4, var7.field_o << 4, -((la) this).field_F << 10, 4096);
                  ve.a(-121);
                  sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                  return;
                } else {
                  int discarded$9 = 1;
                  kh.a(sj.field_c);
                  na.a();
                  var7.b(112, 144, var7.field_t << 4, var7.field_o << 4, -((la) this).field_F << 10, 4096);
                  ve.a(-121);
                  sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                  return;
                }
              } else {
                sj.field_c = new tg(var9, var10);
                int discarded$10 = 1;
                kh.a(sj.field_c);
                var7.b(112, 144, var7.field_t << 4, var7.field_o << 4, -((la) this).field_F << 10, 4096);
                ve.a(-121);
                sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                return;
              }
            } else {
              sj.field_c = new tg(var9, var10);
              int discarded$11 = 1;
              kh.a(sj.field_c);
              var7.b(112, 144, var7.field_t << 4, var7.field_o << 4, -((la) this).field_F << 10, 4096);
              ve.a(-121);
              sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
              return;
            }
          } else {
            ((la) this).a(54, -73, 123, 16);
            if (ui.field_o != var8) {
              if (var8 != mi.field_c) {
                if (a.field_e != var8) {
                  if (mc.field_a != var8) {
                    return;
                  } else {
                    var7 = field_E[1];
                    var7.a(-(var7.field_s >> 1) + var5, -(var7.field_q >> 1) + var6, 256);
                    return;
                  }
                } else {
                  var7 = field_E[2];
                  var7.a(var5 - (var7.field_s >> 1), -(var7.field_q >> 1) + var6, 256);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    var7 = field_E[0];
                    var9 = var7.field_t << 1;
                    var10 = var7.field_o << 1;
                    if (sj.field_c == null) {
                      break L2;
                    } else {
                      if (var9 > sj.field_c.field_s) {
                        break L2;
                      } else {
                        if (var10 <= sj.field_c.field_q) {
                          int discarded$12 = 1;
                          kh.a(sj.field_c);
                          na.a();
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  sj.field_c = new tg(var9, var10);
                  int discarded$13 = 1;
                  kh.a(sj.field_c);
                  break L1;
                }
                var7.b(112, 144, var7.field_t << 4, var7.field_o << 4, -((la) this).field_F << 10, 4096);
                ve.a(-121);
                sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                return;
              }
            } else {
              L3: {
                L4: {
                  var7 = field_E[0];
                  var9 = var7.field_t << 1;
                  var10 = var7.field_o << 1;
                  if (sj.field_c == null) {
                    break L4;
                  } else {
                    if (var9 > sj.field_c.field_s) {
                      break L4;
                    } else {
                      if (var10 <= sj.field_c.field_q) {
                        int discarded$14 = 1;
                        kh.a(sj.field_c);
                        na.a();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                sj.field_c = new tg(var9, var10);
                int discarded$15 = 1;
                kh.a(sj.field_c);
                break L3;
              }
              var7.b(112, 144, var7.field_t << 4, var7.field_o << 4, -((la) this).field_F << 10, 4096);
              ve.a(-121);
              sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = Bounce.field_N;
        var1 = "(" + ak.field_z + " " + i.field_f + " " + ck.field_b + ") " + wa.field_d;
        if (param0 <= -104) {
          if (pe.field_d > 0) {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              if (pe.field_d > var2) {
                L1: {
                  var1 = var1 + ' ';
                  var3 = jc.field_g.field_i[var2] & 255;
                  var4 = var3 >> 4;
                  var3 = var3 & 15;
                  if (10 > var4) {
                    var4 += 48;
                    break L1;
                  } else {
                    var4 += 55;
                    break L1;
                  }
                }
                L2: {
                  var1 = var1 + (char)var4;
                  if (10 <= var3) {
                    var3 += 55;
                    break L2;
                  } else {
                    var3 += 48;
                    break L2;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        } else {
          var6 = null;
          we[] discarded$1 = la.a(-118, -34, (gk) null, (byte) -39);
          if (pe.field_d > 0) {
            var1 = var1 + ":";
            var2 = 0;
            L3: while (true) {
              if (pe.field_d > var2) {
                L4: {
                  var1 = var1 + ' ';
                  var3 = jc.field_g.field_i[var2] & 255;
                  var4 = var3 >> 4;
                  var3 = var3 & 15;
                  if (10 > var4) {
                    var4 += 48;
                    break L4;
                  } else {
                    var4 += 55;
                    break L4;
                  }
                }
                L5: {
                  var1 = var1 + (char)var4;
                  if (10 <= var3) {
                    var3 += 55;
                    break L5;
                  } else {
                    var3 += 48;
                    break L5;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    final boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((la) this).field_F = 61;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("la.PA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            param2--;
            L1: while (true) {
              if (param2 < 0) {
                break L0;
              } else {
                var9 = param4;
                var5_array = var9;
                var6 = param3;
                var7 = param0;
                var9[var6] = var7 - -(da.b(var9[var6], 16711422) >> 1);
                param3++;
                param2--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("la.G(").append(param0).append(',').append(2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a() {
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        if (ui.field_m <= 0) {
          if (jh.b(767564065)) {
            var2 = 0;
            if (vd.field_b == null) {
              if (kg.field_i) {
                nj.a(true, -25698, var2);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var2 = 1;
            if (vd.field_b == null) {
              if (kg.field_i) {
                nj.a(true, -25698, var2);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (null != vd.field_b) {
            L0: {
              sj.field_f = vd.field_b.c((byte) 105);
              int discarded$2 = 2;
              int discarded$3 = 0;
              bi.a();
              if (null == sj.field_f) {
                var2 = 3;
                break L0;
              } else {
                l.a(0, (java.awt.Canvas) (Object) sj.field_f);
                var2 = 2;
                break L0;
              }
            }
            if (vd.field_b == null) {
              if (!kg.field_i) {
                return;
              } else {
                nj.a(true, -25698, var2);
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              sj.field_f = qd.a(0, 640, ck.field_e, 127, 0, 480);
              if (null == sj.field_f) {
                var2 = 3;
                break L1;
              } else {
                l.a(0, (java.awt.Canvas) (Object) sj.field_f);
                var2 = 2;
                break L1;
              }
            }
            if (vd.field_b == null) {
              if (!kg.field_i) {
                return;
              } else {
                nj.a(true, -25698, var2);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static we[] a(int param0, int param1, gk param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        we[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        we[] stackOut_3_0 = null;
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
            if (c.a(param2, false, param1, param0)) {
              var4_int = 112 % ((param3 - 31) / 34);
              int discarded$2 = 0;
              stackOut_3_0 = pe.b();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("la.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    la(uh param0) {
        try {
            ((la) this).field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "la.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new Random();
    }
}
