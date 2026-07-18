/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends an {
    static vn field_E;
    static ij field_H;
    private int field_F;
    private vc field_G;

    final String d(int param0) {
        if (!(!((np) this).field_l)) {
            return ((np) this).field_G.b((byte) -109);
        }
        int var2 = -31 / ((10 - param0) / 58);
        return null;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
            ((np) this).field_F = ((np) this).field_F + 1;
            super.a(param0, (byte) -110, param2, param3);
            int var5_int = -62 / ((param1 - 46) / 42);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "np.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        rh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vn var13 = null;
        vn var14 = null;
        vn var15 = null;
        vn var16 = null;
        var11 = ZombieDawn.field_J;
        super.a(param0, param1, param2, param3 + param3);
        if (param1 == 0) {
          var5 = param2 + ((np) this).field_k - -(((np) this).field_i >> 1);
          var6 = ((np) this).field_j + (param0 + (((np) this).field_n >> 1));
          var8 = ((np) this).field_G.a((byte) -76);
          if (var8 != se.field_l) {
            if (gj.field_v != var8) {
              if (var8 != uc.field_b) {
                if (mc.field_g != var8) {
                  return;
                } else {
                  var13 = dj.field_k[1];
                  var13.b(var5 - (var13.field_w >> 1), -(var13.field_t >> 1) + var6, 256);
                  return;
                }
              } else {
                var14 = dj.field_k[2];
                var14.b(-(var14.field_w >> 1) + var5, -(var14.field_t >> 1) + var6, 256);
                return;
              }
            } else {
              var16 = dj.field_k[0];
              var9 = var16.field_r << 1;
              var10 = var16.field_q << 1;
              if (tm.field_m != null) {
                if (tm.field_m.field_w >= var9) {
                  if (var10 > tm.field_m.field_t) {
                    tm.field_m = new vn(var9, var10);
                    ki.a((byte) -94, tm.field_m);
                    var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((np) this).field_F << 10, 4096);
                    pa.a(-21189);
                    tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                    return;
                  } else {
                    ki.a((byte) -86, tm.field_m);
                    bi.d();
                    var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((np) this).field_F << 10, 4096);
                    pa.a(-21189);
                    tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                    return;
                  }
                } else {
                  tm.field_m = new vn(var9, var10);
                  ki.a((byte) -94, tm.field_m);
                  var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((np) this).field_F << 10, 4096);
                  pa.a(-21189);
                  tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                  return;
                }
              } else {
                tm.field_m = new vn(var9, var10);
                ki.a((byte) -94, tm.field_m);
                var16.a(112, 144, var16.field_r << 4, var16.field_q << 4, -((np) this).field_F << 10, 4096);
                pa.a(-21189);
                tm.field_m.b(-var16.field_r + var5, -var16.field_q + var6, 256);
                return;
              }
            }
          } else {
            var15 = dj.field_k[0];
            var9 = var15.field_r << 1;
            var10 = var15.field_q << 1;
            if (tm.field_m != null) {
              if (tm.field_m.field_w >= var9) {
                if (var10 > tm.field_m.field_t) {
                  tm.field_m = new vn(var9, var10);
                  ki.a((byte) -94, tm.field_m);
                  var15.a(112, 144, var15.field_r << 4, var15.field_q << 4, -((np) this).field_F << 10, 4096);
                  pa.a(-21189);
                  tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
                  return;
                } else {
                  ki.a((byte) -86, tm.field_m);
                  bi.d();
                  var15.a(112, 144, var15.field_r << 4, var15.field_q << 4, -((np) this).field_F << 10, 4096);
                  pa.a(-21189);
                  tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
                  return;
                }
              } else {
                tm.field_m = new vn(var9, var10);
                ki.a((byte) -94, tm.field_m);
                var15.a(112, 144, var15.field_r << 4, var15.field_q << 4, -((np) this).field_F << 10, 4096);
                pa.a(-21189);
                tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
                return;
              }
            } else {
              tm.field_m = new vn(var9, var10);
              ki.a((byte) -94, tm.field_m);
              var15.a(112, 144, var15.field_r << 4, var15.field_q << 4, -((np) this).field_F << 10, 4096);
              pa.a(-21189);
              tm.field_m.b(-var15.field_r + var5, -var15.field_q + var6, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_E = null;
        field_H = null;
    }

    final static void a(byte param0, int param1) {
        int[] var5 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        try {
            var5 = new int[1 + ln.field_c.length];
            var2 = var5;
            for (var3 = 0; ln.field_c.length > var3; var3++) {
                var5[var3] = ln.field_c[var3];
            }
            var2[var2.length + -1] = param1;
            ln.field_c = var2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "np.F(" + 9 + ',' + param1 + ')');
        }
    }

    np(vc param0) {
        try {
            ((np) this).field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "np.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0, ga param1) {
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
            if (param0 > 67) {
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
            stackOut_5_1 = new StringBuilder().append("np.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    static {
    }
}
