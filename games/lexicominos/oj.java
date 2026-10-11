/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj {
    static String field_d;
    private eb field_a;
    static int[] field_l;
    boolean field_e;
    db field_h;
    static boolean field_g;
    int field_i;
    int field_b;
    cd field_f;
    static String[] field_c;
    String field_k;
    static int[] field_j;

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          var6 = qg.field_b;
          var1 = var6;
          var2 = 0;
          var4 = -47 / ((param0 - 44) / 52);
          var3 = var6.length;
          while (var3 > var2) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "oj.C(" + param0 + ')');
        }
    }

    final static sh a(boolean param0, int param1) {
        if (param0) {
          oj.a(false, 68);
        }
        return il.a(true, 12317, false, param1, false, 1);
    }

    final void a(fc param0, int param1, char[] param2) {
        try {
          this.field_a.a(param2, param0.field_I, true, 256);
          if (param1 != 0) {
            field_j = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "oj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int[] param0, boolean param1, char[] param2) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var19 = null;
        int var11Lifetime1;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          var4_int = param2.length;
          for (var5_int = 0; var5_int < var4_int; var5_int++) {
            param0[var5_int] = this.field_a.a(param2, (byte) 106, var5_int);
          }
          if (param1) {
            return;
          }
          var16 = new int[var4_int];
          var14 = var16;
          var5 = var14;
          for (var6 = 0; var4_int > var6; var6++) {
            var5[var6] = (-param0[var6] << 16) + var6;
          }
          dd.a(var16, -23588);
          var19 = var5;
          for (var7 = 0; var7 < var19.length; var7++) {
            var8 = var19[var7];
            var9 = (short)var8;
            if (param0[var9] > 0) {
              var10 = -(var8 >> 16);
              for (var11 = 1 + var9; var10 + var9 > var11; var11++) {
                param0[var11] = 0;
              }
              var13 = 0;
              var11Lifetime1 = var13;
              while (var9 > var13) {
                if (var9 < param0[var13] + var13) {
                  param0[var13] = 0;
                }
                var13++;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("oj.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -26) {
          oj.a(false, -114);
        }
        field_d = null;
        field_l = null;
        field_j = null;
    }

    final ng a(char[][] param0, int param1) {
        int var5_int = 0;
        ng stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        char[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        int[] var10 = null;
        ng var11 = null;
        int var12 = 0;
        int[] var13 = null;
        char[] var15 = null;
        int[] var16 = null;
        char[] var18 = null;
        int[] var20 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var11 = new ng();
          var3 = var11;
          var16 = new int[param0[0].length];
          var13 = var16;
          var10 = var13;
          var4 = var10;
          for (var5_int = 0; param0.length > var5_int; var5_int++) {
            this.a(var16, false, param0[var5_int]);
            for (var6 = 0; var16.length > var6; var6++) {
              if (var16[var6] != 0) {
                var11.b(121, pc.a(var5_int, var16[var6], (byte) 14, var6, 1));
              }
            }
          }
          var20 = new int[param0.length];
          var18 = new char[param0.length];
          var15 = var18;
          var5 = var15;
          for (var6Lifetime1 = 0; param0[0].length > var6Lifetime1; var6Lifetime1++) {
            for (var7 = 0; param0.length > var7; var7++) {
              var5[var7] = param0[param0.length - 1 - var7][var6Lifetime1];
            }
            this.a(var20, false, var18);
            var12 = 0;
            var7Lifetime1 = var12;
            while (var12 < var18.length) {
              if (0 != var20[var12]) {
                var3.b(param1 - 17053, pc.a(-var12 + param0.length - 1, 1, (byte) 14, var6Lifetime1, var20[var12]));
              }
              var12++;
            }
          }
          if (param1 != 17161) {
            var9 = (char[]) null;
            this.a((int[]) null, true, (char[]) null);
          }
          stackIn_24_0 = var3;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("oj.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    oj(sh param0, sh param1, eb param2) {
        int stackIn_11_0 = 0;
        boolean stackIn_18_1 = false;
        cd stackIn_21_1 = null;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        NumberFormatException var9 = null;
        String var10 = null;
        String var12 = null;
        CharSequence var13 = null;
        try {
          this.field_a = param2;
          this.field_i = param2.field_g;
          var4_int = 0;
          var5 = null;
          var6 = null;
          var7 = null;
          for (var8 = 0; var8 < param2.field_c.length; var8++) {
            var12 = param2.field_c[var8][0];
            var10 = param2.field_c[var8][1];
            if ("lang".equals(var12)) {
              var5 = var10;
            } else {
              if ("font".equals(var12)) {
                var6 = var10;
              } else {
                if (!"fhei".equals(var12)) {
                  if ("disabled".equals(var12)) {
                    stackIn_11_0 = (!var10.equals("true")) ? 0 : 1;
                    var4_int = stackIn_11_0;
                  }
                } else {
                  var7 = var10;
                }
              }
            }
          }
          stackIn_18_1 = (var4_int != 0);
          this.field_e = stackIn_18_1;
          this.field_k = (String) (var5);
          var13 = (CharSequence) ((Object) ("flag_" + (String) (var5)));
          this.field_h = df.a("", ef.a(var13, (byte) -14), param0, (byte) -92);
          if (var6 == null) {
            stackIn_21_1 = bi.field_a;
          } else {
            stackIn_21_1 = hb.a(param1, 246, "", ef.a((CharSequence) (var6), (byte) -82), param0);
          }
          this.field_f = stackIn_21_1;
          var8 = -1;
          if (var7 != null) {
            try {
              var8 = si.a((byte) 115, (CharSequence) (var7));
            } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var9 = (NumberFormatException) (Object) decompiledCaughtException;
            }
          }
          if (-1 == var8) {
            if (var6 != null) {
              stackIn_31_1 = this.field_f.field_E;
            } else {
              stackIn_31_1 = pa.field_d;
            }
          } else {
            stackIn_31_1 = var8;
          }
          this.field_b = stackIn_31_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_35_0 = var4;
          stackIn_35_1 = new StringBuilder().append("oj.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    static {
        field_c = new String[]{"Use the \"Next\" box to plan ahead.", "In \"Standard\" mode the speed at which blocks rotate and move horizontally increases, up until level 4.", "In \"Delicate\" mode the speed increases until level 8, making control of the blocks more difficult – but enabling you to react faster.", "Note that the only way to clear tiles is to make words with them."};
        field_d = "You have 1 unread message!";
    }
}
