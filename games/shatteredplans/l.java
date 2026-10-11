/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class l {
    private int field_l;
    int field_k;
    static String field_i;
    static String field_d;
    static qr field_a;
    ln[] field_e;
    int[][] field_h;
    int field_b;
    static bc field_g;
    int[][] field_c;
    Random field_j;
    static int field_f;

    final void b(byte param0) {
        this.field_h = wb.a(this.field_e, 0);
        if (param0 != 80) {
          ob var3 = (ob) null;
          this.a((byte) 42, (fs[]) null, (ob) null);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -94) {
          l.a((byte) -50);
        }
        field_i = null;
        field_a = null;
        field_g = null;
    }

    final void a(int param0) {
        if (param0 != 26253) {
          this.field_j = (Random) null;
        }
        this.field_c = mb.a(this.field_e, false);
    }

    private final void a(fs param0, vr param1, int param2, ln param3) {
        sd var5 = null;
        lo var6 = null;
        try {
          if (param2 != 32447) {
            this.field_e = (ln[]) null;
          }
          param3.field_t = param0;
          param3.field_y = param0;
          var5 = new sd(param0, param3);
          var5.a(param2 ^ -11190, param3);
          param3.field_R = var5;
          var6 = new lo(param0, param3);
          var6.a(-21771, param3);
          param0.field_i.a((byte) -113, var5);
          param0.field_m = var6;
          kd.a(param1, false, param3, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "l.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ob param0, fs[] param1, int param2) {
        int var6 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ln[] var5 = null;
        ln var7 = null;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ln[] var13 = null;
        ln var14 = null;
        ln var15 = null;
        ln[] var9_ref_ln__Lifetime1;
        ln var15Lifetime1;
        ln var15Lifetime2;
        ln var15Lifetime3;
        ln var15Lifetime2Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param0.e(11135, this.field_l);
          param0.d(this.field_k, 255);
          param0.d(this.field_b, 255);
          var4_int = this.field_e.length;
          param0.d(var4_int, 255);
          var5 = this.field_e;
          if (param2 <= 126) {
            this.field_j = (Random) null;
          }
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            var15 = var7;
            var15Lifetime1 = var7;
            var8 = 0;
            var13 = var7.field_D;
            var9_ref_ln__ = var13;
            for (var10 = 0; var10 < var13.length; var10++) {
              var14 = var13[var10];
              var15Lifetime2 = var14;
              var15Lifetime2Lifetime1 = var14;
              if (var14.field_p > var7.field_p) {
                var8++;
              }
            }
            param0.c(var8, (byte) -116);
            var9_ref_ln__Lifetime1 = var7.field_D;
            for (var10Lifetime1 = 0; var10Lifetime1 < var9_ref_ln__Lifetime1.length; var10Lifetime1++) {
              var15Lifetime3 = var9_ref_ln__Lifetime1[var10Lifetime1];
              if (var7.field_p < var15Lifetime3.field_p) {
                di.a(var15Lifetime3, false, param0);
              }
            }
            var9 = 0;
            while (4 > var9) {
              var10Lifetime2 = var7.field_G[var9];
              if (0 > var10Lifetime2) {
                var10Lifetime2 = -var10Lifetime2;
              }
              var9++;
              if (var9 < 4) {
                var11 = var7.field_G[var9];
                if (var11 < 0) {
                  var11 = -var11;
                }
                var10Lifetime2 = var10Lifetime2 | var11 << 4;
              }
              param0.c(var10Lifetime2, (byte) -77);
              var9++;
            }
            var9Lifetime1 = var7.field_x;
            if (var7.field_u) {
              var9Lifetime1 = var9Lifetime1 | 32768;
            }
            param0.d(var9Lifetime1, 255);
            param0.c(var7.field_L << 6 | var7.field_B, (byte) -121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_33_0 = var4;
          stackIn_33_1 = new StringBuilder().append("l.D(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(fs[] param0, vr param1, int param2) {
        int var4_int = 0;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = 0;
          var5 = this.field_e;
          var6 = 0;
          L1: while (true) {
            if (var5.length > var6) {
              var7 = var5[var6];
              if (var7.field_L == 3) {
                this.a(param0[var4_int], param1, param2 ^ 32443, var7);
                var4_int++;
                if (var4_int == param0.length) {
                  break L1;
                }
              }
              var6++;
              continue;
            }
            break;
          }
          if (param2 != 4) {
            field_g = (bc) null;
            this.b((byte) 80);
          } else {
            this.b((byte) 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("l.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, fs[] param1, ob param2) {
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ln[] var5 = null;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param2.d(this.field_k, param0 ^ -170);
          param2.d(this.field_b, param0 ^ -170);
          var4_int = this.field_e.length;
          param2.d(var4_int, 255);
          if (param0 != -87) {
            return;
          }
          var5 = this.field_e;
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            b.a(2232, param2, var7.field_I);
            param2.d(var7.field_A, param0 ^ -170);
            param2.d(var7.field_S, 255);
            param2.c(var7.field_z, (byte) -92);
            var8 = var7.field_D.length;
            param2.c(var8, (byte) -122);
            for (var9 = 0; var9 < var8; var9++) {
              di.a(var7.field_D[var9], false, param2);
            }
            var9Lifetime1 = 0;
            while (4 > var9Lifetime1) {
              var10 = var7.field_G[var9Lifetime1];
              if (0 > var10) {
                var10 = -var10;
              }
              var9Lifetime1++;
              if (var9Lifetime1 < 4) {
                var11 = var7.field_G[var9Lifetime1];
                if (0 > var11) {
                  var11 = -var11;
                }
                var10 = var10 | var11 << 4;
              }
              param2.c(var10, (byte) -110);
              var9Lifetime1++;
            }
            var9Lifetime2 = var7.field_x;
            if (var7.field_u) {
              var9Lifetime2 = var9Lifetime2 | 32768;
            }
            param2.d(var9Lifetime2, param0 ^ -170);
            param2.c(var7.field_B | var7.field_L << 6, (byte) -82);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("l.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void a(int param0, ob param1, fs[] param2) {
        int var5 = 0;
        ln[] var4 = null;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != 10529) {
            return;
          }
          var8 = this.field_e;
          var4 = var8;
          for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            im.a(var6.field_t, param1, 9555);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("l.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    l(int param0, int param1, int param2, int param3) {
        this.field_k = param0;
        this.field_l = param2;
        this.field_b = param1;
        this.field_j = (Random) ((Object) new ea((long)this.field_l));
        this.field_e = new ln[param3];
    }

    static {
        field_d = "Your request to join has been declined.";
        field_i = "Location";
    }
}
