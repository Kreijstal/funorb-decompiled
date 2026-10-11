/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private ig field_i;
    static String field_j;
    private eg field_h;
    private eg field_d;
    static eg field_e;
    static kc field_c;
    static int field_k;
    static int[][] field_g;
    static int field_b;
    static int field_a;
    static String field_f;

    final tk a(int param0, byte param1) {
        byte[] var4 = null;
        tk var3 = (tk) (this.field_i.a((long)param0, false));
        if (var3 == null) {
          if (param0 >= 32768) {
            var4 = this.field_d.b(32767 & param0, 26219, 1);
          } else {
            var4 = this.field_h.b(param0, 26219, 1);
          }
          var3 = new tk();
          if (var4 != null) {
            var3.a(new wk(var4), -22034);
          }
          if (32768 <= param0) {
            var3.e((byte) -127);
          }
          this.field_i.a(var3, (long)param0, -70);
          int var5 = 80 / ((param1 - 3) / 56);
          return var3;
        }
        return var3;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var15 = 0;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = param0 * param0;
          var6 = -param0 + param4;
          var7 = param0 + param4;
          var8 = -param0 + param3;
          if (param1 < 60) {
            field_j = (String) null;
          }
          var9 = param3 + param0;
          if (var8 < de.field_i) {
            var8 = de.field_i;
          }
          if (var7 > de.field_k) {
            var7 = de.field_k;
          }
          if (var6 < de.field_c) {
            var6 = de.field_c;
          }
          if (de.field_h < var9) {
            var9 = de.field_h;
          }
          var24 = de.field_l;
          var23 = var24;
          var10 = var23;
          for (var15 = var6; var7 > var15; var15++) {
            for (var16 = var8; var9 > var16; var16++) {
              boolean decompiledFrameRemainder0 = true;
              var12 = -param3 + var16;
              var13 = var15 - param4;
              var14 = var13 * var13 + var12 * var12;
              if (var14 < var5_int) {
                if (var14 == 0) {
                  var14 = 1;
                }
                var11 = var16 + var15 * de.field_e;
                if (param2 < 0) {
                  var17 = -((256 - param2) * var14 / var5_int) + (-param2 + 256);
                } else {
                  var17 = 256 + var14 * param2 / var5_int - param2;
                }
                var18 = var24[var11];
                var19 = (16724527 & var18) >> 16;
                var20 = (65334 & var18) >> 8;
                var21 = var18 & 255;
                if (0 < var17) {
                  if (var17 >= 256) {
                    var10[var11] = fj.b(fj.b(var20 << 8, var19 << 16), var21);
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var20 >= var17) {
                      var20 = 255;
                    } else {
                      var20 = var20 + (-var17 + 256);
                    }
                    if (var19 >= var17) {
                      var19 = 255;
                    } else {
                      var19 = var19 + (-var17 + 256);
                    }
                    if (var21 >= var17) {
                      var21 = 255;
                    } else {
                      var21 = var21 + (256 - var17);
                    }
                  }
                } else {
                  var21 = 255;
                  var20 = 255;
                  var19 = 255;
                }
                if (decompiledFrameRemainder0) {
                  var10[var11] = fj.b(fj.b(var20 << 8, var19 << 16), var21);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "gn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_j = null;
        field_e = null;
        if (param0 == -122) {
          field_f = null;
          field_g = (int[][]) null;
          return;
        }
        field_j = (String) null;
        field_f = null;
        field_g = (int[][]) null;
    }

    gn(int param0, eg param1, eg param2, ok param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = new ig(64);
        try {
          this.field_d = param2;
          this.field_h = param1;
          if (this.field_h != null) {
            this.field_h.a(1, (byte) -60);
          }
          if (null == this.field_d) {
            return;
          }
          this.field_d.a(1, (byte) -60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gn.<init>(").append(param0).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_j = "Live Combat Situation";
        field_k = 1;
        field_b = 0;
        field_f = "You can also walk around by using the 'Z' and 'X' keys. Walk and jump towards the target on the castle to the right.";
    }
}
