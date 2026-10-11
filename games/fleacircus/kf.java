/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends lh {
    static int field_k;
    static String field_l;
    static dd field_i;
    static String field_j;

    private kf() throws Throwable {
        throw new Error();
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param0) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        if (param1 >= -110) {
          field_l = (String) null;
        }
        return s.field_c[var4];
    }

    final static void a(ni param0, int param1, int param2, ce param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          RuntimeException stackIn_37_0 = null;
          StringBuilder stackIn_37_1 = null;
          String stackIn_38_2 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
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
          fg var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = fleas.field_A ? 1 : 0;
          try {
            var18 = new fg();
            var18.field_k = param0.e(false);
            var18.field_v = param0.c((byte) 126);
            var18.field_w = new byte[var18.field_k][][];
            var18.field_p = new int[var18.field_k];
            var18.field_o = new int[var18.field_k];
            var18.field_n = new od[var18.field_k];
            var18.field_r = new int[var18.field_k];
            var18.field_s = new od[var18.field_k];
            if (param1 != -3) {
              kf.a(-63);
            }
            for (var5 = 0; var18.field_k > var5; var5++) {
              try {
                var6_int = param0.e(false);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    4 == var6_int) {
                    var20 = param0.h(0);
                    var8 = param0.h(0);
                    var9 = param0.e(false);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param0.h(df.a(param1, -3));
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param0.c((byte) -92);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.b(var21[var12_int], 0, param1 - 103, var13);
                      }
                    }
                    var18.field_o[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = nc.a((byte) -121, var10[var17]);
                      var17++;
                    }
                    var18.field_s[var5] = param3.a(var12, var8, nc.a((byte) -90, var20), 0);
                    var18.field_w[var5] = var21;
                  }
                } else {
                  var16 = param0.h(param1 + 3);
                  dupTemp$1 = param0.h(0);
                  var15 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.c((byte) -120);
                  }
                  var18.field_o[var5] = var6_int;
                  var18.field_p[var5] = var9;
                  var18.field_n[var5] = param3.a((byte) 109, var15, nc.a((byte) -110, var16));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_r[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_r[var5] = -5;
              }
            }
            jk.field_m.a(false, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = var4;
            stackIn_37_1 = new StringBuilder().append("kf.B(");
            if (param0 == null) {
              stackIn_38_2 = "null";
            } else {
              stackIn_38_2 = "{...}";
            }
            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 > -88) {
          field_i = (dd) null;
        }
        field_i = null;
        field_j = null;
        field_l = null;
    }

    static {
        field_k = 64;
        field_l = "Restart Level";
        field_j = "<%0>Exit:<%1> this is where you've got to get the fleas to";
    }
}
