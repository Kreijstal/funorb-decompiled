/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends pg {
    static qb[] field_i;
    int field_g;
    static String field_n;
    static boolean field_p;
    static String field_l;
    static String field_j;
    static String field_r;
    static int field_o;
    byte[] field_k;
    static String field_s;
    static int field_h;
    long field_q;
    static kc field_m;

    final static String a(String param0, int param1, eg param2, String param3) {
        RuntimeException var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 68) {
            var5 = (String) null;
            qe.a((String) null, -87, (eg) null, (String) null);
          }
          if (!param2.c(-10923)) {
            stackIn_5_0 = (String) (param3);
            return stackIn_5_0;
          }
          stackIn_7_0 = param0 + " - " + param2.a((byte) 96) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("qe.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(dl param0, int param1, wk param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_36_0 = null;
          StringBuilder stackIn_36_1 = null;
          String stackIn_37_2 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
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
          oh var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            var18 = new oh();
            var18.field_s = param2.e((byte) 99);
            var18.field_m = param2.d(-10674);
            var18.field_p = new int[var18.field_s];
            var18.field_o = new int[var18.field_s];
            var18.field_l = new byte[var18.field_s][][];
            var18.field_n = new og[var18.field_s];
            var18.field_g = new og[var18.field_s];
            var18.field_j = new int[var18.field_s];
            for (var5 = param3; var5 < var18.field_s; var5++) {
              try {
                var6_int = param2.e((byte) -120);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param2.l(-1);
                    var8 = param2.l(~param3);
                    var9 = param2.e((byte) 53);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param2.l(hh.a(param3, -1));
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param2.d(-10674);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.a((byte) 92, 0, var21[var12_int], var13);
                      }
                    }
                    var18.field_o[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = jl.a(var10[var17], 33);
                      var17++;
                    }
                    var18.field_g[var5] = param0.a(-30176, var8, var12, jl.a(var20, -110));
                    var18.field_l[var5] = var21;
                  }
                } else {
                  var16 = param2.l(~param3);
                  var7 = var16;
                  var15 = param2.l(-1);
                  var8 = var15;
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param2.d(-10674);
                  }
                  var18.field_o[var5] = var6_int;
                  var18.field_p[var5] = var9;
                  var18.field_n[var5] = param0.a((byte) -95, var15, jl.a(var16, -100));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_j[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_j[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_j[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_j[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_j[var5] = -5;
              }
            }
            la.field_b.b(var18, -1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_36_0 = var4;
            stackIn_36_1 = new StringBuilder().append("qe.A(");
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
            throw aa.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        ab var3 = he.field_e;
        var3.b((byte) -49, param2);
        var3.f(3, (byte) -76);
        var3.f(10, (byte) -105);
        if (param1 != -35) {
          field_s = (String) null;
        }
        var3.c(param0, (byte) -85);
    }

    final static qb[] a(eg param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.c(param2, 109);
          var5 = param0.a(param1, (byte) 39, var4_int);
          if (param3 < 40) {
            field_p = true;
          }
          stackIn_3_0 = of.a(var4_int, (byte) -38, param0, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qe.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static java.awt.Container a(int param0) {
        if (gk.field_c != null) {
          return (java.awt.Container) ((Object) gk.field_c);
        }
        if (param0 != -4) {
          field_o = 94;
        }
        return (java.awt.Container) ((Object) cd.e(param0 ^ -115));
    }

    public static void c(int param0) {
        field_l = null;
        field_r = null;
        field_j = null;
        if (param0 >= -53) {
          String var2 = (String) null;
          qe.a((eg) null, (String) null, (String) null, 12);
        }
        field_s = null;
        field_n = null;
        field_m = null;
        field_i = null;
    }

    qe(long param0, int param1, byte[] param2) {
        try {
          this.field_k = param2;
          this.field_g = param1;
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qe.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "This members-only spell will be unavailable in multiplayer games";
        field_l = "Creating your account";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_p = true;
        field_s = "The game has started!<br>Click 'Start' to enter.";
        field_n = "Now that the basic spells have been mastered, it is time to learn how to walk around the map.";
    }
}
