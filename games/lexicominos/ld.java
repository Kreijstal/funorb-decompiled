/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends kf {
    private int field_F;
    private ma field_E;
    static String field_G;

    public static void j(int param0) {
        field_G = null;
        if (param0 != 6977) {
            field_G = (String) null;
        }
    }

    final boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 44) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ld.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final String b(int param0) {
        if (param0 <= 121) {
            ld.i(55);
            if (!(!this.field_m)) {
                return this.field_E.a((byte) 102);
            }
            return null;
        }
        if (!(!this.field_m)) {
            return this.field_E.a((byte) 102);
        }
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new byte[var2_int];
              if (param0 >= 70) {
                break L1;
              } else {
                var4 = (String) null;
                ld.a((Throwable) null, (String) null);
                break L1;
              }
            }
            o.a(param1, 0, var3, 0, var2_int);
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ld.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
            this.field_F = this.field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ld.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    ld(ma param0) {
        try {
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        sc var8;
        int var9;
        int var10;
        int var11;
        db var13;
        db var14;
        db var15;
        db var16;
        var11 = Lexicominos.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = (this.field_j >> 1403155361) + this.field_t + param2;
          var6 = this.field_o + (param1 + (this.field_v >> 1762056929));
          var8 = this.field_E.b((byte) 116);
          if (jj.field_e != var8) {
            if (be.field_q != var8) {
              if (ni.field_b != var8) {
                if (rh.field_p != var8) {
                  return;
                } else {
                  var13 = be.field_b[1];
                  var13.d(-(var13.field_p >> 2079400193) + var5, var6 + -(var13.field_u >> 1839068961), 256);
                  return;
                }
              } else {
                var14 = be.field_b[2];
                var14.d(var5 - (var14.field_p >> 1089906849), var6 + -(var14.field_u >> -374179007), 256);
                return;
              }
            } else {
              var16 = be.field_b[0];
              var9 = var16.field_r << -1398745791;
              var10 = var16.field_x << -73343423;
              if (dd.field_f != null) {
                if (var9 <= dd.field_f.field_p) {
                  if (dd.field_f.field_u < var10) {
                    dd.field_f = new db(var9, var10);
                    de.a(dd.field_f, param0 ^ -117);
                    var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -this.field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                    return;
                  } else {
                    de.a(dd.field_f, 6);
                    lf.a();
                    var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -this.field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                    return;
                  }
                } else {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -this.field_F << -342434070, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                  return;
                }
              } else {
                dd.field_f = new db(var9, var10);
                de.a(dd.field_f, param0 ^ -117);
                var16.a(112, 144, var16.field_r << 1644659268, var16.field_x << -981984796, -this.field_F << -342434070, 4096);
                pd.a(-22949);
                dd.field_f.d(-var16.field_r + var5, -var16.field_x + var6, 256);
                return;
              }
            }
          } else {
            var15 = be.field_b[0];
            var9 = var15.field_r << -1398745791;
            var10 = var15.field_x << -73343423;
            if (dd.field_f != null) {
              if (var9 <= dd.field_f.field_p) {
                if (dd.field_f.field_u < var10) {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -this.field_F << -342434070, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                  return;
                } else {
                  de.a(dd.field_f, 6);
                  lf.a();
                  var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -this.field_F << -342434070, 4096);
                  pd.a(-22949);
                  dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                  return;
                }
              } else {
                dd.field_f = new db(var9, var10);
                de.a(dd.field_f, param0 ^ -117);
                var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -this.field_F << -342434070, 4096);
                pd.a(-22949);
                dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                return;
              }
            } else {
              dd.field_f = new db(var9, var10);
              de.a(dd.field_f, param0 ^ -117);
              var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -this.field_F << -342434070, 4096);
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
            var2 = (de) ((Object) param0);
            var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    static {
        field_G = "Player";
    }
}
