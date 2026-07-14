/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ma {
    static String field_a;
    static kf field_c;
    private p field_g;
    private l field_b;
    static km field_e;
    static wg field_h;
    static String field_f;
    static String field_d;

    final l b(int param0, l param1) {
        l var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((ma) this).field_g.field_i.field_a;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (((ma) this).field_g.field_i != var3) {
          if (param0 != 1) {
            int discarded$2 = ma.a(false);
            ((ma) this).field_b = var3.field_a;
            return var3;
          } else {
            ((ma) this).field_b = var3.field_a;
            return var3;
          }
        } else {
          ((ma) this).field_b = null;
          return null;
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            ma.d(-1);
            return -gi.field_c + qg.field_g;
        }
        return -gi.field_c + qg.field_g;
    }

    final l a(byte param0) {
        l var2 = null;
        var2 = ((ma) this).field_g.field_i.field_a;
        if (var2 != ((ma) this).field_g.field_i) {
          if (param0 != 48) {
            field_c = null;
            ((ma) this).field_b = var2.field_a;
            return var2;
          } else {
            ((ma) this).field_b = var2.field_a;
            return var2;
          }
        } else {
          ((ma) this).field_b = null;
          return null;
        }
    }

    final l a(int param0) {
        l var2 = null;
        if (param0 != -1) {
            Object var3 = null;
            l discarded$0 = ((ma) this).b(83, (l) null);
            var2 = ((ma) this).field_b;
            if (!(var2 != ((ma) this).field_g.field_i)) {
                ((ma) this).field_b = null;
                return null;
            }
            ((ma) this).field_b = var2.field_a;
            return var2;
        }
        var2 = ((ma) this).field_b;
        if (!(var2 != ((ma) this).field_g.field_i)) {
            ((ma) this).field_b = null;
            return null;
        }
        ((ma) this).field_b = var2.field_a;
        return var2;
    }

    final l a(int param0, l param1) {
        l var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((ma) this).field_g.field_i.field_f;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (((ma) this).field_g.field_i != var3) {
          ((ma) this).field_b = var3.field_f;
          if (param0 >= -64) {
            field_a = null;
            return var3;
          } else {
            return var3;
          }
        } else {
          ((ma) this).field_b = null;
          return null;
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        rg var14 = null;
        StringWriter var15 = null;
        String var20 = null;
        BufferedReader var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        BufferedReader var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var39 = null;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          if (param1 instanceof rg) {
            var14 = (rg) (Object) param1;
            param1 = var14.field_a;
            var2 = var14.field_c + " | ";
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
        if (param0 == 40) {
          var20 = var15.toString();
          var2 = var20;
          var11 = var20;
          var21 = new BufferedReader((Reader) (Object) new StringReader(var20));
          var27 = var21.readLine();
          var2 = var27;
          var11 = var27;
          L1: while (true) {
            var22 = var21.readLine();
            var2 = var22;
            var11 = var22;
            var2 = var11;
            if (var22 != null) {
              L2: {
                var9 = var22.indexOf('(');
                var10 = var22.indexOf(')', 1 + var9);
                if (-1 == var9) {
                  var11 = var22;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var22.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var23 = var11.trim();
                var2 = var23;
                var2 = var23;
                var24 = var23.substring(1 + var23.lastIndexOf(' '));
                var2 = var24;
                var2 = var24;
                var25 = var24.substring(var24.lastIndexOf('\t') + 1);
                var2 = var25;
                var2 = var25;
                var26 = var2 + var25;
                var2 = var26;
                var2 = var26;
                if (var9 == -1) {
                  break L3;
                } else {
                  if (0 == (var10 ^ -1)) {
                    break L3;
                  } else {
                    var12 = var22.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
                      var2 = var26 + var22.substring(5 + var12, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var27;
              var11 = var2;
              return var2;
            }
          }
        } else {
          field_d = null;
          var28 = var15.toString();
          var2 = var28;
          var11 = var28;
          var29 = new BufferedReader((Reader) (Object) new StringReader(var28));
          var6 = var29;
          var35 = var29.readLine();
          var2 = var35;
          var11 = var35;
          var7 = var35;
          var2 = var7;
          var11 = var7;
          L4: while (true) {
            var30 = var29.readLine();
            var2 = var30;
            var11 = var30;
            var2 = var11;
            if (var30 != null) {
              L5: {
                var9 = var30.indexOf('(');
                var10 = var30.indexOf(')', 1 + var9);
                if (-1 == var9) {
                  var11 = var30;
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var30.substring(0, var9);
                  break L5;
                }
              }
              L6: {
                var31 = var11.trim();
                var2 = var31;
                var2 = var31;
                var32 = var31.substring(1 + var31.lastIndexOf(' '));
                var2 = var32;
                var2 = var32;
                var33 = var32.substring(var32.lastIndexOf('\t') + 1);
                var2 = var33;
                var2 = var33;
                var34 = var2 + var33;
                var2 = var34;
                var2 = var34;
                if (var9 == -1) {
                  break L6;
                } else {
                  if (0 == (var10 ^ -1)) {
                    break L6;
                  } else {
                    var12 = var30.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
                      var2 = var34 + var30.substring(5 + var12, var10);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L4;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var35;
              var39 = var2;
              var11 = var2;
              return var2;
            }
          }
        }
    }

    final l c(int param0) {
        l var2 = null;
        if (param0 == 12677) {
          var2 = ((ma) this).field_g.field_i.field_f;
          if (((ma) this).field_g.field_i == var2) {
            ((ma) this).field_b = null;
            return null;
          } else {
            ((ma) this).field_b = var2.field_f;
            return var2;
          }
        } else {
          return null;
        }
    }

    ma(p param0) {
        ((ma) this).field_g = param0;
    }

    public static void d(int param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_h = null;
        if (param0 != 0) {
          int discarded$2 = ma.a(false);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final l b(int param0) {
        l var2 = null;
        Object var3 = null;
        var2 = ((ma) this).field_b;
        if (var2 != ((ma) this).field_g.field_i) {
          if (param0 != 41) {
            var3 = null;
            l discarded$2 = ((ma) this).b(-37, (l) null);
            ((ma) this).field_b = var2.field_f;
            return var2;
          } else {
            ((ma) this).field_b = var2.field_f;
            return var2;
          }
        } else {
          ((ma) this).field_b = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please check if address is correct";
        field_f = "Searching for an opponent";
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
