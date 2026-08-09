/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends qm {
    private ml field_P;
    private int field_Q;
    static bb field_O;
    static String field_N;

    final void a(int param0, int param1, int param2, ng param3) {
        try {
            this.field_Q = this.field_Q + 1;
            if (param0 != 40) {
                field_N = (String) null;
            }
            super.a(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vc.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (this.field_D) {
            return this.field_P.b((byte) -7);
        }
        if (param0 > 16) {
            return null;
        }
        field_N = (String) null;
        return null;
    }

    final boolean a(ng param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 27) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_P = (ml) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vc.HA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0, int param1, int param2, sb param3, int param4, sb param5, int param6, int param7, int param8, jl param9, int param10, int param11, int param12, sb param13, int param14, jl param15, byte param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          L0: {
            dj.a((byte) -109, param15, param9, param6);
            jj.a(param17, false, param0, param7, param18);
            op.b(param8, param20, true);
            lg.a(param5, param2, -118, param3, param4, param1);
            pb.a(param12, param13, 16, param10);
            ll.a((byte) -113, param19, param11, param14);
            var21_int = -33 / ((param16 - 20) / 57);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("vc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        dj var9;
        int var10;
        int var11;
        int var12;
        tf var14;
        tf var15;
        tf var16;
        tf var17;
        var12 = Pixelate.field_H ? 1 : 0;
        super.a(param0, param1, param2, (byte) 125);
        if (param1 == 0) {
          var6 = -40 / ((param3 - 70) / 49);
          var5 = (this.field_E >> 317851265) + param2 + this.field_z;
          var7 = (this.field_C >> -2008650559) + (this.field_p + param0);
          var9 = this.field_P.a((byte) 110);
          if (uo.field_b == var9) {
            var17 = ha.field_g[0];
            var10 = var17.field_A << -1110954975;
            var11 = var17.field_B << -918288095;
            if (null != u.field_k) {
              if (var10 <= u.field_k.field_F) {
                if (u.field_k.field_E >= var11) {
                  h.a(-71, u.field_k);
                  t.d();
                  var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
                  ia.a((byte) 92);
                  u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                  return;
                } else {
                  u.field_k = new tf(var10, var11);
                  h.a(-83, u.field_k);
                  var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
                  ia.a((byte) 92);
                  u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                  return;
                }
              } else {
                u.field_k = new tf(var10, var11);
                h.a(-83, u.field_k);
                var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
                ia.a((byte) 92);
                u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
                return;
              }
            } else {
              u.field_k = new tf(var10, var11);
              h.a(-83, u.field_k);
              var17.a(112, 144, var17.field_A << 2063641924, var17.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
              ia.a((byte) 92);
              u.field_k.b(var5 + -var17.field_A, var7 - var17.field_B, 256);
              return;
            }
          } else {
            if (var9 != tg.field_j) {
              if (var9 != sk.field_a) {
                if (qk.field_g != var9) {
                  return;
                } else {
                  var15 = ha.field_g[1];
                  var15.b(-(var15.field_F >> 606297409) + var5, var7 - (var15.field_E >> 1826444161), 256);
                  return;
                }
              } else {
                var14 = ha.field_g[2];
                var14.b(var5 + -(var14.field_F >> -249940383), -(var14.field_E >> 1066855265) + var7, 256);
                return;
              }
            } else {
              var16 = ha.field_g[0];
              var10 = var16.field_A << -1110954975;
              var11 = var16.field_B << -918288095;
              if (null != u.field_k) {
                if (var10 <= u.field_k.field_F) {
                  if (u.field_k.field_E >= var11) {
                    h.a(-71, u.field_k);
                    t.d();
                    var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
                    ia.a((byte) 92);
                    u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                    return;
                  } else {
                    u.field_k = new tf(var10, var11);
                    h.a(-83, u.field_k);
                    var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
                    ia.a((byte) 92);
                    u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                    return;
                  }
                } else {
                  u.field_k = new tf(var10, var11);
                  h.a(-83, u.field_k);
                  var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
                  ia.a((byte) 92);
                  u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                  return;
                }
              } else {
                u.field_k = new tf(var10, var11);
                h.a(-83, u.field_k);
                var16.a(112, 144, var16.field_A << 2063641924, var16.field_B << -1692532060, -this.field_Q << 1685817834, 4096);
                ia.a((byte) 92);
                u.field_k.b(var5 + -var16.field_A, var7 - var16.field_B, 256);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        jl var2;
        if (param0 > -84) {
          var2 = (jl) null;
          vc.a(16, 19, 82, (sb) null, 15, (sb) null, -91, -16, 3, (jl) null, 119, -31, -67, (sb) null, -69, (jl) null, (byte) 15, -5, 94, -75, -69);
          field_N = null;
          field_O = null;
          return;
        } else {
          field_N = null;
          field_O = null;
          return;
        }
    }

    vc(ml param0) {
        try {
            this.field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_O = new bb();
        field_N = "Connection timed out. Please try using a different server.";
    }
}
