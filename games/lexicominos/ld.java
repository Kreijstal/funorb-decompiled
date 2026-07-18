/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends kf {
    private int field_F;
    private ma field_E;
    static String field_G;

    public static void j(int param0) {
        field_G = null;
    }

    final boolean a(byte param0, w param1) {
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
            if (param0 == 44) {
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
            stackOut_5_1 = new StringBuilder().append("ld.LA(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final String b(int param0) {
        if (param0 <= 121) {
            ld.i(55);
            if (!(!((ld) this).field_m)) {
                return ((ld) this).field_E.a((byte) 102);
            }
            return null;
        }
        if (!(!((ld) this).field_m)) {
            return ((ld) this).field_E.a((byte) 102);
        }
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        Object var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new byte[var2_int];
              if (param0 >= 70) {
                break L1;
              } else {
                var4 = null;
                de discarded$2 = ld.a((Throwable) null, (String) null);
                break L1;
              }
            }
            o.a(param1, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ld.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void i(int param0) {
        if (param0 != -29115) {
            return;
        }
        ni.a(-125, 4);
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
            ((ld) this).field_F = ((ld) this).field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ld.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    ld(ma param0) {
        try {
            ((ld) this).field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        sc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        db var13 = null;
        db var14 = null;
        db var15 = null;
        db var16 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = (((ld) this).field_j >> 1) + ((ld) this).field_t + param2;
          var6 = ((ld) this).field_o + (param1 + (((ld) this).field_v >> 1));
          var8 = ((ld) this).field_E.b((byte) 116);
          if (jj.field_e != var8) {
            if (be.field_q != var8) {
              if (ni.field_b != var8) {
                if (rh.field_p != var8) {
                  return;
                } else {
                  var13 = be.field_b[1];
                  var13.d(-(var13.field_p >> 1) + var5, var6 + -(var13.field_u >> 1), 256);
                  return;
                }
              } else {
                var14 = be.field_b[2];
                var14.d(var5 - (var14.field_p >> 1), var6 + -(var14.field_u >> 1), 256);
                return;
              }
            } else {
              var16 = be.field_b[0];
              var9 = var16.field_r << 1;
              var10 = var16.field_x << 1;
              if (dd.field_f != null) {
                if (var9 <= dd.field_f.field_p) {
                  if (dd.field_f.field_u < var10) {
                    dd.field_f = new db(var9, var10);
                    de.a(dd.field_f, param0 ^ -117);
                    var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -((ld) this).field_F << 10, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                    return;
                  } else {
                    de.a(dd.field_f, 6);
                    lf.a();
                    var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -((ld) this).field_F << 10, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                    return;
                  }
                } else {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -((ld) this).field_F << 10, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                  return;
                }
              } else {
                dd.field_f = new db(var9, var10);
                de.a(dd.field_f, param0 ^ -117);
                var16.a(112, 144, var16.field_r << 4, var16.field_x << 4, -((ld) this).field_F << 10, 4096);
                pd.a(-22949);
                dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                return;
              }
            }
          } else {
            var15 = be.field_b[0];
            var9 = var15.field_r << 1;
            var10 = var15.field_x << 1;
            if (dd.field_f != null) {
              if (var9 <= dd.field_f.field_p) {
                if (dd.field_f.field_u < var10) {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -((ld) this).field_F << 10, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                  return;
                } else {
                  de.a(dd.field_f, 6);
                  lf.a();
                  var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -((ld) this).field_F << 10, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                  return;
                }
              } else {
                dd.field_f = new db(var9, var10);
                de.a(dd.field_f, param0 ^ -117);
                var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -((ld) this).field_F << 10, 4096);
                pd.a(-22949);
                dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                return;
              }
            } else {
              dd.field_f = new db(var9, var10);
              de.a(dd.field_f, param0 ^ -117);
              var15.a(112, 144, var15.field_r << 4, var15.field_x << 4, -((ld) this).field_F << 10, 4096);
              pd.a(-22949);
              dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static de a(Throwable param0, String param1) {
        de var2 = null;
        if (!(param0 instanceof de)) {
            var2 = new de(param0, param1);
        } else {
            var2 = (de) (Object) param0;
            var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Player";
    }
}
