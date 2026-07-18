/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ada extends k {
    static ee field_l;
    static ee field_p;
    static boolean field_k;
    private int[][] field_n;
    private int[] field_o;
    static ee field_m;

    public ada() {
        super(1, false);
        ((ada) this).field_o = new int[257];
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                var4_int = param1.b(16711935);
                if (0 == var4_int) {
                  ((ada) this).field_n = new int[param1.b(16711935)][4];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= ((ada) this).field_n.length) {
                      break L1;
                    } else {
                      ((ada) this).field_n[var5][0] = param1.e((byte) 124);
                      ((ada) this).field_n[var5][1] = param1.b(16711935) << 4;
                      ((ada) this).field_n[var5][2] = param1.b(16711935) << 4;
                      ((ada) this).field_n[var5][3] = param1.b(16711935) << 4;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  this.a(var4_int, (byte) 33);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                int[][] discarded$2 = ((ada) this).a(false, -103);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ada.E(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var17 = null;
        L0: {
          var13 = BachelorFridge.field_y;
          if (param0 == 578) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        L1: {
          var5 = ((ada) this).field_n.length;
          if (var5 > 0) {
            var6 = 0;
            L2: while (true) {
              if (257 <= var6) {
                break L1;
              } else {
                var7 = 0;
                var8 = var6 << 4;
                var9 = 0;
                L3: while (true) {
                  L4: {
                    if (var9 >= var5) {
                      break L4;
                    } else {
                      if (var8 < ((ada) this).field_n[var9][0]) {
                        break L4;
                      } else {
                        var7++;
                        var9++;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    if (var5 > var7) {
                      var17 = ((ada) this).field_n[var7];
                      if (var7 > 0) {
                        var10 = ((ada) this).field_n[var7 + -1];
                        var11 = (-var10[0] + var8 << 12) / (-var10[0] + var17[0]);
                        var12 = -var11 + 4096;
                        var3 = var11 * var17[2] - -(var12 * var10[2]) >> 12;
                        var4 = var12 * var10[3] + var11 * var17[3] >> 12;
                        var2 = var10[1] * var12 + var11 * var17[1] >> 12;
                        break L5;
                      } else {
                        var3 = var17[2];
                        var2 = var17[1];
                        var4 = var17[3];
                        break L5;
                      }
                    } else {
                      var14 = ((ada) this).field_n[var5 + -1];
                      var3 = var14[2];
                      var4 = var14[3];
                      var2 = var14[1];
                      break L5;
                    }
                  }
                  L6: {
                    var2 = var2 >> 4;
                    var4 = var4 >> 4;
                    var3 = var3 >> 4;
                    if (var3 < 0) {
                      var3 = 0;
                      break L6;
                    } else {
                      if (var3 > 255) {
                        var3 = 255;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (0 <= var2) {
                      if (var2 <= 255) {
                        break L7;
                      } else {
                        var2 = 255;
                        break L7;
                      }
                    } else {
                      var2 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    if (var4 >= 0) {
                      if (var4 <= 255) {
                        break L8;
                      } else {
                        var4 = 255;
                        break L8;
                      }
                    } else {
                      var4 = 0;
                      break L8;
                    }
                  }
                  ((ada) this).field_o[var6] = mp.a(mp.a(var2 << 16, var3 << 8), var4);
                  var6++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        sna stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        sna stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        sna stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        sna stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        sna stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        sna stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sna stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        sna stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        sna stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        sna stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        sna stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        sna stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        sna stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        sna stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        sna stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        sna stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        sna stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        sna stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        sna stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        sna stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        sna stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        sna stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        sna stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sna stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        sna stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        sna stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        sna stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        sna stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        sna stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        sna stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        sna stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        sna stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        sna stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        sna stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        sna stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        sna stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        sna stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        sna stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        L0: {
          int discarded$1 = 199;
          pm.f();
          if (wk.field_a >= 0) {
            dea.field_m.field_Z = lga.a(true, new String[1], bla.field_q);
            break L0;
          } else {
            dea.field_m.field_Z = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_3_0 = ng.field_e;
            stackOut_3_1 = 19842;
            stackIn_9_0 = stackOut_3_0;
            stackIn_9_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (!param0) {
              break L2;
            } else {
              stackOut_4_0 = (sna) (Object) stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackIn_9_0 = stackOut_4_0;
              stackIn_9_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (param3) {
                break L2;
              } else {
                stackOut_5_0 = (sna) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackIn_9_0 = stackOut_5_0;
                stackIn_9_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (eda.field_j) {
                  break L2;
                } else {
                  stackOut_6_0 = (sna) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (pw.field_w != null) {
                    break L2;
                  } else {
                    stackOut_7_0 = (sna) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (null != rv.field_n) {
                      break L2;
                    } else {
                      stackOut_8_0 = (sna) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = (sna) (Object) stackIn_9_0;
          stackOut_9_1 = stackIn_9_1;
          stackOut_9_2 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          stackIn_10_2 = stackOut_9_2;
          break L1;
        }
        L3: {
          L4: {
            ((sna) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0);
            stackOut_10_0 = ui.field_r;
            stackOut_10_1 = 19842;
            stackIn_16_0 = stackOut_10_0;
            stackIn_16_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (!param0) {
              break L4;
            } else {
              stackOut_11_0 = (sna) (Object) stackIn_11_0;
              stackOut_11_1 = stackIn_11_1;
              stackIn_16_0 = stackOut_11_0;
              stackIn_16_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (param3) {
                break L4;
              } else {
                stackOut_12_0 = (sna) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackIn_16_0 = stackOut_12_0;
                stackIn_16_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (eda.field_j) {
                  break L4;
                } else {
                  stackOut_13_0 = (sna) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (pw.field_w != null) {
                    break L4;
                  } else {
                    stackOut_14_0 = (sna) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (rv.field_n != null) {
                      break L4;
                    } else {
                      stackOut_15_0 = (sna) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = (sna) (Object) stackIn_16_0;
          stackOut_16_1 = stackIn_16_1;
          stackOut_16_2 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          stackIn_17_2 = stackOut_16_2;
          break L3;
        }
        L5: {
          L6: {
            ((sna) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2 != 0);
            stackOut_17_0 = sb.field_n;
            stackOut_17_1 = 19842;
            stackIn_21_0 = stackOut_17_0;
            stackIn_21_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (!param0) {
              break L6;
            } else {
              stackOut_18_0 = (sna) (Object) stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              if (param3) {
                break L6;
              } else {
                stackOut_19_0 = (sna) (Object) stackIn_19_0;
                stackOut_19_1 = stackIn_19_1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (!eda.field_j) {
                  break L6;
                } else {
                  stackOut_20_0 = (sna) (Object) stackIn_20_0;
                  stackOut_20_1 = stackIn_20_1;
                  stackOut_20_2 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L5;
                }
              }
            }
          }
          stackOut_21_0 = (sna) (Object) stackIn_21_0;
          stackOut_21_1 = stackIn_21_1;
          stackOut_21_2 = 0;
          stackIn_22_0 = stackOut_21_0;
          stackIn_22_1 = stackOut_21_1;
          stackIn_22_2 = stackOut_21_2;
          break L5;
        }
        L7: {
          ((sna) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2 != 0);
          lia.field_j.field_a.f(18632);
          if (mc.field_g.field_R != 0) {
            efa.field_p = true;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (ae.field_a.field_R != 0) {
            L9: {
              if (bha.field_l) {
                break L9;
              } else {
                if (dm.field_f > 0) {
                  break L9;
                } else {
                  if (hea.field_r < 2) {
                    break L8;
                  } else {
                    if (!wga.field_q[12]) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            aq.a(11, (byte) 47);
            break L8;
          } else {
            break L8;
          }
        }
        L10: {
          if (vh.field_y.field_R != 0) {
            L11: {
              if (qha.field_c.length != 1) {
                break L11;
              } else {
                if (~mt.field_s == ~qha.field_c[0]) {
                  break L11;
                } else {
                  mt.field_s = qha.field_c[0];
                  break L11;
                }
              }
            }
            dn.a(-25, mt.field_s, 0, 11, true, cla.field_a);
            break L10;
          } else {
            break L10;
          }
        }
        L12: {
          if (0 == aja.field_l.field_R) {
            break L12;
          } else {
            eda.field_j = false;
            break L12;
          }
        }
    }

    final void d(byte param0) {
        if (null == ((ada) this).field_n) {
            this.a(1, (byte) 33);
        }
        this.e(param0 ^ -514);
        if (param0 != -68) {
            ((ada) this).d((byte) 96);
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[] var19 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var4 = 0;
        int var10 = BachelorFridge.field_y;
        int[][] var18 = ((ada) this).field_h.a(param1, -858);
        int[][] var16 = var18;
        int[][] var14 = var16;
        int[][] var12 = var14;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (((ada) this).field_h.field_b) {
            var19 = ((ada) this).a(0, param1, (byte) 120);
            var6 = var18[0];
            var7 = var18[1];
            var8 = var18[2];
            for (var9 = 0; hh.field_d > var9; var9++) {
                var4 = var19[var9] >> 4;
                if (var4 < 0) {
                    var4 = 0;
                }
                if (!(var4 <= 256)) {
                    var4 = 256;
                }
                var4 = ((ada) this).field_o[var4];
                var6[var9] = dda.a(var4, 16711680) >> 12;
                var7[var9] = dda.a(4080, var4 >> 4);
                var8[var9] = dda.a(var4 << 4, 4080);
            }
        }
        if (param0) {
            return null;
        }
        return var11;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param4 >= param0) {
                var7 = param0;
                var5_int = var7;
                L2: while (true) {
                  if (var7 >= param4) {
                    break L1;
                  } else {
                    tj.field_b[var7][param2] = param1;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var5_int = param4;
                L3: while (true) {
                  if (param0 <= var5_int) {
                    break L1;
                  } else {
                    tj.field_b[var5_int][param2] = param1;
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              if (param3 > 72) {
                break L4;
              } else {
                field_m = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var5, "ada.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 == 0) {
            break L0;
          } else {
            var3 = param0;
            if (var3 == 1) {
              ((ada) this).field_n = new int[2][4];
              ((ada) this).field_n[0][1] = 0;
              ((ada) this).field_n[0][2] = 0;
              ((ada) this).field_n[0][0] = 0;
              ((ada) this).field_n[0][3] = 0;
              ((ada) this).field_n[1][1] = 4096;
              ((ada) this).field_n[1][0] = 4096;
              ((ada) this).field_n[1][3] = 4096;
              ((ada) this).field_n[1][2] = 4096;
              break L0;
            } else {
              if (var3 != 2) {
                if (var3 != 3) {
                  if (var3 == 4) {
                    ((ada) this).field_n = new int[6][4];
                    ((ada) this).field_n[0][2] = 0;
                    ((ada) this).field_n[0][0] = 0;
                    ((ada) this).field_n[0][3] = 0;
                    ((ada) this).field_n[0][1] = 0;
                    ((ada) this).field_n[1][2] = 0;
                    ((ada) this).field_n[1][3] = 1493;
                    ((ada) this).field_n[1][0] = 1843;
                    ((ada) this).field_n[1][1] = 0;
                    ((ada) this).field_n[2][2] = 0;
                    ((ada) this).field_n[2][1] = 0;
                    ((ada) this).field_n[2][3] = 2939;
                    ((ada) this).field_n[2][0] = 2457;
                    ((ada) this).field_n[3][1] = 0;
                    ((ada) this).field_n[3][2] = 1124;
                    ((ada) this).field_n[3][0] = 2781;
                    ((ada) this).field_n[3][3] = 3565;
                    ((ada) this).field_n[4][0] = 3481;
                    ((ada) this).field_n[4][2] = 3084;
                    ((ada) this).field_n[4][3] = 4031;
                    ((ada) this).field_n[4][1] = 546;
                    ((ada) this).field_n[5][3] = 4096;
                    ((ada) this).field_n[5][0] = 4096;
                    ((ada) this).field_n[5][2] = 4096;
                    ((ada) this).field_n[5][1] = 4096;
                    break L0;
                  } else {
                    if (var3 != 5) {
                      if (var3 == 6) {
                        ((ada) this).field_n = new int[4][4];
                        ((ada) this).field_n[0][2] = 4096;
                        ((ada) this).field_n[0][1] = 0;
                        ((ada) this).field_n[0][0] = 2048;
                        ((ada) this).field_n[0][3] = 0;
                        ((ada) this).field_n[1][0] = 2867;
                        ((ada) this).field_n[1][2] = 4096;
                        ((ada) this).field_n[1][1] = 4096;
                        ((ada) this).field_n[1][3] = 0;
                        ((ada) this).field_n[2][0] = 3276;
                        ((ada) this).field_n[2][2] = 4096;
                        ((ada) this).field_n[2][3] = 0;
                        ((ada) this).field_n[2][1] = 4096;
                        ((ada) this).field_n[3][0] = 4096;
                        ((ada) this).field_n[3][2] = 0;
                        ((ada) this).field_n[3][3] = 0;
                        ((ada) this).field_n[3][1] = 4096;
                        break L0;
                      } else {
                        throw new RuntimeException("Invalid gradient preset");
                      }
                    } else {
                      ((ada) this).field_n = new int[16][4];
                      ((ada) this).field_n[0][2] = 192;
                      ((ada) this).field_n[0][3] = 321;
                      ((ada) this).field_n[0][1] = 80;
                      ((ada) this).field_n[0][0] = 0;
                      ((ada) this).field_n[1][0] = 155;
                      ((ada) this).field_n[1][3] = 562;
                      ((ada) this).field_n[1][1] = 321;
                      ((ada) this).field_n[1][2] = 449;
                      ((ada) this).field_n[2][2] = 690;
                      ((ada) this).field_n[2][1] = 578;
                      ((ada) this).field_n[2][3] = 803;
                      ((ada) this).field_n[2][0] = 389;
                      ((ada) this).field_n[3][0] = 671;
                      ((ada) this).field_n[3][1] = 947;
                      ((ada) this).field_n[3][3] = 1140;
                      ((ada) this).field_n[3][2] = 995;
                      ((ada) this).field_n[4][1] = 1285;
                      ((ada) this).field_n[4][0] = 897;
                      ((ada) this).field_n[4][2] = 1397;
                      ((ada) this).field_n[4][3] = 1509;
                      ((ada) this).field_n[5][2] = 1429;
                      ((ada) this).field_n[5][0] = 1175;
                      ((ada) this).field_n[5][3] = 1413;
                      ((ada) this).field_n[5][1] = 1525;
                      ((ada) this).field_n[6][3] = 1333;
                      ((ada) this).field_n[6][2] = 1461;
                      ((ada) this).field_n[6][0] = 1368;
                      ((ada) this).field_n[6][1] = 1734;
                      ((ada) this).field_n[7][0] = 1507;
                      ((ada) this).field_n[7][3] = 1702;
                      ((ada) this).field_n[7][1] = 1413;
                      ((ada) this).field_n[7][2] = 1525;
                      ((ada) this).field_n[8][3] = 2056;
                      ((ada) this).field_n[8][0] = 1736;
                      ((ada) this).field_n[8][1] = 1108;
                      ((ada) this).field_n[8][2] = 1590;
                      ((ada) this).field_n[9][3] = 2666;
                      ((ada) this).field_n[9][2] = 2056;
                      ((ada) this).field_n[9][1] = 1766;
                      ((ada) this).field_n[9][0] = 2088;
                      ((ada) this).field_n[10][1] = 2409;
                      ((ada) this).field_n[10][0] = 2355;
                      ((ada) this).field_n[10][3] = 3276;
                      ((ada) this).field_n[10][2] = 2586;
                      ((ada) this).field_n[11][2] = 3148;
                      ((ada) this).field_n[11][3] = 3228;
                      ((ada) this).field_n[11][0] = 2691;
                      ((ada) this).field_n[11][1] = 3116;
                      ((ada) this).field_n[12][0] = 3031;
                      ((ada) this).field_n[12][2] = 3710;
                      ((ada) this).field_n[12][3] = 3196;
                      ((ada) this).field_n[12][1] = 3806;
                      ((ada) this).field_n[13][3] = 3019;
                      ((ada) this).field_n[13][1] = 3437;
                      ((ada) this).field_n[13][0] = 3522;
                      ((ada) this).field_n[13][2] = 3421;
                      ((ada) this).field_n[14][3] = 3228;
                      ((ada) this).field_n[14][2] = 3148;
                      ((ada) this).field_n[14][1] = 3116;
                      ((ada) this).field_n[14][0] = 3727;
                      ((ada) this).field_n[15][0] = 4096;
                      ((ada) this).field_n[15][1] = 2377;
                      ((ada) this).field_n[15][3] = 2746;
                      ((ada) this).field_n[15][2] = 2505;
                      break L0;
                    }
                  }
                } else {
                  ((ada) this).field_n = new int[7][4];
                  ((ada) this).field_n[0][2] = 0;
                  ((ada) this).field_n[0][0] = 0;
                  ((ada) this).field_n[0][1] = 0;
                  ((ada) this).field_n[0][3] = 4096;
                  ((ada) this).field_n[1][1] = 0;
                  ((ada) this).field_n[1][2] = 4096;
                  ((ada) this).field_n[1][0] = 663;
                  ((ada) this).field_n[1][3] = 4096;
                  ((ada) this).field_n[2][3] = 0;
                  ((ada) this).field_n[2][2] = 4096;
                  ((ada) this).field_n[2][0] = 1363;
                  ((ada) this).field_n[2][1] = 0;
                  ((ada) this).field_n[3][1] = 4096;
                  ((ada) this).field_n[3][0] = 2048;
                  ((ada) this).field_n[3][2] = 4096;
                  ((ada) this).field_n[3][3] = 0;
                  ((ada) this).field_n[4][1] = 4096;
                  ((ada) this).field_n[4][2] = 0;
                  ((ada) this).field_n[4][0] = 2727;
                  ((ada) this).field_n[4][3] = 0;
                  ((ada) this).field_n[5][0] = 3411;
                  ((ada) this).field_n[5][2] = 0;
                  ((ada) this).field_n[5][3] = 4096;
                  ((ada) this).field_n[5][1] = 4096;
                  ((ada) this).field_n[6][3] = 4096;
                  ((ada) this).field_n[6][2] = 0;
                  ((ada) this).field_n[6][0] = 4096;
                  ((ada) this).field_n[6][1] = 0;
                  break L0;
                }
              } else {
                ((ada) this).field_n = new int[8][4];
                ((ada) this).field_n[0][2] = 2602;
                ((ada) this).field_n[0][1] = 2650;
                ((ada) this).field_n[0][0] = 0;
                ((ada) this).field_n[0][3] = 2361;
                ((ada) this).field_n[1][2] = 1799;
                ((ada) this).field_n[1][0] = 2867;
                ((ada) this).field_n[1][3] = 1558;
                ((ada) this).field_n[1][1] = 2313;
                ((ada) this).field_n[2][3] = 1413;
                ((ada) this).field_n[2][1] = 2618;
                ((ada) this).field_n[2][2] = 1734;
                ((ada) this).field_n[2][0] = 3072;
                ((ada) this).field_n[3][2] = 1220;
                ((ada) this).field_n[3][1] = 2296;
                ((ada) this).field_n[3][3] = 947;
                ((ada) this).field_n[3][0] = 3276;
                ((ada) this).field_n[4][1] = 2072;
                ((ada) this).field_n[4][0] = 3481;
                ((ada) this).field_n[4][3] = 722;
                ((ada) this).field_n[4][2] = 963;
                ((ada) this).field_n[5][1] = 2730;
                ((ada) this).field_n[5][3] = 1766;
                ((ada) this).field_n[5][2] = 2152;
                ((ada) this).field_n[5][0] = 3686;
                ((ada) this).field_n[6][0] = 3891;
                ((ada) this).field_n[6][2] = 1060;
                ((ada) this).field_n[6][1] = 2232;
                ((ada) this).field_n[6][3] = 915;
                ((ada) this).field_n[7][2] = 1413;
                ((ada) this).field_n[7][3] = 1140;
                ((ada) this).field_n[7][1] = 1686;
                ((ada) this).field_n[7][0] = 4096;
                break L0;
              }
            }
          }
        }
    }

    public static void d() {
        field_m = null;
        field_p = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
    }
}
