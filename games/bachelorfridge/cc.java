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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = new pha(64);
        try {
          L0: {
            L1: {
              this.field_c = param1;
              this.field_f = param2;
              if (null == this.field_c) {
                break L1;
              } else {
                this.field_c.d(0, 0);
                break L1;
              }
            }
            L2: {
              if (null == this.field_f) {
                break L2;
              } else {
                this.field_f.d(0, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("cc.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ma param4, byte param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ai stackIn_41_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ai var21 = null;
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
        ma var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var44 = param4;
              if (param5 < -64) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var44.field_d == null) {
                  break L3;
                } else {
                  if (-2 > (var44.field_n ^ -1)) {
                    var60 = var44.field_d;
                    dla.a(0, fg.field_a, 72, var60, 0);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ku.d(-372);
              break L2;
            }
            var54 = new int[param4.field_i];
            var49 = var54;
            var41 = var49;
            var8 = var41;
            var64 = new int[param4.field_i];
            var62 = bv.field_G;
            var63 = fv.field_x;
            var61 = ep.field_l;
            var13 = 0;
            L4: while (true) {
              if (param4.field_i <= var13) {
                var13 = 0;
                L5: while (true) {
                  if (var13 >= lq.field_y) {
                    break L0;
                  } else {
                    L6: {
                      var14 = ci.field_q[var13];
                      var15 = param4.field_C[var14];
                      var16 = param4.field_h[var14];
                      var17 = param4.field_t[var14];
                      if (param4.field_F[var14] < bv.field_G.length) {
                        stackIn_27_0 = param4.field_F[var14];
                        break L6;
                      } else {
                        stackIn_27_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (bv.field_G.length > param4.field_c[var14]) {
                        stackIn_30_0 = param4.field_c[var14];
                        break L7;
                      } else {
                        stackIn_30_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (bv.field_G.length > param4.field_e[var14]) {
                        stackIn_33_0 = param4.field_e[var14];
                        break L8;
                      } else {
                        stackIn_33_0 = -1;
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
                                  stackIn_41_0 = ld.field_o[param4.field_w[var14]];
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_41_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_41_0;
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
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 != null) {
                                stackIn_46_0 = var21.field_b;
                                break L13;
                              } else {
                                stackIn_46_0 = 8355711;
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
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                          stackIn_50_0 = var21.field_b;
                          break L14;
                        } else {
                          stackIn_50_0 = 8355711;
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
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var61[var13] * param1 + (var62[var13] * param0 - -(param3 * var63[var13])) >> 1006539880;
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
                      stackIn_18_0 = 256;
                      break L16;
                    } else {
                      stackIn_18_0 = var14 + 128;
                      break L16;
                    }
                  } else {
                    stackIn_18_0 = 128;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_18_0;
                  var15 = param7 * var62[var13] - (-(param2 * var63[var13]) + -(param6 * var61[var13])) >> -1727958744;
                  stackIn_20_0 = qk.field_m;

                  if (var15 >= 0) {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = var15;
                    break L17;
                  } else {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = -var15;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = var14 * (-var15 + 256) >>> 843818664;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var8_ref);

            stackIn_55_1 = new StringBuilder().append("cc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
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
