/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends vv {
    static String field_n;
    private int field_i;
    private po field_m;
    static int field_r;
    private int field_l;
    private boolean field_f;
    static kv[] field_g;
    static int field_q;
    static int field_h;
    private int field_o;
    private String field_j;
    private int field_k;
    private int field_p;

    final void a(po param0, String param1, int param2, int param3, int param4) {
        mla var8 = null;
        mla var9 = null;
        if (param1 == null) {
            ((tq) this).field_a = null;
            return;
        }
        if (((tq) this).field_m == param0) {
            if (((tq) this).field_f) {
                if (((tq) this).field_l == 2) {
                    if (null != ((tq) this).field_j) {
                        if (!(!((tq) this).field_j.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((tq) this).field_f = true;
            ((tq) this).field_j = param1;
            ((tq) this).field_l = param4;
            ((tq) this).field_m = param0;
            var8 = this.a(param2, param4 + -30329, param0, param1);
            var9 = var8;
            var9.field_a[0] = param3 - param0.a(param1);
            var9.field_a[param1.length()] = param3;
            jia.a(param0, var9, 0, (byte) -79, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, po param2, String param3, int param4) {
        mla var8 = null;
        int var7 = 0;
        if (!(param3 != null)) {
            ((tq) this).field_a = null;
            return;
        }
        if (param2 == ((tq) this).field_m) {
            if (((tq) this).field_f) {
                if (((tq) this).field_l == 1) {
                    if (null != ((tq) this).field_j) {
                        if (!(!((tq) this).field_j.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((tq) this).field_l = param1;
            ((tq) this).field_f = true;
            ((tq) this).field_m = param2;
            var8 = this.a(param0, -30327, param2, param3);
            var7 = param2.a(param3);
            var8.field_a[0] = param4 + -(var7 >> 1);
            var8.field_a[param3.length()] = (var7 >> 1) + param4;
            jia.a(param2, var8, 0, (byte) -75, param3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tq.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(po param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mla var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        mla stackIn_35_0 = null;
        mla stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        mla stackIn_36_0 = null;
        mla stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        mla stackIn_37_0 = null;
        mla stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        po stackIn_39_0 = null;
        mla stackIn_39_1 = null;
        po stackIn_40_0 = null;
        mla stackIn_40_1 = null;
        po stackIn_41_0 = null;
        mla stackIn_41_1 = null;
        int stackIn_41_2 = 0;
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
        mla stackOut_34_0 = null;
        mla stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        mla stackOut_36_0 = null;
        mla stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        mla stackOut_35_0 = null;
        mla stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        po stackOut_38_0 = null;
        mla stackOut_38_1 = null;
        po stackOut_40_0 = null;
        mla stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        po stackOut_39_0 = null;
        mla stackOut_39_1 = null;
        int stackOut_39_2 = 0;
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
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                param1 = param0.field_F;
                break L1;
              } else {
                break L1;
              }
            }
            if (param4 != null) {
              if (param3 > 40) {
                L2: {
                  if (param0 != ((tq) this).field_m) {
                    break L2;
                  } else {
                    if (((tq) this).field_f) {
                      break L2;
                    } else {
                      if (((tq) this).field_l != param5) {
                        break L2;
                      } else {
                        if (((tq) this).field_i != param2) {
                          break L2;
                        } else {
                          if (param1 != ((tq) this).field_k) {
                            break L2;
                          } else {
                            if (param6 != ((tq) this).field_o) {
                              break L2;
                            } else {
                              if (((tq) this).field_p != param7) {
                                break L2;
                              } else {
                                if (null == ((tq) this).field_j) {
                                  break L2;
                                } else {
                                  if (((tq) this).field_j.equals((Object) (Object) param4)) {
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
                L3: {
                  ((tq) this).field_j = param4;
                  ((tq) this).field_i = param2;
                  ((tq) this).field_f = false;
                  ((tq) this).field_m = param0;
                  ((tq) this).field_o = param6;
                  ((tq) this).field_l = param5;
                  ((tq) this).field_p = param7;
                  ((tq) this).field_k = param1;
                  var16 = new String[param0.b(param4, param7) - -1];
                  var17 = var16;
                  var10 = Math.max(1, param0.a(param4, new int[1], var17));
                  if (((tq) this).field_i != 3) {
                    break L3;
                  } else {
                    if (1 != var10) {
                      break L3;
                    } else {
                      ((tq) this).field_i = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  ((tq) this).field_a = new mla[var10];
                  if (0 != ((tq) this).field_i) {
                    if (1 == ((tq) this).field_i) {
                      var11 = (-(((tq) this).field_k * var10) + ((tq) this).field_o >> 1) + param0.field_u;
                      break L4;
                    } else {
                      if (((tq) this).field_i != 2) {
                        L5: {
                          var12 = (-(((tq) this).field_k * var10) + ((tq) this).field_o) / (1 + var10);
                          if (var12 >= 0) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        var11 = var12 + param0.field_u;
                        ((tq) this).field_k = ((tq) this).field_k + var12;
                        break L4;
                      } else {
                        var11 = -(((tq) this).field_k * var10) + -param0.field_B + ((tq) this).field_o;
                        break L4;
                      }
                    }
                  } else {
                    var11 = param0.field_u;
                    break L4;
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var10) {
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = var11 - param0.field_u;
                      stackOut_34_3 = param0.field_B + var11;
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
                      var14 = new mla(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                      var14.field_a[0] = 0;
                      if (var13 == null) {
                        break L8;
                      } else {
                        L9: {
                          var14.field_a[var13.length()] = param0.a(var13);
                          stackOut_38_0 = (po) param0;
                          stackOut_38_1 = (mla) var14;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          if (param5 != 3) {
                            stackOut_40_0 = (po) (Object) stackIn_40_0;
                            stackOut_40_1 = (mla) (Object) stackIn_40_1;
                            stackOut_40_2 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            break L9;
                          } else {
                            stackOut_39_0 = (po) (Object) stackIn_39_0;
                            stackOut_39_1 = (mla) (Object) stackIn_39_1;
                            stackOut_39_2 = ((tq) this).a(-1, var13, param0.a(var13), param7);
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_41_2 = stackOut_39_2;
                            break L9;
                          }
                        }
                        jia.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, (byte) -96, var13);
                        break L8;
                      }
                    }
                    var11 = var11 + param1;
                    ((tq) this).field_a[var12] = var14;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                return;
              }
            } else {
              ((tq) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var9;
            stackOut_44_1 = new StringBuilder().append("tq.F(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
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
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param4 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final mla a(int param0, int param1, po param2, String param3) {
        mla var5 = null;
        RuntimeException var5_ref = null;
        mla var6 = null;
        mla stackIn_3_0 = null;
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
        mla stackOut_2_0 = null;
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
              var6 = new mla(param0 - param2.field_u, param2.field_B + param0, param3.length());
              var5 = var6;
              ((tq) this).field_a = new mla[]{var6};
              if (param1 == -30327) {
                break L1;
              } else {
                ((tq) this).field_k = -62;
                break L1;
              }
            }
            stackOut_2_0 = (mla) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("tq.C(").append(param0).append(',').append(param1).append(',');
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, po param2, int param3, int param4) {
        mla var7 = null;
        mla var8 = null;
        if (param1 == null) {
            ((tq) this).field_a = null;
            return;
        }
        if (((tq) this).field_m == param2) {
            if (((tq) this).field_f) {
                if (((tq) this).field_l == 0) {
                    if (null != ((tq) this).field_j) {
                        if (!(!((tq) this).field_j.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((tq) this).field_f = true;
            ((tq) this).field_m = param2;
            ((tq) this).field_j = param1;
            ((tq) this).field_l = 0;
            var7 = this.a(param3, param0 ^ -30327, param2, param1);
            var8 = var7;
            var7.field_a[0] = param4;
            var8.field_a[param1.length()] = param4 - -param2.a(param1);
            jia.a(param2, var8, param0, (byte) -109, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_n = null;
    }

    public tq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Log in";
    }
}
