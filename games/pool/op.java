/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class op {
    static int field_h;
    static int[][] field_a;
    static String field_g;
    static java.awt.Frame field_e;
    static int[] field_d;
    vj[] field_b;
    static String field_c;
    static int field_f;

    final int a(int param0) {
        int var2;
        vj[] var3;
        int var4;
        vj var5;
        int var7;
        int var6;
        L0: {
          var7 = Pool.field_O;
          var2 = param0;
          if (null != this.field_b) {
            var3 = this.field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(param0 + -56);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        vj var5 = null;
        vj[] var6 = this.field_b;
        vj[] var3 = var6;
        if (param1 > -35) {
            return -23;
        }
        for (var4 = 0; var4 < var6.length; var4++) {
            var5 = var6[var4];
            if (var5.field_h.length > param0) {
                return var5.field_h[param0];
            }
            param0 = param0 - (-1 + var5.field_h.length);
        }
        return 0;
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 66) {
            break L0;
          } else {
            this.a((byte) 123);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_b) {
              break L2;
            } else {
              if ((this.field_b.length ^ -1) >= -1) {
                break L2;
              } else {
                stackIn_6_0 = -this.field_b[0].field_e + this.field_b[this.field_b.length + -1].field_i;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        vj var4 = null;
        for (var3 = param1; this.field_b.length > var3; var3++) {
            var4 = this.field_b[var3];
            if (var4.field_h.length > param0) {
                return var3;
            }
            param0 = param0 - (var4.field_h.length - 1);
        }
        return this.field_b.length;
    }

    final int a(int param0, byte param1, String param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            if (param1 == 105) {
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if (0 < var5_int) {
                    stackIn_19_0 = (param3 + -param0 << -1634496760) / var5_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return 0;
                  }
                } else {
                  L2: {
                    var9 = param2.charAt(var8);
                    if (-61 != (var9 ^ -1)) {
                      if (var9 == 62) {
                        var6 = 0;
                        break L2;
                      } else {
                        if (var6 == 0) {
                          if (var9 == 32) {
                            var5_int++;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
                      }
                    } else {
                      var6 = 1;
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -67;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("op.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    final static float[] a(int param0, int[] param1, int param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int[] var5 = null;
        float[] var6 = null;
        float[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new float[param1.length];
              var3 = var6;
              if (param2 >= 61) {
                break L1;
              } else {
                var5 = (int[]) null;
                op.a((int[]) null, -54, (int[]) null, -45, (int[]) null, (byte) 22, 22, (int[]) null, (int[]) null, (byte) 2, (int[]) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (param1.length <= var4) {
                stackIn_6_0 = (float[]) (var6);
                break L0;
              } else {
                var6[var4] = de.a(-1, param0, param1[var4]);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("op.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, byte param5, int param6, int[] param7, int[] param8, byte param9, int[] param10) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        Object var13 = null;
        ro var14 = null;
        ro var15 = null;
        int var16 = 0;
        int var17 = 0;
        ro var18 = null;
        ro var19 = null;
        ro var20 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (hr.field_c == null) {
                  break L2;
                } else {
                  if (param1 > hr.field_c.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              kg.a(param1, (byte) 49);
              break L1;
            }
            var11_int = 0;
            L3: while (true) {
              if (param1 <= var11_int) {
                L4: {
                  var11_int = 0;
                  var12 = 0;
                  var13 = null;
                  var18 = hr.field_c[0];
                  var15 = var18;
                  var15 = var18;
                  var14 = var18;
                  var19 = hr.field_c[1];
                  var15 = var19;
                  var15 = var19;
                  var18.a((byte) 60, var19);
                  if (-1 != (param9 ^ -1)) {
                    break L4;
                  } else {
                    if (-1 == (param5 ^ -1)) {
                      var20 = hr.field_c[-1 + param1];
                      var13 = var20;
                      var20.a((byte) 60, var18);
                      var18.a(var20, -16875);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (param9 != 0) {
                      break L6;
                    } else {
                      if (param5 != 0) {
                        break L6;
                      } else {
                        stackIn_15_0 = param1 + 1;
                        break L5;
                      }
                    }
                  }
                  stackIn_15_0 = param1;
                  break L5;
                }
                var16 = stackIn_15_0;
                var17 = param3;
                L7: while (true) {
                  if (var17 >= var16) {
                    break L0;
                  } else {
                    L8: {
                      if (param1 > var17) {
                        var15 = hr.field_c[var17];
                        break L8;
                      } else {
                        var15 = hr.field_c[var17 % param1];
                        break L8;
                      }
                    }
                    L9: {
                      if (param1 > 1 + var17) {
                        var15.a((byte) 60, hr.field_c[1 + var17]);
                        var15.a(var14, -16875);
                        break L9;
                      } else {
                        if (0 != param9) {
                          break L9;
                        } else {
                          if (param5 == 0) {
                            var15.a((byte) 60, hr.field_c[0]);
                            var15.a(var14, param3 ^ -16876);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    L10: {
                      if (var14.b(var15, 24)) {
                        break L10;
                      } else {
                        L11: {
                          if ((var14.field_r & 240) == 0) {
                            L12: {
                              L13: {
                                if (var15.field_i != 0) {
                                  break L13;
                                } else {
                                  if (0 == var15.field_k) {
                                    ne.field_q = var14.field_f;
                                    di.field_h = var14.field_m;
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              ne.field_q = var15.field_i;
                              di.field_h = var15.field_k;
                              break L12;
                            }
                            var12 = 0;
                            break L11;
                          } else {
                            var12 = 2;
                            break L11;
                          }
                        }
                        L14: {
                          if (0 == (15 & var14.field_r)) {
                            var11_int = 0;
                            if (var13 == null) {
                              ng.field_w = var14.field_f;
                              fr.field_u = var14.field_m;
                              break L14;
                            } else {
                              fr.field_u = var14.field_k;
                              ng.field_w = var14.field_i;
                              break L14;
                            }
                          } else {
                            var11_int = 2;
                            break L14;
                          }
                        }
                        bo.a(var14.field_j[0], param6, (byte) 19, var14.field_h[1], var14.field_q[1], var14.field_q[0], var14.field_h[0], (byte) var11_int, var14.field_j[1], param7, (byte) var12);
                        break L10;
                      }
                    }
                    var13 = var14;
                    var14 = var15;
                    var17++;
                    continue L7;
                  }
                }
              } else {
                hr.field_c[var11_int].a(param8[var11_int], param10[var11_int], param2[var11_int], param0[var11_int], (byte) 120, param4);
                var11_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var11 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var11);

            stackIn_45_1 = new StringBuilder().append("op.H(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L15;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L16;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L17;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param8 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L19;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L20;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L20;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_46_0), stackIn_61_2 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        vj var6;
        int var7;
        int var8;
        L0: {
          var8 = Pool.field_O;
          if (this.field_b == null) {
            break L0;
          } else {
            if (-1 == (this.field_b.length ^ -1)) {
              break L0;
            } else {
              if (this.field_b[0].field_e > param0) {
                break L0;
              } else {
                if (this.field_b[param2 + this.field_b.length].field_i >= param0) {
                  if (-2 == (this.field_b.length ^ -1)) {
                    return this.field_b[0].a(-109, param1);
                  } else {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (this.field_b.length <= var5) {
                        return -1;
                      } else {
                        L2: {
                          var6 = this.field_b[var5];
                          if (param0 < var6.field_e) {
                            break L2;
                          } else {
                            if (var6.field_i < param0) {
                              break L2;
                            } else {
                              var7 = var6.a(-111, param1);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_h.length);
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 0) {
            field_c = (String) null;
        }
        field_g = null;
        field_a = (int[][]) null;
        field_e = null;
    }

    static {
        field_c = "Hide game chat";
        field_g = "Asking to join <%0>'s game...";
        field_h = 0;
        field_d = new int[]{3456, 3456};
    }
}
