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
        int var9;
        var9 = ZombieDawn.field_J;
        if (param5 < param4) {
          if (param1 <= param4) {
            if (param1 <= param5) {
              wd.a(param2, param6, param0, param5, param4, param1, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                fp.a(-83, false, -32, -105);
                return;
              }
            } else {
              wd.a(param2, param0, param6, param1, param4, param5, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                fp.a(-83, false, -32, -105);
                return;
              }
            }
          } else {
            wd.a(param6, param0, param2, param4, param1, param5, false, param3, bi.field_c);
            if (param7 > 51) {
              return;
            } else {
              fp.a(-83, false, -32, -105);
              return;
            }
          }
        } else {
          if (param1 > param5) {
            wd.a(param6, param2, param0, param5, param1, param4, false, param3, bi.field_c);
            if (param7 > 51) {
              return;
            } else {
              fp.a(-83, false, -32, -105);
              return;
            }
          } else {
            if (param4 >= param1) {
              wd.a(param0, param6, param2, param4, param5, param1, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                fp.a(-83, false, -32, -105);
                return;
              }
            } else {
              wd.a(param0, param2, param6, param1, param5, param4, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                fp.a(-83, false, -32, -105);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int var4;
        int var5;
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
                            stackIn_57_0 = 0;
                            break L0;
                          } else {
                            stackIn_57_0 = 1;
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
                            stackIn_48_0 = 0;
                            break L1;
                          } else {
                            stackIn_48_0 = 1;
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
                            stackIn_20_0 = 0;
                            break L2;
                          } else {
                            stackIn_20_0 = 1;
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
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ZombieDawn.field_J;
        try {
          L0: {
            if (super.a(param0, param1 ^ 0, param2, param3, param4, param5, param6)) {
              var8_int = -this.field_k - (param4 + this.field_K) + param0;
              var9 = -this.field_j + -param2 + (-this.field_G + param3);
              if (var8_int * var8_int + var9 * var9 < this.field_I * this.field_I) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - hn.field_j;
                  if (var10 >= 0.0) {
                    if (var10 <= 0.0) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)this.field_L;
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)this.field_L;
                    break L1;
                  }
                }
                this.field_J = (int)(var10 * (double)this.field_L / 6.283185307179586);
                L2: while (true) {
                  if (this.field_J < this.field_L) {
                    L3: while (true) {
                      if (0 <= this.field_J) {
                        stackIn_15_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_J = this.field_J + this.field_L;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_J = this.field_J - this.field_L;
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
                  this.field_L = -88;
                  break L4;
                }
              }
              stackIn_19_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("fp.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private fp() throws Throwable {
        throw new Error();
    }

    static {
    }
}
