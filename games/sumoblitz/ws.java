/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ws {
    static int field_b;
    static String field_a;

    final static int a(io param0, byte param1) {
        if (param1 > 116) {
          if (param0 != io.field_i) {
            if (param0 != io.field_f) {
              if (io.field_c != param0) {
                if (param0 != io.field_g) {
                  if (param0 != io.field_k) {
                    if (param0 != io.field_h) {
                      if (param0 != io.field_e) {
                        if (param0 == io.field_d) {
                          return 5126;
                        } else {
                          throw new IllegalArgumentException("");
                        }
                      } else {
                        return 5131;
                      }
                    } else {
                      return 5125;
                    }
                  } else {
                    return 5123;
                  }
                } else {
                  return 5121;
                }
              } else {
                return 5124;
              }
            } else {
              return 5122;
            }
          } else {
            return 5120;
          }
        } else {
          field_b = -70;
          if (param0 != io.field_i) {
            if (param0 != io.field_f) {
              if (io.field_c != param0) {
                if (param0 != io.field_g) {
                  if (param0 != io.field_k) {
                    if (param0 != io.field_h) {
                      if (param0 != io.field_e) {
                        if (param0 == io.field_d) {
                          return 5126;
                        } else {
                          throw new IllegalArgumentException("");
                        }
                      } else {
                        return 5131;
                      }
                    } else {
                      return 5125;
                    }
                  } else {
                    return 5123;
                  }
                } else {
                  return 5121;
                }
              } else {
                return 5124;
              }
            } else {
              return 5122;
            }
          } else {
            return 5120;
          }
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 52) {
            field_a = null;
            return is.field_b;
        }
        return is.field_b;
    }

    public static void a(byte param0) {
        if (param0 != -71) {
            field_b = -48;
            field_a = null;
            return;
        }
        field_a = null;
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
        su var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Sumoblitz.field_L ? 1 : 0;
          if (param1 instanceof su) {
            var14 = (su) (Object) param1;
            var2 = var14.field_a + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param1 = var14.field_b;
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
            var2 = var2 + "| " + var7;
            if (param0 != 71) {
              return null;
            } else {
              return var2;
            }
          } else {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 - -1);
              if (var9 == -1) {
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
              if (0 == (var9 ^ -1)) {
                break L3;
              } else {
                if ((var10 ^ -1) == 0) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (0 <= var12) {
                    var2 = var19 + var8.substring(var12 + 5, var10);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "to keep fullscreen or";
    }
}
