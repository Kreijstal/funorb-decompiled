/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static oj field_g;
    static int field_d;
    private int[] field_c;
    static pb field_a;
    static String field_h;
    static String field_b;
    static int field_e;
    static String field_i;
    static String field_f;

    final static String a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_7_0 = null;
          String stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = stellarshard.field_B;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (sh.a("getcookies", param1, (byte) 78));
              var5 = qj.a(';', var4, 10287);
              for (var6 = param0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_7_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == l.field_g) {
              return param1.getParameter("settings");
            }
            stackIn_14_0 = l.field_g;
            return stackIn_14_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref;
            stackIn_17_1 = new StringBuilder().append("dd.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static bm a(int param0, byte param1, pf param2, pf param3, int param4) {
        RuntimeException var5 = null;
        bm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 108) {
            dd.b(-57);
          }
          if (!tl.a(param2, (byte) -5, param0, param4)) {
            return null;
          }
          stackIn_6_0 = sa.a(2376, param3.a(param4, 16, param0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dd.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != -26269) {
          pf var2 = (pf) null;
          dd.a(48, (byte) -60, (pf) null, (pf) null, 98);
        }
        field_h = null;
        field_i = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        java.applet.Applet var10;
        var9 = stellarshard.field_B;
        if (param6 < param7) {
          if (param7 >= param5) {
            if (param6 < param5) {
              mg.a(param7, param3, param2, param4, param6, ti.field_a, -445834032, param1, param5);
            } else {
              mg.a(param7, param3, param2, param1, param5, ti.field_a, -445834032, param4, param6);
            }
          } else {
            mg.a(param5, param1, param2, param4, param6, ti.field_a, -445834032, param3, param7);
          }
        } else {
          if (param5 <= param6) {
            if (param5 <= param7) {
              mg.a(param6, param4, param2, param1, param5, ti.field_a, param0 - 445802484, param3, param7);
            } else {
              mg.a(param6, param4, param2, param3, param7, ti.field_a, -445834032, param1, param5);
            }
          } else {
            mg.a(param5, param1, param2, param3, param7, ti.field_a, -445834032, param4, param6);
          }
        }
        if (param0 != -31548) {
          var10 = (java.applet.Applet) null;
          dd.a(-27, (java.applet.Applet) null);
        }
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 > -48) {
          return;
        }
        if (pk.field_e != null) {
          var1 = pk.field_e;
          synchronized (var1) {
            pk.field_e = null;
          }
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, boolean param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = stellarshard.field_B;
        try {
          if (param4 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var7_int = 0;
          param4 = param4 + param2;
          var8 = param1;
          L2: while (true) {
            var9 = param0[var8];
            if (0 <= var9) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param3[incrementValue$1] = (byte)(~var10);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param3[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 32) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param3[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((16 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_c[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param3[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (8 & var9)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param3[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (0 > dupTemp$10) {
              incrementValue$11 = param2;
              param2++;
              param3[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 2) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param3[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param2;
              param2++;
              param3[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          if (!param5) {
            dd.b(-68);
          }
          stackIn_66_0 = -param1 + 1 + var8;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("dd.C(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private dd() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new oj();
        field_h = "Email: ";
        field_b = "Orb coins: <%0>";
        field_f = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_i = "Free game ending in ";
    }
}
