/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae {
    static int[] field_c;
    static volatile boolean field_b;
    static int field_f;
    private int[] field_e;
    static uf field_g;
    static wi field_a;
    static String field_d;

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -81) {
          field_g = null;
          field_g = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        var2 = param1.length();
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (var2 <= var4) {
            if (param0 != -51764539) {
              return 51;
            } else {
              return var3;
            }
          } else {
            var3 = lf.a(param1.charAt(var4), (byte) 85) + ((var3 << -51764539) - var3);
            var4++;
            continue L0;
          }
        }
    }

    private ae() throws Throwable {
        throw new Error();
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        if (0 == param5) {
          return 0;
        } else {
          param5 = param5 + param2;
          var7 = param4;
          var8 = param1;
          L0: while (true) {
            L1: {
              var9 = param3[var8];
              if (-1 >= (var9 ^ -1)) {
                var7++;
                break L1;
              } else {
                var7 = ((ae) this).field_e[var7];
                break L1;
              }
            }
            L2: {
              var10 = ((ae) this).field_e[var7];
              if (((ae) this).field_e[var7] >= 0) {
                break L2;
              } else {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param5 > param2) {
                  var7 = 0;
                  break L2;
                } else {
                  return -param1 + var8 - -1;
                }
              }
            }
            L3: {
              if (-1 != (var9 & 64 ^ -1)) {
                var7 = ((ae) this).field_e[var7];
                break L3;
              } else {
                var7++;
                break L3;
              }
            }
            L4: {
              var10 = ((ae) this).field_e[var7];
              if (((ae) this).field_e[var7] < 0) {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param5 > param2) {
                  var7 = 0;
                  break L4;
                } else {
                  return -param1 + var8 - -1;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if ((var9 & 32) != 0) {
                var7 = ((ae) this).field_e[var7];
                break L5;
              } else {
                var7++;
                break L5;
              }
            }
            L6: {
              var10 = ((ae) this).field_e[var7];
              if (((ae) this).field_e[var7] >= 0) {
                break L6;
              } else {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param2 < param5) {
                  var7 = 0;
                  break L6;
                } else {
                  return -param1 + var8 - -1;
                }
              }
            }
            L7: {
              if ((var9 & 16) == 0) {
                var7++;
                break L7;
              } else {
                var7 = ((ae) this).field_e[var7];
                break L7;
              }
            }
            L8: {
              var10 = ((ae) this).field_e[var7];
              if (((ae) this).field_e[var7] >= 0) {
                break L8;
              } else {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param5 > param2) {
                  var7 = 0;
                  break L8;
                } else {
                  return -param1 + var8 - -1;
                }
              }
            }
            L9: {
              if ((8 & var9) != 0) {
                var7 = ((ae) this).field_e[var7];
                break L9;
              } else {
                var7++;
                break L9;
              }
            }
            L10: {
              var10 = ((ae) this).field_e[var7];
              if (((ae) this).field_e[var7] < 0) {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param2 < param5) {
                  var7 = 0;
                  break L10;
                } else {
                  return -param1 + var8 - -1;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (0 == (4 & var9)) {
                var7++;
                break L11;
              } else {
                var7 = ((ae) this).field_e[var7];
                break L11;
              }
            }
            L12: {
              var10 = ((ae) this).field_e[var7];
              if (-1 >= (((ae) this).field_e[var7] ^ -1)) {
                break L12;
              } else {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param2 < param5) {
                  var7 = 0;
                  break L12;
                } else {
                  return -param1 + var8 - -1;
                }
              }
            }
            L13: {
              if (-1 == (2 & var9 ^ -1)) {
                var7++;
                break L13;
              } else {
                var7 = ((ae) this).field_e[var7];
                break L13;
              }
            }
            L14: {
              var10 = ((ae) this).field_e[var7];
              if (((ae) this).field_e[var7] < 0) {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param5 > param2) {
                  var7 = 0;
                  break L14;
                } else {
                  return -param1 + var8 - -1;
                }
              } else {
                break L14;
              }
            }
            L15: {
              if ((var9 & 1) == 0) {
                var7++;
                break L15;
              } else {
                var7 = ((ae) this).field_e[var7];
                break L15;
              }
            }
            L16: {
              var10 = ((ae) this).field_e[var7];
              if (((ae) this).field_e[var7] >= 0) {
                break L16;
              } else {
                break L16;
              }
            }
            var8++;
            continue L0;
          }
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
        ga var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Bounce.field_N;
          if (!(param1 instanceof ga)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (ga) (Object) param1;
            var2 = var14.field_a + " | ";
            param1 = var14.field_e;
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        if (param0 > -68) {
          return null;
        } else {
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
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', var9 - -1);
                if (0 == (var9 ^ -1)) {
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
                var17 = var16.substring(1 + var16.lastIndexOf(' '));
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(var17.lastIndexOf('\t') + 1);
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                if (-1 == var9) {
                  break L3;
                } else {
                  if (var10 == -1) {
                    break L3;
                  } else {
                    var12 = var8.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L3;
                    } else {
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_b = true;
        field_g = new uf();
        field_d = "Password: ";
    }
}
