/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends lg {
    static mm field_G;
    private int field_H;
    private sk field_F;
    static int field_E;
    static int field_C;
    static int[] field_D;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        cd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        t var13 = null;
        t var14 = null;
        t var15 = null;
        t var16 = null;
        var11 = Torquing.field_u;
        super.a(param0, (byte) -126, param2, param3);
        if (0 == param0) {
          if (param1 <= -7) {
            var5 = (((ub) this).field_p >> 1) + ((ub) this).field_w + param3;
            var6 = ((ub) this).field_k + param2 - -(((ub) this).field_o >> 1);
            var8 = ((ub) this).field_F.a((byte) -87);
            if (var8 == q.field_a) {
              var16 = wj.field_h[0];
              var9 = var16.field_w << 1;
              var10 = var16.field_u << 1;
              if (dp.field_b != null) {
                if (dp.field_b.field_s >= var9) {
                  if (var10 > dp.field_b.field_t) {
                    dp.field_b = new t(var9, var10);
                    tm.a((byte) 99, dp.field_b);
                    var16.c(112, 144, var16.field_w << 4, var16.field_u << 4, -((ub) this).field_H << 10, 4096);
                    r.a(123);
                    dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                    return;
                  } else {
                    tm.a((byte) -105, dp.field_b);
                    ph.b();
                    var16.c(112, 144, var16.field_w << 4, var16.field_u << 4, -((ub) this).field_H << 10, 4096);
                    r.a(123);
                    dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                    return;
                  }
                } else {
                  dp.field_b = new t(var9, var10);
                  tm.a((byte) 99, dp.field_b);
                  var16.c(112, 144, var16.field_w << 4, var16.field_u << 4, -((ub) this).field_H << 10, 4096);
                  r.a(123);
                  dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                  return;
                }
              } else {
                dp.field_b = new t(var9, var10);
                tm.a((byte) 99, dp.field_b);
                var16.c(112, 144, var16.field_w << 4, var16.field_u << 4, -((ub) this).field_H << 10, 4096);
                r.a(123);
                dp.field_b.a(-var16.field_w + var5, -var16.field_u + var6, 256);
                return;
              }
            } else {
              if (gn.field_h != var8) {
                if (var8 != so.field_u) {
                  if (so.field_s == var8) {
                    var13 = wj.field_h[1];
                    var13.a(var5 - (var13.field_s >> 1), -(var13.field_t >> 1) + var6, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var14 = wj.field_h[2];
                  var14.a(-(var14.field_s >> 1) + var5, var6 + -(var14.field_t >> 1), 256);
                  return;
                }
              } else {
                var15 = wj.field_h[0];
                var9 = var15.field_w << 1;
                var10 = var15.field_u << 1;
                if (dp.field_b != null) {
                  if (dp.field_b.field_s >= var9) {
                    if (var10 > dp.field_b.field_t) {
                      dp.field_b = new t(var9, var10);
                      tm.a((byte) 99, dp.field_b);
                      var15.c(112, 144, var15.field_w << 4, var15.field_u << 4, -((ub) this).field_H << 10, 4096);
                      r.a(123);
                      dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                      return;
                    } else {
                      tm.a((byte) -105, dp.field_b);
                      ph.b();
                      var15.c(112, 144, var15.field_w << 4, var15.field_u << 4, -((ub) this).field_H << 10, 4096);
                      r.a(123);
                      dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                      return;
                    }
                  } else {
                    dp.field_b = new t(var9, var10);
                    tm.a((byte) 99, dp.field_b);
                    var15.c(112, 144, var15.field_w << 4, var15.field_u << 4, -((ub) this).field_H << 10, 4096);
                    r.a(123);
                    dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                    return;
                  }
                } else {
                  dp.field_b = new t(var9, var10);
                  tm.a((byte) 99, dp.field_b);
                  var15.c(112, 144, var15.field_w << 4, var15.field_u << 4, -((ub) this).field_H << 10, 4096);
                  r.a(123);
                  dp.field_b.a(-var15.field_w + var5, -var15.field_u + var6, 256);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, long param1) {
        if (param0 == 1976) {
          if (0L >= param1) {
            return;
          } else {
            if (param1 % 10L == 0L) {
              op.a(-1L + param1, 112);
              op.a(1L, 93);
              return;
            } else {
              op.a(param1, param0 + -1897);
              return;
            }
          }
        } else {
          ub.a(-53, -74L);
          if (0L >= param1) {
            return;
          } else {
            if (param1 % 10L == 0L) {
              op.a(-1L + param1, 112);
              op.a(1L, 93);
              return;
            } else {
              op.a(param1, param0 + -1897);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_G = null;
        field_D = null;
        if (param0 != -19) {
            ub.a((byte) -112);
        }
    }

    final boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ub.JA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, gm param1, int param2, int param3) {
        try {
            ((ub) this).field_H = ((ub) this).field_H + 1;
            int var5_int = -105 % ((param0 - -28) / 43);
            super.a(-84, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ub.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String b(int param0) {
        if (((ub) this).field_s) {
            return ((ub) this).field_F.a(param0 ^ 124);
        }
        if (param0 == 0) {
            return null;
        }
        ub.a((byte) 125);
        return null;
    }

    ub(sk param0) {
        try {
            ((ub) this).field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ub.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
    }
}
