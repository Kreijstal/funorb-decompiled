/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static boolean field_m;
    int field_w;
    static hd field_R;
    short[] field_z;
    byte field_u;
    short[] field_l;
    short[] field_o;
    short[] field_E;
    int[] field_d;
    short[] field_I;
    static hd field_j;
    int field_t;
    short[] field_p;
    int[] field_a;
    short[] field_v;
    short field_b;
    short[] field_N;
    int[] field_O;
    int field_s;
    int field_x;
    int field_y;
    int[] field_D;
    int field_h;
    short[] field_n;
    static int[] field_B;
    short[] field_F;
    short[] field_i;
    short field_g;
    short[] field_U;
    short[] field_f;
    byte[] field_G;
    int[] field_C;
    int[] field_H;
    int[] field_S;
    private boolean field_q;
    private static long[] field_c;
    short[] field_K;
    short[] field_M;
    int[] field_J;
    short[] field_T;
    static String field_L;
    short[] field_r;
    static kg[] field_Q;
    int[] field_e;
    short field_k;
    short[] field_P;
    static String field_A;

    final static void a(byte param0, boolean param1, boolean param2, String param3) {
        try {
            ou.a(param0 + 101);
            wd.field_l.k(param0 + 225);
            if (param0 != -101) {
                field_R = (hd) null;
            }
            pb.field_E = new pd(ep.field_b, (String) null, hk.field_G, param2, param1);
            we.field_a = new vo(wd.field_l, pb.field_E);
            wd.field_l.a(we.field_a, false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "kk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = Kickabout.field_G;
        if (!this.field_q) {
          L0: {
            this.field_q = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            if (!param0) {
              break L0;
            } else {
              this.a(true);
              break L0;
            }
          }
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (this.field_b <= var8) {
              this.field_s = var3;
              this.field_w = var7;
              this.field_t = var4;
              this.field_h = var5;
              this.field_y = var2;
              this.field_x = var6;
              return;
            } else {
              L2: {
                var9 = this.field_f[var8];
                var10 = this.field_r[var8];
                if (var10 <= var6) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var9 < var2) {
                  var2 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var11 = this.field_P[var8];
                if (var9 <= var5) {
                  break L4;
                } else {
                  var5 = var9;
                  break L4;
                }
              }
              L5: {
                if (var10 >= var3) {
                  break L5;
                } else {
                  var3 = var10;
                  break L5;
                }
              }
              L6: {
                if (var11 > var7) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Kickabout.field_G;
        for (var6 = 0; this.field_b > var6; var6++) {
            this.field_f[var6] = (short)(param1 * this.field_f[var6] / param3);
            this.field_r[var6] = (short)(this.field_r[var6] * param0 / param3);
            this.field_P[var6] = (short)(this.field_P[var6] * param4 / param3);
        }
        if (param2 != 256) {
            this.field_y = -57;
        }
        this.a(param2 + -311);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        for (var5 = param2; this.field_b > var5; var5++) {
            this.field_f[var5] = (short)(this.field_f[var5] + param1);
            this.field_r[var5] = (short)(this.field_r[var5] + param3);
            this.field_P[var5] = (short)(this.field_P[var5] + param0);
        }
        this.a(param2 + -68);
    }

    public static void a(byte param0) {
        field_c = null;
        field_R = null;
        if (param0 < 66) {
            kk.a((byte) -61);
        }
        field_L = null;
        field_A = null;
        field_B = null;
        field_Q = null;
        field_j = null;
    }

    private final void a(int param0) {
        int var2 = -26 / ((58 - param0) / 62);
        this.field_q = false;
    }

    final static boolean a(int param0, tf param1) {
        gn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        tf var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2 = param1.g(24009);
              if (param0 == -27054) {
                break L1;
              } else {
                var4 = (tf) null;
                kk.a(-43, (tf) null);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (!(var2 instanceof ak)) {
                  break L3;
                } else {
                  if (!(var2.field_d instanceof ak)) {
                    break L3;
                  } else {
                    if (((ak) ((Object) var2)).a((byte) 126) <= ((ak) ((Object) var2.field_d)).a((byte) 112)) {
                      var2 = var2.field_d;
                      continue L2;
                    } else {
                      stackIn_7_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              stackIn_10_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("kk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static ot a(up param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        gr var6 = null;
        ot stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -1;
              var4 = 0;
              var5 = param1;
              if (!param0.field_c) {
                var6 = tu.field_E;
                var3_int = var6.field_w;
                var5 = var6.field_R;
                var4 = var6.field_k;
                break L1;
              } else {
                break L1;
              }
            }
            stackIn_4_0 = kj.a(var3_int, 0, param0, var5, var4, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kk.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static cn a(int param0, sj param1, int param2, int param3, sj param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        cn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -43) {
                break L1;
              } else {
                field_B = (int[]) null;
                break L1;
              }
            }
            if (cu.a(param3, param1, param0, 112)) {
              stackIn_6_0 = nv.a(-109, param4.b(param0, -32669, param3));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("kk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cn) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    kk() {
        this.field_u = (byte) 0;
        this.field_q = false;
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_m = false;
            field_B = new int[2];
            field_c = new long[256];
            field_L = "Creating your account";
            field_A = "Choose whether to play home or away, then click the Ready button.";
            var2 = 0;
            L0: while (true) {
              if (var2 >= 256) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if ((var3 ^ -1) <= -9) {
                    field_c[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (1L != (var0 & 1L)) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = -3932672073523589310L ^ var0 >>> 372678849;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
