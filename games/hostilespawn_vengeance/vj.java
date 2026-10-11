/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends ql {
    static bd field_p;
    static in field_v;
    private oc field_f;
    private oc[] field_x;
    static bd[] field_h;
    static qm[] field_w;
    static bd[] field_e;
    static String[] field_j;
    static int field_g;
    static String field_u;
    private oc[] field_k;
    static int field_s;
    private we[] field_d;
    private we[] field_q;
    private v field_r;
    private int field_n;
    private boolean[] field_t;
    private int field_m;
    private boolean field_l;
    private v field_o;
    private qm field_i;

    final boolean b(int param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = -51 % ((param0 - 38) / 53);
        var3 = ha.field_t;
        if (var3 == 15) {
          for (var3 = 0; var3 < this.field_x.length; var3++) {
            if (null != this.field_x[var3]) {
              this.field_d[var3].a((byte) -46);
            }
          }
          return false;
        }
        if (var3 != 16) {
          return true;
        }
        for (var3Lifetime1 = 0; this.field_k.length > var3Lifetime1; var3Lifetime1++) {
          if (!this.field_t[var3Lifetime1]) {
            this.field_q[var3Lifetime1].a((byte) -46);
          }
        }
        return false;
    }

    final void a(int param0, p param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        oc var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = 108 / ((36 - param0) / 63);
          if (param1.field_h == 3) {
            var4 = -1;
            var5_int = 0;
            while (true) {
              if (var5_int < this.field_x.length) {
                if (this.field_x[var5_int] != null &&
                  this.field_x[var5_int].a(param1.field_j, -119)) {
                  var4 = var5_int;
                } else {
                  var5_int++;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              wa.field_p = wa.field_p + 1;
              if (this.field_m + wa.field_p >= 3 &&
                15 == ha.field_t) {
                kd.a(16, 1);
                nh.field_E.a(-1, 8360, -1);
                var5 = this.field_x[var4];
                this.field_o.field_a = 1;
                var6 = var4;
                if (var6 != 0 &&
                  var6 != 2) {
                  if (var6 == 1) {
                    this.field_o.field_d = 24 * var5.field_g + 48;
                    this.field_o.field_l = -100 + 24 * var5.field_e;
                  } else {
                    if ((var6 == 3)) {
                      this.field_o.field_d = -this.field_o.field_h + (var5.field_g - 2) * 24;
                      this.field_o.field_l = 24 * var5.field_e - 100;
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.field_o.field_l = 24 * var5.field_e - 100;
                  this.field_o.field_d = -this.field_o.field_h + 24 * (var5.field_g - 2);
                }
              }
              if (0 > var4) {
                break;
              }
              this.field_x[var4] = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("vj.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void c(int param0) {
        if (!this.field_l) {
          ti.a(228, (byte) 38, 27);
        }
        if (param0 != 0) {
          field_h = (bd[]) null;
        }
    }

    final String a(boolean param0) {
        int var2;
        if (param0) {
          vj.a(85L, (byte) 61);
        }
        var2 = ha.field_t;
        if (var2 == 15) {
          return pk.field_n;
        }
        if (var2 == 16) {
          return cg.field_c;
        }
        return mc.field_L;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 24) {
            field_s = -91;
          }
          stackIn_3_0 = i.field_b.a(param0, "", param1 ^ 24);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var3;
        int var4;
        oc var5;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var5 = mm.field_m[0].field_j;
        if (this.field_o.field_a == 1) {
          if (this.field_o.a((byte) -65)) {
            if (this.field_o.field_l + this.field_o.field_m > var5.field_e * 24 - 96) {
              if (24 * (2 + var5.field_e) < this.field_o.field_l) {
                this.field_o.field_a = 2;
              } else {
                if (this.field_o.field_d <= 24 * var5.field_g &&
                  24 * var5.field_g <= this.field_o.field_h + this.field_o.field_d) {
                  this.field_o.field_a = 2;
                }
              }
            } else {
              this.field_o.field_a = 2;
            }
          } else {
            this.field_o.field_a = 2;
          }
        }
        this.field_r.e(-127);
        if (this.field_m + wa.field_p > 0) {
          si.a(100, 40, 90, 20, 0, 128);
          si.a(100, 40, 90, 20, 16776960);
          id.field_A.c(ph.field_z + wa.field_p, 105, 55, 16776960, -1);
        }
        var3 = 81 / ((-48 - param0) / 38);
        if (this.field_m > 0 ||
          ha.field_t == 16) {
          si.a(410, 40, 140, 20, 0, 128);
          si.a(410, 40, 140, 20, 16776960);
          id.field_A.c(jg.field_a + this.field_m, 415, 55, 16776960, -1);
        }
    }

    public static void g(int param0) {
        field_j = null;
        field_u = null;
        field_w = null;
        field_v = null;
        field_h = null;
        field_e = null;
        field_p = null;
        if (param0 != 140) {
          vj.g(39);
        }
    }

    final static void a(long param0, byte param1) {
        if (param1 != -49) {
          return;
        }
        if (param0 <= 0L) {
          return;
        }
        if (0L != param0 % 10L) {
          pk.a(207, param0);
        } else {
          pk.a(207, param0 - 1L);
          pk.a(207, 1L);
        }
    }

    final void d(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        oc var3;
        oc var4_ref_oc;
        int var4;
        int var5_int;
        oc var5;
        int var6_int;
        oj var6;
        int var7;
        int var8;
        int var9;
        oj var10;
        int var4Lifetime1;
        int var5_intLifetime1;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var10 = mm.field_m[0];
        var3 = var10.field_j;
        if (this.field_i != null) {
          this.field_i.field_j.a((byte) 46, var3);
          this.field_i.field_l.a(var10.field_l.field_a - 0.5, var10.field_l.field_f - 0.5, param0 ^ -2);
          this.field_i.field_c = var10.field_c;
          if (!(32.0 > var10.field_c) &&
            !(var10.field_c > 224.0)) {
            if (var10.field_c < 96.0) {
              this.field_i.field_c = 64.0;
            } else if (!(var10.field_c < 160.0)) {
              this.field_i.field_c = 192.0;
            } else {
              this.field_i.field_c = 128.0;
            }
          } else {
            this.field_i.field_c = 0.0;
          }
          this.field_i.field_l.a(25, (byte) 94, var10.field_c);
          this.field_i.b((byte) 117);
        }
        if (wa.field_p > 1) {
          this.field_l = true;
        }
        if (this.field_n >= 0 &&
          dn.field_i != of.field_d) {
          this.field_i = null;
          this.field_m = this.field_m + 1;
          wa.field_p = wa.field_p - 1;
          this.field_t[this.field_n] = true;
          if (this.field_m == 3) {
            kd.a(0, 1);
            nh.field_E.a((byte) 46, this.field_f);
            var4_ref_oc = this.field_k[this.field_n];
            this.field_r.field_a = 1;
            var5_int = this.field_n;
            if (0 != var5_int) {
              if (var5_int == 1) {
                this.field_r.field_l = -100 + var4_ref_oc.field_e * 24;
                this.field_r.field_d = 24 * (3 + var4_ref_oc.field_g);
              } else {
                if (var5_int == 2) {
                  this.field_r.field_l = var4_ref_oc.field_e * 24 - 100;
                  this.field_r.field_d = -this.field_r.field_h + (var4_ref_oc.field_g * 24 - 72);
                }
              }
            } else {
              this.field_r.field_d = 24 * var4_ref_oc.field_g - 96 - this.field_r.field_h;
              this.field_r.field_l = 24 * var4_ref_oc.field_e;
            }
          }
          if (le.field_D == 0) {
            le.field_D = 15000;
            n.field_o = true;
          }
          this.field_n = -1;
        }
        if (~this.field_n > param0 &&
          wa.field_p > 0 && (ha.field_t == 15 ||
          ha.field_t == 16)) {
          var8 = 0;
          var5_intLifetime1 = var8;
          while (this.field_k.length > var8) {
            if (!this.field_t[var8]) {
              var4 = ih.a(var3, (byte) -102, this.field_k[var8]);
              if (var4 < 2) {
                var6_int = (int)el.a((double)var3.field_e, (double)this.field_k[var8].field_e, param0 + 17, (double)var3.field_g, (double)this.field_k[var8].field_g);
                this.field_n = var8;
                ca.a((double)(this.field_k[var8].field_e + 1), 0, (double)(this.field_k[var8].field_g + 1), true, var6_int);
                this.field_i = new qm(ln.field_a, var3, 230, rl.field_c, 0, false);
                this.field_i.field_c = var10.field_c;
                fieldTemp$0 = dk.field_o;
                dk.field_o = dk.field_o + 1;
                field_w[fieldTemp$0] = this.field_i;
              }
            }
            var8++;
          }
        }
        if ((31 & ng.field_u) == 0) {
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < this.field_k.length) {
            var5 = this.field_k[var9];
            if (cm.field_c[var5.b(-4)] > 0 && (!(var3.field_e - 20 <= var5.field_e) ||
              !(20 + var3.field_e >= var5.field_e) ||
              !(var5.field_g >= -17 + var3.field_g) ||
              !(var5.field_g <= 17 + var3.field_g))) {
              var6 = new oj(var5, 18, rl.field_c);
              var6.field_M = 0;
              var6.field_n = true;
              fieldTemp$1 = el.field_j;
              el.field_j = el.field_j + 1;
              mm.field_m[fieldTemp$1] = var6;
            }
            var9++;
          }
        }
        super.d(-1);
    }

    final void e(int param0) {
        int[] var2;
        int var3;
        int var4;
        int var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int var4Lifetime1;
        int[] var6Lifetime1;
        int[] var6Lifetime2;
        var5 = HostileSpawn.field_I ? 1 : 0;
        var8 = ln.field_a.field_v;
        var7 = var8;
        var6 = var7;
        var2 = var6;
        this.field_f = new oc(var8[0], var8[1]);
        var3 = 0;
        for (var4 = 0; var4 < ll.field_a; var4++) {
          if (wh.field_b[var4].field_i == 2 &&
            wh.field_b[var4].field_h == 3) {
            this.field_x[var3] = new oc(wh.field_b[var4].field_j);
            this.field_d[var3] = new we(this.field_x[var3]);
            var3++;
          }
        }
        var6Lifetime1 = var2;
        var4Lifetime1 = 0;
        while (true) {
          var6Lifetime2 = var2;
          if (var4Lifetime1 < 3) {
            this.field_k[var4Lifetime1] = new oc(var6Lifetime2[10 + 2 * var4Lifetime1], var6Lifetime2[2 * (5 + var4Lifetime1) + 1]);
            this.field_q[var4Lifetime1] = new we(this.field_k[var4Lifetime1]);
            var4Lifetime1++;
            continue;
          }
          break;
        }
        wa.field_p = 0;
        this.field_n = -1;
        this.field_m = 0;
        this.field_o = new v(kd.field_E, 0, 0, 200);
        this.field_r = new v(ea.field_b, param0, 0, 200);
        this.field_l = false;
        kd.a(15, 1);
        nh.field_E.a(-1, 8360, -1);
        return;
    }

    public vj() {
        this.field_x = new oc[4];
        this.field_k = new oc[3];
        this.field_d = new we[this.field_x.length];
        this.field_q = new we[this.field_k.length];
        this.field_t = new boolean[3];
    }

    static {
        field_g = 2;
        field_u = "You have 1 unread message!";
        field_j = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
