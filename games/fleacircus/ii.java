/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ii {
    static String field_a;
    static int field_b;

    final static boolean a(int param0, char param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param0 == 1) {
          if (param1 < 48) {
            if (param1 < 65) {
              L0: {
                if (param1 < 97) {
                  break L0;
                } else {
                  if (122 < param1) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (param1 <= 90) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param1 < 97) {
                      break L2;
                    } else {
                      if (122 < param1) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (57 < param1) {
              if (param1 >= 65) {
                if (param1 > 90) {
                  if (param1 >= 97) {
                    if (122 < param1) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                if (param1 >= 97) {
                  if (122 < param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
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
        h var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = fleas.field_A ? 1 : 0;
          if (param1 instanceof h) {
            var14 = (h) (Object) param1;
            param1 = var14.field_e;
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
          if (var8 == null) {
            if (param0 <= 18) {
              field_b = 46;
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              var2 = var2 + "| " + var7;
              return var2;
            }
          } else {
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
              var17 = var16.substring(var16.lastIndexOf(' ') + 1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if ((var9 ^ -1) == 0) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 5) {
            field_b = -53;
        }
    }

    final static void b(int param0) {
        if (param0 <= 111) {
            boolean discarded$0 = ii.a(11, '');
            bj.a(14, rl.a((byte) -54));
            return;
        }
        bj.a(14, rl.a((byte) -54));
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 12969) {
            ii.a(77);
            return gi.a(param1, true, 0, 10);
        }
        return gi.a(param1, true, 0, 10);
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = fleas.field_A ? 1 : 0;
          rh.field_e = null;
          ah.field_c = false;
          if (!jg.field_d) {
            var1 = nb.field_h;
            if ((var1 ^ -1) >= -1) {
              ok.field_x.n(-22645);
              ic.n(-128);
              break L0;
            } else {
              if (var1 == 1) {
                rh.field_e = ri.field_q;
                rh.field_e = gj.a(0, new CharSequence[3]);
                ok.field_x.n(-22645);
                ic.n(-128);
                if (param0 == -88) {
                  return;
                } else {
                  boolean discarded$3 = ii.a(-2, 'D');
                  return;
                }
              } else {
                rh.field_e = db.a(rg.field_r, new String[1], true);
                rh.field_e = gj.a(0, new CharSequence[3]);
                ok.field_x.n(-22645);
                ic.n(-128);
                if (param0 == -88) {
                  return;
                } else {
                  boolean discarded$4 = ii.a(-2, 'D');
                  return;
                }
              }
            }
          } else {
            ok.field_x.e(true);
            break L0;
          }
        }
        if (param0 != -88) {
          boolean discarded$5 = ii.a(-2, 'D');
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Orb points: <%0>";
        field_b = 24;
    }
}
