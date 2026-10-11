/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hq {
    static String field_m;
    static String field_o;
    bk field_h;
    private bk field_l;
    ko field_d;
    static int field_i;
    int field_n;
    static String field_f;
    private int field_k;
    static String field_e;
    private String field_g;
    hq field_j;
    private boolean field_b;
    uf field_a;
    static int field_c;

    private final void a(int param0, int param1) {
        int var3 = al.field_k.field_qb;
        int var4 = al.field_k.field_eb;
        int var5 = qh.field_l - ep.field_s.field_z >> 1;
        al.field_k.field_qb = al.field_k.field_qb - var5;
        int var6 = -ep.field_s.field_A + qh.field_f;
        al.field_k.field_eb = al.field_k.field_eb - var6;
        ep.field_s.e();
        qh.d();
        this.c((byte) -109);
        al.field_k.a((byte) -79, false);
        this.field_h.a(false);
        al.field_k.field_qb = var3;
        al.field_k.field_eb = var4;
        sh.field_P.b(15100);
        qh.c(5 + al.field_k.field_qb, 5 + al.field_k.field_eb, -10 + al.field_k.field_gb, al.field_k.field_Db - param0, 0, 128 * param1 >> 8);
        ep.field_s.d(var5, var6, param1, param1);
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, byte param4) {
        int var10 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param4 != 80) {
            field_f = (String) null;
          }
          if (param3 > param0) {
            var5_int = (param0 + param3) / 2;
            var6 = param0;
            var7 = param1[var5_int];
            param1[var5_int] = param1[param3];
            param1[param3] = var7;
            var8 = param2[var5_int];
            param2[var5_int] = param2[param3];
            param2[param3] = var8;
            stackIn_6_0 = (var7 == 2147483647) ? 0 : 1;
            var9 = stackIn_6_0;
            for (var10 = param0; var10 < param3; var10++) {
              if (param1[var10] > -(var9 & var10) + var7) {
                var11 = param1[var10];
                param1[var10] = param1[var6];
                param1[var6] = var11;
                var12 = param2[var10];
                param2[var10] = param2[var6];
                param2[var6++] = var12;
              }
            }
            param1[param3] = param1[var6];
            param1[var6] = var7;
            param2[param3] = param2[var6];
            param2[var6] = var8;
            hq.a(param0, param1, param2, -1 + var6, (byte) 80);
            hq.a(1 + var6, param1, param2, param3, (byte) 80);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("hq.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean b(int param0) {
        int var2 = -86 % ((40 - param0) / 46);
        int var3 = 0;
        if (qa.field_v.field_R != 0) {
          this.d((byte) -105);
          var3 = 1;
        } else {
          if (!this.field_b) {
            return false;
          }
        }
        if (0 != jq.field_d.field_R) {
          this.e((byte) 89);
          this.c(255);
          var3 = 1;
        }
        if (0 != pl.field_b.field_R) {
          var3 = 1;
          this.a((byte) -87);
        }
        if (al.field_k.field_R != 0) {
          var3 = 1;
        }
        return var3 != 0;
    }

    final void a(boolean param0) {
        this.field_k = this.field_d.a(116);
        if (param0) {
          this.field_b = false;
        }
    }

    final void f(int param0) {
        int var2;
        int var3;
        if (param0 != 25) {
          field_o = (String) null;
        }
        if (this.field_b) {
          al.field_k.a(true, false);
        }
        if (!qa.field_v.b(param0 - 142)) {
          qa.field_v.a(true, false);
        }
        if (ng.field_s >= 0) {
          var2 = this.field_l.c((byte) -111);
          var3 = this.field_h.c((byte) -122);
          al.field_k.field_Db = (var2 * (25 - ng.field_s) + ng.field_s * var3) / 25;
          al.field_k.field_eb = -al.field_k.field_Db + qh.field_f - 5;
          this.e(1);
          ng.field_s = ng.field_s + 1;
          if (ng.field_s > 25) {
            ng.field_s = -1;
          }
        }
        if (ca.field_i >= 0) {
          ca.field_i = ca.field_i + 1;
          if (25 < ca.field_i) {
            ca.field_i = -1;
            if (this.field_b) {
              this.e(1);
            }
          }
        }
        if (!(oj.field_q < 0) ||
          nk.field_e) {
          oj.field_q = oj.field_q + 1;
          nj.field_c = hc.a(2047, oj.field_q * 2048 / 25) + 163840 >> 10;
          if (oj.field_q >= 25) {
            if (nk.field_e) {
              nk.field_e = false;
              oj.field_q = 0;
            } else {
              oj.field_q = -1;
              nj.field_c = 256;
            }
          }
        }
    }

    final void j(int param0) {
        int var9 = 0;
        int var10 = 0;
        dd stackIn_21_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        if (param0 <= 24) {
          return;
        }
        if (!this.field_b) {
          if (0 <= ca.field_i) {
            this.a(10, (-ca.field_i + 25) * 255 / 25);
          }
          if (!qa.field_v.b(-119)) {
            qa.field_v.a((byte) -79, false);
          }
        } else {
          if (ng.field_s >= 0) {
            qh.c(al.field_k.field_qb + 5, 5 + al.field_k.field_eb, al.field_k.field_gb - 10, -10 + al.field_k.field_Db, 0, 128);
            this.c((byte) -109);
            var2 = al.field_k.field_qb;
            al.field_k.field_qb = al.field_k.field_qb - 160;
            var3 = al.field_k.field_eb;
            al.field_k.field_eb = al.field_k.field_eb - 240;
            ep.field_s.e();
            qh.d();
            this.field_l.a(false);
            hk.field_r.e();
            qh.d();
            this.c((byte) -109);
            this.field_h.a(false);
            var4 = -5 + (-qa.field_v.field_Db + (al.field_k.field_Db + al.field_k.field_eb));
            var5 = al.field_k.field_eb;
            var6 = al.field_k.field_qb + 5;
            var7 = al.field_k.field_gb + al.field_k.field_qb - 10;
            al.field_k.field_qb = var2;
            al.field_k.field_eb = var3;
            sh.field_P.b(15100);
            al.field_k.a((byte) -79, false);
            qa.field_v.a((byte) -79, false);
            if (qh.field_b > var6) {
              var6 = qh.field_b;
            }
            if (qh.field_g < var4) {
              var4 = qh.field_g;
            }
            if (var7 > qh.field_j) {
              var7 = qh.field_j;
            }
            if (var5 < qh.field_c) {
              var5 = qh.field_c;
            }
            var8 = -var6 + (var7 + (var4 - var5));
            for (var9 = var5; var4 > var9; var9++) {
              for (var10 = var6; var7 > var10; var10++) {
                if (ng.field_s + ga.a(5, true, ea.field_r) - 3 >= 25 * (-var6 + (var10 - var5) + var9) / var8) {
                  stackIn_21_0 = hk.field_r;
                } else {
                  stackIn_21_0 = ep.field_s;
                }
                var11 = stackIn_21_0.field_D[ep.field_s.field_z * var9 + var10];
                if (var11 != 0) {
                  qh.a(var10 + 160, 240 + var9, var11);
                }
              }
            }
          } else {
            if (ca.field_i < 0) {
              qh.c(5 + al.field_k.field_qb, al.field_k.field_eb + 5, -10 + al.field_k.field_gb, al.field_k.field_Db - 10, 0, 128);
              this.c((byte) -109);
              al.field_k.a((byte) -79, false);
              qa.field_v.a((byte) -79, false);
              this.field_h.a(false);
            } else {
              this.a(10, 255 * ca.field_i / 25);
              qa.field_v.a((byte) -79, false);
            }
          }
        }
    }

    private final void d(byte param0) {
        int var2 = 52 % ((7 - param0) / 41);
        if (this.field_b) {
          this.d(-128);
        } else {
          this.g(-84);
        }
    }

    private final void c(int param0) {
        if (param0 != 255) {
          this.field_d = (ko) null;
        }
        if (this.field_d.field_e != this.field_h.field_d) {
          if (this.field_h != null &&
            this.field_d.field_e != this.field_h) {
            ng.field_s = 0;
            this.field_l = this.field_h;
          }
          this.a((bk) (this.field_h.field_d), param0 ^ 254);
          this.g(-120);
        } else {
          if (null != this.field_j) {
            this.field_j.field_l = this.field_h;
            this.field_a.a(104, this.field_a.field_I.field_h, this.field_j);
          }
        }
    }

    final static eg b(byte param0) {
        eg var1 = new eg(0, 0, 0);
        if (param0 < 120) {
          field_i = 107;
        }
        var1.c();
        return var1;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param2 != 17924) {
            hq.h(36);
          }
          var3 = qa.a(param1, 0);
          if (param0.indexOf(param1) == -1 &&
            param0.indexOf(var3) == -1) {
            stackIn_14_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
            return stackIn_14_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("hq.AA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void e(byte param0) {
        boolean stackIn_27_0 = false;
        pq[] var2;
        int var3;
        int var4_int;
        qe var4;
        Object var5;
        int var5_int;
        int var6;
        int var8;
        pq var8_ref_pq;
        int var10;
        String var12;
        pq[] var13;
        int var14;
        qe var15;
        dl var16;
        pq var17;
        dl var18;
        var10 = Pool.field_O;
        if (param0 < 85) {
          return;
        }
        var4_int = this.field_h.field_s;
        if (var4_int != 512) {
          if (var4_int == 2048) {
            var12 = (String) null;
            gj.a(true, 0, kj.field_l, (String) null);
            var13 = this.field_a.field_I.field_l;
            var2 = var13;
            var3 = this.field_a.field_I.field_f.a(-1);
            if (0 == var3 ||
              var3 == 1) {
              var4 = this.field_a.field_I.j(105);
              var5 = null;
              var14 = 0;
              var6 = var14;
              while (var13.length > var14) {
                var17 = var13[var14];
                if (var17.field_s &&
                  var3 == this.field_a.field_I.field_f.b(var14, 30554)) {
                  var8 = this.field_a.field_I.a(17897, var14);
                  var18 = this.field_a.field_I.field_w[var8];
                  var17.field_g = var18.field_g;
                  var17.field_s = false;
                  var17.field_k = var18.field_f;
                  var17.field_p = true;
                  var18.a(var14, -106);
                  if (var5 == null) {
                    var5 = new ko();
                  }
                  ((ko) (var5)).b((byte) -43, new cr(var14, var8));
                }
                var14++;
              }
              if (var5 != null) {
                this.field_a.field_I.e(-54);
                var4.field_s = nd.field_j;
                var4.field_n = ((cr) (((ko) (var5)).c((byte) -64))).field_n;
                var4.field_m = (ko) (var5);
                var4.field_q = 2;
                stackIn_27_0 = this.field_a.field_I.f((byte) 117);
                this.field_a.s((byte) -62);
              }
            }
          }
        } else {
          if (this.field_a.field_I.field_f.a(-1) == -1) {
            var4_int = ga.a(2, true, ea.field_r);
            var5_int = ga.a(7, true, ea.field_r) - (-(var4_int << 3) - 1);
            var6 = ga.a(this.field_a.field_I.field_w.length, true, ea.field_r);
            var16 = this.field_a.field_I.field_w[var6];
            var18 = var16;
            var18 = var16;
            var8_ref_pq = this.field_a.field_I.field_l[var5_int];
            var15 = this.field_a.field_I.j(75);
            gj.a(true, 0, nr.a(new String[]{dq.field_a.a((byte) 92, var4_int)}, -1, vc.field_P), (String) null);
            this.field_a.field_I.e(-95);
            this.field_a.field_I.field_f.a(var4_int, -1, 0);
            var15.field_s = i.field_m | nd.field_j;
            var15.field_q = 2;
            var15.field_m = new ko();
            var15.field_m.b((byte) 105, new cr(var5_int, var6));
            var15.field_n = var5_int;
            this.field_a.field_I.f((byte) 53);
            this.field_a.s((byte) -36);
            var16.a(var5_int, 69);
            var8_ref_pq.field_s = false;
            var8_ref_pq.field_k = var16.field_f;
            var8_ref_pq.field_g = var16.field_g;
          }
        }
    }

    final void a(boolean param0, qe param1) {
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        cr var5_ref = null;
        String var6 = null;
        af var7 = null;
        ko var8 = null;
        aa var9 = null;
        ko var10 = null;
        aa var11 = null;
        cr var5_refLifetime1;
        var5 = null;
        try {
          if (this.field_h.field_s == 256) {
            if (param1.field_M >= 0 &&
              2 < pq.field_i.a((byte) 2)) {
              this.b(1, 8, -28186);
            } else {
              this.field_a.n(0);
              var6 = (String) null;
              gj.a(true, 0, ec.field_k, (String) null);
            }
          }
          if (this.field_h.field_s == 512 &&
            0 != (param1.field_s & i.field_m)) {
            this.b(1, 9, -28186);
          }
          if (2048 == this.field_h.field_s &&
            this.field_a.field_I.field_f instanceof af) {
            var7 = (af) (this.field_a.field_I.field_f);
            var4 = var7.f(22533, 0);
            if (var4 == 0 ||
              var4 == 1) {
              this.field_h.field_u = var7.e(var4, 125);
              if (this.field_h.field_u >= 7) {
                this.c(255);
              }
            }
          }
          if (this.field_h.field_s == 4096 &&
            param1.a((byte) -122, 8)) {
            this.b(1, 12, -28186);
          }
          if (param0) {
            return;
          }
          if (this.field_h.field_s == 32768) {
            var8 = param1.field_m;
            if (var8 != null) {
              var9 = new aa(var8);
              var5_ref = (cr) (var9.b((byte) -92));
              while (var5_ref != null) {
                if (0 != var5_ref.field_n) {
                  this.b(1, 15, -28186);
                }
                if (var5_ref.field_n == 9) {
                  this.b(1, 16, -28186);
                  break;
                }
                var5_ref = (cr) (var9.b(-121));
              }
            }
          }
          if (this.field_h.field_s == 65536) {
            var10 = param1.field_m;
            if (var10 != null) {
              var11 = new aa(var10);
              var5_refLifetime1 = (cr) (var11.b((byte) -92));
              while (var5_refLifetime1 != null) {
                if (9 == var5_refLifetime1.field_n) {
                  this.b(1, 16, -28186);
                  break;
                }
                var5_refLifetime1 = (cr) (var11.b(-114));
              }
            }
          }
          if (this.field_h.field_s == 16384 &&
            param1.field_z == this.field_a.field_I.field_f.b(param1.field_n, 30554)) {
            this.b(1, 14, -28186);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_48_0 = var3;
          stackIn_48_1 = new StringBuilder().append("hq.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int var13 = 0;
        int var17 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        bk var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        aa var23;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var20Lifetime2;
        var23 = new aa(this.field_d);
        var3 = 0;
        var4 = al.field_k.field_qb + qg.field_b.field_G;
        var5 = al.field_k.field_Db + (al.field_k.field_eb + (-al.field_k.field_F[7].field_A - al.field_k.field_F[4].field_A) + (-al.field_k.field_F[1].field_A + qg.field_b.field_B));
        var6 = var5 + qg.field_b.field_A;
        var7 = (bk) (var23.b((byte) -92));
        while (this.field_d.field_e != var7.field_d) {
          var8 = (var3 + 1) * (-qg.field_b.field_G + qg.field_b.field_w) / (this.field_k - 1) + qg.field_b.field_G + al.field_k.field_qb;
          var9 = var4;
          if (var9 < qh.field_b) {
            var9 = qh.field_b;
          }
          var10 = var8;
          if (qh.field_j < var10) {
            var10 = qh.field_j;
          }
          var11 = var5;
          if (qh.field_c > var11) {
            var11 = qh.field_c;
          }
          var12 = var6;
          if (var12 > qh.field_g) {
            var12 = qh.field_g;
          }
          for (var13 = var11; var13 < var12; var13++) {
            var14 = var13 - var5;
            stackIn_18_0 = qg.field_b.field_D;
            if (this.field_h != var7) {
              stackIn_19_1 = 0;
            } else {
              stackIn_19_1 = 1;
            }
            var15 = stackIn_18_0[stackIn_19_1 + qg.field_b.field_z * (var13 - var5)];
            var16 = qg.field_b.field_D[qg.field_b.field_z * (var13 - var5) + 2];
            for (var17 = var9; var17 < var10; var17++) {
              if (var9 == var17) {
                var21 = var15 >> 8 & 255;
                var20 = 255 & var15 >> 16;
                var20 = 255 & var20 + (255 - var20 >> 2);
                var21 = 255 & var21 + (-var21 + 255 >> 2);
                var22 = 255 & var15;
                var22 = var22 + (-var22 + 255 >> 2) & 255;
                var18 = var21 << 8 | var20 << 16 | var22;
                var21Lifetime1 = (var16 & 65303) >> 8;
                var20Lifetime2 = var16 >> 16 & 255;
                var22Lifetime1 = var16 & 255;
                var20Lifetime2 = (-var20Lifetime2 + 255 >> 2) + var20Lifetime2 & 255;
                var22Lifetime1 = (-var22Lifetime1 + 255 >> 2) + var22Lifetime1 & 255;
                var21Lifetime1 = (-var21Lifetime1 + 255 >> 2) + var21Lifetime1 & 255;
                var19 = var22Lifetime1 | (var21Lifetime1 << 8 | var20Lifetime2 << 16);
              } else {
                if (-1 + var10 != var17) {
                  var18 = var15;
                  var19 = var16;
                } else {
                  var18 = var15 >> 1 & 8355711;
                  var19 = 8355711 & var16 >> 1;
                }
              }
              var20Lifetime1 = var17 - var4;
              if (var14 + var20Lifetime1 >= var7.field_u * (-var4 + (var8 + qg.field_b.field_A)) / var7.field_l) {
                qh.field_d[qh.field_l * var13 + var17] = var18;
              } else {
                if (this.field_h == var7) {
                  qh.field_d[qh.field_l * var13 + var17] = md.a(md.a(rb.b(16711898, (-nj.field_c + 256) * (rb.b(16744119, var18) >> 16) + (rb.b(var19, 16714394) >> 16) * nj.field_c << 8), rb.b((256 - nj.field_c) * rb.b(var18 >> 8, 255) + (rb.b(65295, var19) >> 8) * nj.field_c, 65280)), rb.b(nj.field_c * rb.b(var19, 255) + (256 - nj.field_c) * rb.b(var18, 255) >> 8, 255));
                } else {
                  if (var7.field_u > var7.field_l) {
                    qh.field_d[var17 + qh.field_l * var13] = var18;
                  } else {
                    qh.field_d[var17 + qh.field_l * var13] = var19;
                  }
                }
              }
            }
          }
          var3++;
          var4 = var8;
          var7 = (bk) (var23.b(param0 ^ 61));
        }
        if (param0 != -109) {
          this.d(-29);
        }
    }

    private final void d(int param0) {
        if (!this.field_b) {
        } else {
          qa.field_v.field_G = vm.field_d[13];
          this.field_b = false;
          qa.field_v.field_ab = vm.field_d[1];
          qa.field_v.field_xb = vm.field_d[9];
          qa.field_v.field_hb = vm.field_d[5];
          if (ca.field_i == -1) {
            ca.field_i = 0;
          } else {
            ca.field_i = 25 - ca.field_i;
          }
        }
        if (param0 > -121) {
          this.a(113, -115);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == param0 &&
          bo.a(param1, (byte) 43)) {
          return 29;
        }
        return kb.field_d[param0];
    }

    final void a(int param0) {
        aa var4 = new aa(this.field_d);
        bk var3 = (bk) (var4.b((byte) -92));
        while (var3 != null) {
          var3.field_u = 0;
          var3 = (bk) (var4.b(param0 - 98));
        }
        this.a((bk) (this.field_d.c((byte) 109)), 1);
        this.g(-94);
        al.field_k.field_Db = null == this.field_h ? 10 : this.field_h.c((byte) -112);
        al.field_k.field_eb = -5 - al.field_k.field_Db + qh.field_f;
        this.e(1);
        this.field_a.n(0);
        if (param0 != -1) {
          this.c(127);
        }
        this.field_a.field_I.a(this.field_n, (byte) -118);
        this.field_a.field_G.field_h = 0;
        this.field_a.E(-24070);
        gj.a(true, 0, this.field_g, ke.field_a);
    }

    final static void h(int param0) {
        if (param0 != -29322) {
          field_c = -7;
        }
        int var1 = ee.b((byte) -62);
        int var2 = hl.a(23467);
        Pool.field_I.a(var1 + (bk.field_v << 1), -ld.field_b + uh.field_n, -6316, -bk.field_v + fk.field_Z, (ld.field_b << 1) + var2);
        e.a(param0 ^ 29411);
    }

    final static String a(int param0, byte param1, CharSequence[] param2, int param3) {
        int var7_int = 0;
        int var8 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        CharSequence var8_ref_CharSequence = null;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        var10 = Pool.field_O;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3 == 1) {
            var11 = param2[param0];
            var4 = var11;
            if (var4 != null) {
              stackIn_10_0 = var11.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var5 = -47 % ((-50 - param1) / 56);
          var4_int = param0 + param3;
          var6 = 0;
          for (var7_int = param0; var4_int > var7_int; var7_int++) {
            var8_ref_CharSequence = param2[var7_int];
            if (var8_ref_CharSequence != null) {
              var6 = var6 + var8_ref_CharSequence.length();
            } else {
              var6 += 4;
            }
          }
          var7 = new StringBuilder(var6);
          for (var8 = param0; var4_int > var8; var8++) {
            var9 = param2[var8];
            if (var9 == null) {
              discarded$0 = var7.append("null");
            } else {
              discarded$1 = var7.append(var9);
            }
          }
          stackIn_24_0 = var7.toString();
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("hq.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (qd.a(0, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (qd.a(0, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          if (param0 < 59) {
            var9 = (CharSequence) null;
            hq.a(53, (CharSequence) null);
          }
          var4 = -var2_int + var3;
          if (1 > var4) {
            return null;
          }
          if (var4 > 12) {
            stackIn_17_0 = null;
            return (String) (stackIn_17_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (ul.a((char) var7, (byte) 125)) {
              var8 = wi.a(true, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_31_0 = var5.toString();
            return stackIn_31_0;
          }
          stackIn_29_0 = null;
          return (String) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("hq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != -28186) {
          this.e(20);
        }
        if (1 << param1 == this.field_h.field_s) {
          if (!this.field_h.a(param0, (byte) 127)) {
            nk.field_e = true;
            this.g(20);
          } else {
            this.c(param2 ^ -28391);
            nk.field_e = false;
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        pl.field_b.field_eb = -3 + al.field_k.field_Db - pl.field_b.field_Db;
        pl.field_b.field_qb = 277;
        if (param0 != 1) {
          return;
        }
        qa.field_v.field_qb = 297 + al.field_k.field_qb;
        qa.field_v.field_eb = -qa.field_v.field_Db + al.field_k.field_eb - (-al.field_k.field_Db + 3);
        jq.field_d.field_eb = -3 + (al.field_k.field_Db - jq.field_d.field_Db);
        jq.field_d.field_qb = 317;
        for (var2 = 0; var2 < this.field_k; var2++) {
        }
    }

    final void g(int param0) {
        if (!this.field_b) {
          this.field_b = true;
          if (null != this.field_h) {
            this.field_h.a(this, 74);
          }
          qa.field_v.field_G = vm.field_d[14];
          qa.field_v.field_hb = vm.field_d[6];
          if (ca.field_i == -1) {
            ca.field_i = 0;
          } else {
            ca.field_i = 25 - ca.field_i;
          }
          qa.field_v.field_xb = vm.field_d[10];
          qa.field_v.field_ab = vm.field_d[2];
        }
        int var2 = -81 % ((-32 - param0) / 38);
    }

    private final void a(bk param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 1) {
            return;
          }
          this.field_h = param0;
          if (this.field_h != null) {
            this.field_h.a(this, 94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hq.V(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (param0 != -87) {
          this.field_g = (String) null;
        }
        if (this.field_h.field_k != this.field_d.field_e) {
          if (this.field_h != null &&
            this.field_h != this.field_d.field_e) {
            this.field_l = this.field_h;
            ng.field_s = 0;
          }
          this.a((bk) (this.field_h.field_k), 1);
          this.g(-109);
        }
    }

    hq(String param0, int param1, int param2) {
        try {
          this.field_g = param0;
          this.field_d = new ko();
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "hq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void i(int param0) {
        field_f = null;
        field_o = null;
        field_e = null;
        field_m = null;
        if (param0 != 5) {
          hq.b((byte) 8);
        }
    }

    static {
        field_o = "Find opponents";
        field_e = "Send private Quick Chat to <%0>";
        field_f = "(<%0> players want to join)";
        field_c = 2;
    }
}
