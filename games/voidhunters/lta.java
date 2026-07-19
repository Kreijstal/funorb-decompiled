/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lta {
    float field_b;
    int field_d;
    int field_e;
    float field_a;
    int[] field_f;
    float field_c;

    final float b(int param0, int param1) {
        int var3 = 79 % ((-79 - param1) / 43);
        return ((float)param0 - this.field_c) * this.field_a + (float)this.field_d;
    }

    final int a(int param0, byte param1) {
        if (param1 <= 111) {
          return 61;
        } else {
          return (int)((float)this.field_d + ((float)param0 - this.field_c) * this.field_a);
        }
    }

    final float c(int param0, int param1) {
        if (param0 != 0) {
            return -0.3560704290866852f;
        }
        return (float)this.field_e + ((float)param1 - this.field_b) * this.field_a;
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
          this.field_d = 3;
          return (int)(this.field_b + (float)(param1 + -this.field_e) / this.field_a);
        } else {
          return (int)(this.field_b + (float)(param1 + -this.field_e) / this.field_a);
        }
    }

    final int b(boolean param0, int param1) {
        float discarded$2 = 0.0f;
        if (!param0) {
          discarded$2 = this.c(-13, 119);
          return (int)(this.field_a * ((float)param1 - this.field_b) + (float)this.field_e);
        } else {
          return (int)(this.field_a * ((float)param1 - this.field_b) + (float)this.field_e);
        }
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          this.field_c = -2.1542797088623047f;
          return (int)(this.field_c + (float)(-this.field_d + param1) / this.field_a);
        } else {
          return (int)(this.field_c + (float)(-this.field_d + param1) / this.field_a);
        }
    }

    public lta() {
        this.field_f = new int[4];
        this.field_e = 240;
        this.field_a = 0.001953125f;
        this.field_b = 0.0f;
        this.field_c = 0.0f;
        this.field_d = 320;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 > -9) {
          this.field_b = 0.1839497685432434f;
          this.field_f[0] = this.a(true, param1);
          this.field_f[1] = this.a(true, param3);
          this.field_f[2] = this.a(0, param4);
          this.field_f[3] = this.a(0, param0);
          return;
        } else {
          this.field_f[0] = this.a(true, param1);
          this.field_f[1] = this.a(true, param3);
          this.field_f[2] = this.a(0, param4);
          this.field_f[3] = this.a(0, param0);
          return;
        }
    }

    static {
    }
}
