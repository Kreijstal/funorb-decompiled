/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class in {
    static Random field_b;
    static String field_a;
    static String field_e;
    static String field_d;
    static String field_f;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_d = null;
        if (param0 != 0) {
            field_f = (String) null;
        }
    }

    final static String a(byte param0) {
        if (param0 != 86) {
            return (String) null;
        }
        if (un.field_Hb == bf.field_b) {
            return af.field_H;
        }
        return fi.field_e;
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, int param5, int param6, int param7, byte param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param9) {
            break L0;
          } else {
            L1: {
              if (qg.field_G != bi.field_e) {
                break L1;
              } else {
                if (bi.field_j == om.field_D) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (bi.field_j != ro.field_g.field_d) {
              break L0;
            } else {
              if (ro.field_g.field_i != bi.field_e) {
                break L0;
              } else {
                if (null != gd.field_j) {
                  ho.a(param8 ^ -66, false);
                  break L0;
                } else {
                  if (sj.field_d != null) {
                    ho.a(0, true);
                    break L0;
                  } else {
                    jr.a(-127);
                    break L0;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (!param9) {
            ml.field_w = (qg.field_G - 640) / 2;
            break L2;
          } else {
            ml.field_w = on.field_c;
            break L2;
          }
        }
        L3: {
          mn.b(param9, -127);
          if (rk.field_y <= 0) {
            break L3;
          } else {
            dg.a(0, param5, param9, param3);
            break L3;
          }
        }
        L4: {
          if (param8 == -66) {
            break L4;
          } else {
            in.a((byte) -46, -104);
            break L4;
          }
        }
        L5: {
          kk.field_f.field_R = pn.field_N.field_R;
          kk.field_f.field_O = 1;
          if ((ko.field_P ^ -1) >= -1) {
            break L5;
          } else {
            an.a(param9, -86, param3, param5);
            break L5;
          }
        }
        L6: {
          if (-1 > (mp.field_b ^ -1)) {
            gj.a(param0, param5, param9, param8 ^ -66, param3);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (!im.field_g) {
              break L8;
            } else {
              if (gd.field_j.field_Qb < gd.field_j.field_uc) {
                break L8;
              } else {
                im.field_j.field_lb = false;
                ja.field_f.field_Lb.field_S = fg.field_db;
                tg.a(0, ja.field_f.field_Nb);
                break L7;
              }
            }
          }
          im.field_j.field_lb = true;
          ja.field_f.field_Lb.field_S = null;
          dg.a((byte) -86, ja.field_f, param1, param6, param5);
          break L7;
        }
        uo.a(param7, param2, param5, param1, param4, param6, 0);
        dg.a((byte) -121, vd.field_d, param1, param6, param5);
        lo.field_d = lo.field_d + 1;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ub var5 = null;
        be var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var5 = (ub) ((Object) ob.field_Q.a((byte) 100));
            L1: while (true) {
              if (var5 == null) {
                var3 = 52 % ((-5 - param0) / 37);
                var6 = (be) ((Object) mb.field_v.a((byte) 100));
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    ec.a(param1, (byte) 122, var6);
                    var6 = (be) ((Object) mb.field_v.b(45));
                    continue L2;
                  }
                }
              } else {
                he.a(param1, var5, -27011);
                var5 = (ub) ((Object) ob.field_Q.b(113));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "in.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(tn param0, int param1) {
        int dupTemp$4 = 0;
        int fieldTemp$5 = 0;
        int incrementValue$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 640) {
                break L1;
              } else {
                field_b = (Random) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L3: while (true) {
                  if (no.field_d <= var2_int) {
                    dupTemp$4 = param0.a((byte) 110);
                    wq.field_I[dupTemp$4] = wq.field_I[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (no.field_d <= var3) {
                        no.field_d = var2_int;
                        fieldTemp$5 = no.field_d;
                        no.field_d = no.field_d + 1;
                        eo.field_l[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (eo.field_l[var3].field_s == param0.field_s) {
                              var4 = eo.field_l[var3].a((byte) 77);
                              if (wq.field_I[var4] > ll.field_b) {
                                wq.field_I[var4] = wq.field_I[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$6 = var2_int;
                          var2_int++;
                          eo.field_l[incrementValue$6] = eo.field_l[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param0.field_s != eo.field_l[var2_int].field_s) {
                        break L7;
                      } else {
                        dupTemp$7 = eo.field_l[var2_int].a((byte) -128);
                        wq.field_I[dupTemp$7] = wq.field_I[dupTemp$7] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                wq.field_I[var2_int] = 0;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("in.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = mj.a(-106, param1, 0, param1.length);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("in.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        qn var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (qn) ((Object) te.field_z.a((byte) 100));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 < -97) {
                    break L2;
                  } else {
                    field_a = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                pn.a(param1, (byte) -4, var4);
                var4 = (qn) ((Object) te.field_z.b(42));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "in.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new Random();
        field_a = "Restart Level";
        field_d = "The '<%0>' setting needs to be changed.";
        field_f = "Allow spectators?";
        field_e = "No spectators";
    }
}
