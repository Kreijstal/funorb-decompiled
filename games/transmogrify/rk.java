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
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        kl var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
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
            var8 = var6.readLine();
            var11 = var8;
            var2 = var11;
            var11 = var8;
            if (var8 != null) {
              break L3;
            } else {
              if (var13 == 0) {
                if (!param1) {
                  var2 = var2 + "| " + var7;
                  return var2;
                } else {
                  return (String) null;
                }
              } else {
                break L3;
              }
            }
          }
          L4: {
            L5: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if ((var9 ^ -1) == 0) {
                break L5;
              } else {
                var11 = var8.substring(0, var9);
                if (var13 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            var11 = var8;
            var2 = var11;
            var2 = var11;
            break L4;
          }
          L6: {
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
              break L6;
            } else {
              if (-1 != var10) {
                var12 = var8.indexOf(".java:", var9);
                if (-1 < (var12 ^ -1)) {
                  break L6;
                } else {
                  var2 = var19 + var8.substring(var12 - -5, var10);
                  break L6;
                }
              } else {
                break L6;
              }
            }
          }
          var2 = var2 + ' ';
          continue L2;
        }
    }

    final void a(oa param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        oa var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  var3_int = param0.d((byte) 102);
                  if (-1 == (var3_int ^ -1)) {
                    break L3;
                  } else {
                    this.a(32512, var3_int, param0);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == -1) {
                  break L2;
                } else {
                  var5 = (oa) null;
                  this.a((oa) null, 91);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("rk.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
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
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        tf var7 = null;
        int var8 = 0;
        int var9 = 0;
        oa var10 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
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
              L3: {
                if (-2 != (param1 ^ -1)) {
                  break L3;
                } else {
                  this.field_s = vi.a('<', param2.g(param0 + -20264), 0);
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if ((param1 ^ -1) == -3) {
                  break L4;
                } else {
                  if (-4 == (param1 ^ -1)) {
                    var4_int = param2.d((byte) 110);
                    this.field_l = new int[var4_int][];
                    this.field_o = new int[var4_int];
                    var5 = 0;
                    L5: while (true) {
                      if (var4_int <= var5) {
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        var6 = param2.a((byte) -126);
                        var7 = kb.a(var6, true);
                        if (var9 != 0) {
                          break L2;
                        } else {
                          L6: {
                            L7: {
                              if (var7 != null) {
                                this.field_o[var5] = var6;
                                array$1 = new int[var7.field_b];
                                this.field_l[var5] = array$1;
                                var8 = 0;
                                L8: while (true) {
                                  if (var8 >= var7.field_b) {
                                    break L7;
                                  } else {
                                    this.field_l[var5][var8] = param2.a((byte) -108);
                                    var8++;
                                    if (var9 != 0) {
                                      break L6;
                                    } else {
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            var5++;
                            break L6;
                          }
                          continue L5;
                        }
                      }
                    }
                  } else {
                    if (-5 == (param1 ^ -1)) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4_int = param2.d((byte) 55);
              this.field_m = new int[var4_int];
              var5 = 0;
              L9: while (true) {
                if (var5 >= var4_int) {
                  break L2;
                } else {
                  this.field_m[var5] = param2.a((byte) -113);
                  var5++;
                  if (var9 == 0) {
                    continue L9;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("rk.E(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    final String d(byte param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        var5 = new StringBuilder(80);
        var2 = var5;
        if (this.field_s == null) {
          return "";
        } else {
          discarded$6 = var5.append(this.field_s[0]);
          var3 = 1;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_s.length <= var3) {
                  break L2;
                } else {
                  discarded$7 = var2.append("...");
                  discarded$8 = var5.append(this.field_s[var3]);
                  var3++;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var3 = -74 / ((-54 - param0) / 52);
              break L1;
            }
            return var2.toString();
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        oa var4 = null;
        L0: {
          L1: {
            var3 = Transmogrify.field_A ? 1 : 0;
            if (this.field_m != null) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_m.length) {
                  break L1;
                } else {
                  this.field_m[var2] = cl.b(this.field_m[var2], 32768);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 >= 44) {
            break L0;
          } else {
            var4 = (oa) null;
            this.a(119, -125, (oa) null);
            break L0;
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
