/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wk extends ch implements tb {
    private qq field_W;
    static String field_V;
    static int field_P;
    private lr field_Q;
    static dd field_T;
    private fe[] field_R;
    static vh field_N;
    private int[] field_U;
    private int field_S;
    private String field_O;

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var9 = null;
                fe discarded$2 = ((wk) this).a((String) null, 93, (cc) null);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= ((wk) this).field_S) {
                  break L3;
                } else {
                  if (((wk) this).field_R[var6_int] == param3) {
                    var7 = ((wk) this).field_U[var6_int];
                    if (var7 != -1) {
                      lf.a(((wk) this).field_U[var6_int], (byte) 78);
                      break L3;
                    } else {
                      ((wk) this).field_W.k(17);
                      break L3;
                    }
                  } else {
                    var6_int++;
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("wk.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 78, param2, param3);
        int discarded$0 = ((wk) this).field_Q.a(((wk) this).field_O, 14 + param2 - -((wk) this).field_C, ((wk) this).field_D + (param3 - -10), ((wk) this).field_l + -28, ((wk) this).field_y, 16777215, -1, 0, 0, ((wk) this).field_Q.field_C);
        int var5 = 6 % ((-42 - param1) / 53);
    }

    final fe a(String param0, int param1, cc param2) {
        fe var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fe stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new fe(param0, param2);
              var4.field_z = (fp) (Object) new ng();
              var5 = -2 + ((wk) this).field_y;
              if (param1 <= -77) {
                break L1;
              } else {
                ((wk) this).field_R = null;
                break L1;
              }
            }
            ((wk) this).a(((wk) this).field_l, 0, 34 + ((wk) this).field_y, false, 0);
            var4.a(((wk) this).field_l + -14, 7, 30, false, var5);
            ((wk) this).a(true, (ei) (Object) var4);
            stackOut_2_0 = (fe) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("wk.G(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void h() {
        field_N = null;
        field_V = null;
        field_T = null;
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            fb.a();
            ob.field_i = 11;
            cp.field_d = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var4 = 256;
                var1_int = var4;
                L2: while (true) {
                  if (var4 >= cp.field_d.length) {
                    break L0;
                  } else {
                    cp.field_d[var4] = 255;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                cp.field_d[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "wk.F(" + -257 + ')');
        }
    }

    wk(qq param0, lr param1, String param2) {
        super(0, 0, 288, 0, (fp) null);
        int var4_int = 0;
        ((wk) this).field_S = 0;
        try {
            ((wk) this).field_Q = param1;
            ((wk) this).field_W = param0;
            ((wk) this).field_O = param2;
            var4_int = null == ((wk) this).field_O ? 0 : ((wk) this).field_Q.b(((wk) this).field_O, 260, ((wk) this).field_Q.field_C);
            ((wk) this).a(288, 0, var4_int + 22, false, 0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((wk) this).field_S;
            this.b((byte) 122, var4_int + param2);
            ((wk) this).field_R[var4_int] = ((wk) this).a(param1, cq.a(param2, -115), (cc) this);
            ((wk) this).field_U[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        vh var4_ref = null;
        int var4_int = 0;
        vh var5 = null;
        vh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        vh stackIn_35_0 = null;
        vh stackIn_36_0 = null;
        vh stackIn_37_0 = null;
        String stackIn_37_1 = null;
        vh stackIn_38_0 = null;
        String[] stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        vh stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        vh stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        String stackIn_40_3 = null;
        vh stackIn_61_0 = null;
        vh stackIn_62_0 = null;
        vh stackIn_63_0 = null;
        vh stackIn_64_0 = null;
        vh stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        vh stackIn_66_0 = null;
        vh stackIn_67_0 = null;
        vh stackIn_68_0 = null;
        vh stackIn_69_0 = null;
        vh stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        vh stackIn_71_0 = null;
        vh stackIn_72_0 = null;
        vh stackIn_73_0 = null;
        vh stackIn_74_0 = null;
        vh stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        vh stackOut_34_0 = null;
        vh stackOut_36_0 = null;
        String stackOut_36_1 = null;
        vh stackOut_35_0 = null;
        String stackOut_35_1 = null;
        vh stackOut_37_0 = null;
        String[] stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        vh stackOut_39_0 = null;
        String[] stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        String stackOut_39_3 = null;
        vh stackOut_38_0 = null;
        String[] stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        String stackOut_38_3 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        vh stackOut_60_0 = null;
        vh stackOut_61_0 = null;
        vh stackOut_62_0 = null;
        vh stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        vh stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        vh stackOut_65_0 = null;
        vh stackOut_66_0 = null;
        vh stackOut_67_0 = null;
        vh stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        vh stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        vh stackOut_70_0 = null;
        vh stackOut_71_0 = null;
        vh stackOut_72_0 = null;
        vh stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        vh stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        var12 = Pool.field_O;
        try {
          L0: {
            L1: {
              fr.a((byte) -100, uf.field_z);
              if (null != tp.field_e) {
                L2: {
                  L3: {
                    var4_ref = kc.field_b;
                    kc.field_b.field_Db = 0;
                    var4_ref.field_gb = 0;
                    var5 = d.field_c;
                    d.field_c.field_Db = 0;
                    var5.field_gb = 0;
                    gi.field_o.field_Db = 0;
                    var6 = gi.field_o;
                    var6.field_gb = 0;
                    ii.field_e.field_nb = of.field_Ub.toUpperCase();
                    var7 = (uq.field_f.field_gb + 2) / 2;
                    gi.field_o.b(uq.field_f.field_Db - 40, 2147483647, 0, var7 + -2, 40);
                    d.field_c.b(-40 + uq.field_f.field_Db, 2147483647, var7, -var7 + uq.field_f.field_gb, 40);
                    if (dg.field_T.length != 1) {
                      break L3;
                    } else {
                      if (dg.field_T[0] == 2) {
                        var8 = 0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (dg.field_T.length <= var10) {
                        break L5;
                      } else {
                        L6: {
                          if (0 == (md.field_c[var10 / 8] & 1 << (var10 & 7))) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L6;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int != 0) {
                            var9_int++;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (2 == dg.field_T[var10]) {
                              break L8;
                            } else {
                              var8 = 1;
                              break L5;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (var9_int != 0) {
                      break L2;
                    } else {
                      var8 = 1;
                      break L2;
                    }
                  }
                }
                d.field_c.field_pb = true;
                if (!kh.field_Ac) {
                  L9: {
                    stackOut_34_0 = d.field_c;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (var8 != 0) {
                      stackOut_36_0 = (vh) (Object) stackIn_36_0;
                      stackOut_36_1 = hq.field_o;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L9;
                    } else {
                      stackOut_35_0 = (vh) (Object) stackIn_35_0;
                      stackOut_35_1 = fo.field_d;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_37_0.field_nb = ((String) (Object) stackIn_37_1).toUpperCase();
                    stackOut_37_0 = v.field_j;
                    stackOut_37_1 = new String[]{d.field_c.field_nb};
                    stackOut_37_2 = -1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    stackIn_38_2 = stackOut_37_2;
                    if (var8 != 0) {
                      stackOut_39_0 = (vh) (Object) stackIn_39_0;
                      stackOut_39_1 = (String[]) (Object) stackIn_39_1;
                      stackOut_39_2 = stackIn_39_2;
                      stackOut_39_3 = n.field_Y;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      stackIn_40_3 = stackOut_39_3;
                      break L10;
                    } else {
                      stackOut_38_0 = (vh) (Object) stackIn_38_0;
                      stackOut_38_1 = (String[]) (Object) stackIn_38_1;
                      stackOut_38_2 = stackIn_38_2;
                      stackOut_38_3 = bk.field_x;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      stackIn_40_3 = stackOut_38_3;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_40_0.field_nb = nr.a(stackIn_40_1, stackIn_40_2, stackIn_40_3);
                    gi.field_o.field_nb = la.field_g;
                    ok.field_ob.field_pb = true;
                    qk.field_b = true;
                    if (we.field_m == null) {
                      break L11;
                    } else {
                      L12: {
                        if (null != dk.field_j) {
                          break L12;
                        } else {
                          gf.field_b = new boolean[dr.field_c];
                          dk.field_j = new byte[dr.field_c];
                          break L12;
                        }
                      }
                      qk.field_b = false;
                      ln.field_p = false;
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (dr.field_c <= var13) {
                          sh.a(0, dr.field_c, -1, false, tp.field_e, -1, -1, true);
                          if (2 > hq.field_i) {
                            break L11;
                          } else {
                            if (!vj.field_c[12]) {
                              break L11;
                            } else {
                              qk.field_b = true;
                              break L11;
                            }
                          }
                        } else {
                          gf.field_b[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    }
                  }
                  if (qk.field_b) {
                    break L1;
                  } else {
                    d.field_c.field_pb = false;
                    if (!d.field_c.field_db) {
                      break L1;
                    } else {
                      L14: {
                        var9 = null;
                        if (ln.field_p) {
                          var9 = (Object) (Object) ("<col=A00000>" + ab.field_h + "</col>");
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= dr.field_c) {
                          kk.field_B = "<col=A00000>" + wc.field_a + "<br>" + m.field_b + (String) var9;
                          break L1;
                        } else {
                          L16: {
                            if (!gf.field_b[var10]) {
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                } else {
                  L17: {
                    ok.field_ob.field_pb = false;
                    v.field_j.field_nb = hl.field_c;
                    if (var8 != 0) {
                      stackOut_24_0 = vi.field_a;
                      stackIn_25_0 = stackOut_24_0;
                      break L17;
                    } else {
                      stackOut_23_0 = or.field_j;
                      stackIn_25_0 = stackOut_23_0;
                      break L17;
                    }
                  }
                  L18: {
                    var14 = stackIn_25_0;
                    var9 = (Object) (Object) var14;
                    var9 = (Object) (Object) var14;
                    var9 = (Object) (Object) var14;
                    var10 = gi.field_o.field_I.b(var14) - -(3 * gi.field_o.field_I.a('.'));
                    if ((48 & va.field_V) != 16) {
                      break L18;
                    } else {
                      var9 = (Object) (Object) (var14 + ".");
                      break L18;
                    }
                  }
                  L19: {
                    gi.field_o.field_Fb = 0;
                    gi.field_o.field_tb = (gi.field_o.field_gb - var10) / 2;
                    if ((48 & va.field_V) == 32) {
                      var9 = (Object) (Object) ((String) var9 + "..");
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if ((48 & va.field_V) == 48) {
                      var9 = (Object) (Object) ((String) var9 + "...");
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  gi.field_o.field_nb = (String) var9;
                  d.field_c.field_nb = be.field_K.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackOut_60_0 = so.field_k;
                stackIn_64_0 = stackOut_60_0;
                stackIn_61_0 = stackOut_60_0;
                if (!param2) {
                  break L22;
                } else {
                  stackOut_61_0 = (vh) (Object) stackIn_61_0;
                  stackIn_64_0 = stackOut_61_0;
                  stackIn_62_0 = stackOut_61_0;
                  if (param0) {
                    break L22;
                  } else {
                    stackOut_62_0 = (vh) (Object) stackIn_62_0;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_63_0 = stackOut_62_0;
                    if (nr.field_bb) {
                      break L22;
                    } else {
                      stackOut_63_0 = (vh) (Object) stackIn_63_0;
                      stackOut_63_1 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      break L21;
                    }
                  }
                }
              }
              stackOut_64_0 = (vh) (Object) stackIn_64_0;
              stackOut_64_1 = 0;
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              break L21;
            }
            L23: {
              L24: {
                ((vh) (Object) stackIn_65_0).a(stackIn_65_1 != 0, false);
                stackOut_65_0 = uq.field_f;
                stackIn_69_0 = stackOut_65_0;
                stackIn_66_0 = stackOut_65_0;
                if (!param2) {
                  break L24;
                } else {
                  stackOut_66_0 = (vh) (Object) stackIn_66_0;
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_67_0 = stackOut_66_0;
                  if (param0) {
                    break L24;
                  } else {
                    stackOut_67_0 = (vh) (Object) stackIn_67_0;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_68_0 = stackOut_67_0;
                    if (nr.field_bb) {
                      break L24;
                    } else {
                      stackOut_68_0 = (vh) (Object) stackIn_68_0;
                      stackOut_68_1 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      break L23;
                    }
                  }
                }
              }
              stackOut_69_0 = (vh) (Object) stackIn_69_0;
              stackOut_69_1 = 0;
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              break L23;
            }
            L25: {
              L26: {
                ((vh) (Object) stackIn_70_0).a(stackIn_70_1 != 0, false);
                stackOut_70_0 = de.field_b;
                stackIn_74_0 = stackOut_70_0;
                stackIn_71_0 = stackOut_70_0;
                if (!param2) {
                  break L26;
                } else {
                  stackOut_71_0 = (vh) (Object) stackIn_71_0;
                  stackIn_74_0 = stackOut_71_0;
                  stackIn_72_0 = stackOut_71_0;
                  if (param0) {
                    break L26;
                  } else {
                    stackOut_72_0 = (vh) (Object) stackIn_72_0;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_73_0 = stackOut_72_0;
                    if (!nr.field_bb) {
                      break L26;
                    } else {
                      stackOut_73_0 = (vh) (Object) stackIn_73_0;
                      stackOut_73_1 = 1;
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      break L25;
                    }
                  }
                }
              }
              stackOut_74_0 = (vh) (Object) stackIn_74_0;
              stackOut_74_1 = 0;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              break L25;
            }
            L27: {
              ((vh) (Object) stackIn_75_0).a(stackIn_75_1 != 0, false);
              na.field_e.field_i.c(true);
              var4_int = -1;
              if (null == tp.field_e) {
                break L27;
              } else {
                L28: {
                  if (ok.field_ob.field_R != 0) {
                    int discarded$4 = -29;
                    int discarded$5 = 11;
                    te.b();
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (0 != d.field_c.field_R) {
                    if (kh.field_Ac) {
                      int discarded$6 = 11;
                      int discarded$7 = -118;
                      me.b();
                      break L29;
                    } else {
                      qd.a((byte) 81, 11);
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
                tl.a(11, tp.field_e, 0, true);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "wk.D(" + param0 + ',' + 11 + ',' + param2 + ',' + 112 + ')');
        }
    }

    final static boolean a(eo param0, eo param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_Mb + -param1.field_Mb;
              if (param0.field_Wb != cm.field_J) {
                if (null == param0.field_Wb) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (param1.field_Wb == cm.field_J) {
                var3_int += 200;
                break L2;
              } else {
                if (param1.field_Wb == null) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var3_int <= 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("wk.H(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 83 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void a(int param0, int param1, lr param2, int param3, lr param4, int param5, int param6, nm param7, int param8, int param9, nm param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, nm param18, int param19) {
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            ao.a((byte) -83, 480, param2, param4);
            kg.a(param12, true, param13, param5, param19);
            nj.a(240, 320, -128);
            int discarded$6 = 8;
            int discarded$7 = 8;
            mf.a((byte) -91, 2, param10, param7);
            ve.a(111, param15, param17, param18);
            int discarded$8 = 13421772;
            int discarded$9 = 4;
            int discarded$10 = 3;
            int discarded$11 = -96;
            ta.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("wk.C(").append(480).append(',').append(2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(8).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param5).append(',').append(13421772).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param7 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(240).append(',').append(320).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param10 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(3).append(',').append(param12).append(',').append(param13).append(',').append(8).append(',').append(param15).append(',').append(255).append(',').append(param17).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param18 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param19 + ',' + 4 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        int var5 = 0;
        if (!(((wk) this).field_S < param1)) {
            return;
        }
        fe[] var6 = new fe[param1];
        fe[] var7 = var6;
        fe[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((wk) this).field_S; var5++) {
            var6[var5] = ((wk) this).field_R[var5];
            var4[var5] = ((wk) this).field_U[var5];
        }
        ((wk) this).field_S = param1;
        ((wk) this).field_R = var7;
        ((wk) this).field_U = var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
