/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    static int field_b;
    static String field_a;
    int field_c;
    int field_d;
    sj[] field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= -117) {
            return;
        }
        j.a((byte) 18);
    }

    final void a(int param0) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        sj var7 = null;
        sj var8 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 == -10874) {
          var2 = this.field_e.length;
          L0: while (true) {
            L1: {
              if ((var2 ^ -1) >= -2) {
                var2 = 0;
                break L1;
              } else {
                incrementValue$2 = var2;
                var2--;
                var3 = li.a(incrementValue$2, o.field_o, false);
                var8 = this.field_e[var3];
                this.field_e[var3] = this.field_e[var2];
                this.field_e[var2] = var8;
                if (var5 != 0) {
                  break L1;
                } else {
                  continue L0;
                }
              }
            }
            L2: while (true) {
              if (var2 < this.field_e.length) {
                if (var5 == 0) {
                  if (this.field_e[var2] != null) {
                    L3: {
                      this.field_e[var2].field_t = var2;
                      this.field_e[var2].field_g = var2 * 32 + this.field_d;
                      if (this.field_e[var2].field_k == this) {
                        this.field_e[var2].field_s = var2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          field_a = (String) null;
          var2 = this.field_e.length;
          L4: while (true) {
            if ((var2 ^ -1) < -2) {
              incrementValue$3 = var2;
              var2--;
              var3 = li.a(incrementValue$3, o.field_o, false);
              var7 = this.field_e[var3];
              this.field_e[var3] = this.field_e[var2];
              this.field_e[var2] = var7;
              if (var5 != 0) {
                L5: while (true) {
                  if (var2 < this.field_e.length) {
                    if (var5 == 0) {
                      if (this.field_e[var2] != null) {
                        L6: {
                          this.field_e[var2].field_t = var2;
                          this.field_e[var2].field_g = var2 * 32 + this.field_d;
                          if (this.field_e[var2].field_k == this) {
                            this.field_e[var2].field_s = var2;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var2++;
                        continue L5;
                      } else {
                        var2++;
                        continue L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                continue L4;
              }
            } else {
              var2 = 0;
              L7: while (true) {
                if (var2 < this.field_e.length) {
                  if (var5 == 0) {
                    if (this.field_e[var2] != null) {
                      L8: {
                        this.field_e[var2].field_t = var2;
                        this.field_e[var2].field_g = var2 * 32 + this.field_d;
                        if (this.field_e[var2].field_k == this) {
                          this.field_e[var2].field_s = var2;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var2++;
                      continue L7;
                    } else {
                      var2++;
                      continue L7;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        var2 = 0;
        if (!param0) {
          this.a(false);
          L0: while (true) {
            if (this.field_e.length > var2) {
              if (var3 == 0) {
                L1: {
                  if (this.field_e[var2] != null) {
                    this.field_e[var2].d(1);
                    this.field_e[var2] = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2++;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (this.field_e.length > var2) {
              if (var3 == 0) {
                L3: {
                  if (this.field_e[var2] != null) {
                    this.field_e[var2].d(1);
                    this.field_e[var2] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var2++;
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int[][] param3, int param4) {
        RuntimeException var6 = null;
        int[][] var6_array = null;
        int var7 = 0;
        int[] var8 = null;
        sj[] var9 = null;
        int var10 = 0;
        sj var11 = null;
        int var12 = 0;
        int[][] var13 = null;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.a(nc.field_p);
              if (param2 == 3) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            var13 = param3;
            var6_array = var13;
            var7 = 0;
            L2: while (true) {
              if (var13.length <= var7) {
                break L0;
              } else {
                var8 = var13[var7];
                sb.g(var8[0], var8[1], var8[2], var8[3]);
                var9 = this.field_e;
                if (var12 == 0) {
                  var10 = 0;
                  L3: while (true) {
                    L4: {
                      if (var9.length <= var10) {
                        sb.b(nc.field_p);
                        var7++;
                        break L4;
                      } else {
                        var11 = var9[var10];
                        if (var12 != 0) {
                          break L4;
                        } else {
                          L5: {
                            if (var11 == null) {
                              break L5;
                            } else {
                              L6: {
                                L7: {
                                  stackOut_11_0 = param0;
                                  stackIn_14_0 = stackOut_11_0;
                                  stackIn_12_0 = stackOut_11_0;
                                  if (var11.field_g != var11.field_j) {
                                    break L7;
                                  } else {
                                    stackOut_12_0 = stackIn_12_0;
                                    stackIn_14_0 = stackOut_12_0;
                                    stackIn_13_0 = stackOut_12_0;
                                    if (var11.field_q != var11.field_p) {
                                      break L7;
                                    } else {
                                      stackOut_13_0 = stackIn_13_0;
                                      stackOut_13_1 = 1;
                                      stackIn_15_0 = stackOut_13_0;
                                      stackIn_15_1 = stackOut_13_1;
                                      break L6;
                                    }
                                  }
                                }
                                stackOut_14_0 = stackIn_14_0;
                                stackOut_14_1 = 0;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                break L6;
                              }
                              if (stackIn_15_0 ^ stackIn_15_1 != 0) {
                                var11.a(param1, param4, param2 + -2, 0);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var10++;
                          continue L3;
                        }
                      }
                    }
                    continue L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ')');
        }
    }

    j(int param0, int param1, int param2) {
        this.field_c = param2;
        this.field_d = param1;
        this.field_e = new sj[param0];
    }

    static {
        field_b = 0;
        field_a = "Loading...";
    }
}
