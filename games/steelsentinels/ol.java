/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends gh {
    private gh field_Yb;
    static ul field_Vb;
    static String field_Xb;
    static String field_Zb;
    static dj field_Sb;
    static gk field_Wb;
    static c field_ac;
    static id field_Tb;
    static int[][] field_cc;
    static int field_bc;
    static int field_Ub;
    static int field_dc;

    final static qb d() {
        int fieldTemp$0 = mg.field_hc - 1;
        mg.field_hc = mg.field_hc - 1;
        if (!(0 <= fieldTemp$0)) {
            mg.field_hc = mg.field_hc + 10000;
        }
        int var1 = 0;
        return k.field_Cb[mg.field_hc];
    }

    final static void l(int param0) {
        int discarded$3 = 1;
        jf.c();
        if (param0 != 0) {
            field_bc = 91;
        }
    }

    final static boolean j(int param0) {
        if (param0 == 0) {
          if (nj.field_Q >= 20) {
            if (ri.c(6995)) {
              if (ua.field_o > 0) {
                int discarded$8 = 105;
                if (a.a()) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ol.l(15);
          if (nj.field_Q >= 20) {
            if (ri.c(6995)) {
              if (ua.field_o > 0) {
                int discarded$9 = 105;
                if (a.a()) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param0 - -param2) <= pb.field_j) {
            return param0 - -param2;
        }
        if (!(0 > param0 - param3)) {
            return -param3 + param0;
        }
        return pb.field_j + -param3;
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (0 != (param0[param1 >> 5] & 1 << (param1 & 31))) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ol.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + 31 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static ud a() {
        ud var4 = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var4 = (ud) (Object) uf.field_f.e(13058);
        L0: while (true) {
          if (var4 != null) {
            if (var4.field_t == 0) {
              return var4;
            } else {
              var4 = (ud) (Object) uf.field_f.a((byte) -86);
              continue L0;
            }
          } else {
            var4 = new ud();
            var4.field_u = 10;
            var4.field_t = 0;
            uf.field_f.a(3, (ck) (Object) var4);
            r.a(27153, var4, 7);
            return var4;
          }
        }
    }

    public static void k() {
        field_Xb = null;
        field_cc = null;
        field_Sb = null;
        field_ac = null;
        field_Zb = null;
        field_Wb = null;
        field_Vb = null;
        field_Tb = null;
    }

    final boolean b(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 <= -125) {
          ((ol) this).a((byte) 11, true);
          if (0 == lb.field_gc) {
            if (0 != ((ol) this).field_Yb.field_Eb) {
              return true;
            } else {
              return false;
            }
          } else {
            if (((ol) this).field_Eb != 0) {
              L0: {
                if (0 == ((ol) this).field_Yb.field_Eb) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          field_ac = null;
          ((ol) this).a((byte) 11, true);
          if (0 != lb.field_gc) {
            if (((ol) this).field_Eb == 0) {
              return true;
            } else {
              L1: {
                if (0 == ((ol) this).field_Yb.field_Eb) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (0 == ((ol) this).field_Yb.field_Eb) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    ol(gh param0, gh param1, gh param2, gh param3, gh param4, gh param5) {
        RuntimeException var7 = null;
        gh var8 = null;
        gh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gh var13 = null;
        gh var14 = null;
        int var15 = 0;
        gh var17 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var17 = new gh(0L, param1, od.field_b.toUpperCase());
            var17.field_Kb = 1;
            ((ol) this).field_Yb = new gh(0L, param2);
            var8 = new gh(0L, param3);
            var9 = new gh(0L, param3, od.field_f);
            var9.field_Kb = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (h.field_X.length <= var12) {
                var17.a(0, 0, 24, 0, 90 + (var11 + 20));
                var10 += 15;
                ((ol) this).a(0, 100, var10 - -var17.field_Lb, 100, var17.field_zb);
                ((ol) this).field_Yb.a(0, 5, 15, var17.field_zb + -20, 15);
                var8.a(0, var17.field_Lb, ((ol) this).field_Lb + -var17.field_Lb, 0, ((ol) this).field_zb);
                var9.a(0, 20, 15, 0, ((ol) this).field_zb);
                var8.field_I = se.a(3, 2105376, 11579568, var8.field_Lb, 8421504, 13574);
                var17.a(((ol) this).field_Yb, 127);
                var8.a(var9, 119);
                ((ol) this).a(var17, 123);
                ((ol) this).a(var8, 119);
                ((ol) this).field_Y = 320 - (((ol) this).field_zb >> 1);
                var10 = -(((ol) this).field_Lb >> 1) + 240;
                break L0;
              } else {
                L2: {
                  var13 = new gh(0L, param3, ci.field_b[var12]);
                  var14 = new gh(0L, param3, h.field_X[var12]);
                  var15 = param3.field_L.c(h.field_X[var12]);
                  var13.a(0, var10, 15, 20, 65);
                  if (var11 >= var15) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.a(0, var10, 15, 90, 640);
                var8.a(var13, 127);
                var8.a(var14, 120);
                var10 += 30;
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("ol.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final static void b(boolean param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (pm.field_T == vb.field_g) {
              return;
            } else {
              L1: {
                if (d.a(pm.field_T, 0)) {
                  i.field_e[pm.field_T].s(126);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (pm.field_T == 14) {
                  int discarded$2 = 3;
                  um.f();
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                pm.field_T = vb.field_g;
                pc.field_w = ea.field_k;
                if (pm.field_T != -3) {
                  break L3;
                } else {
                  vl.field_v = false;
                  break L3;
                }
              }
              L4: {
                pm.field_U = 0;
                if (lc.field_e) {
                  L5: {
                    if (me.field_f != ml.field_g) {
                      jn.a(true, (byte) 71, 200, me.field_f);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (fk.field_i == null) {
                      break L6;
                    } else {
                      fk.field_i.f((byte) -92);
                      break L6;
                    }
                  }
                  L7: {
                    if (null != si.field_A) {
                      si.field_A.f((byte) -93);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  fk.field_i = null;
                  si.field_A = null;
                  lc.field_e = false;
                  break L4;
                } else {
                  break L4;
                }
              }
              L8: {
                if (!td.field_Sb) {
                  break L8;
                } else {
                  lc.field_c = null;
                  un.field_b = new ul();
                  var13 = ge.field_m;
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var4 = var7;
                  var1_array = var4;
                  var2 = 0;
                  L9: while (true) {
                    if (8 <= var2) {
                      var14 = ce.field_t;
                      var12 = var14;
                      var10 = var12;
                      var8 = var10;
                      var5 = var8;
                      var1_array = var5;
                      var6 = 0;
                      var2 = var6;
                      L10: while (true) {
                        if (8 <= var6) {
                          td.field_Sb = false;
                          break L8;
                        } else {
                          var14[var6] = 0;
                          var6++;
                          continue L10;
                        }
                      }
                    } else {
                      var13[var2] = 0;
                      var2++;
                      continue L9;
                    }
                  }
                }
              }
              if (param0) {
                L11: {
                  if (!jc.field_d) {
                    break L11;
                  } else {
                    oa.f(-12161);
                    im.a(true);
                    int discarded$3 = 1;
                    ub.a();
                    jc.field_d = false;
                    break L11;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ol.G(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Xb = "EXCLUSIVE";
        field_Vb = new ul();
        field_Zb = "Not yet achieved";
        field_Sb = new dj(2);
        field_bc = -1;
        field_Ub = 0;
        field_dc = 0;
    }
}
