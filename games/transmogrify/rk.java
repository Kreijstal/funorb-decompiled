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
          var13 = Transmogrify.field_A ? 1 : 0;
          if (!(param0 instanceof kl)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (kl) ((Object) param0);
            var2 = var14.field_a + " | ";
            param0 = var14.field_b;
            break L0;
          }
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
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if ((var9 ^ -1) == 0) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
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
                break L3;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (-1 < (var12 ^ -1)) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + ' ';
                  continue L1;
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          } else {
            if (!param1) {
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              return (String) null;
            }
          }
        }
    }

    final void a(oa param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        oa var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.d((byte) 102);
              if (-1 == (var3_int ^ -1)) {
                L2: {
                  if (param1 == -1) {
                    break L2;
                  } else {
                    var5 = (oa) null;
                    this.a((oa) null, 91);
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a(32512, var3_int, param0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("rk.A(");

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
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
        tf var7 = null;
        int var8 = 0;
        int var9 = 0;
        oa var10 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 32512) {
                break L1;
              } else {
                var10 = (oa) null;
                this.a(61, -106, (oa) null);
                break L1;
              }
            }
            L2: {
              if (-2 != (param1 ^ -1)) {
                L3: {
                  if ((param1 ^ -1) == -3) {
                    var4_int = param2.d((byte) 55);
                    this.field_m = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var4_int) {
                        break L3;
                      } else {
                        this.field_m[var5] = param2.a((byte) -113);
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if (-4 == (param1 ^ -1)) {
                      var4_int = param2.d((byte) 110);
                      this.field_l = new int[var4_int][];
                      this.field_o = new int[var4_int];
                      var5 = 0;
                      L5: while (true) {
                        if (var4_int <= var5) {
                          break L3;
                        } else {
                          L6: {
                            var6 = param2.a((byte) -126);
                            var7 = kb.a(var6, true);
                            if (var7 != null) {
                              this.field_o[var5] = var6;
                              array$0 = new int[var7.field_b];
                              this.field_l[var5] = array$0;
                              var8 = 0;
                              L7: while (true) {
                                if (var8 >= var7.field_b) {
                                  break L6;
                                } else {
                                  this.field_l[var5][var8] = param2.a((byte) -108);
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
                      if (-5 == (param1 ^ -1)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L2;
              } else {
                this.field_s = vi.a('<', param2.g(param0 + -20264), 0);
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

            stackIn_23_1 = new StringBuilder().append("rk.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final String d(byte param0) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(this.field_s != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_s[0]);
        for (var3 = 1; this.field_s.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_s[var3]);
        }
        var3 = -74 / ((-54 - param0) / 52);
        return var2.toString();
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Transmogrify.field_A ? 1 : 0;
        if (!(this.field_m == null)) {
            for (var2 = 0; var2 < this.field_m.length; var2++) {
                this.field_m[var2] = cl.b(this.field_m[var2], 32768);
            }
        }
        if (param0 < 44) {
            oa var4 = (oa) null;
            this.a(119, -125, (oa) null);
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
