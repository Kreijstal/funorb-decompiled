/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mg extends w {
    static boolean field_Nb;
    static ig field_bc;
    private w field_ac;
    private StringBuilder field_Ub;
    private ha field_Qb;
    private w field_Xb;
    static int[][] field_Ob;
    private w[] field_Yb;
    long field_Tb;
    private w field_cc;
    private w field_Sb;
    static boolean field_Zb;
    private w field_Pb;
    private w field_Wb;
    static int field_Vb;
    private int field_Rb;

    public static void f(int param0) {
        field_Ob = null;
        if (param0 != 256) {
            return;
        }
        field_bc = null;
    }

    final static ck a(int param0, int param1, String param2, lm param3, int param4, int param5, byte param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        ck var14 = null;
        int[] var15 = null;
        ck var16 = null;
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
        int[] var31 = null;
        var27 = client.field_A ? 1 : 0;
        var7 = param3.a(param2) - 1;
        L0: while (true) {
          if (param4 * (2 + var7) < 620) {
            L1: {
              var8 = param3.field_K + param3.field_R;
              var9 = param4;
              var10 = var9 / 4;
              var31 = hk.field_l;
              var12 = hk.field_j;
              var13 = hk.field_i;
              var14 = new ck(var7, var8);
              var14.a();
              param3.a(param2, 0, param3.field_R, 16777215, -1);
              if (0 == param5) {
                param5 = 65793;
                break L1;
              } else {
                break L1;
              }
            }
            hk.a(var31, var12, var13);
            var15 = var14.field_D;
            var16 = new ck((2 + var7) * var9, var9 * (2 + var8));
            var16.a();
            var17 = 0;
            L2: while (true) {
              if (var8 <= var17) {
                hk.a(var31, var12, var13);
                var17 = 0;
                L3: while (true) {
                  if (var17 >= var8) {
                    L4: {
                      if (param6 >= 84) {
                        break L4;
                      } else {
                        mg.f(17);
                        break L4;
                      }
                    }
                    return var16;
                  } else {
                    var18 = 0;
                    L5: while (true) {
                      if (var7 <= var18) {
                        var17++;
                        continue L3;
                      } else {
                        if (0 != var15[var18 - -(var17 * var7)]) {
                          var19 = var9 + var18 * var9;
                          var20 = var19 - -var9;
                          var21 = var9 * var17 - -var9;
                          var22 = var9 + var21;
                          var23 = var21;
                          L6: while (true) {
                            if (var23 < var22) {
                              var24 = 256 * (var23 - var9) / (var9 * var8);
                              var25 = fl.a(param1, var24, 256, param0, 124);
                              var26 = var19;
                              L7: while (true) {
                                if (var20 <= var26) {
                                  var23++;
                                  continue L6;
                                } else {
                                  var16.field_D[var26 - -(var16.field_I * var23)] = de.b(-16777216, var25);
                                  var26++;
                                  continue L7;
                                }
                              }
                            } else {
                              var18++;
                              continue L5;
                            }
                          }
                        } else {
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var18 = 0;
                L8: while (true) {
                  if (var7 <= var18) {
                    var17++;
                    continue L2;
                  } else {
                    if (var15[var17 * var7 + var18] != 0) {
                      var19 = var9 * (var18 - -1);
                      var20 = (var17 - -1) * var9;
                      hk.e(var19, var20, var9 - var10, param5 | -16777216);
                      hk.e(-1 + var9 + var19, var20, var9 + -var10, param5 | -16777216);
                      hk.e(var19, var20 - -var9 - 1, -var10 + var9, param5 | -16777216);
                      hk.e(var19 + (var9 + -1), var9 + var20 - 1, -var10 + var9, param5 | -16777216);
                      var18++;
                      continue L8;
                    } else {
                      var18++;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            param4--;
            continue L0;
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        if (1 != ((mg) this).field_Rb) {
            return false;
        }
        if (-14 == wh.field_c) {
            ((mg) this).field_Rb = -1;
            return true;
        }
        return true;
    }

    final static void a(int param0, ck param1, ck param2) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        var7 = client.field_A ? 1 : 0;
        var8 = param2.field_D;
        var3 = var8;
        var4 = param1.field_D;
        var5 = var8.length;
        var6 = param0;
        L0: while (true) {
          if (var6 >= var5) {
            return;
          } else {
            if (0 == var4[var6]) {
              var8[var6] = 0;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    private final int a(w param0, int param1, int param2, w param3, int param4, String param5) {
        w var7 = new w(0L, param0, 0, param1, param2, param4, param5);
        param3.a(var7, -16834);
        param1 += 32;
        return param1;
    }

    private final int a(boolean param0, w param1, w param2, int param3, int param4) {
        param3 += 8;
        if (!param0) {
            field_Ob = null;
        }
        int var6 = param1.field_J.b(param1.field_Y, param4 + -(param1.field_ub * 2), param1.field_Db);
        param1.a(param4, 0, param3, var6, 0);
        param2.a(param1, -16834);
        param3 = param3 + (var6 - 0);
        return param3;
    }

    final int c(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ha stackIn_6_0 = null;
        ha stackIn_7_0 = null;
        ha stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        w stackIn_14_0 = null;
        w stackIn_15_0 = null;
        w stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ha stackOut_5_0 = null;
        ha stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ha stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        w stackOut_13_0 = null;
        w stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        w stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        var4 = client.field_A ? 1 : 0;
        ((mg) this).a(false, param1);
        if (param0 == 497) {
          L0: {
            if (null == ((mg) this).field_Wb) {
              break L0;
            } else {
              L1: {
                ((mg) this).field_Wb.field_Y = ((mg) this).field_Ub.toString();
                ((mg) this).field_Wb.field_vb = (((mg) this).field_mb - ((mg) this).field_Wb.field_J.a(((mg) this).field_Wb.field_Y)) / 2;
                ((mg) this).field_Wb.field_mb = ((mg) this).field_mb + -((mg) this).field_Wb.field_vb;
                if (null == ((mg) this).field_Qb) {
                  break L1;
                } else {
                  if (0 == ((mg) this).field_Qb.field_ob) {
                    break L1;
                  } else {
                    L2: {
                      stackOut_5_0 = ((mg) this).field_Qb;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (((mg) this).field_Qb.field_ab) {
                        stackOut_7_0 = (ha) (Object) stackIn_7_0;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L2;
                      } else {
                        stackOut_6_0 = (ha) (Object) stackIn_6_0;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L2;
                      }
                    }
                    stackIn_8_0.field_ab = stackIn_8_1 != 0;
                    break L1;
                  }
                }
              }
              var3 = 0;
              L3: while (true) {
                if (qb.field_u <= var3) {
                  break L0;
                } else {
                  if (((mg) this).field_Yb[var3] != null) {
                    L4: {
                      stackOut_13_0 = ((mg) this).field_Yb[var3];
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (-1 <= (((mg) this).field_Ub.length() ^ -1)) {
                        stackOut_15_0 = (w) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L4;
                      } else {
                        stackOut_14_0 = (w) (Object) stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L4;
                      }
                    }
                    stackIn_16_0.field_Hb = stackIn_16_1 != 0;
                    if (((mg) this).field_Yb[var3].field_Hb) {
                      if (0 != ((mg) this).field_Yb[var3].field_ob) {
                        return var3;
                      } else {
                        var3++;
                        continue L3;
                      }
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                }
              }
            }
          }
          if (-1 == (((mg) this).field_ac.field_ob ^ -1)) {
            L5: {
              if (!param1) {
                break L5;
              } else {
                if (0 == ig.field_Yb) {
                  break L5;
                } else {
                  if (0 == ((mg) this).field_ob) {
                    return -1;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return ((mg) this).field_Rb;
          } else {
            return -1;
          }
        } else {
          return -95;
        }
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 5658) {
            break L0;
          } else {
            mg.f(-70);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((mg) this).field_Qb) {
              break L2;
            } else {
              if (!((mg) this).field_Qb.field_ab) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final String g(byte param0) {
        if (param0 != -96) {
            field_Nb = true;
        }
        return ((mg) this).field_Ub.toString();
    }

    final static void b(int param0, boolean param1) {
        je.field_f = param1 ? new ak(ue.field_c, cl.field_n) : new ak(eg.field_b, in.field_o);
        ee.field_i = new w(0L, (w) null);
        ee.field_i.a((w) (Object) je.field_f.field_h, -16834);
        ee.field_i.a(ma.field_G, -16834);
        mn.field_e = new w((long)param0, ui.field_x);
        cl.field_C = new w(0L, (w) null);
        mn.field_e.a(ie.field_a, -16834);
        mn.field_e.a(cl.field_C, -16834);
        cl.field_C.a(gg.field_y, -16834);
        cl.field_C.a(qc.field_q, -16834);
        vb.a(param1, -2);
    }

    mg(int param0, int param1, int param2, int param3, int param4, w param5, w param6, w param7, w param8, ha param9, w param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        w[] var15 = null;
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
        w[] var28 = null;
        Object stackIn_5_0 = null;
        ha stackIn_5_1 = null;
        ha stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        ha stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        ha stackIn_6_1 = null;
        ha stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        ha stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        ha stackIn_7_1 = null;
        ha stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        ha stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        ha stackIn_8_1 = null;
        ha stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        ha stackIn_8_4 = null;
        String stackIn_8_5 = null;
        w stackIn_14_0 = null;
        w stackIn_15_0 = null;
        w stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_4_0 = null;
        ha stackOut_4_1 = null;
        ha stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        ha stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        ha stackOut_5_1 = null;
        ha stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        ha stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        ha stackOut_6_1 = null;
        ha stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        ha stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_7_0 = null;
        ha stackOut_7_1 = null;
        ha stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        ha stackOut_7_4 = null;
        String stackOut_7_5 = null;
        w stackOut_13_0 = null;
        w stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        w stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          ((mg) this).field_Rb = -2;
          ((mg) this).field_Tb = param12;
          ((mg) this).field_cc = new w(0L, param6, ue.field_a.toUpperCase());
          ((mg) this).field_cc.field_X = 1;
          ((mg) this).a(((mg) this).field_cc, -16834);
          ((mg) this).field_ac = new w(0L, param7);
          ((mg) this).field_cc.a(((mg) this).field_ac, -16834);
          ((mg) this).field_Pb = new w(0L, (w) null);
          ((mg) this).a(((mg) this).field_Pb, -16834);
          if (param11 != null) {
            L1: {
              L2: {
                ((mg) this).field_Xb = new w(0L, param8, ph.field_Hb);
                ((mg) this).field_Xb.field_X = 1;
                ((mg) this).field_Xb.field_G = 11184810;
                ((mg) this).field_Pb.a(((mg) this).field_Xb, -16834);
                ((mg) this).field_Sb = new w(0L, param8, pc.field_c);
                ((mg) this).field_Sb.field_X = 1;
                ((mg) this).field_Sb.field_G = 11184810;
                ((mg) this).field_Pb.a(((mg) this).field_Sb, -16834);
                ((mg) this).field_Wb = new w(0L, param8);
                ((mg) this).field_Wb.field_G = 16764006;
                ((mg) this).field_Pb.a(((mg) this).field_Wb, -16834);
                ((mg) this).field_Wb.field_T = "|";
                if (d.field_b <= -6) {
                  break L2;
                } else {
                  if (te.field_p > -3) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_4_0 = this;
                  stackOut_4_1 = null;
                  stackOut_4_2 = null;
                  stackOut_4_3 = 0L;
                  stackOut_4_4 = (ha) param9;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  stackIn_7_2 = stackOut_4_2;
                  stackIn_7_3 = stackOut_4_3;
                  stackIn_7_4 = stackOut_4_4;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  stackIn_5_4 = stackOut_4_4;
                  if (-8 <= d.field_b) {
                    break L4;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = stackIn_5_3;
                    stackOut_5_4 = (ha) (Object) stackIn_5_4;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    stackIn_6_4 = stackOut_5_4;
                    if (-3 <= te.field_p) {
                      break L4;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (ha) (Object) stackIn_6_4;
                      stackOut_6_5 = rk.field_bb;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      stackIn_8_5 = stackOut_6_5;
                      break L3;
                    }
                  }
                }
                stackOut_7_0 = this;
                stackOut_7_1 = null;
                stackOut_7_2 = null;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = (ha) (Object) stackIn_7_4;
                stackOut_7_5 = si.field_j;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                break L3;
              }
              new ha(stackIn_8_3, stackIn_8_4, stackIn_8_5);
              ((mg) this).field_Qb = stackIn_8_1;
              ((mg) this).field_Pb.a((w) (Object) ((mg) this).field_Qb, -16834);
              break L1;
            }
            var28 = new w[3];
            var15 = var28;
            var28[0] = new w(0L, (w) null);
            ((mg) this).field_Pb.a(var28[0], -16834);
            var28[1] = new w(0L, (w) null);
            ((mg) this).field_Pb.a(var28[1], -16834);
            var28[2] = new w(0L, (w) null);
            ((mg) this).field_Pb.a(var28[2], -16834);
            ((mg) this).field_Yb = new w[qb.field_u];
            var16 = 0;
            L5: while (true) {
              if (var16 >= qb.field_u) {
                L6: {
                  ((mg) this).field_Ub = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((mg) this).field_Ub.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_J.a(cf.field_g);
                  if (var17 <= var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_J.a(ul.field_a);
                  if (var16 >= var17) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_J.a(k.field_d);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (var17 >= qb.field_u) {
                    L11: {
                      if (-141 <= (var16 ^ -1)) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a(param6, var18, var16, var28[0], 24, cf.field_g);
                      var18 = this.a(true, ((mg) this).field_Yb[6], var28[0], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[9], var28[0], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[5], var28[0], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[7], var28[0], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[15], var28[0], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[4], var28[0], var18, var16);
                      if (var18 <= var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(param6, var18, var16, var28[1], 24, ul.field_a);
                      var18 = this.a(true, ((mg) this).field_Yb[16], var28[1], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[17], var28[1], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[18], var28[1], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[19], var28[1], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[20], var28[1], var18, var16);
                      if (var17 >= var18) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(param6, var18, var16, var28[2], 24, k.field_d);
                      var18 = this.a(true, ((mg) this).field_Yb[13], var28[2], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[21], var28[2], var18, var16);
                      var18 = this.a(true, ((mg) this).field_Yb[11], var28[2], var18, var16);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 3 * var16 - -26;
                      var20 = ((mg) this).field_cc.a(true);
                      if (var20 <= var19) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((mg) this).field_Qb == null) {
                        break L16;
                      } else {
                        var20 = ((mg) this).field_Qb.c(4, -4168);
                        if (var19 >= var20) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((mg) this).field_cc.a(13 - (-var19 + -13), 0, 0, 24, 0);
                      ((mg) this).field_ac.a(15, 0, 5, 15, -20 + ((mg) this).field_cc.field_mb);
                      var21 = 10;
                      ((mg) this).field_Xb.a(var19, 0, var21, kf.field_O * 2, 13);
                      var21 = var21 + 2 * kf.field_O;
                      ((mg) this).field_Sb.a(var19, 0, var21, kf.field_O * 2, 13);
                      var21 = var21 + (2 * kf.field_O + 10);
                      ((mg) this).field_Wb.a(0, 0, var21, kf.field_O, 0);
                      var21 = var21 + (kf.field_O + 10);
                      if (null == ((mg) this).field_Qb) {
                        break L17;
                      } else {
                        var20 = ((mg) this).field_Qb.c(4, -4168);
                        ((mg) this).field_Qb.a(var20, 8, var21, (var19 + -var20) / 2 + 13, 4, kf.field_O);
                        var21 = var21 + (10 + kf.field_O);
                        break L17;
                      }
                    }
                    var28[0].a(var16, 0, var21, var17, 13);
                    var28[1].a(var16, 0, var21, var17, 13 + (var16 + 13));
                    var28[2].a(var16, 0, var21, var17, 2 * var16 + 13 - -26);
                    var22 = var21;
                    ((mg) this).field_Pb.a(13 - -var19 + 13, 0, 24, 10 + var17 + var22, 0);
                    ((mg) this).field_Pb.field_lb = ea.a(2105376, -20982, 3, ((mg) this).field_Pb.field_N, 8421504, 11579568);
                    var23 = 13 - -var19 + 13;
                    var24 = 10 + (var22 + (24 + var17));
                    var25 = vh.a(param2, -18265, var23, param0);
                    var26 = o.a(param3, 0, var24, param1);
                    ((mg) this).a(var23, 0, var26, var24, var25);
                    break L0;
                  } else {
                    if (((mg) this).field_Yb[var17] != null) {
                      var18 = ((mg) this).field_Yb[var17].a(true);
                      if (var18 > var16) {
                        var16 = var18;
                        var17++;
                        continue L10;
                      } else {
                        var17++;
                        continue L10;
                      }
                    } else {
                      var17++;
                      continue L10;
                    }
                  }
                }
              } else {
                if (pn.field_bb[var16] != null) {
                  L18: {
                    ((mg) this).field_Yb[var16] = new w(0L, param10, pn.field_bb[var16]);
                    ((mg) this).field_Yb[var16].field_X = 0;
                    stackOut_13_0 = ((mg) this).field_Yb[var16];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (param11 == null) {
                      stackOut_15_0 = (w) (Object) stackIn_15_0;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L18;
                    } else {
                      stackOut_14_0 = (w) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L18;
                    }
                  }
                  stackIn_16_0.field_Hb = stackIn_16_1 != 0;
                  ((mg) this).field_Pb.a(((mg) this).field_Yb[var16], -16834);
                  var16++;
                  continue L5;
                } else {
                  var16++;
                  continue L5;
                }
              }
            }
          } else {
            ((mg) this).field_Xb = new w(0L, param8, hc.field_f);
            ((mg) this).field_Xb.field_G = 11184810;
            ((mg) this).field_Xb.field_X = 1;
            ((mg) this).field_Pb.a(((mg) this).field_Xb, -16834);
            var15_int = 226;
            var16 = 10;
            var17 = ((mg) this).field_Xb.field_J.a(((mg) this).field_Xb.field_Y, var15_int);
            ((mg) this).field_Xb.a(var15_int, 0, var16, kf.field_O * var17, 13);
            var16 = var16 + kf.field_O * var17;
            ((mg) this).field_Pb.a(var15_int + 13 - -13, 0, 24, 10 - -var16, 0);
            ((mg) this).field_Pb.field_lb = ea.a(2105376, -20982, 3, ((mg) this).field_Pb.field_N, 8421504, 11579568);
            var18 = 26 - -var15_int;
            var19 = var16 + 34;
            var20 = vh.a(param2, -18265, var18, param0);
            var21 = o.a(param3, 0, var19, param1);
            ((mg) this).a(var18, 0, var21, var19, var20);
            break L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = false;
    }
}
