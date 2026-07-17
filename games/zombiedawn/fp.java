/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends an {
    int field_L;
    int field_J;
    int field_E;
    static int field_H;
    int field_I;
    int field_K;
    int field_G;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        if (param5 < param4) {
          if (param1 <= param4) {
            if (param1 > param5) {
              wd.a(param2, param0, param6, param1, param4, param5, false, param3, bi.field_c);
              return;
            } else {
              wd.a(param2, param6, param0, param5, param4, param1, false, param3, bi.field_c);
              return;
            }
          } else {
            wd.a(param6, param0, param2, param4, param1, param5, false, param3, bi.field_c);
            return;
          }
        } else {
          if (param1 <= param5) {
            if (param4 >= param1) {
              wd.a(param0, param6, param2, param4, param5, param1, false, param3, bi.field_c);
              return;
            } else {
              wd.a(param0, param2, param6, param1, param5, param4, false, param3, bi.field_c);
              return;
            }
          } else {
            wd.a(param6, param2, param0, param5, param1, param4, false, param3, bi.field_c);
            return;
          }
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_20_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        if (!param1) {
          if (qp.field_b[param3] > qp.field_b[param0]) {
            return true;
          } else {
            if (qp.field_b[param0] <= qp.field_b[param3]) {
              if (dj.field_g[param3] <= dj.field_g[param0]) {
                if (dj.field_g[param3] >= dj.field_g[param0]) {
                  if (param2 != 0) {
                    field_H = -122;
                    var4 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
                    var5 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param0 >= param3) {
                            stackOut_56_0 = 0;
                            stackIn_57_0 = stackOut_56_0;
                            break L0;
                          } else {
                            stackOut_55_0 = 1;
                            stackIn_57_0 = stackOut_55_0;
                            break L0;
                          }
                        }
                        return stackIn_57_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
                    var5 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param0 >= param3) {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            break L1;
                          } else {
                            stackOut_46_0 = 1;
                            stackIn_48_0 = stackOut_46_0;
                            break L1;
                          }
                        }
                        return stackIn_48_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (dj.field_g[param0] >= dj.field_g[param3]) {
            if (dj.field_g[param0] > dj.field_g[param3]) {
              return false;
            } else {
              if (qp.field_b[param3] <= qp.field_b[param0]) {
                if (qp.field_b[param0] <= qp.field_b[param3]) {
                  if (param2 != 0) {
                    field_H = -122;
                    var4 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
                    var5 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        if (param0 >= param3) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
                    var5 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param0 >= param3) {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            break L2;
                          } else {
                            stackOut_18_0 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            break L2;
                          }
                        }
                        return stackIn_20_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = ZombieDawn.field_J;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -((fp) this).field_k - (param4 + ((fp) this).field_K) + param0;
              var9 = -((fp) this).field_j + -param2 + (-((fp) this).field_G + param3);
              if (var8_int * var8_int + var9 * var9 < ((fp) this).field_I * ((fp) this).field_I) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - hn.field_j;
                  if (var10 >= 0.0) {
                    if (var10 <= 0.0) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)((fp) this).field_L;
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((fp) this).field_L;
                    break L1;
                  }
                }
                ((fp) this).field_J = (int)(var10 * (double)((fp) this).field_L / 6.283185307179586);
                L2: while (true) {
                  if (((fp) this).field_J < ((fp) this).field_L) {
                    L3: while (true) {
                      if (0 <= ((fp) this).field_J) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        ((fp) this).field_J = ((fp) this).field_J + ((fp) this).field_L;
                        continue L3;
                      }
                    }
                  } else {
                    ((fp) this).field_J = ((fp) this).field_J - ((fp) this).field_L;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              L4: {
                if (param1 == 1) {
                  break L4;
                } else {
                  ((fp) this).field_L = -88;
                  break L4;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("fp.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    private fp() throws Throwable {
        throw new Error();
    }

    static {
    }
}
