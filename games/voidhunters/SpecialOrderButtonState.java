/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpecialOrderButtonState extends IntrusiveNode {
    int nonPositiveStateCount;
    static boolean field_f;
    int specialOrderId;
    int x;
    int y;
    int statusCount;
    int field_d;
    int field_j;
    static String field_e;
    static Widget field_i;

    final void resetStatusCounts(int param0) {
        this.nonPositiveStateCount = 0;
        this.field_d = this.field_d + 1;
        if (param0 == -26857) {
          this.statusCount = 0;
          this.field_j = 0;
          return;
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_e = null;
        if (param0) {
          field_i = (Widget) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    final static int approximateIntegerSqrt(byte param0, int param1) {
        if (param0 != -73) {
          return -8;
        }
        if ((long)param1 < 65536L) {
          if ((long)param1 < 256L) {
            if (param1 >= 0) {
              return GetBuildViewAutozoomEndOnAction.field_o[param1] >> 12;
            }
            return -1;
          }
          if ((long)param1 >= 4096L) {
            if (16384L > (long)param1) {
              return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 6] >> 9;
            }
            return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 8] >> 8;
          }
          if ((long)param1 < 1024L) {
            return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 2] >> 11;
          }
          return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 4] >> 10;
        }
        if (16777216L <= (long)param1) {
          if ((long)param1 >= 268435456L) {
            if ((long)param1 >= 1073741824L) {
              return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 24];
            }
            return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 22] >> 1;
          }
          if ((long)param1 >= 67108864L) {
            return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 20] >> 2;
          }
          return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 18] >> 3;
        }
        if ((long)param1 < 1048576L) {
          if ((long)param1 >= 262144L) {
            return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 12] >> 6;
          }
          return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 10] >> 7;
        }
        if ((long)param1 < 4194304L) {
          return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 14] >> 5;
        }
        return GetBuildViewAutozoomEndOnAction.field_o[param1 >> 16] >> 4;
    }

    final void addStatus(int param0, int param1) {
        if (this.field_j == 0) {
          this.field_j = param1;
        } else {
          if (this.field_j > param1 &&
            0 < param1) {
            this.field_j = param1;
          }
        }
        this.statusCount = this.statusCount + 1;
        if (param0 != -1746542610) {
          return;
        }
        if (param1 <= 0) {
          this.nonPositiveStateCount = this.nonPositiveStateCount + 1;
        }
    }

    SpecialOrderButtonState(int param0) {
        this.specialOrderId = param0;
        if (CarouselPlayerEvent.field_i[this.specialOrderId].c((byte) -115)) {
          this.field_d = 50;
        }
    }

    static {
        field_f = false;
        field_e = "Owner";
    }
}
