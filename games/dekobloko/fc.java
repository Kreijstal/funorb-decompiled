/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fc {
    static w field_f;
    static int[] field_d;
    static w field_c;
    static int[] field_b;
    static long field_h;
    static int field_a;
    static String field_g;
    static int field_e;

    final static void a(int param0, byte param1, boolean param2, int param3) {
        fl.a(param0 + 20, 256, 16777215, ug.field_n, param3 + 4, w.field_kb);
        param0 += 26;
        fl.a(12 + param0, 256, 16777215, vk.field_b[0], 4 + param3, se.field_S);
        ph.field_yb[0].c(122 + param3, param0);
        param0 += 16;
        fl.a(12 + param0, param1 ^ 261, 16777215, vk.field_b[1], param3 + 4, se.field_S);
        ph.field_yb[1].c(param3 + 122, param0);
        param0 += 23;
        if (param1 != 5) {
          String var5 = (String) null;
          fc.a((byte) 7, (String) null);
        }
        fl.a(12 + param0, 256, 16777215, vk.field_b[2], 4 + param3, se.field_S);
        ph.field_yb[3].c(122 + param3, param0);
        param0 += 16;
        fl.a(param0 + 12, 256, 16777215, vk.field_b[3], 4 + param3, se.field_S);
        ph.field_yb[2].c(param3 + 100, param0);
        ed.a(16777215, 119 + param3, "/", 12 + param0, (byte) 75, se.field_S);
        ph.field_yb[4].c(122 + param3, param0);
        param0 += 23;
        fl.a(param0 + 12, 256, 16777215, vk.field_b[5], param3 + 4, se.field_S);
        ph.field_yb[5].c(122 + param3, param0);
        param0 += 23;
        if (param2) {
          fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, se.field_S);
          ph.field_yb[6].c(param3 + 122, param0);
        }
    }

    final static void a(int param0, boolean param1) {
        if (ea.d((byte) 80)) {
          param1 = false;
        }
        cg.b(param1, 1);
        ub.a((byte) 54);
        if (param0 != 5) {
          field_g = (String) null;
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
          return;
        }
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static ck[] a(int param0, ck param1, int param2) {
        int var7 = 0;
        ck dupTemp$0 = null;
        int var14 = 0;
        int var15 = 0;
        ck[] stackIn_3_0 = null;
        ck[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ck var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var16 = 0;
        var16 = client.field_A ? 1 : 0;
        try {
          var3 = new ck[param0];
          var4 = param1.field_D;
          var5 = param1.field_K / param0;
          if (param2 != -10241) {
            stackIn_3_0 = (ck[]) null;
            return stackIn_3_0;
          }
          var6 = param1.field_I - var5;
          for (var7 = 0; var7 < param0; var7++) {
            dupTemp$0 = new ck(var5, param1.field_H);
            var3[var7] = dupTemp$0;
            var8 = dupTemp$0;
            var9 = var8.field_D;
            var10 = var7 * var5 + param1.field_F;
            var11 = param1.field_z;
            var12 = var11 * var5 + var10;
            var13 = 0;
            for (var14 = -param1.field_H; var14 < 0; var14++) {
              for (var15 = -var5; var15 < 0; var15++) {
                var9[var13++] = var4[var12++];
              }
              var12 = var12 + var6;
            }
          }
          stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          try {
            if (!fd.field_d.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; var3 < param1.length(); var3++) {
              if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            if (param0 == -19) {
              return true;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        try {
          int var2 = 0;
          IOException iOException = null;
          IOException var3_ref = null;
          int var1_int = 0;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          var4 = client.field_A ? 1 : 0;
          try {
            if (ta.field_k != null) {
              ta.field_k.d((byte) 117);
            }
            if (qb.field_r != null) {
              qb.field_r.a((byte) -98);
            }
            if (null != mk.field_d) {
              try {
                mk.field_d.c((byte) 124);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            var1_int = -32 % ((param0 + 41) / 50);
            if (null != ig.field_cc) {
              for (var2 = 0; ig.field_cc.length > var2; var2++) {
                if (ig.field_cc[var2] != null) {
                  try {
                    ig.field_cc[var2].c((byte) 125);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var3_ref = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw dh.a((Throwable) ((Object) var1), "fc.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = new int[8192];
        field_g = "Cancel";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
