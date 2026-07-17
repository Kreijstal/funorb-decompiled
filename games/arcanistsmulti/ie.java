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
        try {
            IOException iOException = null;
            ab var4 = null;
            ab var5 = null;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_10_0 = 0;
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
                long dupTemp$2 = qj.b(-26572);
                fo.field_d = dupTemp$2;
                hi.field_d = dupTemp$2;
                if (nn.field_o.field_e != 1) {
                  ob.field_eb = nl.field_Ib;
                  break L2;
                } else {
                  try {
                    L3: {
                      L4: {
                        ch.field_c = new k((java.net.Socket) nn.field_o.field_g, qg.field_b);
                        var4 = df.field_z;
                        var5 = var4;
                        he.field_e.field_g = 0;
                        if (!param1) {
                          stackOut_11_0 = -1;
                          stackIn_12_0 = stackOut_11_0;
                          break L4;
                        } else {
                          stackOut_10_0 = -2;
                          stackIn_12_0 = stackOut_10_0;
                          break L4;
                        }
                      }
                      ve.field_m = stackIn_12_0;
                      nf.field_W = stackIn_12_0;
                      se.field_I = stackIn_12_0;
                      var5.field_g = 0;
                      ob.field_eb = pc.field_g;
                      jb.a((wk) (Object) he.field_e, vf.field_r, md.field_c, q.field_P, 74);
                      we.a(-1, (byte) 90);
                      break L3;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      iOException = (IOException) (Object) decompiledCaughtException;
                      ob.field_eb = nl.field_Ib;
                      break L5;
                    }
                  }
                  break L2;
                }
              }
              nn.field_o = null;
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (!param0) {
            field_Tb = null;
        }
        if (((ie) this).field_Wb) {
            sc.a(true, false, false);
            return;
        }
        try {
            mo.g(-1);
            ((ie) this).h(77);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ie.U(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    ie(h param0, ln param1) {
        super(param0, go.field_k, qe.field_l, false, false);
        try {
            ((ie) this).field_Kb = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ie.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(byte param0) {
        ho var2 = null;
        if (param0 <= 19) {
            return false;
        }
        if (((ie) this).field_G) {
            if (!((ie) this).field_Ob) {
                var2 = pe.e(false);
                if (var2 != null) {
                    this.a(var2, (byte) 119, false);
                }
            }
        }
        return super.a((byte) 83);
    }

    final static boolean b(byte param0, String param1) {
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
          try {
            if (dl.field_s.startsWith("win")) {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param1.length()) {
                  var4 = -39 / ((param0 - 77) / 37);
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            return stackIn_19_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref2;
            stackOut_20_1 = new StringBuilder().append("ie.VA(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
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
              ((ie) this).field_Ob = true;
              if (param1 >= 115) {
                break L1;
              } else {
                field_Mb = null;
                break L1;
              }
            }
            L2: {
              if (!param0.field_f) {
                if (param0.field_b == null) {
                  var4_ref = param0.field_e;
                  if (param0.field_a == 248) {
                    L3: {
                      if (!param2) {
                        na.i((byte) 105);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4_ref = g.field_c;
                    ((ie) this).field_Wb = true;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = ec.field_e;
                  if (((ie) this).field_Kb != null) {
                    ((ie) this).field_Kb.a((byte) -7);
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
              var5 = new me((ed) this, go.field_k, var4_ref);
              if (param0.field_f) {
                if (param0.field_h) {
                  ((ie) this).a((byte) -92, (qm) (Object) new ng((ie) this));
                  return;
                } else {
                  ag discarded$2 = var5.a(73, qn.field_lb, (wc) this);
                  break L4;
                }
              } else {
                L5: {
                  if (!((ie) this).field_Wb) {
                    if (5 != param0.field_a) {
                      var5.a(ae.field_b, (byte) 115, -1);
                      break L5;
                    } else {
                      var5.a(ee.field_f, (byte) 111, 11);
                      var5.a(ki.field_u, (byte) 10, 17);
                      break L5;
                    }
                  } else {
                    ag discarded$3 = var5.a(116, qn.field_lb, (wc) this);
                    break L5;
                  }
                }
                if (3 == param0.field_a) {
                  var5.a(bd.field_b, (byte) 10, 7);
                  break L4;
                } else {
                  if (param0.field_a != 6) {
                    break L4;
                  } else {
                    var5.a(ea.field_B, (byte) -121, 9);
                    break L4;
                  }
                }
              }
            }
            ((ie) this).a((byte) -92, (qm) (Object) var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("ie.WA(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void l(byte param0) {
        uc.field_d.a(-(!fc.field_a ? 0 : 40 + (2 + (nn.field_p - -2))) + mj.field_s.field_x, 0, 0, 18, (byte) -120);
        nh.field_z.a(nn.field_p + 42, -40 + (-nn.field_p + mj.field_s.field_x) + -2, 0, 18, (byte) -120);
        nj.field_m.a(20, nn.field_p, mj.field_s.field_x, false, 0, mj.field_s.field_I - 20, 2);
        int var1 = -112 % ((param0 - 45) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Character Creation";
        field_Rb = "<shad><col=<%0>>COGS</col></shad>";
        field_Ub = "Try changing the following settings:  ";
        field_Vb = 1;
        field_Jb = "This is the Book of Frost. Frost spells focus on high damage attacks and the summoning of powerful minions. You require 5 wands to purchase this spellbook; you currently have ";
        field_Mb = "Select the Lava Bomb spell below.";
    }
}
