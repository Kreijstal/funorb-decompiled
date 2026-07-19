/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends o {
    static String field_v;
    static String field_x;
    static bi field_y;
    static int field_t;
    static int field_B;
    static qr field_w;
    private wk field_z;
    static String field_A;
    static nq field_u;
    private wk[] field_C;

    final static void a(int param0, int param1, boolean param2, int param3) {
        es.field_n = param3;
        ah.field_P = param1;
        rm.field_b = param0;
        if (param2) {
            field_w = (qr) null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        vm discarded$2 = null;
        int var4 = 0;
        qr var5 = null;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          if (param1 == -9861) {
            break L0;
          } else {
            var5 = (qr) null;
            discarded$2 = gn.a(122, (si) null, (qr) null, (qr) null, (qr) null);
            break L0;
          }
        }
        L1: {
          if (bq.field_h == null) {
            break L1;
          } else {
            if (13 != oq.field_j) {
              break L1;
            } else {
              bq.field_h = null;
              return true;
            }
          }
        }
        if (sr.field_h) {
          if (!b.d((byte) -97)) {
            return false;
          } else {
            L2: {
              if (!le.a(param0, param2, false)) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            L3: {
              L4: {
                var4 = stackIn_22_0;
                if (80 == oq.field_j) {
                  break L4;
                } else {
                  if (-85 != (oq.field_j ^ -1)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var4 = 1;
              sr.field_h = false;
              break L3;
            }
            L5: {
              if ((oq.field_j ^ -1) != -14) {
                break L5;
              } else {
                qq.c(false);
                var4 = 1;
                sr.field_h = false;
                break L5;
              }
            }
            return var4 != 0;
          }
        } else {
          L6: {
            if (dp.field_t) {
              break L6;
            } else {
              if (oq.field_j == 9) {
                break L6;
              } else {
                if (-11 == (oq.field_j ^ -1)) {
                  break L6;
                } else {
                  if (-12 != (oq.field_j ^ -1)) {
                    L7: {
                      if ((oq.field_j ^ -1) != -81) {
                        break L7;
                      } else {
                        if (!b.d((byte) 108)) {
                          break L7;
                        } else {
                          sr.field_h = true;
                          return true;
                        }
                      }
                    }
                    return false;
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          return dp.a(param1 ^ 9952, param0, param3);
        }
    }

    private final void a(gn param0, boolean param1, int param2) {
        wk dupTemp$25 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        wk var5 = null;
        wk var6 = null;
        int var7 = 0;
        wk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wk stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        wk stackIn_12_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        wk stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        wk stackOut_11_2 = null;
        wk stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        wk stackOut_10_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) 42);
              if (param2 == -21979) {
                break L1;
              } else {
                field_y = (bi) null;
                break L1;
              }
            }
            L2: {
              if (param1) {
                var4_int = 0;
                L3: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    L4: {
                      var5 = this.field_C[var4_int];
                      if (var5 != null) {
                        L5: {
                          var6 = param0.field_C[var4_int];
                          stackOut_9_0 = (wk) (var5);
                          stackOut_9_1 = 42;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var6 == null) {
                            dupTemp$25 = new wk();
                            param0.field_C[var4_int] = dupTemp$25;
                            stackOut_11_0 = (wk) ((Object) stackIn_11_0);
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = (wk) (dupTemp$25);
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            break L5;
                          } else {
                            stackOut_10_0 = (wk) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (wk) (var6);
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            break L5;
                          }
                        }
                        ((wk) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2);
                        break L4;
                      } else {
                        param0.field_C[var4_int] = null;
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                ps.a(this.field_C, 0, param0.field_C, 0, 6);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("gn.J(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, bi param1) {
        wk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wk var5 = null;
        int var6 = 0;
        wk[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -12) {
                break L1;
              } else {
                gn.b(true);
                break L1;
              }
            }
            var7 = this.field_C;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_g = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("gn.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final wk a(int param0, int param1) {
        int var3 = -79 % ((param0 - -42) / 59);
        wk dupTemp$0 = new wk();
        this.field_C[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public gn() {
        this.field_C = new wk[6];
        this.field_z = new wk();
        wk dupTemp$0 = new wk();
        this.field_C[0] = dupTemp$0;
        wk var1 = dupTemp$0;
        var1.a(false);
    }

    gn(gn param0, boolean param1) {
        this();
        try {
            param0.a((gn) (this), param1, -21979);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(boolean param0) {
        vm discarded$0 = null;
        field_u = null;
        field_v = null;
        field_w = null;
        field_A = null;
        field_x = null;
        if (!param0) {
            qr var2 = (qr) null;
            discarded$0 = gn.a(-46, (si) null, (qr) null, (qr) null, (qr) null);
        }
        field_y = null;
    }

    final static vm a(int param0, si param1, qr param2, qr param3, qr param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        vm[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        si var13_ref_si = null;
        int var14 = 0;
        int var15 = 0;
        dp var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        vm stackIn_12_0 = null;
        vm stackIn_28_0 = null;
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
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        vm stackOut_27_0 = null;
        vm stackOut_11_0 = null;
        Object stackOut_2_0 = null;
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
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var17 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param1.field_r != null) {
                  stackOut_6_0 = param1.field_r.length;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null == param1.field_x) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = param1.field_x.length;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var6 = stackIn_10_0;
              var7 = var5_int - -var6;
              var8 = new String[var7];
              if (param0 == 0) {
                L3: {
                  var21 = new char[var7];
                  var19 = var21;
                  var9 = var19;
                  var20 = new int[var7];
                  var18 = var20;
                  var10 = var18;
                  var11 = new vm[var7];
                  if (param1.field_r == null) {
                    break L3;
                  } else {
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= param1.field_r.length) {
                        break L3;
                      } else {
                        var13_ref_si = kq.field_A.a(param1.field_r[var12], (byte) 100);
                        var8[var12] = var13_ref_si.field_t;
                        var9[var12] = param1.field_p[var12];
                        var11[var12] = gn.a(param0 + 0, var13_ref_si, param2, param3, param4);
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
                L5: {
                  if (null != param1.field_x) {
                    var12 = var5_int;
                    var13 = 49;
                    var14 = 0;
                    L6: while (true) {
                      if (var14 >= param1.field_x.length) {
                        break L5;
                      } else {
                        L7: {
                          var15 = param1.field_x[var14];
                          if (-1 == var15) {
                            var8[var12 - -var14] = qh.field_u;
                            var9[var12 + var14] = param1.field_s[var14];
                            var10[var14 + var12] = param1.field_x[var14];
                            break L7;
                          } else {
                            L8: {
                              var16 = dh.field_c.a((byte) 47, var15);
                              var8[var14 + var12] = var16.f(80);
                              var9[var12 + var14] = param1.field_s[var14];
                              if (0 < var9[var12 + var14]) {
                                break L8;
                              } else {
                                var13 = (char)(var13 + 1);
                                var9[var14 + var12] = (char)var13;
                                break L8;
                              }
                            }
                            var10[var12 + var14] = param1.field_x[var14];
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
                stackOut_27_0 = new vm(0L, param2, param4, param3, var11, var20, var8, var21);
                stackIn_28_0 = stackOut_27_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_11_0 = (vm) null;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("gn.C(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          L11: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          L12: {
            stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vm) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_28_0;
          }
        }
    }

    final void a(byte param0, bi[] param1) {
        wk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wk var5 = null;
        int var6 = 0;
        wk[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_C;
              var3 = var7;
              if (param0 == 8) {
                break L1;
              } else {
                field_u = (nq) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_h = param1;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("gn.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void a(bi[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (param2 != 3) {
                field_x = (String) null;
            }
            if (!(this.field_C[var4_int] != null)) {
                this.field_C[var4_int] = new wk();
            }
            this.field_C[param1].field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "gn.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        RuntimeException var6 = null;
        wk var7 = null;
        wk var9 = null;
        bi var10 = null;
        kg var11 = null;
        wk var12 = null;
        wk var13 = null;
        wk var14 = null;
        wk var15 = null;
        vg stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        vg stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof kg)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (vg) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (vg) (param0);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (kg) ((Object) stackIn_3_0);
              ke.a(-6187, param0.field_x + (param1 + param0.field_m), param0.field_n + param0.field_q + param3, param0.field_q + param3, param1 - -param0.field_m);
              if (var11 == null) {
                break L2;
              } else {
                param2 = param2 & var11.field_y;
                break L2;
              }
            }
            L3: {
              var7 = this.field_C[0];
              this.field_z.a(false);
              var7.a(param0, this.field_z, (gn) (this), param1, 0, param3);
              if (var11 == null) {
                break L3;
              } else {
                L4: {
                  if (var11.field_z) {
                    var12 = this.field_C[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(param0, this.field_z, (gn) (this), param1, param4 ^ 12, param3);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var11.field_k) {
                  L5: {
                    var13 = this.field_C[3];
                    if (0 == var11.field_o) {
                      break L5;
                    } else {
                      if (var13 == null) {
                        break L5;
                      } else {
                        var13.a(param0, this.field_z, (gn) (this), param1, param4 + -12, param3);
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_C[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param0, this.field_z, (gn) (this), param1, param4 ^ 12, param3);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (param0.f(1)) {
                var14 = this.field_C[5];
                if (var14 != null) {
                  var14.a(param0, this.field_z, (gn) (this), param1, 0, param3);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param2) {
                var15 = this.field_C[4];
                if (var15 == null) {
                  break L7;
                } else {
                  var15.a(param0, this.field_z, (gn) (this), param1, 0, param3);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              this.field_z.a(param1, true, param0, param3, (gn) (this));
              ln.f((byte) 124);
              if (param4 == 12) {
                break L8;
              } else {
                var10 = (bi) null;
                this.a(100, (bi) null);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var6);
            stackOut_29_1 = new StringBuilder().append("gn.E(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_x = "Click to accept the Non-Agression Pact <%0> is offering.";
        field_B = 0;
        field_v = "Try this now, or press <col=2F5FBF>'ENTER'</col> to continue.";
        field_A = "Hide game chat";
        field_t = 0;
    }
}
