/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends fe {
    rc field_G;
    static String field_J;
    static boolean field_K;
    static boolean field_I;
    int field_H;
    byte[] field_L;

    final byte[] d(byte param0) {
        if (param0 >= -49) {
          df.h(-48);
          if (!this.field_z) {
            return this.field_L;
          }
          throw new RuntimeException();
        }
        if (!this.field_z) {
          return this.field_L;
        }
        throw new RuntimeException();
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (nj.field_Q < 10) {
            var3_int = 0;
            if (dd.field_e) {
              dd.field_e = false;
              var3_int = 1;
            }
            kc.a(sa.b((byte) 118), CachedArchiveProvider.a(true), var3_int != 0, 300, d.field_S);
          } else {
            if (!km.a(-124)) {
              SoftwareRaster.b();
              ff.a((byte) 17, 240, 320);
              kg.a(0, 0, 28594, param1);
            } else {
              if (0 != uj.field_d) {
                en.a(param1, -28003);
              } else {
                ArchiveProvider.a(false, (byte) 88, param2);
                kg.a(0, 0, 28594, param1);
              }
            }
          }
          var3_intLifetime1 = 89 % ((param0 + 66) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("df.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int h(int param0) {
        int var1 = 68 % ((param0 - 3) / 63);
        return wi.field_y;
    }

    final static int atanFixed16ToAngle8192(int obfuscationGuard, int tangent16) {
        if (obfuscationGuard != -3720) {
          field_J = (String) null;
          if (tangent16 >= 0) {
            if (tangent16 > 65536) {
              return 2048 - vn.field_m[134217728 / tangent16];
            }
            return vn.field_m[tangent16 >> 5];
          }
          if (-65536 <= tangent16) {
            return -vn.field_m[-tangent16 >> 5];
          }
          return vn.field_m[134217728 / -tangent16] - 2048;
        }
        if (tangent16 >= 0) {
          if (tangent16 > 65536) {
            return 2048 - vn.field_m[134217728 / tangent16];
          }
          return vn.field_m[tangent16 >> 5];
        }
        if (-65536 <= tangent16) {
          return -vn.field_m[-tangent16 >> 5];
        }
        return vn.field_m[134217728 / -tangent16] - 2048;
    }

    final int g(int param0) {
        if (param0 != 16) {
          this.g(65);
          if (!this.field_z) {
            return 100;
          }
          return 0;
        }
        if (!this.field_z) {
          return 100;
        }
        return 0;
    }

    public static void i(int param0) {
        field_J = null;
        if (param0 >= -20) {
          field_K = true;
        }
    }

    df() {
    }

    static {
        field_K = false;
        field_J = "You have <%0> unread messages!";
    }
}
