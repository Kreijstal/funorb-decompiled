/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends dm {
    private boolean field_s;
    static ba field_q;
    static hj[] field_o;
    private int field_j;
    static int field_k;
    private int field_r;
    static int field_p;
    private int field_n;
    static mi field_u;
    private String field_t;
    private int field_l;
    private kc field_h;
    static String field_m;
    private int field_i;

    final static qg b() {
        qg var1 = new qg(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], fl.field_a[0], vc.field_g);
        md.a((byte) -128);
        return var1;
    }

    final void a(int param0, kc param1, int param2, String param3, int param4) {
        ed var8 = null;
        ed var9 = null;
        if (!(param3 != null)) {
            ((bd) this).field_c = null;
            return;
        }
        if (param1 == ((bd) this).field_h) {
            if (((bd) this).field_s) {
                if (2 == ((bd) this).field_l) {
                    if (((bd) this).field_t != null) {
                        if (((bd) this).field_t.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((bd) this).field_h = param1;
        ((bd) this).field_l = 2;
        if (param2 <= 74) {
            return;
        }
        try {
            ((bd) this).field_t = param3;
            ((bd) this).field_s = true;
            var8 = this.a((byte) 121, param4, param3, param1);
            var9 = var8;
            var9.field_g[0] = -param1.a(param3) + param0;
            var9.field_g[param3.length()] = param0;
            ll.a(var9, 0, param3, param1, 404465128);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "bd.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final void a(int param0, String param1, int param2, int param3, kc param4) {
        ed var8 = null;
        ed var9 = null;
        if (param1 == null) {
            ((bd) this).field_c = null;
            return;
        }
        if (param4 == ((bd) this).field_h) {
            if (((bd) this).field_s) {
                if (((bd) this).field_l == 0) {
                    if (((bd) this).field_t != null) {
                        if (!(!((bd) this).field_t.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((bd) this).field_l = 0;
            ((bd) this).field_t = param1;
            ((bd) this).field_h = param4;
            ((bd) this).field_s = true;
            var8 = this.a((byte) 110, param3, param1, param4);
            var9 = var8;
            int var7 = -66 / ((8 - param2) / 61);
            var8.field_g[0] = param0;
            var9.field_g[param1.length()] = param4.a(param1) + param0;
            ll.a(var9, 0, param1, param4, 404465128);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "bd.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, String param3, kc param4) {
        ed var8 = null;
        int var7 = 0;
        if (param3 == null) {
            ((bd) this).field_c = null;
            return;
        }
        if (param2 <= 31) {
            ((bd) this).field_t = null;
        }
        if (param4 == ((bd) this).field_h) {
            if (((bd) this).field_s) {
                if (((bd) this).field_l == 1) {
                    if (null != ((bd) this).field_t) {
                        if (!(!((bd) this).field_t.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((bd) this).field_l = 1;
            ((bd) this).field_s = true;
            ((bd) this).field_h = param4;
            var8 = this.a((byte) 115, param1, param3, param4);
            var7 = param4.a(param3);
            var8.field_g[0] = param0 - (var7 >> 1);
            var8.field_g[param3.length()] = (var7 >> 1) + param0;
            ll.a(var8, 0, param3, param4, 404465128);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "bd.O(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, String param1, int param2, kc param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ed var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        ed stackIn_35_0 = null;
        ed stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        ed stackIn_36_0 = null;
        ed stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        ed stackIn_37_0 = null;
        ed stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        ed stackIn_39_0 = null;
        ed stackIn_40_0 = null;
        ed stackIn_41_0 = null;
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
        ed stackOut_34_0 = null;
        ed stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        ed stackOut_36_0 = null;
        ed stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        ed stackOut_35_0 = null;
        ed stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        ed stackOut_38_0 = null;
        ed stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        ed stackOut_39_0 = null;
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
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param6 == param0) {
                param6 = param3.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == null) {
              ((bd) this).field_c = null;
              return;
            } else {
              L2: {
                if (param3 != ((bd) this).field_h) {
                  break L2;
                } else {
                  if (((bd) this).field_s) {
                    break L2;
                  } else {
                    if (param2 != ((bd) this).field_l) {
                      break L2;
                    } else {
                      if (((bd) this).field_r != param7) {
                        break L2;
                      } else {
                        if (((bd) this).field_j != param6) {
                          break L2;
                        } else {
                          if (param5 != ((bd) this).field_i) {
                            break L2;
                          } else {
                            if (param4 != ((bd) this).field_n) {
                              break L2;
                            } else {
                              if (null == ((bd) this).field_t) {
                                break L2;
                              } else {
                                if (((bd) this).field_t.equals((Object) (Object) param1)) {
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
                ((bd) this).field_t = param1;
                ((bd) this).field_j = param6;
                ((bd) this).field_n = param4;
                ((bd) this).field_i = param5;
                ((bd) this).field_s = false;
                ((bd) this).field_h = param3;
                ((bd) this).field_r = param7;
                ((bd) this).field_l = param2;
                var16 = new String[1 + param3.b(param1, param4)];
                var17 = var16;
                var10 = Math.max(1, param3.a(param1, new int[1], var17));
                if (((bd) this).field_r != 3) {
                  break L3;
                } else {
                  if (var10 == 1) {
                    ((bd) this).field_r = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                ((bd) this).field_c = new ed[var10];
                if (0 != ((bd) this).field_r) {
                  if (((bd) this).field_r != 1) {
                    if (2 == ((bd) this).field_r) {
                      var11 = ((bd) this).field_i - param3.field_B + -(var10 * ((bd) this).field_j);
                      break L4;
                    } else {
                      L5: {
                        var12 = (-(var10 * ((bd) this).field_j) + ((bd) this).field_i) / (var10 + 1);
                        if (var12 >= 0) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      ((bd) this).field_j = ((bd) this).field_j + var12;
                      var11 = param3.field_H - -var12;
                      break L4;
                    }
                  } else {
                    var11 = (-(((bd) this).field_j * var10) + ((bd) this).field_i >> 1) + param3.field_H;
                    break L4;
                  }
                } else {
                  var11 = param3.field_H;
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
                    stackOut_34_2 = -param3.field_H + var11;
                    stackOut_34_3 = param3.field_B + var11;
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
                    var14 = new ed(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                    var14.field_g[0] = 0;
                    if (var13 == null) {
                      break L8;
                    } else {
                      L9: {
                        var14.field_g[var13.length()] = param3.a(var13);
                        stackOut_38_0 = (ed) var14;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_39_0 = stackOut_38_0;
                        if (param2 != 3) {
                          stackOut_40_0 = (ed) (Object) stackIn_40_0;
                          stackOut_40_1 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          break L9;
                        } else {
                          stackOut_39_0 = (ed) (Object) stackIn_39_0;
                          stackOut_39_1 = ((bd) this).a(var13, param4, param3.a(var13), (byte) 74);
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          break L9;
                        }
                      }
                      ll.a(stackIn_41_0, stackIn_41_1, var13, param3, 404465128);
                      break L8;
                    }
                  }
                  ((bd) this).field_c[var12] = var14;
                  var11 = var11 + param6;
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
            stackOut_44_0 = (RuntimeException) var9;
            stackOut_44_1 = new StringBuilder().append("bd.N(").append(param0).append(44);
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
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param2).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_m = null;
        if (param0 != 0) {
            bd.c(15);
            field_u = null;
            field_o = null;
            return;
        }
        field_u = null;
        field_o = null;
    }

    private final ed a(byte param0, int param1, String param2, kc param3) {
        ed var5 = null;
        RuntimeException var5_ref = null;
        ed var6 = null;
        Object stackIn_2_0 = null;
        ed stackIn_4_0 = null;
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
        ed stackOut_3_0 = null;
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
            if (param0 >= 109) {
              var6 = new ed(-param3.field_H + param1, param3.field_B + param1, param2.length());
              var5 = var6;
              ((bd) this).field_c = new ed[]{var6};
              stackOut_3_0 = (ed) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ed) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("bd.P(").append(param0).append(44).append(param1).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    public bd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new ba(15, 0, 1, 0);
        field_m = "Account created successfully!";
    }
}
