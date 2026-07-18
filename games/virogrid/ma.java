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
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        l stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((ma) this).field_g.field_i.field_a;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (((ma) this).field_g.field_i != var3) {
              L2: {
                if (param0 == 1) {
                  break L2;
                } else {
                  int discarded$4 = 0;
                  int discarded$5 = ma.a();
                  break L2;
                }
              }
              ((ma) this).field_b = var3.field_a;
              stackOut_8_0 = (l) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((ma) this).field_b = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (l) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ma.G(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final static int a() {
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
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        l stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((ma) this).field_g.field_i.field_f;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (((ma) this).field_g.field_i != var3) {
              L2: {
                ((ma) this).field_b = var3.field_f;
                if (param0 < -64) {
                  break L2;
                } else {
                  field_a = null;
                  break L2;
                }
              }
              stackOut_8_0 = (l) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((ma) this).field_b = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (l) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ma.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
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
        rg var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
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
        var5 = var15.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (-1 == var9) {
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
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
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
        try {
            ((ma) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_h = null;
        if (param0 != 0) {
          int discarded$4 = 0;
          int discarded$5 = ma.a();
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
