/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends rb {
    private int field_f;
    private int field_m;
    private int field_g;
    static le field_e;
    private int field_i;
    private boolean field_l;
    private oh field_n;
    static ja field_j;
    private int field_h;
    private String field_k;
    static lj field_o;

    private final va a(oh param0, int param1, String param2, int param3) {
        va var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        va var7 = null;
        va stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        va stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var7 = new va(param3 + -param0.field_G, param3 - -param0.field_u, param2.length());
            var5 = var7;
            var6 = -63 % ((param1 - 45) / 59);
            ((cj) this).field_b = new va[]{var7};
            stackOut_0_0 = (va) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("cj.N(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, String param1, int param2, oh param3, int param4) {
        va var8 = null;
        va var9 = null;
        if (param1 == null) {
            ((cj) this).field_b = null;
            return;
        }
        if (param3 == ((cj) this).field_n) {
            if (((cj) this).field_l) {
                if (2 == ((cj) this).field_m) {
                    if (((cj) this).field_k != null) {
                        if (((cj) this).field_k.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cj) this).field_n = param3;
            ((cj) this).field_l = true;
            ((cj) this).field_m = 2;
            ((cj) this).field_k = param1;
            if (param0 != -19121) {
                ((cj) this).field_l = false;
            }
            var8 = this.a(param3, 115, param1, param2);
            var9 = var8;
            var9.field_b[0] = param4 - param3.a(param1);
            var9.field_b[param1.length()] = param4;
            id.a((byte) -119, 0, param3, param1, var9);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "cj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 4) {
            return;
        }
        field_j = null;
        field_o = null;
        field_e = null;
    }

    final void a(oh param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        va var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        va stackIn_36_0 = null;
        va stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        va stackIn_37_0 = null;
        va stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        va stackIn_38_0 = null;
        va stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        va stackOut_35_0 = null;
        va stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        va stackOut_37_0 = null;
        va stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        va stackOut_36_0 = null;
        va stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == param4) {
                param4 = param0.field_q;
                break L1;
              } else {
                break L1;
              }
            }
            if (param6 == null) {
              ((cj) this).field_b = null;
              return;
            } else {
              L2: {
                if (((cj) this).field_n != param0) {
                  break L2;
                } else {
                  if (((cj) this).field_l) {
                    break L2;
                  } else {
                    if (~param2 != ~((cj) this).field_m) {
                      break L2;
                    } else {
                      if (param7 != ((cj) this).field_f) {
                        break L2;
                      } else {
                        if (param4 != ((cj) this).field_g) {
                          break L2;
                        } else {
                          if (~param3 != ~((cj) this).field_h) {
                            break L2;
                          } else {
                            if (~((cj) this).field_i != ~param5) {
                              break L2;
                            } else {
                              if (((cj) this).field_k == null) {
                                break L2;
                              } else {
                                if (((cj) this).field_k.equals((Object) (Object) param6)) {
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
                ((cj) this).field_k = param6;
                ((cj) this).field_l = false;
                ((cj) this).field_h = param3;
                ((cj) this).field_i = param5;
                ((cj) this).field_g = param4;
                if (param1 > 40) {
                  break L3;
                } else {
                  ((cj) this).field_h = -116;
                  break L3;
                }
              }
              L4: {
                ((cj) this).field_n = param0;
                ((cj) this).field_m = param2;
                ((cj) this).field_f = param7;
                var16 = new String[param0.b(param6, param5) + 1];
                var17 = var16;
                var10 = Math.max(1, param0.a(param6, new int[1], var17));
                if (((cj) this).field_f != 3) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    ((cj) this).field_f = 1;
                    break L4;
                  }
                }
              }
              L5: {
                ((cj) this).field_b = new va[var10];
                if (((cj) this).field_f == 0) {
                  var11 = param0.field_G;
                  break L5;
                } else {
                  if (((cj) this).field_f != 1) {
                    if (((cj) this).field_f == 2) {
                      var11 = -(((cj) this).field_g * var10) + -param0.field_u + ((cj) this).field_h;
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(var10 * ((cj) this).field_g) + ((cj) this).field_h) / (var10 - -1);
                        if (var12 >= 0) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      ((cj) this).field_g = ((cj) this).field_g + var12;
                      var11 = param0.field_G - -var12;
                      break L5;
                    }
                  } else {
                    var11 = param0.field_G - -(-(((cj) this).field_g * var10) + ((cj) this).field_h >> 1);
                    break L5;
                  }
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var10 <= var12) {
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = -param0.field_G + var11;
                    stackOut_35_3 = param0.field_u + var11;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    stackIn_37_3 = stackOut_35_3;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    if (var13 != null) {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = stackIn_37_2;
                      stackOut_37_3 = stackIn_37_3;
                      stackOut_37_4 = var13.length();
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      stackIn_38_3 = stackOut_37_3;
                      stackIn_38_4 = stackOut_37_4;
                      break L8;
                    } else {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = 0;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_38_4 = stackOut_36_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new va(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_b[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_b[var13.length()] = param0.a(var13);
                        stackOut_40_0 = -123;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (param2 != 3) {
                          stackOut_42_0 = stackIn_42_0;
                          stackOut_42_1 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L10;
                        } else {
                          stackOut_41_0 = stackIn_41_0;
                          stackOut_41_1 = ((cj) this).a(param0.a(var13), var13, 5, param5);
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          break L10;
                        }
                      }
                      id.a((byte) stackIn_43_0, stackIn_43_1, param0, var13, var14);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var11 = var11 + param4;
                  ((cj) this).field_b[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("cj.Q(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
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
          L12: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param6 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L12;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        nk.field_l = param2;
        if (!param0) {
            cj.e(-89);
        }
        j.field_c = param1;
    }

    final static void a(int param0, boolean param1) {
        la var2 = ra.field_C;
        var2.c(6, 7);
        var2.a(1, (byte) -104);
        var2.a(0, (byte) -88);
    }

    final static void d(int param0) {
        qj var1 = null;
        qj var2 = null;
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        try {
            var1 = new qj(540, 140);
            mb.a((byte) 124, var1);
            ig.a();
            ll.a();
            fb.field_a = 0;
            be.a((byte) -108);
            var2 = var1.b();
            for (var3 = 0; var3 < 15; var3++) {
                var2.b(-2, -2, 16777215);
                ll.a(4, 4, 0, 0, 540, 140);
            }
            ha.field_E.a();
            var1.d(0, 0);
            ch.m(124);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "cj.R(" + 97 + ')');
        }
    }

    public cj() {
    }

    final void a(int param0, int param1, oh param2, int param3, String param4) {
        va var7 = null;
        va var8 = null;
        if (param0 != 1888) {
            ((cj) this).field_g = -104;
        }
        if (param4 == null) {
            ((cj) this).field_b = null;
            return;
        }
        if (((cj) this).field_n == param2) {
            if (((cj) this).field_l) {
                if (((cj) this).field_m == 0) {
                    if (((cj) this).field_k != null) {
                        if (((cj) this).field_k.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cj) this).field_l = true;
            ((cj) this).field_k = param4;
            ((cj) this).field_m = 0;
            ((cj) this).field_n = param2;
            var7 = this.a(param2, -103, param4, param1);
            var8 = var7;
            var7.field_b[0] = param3;
            var8.field_b[param4.length()] = param2.a(param4) + param3;
            id.a((byte) -121, 0, param2, param4, var8);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "cj.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, oh param1, String param2, int param3, int param4) {
        va var8 = null;
        int var7 = 0;
        if (!(param2 != null)) {
            ((cj) this).field_b = null;
            return;
        }
        if (param1 == ((cj) this).field_n) {
            if (((cj) this).field_l) {
                if (((cj) this).field_m == 1) {
                    if (((cj) this).field_k != null) {
                        if (!(!((cj) this).field_k.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((cj) this).field_n = param1;
            if (param0 <= 73) {
                cj.a(false, -40, 22);
            }
            ((cj) this).field_m = 1;
            ((cj) this).field_l = true;
            var8 = this.a(param1, 117, param2, param3);
            var7 = param1.a(param2);
            var8.field_b[0] = param4 - (var7 >> 1);
            var8.field_b[param2.length()] = (var7 >> 1) + param4;
            id.a((byte) -125, 0, param1, param2, var8);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "cj.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new le();
        field_j = new ja();
        field_o = new lj();
    }
}
