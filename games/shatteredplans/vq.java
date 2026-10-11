/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static int field_a;

    final static void a(ob param0, qb param1, int param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
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
          eq var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var18 = new eq();
            var18.field_l = param0.j(param3 ^ 120);
            var18.field_j = param0.a(16711680);
            var18.field_h = new byte[var18.field_l][][];
            var18.field_n = new pb[var18.field_l];
            var18.field_q = new pb[var18.field_l];
            var18.field_p = new int[var18.field_l];
            var18.field_m = new int[var18.field_l];
            var18.field_r = new int[var18.field_l];
            for (var5 = 0; var5 < var18.field_l; var5++) {
              try {
                var6_int = param0.j(param3 - 119);
                if (var6_int != 0 &&
                  1 != var6_int &&
                  var6_int != 2) {
                  if (3 == var6_int ||
                    var6_int == 4) {
                    var20 = param0.e(-1);
                    var8 = param0.e(param3 ^ 2);
                    var9 = param0.j(-91);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param0.e(-1);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param0.a(16711680);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.a(var13, 0, 17469032, var21[var12_int]);
                      }
                    }
                    var18.field_m[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var17 < var9) {
                      var12[var17] = ge.a(-134, var10[var17]);
                      var17++;
                    }
                    var18.field_n[var5] = param1.a(var12, var8, param3 + 83, ge.a(-134, var20));
                    var18.field_h[var5] = var21;
                  }
                } else {
                  var15 = param0.e(-1);
                  dupTemp$1 = param0.e(-1);
                  var16 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.a(param3 + 16711683);
                  }
                  var18.field_m[var5] = var6_int;
                  var18.field_r[var5] = var9;
                  var18.field_q[var5] = param1.a(ge.a(-134, var15), (byte) 77, var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_p[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_p[var5] = -5;
              }
            }
            if (param3 != -3) {
              return;
            }
            kc.field_b.a((byte) -113, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_39_0 = var4;
            stackIn_39_1 = new StringBuilder().append("vq.A(");
            if (param0 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
            if (param1 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        sl var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          if (!gb.a((byte) -109, var6)) {
            stackIn_3_0 = tm.field_j;
            return stackIn_3_0;
          }
          if (jp.a(param1, (byte) -105)) {
            stackIn_7_0 = wb.field_f;
            return stackIn_7_0;
          }
          if (po.field_b != 2) {
            stackIn_10_0 = tp.field_d;
            return stackIn_10_0;
          }
          if (ti.a(param1, true)) {
            stackIn_13_0 = re.a(or.field_c, 4371, new String[]{param1});
            return stackIn_13_0;
          }
          if (100 <= oi.field_e) {
            stackIn_17_0 = mi.field_a;
            return stackIn_17_0;
          }
          if (da.a(param0 - 30108, param1)) {
            stackIn_21_0 = re.a(qq.field_N, 4371, new String[]{param1});
            return stackIn_21_0;
          }
          var5 = js.field_f;
          var5.h(param2, param0 ^ 253);
          var5.field_j = var5.field_j + 1;
          var4 = var5.field_j;
          var5.c(param0, (byte) -97);
          var5.a(param1, (byte) 0);
          var5.b(var5.field_j - var4, (byte) 119);
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("vq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
