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
                stackIn_30_0 = 1;
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
                        stackIn_27_0 = 1;
                        break L1;
                      }
                    }
                  }
                  stackIn_27_0 = 0;
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
        h var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        int var20;
        int var21;
        L0: {
          L1: {
            var13 = fleas.field_A ? 1 : 0;
            if (param1 instanceof h) {
              break L1;
            } else {
              var2 = "";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var14 = (h) ((Object) param1);
          param1 = var14.field_e;
          var2 = var14.field_f + " | ";
          break L0;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2 = var5;
        var11 = var2;
        var2 = var11;
        var2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var2;
        var2 = var11;
        var2 = var7;
        L2: while (true) {
          L3: {
            var8 = var6.readLine();
            var2 = var8;
            var11 = var2;
            var2 = var11;
            var2 = var8;
            if (var8 == null) {
              break L3;
            } else {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              var21 = -1;
              var20 = var9;
              if (var13 != 0) {
                if (var20 <= var21) {
                  field_b = 46;
                  var2 = var2 + "| " + var7;
                  return var2;
                } else {
                  var2 = var2 + "| " + var7;
                  var11 = var2;
                  var2 = var11;
                  var11 = var2;
                  return var2;
                }
              } else {
                L4: {
                  L5: {
                    if (var20 != var21) {
                      break L5;
                    } else {
                      var11 = var8;
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = var8.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L4;
                }
                L6: {
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
                  var2 = var19;
                  if ((var9 ^ -1) == 0) {
                    break L6;
                  } else {
                    if (var10 == -1) {
                      break L6;
                    } else {
                      var12 = var8.indexOf(".java:", var9);
                      if (var12 < 0) {
                        break L6;
                      } else {
                        var2 = var19 + var8.substring(5 + var12, var10);
                        break L6;
                      }
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
            }
          }
          if (param0 <= 18) {
            field_b = 46;
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            var2 = var2 + "| " + var7;
            return var2;
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
            ii.a(11, '');
            bj.a(14, rl.a((byte) -54));
            return;
        }
        bj.a(14, rl.a((byte) -54));
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 12969) {
                break L1;
              } else {
                ii.a(77);
                break L1;
              }
            }
            stackIn_3_0 = gi.a(param1, true, 0, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ii.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0) {
        int var1;
        int var2;
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
                rh.field_e = gj.a(0, new CharSequence[]{(CharSequence) ((Object) rh.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) jk.field_p)});
                ok.field_x.n(-22645);
                ic.n(-128);
                if (param0 != -88) {
                  ii.a(-2, 'D');
                  return;
                } else {
                  return;
                }
              } else {
                rh.field_e = db.a(rg.field_r, new String[]{Integer.toString(var1)}, true);
                if (var2 == 0) {
                  rh.field_e = gj.a(0, new CharSequence[]{(CharSequence) ((Object) rh.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) jk.field_p)});
                  ok.field_x.n(-22645);
                  ic.n(-128);
                  if (param0 != -88) {
                    ii.a(-2, 'D');
                    return;
                  } else {
                    return;
                  }
                } else {
                  rh.field_e = ri.field_q;
                  rh.field_e = gj.a(0, new CharSequence[]{(CharSequence) ((Object) rh.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) jk.field_p)});
                  ok.field_x.n(-22645);
                  ic.n(-128);
                  if (param0 != -88) {
                    ii.a(-2, 'D');
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            ok.field_x.e(true);
            if (var2 == 0) {
              break L0;
            } else {
              var1 = nb.field_h;
              if ((var1 ^ -1) < -1) {
                if (var1 == 1) {
                  rh.field_e = ri.field_q;
                  rh.field_e = gj.a(0, new CharSequence[]{(CharSequence) ((Object) rh.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) jk.field_p)});
                  ok.field_x.n(-22645);
                  ic.n(-128);
                  if (param0 == -88) {
                    return;
                  } else {
                    ii.a(-2, 'D');
                    return;
                  }
                } else {
                  rh.field_e = db.a(rg.field_r, new String[]{Integer.toString(var1)}, true);
                  if (var2 == 0) {
                    rh.field_e = gj.a(0, new CharSequence[]{(CharSequence) ((Object) rh.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) jk.field_p)});
                    ok.field_x.n(-22645);
                    ic.n(-128);
                    if (param0 == -88) {
                      return;
                    } else {
                      ii.a(-2, 'D');
                      return;
                    }
                  } else {
                    rh.field_e = ri.field_q;
                    rh.field_e = gj.a(0, new CharSequence[]{(CharSequence) ((Object) rh.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) jk.field_p)});
                    ok.field_x.n(-22645);
                    ic.n(-128);
                    if (param0 == -88) {
                      return;
                    } else {
                      ii.a(-2, 'D');
                      return;
                    }
                  }
                }
              } else {
                ok.field_x.n(-22645);
                ic.n(-128);
                if (param0 != -88) {
                  ii.a(-2, 'D');
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param0 != -88) {
          ii.a(-2, 'D');
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Orb points: <%0>";
        field_b = 24;
    }
}
