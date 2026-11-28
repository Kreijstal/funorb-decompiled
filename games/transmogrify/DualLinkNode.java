/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    long field_j;
    static RasterBuffer field_k;
    DualLinkNode field_h;
    DualLinkNode field_g;
    static String field_i;

    final static int a(int param0, int param1) {
        int var2 = -12 % ((-73 - param0) / 47);
        param1 = param1 & 8191;
        if (param1 < 4096) {
          return param1 < 2048 ? TextHotspotBounds.field_r[-param1 + 2048] : -TextHotspotBounds.field_r[-2048 + param1];
        }
        return param1 < 6144 ? -TextHotspotBounds.field_r[-param1 + 6144] : TextHotspotBounds.field_r[-6144 + param1];
    }

    final void unlinkSecondary(byte param0) {
        if (this.field_g == null) {
          return;
        }
        if (param0 <= -57) {
          this.field_g.field_h = this.field_h;
          this.field_h.field_g = this.field_g;
          this.field_h = null;
          this.field_g = null;
          return;
        }
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_i = null;
        int var1 = 35 / ((-82 - param0) / 43);
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        int var9 = Transmogrify.field_A ? 1 : 0;
        if (param4 < -117) {
          if (param5 >= param6) {
            if (param3 > param5) {
              DebouncedFieldValidator.a(param2, param5, param0, param1, param7, true, param6, param3, SoftwareRasterizer.field_h);
              return;
            }
            if (param6 >= param3) {
              DebouncedFieldValidator.a(param0, param6, param7, param1, param2, true, param3, param5, SoftwareRasterizer.field_h);
              return;
            }
            DebouncedFieldValidator.a(param0, param3, param2, param1, param7, true, param6, param5, SoftwareRasterizer.field_h);
            return;
          }
          if (param6 < param3) {
            DebouncedFieldValidator.a(param2, param6, param7, param1, param0, true, param5, param3, SoftwareRasterizer.field_h);
            return;
          }
          if (param3 > param5) {
            DebouncedFieldValidator.a(param7, param3, param2, param1, param0, true, param5, param6, SoftwareRasterizer.field_h);
            return;
          }
          DebouncedFieldValidator.a(param7, param5, param0, param1, param2, true, param3, param6, SoftwareRasterizer.field_h);
          return;
        }
        DualLinkNode.a(-105, -75);
        if (param5 >= param6) {
          if (param3 > param5) {
            DebouncedFieldValidator.a(param2, param5, param0, param1, param7, true, param6, param3, SoftwareRasterizer.field_h);
            return;
          }
          if (param6 >= param3) {
            DebouncedFieldValidator.a(param0, param6, param7, param1, param2, true, param3, param5, SoftwareRasterizer.field_h);
            return;
          }
          DebouncedFieldValidator.a(param0, param3, param2, param1, param7, true, param6, param5, SoftwareRasterizer.field_h);
          return;
        }
        if (param6 < param3) {
          DebouncedFieldValidator.a(param2, param6, param7, param1, param0, true, param5, param3, SoftwareRasterizer.field_h);
          return;
        }
        if (param3 > param5) {
          DebouncedFieldValidator.a(param7, param3, param2, param1, param0, true, param5, param6, SoftwareRasterizer.field_h);
          return;
        }
        DebouncedFieldValidator.a(param7, param5, param0, param1, param2, true, param3, param6, SoftwareRasterizer.field_h);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = param0 + param1;
          var6 = param4 + param2;
          if (SoftwareRasterizer.field_d >= param1) {
            stackIn_4_0 = SoftwareRasterizer.field_d;
          } else {
            stackIn_4_0 = param1;
          }
          var7 = stackIn_4_0;
          if (SoftwareRasterizer.field_e >= param2) {
            stackIn_7_0 = SoftwareRasterizer.field_e;
          } else {
            stackIn_7_0 = param2;
          }
          var8 = stackIn_7_0;
          if (var5_int < SoftwareRasterizer.field_b) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = SoftwareRasterizer.field_b;
          }
          var9 = stackIn_10_0;
          if (var6 < SoftwareRasterizer.field_f) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = SoftwareRasterizer.field_f;
          }
          var10 = stackIn_13_0;
          if (param1 >= SoftwareRasterizer.field_d &&
            SoftwareRasterizer.field_b > param1) {
            var11 = param1 + var8 * SoftwareRasterizer.field_c;
            var12 = -var8 + (1 + var10) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRasterizer.field_h[var11] = 16777215;
              var11 = var11 + 2 * SoftwareRasterizer.field_c;
            }
          }
          if (SoftwareRasterizer.field_e <= param2 &&
            var6 < SoftwareRasterizer.field_f) {
            var11Lifetime1 = var7 + param2 * SoftwareRasterizer.field_c;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.field_h[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (SoftwareRasterizer.field_d <= var5_int &&
            SoftwareRasterizer.field_b > var5_int) {
            var11Lifetime2 = (var8 + (1 & var5_int - param1)) * SoftwareRasterizer.field_c + var5_int;
            var12Lifetime2 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.field_h[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + SoftwareRasterizer.field_c * 2;
            }
          }
          if (param3 > -9) {
            return;
          }
          if (param2 >= SoftwareRasterizer.field_e) {
            if (var6 >= SoftwareRasterizer.field_f) {
              return;
            }
            var11Lifetime3 = var6 * SoftwareRasterizer.field_c - (-var7 - (1 & var6 - param2));
            var12Lifetime3 = 1 + (var9 - var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              SoftwareRasterizer.field_h[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ch.wrapClientException((Throwable) ((Object) var5), "ri.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected DualLinkNode() {
    }

    static {
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
