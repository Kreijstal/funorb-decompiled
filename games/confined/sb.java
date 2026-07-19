/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static String field_i;
    static nf field_h;
    volatile boolean field_d;
    static int[] field_b;
    static String field_e;
    static double field_g;
    static int field_f;
    static double[] field_a;
    volatile dk[] field_k;
    df field_c;
    volatile boolean field_j;

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_i = null;
        field_e = null;
        field_b = null;
        int var1 = -119 % ((-13 - param0) / 55);
    }

    public final void run() {
        int var1_int = 0;
        dk var2 = null;
        int var4 = Confined.field_J ? 1 : 0;
        this.field_j = true;
        try {
            while (!this.field_d) {
                for (var1_int = 0; 2 > var1_int; var1_int++) {
                    var2 = this.field_k[var1_int];
                    if (var2 != null) {
                        var2.c();
                    }
                }
                jd.a(1, 10L);
                mb.a((Object) null, 1001, this.field_c);
            }
        } catch (Exception exception) {
            String var5 = (String) null;
            mb.a((String) null, true, (Throwable) ((Object) exception));
        } finally {
            this.field_j = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 < param5) {
              if (1 + param0 >= param3) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (5 + param0 >= param3) {
                    break L1;
                  } else {
                    if (param1 != param2) {
                      var7_int = (param2 & param1 & 1) + ((param2 >> -2032674431) + (param1 >> -1887026655));
                      var8 = param0;
                      var9 = param2;
                      var10 = param1;
                      var11 = param0;
                      L2: while (true) {
                        if (var11 >= param3) {
                          sb.a(param0, var9, param2, var8, param4, param5, param6);
                          sb.a(var8, param1, var10, param3, (byte) 92, param5, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = sj.field_rb[var11];
                            if (!param6) {
                              stackOut_22_0 = ik.field_cb[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = an.field_n[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var7_int < var13) {
                              sj.field_rb[var11] = sj.field_rb[var8];
                              incrementValue$1 = var8;
                              var8++;
                              sj.field_rb[incrementValue$1] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = param3 - 1;
                L5: while (true) {
                  if (param0 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param0;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = sj.field_rb[var8];
                          var10 = sj.field_rb[var8 - -1];
                          if (!ek.a(-124, var10, param6, var9)) {
                            break L7;
                          } else {
                            sj.field_rb[var8] = var10;
                            sj.field_rb[1 + var8] = var9;
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var7), "sb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    sb() {
        this.field_k = new dk[2];
        this.field_d = false;
        this.field_j = false;
    }

    static {
        field_i = "Cancel";
        field_b = new int[]{100, 100, 100, 200, 200, 300, 500, 100, 300, 1000, 100, 100, 200, 300, 100, 100, 300, 500, 1000, 200};
        field_a = new double[]{8.0, 8.0, 5.0, 5.0};
        field_e = "Good morning.#Awakening from cryogenic inertia cocoon.";
        field_f = 51;
    }
}
