/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends cf {
    private boolean field_w;
    private int field_B;
    static int field_p;
    private int field_s;
    static w field_A;
    static String field_u;
    private int field_v;
    private String field_m;
    static int field_n;
    static java.math.BigInteger field_k;
    static int field_r;
    static ck field_l;
    static w field_D;
    private mm field_o;
    static int field_t;
    private int field_z;
    private int field_q;
    static String field_y;
    static String field_C;
    static cd field_x;

    final void a(int param0, int param1, String param2, byte param3, mm param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        nf var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param4 != ((ea) this).field_o) {
                  break L1;
                } else {
                  if (!((ea) this).field_w) {
                    break L1;
                  } else {
                    if (((ea) this).field_s != 1) {
                      break L1;
                    } else {
                      if (null == ((ea) this).field_m) {
                        break L1;
                      } else {
                        if (!((ea) this).field_m.equals((Object) (Object) param2)) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                ((ea) this).field_o = param4;
                ((ea) this).field_s = 1;
                if (param3 == 8) {
                  break L2;
                } else {
                  ck[] discarded$1 = ea.a(54, 119, -124, -51, 32, 28);
                  break L2;
                }
              }
              ((ea) this).field_w = true;
              var8 = this.a(-95, param0, param4, param2);
              var7 = param4.a(param2);
              var8.field_a[0] = param1 - (var7 >> 1);
              var8.field_a[param2.length()] = param1 - -(var7 >> 1);
              hm.a(var8, param4, 0, param2, param3 ^ -9);
              break L0;
            } else {
              ((ea) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ea.M(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param3).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static boolean c(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -23) {
          if (hc.field_d >= 10) {
            if (v.field_d) {
              return false;
            } else {
              L0: {
                if (si.c(-12851)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ck var9 = null;
        ck var10 = null;
        ck var11 = null;
        ck var12 = null;
        ck var13 = null;
        Object var14 = null;
        int[] var15 = null;
        ck var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var20 = hk.field_l;
        var19 = var20;
        var18 = var19;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = hk.field_j;
        var8 = hk.field_i;
        var9 = new ck(param2, param3 - param2 * 2);
        var9.a();
        hk.d(0, 0, param2, param3 + -(2 * param2), param5, param4);
        var10 = new ck(param2, param2);
        var10.a();
        hk.a(0, 0, param2, param2, param5);
        var11 = new ck(16, param2);
        if (param1 != -20982) {
          return null;
        } else {
          L0: {
            var11.a();
            hk.a(0, 0, 16, param2, param5);
            var12 = new ck(param2, param2);
            var12.a();
            hk.a(0, 0, param2, param2, param4);
            var13 = new ck(16, param2);
            var13.a();
            hk.a(0, 0, 16, param2, param4);
            var14 = null;
            if (param0 > 0) {
              var16 = new ck(16, 16);
              var14 = (Object) (Object) var16;
              var16.a();
              hk.a(0, 0, 16, 16, param0);
              break L0;
            } else {
              break L0;
            }
          }
          hk.a(var20, var7, var8);
          return new ck[]{var10, var11, var10, var9, (ck) var14, var9, var12, var13, var12};
        }
    }

    final void a(int param0, mm param1, String param2, int param3, int param4) {
        nf var7 = null;
        nf var8 = null;
        if (!(param2 != null)) {
            ((ea) this).field_a = null;
            return;
        }
        if (param4 <= 11) {
            field_r = -109;
        }
        if (param1 == ((ea) this).field_o) {
            if (((ea) this).field_w) {
                if (((ea) this).field_s == 0) {
                    if (null != ((ea) this).field_m) {
                        if (!(!((ea) this).field_m.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((ea) this).field_w = true;
            ((ea) this).field_o = param1;
            ((ea) this).field_m = param2;
            ((ea) this).field_s = 0;
            var7 = this.a(-27, param3, param1, param2);
            var8 = var7;
            var7.field_a[0] = param0;
            var8.field_a[param2.length()] = param1.a(param2) + param0;
            hm.a(var8, param1, 0, param2, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ea.T(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(String param0, int param1, mm param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        nf var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        nf stackIn_36_0 = null;
        nf stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        nf stackIn_37_0 = null;
        nf stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        nf stackIn_38_0 = null;
        nf stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        nf stackIn_41_0 = null;
        mm stackIn_41_1 = null;
        nf stackIn_42_0 = null;
        mm stackIn_42_1 = null;
        nf stackIn_43_0 = null;
        mm stackIn_43_1 = null;
        int stackIn_43_2 = 0;
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
        nf stackOut_35_0 = null;
        nf stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        nf stackOut_37_0 = null;
        nf stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        nf stackOut_36_0 = null;
        nf stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        nf stackOut_40_0 = null;
        mm stackOut_40_1 = null;
        nf stackOut_42_0 = null;
        mm stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        nf stackOut_41_0 = null;
        mm stackOut_41_1 = null;
        int stackOut_41_2 = 0;
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
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                param7 = param2.field_S;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                if (((ea) this).field_o != param2) {
                  break L2;
                } else {
                  if (((ea) this).field_w) {
                    break L2;
                  } else {
                    if (((ea) this).field_s != param5) {
                      break L2;
                    } else {
                      if (~((ea) this).field_q != ~param1) {
                        break L2;
                      } else {
                        if (param7 != ((ea) this).field_B) {
                          break L2;
                        } else {
                          if (~((ea) this).field_v != ~param4) {
                            break L2;
                          } else {
                            if (param3 != ((ea) this).field_z) {
                              break L2;
                            } else {
                              if (null == ((ea) this).field_m) {
                                break L2;
                              } else {
                                if (!((ea) this).field_m.equals((Object) (Object) param0)) {
                                  break L2;
                                } else {
                                  return;
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
                ((ea) this).field_B = param7;
                ((ea) this).field_m = param0;
                ((ea) this).field_q = param1;
                ((ea) this).field_z = param3;
                ((ea) this).field_o = param2;
                ((ea) this).field_v = param4;
                ((ea) this).field_w = false;
                ((ea) this).field_s = param5;
                var16 = new String[param2.a(param0, param3) + 1];
                var17 = var16;
                var10 = Math.max(1, param2.a(param0, new int[1], var17));
                if (((ea) this).field_q != 3) {
                  break L3;
                } else {
                  if (var10 == 1) {
                    ((ea) this).field_q = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param6 >= 8) {
                  break L4;
                } else {
                  String discarded$1 = ea.b(true);
                  break L4;
                }
              }
              L5: {
                ((ea) this).field_a = new nf[var10];
                if (((ea) this).field_q != 0) {
                  if (((ea) this).field_q == 1) {
                    var11 = (-(var10 * ((ea) this).field_B) + ((ea) this).field_v >> 1) + param2.field_R;
                    break L5;
                  } else {
                    if (((ea) this).field_q == 2) {
                      var11 = -(((ea) this).field_B * var10) + -param2.field_K + ((ea) this).field_v;
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(var10 * ((ea) this).field_B) + ((ea) this).field_v) / (1 + var10);
                        if (var12 >= 0) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      var11 = var12 + param2.field_R;
                      ((ea) this).field_B = ((ea) this).field_B + var12;
                      break L5;
                    }
                  }
                } else {
                  var11 = param2.field_R;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (~var10 >= ~var12) {
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = -param2.field_R + var11;
                    stackOut_35_3 = param2.field_K + var11;
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
                    var14 = new nf(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_a[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_a[var13.length()] = param2.a(var13);
                        stackOut_40_0 = (nf) var14;
                        stackOut_40_1 = (mm) param2;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (param5 == 3) {
                          stackOut_42_0 = (nf) (Object) stackIn_42_0;
                          stackOut_42_1 = (mm) (Object) stackIn_42_1;
                          stackOut_42_2 = ((ea) this).a((byte) 64, param2.a(var13), var13, param3);
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          stackIn_43_2 = stackOut_42_2;
                          break L10;
                        } else {
                          stackOut_41_0 = (nf) (Object) stackIn_41_0;
                          stackOut_41_1 = (mm) (Object) stackIn_41_1;
                          stackOut_41_2 = 0;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_43_2 = stackOut_41_2;
                          break L10;
                        }
                      }
                      hm.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, var13, -1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((ea) this).field_a[var12] = var14;
                  var11 = var11 + param7;
                  var12++;
                  continue L7;
                }
              }
            } else {
              ((ea) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("ea.R(");
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
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44).append(param1).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static String b(boolean param0) {
        if (wd.field_d) {
            return null;
        }
        if (jc.field_g < o.field_b) {
            return null;
        }
        if (!(he.field_gb + o.field_b <= jc.field_g)) {
            return k.field_e;
        }
        return null;
    }

    final void a(int param0, mm param1, int param2, int param3, String param4) {
        nf var8 = null;
        nf var9 = null;
        if (!(param4 != null)) {
            ((ea) this).field_a = null;
            return;
        }
        if (((ea) this).field_o == param1) {
            if (((ea) this).field_w) {
                if (((ea) this).field_s == 2) {
                    if (((ea) this).field_m != null) {
                        if (((ea) this).field_m.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((ea) this).field_m = param4;
            ((ea) this).field_o = param1;
            ((ea) this).field_w = true;
            ((ea) this).field_s = 2;
            var8 = this.a(88, param3, param1, param4);
            var9 = var8;
            var9.field_a[param0] = -param1.a(param4) + param2;
            var9.field_a[param4.length()] = param2;
            hm.a(var9, param1, 0, param4, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ea.N(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(byte param0) {
        field_y = null;
        field_x = null;
        field_u = null;
        field_k = null;
        field_A = null;
        field_l = null;
        field_D = null;
        field_C = null;
    }

    public ea() {
    }

    private final nf a(int param0, int param1, mm param2, String param3) {
        nf var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        nf var7 = null;
        nf stackIn_1_0 = null;
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
        nf stackOut_0_0 = null;
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
            var7 = new nf(param1 + -param2.field_R, param1 - -param2.field_K, param3.length());
            var5 = var7;
            var6 = -31 / ((27 - param0) / 34);
            ((ea) this).field_a = new nf[]{var7};
            stackOut_0_0 = (nf) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("ea.L(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    final static boolean d(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > 34) {
          if (w.field_H == null) {
            if (!qd.e(-6)) {
              if (pd.field_f == null) {
                if (ab.c(48)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_y = null;
          if (w.field_H == null) {
            if (!qd.e(-6)) {
              if (pd.field_f == null) {
                if (ab.c(48)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_u = "Invite players";
        field_y = "Under the Sea";
        field_t = 0;
        field_p = 360;
        field_C = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_k = new java.math.BigInteger("65537");
    }
}
