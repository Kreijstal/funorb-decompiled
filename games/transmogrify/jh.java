/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ue {
    static ti field_h;
    private String field_d;
    static pd field_n;
    private int field_e;
    private int field_j;
    private boolean field_f;
    private int field_i;
    private int field_m;
    static String field_g;
    private kg field_k;
    private int field_l;

    final void a(kg param0, int param1, byte param2, String param3, int param4) {
        ol var9 = null;
        ol var10 = null;
        if (!(param3 != null)) {
            ((jh) this).field_b = null;
            return;
        }
        if (((jh) this).field_k == param0) {
            if (((jh) this).field_f) {
                if (((jh) this).field_l == 2) {
                    if (((jh) this).field_d != null) {
                        if (!(!((jh) this).field_d.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((jh) this).field_d = param3;
            ((jh) this).field_f = true;
            if (param2 >= -63) {
                Object var7 = null;
                ((jh) this).a((String) null, (byte) -90, (kg) null, -10, 16);
            }
            ((jh) this).field_l = 2;
            ((jh) this).field_k = param0;
            var9 = this.a((byte) 107, param4, param0, param3);
            var10 = var9;
            var10.field_g[0] = param1 - param0.a(param3);
            var10.field_g[param3.length()] = param1;
            eh.a(var10, (byte) 79, param3, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "jh.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void a() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == el.field_n) {
            break L0;
          } else {
            var1 = (Object) (Object) el.field_n;
            synchronized (var1) {
              L1: {
                el.field_n = null;
                break L1;
              }
            }
            break L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, kg param3, String param4) {
        ol var8 = null;
        int var7 = 0;
        if (param4 == null) {
            ((jh) this).field_b = null;
            return;
        }
        if (param3 == ((jh) this).field_k) {
            if (((jh) this).field_f) {
                if (((jh) this).field_l == 1) {
                    if (null != ((jh) this).field_d) {
                        if (((jh) this).field_d.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((jh) this).field_l = 1;
            ((jh) this).field_f = true;
            ((jh) this).field_k = param3;
            var8 = this.a((byte) 34, param2, param3, param4);
            var7 = param3.a(param4);
            if (param1 != 7531) {
                ((jh) this).field_i = 41;
            }
            var8.field_g[0] = param0 + -(var7 >> 1);
            var8.field_g[param4.length()] = (var7 >> 1) + param0;
            eh.a(var8, (byte) 79, param4, param3, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "jh.O(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4, kg param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        ol var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        ol stackIn_34_0 = null;
        ol stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        ol stackIn_35_0 = null;
        ol stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        ol stackIn_36_0 = null;
        ol stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        ol stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_38_2 = null;
        kg stackIn_38_3 = null;
        ol stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_39_2 = null;
        kg stackIn_39_3 = null;
        ol stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        kg stackIn_40_3 = null;
        int stackIn_40_4 = 0;
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
        ol stackOut_33_0 = null;
        ol stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        ol stackOut_35_0 = null;
        ol stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        ol stackOut_34_0 = null;
        ol stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        ol stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        kg stackOut_37_3 = null;
        ol stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        kg stackOut_39_3 = null;
        int stackOut_39_4 = 0;
        ol stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        kg stackOut_38_3 = null;
        int stackOut_38_4 = 0;
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
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                param2 = param5.field_C;
                break L1;
              }
            }
            if (param4 == null) {
              ((jh) this).field_b = null;
              return;
            } else {
              L2: {
                if (param5 != ((jh) this).field_k) {
                  break L2;
                } else {
                  if (((jh) this).field_f) {
                    break L2;
                  } else {
                    if (((jh) this).field_l != param1) {
                      break L2;
                    } else {
                      if (param7 != ((jh) this).field_i) {
                        break L2;
                      } else {
                        if (((jh) this).field_m != param2) {
                          break L2;
                        } else {
                          if (param6 != ((jh) this).field_e) {
                            break L2;
                          } else {
                            if (param3 != ((jh) this).field_j) {
                              break L2;
                            } else {
                              if (((jh) this).field_d == null) {
                                break L2;
                              } else {
                                if (((jh) this).field_d.equals((Object) (Object) param4)) {
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
                ((jh) this).field_m = param2;
                ((jh) this).field_d = param4;
                ((jh) this).field_i = param7;
                ((jh) this).field_e = param6;
                ((jh) this).field_k = param5;
                ((jh) this).field_f = false;
                ((jh) this).field_l = param1;
                ((jh) this).field_j = param3;
                var17 = new String[1 + param5.b(param4, param3)];
                var18 = var17;
                var10 = Math.max(1, param5.a(param4, new int[1], var18));
                var11 = -73 / ((-6 - param0) / 50);
                if (((jh) this).field_i != 3) {
                  break L3;
                } else {
                  if (1 != var10) {
                    break L3;
                  } else {
                    ((jh) this).field_i = 1;
                    break L3;
                  }
                }
              }
              L4: {
                ((jh) this).field_b = new ol[var10];
                if (((jh) this).field_i == 0) {
                  var12 = param5.field_y;
                  break L4;
                } else {
                  if (1 == ((jh) this).field_i) {
                    var12 = param5.field_y + (-(((jh) this).field_m * var10) + ((jh) this).field_e >> 1);
                    break L4;
                  } else {
                    if (2 == ((jh) this).field_i) {
                      var12 = -param5.field_t + ((jh) this).field_e - ((jh) this).field_m * var10;
                      break L4;
                    } else {
                      L5: {
                        var13 = (-(var10 * ((jh) this).field_m) + ((jh) this).field_e) / (1 + var10);
                        if (0 > var13) {
                          var13 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var12 = var13 + param5.field_y;
                      ((jh) this).field_m = ((jh) this).field_m + var13;
                      break L4;
                    }
                  }
                }
              }
              var13 = 0;
              L6: while (true) {
                if (var13 >= var10) {
                  break L0;
                } else {
                  L7: {
                    var14 = var17[var13];
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = var12 - param5.field_y;
                    stackOut_33_3 = var12 + param5.field_t;
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
                    var15 = new ol(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var15.field_g[0] = 0;
                    if (var14 == null) {
                      break L8;
                    } else {
                      L9: {
                        var15.field_g[var14.length()] = param5.a(var14);
                        stackOut_37_0 = (ol) var15;
                        stackOut_37_1 = 79;
                        stackOut_37_2 = (String) var14;
                        stackOut_37_3 = (kg) param5;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        if (param1 != 3) {
                          stackOut_39_0 = (ol) (Object) stackIn_39_0;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = (String) (Object) stackIn_39_2;
                          stackOut_39_3 = (kg) (Object) stackIn_39_3;
                          stackOut_39_4 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          stackIn_40_4 = stackOut_39_4;
                          break L9;
                        } else {
                          stackOut_38_0 = (ol) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = (String) (Object) stackIn_38_2;
                          stackOut_38_3 = (kg) (Object) stackIn_38_3;
                          stackOut_38_4 = ((jh) this).a(param3, var14, param5.a(var14), 12);
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          stackIn_40_4 = stackOut_38_4;
                          break L9;
                        }
                      }
                      eh.a(stackIn_40_0, (byte) stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_40_4);
                      break L8;
                    }
                  }
                  ((jh) this).field_b[var13] = var15;
                  var12 = var12 + param2;
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
            stackOut_43_1 = new StringBuilder().append("jh.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param4 == null) {
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
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param5 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(String param0, byte param1, kg param2, int param3, int param4) {
        ol var7 = null;
        if (!(param0 != null)) {
            ((jh) this).field_b = null;
            return;
        }
        if (((jh) this).field_k == param2) {
            if (((jh) this).field_f) {
                if (((jh) this).field_l == 0) {
                    if (((jh) this).field_d != null) {
                        if (((jh) this).field_d.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((jh) this).field_l = 0;
            ((jh) this).field_f = true;
            ((jh) this).field_k = param2;
            ((jh) this).field_d = param0;
            int var6_int = -37 / ((param1 - -50) / 49);
            var7 = this.a((byte) 52, param3, param2, param0);
            var7.field_g[0] = param4;
            var7.field_g[param0.length()] = param2.a(param0) + param4;
            eh.a(var7, (byte) 79, param0, param2, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "jh.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void c() {
        field_n = null;
        field_g = null;
        field_h = null;
    }

    private final ol a(byte param0, int param1, kg param2, String param3) {
        ol var5 = null;
        RuntimeException var5_ref = null;
        ol var6 = null;
        Object stackIn_2_0 = null;
        ol stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ol stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 > 17) {
              var6 = new ol(-param2.field_y + param1, param1 + param2.field_t, param3.length());
              var5 = var6;
              ((jh) this).field_b = new ol[]{var6};
              stackOut_3_0 = (ol) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ol) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("jh.M(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(sg param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        sg var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_h) {
              L1: {
                L2: {
                  if (param0.field_l != 0) {
                    break L2;
                  } else {
                    if (param0.field_f != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (q.field_b <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = eg.field_a[var2_int];
                      if (2 != var3.field_i) {
                        break L4;
                      } else {
                        if (var3.field_l != param0.field_l) {
                          break L4;
                        } else {
                          if (param0.field_f == var3.field_f) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1 >= 11) {
                  break L5;
                } else {
                  var5 = null;
                  jh.a((sg) null, -103);
                  break L5;
                }
              }
              L6: {
                if (param0.field_j == null) {
                  break L6;
                } else {
                  break L6;
                }
              }
              mh.a(-27968, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("jh.N(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
    }

    public jh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new pd();
    }
}
