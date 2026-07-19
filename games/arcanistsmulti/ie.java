/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ie extends ed implements vb {
    static String field_Lb;
    private ln field_Kb;
    static String field_Ub;
    static String field_Rb;
    static int field_Sb;
    static boolean field_Pb;
    static int field_Vb;
    static ll[] field_Tb;
    private boolean field_Wb;
    static String field_Mb;
    private boolean field_Ob;
    static String field_Jb;
    static String field_Nb;
    static mo field_Qb;

    final static boolean a(int param0, boolean param1) {
        long dupTemp$3 = 0L;
        L0: {
          if (nn.field_o == null) {
            nn.field_o = qg.field_b.a(ng.field_G, true, ka.field_q);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 < -35) {
            break L1;
          } else {
            ie.l((byte) 23);
            break L1;
          }
        }
        if (nn.field_o.field_e == 0) {
          return false;
        } else {
          L2: {
            dupTemp$3 = qj.b(-26572);
            fo.field_d = dupTemp$3;
            hi.field_d = dupTemp$3;
            if (-2 != (nn.field_o.field_e ^ -1)) {
              break L2;
            } else {
              break L2;
            }
          }
          ob.field_eb = nl.field_Ib;
          nn.field_o = null;
          return true;
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (!param0) {
            field_Tb = (ll[]) null;
        }
        if (this.field_Wb) {
            sc.a(true, false, false);
            return;
        }
        try {
            mo.g(-1);
            this.h(77);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ie.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    ie(h param0, ln param1) {
        super(param0, go.field_k, qe.field_l, false, false);
        try {
            this.field_Kb = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        ho var2 = null;
        if (param0 <= 19) {
            return false;
        }
        if (this.field_G) {
            if (!this.field_Ob) {
                var2 = pe.e(false);
                if (var2 != null) {
                    this.a(var2, (byte) 119, false);
                }
            }
        }
        return super.a((byte) 83);
    }

    final static boolean b(byte param0, String param1) {
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (dl.field_s.startsWith("win")) {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param1.startsWith("https://")) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= param1.length()) {
                      var4 = -39 / ((param0 - 77) / 37);
                      discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              return stackIn_19_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2_ref2);
            stackOut_20_1 = new StringBuilder().append("ie.VA(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    public static void m(byte param0) {
        field_Qb = null;
        field_Lb = null;
        if (param0 <= 13) {
            ie.m((byte) 103);
        }
        field_Jb = null;
        field_Nb = null;
        field_Mb = null;
        field_Ub = null;
        field_Rb = null;
        field_Tb = null;
    }

    final void l(int param0) {
        this.a(ab.a(0, param0, g.field_c), (byte) 124, true);
    }

    private final void a(ho param0, byte param1, boolean param2) {
        ag discarded$2 = null;
        ag discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        me var5 = null;
        int var6 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_Ob = true;
              if (param1 >= 115) {
                break L1;
              } else {
                field_Mb = (String) null;
                break L1;
              }
            }
            L2: {
              if (!param0.field_f) {
                if (param0.field_b == null) {
                  var4_ref = param0.field_e;
                  if ((param0.field_a ^ -1) == -249) {
                    L3: {
                      if (!param2) {
                        na.i((byte) 105);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4_ref = g.field_c;
                    this.field_Wb = true;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = ec.field_e;
                  if (this.field_Kb != null) {
                    this.field_Kb.a((byte) -7);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4_ref = aa.field_h;
                break L2;
              }
            }
            L4: {
              var5 = new me((ed) (this), go.field_k, var4_ref);
              if (param0.field_f) {
                if (param0.field_h) {
                  this.a((byte) -92, (qm) (new ng((ie) (this))));
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  discarded$2 = var5.a(73, qn.field_lb, (wc) (this));
                  break L4;
                }
              } else {
                L5: {
                  if (!this.field_Wb) {
                    if (5 != param0.field_a) {
                      var5.a(ae.field_b, (byte) 115, -1);
                      break L5;
                    } else {
                      var5.a(ee.field_f, (byte) 111, 11);
                      var5.a(ki.field_u, (byte) 10, 17);
                      break L5;
                    }
                  } else {
                    discarded$3 = var5.a(116, qn.field_lb, (wc) (this));
                    break L5;
                  }
                }
                if (3 == param0.field_a) {
                  var5.a(bd.field_b, (byte) 10, 7);
                  break L4;
                } else {
                  if (-7 != (param0.field_a ^ -1)) {
                    break L4;
                  } else {
                    var5.a(ea.field_B, (byte) -121, 9);
                    break L4;
                  }
                }
              }
            }
            this.a((byte) -92, (qm) (var5));
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("ie.WA(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void l(byte param0) {
        uc.field_d.a(-(!fc.field_a ? 0 : 40 + (2 + (nn.field_p - -2))) + mj.field_s.field_x, 0, 0, 18, (byte) -120);
        nh.field_z.a(nn.field_p + 42, -40 + (-nn.field_p + mj.field_s.field_x) + -2, 0, 18, (byte) -120);
        nj.field_m.a(20, nn.field_p, mj.field_s.field_x, false, 0, mj.field_s.field_I - 20, 2);
        int var1 = -112 % ((param0 - 45) / 37);
    }

    static {
        field_Lb = "Character Creation";
        field_Rb = "<shad><col=<%0>>COGS</col></shad>";
        field_Ub = "Try changing the following settings:  ";
        field_Vb = 1;
        field_Jb = "This is the Book of Frost. Frost spells focus on high damage attacks and the summoning of powerful minions. You require 5 wands to purchase this spellbook; you currently have ";
        field_Mb = "Select the Lava Bomb spell below.";
    }
}
