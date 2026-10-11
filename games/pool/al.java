/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class al {
    static vh field_k;
    int field_y;
    static vh field_v;
    dl[] field_w;
    boolean field_m;
    bf[] field_c;
    int field_z;
    int field_n;
    int field_A;
    pq[] field_l;
    int field_j;
    boolean field_o;
    int field_x;
    int field_p;
    sq field_f;
    int field_q;
    private int[] field_d;
    int[][] field_e;
    ko field_u;
    int field_s;
    String[] field_h;
    static tm[] field_B;
    static int[] field_g;
    int field_b;
    private int[] field_a;
    ko field_i;
    df[] field_r;
    private int[] field_t;

    private final void a(boolean param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        try {
          this.field_c = new bf[param1.length / 3];
          for (var3_int = 0; var3_int < param1.length / 3; var3_int++) {
            var4 = param1[(3 * var3_int + 0) % param1.length];
            var5 = param1[(3 * var3_int + 1) % param1.length] << 16;
            var6 = param1[(2 + var3_int * 3) % param1.length] << 16;
            var7 = param1[(3 + var3_int * 3) % param1.length];
            var8 = param1[(4 + 3 * var3_int) % param1.length] << 16;
            var9 = param1[(5 + var3_int * 3) % param1.length] << 16;
            this.field_c[var3_int] = new bf(var5, var6, var8, var9, var4, var7);
          }
          this.field_e = new int[param1.length / 3][2];
          this.field_d = new int[param1.length / 3];
          if (!param0) {
            this.g((byte) -43);
          }
          var10 = 0;
          var3_intLifetime1 = var10;
          while (param1.length / 3 > var10) {
            this.field_d[var10] = param1[var10 * 3];
            this.field_e[var10][0] = param1[1 + var10 * 3] << 16;
            this.field_e[var10][1] = param1[var10 * 3 + 2] << 16;
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("al.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int discarded$1 = 0;
        int var7 = 0;
        int var3;
        long var4;
        pq var6;
        long var8;
        long var10;
        long var12;
        int var14;
        var14 = Pool.field_O;
        var3 = -1;
        var4 = 0L;
        if (param0 != 17897) {
          discarded$1 = this.f(-119);
        }
        var6 = this.field_l[param1];
        for (var7 = 0; var7 < this.field_w.length; var7++) {
          var8 = (long)(-var6.field_g + this.field_w[var7].field_g);
          var10 = (long)(this.field_w[var7].field_f - var6.field_k);
          var12 = var8 * var8 + var10 * var10;
          if (var3 == -1 ||
            var4 > var12) {
            var4 = var12;
            var3 = var7;
          }
        }
        return var3;
    }

    public static void b(int param0) {
        if (param0 != 10) {
          return;
        }
        field_g = null;
        field_k = null;
        field_v = null;
        field_B = null;
    }

    final boolean f(byte param0) {
        int var3;
        Object var4;
        qe var4_ref;
        qe var5_ref_qe;
        int var5;
        Object var6;
        pq var7;
        qe var8;
        int var5Lifetime1;
        var4 = null;
        var8 = this.j(22);
        var3 = this.a(true, (byte) 76, var8) ? 1 : 0;
        if (this.field_i != null &&
          !this.field_i.c(0)) {
          var4_ref = (qe) (this.field_i.e((byte) -41));
        } else {
          var4_ref = new qe();
        }
        var4_ref.field_v = var8.field_v + 1;
        var4_ref.field_q = 0;
        if (var3 != 0) {
          var4_ref.field_L = this.field_f.a(var8, (byte) 117);
        } else {
          var4_ref.field_L = var8.field_L;
        }
        this.field_u.b((byte) -14, var4_ref);
        this.field_A = var4_ref.field_L;
        if (var3 != 0) {
          this.field_y = 0;
          this.field_z = 0;
        }
        if ((ob.field_F & var8.field_s) != 0) {
          this.b(ga.a(512, true, ea.field_r) + 1, 456);
        }
        if (param0 < 30) {
          this.field_z = -45;
        }
        if ((um.field_c & var8.field_s) != 0) {
          if (var4_ref.field_P != -1) {
            if (var4_ref.field_Q != -1) {
              this.a(var4_ref.field_Q, (li) null, (byte) -118, var4_ref.field_P, 0);
            } else {
              this.n(-16739);
            }
          } else {
            this.n(-16739);
          }
        }
        if (var4_ref.field_P == -1 &&
          var4_ref.field_Q == -1) {
          var5_ref_qe = var4_ref;
          var6 = this;
          var7 = ((al) (var6)).field_l[0];
          var5_ref_qe.field_P = var7.field_g;
          var5_ref_qe.field_Q = var7.field_k;
        } else {
          this.a(var4_ref.field_Q, var4_ref.field_P, -91, 0, false);
        }
        for (var5 = 0; var5 < this.field_w.length; var5++) {
          this.field_w[var5].a(this.field_l, -80);
        }
        if ((var8.field_s & be.field_I) != 0) {
          this.field_z = 1;
        }
        if ((var8.field_s & nr.field_Y) == 0) {
          var4_ref.field_u = 0;
        } else {
          if ((nr.field_V & var8.field_s) == 0) {
            if ((var8.field_s & nr.field_R) != 0) {
              var4_ref.field_u = 1;
            } else {
              if ((var8.field_s & nr.field_Q) != 0) {
                var4_ref.field_u = 2;
              }
            }
          } else {
            var4_ref.field_u = 3;
          }
        }
        if (0 != (var8.field_s & sg.field_O)) {
          this.field_y = 1;
        }
        if ((oa.field_b & var8.field_s) != 0) {
          var5Lifetime1 = var8.field_l & 3;
          if (var5Lifetime1 != 1) {
            if (var5Lifetime1 == 2) {
              this.field_f.a(1, -1, var8.field_L);
            }
          } else {
            this.field_f.a(0, -1, var8.field_L);
          }
        }
        this.field_f.a(var4_ref, false);
        return false;
    }

    final void a(int param0, li param1, byte param2, int param3, int param4) {
        try {
          this.a(param0, param3, param1, -30896, param4, 8192);
          int var6_int = 99 / ((param2 + 26) / 53);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "al.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void e(byte param0) {
        int var3 = 110 % ((-57 - param0) / 53);
        qe var2 = this.j(20);
        var2.field_T = this.b((byte) 91);
        var2.c(2, this.field_f.h(-1));
        var2.field_q = 2;
    }

    private final ge b(byte param0) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 <= 79) {
          this.n(117);
        }
        ge var2 = new ge(this.f(0));
        ge var3 = var2;
        var3.a(this.field_l.length, false);
        for (var4 = 0; this.field_l.length > var4; var4++) {
          this.field_l[var4].a(0, var3);
        }
        int var5 = 0;
        var4Lifetime1 = var5;
        while (var5 < this.field_w.length) {
          this.field_w[var5].a(var3, 0);
          var5++;
        }
        return var2;
    }

    final qe j(int param0) {
        if (param0 < 18) {
          return (qe) null;
        }
        return (qe) (this.field_u.a((byte) -127));
    }

    final void a(int param0, pq[] param1, qe param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          for (var4_int = 0; var4_int < param1.length; var4_int++) {
            if (param1[var4_int].field_s) {
              for (var5 = 0; var5 < this.field_w.length; var5++) {
                var6 = -this.field_w[var5].field_g + param1[var4_int].field_g;
                var7 = -this.field_w[var5].field_f + param1[var4_int].field_k;
                if (od.a((long)var6, (long)var6, false) + od.a((long)var7, (long)var7, false) < (long)ui.a(324, (byte) 90)) {
                  param1[var4_int].field_s = false;
                  param1[var4_int].field_v = 0;
                  if (param1[var4_int].field_q != null) {
                    param1[var4_int].field_q.a(23655, param1[var4_int], var5);
                  }
                  param2.field_m.b((byte) -23, new cr(var4_int, var5));
                }
              }
            }
          }
          if (param0 != 6582) {
            this.field_b = -87;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("al.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, byte param1, qe param2) {
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var6Lifetime1;
        try {
          var5 = 119 / ((param1 + 1) / 48);
          var4_int = 1;
          if (0 >= this.field_z) {
            if ((param2.field_s & nd.field_j) != 0) {
              var4_int = 0;
            } else {
              if (this.field_y > 0) {
                if (param0) {
                  this.field_y = this.field_y - 1;
                }
                var4_int = 0;
              }
            }
          } else {
            if (param0) {
              this.field_z = this.field_z - 1;
            }
            var4_int = 0;
          }
          if ((param2.field_s & ll.field_f) != 0) {
            var4_int = 1;
          }
          if ((ab.field_g & param2.field_s) != 0) {
            var6 = param2.field_l & 24;
            if (var6 != 8) {
              if (16 == var6) {
                var4_int = 1;
              }
            } else {
              var4_int = 0;
            }
          }
          if ((a.field_d & param2.field_s) != 0) {
            var6Lifetime1 = param2.field_l & 96;
            if (32 == var6Lifetime1) {
              var4_int = 1;
            } else {
              if (64 == var6Lifetime1) {
                var4_int = 0;
              }
            }
          }
          stackIn_28_0 = var4_int;
          return stackIn_28_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_31_0 = var4;
          stackIn_31_1 = new StringBuilder().append("al.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final void n(int param0) {
        this.a(50, (li) null);
        if (param0 != -16739) {
          this.field_p = 125;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4;
        long var6;
        qe var8;
        hh.field_e = 0;
        for (var2 = 0; this.field_l.length > var2; var2++) {
          if (this.field_l[var2].field_s) {
            for (var3 = var2 + 1; this.field_l.length > var3; var3++) {
              if (this.field_l[var3].field_s) {
                var4 = (long)(-this.field_l[var3].field_g + this.field_l[var2].field_g);
                var6 = (long)(this.field_l[var2].field_k - this.field_l[var3].field_k);
                var4 = od.a(var4, var4, false);
                var6 = od.a(var6, var6, false);
                if (var4 + var6 < 16777216L) {
                  k.field_N[hh.field_e][0] = var2;
                  k.field_N[hh.field_e][1] = var3;
                  hh.field_e = hh.field_e + 1;
                }
              }
            }
          }
        }
        if (param0 != 77) {
          var8 = (qe) null;
          this.a(true, (byte) -9, (qe) null);
        }
    }

    private final void g(int param0) {
        this.field_w = new dl[6];
        this.field_w[0] = new dl(this.field_c[2]);
        if (param0 != 10571) {
          this.field_w = (dl[]) null;
        }
        this.field_w[1] = new dl(this.field_c[6]);
        this.field_w[2] = new dl(this.field_c[10]);
        this.field_w[3] = new dl(this.field_c[14]);
        this.field_w[4] = new dl(this.field_c[18]);
        this.field_w[5] = new dl(this.field_c[22]);
    }

    private final void b(int param0, ge param1) {
        int var4_int = 0;
        int var11 = 0;
        qe stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        qe stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        qe var4 = null;
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2Lifetime1;
        var12 = Pool.field_O;
        try {
          this.field_u = new ko();
          var3_int = param1.b(true);
          for (var4_int = 0; var3_int > var4_int; var4_int++) {
            var5 = new qe();
            var5.field_v = param1.b(true);
            var5.field_M = param1.d((byte) -86);
            var6 = param1.g(param0 ^ -85);
            var5.field_q = 15 & var6 >> 4;
            stackIn_5_0 = var5;
            stackIn_6_1 = (8 == (8 & var6));
            stackIn_5_0.field_t = stackIn_6_1;
            var5.field_L = var6 & 7;
            var6Lifetime1 = param1.g(-120);
            var5.field_z = 15 & var6Lifetime1;
            stackIn_8_0 = var5;
            stackIn_9_1 = ((var6Lifetime1 & 64) != 0);
            stackIn_8_0.field_E = stackIn_9_1;
            var5.field_u = 3 & var6Lifetime1 >> 4;
            if (var5.field_z == 15) {
              var5.field_z = -1;
            }
            var5.field_P = param1.b(true);
            var5.field_Q = param1.b(true);
            if (var5.field_q >= 1) {
              var5.field_C = (short)param1.d(-1034);
              var5.field_A = (short)param1.d(-1034);
              var5.field_V = (short)param1.d(-1034);
              var5.field_D = (byte)param1.g(-77);
              var5.field_H = (byte)param1.g(param0 ^ -101);
            }
            if (var5.field_q >= 2) {
              var6Lifetime2 = var5.field_m.a(68);
              var6Lifetime2Lifetime1 = param1.g(-97);
              if (var6Lifetime2Lifetime1 > 0) {
                var5.field_m = new ko();
                for (var7 = 0; var7 < var6Lifetime2Lifetime1; var7++) {
                  var8 = param1.g(param0 ^ -125);
                  var5.field_m.b((byte) 97, new cr(31 & var8, var8 >> 5));
                }
              }
              var7Lifetime1 = param1.g(-123);
              if (var7Lifetime1 > 0) {
                var5.field_R = new ko();
                for (var8Lifetime1 = 0; var7Lifetime1 > var8Lifetime1; var8Lifetime1++) {
                  var9 = param1.g(param0 ^ -97);
                  var14 = new int[param1.g(-88)];
                  var13 = var14;
                  var10 = var13;
                  for (var11 = 0; var11 < var14.length; var11++) {
                    var10[var11] = param1.g(cq.a(param0, -124));
                  }
                  var5.field_R.b((byte) -70, new dn(var9, var14));
                }
              }
              var5.field_s = param1.f(81);
            }
            if (var5.field_q >= 3) {
              var5.field_l = (byte)param1.g(param0 - 130);
            }
            this.field_u.b((byte) 94, var5);
          }
          var4 = this.j(81);
          this.field_A = var4.field_L;
          if (param0 <= var4.field_q) {
            this.h(22042);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("al.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final boolean d(int param0) {
        int var2 = 0;
        for (var2 = param0; this.field_l.length > var2; var2++) {
          if (this.field_l[var2].field_s &&
            0 != this.field_l[var2].field_v) {
            return false;
          }
        }
        return true;
    }

    final boolean h(int param0) {
        qe var2;
        var2 = this.j(param0 ^ 22081);
        if (var2.field_q < 2) {
          throw new IllegalStateException("");
        }
        if (param0 != 22042) {
          return true;
        }
        if (0 != (var2.field_s & hm.field_e)) {
          this.field_A = this.field_f.a(var2, (byte) 94);
          return true;
        }
        if ((ag.field_e & var2.field_s) != 0) {
          return true;
        }
        if (var2.d(116)) {
          return false;
        }
        return this.f((byte) 116);
    }

    private final void a(int param0, int param1, li param2, int param3, int param4, int param5) {
        int var13 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        pq var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param3 != -30896) {
            return;
          }
          var7_int = 0;
          var8 = 0;
          if (param2 != null) {
            var7_int = param2.a(23165, 524288);
            var8 = -262144 + param2.a(23165, 524288);
          }
          var9 = this.field_l[param4];
          var9.field_o = false;
          var9.field_s = true;
          var9.field_j = -524288;
          var9.d((byte) -105);
          var9.field_p = true;
          var9.field_x.a(false);
          var9.field_g = var7_int + param1;
          var9.field_k = var8 + param0;
          this.a((byte) 77);
          var10 = 0;
          var11 = 0;
          while (true) {
            if (hh.field_e > 0) {
              var12 = 0;
              for (var13 = 0; var13 < hh.field_e; var13++) {
                if (param4 == k.field_N[var13][0] ||
                  param4 == k.field_N[var13][1]) {
                  var12++;
                }
              }
              if (var12 == 0) {
                return;
              }
              var10 += 2048;
              if (var10 >= 262144) {
                var11 = var11 + dn.a(67108864 / (var10 >> 8), false);
              } else {
                var11 += 256;
              }
              var11 = var11 % param5;
              var9.field_g = (af.c((byte) -121, var11) >> 4) * (var10 >> 12) + param1;
              var9.field_k = param0 + (o.a(var11, (byte) -62) >> 4) * (var10 >> 12);
              this.a((byte) 77);
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("al.RA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        long var11_long;
        int var12;
        long var12_long;
        long var13;
        long var14;
        long var15;
        long var16;
        long var17;
        int var18;
        long var19;
        int var19_int;
        int var20;
        long var21;
        long var23;
        long var25;
        long var27;
        long var29;
        long var31;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        if (param5 * param5 + param0 * param0 > 9216) {
          return false;
        }
        this.a(s.field_e, param2, (byte) 86, param1, param0, param5);
        var7 = 228 * param4 / 4096 + 456;
        if (param3 != 359) {
          this.b(100, 52);
        }
        for (var8 = 0; this.field_c.length > var8; var8++) {
          var9 = this.field_c[var8].field_j - this.field_c[var8].field_l;
          var10 = this.field_c[var8].field_f - this.field_c[var8].field_a;
          var11_long = bm.a(param3 ^ -314, od.a((long)var9, (long)var9, false) + od.a((long)var10, (long)var10, false));
          if (-2147483648L > var11_long ||
            var11_long > 2147483647L) {
            System.out.println("Wall normal overflow " + lo.a(var11_long, 7697781));
          }
          boolean decompiledFrameRemainder0 = true;
          var9 = lh.a((int)var11_long, (byte) -128, (long)var9);
          var10 = lh.a((int)var11_long, (byte) -119, (long)var10);
          var11 = -aj.a(this.field_c[var8].field_a, false, var9) - aj.a(this.field_c[var8].field_j, false, var10);
          var12_long = (long)var11 + (od.a((long)var9, (long)s.field_e[0], false) + od.a((long)var10, (long)s.field_e[1], false));
          var14 = od.a((long)var9, (long)s.field_e[9], false) + od.a((long)var10, (long)s.field_e[10], false);
          if (var14 != 0L) {
            var16 = -var12_long / var14;
            if (-2147483648L <= var16 &&
              var16 <= 2147483647L) {
              if ((!(var16 < 0L)) &&
                (!(var16 > (long)var7))) {
                L12: {
                  var18 = s.field_e[9] * (int)var16 + s.field_e[0];
                  var19_int = s.field_e[1] + s.field_e[10] * (int)var16;
                  var20 = s.field_e[2] + (int)var16 * s.field_e[11];
                  if (var10 != 0) {
                    if (this.field_c[var8].field_a >= this.field_c[var8].field_f) {
                      if (var18 < this.field_c[var8].field_f) {
                        break L12;
                      }
                      if (var18 > this.field_c[var8].field_a) {
                        break L12;
                      }
                    } else {
                      if (this.field_c[var8].field_a > var18) {
                        break L12;
                      }
                      if (var18 > this.field_c[var8].field_f) {
                        break L12;
                      }
                    }
                  }
                  if (var9 != 0) {
                    if (this.field_c[var8].field_l <= this.field_c[var8].field_j) {
                      if (this.field_c[var8].field_l > var19_int) {
                        break L12;
                      }
                      if (this.field_c[var8].field_j < var19_int) {
                        break L12;
                      }
                    } else {
                      if (var19_int < this.field_c[var8].field_j) {
                        break L12;
                      }
                      if (this.field_c[var8].field_l < var19_int) {
                        break L12;
                      }
                    }
                  }
                  if (var20 >= -1048576 &&
                    var20 <= 0) {
                    if (ba.field_ub != null) {
                      if (0L == (pd.field_i & 16L)) {
                        return false;
                      }
                      hr.a(ol.a(new int[]{var18, var19_int, var20}, (byte) 1), 16724753, -128, ba.field_ub.field_ab);
                    }
                    return false;
                  }
                }
                if (((ba.field_ub != null)) &&
                  ((0L != (16L & pd.field_i)))) {
                  hr.a(ol.a(new int[]{var18, var19_int, var20}, (byte) 1), 16764057, -79, ba.field_ub.field_ab);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              throw new IllegalStateException("Wall t overflow " + var16);
            }
          }
        }
        var8Lifetime1 = 4194304;
        for (var9Lifetime1 = 1; var9Lifetime1 < this.field_l.length; var9Lifetime1++) {
          L3: {
            if (this.field_l[var9Lifetime1].field_s) {
              var10Lifetime1 = -s.field_e[0] + this.field_l[var9Lifetime1].field_g;
              var11Lifetime1 = -s.field_e[1] + this.field_l[var9Lifetime1].field_k;
              var12 = -s.field_e[2] + this.field_l[var9Lifetime1].field_j;
              var13 = od.a((long)s.field_e[9], (long)s.field_e[9], false) + (od.a((long)s.field_e[10], (long)s.field_e[10], false) + od.a((long)s.field_e[11], (long)s.field_e[11], false));
              var15 = -2L * (od.a((long)s.field_e[9], (long)var10Lifetime1, false) - (-od.a((long)s.field_e[10], (long)var11Lifetime1, false) - od.a((long)s.field_e[11], (long)var12, false)));
              var17 = od.a((long)var10Lifetime1, (long)var10Lifetime1, false) + od.a((long)var11Lifetime1, (long)var11Lifetime1, false) - (-od.a((long)var12, (long)var12, false) + (long)var8Lifetime1);
              var19 = od.a(var15, var15, false) - 4L * od.a(var13, var17, false);
              if (var19 >= 0L) {
                var21 = bm.a(param3 ^ -278, var19);
                if (var21 <= 2147483647L &&
                  -2147483648L <= var21) {
                  var23 = (-var15 + var21) / var13 / 2L;
                  if (0L <= var23 &&
                    (long)var7 >= var23) {
                    var25 = (long)s.field_e[9] * var23 + (long)s.field_e[0];
                    var27 = (long)s.field_e[1] + var23 * (long)s.field_e[10];
                    var29 = (long)s.field_e[2] + var23 * (long)s.field_e[11];
                    if (null != ba.field_ub &&
                      (pd.field_i & 16L) != 0L) {
                      hr.a(ol.a(new int[]{(int)var25, (int)var27, (int)var29}, (byte) 1), 16724753, 112, ba.field_ub.field_ab);
                    }
                    return false;
                  }
                  var25 = (-var15 - var21) / var13 / 2L;
                  if (0L > var25) {
                    break L3;
                  }
                  if ((long)var7 < var25) {
                    break L3;
                  }
                  var27 = (long)s.field_e[0] + var25 * (long)s.field_e[9];
                  var29 = (long)s.field_e[10] * var25 + (long)s.field_e[1];
                  var31 = (long)s.field_e[11] * var25 + (long)s.field_e[2];
                  if (null != ba.field_ub &&
                    (pd.field_i & 16L) != 0L) {
                    hr.a(ol.a(new int[]{(int)var27, (int)var29, (int)var31}, (byte) 1), 16724753, param3 ^ -272, ba.field_ub.field_ab);
                  }
                  return false;
                }
                throw new IllegalStateException("Out of range: 0x" + Long.toString(var21, 16));
              }
            }
          }
        }
        return true;
    }

    private final void b(int param0, byte param1) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        pq var10;
        var10 = this.field_l[param0];
        if (param0 != 0) {
          return;
        }
        if (0L != (524288L & pd.field_i)) {
          return;
        }
        var9 = this.j(param1 ^ -23).field_u;
        if (var9 == 1) {
          if (524544 <= var10.field_k) {
            if (18349824 < var10.field_k) {
              var10.field_k = 18349824;
            }
          } else {
            var10.field_k = 524544;
          }
          if (var10.field_g >= 28311808) {
            if (37224192 < var10.field_g) {
              var10.field_g = 37224192;
            }
          } else {
            var10.field_g = 28311808;
          }
        } else {
          if (var9 != 3) {
            if (var10.field_g >= 524544) {
              if (var10.field_g > 37224192) {
                var10.field_g = 37224192;
              }
            } else {
              var10.field_g = 524544;
            }
            if (var10.field_k >= 524544) {
              if (var10.field_k > 18349824) {
                var10.field_k = 18349824;
              }
            } else {
              var10.field_k = 524544;
            }
          } else {
            if (var10.field_g > 9437184) {
              var10.field_g = 9437184;
            }
            var4 = -9437184 + var10.field_g;
            var5 = var10.field_k - 9437184;
            var6 = var4 >> 8;
            var7 = var5 >> 8;
            var8 = var6 * var6 + var7 * var7;
            if (var8 > 31690296) {
              var9 = rf.a(var8, -122);
              var10.field_k = (var5 / (var9 >> 8) << 8) + 9437184;
              var10.field_g = (var4 / (var9 >> 8) << 8) + 9437184;
            }
          }
        }
        if (param1 != -123) {
          this.a(-125);
        }
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        qe dupTemp$3 = null;
        qe dupTemp$4 = null;
        qe var6;
        qe var7;
        qe var8;
        if (param4 != 19063) {
          return;
        }
        L0: {
          if (!this.field_u.c(param4 - 19063)) {
            dupTemp$3 = this.j(49);
            var7 = dupTemp$3;
            var6 = var7;
            if ((param2 & 255) == (dupTemp$3.field_v & 255)) {
              var7.field_L = param3;
              break L0;
            }
          }
          dupTemp$4 = new qe(param2, param3);
          var8 = dupTemp$4;
          var6 = var8;
          this.field_u.b((byte) -58, dupTemp$4);
          this.field_f.a(var8, false);
        }
        this.field_A = param3;
        var6.field_M = param0;
        if (var6.field_M >= 0) {
          this.c(-95);
        }
        var6.field_I = param1;
        var6.field_T = this.b((byte) 98);
    }

    final void a(int param0, ge param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          var3_int = param1.g(-117);
          var4 = param1.g(param0 ^ -113);
          var5 = param1.d((byte) -111);
          if (param0 != 2) {
            this.field_i = (ko) null;
          }
          var6 = -1 + param1.g(-119);
          this.a(var5, var6, var3_int, var4, 19063);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "al.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.j(30).field_M = param0;
        this.c(-116);
        if (param1 != 456) {
          this.field_x = -45;
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (param0 > -44) {
          return;
        }
        for (var2 = 0; var2 < this.field_l.length; var2++) {
          this.field_l[var2].d((byte) 80);
        }
    }

    final void a(int param0, byte param1) {
        int var3;
        var3 = param0;
        if (var3 != 0) {
          if (var3 == 1) {
            this.field_f = (sq) ((Object) new fj(this));
          } else {
            if (var3 == 3) {
              this.field_f = (sq) ((Object) new mc(this));
            } else {
              if (var3 == 4) {
                this.field_f = (sq) ((Object) new vp(this));
              } else {
                if (var3 == 2) {
                  this.field_f = (sq) ((Object) new rj(this));
                }
              }
            }
          }
        } else {
          this.field_f = (sq) ((Object) new af(this));
        }
        if (param1 > -115) {
          this.field_d = (int[]) null;
        }
    }

    final void e(int param0, int param1) {
        int var3;
        pq var4;
        df var5;
        int var5_int;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        df var11;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        this.field_r = new df[this.field_l.length + this.field_e.length];
        for (var3 = 0; this.field_l.length > var3; var3++) {
          this.field_r[var3] = new df();
        }
        var3Lifetime1 = 0;
        if (param0 != 12226) {
          this.g((byte) 17);
        }
        while (this.field_e.length > var3Lifetime1) {
          this.field_r[this.field_l.length + var3Lifetime1] = new df();
          var3Lifetime1++;
        }
        this.field_t = new int[this.field_r.length];
        this.field_a = new int[this.field_r.length];
        var4 = this.field_l[param1];
        for (var3Lifetime2 = 0; var3Lifetime2 < this.field_l.length; var3Lifetime2++) {
          this.field_r[var3Lifetime2].a(var3Lifetime2, true, true);
          if (this.field_r[var3Lifetime2].a((byte) -8, param1, this)) {
            this.field_r[var3Lifetime2].a(param0 + 1763061160, var4, this);
            this.field_a[var3Lifetime2] = this.field_r[var3Lifetime2].field_l;
            this.field_t[var3Lifetime2] = var3Lifetime2;
          }
        }
        for (var3Lifetime3 = 0; this.field_e.length > var3Lifetime3; var3Lifetime3++) {
          var5_int = this.field_l.length + var3Lifetime3;
          this.field_r[var5_int].a(var3Lifetime3, false, true);
          this.field_r[var5_int].a(1763073386, var4, this);
          this.field_a[var5_int] = this.field_r[var5_int].field_l;
          this.field_t[var5_int] = var5_int;
        }
        fd.a(this.field_a, this.field_t, (byte) -54);
        for (var3Lifetime4 = 0; this.field_r.length > var3Lifetime4; var3Lifetime4++) {
          var5 = this.field_r[this.field_t[var3Lifetime4]];
          if (var5.a((byte) -8, param1, this)) {
            var6 = var5.a(this, var4, -6661);
            var7 = var5.a(1048576);
            var8 = 8191 & -var7 + var6;
            var9 = 8191 & var6 + var7;
            var5.field_j = true;
            var10 = 0;
            L8: while (true) {
              if (var10 < var3Lifetime4) {
                boolean decompiledFrameRemainder0 = true;
                var11 = this.field_r[this.field_t[var10]];
                if (var11.a((byte) -8, param1, this)) {
                  if (var9 > var8) {
                    if (var11.field_k >= var11.field_d) {
                      if (var11.field_k >= var8 &&
                        var11.field_d <= var9) {
                        if (var11.field_k < var9) {
                          var9 = var11.field_k;
                        } else {
                          if (!(var8 >= var11.field_d)) {
                            var8 = var11.field_d;
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var5.field_j = false;
                        break L8;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      if (var11.field_k < var8 &&
                        var8 < var11.field_d &&
                        var11.field_k < var9 &&
                        var11.field_d > var9) {
                        var5.field_j = false;
                        break L8;
                      }
                      if (var11.field_k < var8 &&
                        var8 < var11.field_d) {
                        var8 = var11.field_d;
                      } else {
                        if (var9 > var11.field_k &&
                          var11.field_d > var9) {
                          var9 = var11.field_k;
                        }
                      }
                    }
                  } else {
                    if (var11.field_d > var11.field_k) {
                      if (var11.field_d <= var8) {
                        if (var9 > var11.field_k) {
                          var9 = var11.field_k;
                        }
                      } else {
                        var8 = var11.field_d;
                      }
                    } else {
                      if (var8 > var11.field_k &&
                        var9 < var11.field_d) {
                        var5.field_j = false;
                        break L8;
                      }
                      if (var11.field_d >= var9) {
                        if (var11.field_k > var8) {
                          var9 = var11.field_k;
                        }
                      } else {
                        var8 = var11.field_d;
                      }
                    }
                  }
                }
                var10++;
                continue;
              }
              break;
            }
            this.field_r[this.field_t[var3Lifetime4]].field_k = 8191 & -var7 + var6;
            this.field_r[this.field_t[var3Lifetime4]].field_d = 8191 & var7 + var6;
          }
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        if (this.field_l != null &&
          this.field_l.length == param1) {
          return;
        }
        this.field_l = new pq[param1];
        for (var3 = 0; var3 < this.field_l.length; var3++) {
          this.field_l[var3] = new pq();
        }
        if (param0 != -14894) {
          this.field_m = true;
        }
    }

    final void c(int param0, int param1) {
        this.field_o = true;
        this.field_A = param1;
        if (param0 != -14286) {
          this.field_y = -45;
        }
    }

    final void i(byte param0) {
        int var3_int = 0;
        int var23 = Pool.field_O;
        qe var24 = this.j(102);
        if (var24.field_q != 1) {
          throw new IllegalStateException("Starting new shot, but not animating?");
        }
        if (null != var24.field_R) {
          var24.field_R.d((byte) 106);
        }
        var24.field_T = this.b((byte) 115);
        for (var3_int = 0; var3_int < this.field_l.length; var3_int++) {
          this.field_l[var3_int].field_c = 0;
          this.field_l[var3_int].field_q = null;
        }
        if (param0 != -51) {
          al.a(true, 13);
        }
        this.field_f.n(param0 ^ -11783);
        this.a(var24.field_Q, var24.field_P, 72, 0, false);
        qe var3 = var24;
        pq var4 = this.field_l[0];
        int var5 = var3.field_D * var3.field_D + var3.field_H * var3.field_H;
        if (9216 < var5) {
          throw new IllegalStateException("Strike point out of range! " + var3.field_D + "," + var3.field_H);
        }
        int var6 = -rf.a(-(var5 << 2) + 65536, -121) >> 9;
        int var7 = ao.a((int) var3.field_A, true);
        int var8 = hc.a(2047, (int) var3.field_A);
        int var9 = ao.a((int) var3.field_C, true);
        int var10 = hc.a(2047, (int) var3.field_C);
        int var11 = var9;
        int var12 = -var10;
        int var13 = aj.a(var7, false, -var12);
        int var14 = aj.a(var7, false, var11);
        int var15 = var8;
        int var16 = 0 * var14 - var15 * var12 >> 16;
        int var17 = var15 * var11 - 0 * var13 >> 16;
        int var18 = -(var14 * var11) + var12 * var13 >> 16;
        int var19 = var6 * var13 + var3.field_D * var11 + var3.field_H * var16 >> 9;
        int var20 = var12 * var3.field_D + (var14 * var6 + var3.field_H * var17) >> 9;
        int var21 = 0 * var3.field_D + var6 * var15 + var18 * var3.field_H >> 9;
        var4.field_I = lh.a(uh.field_q, (byte) -73, (long)(int)(od.a((long)(var3.field_V * var13), (long)kj.field_f, false) / 4096L));
        var4.field_t = lh.a(uh.field_q, (byte) -108, (long)(int)(od.a((long)(var3.field_V * var14), (long)kj.field_f, false) / 4096L));
        var4.field_v = 1;
        int var22 = lh.a(uh.field_w, (byte) -116, (long)(int)(od.a((long)(var3.field_V * bl.field_g), (long)kj.field_f, false) / 4096L));
        var4.field_n = aj.a(-aj.a(var14, false, var21), false, var22);
        var4.field_b = aj.a(aj.a(var13, false, var21), false, var22);
        var4.field_K = aj.a(aj.a(var14, false, var19) - aj.a(var13, false, var20), false, var22);
        pq.field_i = vb.a(-6584, this.field_l[0]);
    }

    final static void l(int param0) {
        if (sq.field_b == ne.field_w) {
          return;
        }
        if (dn.a(true, ne.field_w)) {
          s.field_c[ne.field_w].e((byte) -6);
        }
        ne.field_w = sq.field_b;
        if (vq.field_Sb) {
          ba.field_ub = null;
          am.field_e = null;
          vq.field_Sb = false;
        }
        sg.field_P = 0;
        nk.field_d = jc.field_c;
        int var1 = -44 % ((-83 - param0) / 40);
        if (lo.field_a) {
          ti.field_d = null;
          ad.field_l = new ko();
          oa.field_g = ek.a(124);
          hp.field_c = ek.a(-110);
          lo.field_a = false;
        }
        if (l.field_a) {
          lq.a(true);
          mj.b(0);
          lq.l(-121);
          l.field_a = false;
        }
    }

    final void a(ge param0, byte param1) {
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        dl var5 = null;
        pq var7 = null;
        int var8 = 0;
        int[] var9 = null;
        ge var10 = null;
        int var4Lifetime1;
        var8 = Pool.field_O;
        try {
          this.b(2, param0);
          this.field_f.a(param0, true);
          var3_int = param0.g(-67);
          if (0 != var3_int) {
            if (var3_int == 1) {
              var10 = param0;
              this.d(-14894, var10.g(-95));
              for (var4 = 0; var4 < this.field_l.length; var4++) {
                this.field_l[var4].a(var10, -1285);
              }
              for (var4Lifetime1 = 0; this.field_w.length > var4Lifetime1; var4Lifetime1++) {
                var5 = this.field_w[var4Lifetime1];
                var5.a((byte) 113, var10);
                if (var5.field_c != null) {
                  for (var6 = 0; var5.field_c.a((byte) 110) > var6; var6++) {
                    var7 = this.field_l[var5.field_c.a(var6, 2229)];
                    var7.field_k = var5.field_f;
                    var7.field_g = var5.field_g;
                    var7.field_p = true;
                  }
                }
              }
            }
          } else {
            this.b(param0.d(-1034), 456);
          }
          if (param1 <= 98) {
            var9 = (int[]) null;
            this.a(false, (int[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("al.IA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int f(int param0) {
        int var3 = 0;
        int var2 = 1;
        int var3Lifetime1;
        for (var3 = param0; var3 < this.field_l.length; var3++) {
          var2 = var2 + this.field_l[var3].d(1);
        }
        int var4 = 0;
        var3Lifetime1 = var4;
        while (this.field_w.length > var4) {
          var2 = var2 + this.field_w[var4].a((byte) -119);
          var4++;
        }
        return var2;
    }

    final void k(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        System.out.println(this.field_l.length + " balls");
        for (var2 = 0; var2 < this.field_l.length; var2++) {
          System.out.print(Integer.toString(var2));
          System.out.print(": ");
          this.field_l[var2].c(0);
          System.out.println("");
        }
        System.out.println("pockets");
        int var3 = param0;
        var2Lifetime1 = var3;
        while (var3 < this.field_w.length) {
          System.out.print(Integer.toString(var3));
          System.out.print(": ");
          this.field_w[var3].a(true);
          System.out.println("");
          var3++;
        }
    }

    final void c(int param0) {
        int var2;
        int var3;
        qe var4;
        li var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        pq var16;
        int var17;
        int[] var21;
        var2 = 9437184;
        var3 = 9437184;
        var4 = this.j(25);
        if (param0 > -76) {
          return;
        }
        var21 = this.field_f.a(var4.field_M, (byte) -32);
        if (var4.field_M < 0) {
          var4.field_M = ga.a(512, true, ea.field_r);
        }
        var6 = new li(new int[]{var4.field_M});
        var7 = 1;
        var8 = 1;
        var9 = 1;
        var10 = hc.a(2047, 170) * 16;
        do {
          var11 = 0;
          L3: while (true) {
            if (var11 < var7) {
              if (var21[var9] != -1) {
                var12 = var6.a(23165, 65536);
                var13 = var6.a(23165, 65536);
                var14 = 524288 * var12 / 65536 / 96;
                var15 = var13 * 524288 / 65536 / 96;
                var16 = this.field_l[var21[var9]];
                var16.field_g = var2 + var14;
                var16.field_j = -524288;
                var16.field_k = var11 * 34603008 / 32 + var3 + var15;
                var16.field_x.field_f = var6.a(23165, 65536);
                var16.field_x.field_h = var6.a(23165, 65536);
                var16.field_x.field_c = var6.a(23165, 65536);
                var16.field_x.field_b = var6.a(23165, 65536);
                var16.field_x.b(true);
                var16.field_s = true;
                var16.field_p = true;
                var16.field_o = false;
                var16.d((byte) -27);
                var8++;
                if (var8 >= this.field_l.length) {
                  break L3;
                }
              }
              var9++;
              var11++;
              continue;
            }
            break;
          }
          var7++;
          var3 = var3 - 540672;
          var2 = var2 - 33 * var10 / 32;
        } while (this.field_l.length > var8);
        var17 = 0;
        var11 = var17;
        while (var17 < this.field_w.length) {
          this.field_w[var17].a(this.field_l, -94);
          var17++;
        }
        if (-1 == var4.field_P ||
          var4.field_Q == -1) {
          this.a(63, var6);
        }
        this.field_f.l(-127);
        return;
    }

    private final int o(int param0) {
        ma stackIn_10_0 = null;
        int var2;
        int var3;
        aa var4;
        qe var5;
        aa var6;
        dn var7;
        qe var5Lifetime1;
        var2 = this.field_u.a(32);
        var3 = 4;
        if (param0 != 12850) {
          this.d(127, -64);
        }
        if (var2 > 0) {
          var2 = 0;
          var4 = new aa(this.field_u);
          var5 = (qe) (var4.a(0));
          while (var5 != null) {
            if (var2 < 3) {
              var2++;
              var5 = (qe) (var4.c((byte) -71));
              continue;
            }
            break;
          }
          if (var5 == null) {
            stackIn_10_0 = var4.b((byte) -92);
          } else {
            stackIn_10_0 = var4.a(var5.field_d, false);
          }
          var5Lifetime1 = (qe) (stackIn_10_0);
          while (var5Lifetime1 != null) {
            var3 += 16;
            if (1 <= var5Lifetime1.field_q) {
              var3 += 8;
            }
            if (var5Lifetime1.field_q >= 2) {
              var3++;
              var3 = var3 + var5Lifetime1.field_m.a(param0 ^ 12801);
              var3++;
              if (var5Lifetime1.field_R != null &&
                !var5Lifetime1.field_R.c(0)) {
                var6 = new aa(var5Lifetime1.field_R);
                var7 = (dn) (var6.b((byte) -92));
                while (var7 != null) {
                  var3 += 2;
                  var3 = var3 + var7.field_l.length;
                  var7 = (dn) (var6.b(-112));
                }
              }
              var3 += 3;
            }
            if (var5Lifetime1.field_q >= 3) {
              var3++;
            }
            var5Lifetime1 = (qe) (var4.b(-84));
          }
        }
        return var3;
    }

    final int a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_2 = 0;
        if (param0 != -1) {
          field_B = (tm[]) null;
        }
        stackIn_5_0 = this.o(param0 + 12851);
        stackIn_5_1 = this.field_f.m(param0 + 1) + 1;
        if (this.j(81).field_M >= 0 &&
          this.j(65).field_q == 0) {
          stackIn_7_2 = 2;
        } else {
          stackIn_7_2 = this.f(param0 + 1);
        }
        return stackIn_5_0 + (stackIn_5_1 + stackIn_7_2);
    }

    final static void a(boolean param0, int param1) {
        int var6 = 0;
        vh dupTemp$0 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        vh stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vh var7 = null;
        int var7_int = 0;
        int var8 = 0;
        vh var8_ref_vh = null;
        uo var9 = null;
        int var9_int = 0;
        uo var10 = null;
        int var10_int = 0;
        int var12 = 0;
        int var13 = 0;
        vh var14 = null;
        int var15 = 0;
        var13 = Pool.field_O;
        try {
          fr.field_s = qh.field_l;
          f.field_h = qh.field_f;
          stackIn_3_0 = -127;
          if (param0) {
            stackIn_4_1 = uf.field_z;
          } else {
            stackIn_4_1 = nj.field_b;
          }
          fr.$cfr$intArgs$a$e9dea5688aa5(stackIn_3_0, stackIn_4_1);
          na.field_e.a(-40 + so.field_k.field_Db - 2, so.field_k.field_gb, 0, 0, (byte) -114);
          nd.field_c.b(0, 2147483647, 0, cl.field_d.field_gb, ad.field_x);
          stackIn_6_0 = br.field_M;
          stackIn_6_1 = 2 + ad.field_x;
          stackIn_6_2 = param1 ^ 2147483647;
          stackIn_6_3 = 0;
          stackIn_6_4 = cl.field_d.field_gb;
          if (!tq.field_p) {
            stackIn_7_5 = 0;
          } else {
            stackIn_7_5 = 2 + (2 + nk.field_n) + 40;
          }
          ((vh) (Object) stackIn_6_0).b(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 - stackIn_7_5, 18);
          jh.field_a.b(ad.field_x + 2, 2147483647, -2 + (-nk.field_n + cl.field_d.field_gb - 40), nk.field_n + 42, 18);
          wo.field_f.a(nk.field_n, -22 + (cl.field_d.field_Db - ad.field_x), (byte) -112, 2, cl.field_d.field_gb, 0, ad.field_x + 22);
          ok.field_ob.b(so.field_k.field_Db - 40, 2147483647, 0, so.field_k.field_gb, 40);
          ii.field_e.b(0, param1 ^ 2147483647, 0, uq.field_f.field_gb, 30);
          rq.field_x.b(30, 2147483647, 0, uq.field_f.field_gb, -30 + (-2 + uq.field_f.field_Db) - 40);
          var2_int = dr.field_c + 3;
          if (dg.field_T.length < 2) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = (-8 + (rq.field_x.field_Db - 10 + (var2_int + 1) / 2)) / (var2_int + 1) - 2;
          if (30 < var3) {
            var3 = 30;
          }
          var4 = -5 + (rq.field_x.field_Db - (5 + var2_int * (2 + var3)));
          if (var4 > 40) {
            var4 = 40;
          }
          oi.field_q.b(5, 2147483647, 5, -5 + rq.field_x.field_gb - 5, var4);
          var5 = 5 + var4 + 2;
          for (var6 = param1; var6 < 4 + dr.field_c; var6++) {
            if ((var6 != 1 ||
              !(dg.field_T.length < 2)) && (var6 != 3 ||
              !(ji.field_g <= 1))) {
              if (!param0 &&
                var6 == 3) {
                dupTemp$0 = oi.field_v[var6];
                var14 = dupTemp$0;
                var7 = dupTemp$0;
                oi.field_v[var6].field_Db = 0;
                var14.field_gb = 0;
                for (var8 = 0; mc.field_f[var6].length > var8; var8++) {
                  if (null != mc.field_f[var6][var8]) {
                    var9 = mc.field_f[var6][var8];
                    mc.field_f[var6][var8].field_Db = 0;
                    var9.field_gb = 0;
                  }
                }
              } else if (param0 &&
                0 == var6) {
                var7 = oi.field_v[var6];
                oi.field_v[var6].field_Db = 0;
                var7.field_gb = 0;
                for (var8 = 0; var8 < mc.field_f[var6].length; var8++) {
                  if (null != mc.field_f[var6][var8]) {
                    var9 = mc.field_f[var6][var8];
                    mc.field_f[var6][var8].field_Db = 0;
                    var9.field_gb = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (null != vl.field_p) {
                      stackIn_41_0 = (vl.field_p[-4 + var6]) ? 1 : 0;
                    } else {
                      stackIn_41_0 = 0;
                    }
                  } else {
                    stackIn_41_0 = 0;
                  }
                } else {
                  stackIn_41_0 = 0;
                }
                var7_int = stackIn_41_0;
                if (var7_int != 0) {
                  var8_ref_vh = oi.field_v[var6];
                  oi.field_v[var6].field_Db = 0;
                  var8_ref_vh.field_gb = 0;
                  var15 = 0;
                  var9_int = var15;
                  while (var15 < mc.field_f[var6].length) {
                    if (mc.field_f[var6][var15] != null) {
                      var10 = mc.field_f[var6][var15];
                      mc.field_f[var6][var15].field_Db = 0;
                      var10.field_gb = 0;
                    }
                    var15++;
                  }
                } else {
                  oi.field_v[var6].b(var5, 2147483647, 5, 103, var3);
                  var8 = 110;
                  if (!param0) {
                    if (null != mc.field_f[var6][0]) {
                      var9 = mc.field_f[var6][0];
                      mc.field_f[var6][0].field_Db = 0;
                      var9.field_gb = 0;
                    }
                  } else {
                    mc.field_f[var6][0].a(var8, true, 2, var3, ja.field_b, 38, var5);
                    var8 += 40;
                  }
                  var9_int = 2 - var8 + (-5 + uq.field_f.field_gb);
                  var10_int = mc.field_f[var6].length - 1;
                  for (var11 = 0; var11 < var10_int; var11++) {
                    var12 = var11 * var9_int / var10_int;
                    mc.field_f[var6][1 + var11].a(var12 + var8, true, 2, var3, ja.field_b, -2 + ((var11 + 1) * var9_int / var10_int - var12), var5);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          de.field_b.b(10, 2147483647, qh.field_l - 360 >> 1, 360, -134 + qh.field_f - 10);
          Pool.field_P.b(0, 2147483647, 0, de.field_b.field_gb, 24);
          aa.field_b.b(24, 2147483647, 0, de.field_b.field_gb, -24 + de.field_b.field_Db);
          aa.field_b.field_F = rp.a(32450, 3, 1, aa.field_b.field_Db, 11579568, 8421504);
          c.field_e.b(5, 2147483647, 5, -10 + aa.field_b.field_gb, -2 + (-24 + (-10 + aa.field_b.field_Db)));
          ba.field_vb.b(-24 + (aa.field_b.field_Db - 5), param1 ^ 2147483647, (-80 + aa.field_b.field_gb) / 2, 80, 24);
          da.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "al.OA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 <= 68) {
          this.field_x = 56;
        }
        return !this.field_l[0].field_s ? true : false;
    }

    final void c(byte param0) {
        int var6 = 0;
        int var8 = 0;
        qe var2;
        qe var3;
        ge var4;
        int var5;
        dl var7;
        pq var9;
        int var10;
        int var5Lifetime1;
        var10 = Pool.field_O;
        if (this.j(41).field_q != 0) {
          return;
        }
        if (this.field_u.c((byte) 113) == this.field_u.a((byte) -127)) {
          return;
        }
        var2 = (qe) (this.field_u.b(-1));
        var3 = (qe) (this.field_u.a((byte) -127));
        var3.field_T.field_v = 0;
        var4 = var3.field_T;
        this.d(-14894, var4.g(-65));
        for (var5 = 0; var5 < this.field_l.length; var5++) {
          this.field_l[var5].a(var4, -1285);
        }
        var5Lifetime1 = 89 % ((41 - param0) / 37);
        for (var6 = 0; this.field_w.length > var6; var6++) {
          var7 = this.field_w[var6];
          var7.a((byte) 113, var4);
          if (null != var7.field_c) {
            for (var8 = 0; var7.field_c.a((byte) 101) > var8; var8++) {
              var9 = this.field_l[var7.field_c.a(var8, 2229)];
              var9.field_k = var7.field_f;
              var9.field_p = true;
              var9.field_g = var7.field_g;
            }
          }
        }
        var3.field_q = 0;
        var3.field_m.d((byte) 83);
        var3.field_s = uk.field_a;
        if (null == this.field_i) {
          this.field_i = new ko();
        }
        this.field_i.a((byte) -84, var2);
        return;
    }

    final void g(byte param0) {
        qe stackIn_7_0 = null;
        int stackIn_8_1 = 0;
        qe var3;
        aa var4_ref_aa;
        int var4;
        cr var5;
        dl var6;
        qe var7;
        qa.a(this.field_e, this.field_c, this.field_l, 0);
        var7 = this.j(79);
        if (param0 > -2) {
          return;
        }
        if (var7.field_n == -1) {
          var7.field_n = hb.field_s;
        }
        this.a(6582, this.field_l, this.j(110));
        stackIn_7_0 = var7;
        stackIn_8_1 = (!this.d(0)) ? 1 : 2;
        stackIn_7_0.field_q = stackIn_8_1;
        var3 = this.j(60);
        this.field_j = 0;
        if (!var3.field_m.c(0)) {
          var4_ref_aa = new aa(var3.field_m);
          var5 = (cr) (var4_ref_aa.a(0));
          while (var5 != null) {
            var6 = this.field_w[var5.field_r];
            if (var6.b(var5.field_n, 304)) {
              break;
            }
            var6.a(var5.field_n, 75);
            this.field_j = this.field_j + 1;
            var5 = (cr) (var4_ref_aa.c((byte) -71));
          }
        }
        var4 = var7.field_q;
        if (0 == var4) {
          throw new IllegalStateException();
        }
        if (1 != var4 &&
          2 == var4) {
          var7.c(2, this.field_f.a((byte) 121));
        }
        return;
    }

    final static void m(int param0) {
        ci.d((byte) -125);
        lf.a(param0, (byte) 93);
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6;
        pq var7;
        int var8;
        int var9;
        int var10;
        int var6Lifetime1;
        int var10Lifetime1;
        var6 = 0;
        var7 = this.field_l[param3];
        var8 = var7.field_g;
        var7.field_g = param1;
        var9 = var7.field_k;
        var7.field_k = param0;
        var7.field_s = true;
        var7.field_o = false;
        var7.d((byte) -58);
        var7.field_p = true;
        if (param4) {
          this.b(param3, (byte) -123);
        }
        var6Lifetime1 = 0;
        this.a((byte) 77);
        for (var10 = 0; hh.field_e > var10; var10++) {
          if (param3 != k.field_N[var10][0]) {
            if (param3 == k.field_N[var10][1]) {
              var6Lifetime1++;
            }
          } else {
            var6Lifetime1++;
          }
        }
        if (var6Lifetime1 == 0) {
          var7.field_p = true;
          return true;
        }
        var7.field_g = var8;
        var7.field_k = var9;
        var10Lifetime1 = 87 / ((param2 + 1) / 34);
        return false;
    }

    private final void a(int param0, li param1) {
        qe var3 = null;
        qe var4 = null;
        Object var5 = null;
        pq var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.a(9437184, 28311552, param1, -30896, 0, 4096);
          var3 = this.j(97);
          var3.field_u = this.field_f.a(false);
          var4 = var3;
          var5 = this;
          var6 = ((al) (var5)).field_l[0];
          var4.field_P = var6.field_g;
          var4.field_Q = var6.field_k;
          if (param0 < 34) {
            this.k(50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("al.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        field_k = new vh(0L, (vh) null, qh.field_l - ff.field_e[4].field_z >> 1, -120 + qh.field_f, ff.field_e[4].field_z, qh.field_f, (String) null);
        ia.a(true, field_k);
        field_k.field_F = ff.field_e;
        qa.field_v = new vh("tut_close", (vh) null);
        vh dupTemp$0 = new vh("tut_skip", (vh) null);
        jq.field_d = dupTemp$0;
        field_k.a(-111, dupTemp$0);
        vh dupTemp$1 = new vh("tut_prev", (vh) null);
        pl.field_b = dupTemp$1;
        field_k.a(-104, dupTemp$1);
        pl.field_b.b(72, 2147483647, 277, 15, 15);
        qa.field_v.b(72, 2147483647, 297, 15, 15);
        jq.field_d.b(72, 2147483647, 317, 15, 15);
        pl.field_b.field_xb = vm.field_d[8];
        pl.field_b.field_G = vm.field_d[12];
        pl.field_b.field_hb = vm.field_d[4];
        pl.field_b.field_ab = vm.field_d[0];
        qa.field_v.field_ab = vm.field_d[2];
        qa.field_v.field_G = vm.field_d[14];
        if (param0 != -27397) {
          return;
        }
        qa.field_v.field_hb = vm.field_d[6];
        qa.field_v.field_xb = vm.field_d[10];
        jq.field_d.field_xb = vm.field_d[11];
        jq.field_d.field_hb = vm.field_d[7];
        jq.field_d.field_G = vm.field_d[15];
        jq.field_d.field_ab = vm.field_d[3];
    }

    final void a(int[] param0, int param1, byte param2, int param3, int param4, int param5) {
        int var14_int = 0;
        int var7_int = ao.a(param1, true);
        int var8 = hc.a(2047, param1);
        int var9 = ao.a(param3, true);
        int var10 = hc.a(2047, param3);
        param0[9] = aj.a(var10, false, var7_int);
        param0[10] = aj.a(var9, false, var7_int);
        param0[3] = var9;
        param0[5] = 0;
        param0[4] = -var10;
        param0[11] = var8;
        param0[6] = aj.a(param0[5], false, param0[10]) - aj.a(param0[4], false, param0[11]);
        param0[7] = aj.a(param0[3], false, param0[11]) - aj.a(param0[5], false, param0[9]);
        param0[8] = aj.a(param0[4], false, param0[9]) - aj.a(param0[3], false, param0[10]);
        int var11 = param5 * 65536 / 128;
        int var12 = 53 / ((param2 + 17) / 58);
        int var13 = param4 * 65536 / 128;
        try {
          var14_int = rf.a(-aj.a(var11, false, var11) + (65536 - aj.a(var13, false, var13)), -122);
          param0[0] = this.field_l[0].field_g + (aj.a(param0[3], false, var11) + (aj.a(param0[6], false, var13) + aj.a(param0[9], false, var14_int))) * 8;
          param0[1] = this.field_l[0].field_k + 8 * (aj.a(param0[4], false, var11) + aj.a(param0[7], false, var13) + aj.a(param0[10], false, var14_int));
          param0[2] = this.field_l[0].field_j + (aj.a(param0[5], false, var11) + aj.a(param0[8], false, var13) + aj.a(param0[11], false, var14_int)) * 8;
        } catch (IllegalArgumentException illegalArgumentException) {
          System.out.println("Oh dear. Strike point is way wrong: " + param5 + "," + param4 + ":\n" + illegalArgumentException.getMessage());
          throw illegalArgumentException;
        }
    }

    private final void h(byte param0) {
        this.a(true, new int[]{2, 18, 0, 2, 260, 0, 1, 272, -15, 1, 304, -15, 2, 316, 0, 2, 558, 0, 1, 584, -22, 1, 598, -8, 2, 576, 18, 2, 576, 270, 1, 598, 296, 1, 584, 310, 2, 558, 288, 2, 316, 288, 1, 304, 303, 1, 272, 303, 2, 260, 288, 2, 18, 288, 1, -8, 310, 1, -22, 296, 2, 0, 270, 2, 0, 18, 1, -22, -8, 1, -8, -22});
        if (param0 != -58) {
          this.a(95);
        }
    }

    al(int param0, int param1, String[] param2, int param3) {
        qe var5 = null;
        this.field_y = 0;
        this.field_z = 0;
        this.field_m = false;
        this.field_u = new ko();
        this.field_r = null;
        this.field_t = null;
        this.field_a = null;
        try {
          this.field_q = param0;
          this.field_n = param2.length;
          this.field_A = param3;
          this.field_h = param2;
          this.a(param1, (byte) -128);
          this.d(-14894, this.field_f.i(26840));
          this.h((byte) -58);
          this.g(10571);
          var5 = new qe();
          this.field_u.b((byte) -60, var5);
          var5.field_L = this.field_A;
          this.b(ga.a(512, true, ea.field_r) + 1, 456);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "al.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_g = new int[8192];
    }
}
