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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_g.field_i.field_a;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (this.field_g.field_i != var3) {
              L2: {
                if (param0 == 1) {
                  break L2;
                } else {
                  ma.a(false);
                  break L2;
                }
              }
              this.field_b = var3.field_a;
              stackIn_9_0 = (l) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ma.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (l) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
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
        l var2;
        var2 = this.field_g.field_i.field_a;
        if (var2 != this.field_g.field_i) {
          if (param0 != 48) {
            field_c = (kf) null;
            this.field_b = var2.field_a;
            return var2;
          } else {
            this.field_b = var2.field_a;
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final l a(int param0) {
        l var2 = null;
        if (param0 != -1) {
            l var3 = (l) null;
            this.b(83, (l) null);
            var2 = this.field_b;
            if (!(var2 != this.field_g.field_i)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_a;
            return var2;
        }
        var2 = this.field_b;
        if (!(var2 != this.field_g.field_i)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    final l a(int param0, l param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        l stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_g.field_i.field_f;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (this.field_g.field_i != var3) {
              L2: {
                this.field_b = var3.field_f;
                if (param0 < -64) {
                  break L2;
                } else {
                  field_a = (String) null;
                  break L2;
                }
              }
              stackIn_9_0 = (l) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ma.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (l) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        rg var14;
        StringWriter var15;
        String var20;
        BufferedReader var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        BufferedReader var6;
        String var7;
        String var28;
        BufferedReader var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var39;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          if (param1 instanceof rg) {
            var14 = (rg) ((Object) param1);
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
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        if (param0 == 40) {
          var20 = var15.toString();
          var2 = var20;
          var11 = var20;
          var21 = new BufferedReader((Reader) ((Object) new StringReader(var20)));
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
              var2 = var2 + ' ';
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
          field_d = (String) null;
          var28 = var15.toString();
          var2 = var28;
          var11 = var28;
          var29 = new BufferedReader((Reader) ((Object) new StringReader(var28)));
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
              var2 = var2 + ' ';
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
        l var2;
        if (param0 == 12677) {
          var2 = this.field_g.field_i.field_f;
          if (this.field_g.field_i == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_f;
            return var2;
          }
        } else {
          return (l) null;
        }
    }

    ma(p param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_h = null;
        if (param0 != 0) {
          ma.a(false);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final l b(int param0) {
        l var2;
        l var3;
        var2 = this.field_b;
        if (var2 != this.field_g.field_i) {
          if (param0 != 41) {
            var3 = (l) null;
            this.b(-37, (l) null);
            this.field_b = var2.field_f;
            return var2;
          } else {
            this.field_b = var2.field_f;
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    static {
        field_a = "Please check if address is correct";
        field_f = "Searching for an opponent";
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
