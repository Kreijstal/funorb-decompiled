/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends bm implements mc {
    static int field_K;
    private int field_M;
    static gb field_N;
    private sp field_L;
    static String field_J;

    public final sp a(int param0) {
        if (param0 != 0) {
            this.g((byte) -126);
            return this.field_L;
        }
        return this.field_L;
    }

    final void a(sp param0, int param1) {
        try {
            this.field_L = param0;
            if (param1 != 1472) {
                field_N = (gb) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "kk.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(byte param0) {
        super.g(param0);
        if (null != this.field_L) {
            this.field_L.a((byte) 115);
        }
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        try {
            super.a((byte) 46, param1, param2, param3);
            if (param0 <= 13) {
                this.a(113);
            }
            this.field_M = -this.field_p + (ic.field_b - param3);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "kk.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(la param0, byte param1) {
        RuntimeException var2 = null;
        la var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != la.field_a) {
              if (param0 == la.field_j) {
                stackIn_24_0 = 5122;
                decompiledRegionSelector0 = 7;
                break L0;
              } else {
                if (param0 != la.field_e) {
                  if (la.field_h != param0) {
                    if (param0 != la.field_b) {
                      if (la.field_f != param0) {
                        if (param0 == la.field_d) {
                          stackIn_22_0 = 5131;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param0 == la.field_i) {
                            stackIn_20_0 = 5126;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            L1: {
                              if (param1 < -91) {
                                break L1;
                              } else {
                                var3 = (la) null;
                                kk.a((la) null, (byte) -56);
                                break L1;
                              }
                            }
                            throw new IllegalArgumentException("");
                          }
                        }
                      } else {
                        stackIn_15_0 = 5125;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackIn_12_0 = 5123;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_9_0 = 5121;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_6_0 = 5124;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 5120;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("kk.EA(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_22_0;
                    } else {
                      return stackIn_24_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    kk(String param0, no param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(byte param0) {
        if (param0 < -41) {
          if (this.field_g) {
            if (this.field_k == null) {
              return null;
            } else {
              gq.a(true, this.field_q + (-this.field_M + ic.field_b), cf.field_g);
              return this.field_k;
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_N = (gb) null;
            field_J = null;
            field_N = null;
            return;
        }
        field_J = null;
        field_N = null;
    }

    static {
        field_K = 0;
        field_N = new gb(0.5, 20, 0, 100, 1, 7.0, 9.0, 16, 0);
        field_J = "Login: ";
    }
}
