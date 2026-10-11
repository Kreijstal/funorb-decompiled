/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae {
    static int[] field_c;
    static volatile boolean field_b;
    static int field_f;
    private int[] field_e;
    static uf field_g;
    static wi field_a;
    static String field_d;

    public static void a(byte param0) {
        field_a = null;
        if (param0 < -81) {
          field_g = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_g = (uf) null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Bounce.field_N;
        try {
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = lf.a(param1.charAt(var4), (byte) 85) + ((var3 << 5) - var3);
          }
          if (param0 == -51764539) {
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          stackIn_6_0 = 51;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ae.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private ae() throws Throwable {
        throw new Error();
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
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
        var11 = Bounce.field_N;
        try {
          if (0 == param5) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          param5 = param5 + param2;
          var7_int = param4;
          var8 = param1;
          L2: while (true) {
            var9 = param3[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$0 = this.field_e[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param0[incrementValue$1] = (byte)(~var10);
              if (param5 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_e[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param0[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param5 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 32) != 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_e[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param0[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$6 = this.field_e[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param0[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param5 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((8 & var9) != 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_e[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param0[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param2 >= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (4 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$10 = this.field_e[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param0[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 >= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$12 = this.field_e[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param0[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param5 <= param2) {
                return -param1 + var8 + 1;
              }
              var7_int = 0;
            }
            if ((var9 & 1) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$14 = this.field_e[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param2;
              param2++;
              param0[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param2 >= param5) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_65_0 = -param1 + var8 + 1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("ae.B(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int var12 = 0;
        ga var14 = null;
        String var2 = null;
        String var11 = null;
        int var13 = Bounce.field_N;
        String var2Lifetime1;
        String var11Lifetime1;
        String var11Lifetime2;
        String var2Lifetime1Lifetime1;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime1Lifetime3;
        String var11Lifetime1Lifetime4;
        if (param1 instanceof ga) {
          var14 = (ga) ((Object) param1);
          var2 = var14.field_a + " | ";
          param1 = var14.field_e;
        } else {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime2 = var2;
        }
        StringWriter var15 = new StringWriter();
        PrintWriter var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        if (param0 <= -68) {
          var4.close();
          var5 = var15.toString();
          var11Lifetime1 = var5;
          var2Lifetime1 = var11Lifetime1;
          var11Lifetime1Lifetime1 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var7 = var6.readLine();
          var11Lifetime1Lifetime2 = var7;
          var2Lifetime1Lifetime1 = var11Lifetime1Lifetime2;
          var11Lifetime1Lifetime3 = var7;
          while (true) {
            var8 = var6.readLine();
            var11Lifetime1Lifetime4 = var8;
            var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            var11Lifetime1Lifetime4 = var8;
            if (var8 == null) {
              break;
            }
            var9 = var8.indexOf('(');
            var10 = var8.indexOf(')', var9 + 1);
            if (var9 != -1) {
              var11Lifetime1Lifetime4 = var8.substring(0, var9);
            } else {
              var11Lifetime1Lifetime4 = var8;
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            }
            var16 = var11Lifetime1Lifetime4.trim();
            var2Lifetime1Lifetime1 = var16;
            var2Lifetime1Lifetime1 = var16;
            var17 = var16.substring(1 + var16.lastIndexOf(' '));
            var2Lifetime1Lifetime1 = var17;
            var2Lifetime1Lifetime1 = var17;
            var18 = var17.substring(var17.lastIndexOf('\t') + 1);
            var2Lifetime1Lifetime1 = var18;
            var2Lifetime1Lifetime1 = var18;
            var19 = var2Lifetime1Lifetime1 + var18;
            var2Lifetime1Lifetime1 = var19;
            var2Lifetime1Lifetime1 = var19;
            var2Lifetime1Lifetime1 = var19;
            if (-1 != var9 &&
              var10 != -1) {
              var12 = var8.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime1Lifetime1 = var19 + var8.substring(5 + var12, var10);
              }
            }
            var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + ' ';
          }
          var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + "| " + var7;
          return var2Lifetime1Lifetime1;
        }
        return (String) null;
    }

    static {
        field_f = 0;
        field_b = true;
        field_g = new uf();
        field_d = "Password: ";
    }
}
