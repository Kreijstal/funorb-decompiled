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
            if (param1 <= param5) {
              wd.a(param2, param6, param0, param5, param4, param1, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                boolean discarded$6 = fp.a(-83, false, -32, -105);
                return;
              }
            } else {
              wd.a(param2, param0, param6, param1, param4, param5, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                boolean discarded$7 = fp.a(-83, false, -32, -105);
                return;
              }
            }
          } else {
            wd.a(param6, param0, param2, param4, param1, param5, false, param3, bi.field_c);
            if (param7 > 51) {
              return;
            } else {
              boolean discarded$8 = fp.a(-83, false, -32, -105);
              return;
            }
          }
        } else {
          if (param1 > param5) {
            wd.a(param6, param2, param0, param5, param1, param4, false, param3, bi.field_c);
            if (param7 > 51) {
              return;
            } else {
              boolean discarded$9 = fp.a(-83, false, -32, -105);
              return;
            }
          } else {
            if (param4 >= param1) {
              wd.a(param0, param6, param2, param4, param5, param1, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                boolean discarded$10 = fp.a(-83, false, -32, -105);
                return;
              }
            } else {
              wd.a(param0, param2, param6, param1, param5, param4, false, param3, bi.field_c);
              if (param7 > 51) {
                return;
              } else {
                boolean discarded$11 = fp.a(-83, false, -32, -105);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
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
                            stackOut_55_0 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            break L0;
                          } else {
                            stackOut_54_0 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            break L0;
                          }
                        }
                        return stackIn_56_0 != 0;
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
                            stackOut_46_0 = 0;
                            stackIn_47_0 = stackOut_46_0;
                            break L1;
                          } else {
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            break L1;
                          }
                        }
                        return stackIn_47_0 != 0;
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
                        L2: {
                          if (param0 >= param3) {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            break L2;
                          } else {
                            stackOut_26_0 = 1;
                            stackIn_28_0 = stackOut_26_0;
                            break L2;
                          }
                        }
                        return stackIn_28_0 != 0;
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
                        L3: {
                          if (param0 >= param3) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L3;
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L3;
                          }
                        }
                        return stackIn_19_0 != 0;
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
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ZombieDawn.field_J;
        if (super.a(param0, param1 ^ 0, param2, param3, param4, param5, param6)) {
          var8 = -((fp) this).field_k - (param4 + ((fp) this).field_K) + param0;
          var9 = -((fp) this).field_j + -param2 + (-((fp) this).field_G + param3);
          if (var8 * var8 + var9 * var9 < ((fp) this).field_I * ((fp) this).field_I) {
            var10 = Math.atan2((double)var9, (double)var8) - hn.field_j;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)((fp) this).field_L;
              ((fp) this).field_J = (int)(var10 * (double)((fp) this).field_L / 6.283185307179586);
              L0: while (true) {
                if (((fp) this).field_J >= ((fp) this).field_L) {
                  ((fp) this).field_J = ((fp) this).field_J - ((fp) this).field_L;
                  continue L0;
                } else {
                  L1: while (true) {
                    if (0 <= ((fp) this).field_J) {
                      return true;
                    } else {
                      ((fp) this).field_J = ((fp) this).field_J + ((fp) this).field_L;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              L2: {
                if (var10 <= 0.0) {
                  break L2;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((fp) this).field_L;
                  break L2;
                }
              }
              ((fp) this).field_J = (int)(var10 * (double)((fp) this).field_L / 6.283185307179586);
              L3: while (true) {
                if (((fp) this).field_J < ((fp) this).field_L) {
                  L4: while (true) {
                    if (0 <= ((fp) this).field_J) {
                      return true;
                    } else {
                      ((fp) this).field_J = ((fp) this).field_J + ((fp) this).field_L;
                      continue L4;
                    }
                  }
                } else {
                  ((fp) this).field_J = ((fp) this).field_J - ((fp) this).field_L;
                  continue L3;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          if (param1 != 1) {
            ((fp) this).field_L = -88;
            return false;
          } else {
            return false;
          }
        }
    }

    private fp() throws Throwable {
        throw new Error();
    }

    static {
    }
}
