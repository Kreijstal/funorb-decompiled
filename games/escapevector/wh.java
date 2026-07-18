/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends pg {
    private wl field_i;
    private boolean field_n;
    static int[] field_j;
    private String field_g;
    private int field_m;
    private int field_l;
    static tk field_p;
    private int field_k;
    private int field_o;
    private int field_h;

    final void a(wl param0, String param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        vl var8 = null;
        vl var9 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 69) {
                break L1;
              } else {
                var7 = null;
                vl discarded$2 = this.a((String) null, 107, 116, (wl) null);
                break L1;
              }
            }
            if (param1 == null) {
              ((wh) this).field_a = null;
              return;
            } else {
              L2: {
                if (param0 != ((wh) this).field_i) {
                  break L2;
                } else {
                  if (!((wh) this).field_n) {
                    break L2;
                  } else {
                    if (((wh) this).field_l != 2) {
                      break L2;
                    } else {
                      if (null == ((wh) this).field_g) {
                        break L2;
                      } else {
                        if (!((wh) this).field_g.equals((Object) (Object) param1)) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              ((wh) this).field_l = 2;
              ((wh) this).field_n = true;
              ((wh) this).field_g = param1;
              ((wh) this).field_i = param0;
              var8 = this.a(param1, param3, 116, param0);
              var9 = var8;
              var9.field_b[0] = -param0.b(param1) + param2;
              var8.field_b[param1.length()] = param2;
              int discarded$3 = 0;
              vi.a(0, param1, var9, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("wh.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final vl a(String param0, int param1, int param2, wl param3) {
        vl var5 = null;
        RuntimeException var5_ref = null;
        vl var6 = null;
        vl stackIn_3_0 = null;
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
        vl stackOut_2_0 = null;
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
              var6 = new vl(-param3.field_r + param1, param1 + param3.field_x, param0.length());
              var5 = var6;
              if (param2 > 112) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            ((wh) this).field_a = new vl[]{var6};
            stackOut_2_0 = (vl) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("wh.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, wl param2, int param3, int param4, int param5, int param6, byte param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        vl var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        vl stackIn_34_0 = null;
        vl stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        vl stackIn_35_0 = null;
        vl stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        vl stackIn_36_0 = null;
        vl stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_33_0 = null;
        vl stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        vl stackOut_35_0 = null;
        vl stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        vl stackOut_34_0 = null;
        vl stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var16 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param6 != 0) {
                break L1;
              } else {
                param6 = param2.field_y;
                break L1;
              }
            }
            if (param1 == null) {
              ((wh) this).field_a = null;
              return;
            } else {
              L2: {
                if (((wh) this).field_i != param2) {
                  break L2;
                } else {
                  if (((wh) this).field_n) {
                    break L2;
                  } else {
                    if (param4 != ((wh) this).field_l) {
                      break L2;
                    } else {
                      if (~param5 != ~((wh) this).field_h) {
                        break L2;
                      } else {
                        if (((wh) this).field_k != param6) {
                          break L2;
                        } else {
                          if (((wh) this).field_m != param0) {
                            break L2;
                          } else {
                            if (~param3 != ~((wh) this).field_o) {
                              break L2;
                            } else {
                              if (null == ((wh) this).field_g) {
                                break L2;
                              } else {
                                if (((wh) this).field_g.equals((Object) (Object) param1)) {
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
                ((wh) this).field_g = param1;
                ((wh) this).field_h = param5;
                ((wh) this).field_k = param6;
                ((wh) this).field_m = param0;
                ((wh) this).field_i = param2;
                ((wh) this).field_l = param4;
                ((wh) this).field_o = param3;
                ((wh) this).field_n = false;
                var17 = new String[param2.a(param1, param3) - -1];
                var18 = var17;
                var10 = Math.max(1, param2.a(param1, new int[1], var18));
                var12 = 55 / ((param7 - 65) / 32);
                if (((wh) this).field_h != 3) {
                  break L3;
                } else {
                  if (var10 != 1) {
                    break L3;
                  } else {
                    ((wh) this).field_h = 1;
                    break L3;
                  }
                }
              }
              L4: {
                ((wh) this).field_a = new vl[var10];
                if (((wh) this).field_h == 0) {
                  var11 = param2.field_r;
                  break L4;
                } else {
                  if (((wh) this).field_h != 1) {
                    if (2 != ((wh) this).field_h) {
                      L5: {
                        var13 = (-(var10 * ((wh) this).field_k) + ((wh) this).field_m) / (var10 + 1);
                        if (0 > var13) {
                          var13 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ((wh) this).field_k = ((wh) this).field_k + var13;
                      var11 = param2.field_r + var13;
                      break L4;
                    } else {
                      var11 = -param2.field_x + (((wh) this).field_m - var10 * ((wh) this).field_k);
                      break L4;
                    }
                  } else {
                    var11 = (-(((wh) this).field_k * var10) + ((wh) this).field_m >> 1) + param2.field_r;
                    break L4;
                  }
                }
              }
              var13 = 0;
              L6: while (true) {
                if (~var10 >= ~var13) {
                  break L0;
                } else {
                  L7: {
                    var14 = var17[var13];
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = var11 + -param2.field_r;
                    stackOut_33_3 = var11 - -param2.field_x;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    if (var14 != null) {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = var14.length();
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      stackIn_36_4 = stackOut_35_4;
                      break L7;
                    } else {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = 0;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_36_4 = stackOut_34_4;
                      break L7;
                    }
                  }
                  L8: {
                    var15 = new vl(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var15.field_b[0] = 0;
                    if (var14 == null) {
                      break L8;
                    } else {
                      L9: {
                        var15.field_b[var14.length()] = param2.b(var14);
                        if (3 != param4) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L9;
                        } else {
                          stackOut_38_0 = ((wh) this).a(-21446, param2.b(var14), var14, param3);
                          stackIn_40_0 = stackOut_38_0;
                          break L9;
                        }
                      }
                      int discarded$1 = 0;
                      vi.a(stackIn_40_0, var14, var15, param2);
                      break L8;
                    }
                  }
                  ((wh) this).field_a[var13] = var15;
                  var11 = var11 + param6;
                  var13++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var9;
            stackOut_43_1 = new StringBuilder().append("wh.D(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          L11: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          throw t.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3, wl param4) {
        vl var7 = null;
        vl var8 = null;
        if (!(param0 != null)) {
            ((wh) this).field_a = null;
            return;
        }
        if (((wh) this).field_i == param4) {
            if (((wh) this).field_n) {
                if (((wh) this).field_l == 0) {
                    if (null != ((wh) this).field_g) {
                        if (!(!((wh) this).field_g.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((wh) this).field_g = param0;
            ((wh) this).field_l = 0;
            ((wh) this).field_i = param4;
            ((wh) this).field_n = true;
            var7 = this.a(param0, param3, param1 + 117, param4);
            var8 = var7;
            var7.field_b[0] = param2;
            var8.field_b[param0.length()] = param2 - -param4.b(param0);
            int discarded$0 = 0;
            vi.a(param1, param0, var8, param4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_p = null;
        field_j = null;
    }

    final void a(String param0, int param1, wl param2, int param3, boolean param4) {
        vl var8 = null;
        int var7 = 0;
        if (!(param0 != null)) {
            ((wh) this).field_a = null;
            return;
        }
        if (param2 == ((wh) this).field_i) {
            if (((wh) this).field_n) {
                if (((wh) this).field_l == 1) {
                    if (((wh) this).field_g != null) {
                        if (((wh) this).field_g.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((wh) this).field_i = param2;
            ((wh) this).field_n = param4 ? true : false;
            ((wh) this).field_l = 1;
            var8 = this.a(param0, param3, 117, param2);
            var7 = param2.b(param0);
            var8.field_b[0] = -(var7 >> 1) + param1;
            var8.field_b[param0.length()] = (var7 >> 1) + param1;
            int discarded$0 = 0;
            vi.a(0, param0, var8, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wh.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public wh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new tk();
    }
}
