/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_d;
    private int[] field_a;
    static ak field_e;
    static boolean field_f;
    static dd field_b;
    static char[][] field_c;

    final static void a(boolean param0, boolean param1, String param2, int param3) {
        fh.a(-55);
        if (param3 != -22175) {
            return;
        }
        try {
            nb.field_a.i(param3 ^ 22250);
            lg.field_b = new ul(aa.field_s, (String) null, jg.field_d, param1, param0);
            ak.field_a = new ui(nb.field_a, lg.field_b);
            nb.field_a.b(ak.field_a, (byte) -35);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, rh param1) {
        hk var2 = null;
        sf discarded$0 = null;
        try {
            if (param0 < 90) {
                rh var3 = (rh) null;
                fl.a((byte) 103, (rh) null);
            }
            hk.b(param1.a(0, "", "headers.packvorbis"));
            var2 = hk.a(param1, "jagex logo2.packvorbis", "");
            discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = (char[][]) null;
        field_b = null;
        if (param0 != 26113) {
            return;
        }
        field_d = null;
    }

    final int a(int param0, byte param1) {
        int discarded$5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var3 = (this.field_a.length >> -491016159) - 1;
        if (param1 > 114) {
          var4 = param0 & var3;
          L0: while (true) {
            L1: {
              var5 = this.field_a[1 + var4 + var4];
              if ((var5 ^ -1) != 0) {
                stackOut_14_0 = param0;
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_12_0 = -1;
                stackIn_15_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  return stackIn_13_0;
                }
              }
            }
            if (stackIn_15_0 == this.field_a[var4 + var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L0;
            }
          }
        } else {
          discarded$5 = this.a(82, (byte) 96);
          var4 = param0 & var3;
          L2: while (true) {
            L3: {
              var5 = this.field_a[1 + var4 + var4];
              if ((var5 ^ -1) != 0) {
                stackOut_5_0 = param0;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_3_0 = -1;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var6 != 0) {
                  break L3;
                } else {
                  return stackIn_4_0;
                }
              }
            }
            if (stackIn_6_0 == this.field_a[var4 + var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L2;
            }
          }
        }
    }

    fl(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int > (param0.length >> 1430897505) + param0.length) {
                    break L3;
                  } else {
                    var2_int = var2_int << 1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_a = new int[var2_int + var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3 >= var2_int + var2_int) {
                      break L6;
                    } else {
                      this.field_a[var3] = -1;
                      var3++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var3 = 0;
                  break L5;
                }
                L7: while (true) {
                  if (var3 >= param0.length) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = param0[var3] & -1 + var2_int;
                      L8: while (true) {
                        L9: {
                          if ((this.field_a[1 + (var4 + var4)] ^ -1) == 0) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[var4 + var4 - -1] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = 1 + var4 & -1 + var2_int;
                            if (var5 != 0) {
                              break L9;
                            } else {
                              continue L8;
                            }
                          }
                        }
                        continue L7;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("fl.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    static {
        field_d = "<%0>The entrance:<%1> the fleas will fall from the bottom of this after a short delay at the start of each level.";
        field_e = new ak();
        field_f = true;
        field_c = new char[40][21];
    }
}
