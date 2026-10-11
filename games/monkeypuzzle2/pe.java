/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static le[] field_a;
    private int[] field_b;
    static wg[] field_d;
    static String field_c;

    public static void b(int param0) {
        if (param0 == 16711680) {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        pe.a((String) null, (byte) -124, (java.applet.Applet) null);
        field_a = null;
        field_c = null;
        field_d = null;
    }

    private pe() throws Throwable {
        throw new Error();
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            e.field_c = param0;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              if (param1 != -108) {
                return;
              }
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (0 != param0.length()) {
                var5Lifetime6 = var7 + "; Expires=" + ha.a((byte) -127, pf.a(0) + 94608000000L) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              mf.a(true, param2, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            tf.a((byte) -53, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("pe.C(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1 = 69 / ((param0 + 50) / 44);
        if (ok.field_e) {
          pl.field_e.c("Clearances With Monkeys: " + dc.field_e, 635, 30, 16711680, 1);
          pl.field_e.c("Clearances WithOut Monkeys: " + ek.field_b, 635, 50, 16711680, 1);
          pl.field_e.c("Nuts Fired: " + sc.field_c, 635, 70, 16711680, 1);
          pl.field_e.c("Size of last detatched clump " + ke.field_c, 635, 90, 16711680, 1);
          pl.field_e.c("FPS: " + s.field_T, 635, 110, 16711680, 1);
          pl.field_e.c("LPS: " + jf.field_g, 635, 130, 16711680, 1);
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
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
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var7_int = 0;
          param3 = param3 + param1;
          if (param0 != -1) {
            field_a = (le[]) null;
          }
          var8 = param2;
          L3: while (true) {
            var9 = param5[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$0 = this.field_b[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param1;
              param1++;
              param4[incrementValue$1] = (byte)(~var10);
              if (param3 <= param1) {
                break L3;
              }
              var7_int = 0;
            }
            if ((64 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_b[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param1;
              param1++;
              param4[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((32 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_b[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param1;
              param1++;
              param4[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param3 <= param1) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 16) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$6 = this.field_b[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param1;
              param1++;
              param4[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param3 <= param1) {
                break L3;
              }
              var7_int = 0;
            }
            if ((8 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$8 = this.field_b[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param1;
              param1++;
              param4[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param1 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 4) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$10 = this.field_b[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param1;
              param1++;
              param4[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param3 <= param1) {
                break L3;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$12 = this.field_b[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param1;
              param1++;
              param4[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param1 >= param3) {
                return -param2 + var8 + 1;
              }
              var7_int = 0;
            }
            if ((var9 & 1) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$14 = this.field_b[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param1;
              param1++;
              param4[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param1 >= param3) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = -param2 + var8 + 1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("pe.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param5 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    static {
        field_d = new wg[17];
        field_c = "Tips: <%0>";
    }
}
