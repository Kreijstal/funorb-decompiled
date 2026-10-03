/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends pb {
    static int field_w;
    static cb field_B;
    qc field_A;
    byte field_E;
    static byte[][] field_C;
    int field_D;
    static int field_x;
    static dm field_y;
    static String field_z;

    public static void e(byte param0) {
        if (param0 < 88) {
            return;
        }
        field_y = null;
        field_z = null;
        field_B = null;
        field_C = (byte[][]) null;
    }

    final byte[] e(int param0) {
        if (this.field_u) {
            throw new RuntimeException();
        }
        if (this.field_A.field_f >= this.field_A.field_j.length - this.field_E) {
            if (param0 != 397) {
                this.g(-105);
            }
            return this.field_A.field_j;
        }
        throw new RuntimeException();
    }

    final static na[] a(boolean param0, rh param1, int param2, int param3) {
        RuntimeException var4 = null;
        na[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = (na[]) null;
            return stackIn_2_0;
          }
          if (mf.a(param2, param3, 104, param1)) {
            return ji.c(0);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("sd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
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
        var19 = Geoblox.field_C;
        try {
          if ((param5 >= 0) &&
              (param8 < mh.field_h)) {
            if ((0 > param1) &&
                (param0 < 0) &&
                (param6 < 0)) {
              return;
            }
            if ((param1 >= mh.field_c) &&
                (param0 >= mh.field_c) &&
                (mh.field_c <= param6)) {
              return;
            }
            var14 = -param8 + param5;
            if (param7 == param8) {
              if (param8 != param5) {
                var15 = -param7 + param5;
                if (param0 > param1) {
                  var10 = param0 << 16;
                  var11 = (-param1 + param6 << 16) / var14;
                  var9_int = param1 << 16;
                  var12 = (param6 - param0 << 16) / var15;
                } else {
                  var10 = param1 << 16;
                  var11 = (param6 - param0 << 16) / var15;
                  var9_int = param0 << 16;
                  var12 = (-param1 + param6 << 16) / var14;
                }
              } else {
                var11 = 0;
                var10 = param0 << 16;
                var9_int = param1 << 16;
                var12 = 0;
              }
              var13 = 0;
              if (param8 < 0) {
                param8 = Math.min(-param8, -param8 + param7);
                var10 = var10 + var12 * param8;
                var9_int = var9_int + param8 * var11;
                param8 = 0;
              }
            } else {
              var10 = param1 << 16;
              var9_int = param1 << 16;
              var15 = -param8 + param7;
              var11 = (-param1 + param0 << 16) / var15;
              var12 = (param6 - param1 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              L6: {
                if (0 > param8) {
                  if (param7 < 0) {
                    param8 = param7 - param8;
                    var9_int = var9_int + var11 * param8;
                    var10 = var10 + var12 * param8;
                    param8 = param7;
                    break L6;
                  }
                  param8 = -param8;
                  var10 = var10 + var12 * param8;
                  var9_int = var9_int + var11 * param8;
                  param8 = 0;
                }
                var16 = mh.field_b[param8];
                while (param8 < param7) {
                  var17 = var9_int >> 16;
                  if (mh.field_c > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (var17 + var18 >= mh.field_c) {
                        var18 = -1 + (-var17 + mh.field_c);
                      }
                      if (0 <= var17) {
                        ib.a(47, param4, var16 + var17, param2, var18);
                      } else {
                        ib.a(57, param4, var16, param2, var17 + var18);
                      }
                    } else {
                      if ((var17 >= 0) &&
                          (mh.field_c > var17)) {
                        ib.a(-61, param4, var17 + var16, param2, var18);
                      }
                    }
                  }
                  param8++;
                  if (param8 >= mh.field_h) {
                    return;
                  }
                  var16 = var16 + vb.field_f;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16 = -param7 + param5;
              if (var16 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                var17 = param6 << 16;
                if (var13 == 0) {
                  var9_int = param0 << 16;
                } else {
                  var10 = param0 << 16;
                }
                var11 = (var17 - var9_int) / var16;
                var12 = (var17 - var10) / var16;
              }
            }
            if (0 > param8) {
              param8 = -param8;
              var10 = var10 + var12 * param8;
              var9_int = var9_int + param8 * var11;
              param8 = 0;
            }
            var16 = -91 % ((param3 - 74) / 33);
            var15 = mh.field_b[param8];
            while (param5 > param8) {
              var17 = var9_int >> 16;
              if (mh.field_c > var17) {
                var18 = (var10 >> 16) - (var9_int >> 16);
                if (var18 == 0) {
                  if ((var17 >= 0) &&
                      (mh.field_c > var17)) {
                    ib.a(-67, param4, var17 + var15, param2, var18);
                  }
                } else {
                  if (mh.field_c <= var18 + var17) {
                    var18 = -var17 + mh.field_c - 1;
                  }
                  if (0 > var17) {
                    ib.a(127, param4, var15, param2, var17 + var18);
                  } else {
                    ib.a(115, param4, var17 + var15, param2, var18);
                  }
                }
              }
              param8++;
              if (mh.field_h <= param8) {
                return;
              }
              var9_int = var9_int + var11;
              var10 = var10 + var12;
              var15 = var15 + vb.field_f;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_74_0 = var9;
          stackIn_74_1 = new StringBuilder().append("sd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int g(int param0) {
        if (param0 != 0) {
            return 76;
        }
        if (null != this.field_A) {
            return 100 * this.field_A.field_f / (-this.field_E + this.field_A.field_j.length);
        }
        return 0;
    }

    sd() {
    }

    final static void h(int param0) {
        pc.a(17, false);
        int var1 = -24 / ((param0 + 4) / 34);
    }

    static {
        field_C = new byte[50][];
        uf.a(116, 50);
    }
}
