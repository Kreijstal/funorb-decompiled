/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ad {
    String[][] field_c;
    private byte[][] field_a;
    private byte[][] field_g;
    private byte[][] field_h;
    static boolean field_e;
    int field_d;
    static String field_f;
    static volatile int field_b;

    private final boolean b(byte param0, char[] param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < param1.length - 2; var3_int++) {
            var4 = 1;
            for (var5 = var3_int; param1.length > var5; var5++) {
              var4 = this.a(0, var4, de.a(33, param1[var5]), this.field_g);
              if (var4 != 0) {
                if (!this.a(var4, this.field_g, true)) {
                  continue;
                }
                return false;
              }
              break;
            }
          }
          var3_intLifetime1 = -1 + param1.length;
          if (param0 >= -15) {
            return false;
          }
          while (var3_intLifetime1 >= 2) {
            var4Lifetime1 = 1;
            for (var5Lifetime1 = var3_intLifetime1; var5Lifetime1 >= 0; var5Lifetime1--) {
              var4Lifetime1 = this.a(0, var4Lifetime1, de.a(106, param1[var5Lifetime1]), this.field_g);
              if (var4Lifetime1 != 0) {
                if (!this.a(var4Lifetime1, this.field_g, true)) {
                  continue;
                }
                return false;
              }
              break;
            }
            var3_intLifetime1--;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final boolean a(byte param0, char[] param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 34) {
            field_f = (String) null;
          }
          stackIn_5_0 = (this.a(0, param1, (byte) -118) == param1.length);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ad.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte[][] param1, boolean param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            discarded$1 = this.a(-77, 118, (byte) -37, (byte[][]) null);
          }
          stackIn_5_0 = (param1[param0][0] == -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ad.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ti[] a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -101 / ((param3 - 78) / 48);
        ti[] var6 = new ti[9];
        ti dupTemp$0 = cd.a(param1, param4, (byte) -20);
        var6[6] = dupTemp$0;
        var6[3] = dupTemp$0;
        var6[2] = dupTemp$0;
        var6[1] = dupTemp$0;
        var6[0] = dupTemp$0;
        ti dupTemp$1 = cd.a(param2, param4, (byte) -31);
        var6[8] = dupTemp$1;
        var6[7] = dupTemp$1;
        var6[5] = dupTemp$1;
        if (param0 != 0) {
          var6[4] = cd.a(param0, 64, (byte) -103);
        }
        return var6;
    }

    final void a(oa param0, int param1) {
        byte[] array$2 = null;
        byte[] array$1 = null;
        byte[] array$0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4_intLifetime1;
        int var5Lifetime1;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          this.field_h = new byte[param0.i(17783)][];
          for (var3_int = 0; this.field_h.length > var3_int; var3_int++) {
            var4_int = (byte)param0.d((byte) 84);
            var5 = param0.c((byte) -124);
            array$2 = new byte[1 + var5];
            this.field_h[var3_int] = array$2;
            this.field_h[var3_int][0] = (byte)var4_int;
            ji.a(param0.field_g, param0.field_h, this.field_h[var3_int], 1, var5);
            param0.field_h = param0.field_h + var5;
          }
          this.field_g = new byte[param0.i(17783)][];
          for (var3_intLifetime1 = 0; this.field_g.length > var3_intLifetime1; var3_intLifetime1++) {
            var4_intLifetime1 = (byte)param0.d((byte) 104);
            var5Lifetime1 = param0.c((byte) -117);
            array$1 = new byte[1 + var5Lifetime1];
            this.field_g[var3_intLifetime1] = array$1;
            this.field_g[var3_intLifetime1][0] = (byte)var4_intLifetime1;
            ji.a(param0.field_g, param0.field_h, this.field_g[var3_intLifetime1], 1, var5Lifetime1);
            param0.field_h = param0.field_h + var5Lifetime1;
          }
          var3_intLifetime2 = 0;
          if (param1 != 1) {
            return;
          }
          while (this.field_a.length > var3_intLifetime2) {
            array$0 = new byte[param0.c((byte) -109)];
            this.field_a[var3_intLifetime2] = array$0;
            var4 = array$0;
            param0.a(var4.length, param1 + 1, var4, 0);
            var3_intLifetime2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ad.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    ad(int param0, int param1) {
        this.field_a = new byte[257][];
        this.field_d = param0;
        this.field_c = new String[param1][2];
    }

    public static void a(int param0) {
        if (param0 != 1) {
          field_e = true;
        }
        field_f = null;
    }

    private final int a(int param0, int param1, byte param2, byte[][] param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 != 0) {
            this.field_h = (byte[][]) null;
          }
          if (param1 == 1 &&
            1 == param3.length) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          am.field_q.field_g = param3[param1];
          am.field_q.field_h = 1;
          var5_int = 255 & param2;
          var6 = -1;
          var7 = -1;
          while (var5_int > var6) {
            var7 = am.field_q.i(param0 ^ 17783);
            if (var7 == 0) {
              var6 = var6 + (am.field_q.i(param0 ^ 17783) + 1);
              continue;
            }
            var6++;
          }
          stackIn_14_0 = var7;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ad.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(char[] param0, Random param1, boolean param2, int param3) {
        int var6 = 0;
        boolean discarded$0 = false;
        int var8 = 0;
        int stackIn_5_0 = 0;
        byte[][] stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        byte[] var7 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0.length == 0) {
            return;
          }
          stackIn_5_0 = 256;
          while (true) {
            var5_int = stackIn_5_0;
            for (var6 = 0; param0.length > var6; var6++) {
              stackIn_9_0 = this.field_a;
              if (!param2) {
                stackIn_10_1 = var5_int;
              } else {
                stackIn_10_1 = 256;
              }
              var7 = stackIn_9_0[stackIn_10_1];
              var5_int = var7[li.a(var7.length, param1, false)] & 255;
              param0[var6] = di.a(68, (byte)var5_int);
            }
            if (!this.b((byte) -119, param0)) {
              stackIn_5_0 = 256;
              continue;
            }
            break;
          }
          if (param3 != 3670) {
            discarded$0 = this.a(-50, (byte[][]) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ad.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, char[] param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 1;
          var6 = param0;
          if (param2 >= -112) {
            stackIn_3_0 = 92;
            return stackIn_3_0;
          }
          while (var6 < param1.length) {
            var7 = 0;
            if (param1[var6] != 0) {
              var7 = de.a(11, param1[var6]);
            }
            var5 = this.a(0, var5, (byte) var7, this.field_h);
            if (var5 != 0) {
              if (this.a(var5, this.field_h, true)) {
                var4_int = var6 - param0 + 1;
              }
              var6++;
              continue;
            }
            break;
          }
          stackIn_14_0 = var4_int;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ad.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(jc param0, int param1, int param2, ci param3) {
        try {
          tf.field_a = wi.b(-125) * param1 / 1000;
          kf.a(param3, (byte) -80);
          sd.a(param3, true);
          v.a((byte) 118, param3);
          if (param2 != 22313) {
            field_f = (String) null;
          }
          rd.a(true);
          ra.a(0);
          si.field_l = -tf.field_a + 0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ad.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = false;
        field_f = "To server list";
        field_b = 0;
    }
}
