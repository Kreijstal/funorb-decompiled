/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae {
    static int field_a;
    static int[] field_c;
    static String[] field_b;

    final static void a(dj param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        gd var5 = null;
        int[] var6 = null;
        int var7 = 0;
        am var8 = null;
        int var9 = 0;
        am var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = ZombieDawn.field_J;
        try {
          var8 = new am(param0.a("", -119, "logo.fo3d"));
          var10 = var8;
          var3 = var10.d((byte) -119);
          var10.h((byte) 75);
          if (param1 >= -109) {
            return;
          }
          ag.field_a = pi.a(12, var10);
          ic.field_W = new gd[var3];
          eg.field_o = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            ic.field_W[var4] = bj.a(var8, (byte) -128);
          }
          var10.i(8);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = ic.field_W[var9];
            var5.a((byte) 0, 6, 6, 1, 6);
            var5.b(32767);
            var6 = new int[]{var5.field_s + var5.field_o >> 1, var5.field_E + var5.field_L >> 1, var5.field_b + var5.field_a >> 1};
            eg.field_o[var9] = var6;
            var5.a(-var6[2], 112, -var6[1], -var6[0]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ae.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = (String[]) null;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          var3_int = 0;
          var4 = param2.length();
          if (param0 != -49) {
            field_c = (int[]) null;
          }
          for (var5 = 0; var4 > var5; var5++) {
            if (param1 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ae.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int[] a(int param0) {
        if (param0 != 14821) {
          field_c = (int[]) null;
        }
        return new int[8];
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
          ec stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          op var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = ZombieDawn.field_J;
          if (param1 != 10331) {
            ae.a(false);
          }
          try {
            var3 = "";
            if (param0 != null) {
              var3 = vj.a(param0, (byte) -93);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            ed.a(83, var3);
            var7 = fg.a(":", -127, "%3a", var3);
            var8 = fg.a("@", -127, "%40", var7);
            var9 = fg.a("&", -128, "%26", var8);
            var10 = fg.a("#", -127, "%23", var9);
            if (b.field_m == null) {
              return;
            }
            stackIn_14_0 = mh.field_E;
            stackIn_14_1 = param1 ^ 13702;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = b.field_m.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(ke.field_b).append("&u=");
            if (null == i.field_U) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + nk.field_e;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = i.field_U;
            }
            var4 = ((ec) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(ec.field_h).append("&v2=").append(ec.field_g).append("&e=").append(var10).toString()));
            while (var4.field_f == 0) {
              ld.a(1L, (byte) 62);
            }
            if (var4.field_f == 1) {
              var5 = (DataInputStream) (var4.field_d);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        int var2 = 0;
        field_c = new int[50];
        double var0 = 6.283185307179586 / (double)field_c.length;
        for (var2 = 0; field_c.length > var2; var2++) {
          field_c[var2] = (int)(48.0 * Math.sin((double)var2 * var0));
        }
        field_b = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
