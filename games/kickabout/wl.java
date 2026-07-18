/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends mo {
    static boolean field_o;
    private it[] field_k;
    private int field_h;
    static int field_n;
    private up[][] field_i;
    private int[][] field_j;
    private int[][] field_m;
    private gt[] field_f;
    static boolean field_g;
    private boolean field_l;

    final boolean a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var3 = ((wl) this).field_k[param1].field_p;
        var4 = 0;
        L0: while (true) {
          if (var4 >= 4) {
            if (!param0) {
              return true;
            } else {
              String discarded$1 = ((wl) this).toString();
              return true;
            }
          } else {
            if (param1 == ((wl) this).field_m[var3][var4]) {
              if (-1 == ((wl) this).field_j[var3][var4]) {
                return false;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(ml param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int var5 = Kickabout.field_G;
        try {
            for (var3_int = 0; 2 > var3_int; var3_int++) {
                for (var4 = 0; var4 < 4; var4++) {
                    ((wl) this).field_j[var3_int][var4] = param0.l(4, 59) - 1;
                }
            }
            ((wl) this).field_h = param0.l(8, 59);
            param0.l((byte) 112);
            var3_int = 0;
            if (param1) {
                field_g = true;
            }
            while (2 > var3_int) {
                var6 = 0;
                var4 = var6;
                while (var6 < 4) {
                    ((wl) this).field_i[var3_int][var6].a(112, (iw) (Object) param0);
                    var6++;
                }
                var3_int++;
            }
            param0.p(-104);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        var4 = Kickabout.field_G;
        var5 = new StringBuilder("AgentLineup");
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((wl) this).field_k.length) {
            return var5.toString();
          } else {
            L1: {
              StringBuilder discarded$89 = var5.append("\t" + var2 + "=");
              if (((wl) this).a(-83, var2)) {
                break L1;
              } else {
                StringBuilder discarded$90 = var5.append(".");
                break L1;
              }
            }
            StringBuilder discarded$91 = var5.append("[");
            var3 = 0;
            L2: while (true) {
              if (4 <= var3) {
                StringBuilder discarded$92 = var5.append(" ]");
                var2++;
                continue L0;
              } else {
                if (((wl) this).field_m[((wl) this).field_k[var2].field_p][var3] == var2) {
                  StringBuilder discarded$93 = var5.append(" " + var3 + "=" + ((wl) this).field_j[((wl) this).field_k[var2].field_p][var3]);
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, gr param1, int param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (((wl) this).field_l) {
                break L1;
              } else {
                if (!param1.field_i[param0].c(-2)) {
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                }
              }
            }
            L2: {
              if (((wl) this).field_l) {
                break L2;
              } else {
                if (!param1.a((byte) -113, param0)) {
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              }
            }
            var5_int = ((wl) this).field_k[param2].field_p;
            var6 = 0;
            L3: while (true) {
              if (var6 >= 4) {
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  if (((wl) this).field_m[var5_int][var6] != param2) {
                    break L4;
                  } else {
                    if (param0 == ((wl) this).field_j[var5_int][var6]) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    } else {
                      break L4;
                    }
                  }
                }
                var6++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("wl.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + 4 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void a(gr param0, up[] param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param2 <= -70) {
                break L1;
              } else {
                var8 = null;
                ((wl) this).a((byte) -51, (mo) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var6_int >= 9) {
                break L0;
              } else {
                int discarded$7 = 4;
                if (this.a(var6_int, param0, param4)) {
                  ((wl) this).a(var6_int - -1 << 2 | param3, 0, param0, param1, param4);
                  return;
                } else {
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("wl.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, gr param2, up[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        up var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        up var13 = null;
        up stackIn_22_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        up stackOut_20_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var6_int = ((wl) this).field_k[param4].field_p;
              if (param1 == 0) {
                break L1;
              } else {
                var12 = null;
                ((wl) this).a((byte) 13, (mo) null);
                break L1;
              }
            }
            L2: {
              if (-1 == param0) {
                ((wl) this).field_h = ((wl) this).field_h ^ 1 << param4;
                break L2;
              } else {
                if (param0 != -2) {
                  var7 = 3 & param0;
                  var8 = (param0 >> 2) + -1;
                  if (~((wl) this).field_m[var6_int][var7] == ~param4) {
                    L3: {
                      if (var8 < -1) {
                        break L3;
                      } else {
                        if (9 > var8) {
                          L4: {
                            if (var8 == -1) {
                              stackOut_21_0 = null;
                              stackIn_22_0 = (up) (Object) stackOut_21_0;
                              break L4;
                            } else {
                              stackOut_20_0 = param2.field_i[var8];
                              stackIn_22_0 = stackOut_20_0;
                              break L4;
                            }
                          }
                          L5: {
                            var13 = stackIn_22_0;
                            var9 = var13;
                            if (var8 == -1) {
                              break L5;
                            } else {
                              if (!((wl) this).field_l) {
                                if (var13.c(-2)) {
                                  return;
                                } else {
                                  if (param2.a((byte) 79, var8)) {
                                    return;
                                  } else {
                                    break L5;
                                  }
                                }
                              } else {
                                var9 = param3[var8];
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (-1 == var8) {
                              ((wl) this).field_i[var6_int][var7].b((byte) -7);
                              break L6;
                            } else {
                              var10 = 0;
                              L7: while (true) {
                                if (var10 >= 4) {
                                  ((wl) this).field_i[var6_int][var7].a((byte) -90, var9);
                                  break L6;
                                } else {
                                  L8: {
                                    if (~((wl) this).field_m[var6_int][var10] != ~param4) {
                                      break L8;
                                    } else {
                                      if (~((wl) this).field_j[var6_int][var10] != ~var8) {
                                        break L8;
                                      } else {
                                        ((wl) this).field_j[var6_int][var10] = ((wl) this).field_j[var6_int][var7];
                                        ((wl) this).field_i[var6_int][var10].a((byte) -101, ((wl) this).field_i[var6_int][var7]);
                                        break L8;
                                      }
                                    }
                                  }
                                  var10++;
                                  continue L7;
                                }
                              }
                            }
                          }
                          ((wl) this).field_j[var6_int][var7] = var8;
                          ((wl) this).field_h = ((wl) this).field_h & ~(1 << param4);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!((wl) this).a(false, param4)) {
                    var7 = 0;
                    L9: while (true) {
                      if (4 <= var7) {
                        break L2;
                      } else {
                        L10: {
                          if (~((wl) this).field_m[var6_int][var7] != ~param4) {
                            break L10;
                          } else {
                            if (((wl) this).field_j[var6_int][var7] == -1) {
                              ((wl) this).a(param2, param3, (byte) -78, var7, param4);
                              ((wl) this).field_h = ((wl) this).field_h & ~(1 << param4);
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var7++;
                        continue L9;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var6;
            stackOut_42_1 = new StringBuilder().append("wl.C(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L11;
            }
          }
          L12: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L12;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L12;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, mo param1) {
        wl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        try {
            var3 = (wl) (Object) param1;
            if (param0 > -52) {
                ((wl) this).field_m = null;
            }
            for (var4 = 0; var4 < 2; var4++) {
                for (var5 = 0; var5 < 4; var5++) {
                    ((wl) this).field_i[var4][var5].a((byte) -90, var3.field_i[var4][var5]);
                    ((wl) this).field_j[var4][var5] = var3.field_j[var4][var5];
                }
            }
            ((wl) this).field_h = var3.field_h;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wl.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -80) {
          L0: {
            L1: {
              if (!((wl) this).field_f[param1].d(3511)) {
                break L1;
              } else {
                if ((1 << param1 & ((wl) this).field_h) == 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    wl(boolean param0, it[] param1, gt[] param2, int[][] param3, int[][] param4, up[][] param5) {
        try {
            ((wl) this).field_f = param2;
            ((wl) this).field_k = param1;
            ((wl) this).field_j = param4;
            ((wl) this).field_m = param3;
            ((wl) this).field_i = param5;
            ((wl) this).field_l = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
        field_n = 0;
        field_g = false;
    }
}
