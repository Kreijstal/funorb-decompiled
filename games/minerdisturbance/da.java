/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int field_a;
    static int field_c;
    static int field_d;
    private int[] field_b;

    final static java.awt.Container b(int param0) {
        if (!(null == nd.field_f)) {
            return (java.awt.Container) (Object) nd.field_f;
        }
        return (java.awt.Container) (Object) bm.c(-74);
    }

    final static hg a(int param0) {
        if (param0 != 858) {
            field_d = -63;
        }
        return hj.field_f;
    }

    final static void a(boolean param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              wc.field_b = false;
              wi.field_C = false;
              if (null == sj.field_h) {
                break L1;
              } else {
                if (sj.field_h.field_K) {
                  L2: {
                    if (param2 != 8) {
                      break L2;
                    } else {
                      L3: {
                        if (gd.field_B) {
                          param1 = pj.field_d;
                          break L3;
                        } else {
                          param1 = j.field_a;
                          break L3;
                        }
                      }
                      param2 = 2;
                      di.field_D.a(pl.field_a, 69);
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if (10 != param2) {
                      break L4;
                    } else {
                      bj.a(0);
                      var3_int = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (wi.field_C) {
                          param1 = oa.a((byte) -93, fe.field_r, new String[1]);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (!oh.field_F) {
                          break L7;
                        } else {
                          param1 = jg.field_j;
                          break L7;
                        }
                      }
                      sj.field_h.a(param1, param2, (byte) -115);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (256 == param2) {
                    break L1;
                  } else {
                    if (param2 == 10) {
                      break L1;
                    } else {
                      if (!gd.field_B) {
                        di.field_D.n(-6);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L8: {
              if (param0) {
                break L8;
              } else {
                var4 = null;
                da.a(false, (String) null, 106);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("da.D(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 41);
        }
    }

    da(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> 1)) {
                ((da) this).field_b = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int + -1;
                        L4: while (true) {
                          if (((da) this).field_b[1 + (var4 + var4)] == -1) {
                            ((da) this).field_b[var4 + var4] = param0[var3];
                            ((da) this).field_b[1 + (var4 - -var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int + -1 & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((da) this).field_b[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("da.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = -1 + (((da) this).field_b.length >> 1);
          var4 = param1 & var3;
          if (param0 == -71) {
            break L0;
          } else {
            field_a = 116;
            break L0;
          }
        }
        L1: while (true) {
          var5 = ((da) this).field_b[var4 - -var4 + 1];
          if (var5 == -1) {
            return -1;
          } else {
            if (param1 == ((da) this).field_b[var4 + var4]) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
