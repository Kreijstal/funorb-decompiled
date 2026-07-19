/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_a;
    private vr field_c;
    private vr field_f;
    private pha field_g;
    static String[] field_d;
    static sna field_b;
    static ht field_e;

    final jc a(byte param0, int param1) {
        byte[] var4 = null;
        jc var3 = (jc) (this.field_g.a(-100, (long)param1));
        if (var3 != null) {
            return var3;
        }
        int var5 = -115 % ((-69 - param0) / 38);
        if (-32769 >= (param1 ^ -1)) {
            var4 = this.field_f.b(88, 0, param1 & 32767);
        } else {
            var4 = this.field_c.b(121, 0, param1);
        }
        var3 = new jc();
        if (var4 != null) {
            var3.a(new lu(var4), false);
        }
        if (!(-32769 < (param1 ^ -1))) {
            var3.d((byte) -25);
        }
        this.field_g.a((long)param1, 1, var3);
        return var3;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -122) {
            ht var2 = (ht) null;
            cc.a(-37, (String) null, 61, 62, -69, (ht) null, -47, 27, -18);
        }
        field_e = null;
        field_b = null;
        field_a = null;
    }

    cc(int param0, vr param1, vr param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_g = new pha(64);
        try {
          L0: {
            L1: {
              this.field_c = param1;
              this.field_f = param2;
              if (null == this.field_c) {
                break L1;
              } else {
                discarded$4 = this.field_c.d(0, 0);
                break L1;
              }
            }
            L2: {
              if (null == this.field_f) {
                break L2;
              } else {
                discarded$5 = this.field_f.d(0, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("cc.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ma param4, byte param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        ai var21_ref = null;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        ma var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_18_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ai stackIn_41_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        ai stackOut_40_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_18_0 = null;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var40 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var45 = param4;
              if (param5 < -64) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var45.field_d == null) {
                  break L3;
                } else {
                  if (-2 > (var45.field_n ^ -1)) {
                    var61 = var45.field_d;
                    dla.a(0, fg.field_a, 72, var61, 0);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ku.d(-372);
              break L2;
            }
            var55 = new int[param4.field_i];
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var65 = new int[param4.field_i];
            var63 = bv.field_G;
            var64 = fv.field_x;
            var62 = ep.field_l;
            var13 = 0;
            L4: while (true) {
              if (param4.field_i <= var13) {
                var44 = 0;
                var13 = var44;
                L5: while (true) {
                  if (var44 >= lq.field_y) {
                    break L0;
                  } else {
                    L6: {
                      var14 = ci.field_q[var44];
                      var15 = param4.field_C[var14];
                      var16 = param4.field_h[var14];
                      var17 = param4.field_t[var14];
                      if (param4.field_F[var14] < bv.field_G.length) {
                        stackOut_26_0 = param4.field_F[var14];
                        stackIn_27_0 = stackOut_26_0;
                        break L6;
                      } else {
                        stackOut_25_0 = -1;
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (bv.field_G.length > param4.field_c[var14]) {
                        stackOut_29_0 = param4.field_c[var14];
                        stackIn_30_0 = stackOut_29_0;
                        break L7;
                      } else {
                        stackOut_28_0 = -1;
                        stackIn_30_0 = stackOut_28_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (bv.field_G.length > param4.field_e[var14]) {
                        stackOut_32_0 = param4.field_e[var14];
                        stackIn_33_0 = stackOut_32_0;
                        break L8;
                      } else {
                        stackOut_31_0 = -1;
                        stackIn_33_0 = stackOut_31_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_33_0;
                        if (null == ld.field_o) {
                          break L10;
                        } else {
                          if (param4.field_w == null) {
                            break L10;
                          } else {
                            if (var14 >= param4.field_w.length) {
                              break L10;
                            } else {
                              if ((param4.field_w[var14] ^ -1) == 0) {
                                break L10;
                              } else {
                                if (param4.field_w[var14] < ld.field_o.length) {
                                  stackOut_40_0 = ld.field_o[param4.field_w[var14]];
                                  stackIn_41_0 = stackOut_40_0;
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_41_0 = (ai) ((Object) stackOut_39_0);
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_41_0;
                        var22 = du.field_e[var15];
                        var23 = ew.field_s[var15];
                        var24 = du.field_e[var16];
                        var25 = ew.field_s[var16];
                        var26 = du.field_e[var17];
                        var27 = ew.field_s[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 != var20) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var55[var18];
                              var29 = var65[var18];
                              if (var21_ref != null) {
                                stackOut_45_0 = var21_ref.field_b;
                                stackIn_46_0 = stackOut_45_0;
                                break L13;
                              } else {
                                stackOut_44_0 = 8355711;
                                stackIn_46_0 = stackOut_44_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_46_0;
                            var31 = 16711935 & var30;
                            var32 = var30 & 65280;
                            var33 = -369164033 & var28 * var31 >>> -1324768600 | (var28 * var32 & 16711854) >>> 1195922984;
                            var33 = var33 + 65793 * var29;
                            el.a(29322, var24, var25, (16711422 & var33) >> -1301096703, var23, var22, var26, var27);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var55[var18];
                        var29 = var55[var19];
                        var30 = var55[var20];
                        var31 = var65[var18];
                        var32 = var65[var19];
                        var33 = var65[var20];
                        if (var21_ref != null) {
                          stackOut_49_0 = var21_ref.field_b;
                          stackIn_50_0 = stackOut_49_0;
                          break L14;
                        } else {
                          stackOut_48_0 = 8355711;
                          stackIn_50_0 = stackOut_48_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_50_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = (var28 * var36 & 16711814) >>> 1124180776 | -218169089 & var28 * var35 >>> 387624840;
                      var38 = 134152447 & var35 * var29 >>> -1757597400 | -234815744 & var36 * var29 >>> 88594792;
                      var39 = var36 * var30 >>> 1864588712 & 922812160 | (-16711745 & var35 * var30) >>> 1632188712;
                      var38 = var38 + 65793 * var32;
                      var37 = var37 + 65793 * var31;
                      var39 = var39 + 65793 * var33;
                      ba.a(var26, var23, var39 >> 33737584, var38 >> -889112848, var37 >> -1860442032, var38 & 255, (var38 & 65511) >> -1456477592, var25, var37 >> 2040514952 & 255, var39 & 255, var37 & 255, var27, var24, var22, (byte) 50, (65416 & var39) >> -31955448);
                      break L11;
                    }
                    var44++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var62[var13] * param1 + (var63[var13] * param0 - -(param3 * var64[var13])) >> 1006539880;
                  if ((var14 ^ -1) > -1) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var14 >= 0) {
                    if (128 <= var14) {
                      stackOut_17_0 = 256;
                      stackIn_18_0 = stackOut_17_0;
                      break L16;
                    } else {
                      stackOut_16_0 = var14 + 128;
                      stackIn_18_0 = stackOut_16_0;
                      break L16;
                    }
                  } else {
                    stackOut_14_0 = 128;
                    stackIn_18_0 = stackOut_14_0;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_18_0;
                  var15 = param7 * var63[var13] - (-(param2 * var64[var13]) + -(param6 * var62[var13])) >> -1727958744;
                  stackOut_18_0 = qk.field_m;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (var15 >= 0) {
                    stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                    stackOut_20_1 = var15;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L17;
                  } else {
                    stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                    stackOut_19_1 = -var15;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = var14 * (-var15 + 256) >>> 843818664;
                var55[var13] = var14;
                var65[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var8);
            stackOut_53_1 = new StringBuilder().append("cc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param4 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L18;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L18;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, ht param5, int param6, int param7, int param8) {
        nj.field_f = param4;
        pw.field_A = param1;
        ro.field_j = param0;
        if (param2 != -1456477592) {
            return;
        }
        try {
            ma.field_E = param6;
            mh.field_l = param5;
            bd.field_m = param8;
            uea.field_i = param7;
            gp.field_x = param3;
            aka.field_G = (vm) ((Object) new cl());
            oea.field_q = new ea(param5);
            ga.field_c = new kb(aka.field_G, oea.field_q);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_a = "Decline invitation to <%0>'s game";
    }
}
