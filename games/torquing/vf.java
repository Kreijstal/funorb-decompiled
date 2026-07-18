/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    private int field_c;
    static double[] field_e;
    private int field_b;
    float field_l;
    private rp[] field_f;
    static String field_m;
    String field_h;
    private int field_k;
    static la field_a;
    static t[] field_i;
    static String field_g;
    static int field_d;
    static int[][] field_j;

    final static up a(String param0, int param1) {
        RuntimeException var2 = null;
        up stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        up stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!qk.field_q.c(param1 + 484)) {
                break L1;
              } else {
                if (param0.equals((Object) (Object) qk.field_q.a((byte) -127))) {
                  break L1;
                } else {
                  qk.field_q = ci.a(param1 ^ -120, param0);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                vf.a(-21);
                break L2;
              }
            }
            stackOut_9_0 = qk.field_q;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("vf.A(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        field_g = null;
        field_i = null;
        if (param0 < 26) {
            return;
        }
        try {
            field_j = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "vf.F(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        rp var2_ref = null;
        int var3 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        var3 = Torquing.field_u;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (~((vf) this).field_k <= ~((vf) this).field_c) {
                    break L3;
                  } else {
                    var2_ref = ((vf) this).field_f[((vf) this).field_k];
                    stackOut_2_0 = var2_ref.field_a.a(-12749);
                    stackIn_38_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (stackIn_3_0) {
                        L4: {
                          if (var2_ref.field_g < 0) {
                            break L4;
                          } else {
                            if (!var2_ref.field_a.a((byte) 101, var2_ref.field_g)) {
                              this.a(var2_ref, var2_ref.field_a.a(true, var2_ref.field_g), -20);
                              stackOut_14_0 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              return stackIn_15_0 != 0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (var2_ref.field_c == null) {
                            break L5;
                          } else {
                            if (var2_ref.field_a.a(true, var2_ref.field_c)) {
                              break L5;
                            } else {
                              this.a(var2_ref, var2_ref.field_a.a((byte) 97, var2_ref.field_c), -93);
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              return stackIn_21_0 != 0;
                            }
                          }
                        }
                        L6: {
                          if (0 <= var2_ref.field_g) {
                            break L6;
                          } else {
                            if (null != var2_ref.field_c) {
                              break L6;
                            } else {
                              if (var2_ref.field_f == null) {
                                break L6;
                              } else {
                                if (!var2_ref.field_a.c(param0 + -19375)) {
                                  this.a(var2_ref, var2_ref.field_a.a((byte) -32), -100);
                                  stackOut_34_0 = 0;
                                  stackIn_35_0 = stackOut_34_0;
                                  return stackIn_35_0 != 0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        ((vf) this).field_k = ((vf) this).field_k + 1;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        this.a(var2_ref, 0, param0 + -28);
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                }
                stackOut_37_0 = param0;
                stackIn_38_0 = stackOut_37_0;
                break L2;
              }
              L7: {
                if (stackIn_38_0 == 0) {
                  break L7;
                } else {
                  boolean discarded$1 = ((vf) this).b(-7);
                  break L7;
                }
              }
              stackOut_41_0 = 1;
              stackIn_42_0 = stackOut_41_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "vf.E(" + param0 + ')');
        }
        return stackIn_42_0 != 0;
    }

    final static void a(of param0, int param1, int param2, boolean param3, byte param4) {
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
        boolean stackIn_13_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_55_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var19 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5_int = ke.a(3 * (param2 - param1), (byte) -121);
              var6 = param1 * 3;
              var7 = -10 + var5_int;
              wi.a(0);
              if (param0.field_M <= 0) {
                break L1;
              } else {
                if (null != param0.field_i) {
                  io.b((byte) 78);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              ui.field_k = 0;
              var8 = 0;
              if (param4 > 110) {
                break L2;
              } else {
                field_j = null;
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (~param0.field_R >= ~var8) {
                    break L5;
                  } else {
                    var9 = param0.field_G[var8];
                    var10 = param0.field_r[var8];
                    var11 = param0.field_I[var8];
                    stackOut_12_0 = param3;
                    stackIn_56_0 = stackOut_12_0 ? 1 : 0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (!stackIn_13_0) {
                            break L7;
                          } else {
                            var12 = kh.field_m[var9];
                            var13 = u.field_w[var9];
                            var14 = -var12 + kh.field_m[var10];
                            var15 = -var12 + kh.field_m[var11];
                            var16 = u.field_w[var10] + -var13;
                            var17 = -var13 + u.field_w[var11];
                            if (var17 * var14 - var16 * var15 < 0) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        L8: {
                          var12 = hl.field_b[var9];
                          if (var12 != -2147483648) {
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
                          var13 = hl.field_b[var10];
                          if (var13 != -2147483648) {
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
                          var14 = hl.field_b[var11];
                          if (var14 != -2147483648) {
                            break L10;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          var15 = var14 + var12 - (-var13 + var6);
                          if (var7 < 0) {
                            stackOut_35_0 = var15 << -var7;
                            stackIn_36_0 = stackOut_35_0;
                            break L11;
                          } else {
                            stackOut_33_0 = var15 >> var7;
                            stackIn_36_0 = stackOut_33_0;
                            break L11;
                          }
                        }
                        var16 = -stackIn_36_0 + -1 + u.field_v.length;
                        var17 = u.field_v[var16];
                        L12: while (true) {
                          L13: {
                            L14: {
                              if (var17 >> 4 == 0) {
                                break L14;
                              } else {
                                var16--;
                                stackOut_38_0 = -1;
                                stackOut_38_1 = ~var16;
                                stackIn_47_0 = stackOut_38_0;
                                stackIn_47_1 = stackOut_38_1;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                if (var19 != 0) {
                                  break L13;
                                } else {
                                  L15: {
                                    if (stackIn_39_0 >= stackIn_39_1) {
                                      break L15;
                                    } else {
                                      System.err.println("Out of range!");
                                      if (var19 == 0) {
                                        break L6;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var17 = u.field_v[var16];
                                  if (var19 == 0) {
                                    continue L12;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            stackOut_46_0 = var16 << 4;
                            stackOut_46_1 = -var17;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            break L13;
                          }
                          L16: {
                            var18 = stackIn_47_0 - stackIn_47_1;
                            mn.field_bb[var18] = var8;
                            u.field_v[var16] = 1 + var17;
                            if (param0.field_M <= 0) {
                              break L16;
                            } else {
                              if (param0.field_i == null) {
                                break L16;
                              } else {
                                a.field_f[param0.field_i[var8]] = a.field_f[param0.field_i[var8]] + 1;
                                break L16;
                              }
                            }
                          }
                          ui.field_k = ui.field_k + 1;
                          break L6;
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
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                break L4;
              }
              L17: {
                L18: {
                  if (stackIn_56_0 >= param0.field_M) {
                    break L18;
                  } else {
                    if (param0.field_i != null) {
                      var8 = 0;
                      var9 = 0;
                      L19: while (true) {
                        if (a.field_f.length <= var9) {
                          break L18;
                        } else {
                          var10 = a.field_f[var9];
                          a.field_f[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L17;
                          } else {
                            if (var19 == 0) {
                              continue L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var5;
            stackOut_69_1 = new StringBuilder().append("vf.C(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L20;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(rp param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        float var4_float = 0.0f;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)param1 / 100.0f + (float)(((vf) this).field_k + 1);
              ((vf) this).field_l = var4_float * (float)((vf) this).field_b / (float)(((vf) this).field_c - -1);
              if (param2 < -18) {
                break L1;
              } else {
                vf.a((of) null, 80, -3, false, (byte) 99);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 != 0) {
                  break L3;
                } else {
                  ((vf) this).field_h = param0.field_e;
                  if (Torquing.field_u == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((vf) this).field_h = param0.field_f + " - " + param1 + "%";
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("vf.B(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private vf() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "vf.<init>()");
        }
    }

    final static boolean a(ki param0, String param1, int param2, boolean param3, int param4, String param5, String param6) {
        nm var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (tp.field_h == bh.field_a) {
              if (param4 == 7013) {
                L1: {
                  L2: {
                    var7 = new nm(dc.field_a, param0);
                    dc.field_a.a((gm) (Object) var7, (byte) 91);
                    if (!mc.b(120)) {
                      break L2;
                    } else {
                      var7.o(11);
                      if (Torquing.field_u == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  bh.field_a = mg.field_b;
                  bn.field_i = param3;
                  rf.field_u = param6;
                  ol.field_a = param5;
                  oh.field_d = param2;
                  on.field_d = param1;
                  ua.field_b = null;
                  break L1;
                }
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var7_ref;
            stackOut_14_1 = new StringBuilder().append("vf.D(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new double[9];
        field_m = "Congratulations! You've completed the free game!";
        field_g = "Waiting for models";
        field_j = new int[][]{new int[3], new int[3]};
    }
}
