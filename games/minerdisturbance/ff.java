/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static bg field_a;
    static ea[] field_c;
    static ea field_f;
    static int field_b;
    static String field_d;
    static String field_e;

    final static void a(boolean param0) {
        ml stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_3;
        if (oj.field_J > 11) {
          if (oj.field_J < 9) {
            nb.field_i[mc.field_w].b(tl.field_q, -22674, 0);
            nj.a(!param0);
          } else {
            if (pd.field_b.field_K &&
              q.field_c <= 11) {
              nj.a(true);
            }
          }
        } else {
          if (pd.field_b.field_K &&
            q.field_c <= 11) {
            nj.a(true);
          }
        }
        if (oj.field_J >= 0) {
          stackIn_18_0 = nb.field_i[oj.field_J];
          stackIn_18_1 = tl.field_q;
          stackIn_18_2 = -22674;
          if (11 < mc.field_w &&
            !tk.field_a) {
            stackIn_19_3 = 0;
          } else {
            stackIn_19_3 = ui.field_L;
          }
          ((ml) (Object) stackIn_18_0).b(stackIn_18_1, stackIn_18_2, stackIn_19_3);
        }
        if (param0) {
          ff.a(true);
        }
    }

    final static void a(vf param0, sb param1, int param2, boolean param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          sb stackIn_13_0 = null;
          boolean stackIn_14_1 = false;
          RuntimeException stackIn_42_0 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          StringBuilder stackIn_45_1 = null;
          String stackIn_46_2 = null;
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
          gl var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = MinerDisturbance.field_ab;
          try {
            var18 = new gl();
            var18.field_y = param1.d((byte) -54);
            var18.field_n = param1.b((byte) 27);
            var18.field_r = new ia[var18.field_y];
            var18.field_s = new int[var18.field_y];
            var18.field_p = new int[var18.field_y];
            var18.field_q = new ia[var18.field_y];
            var18.field_w = new int[var18.field_y];
            var18.field_v = new byte[var18.field_y][][];
            for (var5 = 0; var5 < var18.field_y; var5++) {
              try {
                var6_int = param1.d((byte) -54);
                if (0 != var6_int &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    stackIn_13_0 = (sb) (param1);
                    stackIn_14_1 = !(param3);
                    var20 = ((sb) (Object) stackIn_13_0).a(stackIn_14_1);
                    var8 = param1.a(false);
                    var9 = param1.d((byte) -54);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param1.a(false);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param1.b((byte) 15);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.a(var21[var12_int], (byte) -120, 0, var13);
                      }
                    }
                    var18.field_s[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var17 < var9) {
                      var12[var17] = di.a((byte) 111, var10[var17]);
                      var17++;
                    }
                    var18.field_q[var5] = param0.a(var8, di.a((byte) 122, var20), 75, var12);
                    var18.field_v[var5] = var21;
                  }
                } else {
                  var15 = param1.a(false);
                  dupTemp$1 = param1.a(false);
                  var16 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param1.b((byte) 90);
                  }
                  var18.field_s[var5] = var6_int;
                  var18.field_p[var5] = var9;
                  var18.field_r[var5] = param0.a(di.a((byte) 120, var15), var16, 21268);
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
            if (!param3) {
              field_f = (ea) null;
            }
            on.field_t.a((byte) 69, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_42_0 = var4;
            stackIn_42_1 = new StringBuilder().append("ff.A(");
            if (param0 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
            if (param1 == null) {
              stackIn_46_2 = "null";
            } else {
              stackIn_46_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != -12) {
          return;
        }
        field_e = null;
        field_d = null;
    }

    static {
        field_a = new bg(2, 4, 4, 0);
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_b = 0;
        field_d = "Service unavailable";
    }
}
