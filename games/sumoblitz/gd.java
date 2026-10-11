/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gd {
    static String field_o;
    static long[] field_k;
    ro field_l;
    static String field_a;
    ro field_h;
    ro field_f;
    ro field_g;
    long field_e;
    int field_c;
    fs field_n;
    fs field_b;
    volatile int field_d;
    volatile int field_j;
    byte field_m;
    fv field_i;

    final static ta a(ki param0, byte param1, String param2, String param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        ta stackIn_5_0 = null;
        ta stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.a(param2, param3, -1);
          var4 = var5;
          if (var5 == null) {
            stackIn_2_0 = null;
            return (ta) (stackIn_2_0);
          }
          if (param1 < -1) {
            stackIn_7_0 = new ta(var5);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ta) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("gd.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final fv a(int param0, boolean param1, int param2, byte param3, byte param4) {
        long var6 = (long)param2 + ((long)param0 << 32);
        fv var8 = new fv();
        var8.field_t = param1 ? true : false;
        var8.field_l = var6;
        var8.field_z = param4;
        int var9 = -16 % ((0 - param3) / 43);
        if (param1) {
          if (!(this.d(-2115911413) < 20)) {
            throw new RuntimeException();
          }
          this.field_l.a((pj) (var8), (byte) -118);
        } else {
          if (!(this.a((byte) -120) < 20)) {
            throw new RuntimeException();
          }
          this.field_f.a((pj) (var8), (byte) -107);
        }
        return var8;
    }

    abstract void b(int param0);

    final static void a(int param0, int param1, jn param2, int param3, int param4, int param5) {
        float[] dupTemp$0 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var8Lifetime1;
        float[] var8Lifetime2;
        float[] var8Lifetime1Lifetime1;
        int var7Lifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 < 59) {
            return;
          }
          stackIn_6_0 = (ul.field_f != 1) ? 0 : 1;
          var6_int = stackIn_6_0;
          var7 = 0;
          while (true) {
            stackIn_10_0 = (var6_int == 0) ? 50 : 25;
            if (stackIn_10_0 > var7) {
              var8 = new float[]{0.0f, (float)(-(fi.a(param0, he.field_o, (byte) -96) + 1))};
              var13 = kt.a((byte) -81, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
              var12 = var13;
              var10 = var12;
              var8Lifetime2 = var10;
              param2.a((ms) (new as(64, ((int)var13[0] << 11) + param4, ((int)var13[1] << 11) + param1, param5, -(int)var13[0] << 8, -(int)var13[1] << 8, 0)), (byte) 39);
              var7++;
              continue;
            }
            break;
          }
          var7Lifetime1 = 0;
          while (true) {
            stackIn_16_0 = (var6_int == 0) ? 30 : 25;
            if (stackIn_16_0 <= var7Lifetime1) {
              return;
            }
            var8Lifetime1 = new float[]{0.0f, (float)(-(1 + fi.a(param0, he.field_o, (byte) -96)))};
            dupTemp$0 = kt.a((byte) -20, var8Lifetime1, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7Lifetime1) + 0.0));
            var11 = dupTemp$0;
            var8Lifetime1Lifetime1 = dupTemp$0;
            param2.a((ms) (new as(64, param4 + ((int)var11[0] << 11), ((int)var11[1] << 11) + param1, param5, -(int)var11[0] << 8, -(int)var11[1] << 8, 1)), (byte) 39);
            var7Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("gd.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var2 = 111 / ((param0 - 76) / 32);
        return this.d(-2115911413) >= 20 ? true : false;
    }

    abstract void a(boolean param0, byte param1, Object param2);

    final static boolean b(byte param0) {
        int var2 = 0;
        rd var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        rd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 <= 118) {
            field_k = (long[]) null;
          }
          var4 = (rd) (qr.field_c.b(100));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_p > var2; var2++) {
            if (null != var4.field_o[var2] &&
              var4.field_o[var2].field_c == 0) {
              return false;
            }
            if (var4.field_s[var2] != null &&
              var4.field_s[var2].field_c == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "gd.K(" + param0 + ')');
        }
    }

    final int d(int param0) {
        if (param0 == -2115911413) {
          return this.field_l.a((byte) 2) + this.field_h.a((byte) 2);
        }
        this.b(true);
        return this.field_l.a((byte) 2) + this.field_h.a((byte) 2);
    }

    final static lh a(byte param0, int param1) {
        lh var2 = null;
        lh var2Lifetime1;
        if (param0 == -82) {
          var2 = new lh();
          no.field_d.a((ms) (var2), (byte) 39);
          jg.b(param0 + 11126, param1);
          return var2;
        }
        field_k = (long[]) null;
        var2Lifetime1 = new lh();
        no.field_d.a((ms) (var2Lifetime1), (byte) 39);
        jg.b(param0 + 11126, param1);
        return var2Lifetime1;
    }

    final boolean b(boolean param0) {
        if (param0) {
          return this.a((byte) -100) >= 20 ? true : false;
        }
        String var3 = (String) null;
        gd.a((ki) null, (byte) -79, (String) null, (String) null);
        return this.a((byte) -100) >= 20 ? true : false;
    }

    final int a(byte param0) {
        if (param0 < -82) {
          return this.field_f.a((byte) 2) + this.field_g.a((byte) 2);
        }
        this.field_n = (fs) null;
        return this.field_f.a((byte) 2) + this.field_g.a((byte) 2);
    }

    public static void a(boolean param0) {
        field_o = null;
        if (param0) {
          gd.a((byte) -88, 27);
          field_a = null;
          field_k = null;
          return;
        }
        field_a = null;
        field_k = null;
    }

    abstract void c(int param0);

    abstract boolean c(byte param0);

    gd() {
        this.field_l = new ro();
        this.field_h = new ro();
        this.field_f = new ro();
        this.field_g = new ro();
        this.field_n = new fs(6);
        this.field_d = 0;
        this.field_j = 0;
        this.field_m = (byte) 0;
        this.field_b = new fs(10);
    }

    static {
        field_k = new long[32];
        field_o = "ACHIEVEMENTS";
    }
}
