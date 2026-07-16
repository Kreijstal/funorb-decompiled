/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class da {
    static String field_h;
    static String field_i;
    static int[] field_d;
    static String field_a;
    static int[] field_g;
    static int field_e;
    static String field_c;
    static int[][] field_b;
    static hl field_f;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 > -8) {
          return;
        } else {
          field_g = null;
          field_i = null;
          field_b = null;
          field_h = null;
          field_d = null;
          return;
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
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
        Object var14 = null;
        cn var14_ref = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        var14 = null;
        var13 = TetraLink.field_J;
        if (param0 != 118) {
          L0: {
            L1: {
              field_h = null;
              if (param1 instanceof cn) {
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
            var14_ref = (cn) (Object) param1;
            param1 = var14_ref.field_a;
            var2 = var14_ref.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
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
          L2: while (true) {
            L3: {
              var8 = var6.readLine();
              var11 = var8;
              var2 = var11;
              var11 = var8;
              if (var8 == null) {
                var2 = var2 + "| " + var7;
                break L3;
              } else {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var13 != 0) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (-1 != var9) {
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
                    var17 = var16.substring(1 + var16.lastIndexOf(' '));
                    var2 = var17;
                    var2 = var17;
                    var18 = var17.substring(1 + var17.lastIndexOf('\t'));
                    var2 = var18;
                    var2 = var18;
                    var19 = var2 + var18;
                    var2 = var19;
                    var2 = var19;
                    if (-1 == var9) {
                      break L6;
                    } else {
                      if (0 == (var10 ^ -1)) {
                        break L6;
                      } else {
                        var12 = var8.indexOf(".java:", var9);
                        if (0 <= var12) {
                          var2 = var19 + var8.substring(5 + var12, var10);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var2 = var2 + 32;
                  continue L2;
                }
              }
            }
            return var2;
          }
        } else {
          L7: {
            L8: {
              if (param1 instanceof cn) {
                break L8;
              } else {
                var2 = "";
                if (var13 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            var14_ref = (cn) (Object) param1;
            param1 = var14_ref.field_a;
            var2 = var14_ref.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L7;
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
          L9: while (true) {
            L10: {
              var8 = var6.readLine();
              var11 = var8;
              var2 = var11;
              var11 = var8;
              if (var8 == null) {
                var2 = var2 + "| " + var7;
                break L10;
              } else {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var13 != 0) {
                  break L10;
                } else {
                  L11: {
                    L12: {
                      if (-1 != var9) {
                        break L12;
                      } else {
                        var11 = var8;
                        if (var13 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var11 = var8.substring(0, var9);
                    var2 = var11;
                    var2 = var11;
                    break L11;
                  }
                  L13: {
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
                    if (-1 == var9) {
                      break L13;
                    } else {
                      if (0 == (var10 ^ -1)) {
                        break L13;
                      } else {
                        var12 = var8.indexOf(".java:", var9);
                        if (0 <= var12) {
                          var2 = var19 + var8.substring(5 + var12, var10);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  var2 = var2 + 32;
                  continue L9;
                }
              }
            }
            return var2;
          }
        }
    }

    final static boolean a(ah param0, ah param1, int param2, ah param3) {
        int var4 = 0;
        if (param0.c(100)) {
          if (param0.a("commonui", (byte) -124)) {
            var4 = 51 / ((param2 - 43) / 40);
            if (param1.c(113)) {
              if (param1.a("commonui", (byte) -122)) {
                if (param3.c(102)) {
                  if (!param3.a("button.gif", (byte) -102)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, ve param2, int param3, int param4, ve param5) {
        if (param3 >= -100) {
          da.a(64);
          aa.field_Wb = param5;
          cd.field_e = param0;
          ao.field_a = param1;
          bn.field_b = param2;
          hc.field_q = param4;
          return;
        } else {
          aa.field_Wb = param5;
          cd.field_e = param0;
          ao.field_a = param1;
          bn.field_b = param2;
          hc.field_q = param4;
          return;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        me.a((java.awt.Component) (Object) param1, 250);
        sd.a((java.awt.Component) (Object) param1, 33);
        if (null == qf.field_k) {
          if (param0 >= -55) {
            field_i = null;
            return;
          } else {
            return;
          }
        } else {
          qf.field_k.b(-115, (java.awt.Component) (Object) param1);
          if (param0 < -55) {
            return;
          } else {
            field_i = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_h = "Report abuse";
        field_c = "Your ignore list is full. Max of 100 hit.";
        field_a = "Please try changing the following settings:  ";
    }
}
