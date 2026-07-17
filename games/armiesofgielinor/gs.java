/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs implements kh {
    static int field_b;
    static boolean field_a;
    static String[] field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            ds.field_a = new wk[op.field_c[0].length];
            le.field_c = new wk[op.field_c[0].length];
            rq.a((byte) -56);
            for (var1_int = 0; var1_int < op.field_c[0].length; var1_int++) {
                ds.field_a[var1_int] = new wk(vo.field_d.field_y, vo.field_d.field_v);
                le.field_c[var1_int] = new wk(im.field_y.field_y, im.field_y.field_v);
                ds.field_a[var1_int].b();
                vo.field_d.d(0, 0, op.field_c[0][var1_int]);
                le.field_c[var1_int].b();
                im.field_y.b(0, 0, op.field_c[0][var1_int]);
            }
            rf.b(-18862);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gs.F(" + 0 + 41);
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.field_q = var2.field_q + 1;
        int var3 = var2.field_q;
        var2.b(1, 2);
        var2.a(ln.field_d, 0, ln.field_d.length, 113);
        var2.b(1, nh.field_E);
        var2.b(1, sm.field_b);
        var2.a(tg.field_d, 0, tg.field_d.length, -72);
        var2.e(-var3 + var2.field_q, 5930);
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            tm.a();
            hg.field_a = new int[260];
            fn.field_M = 11;
            var1_int = 0;
            var2 = 46;
            L1: while (true) {
              if (256 <= var1_int) {
                var6 = 256;
                var1_int = var6;
                L2: while (true) {
                  if (var6 >= hg.field_a.length) {
                    break L0;
                  } else {
                    hg.field_a[var6] = 255;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var3 = 15.0;
                hg.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var3) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "gs.D(" + 54 + 41);
        }
    }

    public static void a(byte param0) {
        int var1 = 29;
        field_c = null;
    }

    final static tu a(String param0, kl param1, kl param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tu stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
        tu stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
        try {
          L0: {
            L1: {
              var5_int = param1.a(param0, 106);
              var6 = param1.a((byte) -65, var5_int, param4);
              if (param3 == -53) {
                break L1;
              } else {
                field_a = true;
                break L1;
              }
            }
            stackOut_2_0 = cc.a(param1, var5_int, param2, true, var6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("gs.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int > param0.field_w) {
                L2: {
                  var6_int = 1;
                  if (param2 <= -79) {
                    break L2;
                  } else {
                    var11 = null;
                    boolean discarded$1 = gs.a((byte) -58, (int[]) null);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (5 < var6_int) {
                    break L0;
                  } else {
                    L4: {
                      var7 = var6_int + (-5 + (param1 + param0.field_B)) + (param0.field_l + -(param0.field_l >> 1));
                      var8 = -(var6_int * 2) + (param0.field_l >> 1);
                      var9 = var6_int + (param4 + (param0.field_p + (-4 + param0.field_w >> 1)));
                      if (var9 < qn.field_a) {
                        break L4;
                      } else {
                        if (qn.field_f <= var9) {
                          break L4;
                        } else {
                          L5: {
                            if (qn.field_j >= var7) {
                              break L5;
                            } else {
                              qn.field_d[var9 * qn.field_l - (-var7 - -1)] = rn.a(qn.field_d[-1 + (var7 + qn.field_l * var9)], 16711422) >> 1;
                              break L5;
                            }
                          }
                          if (var8 + var7 >= qn.field_e) {
                            break L4;
                          } else {
                            qn.field_d[qn.field_l * var9 + (var7 - -var8)] = rn.a(16711422, qn.field_d[qn.field_l * var9 + var7 + var8]) >> 1;
                            break L4;
                          }
                        }
                      }
                    }
                    qn.e(var7, var9, var8, 0);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                var7 = 152 - -(var6_int * 48 / param0.field_w);
                var8 = var7 | (var7 << 16 | var7 << 8);
                qn.e(param0.field_B + param1, var6_int + param4 - -param0.field_p, param0.field_l, var8);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("gs.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static boolean a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        qu var4_ref_qu = null;
        int var4 = 0;
        int var5_int = 0;
        qu var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == 42) {
              if (ov.field_g != kl.field_k) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  L2: {
                    var2_long = vi.b(126);
                    if (dq.field_c == 0) {
                      break L2;
                    } else {
                      if (0 > mg.field_f) {
                        L3: {
                          var4_ref_qu = (qu) (Object) vj.field_b.e((byte) 127);
                          if (var4_ref_qu == null) {
                            break L3;
                          } else {
                            if (~var2_long < ~var4_ref_qu.field_l) {
                              var4_ref_qu.d(-111);
                              fk.field_b = var4_ref_qu.field_m.length;
                              mg.field_e.field_q = 0;
                              var5_int = 0;
                              L4: while (true) {
                                if (fk.field_b <= var5_int) {
                                  me.field_c = ba.field_F;
                                  ba.field_F = sj.field_e;
                                  sj.field_e = nm.field_o;
                                  nm.field_o = var4_ref_qu.field_o;
                                  stackOut_17_0 = 1;
                                  stackIn_18_0 = stackOut_17_0;
                                  return stackIn_18_0 != 0;
                                } else {
                                  mg.field_e.field_o[var5_int] = var4_ref_qu.field_m[var5_int];
                                  var5_int++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_20_0 = mg.field_f;
                        stackIn_22_0 = stackOut_20_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_19_0 = mg.field_f;
                  stackIn_22_0 = stackOut_19_0;
                  break L1;
                }
                L5: while (true) {
                  L6: {
                    if (stackIn_22_0 < 0) {
                      mg.field_e.field_q = 0;
                      if (es.a(param0 ^ -83, 1)) {
                        mg.field_f = mg.field_e.m(255);
                        mg.field_e.field_q = 0;
                        fk.field_b = param1[mg.field_f];
                        break L6;
                      } else {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0 != 0;
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (!jh.g(2)) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0 != 0;
                  } else {
                    if (dq.field_c == 0) {
                      me.field_c = ba.field_F;
                      ba.field_F = sj.field_e;
                      sj.field_e = nm.field_o;
                      nm.field_o = mg.field_f;
                      mg.field_f = -1;
                      stackOut_41_0 = 1;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    } else {
                      L7: {
                        var4 = dq.field_c;
                        if (0.0 == sp.field_e) {
                          break L7;
                        } else {
                          var4 = (int)((double)var4 + iq.field_e.nextGaussian() * sp.field_e);
                          if (0 > var4) {
                            var4 = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var5 = new qu(var2_long + (long)var4, mg.field_f, new byte[fk.field_b]);
                      var6 = 0;
                      L8: while (true) {
                        if (var6 >= fk.field_b) {
                          vj.field_b.a((byte) -119, (tc) (Object) var5);
                          mg.field_f = -1;
                          stackOut_21_0 = mg.field_f;
                          stackIn_22_0 = stackOut_21_0;
                          continue L5;
                        } else {
                          var5.field_m[var6] = mg.field_e.field_o[var6];
                          var6++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var2;
            stackOut_43_1 = new StringBuilder().append("gs.A(").append(param0).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L9;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
        return stackIn_42_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_c = new String[]{"This unit is not carrying any equipment.", "This unit is carrying a flag. As such, it is able to capture a single structure.", "This unit is carrying a grappling hook, enabling it attack flying units.", "This unit is wearing waders, allowing it to better traverse rivers and swamps.", "This unit is wearing boots of Elidinis, allowing it to travel very quickly over water.", "This unit is carrying a ring of life, allowing it to respawn at the nearest unoccupied allied structure when it dies."};
        field_b = 0;
    }
}
