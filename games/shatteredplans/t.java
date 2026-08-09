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
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        dm stackIn_59_0;
        int stackIn_59_1;
        jd stackIn_59_2;
        jd stackIn_59_3;
        ln stackIn_59_4;
        ln stackIn_59_5;
        dm stackIn_60_0;
        int stackIn_60_1;
        jd stackIn_60_2;
        jd stackIn_60_3;
        ln stackIn_60_4;
        ln stackIn_60_5;
        ln stackIn_60_6;
        int var4;
        ln var5;
        pf var6;
        int var7;
        int var8;
        ln[] var9_ref_ln__;
        int var9;
        int var10_int;
        nc[] var10;
        int var11;
        Object var12;
        int var12_int;
        int var13_int;
        Object var13;
        int var14;
        int var15_int;
        dm var15;
        Object var16;
        nc var16_ref;
        int var16_int;
        int var17;
        nc var17_ref_nc;
        int var18;
        int var19;
        int var20;
        int var21;
        ln[] var22;
        ln var23;
        nc[] var24;
        pf var25;
        nc[] var26;
        L0: {
          var16 = null;
          var20 = ShatteredPlansClient.field_F ? 1 : 0;
          var22 = this.field_d;
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
            var9_ref_ln__ = this.field_d;
            var10_int = 0;
            L2: while (true) {
              if (var9_ref_ln__.length <= var10_int) {
                var9 = var6.e(param1 ^ 1);
                var24 = new nc[var9];
                var10 = var24;
                var6.a((byte) -127, var10);
                var11 = 0;
                L3: while (true) {
                  if (var9 <= var11) {
                    ad.a(var6, param1 ^ -24926);
                    var9 = var6.e(0);
                    var25 = new pf();
                    var12 = (nc) ((Object) var6.d(0));
                    L4: while (true) {
                      if (null == var12) {
                        L5: {
                          if (var25.g(-117)) {
                            break L5;
                          } else {
                            var13_int = var25.e(0);
                            var5.field_v = new fi[var13_int];
                            var25.a((byte) -105, var5.field_v);
                            ra.a(false, var13_int, var5.field_v);
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
                              ((nc) (var12)).field_k = (nc) (var13);
                              ((nc) (var13)).field_r = (nc) (var12);
                              var14 = var6.e(param1 + -1);
                              var26 = new nc[var14];
                              var10 = var26;
                              var6.a((byte) 95, var10);
                              var15_int = 0;
                              L7: while (true) {
                                if (var9 <= var15_int) {
                                  ad.a(var6, -24925);
                                  hl.a(var6, true);
                                  var15 = new dm();
                                  var16_ref = (nc) ((Object) var6.d(param1 ^ 1));
                                  L8: while (true) {
                                    if (var16_ref == null) {
                                      var9 = var15.field_g;
                                      var5.field_r = new jd[var9];
                                      var15.a(var5.field_r, 0);
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
                                                    stackIn_45_0 = (var16_ref.field_u.field_z + (var16_ref.field_q.field_z - -var16_ref.field_k.field_q.field_z)) / 3;
                                                    break L13;
                                                  } else {
                                                    stackIn_45_0 = (var16_ref.field_q.field_z - -var16_ref.field_k.field_q.field_z) / 2;
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
                                                    stackIn_52_0 = (var16_ref.field_q.field_z - -var16_ref.field_u.field_z - -var16_ref.field_k.field_u.field_z) / 3;
                                                    break L15;
                                                  } else {
                                                    stackIn_52_0 = (var16_ref.field_q.field_z - -var16_ref.field_k.field_u.field_z) / 2;
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
                                            stackIn_56_0 = var16_ref.field_q.field_z;
                                            break L16;
                                          } else {
                                            stackIn_56_0 = (var16_ref.field_u.field_z + var16_ref.field_q.field_z) / 2;
                                            break L16;
                                          }
                                        }
                                        var17 = stackIn_56_0;
                                        break L11;
                                      }
                                      L17: {
                                        stackIn_59_0 = (dm) (var15);

                                        stackIn_59_1 = 0;

                                        stackIn_59_2 = null;

                                        stackIn_59_3 = null;

                                        stackIn_59_4 = (ln) (var5);

                                        stackIn_59_5 = var16_ref.field_u;

                                        if (null == var16_ref.field_k) {
                                          stackIn_60_0 = (dm) ((Object) stackIn_59_0);
                                          stackIn_60_1 = stackIn_59_1;
                                          stackIn_60_2 = null;
                                          stackIn_60_3 = null;
                                          stackIn_60_4 = (ln) ((Object) stackIn_59_4);
                                          stackIn_60_5 = (ln) ((Object) stackIn_59_5);
                                          stackIn_60_6 = null;
                                          break L17;
                                        } else {
                                          stackIn_60_0 = (dm) ((Object) stackIn_59_0);
                                          stackIn_60_1 = stackIn_59_1;
                                          stackIn_60_2 = null;
                                          stackIn_60_3 = null;
                                          stackIn_60_4 = (ln) ((Object) stackIn_59_4);
                                          stackIn_60_5 = (ln) ((Object) stackIn_59_5);
                                          stackIn_60_6 = var16_ref.field_k.field_u;
                                          break L17;
                                        }
                                      }
                                      ((dm) (Object) stackIn_60_0).a(stackIn_60_1 != 0, new jd(stackIn_60_4, stackIn_60_5, stackIn_60_6, (int)(var16_ref.field_h + var16_ref.field_i * var16_ref.field_o), (int)(var16_ref.field_l + var16_ref.field_o * var16_ref.field_s), var17));
                                      var16_ref = (nc) ((Object) var6.a((byte) -71));
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
                                var17_ref_nc = new nc(var5, (nc) (var12), (nc) null, var7, var8, var15_int, var16_int);
                                if (null != var12) {
                                  ((nc) (var12)).field_k = var17_ref_nc;
                                  break L19;
                                } else {
                                  var13 = var17_ref_nc;
                                  break L19;
                                }
                              }
                              var7 = var15_int;
                              var12 = var17_ref_nc;
                              var8 = var16_int;
                              var6.a((byte) -113, var17_ref_nc);
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
                          if (((nc) (var12)).field_u == null) {
                            break L20;
                          } else {
                            var25.a((byte) -113, new fi(var5, ((nc) (var12)).field_u));
                            break L20;
                          }
                        }
                        var12 = (nc) ((Object) var6.a((byte) -71));
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
                  var6.a((byte) -113, new nc(var5, var23));
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
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Return to game";
        field_b = "Click to show the Production window.";
        field_e = "Suggest muting this player";
        field_f = 10;
    }
}
