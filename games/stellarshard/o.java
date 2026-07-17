/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class o {
    static String field_c;
    int field_d;
    int field_i;
    static bd field_h;
    int field_k;
    static String[] field_g;
    int field_a;
    int field_e;
    static uc field_l;
    static int field_j;
    static int field_f;
    int field_b;

    abstract void a(int param0, int param1, int param2);

    final static void b(int param0) {
        ha var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var1 = pg.field_fb;
            L1: while (true) {
              if (!wk.b(1816)) {
                break L0;
              } else {
                var1.f(8, 950);
                int fieldTemp$5 = var1.field_k + 1;
                var1.field_k = var1.field_k + 1;
                var2 = fieldTemp$5;
                qh.a(124, var1);
                pg.field_fb.a(var1.field_k + -var2, (byte) -75);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "o.F(" + -10834 + 41);
        }
    }

    final static pf a(int param0, int param1, int param2, boolean param3, boolean param4) {
        if (param1 != 2) {
            field_c = null;
        }
        return na.a(param0, 255, param2, param3, false, param4);
    }

    public static void a(int param0) {
        field_l = null;
        field_g = null;
        field_h = null;
        field_c = null;
    }

    final static String a(int param0, Throwable param1) throws IOException {
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
        wg var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = stellarshard.field_B;
          if (param1 instanceof wg) {
            var14 = (wg) (Object) param1;
            param1 = var14.field_a;
            var2 = var14.field_f + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
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
              if (var9 != -1) {
                var11 = var8.substring(0, var9);
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8;
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(1 + var16.lastIndexOf(' '));
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(1 + var17.lastIndexOf('\t'));
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 != -1) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L1;
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            if (param0 == 1) {
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              return null;
            }
          }
        }
    }

    abstract void a(int param0, int param1);

    final static void a(qe param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        vl var6 = null;
        sd var7 = null;
        vl var8 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var2_int = param0.field_c;
                  if (param0.field_c < 0) {
                    break L3;
                  } else {
                    if (7 >= param0.field_c) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param0.field_c < 13) {
                  break L1;
                } else {
                  if (param0.field_c >= 16) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[32], 100, 2 * pk.field_h);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              b.a(param0.field_c, 6);
              if (0 > e.field_e) {
                break L4;
              } else {
                if (qe.field_e >= 2047) {
                  break L4;
                } else {
                  qe.field_e = qe.field_e | 1 << e.field_e;
                  if (qe.field_e != 2047) {
                    break L4;
                  } else {
                    hj.a(250, 5, 1);
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (param0.field_c != 8) {
                break L5;
              } else {
                L6: {
                  L7: {
                    nf.field_r = false;
                    if (gh.field_b < 5) {
                      break L7;
                    } else {
                      if (nc.field_H != 3) {
                        gh.field_b = gh.field_b + 1;
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  gh.field_b = 5;
                  break L6;
                }
                nc.field_H = 1;
                stellarshard.field_U[10] = stellarshard.field_U[10] + 1;
                if (fe.field_e) {
                  ll.field_c.a(sb.field_e[31], 100, pk.field_h * 2);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L8: {
              if (9 == param0.field_c) {
                L9: {
                  if (!fe.field_e) {
                    break L9;
                  } else {
                    ll.field_c.a(sb.field_e[28], 100, 2 * pk.field_h);
                    break L9;
                  }
                }
                ig.field_D = 255;
                var4 = 0;
                L10: while (true) {
                  if (var4 >= 256) {
                    stellarshard.field_U[12] = stellarshard.field_U[12] + 1;
                    break L8;
                  } else {
                    var6 = new vl(0, a.field_h[0]);
                    var8 = var6;
                    var8.field_j = var8.field_j - 8.0 * Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0);
                    var8.field_a = var8.field_a - Math.cos(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 8.0;
                    var6.field_c = a.field_h[0].field_a + var8.field_j * 4.0;
                    var8.field_k = var6.field_a * 4.0 + a.field_h[0].field_l;
                    var6.field_j = var6.field_j + a.field_h[0].field_d;
                    var6.field_a = var6.field_a + a.field_h[0].field_k;
                    var8.field_p = 10;
                    var8.field_n = -3;
                    var8.field_q = 16777215;
                    var6.field_d = 65280;
                    wk.field_b[eg.a(-30)] = var6;
                    var4++;
                    continue L10;
                  }
                }
              } else {
                break L8;
              }
            }
            L11: {
              if (param0.field_c == 10) {
                gh.field_b = 500;
                nf.field_r = false;
                nc.field_H = 2;
                stellarshard.field_U[11] = stellarshard.field_U[11] + 1;
                if (fe.field_e) {
                  ll.field_c.a(sb.field_e[30], 100, pk.field_h * 2);
                  break L11;
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L12: {
              if (11 != param0.field_c) {
                break L12;
              } else {
                nf.field_r = false;
                gh.field_b = 1500;
                nc.field_H = 3;
                if (fe.field_e) {
                  ll.field_c.a(sb.field_e[29], 100, 2 * pk.field_h);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (12 != param0.field_c) {
                break L13;
              } else {
                gh.field_b = 500;
                nf.field_r = false;
                nc.field_H = 4;
                stellarshard.field_U[13] = stellarshard.field_U[13] + 1;
                if (!fe.field_e) {
                  break L13;
                } else {
                  ll.field_c.a(sb.field_e[0], 100, pk.field_h * 2);
                  break L13;
                }
              }
            }
            L14: {
              if (param0.field_c != 13) {
                break L14;
              } else {
                e.field_e = 8;
                break L14;
              }
            }
            L15: {
              if (14 == param0.field_c) {
                e.field_e = 9;
                stellarshard.field_U[15] = stellarshard.field_U[15] + 1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param0.field_c != 15) {
                break L16;
              } else {
                e.field_e = 10;
                break L16;
              }
            }
            L17: {
              if (param0.field_c == 16) {
                L18: {
                  ag.field_a = 0;
                  ml.field_h = ml.field_h + 1;
                  gf.field_c = 0;
                  if (ml.field_h != 20) {
                    break L18;
                  } else {
                    if (!pk.a(-12663, 0)) {
                      break L18;
                    } else {
                      hj.a(242, 13, 1);
                      break L18;
                    }
                  }
                }
                if (fe.field_e) {
                  ll.field_c.a(sb.field_e[41], 100, 3 * pk.field_h);
                  break L17;
                } else {
                  break L17;
                }
              } else {
                break L17;
              }
            }
            var7 = new sd(-var2_int, param0, 16777215);
            hf.field_e[ha.k(-1001)] = var7;
            param0.field_g = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var2 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var2;
            stackOut_61_1 = new StringBuilder().append("o.G(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L19;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L19;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Just play";
        field_j = 0;
        field_f = 0;
    }
}
