/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv extends ci {
    static String field_n;
    private int field_p;
    static String field_o;
    private int field_m;

    public hv() {
        super(1, true);
        this.field_p = 0;
        this.field_m = 4096;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_23_0 = null;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int[] stackIn_30_0 = null;
        int[] stackOut_22_0 = null;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int[] stackOut_29_0 = null;
        int[] stackOut_8_0 = null;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_15_0 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var8 = this.field_i.a((byte) -112, param1);
          var3 = var8;
          if (this.field_i.field_d) {
            var11 = this.c(0, -125, param1);
            var5 = 0;
            L0: while (true) {
              if (var5 < ns.field_g) {
                L1: {
                  var6 = var11[var5];
                  stackOut_22_0 = (int[]) (var8);
                  stackIn_30_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        stackOut_23_0 = (int[]) ((Object) stackIn_23_0);
                        stackOut_23_1 = var5;
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (this.field_p > var6) {
                          break L3;
                        } else {
                          stackOut_24_0 = (int[]) ((Object) stackIn_24_0);
                          stackOut_24_1 = stackIn_24_1;
                          stackIn_27_0 = stackOut_24_0;
                          stackIn_27_1 = stackOut_24_1;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          if (this.field_m >= var6) {
                            stackOut_27_0 = (int[]) ((Object) stackIn_27_0);
                            stackOut_27_1 = stackIn_27_1;
                            stackOut_27_2 = 4096;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            stackIn_28_2 = stackOut_27_2;
                            break L2;
                          } else {
                            stackOut_25_0 = (int[]) ((Object) stackIn_25_0);
                            stackOut_25_1 = stackIn_25_1;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            break L3;
                          }
                        }
                      }
                      stackOut_26_0 = (int[]) ((Object) stackIn_26_0);
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = 0;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      break L2;
                    }
                    stackIn_28_0[stackIn_28_1] = stackIn_28_2;
                    var5++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      stackOut_29_0 = (int[]) (var8);
                      stackIn_30_0 = stackOut_29_0;
                      break L1;
                    }
                  }
                }
                return stackIn_30_0;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          hv.a(true);
          var8 = this.field_i.a((byte) -112, param1);
          var3 = var8;
          if (this.field_i.field_d) {
            var9 = this.c(0, -125, param1);
            var4 = var9;
            var5 = 0;
            L4: while (true) {
              if (var5 < ns.field_g) {
                L5: {
                  var9 = var4;
                  var6 = var9[var5];
                  stackOut_8_0 = (int[]) (var8);
                  stackIn_16_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var7 != 0) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                        stackOut_9_1 = var5;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (this.field_p > var6) {
                          break L7;
                        } else {
                          stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                          stackOut_10_1 = stackIn_10_1;
                          stackIn_13_0 = stackOut_10_0;
                          stackIn_13_1 = stackOut_10_1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          if (this.field_m >= var6) {
                            stackOut_13_0 = (int[]) ((Object) stackIn_13_0);
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = 4096;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            break L6;
                          } else {
                            stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
                            stackOut_11_1 = stackIn_11_1;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      break L6;
                    }
                    stackIn_14_0[stackIn_14_1] = stackIn_14_2;
                    var5++;
                    if (var7 == 0) {
                      continue L4;
                    } else {
                      stackOut_15_0 = (int[]) (var8);
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                }
                return stackIn_16_0;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int[] discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                discarded$2 = this.c(119, 60);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var4_int = param2;
                  if (var4_int == 0) {
                    break L4;
                  } else {
                    if (var4_int != 1) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_p = param1.d(125);
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              this.field_m = param1.d(124);
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("hv.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_o = null;
        if (param0) {
            field_n = (String) null;
        }
    }

    static {
        field_n = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_o = "Mirror mirror on the wall, who's the best at bouncing shiny light beams of death around the room?";
    }
}
