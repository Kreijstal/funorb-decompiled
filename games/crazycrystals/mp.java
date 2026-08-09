/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends ij {
    private String[] field_l;
    private int[] field_m;
    private int[][] field_n;
    static long field_p;
    int[] field_o;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        if (!(this.field_o == null)) {
            for (var2 = 0; this.field_o.length > var2; var2++) {
                this.field_o[var2] = hm.a(this.field_o[var2], 32768);
            }
        }
        if (param0 != -90) {
            this.field_m = (int[]) null;
        }
    }

    final static boolean a(int param0, String param1, dc param2, String param3, String param4, boolean param5, int param6) {
        RuntimeException var7 = null;
        sa var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lc.field_c == tl.field_e) {
              L1: {
                var8 = new sa(qe.field_g, param2);
                qe.field_g.b(-3264, var8);
                if (!il.b(-120)) {
                  L2: {
                    ro.field_n = param6;
                    qc.field_i = null;
                    if (!param5) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  qh.field_f = stackIn_8_0 != 0;
                  ji.field_x = param1;
                  dg.field_a = param3;
                  lc.field_c = l.field_b;
                  fh.field_i = param4;
                  break L1;
                } else {
                  var8.o(106);
                  break L1;
                }
              }
              if (param0 == 0) {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_p = -79L;
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7);

            stackIn_15_1 = new StringBuilder().append("mp.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void a(ng param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 > 27) {
                break L1;
              } else {
                field_p = 6L;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.h(255);
              if (-1 == (var3_int ^ -1)) {
                break L0;
              } else {
                this.a(var3_int, param0, -3);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("mp.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = CrazyCrystals.field_B;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_l == null) {
            return "";
        }
        if (param0 != 60) {
            this.a((byte) 25);
        }
        StringBuilder discarded$0 = var5.append(this.field_l[0]);
        for (var3 = 1; var3 < this.field_l.length; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_l[var3]);
        }
        return var2.toString();
    }

    mp() {
    }

    private final void a(int param0, ng param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        sj var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param2 == -3) {
              L1: {
                if ((param0 ^ -1) == -2) {
                  this.field_l = ik.a(param1.i(110), (byte) -76, '<');
                  break L1;
                } else {
                  if ((param0 ^ -1) != -3) {
                    if (3 == param0) {
                      var4_int = param1.h(255);
                      this.field_m = new int[var4_int];
                      this.field_n = new int[var4_int][];
                      var5 = 0;
                      L2: while (true) {
                        if (var4_int <= var5) {
                          break L1;
                        } else {
                          L3: {
                            var6 = param1.c((byte) -7);
                            var7 = cf.a(var6, 123);
                            if (var7 == null) {
                              break L3;
                            } else {
                              this.field_m[var5] = var6;
                              array$0 = new int[var7.field_a];
                              this.field_n[var5] = array$0;
                              var8 = 0;
                              L4: while (true) {
                                if (var8 >= var7.field_a) {
                                  break L3;
                                } else {
                                  this.field_n[var5][var8] = param1.c((byte) -7);
                                  var8++;
                                  continue L4;
                                }
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      if (4 == param0) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    var4_int = param1.h(255);
                    this.field_o = new int[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        this.field_o[var5] = param1.c((byte) -7);
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("mp.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
