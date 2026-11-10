/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterState extends IntrusiveNode {
    int field_l;
    int field_h;
    int field_k;
    int field_m;
    static int[] field_n;
    int[] field_p;
    static int[] field_o;
    int field_i;
    int field_j;

    final void setRasterState(int param0, byte param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        try {
          this.field_h = param3;
          this.field_j = param6;
          this.field_l = param2;
          this.field_i = param7;
          this.field_m = param0;
          this.field_k = param4;
          this.field_p = param5;
          if (param1 != -29) {
            this.field_p = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > -17) {
          field_n = (int[]) null;
          field_n = null;
          field_o = null;
          return;
        }
        field_n = null;
        field_o = null;
    }

    final static int integerSquareRoot(int param0, int param1) {
        if (param1 != 12832) {
          RasterState.releaseStatics(-45);
        }
        if ((long)param0 < 65536L) {
          if (256L > (long)param0) {
            if (param0 >= 0) {
              return PageReloadHelpers.field_a[param0] >> 12;
            }
            return -1;
          }
          if ((long)param0 >= 4096L) {
            if ((long)param0 < 16384L) {
              return PageReloadHelpers.field_a[param0 >> 6] >> 9;
            }
            return PageReloadHelpers.field_a[param0 >> 8] >> 8;
          }
          if ((long)param0 < 1024L) {
            return PageReloadHelpers.field_a[param0 >> 2] >> 11;
          }
          return PageReloadHelpers.field_a[param0 >> 4] >> 10;
        }
        if ((long)param0 < 16777216L) {
          if ((long)param0 < 1048576L) {
            if ((long)param0 >= 262144L) {
              return PageReloadHelpers.field_a[param0 >> 12] >> 6;
            }
            return PageReloadHelpers.field_a[param0 >> 10] >> 7;
          }
          if ((long)param0 < 4194304L) {
            return PageReloadHelpers.field_a[param0 >> 14] >> 5;
          }
          return PageReloadHelpers.field_a[param0 >> 16] >> 4;
        }
        if ((long)param0 >= 268435456L) {
          if ((long)param0 >= 1073741824L) {
            return PageReloadHelpers.field_a[param0 >> 24];
          }
          return PageReloadHelpers.field_a[param0 >> 22] >> 1;
        }
        if ((long)param0 < 67108864L) {
          return PageReloadHelpers.field_a[param0 >> 18] >> 3;
        }
        return PageReloadHelpers.field_a[param0 >> 20] >> 2;
    }

    RasterState() {
    }

    static {
        field_o = new int[16384];
    }
}
