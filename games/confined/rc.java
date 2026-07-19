/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc implements fe {
    private int field_f;
    static int field_i;
    private int field_e;
    private int field_g;
    private int field_h;
    static int[] field_b;
    private ok field_d;
    private int field_j;
    private int field_c;
    static String field_a;

    public static void a(int param0) {
        try {
            field_a = null;
            field_b = null;
            if (param0 != -29955) {
                rc.a(108);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rc.A(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -22889) {
                break L1;
              } else {
                rc.a(-14);
                break L1;
              }
            }
            qc.field_m = e.field_c.d(true);
            dc.field_J = hh.a(0, (CharSequence) ((Object) qc.field_m));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "rc.D(" + param0 + ')');
        }
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        RuntimeException var6 = null;
        nj var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fj stackIn_5_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        fj stackOut_4_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 instanceof nj) {
                stackOut_4_0 = (fj) (param3);
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_5_0 = (fj) ((Object) stackOut_2_0);
                break L1;
              }
            }
            L2: {
              var6_ref = (nj) ((Object) stackIn_5_0);
              fn.e(param3.field_q + param1, param4 - -param3.field_m, param3.field_F, param3.field_z, this.field_h);
              if (null != var6_ref) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param3.field_F + -(var6_ref.field_S * 2);
              if (param0 < -97) {
                break L3;
              } else {
                this.field_c = -40;
                break L3;
              }
            }
            var8 = param1 - (-param3.field_q - var6_ref.field_S);
            var9 = var6_ref.field_Q + (param4 + param3.field_m);
            fn.f(var8, var9, var7 + var8, var9, this.field_j);
            var10 = -1 + var6_ref.h((byte) 127);
            L4: while (true) {
              L5: {
                L6: {
                  if ((var10 ^ -1) > -1) {
                    break L6;
                  } else {
                    fn.e(var6_ref.a((byte) 20, var10) * var7 / var6_ref.i((byte) -96) + var8, var9, this.field_f, this.field_e);
                    var10--;
                    if (var11 != 0) {
                      break L5;
                    } else {
                      if (var11 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (null == this.field_d) {
                  break L5;
                } else {
                  this.field_d.b(var6_ref.field_B, var8 + var7 / 2, this.field_d.field_v + (var9 - -var6_ref.field_Q), this.field_g, this.field_c);
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("rc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3, rm param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0 = false;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_55_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var19 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -112) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              var5_int = km.b(4, 3 * (param3 + -param1));
              var6 = 3 * param1;
              var7 = var5_int - 10;
              ab.b((byte) 110);
              if ((param4.field_A ^ -1) >= -1) {
                break L2;
              } else {
                if (null != param4.field_P) {
                  se.a(0);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            ei.field_jb = 0;
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (param4.field_w <= var8) {
                    break L5;
                  } else {
                    var9 = param4.field_z[var8];
                    var10 = param4.field_m[var8];
                    var11 = param4.field_J[var8];
                    stackOut_13_0 = param2;
                    stackIn_56_0 = stackOut_13_0 ? 1 : 0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_14_0) {
                            var12 = qf.field_a[var9];
                            var13 = db.field_x[var9];
                            var14 = -var12 + qf.field_a[var10];
                            var15 = qf.field_a[var11] + -var12;
                            var16 = -var13 + db.field_x[var10];
                            var17 = db.field_x[var11] - var13;
                            if (-1 < (-(var16 * var15) + var17 * var14 ^ -1)) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        var12 = cj.field_b[var9];
                        if (-2147483648 == var12) {
                          break L6;
                        } else {
                          L8: {
                            var13 = cj.field_b[var10];
                            if (2147483647 != (var13 ^ -1)) {
                              break L8;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            var14 = cj.field_b[var11];
                            if (2147483647 != (var14 ^ -1)) {
                              break L9;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            var15 = var12 + var13 + var14 - var6;
                            if (0 <= var7) {
                              stackOut_34_0 = var15 >> var7;
                              stackIn_35_0 = stackOut_34_0;
                              break L10;
                            } else {
                              stackOut_32_0 = var15 << -var7;
                              stackIn_35_0 = stackOut_32_0;
                              break L10;
                            }
                          }
                          var16 = -stackIn_35_0 + vb.field_e.length + -1;
                          var17 = vb.field_e[var16];
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (0 == var17 >> -1089766396) {
                                  break L13;
                                } else {
                                  var16--;
                                  stackOut_37_0 = 0;
                                  stackOut_37_1 = var16;
                                  stackIn_46_0 = stackOut_37_0;
                                  stackIn_46_1 = stackOut_37_1;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  if (var19 != 0) {
                                    break L12;
                                  } else {
                                    L14: {
                                      if (stackIn_38_0 <= stackIn_38_1) {
                                        break L14;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var17 = vb.field_e[var16];
                                    if (var19 == 0) {
                                      continue L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              stackOut_45_0 = var17;
                              stackOut_45_1 = var16 << -461398876;
                              stackIn_46_0 = stackOut_45_0;
                              stackIn_46_1 = stackOut_45_1;
                              break L12;
                            }
                            L15: {
                              var18 = stackIn_46_0 + stackIn_46_1;
                              tl.field_i[var18] = var8;
                              vb.field_e[var16] = var17 + 1;
                              if (param4.field_A <= 0) {
                                break L15;
                              } else {
                                if (param4.field_P != null) {
                                  bd.field_g[param4.field_P[var8]] = bd.field_g[param4.field_P[var8]] + 1;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            ei.field_jb = ei.field_jb + 1;
                            break L6;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_55_0 = -1;
                stackIn_56_0 = stackOut_55_0;
                break L4;
              }
              L16: {
                L17: {
                  if (stackIn_56_0 <= (param4.field_A ^ -1)) {
                    break L17;
                  } else {
                    if (null != param4.field_P) {
                      var8 = 0;
                      var9 = 0;
                      L18: while (true) {
                        if (var9 >= bd.field_g.length) {
                          break L17;
                        } else {
                          var10 = bd.field_g[var9];
                          bd.field_g[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L16;
                          } else {
                            if (var19 == 0) {
                              continue L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                break L16;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var5);
            stackOut_69_1 = new StringBuilder().append("rc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L19;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L19;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
    }

    rc(ok param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.field_c = param2;
            this.field_g = param1;
            this.field_e = param6;
            this.field_j = param3;
            this.field_h = param4;
            this.field_d = param0;
            this.field_f = param5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rc.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_b = new int[6];
        field_a = "Player Name: ";
    }
}
