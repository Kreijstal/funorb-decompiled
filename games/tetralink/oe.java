/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends mc {
    private boolean[] field_n;
    int field_o;
    int[][] field_q;
    int[] field_s;
    static String field_t;
    int field_r;
    int[] field_p;

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!q.a(false, param1)) {
              if (ha.a(param1, -63)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!pi.a(param1, 17510)) {
                  if (param2.length() == 0) {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (jd.a(param1, -6270, param2)) {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L1: {
                        if (param0 == -41) {
                          break L1;
                        } else {
                          oe.a(true);
                          break L1;
                        }
                      }
                      if (!mf.a((byte) 29, param2, param1)) {
                        if (!qa.a(param0 ^ -16757, param1, param2)) {
                          stackIn_27_0 = 1;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("oe.B(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0 != 0;
                    } else {
                      return stackIn_27_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_t = null;
        if (!param0) {
            oe.a(false);
        }
    }

    oe(int param0, byte[] param1) {
        int[] array$0 = null;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        bh var7 = null;
        bh var8 = null;
        try {
          L0: {
            this.field_o = param0;
            var7 = new bh(param1);
            var8 = var7;
            this.field_r = var8.d((byte) -99);
            this.field_p = new int[this.field_r];
            this.field_s = new int[this.field_r];
            this.field_q = new int[this.field_r][];
            this.field_n = new boolean[this.field_r];
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_r) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= this.field_r) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= this.field_r) {
                        var4 = 0;
                        L4: while (true) {
                          if (this.field_r <= var4) {
                            var4 = 0;
                            L5: while (true) {
                              if (this.field_r <= var4) {
                                break L0;
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (this.field_q[var4].length <= var5) {
                                    var4++;
                                    continue L5;
                                  } else {
                                    this.field_q[var4][var5] = var7.d((byte) -99);
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            array$0 = new int[var7.d((byte) -99)];
                            this.field_q[var4] = array$0;
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        this.field_s[var4] = var7.e(127);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      stackIn_8_0 = this.field_n;

                      stackIn_8_1 = var4;

                      if (-2 != (var8.d((byte) -99) ^ -1)) {
                        stackIn_9_0 = (boolean[]) ((Object) stackIn_8_0);
                        stackIn_9_1 = stackIn_8_1;
                        stackIn_9_2 = 0;
                        break L7;
                      } else {
                        stackIn_9_0 = (boolean[]) ((Object) stackIn_8_0);
                        stackIn_9_1 = stackIn_8_1;
                        stackIn_9_2 = 1;
                        break L7;
                      }
                    }
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                this.field_p[var4] = var7.d((byte) -99);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("oe.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_t = "Connecting to<br>friend server...";
    }
}
