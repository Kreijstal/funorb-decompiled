/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ee extends hl {
    boolean field_z;
    static int field_n;
    float field_x;
    qm field_A;
    float field_t;
    float field_j;
    static String field_o;
    int field_s;
    int field_k;
    int field_v;
    int field_m;
    int field_q;
    int field_B;
    float field_r;
    int field_i;
    in field_w;
    int field_l;
    float field_y;
    boolean field_p;
    float field_u;

    private final void a(float param0, byte param1, int param2, float param3, float param4) {
        this.field_y = param3;
        if (param1 > 35) {
          this.field_u = param0;
          this.field_r = param4;
          this.field_A = new qm((int)this.field_y, (int)this.field_u);
          this.field_v = -1;
          this.field_q = param2;
          this.field_s = -1;
          this.field_l = -1;
          this.field_m = -1;
          this.field_w = new in(this.field_r);
          this.field_z = false;
          this.field_j = 0.0f;
          this.field_t = 0.0f;
          this.field_x = 0.0f;
          return;
        }
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 == 0) {
          return;
        }
        ee.e(-50);
    }

    final void a(int param0, wd[] param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          var3_float = ka.a(this.field_q, 77, this.field_A, param1);
          if ((float)param0 != var3_float) {
            this.field_v = (int)var3_float;
            if (this.field_v == param1.length) {
              this.field_v = 0;
            }
            var4 = 0;
            while (true) {
              var4++;
              if (var4 < param1.length) {
                var5 = var4 + this.field_v;
                if (param1.length <= var5) {
                  var5 = var5 - param1.length;
                }
                if (!hl.a(false, this.field_q, param1[var5], this.field_A)) {
                  continue;
                }
                this.field_m = var5;
              }
              break;
            }
            while (true) {
              var4++;
              if (param1.length > var4) {
                var5 = var4 + this.field_v;
                if (var5 >= param1.length) {
                  var5 = var5 - param1.length;
                }
                if (!hl.a(false, this.field_q, param1[var5], this.field_A)) {
                  continue;
                }
                this.field_l = var5;
              }
              break;
            }
            do {
              var4++;
              if (param1.length <= var4) {
                return;
              }
              var5 = var4 + this.field_v;
              if (var5 >= param1.length) {
                var5 = var5 - param1.length;
              }
            } while (!hl.a(false, this.field_q, param1[var5], this.field_A));
            this.field_s = var5;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("ee.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (0.0f != this.field_j) {
          this.field_r = this.field_r + this.field_j * 0.019999999552965164f;
          this.field_w.a(this.field_r, (byte) -54);
          this.field_u = this.field_u + 0.019999999552965164f * (3.5f * this.field_x);
          this.field_y = this.field_y + 0.019999999552965164f * (3.5f * this.field_t);
          this.field_A.field_h = (int)this.field_y;
          this.field_A.field_f = (int)this.field_u;
          this.a(-1, bl.field_r.field_sb);
          if (~this.field_v != param0) {
            this.field_q = bl.field_r.field_sb[this.field_v].field_k;
            return;
          }
          return;
        }
        this.field_u = this.field_u + 0.019999999552965164f * (3.5f * this.field_x);
        this.field_y = this.field_y + 0.019999999552965164f * (3.5f * this.field_t);
        this.field_A.field_h = (int)this.field_y;
        this.field_A.field_f = (int)this.field_u;
        this.a(-1, bl.field_r.field_sb);
        if (~this.field_v != param0) {
          this.field_q = bl.field_r.field_sb[this.field_v].field_k;
          return;
        }
    }

    ee(float param0, float param1, int param2) {
        this.a(param1, (byte) 81, param2, param0, 0.0f);
    }

    ee(float param0, float param1, int param2, float param3) {
        this.a(param1, (byte) 39, param2, param0, param3);
    }

    static {
        field_o = "Finish!";
    }
}
