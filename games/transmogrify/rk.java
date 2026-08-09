/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk extends ri {
    static int[] field_n;
    static int field_p;
    private String[] field_s;
    int[] field_m;
    private int[] field_o;
    static ti[] field_r;
    static int[] field_q;
    private int[][] field_l;

    final static String a(Throwable param0, boolean param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        kl var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        L0: {
          L1: {
            var13 = Transmogrify.field_A ? 1 : 0;
            if (!(param0 instanceof kl)) {
              break L1;
            } else {
              var14 = (kl) ((Object) param0);
              var2 = var14.field_a + " | ";
              param0 = var14.field_b;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          break L0;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L2: while (true) {
          L3: {
            L4: {
              var8 = var6.readLine();
              var11 = var8;
              var2 = var11;
              var11 = var8;
              if (var8 != null) {
                break L4;
              } else {
                if (var13 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if ((var9 ^ -1) == 0) {
                  break L6;
                } else {
                  var11 = var8.substring(0, var9);
                  if (var13 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              var11 = var8;
              var2 = var11;
              var2 = var11;
              break L5;
            }
            L7: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L7;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (-1 < (var12 ^ -1)) {
                    break L7;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
            var2 = var2 + ' ';
            if (var13 == 0) {
              continue L2;
            } else {
              break L3;
            }
          }
          if (!param1) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            return (String) null;
          }
        }
    }

    final void a(oa param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        oa var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = param0.d((byte) 102);
                        if (-1 == (var3_int ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(32512, var3_int, param0);
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == -1) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = (oa) null;
                        this.a((oa) null, 91);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var3);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("rk.A(");
                    stackIn_9_1 = stackIn_10_1;
                    if (param0 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            rk.b(true);
        }
        field_n = null;
        field_r = null;
        field_q = null;
    }

    private final void a(int param0, int param1, oa param2) {
        int[] array$0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        tf var7 = null;
        int var8 = 0;
        int var9 = 0;
        oa var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 32512) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var10 = (oa) null;
                        this.a(61, -106, (oa) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-2 != (param1 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_s = vi.a('<', param2.g(param0 + -20264), 0);
                        if (var9 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((param1 ^ -1) == -3) {
                            statePc = 23;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-4 == (param1 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-5 == (param1 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int = param2.d((byte) 110);
                        this.field_l = new int[var4_int][];
                        this.field_o = new int[var4_int];
                        var5 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_int <= var5) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = param2.a((byte) -126);
                        var7 = kb.a(var6, true);
                        if (var9 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_o[var5] = var6;
                        array$0 = new int[var7.field_b];
                        this.field_l[var5] = array$0;
                        var8 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var8 >= var7.field_b) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_l[var5][var8] = param2.a((byte) -108);
                        var8++;
                        if (var9 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var9 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4_int = param2.d((byte) 55);
                        this.field_m = new int[var4_int];
                        var5 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var5 >= var4_int) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_m[var5] = param2.a((byte) -113);
                        var5++;
                        if (var9 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        return;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var9 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (var4);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("rk.E(").append(param0).append(',').append(param1).append(',');
                    stackIn_31_1 = stackIn_32_1;
                    if (param2 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw ch.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String d(byte param0) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    var5 = new StringBuilder(80);
                    var2 = var5;
                    if (this.field_s == null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return "";
                }
                case 3: {
                    discarded$3 = var5.append(this.field_s[0]);
                    var3 = 1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_s.length <= var3) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    discarded$4 = var2.append("...");
                    discarded$5 = var5.append(this.field_s[var3]);
                    var3++;
                    if (var4 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = -74 / ((-54 - param0) / 52);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return var2.toString();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        oa var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    if (this.field_m != null) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 >= this.field_m.length) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_m[var2] = cl.b(this.field_m[var2], 32768);
                    var2++;
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param0 >= 44) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = (oa) null;
                    this.a(119, -125, (oa) null);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    rk() {
    }

    static {
        field_n = new int[12];
        field_r = new ti[8];
        field_q = new int[8192];
    }
}
