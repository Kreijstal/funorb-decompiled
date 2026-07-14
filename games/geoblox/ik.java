/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int field_a;
    static String field_b;

    final static void a(re param0, int param1, byte param2) {
        pk var3 = fj.field_q;
        var3.a(param1, (byte) -77);
        var3.d((byte) 123, param0.field_k);
        if (param2 < 80) {
            return;
        }
        var3.d((byte) -49, param0.field_g);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = Geoblox.field_C;
        vb.c(param0, param2, param3 - -1, 10000536);
        vb.c(param0, param2 + param1, param3 + 1, 12105912);
        int var5 = 1;
        if (!(vb.field_i <= param2 + var5)) {
            var5 = -param2 + vb.field_i;
        }
        int var6 = param1;
        if (vb.field_d < var6 + param2) {
            var6 = -param2 + vb.field_d;
        }
        int var7 = var5;
        if (param4 != -1540604944) {
            field_b = null;
        }
        while (var7 < var6) {
            var8 = 152 - -(48 * var7 / param1);
            var9 = var8 << -1623895256 | var8 << -1540604944 | var8;
            vb.field_c[param0 + vb.field_f * (var7 + param2)] = var9;
            vb.field_c[param3 + (param2 + var7) * vb.field_f + param0] = var9;
            var7++;
        }
    }

    public static void a(int param0) {
        if (param0 != 48) {
            field_a = -51;
        }
        field_b = null;
    }

    final static boolean a(ja param0, ja param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        ja var5 = null;
        int var6_int = 0;
        ja var6 = null;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        var7 = Geoblox.field_C;
        var3 = 0;
        L0: while (true) {
          if (var3 >= param1.field_L) {
            L1: {
              L2: {
                var3 = param2 ? 1 : 0;
                var4 = 0;
                param1.field_L = param1.field_L + 1;
                param1.field_n[param1.field_L] = param0;
                param0.field_L = param0.field_L + 1;
                param0.field_n[param0.field_L] = param1;
                if (param1.field_z != 0) {
                  break L2;
                } else {
                  if (param0.field_z == -1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var5_int = 0;
                var6_int = 0;
                if (-2 != param1.field_z) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = stackIn_12_0;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if ((param0.field_z ^ -1) != -2) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L4;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L4;
                }
              }
              L5: {
                if ((stackIn_15_0 ^ stackIn_15_1) != 0) {
                  L6: {
                    if (-2 != (param1.field_z ^ -1)) {
                      break L6;
                    } else {
                      if (param0.field_z == 0) {
                        param1.a(320, param1.field_C, param0.field_M, 0);
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (param1.field_z != -1) {
                      break L7;
                    } else {
                      if (param0.field_z == 1) {
                        var5_int = 1;
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param0.field_z != 2) {
                      break L8;
                    } else {
                      if (-2 != param1.field_z) {
                        break L8;
                      } else {
                        var3 = 1;
                        var4 = 1;
                        var6_int = 1;
                        param1.a(320, param1.field_C, param0.field_M, 0);
                        break L5;
                      }
                    }
                  }
                  if (1 != param0.field_z) {
                    break L5;
                  } else {
                    if (-3 != (param1.field_z ^ -1)) {
                      break L5;
                    } else {
                      param1.a(320, param0.field_C, param1.field_M, 0);
                      var5_int = 1;
                      var3 = 1;
                      break L5;
                    }
                  }
                } else {
                  L9: {
                    if (2 == param1.field_z) {
                      break L9;
                    } else {
                      if ((param0.field_z ^ -1) == -3) {
                        break L9;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L10: {
                    if (param1.field_z != -3) {
                      break L10;
                    } else {
                      if (2 != param0.field_z) {
                        param1.a(320, param0.field_C, param1.field_M, param0.field_z);
                        var3 = 1;
                        break L5;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (-3 != param0.field_z) {
                    break L5;
                  } else {
                    if (2 != param1.field_z) {
                      var4 = 1;
                      var6_int = 1;
                      var3 = 1;
                      param0.a(320, param1.field_C, param0.field_M, param1.field_z);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L11: {
                L12: {
                  if (var5_int != 0) {
                    break L12;
                  } else {
                    if (var6_int != 0) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                bh.a(var6_int != 0, param1, 1, param0, var5_int != 0);
                break L11;
              }
              if (-2 != (param1.field_z ^ -1)) {
                if (param1.field_z == 2) {
                  if (param0.field_z != 2) {
                    break L1;
                  } else {
                    if (param0.field_M != param1.field_M) {
                      break L1;
                    } else {
                      param1.field_m = param1.field_m + 1;
                      param0.field_m = param0.field_m + 1;
                      break L1;
                    }
                  }
                } else {
                  if (param1.field_z != 2) {
                    break L1;
                  } else {
                    if (param0.field_z != 2) {
                      break L1;
                    } else {
                      if (param0.field_M != param1.field_M) {
                        break L1;
                      } else {
                        param1.field_m = param1.field_m + 1;
                        param0.field_m = param0.field_m + 1;
                        break L1;
                      }
                    }
                  }
                }
              } else {
                if (param1.field_z != 2) {
                  break L1;
                } else {
                  if (param0.field_z != 2) {
                    break L1;
                  } else {
                    if (param0.field_M != param1.field_M) {
                      break L1;
                    } else {
                      param1.field_m = param1.field_m + 1;
                      param0.field_m = param0.field_m + 1;
                      break L1;
                    }
                  }
                }
              }
            }
            L13: {
              if (param1.field_z != -1) {
                break L13;
              } else {
                if (-1 == param0.field_z) {
                  L14: {
                    if (param1.field_C != param0.field_C) {
                      break L14;
                    } else {
                      param1.field_N = param1.field_N + 1;
                      param0.field_N = param0.field_N + 1;
                      break L14;
                    }
                  }
                  if (param0.field_M == param1.field_M) {
                    param1.field_m = param1.field_m + 1;
                    param0.field_m = param0.field_m + 1;
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
            }
            L15: {
              if (var3 != 0) {
                var5_int = 0;
                L16: while (true) {
                  if (param1.field_L <= var5_int) {
                    var5 = param1;
                    param1.field_N = 0;
                    var6 = param1;
                    var6.field_m = 0;
                    var5.field_L = 0;
                    param1.field_K = ji.field_r;
                    param1.field_B = true;
                    break L15;
                  } else {
                    param1.field_n[var5_int].a(param1, 0);
                    var5_int++;
                    continue L16;
                  }
                }
              } else {
                break L15;
              }
            }
            L17: {
              if (var4 != 0) {
                var5_int = 0;
                L18: while (true) {
                  if (param0.field_L <= var5_int) {
                    var5 = param0;
                    param0.field_N = 0;
                    var6 = param0;
                    var5.field_L = 0;
                    param0.field_t = false;
                    param0.field_B = true;
                    param0.field_K = ji.field_r;
                    var6.field_m = 0;
                    break L17;
                  } else {
                    param0.field_n[var5_int].a(param0, 0);
                    var5_int++;
                    continue L18;
                  }
                }
              } else {
                break L17;
              }
            }
            return var3 != 0;
          } else {
            if (param1.field_n[var3] == param0) {
              return false;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for fonts";
    }
}
