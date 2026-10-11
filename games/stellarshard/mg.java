/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    int field_u;
    boolean[] field_I;
    int field_B;
    int[] field_l;
    int[] field_a;
    int[][] field_f;
    int[][] field_i;
    int field_F;
    int field_d;
    int[] field_p;
    byte[] field_G;
    int field_K;
    int field_j;
    static int field_y;
    byte[] field_z;
    int field_w;
    int field_n;
    int field_q;
    int field_g;
    byte field_o;
    int field_m;
    static int field_t;
    int field_C;
    byte[] field_H;
    static int[] field_h;
    byte[] field_J;
    int field_A;
    int field_c;
    byte[] field_s;
    byte[] field_D;
    byte[][] field_v;
    static String field_k;
    boolean[] field_b;
    int field_r;
    int[] field_x;
    int[][] field_e;

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
          mg.a(true);
        }
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = stellarshard.field_B;
        try {
          if (param0 >= 0 &&
            param4 < cc.field_c) {
            if (param3 < 0 &&
              param7 < 0 &&
              param1 < 0) {
              return;
            }
            if (param3 >= cc.field_m &&
              param7 >= cc.field_m &&
              param1 >= cc.field_m) {
              return;
            }
            if (param6 != -445834032) {
              mg.a(false);
            }
            var14 = param0 - param4;
            if (param4 == param8) {
              if (param4 == param0) {
                var12 = 0;
                var9_int = param3 << 16;
                var10 = param7 << 16;
                var11 = 0;
              } else {
                var15 = -param8 + param0;
                if (param3 < param7) {
                  var12 = (param1 - param7 << 16) / var15;
                  var9_int = param3 << 16;
                  var11 = (-param3 + param1 << 16) / var14;
                  var10 = param7 << 16;
                } else {
                  var10 = param3 << 16;
                  var11 = (param1 - param7 << 16) / var15;
                  var9_int = param7 << 16;
                  var12 = (-param3 + param1 << 16) / var14;
                }
              }
              if (0 > param4) {
                param4 = Math.min(-param4, -param4 + param8);
                var10 = var10 + param4 * var12;
                var9_int = var9_int + param4 * var11;
                param4 = 0;
              }
              var13 = 0;
            } else {
              var10 = param3 << 16;
              var9_int = param3 << 16;
              var15 = -param4 + param8;
              var11 = (-param3 + param7 << 16) / var15;
              var12 = (-param3 + param1 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param4 < 0) {
                if (param8 < 0) {
                  param4 = param8 - param4;
                  var9_int = var9_int + param4 * var11;
                  var10 = var10 + param4 * var12;
                  param4 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param4 = -param4;
                  var10 = var10 + param4 * var12;
                  var9_int = var9_int + param4 * var11;
                  param4 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = cc.field_i[param4];
                while (param8 > param4) {
                  var17 = var9_int >> 16;
                  if (var17 < cc.field_m) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        var17 < cc.field_m) {
                        aj.a(param5, true, var18, param2, var17 + var16Lifetime2);
                      }
                    } else {
                      if (var18 + var17 >= cc.field_m) {
                        var18 = -var17 + cc.field_m - 1;
                      }
                      if (var17 >= 0) {
                        aj.a(param5, true, var18, param2, var17 + var16Lifetime2);
                      } else {
                        aj.a(param5, true, var17 + var18, param2, var16Lifetime2);
                      }
                    }
                  }
                  param4++;
                  if (param4 >= cc.field_c) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + ti.field_i;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param8 + param0;
              if (0 != var16Lifetime3) {
                var17Lifetime2 = param1 << 16;
                if (var13 != 0) {
                  var10 = param7 << 16;
                } else {
                  var9_int = param7 << 16;
                }
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (param4 < 0) {
              param4 = -param4;
              var9_int = var9_int + param4 * var11;
              var10 = var10 + var12 * param4;
              param4 = 0;
            }
            var15Lifetime1 = cc.field_i[param4];
            while (param0 > param4) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < cc.field_m) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (0 == var17Lifetime1) {
                  if (var16Lifetime1 >= 0 &&
                    cc.field_m > var16Lifetime1) {
                    aj.a(param5, true, var17Lifetime1, param2, var16Lifetime1 + var15Lifetime1);
                  }
                } else {
                  if (var17Lifetime1 + var16Lifetime1 >= cc.field_m) {
                    var17Lifetime1 = -var16Lifetime1 + (cc.field_m - 1);
                  }
                  if (var16Lifetime1 < 0) {
                    aj.a(param5, true, var16Lifetime1 + var17Lifetime1, param2, var15Lifetime1);
                  } else {
                    aj.a(param5, true, var17Lifetime1, param2, var15Lifetime1 + var16Lifetime1);
                  }
                }
              }
              param4++;
              if (cc.field_c <= param4) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + ti.field_i;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_79_0 = var9;
          stackIn_79_1 = new StringBuilder().append("mg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    mg() {
        this.field_f = new int[6][258];
        this.field_l = new int[257];
        this.field_I = new boolean[16];
        this.field_u = 0;
        this.field_G = new byte[18002];
        this.field_i = new int[6][258];
        this.field_z = new byte[4096];
        this.field_a = new int[16];
        this.field_r = 0;
        this.field_p = new int[6];
        this.field_v = new byte[6][258];
        this.field_s = new byte[256];
        this.field_b = new boolean[256];
        this.field_x = new int[256];
        this.field_e = new int[6][258];
        this.field_J = new byte[18002];
    }

    static {
        field_t = 0;
        field_k = "Player";
    }
}
