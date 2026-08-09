/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra extends ik {
    static int field_j;
    static String field_i;
    static String field_l;
    private mn field_g;
    static String field_k;
    private bd field_h;
    static String field_f;
    static fj field_e;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 < -68) {
                  try {
                    L1: {
                      var3 = new java.net.URL(param0.getCodeBase(), param2);
                      var3 = ck.a(-3780, var3, param0);
                      ua.a(param0, -109, var3.toString(), true);
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    return;
                  }
                  return;
                } else {
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("ra.J(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              L3: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, om param2, boolean param3, int param4, int param5) {
        bv stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        bv stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (nw.g(117)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var6_int = param2.field_G.field_r;
                  var7 = param2.field_v;
                  kr.field_C.a(var7, (byte) 33, param4);
                  if (pg.field_d.field_g.a(var6_int, -63, var7) < param4) {
                    break L2;
                  } else {
                    if (param4 == 1) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (1 >= param4) {
                    break L3;
                  } else {
                    hc.field_b = hc.field_b + 1;
                    hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
                    hc.field_b = Math.abs(hc.field_b);
                    var8 = hc.field_b % 8;
                    var9 = var8;
                    if (0 == var9) {
                      cg.field_j = cg.field_j + 1;
                      kw.field_R = kw.field_R - wr.field_L;
                      break L3;
                    } else {
                      if (1 == var9) {
                        wr.field_L = wr.field_L + 1;
                        ii.field_b = ii.field_b + cg.field_j;
                        break L3;
                      } else {
                        if (var9 == 2) {
                          ii.field_b = ii.field_b + 1;
                          kw.field_R = kw.field_R + 1;
                          break L3;
                        } else {
                          if (-4 != (var9 ^ -1)) {
                            if (var9 != 4) {
                              if (5 != var9) {
                                if (var9 != 6) {
                                  if (7 == var9) {
                                    ii.field_b = ii.field_b - cg.field_j;
                                    wr.field_L = wr.field_L - 1;
                                    break L3;
                                  } else {
                                    throw new IllegalStateException("");
                                  }
                                } else {
                                  kw.field_R = kw.field_R + wr.field_L;
                                  cg.field_j = cg.field_j - 1;
                                  break L3;
                                }
                              } else {
                                cg.field_j = cg.field_j + 1;
                                kw.field_R = kw.field_R - wr.field_L;
                                break L3;
                              }
                            } else {
                              ii.field_b = ii.field_b + cg.field_j;
                              wr.field_L = wr.field_L + 1;
                              break L3;
                            }
                          } else {
                            kw.field_R = kw.field_R + iu.field_t;
                            ii.field_b = ii.field_b + iu.field_t;
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                L4: {
                  pg.field_d.field_g.a(65535, var7, param5, var6_int, param1);
                  vl.field_n.h(32161, 79);
                  vl.field_n.b(param0 + -3, var6_int);
                  vl.field_n.b(1, var7);
                  vl.field_n.b(true, param4);
                  vl.field_n.b(true, param5);
                  vl.field_n.b(true, param1);
                  stackIn_32_0 = vl.field_n;

                  stackIn_32_1 = 1;

                  if (!param3) {
                    stackIn_33_0 = (bv) ((Object) stackIn_32_0);
                    stackIn_33_1 = stackIn_32_1;
                    stackIn_33_2 = 0;
                    break L4;
                  } else {
                    stackIn_33_0 = (bv) ((Object) stackIn_32_0);
                    stackIn_33_1 = stackIn_32_1;
                    stackIn_33_2 = 1;
                    break L4;
                  }
                }
                ((bv) (Object) stackIn_33_0).b(stackIn_33_1, stackIn_33_2);
                vl.field_n.a((byte) -108, km.a(-59));
                vl.field_n.a((byte) -124, oq.a(false));
                vl.field_n.a((byte) -59, jr.a(false));
                vl.field_n.a((byte) -50, rt.g(0));
                break L1;
              }
              qh.b((byte) 27);
              if (param0 == 4) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                ra.b(true);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6);

            stackIn_39_1 = new StringBuilder().append("ra.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L5;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int[] var4;
        bn.field_b = param0;
        ce.field_N = param0;
        dt.field_a = param2;
        dm.field_D = param2;
        tq.field_a = true;
        so.field_b = null;
        var4 = (int[]) null;
        qn.a((int[]) null, 0, 0);
        so.field_b = rj.a(param0, param2, 1423111778, (java.awt.Component) ((Object) si.field_b));
        so.field_b.a(param1 + -17900);
        g.a((byte) -85, param0 / 2, param2 / 2);
        if (param1 != 23505) {
          ra.a(-106, -34, -122);
          ni.a(-8994, param0, param2);
          om.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        } else {
          ni.a(-8994, param0, param2);
          om.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        }
    }

    ra(int param0, mn param1) {
        super(param0);
        try {
            this.field_g = param1;
            if ((this.field_c ^ -1) == -37) {
                this.field_g.field_u = true;
            }
            this.field_g.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ra.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ha param1, int param2) {
        try {
            if (param2 != 26123) {
                ha var5 = (ha) null;
                this.a((ha) null, 42);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ra.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
            vh var3 = (vh) null;
            this.a(-112, (vh) null);
            return 2;
        }
        return 2;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        om var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_h) {
                break L1;
              } else {
                this.field_h.a(64, param0);
                this.field_h = null;
                break L1;
              }
            }
            if (param1 == -1700635440) {
              break L0;
            } else {
              var4 = (om) null;
              ra.a(112, -111, (om) null, true, 116, 78);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ra.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, ha param1) {
        try {
            this.field_h = this.field_g.a(param0 ^ -26, param1);
            if (param0 != -37) {
                ha var4 = (ha) null;
                this.a((ha) null, -62);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ra.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, vh param1) {
        try {
            param1.b(true, this.field_c);
            if (param0 != -11637) {
                field_i = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ra.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(long param0, int param1, int param2) {
        bv var4 = vl.field_n;
        var4.h(32161, param1);
        var4.field_q = var4.field_q + 1;
        int var5 = var4.field_q;
        var4.b(1, param2);
        var4.a(param0, param2 ^ 38359638);
        var4.e(-var5 + var4.field_q, 5930);
    }

    final static int b(boolean param0) {
        if (!param0) {
          ra.b(false);
          return 1900 + new Date().getYear();
        } else {
          return 1900 + new Date().getYear();
        }
    }

    static {
        field_j = 0;
        field_i = "All players have left <%0>'s game.";
        field_k = "You must capture a village before you can use Fortify on it.";
        field_f = "This is your RuneScape clan if you have one.";
        field_l = "You have been removed from <%0>'s game.";
        field_e = null;
    }
}
