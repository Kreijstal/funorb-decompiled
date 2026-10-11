/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends q {
    static sm field_l;
    static String field_q;
    static String field_p;
    boolean field_n;
    int field_m;
    static int field_k;
    static String[] field_j;
    static String field_o;
    int[] field_r;

    final static void a(vh param0, int param1, fj param2, byte param3) {
        try {
          int var5 = 0;
          int var12_int = 0;
          int var13_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_36_0 = null;
          StringBuilder stackIn_36_1 = null;
          String stackIn_37_2 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6 = 0;
          int var7_int = 0;
          ClassNotFoundException var7 = null;
          SecurityException var7_ref = null;
          NullPointerException var7_ref2 = null;
          Exception var7_ref3 = null;
          Throwable var7_ref4 = null;
          String var8 = null;
          String var9 = null;
          int var10 = 0;
          String[] var11 = null;
          byte[][] var12 = null;
          Class[] var13 = null;
          int var14 = 0;
          int var15 = 0;
          String var16 = null;
          String var17 = null;
          int var18 = 0;
          pm var19 = null;
          byte[][] var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var14Lifetime1;
          var15 = Torquing.field_u;
          try {
            var19 = new pm();
            var19.field_l = param2.i((byte) -101);
            var19.field_j = param2.c((byte) -121);
            var19.field_t = new int[var19.field_l];
            var19.field_n = new rc[var19.field_l];
            var19.field_k = new int[var19.field_l];
            var19.field_u = new rc[var19.field_l];
            var19.field_q = new int[var19.field_l];
            var19.field_o = new byte[var19.field_l][][];
            var6 = 31 / ((param3 + 71) / 33);
            for (var5 = 0; var5 < var19.field_l; var5++) {
              try {
                var7_int = param2.i((byte) -101);
                if (0 != var7_int &&
                  1 != var7_int &&
                  var7_int != 2) {
                  if (3 == var7_int ||
                    var7_int == 4) {
                    var21 = param2.h((byte) 116);
                    var9 = param2.h((byte) 115);
                    var10 = param2.i((byte) -101);
                    var11 = new String[var10];
                    for (var12_int = 0; var10 > var12_int; var12_int++) {
                      var11[var12_int] = param2.h((byte) 123);
                    }
                    var22 = new byte[var10][];
                    var20 = var22;
                    var12 = var20;
                    if (3 == var7_int) {
                      for (var13_int = 0; var10 > var13_int; var13_int++) {
                        var14 = param2.c((byte) -81);
                        array$0 = new byte[var14];
                        var12[var13_int] = array$0;
                        param2.a(48, var14, var22[var13_int], 0);
                      }
                    }
                    var19.field_q[var5] = var7_int;
                    var13 = new Class[var10];
                    var18 = 0;
                    var14Lifetime1 = var18;
                    while (var18 < var10) {
                      var13[var18] = ei.a((byte) -112, var11[var18]);
                      var18++;
                    }
                    var19.field_n[var5] = param0.a(var13, -30475, var9, ei.a((byte) -117, var21));
                    var19.field_o[var5] = var22;
                  }
                } else {
                  var16 = param2.h((byte) 119);
                  var8 = var16;
                  var17 = param2.h((byte) 127);
                  var9 = var17;
                  var10 = 0;
                  if (var7_int == 1) {
                    var10 = param2.c((byte) -73);
                  }
                  var19.field_q[var5] = var7_int;
                  var19.field_k[var5] = var10;
                  var19.field_u[var5] = param0.a(ei.a((byte) -116, var16), true, var17);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var19.field_t[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var7_ref = (SecurityException) (Object) decompiledCaughtException;
                var19.field_t[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var19.field_t[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var7_ref3 = (Exception) (Object) decompiledCaughtException;
                var19.field_t[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var7_ref4 = decompiledCaughtException;
                var19.field_t[var5] = -5;
              }
            }
            ul.field_e.a((byte) 54, var19);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_36_0 = var4;
            stackIn_36_1 = new StringBuilder().append("nh.C(");
            if (param0 == null) {
              stackIn_37_2 = "null";
            } else {
              stackIn_37_2 = "{...}";
            }
            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        field_p = null;
        field_j = null;
        if (param0) {
          fj var2 = (fj) null;
          nh.a((vh) null, -6, (fj) null, (byte) -36);
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -90) {
          field_l = (sm) null;
        }
        stackIn_6_0 = (null != ki.field_D) && (ki.field_D.c((byte) -19));
        return stackIn_6_0;
    }

    nh() {
        this.field_n = false;
    }

    static {
        field_p = "Mouse over an icon for details";
        field_q = "Passwords can only contain letters and numbers";
        field_j = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_k = 0;
        field_o = "This password is part of your Player Name, and would be easy to guess";
    }
}
