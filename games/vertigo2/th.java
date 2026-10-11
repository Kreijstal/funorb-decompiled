/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    private qp[] field_c;
    static ho[] field_e;
    private int field_b;
    static il field_g;
    private int field_i;
    static lg[] field_a;
    float field_j;
    String field_h;
    static String field_k;
    static er[] field_f;
    private int field_d;

    final static cr a(boolean param0) {
        if (!param0) {
          th.a((byte) -18);
        }
        return pp.a((byte) 116);
    }

    private final void a(qp param0, int param1, int param2) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)(1 + this.field_d) + (float)param2 / 100.0f;
          if (param2 == 0) {
            this.field_h = param0.field_f;
          } else {
            this.field_h = param0.field_a + " - " + param2 + "%";
          }
          this.field_j = (float)this.field_i * var4_float / (float)(param1 + this.field_b);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "th.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = -62 / ((-76 - param0) / 32);
        field_f = null;
        field_e = null;
        field_k = null;
        field_a = null;
    }

    final static bn a(boolean param0, int[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bn stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        lg var22 = null;
        var21 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2 != -27911) {
            th.a(false);
          }
          var22 = new lg(672, 192, 96);
          for (var4 = 0; 6 > var4; var4++) {
            for (var5 = 0; var5 < 4; var5++) {
              for (var6 = 0; var6 < 4; var6++) {
                var7 = var5 + 1;
                var8 = var6 + 1;
                if (!param0) {
                  var9 = var6 * 192 - 384;
                  var11 = var5 * 192 - 384;
                  var10 = -384 + var8 * 192;
                  var12 = var7 * 192 - 384;
                } else {
                  var9 = (int)Math.round(384.0 * Math.tan(-0.7853981633974483 + (double)var6 * 3.141592653589793 / 2.0 / 4.0));
                  var10 = (int)Math.round(Math.tan(-0.7853981633974483 + (double)var8 * 3.141592653589793 / 2.0 / 4.0) * 384.0);
                  var11 = (int)Math.round(384.0 * Math.tan(3.141592653589793 * (double)var5 / 2.0 / 4.0 - 0.7853981633974483));
                  var12 = (int)Math.round(Math.tan(3.141592653589793 * (double)var7 / 2.0 / 4.0 - 0.7853981633974483) * 384.0);
                }
                var13 = -384;
                var14 = 384;
                var15 = -1;
                var16 = -1;
                var17 = -1;
                var18 = -1;
                var19 = -1;
                var20 = var4;
                if (var20 != 0) {
                  if (var20 != 1) {
                    if (var20 == 2) {
                      var15 = var22.a(var9, var14, var12);
                      var16 = var22.a(var10, var14, var12);
                      var17 = var22.a(var9, var14, var11);
                      var18 = var22.a(var10, var14, var11);
                      var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                    } else {
                      if (var20 != 3) {
                        if (4 != var20) {
                          if (var20 == 5) {
                            var15 = var22.a(var14, var10, var12);
                            var16 = var22.a(var14, var9, var12);
                            var17 = var22.a(var14, var10, var11);
                            var18 = var22.a(var14, var9, var11);
                            var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                          }
                        } else {
                          var15 = var22.a(var13, var9, var12);
                          var16 = var22.a(var13, var10, var12);
                          var17 = var22.a(var13, var9, var11);
                          var18 = var22.a(var13, var10, var11);
                          var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                        }
                      } else {
                        var15 = var22.a(var10, var13, var12);
                        var16 = var22.a(var9, var13, var12);
                        var17 = var22.a(var10, var13, var11);
                        var18 = var22.a(var9, var13, var11);
                        var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                      }
                    }
                  } else {
                    var15 = var22.a(var10, var12, var14);
                    var16 = var22.a(var9, var12, var14);
                    var17 = var22.a(var10, var11, var14);
                    var18 = var22.a(var9, var11, var14);
                    var19 = id.a(param1[var4], (short)var17, (short)var18, var22, false, (short)var16);
                  }
                } else {
                  var15 = var22.a(var9, var12, var13);
                  var16 = var22.a(var10, var12, var13);
                  var17 = var22.a(var9, var11, var13);
                  var18 = var22.a(var10, var11, var13);
                  var19 = id.a(param1[var4], (short)var18, (short)var17, var22, false, (short)var15);
                }
                var22.a(var15, var17, var16, (byte) 1, (byte)var19, (short) 128, (short)(4 * (var4 * 4 + var5) + var6));
                var22.a(var18, var16, var17, (byte) 1, (byte)var19, (short) 128, (short)((var5 + var4 * 4) * 4 + var6));
              }
            }
          }
          stackIn_33_0 = var22.a(126, 43690, 1, 0, 0);
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("th.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        qp var2;
        int var3;
        qp var4;
        var3 = Vertigo2.field_L ? 1 : 0;
        while (this.field_d < this.field_b) {
          var4 = this.field_c[this.field_d];
          var2 = var4;
          if (!var4.field_i.b(0)) {
            this.a(var4, 1, 0);
            return false;
          }
          if (var4.field_b >= 0 &&
            !var4.field_i.c(11321, var4.field_b)) {
            this.a(var2, 1, var4.field_i.b(var4.field_b, 100));
            return false;
          }
          if (null != var4.field_e &&
            !var4.field_i.c(var4.field_e, param0 ^ -21493)) {
            this.a(var2, 1, var4.field_i.a(var4.field_e, param0 + 21493));
            return false;
          }
          if (var4.field_b < 0 &&
            null == var4.field_e &&
            var4.field_a != null &&
            !var4.field_i.a((byte) -112)) {
            this.a(var2, 1, var4.field_i.d(-1));
            return false;
          }
          this.field_d = this.field_d + 1;
        }
        if (param0 == -21493) {
          return true;
        }
        return false;
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "2 players can work together to paint all the blocks on the map purple. If either player is killed, both players have to start again. This mode is only available in unrated games.";
        field_f = new er[23];
        field_a = new lg[2];
    }
}
