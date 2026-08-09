/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ia {
    static wk[] field_s;
    static int[] field_u;
    static String field_q;
    static String field_t;
    static int[] field_o;
    static int field_n;
    static String field_r;
    static wk[] field_p;

    final static boolean b(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 29974) {
                break L1;
              } else {
                field_n = -3;
                break L1;
              }
            }
            var2_int = param0.charAt(0);
            var3 = 1;
            L2: while (true) {
              if (param0.length() <= var3) {
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(var3) != var2_int) {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("eb.E(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void c(int param0) {
        field_u = null;
        field_t = null;
        if (param0 <= 14) {
          field_s = (wk[]) null;
          field_r = null;
          field_q = null;
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_r = null;
          field_q = null;
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    final vd a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        vd stackIn_3_0 = null;
        vd stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!fg.a(var4, -71)) {
              stackIn_3_0 = fa.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -1) {
                  break L1;
                } else {
                  field_s = (wk[]) null;
                  break L1;
                }
              }
              L2: {
                var5 = (CharSequence) ((Object) param0);
                var3_int = dj.a(var5, -124);
                if (0 >= var3_int) {
                  break L2;
                } else {
                  if (-131 > (var3_int ^ -1)) {
                    break L2;
                  } else {
                    return vf.field_b;
                  }
                }
              }
              stackIn_10_0 = fa.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("eb.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, -1) == fa.field_d) {
              stackIn_3_0 = vn.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 100) {
                field_u = (int[]) null;
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("eb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (String) ((Object) stackIn_7_0);
        }
    }

    final static void a(int param0, gh param1, gh param2, gh param3, gh param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (tj.field_f != null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                jn.field_g = false;
                if (!fj.field_e) {
                  if (!uc.field_g) {
                    var5 = sg.field_h;
                    break L1;
                  } else {
                    var5 = al.field_b;
                    break L1;
                  }
                } else {
                  var5 = hk.field_Kc;
                  break L1;
                }
              }
              var7 = (String) null;
              qb.a(-104, v.field_e, var5, 0, (String) null);
              vd.field_d.field_rb = ((td.field_ic.field_rb & 16711422) >> 128478081) + (v.field_e - ((16711422 & v.field_e) >> -1260345023));
              vd.field_d.field_xb = (8355711 & td.field_ic.field_xb >> -1796357951) + -((16711422 & v.field_e) >> -99130879) + v.field_e;
              sb.field_ab = wh.field_e;
              tj.field_f = vd.field_d;
              vd.field_d.field_Mb = (td.field_ic.field_Mb >> 1271937665 & 8355711) + -((16711422 & v.field_e) >> -1166514047) + v.field_e;
              hh.field_a = new gh(0L, param2);
              cc.field_bc = new gh(0L, param4);
              in.field_d = new gh(0L, (gh) null);
              te.field_f = new gh(0L, param1);
              vd.field_d = new gh((long)param0, param3);
              vd.field_d.field_L = pl.field_X;
              te.field_f.a(vd.field_d, 122);
              wh.field_e = new gh(0L, sb.field_ab);
              te.field_f.a(wh.field_e, 125);
              vc.field_f = new gh(0L, td.field_ic, re.field_cb);
              qa.field_N = new gh(0L, td.field_ic);
              hh.field_a.a(cc.field_bc, 124);
              hh.field_a.a(in.field_d, 127);
              in.field_d.a(te.field_f, 122);
              in.field_d.a(vc.field_f, 119);
              in.field_d.a(qa.field_N, 121);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("eb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static na a(byte param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        kj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        kj var8 = null;
        ao var9 = null;
        L0: {
          var7 = SteelSentinels.field_G;
          var8 = rf.field_d;
          var2 = var8;
          var3 = var8.f((byte) -87);
          m.field_a = var3 & 127;
          if (0 == (var3 & 128)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          oh.field_e = stackIn_3_0 != 0;
          be.field_b = var8.f((byte) -121);
          ni.field_d = var8.g((byte) -116);
          if (m.field_a != 2) {
            dk.field_a = 0;
            t.field_k = 0;
            break L1;
          } else {
            dk.field_a = var8.c((byte) -60);
            t.field_k = var8.a(false);
            break L1;
          }
        }
        L2: {
          if (-2 != (var8.f((byte) -77) ^ -1)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          b.field_g = var8.h(1);
          if (param0 < -50) {
            break L3;
          } else {
            field_s = (wk[]) null;
            break L3;
          }
        }
        L4: {
          if (var4 != 0) {
            jk.field_e = var8.h(1);
            break L4;
          } else {
            jk.field_e = b.field_g;
            break L4;
          }
        }
        L5: {
          if (-2 == (m.field_a ^ -1)) {
            gd.field_lb = var8.c((byte) -60);
            uj.field_a = var8.h(1);
            break L5;
          } else {
            if (m.field_a == 4) {
              gd.field_lb = var8.c((byte) -60);
              uj.field_a = var8.h(1);
              break L5;
            } else {
              uj.field_a = null;
              gd.field_lb = 0;
              break L5;
            }
          }
        }
        if (param1) {
          var5 = var8.c((byte) -60);
          try {
            L6: {
              L7: {
                var9 = jl.field_w.a(var5, -81);
                bg.field_F = var9.i(1);
                if (jk.field_e.equals(g.field_l)) {
                  stackIn_25_0 = null;
                  break L7;
                } else {
                  stackIn_25_0 = var9.field_F;
                  break L7;
                }
              }
              bc.field_ob = stackIn_25_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            sj.a("CC1", -66, (Throwable) ((Object) var6));
            bg.field_F = null;
            bc.field_ob = null;
            return new na(param1);
          }
          return new na(param1);
        } else {
          bg.field_F = cd.a(var8, 80, (byte) -100);
          bc.field_ob = null;
          return new na(param1);
        }
    }

    eb(jf param0) {
        super(param0);
    }

    static {
        field_q = "Loading...";
        field_o = new int[]{55, 53, 24, 24, 24, 24, 54, 83, 24, 24, 56, 83, 24, 24, 83, 24, 24, 97, 35, -1, -1, -1, -1, -1, -1, -1};
        field_t = "PER MONTH";
        field_r = "You are on <%0>";
    }
}
