/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class nh extends sk {
    static pf field_g;
    static int[] field_d;
    static char[] field_e;
    private String field_i;
    static int field_f;
    static int field_h;
    private long field_j;

    final static boolean a(int param0, boolean param1) {
        long dupTemp$2 = 0L;
        if (null == am.field_c) {
          am.field_c = il.field_v.a(df.field_j, (byte) 34, ue.field_d);
        }
        if (param0 == ~am.field_c.field_f) {
          return false;
        }
        dupTemp$2 = ih.a((byte) -98);
        t.field_d = dupTemp$2;
        ka.field_o = dupTemp$2;
        if (am.field_c.field_f != 1) {
        }
        sl.field_d = lh.field_n;
        am.field_c = null;
        return true;
    }

    ua a(int param0) {
        if (param0 != 160) {
          nh.c(-105);
        }
        return ea.field_o;
    }

    final void a(int param0, ka param1) {
        try {
          param1.a((byte) 122, this.field_j);
          if (param0 != 95) {
            this.a(-10);
          }
          param1.a(false, this.field_i);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        if (param0 != 245) {
          field_d = (int[]) null;
        }
    }

    final static void a(le param0, byte param1, int param2) {
        int var4 = 0;
        ha var5 = pg.field_fb;
        var5.f(param2, 950);
        if (param1 != -30) {
          return;
        }
        try {
          var5.field_k = var5.field_k + 1;
          var4 = var5.field_k;
          var5.a(false, 1);
          if (param0.field_p == null) {
            var5.a(false, 0);
          } else {
            var5.a(false, param0.field_p.length);
            var5.a(param0.field_p.length, 0, (byte) -13, param0.field_p);
          }
          var5.c(var4, (byte) -3);
          var5.field_k = var5.field_k - 4;
          param0.field_o = var5.b(false);
          var5.a(-var4 + var5.field_k, (byte) 70);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nh.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = stellarshard.field_B;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (sk.a(param0.charAt(var2_int), -109)) {
              var2_int++;
              continue;
            }
            break;
          }
          if (param1) {
            stackIn_10_0 = (String) null;
            return stackIn_10_0;
          }
          while (var3 > var2_int) {
            if (sk.a(param0.charAt(var3 - 1), -118)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (1 > var4) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (s.a(45, (char) var7)) {
              var8 = of.a(-119, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_31_0 = var5.toString();
            return stackIn_31_0;
          }
          stackIn_29_0 = null;
          return (String) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("nh.D(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = stellarshard.field_B;
        try {
          var5 = tg.field_a;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 > -17) {
            field_h = 114;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "nh.K(" + param0 + ')');
        }
    }

    nh(long param0, String param1) {
        try {
          this.field_j = param0;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "nh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_d = new int[8192];
    }
}
