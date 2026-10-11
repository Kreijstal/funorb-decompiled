/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static le field_b;
    static String field_a;
    static kc[] field_c;

    final static void a(pb param0, byte param1, int param2, le param3) {
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
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          fd var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = Main.field_T;
          try {
            if (param1 >= -101) {
              return;
            }
            var18 = new fd();
            var18.field_o = param0.f(38);
            var18.field_j = param0.e((byte) 126);
            var18.field_l = new byte[var18.field_o][][];
            var18.field_k = new int[var18.field_o];
            var18.field_p = new vi[var18.field_o];
            var18.field_i = new int[var18.field_o];
            var18.field_m = new int[var18.field_o];
            var18.field_r = new vi[var18.field_o];
            for (var5 = 0; var18.field_o > var5; var5++) {
              try {
                var6_int = param0.f(-95);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param0.c(false);
                    var21 = param0.c(false);
                    var9 = param0.f(-101);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param0.c(false);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param0.e((byte) 124);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.a(93, var22[var12_int], 0, var13);
                      }
                    }
                    var18.field_k[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var17 < var9) {
                      var12[var17] = t.a(var10[var17], -56);
                      var17++;
                    }
                    var18.field_r[var5] = param3.a((byte) 99, t.a(var20, -122), var21, var12);
                    var18.field_l[var5] = var22;
                  }
                } else {
                  var15 = param0.c(false);
                  var7 = var15;
                  var16 = param0.c(false);
                  var8 = var16;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.e((byte) 125);
                  }
                  var18.field_k[var5] = var6_int;
                  var18.field_m[var5] = var9;
                  var18.field_p[var5] = param3.a(t.a(var15, -107), var16, 115);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_i[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_i[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_i[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_i[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_i[var5] = -5;
              }
            }
            vb.field_e.a(var18, 27362);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("td.C(");
            if (param0 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = 96 % ((-46 - param0) / 61);
        field_a = null;
        field_c = null;
    }

    final static String a(int param0) {
        if (jc.field_P == hh.field_g) {
          return ri.field_b;
        }
        if (param0 != -2) {
          return (String) null;
        }
        return ja.field_a;
    }

    final static void a(byte param0) {
        if (param0 != -11) {
          td.a(64);
        }
        gh.a(4, 31888);
    }

    static {
        field_a = "Sound: ";
        field_c = new kc[6];
    }
}
