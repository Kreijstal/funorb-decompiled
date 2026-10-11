/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nm extends ms {
    private int field_A;
    int field_m;
    private boolean field_z;
    int field_y;
    static String[] field_u;
    static String field_n;
    private int field_o;
    private int field_B;
    int field_l;
    private int field_r;
    private boolean field_x;
    int field_s;
    private int field_v;
    private int field_k;
    private int field_t;
    private jn field_w;
    int field_q;
    private int field_p;

    public static void c(int param0) {
        try {
          field_n = null;
          field_u = null;
          if (param0 != 1432625512) {
            nm.a((fs) null, (byte) -50);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "nm.B(" + param0 + ')');
        }
    }

    private final void a(ah param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        int var7Lifetime1;
        try {
          var3_int = param0.field_m + (this.field_m << 8);
          var4 = param0.field_C - this.field_q;
          var5 = param0.field_z - this.field_l;
          var6 = (int)Math.round(Math.max(1.0, Math.sqrt((double)((float)var5 * (float)var5 + (float)var4 * (float)var4))));
          if (var3_int > var6) {
            var7 = var4 * (-var6 + var3_int) / var6;
            param0.field_C = param0.field_C + (var7 << 1);
            var8_int = var5 * (var3_int - var6) / var6;
            param0.field_z = param0.field_z + (var8_int << 1);
          }
          var4 = (var4 << 8) / var6;
          var5 = (var5 << 8) / var6;
          param0.field_d = 0;
          if (param1 >= -61) {
            this.field_q = -35;
          }
          var7Lifetime1 = -(var4 * param0.field_A) + param0.field_E * var5 >> 8;
          var8 = 2.0;
          if (this.field_x) {
            var8 = 5.0;
          }
          if (6 == this.field_y) {
            var8 = 0.5;
          }
          var10 = (int)(var8 * 800.0) << 8;
          param0.field_E = var5 * var7Lifetime1 + var10 * var4 / param0.field_o >> 8;
          param0.field_A = var5 * var10 / param0.field_o - var4 * var7Lifetime1 >> 8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("nm.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(ah param0, int param1) {
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        String stackIn_165_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        jn var5 = null;
        cb var6 = null;
        int var7 = 0;
        nm var8 = null;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var9Lifetime1;
        int var3_intLifetime2;
        int var4Lifetime2;
        var17 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0.g(57)) {
            return;
          }
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var9 = this.field_y;
          if ((var9 != 7 ||
            var17 != 0) &&
            (decompiledFrameRemainder0 = (6 != var9 ||
            var17 != 0)) &&
            (decompiledFrameRemainder1 = (var9 != 0)) &&
            (decompiledFrameRemainder2 = (var9 != 1 ||
            var17 != 0)) &&
            (decompiledFrameRemainder3 = (2 != var9 ||
            var17 != 0)) &&
            (decompiledFrameRemainder4 = (3 != var9 ||
            var17 != 0)) &&
            (decompiledFrameRemainder5 = (var9 != 4)) &&
            (decompiledFrameRemainder7 = (var9 == 5))) {
            decompiledFrameRemainder6 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (!this.field_x &&
              0 >= this.field_t) {
              this.field_k = 12;
              this.field_t = 200;
              this.field_x = true;
              gn.a(3, true);
              ts.a(this.field_q, this.field_w, -16240, 25, 65535, this.field_l);
            }
            decompiledFrameRemainder7 = !(this.field_k <= 0);
            if (decompiledFrameRemainder7) {
              this.a(param0, param1 ^ -16777041);
              decompiledFrameRemainder7 = (var17 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            if (this.field_t > 0) {
              this.a(param0, param1 - 16777029);
              decompiledFrameRemainder7 = (var17 != 0);
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder7 = (!(param0.g(param1 ^ 16776998)) ||
              var17 != 0))) {
              if (param0.field_N == 1 &&
                param0.field_v == 0) {
                var9Lifetime1 = -param0.field_C + this.field_q;
                var10 = this.field_l - param0.field_z;
                var11 = Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var10 * var10));
                var13 = Math.asin((double)var9Lifetime1 / var11);
                var15 = var13 + 3.141592653589793;
                if (!(Math.abs(-param0.field_s + var15) < 1.5707963267948966)) {
                  ro.a(param0, (byte) 113);
                  this.field_t = 200;
                  if (12 == oh.field_e) {
                    bn.field_P = true;
                  }
                  ts.a(this.field_q, this.field_w, -16240, 25, 65535, this.field_l);
                  decompiledFrameRemainder7 = (var17 != 0);
                }
                if (decompiledFrameRemainder7) {
                  if (param0.field_A < 0 &&
                    -this.field_l + param0.field_z > 0 ||
                    !(0 >= param0.field_A) &&
                    !(param0.field_z - this.field_l >= 0)) {
                    param0.field_A = param0.field_A * -2;
                  }
                  if (param0.field_E < 0 &&
                    0 < -this.field_q + param0.field_C ||
                    !(0 >= param0.field_E) &&
                    !(-this.field_q + param0.field_C >= 0)) {
                    param0.field_E = param0.field_E * -2;
                  }
                  param0.h((byte) -55);
                  this.field_t = 200;
                  decompiledFrameRemainder7 = (var17 != 0);
                }
              }
              if (decompiledFrameRemainder7) {
                ro.a(param0, (byte) 113);
                if (oh.field_e == 12) {
                  bn.field_P = true;
                }
                this.field_t = 200;
                ts.a(this.field_q, this.field_w, -16240, 25, 65535, this.field_l);
                decompiledFrameRemainder7 = (var17 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var3_int = -param0.field_C + this.field_B;
            var4 = -param0.field_z + this.field_r;
            param0.field_E = (int)((double)param0.field_E + 0.00016 * (double)ov.a(-63, var3_int) * Math.pow((double)var3_int, 2.0) / (double)param0.field_o);
            param0.field_A = (int)((double)param0.field_A + (double)ov.a(-69, var4) * 0.00016 * Math.pow((double)var4, 2.0) / (double)param0.field_o);
            param0.field_D = true;
            tq.a(-111, fi.a(4, he.field_o, (byte) -96) + 6, false);
            decompiledFrameRemainder7 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            param0.field_f = true;
            this.field_z = true;
            tq.a(-112, 1, false);
            decompiledFrameRemainder7 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            var5 = is.field_c;
            var7 = 0;
            var6 = new cb(var5);
            var8 = (nm) (var6.b((byte) -80));
            while (true) {
              if (null != var8) {
                stackIn_145_0 = var8.field_y;
                stackIn_145_1 = 2;
                if (var17 == 0) {
                  if (stackIn_145_0 == stackIn_145_1 &&
                    0 >= this.field_v &&
                    ~var8.field_s != ~this.field_s &&
                    0 == fi.a(6, he.field_o, (byte) -96)) {
                    param0.field_C = var8.field_q;
                    param0.field_z = var8.field_l;
                    var8.field_v = 60;
                    var7 = 1;
                  }
                  var8 = (nm) (var6.b(param1 ^ 16776960));
                  continue;
                }
              } else {
                if (var7 == 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                stackIn_145_0 = 5;
                stackIn_145_1 = 1;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              gn.a(stackIn_145_0, stackIn_145_1 != 0);
              ts.a(this.field_q, this.field_w, -16240, 10, 16776960, this.field_l);
              decompiledFrameRemainder7 = (var17 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameCompleted0)) {
            this.a(param0, -68);
            gn.a(13, true);
            decompiledFrameRemainder7 = (param0.field_Q == 0);
            if (decompiledFrameRemainder7) {
              tl.field_v = tl.field_v + 1;
              decompiledFrameRemainder7 = !(gt.field_ab > 0);
              if (decompiledFrameRemainder7) {
                gt.field_ab = 250;
                decompiledFrameRemainder7 = (var17 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameCompleted0)) {
            var3_intLifetime2 = this.field_q - param0.field_C;
            var4Lifetime2 = -param0.field_z + this.field_l;
            param0.field_E = (int)((double)param0.field_E + (double)ov.a(param1 ^ -16777002, var3_intLifetime2) * 0.000035 * Math.pow((double)var3_intLifetime2, 2.0) / (double)param0.field_o);
            param0.field_A = (int)((double)param0.field_A + (double)ov.a(-115, var4Lifetime2) * 0.000035 * Math.pow((double)var4Lifetime2, 2.0) / (double)param0.field_o);
            this.field_z = true;
            tq.a(-119, 1, true);
            decompiledFrameRemainder7 = (var17 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameCompleted0)) {
            var4Lifetime1 = this.field_l - param0.field_z;
            var3_intLifetime1 = -param0.field_C + this.field_q;
            param0.field_E = (int)((double)param0.field_E - (double)ov.a(-56, var3_intLifetime1) * 0.000035 * Math.pow((double)var3_intLifetime1, 2.0) / (double)param0.field_o);
            param0.field_A = (int)((double)param0.field_A - 0.000035 * (double)ov.a(-52, var4Lifetime1) * Math.pow((double)var4Lifetime1, 2.0) / (double)param0.field_o);
            this.field_z = true;
            tq.a(-123, 2, true);
          }
          if (param1 != 16776960) {
            this.field_t = 113;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_164_0 = var3;
          stackIn_164_1 = new StringBuilder().append("nm.D(");
          if (param0 == null) {
            stackIn_165_2 = "null";
          } else {
            stackIn_165_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_164_0), ((StringBuilder) (Object) stackIn_164_1).append(stackIn_165_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(ah param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2145812808) {
            this.a((ah) null, 12);
          }
          var3_int = param0.field_m + (this.field_m << 8);
          stackIn_4_0 = wn.a(param0.field_z, var3_int, -114, this.field_q, param0.field_C, this.field_l);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nm.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        nt var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var3_int = this.field_y;
          if ((var3_int != 6 ||
            var4 != 0) &&
            (decompiledFrameRemainder0 = (var3_int != 7)) &&
            (decompiledFrameRemainder1 = (var3_int != 0 ||
            var4 != 0)) &&
            (decompiledFrameRemainder2 = (var3_int != 1 ||
            var4 != 0)) &&
            (decompiledFrameRemainder3 = (var3_int != 2)) &&
            (decompiledFrameRemainder4 = (var3_int != 3)) &&
            (decompiledFrameRemainder5 = (var3_int != 4 ||
            var4 != 0)) &&
            (decompiledFrameRemainder7 = (5 == var3_int))) {
            decompiledFrameRemainder6 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            o.field_b[0].a((this.field_q >> 8) - (o.field_b[0].c() >> 1), (this.field_l >> 8) - (o.field_b[0].a() >> 1));
            decompiledFrameRemainder7 = !(this.field_t > 5);
            if (decompiledFrameRemainder7) {
              o.field_b[1].a((float)(this.field_q >> 8), (float)(this.field_l >> 8), 4096, (this.field_p << 10) % 65536, 1, 0, 2);
              decompiledFrameRemainder7 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            go.field_p[0].a((this.field_q >> 8) - (go.field_p[0].c() >> 1), (this.field_l >> 8) - (go.field_p[0].a() >> 1));
            if (this.field_t <= 5 &&
              (this.field_p >> 5) % 2 == 1) {
              go.field_p[1].a((this.field_q >> 8) - (go.field_p[1].c() >> 1), (this.field_l >> 8) - (go.field_p[1].a() >> 1), 1, 0, 2);
            }
            decompiledFrameRemainder7 = (this.field_x);
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder7 = (ul.field_f == 0))) {
              kw.field_a.a((float)(this.field_q >> 8), (float)(this.field_l >> 8), (int)((double)this.field_m / 28.0 * 3072.0), 0, 1, 0, 2);
              decompiledFrameRemainder7 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            rb.field_a[0].a((float)(this.field_q >> 8), (float)(this.field_l >> 8), 2048, this.field_o);
            rb.field_a[(this.field_p >> 5) % rb.field_a.length].a((float)(this.field_q >> 8), (float)(this.field_l >> 8), 2048, this.field_o, 1, 0, 2);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            uc.field_e[0].a((this.field_q >> 8) - (uc.field_e[0].c() >> 1), (this.field_l >> 8) - (uc.field_e[0].a() >> 1));
            uc.field_e[1].a((this.field_q >> 8) - (uc.field_e[1].c() >> 1), (this.field_l >> 8) - (uc.field_e[1].a() >> 1), 1, 0, 2);
            si.field_e.a((this.field_q >> 8) - (si.field_e.c() >> 1), (this.field_l >> 8) - (si.field_e.a() >> 1), 0, 16777215 + (this.field_A << 24), 1);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            uj.field_b[0].a((float)(this.field_q >> 8), (float)(this.field_l >> 8), 4096, 0);
            uj.field_b[1].a((float)(this.field_q >> 8), (float)(this.field_l >> 8), 4096, (this.field_p << 10) % 65536, 1, 0, 2);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            kk.field_f.a((this.field_q >> 8) - (kk.field_f.c() >> 1), (this.field_l >> 8) - (kk.field_f.a() >> 1), 1, 0, 2);
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            f.field_r[0].a((this.field_q >> 8) - (f.field_r[0].c() >> 1), (this.field_l >> 8) - (f.field_r[0].a() >> 1));
            f.field_r[1].a((this.field_q >> 8) - (f.field_r[1].c() >> 1), (this.field_l >> 8) - (f.field_r[1].a() >> 1), 0, -15687169, 1);
            decompiledFrameRemainder7 = (ul.field_f == 1);
            if (decompiledFrameRemainder7) {
              vl.field_c.a((this.field_q >> 8) - (vl.field_c.c() >> 1), (this.field_l >> 8) - (vl.field_c.a() >> 1), 0, -15687169, 1);
              decompiledFrameRemainder7 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder7) {
            f.field_r[0].a((this.field_q >> 8) - (f.field_r[0].c() >> 1), (this.field_l >> 8) - (f.field_r[0].a() >> 1));
            f.field_r[1].a((this.field_q >> 8) - (f.field_r[1].c() >> 1), (this.field_l >> 8) - (f.field_r[1].a() >> 1), 0, -31744, 1);
            if (1 == ul.field_f) {
              vl.field_c.a((this.field_q >> 8) - (vl.field_c.c() >> 1), (this.field_l >> 8) - (vl.field_c.a() >> 1), 0, -31744, 1);
            }
          }
          if (param1 != -15687169) {
            this.c((ah) null, -20);
          }
          var3 = (nt) (this.field_w.b(67));
          while (var3 != null) {
            var3.a(param0, -128);
            var3 = (nt) (this.field_w.d((byte) 18));
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_97_0 = var3_ref;
          stackIn_97_1 = new StringBuilder().append("nm.H(");
          if (param0 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_32_0;
        nt var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != 1048149637) {
            this.field_A = -49;
          }
          if (!this.field_z) {
            if (this.field_A > 72) {
              this.field_A = this.field_A - 2;
              if (var3 != 0 &&
                200 > this.field_A) {
                this.field_A = this.field_A + 2;
              }
            }
          } else {
            if (200 > this.field_A) {
              this.field_A = this.field_A + 2;
            }
          }
          if (this.field_x) {
            this.field_k = this.field_k - 1;
            this.field_m = this.field_m + 2;
            if (this.field_k == 0) {
              this.field_m = 20;
              this.field_x = false;
            }
          }
          if (this.field_v > 0) {
            this.field_v = this.field_v - 1;
          }
          if (this.field_t > 0) {
            this.field_t = this.field_t - 1;
          }
          var2 = (nt) (this.field_w.b(74));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            stackOut_32_0 = var2.a(-2567);
            stackIn_40_0 = stackOut_32_0 ? 1 : 0;
            stackIn_33_0 = stackOut_32_0;
            if (var3 == 0) {
              if (stackIn_33_0) {
                var2.b(false);
              }
              var2 = (nt) (this.field_w.d((byte) 18));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_p = this.field_p + 1;
            this.field_z = false;
            stackIn_40_0 = ~this.field_y;
          }
          if (stackIn_40_0 == -6 &&
            this.field_p % 50 == 0 &&
            ul.field_f == 0) {
            this.field_w.a((ms) (new be(this.field_q >> 8, this.field_l >> 8, 16745472, true)), (byte) 39);
          }
          if (this.field_y == 4 &&
            0 == this.field_p % 50 &&
            ul.field_f == 0) {
            this.field_w.a((ms) (new be(this.field_q >> 8, this.field_l >> 8, 1090047, false)), (byte) 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "nm.E(" + param0 + ')');
        }
    }

    final static void a(fs param0, byte param1) {
        int var2_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          if (param1 < 30) {
            nm.c(-34);
          }
          qk.field_U = param0.a(255) << 5;
          var2_int = param0.e(-31302);
          qk.field_U = qk.field_U + (var2_int >> 3);
          sd.field_f = 1835008 & var2_int << 18;
          sd.field_f = sd.field_f + (param0.a(255) << 2);
          var2_intLifetime1 = param0.e(-31302);
          sd.field_f = sd.field_f + (var2_intLifetime1 >> 6);
          bb.field_l = (63 & var2_intLifetime1) << 15;
          bb.field_l = bb.field_l + (param0.e(-31302) << 7);
          var2_intLifetime2 = param0.e(-31302);
          ch.field_d = 65536 & var2_intLifetime2 << 16;
          bb.field_l = bb.field_l + (var2_intLifetime2 >> 1);
          ch.field_d = ch.field_d + param0.a(255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("nm.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = this.field_y;
          switch ((var3 == 0
            || var2_int == 0
            || var2_int == 1
            || var2_int == 2
            || var2_int == 3
            || var2_int == 5
            || var2_int == 6
            || var2_int == 7
            ) ? var2_int : -1) {
            case 0:
              this.field_m = 20;
              this.c((byte) 47);
              if (var3 == 0) {
                break;
              }
            case 1:
              this.field_m = 55;
              if (var3 == 0) {
                break;
              }
            case 2:
              this.field_m = 20;
              if (var3 == 0) {
                break;
              }
            case 3:
              this.field_m = 20;
              if (var3 == 0) {
                break;
              }
            case 4:
              this.field_m = 75;
              if (var3 == 0) {
                break;
              }
            case 5:
              this.field_m = 75;
              if (var3 == 0) {
                break;
              }
            case 6:
              this.field_m = 15;
              if (var3 == 0) {
                break;
              }
            case 7:
              this.field_m = 20;
            default:
              break;
          }
          if (param0 != -115) {
            this.a(89);
          }
          this.field_w = new jn();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "nm.F(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        double var2_double = 0.0;
        double var4 = 0.0;
        double var7 = 0.0;
        try {
          var2_double = -1.5707963267948966 + (double)this.field_o / 65536.0 * 6.283185307179586;
          int var6 = 20 % ((param0 + 24) / 41);
          var4 = 19200.0 * Math.sin(-var2_double);
          var7 = 19200.0 * Math.cos(-var2_double);
          this.field_r = (int)((double)this.field_l + var4);
          this.field_B = (int)(var7 + (double)this.field_q);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "nm.I(" + param0 + ')');
        }
    }

    nm(int param0, int param1, int param2, int param3) {
        this.field_A = 72;
        try {
          this.field_l = param2 << 8;
          this.field_q = param1 << 8;
          this.field_o = param3;
          this.field_y = param0;
          this.a((byte) -115);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "nm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_n = "Waiting for levels";
        field_u = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
