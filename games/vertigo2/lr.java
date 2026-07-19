/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends d {
    static String field_L;
    static er field_O;
    static String field_I;
    static String field_K;
    static String field_J;
    static String field_S;
    static String field_N;
    private int field_Q;
    static aa field_H;
    static cr field_P;
    static String field_M;
    static String field_T;
    private of field_R;

    final void a(byte param0, int param1, int param2, iq param3) {
        try {
            if (param0 <= 6) {
                lr.a((byte) 76);
            }
            this.field_Q = this.field_Q + 1;
            super.a((byte) 114, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lr.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(boolean param0) {
        String discarded$2 = null;
        if (this.field_p) {
          return this.field_R.d(-27183);
        } else {
          if (!param0) {
            return null;
          } else {
            discarded$2 = this.a(true);
            return null;
          }
        }
    }

    public static void a(byte param0) {
        field_O = null;
        field_K = null;
        field_T = null;
        field_H = null;
        field_I = null;
        int var1 = 91 / ((param0 - 36) / 47);
        field_S = null;
        field_L = null;
        field_M = null;
        field_J = null;
        field_N = null;
        field_P = null;
    }

    final boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 116) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("lr.DA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        if (param0 > -18) {
            return;
        }
        try {
            ui.field_g = 2;
            ea.field_b = param1;
            var5 = (CharSequence) ((Object) param1);
            sm.field_Kb = rc.a(var5, 320);
            ie.field_Nb = param2;
            nb.h(-14829);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lr.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        ba var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        er var12 = null;
        er var13 = null;
        er var15 = null;
        er var16 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          var5 = this.field_o + param2 + (this.field_n >> -505238111);
          var6 = this.field_t + (param3 - -(this.field_s >> -94601535));
          var8 = this.field_R.a(-23996);
          if (tk.field_n != var8) {
            if (dj.field_c != var8) {
              if (ir.field_a != var8) {
                if (qm.field_G == var8) {
                  var12 = jn.field_b[1];
                  var12.d(var5 + -(var12.field_y >> -273556927), -(var12.field_t >> -1553433183) + var6, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var13 = jn.field_b[2];
                var13.d(var5 - (var13.field_y >> 2139508065), var6 - (var13.field_t >> 1039685793), 256);
                return;
              }
            } else {
              var16 = jn.field_b[0];
              var9 = var16.field_x << 1860540833;
              var10 = var16.field_B << -574518751;
              if (cr.field_E != null) {
                if (var9 <= cr.field_E.field_y) {
                  if (cr.field_E.field_t >= var10) {
                    lq.a(cr.field_E, (byte) -94);
                    bi.c();
                    var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -this.field_Q << 1570908298, 4096);
                    ln.d(-28558);
                    cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                    return;
                  } else {
                    cr.field_E = new er(var9, var10);
                    lq.a(cr.field_E, (byte) -94);
                    var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -this.field_Q << 1570908298, 4096);
                    ln.d(-28558);
                    cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                    return;
                  }
                } else {
                  cr.field_E = new er(var9, var10);
                  lq.a(cr.field_E, (byte) -94);
                  var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -this.field_Q << 1570908298, 4096);
                  ln.d(-28558);
                  cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                  return;
                }
              } else {
                cr.field_E = new er(var9, var10);
                lq.a(cr.field_E, (byte) -94);
                var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -this.field_Q << 1570908298, 4096);
                ln.d(-28558);
                cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                return;
              }
            }
          } else {
            var15 = jn.field_b[0];
            var9 = var15.field_x << 1860540833;
            var10 = var15.field_B << -574518751;
            if (cr.field_E != null) {
              if (var9 <= cr.field_E.field_y) {
                if (cr.field_E.field_t >= var10) {
                  lq.a(cr.field_E, (byte) -94);
                  bi.c();
                  var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -this.field_Q << 1570908298, 4096);
                  ln.d(-28558);
                  cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
                  return;
                } else {
                  cr.field_E = new er(var9, var10);
                  lq.a(cr.field_E, (byte) -94);
                  var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -this.field_Q << 1570908298, 4096);
                  ln.d(-28558);
                  cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
                  return;
                }
              } else {
                cr.field_E = new er(var9, var10);
                lq.a(cr.field_E, (byte) -94);
                var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -this.field_Q << 1570908298, 4096);
                ln.d(-28558);
                cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
                return;
              }
            } else {
              cr.field_E = new er(var9, var10);
              lq.a(cr.field_E, (byte) -94);
              var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -this.field_Q << 1570908298, 4096);
              ln.d(-28558);
              cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
              return;
            }
          }
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (param0 ^ -1)) {
                var10 = param2[param1];
                var4_ref = var10;
                if (var4_ref != null) {
                  stackOut_10_0 = var10.toString();
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param1 + param0;
                var5 = 0;
                var6_int = param1;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      var7 = param1;
                      if (param3 == 1039685793) {
                        break L2;
                      } else {
                        lr.a(-3, (String) null, 50L);
                        break L2;
                      }
                    }
                    L3: while (true) {
                      if (var4_int <= var7) {
                        stackOut_27_0 = var6.toString();
                        stackIn_28_0 = stackOut_27_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          var8 = param2[var7];
                          if (var8 != null) {
                            discarded$2 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$3 = var6.append("null");
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param2[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("lr.D(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_28_0;
            }
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        var35 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4 != param1) {
                  break L2;
                } else {
                  if (param5 != param6) {
                    break L2;
                  } else {
                    if (param0 != param9) {
                      break L2;
                    } else {
                      if (param7 != param3) {
                        break L2;
                      } else {
                        eh.a(param7, param9, (byte) -4, param5, param8, param1);
                        break L1;
                      }
                    }
                  }
                }
              }
              var10_int = param1;
              var11 = param5;
              var12 = 3 * param1;
              var13 = 3 * param5;
              var14 = 3 * param4;
              var15 = param6 * 3;
              var16 = param0 * 3;
              var17 = 3 * param3;
              var18 = param9 - var16 - -var14 - param1;
              var19 = -param5 + (var15 + -var17 + param7);
              var20 = -var14 + (var16 - (var14 + -var12));
              var21 = var13 + -var15 + (var17 + -var15);
              var22 = -var12 + var14;
              var23 = -var13 + var15;
              var24 = 128;
              L3: while (true) {
                if (var24 > 4096) {
                  break L1;
                } else {
                  var25 = var24 * var24 >> -671920692;
                  var26 = var25 * var24 >> 1678141868;
                  var27 = var18 * var26;
                  var28 = var19 * var26;
                  var29 = var20 * var25;
                  var30 = var25 * var21;
                  var31 = var24 * var22;
                  var32 = var23 * var24;
                  var33 = (var31 + var29 + var27 >> 1423347820) + param1;
                  var34 = (var28 + (var30 - -var32) >> 1023763308) + param5;
                  eh.a(var34, var33, (byte) -4, var11, param8, var10_int);
                  var11 = var34;
                  var10_int = var33;
                  var24 += 128;
                  continue L3;
                }
              }
            }
            if (param2 > 13) {
              break L0;
            } else {
              field_O = (er) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var10), "lr.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int e(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_22_0 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!gf.a(false)) {
                L2: {
                  ve.field_d.a((byte) -29, fk.b(gb.field_d, 1282642017, ed.field_n), fk.b(no.field_e, 1282642017, sd.field_N));
                  if (ve.field_d.a(84)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 > ve.field_d.field_c) {
                        break L4;
                      } else {
                        var3 = gi.field_n[ve.field_d.field_c];
                        if (-3 == (var3 ^ -1)) {
                          hd.a((byte) 47);
                          break L3;
                        } else {
                          if (-6 != (var3 ^ -1)) {
                            break L3;
                          } else {
                            hd.a((byte) 47);
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if ((da.field_j ^ -1) == -3) {
                      break L3;
                    } else {
                      hd.a((byte) 47);
                      break L3;
                    }
                  }
                }
                if (param0 <= -52) {
                  L5: {
                    if (-1 != (var3 ^ -1)) {
                      break L5;
                    } else {
                      if (2 != da.field_j) {
                        break L5;
                      } else {
                        var4 = -qe.field_cb + gk.a(52);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if ((var6 ^ -1) < -1) {
                          break L5;
                        } else {
                          var3 = 2;
                          bl.a(true, 5, -30962);
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_28_0 = var3;
                  stackIn_29_0 = stackOut_28_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L6: {
                  ve.field_d.d((byte) 81);
                  if (!ve.field_d.a(84)) {
                    break L6;
                  } else {
                    var1_int = 1;
                    break L6;
                  }
                }
                if ((de.field_f ^ -1) == -14) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "lr.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          return stackIn_29_0;
        }
    }

    lr(of param0) {
        try {
            this.field_R = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = "Searching for an opponent";
        field_K = "+<%0>";
        field_L = "Checking";
        field_I = "game complete";
        field_S = null;
        field_M = "Invalid password.";
        field_T = "NEXT LEVEL IN: <%0>";
        field_N = "Close";
    }
}
