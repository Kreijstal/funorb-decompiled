/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends qv {
    static byte[] field_u;
    private hf[] field_w;
    static r field_t;
    private hf field_x;
    static sj field_y;
    static String field_r;
    static int field_v;
    static hd field_s;

    final hf a(int param0, int param1) {
        if (param1 != -12085) {
            return (hf) null;
        }
        hf dupTemp$0 = new hf();
        this.field_w[param0] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(id param0, boolean param1, int param2) {
        hf dupTemp$17 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        hf var5 = null;
        hf var6 = null;
        int var7 = 0;
        fd var8 = null;
        hf stackIn_6_0 = null;
        hf stackIn_7_0 = null;
        hf stackIn_8_0 = null;
        hf stackIn_8_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_5_0 = null;
        hf stackOut_7_0 = null;
        hf stackOut_7_1 = null;
        hf stackOut_6_0 = null;
        hf stackOut_6_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -112);
              if (!param1) {
                dv.a(this.field_w, 0, param0.field_w, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_w[var4_int];
                      if (var5 == null) {
                        param0.field_w[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_w[var4_int];
                          stackOut_5_0 = (hf) (var5);
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (var6 == null) {
                            dupTemp$17 = new hf();
                            param0.field_w[var4_int] = dupTemp$17;
                            stackOut_7_0 = (hf) ((Object) stackIn_7_0);
                            stackOut_7_1 = (hf) (dupTemp$17);
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            break L4;
                          } else {
                            stackOut_6_0 = (hf) ((Object) stackIn_6_0);
                            stackOut_6_1 = (hf) (var6);
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            break L4;
                          }
                        }
                        ((hf) (Object) stackIn_8_0).a(stackIn_8_1, -2147483648);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            L5: {
              if (param2 < -97) {
                break L5;
              } else {
                var8 = (fd) null;
                this.a(-126, true, -77, (fd) null, 67);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("id.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
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
            if (ws.a(param2, (byte) 121)) {
              if (param1 == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = param1.length();
                if (var3_int < 12) {
                  if (!ca.a(param0, param2)) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (-1 == (var3_int ^ -1)) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("id.G(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L1;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    final void a(ut[] param0, int param1) {
        hf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        hf var5 = null;
        int var6 = 0;
        hf[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -23952) {
                break L1;
              } else {
                field_u = (byte[]) null;
                break L1;
              }
            }
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_g = param0;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("id.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static void a(sj param0, sj param1, boolean param2, sj param3) {
        kg discarded$2 = null;
        boolean discarded$3 = false;
        RuntimeException var4 = null;
        kg[] var5 = null;
        kg[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        kg[] var10 = null;
        ut var11 = null;
        int var11_int = 0;
        ut var12 = null;
        int var13 = 0;
        kg[] var14 = null;
        ut var15 = null;
        int[][] var16 = null;
        ut var17 = null;
        ut var18 = null;
        int[][] var19 = null;
        sj stackIn_2_0 = null;
        String stackIn_2_1 = null;
        sj stackIn_3_0 = null;
        String stackIn_3_1 = null;
        sj stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_1_0 = null;
        String stackOut_1_1 = null;
        sj stackOut_3_0 = null;
        String stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        sj stackOut_2_0 = null;
        String stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              sk.field_a = se.a(param3, -9, "commonui", "frame_top");
              vb.field_a = se.a(param3, -120, "commonui", "frame_bottom");
              aa.field_f = wa.a((byte) 112, "commonui", param3, "jagex_logo_grey");
              nw.field_a = se.a(param3, -29, "commonui", "button");
              jc.field_g = ng.a("validation", "commonui", 2, param3);
              qo.field_k = (hu) ((Object) gm.a(param1, 10, "arezzo12", param3, "commonui"));
              gf.field_a = (hu) ((Object) gm.a(param1, 10, "arezzo14", param3, "commonui"));
              fj.field_b = (hu) ((Object) gm.a(param1, 10, "arezzo14bold", param3, "commonui"));
              var17 = new ut(param0.a("", "button.gif", 34), (java.awt.Component) ((Object) ic.field_d));
              stackOut_1_0 = (sj) (param3);
              stackOut_1_1 = "commonui";
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (param2) {
                stackOut_3_0 = (sj) ((Object) stackIn_3_0);
                stackOut_3_1 = (String) ((Object) stackIn_3_1);
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (sj) ((Object) stackIn_2_0);
                stackOut_2_1 = (String) ((Object) stackIn_2_1);
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            discarded$2 = fw.a(stackIn_4_0, stackIn_4_1, stackIn_4_2 != 0, "dropdown");
            var5 = jo.a(param3, 17369, "commonui", "screen_options");
            dw.field_d = new kg[4];
            tj.field_f = new kg[4];
            kk.field_Q = new kg[4];
            var6 = new kg[][]{kk.field_Q, tj.field_f, dw.field_d};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L2: while (true) {
              if (var8 >= var19.length) {
                var8 = var5[0].field_m[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                var9 = 0;
                L3: while (true) {
                  if (-4 >= (var9 ^ -1)) {
                    L4: {
                      var9 = var17.field_w;
                      tr.d(-12974);
                      var17.e();
                      on.b(0, 0, on.field_g, on.field_f);
                      var15 = new ut(var9, var9);
                      var18 = var15;
                      var18.e();
                      var17.d(0, 0);
                      var11 = new ut(var9, var9);
                      var11.e();
                      var17.d(-var17.field_q + var9, 0);
                      var12 = new ut(-(2 * var9) + var17.field_q, var9);
                      var12.e();
                      var17.d(-var9, 0);
                      ta.e(119);
                      nw.field_a = new ut[]{var15, var12, var11};
                      if (!param2) {
                        break L4;
                      } else {
                        discarded$3 = id.a(false, (CharSequence) null, 'ﾺ');
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L5: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L3;
                      } else {
                        var14[var11_int] = ul.a(var5[var9], (byte) 100, var19[var11_int]);
                        var11_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) ((Object) var19[0].clone());
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("id.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        RuntimeException var6 = null;
        hf var7 = null;
        int var8 = 0;
        wi var10 = null;
        hf var11 = null;
        hf var12 = null;
        hf var13 = null;
        hf var14 = null;
        hf var15 = null;
        fd stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof wi) {
                stackOut_2_0 = (fd) (param3);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (fd) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var10 = (wi) ((Object) stackIn_3_0);
              pt.a(param3.field_t + (param4 - -param3.field_n), -22914, param3.field_t + param4, param3.field_i + (param2 + param3.field_g), param2 + param3.field_g);
              if (var10 == null) {
                break L2;
              } else {
                param1 = param1 & var10.field_y;
                break L2;
              }
            }
            L3: {
              var7 = this.field_w[0];
              this.field_x.a(-13136);
              var7.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
              if (var10 != null) {
                L4: {
                  if (!var10.field_A) {
                    break L4;
                  } else {
                    var11 = this.field_w[1];
                    if (var11 != null) {
                      var11.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var10.field_m) {
                  break L3;
                } else {
                  L5: {
                    var13 = this.field_w[3];
                    if (0 == var10.field_p) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var12 = this.field_w[2];
                  if (var12 == null) {
                    break L3;
                  } else {
                    var12.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              var8 = -44 / ((param0 - 59) / 53);
              if (!param3.b(15)) {
                break L6;
              } else {
                var14 = this.field_w[5];
                if (var14 != null) {
                  var14.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (!param1) {
                var15 = this.field_w[4];
                if (var15 == null) {
                  break L7;
                } else {
                  var15.a(param2, -2147483648, (id) (this), param3, param4, this.field_x);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            this.field_x.a(param3, (id) (this), param2, param4, 0);
            ta.e(127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var6);
            stackOut_28_1 = new StringBuilder().append("id.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param4 + ')');
        }
    }

    public id() {
        this.field_w = new hf[6];
        this.field_x = new hf();
        hf dupTemp$0 = new hf();
        this.field_w[0] = dupTemp$0;
        hf var1 = dupTemp$0;
        var1.a(-13136);
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_y = null;
        if (param0 > -99) {
            field_r = (String) null;
        }
        field_u = null;
        field_t = null;
    }

    id(id param0, boolean param1) {
        this();
        try {
            param0.a((id) (this), param1, -116);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ut param0, byte param1) {
        boolean discarded$2 = false;
        hf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        hf var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var3 = this.field_w;
              var4 = 0;
              if (param1 <= -86) {
                break L1;
              } else {
                discarded$2 = id.a(false, (CharSequence) null, 'ﾴ');
                break L1;
              }
            }
            L2: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var5.field_j = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("id.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, ut[] param1, int param2) {
        int var5 = 0;
        try {
            int var4_int = -99 / ((11 - param2) / 60);
            var5 = param0;
            if (!(this.field_w[var5] != null)) {
                this.field_w[var5] = new hf();
            }
            this.field_w[param0].field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "id.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_u = new byte[520];
        field_t = new r();
        field_r = "Your rating is <%0>";
    }
}
