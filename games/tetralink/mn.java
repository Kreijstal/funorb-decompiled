/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_f;
    static int field_c;
    static int field_e;
    static hl field_d;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        int var1 = -42 / ((param0 - 68) / 41);
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param1 != -1) {
            java.awt.Component var5 = (java.awt.Component) null;
            mn.a((java.awt.Component) null, true);
        }
        if (!(mm.field_y == null)) {
            var3 = mm.field_y.a(param0, false);
            if (var3 != -2) {
                if (!(var3 == -1)) {
                    var4 = mm.field_y.d((byte) 121) ? 1 : 0;
                    mk.a(-117, mm.field_y.e((byte) 26), var3, var4 != 0, mm.field_y.field_Ob, param2);
                }
                mm.field_y = null;
                gg.c((byte) 43);
            }
        }
    }

    final static nl[] a(ie param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        vl var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        nl[] stackIn_3_0 = null;
        nl[] stackIn_10_0 = null;
        nl[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nl[] stackOut_9_0 = null;
        nl[] stackOut_16_0 = null;
        nl[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (param0.a((byte) -84)) {
              var8 = param0.a(false);
              L1: while (true) {
                if (var8.field_d != 0) {
                  if (-3 == (var8.field_d ^ -1)) {
                    stackOut_9_0 = new nl[]{};
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var10 = (int[]) (var8.field_f);
                      var9 = var10;
                      var3 = var9;
                      var4 = new nl[var10.length >> 591991842];
                      if (param1 == 37956674) {
                        break L2;
                      } else {
                        mn.a(-102);
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_16_0 = (nl[]) (var4);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new nl();
                        var4[var5] = var6;
                        var6.field_k = var3[var5 << -1937277950];
                        var6.field_e = var3[(var5 << -1659244958) - -1];
                        var6.field_h = var3[(var5 << -1337960030) + 2];
                        var6.field_i = var3[(var5 << 37956674) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  tb.a(false, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new nl[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("mn.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            param0.removeKeyListener(vi.field_a);
            param0.removeFocusListener(vi.field_a);
            mh.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var6_int = 485 + param2 + 8 - (-2 - param1 - 8);
              ea.field_f.a((byte) -104, -6 + var6_int, 3, oj.field_a.field_R - 6, 3);
              var7 = -5 + ea.field_f.field_R;
              pj.field_d.a((byte) -109, param1 + param2 - -487, var7 + -param3, param3, 5);
              in.field_g.a((byte) -112, -param2 + (pj.field_d.field_Hb + -ba.field_L.field_Hb), 0, param3, param2);
              ba.field_L.a((byte) -96, ba.field_L.field_Hb, 0, param3, param2 + in.field_g.field_Hb);
              var7 = var7 - (2 + param3);
              id.field_M.a(485 + (param2 - (-2 + -param1)), param1, var7 - 5, true, 5, 5, 2);
              if (null == bk.field_e) {
                break L1;
              } else {
                bk.field_e.a(id.field_M.field_R, id.field_M.field_yb, -124, id.field_M.field_M, id.field_M.field_Hb);
                break L1;
              }
            }
            var8 = -var6_int + oj.field_a.field_Hb - param2;
            var9 = var8 / 2;
            var10 = param4 + var9 + param2;
            var11 = 0;
            if (param0 == -7) {
              var12 = 0;
              L2: while (true) {
                if (-7 >= (var12 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if (5 <= var12) {
                        break L4;
                      } else {
                        if (null == nj.field_f[var12]) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var13 = 3 + (2 + oj.field_a.field_R + -6) * var11 / (v.field_r - -1);
                    var11++;
                    var7 = (-6 + (oj.field_a.field_R - -2)) * var11 / (v.field_r + 1) + 3 + (-2 - var13);
                    if (var12 >= 5) {
                      nc.field_e.a((byte) -88, var8, var13, var7, var6_int);
                      break L3;
                    } else {
                      nj.field_f[var12].a((byte) -111, var8, var13, var7, var6_int);
                      el.field_oc[var12].a((byte) -103, -param2 + var9, 0, var7, param2);
                      fh.field_f[var12].a((byte) -93, param4, param5, -param5 + var7 + -param5, var9);
                      og.field_o[var12].a((byte) -108, -var10 + -param2 + var8, param5, var7 - param5 - param5, var10);
                      break L3;
                    }
                  }
                  var12++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var6), "mn.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_f = "Message lobby";
        field_e = 5;
        field_b = "The game options are not all set.";
    }
}
