/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hja {
    static String field_g;
    boolean field_c;
    private int field_h;
    boolean field_b;
    String field_d;
    int field_e;
    static int field_i;
    int field_f;
    String field_a;

    public static void a(byte param0) {
        if (param0 <= 55) {
          hja.a((byte) -52);
          field_g = null;
          return;
        }
        field_g = null;
    }

    hja(int param0, int param1, boolean param2, boolean param3, int param4) {
        boolean stackIn_3_1 = false;
        boolean stackIn_8_1 = false;
        boolean stackIn_14_1 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_26_1 = false;
        boolean stackIn_30_1 = false;
        boolean stackIn_34_1 = false;
        boolean stackIn_38_1 = false;
        boolean stackIn_42_1 = false;
        boolean stackIn_46_1 = false;
        this.field_f = -1;
        this.field_h = param0;
        this.field_a = vj.field_r[this.field_h];
        this.field_d = oha.field_d[this.field_h];
        stackIn_3_1 = (param2);
        this.field_b = stackIn_3_1;
        if (6 == this.field_h) {
          this.field_f = 4;
          stackIn_46_1 = (param3);
          this.field_c = stackIn_46_1;
        } else {
          if (7 == this.field_h) {
            this.field_f = 0;
            stackIn_8_1 = (param3);
            this.field_c = stackIn_8_1;
          } else {
            if (8 == this.field_h) {
              this.field_f = 5;
              stackIn_42_1 = (param3);
              this.field_c = stackIn_42_1;
            } else {
              if (9 == this.field_h) {
                this.field_f = 1;
                stackIn_14_1 = (param3);
                this.field_c = stackIn_14_1;
              } else {
                if (this.field_h == 10) {
                  this.field_f = 6;
                  stackIn_19_1 = (param3);
                  this.field_c = stackIn_19_1;
                } else {
                  if (11 == this.field_h) {
                    this.field_f = 2;
                    stackIn_38_1 = (param3);
                    this.field_c = stackIn_38_1;
                  } else {
                    if (this.field_h == 12) {
                      this.field_f = 7;
                      stackIn_34_1 = (param3);
                      this.field_c = stackIn_34_1;
                    } else {
                      if (13 != this.field_h) {
                        stackIn_26_1 = (param3);
                        this.field_c = stackIn_26_1;
                      } else {
                        this.field_f = 3;
                        stackIn_30_1 = (param3);
                        this.field_c = stackIn_30_1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        this.field_e = param4;
    }

    static {
        field_g = "Full";
    }
}
