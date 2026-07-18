/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class qr extends ae implements tpa {
    ae field_x;
    static da field_v;
    static String[] field_u;
    static ft field_w;

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        try {
            super.a(param0, param1, param2, param3, param4);
            ((qr) this).c(97);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qr.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 458752) {
                break L1;
              } else {
                boolean discarded$2 = qr.a(95);
                break L1;
              }
            }
            L2: {
              if ((458752 & param2) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (stackIn_7_0 != 0 | cga.a(param2, -83, param1)) {
                  break L4;
                } else {
                  if (!uu.a(true, param2, param1)) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_14_0 = stackOut_11_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "qr.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final boolean b(ae param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param1 == 3815994) {
              L1: {
                L2: {
                  if (((qr) this).field_x == null) {
                    break L2;
                  } else {
                    if (((qr) this).field_x.b((byte) -34)) {
                      break L2;
                    } else {
                      if (!((qr) this).field_x.a(param0, false)) {
                        break L2;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("qr.M(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((qr) this).field_x) {
                  break L3;
                } else {
                  if (!((qr) this).field_x.a(param0, false)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("qr.S(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((qr) this).a((byte) -107, param0, param1, param2)) {
                ((qr) this).a(1, param2, param1, param0);
                ((qr) this).a(param1, param0, param2, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 0) {
                break L2;
              } else {
                field_u = null;
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param2;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("qr.R(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void f(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -122 % ((-38 - param0) / 60);
              if (null != ((qr) this).field_x) {
                ((qr) this).field_x.f((byte) 107);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "qr.K(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int[] param1, hja[] param2, cn param3, cn param4) {
        hja[] var5 = null;
        hja[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        hea var7 = null;
        jea var8 = null;
        jea var9 = null;
        jea var10 = null;
        jea var11 = null;
        iu[] var12 = null;
        iu[] var13 = null;
        iu[] var14 = null;
        jea var15 = null;
        iu[] var16 = null;
        iu[] var17 = null;
        int var18 = 0;
        L0: {
          var18 = TombRacer.field_G ? 1 : 0;
          var5 = tw.a((byte) -69, "crowns", "lobby", param4);
          csa.field_n = var5.length;
          if (null != param2) {
            var6 = new hja[param2.length + csa.field_n];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7_int >= csa.field_n) {
                    break L3;
                  } else {
                    var6[var7_int] = var5[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if (~param2.length >= ~var7_int) {
                    break L5;
                  } else {
                    var6[csa.field_n - -var7_int] = param2[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var6;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var6_array = new int[var5.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if (var7_int >= csa.field_n) {
                    break L10;
                  } else {
                    var6_array[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        continue L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (param2 != null) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (null == param1) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if (param2.length <= var7_int) {
                        break L13;
                      } else {
                        var6_array[var7_int + csa.field_n] = param1[var7_int];
                        var7_int++;
                        if (var18 != 0) {
                          break L7;
                        } else {
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var7_int = 0;
              L14: while (true) {
                if (param2.length <= var7_int) {
                  break L8;
                } else {
                  var6_array[csa.field_n - -var7_int] = param2[var7_int].field_f;
                  var7_int++;
                  if (var18 != 0) {
                    break L7;
                  } else {
                    if (var18 == 0) {
                      continue L14;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            pda.field_c = 2;
            hsa.field_a = 11;
            di.field_a = 15;
            wg.field_i = 2;
            mna.field_d = 4;
            break L7;
          }
          var7 = jta.a((byte) 123, "largefont", param4, "lobby", param3);
          qw.field_f = jta.a((byte) 118, "generalfont", param4, "lobby", param3);
          kw.field_e = jta.a((byte) 127, "chatfont", param4, "lobby", param3);
          var7.a((rka[]) (Object) var5, var6_array);
          qw.field_f.a((rka[]) (Object) var5, var6_array);
          kw.field_e.a((rka[]) (Object) var5, var6_array);
          var8 = new jea(0L, (jea) null);
          var8.field_P = di.field_a;
          var8.field_ib = 16777215;
          var8.field_H = (il) (Object) var7;
          var8.field_bb = 1;
          var9 = var8;
          var9.field_z = 1;
          var10 = new jea(0L, (jea) null);
          var10.field_P = di.field_a;
          var10.field_ib = 16777215;
          var10.field_H = (il) (Object) qw.field_f;
          var11 = var10;
          var10.field_bb = 1;
          var11.field_z = 1;
          uda.field_s = new jea(0L, var8);
          uda.field_s.field_w = rfa.a(uka.a(param4, "lobby", 5, "heading"), 126);
          joa.field_d = new jea(0L, (jea) null);
          joa.field_d.field_w = tba.a(-74, false, 120, 8421504, 4210752, false);
          ji.field_g = new jea(0L, (jea) null);
          ji.field_g.field_w = hca.c(114, 1, 3, 6316128, -111, 6316128);
          lw.field_a = new jea(0L, (jea) null);
          lw.field_a.field_w = rfa.a(uka.a(param4, "lobby", 5, "popup"), 113);
          var12 = rfa.a(uka.a(param4, "lobby", 5, "popup_mouseover"), 122);
          var13 = uka.a(param4, "lobby", 5, "button");
          var14 = rfa.a(uka.a(param4, "lobby", 5, "tab_active"), 113);
          oba.field_f = new jea(0L, var8);
          oba.field_f.field_w = var14;
          cga.field_g = new jea(0L, (jea) null);
          cga.field_g.field_R = nia.a(param4, "lobby", "closebutton", 125);
          cga.field_g.field_rb = nia.a(param4, "lobby", "closebutton_mouseover", -112);
          sm.field_r = new jea(0L, var8);
          sm.field_r.field_w = tba.a(-67, true, 40, 3815994, 2039583, true);
          ooa.field_f = new jea(0L, var10);
          ooa.field_f.field_x = 2;
          ooa.field_f.field_w = tba.a(-75, false, 30, 3815994, 2039583, true);
          cs.field_a = new jea(0L, var10);
          cs.field_a.field_x = 2;
          cs.field_a.field_w = tba.a(-116, false, 30, 3815994, 2039583, false);
          hma.field_b = new jea(0L, var10);
          hma.field_b.field_x = 2;
          hma.field_b.field_w = tba.a(-104, true, 30, 3815994, 2039583, false);
          kua.field_i = new jea(0L, (jea) null);
          kua.field_i.field_ib = 13421772;
          kua.field_i.field_P = di.field_a;
          kua.field_i.field_H = (il) (Object) qw.field_f;
          kua.field_i.field_bb = 1;
          dja.field_p = new jea(0L, kua.field_i);
          dja.field_p.field_ab = 16777215;
          dja.field_p.field_hb = 8421504;
          dja.field_p.field_gb = 16777215;
          dja.field_p.field_ib = 16764006;
          dja.field_p.field_N = 16777215;
          var15 = new jea(0L, dja.field_p);
          var15.field_ib = 16777215;
          var15.field_H = (il) (Object) var7;
          var15.field_P = di.field_a;
          tka.field_q = new jea(0L, kua.field_i);
          tka.field_q.field_w = tba.a(-103, param0, 16, 2236962, 2236962, false);
          tka.field_q.field_x = 2;
          una.field_j = new jea(0L, kua.field_i);
          una.field_j.field_w = tba.a(-73, false, 16, 1513239, 1513239, false);
          una.field_j.field_x = 2;
          iea.field_g = new jea(0L, tka.field_q);
          iea.field_g.a(false, dja.field_p);
          lta.field_a = new jea(0L, una.field_j);
          lta.field_a.a(param0, dja.field_p);
          var16 = uka.a(param4, "lobby", 5, "button_mouseover");
          eq.field_n = new ola(lw.field_a, var12, kua.field_i, dja.field_p, 3, 2, pda.field_c, 3, di.field_a);
          qi.field_M = new jea(0L, dja.field_p);
          qi.field_M.field_fb = 1;
          qi.field_M.field_ob = 1;
          qi.field_M.field_v = 1;
          qi.field_M.field_w = var13;
          qi.field_M.field_C = var16;
          qi.field_M.field_W = 1;
          qi.field_M.field_db = uka.a(param4, "lobby", 5, "button_mouseheld");
          qi.field_M.field_n = uka.a(param4, "lobby", 5, "button_active");
          qi.field_M.field_M = uka.a(param4, "lobby", 5, "button_disabled");
          qi.field_M.field_z = 1;
          up.field_a = new jea(0L, dja.field_p);
          up.field_a.field_z = 1;
          up.field_a.field_w = rfa.a(uka.a(param4, "lobby", 5, "tab_inactive"), 113);
          up.field_a.field_C = rfa.a(uka.a(param4, "lobby", 5, "tab_mouseover"), 113);
          up.field_a.field_n = var14;
          js.field_d = new jea(0L, (jea) null);
          js.field_d.field_w = hca.c(206, -1, 3, 1856141, -113, 1127256);
          cfa.field_c = new jea(0L, (jea) null);
          cfa.field_c.field_w = hca.c(290, -1, 3, 11579568, -120, 6052956);
          hg.field_g = new jea(0L, var15);
          hg.field_g.field_W = 1;
          hg.field_g.field_v = 1;
          hg.field_g.field_fb = 1;
          hg.field_g.field_ob = 1;
          hg.field_g.field_z = 1;
          dp.field_i = new jea(0L, hg.field_g);
          jk.field_g = new jea(0L, dja.field_p);
          jk.field_g.field_W = 1;
          jk.field_g.field_v = 1;
          jk.field_g.field_fb = 1;
          jk.field_g.field_ob = 1;
          jk.field_g.field_z = 1;
          bua.field_g = new jea(0L, jk.field_g);
          kv.field_b = new jea(0L, jk.field_g);
          ssa.field_g = new jea(0L, hg.field_g);
          jq.field_o = new jea(0L, jk.field_g);
          dn.field_a = new jea(0L, jk.field_g);
          qja.field_j = new jea(0L, jk.field_g);
          jk.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "smallbutton"), 124);
          jk.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "smallbutton_mouseover"), 127);
          iu[] dupTemp$4 = rfa.a(uka.a(param4, "lobby", 5, "smallbutton_active"), 114);
          jk.field_g.field_n = dupTemp$4;
          jk.field_g.field_db = dupTemp$4;
          jk.field_g.field_M = rfa.a(uka.a(param4, "lobby", 5, "smallbutton_disabled"), 127);
          dp.field_i.field_w = rfa.a(uka.a(param4, "lobby", 5, "mediumbutton"), 125);
          dp.field_i.field_C = rfa.a(uka.a(param4, "lobby", 5, "mediumbutton_mouseover"), 115);
          dp.field_i.field_db = rfa.a(uka.a(param4, "lobby", 5, "mediumbutton_mouseheld"), 114);
          hg.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "bigbutton"), 127);
          hg.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "bigbutton_mouseover"), 118);
          hg.field_g.field_db = rfa.a(uka.a(param4, "lobby", 5, "bigbutton_mouseheld"), 122);
          hg.field_g.field_M = rfa.a(uka.a(param4, "lobby", 5, "bigbutton_disabled"), 124);
          bua.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "greenbutton"), 124);
          bua.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "greenbutton_mouseover"), 116);
          bua.field_g.field_db = rfa.a(uka.a(param4, "lobby", 5, "greenbutton_mouseheld"), 123);
          kv.field_b.field_w = rfa.a(uka.a(param4, "lobby", 5, "redbutton"), 113);
          kv.field_b.field_C = rfa.a(uka.a(param4, "lobby", 5, "redbutton_mouseover"), 123);
          kv.field_b.field_db = rfa.a(uka.a(param4, "lobby", 5, "redbutton_mouseheld"), 116);
          ssa.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "backbutton"), 125);
          ssa.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "backbutton_mouseover"), 117);
          ssa.field_g.field_db = rfa.a(uka.a(param4, "lobby", 5, "backbutton_mouseheld"), 123);
          ssa.field_g.field_M = rfa.a(uka.a(param4, "lobby", 5, "backbutton_disabled"), 116);
          qja.field_j.field_w = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton"), 118);
          qja.field_j.field_C = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton_mouseover"), 113);
          iu[] dupTemp$5 = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton_active"), 118);
          qja.field_j.field_n = dupTemp$5;
          qja.field_j.field_db = dupTemp$5;
          qja.field_j.field_M = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton_disabled"), 125);
          jq.field_o.field_w = rfa.a(uka.a(param4, "lobby", 5, "chatbutton"), 116);
          jq.field_o.field_C = rfa.a(uka.a(param4, "lobby", 5, "chatbutton_mouseover"), 119);
          iu[] dupTemp$6 = rfa.a(uka.a(param4, "lobby", 5, "chatbutton_active"), 119);
          jq.field_o.field_n = dupTemp$6;
          jq.field_o.field_db = dupTemp$6;
          dn.field_a.field_w = rfa.a(uka.a(param4, "lobby", 5, "chatfilterbutton"), 112);
          dn.field_a.field_C = rfa.a(uka.a(param4, "lobby", 5, "chatfilterbutton_mouseover"), 112);
          iu[] dupTemp$7 = rfa.a(uka.a(param4, "lobby", 5, "chatfilterbutton_active"), 118);
          dn.field_a.field_n = dupTemp$7;
          dn.field_a.field_db = dupTemp$7;
          var17 = uka.a(param4, "lobby", 5, "checkbox");
          kt.field_F = new ta(0L, var17[1], var17[0], 1, dja.field_p, (String) null);
          lr.field_b = new jea(0L, (jea) null);
          lr.field_b.field_w = wpa.a((byte) -118, nia.a(param4, "lobby", "slideregion", 115));
          lr.field_b.field_C = wpa.a((byte) -60, nia.a(param4, "lobby", "slideregion_mouseover", 75));
          lr.field_b.field_db = wpa.a((byte) -118, nia.a(param4, "lobby", "slideregion_mouseheld", 123));
          lr.field_b.field_M = wpa.a((byte) -87, nia.a(param4, "lobby", "slideregion_disabled", 106));
          ie.field_h = new jea(0L, (jea) null);
          ie.field_h.field_w = rfa.a(uka.a(param4, "lobby", 5, "dragbar"), 122);
          ie.field_h.field_C = rfa.a(uka.a(param4, "lobby", 5, "dragbar_mouseover"), 121);
          ie.field_h.field_db = rfa.a(uka.a(param4, "lobby", 5, "dragbar_mouseheld"), 113);
          ie.field_h.field_M = rfa.a(uka.a(param4, "lobby", 5, "dragbar_disabled"), 116);
          pk.field_s = new jea(0L, (jea) null);
          pk.field_s.field_R = nia.a(param4, "lobby", "upbutton", -121);
          pk.field_s.field_rb = nia.a(param4, "lobby", "upbutton_mouseover", -87);
          pk.field_s.field_U = nia.a(param4, "lobby", "upbutton_mouseheld", 71);
          pk.field_s.field_B = nia.a(param4, "lobby", "upbutton_disabled", 71);
          jqa.field_b = new jea(0L, (jea) null);
          jqa.field_b.field_R = nia.a(param4, "lobby", "downbutton", 119);
          jqa.field_b.field_rb = nia.a(param4, "lobby", "downbutton_mouseover", -73);
          jqa.field_b.field_U = nia.a(param4, "lobby", "downbutton_mouseheld", 56);
          jqa.field_b.field_B = nia.a(param4, "lobby", "downbutton_disabled", 113);
          fe.field_F = new oj(0L, pk.field_s, jqa.field_b, lr.field_b, ie.field_h);
          aaa.field_d = new hla(0L, (jea) null, rfa.field_C, fe.field_F, jk.field_g, (String) null, (String) null);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param6 == -1) {
                break L1;
              } else {
                String discarded$2 = ((qr) this).d((byte) -80);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((qr) this).field_x) {
                  break L3;
                } else {
                  if (!((qr) this).field_x.b((byte) -34)) {
                    break L3;
                  } else {
                    if (!((qr) this).field_x.a(param0, param1, param2, param3, param4, param5, -1)) {
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_13_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("qr.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_13_0 != 0;
    }

    ae b(boolean param0) {
        ae var2 = null;
        RuntimeException var2_ref = null;
        ae stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_4_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              var2 = ((qr) this).field_x;
              if (var2 == null) {
                break L1;
              } else {
                if (!var2.b((byte) -34)) {
                  break L1;
                } else {
                  stackOut_4_0 = (ae) var2;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                field_v = null;
                break L2;
              }
            }
            stackOut_9_0 = null;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "qr.N(" + param0 + ')');
        }
        return (ae) (Object) stackIn_10_0;
    }

    String d(byte param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var3_ref_String = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              var2 = super.d((byte) 112);
              if (((qr) this).field_x != null) {
                var3_ref_String = ((qr) this).field_x.d((byte) 51);
                if (var3_ref_String == null) {
                  break L1;
                } else {
                  stackOut_4_0 = (String) var3_ref_String;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              } else {
                break L1;
              }
            }
            var3 = -32 / ((param0 - -58) / 60);
            stackOut_6_0 = (String) var2;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2_ref, "qr.B(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -7694) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            rma.a(true, faa.field_g, osa.field_p, (byte) 119);
            bga.field_d = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "qr.AA(" + param0 + ')');
        }
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  if (!vka.A(param0 ^ 108)) {
                    break L2;
                  } else {
                    if ((8 & pk.field_C) != 0) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
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
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "qr.F(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final boolean a(ae param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param1 > 14) {
              L1: {
                L2: {
                  if (null == ((qr) this).field_x) {
                    break L2;
                  } else {
                    if (((qr) this).field_x.b((byte) -34)) {
                      break L2;
                    } else {
                      if (!((qr) this).field_x.a(param0, false)) {
                        break L2;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
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
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("qr.H(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 > 70) {
              L1: {
                L2: {
                  if (null == ((qr) this).field_x) {
                    break L2;
                  } else {
                    if (!((qr) this).field_x.a(111, ((qr) this).field_i + param1, param2 + ((qr) this).field_n, param3, param4, param5, param6)) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("qr.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param6 + ')');
        }
        return stackIn_10_0 != 0;
    }

    void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 91) {
                break L1;
              } else {
                ((qr) this).field_x = null;
                break L1;
              }
            }
            L2: {
              if (null != ((qr) this).field_x) {
                ((qr) this).field_x.c((byte) 124);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qr.D(" + param0 + ')');
        }
    }

    final static boolean d(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 == 32) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: {
              if (0 == (param0 & 32)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "qr.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            StringBuilder discarded$14 = param2.append('\n');
            var5_int = param3;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (param1 < var5_int) {
                      break L4;
                    } else {
                      StringBuilder discarded$15 = param2.append(' ');
                      var5_int++;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (((qr) this).field_x == null) {
                    break L3;
                  } else {
                    StringBuilder discarded$16 = ((qr) this).field_x.a(param1 - -1, param0, param2, 0);
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                StringBuilder discarded$17 = param2.append("null");
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("qr.J(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -34) {
              L1: {
                if (((qr) this).b(false) == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qr.G(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 59) {
                break L1;
              } else {
                qr.a(false, (int[]) null, (hja[]) null, (cn) null, (cn) null);
                break L1;
              }
            }
            L2: {
              if (null != ((qr) this).field_x) {
                ((qr) this).field_x.a((byte) 59, param1, param2, ((qr) this).field_i + param3, param4 + ((qr) this).field_n, param5);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("qr.Q(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (null == ((qr) this).field_x) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((qr) this).field_x.a(false);
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 77;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qr.W(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_10_0 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_20_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((qr) this).field_x) {
                break L1;
              } else {
                if (!((qr) this).field_x.b((byte) -34)) {
                  break L1;
                } else {
                  if (((qr) this).field_x.a(param0, param1, param2, true)) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param3) {
                break L2;
              } else {
                boolean discarded$2 = ((qr) this).b((byte) -68);
                break L2;
              }
            }
            var5_int = param2;
            if (var5_int == 80) {
              L3: {
                if (!oj.field_tb[81]) {
                  stackOut_20_0 = this.a(param1, 71);
                  stackIn_21_0 = stackOut_20_0;
                  break L3;
                } else {
                  stackOut_18_0 = this.b(param1, 3815994);
                  stackIn_21_0 = stackOut_18_0;
                  break L3;
                }
              }
              return stackIn_21_0;
            } else {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("qr.P(").append(param0).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_23_0 != 0;
    }

    void a(int param0, int param1, ae param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              super.a(param0, param1, param2, param3);
              if (param1 == 2097152) {
                break L1;
              } else {
                boolean discarded$2 = ((qr) this).a(55, -69, -121, 107, (ae) null, -94, -43);
                break L1;
              }
            }
            L2: {
              if (((qr) this).field_x == null) {
                break L2;
              } else {
                ((qr) this).field_x.a(((qr) this).field_i + param0, 2097152, param2, ((qr) this).field_n + param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("qr.A(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        try {
            field_u = null;
            field_v = null;
            field_w = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qr.O(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 != 0) {
                break L1;
              } else {
                if (null != ((qr) this).field_r) {
                  ((qr) this).field_r.a((ae) this, param0, 16777215, param1, true);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == ((qr) this).field_x) {
                break L2;
              } else {
                ((qr) this).field_x.a(((qr) this).field_i + param0, param1 - -((qr) this).field_n, 0, param3);
                break L2;
              }
            }
            L3: {
              if (param2 == 0) {
                break L3;
              } else {
                qr.a(false, (int[]) null, (hja[]) null, (cn) null, (cn) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "qr.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    qr(int param0, int param1, int param2, int param3, isa param4, qc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[]{"<%0> was sliced", "<%0> was diced", "<%0> was chopped", "<%0> was buzzed by a saw", "<%0> was hacked by a saw", "<%0> didn't see the saw", "<%0> was cut down to size", "<%0> failed the first trial"};
        field_w = new ft(1);
    }
}
