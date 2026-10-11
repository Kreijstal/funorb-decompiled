/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pca {
    private int field_b;
    private int field_f;
    static String field_a;
    private int field_j;
    private int field_c;
    private uq field_e;
    private int field_g;
    private tqa field_i;
    int field_h;
    static iu[] field_k;
    private int[] field_d;

    final tqa a(int param0) {
        if (param0 != 18641) {
          return (tqa) null;
        }
        return this.field_i;
    }

    final void a(byte param0, iq param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 104) {
            this.field_d = (int[]) null;
          }
          if (this.field_e != null) {
            this.field_e.a(113, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pca.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final int c(byte param0) {
        if (param0 <= 48) {
          this.field_j = -59;
        }
        return this.field_j;
    }

    final int a(byte param0) {
        if (param0 != -104) {
          return 95;
        }
        return this.field_c;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param1 < 5) {
          field_k = (iu[]) null;
        }
        return 0 != (param2 & 16) ? true : false;
    }

    final void a(int param0, uq param1) {
        try {
          this.field_e = param1;
          param1.a(30711, this);
          if (param0 != 3) {
            this.a(-124);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int[] param1) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = param1;
          var3 = var7;
          if (param0 > -110) {
            this.a((byte) 5);
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (this.a(var5, 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("pca.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 8) {
          field_k = (iu[]) null;
        }
        field_a = null;
        field_k = null;
    }

    final boolean a(int param0, int param1) {
        if (param1 != 0) {
          this.a(21);
        }
        return 0 < this.field_d[param0] ? true : false;
    }

    final boolean b(boolean param0) {
        if (param0) {
          this.a(106);
        }
        return this.field_g > 0 ? true : false;
    }

    final void a(kh param0, int param1) {
        if (param1 > -75) {
          return;
        }
        try {
          param0.a((byte) 92, this.field_h, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, tqa param3) {
        try {
          this.field_i = param3;
          this.field_f = param2;
          this.field_j = param0;
          this.field_c = param3.d(-30551) * param0 + param3.d(-30551) / 2;
          this.field_b = param3.d(-30551) * param2 + param3.d(-30551) / 2;
          if (param1 <= 124) {
            this.a(-52, 68, true);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        this.field_d[param1] = this.field_d[param1] + param0;
        if (!param2) {
          field_a = (String) null;
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          pca.a(89, (byte) 98);
        }
        stackIn_6_0 = (null != this.field_e) && (this.field_e.c(param0 - 2));
        return stackIn_6_0;
    }

    final la d(int param0) {
        if (param0 != 0) {
          return (la) null;
        }
        return this.field_i.b(0);
    }

    final void a(uw param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != this.field_e) {
            param0.a((byte) -88, 4, this.field_e);
          }
          if (param1 != 84) {
            this.field_h = -37;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pca.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        this.field_g = this.field_g + param1;
        if (param0 <= 5) {
          this.field_i = (tqa) null;
        }
    }

    final void e(int param0) {
        if (null != this.field_e) {
          this.field_e.a(true);
        }
        if (param0 != 0) {
          this.field_h = 1;
        }
    }

    final void a(pca param0, int param1) {
        try {
          this.field_h = param0.field_h;
          if (param1 != 21324) {
            this.field_j = -39;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, byte param1) {
        woa var2;
        byte[] var3;
        Random var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        byte[] var10;
        byte[] var11;
        int var5Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = (woa) (is.field_xb.a(0, (long)param0));
        if (param1 < 37) {
          return (byte[]) null;
        }
        if (var2 == null) {
          var11 = new byte[512];
          var10 = var11;
          var3 = var10;
          var4 = new Random((long)param0);
          for (var5 = 0; 255 > var5; var5++) {
            var3[var5] = (byte)var5;
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 255; var5Lifetime1++) {
            var6 = -var5Lifetime1 + 255;
            var7 = jqa.a(var6, var4, -110);
            var8 = var11[var7];
            var3[var7] = var11[var6];
            var3[-var5Lifetime1 + 511] = (byte) var8;
            var3[var6] = (byte) var8;
          }
          var2 = new woa(var11);
          is.field_xb.a(var2, (byte) 52, (long)param0);
        }
        return var2.field_k;
    }

    final void a(byte param0, la param1, kh param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 29) {
            return;
          }
          this.field_h = param2.b((byte) 44, 8);
          if (param1.field_E >= 10 &&
            param1.field_E <= 17) {
            param2.b((byte) 44, 1);
            param2.b((byte) 44, 1);
            if (this.field_h > 5) {
              this.field_h = 1;
            } else {
              this.field_h = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("pca.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final uq b(byte param0) {
        if (param0 >= -79) {
          this.a(true);
        }
        return this.field_e;
    }

    pca() {
        this.field_d = new int[3];
    }

    final int a(boolean param0) {
        if (!param0) {
          return -58;
        }
        return this.field_b;
    }

    final static void a(int param0, int param1, int param2) {
        lu.a(param0, (double)param2, param1 + 26108, param0, (double)param2);
        if (param1 != -26109) {
          pca.c(99);
        }
    }

    final int f(int param0) {
        int var2 = -8 / ((param0 - 44) / 50);
        return this.field_f;
    }

    static {
    }
}
