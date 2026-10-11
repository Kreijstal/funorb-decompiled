/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gp extends li {
    gp field_p;
    long field_n;
    gp field_o;
    static r field_s;
    static String field_r;
    static String field_q;

    public static void g(int param0) {
        field_s = null;
        int var1 = 11 % ((param0 + 49) / 44);
        field_r = null;
        field_q = null;
    }

    final long f(int param0) {
        int var2 = 51 / ((56 - param0) / 35);
        return this.field_n;
    }

    final void a(int param0) {
        if (param0 >= -96) {
          return;
        }
        if (this.field_o == null) {
          return;
        }
        this.field_o.field_p = this.field_p;
        this.field_p.field_o = this.field_o;
        this.field_o = null;
        this.field_p = null;
    }

    final void a(int param0, long param1) {
        if (null != this.field_o) {
          throw new RuntimeException();
        }
        this.field_n = param1;
        if (param0 != -1) {
          field_s = (r) null;
        }
    }

    protected gp() {
    }

    final boolean e(int param0) {
        if (null == this.field_o) {
          return false;
        }
        if (param0 >= -12) {
          return true;
        }
        return true;
    }

    final static void a(jj param0, int param1, ed param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          oc var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = Vertigo2.field_L ? 1 : 0;
          try {
            var18 = new oc();
            var18.field_n = param2.h(-11);
            var18.field_p = param2.b(true);
            if (param1 >= -71) {
              return;
            }
            var18.field_q = new byte[var18.field_n][][];
            var18.field_t = new wk[var18.field_n];
            var18.field_o = new int[var18.field_n];
            var18.field_w = new wk[var18.field_n];
            var18.field_y = new int[var18.field_n];
            var18.field_u = new int[var18.field_n];
            for (var5 = 0; var5 < var18.field_n; var5++) {
              try {
                var6_int = param2.h(-11);
                if (var6_int != 0 &&
                  1 != var6_int &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param2.f(128);
                    var21 = param2.f(128);
                    var9 = param2.h(-11);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param2.f(128);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (3 == var6_int) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param2.b(true);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.a(0, var22[var12_int], var13, 105);
                      }
                    }
                    var18.field_o[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = eh.a(-1147375319, var10[var17]);
                      var17++;
                    }
                    var18.field_w[var5] = param0.a(var12, 38, eh.a(-1147375319, var20), var21);
                    var18.field_q[var5] = var22;
                  }
                } else {
                  var15 = param2.f(128);
                  var16 = param2.f(128);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param2.b(true);
                  }
                  var18.field_o[var5] = var6_int;
                  var18.field_u[var5] = var9;
                  var18.field_t[var5] = param0.a(-67, eh.a(-1147375319, var15), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_y[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_y[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_y[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_y[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_y[var5] = -5;
              }
            }
            mg.field_N.a(var18, false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("gp.GA(");
            if (param0 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_r = "Enter name of player to add to list";
        field_q = "<%0>% of the map was <%1>";
    }
}
