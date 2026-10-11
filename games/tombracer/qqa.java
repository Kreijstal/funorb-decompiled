/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqa extends hha {
    static String field_p;
    uia field_r;
    static boolean[] field_n;
    int field_s;
    static String field_o;
    static apa field_t;
    byte field_q;

    final byte[] b(byte param0) {
        if (param0 != -126) {
          return (byte[]) null;
        }
        if (!this.field_m &&
          this.field_r.field_h >= -this.field_q + this.field_r.field_g.length) {
          return this.field_r.field_g;
        }
        throw new RuntimeException();
    }

    final int a(byte param0) {
        if (null == this.field_r) {
          return 0;
        }
        if (param0 <= -7) {
          return 100 * this.field_r.field_h / (-this.field_q + this.field_r.field_g.length);
        }
        return -52;
    }

    final static boolean a(uia param0, char[] param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != param1[0]) {
            return false;
          }
          var4_int = param0.field_h;
          var5 = 1;
          if (!param3) {
            field_n = (boolean[]) null;
          }
          L2: while (true) {
            if (param1.length > var5) {
              stackIn_16_0 = param0.field_g.length;
              if (var6 != 0) {
                break L2;
              }
              if (stackIn_16_0 != param0.field_h &&
                param0.c((byte) 106) == param1[var5]) {
                var5++;
                continue;
              } else {
                param0.field_h = var4_int;
                return false;
              }
            }
            param0.field_h = var4_int;
            stackIn_16_0 = 1;
            break;
          }
          return stackIn_16_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("qqa.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ima a(int[] param0, oc param1, int param2, byte param3) {
        ima stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_43_0 = 0;
        ima stackIn_58_0 = null;
        Object stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = null;
          var5 = null;
          var6 = null;
          var7 = null;
          if (param3 != -6) {
            stackIn_3_0 = (ima) null;
            return stackIn_3_0;
          }
          if (param1.field_g != null) {
            var8 = param1.field_F;
            var45 = new int[var8];
            var46 = new int[var8];
            var47 = new int[var8];
            var48 = new int[var8];
            var49 = new int[var8];
            var50 = new int[var8];
            var15 = 0;
            do {
              if (var15 >= var8) {
                var15 = 0;
                break;
              }
              var45[var15] = 2147483647;
              var46[var15] = -2147483647;
              var47[var15] = 2147483647;
              var48[var15] = -2147483647;
              var49[var15] = 2147483647;
              var50[var15] = -2147483647;
              var15++;
            } while (var23 == 0);
            L0: while (true) {
              stackIn_12_0 = param2;
              stackIn_12_1 = var15;
              if (stackIn_12_0 > stackIn_12_1) {
                var16 = param0[var15];
                stackIn_43_0 = -1;
                if (var23 == 0) {
                  if (stackIn_43_0 != param1.field_g[var16]) {
                    var17_int = param1.field_g[var16] & 255;
                    var18_int = 0;
                    while (3 > var18_int) {
                      stackIn_12_0 = -1;
                      stackIn_12_1 = ~var18_int;
                      if (stackIn_12_0 == stackIn_12_1) {
                        var19_int = param1.field_a[var16];
                      } else if (var18_int != 1) {
                        var19_int = param1.field_J[var16];
                      } else {
                        var19_int = param1.field_t[var16];
                      }
                      var20 = param1.field_b[var19_int];
                      var21 = param1.field_I[var19_int];
                      var22 = param1.field_p[var19_int];
                      if (var20 < var45[var17_int]) {
                        var45[var17_int] = var20;
                      }
                      if (var20 > var46[var17_int]) {
                        var46[var17_int] = var20;
                      }
                      if (var21 < var47[var17_int]) {
                        var47[var17_int] = var21;
                      }
                      if (var21 > var48[var17_int]) {
                        var48[var17_int] = var21;
                      }
                      if (var22 < var49[var17_int]) {
                        var49[var17_int] = var22;
                      }
                      if (var50[var17_int] < var22) {
                        var50[var17_int] = var22;
                      }
                      var18_int++;
                    }
                  }
                  var15++;
                  continue;
                }
              } else {
                stackIn_43_0 = var8;
              }
              var24 = new int[stackIn_43_0];
              var4 = var24;
              var25 = new int[var8];
              var5 = var25;
              var7 = new float[var8][];
              var26 = new int[var8];
              var6 = var26;
              var15 = 0;
              do {
                if (var15 >= var8) {
                  break L0;
                }
                var16 = param1.field_u[var15];
                if (var16 > 0) {
                  boolean decompiledFrameRemainder0 = true;
                  var24[var15] = (var46[var15] + var45[var15]) / 2;
                  var25[var15] = (var48[var15] + var47[var15]) / 2;
                  var26[var15] = (var49[var15] + var50[var15]) / 2;
                  if (1 != var16) {
                    if (var16 == 2) {
                      var19 = 64.0f / (float)param1.field_x[var15];
                      var18 = 64.0f / (float)param1.field_f[var15];
                      var17 = 64.0f / (float)param1.field_j[var15];
                      decompiledFrameRemainder0 = (var23 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      var19 = (float)param1.field_x[var15] / 1024.0f;
                      var18 = (float)param1.field_f[var15] / 1024.0f;
                      var17 = (float)param1.field_j[var15] / 1024.0f;
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (1 == var16 ||
                    var23 != 0)) {
                    var20 = param1.field_j[var15];
                    var18 = 64.0f / (float)param1.field_f[var15];
                    if (var20 == 0) {
                      var19 = 1.0f;
                      var17 = 1.0f;
                      if (var23 != 0) {
                        if (0 < var20) {
                          var19 = (float)var20 / 1024.0f;
                          var17 = 1.0f;
                          var17 = (float)(-var20) / 1024.0f;
                          var19 = 1.0f;
                        } else {
                          var17 = (float)(-var20) / 1024.0f;
                          var19 = 1.0f;
                        }
                      }
                    } else {
                      if (0 < var20) {
                        var19 = (float)var20 / 1024.0f;
                        var17 = 1.0f;
                        if (var23 != 0) {
                          var17 = (float)(-var20) / 1024.0f;
                          var19 = 1.0f;
                        }
                      } else {
                        var17 = (float)(-var20) / 1024.0f;
                        var19 = 1.0f;
                      }
                    }
                  }
                  ((Object[]) (var7))[var15] = sea.a(var18, var19, 16486, (int) param1.field_K[var15], var17, sea.c((int) param1.field_i[var15], 255), (int) param1.field_s[var15], (int) param1.field_q[var15]);
                }
                var15++;
              } while (var23 == 0);
              break L0;
            }
          }
          stackIn_58_0 = new ima((int[]) (var4), (int[]) (var5), (int[]) (var6), (float[][]) (var7));
          return stackIn_58_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_61_0 = var4;
          stackIn_61_1 = new StringBuilder().append("qqa.G(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_61_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_t = null;
        field_n = null;
        if (param0 != 0) {
          return;
        }
        field_p = null;
        field_o = null;
    }

    qqa() {
    }

    static {
        field_p = "Move";
        field_o = "Passwords can only contain letters and numbers";
    }
}
