/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        field_Ob = (int[][]) null;
        if (param0 != 256) {
            return;
        }
        field_bc = null;
    }

    final static ck a(int param0, int param1, String param2, lm param3, int param4, int param5, byte param6) {
        ck stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        try {
          L0: {
            var7_int = param3.a(param2) - 1;
            L1: while (true) {
              if (param4 * (2 + var7_int) < 620) {
                L2: {
                  var8 = param3.field_K + param3.field_R;
                  var9 = param4;
                  var10 = var9 / 4;
                  var31 = hk.field_l;
                  var12 = hk.field_j;
                  var13 = hk.field_i;
                  var14 = new ck(var7_int, var8);
                  var14.a();
                  param3.a(param2, 0, param3.field_R, 16777215, -1);
                  if (0 == param5) {
                    param5 = 65793;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                hk.a(var31, var12, var13);
                var15 = var14.field_D;
                var16 = new ck((2 + var7_int) * var9, var9 * (2 + var8));
                var16.a();
                var17 = 0;
                L3: while (true) {
                  if (var8 <= var17) {
                    hk.a(var31, var12, var13);
                    var17 = 0;
                    L4: while (true) {
                      if (var17 >= var8) {
                        L5: {
                          if (param6 >= 84) {
                            break L5;
                          } else {
                            mg.f(17);
                            break L5;
                          }
                        }
                        stackIn_31_0 = (ck) (var16);
                        break L0;
                      } else {
                        var18 = 0;
                        L6: while (true) {
                          if (var7_int <= var18) {
                            var17++;
                            continue L4;
                          } else {
                            L7: {
                              if (0 == var15[var18 - -(var17 * var7_int)]) {
                                break L7;
                              } else {
                                var19 = var9 + var18 * var9;
                                var20 = var19 - -var9;
                                var21 = var9 * var17 - -var9;
                                var22 = var9 + var21;
                                var23 = var21;
                                L8: while (true) {
                                  if (var23 >= var22) {
                                    break L7;
                                  } else {
                                    var24 = 256 * (var23 - var9) / (var9 * var8);
                                    var25 = fl.a(param1, var24, 256, param0, 124);
                                    var26 = var19;
                                    L9: while (true) {
                                      if (var20 <= var26) {
                                        var23++;
                                        continue L8;
                                      } else {
                                        var16.field_D[var26 - -(var16.field_I * var23)] = de.b(-16777216, var25);
                                        var26++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var18++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var18 = 0;
                    L10: while (true) {
                      if (var7_int <= var18) {
                        var17++;
                        continue L3;
                      } else {
                        if ((var15[var17 * var7_int + var18] ^ -1) != -1) {
                          var19 = var9 * (var18 - -1);
                          var20 = (var17 - -1) * var9;
                          hk.e(var19, var20, var9 - var10, param5 | -16777216);
                          hk.e(-1 + var9 + var19, var20, var9 + -var10, param5 | -16777216);
                          hk.e(var19, var20 - -var9 - 1, -var10 + var9, param5 | -16777216);
                          hk.e(var19 + (var9 + -1), var9 + var20 - 1, -var10 + var9, param5 | -16777216);
                          var18++;
                          continue L10;
                        } else {
                          var18++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                param4--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var7);

            stackIn_34_1 = new StringBuilder().append("mg.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param3 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_31_0;
    }

    final boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        if (1 != (this.field_Rb ^ -1)) {
            return false;
        }
        if (-14 == (wh.field_c ^ -1)) {
            this.field_Rb = -1;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var8 = param2.field_D;
            var3 = var8;
            var4 = param1.field_D;
            var5 = var8.length;
            var6 = param0;
            L1: while (true) {
              if (var6 >= var5) {
                break L0;
              } else {
                L2: {
                  if (0 == var4[var6]) {
                    var8[var6] = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("mg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    private final int a(w param0, int param1, int param2, w param3, int param4, String param5) {
        w var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new w(0L, param0, 0, param1, param2, param4, param5);
            param3.a(var7, -16834);
            param1 += 32;
            stackIn_1_0 = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("mg.M(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(boolean param0, w param1, w param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param3 += 8;
              if (param0) {
                break L1;
              } else {
                field_Ob = (int[][]) null;
                break L1;
              }
            }
            var6_int = param1.field_J.b(param1.field_Y, param4 + -(param1.field_ub * 2), param1.field_Db);
            param1.a(param4, 0, param3, var6_int, 0);
            param2.a(param1, -16834);
            param3 = param3 + (var6_int - 0);
            stackIn_3_0 = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("mg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final int c(int param0, boolean param1) {
        ha stackIn_7_0 = null;
        ha stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        w stackIn_15_0 = null;
        w stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        this.a(false, param1);
        if (param0 == 497) {
          L0: {
            if (null == this.field_Wb) {
              break L0;
            } else {
              L1: {
                this.field_Wb.field_Y = this.field_Ub.toString();
                this.field_Wb.field_vb = (this.field_mb - this.field_Wb.field_J.a(this.field_Wb.field_Y)) / 2;
                this.field_Wb.field_mb = this.field_mb + -this.field_Wb.field_vb;
                if (null == this.field_Qb) {
                  break L1;
                } else {
                  if (0 == this.field_Qb.field_ob) {
                    break L1;
                  } else {
                    L2: {
                      stackIn_7_0 = this.field_Qb;

                      if (this.field_Qb.field_ab) {
                        stackIn_8_0 = (ha) ((Object) stackIn_7_0);
                        stackIn_8_1 = 0;
                        break L2;
                      } else {
                        stackIn_8_0 = (ha) ((Object) stackIn_7_0);
                        stackIn_8_1 = 1;
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
                  if (this.field_Yb[var3] != null) {
                    L4: {
                      stackIn_15_0 = this.field_Yb[var3];

                      if (-1 <= (this.field_Ub.length() ^ -1)) {
                        stackIn_16_0 = (w) ((Object) stackIn_15_0);
                        stackIn_16_1 = 0;
                        break L4;
                      } else {
                        stackIn_16_0 = (w) ((Object) stackIn_15_0);
                        stackIn_16_1 = 1;
                        break L4;
                      }
                    }
                    stackIn_16_0.field_Hb = stackIn_16_1 != 0;
                    if (this.field_Yb[var3].field_Hb) {
                      if (0 != this.field_Yb[var3].field_ob) {
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
          if (-1 == (this.field_ac.field_ob ^ -1)) {
            L5: {
              if (!param1) {
                break L5;
              } else {
                if (0 == ig.field_Yb) {
                  break L5;
                } else {
                  if (0 == this.field_ob) {
                    return -1;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return this.field_Rb;
          } else {
            return -1;
          }
        } else {
          return -95;
        }
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
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
            if (null == this.field_Qb) {
              break L2;
            } else {
              if (!this.field_Qb.field_ab) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final String g(byte param0) {
        if (param0 != -96) {
            field_Nb = true;
        }
        return this.field_Ub.toString();
    }

    final static void b(int param0, boolean param1) {
        je.field_f = param1 ? new ak(ue.field_c, cl.field_n) : new ak(eg.field_b, in.field_o);
        ee.field_i = new w(0L, (w) null);
        ee.field_i.a(je.field_f.field_h, -16834);
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
        StringBuilder discarded$1 = null;
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
        Object stackIn_8_0;
        ha stackIn_8_1;
        ha stackIn_8_2;
        long stackIn_8_3;
        ha stackIn_8_4;
        Object stackIn_9_0;
        ha stackIn_9_1;
        ha stackIn_9_2;
        long stackIn_9_3;
        ha stackIn_9_4;
        String stackIn_9_5;
        w stackIn_15_0 = null;
        w stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15_ref = null;
        this.field_Rb = -2;
        try {
          L0: {
            L1: {
              this.field_Tb = param12;
              this.field_cc = new w(0L, param6, ue.field_a.toUpperCase());
              this.field_cc.field_X = 1;
              this.a(this.field_cc, -16834);
              this.field_ac = new w(0L, param7);
              this.field_cc.a(this.field_ac, -16834);
              this.field_Pb = new w(0L, (w) null);
              this.a(this.field_Pb, -16834);
              if (param11 != null) {
                L2: {
                  L3: {
                    this.field_Xb = new w(0L, param8, ph.field_Hb);
                    this.field_Xb.field_X = 1;
                    this.field_Xb.field_G = 11184810;
                    this.field_Pb.a(this.field_Xb, -16834);
                    this.field_Sb = new w(0L, param8, pc.field_c);
                    this.field_Sb.field_X = 1;
                    this.field_Sb.field_G = 11184810;
                    this.field_Pb.a(this.field_Sb, -16834);
                    this.field_Wb = new w(0L, param8);
                    this.field_Wb.field_G = 16764006;
                    this.field_Pb.a(this.field_Wb, -16834);
                    this.field_Wb.field_T = "|";
                    if ((d.field_b ^ -1) <= -6) {
                      break L3;
                    } else {
                      if ((te.field_p ^ -1) > -3) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackIn_8_0 = this;

                      stackIn_8_1 = null;

                      stackIn_8_2 = null;

                      stackIn_8_3 = 0L;

                      stackIn_8_4 = (ha) (param9);

                      if (-8 >= (d.field_b ^ -1)) {
                        break L5;
                      } else {
                        stackIn_8_0 = this;

                        stackIn_8_1 = null;

                        stackIn_8_2 = null;

                        stackIn_8_4 = (ha) ((Object) stackIn_8_4);

                        if (-3 >= (te.field_p ^ -1)) {
                          break L5;
                        } else {
                          stackIn_9_0 = this;
                          stackIn_9_1 = null;
                          stackIn_9_2 = null;
                          stackIn_9_3 = stackIn_8_3;
                          stackIn_9_4 = (ha) ((Object) stackIn_8_4);
                          stackIn_9_5 = rk.field_bb;
                          break L4;
                        }
                      }
                    }
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_3 = stackIn_8_3;
                    stackIn_9_4 = (ha) ((Object) stackIn_8_4);
                    stackIn_9_5 = si.field_j;
                    break L4;
                  }
                  ((mg) (this)).field_Qb = new ha(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                  this.field_Pb.a(this.field_Qb, -16834);
                  break L2;
                }
                var28 = new w[3];
                var15 = var28;
                var28[0] = new w(0L, (w) null);
                this.field_Pb.a(var28[0], -16834);
                var28[1] = new w(0L, (w) null);
                this.field_Pb.a(var28[1], -16834);
                var28[2] = new w(0L, (w) null);
                this.field_Pb.a(var28[2], -16834);
                this.field_Yb = new w[qb.field_u];
                var16 = 0;
                L6: while (true) {
                  if (var16 >= qb.field_u) {
                    L7: {
                      this.field_Ub = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$1 = this.field_Ub.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_J.a(cf.field_g);
                      if (var17 <= var16) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_J.a(ul.field_a);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_J.a(k.field_d);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (var17 >= qb.field_u) {
                        L12: {
                          if (-141 <= (var16 ^ -1)) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(param6, var18, var16, var28[0], 24, cf.field_g);
                          var18 = this.a(true, this.field_Yb[6], var28[0], var18, var16);
                          var18 = this.a(true, this.field_Yb[9], var28[0], var18, var16);
                          var18 = this.a(true, this.field_Yb[5], var28[0], var18, var16);
                          var18 = this.a(true, this.field_Yb[7], var28[0], var18, var16);
                          var18 = this.a(true, this.field_Yb[15], var28[0], var18, var16);
                          var18 = this.a(true, this.field_Yb[4], var28[0], var18, var16);
                          if (var18 <= var17) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(param6, var18, var16, var28[1], 24, ul.field_a);
                          var18 = this.a(true, this.field_Yb[16], var28[1], var18, var16);
                          var18 = this.a(true, this.field_Yb[17], var28[1], var18, var16);
                          var18 = this.a(true, this.field_Yb[18], var28[1], var18, var16);
                          var18 = this.a(true, this.field_Yb[19], var28[1], var18, var16);
                          var18 = this.a(true, this.field_Yb[20], var28[1], var18, var16);
                          if (var17 >= var18) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(param6, var18, var16, var28[2], 24, k.field_d);
                          var18 = this.a(true, this.field_Yb[13], var28[2], var18, var16);
                          var18 = this.a(true, this.field_Yb[21], var28[2], var18, var16);
                          var18 = this.a(true, this.field_Yb[11], var28[2], var18, var16);
                          if (var17 >= var18) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 3 * var16 - -26;
                          var20 = this.field_cc.a(true);
                          if (var20 <= var19) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (this.field_Qb == null) {
                            break L17;
                          } else {
                            var20 = this.field_Qb.c(4, -4168);
                            if (var19 >= var20) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_cc.a(13 - (-var19 + -13), 0, 0, 24, 0);
                          this.field_ac.a(15, 0, 5, 15, -20 + this.field_cc.field_mb);
                          var21 = 10;
                          this.field_Xb.a(var19, 0, var21, kf.field_O * 2, 13);
                          var21 = var21 + 2 * kf.field_O;
                          this.field_Sb.a(var19, 0, var21, kf.field_O * 2, 13);
                          var21 = var21 + (2 * kf.field_O + 10);
                          this.field_Wb.a(0, 0, var21, kf.field_O, 0);
                          var21 = var21 + (kf.field_O + 10);
                          if (null == this.field_Qb) {
                            break L18;
                          } else {
                            var20 = this.field_Qb.c(4, -4168);
                            this.field_Qb.a(var20, 8, var21, (var19 + -var20) / 2 + 13, 4, kf.field_O);
                            var21 = var21 + (10 + kf.field_O);
                            break L18;
                          }
                        }
                        var28[0].a(var16, 0, var21, var17, 13);
                        var28[1].a(var16, 0, var21, var17, 13 + (var16 + 13));
                        var28[2].a(var16, 0, var21, var17, 2 * var16 + 13 - -26);
                        var22 = var21;
                        this.field_Pb.a(13 - -var19 + 13, 0, 24, 10 + var17 + var22, 0);
                        this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
                        var23 = 13 - -var19 + 13;
                        var24 = 10 + (var22 + (24 + var17));
                        var25 = vh.a(param2, -18265, var23, param0);
                        var26 = o.a(param3, 0, var24, param1);
                        this.a(var23, 0, var26, var24, var25);
                        break L1;
                      } else {
                        L19: {
                          if (this.field_Yb[var17] == null) {
                            break L19;
                          } else {
                            var18 = this.field_Yb[var17].a(true);
                            if (var18 <= var16) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (pn.field_bb[var16] == null) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Yb[var16] = new w(0L, param10, pn.field_bb[var16]);
                          this.field_Yb[var16].field_X = 0;
                          stackIn_15_0 = this.field_Yb[var16];

                          if (param11 == null) {
                            stackIn_16_0 = (w) ((Object) stackIn_15_0);
                            stackIn_16_1 = 0;
                            break L21;
                          } else {
                            stackIn_16_0 = (w) ((Object) stackIn_15_0);
                            stackIn_16_1 = 1;
                            break L21;
                          }
                        }
                        stackIn_16_0.field_Hb = stackIn_16_1 != 0;
                        this.field_Pb.a(this.field_Yb[var16], -16834);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              } else {
                this.field_Xb = new w(0L, param8, hc.field_f);
                this.field_Xb.field_G = 11184810;
                this.field_Xb.field_X = 1;
                this.field_Pb.a(this.field_Xb, -16834);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Xb.field_J.a(this.field_Xb.field_Y, var15_int);
                this.field_Xb.a(var15_int, 0, var16, kf.field_O * var17, 13);
                var16 = var16 + kf.field_O * var17;
                this.field_Pb.a(var15_int + 13 - -13, 0, 24, 10 - -var16, 0);
                this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
                var18 = 26 - -var15_int;
                var19 = var16 + 34;
                var20 = vh.a(param2, -18265, var18, param0);
                var21 = o.a(param3, 0, var19, param1);
                this.a(var18, 0, var21, var19, var20);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15_ref = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var15_ref);

            stackIn_51_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L22;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');

            if (param6 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L23;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param7 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L24;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L24;
            }
          }
          L25: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');

            if (param8 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L25;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');

            if (param9 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L26;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');

            if (param10 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L27;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param11 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L28;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L28;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_52_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    static {
        field_Nb = false;
    }
}
