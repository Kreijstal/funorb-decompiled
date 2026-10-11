/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii {
    private boolean field_u;
    private int field_w;
    private int field_n;
    static String field_v;
    static int field_t;
    static String field_b;
    private int field_x;
    static String field_B;
    private boolean field_h;
    static int field_i;
    private bg field_j;
    private boolean field_f;
    private boolean field_m;
    static String field_c;
    static int field_q;
    static String[] field_y;
    private pb field_A;
    private boolean field_s;
    static String field_k;
    private boolean field_l;
    static hh[] field_p;
    private boolean field_r;
    int field_z;
    int field_o;
    private boolean field_g;
    private nn field_e;
    private uh[] field_d;
    pm field_a;

    private final void b(int param0, byte param1) {
        int var7 = 0;
        uh var8 = null;
        int var9 = Pixelate.field_H ? 1 : 0;
        int var3 = 6 / ((-71 - param1) / 40);
        this.field_a.field_a[param0].a(this.field_a.field_d.field_l[this.field_a.field_d.field_d], -99);
        this.field_a.field_a[-param0 + 1].a(0, rd.field_l);
        this.field_a.field_a[-param0 + 1].field_e = bl.field_b;
        this.field_a.field_a[1 - param0].field_h = ka.field_V;
        int var4 = jk.field_c - this.field_a.field_v[param0];
        int var5 = ng.field_u - this.field_a.field_v[-param0 + 1];
        if (0 < var4) {
          this.field_d[param0].a(-20791, var4, false);
        }
        if (var5 > 0) {
          this.field_d[-param0 + 1].a(-20791, var5, false);
        }
        this.field_a.field_v[param0] = jk.field_c;
        this.field_a.field_v[-param0 + 1] = ng.field_u;
        uh[] var6 = this.field_d;
        for (var7 = 0; var6.length > var7; var7++) {
          var8 = var6[var7];
          var8.d(93);
          var8.field_l = true;
        }
        if (this.field_a.c(0)) {
          this.field_r = false;
        } else {
          this.field_r = true;
        }
        this.field_d[param0].field_c = false;
        gq.a(0, 200, 320, sd.a(qm.field_G, 35, new String[]{this.field_a.field_i[param0]}));
    }

    private final void h(int param0) {
        int var3 = 0;
        uh[] var2;
        uh var4;
        int var5;
        uh[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (this.field_a.field_r > 0 &&
          !this.field_s &&
          !this.field_a.field_d.field_i) {
          this.a(16, (byte) 58, 239);
        }
        if (0 < this.field_w) {
          if (this.field_a.field_r == 5) {
            this.a(11, (byte) 58, 244);
          }
          if (10 == this.field_a.field_r) {
            this.a(17, (byte) 58, 238);
          }
        }
        this.field_s = false;
        if (9 == this.field_a.field_r &&
          uo.field_j <= 0) {
          this.a(true, 250, false);
          return;
        }
        this.field_a.field_d.field_d = this.field_a.field_d.field_l.length;
        int fieldTemp$0 = this.field_a.field_r + 1;
        this.field_a.field_r = this.field_a.field_r + 1;
        this.field_a.a(0, fieldTemp$0, oa.field_j);
        this.field_f = true;
        var6 = this.field_d;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.e(2406);
        }
        if (param0 <= 12) {
          this.field_w = 103;
        }
        f.field_o = f.field_o + 1;
        if (this.field_a.field_r == 30) {
          this.a(4, (byte) 58, 251);
        }
        if (40 == this.field_a.field_r) {
          this.a(5, (byte) 58, 250);
        }
        if (50 == this.field_a.field_r) {
          this.a(6, (byte) 58, 249);
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        hq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean stackIn_6_3 = false;
        boolean stackIn_8_4;
        boolean stackIn_8_5;
        boolean stackIn_9_6;
        hq stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        Object var5;
        int var5_int;
        int var6;
        hq var7;
        hq var8;
        var6 = Pixelate.field_H ? 1 : 0;
        if (this.field_g) {
          return;
        }
        this.field_g = true;
        var7 = (hq) (wo.b(-119, 13));
        var8 = var7;
        if (0 != oa.field_j) {
          if (oa.field_j != 1) {
            if (2 == oa.field_j) {
              var5 = null;
              if (this.field_a.field_j >= 0) {
                var5 = this.field_a.field_i[this.field_a.field_j];
              }
              var8.a((String) (var5), -10, this.field_a);
            }
          } else {
            var5_int = un.field_j.field_e;
            if (un.field_j.field_n) {
              var5_int++;
            }
            if (50 <= var5_int) {
              var5_int = -1;
            }
            if (0 >= uo.field_j &&
              var5_int >= 10) {
              var5_int = -1;
            }
            stackIn_21_0 = var8;
            stackIn_22_1 = (go.field_k == 0) ? false : true;
            ((hq) (Object) stackIn_21_0).a(stackIn_22_1, un.field_j.field_n, gb.field_f[1], gb.field_f[0], (byte) 34, var5_int, un.field_j.a((byte) -117));
          }
        } else {
          this.j(17945);
          stackIn_5_0 = var7;
          stackIn_5_1 = gb.field_f[0];
          stackIn_5_2 = gb.field_f[1];
          stackIn_6_3 = (wh.field_p == null) ? false : true;
          stackIn_8_4 = param0;
          stackIn_8_5 = jg.a((byte) 85);
          stackIn_9_6 = (go.field_k == 0) ? false : true;
          ((hq) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_6_3, stackIn_8_4, stackIn_8_5, stackIn_9_6, gb.field_f[3], 2, gb.field_f[2], this.field_a.field_v[0]);
        }
        if (oa.field_j != 1) {
          dg.a(1, (byte) -97);
        }
        if (param1 != 250) {
          this.field_h = false;
        }
        la.a(ti.field_t, 13, false, -25528);
        return;
    }

    final void a(int param0, byte param1, int param2) {
        boolean discarded$0 = false;
        int var4 = 1 << param0;
        if ((de.field_n & var4) != 0) {
          return;
        }
        de.field_n = de.field_n | var4;
        go.field_k = go.field_k | var4;
        if (param1 != 58) {
          discarded$0 = this.a(-117, 64);
        }
        pl.field_Y.a(22125, new ph(param0));
        if (!this.field_l) {
          nj.field_h.a(param1 ^ 22103, new hf(param0, param2, sb.field_a, f.field_o, ap.field_f, lo.field_Mb));
        }
    }

    private final void d(int param0) {
        int var4 = 0;
        uh stackIn_3_0 = null;
        uh var2;
        int var3;
        int var5;
        uh var6;
        var5 = Pixelate.field_H ? 1 : 0;
        if (!this.a(param0 + 14099, this.field_z)) {
          stackIn_3_0 = this.field_d[0];
        } else {
          stackIn_3_0 = this.field_d[this.field_z];
        }
        var6 = stackIn_3_0;
        var2 = var6;
        ((ma) (this.field_j)).a(12804, false);
        if (0 == ec.field_t &&
          this.field_n > 0) {
          this.field_n = this.field_n - 1;
          this.field_e.a((byte) -87, this.field_n);
        }
        if (this.field_r &&
          this.field_n == 0 &&
          !var6.i(param0 ^ 121)) {
          this.field_r = false;
          this.field_e.b(param0 ^ -431);
          aa.field_f.g(64, 15514);
        }
        if (this.field_u &&
          this.field_x > 0) {
          this.field_x = this.field_x - 1;
        }
        var3 = param0;
        for (var4 = 0; this.field_d.length > var4; var4++) {
          this.field_d[var4].c(param0 ^ 0);
          if (this.field_d[var4].field_c) {
            var3 = var4;
          }
          if (this.field_a.field_a[var4].field_f > 0) {
            if (this.field_a.field_a[var4].field_f == 50) {
              this.field_d[var4].a(-20791, 50, true);
            }
            this.field_a.field_a[var4].field_f = 0;
          }
        }
        if (var3 != -1) {
          this.b(var3, (byte) -119);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (2 != oa.field_j) {
          throw new IllegalStateException();
        }
        int var5 = -122 % ((param3 + 11) / 49);
        if (!this.a(14098, param0)) {
          return;
        }
        if (this.field_d[param0].field_o) {
          this.field_d[param0].a(6364, param1, param2);
        }
    }

    private final void a(boolean param0) {
        this.field_a.a(false, nf.field_a);
        this.field_a.field_v[1] = fo.field_g;
        this.field_a.field_v[0] = sl.field_k;
        this.a(false, 250, false);
        if (!param0) {
          this.a(true, -55);
        }
    }

    final void e(int param0) {
        if (param0 != 6) {
          this.a((byte) 108);
        }
        if (!ag.field_p) {
          throw new IllegalStateException();
        }
        aa.field_f.g(60, 15514);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        boolean decompiledFrameRemainder0 = true;
        if (this.field_z != -2 && (this.field_z == param1 ||
          (1 << this.field_z & this.field_a.field_k) != 0)) {
          this.field_x = 1;
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_x = 50;
        }
        sl.field_k = param0;
        this.field_u = true;
        if (param3) {
          this.a(true);
        }
        fo.field_g = param2;
        nf.field_a = param1;
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 < 115) {
          field_q = 92;
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (param1 == 95) || (param1 == 45);
        return stackIn_9_0;
    }

    final void g(int param0) {
        if (!ag.field_p) {
          throw new IllegalStateException();
        }
        aa.field_f.g(61, 15514);
        if (param0 <= 2) {
          this.field_w = 3;
        }
    }

    final static fl a(byte param0, String param1) {
        RuntimeException var2 = null;
        fl stackIn_2_0 = null;
        fl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 118) {
            stackIn_4_0 = new fl(param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (fl) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ii.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, tf[] param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          if (param4 != null &&
            param0 > 0) {
            var5_int = param4[0].field_A;
            var6 = param4[2].field_A;
            var7 = param4[1].field_A;
            param4[0].b(param3, param1);
            param4[2].b(-var6 + param0 + param3, param1);
            t.a(wg.field_c);
            t.d(param3 + var5_int, param1, param0 + param3 - var6, param1 + param4[1].field_B);
            var8 = var5_int + param3;
            var9 = param3 + param0 - var6;
            param3 = var8;
            if (param2 != 19571) {
              field_i = 19;
            }
            while (var9 > param3) {
              param4[1].b(param3, param1);
              param3 = param3 + var7;
            }
            t.b(wg.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ii.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param1 &&
          this.field_u &&
          this.field_x == 0 &&
          !this.field_d[0].i(-121)) {
          this.a(true);
          return;
        }
        gb.field_f[0] = gb.field_f[0] + 1;
        if (param1) {
          this.i(114);
        }
        this.a((byte) 34, param1);
        if (oa.field_j == 0) {
          this.a((byte) 41);
        } else {
          if (oa.field_j != 1) {
            if (oa.field_j == 2) {
              this.d(-1);
            }
          } else {
            this.c(param0 + 228);
          }
        }
        if (this.a(14098, this.field_z) &&
          this.field_h &&
          0 == this.field_d[this.field_z].field_p) {
          this.field_h = false;
          this.a(82, (byte) 123);
        }
        rg.field_e.c(param0 + 109);
        ih.a(false);
        if (param0 != -110) {
          this.field_A = (pb) null;
        }
        wn.c(0);
        this.field_e.a(-82);
        this.field_A.d(param0 - 16778);
    }

    private final void j(int param0) {
        int var2 = this.field_a.field_v[0];
        if (null == wh.field_p &&
          var2 > 0 &&
          !this.field_l) {
          wh.field_p = new rh(0, 65535, ln.field_n, mj.field_j, ra.field_a, uh.field_r, new int[]{var2});
          if (!jg.a((byte) 120)) {
            md.a(wh.field_p, true, 3);
          }
        }
        if (param0 != 17945) {
          this.field_f = false;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5, byte[] param6) {
        try {
          if (this.field_z != param2) {
            this.field_d[param2].a(6364, 8, param3);
          } else {
            this.field_d[param2].a(0, 8);
          }
          ka.field_V = 15 & param0;
          ng.field_u = param1;
          bl.field_b = param0 >> 4;
          if (param4 <= 23) {
            this.c(44);
          }
          rd.field_l = param6;
          jk.field_c = param5;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ii.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        try {
          int var11 = 0;
          Exception exception = null;
          uh[] var3_ref_uh__ = null;
          int var4 = 0;
          uh var5_ref_uh = null;
          int var15 = 0;
          uh[] var16 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          long var3 = 0L;
          long var5_long = 0L;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          Class var8 = null;
          java.lang.reflect.Field[] var9 = null;
          java.lang.reflect.Field[] var10 = null;
          java.lang.reflect.Field var12 = null;
          Thread var13 = null;
          String var14 = null;
          Exception var14_ref = null;
          tc var17 = null;
          var15 = Pixelate.field_H ? 1 : 0;
          try {
            rg.field_e.a(false);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
            exception.printStackTrace();
          }
          if (fq.field_o != null &&
            jc.field_d) {
            pe.field_b.c();
            t.d();
            fq.field_o.a(false);
            qa.field_f.a(19692);
            pe.field_b.a(0, 0, hn.field_d);
          }
          if (pm.field_u) {
            return;
          }
          this.field_A.c((byte) 104);
          var16 = this.field_d;
          var3_ref_uh__ = var16;
          for (var4 = param1; var4 < var16.length; var4++) {
            var5_ref_uh = var16[var4];
            var5_ref_uh.b(-1);
          }
          if (oa.field_j == 0) {
            vi.f(91);
            this.field_j.c(param1 + 2);
            if (param0) {
              rm.a(0);
            }
            rg.field_e.a((byte) -119);
            if (null != fq.field_o) {
              fq.field_o.a((byte) -108);
            }
          } else {
            if (oa.field_j != 1) {
              if (oa.field_j == 2) {
                vi.f(68);
              }
            } else {
              un.field_j.f(param1 ^ 550);
            }
          }
          if (param0) {
            this.field_e.a((byte) 9);
          }
          if (oa.field_j == 2) {
            this.field_j.c(2);
          }
          if (pf.field_e &&
            cm.field_m) {
            rk.field_e.a(Integer.toString(kk.field_k), 30, 100, 1, -1);
          }
          if (ud.field_K) {
            var3 = Runtime.getRuntime().totalMemory();
            var5_long = Runtime.getRuntime().freeMemory();
            rk.field_e.c((var3 - var5_long) / 1024L + " kB / " + var3 / 1024L + " kB", 610, 100, 0, 0);
          }
          if (li.field_e) {
            var17 = qj.field_e;
            var4 = var17.field_z + var17.field_w;
            var5 = 30;
            var6 = var4 + 15;
            var7 = var5 + 110;
            var8 = this.field_a.getClass();
            var9 = var8.getFields();
            t.a(var5 - 5, -5 + var6 - var4, 70 + var7 - var5, var4 * var9.length, 0, 190);
            var10 = var9;
            for (var11 = 0; var11 < var10.length; var11++) {
              var12 = var10[var11];
              if (!var12.getType().isArray()) {
                var13 = Thread.currentThread();
                var13.setName(var12.getName());
                var17.c(var13.getName(), var7, var6, 16777215, 0);
                try {
                  var13.setName(var12.get(this.field_a).toString());
                  var14 = var13.getName();
                  if (var14 != null) {
                    var17.a(var14, var7 + 15, var6, 16777215, 0);
                    decompiledRegionSelector0 = 1;
                  } else {
                    var6 = var6 + var4;
                    decompiledRegionSelector0 = 0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var14_ref = (Exception) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                }
                if (decompiledRegionSelector0 != 0) {
                  var6 = var6 + var4;
                }
              }
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_14_1 = 0;
        if (param0 != 34) {
          this.field_x = 112;
        }
        if (this.a(14098, this.field_z)) {
          if (!this.field_d[this.field_z].field_l) {
            if (param1) {
              stackIn_11_0 = (bc.field_m[83]) ? 1 : 0;
            } else {
              stackIn_11_0 = 0;
            }
          } else {
            stackIn_11_0 = 0;
          }
          var3 = stackIn_11_0;
          stackIn_13_0 = this.field_a.field_a[this.field_z].field_p;
          if (var3 != 0) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          if ((stackIn_13_0 ? 1 : 0) == stackIn_14_1) {
            if (var3 != 0) {
              this.field_d[this.field_z].a(param0 ^ 34, 6);
              if (ag.field_p) {
                ae.a(6, -18656, this.field_d[this.field_z].a(-119));
              }
            } else {
              this.field_d[this.field_z].a(param0 - 34, 7);
              if (ag.field_p) {
                ae.a(7, -18656, this.field_d[this.field_z].a(-84));
              }
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        if (param1 >= 32 &&
          param1 <= 126) {
          return true;
        }
        if (param1 >= 160 &&
          param1 <= 255) {
          return true;
        }
        if (8364 != param1 &&
          param1 != 338 &&
          param1 != 8212 &&
          339 != param1 &&
          376 != param1) {
          if (param0 == 1) {
            return false;
          }
          field_t = -29;
          return false;
        }
        return true;
    }

    final void a(int param0, byte param1) {
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_57_0 = false;
        int stackIn_96_0 = 0;
        int var3;
        uh[] var4_ref_uh__;
        int var4;
        int var5;
        uh var6;
        int var7;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var7 = Pixelate.field_H ? 1 : 0;
        var3 = 100 / ((param1 - 25) / 58);
        if (param0 == 13) {
          var4 = 1;
          if (ag.field_p) {
            if (this.field_z >= 0) {
              if (this.field_a.field_t) {
                return;
              }
              var4 = 2;
            } else {
              var4 = 4;
            }
          }
          var5 = var4;
          stackIn_10_0 = (!gq.d(83)) ? 0 : 12;
          la.a(stackIn_10_0, var5, false, -25528);
          return;
        }
        if (pf.field_e) {
          if (param0 != 85) {
            if (1 != param0) {
              if (param0 != 2) {
                if (param0 == 3) {
                  wh.e(61, 2);
                } else {
                  if (param0 == 4) {
                    wh.e(-41, 3);
                  } else {
                    if (param0 == 5) {
                      wh.e(60, 4);
                    } else {
                      if (param0 == 6) {
                        wh.e(-111, 5);
                      } else {
                        if (param0 == 7) {
                          wh.e(123, 6);
                        } else {
                          if (param0 != 8) {
                            if (9 == param0) {
                              stackIn_57_0 = !(li.field_e);
                              li.field_e = stackIn_57_0;
                            } else {
                              if (11 != param0) {
                                if (12 == param0) {
                                  stackIn_53_0 = !(jc.field_d);
                                  jc.field_d = stackIn_53_0;
                                } else {
                                  if (param0 == 102) {
                                    if (bc.field_m[81] &&
                                      oa.field_j == 0) {
                                      this.h(125);
                                      this.a(-59);
                                    } else {
                                      if (!bc.field_m[81]) {
                                        var4_ref_uh__ = this.field_d;
                                        for (var5Lifetime1 = 0; var5Lifetime1 < var4_ref_uh__.length; var5Lifetime1++) {
                                          var6 = var4_ref_uh__[var5Lifetime1];
                                          var6.d(93);
                                        }
                                        this.field_a.field_d.a((byte) -125);
                                        if (this.field_a.field_d.field_l.length == this.field_a.field_d.field_d) {
                                          this.h(80);
                                          this.a(-105);
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackIn_38_0 = !(gf.field_b);
                                gf.field_b = stackIn_38_0;
                              }
                            }
                          } else {
                            wh.e(51, 7);
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                wh.e(104, 1);
              }
            } else {
              wh.e(-42, 0);
            }
          } else {
            if (bc.field_m[81]) {
              stackIn_21_0 = !(ud.field_K);
              ud.field_K = stackIn_21_0;
            } else {
              stackIn_17_0 = !(cm.field_m);
              cm.field_m = stackIn_17_0;
            }
          }
        }
        if (this.a(14098, this.field_z)) {
          var4Lifetime1 = -1;
          if (82 == param0 ||
            ap.field_e == param0) {
            var4Lifetime1 = 4;
          }
          if (param0 == 98 ||
            param0 == el.field_a) {
            var4Lifetime1 = 0;
          }
          if (param0 == 99 ||
            param0 == ae.field_d) {
            var4Lifetime1 = 1;
          }
          if (param0 == 96 ||
            cg.field_F == param0) {
            var4Lifetime1 = 2;
          }
          if (97 == param0 ||
            hg.field_g == param0) {
            var4Lifetime1 = 3;
          }
          if (84 == param0) {
            if (this.field_a.field_r == 0 &&
              0 == oa.field_j) {
              this.h(65);
              this.a(-40);
              this.field_a.field_f = 0;
              this.field_a.field_b = false;
              this.field_a.field_o = 0;
            }
            jd.a(0);
          }
          if (var4Lifetime1 != -1 &&
            !this.field_d[this.field_z].field_l) {
            stackIn_96_0 = (!this.field_d[this.field_z].a(0, var4Lifetime1)) ? 0 : 1;
            var5Lifetime2 = stackIn_96_0;
            if (ag.field_p &&
              var5Lifetime2 != 0) {
              ae.a(var4Lifetime1, -18656, this.field_d[this.field_z].a(-110));
            }
            if (var4Lifetime1 == 4 &&
              var5Lifetime2 == 0 &&
              this.field_d[this.field_z].field_p > 0) {
              this.field_h = true;
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param0 != 14098) {
          return false;
        }
        stackIn_7_0 = (param1 == 0) || (1 == param1);
        return stackIn_7_0;
    }

    private final void c(int param0) {
        uh var3 = this.field_d[this.field_z];
        var3.c(-1);
        if (param0 <= 101) {
          this.field_o = -75;
        }
        un.field_j.d(27420);
        if (!un.field_j.field_f &&
          var3.field_l) {
          if (!this.field_l) {
            un.field_j.e(20604);
          }
          var3.d(93);
          this.field_a.field_a[this.field_z].a(-121);
          un.field_j.field_f = true;
          if ((33554431L & jo.field_h) == 33554431L) {
            this.a(14, (byte) 58, 241);
          }
          if ((jo.field_h & 1125899906842623L) == 1125899906842623L) {
            this.a(15, (byte) 58, 240);
          }
        }
        if ((un.field_j.field_f || un.field_j.field_h) &&
          !var3.i(-124)) {
          gb.field_f[1] = this.field_a.field_a[0].field_d;
          this.a(false, 250, false);
        }
    }

    private final void i(int param0) {
        ra.field_a = ra.field_a + 7;
        ap.field_f = ap.field_f + sb.field_a;
        ln.field_n = ln.field_n + 7;
        lo.field_Mb = lo.field_Mb + 1;
        if (param0 <= 93) {
          this.c(-83);
        }
        if (this.field_j instanceof ul) {
          if (pf.field_e &&
            bc.field_m[88]) {
            ((ul) (this.field_j)).b(-123, true);
          }
          if (pf.field_e &&
            bc.field_m[87]) {
            ((ul) (this.field_j)).b(-108, false);
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, String param4) {
        try {
          kf.field_q = param2;
          int var5_int = 55 / ((2 - param3) / 55);
          ch.a(param0, param4, 5, param1, ab.field_c, 320, rk.field_e.field_w, 10, bi.field_g, true, rk.field_e, rk.field_e.field_z + rk.field_e.field_w, (byte) 27, 15, 240);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ii.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int c(int param0, byte param1) {
        if (param1 != -120) {
          field_b = (String) null;
        }
        return ok.a(tp.field_v, -100, param0);
    }

    ii() {
        this((String[]) null, 0, false, ok.a(ea.field_b, -115, 2147483647), 0, 0, 0);
    }

    final void a(int param0) {
        uh[] var2;
        int var3;
        uh var4;
        int var5;
        uh[] var6;
        int var7;
        int var3Lifetime1;
        uh[] var2Lifetime1;
        uh var4Lifetime1;
        var5 = Pixelate.field_H ? 1 : 0;
        if (ag.field_p) {
          var6 = this.field_d;
          var2 = var6;
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (!var4.field_l) {
              var4.a(false);
            }
          }
          this.d(-1);
        }
        this.field_a.d(0);
        var2Lifetime1 = this.field_d;
        var7 = 0;
        var3Lifetime1 = var7;
        while (var2Lifetime1.length > var7) {
          var4Lifetime1 = var2Lifetime1[var7];
          var4Lifetime1.j(-125);
          var7++;
        }
        if (param0 > -1) {
          this.h(-56);
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_y = null;
        field_c = null;
        field_p = null;
        field_b = null;
        field_v = null;
        if (param0 >= -93) {
          field_t = -60;
        }
        field_B = null;
    }

    private final void b(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        uh[] stackIn_15_0;
        int stackIn_15_1;
        uh stackIn_15_2;
        uh stackIn_15_3;
        pm stackIn_15_4;
        int stackIn_15_5;
        uh stackIn_16_2 = null;
        uh stackIn_16_3 = null;
        boolean stackIn_16_6 = false;
        uh[] stackIn_18_0;
        int stackIn_18_1;
        uh stackIn_18_2;
        uh stackIn_18_3;
        pm stackIn_18_4;
        int stackIn_18_5;
        uh stackIn_19_2 = null;
        uh stackIn_19_3 = null;
        boolean stackIn_19_6 = false;
        Object stackIn_21_0;
        nn stackIn_21_1;
        nn stackIn_21_2;
        pm stackIn_21_3;
        int[] stackIn_21_4;
        int[] stackIn_21_5;
        Object stackIn_22_0;
        nn stackIn_22_1;
        nn stackIn_22_2;
        boolean stackIn_22_6;
        int var2;
        int var3;
        int var4;
        if (param0 <= 110) {
          field_t = 63;
        }
        if (ag.field_p) {
          this.field_d = new uh[2];
          stackIn_7_0 = (this.field_z == 1) ? 500 : 140;
          var2 = stackIn_7_0;
          stackIn_10_0 = (this.field_z != 1) ? 500 : 140;
          var3 = stackIn_10_0;
          stackIn_13_0 = (oa.field_i) ? 100 : 0;
          var4 = stackIn_13_0;
          stackIn_15_0 = this.field_d;
          stackIn_15_1 = 0;
          stackIn_15_2 = null;
          stackIn_15_3 = null;
          stackIn_15_4 = this.field_a;
          stackIn_15_5 = 0;
          if (this.field_z == 0) {
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_6 = false;
          } else {
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_6 = true;
          }
          stackIn_15_0[stackIn_15_1] = new uh(stackIn_15_4, stackIn_15_5, stackIn_16_6, this.field_a.field_d, var2, -var4 + 235);
          stackIn_18_0 = this.field_d;
          stackIn_18_1 = 1;
          stackIn_18_2 = null;
          stackIn_18_3 = null;
          stackIn_18_4 = this.field_a;
          stackIn_18_5 = 1;
          if (1 == this.field_z) {
            stackIn_19_2 = null;
            stackIn_19_3 = null;
            stackIn_19_6 = false;
          } else {
            stackIn_19_2 = null;
            stackIn_19_3 = null;
            stackIn_19_6 = true;
          }
          stackIn_18_0[stackIn_18_1] = new uh(stackIn_18_4, stackIn_18_5, stackIn_19_6, this.field_a.field_d, var3, -var4 + 235);
          this.field_A = new pb(this.field_a.field_d, 320, -(var4 >> 1) + 200);
          stackIn_21_0 = this;
          stackIn_21_1 = null;
          stackIn_21_2 = null;
          stackIn_21_3 = this.field_a;
          stackIn_21_4 = new int[]{var2, var3};
          stackIn_21_5 = new int[]{235, 235};
          if (this.field_z != 1) {
            stackIn_22_0 = this;
            stackIn_22_1 = null;
            stackIn_22_2 = null;
            stackIn_22_6 = false;
          } else {
            stackIn_22_0 = this;
            stackIn_22_1 = null;
            stackIn_22_2 = null;
            stackIn_22_6 = true;
          }
          this.field_e = new nn(stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_22_6);
        } else {
          this.field_d = new uh[1];
          this.field_d[0] = new uh(this.field_a, 0, false, this.field_a.field_d, 384, 256);
          this.field_A = new pb(this.field_a.field_d, 110, 240);
          this.field_e = new nn(this.field_a, new int[]{384}, new int[]{256}, false);
        }
        if (this.field_j != null) {
          this.field_j.a(this.field_a.field_d.field_j, -74);
        }
    }

    final void a(byte param0, we param1) {
        try {
          if (param0 != 20) {
            this.field_d = (uh[]) null;
          }
          this.field_a.a(param1, (byte) 123);
          this.b(param0 ^ 102);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ii.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(int param0) {
        uh var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        uh[] var7 = this.field_d;
        uh[] var2 = var7;
        int var3 = 0;
        int var4 = 73 % ((param0 + 2) / 36);
        while (var7.length > var3) {
          var5 = var7[var3];
          var5.j(-125);
          var5.h(9236);
          var3++;
        }
    }

    private final void a(byte param0) {
        uh var2;
        hd var3;
        ul var4;
        int var5;
        int var6;
        String var7;
        uh var8;
        int var5Lifetime1;
        sb.field_a = sb.field_a - 1;
        f.field_o = f.field_o - lo.field_Mb;
        mj.field_j = mj.field_j + 1;
        uh.field_r = uh.field_r + this.field_a.field_v[0];
        var8 = this.field_d[this.field_z];
        var2 = var8;
        var3 = this.field_a.field_a[this.field_z];
        var4 = (ul) (this.field_j);
        var8.c(param0 - 42);
        if (!(0 >= this.field_a.field_r) ||
          this.field_a.field_d.field_d == 4) {
          var4.a(param0 - 77, var8.i(-122));
        }
        wb.b(5);
        if (null != aa.field_p &&
          aa.field_p.field_n &&
          aa.field_p.field_r != null) {
          this.field_e.field_f = di.a(false, aa.field_p.field_l[1][0]);
          aa.field_p = null;
        }
        if (var4.a(false)) {
          gb.field_f[1] = gb.field_f[1] + this.field_a.field_a[0].field_d;
          this.a(false, param0 + 209, false);
          return;
        }
        if (!var3.field_p &&
          this.field_w > 0 &&
          this.field_a.field_r > 0) {
          this.field_w = this.field_w - 1;
        }
        if (param0 != 41) {
          var7 = (String) null;
          ii.a((byte) 95, (String) null);
        }
        if (this.field_a.field_r > 0) {
          if (this.field_a.field_o == this.field_a.field_d.field_g) {
            this.a(18, (byte) 58, 237);
          }
          if (this.field_a.field_b &&
            !var8.field_l) {
            this.a(19, (byte) 58, 236);
          }
          if (100 <= this.field_a.field_f) {
            this.a(21, (byte) 58, 234);
          }
        }
        if (var3.field_f > 0 &&
          this.field_a.field_r > 0) {
          if (50 == var3.field_f) {
            var8.a(-20791, var3.field_f, true);
            gb.field_f[2] = gb.field_f[2] + 1;
            kl.a((byte) -117);
          }
          var5 = var3.field_f;
          f.field_o = f.field_o + (var5 << 7);
          ln.field_n = ln.field_n + var5 * mj.field_j;
          if (this.field_a.field_v[0] >= 10000) {
            this.a(0, (byte) 58, 255);
          }
          if (this.field_a.field_v[0] >= 50000) {
            this.a(1, (byte) 58, 254);
          }
          if (this.field_a.field_v[0] >= 100000) {
            this.a(2, (byte) 58, 253);
          }
          if (this.field_a.field_v[0] >= 250000) {
            this.a(3, (byte) 58, 252);
          }
        }
        var3.field_f = 0;
        if (var8.field_l) {
          var5Lifetime1 = this.field_a.field_d.field_e;
          if (0 < this.field_a.field_r) {
            var6 = var5Lifetime1;
            this.field_a.field_v[0] = this.field_a.field_v[0] + var6;
            ra.field_a = ra.field_a - mj.field_j * var6;
            ap.field_f = ap.field_f + (var6 << 7);
            if (this.field_a.field_v[0] >= 10000) {
              this.a(0, (byte) 58, 255);
            }
            if (this.field_a.field_v[0] >= 50000) {
              this.a(1, (byte) 58, 254);
            }
            if (this.field_a.field_v[0] >= 100000) {
              this.a(2, (byte) 58, 253);
            }
            if (250000 <= this.field_a.field_v[0]) {
              this.a(3, (byte) 58, 252);
            }
            var8.a(-20791, var5Lifetime1, false);
          }
          if (var4.a(this.field_a.field_d.field_b, (byte) 73) &&
            this.field_a.field_r > 10) {
            this.a(7, (byte) 58, 248);
          }
          gb.field_f[3] = gb.field_f[3] + 1;
          var8.d(93);
          var2.field_l = false;
          this.field_m = true;
          this.field_a.field_b = false;
          this.field_a.field_f = 0;
          this.field_a.field_o = 0;
          if (!var3.field_x &&
            this.field_a.field_r > 0) {
            this.a(20, (byte) 58, 235);
          }
          if (this.field_a.field_r > 10) {
            if (!var3.field_m &&
              !this.field_a.field_d.field_i) {
              this.a(8, (byte) 58, 247);
            }
            if (!var3.field_k) {
              this.a(9, (byte) 58, 246);
            }
            if (!var3.field_k &&
              !var3.field_m &&
              !this.field_a.field_d.field_i) {
              this.a(10, (byte) 58, 245);
            }
          }
          this.field_s = this.field_s | var3.field_m;
        }
        if (this.field_m &&
          var8.g(param0 ^ -42)) {
          if (this.field_a.c(0)) {
            gb.field_f[1] = gb.field_f[1] + this.field_a.field_a[0].field_d;
            this.h(125);
          }
          this.a(param0 - 56);
          this.field_m = false;
        } else {
          if (this.field_f &&
            this.field_A.a((byte) 85)) {
            this.field_f = false;
            this.field_A = new pb(this.field_a.field_d, 110, 240);
          }
        }

    }

    ii(String[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String[] array$0 = null;
        boolean stackIn_4_0 = false;
        String[] stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        String stackIn_8_3;
        boolean stackIn_12_0 = false;
        Object stackIn_20_0;
        ma stackIn_20_1;
        ma stackIn_20_2;
        int[] stackIn_20_3;
        ma stackIn_21_1 = null;
        ma stackIn_21_2 = null;
        boolean stackIn_21_4 = false;
        Object stackIn_23_0;
        int stackIn_24_5 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        ma stackIn_21_1Lifetime1;
        ma stackIn_21_2Lifetime1;
        this.field_h = false;
        this.field_m = false;
        this.field_f = false;
        this.field_s = false;
        this.field_w = 50;
        this.field_u = false;
        this.field_l = false;
        this.field_g = false;
        this.field_r = true;
        try {
          ap.field_f = 770566011;
          sb.field_a = 22178;
          stackIn_4_0 = (oa.field_j == 2);
          ag.field_p = stackIn_4_0;
          go.field_k = 0;
          f.field_o = 2359467;
          ln.field_n = 1426010794;
          ra.field_a = 1947508858;
          this.field_z = param1;
          lo.field_Mb = 34851;
          if (param0 == null) {
            array$0 = new String[1];
            stackIn_7_0 = array$0;
            stackIn_7_1 = array$0;
            stackIn_7_2 = 0;
            if (null == kn.field_J) {
              stackIn_8_3 = ng.field_t;
            } else {
              stackIn_8_3 = kn.field_J;
            }
            stackIn_7_1[stackIn_7_2] = stackIn_8_3;
            param0 = stackIn_7_0;
          }
          stackIn_12_0 = !(wo.field_h < 2);
          pf.field_e = stackIn_12_0;
          mj.field_j = 13483;
          uh.field_r = 16042;
          ng.i(0);
          gb.field_f = new int[4];
          le.a(true);
          if (oa.field_j != 0) {
            if (oa.field_j == 1) {
              this.field_a = new pm(param0, 0, oa.field_j, param3, 0, un.field_j.field_a);
              aq.a(this.field_a.field_g, false);
              this.b(127);
              this.a(-100);
            } else {
              if (oa.field_j == 2) {
                this.field_a = new pm(param0, param4, oa.field_j, param3, param5, param6);
                aq.a(this.field_a.field_g, false);
                stackIn_20_0 = this;
                stackIn_20_1 = null;
                stackIn_20_2 = null;
                stackIn_20_3 = this.field_a.field_v;
                if (this.field_z != 1) {
                  stackIn_21_1 = null;
                  stackIn_21_2 = null;
                  stackIn_21_4 = false;
                } else {
                  stackIn_21_1 = null;
                  stackIn_21_2 = null;
                  stackIn_21_4 = true;
                }
                stackIn_23_0 = this;
                if (!oa.field_i) {
                  stackIn_21_1Lifetime1 = null;
                  stackIn_21_2Lifetime1 = null;
                  stackIn_24_5 = 0;
                } else {
                  stackIn_21_1Lifetime1 = null;
                  stackIn_21_2Lifetime1 = null;
                  stackIn_24_5 = 120;
                }
                this.field_j = (bg) ((Object) new ma(stackIn_20_3, stackIn_21_4, stackIn_24_5));
                this.b(122);
                this.field_r = true;
                if (this.field_z != -2) {
                  stackIn_27_1 = 149;
                } else {
                  stackIn_27_1 = 0;
                }
                this.field_n = stackIn_27_1;
              }
            }
          } else {
            aq.a(true);
            this.field_j = (bg) ((Object) new ul(90));
            if (!jg.a((byte) 95)) {
              aa.field_p = g.a(3, (byte) -97, 1, 10, 0);
            }
            this.field_a = new pm(param0, 0, oa.field_j, param3, 0, 0);
            kk.a(1, this.field_a);
            this.b(119);
            this.a(-70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_32_0 = var8;
          stackIn_32_1 = new StringBuilder().append("ii.<init>(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_v = "Go Back";
        field_q = -1;
        field_k = "Names cannot start or end with space or underscore";
        field_b = "Options";
        field_c = "Match by...";
    }
}
