/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st extends iq {
    private int field_k;
    private int field_l;
    private hu field_g;
    private boolean field_h;
    private int field_n;
    private String field_p;
    static ld field_j;
    static ut field_q;
    private int field_e;
    static String field_m;
    static String field_o;
    private int field_i;
    static String field_d;
    static String field_f;

    final static void a(nu param0, int param1, int param2) {
        try {
            vl.field_d = true;
            gp.field_i = -pq.field_Q.field_o;
            bm.field_I = 0;
            mk.field_c = param1;
            iu.field_i = param2;
            tb.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "st.P(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static int[] c(int param0) {
        return new int[8];
    }

    private final qj a(int param0, boolean param1, hu param2, String param3) {
        qj var5 = null;
        RuntimeException var5_ref = null;
        qj var6 = null;
        qj stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        qj stackOut_2_0 = null;
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
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            var6 = new qj(param0 - param2.field_G, param2.field_p + param0, param3.length());
            var5 = var6;
            ((st) this).field_c = new qj[]{var6};
            stackOut_2_0 = (qj) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("st.J(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, byte param2, hu param3, int param4) {
        qj var8 = null;
        qj var9 = null;
        if (param1 == null) {
            ((st) this).field_c = null;
            return;
        }
        if (((st) this).field_g == param3) {
            if (((st) this).field_h) {
                if (((st) this).field_l == 0) {
                    if (((st) this).field_p != null) {
                        if (!(!((st) this).field_p.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((st) this).field_h = true;
            ((st) this).field_p = param1;
            ((st) this).field_g = param3;
            ((st) this).field_l = 0;
            var8 = this.a(param4, true, param3, param1);
            var9 = var8;
            var8.field_b[0] = param0;
            var9.field_b[param1.length()] = param3.a(param1) + param0;
            if (param2 != 80) {
                Object var7 = null;
                st.a((nu) null, -19, 117);
            }
            is.a(param3, param1, var9, 0, -1942293368);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "st.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final void a(int param0, hu param1, int param2, int param3, int param4, byte param5, String param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        qj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        qj stackIn_35_0 = null;
        qj stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        qj stackIn_36_0 = null;
        qj stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        qj stackIn_37_0 = null;
        qj stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        hu stackIn_39_0 = null;
        String stackIn_39_1 = null;
        qj stackIn_39_2 = null;
        hu stackIn_40_0 = null;
        String stackIn_40_1 = null;
        qj stackIn_40_2 = null;
        hu stackIn_41_0 = null;
        String stackIn_41_1 = null;
        qj stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_34_0 = null;
        qj stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        qj stackOut_36_0 = null;
        qj stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        qj stackOut_35_0 = null;
        qj stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        hu stackOut_38_0 = null;
        String stackOut_38_1 = null;
        qj stackOut_38_2 = null;
        hu stackOut_40_0 = null;
        String stackOut_40_1 = null;
        qj stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        hu stackOut_39_0 = null;
        String stackOut_39_1 = null;
        qj stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param7 != 0) {
                break L1;
              } else {
                param7 = param1.field_x;
                break L1;
              }
            }
            if (param6 == null) {
              ((st) this).field_c = null;
              return;
            } else {
              L2: {
                if (((st) this).field_g != param1) {
                  break L2;
                } else {
                  if (((st) this).field_h) {
                    break L2;
                  } else {
                    if (((st) this).field_l != param4) {
                      break L2;
                    } else {
                      if (param2 != ((st) this).field_n) {
                        break L2;
                      } else {
                        if (param7 != ((st) this).field_i) {
                          break L2;
                        } else {
                          if (param3 != ((st) this).field_k) {
                            break L2;
                          } else {
                            if (param0 != ((st) this).field_e) {
                              break L2;
                            } else {
                              if (((st) this).field_p == null) {
                                break L2;
                              } else {
                                if (((st) this).field_p.equals((Object) (Object) param6)) {
                                  return;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              ((st) this).field_i = param7;
              ((st) this).field_h = false;
              ((st) this).field_n = param2;
              ((st) this).field_e = param0;
              ((st) this).field_l = param4;
              ((st) this).field_g = param1;
              ((st) this).field_p = param6;
              ((st) this).field_k = param3;
              var16 = new String[1 + param1.b(param6, param0)];
              var17 = var16;
              var10 = Math.max(1, param1.a(param6, new int[1], var17));
              if (param5 >= 89) {
                L3: {
                  if (((st) this).field_n != 3) {
                    break L3;
                  } else {
                    if (var10 != 1) {
                      break L3;
                    } else {
                      ((st) this).field_n = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  ((st) this).field_c = new qj[var10];
                  if (((st) this).field_n != 0) {
                    if (((st) this).field_n == 1) {
                      var11 = (((st) this).field_k + -(var10 * ((st) this).field_i) >> 1) + param1.field_G;
                      break L4;
                    } else {
                      if (((st) this).field_n != 2) {
                        L5: {
                          var12 = (((st) this).field_k - var10 * ((st) this).field_i) / (1 + var10);
                          if (0 <= var12) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        ((st) this).field_i = ((st) this).field_i + var12;
                        var11 = param1.field_G - -var12;
                        break L4;
                      } else {
                        var11 = -param1.field_p + ((st) this).field_k + -(var10 * ((st) this).field_i);
                        break L4;
                      }
                    }
                  } else {
                    var11 = param1.field_G;
                    break L4;
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (var10 <= var12) {
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = -param1.field_G + var11;
                      stackOut_34_3 = var11 + param1.field_p;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      stackIn_35_3 = stackOut_34_3;
                      if (var13 == null) {
                        stackOut_36_0 = null;
                        stackOut_36_1 = null;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = stackIn_36_3;
                        stackOut_36_4 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        stackIn_37_4 = stackOut_36_4;
                        break L7;
                      } else {
                        stackOut_35_0 = null;
                        stackOut_35_1 = null;
                        stackOut_35_2 = stackIn_35_2;
                        stackOut_35_3 = stackIn_35_3;
                        stackOut_35_4 = var13.length();
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        stackIn_37_3 = stackOut_35_3;
                        stackIn_37_4 = stackOut_35_4;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new qj(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                      var14.field_b[0] = 0;
                      if (var13 == null) {
                        break L8;
                      } else {
                        L9: {
                          var14.field_b[var13.length()] = param1.a(var13);
                          stackOut_38_0 = (hu) param1;
                          stackOut_38_1 = (String) var13;
                          stackOut_38_2 = (qj) var14;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          if (param4 == 3) {
                            stackOut_40_0 = (hu) (Object) stackIn_40_0;
                            stackOut_40_1 = (String) (Object) stackIn_40_1;
                            stackOut_40_2 = (qj) (Object) stackIn_40_2;
                            stackOut_40_3 = ((st) this).a(param0, -61, param1.a(var13), var13);
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            stackIn_41_3 = stackOut_40_3;
                            break L9;
                          } else {
                            stackOut_39_0 = (hu) (Object) stackIn_39_0;
                            stackOut_39_1 = (String) (Object) stackIn_39_1;
                            stackOut_39_2 = (qj) (Object) stackIn_39_2;
                            stackOut_39_3 = 0;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_41_2 = stackOut_39_2;
                            stackIn_41_3 = stackOut_39_3;
                            break L9;
                          }
                        }
                        is.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, stackIn_41_3, -1942293368);
                        break L8;
                      }
                    }
                    var11 = var11 + param7;
                    ((st) this).field_c[var12] = var14;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var9;
            stackOut_44_1 = new StringBuilder().append("st.L(").append(param0).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          L11: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param6 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param7 + 41);
        }
    }

    final void a(byte param0, String param1, int param2, int param3, hu param4) {
        qj var8 = null;
        qj var9 = null;
        if (param1 == null) {
            ((st) this).field_c = null;
            return;
        }
        if (param4 == ((st) this).field_g) {
            if (((st) this).field_h) {
                if (((st) this).field_l == 2) {
                    if (null != ((st) this).field_p) {
                        if (!(!((st) this).field_p.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((st) this).field_p = param1;
        ((st) this).field_h = true;
        ((st) this).field_g = param4;
        ((st) this).field_l = 2;
        if (param0 < 120) {
            return;
        }
        try {
            var8 = this.a(param2, true, param4, param1);
            var9 = var8;
            var9.field_b[0] = -param4.a(param1) + param3;
            var9.field_b[param1.length()] = param3;
            is.a(param4, param1, var9, 0, -1942293368);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "st.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(byte param0) {
        field_j = null;
        field_f = null;
        if (param0 != -103) {
            return;
        }
        field_o = null;
        field_d = null;
        field_m = null;
        field_q = null;
    }

    final void a(int param0, int param1, hu param2, String param3, int param4) {
        qj var8 = null;
        int var7 = 0;
        if (!(param3 != null)) {
            ((st) this).field_c = null;
            return;
        }
        if (param2 == ((st) this).field_g) {
            if (((st) this).field_h) {
                if (((st) this).field_l == 1) {
                    if (null != ((st) this).field_p) {
                        if (!(!((st) this).field_p.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((st) this).field_l = param0;
            ((st) this).field_h = true;
            ((st) this).field_g = param2;
            var8 = this.a(param4, true, param2, param3);
            var7 = param2.a(param3);
            var8.field_b[0] = param1 + -(var7 >> 1);
            var8.field_b[param3.length()] = (var7 >> 1) + param1;
            is.a(param2, param3, var8, 0, -1942293368);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "st.Q(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void b(int param0, int param1, int param2) {
        gp.field_i = param0;
        if (param1 < 76) {
            field_d = null;
            hq.field_d = param2;
            return;
        }
        hq.field_d = param2;
    }

    public st() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ld();
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_m = null;
        field_d = "Loading models";
        field_f = "Quick Chat game";
    }
}
