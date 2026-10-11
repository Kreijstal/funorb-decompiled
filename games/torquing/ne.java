/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ne {
    private int[] field_c;
    static int[] field_d;
    static Calendar field_b;
    static int[] field_a;

    final int a(byte[] param0, boolean param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_6_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
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
        var11 = Torquing.field_u;
        try {
          if (!param1) {
            this.field_c = (int[]) null;
          }
          if (0 == param5) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          param5 = param5 + param4;
          var7_int = 0;
          var8 = param2;
          L3: while (true) {
            var9 = param3[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param4;
              param4++;
              param0[incrementValue$1] = (byte)(~var10);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 64) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param4;
              param4++;
              param0[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param5 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (32 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param4;
              param4++;
              param0[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param5 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 16)) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$6 = this.field_c[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param4;
              param4++;
              param0[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 8) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param4;
              param4++;
              param0[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 4) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param4;
              param4++;
              param0[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param5 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param4;
              param4++;
              param0[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param4 >= param5) {
                return 1 + (var8 - param2);
              }
              var7_int = 0;
            }
            if ((var9 & 1) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param4;
              param4++;
              param0[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_72_0 = 1 + (var8 - param2);
          return stackIn_72_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_75_0 = var7;
          stackIn_75_1 = new StringBuilder().append("ne.A(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (param1 != 0) {
            field_d = (int[]) null;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != mm.a(var3, (byte) 116)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ne.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 4512) {
          field_b = (Calendar) null;
        }
        field_b = null;
        field_a = null;
        field_d = null;
    }

    private ne() throws Throwable {
        throw new Error();
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_d = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_d[var1] = var0;
        }
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = new int[12];
    }
}
