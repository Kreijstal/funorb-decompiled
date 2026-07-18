/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends vk {
    private bd field_t;
    static pb field_s;
    private int field_o;
    static String[] field_g;
    static lj field_e;
    static int[] field_u;
    private int field_n;
    private String field_m;
    private int field_k;
    static vi field_h;
    private boolean field_r;
    static int field_q;
    static long[] field_j;
    static long[][] field_l;
    private int field_v;
    static va field_f;
    private int field_i;
    static String field_p;

    final void a(boolean param0, String param1, int param2, int param3, bd param4) {
        uj var8 = null;
        int var7 = 0;
        if (!(param1 != null)) {
            ((pd) this).field_a = null;
            return;
        }
        if (param4 == ((pd) this).field_t) {
            if (((pd) this).field_r) {
                if (((pd) this).field_o == 1) {
                    if (null != ((pd) this).field_m) {
                        if (!(!((pd) this).field_m.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((pd) this).field_t = param4;
            ((pd) this).field_r = param0 ? true : false;
            ((pd) this).field_o = 1;
            var8 = this.a(param2, !param0 ? true : false, param1, param4);
            var7 = param4.b(param1);
            var8.field_a[0] = -(var7 >> 1) + param3;
            var8.field_a[param1.length()] = (var7 >> 1) + param3;
            mh.a(1, 0, param1, var8, param4);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pd.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, bd param4, int param5, String param6, byte param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        uj var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        uj stackIn_35_0 = null;
        uj stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        uj stackIn_36_0 = null;
        uj stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        uj stackIn_37_0 = null;
        uj stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
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
        uj stackOut_34_0 = null;
        uj stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        uj stackOut_36_0 = null;
        uj stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        uj stackOut_35_0 = null;
        uj stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
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
        var15 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                param1 = param4.field_v;
                break L1;
              } else {
                break L1;
              }
            }
            if (param6 != null) {
              L2: {
                if (param7 < -32) {
                  break L2;
                } else {
                  var16 = null;
                  ((pd) this).a(-57, -104, 68, -43, (bd) null, -58, (String) null, (byte) -4);
                  break L2;
                }
              }
              L3: {
                if (((pd) this).field_t != param4) {
                  break L3;
                } else {
                  if (((pd) this).field_r) {
                    break L3;
                  } else {
                    if (((pd) this).field_o != param3) {
                      break L3;
                    } else {
                      if (~param0 != ~((pd) this).field_i) {
                        break L3;
                      } else {
                        if (~((pd) this).field_k != ~param1) {
                          break L3;
                        } else {
                          if (param5 != ((pd) this).field_n) {
                            break L3;
                          } else {
                            if (~param2 != ~((pd) this).field_v) {
                              break L3;
                            } else {
                              if (null == ((pd) this).field_m) {
                                break L3;
                              } else {
                                if (((pd) this).field_m.equals((Object) (Object) param6)) {
                                  return;
                                } else {
                                  break L3;
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
              L4: {
                ((pd) this).field_t = param4;
                ((pd) this).field_n = param5;
                ((pd) this).field_m = param6;
                ((pd) this).field_k = param1;
                ((pd) this).field_v = param2;
                ((pd) this).field_r = false;
                ((pd) this).field_i = param0;
                ((pd) this).field_o = param3;
                var17 = new String[param4.c(param6, param2) - -1];
                var18 = var17;
                var10 = Math.max(1, param4.a(param6, new int[1], var18));
                if (((pd) this).field_i != 3) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    ((pd) this).field_i = 1;
                    break L4;
                  }
                }
              }
              L5: {
                ((pd) this).field_a = new uj[var10];
                if (((pd) this).field_i == 0) {
                  var11 = param4.field_N;
                  break L5;
                } else {
                  if (((pd) this).field_i == 1) {
                    var11 = (-(var10 * ((pd) this).field_k) + ((pd) this).field_n >> 1) + param4.field_N;
                    break L5;
                  } else {
                    if (((pd) this).field_i == 2) {
                      var11 = -(((pd) this).field_k * var10) + -param4.field_r + ((pd) this).field_n;
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(((pd) this).field_k * var10) + ((pd) this).field_n) / (1 + var10);
                        if (0 <= var12) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      ((pd) this).field_k = ((pd) this).field_k + var12;
                      var11 = param4.field_N - -var12;
                      break L5;
                    }
                  }
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var10 <= var12) {
                  break L0;
                } else {
                  L8: {
                    var13 = var17[var12];
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = -param4.field_N + var11;
                    stackOut_34_3 = var11 - -param4.field_r;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    if (var13 != null) {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = var13.length();
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      stackIn_37_4 = stackOut_36_4;
                      break L8;
                    } else {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = 0;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_37_4 = stackOut_35_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new uj(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                    var14.field_a[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_a[var13.length()] = param4.b(var13);
                        stackOut_38_0 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_39_0 = stackOut_38_0;
                        if (param3 != 3) {
                          stackOut_40_0 = stackIn_40_0;
                          stackOut_40_1 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          break L10;
                        } else {
                          stackOut_39_0 = stackIn_39_0;
                          stackOut_39_1 = ((pd) this).a(var13, false, param2, param4.b(var13));
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          break L10;
                        }
                      }
                      mh.a(stackIn_41_0, stackIn_41_1, var13, var14, param4);
                      break L9;
                    }
                  }
                  var11 = var11 + param1;
                  ((pd) this).field_a[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            } else {
              ((pd) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var9;
            stackOut_44_1 = new StringBuilder().append("pd.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param4 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          L12: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param5).append(',');
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
              break L12;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L12;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param7 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, byte param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              if (param3 < -14) {
                var4 = param0.getGraphics();
                field_h.a(param1, var4, -22984, param2);
                var4.dispose();
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              var4_ref = (Exception) (Object) decompiledCaughtException;
              param0.repaint();
              break L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("pd.K(");
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
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, bd param1, String param2, int param3, int param4) {
        uj var7 = null;
        uj var8 = null;
        if (param2 == null) {
            ((pd) this).field_a = null;
            return;
        }
        if (((pd) this).field_t == param1) {
            if (((pd) this).field_r) {
                if (((pd) this).field_o == 0) {
                    if (((pd) this).field_m != null) {
                        if (!(!((pd) this).field_m.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((pd) this).field_m = param2;
            ((pd) this).field_r = true;
            ((pd) this).field_t = param1;
            ((pd) this).field_o = 0;
            var7 = this.a(param4, false, param2, param1);
            var8 = var7;
            var7.field_a[param3] = param0;
            var8.field_a[param2.length()] = param1.b(param2) + param0;
            mh.a(param3 + 1, 0, param2, var8, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pd.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, bd param1, int param2, String param3, byte param4) {
        uj var8 = null;
        uj var9 = null;
        if (param3 == null) {
            ((pd) this).field_a = null;
            return;
        }
        if (param1 == ((pd) this).field_t) {
            if (((pd) this).field_r) {
                if (((pd) this).field_o == 2) {
                    if (((pd) this).field_m != null) {
                        if (((pd) this).field_m.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((pd) this).field_t = param1;
            ((pd) this).field_m = param3;
            ((pd) this).field_o = 2;
            ((pd) this).field_r = true;
            if (param4 != 22) {
                field_h = null;
            }
            var8 = this.a(param2, false, param3, param1);
            var9 = var8;
            var9.field_a[0] = param0 - param1.b(param3);
            var9.field_a[param3.length()] = param0;
            mh.a(1, 0, param3, var9, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pd.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final uj a(int param0, boolean param1, String param2, bd param3) {
        uj var5 = null;
        RuntimeException var5_ref = null;
        uj var6 = null;
        uj stackIn_3_0 = null;
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
        uj stackOut_2_0 = null;
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
              var6 = new uj(param0 - param3.field_N, param0 - -param3.field_r, param2.length());
              var5 = var6;
              ((pd) this).field_a = new uj[]{var6};
              if (!param1) {
                break L1;
              } else {
                ((pd) this).field_t = null;
                break L1;
              }
            }
            stackOut_2_0 = (uj) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("pd.M(").append(param0).append(',').append(param1).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, hk param1, int param2) {
        ha var3 = null;
        try {
            var3 = pg.field_fb;
            var3.f(param0, 950);
            var3.a(false, 5);
            if (param2 < 1) {
                field_u = null;
            }
            var3.a(false, 0);
            var3.c(param1.field_t, -128);
            var3.a(false, param1.field_q);
            var3.a(false, param1.field_r);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pd.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_j = null;
        field_p = null;
        field_f = null;
        field_s = null;
        field_e = null;
        field_l = null;
        field_g = null;
        field_h = null;
        field_u = null;
    }

    public pd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_s = new pb(270, 70);
        field_l = new long[8][256];
        field_j = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_j[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (var15 > 10) {
                field_p = "No highscores";
                return;
              } else {
                var1 = 8 * (-1 + var15);
                field_j[var15] = ue.a(ue.a(ue.a(ue.a(ue.a(ue.a(stellarshard.a(field_l[2][var1 - -2], 280375465082880L), ue.a(stellarshard.a(-72057594037927936L, field_l[0][var1]), stellarshard.a(71776119061217280L, field_l[1][1 + var1]))), stellarshard.a(field_l[3][var1 - -3], 1095216660480L)), stellarshard.a(4278190080L, field_l[4][var1 - -4])), stellarshard.a(16711680L, field_l[5][5 + var1])), stellarshard.a(field_l[6][6 + var1], 65280L)), stellarshard.a(field_l[7][7 + var1], 255L));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (var0 & 1)) {
                stackOut_4_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (var4 < 256L) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_l[0][var0] = ib.a(ib.a(ib.a(var8 << 16, ib.a(ib.a(var2 << 32, ib.a(ib.a(var2 << 56, var2 << 48), var6 << 40)), var10 << 24)), var4 << 8), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_l[var14][var0] = ib.a(field_l[var14 + -1][var0] >>> 8, field_l[-1 + var14][var0] << 56);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
