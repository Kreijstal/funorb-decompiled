/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends me {
    static int field_m;
    static String field_q;
    private int field_r;
    private int[] field_n;
    static String field_k;
    private fs field_o;
    static int field_p;
    private fs field_l;

    final int b(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((ui) this).a((byte) -126, (dc) null, (kq) null);
        }
        return rs.field_Cb.field_J * 3 - -(((ui) this).field_n.length * cc.field_n);
    }

    final boolean a(dc param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, (byte) 100)) {
              L1: {
                ((ui) this).field_l = param0.field_g.field_e[36].field_y;
                if (((ui) this).field_l == null) {
                  break L1;
                } else {
                  ((ui) this).field_n[((ui) this).field_l.field_x] = ((ui) this).field_n[((ui) this).field_l.field_x] + 1;
                  if (((ui) this).field_o != null) {
                    if (((ui) this).field_o == ((ui) this).field_l) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((ui) this).field_o = ((ui) this).field_l;
                    break L1;
                  }
                }
              }
              var3_int = 0;
              L2: while (true) {
                if (var3_int >= ((ui) this).field_i.length) {
                  if (param0.field_O >= 19) {
                    var3_int = 0;
                    var4 = 0;
                    var5 = null;
                    var6 = 0;
                    L3: while (true) {
                      if (((ui) this).field_n.length <= var6) {
                        if (1 != var4) {
                          var6 = 0;
                          L4: while (true) {
                            if (((ui) this).field_i.length <= var6) {
                              L5: {
                                ((ui) this).field_g = new fs[var4];
                                var6 = 0;
                                if (param1 > 23) {
                                  break L5;
                                } else {
                                  int discarded$1 = ui.a(116, -102, -108, -15);
                                  break L5;
                                }
                              }
                              var7 = 0;
                              L6: while (true) {
                                if (((ui) this).field_i.length <= var7) {
                                  stackOut_44_0 = 1;
                                  stackIn_45_0 = stackOut_44_0;
                                  break L0;
                                } else {
                                  L7: {
                                    if (((ui) this).field_n[var7] == var3_int) {
                                      ((ui) this).field_g[var6] = ((ui) this).field_i[var7];
                                      var6++;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var7++;
                                  continue L6;
                                }
                              }
                            } else {
                              L8: {
                                if (((ui) this).field_n[var6] != var3_int) {
                                  break L8;
                                } else {
                                  if (((ui) this).field_i[var6] == ((ui) this).field_l) {
                                    ((ui) this).field_g = new fs[]{((ui) this).field_l};
                                    stackOut_33_0 = 1;
                                    stackIn_34_0 = stackOut_33_0;
                                    return stackIn_34_0 != 0;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var6++;
                              continue L4;
                            }
                          }
                        } else {
                          ((ui) this).field_g = new fs[]{(fs) var5};
                          stackOut_26_0 = 1;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        }
                      } else {
                        L9: {
                          if (var3_int != ((ui) this).field_n[var6]) {
                            break L9;
                          } else {
                            var4++;
                            break L9;
                          }
                        }
                        L10: {
                          if (var3_int < ((ui) this).field_n[var6]) {
                            var4 = 1;
                            var5 = (Object) (Object) ((ui) this).field_i[var6];
                            var3_int = ((ui) this).field_n[var6];
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  }
                } else {
                  L11: {
                    if ((param0.field_w & 1 << var3_int) == 0) {
                      break L11;
                    } else {
                      ((ui) this).field_n[var3_int] = -1;
                      break L11;
                    }
                  }
                  var3_int++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var3;
            stackOut_46_1 = new StringBuilder().append("ui.F(");
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
              break L12;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param1 + ')');
        }
        return stackIn_45_0 != 0;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 16711935 & param0;
        param0 = param0 & 65280;
        if (param2 >= -77) {
            field_m = 86;
        }
        int var5 = param1 & 16711935;
        param1 = param1 & 65280;
        return param3 * param1 + (256 + -param3) * param0 >>> 8 & -1778319616 | -352386817 & (-param3 + 256) * var4 - -(param3 * var5) >>> 8;
    }

    final static String c(boolean param0) {
        return cg.field_F;
    }

    final void a(int param0, ob param1) {
        int var3_int = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            for (var3_int = 0; var3_int < ((ui) this).field_n.length; var3_int++) {
                param1.c(((ui) this).field_n[var3_int], (byte) -105);
            }
            int var4 = -70 % ((param0 - -72) / 45);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ui.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fs[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        fs[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            ((ui) this).field_n = null;
            break L0;
          }
        }
        if (((ui) this).field_g == null) {
          var2 = 0;
          var3 = 1;
          var4_int = 0;
          L1: while (true) {
            if (((ui) this).field_i.length <= var4_int) {
              var4 = new fs[var2];
              var8 = 0;
              var5 = var8;
              L2: while (true) {
                if (var8 >= ((ui) this).field_i.length) {
                  return var4;
                } else {
                  L3: {
                    stackOut_17_0 = ((ui) this).field_n[var8];
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (((ui) this).field_i[var8] != ((ui) this).field_l) {
                      stackOut_19_0 = stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L3;
                    } else {
                      stackOut_18_0 = stackIn_18_0;
                      stackOut_18_1 = ((ui) this).field_r;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L3;
                    }
                  }
                  var6 = stackIn_20_0 + stackIn_20_1;
                  if (var3 == var6) {
                    var2--;
                    var4[var2] = ((ui) this).field_i[var8];
                    var8++;
                    continue L2;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            } else {
              L4: {
                if (((ui) this).field_l != ((ui) this).field_i[var4_int]) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L4;
                } else {
                  stackOut_7_0 = ((ui) this).field_r;
                  stackIn_9_0 = stackOut_7_0;
                  break L4;
                }
              }
              L5: {
                var5 = stackIn_9_0 + ((ui) this).field_n[var4_int];
                if (var5 == var3) {
                  var2++;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var3 < var5) {
                var2 = 1;
                var3 = var5;
                var4_int++;
                continue L1;
              } else {
                var4_int++;
                continue L1;
              }
            }
          }
        } else {
          return ((ui) this).field_g;
        }
    }

    final void a(ob param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == -109) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= ((ui) this).field_n.length) {
                  break L0;
                } else {
                  ((ui) this).field_n[var3_int] = param0.g(-2852);
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ui.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        qk[] var7_array = null;
        int var8_int = 0;
        fs[] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int[] var10 = null;
        int var11_int = 0;
        fs[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        fs var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        qk[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var16 = param1.field_g.field_e[36].field_y;
            var28 = new int[((ui) this).field_i.length];
            var24 = var28;
            var20 = var24;
            var14 = var20;
            var5 = var14;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var28.length) {
                var6 = 0;
                var29 = ((ui) this).field_n;
                var25 = var29;
                var21 = var25;
                var15 = var21;
                var13 = var15;
                var7 = var13;
                var8_int = 0;
                L2: while (true) {
                  if (var8_int >= var29.length) {
                    if (param0 < -9) {
                      L3: {
                        if (var6 > 0) {
                          lh.a((byte) 84, var5, (int[]) ((ui) this).field_n.clone());
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var19 = new qk[3];
                        var7_array = var19;
                        var7_array[0] = new qk(0, 0, 182, rs.field_Cb.field_J, re.a(hr.field_d, 4371, new String[1]));
                        if (var16 == null) {
                          var7_array[1] = new qk(0, 0, 182, rs.field_Cb.field_J, cj.field_t);
                          var7_array[2] = new qk(0, 0, 182, rs.field_Cb.field_J, (String) null);
                          break L4;
                        } else {
                          var7_array[1] = new qk(0, 0, 182, rs.field_Cb.field_J, ms.field_h);
                          var7_array[2] = new qk(0, 0, 182, rs.field_Cb.field_J, var16.field_t, var16.field_k);
                          break L4;
                        }
                      }
                      var8 = new fs[((ui) this).field_i.length];
                      var31 = new int[((ui) this).field_i.length];
                      var27 = var31;
                      var23 = var27;
                      var18 = var23;
                      var9 = var18;
                      var30 = new int[((ui) this).field_i.length];
                      var26 = var30;
                      var22 = var26;
                      var17 = var22;
                      var10 = var17;
                      var11_int = 0;
                      L5: while (true) {
                        if (var11_int >= ((ui) this).field_i.length) {
                          L6: {
                            var11 = ((ui) this).b(0);
                            if (((ui) this).field_g != null) {
                              ((ui) this).field_r = 0;
                              break L6;
                            } else {
                              ((ui) this).field_r = 20 + -param1.field_O;
                              break L6;
                            }
                          }
                          param2.a(20, var8, var30, var31, var11, var19, (byte) -47, ((ui) this).field_r);
                          break L0;
                        } else {
                          L7: {
                            var8[var11_int] = ((ui) this).field_i[var28[var11_int]];
                            var9[var11_int] = ((ui) this).field_n[var28[var11_int]];
                            stackOut_17_0 = (int[]) var10;
                            stackOut_17_1 = var11_int;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            if (var16 != ((ui) this).field_i[var28[var11_int]]) {
                              stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                              stackOut_19_1 = stackIn_19_1;
                              stackOut_19_2 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              stackIn_20_2 = stackOut_19_2;
                              break L7;
                            } else {
                              stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                              stackOut_18_1 = stackIn_18_1;
                              stackOut_18_2 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              stackIn_20_1 = stackOut_18_1;
                              stackIn_20_2 = stackOut_18_2;
                              break L7;
                            }
                          }
                          stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                          var11_int++;
                          continue L5;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var9_int = var29[var8_int];
                    var6 = var6 + var9_int;
                    var8_int++;
                    continue L2;
                  }
                }
              } else {
                var28[var6] = var6;
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("ui.I(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    public static void c() {
        field_k = null;
        field_q = null;
    }

    final static int a(int param0, byte param1, boolean param2, String param3, boolean param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_5_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_87_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_104_0 = 0;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_108_2 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_86_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_103_0 = 0;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            String stackOut_107_2 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            var9 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (wg.field_f != null) {
                    break L1;
                  } else {
                    if (!ts.a(param2, -2)) {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (j.field_r == cs.field_j) {
                    L3: {
                      if (!param2) {
                        mq.field_c = aj.a(param5, false, false, param3);
                        break L3;
                      } else {
                        var10 = null;
                        mq.field_c = dd.a(false, param3, (String) null, 4684, pd.field_l);
                        break L3;
                      }
                    }
                    js.field_f.field_j = 0;
                    js.field_f.c(14, (byte) -80);
                    js.field_f.c(mq.field_c.a((byte) -73).field_d, (byte) -68);
                    d.a(-1, (byte) 82);
                    cs.field_j = ti.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (ti.field_i == cs.field_j) {
                    if (es.a(-90, 1)) {
                      var6_int = sa.field_a.j(-92);
                      sa.field_a.field_j = 0;
                      if (var6_int != 0) {
                        ej.field_e = var6_int;
                        cs.field_j = fs.field_l;
                        rr.field_t = -1;
                        break L4;
                      } else {
                        cs.field_j = qq.field_m;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (qq.field_m != cs.field_j) {
                    break L5;
                  } else {
                    if (es.a(-91, 8)) {
                      w.field_I = sa.field_a.d(110);
                      sa.field_a.field_j = 0;
                      gi.a(param0, param2, param4, -84, mq.field_c);
                      cs.field_j = ti.field_d;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (ti.field_d != cs.field_j) {
                    break L6;
                  } else {
                    if (es.a(119, 1)) {
                      L7: {
                        var6_int = sa.field_a.j(-63);
                        fr.field_H = null;
                        sa.field_a.field_j = 0;
                        ej.field_e = var6_int;
                        if (var6_int == 0) {
                          break L7;
                        } else {
                          if (var6_int != 1) {
                            if (var6_int != 8) {
                              rr.field_t = -1;
                              cs.field_j = fs.field_l;
                              break L6;
                            } else {
                              q.g(-118);
                              ke.field_j = false;
                              stackOut_31_0 = var6_int;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      cs.field_j = sh.field_c;
                      rr.field_t = -1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if (sh.field_c == cs.field_j) {
                    if (uc.d((byte) -46)) {
                      L9: {
                        pd.field_l = sa.field_a.d(46);
                        di.field_q = param3;
                        bs.field_b = sa.field_a.j(-85);
                        jd.field_i = sa.field_a.j(-89);
                        es.field_m = sa.field_a.f(-20976);
                        var6_ref = sa.field_a.i(1910283844);
                        var7 = sa.field_a.j(-123);
                        if ((var7 & 1) != 0) {
                          ij.a(24);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (0 == (16 & var7)) {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          break L10;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          break L10;
                        }
                      }
                      L11: {
                        va.field_j = stackIn_44_0 != 0;
                        if (param2) {
                          break L11;
                        } else {
                          L12: {
                            if ((4 & var7) == 0) {
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L12;
                            } else {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L12;
                            }
                          }
                          L13: {
                            si.field_v = stackIn_48_0 != 0;
                            if ((var7 & 8) == 0) {
                              stackOut_50_0 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              break L13;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L13;
                            }
                          }
                          L14: {
                            bg.field_g = stackIn_51_0 != 0;
                            if ((2 & var7) == 0) {
                              stackOut_53_0 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              break L14;
                            } else {
                              stackOut_52_0 = 1;
                              stackIn_54_0 = stackOut_52_0;
                              break L14;
                            }
                          }
                          ae.field_b = stackIn_54_0 != 0;
                          if (!bg.field_g) {
                            break L11;
                          } else {
                            ae.field_b = true;
                            break L11;
                          }
                        }
                      }
                      L15: {
                        if (!ka.field_a) {
                          break L15;
                        } else {
                          int discarded$8 = sa.field_a.j(-66);
                          int discarded$9 = sa.field_a.j(-102);
                          int discarded$10 = sa.field_a.a(16711680);
                          ir.field_E = sa.field_a.f(-20976);
                          k.field_c = new byte[ir.field_E];
                          var8 = 0;
                          L16: while (true) {
                            if (~ir.field_E >= ~var8) {
                              break L15;
                            } else {
                              k.field_c[var8] = sa.field_a.g(-2852);
                              var8++;
                              continue L16;
                            }
                          }
                        }
                      }
                      L17: {
                        ln.field_o = sa.field_a.e(-1);
                        var11 = (CharSequence) (Object) ln.field_o;
                        int discarded$11 = 1;
                        ci.field_d = ji.a(var11);
                        tf.field_n = sa.field_a.j(-112);
                        cs.field_j = ih.field_f;
                        if (mq.field_c.a((byte) 115) != hg.field_u) {
                          if (mq.field_c.a((byte) 123) != oi.field_b) {
                            break L17;
                          } else {
                            dm.field_f.a(kq.f((byte) 126), true);
                            break L17;
                          }
                        } else {
                          og.field_b.a(kq.f((byte) 127), true);
                          break L17;
                        }
                      }
                      L18: {
                        ke.field_j = false;
                        if (var6_ref == null) {
                          break L18;
                        } else {
                          jf.a(-25602, var6_ref, kq.f((byte) 125));
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (es.field_m > 0) {
                            break L20;
                          } else {
                            if (si.field_v) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  Object discarded$12 = ll.a("unzap", kq.f((byte) 127), (byte) 121);
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            }
                          }
                        }
                        try {
                          L23: {
                            Object discarded$13 = ll.a(kq.f((byte) 125), "zap", new Object[1], -116);
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if (es.field_m <= 0) {
                          break L25;
                        } else {
                          db.field_b = true;
                          break L25;
                        }
                      }
                      js.field_f.a(qn.field_b, (byte) -77);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          sa.field_a.a(qn.field_b, (byte) 107);
                          stackOut_80_0 = ej.field_e;
                          stackIn_81_0 = stackOut_80_0;
                          return stackIn_81_0;
                        } else {
                          qn.field_b[var8] = qn.field_b[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L27: {
                  if (cs.field_j != fs.field_l) {
                    break L27;
                  } else {
                    if (!uc.d((byte) -33)) {
                      break L27;
                    } else {
                      L28: {
                        q.g(-114);
                        if (ej.field_e != 7) {
                          break L28;
                        } else {
                          if (ke.field_j) {
                            break L28;
                          } else {
                            ke.field_j = true;
                            stackOut_86_0 = -1;
                            stackIn_87_0 = stackOut_86_0;
                            return stackIn_87_0;
                          }
                        }
                      }
                      L29: {
                        if (ej.field_e == 7) {
                          ej.field_e = 3;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      nl.field_c = sa.field_a.e(-1);
                      ke.field_j = false;
                      stackOut_91_0 = ej.field_e;
                      stackIn_92_0 = stackOut_91_0;
                      return stackIn_92_0;
                    }
                  }
                }
                L30: {
                  if (param1 <= -48) {
                    break L30;
                  } else {
                    int discarded$14 = ui.a(-26, -48, -112, -53);
                    break L30;
                  }
                }
                L31: {
                  if (wg.field_f != null) {
                    break L31;
                  } else {
                    if (ke.field_j) {
                      L32: {
                        int discarded$15 = 18;
                        if (wh.a() <= 30000L) {
                          nl.field_c = wb.field_d;
                          break L32;
                        } else {
                          nl.field_c = gq.field_f;
                          break L32;
                        }
                      }
                      ke.field_j = false;
                      stackOut_101_0 = 3;
                      stackIn_102_0 = stackOut_101_0;
                      return stackIn_102_0;
                    } else {
                      var6_int = of.field_f;
                      of.field_f = bb.field_c;
                      ke.field_j = true;
                      bb.field_c = var6_int;
                      break L31;
                    }
                  }
                }
                stackOut_103_0 = -1;
                stackIn_104_0 = stackOut_103_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_105_0 = (RuntimeException) var6;
                stackOut_105_1 = new StringBuilder().append("ui.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_107_0 = stackOut_105_0;
                stackIn_107_1 = stackOut_105_1;
                stackIn_106_0 = stackOut_105_0;
                stackIn_106_1 = stackOut_105_1;
                if (param3 == null) {
                  stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
                  stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
                  stackOut_107_2 = "null";
                  stackIn_108_0 = stackOut_107_0;
                  stackIn_108_1 = stackOut_107_1;
                  stackIn_108_2 = stackOut_107_2;
                  break L33;
                } else {
                  stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
                  stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
                  stackOut_106_2 = "{...}";
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_108_1 = stackOut_106_1;
                  stackIn_108_2 = stackOut_106_2;
                  break L33;
                }
              }
              L34: {
                stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
                stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param4).append(',');
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_109_0 = stackOut_108_0;
                stackIn_109_1 = stackOut_108_1;
                if (param5 == null) {
                  stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
                  stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
                  stackOut_110_2 = "null";
                  stackIn_111_0 = stackOut_110_0;
                  stackIn_111_1 = stackOut_110_1;
                  stackIn_111_2 = stackOut_110_2;
                  break L34;
                } else {
                  stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
                  stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                  stackOut_109_2 = "{...}";
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_111_1 = stackOut_109_1;
                  stackIn_111_2 = stackOut_109_2;
                  break L34;
                }
              }
              throw r.a((Throwable) (Object) stackIn_111_0, stackIn_111_2 + ')');
            }
            return stackIn_104_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ui(fs[] param0) {
        super(param0);
        try {
            ((ui) this).field_n = new int[((ui) this).field_i.length];
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Projected winner.";
        field_k = "(1 player wants to join)";
    }
}
