/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends jf implements qn {
    static wk field_wb;
    private tl field_zb;
    static wk field_sb;
    static String field_mb;
    static int[] field_ob;
    static wk field_ub;
    private int field_tb;
    static wk field_qb;
    static String field_xb;
    static byte[][] field_vb;
    static wk field_pb;
    static String field_yb;
    static wk[] field_rb;
    static String field_nb;

    final static void a(String param0, ee param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String[] var4 = null;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (ed.field_j == -2) {
              return;
            } else {
              L1: {
                var3_int = sn.field_j.field_zb - 20 + -pl.field_X.c("[" + db.a(pd.field_ab, -49, new String[2]));
                if (var3_int >= pl.field_X.c(param0)) {
                  sj.a(param1.field_bb[0], param0, 0, (byte) 21, (String) null, 1);
                  ln.field_e = ln.field_e - 1;
                  break L1;
                } else {
                  var4 = ao.a(pl.field_X, new int[1], 18985, param0);
                  var5 = var4;
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var5.length) {
                      break L1;
                    } else {
                      var7 = var5[var6];
                      sj.a(param1.field_bb[0], var7, 0, (byte) 21, (String) null, 1);
                      ln.field_e = ln.field_e - 1;
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("bc.Q(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 100 + 41);
        }
    }

    final static void a(boolean param0, int param1, boolean param2, me param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              dj.field_k[0] = rb.field_g.nextInt();
              dj.field_k[1] = rb.field_g.nextInt();
              ne.field_y.field_p = 0;
              dj.field_k[2] = (int)(oa.field_G >> 32);
              dj.field_k[3] = (int)oa.field_G;
              ne.field_y.b(true, dj.field_k[0]);
              ne.field_y.b(true, dj.field_k[1]);
              ne.field_y.b(true, dj.field_k[2]);
              ne.field_y.b(true, dj.field_k[3]);
              jk.a(125, ne.field_y);
              ne.field_y.d(param4, 18);
              param3.a(ne.field_y, false);
              mm.field_g.field_p = 0;
              if (!param0) {
                mm.field_g.a((byte) 126, 16);
                break L1;
              } else {
                mm.field_g.a((byte) 120, 18);
                break L1;
              }
            }
            L2: {
              mm.field_g.field_p = mm.field_g.field_p + 2;
              var5_int = mm.field_g.field_p;
              mm.field_g.b(true, kk.field_d);
              mm.field_g.b(-28875, og.field_b);
              var6 = 0;
              if (!ki.field_ib) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (cd.field_a) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (on.field_k == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              mm.field_g.a((byte) 124, var6);
              int discarded$2 = -21;
              var7 = gh.a(-84, wl.d());
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              mm.field_g.a(var7, -67);
              if (null != on.field_k) {
                mm.field_g.a(13588, on.field_k);
                break L7;
              } else {
                break L7;
              }
            }
            int discarded$3 = 5;
            qi.a(jd.field_ib, ne.field_y, (gi) (Object) mm.field_g, qe.field_d);
            mm.field_g.c(30, -var5_int + mm.field_g.field_p);
            gj.a(0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("bc.CA(").append(param0).append(44).append(2).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            cj.a(param0, k.field_Lb, (byte) 125, kc.field_z, 0, true, nj.field_S);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= kc.field_z) {
                L2: {
                  cj.a(param0 + param0, mj.field_cc, (byte) 125, kc.field_z - -param0, param0, false, ti.field_w);
                  if (param0 >= kc.field_z) {
                    break L2;
                  } else {
                    kc.field_z = param0;
                    break L2;
                  }
                }
                break L0;
              } else {
                un.field_j[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "bc.C(" + param0 + 44 + 98 + 41);
        }
    }

    final static void a(long param0, String param1) {
        CharSequence var5 = null;
        try {
            ib.field_b = 2;
            en.field_e = param1;
            var5 = (CharSequence) (Object) param1;
            bk.field_U = ui.a(1, var5);
            jn.field_g = true;
            ti.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "bc.BA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk param4) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            param2 = param2 & 255;
            param1 = param1 & 255;
            var7_int = param4.field_z;
            var8 = param3 * var7_int;
            var11 = param3;
            L1: while (true) {
              if (var11 >= param0) {
                break L0;
              } else {
                var9 = ((-var11 + param0) * param1 + (var11 - param3) * param2) / (param0 + -param3);
                var9 = var9 * 65793;
                var10 = 0;
                L2: while (true) {
                  if (var7_int <= var10) {
                    var8 = var8 + var7_int;
                    var11++;
                    continue L1;
                  } else {
                    L3: {
                      if (param4.field_E[var10 + var8] == 16711680) {
                        param4.field_E[var10 + var8] = var9;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("bc.DA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 16711680 + 44 + 255 + 41);
        }
    }

    final void a(boolean param0, tl param1) {
        if (!param0) {
            return;
        }
        try {
            ((bc) this).field_zb = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "bc.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void k(int param0) {
        super.k(-118);
        int var2 = -88 / ((param0 - -37) / 43);
        if (((bc) this).field_zb != null) {
            ((bc) this).field_zb.a(-17382);
        }
    }

    public final tl a(boolean param0) {
        if (param0) {
            return null;
        }
        return ((bc) this).field_zb;
    }

    public static void i() {
        field_wb = null;
        field_qb = null;
        field_vb = null;
        field_ob = null;
        field_nb = null;
        field_xb = null;
        field_mb = null;
        field_rb = null;
        field_sb = null;
        field_yb = null;
        field_pb = null;
        field_ub = null;
    }

    bc(String param0, tn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, lh param2, int param3) {
        try {
            super.a(param0, 112, param2, param3);
            if (param1 < 56) {
                field_wb = null;
            }
            ((bc) this).field_tb = oh.field_f - (((bc) this).field_o + param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "bc.H(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final String e(int param0) {
        if (!((bc) this).field_C) {
            return null;
        }
        if (null == ((bc) this).field_v) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        hk.a(pi.field_c, oh.field_f + ((bc) this).field_x + -((bc) this).field_tb, 17237);
        return ((bc) this).field_v;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = "Error connecting to server. Please try using a different server.";
        field_vb = new byte[50][];
        field_xb = "Who can join";
        field_yb = "To disable this control, click on <col=1f76a6><%0></col> in the options menu.";
        field_nb = "Empty slot";
    }
}
