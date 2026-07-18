/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends bw {
    boolean field_l;
    static boolean field_i;
    static sna field_q;
    int field_o;
    static pia field_h;
    aga field_s;
    static int field_g;
    eaa field_n;
    int field_k;
    int field_j;
    static int[] field_m;
    eaa field_t;
    int field_p;
    int field_r;
    lna field_f;

    final float e(byte param0) {
        int var3 = BachelorFridge.field_y;
        gca var2 = (gca) (Object) ((ad) this).field_n.b((byte) 90);
        if (param0 != -121) {
            int discarded$0 = 0;
            nv discarded$1 = ad.a((sna) null, (jc) null, (sna) null, (sna) null);
        }
        while (var2 != null) {
            if (!(!(var2 instanceof c))) {
                return ((c) (Object) var2).field_j;
            }
            var2 = (gca) (Object) ((ad) this).field_n.c(0);
        }
        return 0.0f;
    }

    final void b(int param0, int param1) {
        ((ad) this).field_f.a((byte) 28, ((ad) this).field_s.field_o.field_b, param1);
        if (param0 != -1) {
            ((ad) this).c((byte) 96);
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
            if (param1 < 7) {
                Object var5 = null;
                ((ad) this).a(-38, 92, (String) null);
            }
            ((ad) this).field_t.a((bw) (Object) new vca((po) (Object) taa.field_u, param2, param0, 4096, 20, 30, 50, (-8 + taa.field_u.field_F) * (-1 + ((ad) this).field_t.g(0)) + 8), true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ad.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_m = null;
        field_h = null;
        if (param0) {
            ad.c(false);
        }
        field_q = null;
    }

    final static boolean a(int param0, int param1) {
        if (!(param1 >= 0)) {
            return 0 == (param1 + 1) % 4 ? true : false;
        }
        if (param1 < 1582) {
            return param1 % 4 == -1 ? true : false;
        }
        if (!(-1 == param1 % 4)) {
            return false;
        }
        if (param1 % 100 != 0) {
            return true;
        }
        if (param0 != 30) {
            field_m = null;
        }
        if (param1 % 400 == 0) {
            return true;
        }
        return false;
    }

    final static nv a(sna param0, jc param1, sna param2, sna param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        nv[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        jc var13_ref_jc = null;
        int var14 = 0;
        int var15 = 0;
        pda var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        nv stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        nv stackOut_24_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (null == param1.field_u) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = param1.field_u.length;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param1.field_q) {
                  stackOut_9_0 = param1.field_q.length;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int - -var6;
                var8 = new String[var7];
                var25 = new char[var7];
                var23 = var25;
                var21 = var23;
                var19 = var21;
                var9 = var19;
                var24 = new int[var7];
                var22 = var24;
                var20 = var22;
                var18 = var20;
                var10 = var18;
                var11 = new nv[var7];
                if (param1.field_u == null) {
                  break L3;
                } else {
                  var12 = 0;
                  L4: while (true) {
                    if (var12 >= param1.field_u.length) {
                      break L3;
                    } else {
                      var13_ref_jc = bga.field_l.a((byte) 105, param1.field_u[var12]);
                      var8[var12] = var13_ref_jc.field_s;
                      var9[var12] = param1.field_p[var12];
                      int discarded$1 = 0;
                      var11[var12] = ad.a(param0, var13_ref_jc, param2, param3);
                      var12++;
                      continue L4;
                    }
                  }
                }
              }
              L5: {
                if (null != param1.field_q) {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L6: while (true) {
                    if (param1.field_q.length <= var14) {
                      break L5;
                    } else {
                      L7: {
                        var15 = param1.field_q[var14];
                        if (var15 != -1) {
                          L8: {
                            var16 = cea.field_h.a(-22834, var15);
                            var8[var14 + var12] = var16.d((byte) 74);
                            var9[var14 + var12] = param1.field_o[var14];
                            if (var9[var12 - -var14] > 0) {
                              break L8;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L8;
                            }
                          }
                          var10[var14 + var12] = param1.field_q[var14];
                          break L7;
                        } else {
                          var8[var12 - -var14] = ci.field_p;
                          var9[var14 + var12] = param1.field_o[var14];
                          var10[var12 - -var14] = param1.field_q[var14];
                          break L7;
                        }
                      }
                      var14++;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
              stackOut_24_0 = new nv(0L, param3, param0, param2, var11, var24, var8, var25);
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (nv) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("ad.E(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + false + ')');
        }
        return stackIn_25_0;
    }

    final static boolean d(byte param0) {
        if (param0 < 7) {
            boolean discarded$0 = ad.a(54, -103);
        }
        return ur.field_d > 250 ? true : false;
    }

    final void c(byte param0) {
        ((ad) this).field_f = ((ad) this).field_s.e((byte) -78);
        ((ad) this).field_f.field_b = ((ad) this).field_s.field_o.field_k.field_b;
        ((ad) this).field_t = new eaa();
        ((ad) this).field_n = new eaa();
        ((ad) this).field_j = ((ad) this).field_s.field_I;
        if (param0 >= -53) {
            ((ad) this).a(124);
        }
        ((ad) this).b(false);
    }

    final void b(boolean param0) {
        lna stackIn_1_0 = null;
        lna stackIn_2_0 = null;
        lna stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        lna stackOut_0_0 = null;
        lna stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        lna stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = ((ad) this).field_f;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (lna) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (lna) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_v = stackIn_3_1 != 0;
          ((ad) this).field_f.field_i = false;
          if (((ad) this).field_s.field_y == 29) {
            break L1;
          } else {
            if (((ad) this).field_s.field_y != 44) {
              L2: {
                if (35 == ((ad) this).field_s.field_y) {
                  ((ad) this).field_f.field_i = true;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((ad) this).field_s.field_y != 42) {
                  break L3;
                } else {
                  ((ad) this).field_f.field_v = true;
                  break L3;
                }
              }
              if (((ad) this).field_s.field_I > 0) {
                ((ad) this).field_f.a((byte) 90, ((ad) this).field_s.field_o.field_b, 0);
                return;
              } else {
                ((ad) this).field_f.a((byte) 125, ((ad) this).field_s.field_o.field_b, 6);
                ((ad) this).field_f.field_u.a((byte) -69);
                return;
              }
            } else {
              break L1;
            }
          }
        }
        ((ad) this).field_f.a((byte) 92, ((ad) this).field_s.field_o.field_b, 18);
    }

    final void a(int param0) {
        int var3 = 0;
        gca var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vca var8 = null;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var7 = BachelorFridge.field_y;
        var8 = (vca) (Object) ((ad) this).field_t.b((byte) 90);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              L2: {
                if (var8.b(false)) {
                  var8.a(false);
                  break L2;
                } else {
                  if (var8.c((byte) 127)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = (vca) (Object) ((ad) this).field_t.c(0);
              continue L0;
            }
          }
          L3: {
            if (((ad) this).field_s.field_I < ((ad) this).field_j) {
              ((ad) this).field_j = ((ad) this).field_j - 1;
              break L3;
            } else {
              if (((ad) this).field_s.field_I > ((ad) this).field_j) {
                ((ad) this).field_j = ((ad) this).field_j + 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (param0 >= 101) {
              break L4;
            } else {
              ad.c(true);
              break L4;
            }
          }
          var3 = 0;
          var4 = (gca) (Object) ((ad) this).field_n.b((byte) 90);
          L5: while (true) {
            if (var4 == null) {
              L6: {
                if (var3 != 0) {
                  break L6;
                } else {
                  if (((ad) this).field_s.field_y != 0) {
                    var4 = nba.a(((ad) this).field_s.field_y, false);
                    if (var4 == null) {
                      break L6;
                    } else {
                      ((ad) this).field_n.a((bw) (Object) var4, true);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              return;
            } else {
              L7: {
                if (((ad) this).field_s.field_y != var4.field_h) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L7;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L7;
                }
              }
              L8: {
                var5 = stackIn_19_0;
                var6 = var4.a(false, var5 != 0) ? 1 : 0;
                if (var5 != 0) {
                  break L8;
                } else {
                  if (var6 == 0) {
                    var4.a(false);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              var4 = (gca) (Object) ((ad) this).field_n.c(0);
              var3 = var3 | var5;
              continue L5;
            }
          }
        }
    }

    ad(aga param0) {
        try {
            ((ad) this).field_s = param0;
            ((ad) this).c((byte) -126);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ad.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_m = new int[]{23, 23, 24, 26, 30};
    }
}
