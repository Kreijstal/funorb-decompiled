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
        field_E = null;
        field_C = null;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        try {
            this.field_F = this.field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "la.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (!(!this.field_g)) {
            return this.field_B.c((byte) 66);
        }
        if (param0 == 0) {
            return null;
        }
        return (String) null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        vf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tg var14 = null;
        tg var15 = null;
        tg var16 = null;
        tg var17 = null;
        tg var18 = null;
        tg var20 = null;
        tg var21 = null;
        tg var22 = null;
        var11 = Bounce.field_N;
        super.a(param0, param1, 119, param3);
        if (-1 == (param0 ^ -1)) {
          var5 = (this.field_k >> -1216831583) + (this.field_r + param3);
          var6 = (this.field_m >> -1885576191) + param1 - -this.field_i;
          var8 = this.field_B.a((byte) 125);
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
                      var21 = field_E[1];
                      var21.a(-(var21.field_s >> 1724835265) + var5, -(var21.field_q >> -1108905727) + var6, 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var20 = field_E[2];
                    var20.a(var5 - (var20.field_s >> 876323393), -(var20.field_q >> -990239455) + var6, 256);
                    return;
                  }
                }
              }
            }
            var22 = field_E[0];
            var9 = var22.field_t << -204073759;
            var10 = var22.field_o << -42131423;
            if (sj.field_c != null) {
              if (var9 <= sj.field_c.field_s) {
                if (var10 > sj.field_c.field_q) {
                  sj.field_c = new tg(var9, var10);
                  kh.a(sj.field_c, 1);
                  var22.b(112, 144, var22.field_t << -1841618044, var22.field_o << -1089549596, -this.field_F << 961365770, 4096);
                  ve.a(-121);
                  sj.field_c.a(var5 - var22.field_t, var6 + -var22.field_o, 256);
                  return;
                } else {
                  kh.a(sj.field_c, 1);
                  na.a();
                  var22.b(112, 144, var22.field_t << -1841618044, var22.field_o << -1089549596, -this.field_F << 961365770, 4096);
                  ve.a(-121);
                  sj.field_c.a(var5 - var22.field_t, var6 + -var22.field_o, 256);
                  return;
                }
              } else {
                sj.field_c = new tg(var9, var10);
                kh.a(sj.field_c, 1);
                var22.b(112, 144, var22.field_t << -1841618044, var22.field_o << -1089549596, -this.field_F << 961365770, 4096);
                ve.a(-121);
                sj.field_c.a(var5 - var22.field_t, var6 + -var22.field_o, 256);
                return;
              }
            } else {
              sj.field_c = new tg(var9, var10);
              kh.a(sj.field_c, 1);
              var22.b(112, 144, var22.field_t << -1841618044, var22.field_o << -1089549596, -this.field_F << 961365770, 4096);
              ve.a(-121);
              sj.field_c.a(var5 - var22.field_t, var6 + -var22.field_o, 256);
              return;
            }
          } else {
            this.a(54, -73, 123, 16);
            if (ui.field_o != var8) {
              if (var8 != mi.field_c) {
                if (a.field_e != var8) {
                  if (mc.field_a != var8) {
                    return;
                  } else {
                    var18 = field_E[1];
                    var18.a(-(var18.field_s >> 1724835265) + var5, -(var18.field_q >> -1108905727) + var6, 256);
                    return;
                  }
                } else {
                  var17 = field_E[2];
                  var17.a(var5 - (var17.field_s >> 876323393), -(var17.field_q >> -990239455) + var6, 256);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    var16 = field_E[0];
                    var14 = var16;
                    var9 = var16.field_t << -204073759;
                    var10 = var16.field_o << -42131423;
                    if (sj.field_c == null) {
                      break L2;
                    } else {
                      if (var9 > sj.field_c.field_s) {
                        break L2;
                      } else {
                        if (var10 <= sj.field_c.field_q) {
                          kh.a(sj.field_c, 1);
                          na.a();
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  sj.field_c = new tg(var9, var10);
                  kh.a(sj.field_c, 1);
                  break L1;
                }
                var16.b(112, 144, var16.field_t << -1841618044, var16.field_o << -1089549596, -this.field_F << 961365770, 4096);
                ve.a(-121);
                sj.field_c.a(var5 - var16.field_t, var6 + -var16.field_o, 256);
                return;
              }
            } else {
              L3: {
                L4: {
                  var15 = field_E[0];
                  var9 = var15.field_t << -204073759;
                  var10 = var15.field_o << -42131423;
                  if (sj.field_c == null) {
                    break L4;
                  } else {
                    if (var9 > sj.field_c.field_s) {
                      break L4;
                    } else {
                      if (var10 <= sj.field_c.field_q) {
                        kh.a(sj.field_c, 1);
                        na.a();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                sj.field_c = new tg(var9, var10);
                kh.a(sj.field_c, 1);
                break L3;
              }
              var15.b(112, 144, var15.field_t << -1841618044, var15.field_o << -1089549596, -this.field_F << 961365770, 4096);
              ve.a(-121);
              sj.field_c.a(var5 - var15.field_t, var6 + -var15.field_o, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static String a(int param0) {
        we[] discarded$1 = null;
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        gk var6 = null;
        String var7 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        var5 = Bounce.field_N;
        var7 = "(" + ak.field_z + " " + i.field_f + " " + ck.field_b + ") " + wa.field_d;
        var1 = var7;
        if (param0 <= -104) {
          if (-1 > (pe.field_d ^ -1)) {
            var1 = var7 + ":";
            var2 = 0;
            L0: while (true) {
              if (pe.field_d > var2) {
                L1: {
                  var18 = var1 + ' ';
                  var3 = jc.field_g.field_i[var2] & 255;
                  var4 = var3 >> 1227938436;
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
                  var19 = var18 + (char)var4;
                  if (10 <= var3) {
                    var3 += 55;
                    break L2;
                  } else {
                    var3 += 48;
                    break L2;
                  }
                }
                var1 = var19 + (char)var3;
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
          var6 = (gk) null;
          discarded$1 = la.a(-118, -34, (gk) null, (byte) -39);
          if (-1 > (pe.field_d ^ -1)) {
            var1 = var7 + ":";
            var2 = 0;
            L3: while (true) {
              if (pe.field_d > var2) {
                L4: {
                  var16 = var1 + ' ';
                  var3 = jc.field_g.field_i[var2] & 255;
                  var4 = var3 >> 1227938436;
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
                  var17 = var16 + (char)var4;
                  if (10 <= var3) {
                    var3 += 55;
                    break L5;
                  } else {
                    var3 += 48;
                    break L5;
                  }
                }
                var1 = var17 + (char)var3;
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
              this.field_F = 61;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("la.PA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                field_E = (tg[]) null;
                break L1;
              }
            }
            param2--;
            L2: while (true) {
              if ((param2 ^ -1) > -1) {
                break L0;
              } else {
                var9 = param4;
                var5_array = var9;
                var6 = param3;
                var7 = param0;
                var9[var6] = var7 - -(da.b(var9[var6], 16711422) >> -1965231103);
                param3++;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("la.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        if (param0 == 640) {
          if (-1 <= (ui.field_m ^ -1)) {
            if (jh.b(param0 ^ 767564705)) {
              var2 = 0;
              if (vd.field_b == null) {
                if (kg.field_i) {
                  nj.a(param1, -25698, var2);
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
                  nj.a(param1, -25698, var2);
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
                bi.a(0, 2);
                if (null == sj.field_f) {
                  var2 = 3;
                  break L0;
                } else {
                  l.a(param0 + -640, sj.field_f);
                  var2 = 2;
                  break L0;
                }
              }
              if (vd.field_b == null) {
                if (!kg.field_i) {
                  return;
                } else {
                  nj.a(param1, -25698, var2);
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
                  l.a(param0 + -640, sj.field_f);
                  var2 = 2;
                  break L1;
                }
              }
              if (vd.field_b == null) {
                if (!kg.field_i) {
                  return;
                } else {
                  nj.a(param1, -25698, var2);
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
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
              stackOut_3_0 = pe.b(0);
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
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("la.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    la(uh param0) {
        try {
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = new Random();
    }
}
