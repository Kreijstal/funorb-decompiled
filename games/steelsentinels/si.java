/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends da {
    static String field_F;
    static String field_u;
    private int field_G;
    static int[] field_k;
    static boolean field_y;
    private int field_z;
    static rj field_o;
    static String field_w;
    static boolean field_p;
    private int field_B;
    static gh field_v;
    private int field_q;
    static nb field_A;
    static gk[] field_l;
    private int field_r;
    private String field_n;
    static int field_m;
    private mi field_x;
    static String[] field_D;
    static String[] field_j;
    static String field_C;
    private boolean field_s;
    static String[] field_H;
    static int field_t;
    static wk[] field_E;

    final static void c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 > 12) {
              var1_int = 255;
              var2 = 0;
              L1: while (true) {
                if (var2 >= 50) {
                  break L0;
                } else {
                  pb.c(0, var2, 640, 1052688, var1_int);
                  var1_int -= 5;
                  var2++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "si.S(" + param0 + ')');
        }
    }

    final static int a(gh param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        gh var5 = null;
        String var6 = null;
        gh var7 = null;
        int var8 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (1 != fg.field_Ob) {
                stackOut_3_0 = 64;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 78;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              if ((1008 & fg.field_Ob) != 0) {
                var3_int = 36;
                break L2;
              } else {
                break L2;
              }
            }
            var4 = qa.field_O;
            var5 = new gh(-1L, (gh) null);
            var5.field_Pb = gj.field_a;
            var5.field_Kb = 2;
            var5.a(0, param2, 18, 0, var4);
            param0.a(var5, 118);
            var6 = cm.field_p;
            var7 = new gh(-1L, kh.field_s, var6);
            var7.field_nb = 0;
            var7.field_L = (mi) (Object) pl.field_U;
            var7.a(0, param2, 18, 0, var4);
            var7.field_Fb = 1;
            var7.field_sb = 1;
            var7.field_I = null;
            var7.field_Kb = 1;
            param0.a(var7, 119);
            param2 = param2 + var7.field_Lb;
            var8 = 0;
            L3: while (true) {
              if (var8 >= ue.field_c.length) {
                stackOut_12_0 = param2;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L4: {
                  if (ue.field_c[var8] == null) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var8++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("si.P(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + true + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final static ik b() {
        String var1 = jj.a(true);
        if (var1 != null) {
            if (!(var1.indexOf('@') < 0)) {
                var1 = "";
            }
        }
        int discarded$0 = 16777215;
        return new ik(jj.a(true), wl.j());
    }

    public static void a(int param0) {
        field_u = null;
        field_A = null;
        field_j = null;
        field_k = null;
        field_D = null;
        field_w = null;
        field_o = null;
        field_v = null;
        field_E = null;
        field_H = null;
        field_F = null;
        field_C = null;
        field_l = null;
    }

    final void a(String param0, boolean param1, int param2, int param3, mi param4) {
        il var8 = null;
        il var9 = null;
        if (!(param0 != null)) {
            ((si) this).field_h = null;
            return;
        }
        if (param4 == ((si) this).field_x) {
            if (((si) this).field_s) {
                if (((si) this).field_r == 2) {
                    if (((si) this).field_n != null) {
                        if (((si) this).field_n.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((si) this).field_x = param4;
            ((si) this).field_n = param0;
            if (!param1) {
                ((si) this).field_z = -7;
            }
            ((si) this).field_r = 2;
            ((si) this).field_s = true;
            var8 = this.a(param0, (byte) 118, param4, param3);
            var9 = var8;
            var9.field_f[0] = param2 + -param4.c(param0);
            var9.field_f[param0.length()] = param2;
            kk.a(var9, 110, 0, param0, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "si.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3, mi param4) {
        il var7 = null;
        il var8 = null;
        if (!(param1 != null)) {
            ((si) this).field_h = null;
            return;
        }
        if (param2 < 19) {
            return;
        }
        if (param4 == ((si) this).field_x) {
            if (((si) this).field_s) {
                if (0 == ((si) this).field_r) {
                    if (((si) this).field_n != null) {
                        if (((si) this).field_n.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((si) this).field_s = true;
            ((si) this).field_n = param1;
            ((si) this).field_r = 0;
            ((si) this).field_x = param4;
            var7 = this.a(param1, (byte) 117, param4, param3);
            var8 = var7;
            var7.field_f[0] = param0;
            var8.field_f[param1.length()] = param4.c(param1) + param0;
            kk.a(var8, 95, 0, param1, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "si.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, String param1, int param2, int param3, mi param4) {
        il var8 = null;
        int var7 = 0;
        if (!(param1 != null)) {
            ((si) this).field_h = null;
            return;
        }
        if (param4 == ((si) this).field_x) {
            if (((si) this).field_s) {
                if (((si) this).field_r == 1) {
                    if (null != ((si) this).field_n) {
                        if (((si) this).field_n.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            if (param3 != -1385548511) {
                si.c(24);
            }
            ((si) this).field_x = param4;
            ((si) this).field_r = 1;
            ((si) this).field_s = true;
            var8 = this.a(param1, (byte) 117, param4, param2);
            var7 = param4.c(param1);
            var8.field_f[0] = param0 - (var7 >> 1);
            var8.field_f[param1.length()] = (var7 >> 1) + param0;
            kk.a(var8, param3 ^ -1385548469, 0, param1, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "si.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4, mi param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        il var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        il stackIn_33_0 = null;
        il stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        il stackIn_34_0 = null;
        il stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        il stackIn_35_0 = null;
        il stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        il stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        il stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        il stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
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
        il stackOut_32_0 = null;
        il stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        il stackOut_34_0 = null;
        il stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        il stackOut_33_0 = null;
        il stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        il stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        il stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        il stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
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
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (0 != param2) {
                break L1;
              } else {
                param2 = param5.field_W;
                break L1;
              }
            }
            if (param3 == null) {
              ((si) this).field_h = null;
              return;
            } else {
              L2: {
                if (((si) this).field_x != param5) {
                  break L2;
                } else {
                  if (((si) this).field_s) {
                    break L2;
                  } else {
                    if (param1 != ((si) this).field_r) {
                      break L2;
                    } else {
                      if (param4 != ((si) this).field_B) {
                        break L2;
                      } else {
                        if (param2 != ((si) this).field_z) {
                          break L2;
                        } else {
                          if (((si) this).field_q != param6) {
                            break L2;
                          } else {
                            if (((si) this).field_G != param0) {
                              break L2;
                            } else {
                              if (null == ((si) this).field_n) {
                                break L2;
                              } else {
                                if (((si) this).field_n.equals((Object) (Object) param3)) {
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
                ((si) this).field_s = false;
                ((si) this).field_z = param2;
                ((si) this).field_B = param4;
                ((si) this).field_n = param3;
                ((si) this).field_q = param6;
                ((si) this).field_x = param5;
                ((si) this).field_r = param1;
                ((si) this).field_G = param0;
                var16 = new String[param5.b(param3, param0) + param7];
                var17 = var16;
                var10 = Math.max(1, param5.a(param3, new int[1], var17));
                if (((si) this).field_B != 3) {
                  break L3;
                } else {
                  if (1 != var10) {
                    break L3;
                  } else {
                    ((si) this).field_B = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (((si) this).field_B != 0) {
                  if (1 != ((si) this).field_B) {
                    if (((si) this).field_B == 2) {
                      var11 = -(((si) this).field_z * var10) + (((si) this).field_q - param5.field_F);
                      break L4;
                    } else {
                      L5: {
                        var12 = (((si) this).field_q + -(((si) this).field_z * var10)) / (var10 - -1);
                        if (var12 >= 0) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      ((si) this).field_z = ((si) this).field_z + var12;
                      var11 = var12 + param5.field_G;
                      break L4;
                    }
                  } else {
                    var11 = (-(var10 * ((si) this).field_z) + ((si) this).field_q >> 1) + param5.field_G;
                    break L4;
                  }
                } else {
                  var11 = param5.field_G;
                  break L4;
                }
              }
              ((si) this).field_h = new il[var10];
              var12 = 0;
              L6: while (true) {
                if (var10 <= var12) {
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_32_0 = null;
                    stackOut_32_1 = null;
                    stackOut_32_2 = -param5.field_G + var11;
                    stackOut_32_3 = var11 + param5.field_F;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    stackIn_33_3 = stackOut_32_3;
                    if (var13 != null) {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = var13.length();
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      stackIn_35_3 = stackOut_34_3;
                      stackIn_35_4 = stackOut_34_4;
                      break L7;
                    } else {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = 0;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      stackIn_35_2 = stackOut_33_2;
                      stackIn_35_3 = stackOut_33_3;
                      stackIn_35_4 = stackOut_33_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new il(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                    var14.field_f[0] = 0;
                    if (var13 == null) {
                      break L8;
                    } else {
                      L9: {
                        var14.field_f[var13.length()] = param5.c(var13);
                        stackOut_36_0 = (il) var14;
                        stackOut_36_1 = param7 + -63;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (3 == param1) {
                          stackOut_38_0 = (il) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = ((si) this).a(var13, param0, param5.c(var13), (byte) 116);
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L9;
                        } else {
                          stackOut_37_0 = (il) (Object) stackIn_37_0;
                          stackOut_37_1 = stackIn_37_1;
                          stackOut_37_2 = 0;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          break L9;
                        }
                      }
                      kk.a(stackIn_39_0, stackIn_39_1, stackIn_39_2, var13, param5);
                      break L8;
                    }
                  }
                  ((si) this).field_h[var12] = var14;
                  var11 = var11 + param2;
                  var12++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var9;
            stackOut_42_1 = new StringBuilder().append("si.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param3 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param4).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param5 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final il a(String param0, byte param1, mi param2, int param3) {
        il var5 = null;
        RuntimeException var5_ref = null;
        il var6 = null;
        il stackIn_3_0 = null;
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
        il stackOut_2_0 = null;
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
              if (param1 >= 116) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var6 = new il(-param2.field_G + param3, param2.field_F + param3, param0.length());
            var5 = var6;
            ((si) this).field_h = new il[]{var6};
            stackOut_2_0 = (il) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("si.L(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Default head for the <%0>-class sentinel.";
        field_w = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_k = new int[]{92, 106, 48, 24, 24, 24, 95, 24, 24, 24, 24, 93, 37, 37, 37, 52, 9, 14, 27, 20, 31, 4, -1, -1};
        field_p = true;
        field_u = "This game option has not yet been unlocked for use.";
        field_m = 0;
        field_H = new String[]{"WOE TO THE CONQUERED!", "PROCEED ON YOUR WAY TO OBLIVION.", "HAVE YOU NOTHING ELSE?", "THIS WORLD IS MINE."};
        field_D = new String[]{"POWER GENERATION", "ENERGY STORAGE", "ENERGY SHIELDING", "ARMOUR", "TARGETING", "WEAPON ENHANCEMENT", "TRANSPORTATION", "OTHER"};
        field_C = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
