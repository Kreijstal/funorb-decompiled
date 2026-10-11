/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi implements uj {
    private fs field_w;
    static String field_d;
    static qr field_o;
    private int field_x;
    private int field_j;
    private pf field_l;
    private dc field_m;
    private int field_t;
    private mn field_c;
    static vr field_a;
    private pf field_u;
    private pf field_k;
    private int field_r;
    private int[] field_f;
    private wf[] field_e;
    private int[] field_q;
    private int[] field_n;
    private int[] field_i;
    private boolean field_h;
    private boolean field_p;
    private int[] field_v;
    private int[][] field_s;
    private boolean field_b;
    private boolean[] field_y;
    private int field_g;

    private final void d(byte param0) {
        int var2;
        co var3;
        int var4;
        int var5;
        sd var6;
        int var7;
        int var8;
        fs var9;
        int var10;
        int var7Lifetime1;
        int var10Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 <= 26) {
          var9 = (fs) null;
          this.a((fs) null, (byte) 115);
        }
        var3 = (co) (this.field_l.d(0));
        while (var3 != null) {
          var4 = 0;
          var5 = 0;
          var6 = (sd) (this.field_w.field_i.d(0));
          while (var6 != null) {
            if (var6 != var3.field_n.field_R) {
              var4++;
              var6 = (sd) (this.field_w.field_i.a((byte) -71));
              continue;
            }
            var5 = 1;
            break;
          }
          if (var5 == 0) {
            throw new RuntimeException("Star to be garrisoned (" + var3.field_n.field_I + ") doesn't appear to be in any of the AI's territories.");
          }
          if (!this.field_y[var4]) {
            var2 = var3.field_i - var3.field_n.field_x;
            if (0 < var2) {
              q.field_Ab[var3.field_n.field_p] = 0;
              if (var3.field_n.field_x <= var3.field_n.field_N) {
                if (var2 > this.field_i[var4]) {
                  var3.field_n.field_J = var3.field_n.field_J + this.field_i[var4];
                  var2 = var2 - this.field_i[var4];
                  bk.field_a.a((byte) -113, new qa(var3.field_n, this.field_i[var4]));
                  if (this.field_m.field_o.field_i) {
                    var10 = 0;
                    var7 = var10;
                    while (var10 < this.field_i.length) {
                      this.field_i[var10] = 0;
                      var10++;
                    }
                  } else {
                    this.field_i[var4] = 0;
                  }
                  if (var2 <= this.field_n[var4]) {
                    this.field_n[var4] = this.field_n[var4] - var2;
                    kq.field_c[var3.field_n.field_p] = kq.field_c[var3.field_n.field_p] + var2;
                  } else {
                    this.a(var4, 71, var6);
                  }
                } else {
                  if (this.field_m.field_o.field_i) {
                    for (var7 = 0; this.field_i.length > var7; var7++) {
                      this.field_i[var7] = this.field_i[var7] - var2;
                    }
                  } else {
                    this.field_i[var4] = this.field_i[var4] - var2;
                  }
                  var3.field_n.field_J = var3.field_n.field_J + var2;
                  bk.field_a.a((byte) -113, new qa(var3.field_n, var2));
                }
                var3 = (co) (this.field_l.a((byte) -71));
                continue;
              }
              this.field_n[var4] = this.field_n[var4] - (var3.field_n.field_x - var3.field_n.field_N);
              if (0 <= this.field_n[var4]) {
                if (var2 > this.field_i[var4]) {
                  var3.field_n.field_J = var3.field_n.field_J + this.field_i[var4];
                  var2 = var2 - this.field_i[var4];
                  bk.field_a.a((byte) -113, new qa(var3.field_n, this.field_i[var4]));
                  if (this.field_m.field_o.field_i) {
                    var10Lifetime1 = 0;
                    var7Lifetime1 = var10Lifetime1;
                    while (var10Lifetime1 < this.field_i.length) {
                      this.field_i[var10Lifetime1] = 0;
                      var10Lifetime1++;
                    }
                  } else {
                    this.field_i[var4] = 0;
                  }
                  if (var2 <= this.field_n[var4]) {
                    this.field_n[var4] = this.field_n[var4] - var2;
                    kq.field_c[var3.field_n.field_p] = kq.field_c[var3.field_n.field_p] + var2;
                  } else {
                    this.a(var4, 71, var6);
                  }
                } else {
                  if (this.field_m.field_o.field_i) {
                    for (var7Lifetime1 = 0; this.field_i.length > var7Lifetime1; var7Lifetime1++) {
                      this.field_i[var7Lifetime1] = this.field_i[var7Lifetime1] - var2;
                    }
                  } else {
                    this.field_i[var4] = this.field_i[var4] - var2;
                  }
                  var3.field_n.field_J = var3.field_n.field_J + var2;
                  bk.field_a.a((byte) -113, new qa(var3.field_n, var2));
                }
              } else {
                this.a(var4, 100, var6);
              }
            } else {
              q.field_Ab[var3.field_n.field_p] = var3.field_n.field_x - var3.field_i;
              this.field_n[var4] = this.field_n[var4] - (-var3.field_n.field_N + var3.field_i);
              if (this.field_n[var4] < 0) {
                this.a(var4, -52, var6);
              }
            }
          }
          var3 = (co) (this.field_l.a((byte) -71));
        }
    }

    private final void j(int param0) {
        int var6 = 0;
        int var2;
        Object var3;
        sd var3_ref;
        ln[] var4;
        int var5;
        ln var7;
        int var8;
        int var9;
        int var2Lifetime1;
        sd var3_refLifetime1;
        var3 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_n = new int[this.field_w.field_i.e(0)];
        this.field_i = new int[this.field_w.field_i.e(0)];
        this.field_y = new boolean[this.field_w.field_i.e(0)];
        var4 = this.field_m.field_g.field_e;
        var5 = -23 % ((-64 - param0) / 50);
        for (var6 = 0; var4.length > var6; var6++) {
          var7 = var4[var6];
          if (var7.field_y == this.field_w &&
            var7.field_x > var7.field_N) {
            q.field_Ab[var7.field_p] = var7.field_x - var7.field_N;
            if (var7.field_J < q.field_Ab[var7.field_p]) {
              throw new RuntimeException(var7.field_I + ": available=" + q.field_Ab[var7.field_p] + ", garrison_next=" + var7.field_J);
            }
            var3_ref = (sd) (this.field_w.field_i.d(0));
            var8 = 0;
            for (var2 = 0; var2 < this.field_n.length; var2++) {
              if (var7.field_R != var3_ref) {
                var3_ref = (sd) (this.field_w.field_i.a((byte) -71));
                continue;
              }
              var8 = 1;
              this.field_n[var2] = this.field_n[var2] + q.field_Ab[var7.field_p];
              break;
            }
            if (var8 == 0) {
              throw new RuntimeException("Star owned by " + this.field_w.field_t + " is not in any of its Territories: " + var7.field_I);
            }
          } else {
            q.field_Ab[var7.field_p] = 0;
          }
        }
        if (this.field_m.field_o.field_i) {
          for (var2Lifetime1 = 0; var2Lifetime1 < this.field_i.length; var2Lifetime1++) {
            this.field_i[var2Lifetime1] = this.field_w.field_m.field_x;
          }
        } else {
          var3_refLifetime1 = (sd) (this.field_w.field_i.d(0));
          for (var2Lifetime1 = 0; var2Lifetime1 < this.field_i.length; var2Lifetime1++) {
            this.field_i[var2Lifetime1] = var3_refLifetime1.field_x;
            var3_refLifetime1 = (sd) (this.field_w.field_i.a((byte) -71));
          }
        }
    }

    private final void b(int param0) {
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var2;
        wf[] var3_ref_wf__;
        int var3;
        wf[] var4;
        wf var5_ref_wf;
        wf var6;
        ln var8;
        int var9;
        sd var10;
        int var2Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 7270) {
          var10 = (sd) null;
          this.a((sd) null, -28, (byte) 100);
        }
        var3_ref_wf__ = this.field_e;
        for (var4_int = 0; var3_ref_wf__.length > var4_int; var4_int++) {
          var5_ref_wf = var3_ref_wf__[var4_int];
          if (var5_ref_wf instanceof ac) {
            var2 = var5_ref_wf.field_n.field_p;
            if (kq.field_c[var2] < q.field_Ab[var2]) {
              q.field_Ab[var2] = q.field_Ab[var2] - kq.field_c[var2];
              kq.field_c[var2] = 0;
            } else {
              kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var2];
              q.field_Ab[var2] = 0;
            }
          }
        }
        var4 = this.field_e;
        for (var5 = 0; var5 < var4.length; var5++) {
          L3: {
            var6 = var4[var5];
            if (var6 instanceof ac) {
              var3 = 0;
              var2Lifetime1 = var6.field_n.field_p;
              for (var7 = 0; 2 > var7; var7++) {
                var8 = var6.field_n.field_R.j(param0 ^ 23379);
                while (var8 != null) {
                  if (var6.field_n != var8 &&
                    0 != q.field_Ab[var8.field_p] && (var3 != 0 ||
                    !no.field_f[var8.field_p])) {
                    if (kq.field_c[var2Lifetime1] < q.field_Ab[var8.field_p]) {
                      this.a(kq.field_c[var2Lifetime1], (byte) 102, var6.field_n, var8);
                      q.field_Ab[var8.field_p] = q.field_Ab[var8.field_p] - kq.field_c[var2Lifetime1];
                      kq.field_c[var2Lifetime1] = 0;
                      break L3;
                    }
                    this.a(q.field_Ab[var8.field_p], (byte) 114, var6.field_n, var8);
                    kq.field_c[var2Lifetime1] = kq.field_c[var2Lifetime1] - q.field_Ab[var8.field_p];
                    q.field_Ab[var8.field_p] = 0;
                  }
                  var8 = var6.field_n.field_R.h(-23410);
                }
                var3 = 1;
              }
              if (kq.field_c[var2Lifetime1] > 0) {
                throw new RuntimeException(this.field_w.field_t + " has run out of available fleets, but has not yet met its defender allocation at " + var6.field_n.field_I + ".");
              }
            }
          }
        }
    }

    private final void h(int param0) {
        ln var3 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_l.a(0);
        if (param0 != 100) {
          this.a(62);
        }
        sd var2 = (sd) (this.field_w.field_i.d(0));
        while (var2 != null) {
          var3 = var2.j(param0 ^ 18257);
          while (var3 != null) {
            this.field_l.a((byte) -113, new co(var3, this.field_m.field_o.field_l, no.field_f));
            var3 = var2.h(-23410);
          }
          var2 = (sd) (this.field_w.field_i.a((byte) -71));
        }
    }

    public final void b(byte param0) {
        int var6 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        sd var6_ref_sd;
        int var7;
        ac var8;
        int var9;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime1Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_w.field_i.g(-74)) {
          return;
        }
        bk.field_a.a(0);
        ed.field_g.a(0);
        vj.field_E.a(0);
        km.field_u = null;
        no.field_b = false;
        mr.field_f = false;
        for (var2 = 0; var2 < this.field_x; var2++) {
          no.field_f[var2] = false;
          q.field_Ab[var2] = 0;
          kq.field_c[var2] = 0;
          og.field_c[var2] = 0;
        }
        this.j(114);
        this.i(15401);
        this.d(114);
        this.h(100);
        this.e(0);
        this.c(-30426);
        this.g(115);
        this.d((byte) 46);
        this.g((byte) -70);
        this.b(true, 0);
        var2Lifetime1 = 0;
        for (var4 = 0; var4 < this.field_n.length; var4++) {
          var2Lifetime1 = var2Lifetime1 + this.field_n[var4];
          var2Lifetime1 = var2Lifetime1 + this.field_i[var4];
        }
        var3 = 0;
        var3Lifetime1 = var2Lifetime1;
        while (true) {
          if (0 >= var2Lifetime1) {
            this.b(7270);
            this.f((byte) 127);
            if (param0 > -3) {
              this.b((byte) 56);
            }
            this.e((byte) -44);
            if (this.field_m.a(ed.field_g, this.field_w, -6, bk.field_a, vj.field_E)) {
            }
            this.field_m.a(ed.field_g, 0, bk.field_a, vj.field_E);
            return;
          }
          this.b(false, 0);
          var2Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_n.length; var4Lifetime1++) {
            var2Lifetime1 = var2Lifetime1 + this.field_n[var4Lifetime1];
            var2Lifetime1 = var2Lifetime1 + this.field_i[var4Lifetime1];
          }
          if (var3Lifetime1 != var2Lifetime1) {
            var3Lifetime1 = var2Lifetime1;
            continue;
          }
          var4Lifetime1Lifetime1 = 1;
          var5 = 0;
          var6_ref_sd = (sd) (this.field_w.field_i.d(0));
          while (var6_ref_sd != null) {
            var7 = 0;
            var8 = (ac) (this.field_u.d(0));
            while (var8 != null) {
              if (var6_ref_sd == var8.field_n.field_R) {
                var7++;
              }
              var8 = (ac) (this.field_u.a((byte) -71));
            }
            if (var7 <= 0) {
              this.a(var6_ref_sd, var5, (byte) -122);
            } else {
              var4Lifetime1Lifetime1 = 0;
            }
            var5++;
            var6_ref_sd = (sd) (this.field_w.field_i.a((byte) -71));
          }
          var2Lifetime1 = 0;
          if (var4Lifetime1Lifetime1 != 0 &&
            this.field_m.field_o.field_i) {
            this.c((byte) 35);
          }
          for (var6 = 0; this.field_n.length > var6; var6++) {
            var2Lifetime1 = var2Lifetime1 + this.field_n[var6];
            var2Lifetime1 = var2Lifetime1 + this.field_i[var6];
          }
          if (var2Lifetime1 > 0) {
            throw new RuntimeException(this.field_w.field_t + " hasn't allocated any more idle fleets this loop, even though there are DefendTasks.");
          }
        }
    }

    private final void c(byte param0) {
        int var7 = 0;
        int var3_int = 0;
        int var5 = 0;
        fs stackIn_8_0 = null;
        fs stackIn_8_1 = null;
        fs stackIn_28_0 = null;
        fs stackIn_28_1 = null;
        int var2;
        ln[] var3;
        int var4;
        int var6;
        ln[] var6_ref_ln__;
        int var9;
        ln var10;
        int var11;
        int var12;
        ln[] var13;
        ln var14;
        ln var15;
        ln[] var16;
        ln var17;
        ln[] var18;
        ln[] var19;
        ln var20;
        int var4Lifetime1;
        int var6Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_m.field_o.field_i) {
          return;
        }
        var2 = 0;
        var13 = this.field_m.field_g.field_e;
        if (param0 <= 4) {
          this.i(15);
        }
        for (var4 = 0; var13.length > var4; var4++) {
          var14 = var13[var4];
          stackIn_8_0 = this.field_w;
          stackIn_8_1 = var14.field_y;
          if (stackIn_8_0 == stackIn_8_1) {
            var6_ref_ln__ = var14.field_D;
            for (var7 = 0; var7 < var6_ref_ln__.length; var7++) {
              var15 = var6_ref_ln__[var7];
              if (this.field_w != var15.field_y) {
                var2++;
                break;
              }
            }
          }
        }
        if (0 == var2) {
          this.a(-1, this.field_w.field_m.field_q, this.field_i[0]);
          for (var3_int = 0; this.field_i.length > var3_int; var3_int++) {
            this.field_i[var3_int] = 0;
          }
          return;
        }
        var3 = new ln[var2];
        var4Lifetime1 = 0;
        var16 = this.field_m.field_g.field_e;
        for (var6 = 0; var6 < var16.length; var6++) {
          var17 = var16[var6];
          stackIn_28_0 = this.field_w;
          stackIn_28_1 = var17.field_y;
          if (stackIn_28_0 == stackIn_28_1) {
            var18 = var17.field_D;
            var9 = 0;
            while (var9 < var18.length) {
              var10 = var18[var9];
              if (var10.field_y == this.field_w) {
                var9++;
                continue;
              }
              var3[var4Lifetime1] = var17;
              var4Lifetime1++;
              break;
            }
          }
        }
        while (0 < this.field_i[0]) {
          var19 = var3;
          var12 = 0;
          var6Lifetime1 = var12;
          while (var12 < var19.length) {
            var20 = var19[var12];
            this.a(-1, var20, 1);
            this.field_i[0] = this.field_i[0] - 1;
            if (this.field_i[0] == 0) {
              break;
            }
            var12++;
          }
        }
        for (var5 = 0; var5 < this.field_i.length; var5++) {
          this.field_i[var5] = 0;
        }
        return;
    }

    private final void a(ac param0, boolean param1, int param2) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        sd var4 = null;
        RuntimeException var4_ref = null;
        sd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln[] var10_ref_ln__ = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        ln[] var14 = null;
        ln var15 = null;
        ln[] var16 = null;
        ln var17 = null;
        ln var17Lifetime1;
        ln var17Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = param0.field_n.field_R;
          var6 = 0;
          var7 = 0;
          var8 = 99 % ((param2 - 37) / 48);
          var4 = (sd) (this.field_w.field_i.d(0));
          while (var4 != null) {
            if (var4 != var5) {
              var6++;
              var4 = (sd) (this.field_w.field_i.a((byte) -71));
              continue;
            }
            var7 = 1;
            break;
          }
          if (var7 == 0) {
            throw new RuntimeException("DefendTask's star does not appear to be in AI's territory: " + param0.field_n.field_I + ".");
          }
          var9 = (-this.field_t + 50) * param0.field_i / 250 + param0.field_i;
          if (param1) {
            if (mr.field_f) {
              var14 = param0.field_n.field_D;
              var10_ref_ln__ = var14;
              for (var11 = 0; var14.length > var11; var11++) {
                var15 = var14[var11];
                var17 = var15;
                var17Lifetime2 = var15;
                if (var15 == km.field_u &&
                  var15.field_y != null) {
                  param0.field_i = param0.field_i - var15.field_x;
                  if (param0.field_i < 0) {
                    param0.field_i = 0;
                  }
                  var9 = param0.field_i + (50 - this.field_t) * param0.field_i / 250;
                  break;
                }
              }
            }
            if (this.field_w.field_u[2] >= 5 &&
              !mr.field_f) {
              var16 = param0.field_n.field_D;
              for (var11Lifetime2 = 0; var16.length > var11Lifetime2; var11Lifetime2++) {
                var17Lifetime1 = var16[var11Lifetime2];
                if (var17Lifetime1.field_y != null &&
                  this.field_w != var17Lifetime1.field_y &&
                  (int)((double)var9 * 0.8) <= var17Lifetime1.field_x &&
                  var17Lifetime1.field_x > 10) {
                  this.a((byte) -82, var17Lifetime1);
                  param0.field_i = param0.field_i - var17Lifetime1.field_x;
                  if (param0.field_i < 0) {
                    param0.field_i = 0;
                  }
                  var9 = (50 - this.field_t) * param0.field_i / 250 + param0.field_i;
                  break;
                }
              }
            }
            if (5 <= this.field_w.field_u[0] &&
              !no.field_b &&
              !param0.field_n.field_u && (var9 > this.field_n[var6] ||
              var9 > 20)) {
              this.a(param0.field_n, 31308);
              if (param0.field_i > 1) {
                param0.field_i = param0.field_i / 2;
                var9 = param0.field_i + param0.field_i * (-this.field_t + 50) / 250;
              }
            }
          }
          if (0 == var9) {
            param0.b((byte) -62);
            return;
          }
          if (!param1) {
            var9 = var9 * 3 / 10;
            if (var9 == 0) {
              var9 = 1;
            }
          }
          if (var9 <= this.field_n[var6]) {
            this.field_n[var6] = this.field_n[var6] - var9;
            kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + var9;
            var9 = 0;
          } else {
            if (this.field_n[var6] > 0) {
              var9 = var9 - this.field_n[var6];
              kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + this.field_n[var6];
              this.field_n[var6] = 0;
            }
            if (this.field_i[var6] >= var9) {
              var10 = var9;
              if (this.field_m.field_o.field_i) {
                for (var11Lifetime1 = 0; this.field_i.length > var11Lifetime1; var11Lifetime1++) {
                  this.field_i[var11Lifetime1] = this.field_i[var11Lifetime1] - var9;
                }
              } else {
                this.field_i[var6] = this.field_i[var6] - var9;
              }
            } else {
              var9 = var9 - this.field_i[var6];
              var10 = this.field_i[var6];
              if (this.field_m.field_o.field_i) {
                for (var11Lifetime1 = 0; this.field_i.length > var11Lifetime1; var11Lifetime1++) {
                  this.field_i[var11Lifetime1] = 0;
                }
              } else {
                this.field_i[var6] = 0;
              }
            }
            if (var10 > 0) {
              this.a(-1, param0.field_n, var10);
              og.field_c[param0.field_n.field_p] = og.field_c[param0.field_n.field_p] + var10;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_75_0 = var4_ref;
          stackIn_75_1 = new StringBuilder().append("hi.AA(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(fs param0, int param1) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!this.field_p) {
            return;
          }
          var3_int = this.field_q[param0.field_x];
          if (param1 != 7686) {
            this.field_w = (fs) null;
          }
          var7 = var3_int;
          if (var7 != 1 &&
            var7 != 6) {
            if (var7 != 2 &&
              7 != var7) {
              if (3 == var7) {
                var4 = 2;
              } else if (var7 == 4) {
                var4 = 3;
              } else if (5 == var7) {
                var4 = 13;
              } else if (var7 == -1) {
                var4 = 4;
              } else if (var7 == -2) {
                var4 = 5;
              } else if (var7 != -3) {
                var4 = -1;
              } else {
                var4 = 6;
                var6 = this.field_m.field_m[this.field_m.field_r - 2];
                var5 = this.field_m.field_m[-1 + this.field_m.field_r];
                if (~this.field_w.field_x != ~var5 &&
                  param0.field_x != var5 &&
                  !((3 * this.field_m.field_D[var6]) >= (2 * this.field_m.field_D[var5]))) {
                  var4 = 5;
                }
              }
            } else {
              var4 = 1;
            }
          } else {
            var4 = 0;
          }
          if (var4 != -1) {
            this.field_c.a(0, (byte) -125, param0, this.field_w, var4);
          }
          if (!this.field_w.field_h[param0.field_x] &&
            0 > var3_int) {
            this.field_c.a((byte) -63, this.field_w, param0);
            this.b(true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("hi.SA(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var2;
        ac var3;
        kl var3_ref;
        ac var4;
        kl var4_ref;
        int var5;
        int[] var6;
        int[] var10;
        int var2Lifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var3 = (ac) (this.field_u.d(0));
        while (var3 != null) {
          var3.field_l = (var3.field_j << 16) * (-this.field_j + 100) / (var3.field_i * 100);
          var2++;
          var3 = (ac) (this.field_u.a((byte) -71));
        }
        if (param0 < 93) {
          return;
        }
        var3_ref = (kl) (this.field_k.d(0));
        while (var3_ref != null) {
          var3_ref.field_l = (var3_ref.field_j << 16) * this.field_j / (var3_ref.field_i * 100);
          var2++;
          var3_ref = (kl) (this.field_k.a((byte) -71));
        }
        this.field_e = new wf[var2];
        var6 = new int[var2];
        var10 = var6;
        var2Lifetime1 = 0;
        var4 = (ac) (this.field_u.d(0));
        while (var4 != null) {
          this.field_e[var2Lifetime1] = (wf) ((Object) var4);
          var6[var2Lifetime1] = var4.field_l;
          var2Lifetime1++;
          var4 = (ac) (this.field_u.a((byte) -71));
        }
        var4_ref = (kl) (this.field_k.d(0));
        while (var4_ref != null) {
          this.field_e[var2Lifetime1] = (wf) ((Object) var4_ref);
          var6[var2Lifetime1] = var4_ref.field_l;
          var2Lifetime1++;
          var4_ref = (kl) (this.field_k.a((byte) -71));
        }
        ak.a(var10, -43, this.field_e);
        return;
    }

    private final void d(int param0) {
        int var2 = 0;
        sd var2_ref_sd;
        int var3;
        int var4;
        int var5;
        int var6;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_s = new int[this.field_w.field_i.e(0)][4];
        if (param0 < 104) {
          this.field_w = (fs) null;
        }
        if (this.field_m.field_o.field_i) {
          for (var2 = 0; var2 < 4; var2++) {
            var3 = 1 - this.field_w.field_m.field_u[var2] + this.field_w.field_m.field_u[this.field_w.field_m.field_w[0]];
            var6 = 0;
            var4 = var6;
            while (var6 < this.field_s.length) {
              this.field_s[var6][var2] = var3;
              var6++;
            }
          }
        } else {
          var2_ref_sd = (sd) (this.field_w.field_i.d(0));
          for (var3 = 0; this.field_s.length > var3; var3++) {
            for (var4 = 0; var4 < 4; var4++) {
              this.field_s[var3][var4] = -var2_ref_sd.field_u[var4] + 1 + var2_ref_sd.field_u[var2_ref_sd.field_w[0]];
            }
            var2_ref_sd = (sd) (this.field_w.field_i.a((byte) -71));
          }
        }
    }

    public static void f(int param0) {
        field_a = null;
        if (param0 > -42) {
          field_a = (vr) null;
        }
        field_d = null;
        field_o = null;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        qr stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        qr stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        qr stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        nj.a(param1 ^ -27033);
        if (param1 != -26671) {
          field_d = (String) null;
        }
        if (0 <= a.field_j) {
          nm.field_c.field_z = re.a(vn.field_A, 4371, new String[]{Integer.toString(a.field_j)});
        } else {
          nm.field_c.field_z = null;
        }
        stackIn_11_0 = ia.field_j;
        stackIn_12_1 = (param0) && (!param2) && (!on.field_b) && (np.field_a == null) && (he.field_p == null);
        ((qr) (Object) stackIn_11_0).a(stackIn_12_1, -20429);
        stackIn_18_0 = se.field_i;
        stackIn_19_1 = (param0) && (!param2) && (!on.field_b) && (null == np.field_a) && (null == he.field_p);
        ((qr) (Object) stackIn_18_0).a(stackIn_19_1, -20429);
        stackIn_23_0 = so.field_v;
        stackIn_24_1 = (param0) && (!param2) && (on.field_b);
        ((qr) (Object) stackIn_23_0).a(stackIn_24_1, param1 ^ 10210);
        bc.field_g.field_d.f(false);
        if (0 != vm.field_Ab.field_rb) {
          s.field_d = true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (gb.field_m.field_rb != 0) {
          if (!hm.field_o &&
            0 >= es.field_m && (!(bs.field_b >= 2) ||
            !di.field_p[12])) {
            uc.field_B = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            gd.a(param3, 1);
          }
        }
        if (rq.field_b.field_rb != 0) {
          if (1 == nl.field_a.length &&
            nl.field_a[0] != qk.field_x) {
            qk.field_x = nl.field_a[0];
          }
          ei.a(param3, qk.field_x, mk.field_d, true, false, 0);
        }
        if (li.field_d.field_rb != 0) {
          on.field_b = false;
        }
    }

    private final void c(int param0) {
        int var3 = 0;
        ln var4;
        int var8;
        ln[] var9;
        fs stackIn_5_0 = null;
        fs stackIn_5_1 = null;
        ln[] var5;
        int var6;
        ln var7;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_k.a(0);
        if (param0 != -30426) {
          return;
        }
        var9 = this.field_m.field_g.field_e;
        for (var3 = 0; var9.length > var3; var3++) {
          var4 = var9[var3];
          stackIn_5_0 = var4.field_y;
          stackIn_5_1 = this.field_w;
          if (stackIn_5_0 != stackIn_5_1 && (var4.field_y == null ||
            !this.field_w.field_h[var4.field_y.field_x])) {
            var5 = var4.field_D;
            var6 = 0;
            while (var6 < var5.length) {
              var7 = var5[var6];
              if (var7.field_y != this.field_w) {
                var6++;
                continue;
              }
              this.field_k.a((byte) -113, new kl(var4, this.field_w.field_i, this.field_s, this.field_w, this.field_m.field_x, this.field_g, this.field_m));
              break;
            }
          }
        }
    }

    private final void b(boolean param0, int param1) {
        int var4 = 0;
        wf[] var3;
        wf var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = this.field_e;
        for (var4 = param1; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (!(var5 instanceof ac)) {
            if (!(var5 instanceof kl)) {
              throw new RuntimeException("prioritizedTasks contains invalid task for Star " + var5.field_n.field_I + ".");
            }
            this.a((byte) -124, (kl) (var5), param0);
          } else {
            this.a((ac) (var5), param0, 95);
          }
        }
    }

    public final int a(boolean param0) {
        if (param0) {
          this.field_c = (mn) null;
        }
        return 8;
    }

    private final void a(int param0, byte param1, ln param2, ln param3) {
        fs stackIn_37_0 = null;
        fs stackIn_37_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        mg var5Lifetime1;
        mg var5Lifetime2;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 != null &&
            param2 != null) {
            if (param0 == 0) {
              return;
            }
            if (param0 < 0) {
              throw new RuntimeException();
            }
            if (this.field_w != param3.field_y) {
              throw new RuntimeException(this.field_w.field_t + " is attempting to move fleets from a system it does not own: " + param3.field_I + ".");
            }
            if (param2.field_R != param3.field_R &&
              !param3.b(param2, (byte) 10)) {
              throw new RuntimeException(this.field_w.field_t + " is attempting an invalid move from " + param3.field_I + " to " + param2.field_I + ".");
            }
            var5 = (mg) (param3.field_s.c(-128));
            while (var5 != null) {
              if (var5.field_G != this.field_w ||
                param2 != var5.field_y) {
                var5 = (mg) (param3.field_s.b(32));
                continue;
              }
              break;
            }
            if (var5 != null) {
              if (var5.field_z > param0) {
                var5.field_z = var5.field_z - param0;
                var5.field_y.field_J = var5.field_y.field_J + param0;
                return;
              }
              var5.b((byte) -82);
              var5.a(16);
              var5.d(true);
              var5.field_y.field_J = var5.field_y.field_J + var5.field_z;
              param0 = param0 - var5.field_z;
            }
            if (param1 < 86) {
              this.b(true, 49);
            }
            if (param0 == 0) {
              return;
            }
            if (param3.field_J < param0) {
              throw new RuntimeException("Trying to move " + param0 + " fleets from " + param3.field_I + " to " + param2.field_I + " but garrison_next is only " + param3.field_J + ".");
            }
            param3.field_J = param3.field_J - param0;
            var5Lifetime1 = (mg) (ed.field_g.d(0));
            while (var5Lifetime1 != null) {
              stackIn_37_0 = this.field_w;
              stackIn_37_1 = var5Lifetime1.field_G;
              if (stackIn_37_0 != stackIn_37_1 ||
                var5Lifetime1.field_y != param3 ||
                param2 != var5Lifetime1.field_B) {
                var5Lifetime1 = (mg) (ed.field_g.a((byte) -71));
                continue;
              }
              break;
            }
            if (var5Lifetime1 != null) {
              var5Lifetime1.field_z = var5Lifetime1.field_z + param0;
              return;
            }
            var5Lifetime2 = new mg(param3, param2, param0);
            ed.field_g.a((byte) -113, var5Lifetime2);
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_50_0 = var5_ref;
          stackIn_50_1 = new StringBuilder().append("hi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    private final int a(boolean param0, ln[] param1, ln param2, int param3, int param4) {
        int var13 = 0;
        int dupTemp$0 = 0;
        fs stackIn_4_0 = null;
        fs stackIn_4_1 = null;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        sd var10_ref = null;
        int var11 = 0;
        ln[] var12 = null;
        ln var14 = null;
        int var15 = 0;
        Object var10Lifetime1;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6_int = 0;
          var11 = 0;
          L1: while (true) {
            if (var11 < param1.length) {
              stackIn_4_0 = param1[var11].field_y;
              stackIn_4_1 = this.field_w;
              boolean decompiledFrameRemainder1 = true;
              if (stackIn_4_0 == stackIn_4_1 &&
                q.field_Ab[param1[var11].field_p] != 0) {
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted0 = true;
                var7 = 0;
                if ((!param0) &&
                  (decompiledFrameRemainder1 = (!(param0) ||
                  var7 == 1))) {
                  var8 = q.field_Ab[param1[var11].field_p];
                  var10 = null;
                  if (var8 > param4) {
                    var8 = param4;
                  }
                  var9 = 0;
                  var10_ref = (sd) (this.field_w.field_i.d(0));
                  while (var10_ref != null) {
                    if (var10_ref == param1[var11].field_R) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var9++;
                    var10_ref = (sd) (this.field_w.field_i.a((byte) -71));
                  }
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted0)) {
                  var12 = param1[var11].field_D;
                  for (var13 = 0; var12.length > var13; var13++) {
                    var14 = var12[var13];
                    if (this.field_w != var14.field_y && (var14.field_y == null ||
                      !this.field_w.field_h[var14.field_y.field_x])) {
                      var7++;
                    }
                  }
                  decompiledFrameRemainder1 = (!(param0) ||
                    var7 == 1);
                  if (decompiledFrameRemainder1) {
                    var8 = q.field_Ab[param1[var11].field_p];
                    var10Lifetime1 = null;
                    if (var8 > param4) {
                      var8 = param4;
                    }
                    var9 = 0;
                    var10_ref = (sd) (this.field_w.field_i.d(0));
                    while (var10_ref != null) {
                      if (var10_ref == param1[var11].field_R) {
                        break;
                      }
                      var9++;
                      var10_ref = (sd) (this.field_w.field_i.a((byte) -71));
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (var10_ref == null) {
                    throw new RuntimeException("Cannot find territory of star " + this.field_w.field_t + " wants to attack from: " + param1[var11].field_I + ".");
                  }
                  if (this.field_n[var9] < var8) {
                    var8 = this.field_n[var9];
                  }
                  this.a(var8, (byte) 115, param2, param1[var11]);
                  dupTemp$0 = param1[var11].field_p;
                  q.field_Ab[dupTemp$0] = q.field_Ab[dupTemp$0] - var8;
                  var6_int = var6_int + var8;
                  this.field_n[var9] = this.field_n[var9] - var8;
                  if (var6_int == param4) {
                    break L1;
                  }
                }
              }
              var11++;
              continue;
            }
            break;
          }
          if (param3 <= 64) {
            field_a = (vr) null;
          }
          stackIn_51_0 = var6_int;
          return stackIn_51_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_54_0 = var6;
          stackIn_54_1 = new StringBuilder().append("hi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param2 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(fs param0, byte param1) {
        int var3_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = this.field_q[param0.field_x];
          var7 = var3_int;
          if (-1 == var7) {
            var4 = 10;
          } else {
            if (var7 != -2) {
              if (var7 == -3) {
                var4 = 12;
                var6 = this.field_m.field_m[-2 + this.field_m.field_r];
                var5 = this.field_m.field_m[this.field_m.field_r - 1];
                if (var5 != this.field_w.field_x &&
                  var5 != this.field_r &&
                  this.field_m.field_D[var5] * 2 > this.field_m.field_D[var6] * 3) {
                  var4 = 11;
                }
              } else {
                var4 = -1;
              }
            } else {
              var4 = 11;
            }
          }
          if (var4 != -1) {
            this.field_c.a(0, (byte) -109, param0, this.field_w, var4);
          }
          if (param1 != -42) {
            this.e((byte) -14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("hi.LA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(ln param0, int param1) {
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        qm var4 = null;
        try {
          if (this.field_w.field_u[0] < 5) {
            throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net it doesn't have at star " + param0.field_I);
          }
          if (!no.field_b) {
            if (this.field_w != param0.field_y) {
              throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net in a system it doesn't own: " + param0.field_I);
            }
            if (param0.field_u) {
              throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net in a system that already has one: " + param0.field_I);
            }
            vj.field_E.a((byte) -113, new qm(0, this.field_w, param0));
            no.field_b = true;
            qo.field_e = param0;
            if (param1 != 31308) {
              this.field_t = -21;
            }
            return;
          }
          var3 = null;
          var4 = (qm) (vj.field_E.d(0));
          while (var4 != null) {
            if (var4.field_o != 0) {
              var4 = (qm) (vj.field_E.a((byte) -71));
              continue;
            }
            var3 = var4;
            break;
          }
          if (var3 != null) {
            throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net it has already used." + " Already deployed at star " + ((qm) (var3)).field_q.field_I + ", now trying to deploy ot " + param0.field_I);
          }
          throw new RuntimeException(this.field_w.field_t + "'s deployedDefensiveNet variable incorrectly set to true.");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("hi.H(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, fs param1, int param2) {
        int var10_int = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        fs stackIn_55_0 = null;
        fs stackIn_55_1 = null;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        fs var5 = null;
        fs var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        ln var11_ref_ln = null;
        int var12 = 0;
        ln[] var13 = null;
        ln var15 = null;
        int var16 = 0;
        int var12Lifetime1;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = param1.field_x;
          if (this.field_w != param1 &&
            !this.field_w.field_h[var4_int]) {
            if (0 != (this.field_m.field_w & 1 << var4_int)) {
              stackIn_8_0 = 0;
              return stackIn_8_0;
            }
            if (this.field_g == var4_int) {
              stackIn_12_0 = 6;
              return stackIn_12_0;
            }
            var5 = this.field_m.field_v[this.field_m.field_m[-1 + this.field_m.field_r]];
            var6 = this.field_m.field_v[this.field_m.field_m[-2 + this.field_m.field_r]];
            if (this.field_g == -1 &&
              param1 == var5) {
              stackIn_17_0 = 1;
              return stackIn_17_0;
            }
            var7 = 0;
            var8 = 0;
            var9_ref_ln__ = this.field_m.field_g.field_e;
            for (var10_int = 0; var9_ref_ln__.length > var10_int; var10_int++) {
              var11_ref_ln = var9_ref_ln__[var10_int];
              if (this.field_w == var11_ref_ln.field_y) {
                var12 = 0;
                var13 = var11_ref_ln.field_D;
                for (var14 = 0; var14 < var13.length; var14++) {
                  var15 = var13[var14];
                  if (var15.field_y == param1) {
                    var12 = 1;
                    var7 = var7 + var15.field_x;
                  }
                }
                if (var12 != 0) {
                  var8 = var8 + var11_ref_ln.field_x;
                }
              }
            }
            var7 = var7 + var7 * (50 - this.field_j) / 250;
            if (var7 > var8 * 2) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            if (this.field_g != -1 &&
              param1.field_h[this.field_g]) {
              stackIn_41_0 = 7;
              return stackIn_41_0;
            }
            if (this.field_g == -1 &&
              var5.field_h[var4_int]) {
              stackIn_45_0 = 2;
              return stackIn_45_0;
            }
            if (-1 != this.field_g &&
              var5 == param1 &&
              this.field_g != var5.field_x) {
              stackIn_52_0 = (this.field_w.field_x != this.field_g) ? -2 : -3;
              return stackIn_52_0;
            }
            if (this.field_g == -1) {
              stackIn_55_0 = var6;
              stackIn_55_1 = (fs) (param1);
              if (stackIn_55_0 == stackIn_55_1) {
                stackIn_59_0 = (var5 == this.field_w) ? -3 : -2;
                return stackIn_59_0;
              }
            }
            var9 = this.field_m.field_D[var4_int];
            var9 = var9 + var9 * (50 - this.field_j) / 250;
            if (var7 < var8 &&
              this.field_m.field_D[this.field_w.field_x] * 2 > 3 * var9) {
              stackIn_63_0 = 3;
              return stackIn_63_0;
            }
            var10 = oe.field_g[this.field_w.field_x];
            var11 = param0;
            if (param2 != 3) {
              stackIn_66_0 = 120;
              return stackIn_66_0;
            }
            for (var12Lifetime1 = 0; this.field_m.field_g.field_e.length > var12Lifetime1; var12Lifetime1++) {
              if (jf.field_e[var12Lifetime1] &&
                oe.field_g[var4_int][var12Lifetime1] <= var10[var12Lifetime1]) {
                var11--;
              }
            }
            if (var11 < 5 &&
              var11 < param0) {
              stackIn_79_0 = 4;
              return stackIn_79_0;
            }
            stackIn_81_0 = -3;
            return stackIn_81_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_84_0 = var4;
          stackIn_84_1 = new StringBuilder().append("hi.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_84_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, sd param2) {
        int var9 = 0;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        qa var6 = null;
        ln var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = null;
          var5 = 0;
          var6_int = 57 / ((26 - param1) / 33);
          var7 = param2.j(18229);
          while (var7 != null) {
            kq.field_c[var7.field_p] = 0;
            q.field_Ab[var7.field_p] = 0;
            var7.field_J = var7.field_x;
            var8 = 0;
            for (var9 = 0; var9 < 4; var9++) {
              var8 = var8 + var7.field_G[var9];
            }
            if (var5 < var8) {
              var4 = var7;
              var5 = var8;
            }
            var7 = param2.h(-23410);
          }
          var6 = (qa) (bk.field_a.d(0));
          while (var6 != null) {
            if (param2 == var6.field_u.field_R) {
              var6.b((byte) -79);
            }
            var6 = (qa) (bk.field_a.a((byte) -71));
          }
          var6_ref = param2.j(18229);
          while (var6_ref != null) {
            if (var6_ref != var4) {
              this.a(var6_ref.field_x, (byte) 110, (ln) (var4), var6_ref);
            }
            var6_ref = param2.h(-23410);
          }
          this.a(-1, (ln) (var4), param2.field_x);
          this.field_i[param0] = 0;
          this.field_n[param0] = 0;
          this.field_y[param0] = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("hi.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(int param0, ln param1, int param2) {
        qa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (~param2 == param0) {
            return;
          }
          param1.field_J = param1.field_J + param2;
          var4 = (qa) (bk.field_a.d(0));
          while (true) {
            if (var4 == null) {
              bk.field_a.a((byte) -113, new qa(param1, param2));
              return;
            }
            if (var4.field_u != param1) {
              var4 = (qa) (bk.field_a.a((byte) -71));
              continue;
            }
            break;
          }
          var4.field_v = var4.field_v + param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("hi.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        int var4_int = 0;
        int var2;
        int var3;
        fs[] var4;
        fs var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        ac var11;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_w.field_i.g(param0 ^ 82)) {
          this.field_p = false;
        }
        if (!this.field_p) {
          return;
        }
        if (!this.field_m.field_o.field_j) {
          return;
        }
        if (param0 != -63) {
          var11 = (ac) null;
          this.a((ac) null, false, -5);
        }
        this.field_r = -1;
        var2 = this.field_m.field_m[-1 + this.field_m.field_r];
        var3 = this.field_m.field_D[var2];
        for (var4_int = 0; var4_int < this.field_m.field_r; var4_int++) {
          if (var2 == var4_int) {
            this.field_v[var4_int] = 3;
          } else {
            if (2 * this.field_m.field_D[var4_int] >= var3) {
              this.field_v[var4_int] = this.field_v[var4_int] - 1;
            } else {
              this.field_v[var4_int] = 0;
            }
          }
        }
        var4 = this.field_m.field_x.b(0);
        if (1 != var4.length) {
          this.field_g = -1;
        } else {
          this.field_g = var4[0].field_x;
        }
        this.b(true);
        if (-1 != this.field_r) {
          var5 = this.field_m.field_v[this.field_r];
          if (this.field_f[this.field_r] <= 0) {
            var9 = this.field_q[this.field_r];
            if (var9 != -1) {
              if (-2 == var9) {
                var6 = 8;
              } else {
                if (var9 != -3) {
                  var6 = -1;
                } else {
                  var6 = 9;
                  var7 = this.field_m.field_m[-1 + this.field_m.field_r];
                  var8 = this.field_m.field_m[this.field_m.field_r - 2];
                  if (var7 != this.field_w.field_x &&
                    this.field_r != var7 &&
                    this.field_m.field_D[var8] * 3 < this.field_m.field_D[var7] * 2) {
                    var6 = 8;
                  }
                }
              }
            } else {
              var6 = 7;
            }
            if (var6 != -1) {
              this.field_c.a(0, (byte) -109, var5, this.field_w, var6);
              this.field_f[this.field_r] = rg.a(6, 3, (byte) 104);
            }
          }
          this.field_c.a((byte) -63, this.field_w, var5);
        }
        return;
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (eo.a(param0, 7433)) {
            stackIn_5_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> 32);
            return stackIn_5_0;
          }
          if (param2 != -11) {
            field_d = (String) null;
          }
          var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
          do {
            var4 = param1.nextInt();
          } while (var4 >= var3_int);
          stackIn_11_0 = jf.a(param0, var4, -102);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hi.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int[] b(fs param0, int param1) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        boolean[] var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        ln var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 >= -91) {
            this.field_e = (wf[]) null;
          }
          var17 = new int[this.field_x];
          var16 = var17;
          var15 = var16;
          var3 = var15;
          var4 = new boolean[this.field_x];
          var5 = this.field_m.field_g.field_e;
          for (var6 = 0; var6 < this.field_x; var6++) {
            stackIn_8_0 = (var5[var6].field_y != param0) ? 0 : 1;
            var7 = stackIn_8_0;
            var4[var6] = var7 != 0;
            stackIn_10_0 = var15;
            stackIn_10_1 = var6;
            if (var7 == 0) {
              stackIn_11_2 = 2147483647;
            } else {
              stackIn_11_2 = 0;
            }
            stackIn_10_0[stackIn_10_1] = stackIn_11_2;
          }
          var6Lifetime1 = 1;
          while (var6Lifetime1 != 0) {
            var6Lifetime1 = 0;
            for (var7Lifetime1 = 0; this.field_x > var7Lifetime1; var7Lifetime1++) {
              if (var4[var7Lifetime1]) {
                var4[var7Lifetime1] = false;
                var8 = var5[var7Lifetime1];
                var9 = 1 + var17[var7Lifetime1];
                var10 = var8.field_D;
                for (var11 = 0; var11 < var10.length; var11++) {
                  var12 = var10[var11];
                  var13 = var12.field_p;
                  if (var9 < var17[var13]) {
                    var17[var13] = var9;
                    var6Lifetime1 = 1;
                    var4[var13] = true;
                  }
                }
              }
            }
          }
          stackIn_26_0 = var15;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_29_0 = var3_ref;
          stackIn_29_1 = new StringBuilder().append("hi.N(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0) {
        int var4 = 0;
        int var2;
        fs[] var3;
        fs var5;
        int var7;
        int var6;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 63 % ((-36 - param0) / 38);
        var3 = this.field_m.field_v;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (this.field_w != var5) {
            var6 = vc.a((byte) -39, 2) + 14;
            this.field_c.a(0, (byte) -27, var5, this.field_w, var6);
          }
        }
    }

    private final void f(byte param0) {
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object var2;
        int var3;
        int var4;
        int var5;
        Object var6;
        ac var6_ref;
        qm var6_ref2;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ln var13;
        lo var14;
        ln var15;
        ln[] var16;
        ln var17;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var6 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (5 > this.field_w.field_u[1]) {
          return;
        }
        var2 = null;
        var4 = -92 / ((82 - param0) / 44);
        var3 = 2147483647;
        var5 = 2147483647;
        if (!this.field_m.field_o.field_i) {
          var6_ref = (ac) (this.field_u.d(0));
          while (var6_ref != null) {
            var15 = var6_ref.field_n;
            if (var15.field_L == 0) {
              var8 = 0;
              var9 = 0;
              for (var10 = 0; var10 < 4; var10++) {
                var9 = var9 + var15.field_G[var10];
                if (var15.field_R.field_u[var10] >= var15.field_G[var10]) {
                  continue;
                }
                var8 = 1;
                break;
              }
              if (var8 != 0) {
                var6_ref = (ac) (this.field_u.a((byte) -71));
                continue;
              }
              if (var2 == null ||
                var9 < var3 ||
                var3 == var9 &&
                !(var6_ref.field_i >= var5)) {
                var5 = var6_ref.field_i;
                var2 = var15;
                var3 = var9;
              }
            }
            var6_ref = (ac) (this.field_u.a((byte) -71));
          }
        } else {
          var6_ref = (ac) (this.field_u.d(0));
          var14 = this.field_w.field_m;
          while (var6_ref != null) {
            var13 = var6_ref.field_n;
            stackIn_7_0 = ~var13.field_L;
            stackIn_7_1 = -1;
            if (stackIn_7_0 == stackIn_7_1) {
              var9 = 0;
              var10 = 0;
              for (var11 = 0; var11 < 4; var11++) {
                var10 = var10 + var13.field_G[var11];
                if (var14.field_u[var11] >= var13.field_G[var11]) {
                  continue;
                }
                var9 = 1;
                break;
              }
              if (var9 == 0 &&
                (var2 == null ||
                var10 < var3 ||
                var10 == var3 &&
                !(var5 <= var6_ref.field_i))) {
                var3 = var10;
                var5 = var6_ref.field_i;
                var2 = var13;
              }
            }
            var6_ref = (ac) (this.field_u.a((byte) -71));
          }
        }
        var16 = this.field_m.field_g.field_e;
        for (var7 = 0; var16.length > var7; var7++) {
          var17 = var16[var7];
          var2 = var17;
          var2 = var17;
          if (var17.field_y == this.field_w &&
            !no.field_f[var17.field_p] &&
            var17.field_L == 0) {
            {
              var9Lifetime1 = 0;
              var10Lifetime1 = 0;
              if (this.field_m.field_o.field_i) {
                for (var11Lifetime1 = 0; var11Lifetime1 < 4; var11Lifetime1++) {
                  var10Lifetime1 = var10Lifetime1 + var17.field_G[var11Lifetime1];
                  if (var17.field_G[var11Lifetime1] > this.field_w.field_m.field_u[var11Lifetime1]) {
                    var9Lifetime1 = 1;
                    break;
                  }
                }
              } else {
                for (var11Lifetime1Lifetime1 = 0; var11Lifetime1Lifetime1 < 4; var11Lifetime1Lifetime1++) {
                  var10Lifetime1 = var10Lifetime1 + var17.field_G[var11Lifetime1Lifetime1];
                  if (var17.field_G[var11Lifetime1Lifetime1] > var17.field_R.field_u[var11Lifetime1Lifetime1]) {
                    var9Lifetime1 = 1;
                    break;
                  }
                }
              }
            }
            if (var9Lifetime1 == 0 && (var2 == null ||
              var3 > var10Lifetime1 ||
              var10Lifetime1 == var3 &&
              var5 > 0)) {
              var5 = 0;
              var3 = var10Lifetime1;
              var2 = var17;
            }
          }
        }
        if (var2 != null) {
          var6_ref2 = new qm(1, this.field_w, (ln) (var2));
          vj.field_E.a((byte) -113, var6_ref2);
        }
        return;
    }

    private final void e(int param0) {
        ln var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_u.a(param0 + 0);
        sd var6 = (sd) (this.field_w.field_i.d(0));
        int var3 = param0;
        while (var6 != null) {
          var4 = var6.j(18229);
          while (var4 != null) {
            if (no.field_f[var4.field_p]) {
              this.field_u.a((byte) -113, new ac(var4, this.field_s[var3], this.field_w.field_h, this.field_m.field_x));
            }
            var4 = var6.h(-23410);
          }
          var3++;
          var6 = (sd) (this.field_w.field_i.a((byte) -71));
        }
    }

    private final void a(sd param0, int param1, byte param2) {
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ln var5 = null;
        ln[] var5_array = null;
        int var6 = 0;
        ln[] var6_ref_ln__ = null;
        ln var7_ref_ln = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        ln var13 = null;
        ln[] var14 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var4_intLifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = 0;
          var5 = param0.j(18229);
          while (var5 != null) {
            var6_ref_ln__ = var5.field_D;
            for (var7 = 0; var7 < var6_ref_ln__.length; var7++) {
              var13 = var6_ref_ln__[var7];
              if (this.field_w == var13.field_y) {
                continue;
              }
              var4_int++;
              break;
            }
            var5 = param0.h(-23410);
          }
          if (var4_int == 0) {
            this.field_n[param1] = 0;
            if (!this.field_m.field_o.field_i) {
              this.a(-1, param0.field_q, this.field_i[param1]);
              this.field_i[param1] = 0;
            }
            return;
          }
          var14 = new ln[var4_int];
          var5_array = var14;
          var6 = 0;
          var7_ref_ln = param0.j(18229);
          while (var7_ref_ln != null) {
            var12 = var7_ref_ln.field_D;
            for (var9 = 0; var9 < var12.length; var9++) {
              var10 = var12[var9];
              if (var10.field_y == this.field_w) {
                continue;
              }
              var5_array[var6] = var7_ref_ln;
              var6++;
              break;
            }
            var7_ref_ln = param0.h(-23410);
          }
          var7Lifetime1 = this.field_n[param1] / var4_int;
          this.field_e = new wf[var4_int];
          if (param2 > -111) {
            return;
          }
          for (var9Lifetime1 = 0; var9Lifetime1 < var14.length; var9Lifetime1++) {
            this.field_e[var9Lifetime1] = (wf) ((Object) new ac(var14[var9Lifetime1], new int[4], this.field_w.field_h, this.field_m.field_x));
            stackIn_32_0 = (this.field_n[param1] % var4_int == 0) ? 0 : 1;
            var8 = stackIn_32_0;
            kq.field_c[var14[var9Lifetime1].field_p] = var7Lifetime1 + var8;
            this.field_n[param1] = this.field_n[param1] - (var8 + var7Lifetime1);
            var4_int--;
          }
          this.b(7270);
          if (!this.field_m.field_o.field_i) {
            var4_intLifetime1 = var14.length;
            var7Lifetime2 = this.field_i[param1] / var4_intLifetime1;
            for (var9Lifetime2 = 0; var9Lifetime2 < var14.length; var9Lifetime2++) {
              stackIn_40_0 = (this.field_i[param1] % var4_intLifetime1 != 0) ? 1 : 0;
              var8Lifetime1 = stackIn_40_0;
              this.a(-1, var14[var9Lifetime2], var8Lifetime1 + var7Lifetime2);
              this.field_i[param1] = this.field_i[param1] - (var7Lifetime2 + var8Lifetime1);
              var4_intLifetime1--;
            }
          }
          this.field_e = new wf[]{};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("hi.A(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        kl var8;
        int[] var9;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        oe.field_g = new int[this.field_m.field_r][];
        this.field_r = -1;
        if (!param0) {
          var8 = (kl) null;
          this.a((byte) 68, (kl) null, false);
        }
        jf.field_e = new boolean[this.field_m.field_g.field_e.length];
        for (var2 = 0; var2 < oe.field_g.length; var2++) {
          oe.field_g[var2] = this.b(this.field_m.field_v[var2], -97);
        }
        var9 = oe.field_g[this.field_w.field_x];
        var3 = 0;
        for (var4 = 0; var4 < this.field_m.field_g.field_e.length; var4++) {
          L6: {
            if (this.field_m.field_g.field_e[var4].field_y != this.field_w) {
              var5 = 1;
              var6 = 0;
              while (var6 < this.field_m.field_r) {
                if (~this.field_w.field_x != ~var6 &&
                  this.field_w.field_h[var6] &&
                  oe.field_g[var6][var4] <= var9[var4]) {
                  var5 = 0;
                } else {
                  var6++;
                  continue;
                }
                break;
              }
              jf.field_e[var4] = var5 != 0;
              if ((var5 != 0)) {
                var3++;
              }
              break L6;
            }
            jf.field_e[var4] = false;
          }
        }
        for (var4Lifetime1 = 0; this.field_m.field_r > var4Lifetime1; var4Lifetime1++) {
          this.field_q[var4Lifetime1] = this.a(var3, this.field_m.field_v[var4Lifetime1], 3);
        }
        for (var4Lifetime2 = 0; var4Lifetime2 < this.field_m.field_r; var4Lifetime2++) {
          var5Lifetime1 = this.field_m.field_m[var4Lifetime2];
          if (this.field_q[var5Lifetime1] < 0) {
            this.field_r = var5Lifetime1;
          }
        }
    }

    final static bi[] a(int param0, byte param1) {
        bi[] var3 = new bi[9];
        bi[] var2 = var3;
        if (param1 != -16) {
          return (bi[]) null;
        }
        var3[4] = gr.a((byte) -52, param0, 64);
        return var2;
    }

    private final void i(int param0) {
        int var3 = 0;
        int var6 = 0;
        ln var4;
        int var8;
        ln[] var9;
        ln[] var5;
        ln var7;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = this.field_m.field_g.field_e;
        for (var3 = 0; var9.length > var3; var3++) {
          var4 = var9[var3];
          no.field_f[var4.field_p] = false;
          if (var4.field_y == this.field_w) {
            var5 = var4.field_D;
            for (var6 = 0; var5.length > var6; var6++) {
              var7 = var5[var6];
              if (null != var7.field_y &&
                var7.field_y != this.field_w &&
                !this.field_w.field_h[var7.field_y.field_x]) {
                no.field_f[var4.field_p] = true;
                break;
              }
            }
          }
        }
        if (param0 != 15401) {
          this.field_c = (mn) null;
        }
    }

    public final void a(boolean param0, int param1) {
        this.field_p = param0 ? true : false;
        if (param1 != -6861) {
          this.c((byte) 46);
        }
    }

    private final void g(byte param0) {
        int var2;
        co var3;
        int var4;
        int var5;
        ln var6;
        int var7;
        int var2Lifetime1;
        int var4Lifetime1;
        co var3Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = (co) (this.field_l.d(0));
        while (var3 != null) {
          var2 = var3.field_n.field_p;
          if (0 > kq.field_c[var2]) {
            throw new RuntimeException(this.field_m.field_g.field_e[var2].field_I + " has " + kq.field_c[var2] + " fleets assigned to garrison it!");
          }
          if (kq.field_c[var2] < q.field_Ab[var2]) {
            q.field_Ab[var2] = q.field_Ab[var2] - kq.field_c[var2];
            kq.field_c[var2] = 0;
          } else {
            kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var2];
            q.field_Ab[var2] = 0;
          }
          var3 = (co) (this.field_l.a((byte) -71));
        }
        if (param0 >= -40) {
          this.field_i = (int[]) null;
        }
        var3Lifetime1 = (co) (this.field_l.d(0));
        while (true) {
          if (var3Lifetime1 == null) {
            for (var4 = 0; kq.field_c.length > var4; var4++) {
              kq.field_c[var4] = 0;
            }
            return;
          }
          var2Lifetime1 = var3Lifetime1.field_n.field_p;
          var4Lifetime1 = 0;
          var5 = 0;
          L5: while (true) {
            if (var5 < 2) {
              var6 = var3Lifetime1.field_n.field_R.j(18229);
              while (var6 != null) {
                if (var6 != var3Lifetime1.field_n &&
                  q.field_Ab[var6.field_p] != 0) {
                  if (var4Lifetime1 == 0 &&
                    no.field_f[var6.field_p]) {
                    var6 = var3Lifetime1.field_n.field_R.h(-23410);
                    continue;
                  }
                  if (q.field_Ab[var6.field_p] >= kq.field_c[var2Lifetime1]) {
                    this.a(kq.field_c[var2Lifetime1], (byte) 102, var3Lifetime1.field_n, var6);
                    q.field_Ab[var6.field_p] = q.field_Ab[var6.field_p] - kq.field_c[var2Lifetime1];
                    kq.field_c[var2Lifetime1] = 0;
                    break L5;
                  }
                  this.a(q.field_Ab[var6.field_p], (byte) 103, var3Lifetime1.field_n, var6);
                  kq.field_c[var2Lifetime1] = kq.field_c[var2Lifetime1] - q.field_Ab[var6.field_p];
                  q.field_Ab[var6.field_p] = 0;
                }
                var6 = var3Lifetime1.field_n.field_R.h(-23410);
              }
              var4Lifetime1 = 1;
              var5++;
              continue;
            }
            break;
          }
          var3Lifetime1 = (co) (this.field_l.a((byte) -71));
        }
    }

    private final void e(byte param0) {
        int var11 = 0;
        int var17 = 0;
        sd stackIn_68_0 = null;
        sd stackIn_68_1 = null;
        sd var2;
        sd var3;
        sd var4_ref_sd;
        int var4;
        Object var5_ref;
        int var5;
        Object var6;
        Object var7;
        int var8;
        int var9_int;
        ln[] var9;
        ln var10_ref_ln;
        int var10;
        ln var12;
        int var13;
        ln[] var14_ref_ln__;
        int var14;
        int var15;
        int var16;
        ln var18;
        int var19;
        ln[] var20;
        Object var21;
        sd var21_ref;
        Object var22;
        sd var22_ref;
        ln var23;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        sd var2Lifetime1;
        sd var3Lifetime1;
        Object var6Lifetime1;
        Object var7Lifetime1;
        Object var7Lifetime2;
        ln var10_ref_lnLifetime1;
        int var15Lifetime1Lifetime1;
        var22 = null;
        var21 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_w.field_u[3] < 5) {
          return;
        }
        if (50 > this.field_t &&
          this.field_j < 50 &&
          this.field_w.field_i.e(0) > 1) {
          var22_ref = (sd) (this.field_w.field_i.d(0));
          var3 = var22_ref;
          var21_ref = (sd) (this.field_w.field_i.a((byte) -71));
          if (var21_ref.g(-98) > var22_ref.g(107)) {
            var2 = var22_ref;
            var3 = var21_ref;
          } else {
            var2 = var21_ref;
          }
          var4_ref_sd = (sd) (this.field_w.field_i.a((byte) -71));
          while (var4_ref_sd != null) {
            if (var4_ref_sd.g(-115) > var3.g(-111)) {
              var2 = var3;
              var3 = var4_ref_sd;
            }
            var4_ref_sd = (sd) (this.field_w.field_i.a((byte) -71));
          }
          var5_ref = null;
          var6 = null;
          var7 = null;
          var9_int = 0;
          var10_ref_ln = var3.j(18229);
          while (var10_ref_ln != null) {
            if (no.field_f[var10_ref_ln.field_p]) {
              var8 = var10_ref_ln.field_J;
              if (var10_ref_ln.field_u ||
                var10_ref_ln == qo.field_e) {
                var8 = var8 * 2;
              }
              if (var9_int < var8) {
                var7 = var10_ref_ln;
                var9_int = var8;
              }
              var10_ref_ln = var3.h(-23410);
              continue;
            }
            var5_ref = var10_ref_ln;
            break;
          }
          if (var5_ref == null) {
            var5_ref = var7;
          }
          var9_intLifetime1 = -1;
          var10_ref_lnLifetime1 = var2.j(18229);
          while (var10_ref_lnLifetime1 != null) {
            if (no.field_f[var10_ref_lnLifetime1.field_p]) {
              var8Lifetime2 = var10_ref_lnLifetime1.field_J;
              if (var10_ref_lnLifetime1.field_u ||
                qo.field_e == var10_ref_lnLifetime1) {
                var8Lifetime2 = var8Lifetime2 * 2;
              }
              if (var8Lifetime2 > var9_intLifetime1) {
                var7 = var10_ref_lnLifetime1;
                var9_intLifetime1 = var8Lifetime2;
              }
              var10_ref_lnLifetime1 = var2.h(-23410);
              continue;
            }
            var6 = var10_ref_lnLifetime1;
            break;
          }
          if (var6 == null) {
            var6 = var7;
          }
          if (var5_ref != null &&
            var6 != null) {
            vj.field_E.a((byte) -113, new qm(3, this.field_w, (ln) (var5_ref), (ln) (var6)));
            return;
          }
          throw new RuntimeException("TaskAI has more than one territory but can't find a star in each to link with a Tannhauser");
        }
        var2Lifetime1 = (sd) (this.field_w.field_i.d(0));
        var3Lifetime1 = (sd) (this.field_w.field_i.a((byte) -71));
        while (var3Lifetime1 != null) {
          if (var3Lifetime1.g(-48) > var2Lifetime1.g(84)) {
            var2Lifetime1 = var3Lifetime1;
          }
          var3Lifetime1 = (sd) (this.field_w.field_i.a((byte) -71));
        }
        var5 = 0;
        var6Lifetime1 = null;
        var7Lifetime1 = var2Lifetime1.j(18229);
        while (var7Lifetime1 != null) {
          var4 = ((ln) (var7Lifetime1)).field_x;
          if (((ln) (var7Lifetime1)).field_u ||
            qo.field_e == var7Lifetime1) {
            var4 = var4 * 2;
          }
          if (var4 > var5) {
            var6Lifetime1 = var7Lifetime1;
            var5 = var4;
          }
          var7Lifetime1 = var2Lifetime1.h(-23410);
        }
        if (var6Lifetime1 == null) {
          throw new RuntimeException("TaskAI can't find any stars in territory from which to launch a Tannhauser");
        }
        var7Lifetime2 = null;
        var8Lifetime1 = 0;
        var9 = this.field_m.field_g.field_e;
        var10 = -10 / ((param0 - 13) / 50);
        for (var11 = 0; var11 < var9.length; var11++) {
          var12 = var9[var11];
          stackIn_68_0 = var12.field_R;
          stackIn_68_1 = ((ln) (var6Lifetime1)).field_R;
          if (stackIn_68_0 != stackIn_68_1 && (var12.field_y == this.field_w ||
            null == var12.field_y ||
            !this.field_w.field_h[var12.field_y.field_x]) && (var12.field_y != this.field_w ||
            this.field_j < 90)) {
            var13 = 0;
            var14_ref_ln__ = var12.field_D;
            for (var15 = 0; var15 < var14_ref_ln__.length; var15++) {
              var23 = var14_ref_ln__[var15];
              var7Lifetime2 = var23;
              var7Lifetime2 = var23;
              if (((ln) (var6Lifetime1)).field_R != var23.field_R) {
                continue;
              }
              var13 = 1;
              break;
            }
            if (var13 == 0) {
              var14 = 0;
              var15Lifetime1 = 0;
              for (var16 = 0; var16 < 4; var16++) {
                var14 = var14 + (-var2Lifetime1.field_u[var16] + var2Lifetime1.field_u[var2Lifetime1.field_w[0]] + 1) * var12.field_G[var16];
              }
              if (this.field_b &&
                36 == var12.field_p) {
                var14 = var14 + this.field_j / 2;
              }
              var15Lifetime1Lifetime1 = var12.field_x;
              if (this.field_h &&
                var12.field_L == 2) {
                if (!this.field_m.field_o.field_i) {
                  var16Lifetime1 = ((ln) (var6Lifetime1)).field_R.field_r;
                } else {
                  var16Lifetime1 = this.field_w.field_m.field_r;
                }
                if (-5 * var12.field_G[0] > var16Lifetime1) {
                  var14 -= 100;
                }
                if (var12.field_y != null &&
                  var12.field_y.field_x == this.field_g) {
                  var14 += 100;
                }
              }
              if (var12.field_u) {
                var15Lifetime1Lifetime1 = var15Lifetime1Lifetime1 * 2;
              }
              var20 = var12.field_D;
              for (var17 = 0; var20.length > var17; var17++) {
                var18 = var20[var17];
                var7Lifetime2 = var18;
                var7Lifetime2 = var18;
                if (var18.field_y != this.field_w &&
                  var18.field_y != null) {
                  var15Lifetime1Lifetime1 = var15Lifetime1Lifetime1 + var18.field_x;
                  if (!this.field_m.field_o.field_l) {
                    var15Lifetime1Lifetime1++;
                  }
                }
              }
              if (1 > var15Lifetime1Lifetime1) {
                var15Lifetime1Lifetime1 = 1;
              }
              var16Lifetime2 = (var14 << 16) / var15Lifetime1Lifetime1;
              if (var8Lifetime1 < var16Lifetime2) {
                var7Lifetime2 = var12;
                var8Lifetime1 = var16Lifetime2;
              }
            }
          }
        }
        if (var7Lifetime2 != null) {
          vj.field_E.a((byte) -113, new qm(3, this.field_w, (ln) (var6Lifetime1), (ln) (var7Lifetime2)));
        }
        return;
    }

    private final void a(byte param0, ln param1) {
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        qm var4 = null;
        try {
          if (5 > this.field_w.field_u[2]) {
            throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Stellar Bomb it doesn't have at star " + param1.field_I);
          }
          if (!mr.field_f) {
            if (this.field_w == param1.field_y) {
              throw new RuntimeException(this.field_w.field_t + " is trying to Stellar Bomb itself at star " + param1.field_I);
            }
            if (param0 != -82) {
              return;
            }
            vj.field_E.a((byte) -113, new qm(2, this.field_w, param1));
            mr.field_f = true;
            km.field_u = param1;
            return;
          }
          var3 = null;
          var4 = (qm) (vj.field_E.d(param0 ^ -82));
          while (var4 != null) {
            if (2 != var4.field_o) {
              var4 = (qm) (vj.field_E.a((byte) -71));
              continue;
            }
            var3 = var4;
            break;
          }
          if (var3 == null) {
            throw new RuntimeException(this.field_w.field_t + "'s deployedStellarBomb variable incorrectly set to true.");
          }
          if (((qm) (var3)).field_q == km.field_u) {
            throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Stellar Bomb it has already used." + " Already deployed at star " + ((qm) (var3)).field_q.field_I + ", now trying to deploy at " + param1.field_I);
          }
          throw new RuntimeException(this.field_w.field_t + ": TaskAI.deployStellarBomb: targetStellarBomb is not the star the ProjectUse points at." + " targetStellarBomb: " + km.field_u.field_I + ", bomb.s1: " + ((qm) (var3)).field_q);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("hi.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(byte param0, kl param1, boolean param2) {
        int var8_int = 0;
        int dupTemp$0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_158_0 = null;
        StringBuilder stackIn_158_1 = null;
        String stackIn_159_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        sd var9_ref_sd = null;
        int var10 = 0;
        int var11 = 0;
        ln[] var11_ref_ln__ = null;
        int var12_int = 0;
        ln[] var12 = null;
        ln var13_ref_ln = null;
        int var13 = 0;
        ln var14 = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        ln var16_ref_ln = null;
        int var16 = 0;
        ln[] var17 = null;
        int var18 = 0;
        ln var19 = null;
        int var20 = 0;
        Object var21 = null;
        sd var21_ref = null;
        int var22 = 0;
        ln[] var23 = null;
        int[] var25 = null;
        ln[] var26 = null;
        ln[] var27 = null;
        ln var28 = null;
        ln[] var29 = null;
        int[] var30 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var35 = null;
        ln var19Lifetime1;
        ln var19Lifetime2;
        ln var19Lifetime1Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12_intLifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var13Lifetime2;
        int var11Lifetime2Lifetime1;
        int var15Lifetime1Lifetime1;
        var21 = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var23 = param1.field_n.field_D;
          var4 = var23;
          var35 = new int[var23.length];
          var6 = 0;
          var7 = 0;
          for (var8_int = 0; var23.length > var8_int; var8_int++) {
            if (var23[var8_int].field_y == this.field_w) {
              var7Lifetime1 = 0;
              var6Lifetime1 = 0;
              var9_ref_sd = (sd) (this.field_w.field_i.d(0));
              while (var9_ref_sd != null) {
                if (var23[var8_int].field_R != var9_ref_sd) {
                  var6Lifetime1++;
                  var9_ref_sd = (sd) (this.field_w.field_i.a((byte) -71));
                  continue;
                }
                var7Lifetime1 = 1;
                break;
              }
              if (var7Lifetime1 == 0) {
                throw new RuntimeException("Can't find the Territory of a star owned by the AI: " + var23[var8_int].field_I);
              }
              var35[var8_int] = var6Lifetime1;
            } else {
              var35[var8_int] = -1;
            }
          }
          var32 = new int[this.field_w.field_i.e(0)];
          var25 = var32;
          var8 = var25;
          for (var9 = 0; var9 < var23.length; var9++) {
            if (var35[var9] != -1) {
              dupTemp$0 = var35[var9];
              var8[dupTemp$0] = var8[dupTemp$0] + q.field_Ab[var23[var9].field_p];
            }
          }
          var9Lifetime1 = 0;
          var11 = 100 % ((-53 - param0) / 41);
          for (var10 = 0; var10 < var32.length; var10++) {
            if (this.field_n[var10] < var32[var10]) {
              var8[var10] = this.field_n[var10];
            }
            var9Lifetime1 = var9Lifetime1 + var32[var10];
          }
          if (!this.field_m.field_o.field_i) {
            for (var10Lifetime1 = 0; var32.length > var10Lifetime1; var10Lifetime1++) {
              if (var32[var10Lifetime1] > 0) {
                var9Lifetime1 = var9Lifetime1 + this.field_i[var10Lifetime1];
              }
            }
          } else {
            var9Lifetime1 = var9Lifetime1 + this.field_i[0];
          }
          var10Lifetime2 = param1.field_i * (-this.field_t + 50) / 250 + param1.field_i;
          if (param2) {
            if (param1.field_n == km.field_u) {
              param1.field_i = param1.field_n.field_x / 2;
              if (null != param1.field_n.field_y) {
                var11_ref_ln__ = var23;
                for (var12_int = 0; var11_ref_ln__.length > var12_int; var12_int++) {
                  var13_ref_ln = var11_ref_ln__[var12_int];
                  if (var13_ref_ln.field_y == param1.field_n.field_y) {
                    param1.field_i = param1.field_i + var13_ref_ln.field_x;
                  }
                }
              }
              if (param1.field_n.field_u) {
                param1.field_i = 2 * param1.field_i;
              }
            }
            var10Lifetime2 = param1.field_i + param1.field_i * (-this.field_t + 50) / 250;
            stackIn_49_0 = (var9Lifetime1 < var10Lifetime2) ? 0 : 1;
            var11Lifetime1 = stackIn_49_0;
            if (var11Lifetime1 == 0 &&
              !mr.field_f &&
              this.field_w.field_u[2] >= 5 &&
              param1.field_n.field_x >= 5) {
              var12_intLifetime1 = param1.field_i;
              if (param1.field_n.field_u) {
                var12_intLifetime1 = var12_intLifetime1 / 2;
              }
              var12_intLifetime1 = var12_intLifetime1 - param1.field_n.field_x / 2;
              if (param1.field_n.field_u) {
                var12_intLifetime1 = var12_intLifetime1 * 2;
              }
              var13 = var12_intLifetime1 + var12_intLifetime1 * (50 - this.field_t) / 250;
              if (var13 <= var9Lifetime1) {
                this.a((byte) -82, param1.field_n);
                var11Lifetime1 = 1;
                param1.field_i = param1.field_n.field_x / 2;
                if (null != param1.field_n.field_y) {
                  var26 = var23;
                  for (var15 = 0; var26.length > var15; var15++) {
                    var16_ref_ln = var26[var15];
                    if (param1.field_n.field_y == var16_ref_ln.field_y) {
                      param1.field_i = param1.field_i + var16_ref_ln.field_x;
                    }
                  }
                }
                if (param1.field_n.field_u) {
                  param1.field_i = 2 * param1.field_i;
                }
                var10Lifetime2 = param1.field_i + param1.field_i * (50 - this.field_t) / 250;
              }
            }
            if (var11Lifetime1 != 0 &&
              !mr.field_f &&
              this.field_w.field_u[2] >= 5 &&
              param1.field_n.field_x >= 25) {
              this.a((byte) -82, param1.field_n);
              param1.field_i = param1.field_n.field_x / 2;
              if (null != param1.field_n.field_y) {
                var27 = var23;
                for (var13Lifetime2 = 0; var27.length > var13Lifetime2; var13Lifetime2++) {
                  var28 = var27[var13Lifetime2];
                  var19 = var28;
                  var19Lifetime2 = var28;
                  if (param1.field_n.field_y == var28.field_y) {
                    param1.field_i = param1.field_i + var28.field_x;
                  }
                }
              }
              if (param1.field_n.field_u) {
                param1.field_i = param1.field_i * 2;
              }
              var10Lifetime2 = (-this.field_t + 50) * param1.field_i / 250 + param1.field_i;
            }
            if (var11Lifetime1 != 0) {
              param1.field_p = true;
            }
          }
          if (param1.field_p) {
            if (!param2) {
              if (var9Lifetime1 == 0) {
                return;
              }
              var10Lifetime2 = var10Lifetime2 * 3 / 10;
              if (var10Lifetime2 == 0) {
                var10Lifetime2 = 1;
              }
            }
            var11Lifetime2 = 0;
            var29 = (ln[]) ((Object) var4.clone());
            var12 = var29;
            var13Lifetime1 = 1;
            while (var13Lifetime1 != 0) {
              var13Lifetime1 = 0;
              for (var15Lifetime1 = 0; var15Lifetime1 < -1 + var29.length; var15Lifetime1++) {
                if (q.field_Ab[var29[var15Lifetime1].field_p] > q.field_Ab[var12[var15Lifetime1 + 1].field_p]) {
                  var14 = var29[var15Lifetime1];
                  var19Lifetime1 = var14;
                  var19Lifetime1 = var14;
                  var12[var15Lifetime1] = var12[var15Lifetime1 + 1];
                  var13Lifetime1 = 1;
                  var12[1 + var15Lifetime1] = var14;
                }
              }
            }
            var11Lifetime2Lifetime1 = this.a(true, var29, param1.field_n, 102, var10Lifetime2);
            if (var10Lifetime2 > var11Lifetime2Lifetime1) {
              var11Lifetime2Lifetime1 = var11Lifetime2Lifetime1 + this.a(false, var12, param1.field_n, 84, -var11Lifetime2Lifetime1 + var10Lifetime2);
            }
            var10Lifetime2 = var10Lifetime2 - var11Lifetime2Lifetime1;
            if (var10Lifetime2 > 0) {
              if (this.field_m.field_o.field_i) {
                if (var10Lifetime2 > this.field_i[0] &&
                  param2) {
                  throw new RuntimeException(this.field_w.field_t + " has decided to attack a system, but appears not to have sufficient fleets to carry through.");
                }
                var15Lifetime1Lifetime1 = var10Lifetime2;
                if (var10Lifetime2 > this.field_i[0]) {
                  var15Lifetime1Lifetime1 = this.field_i[0];
                }
                for (var16 = 0; var29.length > var16; var16++) {
                  if (var29[var16].field_y != this.field_w) {
                    continue;
                  }
                  this.a(-1, var29[var16], var15Lifetime1Lifetime1);
                  this.a(var15Lifetime1Lifetime1, (byte) 93, param1.field_n, var29[var16]);
                  break;
                }
                var10Lifetime2 = var10Lifetime2 - var15Lifetime1Lifetime1;
                for (var16 = 0; this.field_i.length > var16; var16++) {
                  this.field_i[var16] = this.field_i[var16] - var15Lifetime1Lifetime1;
                }
                var11Lifetime2Lifetime1 = var11Lifetime2Lifetime1 + var15Lifetime1Lifetime1;
              } else {
                var33 = new int[this.field_i.length];
                var30 = var33;
                var15_ref_int__ = var30;
                for (var16 = 0; var33.length > var16; var16++) {
                  var33[var16] = var16;
                }
                nm.a(var15_ref_int__, (int[]) ((Object) this.field_i.clone()), (byte) 47);
                for (var16 = 0; var16 < this.field_i.length; var16++) {
                  if (this.field_i[var33[var16]] != 0) {
                    var17 = var23;
                    var18 = 0;
                    L38: while (true) {
                      if (var18 < var17.length) {
                        var19Lifetime1Lifetime1 = var17[var18];
                        if (this.field_w == var19Lifetime1Lifetime1.field_y) {
                          var20 = 0;
                          var21_ref = (sd) (this.field_w.field_i.d(0));
                          while (var21_ref != null) {
                            if (var21_ref != var19Lifetime1Lifetime1.field_R) {
                              var20++;
                              var21_ref = (sd) (this.field_w.field_i.a((byte) -71));
                              continue;
                            }
                            break;
                          }
                          if (var21_ref == null) {
                            throw new RuntimeException("Cannot find Territory that " + this.field_w.field_t + "'s star belongs to: " + var19Lifetime1Lifetime1.field_I);
                          }
                          if (var20 == var33[var16]) {
                            if (this.field_i[var20] <= var10Lifetime2) {
                              this.a(-1, var19Lifetime1Lifetime1, this.field_i[var20]);
                              this.a(this.field_i[var20], (byte) 100, param1.field_n, var19Lifetime1Lifetime1);
                              var10Lifetime2 = var10Lifetime2 - this.field_i[var20];
                              this.field_i[var20] = 0;
                              break L38;
                            }
                            this.a(-1, var19Lifetime1Lifetime1, var10Lifetime2);
                            this.a(var10Lifetime2, (byte) 116, param1.field_n, var19Lifetime1Lifetime1);
                            this.field_i[var20] = this.field_i[var20] - var10Lifetime2;
                            var10Lifetime2 = 0;
                            break L38;
                          }
                        }
                        var18++;
                        continue;
                      }
                      break;
                    }
                    if (0 == var10Lifetime2) {
                      break;
                    }
                  }
                }
              }
            }
            if (var10Lifetime2 > 0 &&
              param2) {
              throw new RuntimeException("After full attack movement, " + this.field_w.field_t + " still hasn't sent enough fleets to " + param1.field_n.field_I);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_158_0 = var4_ref;
          stackIn_158_1 = new StringBuilder().append("hi.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_159_2 = "null";
          } else {
            stackIn_159_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_158_0), ((StringBuilder) (Object) stackIn_158_1).append(stackIn_159_2).append(',').append(param2).append(')').toString());
        }
    }

    hi(fs param0, dc param1, mn param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_l = new pf();
        this.field_u = new pf();
        this.field_k = new pf();
        this.field_h = false;
        this.field_b = false;
        try {
          this.field_c = param2;
          this.field_m = param1;
          this.field_w = param0;
          this.field_x = this.field_m.field_g.field_e.length;
          sf.a((byte) 124, this.field_x);
          this.field_p = true;
          this.field_j = vc.a((byte) -39, 75) + 25;
          this.field_t = vc.a((byte) -39, 75) + 25;
          this.field_v = new int[this.field_m.field_r];
          this.field_q = new int[this.field_m.field_r];
          this.field_f = new int[this.field_m.field_r];
          if (this.field_m.field_x instanceof ui) {
            this.field_b = true;
          }
          if (this.field_m.field_x instanceof hp) {
            this.field_h = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("hi.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_d = "Click to show the Victory window.";
        field_a = new vr(true, true, true, true, false, true, true, 0);
    }
}
