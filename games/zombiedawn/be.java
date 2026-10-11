/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends im {
    private boolean field_h;
    private int[] field_l;
    private byte[] field_n;
    private int field_k;
    private int field_m;
    static cg field_i;
    static int field_j;

    final void a(boolean param0) {
        this.field_m = 0;
        this.field_k = 0;
        if (param0) {
          this.a((byte) -3);
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
          be.c(true);
        }
        field_i = null;
    }

    final byte[] c(int param0, int param1, int param2) {
        this.field_n = new byte[param0 * param1];
        this.b(param0, param1, -9394);
        if (param2 >= -18) {
          return (byte[]) null;
        }
        return this.field_n;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -25466) {
          return;
        }
        this.field_m = this.field_m + (this.field_l[param0] * param1 >> 12);
    }

    final static vk a(String param0, byte param1) {
        vk stackIn_4_0 = null;
        vk stackIn_7_0 = null;
        vk stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        vk stackIn_25_0 = null;
        vk stackIn_31_0 = null;
        vk stackIn_41_0 = null;
        vk stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = bg.field_l;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = fg.field_m;
            return stackIn_7_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_11_0 = vl.field_m;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_25_0 = vl.field_m;
                  return stackIn_25_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          if (param1 > -47) {
            stackIn_31_0 = (vk) null;
            return stackIn_31_0;
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_41_0 = vl.field_m;
                return stackIn_41_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == mc.field_i.indexOf(var5Lifetime1)) {
                stackIn_45_0 = vl.field_m;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("be.H(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    be(int param0, int param1, int param2, int param3, int param4, float param5, boolean param6) {
        super(param0, param1, param2, param3, param4);
        int var8 = 0;
        this.field_l = new int[this.field_g];
        this.field_h = param6 ? true : false;
        for (var8 = 0; this.field_g > var8; var8++) {
          this.field_l[var8] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var8));
        }
    }

    final void a(byte param0) {
        String var3;
        byte[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        if (param0 != 44) {
          var3 = (String) null;
          be.a((String) null, (byte) -57);
        }
        if (this.field_m < -4096) {
          this.field_m = -4096;
        } else {
          if (this.field_m > 4096) {
            this.field_m = 4096;
          }
        }
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        stackIn_8_0 = this.field_n;
        stackIn_8_1 = fieldTemp$1;
        if (!this.field_h) {
          stackIn_9_2 = this.field_m;
        } else {
          stackIn_9_2 = 2048 + (this.field_m >> 1);
        }
        stackIn_8_0[stackIn_8_1] = (byte)(stackIn_9_2 >> 4);
        this.field_m = 0;
    }

    static {
        field_i = new cg(11, 0, 1, 2);
    }
}
