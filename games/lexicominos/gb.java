/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    private String field_c;
    private boolean field_b;
    static int field_a;
    static boolean field_d;

    gb(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (null != this.field_c) {
                break L1;
              } else {
                this.field_c = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((gb) (this)).field_b = stackIn_6_1 != 0;
            if (this.field_c.length() != 0) {
              break L0;
            } else {
              this.field_b = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("gb.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static aj a(int param0, int param1) {
        aj discarded$0 = null;
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        aj[] var5 = ah.a((byte) -55);
        aj[] var2 = var5;
        if (param1 != 2121865922) {
            discarded$0 = gb.a(71, -115);
            var3 = 0;
            do {
                if (var3 >= var5.length) {
                    return null;
                }
                if (!(var5[var3].field_a != param0)) {
                    return var5[var3];
                }
                var3++;
            } while (var4 == 0);
            return null;
        }
        var3 = 0;
        do {
            if (var3 >= var5.length) {
                return null;
            }
            if (!(var5[var3].field_a != param0)) {
                return var5[var3];
            }
            var3++;
        } while (var4 == 0);
        return null;
    }

    final static we[] a(byte param0, ab param1) {
        we[] discarded$1 = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        we[] var4 = null;
        int var5 = 0;
        we var6 = null;
        int var7 = 0;
        ab var8 = null;
        ei var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        we[] stackIn_6_0 = null;
        we[] stackIn_15_0 = null;
        we[] stackIn_19_0 = null;
        we[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        we[] stackOut_5_0 = null;
        we[] stackOut_18_0 = null;
        we[] stackOut_21_0 = null;
        we[] stackOut_14_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -66) {
                break L1;
              } else {
                var8 = (ab) null;
                discarded$1 = gb.a((byte) 108, (ab) null);
                break L1;
              }
            }
            if (!param1.b(0)) {
              stackOut_5_0 = new we[]{};
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = param1.a((byte) 127);
              L2: while (true) {
                L3: {
                  L4: {
                    if (var9.field_b != 0) {
                      break L4;
                    } else {
                      ge.a(0, 10L);
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (2 == var9.field_b) {
                    break L3;
                  } else {
                    var11 = (int[]) (var9.field_g);
                    var10 = var11;
                    var3 = var10;
                    var4 = new we[var11.length >> -1296970974];
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var5 >= var4.length) {
                            break L7;
                          } else {
                            var6 = new we();
                            stackOut_18_0 = (we[]) (var4);
                            stackIn_22_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (var7 != 0) {
                              break L6;
                            } else {
                              stackIn_19_0[var5] = var6;
                              var6.field_a = var3[var5 << 2121865922];
                              var6.field_e = var3[1 + (var5 << 794115490)];
                              var6.field_f = var3[(var5 << -1933966654) + 2];
                              var6.field_k = var3[(var5 << 1213143170) + 3];
                              var5++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_21_0 = (we[]) (var4);
                        stackIn_22_0 = stackOut_21_0;
                        break L6;
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackOut_14_0 = new we[]{};
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("gb.D(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_22_0;
          }
        }
    }

    gb(String param0) {
        this(param0, false);
    }

    final boolean a(int param0) {
        if (param0 != 15738) {
            field_a = -125;
            return this.field_b;
        }
        return this.field_b;
    }

    final String b(int param0) {
        if (param0 != 25545) {
            return (String) null;
        }
        return this.field_c;
    }

    static {
        field_d = false;
    }
}
