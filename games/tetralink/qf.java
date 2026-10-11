/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static String field_a;
    static String field_c;
    static df field_h;
    static String[] field_f;
    static String field_e;
    static String field_j;
    static int field_i;
    static String[] field_b;
    static boolean field_g;
    static se field_k;
    static String field_d;

    final static String a(byte param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ie var5 = null;
        bc var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) param1);
          if (!gi.a(false, var7)) {
            stackIn_2_0 = uk.field_u;
            return stackIn_2_0;
          }
          if (ji.field_Tb != 2) {
            stackIn_5_0 = el.field_qc;
            return stackIn_5_0;
          }
          if (ej.a(param1, 4)) {
            stackIn_9_0 = hl.field_A;
            return stackIn_9_0;
          }
          if (param0 != 122) {
            var5 = (ie) null;
            qf.a(-37, -32, (bh) null, (ie) null);
          }
          if (oj.a(1, param1)) {
            stackIn_15_0 = sk.a(new String[]{param1}, tc.field_n, 123);
            return stackIn_15_0;
          }
          if (qi.field_q >= 100 &&
            0 >= mb.field_C) {
            stackIn_19_0 = ha.field_g;
            return stackIn_19_0;
          }
          if (qi.field_q >= 200) {
            stackIn_22_0 = ha.field_g;
            return stackIn_22_0;
          }
          if (sb.a((byte) 2, param1)) {
            stackIn_25_0 = sk.a(new String[]{param1}, rh.field_J, 126);
            return stackIn_25_0;
          }
          var6 = nd.field_Lb;
          var6.f(param2, (byte) -92);
          var6.field_t = var6.field_t + 1;
          var4 = var6.field_t;
          var6.a(0, false);
          var6.a(param1, 0);
          var6.b(var6.field_t - var4, param0 ^ -124);
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("qf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        ra.a();
        if (param0 != 1) {
          field_k = (se) null;
        }
    }

    final static void a(int param0, int param1, bh param2, ie param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
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
          nm var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = TetraLink.field_J;
          try {
            var18 = new nm();
            var18.field_r = param2.d((byte) -99);
            var18.field_s = param2.f(-118);
            var18.field_u = new vl[var18.field_r];
            var18.field_x = new vl[var18.field_r];
            if (param1 != 4) {
              qf.a(85, false);
            }
            var18.field_w = new int[var18.field_r];
            var18.field_q = new int[var18.field_r];
            var18.field_z = new int[var18.field_r];
            var18.field_t = new byte[var18.field_r][][];
            for (var5 = 0; var18.field_r > var5; var5++) {
              try {
                var6_int = param2.d((byte) -99);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param2.g((byte) 81);
                    var21 = param2.g((byte) 81);
                    var9 = param2.d((byte) -99);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param2.g((byte) 81);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param2.f(param1 - 113);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.b(var13, 0, var22[var12_int], param1 ^ -29);
                      }
                    }
                    var18.field_z[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = hh.a(var10[var17], 111);
                      var17++;
                    }
                    var18.field_u[var5] = param3.a(8, hh.a(var20, 42), var12, var21);
                    var18.field_t[var5] = var22;
                  }
                } else {
                  var16 = param2.g((byte) 81);
                  var7 = var16;
                  var15 = param2.g((byte) 81);
                  var8 = var15;
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param2.f(-123);
                  }
                  var18.field_z[var5] = var6_int;
                  var18.field_q[var5] = var9;
                  var18.field_x[var5] = param3.a(var15, 26298, hh.a(var16, -72));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_w[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_w[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_w[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_w[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_w[var5] = -5;
              }
            }
            bo.field_C.a(var18, false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = var4;
            stackIn_37_1 = new StringBuilder().append("qf.D(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_38_2 = "null";
            } else {
              stackIn_38_2 = "{...}";
            }
            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
            if (param3 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0) {
          return;
        }
        field_e = null;
        field_j = null;
        field_k = null;
        field_f = null;
        field_b = null;
    }

    static {
        field_c = "Don't mind";
        field_e = "Buying or selling an account";
        field_a = "Tips";
        field_f = new String[]{"2D - Fastest", "2D - Best", "3D - Fastest", "3D - Balanced", "3D - Best"};
        field_b = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_i = 20;
        field_h = new df(2);
        field_d = "Switch to 3D mode";
    }
}
