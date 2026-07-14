/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    private ln[] field_d;
    static int field_f;
    static String field_e;
    static String field_b;
    static String[] field_c;
    static String field_a;

    final void a(boolean param0, int param1) throws jn {
        int var4 = 0;
        ln var5 = null;
        pf var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int var10_int = 0;
        nc[] var10 = null;
        int var11 = 0;
        nc var12 = null;
        int var12_int = 0;
        nc var12_ref = null;
        int var13_int = 0;
        nc var13 = null;
        int var14 = 0;
        int var15_int = 0;
        dm var15 = null;
        Object var16 = null;
        int var16_int = 0;
        nc var16_ref = null;
        nc var17_ref = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        ln[] var22 = null;
        ln var23 = null;
        nc[] var24 = null;
        pf var25 = null;
        nc[] var26 = null;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        dm stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        jd stackIn_58_2 = null;
        jd stackIn_58_3 = null;
        ln stackIn_58_4 = null;
        ln stackIn_58_5 = null;
        dm stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        jd stackIn_59_2 = null;
        jd stackIn_59_3 = null;
        ln stackIn_59_4 = null;
        ln stackIn_59_5 = null;
        dm stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        jd stackIn_60_2 = null;
        jd stackIn_60_3 = null;
        ln stackIn_60_4 = null;
        ln stackIn_60_5 = null;
        ln stackIn_60_6 = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        dm stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        jd stackOut_57_2 = null;
        jd stackOut_57_3 = null;
        ln stackOut_57_4 = null;
        ln stackOut_57_5 = null;
        dm stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        jd stackOut_59_2 = null;
        jd stackOut_59_3 = null;
        ln stackOut_59_4 = null;
        ln stackOut_59_5 = null;
        Object stackOut_59_6 = null;
        dm stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        jd stackOut_58_2 = null;
        jd stackOut_58_3 = null;
        ln stackOut_58_4 = null;
        ln stackOut_58_5 = null;
        ln stackOut_58_6 = null;
        L0: {
          var16 = null;
          var20 = ShatteredPlansClient.field_F ? 1 : 0;
          var22 = ((t) this).field_d;
          if (param1 == 1) {
            break L0;
          } else {
            t.a((byte) 25);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var22.length <= var4) {
            return;
          } else {
            var5 = var22[var4];
            var6 = new pf();
            var9_ref_ln__ = ((t) this).field_d;
            var10_int = 0;
            L2: while (true) {
              if (var9_ref_ln__.length <= var10_int) {
                var9 = var6.e(param1 ^ 1);
                var24 = new nc[var9];
                var10 = var24;
                int discarded$3 = var6.a((byte) -127, (oh[]) (Object) var10);
                var11 = 0;
                L3: while (true) {
                  if (var9 <= var11) {
                    ad.a(var6, param1 ^ -24926);
                    var9 = var6.e(0);
                    var25 = new pf();
                    var12 = (nc) (Object) var6.d(0);
                    L4: while (true) {
                      if (var12 == null) {
                        L5: {
                          if (var25.g(-117)) {
                            break L5;
                          } else {
                            var13_int = var25.e(0);
                            var5.field_v = new fi[var13_int];
                            int discarded$4 = var25.a((byte) -105, (oh[]) (Object) var5.field_v);
                            ra.a(false, var13_int, (ag[]) (Object) var5.field_v);
                            break L5;
                          }
                        }
                        if (!param0) {
                          var7 = var5.field_A + (int)(Math.cos(-0.2617993877991494) * 200.0);
                          var8 = var5.field_S + -(int)(200.0 * Math.sin(-0.2617993877991494));
                          var12 = null;
                          var13 = null;
                          var14 = 0;
                          L6: while (true) {
                            if ((var14 ^ -1) <= -13) {
                              var12_ref.field_k = var13;
                              var13.field_r = var12_ref;
                              var14 = var6.e(param1 + -1);
                              var26 = new nc[var14];
                              var10 = var26;
                              int discarded$5 = var6.a((byte) 95, (oh[]) (Object) var10);
                              var15_int = 0;
                              L7: while (true) {
                                if (var9 <= var15_int) {
                                  ad.a(var6, -24925);
                                  hl.a(var6, true);
                                  var15 = new dm();
                                  var16_ref = (nc) (Object) var6.d(param1 ^ 1);
                                  L8: while (true) {
                                    if (var16_ref == null) {
                                      var9 = var15.field_g;
                                      var5.field_r = new jd[var9];
                                      var15.a((Object[]) (Object) var5.field_r, 0);
                                      var17 = var5.field_r[var9 + -1].field_c;
                                      var18 = var5.field_r[var9 - 1].field_f;
                                      var19 = 0;
                                      L9: while (true) {
                                        if (var5.field_r.length > var19) {
                                          L10: {
                                            var8 = var5.field_r[var19].field_f;
                                            var7 = var5.field_r[var19].field_c;
                                            var5.field_r[var19].field_g = (int)(0.05 * Math.sqrt((double)((var8 - var18) * (var8 - var18) + (var7 - var17) * (var7 - var17))) + 0.5);
                                            var17 = var7;
                                            if ((var5.field_r[var19].field_g ^ -1) <= -3) {
                                              break L10;
                                            } else {
                                              var5.field_r[var19].field_g = 2;
                                              break L10;
                                            }
                                          }
                                          var18 = var8;
                                          var19++;
                                          continue L9;
                                        } else {
                                          var4++;
                                          continue L1;
                                        }
                                      }
                                    } else {
                                      L11: {
                                        L12: {
                                          if (var16_ref.field_k == null) {
                                            break L12;
                                          } else {
                                            if (var16_ref.field_k.field_q == null) {
                                              break L12;
                                            } else {
                                              if (var16_ref.field_q == var16_ref.field_k.field_q) {
                                                break L12;
                                              } else {
                                                L13: {
                                                  if (null != var16_ref.field_u) {
                                                    stackOut_44_0 = (var16_ref.field_u.field_z + (var16_ref.field_q.field_z - -var16_ref.field_k.field_q.field_z)) / 3;
                                                    stackIn_45_0 = stackOut_44_0;
                                                    break L13;
                                                  } else {
                                                    stackOut_43_0 = (var16_ref.field_q.field_z - -var16_ref.field_k.field_q.field_z) / 2;
                                                    stackIn_45_0 = stackOut_43_0;
                                                    break L13;
                                                  }
                                                }
                                                var17 = stackIn_45_0;
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                        L14: {
                                          if (var16_ref.field_k == null) {
                                            break L14;
                                          } else {
                                            if (var16_ref.field_k.field_u == null) {
                                              break L14;
                                            } else {
                                              if (var16_ref.field_k.field_u == var16_ref.field_q) {
                                                break L14;
                                              } else {
                                                L15: {
                                                  if (var16_ref.field_u != null) {
                                                    stackOut_51_0 = (var16_ref.field_q.field_z - -var16_ref.field_u.field_z - -var16_ref.field_k.field_u.field_z) / 3;
                                                    stackIn_52_0 = stackOut_51_0;
                                                    break L15;
                                                  } else {
                                                    stackOut_50_0 = (var16_ref.field_q.field_z - -var16_ref.field_k.field_u.field_z) / 2;
                                                    stackIn_52_0 = stackOut_50_0;
                                                    break L15;
                                                  }
                                                }
                                                var17 = stackIn_52_0;
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                        L16: {
                                          if (var16_ref.field_u == null) {
                                            stackOut_55_0 = var16_ref.field_q.field_z;
                                            stackIn_56_0 = stackOut_55_0;
                                            break L16;
                                          } else {
                                            stackOut_54_0 = (var16_ref.field_u.field_z + var16_ref.field_q.field_z) / 2;
                                            stackIn_56_0 = stackOut_54_0;
                                            break L16;
                                          }
                                        }
                                        var17 = stackIn_56_0;
                                        break L11;
                                      }
                                      L17: {
                                        stackOut_57_0 = (dm) var15;
                                        stackOut_57_1 = 0;
                                        stackOut_57_2 = null;
                                        stackOut_57_3 = null;
                                        stackOut_57_4 = (ln) var5;
                                        stackOut_57_5 = var16_ref.field_u;
                                        stackIn_59_0 = stackOut_57_0;
                                        stackIn_59_1 = stackOut_57_1;
                                        stackIn_59_2 = stackOut_57_2;
                                        stackIn_59_3 = stackOut_57_3;
                                        stackIn_59_4 = stackOut_57_4;
                                        stackIn_59_5 = stackOut_57_5;
                                        stackIn_58_0 = stackOut_57_0;
                                        stackIn_58_1 = stackOut_57_1;
                                        stackIn_58_2 = stackOut_57_2;
                                        stackIn_58_3 = stackOut_57_3;
                                        stackIn_58_4 = stackOut_57_4;
                                        stackIn_58_5 = stackOut_57_5;
                                        if (null == var16_ref.field_k) {
                                          stackOut_59_0 = (dm) (Object) stackIn_59_0;
                                          stackOut_59_1 = stackIn_59_1;
                                          stackOut_59_2 = null;
                                          stackOut_59_3 = null;
                                          stackOut_59_4 = (ln) (Object) stackIn_59_4;
                                          stackOut_59_5 = (ln) (Object) stackIn_59_5;
                                          stackOut_59_6 = null;
                                          stackIn_60_0 = stackOut_59_0;
                                          stackIn_60_1 = stackOut_59_1;
                                          stackIn_60_2 = stackOut_59_2;
                                          stackIn_60_3 = stackOut_59_3;
                                          stackIn_60_4 = stackOut_59_4;
                                          stackIn_60_5 = stackOut_59_5;
                                          stackIn_60_6 = (ln) (Object) stackOut_59_6;
                                          break L17;
                                        } else {
                                          stackOut_58_0 = (dm) (Object) stackIn_58_0;
                                          stackOut_58_1 = stackIn_58_1;
                                          stackOut_58_2 = null;
                                          stackOut_58_3 = null;
                                          stackOut_58_4 = (ln) (Object) stackIn_58_4;
                                          stackOut_58_5 = (ln) (Object) stackIn_58_5;
                                          stackOut_58_6 = var16_ref.field_k.field_u;
                                          stackIn_60_0 = stackOut_58_0;
                                          stackIn_60_1 = stackOut_58_1;
                                          stackIn_60_2 = stackOut_58_2;
                                          stackIn_60_3 = stackOut_58_3;
                                          stackIn_60_4 = stackOut_58_4;
                                          stackIn_60_5 = stackOut_58_5;
                                          stackIn_60_6 = stackOut_58_6;
                                          break L17;
                                        }
                                      }
                                      new jd(stackIn_60_4, stackIn_60_5, stackIn_60_6, (int)(var16_ref.field_h + var16_ref.field_i * var16_ref.field_o), (int)(var16_ref.field_l + var16_ref.field_o * var16_ref.field_s), var17);
                                      ((dm) (Object) stackIn_60_0).a(stackIn_60_1 != 0, (Object) (Object) stackIn_60_2);
                                      var16_ref = (nc) (Object) var6.a((byte) -71);
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var21 = var9;
                                  var16_int = var21;
                                  L18: while (true) {
                                    if (var21 >= var14) {
                                      var15_int++;
                                      continue L7;
                                    } else {
                                      eo.a(var26[var15_int], param0, -10000, var26[var21]);
                                      var21++;
                                      continue L18;
                                    }
                                  }
                                }
                              }
                            } else {
                              L19: {
                                var15_int = var5.field_A + (int)(200.0 * Math.cos(3.141592653589793 * (double)(2 * var14 + 1) / 12.0));
                                var16_int = var5.field_S - (int)(Math.sin((double)(var14 * 2 - -1) * 3.141592653589793 / 12.0) * 200.0);
                                var17_ref = new nc(var5, var12, (nc) null, var7, var8, var15_int, var16_int);
                                if (var12 != null) {
                                  var12.field_k = var17_ref;
                                  break L19;
                                } else {
                                  var13 = var17_ref;
                                  break L19;
                                }
                              }
                              var7 = var15_int;
                              var12_ref = var17_ref;
                              var8 = var16_int;
                              var6.a((byte) -113, (oh) (Object) var17_ref);
                              var14++;
                              continue L6;
                            }
                          }
                        } else {
                          var4++;
                          continue L1;
                        }
                      } else {
                        L20: {
                          if (var12.field_u == null) {
                            break L20;
                          } else {
                            var25.a((byte) -113, (oh) (Object) new fi(var5, var12.field_u));
                            break L20;
                          }
                        }
                        var12 = (nc) (Object) var6.a((byte) -71);
                        continue L4;
                      }
                    }
                  } else {
                    var12_int = var11 + 1;
                    var13_int = var12_int;
                    L21: while (true) {
                      if (var13_int >= var9) {
                        var11++;
                        continue L3;
                      } else {
                        eo.a(var24[var11], param0, -10000, var24[var13_int]);
                        var13_int++;
                        continue L21;
                      }
                    }
                  }
                }
              } else {
                var23 = var9_ref_ln__[var10_int];
                if (var5 != var23) {
                  var6.a((byte) -113, (oh) (Object) new nc(var5, var23));
                  var10_int++;
                  continue L2;
                } else {
                  var10_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_a = null;
        if (param0 != -11) {
            t.a((byte) 61);
        }
    }

    t(ln[] param0) {
        ((t) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Return to game";
        field_b = "Click to show the Production window.";
        field_e = "Suggest muting this player";
        field_f = 10;
    }
}
