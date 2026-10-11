/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ml extends en {
    private int field_t;
    static int field_l;
    private int field_q;
    private int field_v;
    static ri field_p;
    private int field_r;
    static boolean field_u;
    private int field_k;
    private byte[] field_n;
    private int field_m;
    private int field_o;
    static hr[] field_w;
    private int field_s;

    final void b(int param0) {
        this.field_o = 0;
        if (param0 >= -7) {
          this.field_r = 119;
          this.field_m = 0;
          return;
        }
        this.field_m = 0;
    }

    void a(byte param0, int param1, int param2) {
        if (param2 != 4096) {
          return;
        }
        this.field_n[param1] = (byte)param0;
    }

    final void a(int param0, int param1, int param2) {
        int stackIn_5_1 = 0;
        int stackIn_13_1 = 0;
        int stackIn_20_1 = 0;
        int stackIn_24_1 = 0;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 0) {
          if (param2 >= 0) {
            stackIn_24_1 = param2;
          } else {
            stackIn_24_1 = -param2;
          }
          this.field_q = -stackIn_24_1 + this.field_s;
          this.field_q = this.field_q * this.field_q >> 12;
          this.field_t = 4096;
          this.field_m = this.field_q;
        } else {
          this.field_t = this.field_q * this.field_k >> 12;
          if (this.field_t < 0) {
            this.field_t = 0;
            if (param2 < 0) {
              stackIn_5_1 = -param2;
            } else {
              stackIn_5_1 = param2;
            }
            this.field_q = -stackIn_5_1 + this.field_s;
          } else {
            if (4096 >= this.field_t) {
              if (param2 < 0) {
                stackIn_13_1 = -param2;
              } else {
                stackIn_13_1 = param2;
              }
              this.field_q = -stackIn_13_1 + this.field_s;
            } else {
              this.field_t = 4096;
              if (param2 < 0) {
                stackIn_20_1 = -param2;
              } else {
                stackIn_20_1 = param2;
              }
              this.field_q = -stackIn_20_1 + this.field_s;
            }
          }
          this.field_q = this.field_q * this.field_q >> 12;
          this.field_q = this.field_q * this.field_t >> 12;
          this.field_m = this.field_m + (this.field_v * this.field_q >> 12);
          this.field_v = this.field_v * this.field_r >> 12;
        }
        if (param1 == 1157) {
          return;
        }
        this.field_n = (byte[]) null;
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        this.field_m = this.field_m >> 4;
        this.field_v = this.field_r;
        if (this.field_m < 0) {
          this.field_m = 0;
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.a((byte)this.field_m, fieldTemp$0, 4096);
          this.field_m = 0;
          if (param0) {
            this.a((byte) -52, 1, -122);
            return;
          }
          return;
        }
        if (this.field_m > 255) {
          this.field_m = 255;
          fieldTemp$1 = this.field_o;
          this.field_o = this.field_o + 1;
          this.a((byte)this.field_m, fieldTemp$1, 4096);
          this.field_m = 0;
          if (param0) {
            this.a((byte) -52, 1, -122);
            return;
          }
          return;
        }
        int fieldTemp$2 = this.field_o;
        this.field_o = this.field_o + 1;
        this.a((byte)this.field_m, fieldTemp$2, 4096);
        this.field_m = 0;
        if (!param0) {
          return;
        }
        this.a((byte) -52, 1, -122);
    }

    public static void c(byte param0) {
        field_w = null;
        field_p = null;
        if (param0 != 30) {
          ml.c((byte) 34);
        }
    }

    ml(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        this.field_k = (int)(4096.0f * param7);
        this.field_s = (int)(param6 * 4096.0f);
        int dupTemp$0 = (int)(Math.pow(0.5, (double)(-param5)) * 4096.0);
        this.field_r = dupTemp$0;
        this.field_v = dupTemp$0;
    }

    static {
        field_l = 0;
    }
}
