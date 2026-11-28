/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    byte field_u;
    static int[] field_q;
    int field_t;
    static String field_p;
    static BitPacketBuffer field_r;
    PacketBuffer field_s;

    final byte[] getData(boolean param0) {
        if (!param0) {
          return (byte[]) null;
        }
        if (this.field_n) {
          throw new RuntimeException();
        }
        if (this.field_s.position >= -this.field_u + this.field_s.payload.length) {
          return this.field_s.payload;
        }
        throw new RuntimeException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
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
        var13 = Main.field_T;
        try {
          var5_int = param4 + param2;
          var6 = param0 + param3;
          if (param1 <= 45) {
            return;
          }
          if (SoftwareRasterizer.field_f >= param4) {
            stackIn_6_0 = SoftwareRasterizer.field_f;
          } else {
            stackIn_6_0 = param4;
          }
          var7 = stackIn_6_0;
          if (SoftwareRasterizer.field_h >= param0) {
            stackIn_9_0 = SoftwareRasterizer.field_h;
          } else {
            stackIn_9_0 = param0;
          }
          var8 = stackIn_9_0;
          if (SoftwareRasterizer.field_a > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = SoftwareRasterizer.field_a;
          }
          var9 = stackIn_12_0;
          if (SoftwareRasterizer.field_b <= var6) {
            stackIn_15_0 = SoftwareRasterizer.field_b;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (param4 >= SoftwareRasterizer.field_f &&
            param4 < SoftwareRasterizer.field_a) {
            var11 = param4 + var8 * SoftwareRasterizer.field_l;
            var12 = 1 + (var10 - var8) >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              SoftwareRasterizer.field_j[var11] = 16777215;
              var11 = var11 + SoftwareRasterizer.field_l * 2;
            }
          }
          if (SoftwareRasterizer.field_h <= param0 &&
            SoftwareRasterizer.field_b > var6) {
            var11Lifetime1 = var7 + param0 * SoftwareRasterizer.field_l;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.field_j[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (SoftwareRasterizer.field_f <= var5_int &&
            var5_int < SoftwareRasterizer.field_a) {
            var11Lifetime2 = var5_int + SoftwareRasterizer.field_l * (var8 + (1 & var5_int - param4));
            var12Lifetime2 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.field_j[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + SoftwareRasterizer.field_l * 2;
            }
          }
          if (param0 >= SoftwareRasterizer.field_h) {
            if (SoftwareRasterizer.field_b <= var6) {
              return;
            }
            var11Lifetime3 = var7 + (SoftwareRasterizer.field_l * var6 + (-param0 + var6 & 1));
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                return;
              }
              SoftwareRasterizer.field_j[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var5), "na.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int getProgressPercent(boolean param0) {
        if (null == this.field_s) {
          return 0;
        }
        if (!param0) {
          return 100 * this.field_s.position / (this.field_s.payload.length - this.field_u);
        }
        NetworkArchiveRequest.clearStaticReferences(true);
        return 100 * this.field_s.position / (this.field_s.payload.length - this.field_u);
    }

    public static void clearStaticReferences(boolean param0) {
        field_r = null;
        field_p = null;
        if (param0) {
          field_q = (int[]) null;
          field_q = null;
          return;
        }
        field_q = null;
    }

    NetworkArchiveRequest() {
    }

    static {
        field_p = "Reload game";
    }
}
