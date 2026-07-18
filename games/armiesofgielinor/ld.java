/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ld extends bd {
    private int field_v;
    static int field_s;
    private int field_F;
    static String field_G;
    static int[] field_x;
    private int field_D;
    private int field_u;
    private int field_E;
    private int field_A;
    private jd field_z;
    private int field_t;
    private jd field_y;
    private int field_w;
    private int field_B;
    private int[] field_C;

    final static void a(int param0, String param1, boolean param2, byte param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        String stackIn_24_0 = null;
        String stackIn_25_0 = null;
        String stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        String stackOut_23_0 = null;
        String stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              jm.field_g = true;
              ui.field_f = param0;
              var11 = param1;
              if (!param4) {
                stackOut_3_0 = tg.field_j;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = tl.field_h;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (ui.field_f == 0) {
                var7 = iu.a(480, var11, 7502, ej.field_G, fs.field_c);
                var8 = 3 + var7;
                cj.field_k = new int[var8];
                nb.field_h = new String[var8];
                var9 = 0;
                L3: while (true) {
                  if (var9 >= var8) {
                    rg.field_m = new int[2];
                    var9 = 0;
                    L4: while (true) {
                      if (var9 >= var7) {
                        nb.field_h[var8 - 3] = "";
                        nb.field_h[-2 + var8] = var6;
                        cj.field_k[-2 + var8] = 0;
                        rg.field_m[0] = 1;
                        nb.field_h[var8 + -1] = pd.field_f;
                        cj.field_k[var8 + -1] = 1;
                        rg.field_m[1] = 2;
                        break L2;
                      } else {
                        nb.field_h[var9] = fs.field_c[var9];
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    cj.field_k[var9] = -1;
                    var9++;
                    continue L3;
                  }
                }
              } else {
                if (ui.field_f == 1) {
                  var7 = iu.a(480, var11, 7502, ej.field_G, fs.field_c);
                  var8 = 2 + var7;
                  cj.field_k = new int[var8];
                  nb.field_h = new String[var8];
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= var8) {
                      rg.field_m = new int[1];
                      var9 = 0;
                      L6: while (true) {
                        if (var7 <= var9) {
                          nb.field_h[var8 - 2] = "";
                          nb.field_h[var8 - 1] = pd.field_f;
                          cj.field_k[var8 - 1] = 0;
                          rg.field_m[0] = 2;
                          break L2;
                        } else {
                          nb.field_h[var9] = fs.field_c[var9];
                          var9++;
                          continue L6;
                        }
                      }
                    } else {
                      cj.field_k[var9] = -1;
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
            nn.field_z.field_k = rg.field_m.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (var8 >= nb.field_h.length) {
                bm.field_h = var7 + bt.field_g + -(var7 >> 1);
                co.field_f = bt.field_g - (var7 >> 1);
                ms.field_r = (ar.field_w + rd.field_b << 1) * nn.field_z.field_k;
                var8 = 0;
                L8: while (true) {
                  if (nb.field_h.length <= var8) {
                    rk.field_r = -(ms.field_r >> 1) + lm.field_g;
                    nn.field_z.a(0, param2, vo.a((byte) -73, ko.field_b, sm.field_d), 0);
                    break L0;
                  } else {
                    L9: {
                      stackOut_33_0 = ms.field_r;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (cj.field_k[var8] >= 0) {
                        stackOut_35_0 = stackIn_35_0;
                        stackOut_35_1 = jg.field_k;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        break L9;
                      } else {
                        stackOut_34_0 = stackIn_34_0;
                        stackOut_34_1 = cn.field_o;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        break L9;
                      }
                    }
                    ms.field_r = stackIn_36_0 + stackIn_36_1;
                    var8++;
                    continue L8;
                  }
                }
              } else {
                L10: {
                  stackOut_23_0 = nb.field_h[var8];
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_24_0 = stackOut_23_0;
                  if (cj.field_k[var8] < 0) {
                    stackOut_25_0 = (String) (Object) stackIn_25_0;
                    stackOut_25_1 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L10;
                  } else {
                    stackOut_24_0 = (String) (Object) stackIn_24_0;
                    stackOut_24_1 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    break L10;
                  }
                }
                L11: {
                  var9 = lp.a(stackIn_26_0, stackIn_26_1 != 0, false);
                  if (cj.field_k[var8] == -1) {
                    break L11;
                  } else {
                    var9 = var9 + df.field_E * 2;
                    break L11;
                  }
                }
                L12: {
                  if (var9 <= var7) {
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var8++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("ld.D(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param2 + ',' + 90 + ',' + param4 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 < 62) {
            Object var3 = null;
            ld.a(-105, (java.applet.Applet) null);
        }
        return tm.field_e[param1 & 2047];
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  if (param0 == 16058) {
                    var4 = param1.getCodeBase();
                    var3 = ck.a(-3780, var4, param1).getFile();
                    Object discarded$6 = lj.a(param1, "updatelinks", new Object[2], 116);
                    Object discarded$7 = lj.a(param1, "updatelinks", new Object[2], 74);
                    Object discarded$8 = lj.a(param1, "updatelinks", new Object[2], 98);
                    Object discarded$9 = lj.a(param1, "updatelinks", new Object[2], 75);
                    Object discarded$10 = lj.a(param1, "updatelinks", new Object[2], 122);
                    Object discarded$11 = lj.a(param1, "updatelinks", new Object[2], param0 + -15938);
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = decompiledCaughtException;
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("ld.B(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, ha param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((ld) this).field_E = ((ld) this).field_u;
            var10 = new int[((ld) this).field_D];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3_array = var7;
            ((ld) this).field_F = ((ld) this).field_v;
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((ld) this).field_D) {
                L2: {
                  L3: {
                    if (!((ld) this).field_y.field_W) {
                      break L3;
                    } else {
                      if (((ld) this).field_y.field_N != 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param1.field_l.a((byte) -119, (tc) (Object) new kr(((ld) this).field_u, ((ld) this).field_v, var10));
                  break L2;
                }
                L4: {
                  if (param0 == 64) {
                    break L4;
                  } else {
                    int discarded$1 = ld.a((byte) -102, 105);
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (((ld) this).field_w != 0) {
                      break L6;
                    } else {
                      if (0 == ((ld) this).field_t) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (!((ld) this).field_y.field_W) {
                      break L7;
                    } else {
                      if (7 != ((ld) this).field_y.field_N) {
                        break L7;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param1.field_l.a((byte) -119, (tc) (Object) new ns(((ld) this).field_E, ((ld) this).field_F, ((ld) this).field_w, ((ld) this).field_t, ((ld) this).field_z, ((ld) this).field_A, ((ld) this).field_B));
                  break L5;
                }
                break L0;
              } else {
                L8: {
                  var5 = ((ld) this).field_C[var4];
                  if (var5 == 1) {
                    ((ld) this).field_F = ((ld) this).field_F - 1;
                    break L8;
                  } else {
                    if (var5 == 2) {
                      ((ld) this).field_F = ((ld) this).field_F + 1;
                      break L8;
                    } else {
                      if (var5 != 0) {
                        if (var5 == 3) {
                          ((ld) this).field_E = ((ld) this).field_E - 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        ((ld) this).field_E = ((ld) this).field_E + 1;
                        break L8;
                      }
                    }
                  }
                }
                var3_array[var4] = ((ld) this).field_C[var4];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("ld.C(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final static void a(int param0, wk[] param1, tu param2, String param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
        try {
          L0: {
            L1: {
              var7_int = param2.a(param3) - -(param1[0].field_y << 1);
              var8 = -(var7_int >> 1) + param5;
              var9 = (var7_int >> 1) + param5;
              if (0 > var8) {
                param5 = param5 - var8;
                break L1;
              } else {
                if (var9 > 640) {
                  param5 = param5 - (var9 + -640);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            jp.a(-(var7_int >> 1) + param5, param0, var7_int, param1, param4, -8991);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7;
            stackOut_7_1 = new StringBuilder().append("ld.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + -75 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 >= -40) {
            return;
        }
        field_G = null;
        field_x = null;
    }

    ld(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, jd param7, jd param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            L1: {
              ((ld) this).field_v = param1;
              ((ld) this).field_w = param4;
              ((ld) this).field_y = param7;
              ((ld) this).field_D = param3;
              ((ld) this).field_u = param0;
              ((ld) this).field_t = param5;
              ((ld) this).field_m = param6;
              ((ld) this).field_C = param2;
              if (param8 == null) {
                ((ld) this).field_w = 0;
                ((ld) this).field_z = null;
                ((ld) this).field_t = 0;
                break L1;
              } else {
                L2: {
                  ((ld) this).field_z = param8.b(false);
                  var10_int = bw.field_m[((ld) this).field_y.field_N][9];
                  stackOut_2_0 = this;
                  stackOut_2_1 = ((ld) this).field_y.field_Y * vu.field_N[var10_int] / ((ld) this).field_y.field_t;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  if (((ld) this).field_y.field_Y * vu.field_N[var10_int] % ((ld) this).field_y.field_t != 0) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = 0;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    break L2;
                  }
                }
                L3: {
                  ((ld) this).field_A = stackIn_5_1 - -stackIn_5_2;
                  var11 = bw.field_m[((ld) this).field_z.field_N][9];
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (0 != ((ld) this).field_z.field_Y * vu.field_N[var11] % ((ld) this).field_z.field_t) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((ld) this).field_B = stackIn_8_1 + ((ld) this).field_z.field_Y * vu.field_N[var11] / ((ld) this).field_z.field_t;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var10;
            stackOut_11_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param7 == null) {
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param8 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "No target selected.";
        field_s = -1;
    }
}
