/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends rl {
    static String field_w;
    static String field_v;
    static String field_q;
    static int field_r;
    static kc[] field_s;
    static kc field_t;
    static ll field_y;
    private rn field_u;
    static String field_x;

    final eh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pd var4 = null;
        eh stackIn_5_0 = null;
        eh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        eh stackOut_4_0 = null;
        eh stackOut_8_0 = null;
        eh stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 85 % ((param1 - -50) / 36);
              if (!(this.field_u instanceof el)) {
                break L1;
              } else {
                var4 = ((el) ((Object) this.field_u)).a(0);
                if (var4 == null) {
                  break L1;
                } else {
                  if (var4.a(-88) != nn.field_s) {
                    stackOut_4_0 = ra.field_k;
                    stackIn_5_0 = stackOut_4_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0.equals(this.field_u.field_g)) {
                stackOut_8_0 = nn.field_s;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = ra.field_k;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("mn.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void d(byte param0) {
        field_w = null;
        field_t = null;
        int var1 = 20 % ((-64 - param0) / 51);
        field_x = null;
        field_q = null;
        field_v = null;
        field_y = null;
        field_s = null;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ec var9 = null;
        int var10 = 0;
        int stackIn_13_0 = 0;
        ec stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        ec stackOut_17_0 = null;
        ec stackOut_16_0 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = bj.field_tb + -bk.field_I;
              bk.field_I = af.field_Eb + -(var1_int >> 1064012897);
              qe.field_o = -(ih.field_b >> -471074783) + ub.field_g;
              bj.field_tb = bk.field_I - -var1_int;
              if (param0 == -1) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            var2 = qe.field_o;
            var3 = 0;
            L2: while (true) {
              if (var3 >= pm.field_f.length) {
                break L0;
              } else {
                L3: {
                  var4 = ln.field_M[var3];
                  if ((var4 ^ -1) <= -1) {
                    if (wl.field_S.field_h != var4) {
                      var5 = wm.field_I;
                      break L3;
                    } else {
                      var5 = pn.field_d;
                      break L3;
                    }
                  } else {
                    var5 = ql.field_a;
                    break L3;
                  }
                }
                L4: {
                  var6 = pm.field_f[var3];
                  if (0 > var4) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var7 = lc.a(stackIn_13_0 != 0, var6, (byte) -83);
                  var8 = af.field_Eb + -(var7 >> -1090047327);
                  if ((var4 ^ -1) <= -1) {
                    L6: {
                      var2 = var2 + ic.field_a;
                      if (wl.field_S.field_h != var4) {
                        stackOut_17_0 = kg.field_h;
                        stackIn_18_0 = stackOut_17_0;
                        break L6;
                      } else {
                        stackOut_16_0 = vf.field_s;
                        stackIn_18_0 = stackOut_16_0;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_18_0;
                      if (var9 == null) {
                        break L7;
                      } else {
                        var9.a(var8 - f.field_h, var2, param0 ^ 114, var7 + (f.field_h << -1690882271), tm.field_b - -(uk.field_d << -279471647));
                        break L7;
                      }
                    }
                    var2 = var2 + uk.field_d;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (0 <= var4) {
                    vd.field_c.a(var6, var8, mh.field_H + var2, var5, -1);
                    var2 = var2 + (ic.field_a + (uk.field_d - -tm.field_b));
                    break L8;
                  } else {
                    ob.field_T.a(var6, var8, var2 + lj.field_k, var5, -1);
                    var2 = var2 + u.field_l;
                    break L8;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "mn.D(" + param0 + ')');
        }
    }

    mn(rn param0, rn param1) {
        super(param0);
        try {
            this.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        String discarded$2 = null;
        pd var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_15_0 = null;
        String stackOut_11_0 = null;
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
              if (this.field_u instanceof el) {
                var3 = ((el) ((Object) this.field_u)).a(0);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a(-69) != nn.field_s) {
                      break L2;
                    } else {
                      if (!param0.equals(this.field_u.field_g)) {
                        stackOut_6_0 = lf.field_i;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = var3.c(26146);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            if (param0.equals(this.field_u.field_g)) {
              if (param1 >= -114) {
                var4 = (String) null;
                discarded$2 = this.a((String) null, (byte) -98);
                stackOut_15_0 = null;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_11_0 = lf.field_i;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("mn.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return (String) ((Object) stackIn_16_0);
            }
          }
        }
    }

    final static void e(int param0) {
        if (null != wd.field_a) {
            wn.field_D = wd.field_a;
            sa.field_Cb = lo.field_y;
            wn.field_D.field_J = -1;
            wd.field_a = null;
            lo.field_y = null;
            wn.field_D.field_eb = -1;
        }
        ck.field_d = null;
        tm.field_d = null;
        bi.field_U = null;
        if (param0 < 78) {
            mn.e(18);
        }
        ef.field_r = true;
        hf.field_f = null;
        ih.field_d = null;
    }

    final static void a(boolean param0, int param1) {
        to.a(param0, (byte) 124);
        uh.a(param0, 116);
        int var2 = -38 / ((28 - param1) / 55);
    }

    static {
        field_w = "Next";
        field_v = "Reading Book of Underdark";
        field_q = "Bolts:";
        field_x = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
