/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends gg {
    byte[] field_k;
    static kl field_j;
    static int field_l;
    static boolean field_i;
    static gb field_h;

    final static rj e(int param0) {
        if (param0 != -1) {
            field_l = -11;
        }
        return (rj) ((Object) new dk());
    }

    final static void f(int param0) {
        int var1 = 0;
        int var2 = SolKnight.field_L ? 1 : 0;
        ce.field_b = false;
        v.field_a = null;
        if (param0 != 0) {
            field_i = false;
        }
        if (k.field_b) {
            ah.field_e.m(125);
        } else {
            var1 = c.field_H;
            if ((var1 ^ -1) >= -1) {
            } else {
                if (1 != var1) {
                    v.field_a = bb.a(vc.field_b, new String[]{Integer.toString(var1)}, param0 ^ -63);
                } else {
                    v.field_a = bf.field_m;
                }
                v.field_a = ci.a(new CharSequence[]{(CharSequence) ((Object) v.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) pd.field_b)}, (byte) -93);
            }
            ah.field_e.f(true);
            ql.d(18962);
        }
    }

    final static void d(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_36_0 = null;
        String stackIn_42_0 = null;
        String stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        hi stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        hi var9 = null;
        int var10 = 0;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = th.field_J;
              var2 = 0;
              if (-3 == (te.field_M ^ -1)) {
                var3_long = -fg.field_f + je.a(1);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -4537) {
                break L2;
              } else {
                field_l = -128;
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= vc.field_d.length) {
                break L0;
              } else {
                L4: {
                  var4 = oa.field_l[var3];
                  if ((var4 ^ -1) <= -1) {
                    if (bc.field_K.field_f != var4) {
                      var5 = rj.field_c;
                      break L4;
                    } else {
                      var5 = pb.field_b;
                      break L4;
                    }
                  } else {
                    var5 = hc.field_d;
                    break L4;
                  }
                }
                L5: {
                  var6 = vc.field_d[var3];
                  if (2 != te.field_M) {
                    break L5;
                  } else {
                    if (-2 == (var2 ^ -1)) {
                      L6: {
                        if (ak.field_b.length >= i.field_I.length) {
                          stackIn_21_0 = ak.field_b.length;
                          break L6;
                        } else {
                          stackIn_21_0 = i.field_I.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_21_0;
                        if (qc.field_h.length < qa.field_o.length) {
                          stackIn_24_0 = qa.field_o.length;
                          break L7;
                        } else {
                          stackIn_24_0 = qc.field_h.length;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_24_0;
                        if ((var3 ^ -1) > -7) {
                          break L8;
                        } else {
                          if (6 - -var7 <= var3) {
                            break L8;
                          } else {
                            L9: {
                              if ((-var7 + (-6 + var3) - -ak.field_b.length ^ -1) <= -1) {
                                stackIn_29_0 = ak.field_b[var3 + -6 - (-ak.field_b.length - -var7)];
                                break L9;
                              } else {
                                stackIn_29_0 = "";
                                break L9;
                              }
                            }
                            var6 = stackIn_29_0;
                            break L8;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (var3 < 7 - (-var7 - var8)) {
                          L10: {
                            if (qc.field_h.length > -var7 + -7 + var3) {
                              stackIn_36_0 = qc.field_h[-var7 + var3 - 7];
                              break L10;
                            } else {
                              stackIn_36_0 = "";
                              break L10;
                            }
                          }
                          var6 = stackIn_36_0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L11: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_42_0 = (String) (var6);

                  if (-1 < (var4 ^ -1)) {
                    stackIn_43_0 = (String) ((Object) stackIn_42_0);
                    stackIn_43_1 = 0;
                    break L12;
                  } else {
                    stackIn_43_0 = (String) ((Object) stackIn_42_0);
                    stackIn_43_1 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = fa.a(stackIn_43_0, stackIn_43_1 != 0, (byte) 99);
                  var8 = sb.field_d + -(var7 >> -1098640767);
                  if (-1 >= (var4 ^ -1)) {
                    L14: {
                      var1_int = var1_int + vg.field_N;
                      if (bc.field_K.field_f != var4) {
                        stackIn_48_0 = kb.field_d;
                        break L14;
                      } else {
                        stackIn_48_0 = ai.field_a;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_48_0;
                      if (var9 != null) {
                        var9.a(false, var7 - -(bl.field_i << -361721407), var1_int, we.field_c + (g.field_l << 2092350977), var8 + -bl.field_i);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + g.field_l;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if ((var4 ^ -1) > -1) {
                    ke.field_H.c(var6, var8, var1_int + ha.field_g, var5, -1);
                    var1_int = var1_int + uc.field_i;
                    break L16;
                  } else {
                    kb.field_f.c(var6, var8, var1_int - -ph.field_k, var5, -1);
                    var1_int = var1_int + (we.field_c + (vg.field_N + g.field_l));
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ee.D(" + param0 + ')');
        }
    }

    ee(byte[] param0) {
        try {
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        uh var4_ref_uh = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        uh var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            aj.field_m = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = wk.field_d.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  if (param0 >= 30) {
                    break L2;
                  } else {
                    field_j = (kl) null;
                    break L2;
                  }
                }
                L3: {
                  var3 = aj.field_m[9] >> 1272560616;
                  var4 = aj.field_m[10] >> -693749720;
                  var5 = aj.field_m[11] >> -737713976;
                  var6 = ad.field_h << -1026597404;
                  var7 = 0;
                  var8 = uk.a((byte) -64, var6) >> 1276623656;
                  var9 = rd.a((byte) -30, var6) >> -2040209912;
                  if ((gb.field_j ^ -1) == 0) {
                    break L3;
                  } else {
                    if (ad.field_m != -1) {
                      var9 = -128;
                      var7 = gb.field_j - 320;
                      var8 = 240 + -ad.field_m;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = var7 - var3;
                var13 = var8 - var4;
                var14 = var9 + -var5;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var13 * var13 + var12 * var12));
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L4: while (true) {
                  if (var15 >= wk.field_d.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= wk.field_d.length) {
                        var2[var16] = -2147483648;
                        var17 = wk.field_d[var16];
                        jh.a((byte) 126, var16);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= 3) {
                            mb.a(var17, false, aj.field_m, qf.field_e, true, false, 5);
                            bi.a((byte) 77, var12, var14, var9, var17, var13, var8, var7);
                            var15++;
                            continue L4;
                          } else {
                            qf.field_e[var18] = qf.field_e[var18] + bg.field_v[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if ((var21[var17_int] ^ -1) < (var21[var16] ^ -1)) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_uh = wk.field_d[var3];
                var17 = var4_ref_uh;
                var17 = var4_ref_uh;
                var4_ref_uh.b(32767);
                jh.a((byte) 126, var3);
                var5 = var4_ref_uh.field_E - -var4_ref_uh.field_Q >> -1240970783;
                var6 = var4_ref_uh.field_t + var4_ref_uh.field_m >> 43529153;
                var7 = var4_ref_uh.field_N + var4_ref_uh.field_G >> -1552226847;
                var8 = aj.field_m[9] >> -1968571614;
                var9 = aj.field_m[10] >> -1323752478;
                var10_int = aj.field_m[11] >> -1757073854;
                var11 = var8 * qf.field_e[3] + var9 * qf.field_e[4] + qf.field_e[5] * var10_int >> -1362276274;
                var12 = qf.field_e[8] * var10_int + qf.field_e[7] * var9 + var8 * qf.field_e[6] >> -668654226;
                var13 = qf.field_e[9] * var8 + var9 * qf.field_e[10] + qf.field_e[11] * var10_int >> -400961682;
                var2[var3] = var12 * var6 + var11 * var5 + var13 * var7 >> -81543504;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ee.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        int var1 = -126 % ((-79 - param0) / 34);
    }

    static {
        field_j = new kl();
    }
}
