/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sma {
    static String field_d;
    static joa field_e;
    int[] field_b;
    static en field_c;
    private int[] field_f;
    private ff field_a;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_f = new int[this.field_a.field_P];
        this.field_b = new int[this.field_a.field_P];
        if (param0 >= -43) {
          return;
        }
        for (var2 = 0; var2 < this.field_b.length; var2++) {
          this.field_b[var2] = var2;
          this.field_f[var2] = var2;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 67 / ((-44 - param0) / 54);
        field_d = null;
    }

    final static int a(String param0, int param1) {
        int var8_int = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 28893) {
            sma.a(47);
          }
          if (!hna.field_a.field_c) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (gj.field_d.containsKey(param0)) {
            stackIn_9_0 = 100;
            return stackIn_9_0;
          }
          var10 = eba.a((byte) 38, param0);
          if (var10 == null) {
            stackIn_12_0 = -1;
            return stackIn_12_0;
          }
          var3 = aqa.field_c + var10;
          if (!af.field_b.a(var3, "", param1 - 28893)) {
            stackIn_15_0 = -1;
            return stackIn_15_0;
          }
          if (!af.field_b.c(var3, -122)) {
            stackIn_18_0 = af.field_b.a(var3, true);
            return stackIn_18_0;
          }
          var15 = af.field_b.a(var3, (byte) 117, "");
          var13 = var15;
          var4 = var13;
          var5 = null;
          try {
            var11 = iba.a(var10, (byte) -94);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          if (var4 != null &&
            var11 != null) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var6 = 1;
            var14 = vj.a(var11, (byte) -86);
            var12 = var14;
            var7 = var12;
            if (var7 != null &&
              var14.length == var15.length) {
              for (var8_int = 0; var14.length > var8_int; var8_int++) {
                if (var15[var8_int] != var14[var8_int]) {
                  var6 = 0;
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var6 = 0;
            }
            try {
              if (var6 == 0) {
                hna.field_a.a(var15, var11, true);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var8 = decompiledCaughtException;
              stackIn_41_0 = -1;
              return stackIn_41_0;
            }
            mj.a(param0, var11, 1);
            stackIn_43_0 = 100;
            return stackIn_43_0;
          }
          stackIn_45_0 = -1;
          return stackIn_45_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_48_0 = var2;
          stackIn_48_1 = new StringBuilder().append("sma.A(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var6 = 0;
        int var2;
        int var3;
        int var4;
        hca[] var5;
        hca var7;
        int var8;
        int var9;
        int var2Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        this.field_b = new int[this.field_a.field_H.length];
        this.field_f = new int[this.field_a.field_H.length];
        for (var2 = 0; this.field_a.field_H.length > var2; var2++) {
          this.field_b[var2] = -1;
          this.field_f[var2] = -1;
        }
        if (param0) {
          return;
        }
        for (var2Lifetime1 = 0; this.field_f.length > var2Lifetime1; var2Lifetime1++) {
          var3 = -1;
          var4 = 0;
          var5 = this.field_a.field_H;
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!this.field_a.f((byte) -83, var7.A(0)) &&
              -1 == this.field_f[var7.A(0)]) {
              var8 = var7.e(false) + var7.j(false);
              if (var3 == -1 ||
                var4 < var8 ||
                var4 == var8 &&
                !(this.field_a.field_c.field_b[var7.A(0)] >= this.field_a.field_c.field_b[var3])) {
                var4 = var8;
                var3 = var7.A(0);
              }
            }
          }
          if (-1 != var3) {
            this.field_b[var2Lifetime1] = var3;
            this.field_f[var3] = var2Lifetime1;
          }
        }
    }

    sma(ff param0) {
        try {
          this.field_a = param0;
          this.a((byte) -54);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Exploiting a bug";
        field_e = new joa();
    }
}
