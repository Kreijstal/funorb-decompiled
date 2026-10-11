/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends DualNode {
    static int[] field_E;
    int[] field_F;
    static int[] field_B;
    static int[] field_A;
    private int[][] field_z;
    static int field_C;
    static NodeDeque field_H;
    private String[] field_G;
    private int[] field_D;
    static RgbSprite field_y;

    final void c(byte param0) {
        int var3 = 0;
        int var4 = SteelSentinels.obfuscationControl;
        int var2 = -79 % ((param0 + 50) / 55);
        if (this.field_F != null) {
          for (var3 = 0; var3 < this.field_F.length; var3++) {
            this.field_F[var3] = vn.a(this.field_F[var3], 32768);
          }
        }
    }

    final static String[] a(BitmapFont param0, int[] param1, int param2, String param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (jh.field_b == null) {
            jh.field_b = new String[16];
          }
          do {
            try {
              var4_int = param0.a(param3, param1, jh.field_b);
              decompiledRegionSelector0 = 0;
            } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
              if (jh.field_b.length >= 1024) {
                return null;
              }
              jh.field_b = new String[jh.field_b.length << 1];
              decompiledRegionSelector0 = 1;
            }
          } while (decompiledRegionSelector0 != 0);
          var5 = new String[var4_int];
          var6 = 0;
          if (param2 != 18985) {
            field_B = (int[]) null;
          }
          while (var4_int > var6) {
            var5[var6] = jh.field_b[var6];
            var6++;
          }
          stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ao.F(");
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
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final String i(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = SteelSentinels.obfuscationControl;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_G == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_G[0]);
        for (var3 = param0; this.field_G.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_G[var3]);
        }
        return var2.toString();
    }

    public static void g(int param0) {
        field_B = null;
        field_H = null;
        field_A = null;
        if (param0 != 0) {
          return;
        }
        field_E = null;
        field_y = null;
    }

    final void a(PacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param1 >= -68) {
            return;
          }
          while (true) {
            var3_int = param0.f((byte) -85);
            if (var3_int == 0) {
              return;
            }
            this.a(var3_int, param0, 100);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ao.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void h(int param0) {
        ub.c(param0);
        if (null != sl.field_n) {
          pa.a(sl.field_n, 9174);
        }
        ma.g(0);
        og.b(-115);
        ln.a(param0 ^ -8601);
        if (rn.a((byte) -14)) {
          mm.field_g.a(1, (byte) -117);
          gj.a(0, 0);
        }
        pm.m(param0 - 47);
    }

    ao() {
    }

    private final void a(int param0, PacketBuffer param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        fm var7 = null;
        int var9 = 0;
        int var4_intLifetime1;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (param0 == 1) {
            this.field_G = ka.a('<', false, param1.h(1));
          } else {
            if (param0 == 2) {
              var4_int = param1.f((byte) -114);
              this.field_F = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_F[var5] = param1.c((byte) -60);
              }
            } else {
              if (3 == param0) {
                var4_int = param1.f((byte) -99);
                this.field_z = new int[var4_int][];
                this.field_D = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param1.c((byte) -60);
                  var7 = wa.b(var6, 99);
                  if (var7 != null) {
                    this.field_D[var5] = var6;
                    array$0 = new int[var7.field_k];
                    this.field_z[var5] = array$0;
                    for (var8 = 0; var7.field_k > var8; var8++) {
                      this.field_z[var5][var8] = param1.c((byte) -60);
                    }
                  }
                }
              } else {
                if (4 == param0) {
                }
              }
            }
          }
          var4_intLifetime1 = 108 % ((-29 - param2) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ao.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        field_A = jg.a(true);
        field_A[0] = -410976256;
        int[] var3 = field_A;
        var3[1] = vn.a(var3[1], 32);
        field_E = jg.a(true);
        int[] var4 = field_E;
        var4[1] = vn.a(var4[1], 8);
        field_E[0] = -1711275968;
        int[] var5 = field_E;
        var5[1] = vn.a(var5[1], 16);
        field_B = jg.a(true);
        field_B[0] = 64712;
        for (var0 = 32; var0 <= 36; var0++) {
          var1 = field_B;
          var2 = var0;
          var1[var2 >> 5] = vn.a(var1[var2 >> 5], 1 << ec.a(31, var2));
        }
        int[] var6 = field_A;
        var6[1] = vn.a(var6[1], 64);
    }
}
