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
        jc var3 = (jc) ((cc) this).field_g.a(-100, (long)param1);
        if (var3 != null) {
            return var3;
        }
        int var5 = -115 % ((-69 - param0) / 38);
        if (-32769 >= (param1 ^ -1)) {
            var4 = ((cc) this).field_f.b(88, 0, param1 & 32767);
        } else {
            var4 = ((cc) this).field_c.b(121, 0, param1);
        }
        jc var3_ref = new jc();
        if (var4 != null) {
            var3_ref.a(new lu(var4), false);
        }
        if (!(-32769 < (param1 ^ -1))) {
            var3_ref.d((byte) -25);
        }
        ((cc) this).field_g.a((long)param1, 1, (Object) (Object) var3_ref);
        return var3_ref;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -122) {
            Object var2 = null;
            cc.a(-37, (String) null, 61, 62, -69, (ht) null, -47, 27, -18);
        }
        field_e = null;
        field_b = null;
        field_a = null;
    }

    cc(int param0, vr param1, vr param2) {
        ((cc) this).field_g = new pha(64);
        ((cc) this).field_c = param1;
        ((cc) this).field_f = param2;
        if (null != ((cc) this).field_c) {
            int discarded$0 = ((cc) this).field_c.d(0, 0);
        }
        if (null != ((cc) this).field_f) {
            int discarded$1 = ((cc) this).field_f.d(0, 0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ma param4, byte param5, int param6, int param7) {
        int[] var8 = null;
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
        int var44 = 0;
        ma var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        ai stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        ai stackOut_39_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var40 = BachelorFridge.field_y;
          var45 = param4;
          if (param5 < -64) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var45.field_d == null) {
              break L2;
            } else {
              if (-2 > (var45.field_n ^ -1)) {
                var62 = var45.field_d;
                dla.a(0, fg.field_a, 72, var62, 0);
                break L1;
              } else {
                break L2;
              }
            }
          }
          ku.d(-372);
          break L1;
        }
        var66 = new int[param4.field_i];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param4.field_i];
        var64 = bv.field_G;
        var65 = fv.field_x;
        var63 = ep.field_l;
        var13 = 0;
        L3: while (true) {
          if (param4.field_i <= var13) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= lq.field_y) {
                return;
              } else {
                L5: {
                  var14 = ci.field_q[var44];
                  var15 = param4.field_C[var14];
                  var16 = param4.field_h[var14];
                  var17 = param4.field_t[var14];
                  if (param4.field_F[var14] < bv.field_G.length) {
                    stackOut_25_0 = param4.field_F[var14];
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_26_0;
                  if (bv.field_G.length > param4.field_c[var14]) {
                    stackOut_28_0 = param4.field_c[var14];
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = -1;
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_29_0;
                  if (bv.field_G.length > param4.field_e[var14]) {
                    stackOut_31_0 = param4.field_e[var14];
                    stackIn_32_0 = stackOut_31_0;
                    break L7;
                  } else {
                    stackOut_30_0 = -1;
                    stackIn_32_0 = stackOut_30_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_32_0;
                    if (null == ld.field_o) {
                      break L9;
                    } else {
                      if (param4.field_w == null) {
                        break L9;
                      } else {
                        if (var14 >= param4.field_w.length) {
                          break L9;
                        } else {
                          if ((param4.field_w[var14] ^ -1) == 0) {
                            break L9;
                          } else {
                            if (param4.field_w[var14] < ld.field_o.length) {
                              stackOut_39_0 = ld.field_o[param4.field_w[var14]];
                              stackIn_40_0 = stackOut_39_0;
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_38_0 = null;
                  stackIn_40_0 = (ai) (Object) stackOut_38_0;
                  break L8;
                }
                L10: {
                  var21 = (ai) (Object) stackIn_40_0;
                  var22 = du.field_e[var15];
                  var23 = ew.field_s[var15];
                  var24 = du.field_e[var16];
                  var25 = ew.field_s[var16];
                  var26 = du.field_e[var17];
                  var27 = ew.field_s[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var19 != var20) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_44_0 = var21.field_b;
                          stackIn_45_0 = stackOut_44_0;
                          break L11;
                        } else {
                          stackOut_43_0 = 8355711;
                          stackIn_45_0 = stackOut_43_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_45_0;
                      var31 = 16711935 & var30;
                      var32 = var30 & 65280;
                      var33 = -369164033 & var28 * var31 >>> -1324768600 | (var28 * var32 & 16711854) >>> 1195922984;
                      var33 = var33 + 65793 * var29;
                      el.a(29322, var24, var25, (16711422 & var33) >> -1301096703, var23, var22, var26, var27);
                      var44++;
                      continue L4;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 != null) {
                    stackOut_48_0 = var21.field_b;
                    stackIn_49_0 = stackOut_48_0;
                    break L12;
                  } else {
                    stackOut_47_0 = 8355711;
                    stackIn_49_0 = stackOut_47_0;
                    break L12;
                  }
                }
                var34 = stackIn_49_0;
                var35 = var34 & 16711935;
                var36 = var34 & 65280;
                var37 = (var28 * var36 & 16711814) >>> 1124180776 | -218169089 & var28 * var35 >>> 387624840;
                var38 = 134152447 & var35 * var29 >>> -1757597400 | -234815744 & var36 * var29 >>> 88594792;
                var39 = var36 * var30 >>> 1864588712 & 922812160 | (-16711745 & var35 * var30) >>> 1632188712;
                var38 = var38 + 65793 * var32;
                var37 = var37 + 65793 * var31;
                var39 = var39 + 65793 * var33;
                ba.a(var26, var23, var39 >> 33737584, var38 >> -889112848, var37 >> -1860442032, var38 & 255, (var38 & 65511) >> -1456477592, var25, var37 >> 2040514952 & 255, var39 & 255, var37 & 255, var27, var24, var22, (byte) 50, (65416 & var39) >> -31955448);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param1 + (var64[var13] * param0 - -(param3 * var65[var13])) >> 1006539880;
              if ((var14 ^ -1) > -1) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (var14 >= 0) {
                if (128 <= var14) {
                  stackOut_16_0 = 256;
                  stackIn_17_0 = stackOut_16_0;
                  break L14;
                } else {
                  stackOut_15_0 = var14 + 128;
                  stackIn_17_0 = stackOut_15_0;
                  break L14;
                }
              } else {
                stackOut_13_0 = 128;
                stackIn_17_0 = stackOut_13_0;
                break L14;
              }
            }
            L15: {
              var14 = stackIn_17_0;
              var15 = param7 * var64[var13] - (-(param2 * var65[var13]) + -(param6 * var63[var13])) >> -1727958744;
              stackOut_17_0 = qk.field_m;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (var15 >= 0) {
                stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                stackOut_19_1 = var15;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L15;
              } else {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = -var15;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L15;
              }
            }
            var15 = stackIn_20_0[stackIn_20_1];
            var14 = var14 * (-var15 + 256) >>> 843818664;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, ht param5, int param6, int param7, int param8) {
        nj.field_f = param4;
        pw.field_A = param1;
        ro.field_j = param0;
        if (param2 != -1456477592) {
            return;
        }
        ma.field_E = param6;
        mh.field_l = param5;
        bd.field_m = param8;
        uea.field_i = param7;
        gp.field_x = param3;
        aka.field_G = (vm) (Object) new cl();
        oea.field_q = new ea(param5);
        ga.field_c = new kb(aka.field_G, oea.field_q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Decline invitation to <%0>'s game";
    }
}
