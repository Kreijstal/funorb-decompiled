/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wua extends od {
    static int field_n;
    private int[] field_k;
    static apa field_o;
    private String[] field_l;
    private int[][] field_q;
    int[] field_m;
    static String field_p;

    final static boolean c(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 49) {
            break L0;
          } else {
            wua.a((byte) 74);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (gda.field_c ^ -1)) {
              break L2;
            } else {
              if (cga.field_f < 13) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 37) {
            wua.a((byte) -54);
        }
        if (!(this.field_m == null)) {
            for (var2 = 0; this.field_m.length > var2; var2++) {
                this.field_m[var2] = fh.a(this.field_m[var2], 32768);
            }
        }
    }

    final void a(uia param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = -85 % ((param1 - 27) / 57);
            L1: while (true) {
              var4 = param0.h(255);
              if (-1 == (var4 ^ -1)) {
                break L0;
              } else {
                this.a(param0, var4, (byte) 46);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wua.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(uia param0, int param1, byte param2) {
        int[] array$0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        su var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 3) {
                break L1;
              } else {
                field_o = (apa) null;
                break L1;
              }
            }
            L2: {
              if (-2 != (param1 ^ -1)) {
                L3: {
                  if (param1 == 2) {
                    var4_int = param0.h(255);
                    this.field_m = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var4_int <= var5) {
                        break L3;
                      } else {
                        this.field_m[var5] = param0.d(123);
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if ((param1 ^ -1) == -4) {
                      var4_int = param0.h(255);
                      this.field_q = new int[var4_int][];
                      this.field_k = new int[var4_int];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var4_int) {
                          break L3;
                        } else {
                          L6: {
                            var6 = param0.d(122);
                            var7 = li.a(var6, (byte) 126);
                            if (var7 != null) {
                              this.field_k[var5] = var6;
                              array$0 = new int[var7.field_b];
                              this.field_q[var5] = array$0;
                              var8 = 0;
                              L7: while (true) {
                                if (var8 >= var7.field_b) {
                                  break L6;
                                } else {
                                  this.field_q[var5][var8] = param0.d(124);
                                  var8++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if (4 != param1) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L2;
              } else {
                this.field_l = rga.a(32287, param0.e((byte) -76), '<');
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("wua.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != -5) {
            this.field_k = (int[]) null;
        }
        if (null == this.field_l) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_l[0]);
        for (var3 = 1; this.field_l.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_l[var3]);
        }
        return var2.toString();
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 > -1) {
            field_p = (String) null;
        }
    }

    wua() {
    }

    static {
        field_p = "Private";
    }
}
