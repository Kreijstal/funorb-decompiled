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
        return gda.field_c >= 10 && cga.field_f >= 13;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 37) {
            wua.a((byte) -54);
        }
        if (!(((wua) this).field_m == null)) {
            for (var2 = 0; ((wua) this).field_m.length > var2; var2++) {
                ((wua) this).field_m[var2] = fh.a(((wua) this).field_m[var2], 32768);
            }
        }
    }

    final void a(uia param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = -85 % ((param1 - 27) / 57);
            L1: while (true) {
              var4 = param0.h(255);
              if (var4 == 0) {
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
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wua.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(uia param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        su var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != 1) {
                if (param1 == 2) {
                  var4_int = param0.h(255);
                  ((wua) this).field_m = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((wua) this).field_m[var5] = param0.d(123);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param1 == 3) {
                    var4_int = param0.h(255);
                    ((wua) this).field_q = new int[var4_int][];
                    ((wua) this).field_k = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param0.d(122);
                          var7 = li.a(var6, (byte) 126);
                          if (var7 != null) {
                            ((wua) this).field_k[var5] = var6;
                            ((wua) this).field_q[var5] = new int[var7.field_b];
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= var7.field_b) {
                                break L4;
                              } else {
                                ((wua) this).field_q[var5][var8] = param0.d(124);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (4 != param1) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                ((wua) this).field_l = rga.a(32287, param0.e((byte) -76), '<');
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("wua.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + 46 + ')');
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != -5) {
            ((wua) this).field_k = null;
        }
        if (null == ((wua) this).field_l) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((wua) this).field_l[0]);
        for (var3 = 1; ((wua) this).field_l.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((wua) this).field_l[var3]);
        }
        return var2.toString();
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 > -1) {
            field_p = null;
        }
    }

    wua() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Private";
    }
}
