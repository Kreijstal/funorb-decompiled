/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lw extends ksa {
    int field_g;
    static boolean field_f;
    int field_l;
    int field_m;
    int field_h;
    int field_k;
    int field_d;
    int field_j;
    static String field_e;
    static llb field_i;

    final void a(int param0) {
        this.field_g = 0;
        this.field_d = this.field_d + 1;
        if (param0 == -26857) {
          this.field_k = 0;
          this.field_j = 0;
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          field_i = (llb) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    final static int a(byte param0, int param1) {
        if (param0 != -73) {
          return -8;
        }
        if ((long)param1 < 65536L) {
          if ((long)param1 < 256L) {
            if (param1 >= 0) {
              return eo.field_o[param1] >> 12;
            }
            return -1;
          }
          if ((long)param1 >= 4096L) {
            if (16384L > (long)param1) {
              return eo.field_o[param1 >> 6] >> 9;
            }
            return eo.field_o[param1 >> 8] >> 8;
          }
          if ((long)param1 < 1024L) {
            return eo.field_o[param1 >> 2] >> 11;
          }
          return eo.field_o[param1 >> 4] >> 10;
        }
        if (16777216L <= (long)param1) {
          if ((long)param1 >= 268435456L) {
            if ((long)param1 >= 1073741824L) {
              return eo.field_o[param1 >> 24];
            }
            return eo.field_o[param1 >> 22] >> 1;
          }
          if ((long)param1 >= 67108864L) {
            return eo.field_o[param1 >> 20] >> 2;
          }
          return eo.field_o[param1 >> 18] >> 3;
        }
        if ((long)param1 < 1048576L) {
          if ((long)param1 >= 262144L) {
            return eo.field_o[param1 >> 12] >> 6;
          }
          return eo.field_o[param1 >> 10] >> 7;
        }
        if ((long)param1 < 4194304L) {
          return eo.field_o[param1 >> 14] >> 5;
        }
        return eo.field_o[param1 >> 16] >> 4;
    }

    final void a(int param0, int param1) {
        if (this.field_j == 0) {
          this.field_j = param1;
        } else {
          if (this.field_j > param1 &&
            0 < param1) {
            this.field_j = param1;
          }
        }
        this.field_k = this.field_k + 1;
        if (param0 != -1746542610) {
          return;
        }
        if (param1 <= 0) {
          this.field_g = this.field_g + 1;
        }
    }

    lw(int param0) {
        this.field_l = param0;
        if (pca.field_i[this.field_l].c((byte) -115)) {
          this.field_d = 50;
        }
    }

    static {
        field_f = false;
        field_e = "Owner";
    }
}
