/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fj extends rk {
    int field_q;
    fe field_n;
    String field_C;
    static mi field_u;
    static String[] field_s;
    static ci field_x;
    int field_z;
    int field_y;
    sc field_p;
    int field_m;
    boolean field_w;
    int field_o;
    uk field_t;
    static int[] field_E;
    static String field_r;
    int field_F;
    String field_B;
    int field_v;
    static String field_A;
    static String field_D;
    static bi field_G;

    void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        try {
          this.field_o = 0;
          if (param0 > -18) {
            this.a(-49, 87, 70, 119, -98);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fj.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int[] a(int param0, byte param1, int param2) {
        if (param1 <= 118) {
          field_s = (String[]) null;
        }
        int var3 = vh.a(21872, param0);
        int var4 = si.a(param0, -127);
        int var5 = vh.a(21872, param2);
        int var6 = si.a(param2, -128);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void d(int param0) {
        if (param0 != 60) {
          return;
        }
        this.a(-125, this.field_F, this.field_m, this.field_z, this.field_q);
    }

    public static void e(int param0) {
        field_s = null;
        field_r = null;
        if (param0 != 296) {
          field_E = (int[]) null;
        }
        field_x = null;
        field_E = null;
        field_A = null;
        field_u = null;
        field_G = null;
        field_D = null;
    }

    void a(fj param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(ld.field_l, (byte) 125, param2, jh.field_R, param3) ? 1 : 0;
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (this.field_w) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_10_1 = (var5_int != 0);
            this.field_w = stackIn_10_1;
            if (null != this.field_t &&
              this.field_t instanceof td) {
              ((td) (this.field_t)).a(var5_int != 0, this, -10);
            }
          }
          if (param1 != 11579568) {
            this.f((byte) -73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("fj.V(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -109) {
          field_s = (String[]) null;
        }
        this.field_z = param3;
        this.field_m = param2;
        this.field_q = param4;
        this.field_F = param1;
    }

    final static void a(int param0, int param1) {
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        var7 = Confined.field_J ? 1 : 0;
        try {
          incrementValue$13 = param0;
          param0--;
          if (incrementValue$13 == 0) {
            ta.a(113, 76, qe.field_J, 172, si.field_a);
            ta.a(116, 118, ui.field_a, 124, ic.field_d);
            ta.a(120, 142, ui.field_a, 124, s.field_L);
            ta.a(108, 166, ui.field_a, 124, qn.field_x);
            ta.a(96, 190, ui.field_a, 124, cf.field_db);
            ta.a(99, 130, ui.field_a, 148, ek.field_k);
            ta.a(100, 154, ui.field_a, 148, kc.field_r);
            ta.a(116, 178, ui.field_a, 148, r.field_b);
            ta.a(114, 202, ui.field_a, 148, rb.field_g);
            ta.a(115, 400, qe.field_J, 172, si.field_a);
            lf.field_j.d(448, 148);
            var2_int = pn.field_a.c(fh.field_e);
            var3 = (-var2_int + 578) / 2;
            pn.field_a.c(fh.field_e, var3, 76, 16777215, -1);
            tj.a(2652240, 70, (byte) 58, 94, -8 + var3, 70);
            tj.a(2652240, 70, (byte) 126, 94, 94, 166);
            tj.a(2652240, 70, (byte) 23, 484, var3 - (-var2_int - 8), 70);
            tj.a(2652240, 70, (byte) 53, 484, 484, 142);
            tj.a(7370619, 120, (byte) 52, 166, 166, 104);
            tj.a(7370619, 104, (byte) 36, 180, 166, 104);
            pn.field_a.c(da.field_a, 188, 110, 9805732, -1);
            pn.field_a.c(ci.field_d, 220, 142, 9805732, -1);
            pn.field_a.c(lf.field_h, 232, 166, 9805732, -1);
            var4 = pn.field_a.c(pn.field_b);
            var5 = (512 - var4) / 2;
            pn.field_a.c(pn.field_b, var5, 220, 16777215, -1);
            tj.a(2652240, 206, (byte) 88, 94, 94, 288);
            tj.a(2652240, 214, (byte) 19, -8 + var5, 94, 214);
            tj.a(2652240, 214, (byte) 122, 418, var5 - (-var4 - 8), 214);
            tj.a(2652240, 214, (byte) 107, 418, 418, 206);
            pn.field_a.c(pf.field_i, 84, 306, 4243584, -1);
            var6 = 234;
            tj.a(2652240, 188, (byte) 54, 556, 526, 188);
            tj.a(2652240, 188, (byte) 49, 556, 556, 260);
            tj.a(2652240, 260, (byte) 81, 548, 556, 260);
            pn.field_a.a(ba.field_T, 540, 12 + var6, 4243584, -1);
            var6 += 20;
            pn.field_a.a(ue.field_s, 540, 12 + var6, 4243584, -1);
            var6 += 20;
            pn.field_a.a(q.field_k, 540, var6 + 12, 4243584, -1);
            var6 += 20;
          }
          incrementValue$14 = param0;
          param0--;
          if (incrementValue$14 == 0) {
            fa.field_U.d(90, 160);
            ta.a(121, 204, qe.field_J, 222, si.field_a);
            ta.a(103, 246, ui.field_a, 174, ic.field_d);
            ta.a(120, 270, ui.field_a, 174, s.field_L);
            ta.a(120, 294, ui.field_a, 174, qn.field_x);
            ta.a(102, 318, ui.field_a, 174, cf.field_db);
            ta.a(106, 258, ui.field_a, 198, ek.field_k);
            ta.a(98, 282, ui.field_a, 198, kc.field_r);
            ta.a(117, 306, ui.field_a, 198, r.field_b);
            ta.a(100, 330, ui.field_a, 198, rb.field_g);
            ta.a(106, 528, qe.field_J, 222, si.field_a);
            tj.a(7370619, 170, (byte) 55, 294, 294, 154);
            tj.a(7370619, 154, (byte) 49, 308, 294, 154);
            pn.field_a.c(ol.field_b, 316, 160, 9805732, -1);
            pn.field_a.c(ci.field_d, 348, 192, 9805732, -1);
            pn.field_a.c(lf.field_h, 360, 216, 9805732, -1);
            pn.field_a.a(eg.field_m, 92, 60, 472, 100, 4243584, -1, 0, 0, 20);
            tj.a(2652240, 70, (byte) 34, 76, 84, 70);
            tj.a(2652240, 70, (byte) 81, 76, 76, 234);
            tj.a(2652240, 234, (byte) 31, 84, 76, 234);
            pn.field_a.c(qj.field_a, 121, 126, 4243584, -1);
            tj.a(2652240, 120, (byte) 31, 105, 113, 120);
            tj.a(2652240, 120, (byte) 97, 105, 105, 158);
            tj.a(2652240, 144, (byte) 99, 170, 105, 144);
            tj.a(2652240, 144, (byte) 110, 135, 135, 158);
            tj.a(2652240, 144, (byte) 115, 170, 170, 264);
            tj.a(2652240, 256, (byte) 33, 222, 222, 264);
            var2_intLifetime1 = pn.field_a.c(u.field_U);
            var3Lifetime1 = (768 - var2_intLifetime1) / 2;
            tj.a(2652240, 264, (byte) 14, var3Lifetime1 - 8, 170, 264);
            pn.field_a.c(u.field_U, var3Lifetime1, 270, 4243584, -1);
            tj.a(2652240, 264, (byte) 34, 546, var2_intLifetime1 + (var3Lifetime1 + 8), 264);
            tj.a(2652240, 264, (byte) 37, 546, 546, 256);
            pn.field_a.c(sg.field_u, 76, 308, 4243584, -1);
          }
          incrementValue$15 = param0;
          param0--;
          if (0 == incrementValue$15) {
            fn.h(84, 88, 204, 114);
            lm.field_c.d(-76, 88);
            fn.h(78, 114, 210, 166);
            lm.field_c.d(-76, 88);
            fn.h(80, 166, 202, 192);
            lm.field_c.d(-76, 88);
            fn.c();
            var2_intLifetime2 = 0;
            while (true) {
              if (var2_intLifetime2 < 3) {
                dn.field_c[var2_intLifetime2].c(var2_intLifetime2 * 32 + 100, 96);
                var2_intLifetime2++;
                if (var7 == 0) {
                  continue;
                }
              } else {
                tj.a(1088164, 104, (byte) 89, 112, 112, 70);
                tj.a(1088164, 70, (byte) 50, 212, 112, 70);
                pn.field_a.a(hm.field_ib, 220, 60, 340, 40, 4243584, -1, 0, 0, 20);
                tj.a(10110754, 120, (byte) 110, 232, 176, 120);
                pn.field_a.a(oj.field_z, 240, 110, 320, 40, 4243584, -1, 0, 0, 20);
                tj.a(11038741, 136, (byte) 107, 144, 144, 204);
                tj.a(11038741, 204, (byte) 52, 212, 144, 204);
                tj.a(11038741, 204, (byte) 87, 212, 212, 170);
                tj.a(11038741, 170, (byte) 104, 218, 212, 170);
                pn.field_a.a(rj.field_d, 226, 160, 334, 60, 4243584, -1, 0, 0, 20);
                fn.h(90, 0, 640, 254);
                lm.field_c.d(-470, 224);
                fn.h(110, 254, 640, 288);
                lm.field_c.d(-470, 224);
                fn.h(118, 288, 640, 307);
                lm.field_c.d(-470, 224);
                fn.c();
                ol.a(122, 30613, 2, 9, 232);
                pn.field_a.a(ug.field_Z, 178, 230, 252, 60, 4243584, -1, 0, 0, 20);
                pn.field_a.a(b.field_j, 466, 296, 4243584, -1);
              }
              break;
            }
            kc.a(false, 265, 17, 470);
          }
          incrementValue$16 = param0;
          param0--;
          if (incrementValue$16 == 0) {
            kc.a(false, 64, 0, 76);
            kc.a(false, 129, 1, 96);
            kc.a(false, 194, 14, 76);
            kc.a(false, 259, 10, 96);
            pn.field_a.a(wm.field_fb, 132, 58, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(a.field_a, 152, 123, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(mb.field_H, 132, 188, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(b.a(new String[]{ic.field_d}, uh.field_d, 1177), 152, 253, 412, 60, 4243584, -1, 3, 1, 20);
          }
          incrementValue$17 = param0;
          param0--;
          if (incrementValue$17 == 0 &&
            !ll.a(0, 1)) {
            kc.a(false, 64, 3, 96);
            kc.a(false, 129, 11, 76);
            kc.a(false, 194, 6, 96);
            kc.a(false, 259, 13, 76);
            pn.field_a.a(b.a(new String[]{ek.field_k}, rf.field_b, 1177), 152, 58, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(b.a(new String[]{s.field_L}, ee.field_J, 1177), 132, 123, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(nd.field_u, 152, 188, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(b.a(new String[]{cf.field_db}, kn.field_a, 1177), 132, 253, 412, 60, 4243584, -1, 3, 1, 20);
          }
          if (param1 > -120) {
            return;
          }
          incrementValue$18 = param0;
          param0--;
          if (0 == incrementValue$18 &&
            !ll.a(1, 1)) {
            kc.a(false, 64, 12, 76);
            kc.a(false, 129, 5, 96);
            kc.a(false, 194, 17, 76);
            lb.a(259, 100, 128, 96, 0.2, ri.field_c);
            pn.field_a.a(b.a(new String[]{qn.field_x}, mm.field_fb, 1177), 132, 58, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(b.a(new String[]{kc.field_r}, pk.field_f, 1177), 152, 123, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(rd.field_Ib, 132, 188, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(di.field_b, 152, 253, 412, 60, 4243584, -1, 3, 1, 20);
          }
          incrementValue$19 = param0;
          param0--;
          if (incrementValue$19 == 0 &&
            !ll.a(2, 1)) {
            kc.a(false, 64, 2, 96);
            kc.a(false, 129, 8, 76);
            kc.a(false, 194, 16, 96);
            lb.a(259, 42, 128, 76, 0.2, sm.field_A);
            pn.field_a.a(b.a(new String[]{r.field_b}, qm.field_A, 1177), 152, 58, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(kd.field_q, 132, 123, 412, 40, 4243584, -1, 3, 1, 20);
            pn.field_a.a(bf.field_S, 152, 168, 412, 80, 4243584, -1, 3, 1, 20);
            pn.field_a.a(te.field_g, 132, 253, 412, 60, 4243584, -1, 3, 1, 20);
          }
          incrementValue$20 = param0;
          param0--;
          if (0 == incrementValue$20 &&
            !ll.a(3, 1)) {
            kc.a(false, 64, 4, 76);
            kc.a(false, 129, 9, 96);
            kc.a(false, 194, 15, 76);
            kc.a(false, 259, 7, 96);
            pn.field_a.a(b.a(new String[]{rb.field_g}, on.field_b, 1177), 132, 58, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(di.field_e, 152, 123, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(field_D, 132, 188, 412, 60, 4243584, -1, 3, 1, 20);
            pn.field_a.a(vj.field_b, 152, 253, 412, 60, 4243584, -1, 3, 1, 20);
          }
          incrementValue$21 = param0;
          param0--;
          if (incrementValue$21 == 0 &&
            !ll.a(6, 1)) {
            var2_intLifetime3 = 64;
            pn.field_a.a(ve.field_c, 76, 56, 130, 100, 9805732, -1, 2, 1, 18);
            tj.a(7370619, 106, (byte) 53, 227, 214, 106);
            tj.a(7370619, 65, (byte) 18, 227, 227, 147);
            tj.a(7370619, 65, (byte) 35, 240, 227, 65);
            tj.a(7370619, 147, (byte) 83, 240, 227, 147);
            pn.field_a.a(tj.field_F + ": ", 400, var2_intLifetime3 + 12, 16777215, -1);
            pn.field_a.c("10000, 20000, 30000, ...", 400, var2_intLifetime3 + 12, 4243584, -1);
            var2_intLifetime3 += 18;
            pn.field_a.a(wd.field_e + ": ", 400, 12 + var2_intLifetime3, 16777215, -1);
            pn.field_a.c("20000, 40000, 60000, ...", 400, var2_intLifetime3 + 12, 4243584, -1);
            var2_intLifetime3 += 18;
            pn.field_a.a(na.field_Q + ": ", 400, var2_intLifetime3 + 12, 16777215, -1);
            pn.field_a.c("25000, 45000, 65000, ...", 400, var2_intLifetime3 + 12, 4243584, -1);
            var2_intLifetime3 += 18;
            pn.field_a.a(km.field_a + ": ", 400, var2_intLifetime3 + 12, 16777215, -1);
            pn.field_a.c("35000, 75000, 115000, ...", 400, var2_intLifetime3 + 12, 4243584, -1);
            var2_intLifetime3 += 18;
            pn.field_a.a(ne.field_a + ": ", 400, var2_intLifetime3 + 12, 16777215, -1);
            pn.field_a.c("55000, 95000, 135000, ...", 400, 12 + var2_intLifetime3, 4243584, -1);
            var2_intLifetime3 += 18;
            var2_intLifetime3 = var2_intLifetime3 + 18 * pn.field_a.a(aj.field_b, 76, -4 + var2_intLifetime3, 488, 1000, 9805732, -1, 3, 0, 18);
            var2_intLifetime3 = var2_intLifetime3 + 18 * pn.field_a.a(af.field_bb, 76, -4 + var2_intLifetime3, 488, 1000, 9805732, -1, 3, 0, 18);
            var2_intLifetime3 = var2_intLifetime3 + pn.field_a.a(bk.field_i, 76, -4 + var2_intLifetime3, 488, 1000, 9805732, -1, 3, 0, 18) * 18;
            var2_intLifetime3 = var2_intLifetime3 + pn.field_a.a(ae.field_c, 76, -4 + var2_intLifetime3, 488, 1000, 9805732, -1, 3, 0, 18) * 18;
            var2_intLifetime3 = var2_intLifetime3 + pn.field_a.a(qi.field_d, 76, var2_intLifetime3 - 4, 488, 1000, 9805732, -1, 3, 0, 18) * 18;
            var2_intLifetime3 = var2_intLifetime3 + pn.field_a.a(hm.field_rb, 76, -4 + var2_intLifetime3, 488, 1000, 9805732, -1, 3, 0, 18) * 18;
            pn.field_a.c(lk.field_c, 76, 12 + var2_intLifetime3, 4243584, -1);
            var2_intLifetime3 += 18;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "fj.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Confined.field_J ? 1 : 0;
        var4 = this.c(111);
        var5_int = 0;
        while (var4 >= var5_int) {
          this.a(param2, var5_int, (byte) 40, param1);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = al.a((byte) -99);
        if (var5 != null) {
          bg.field_d.a(var5, (byte) 50, nm.field_I, he.field_f);
        }
        if (param0 != -47) {
          this.field_F = -77;
        }
    }

    String f(byte param0) {
        if (param0 > -82) {
          return (String) null;
        }
        return !this.field_w ? null : this.field_C;
    }

    boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        fj var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 418) {
            var4 = (fj) null;
            this.a((fj) null, -54, -54, -83);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fj.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, int param1, byte param2, fj param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 36) {
            return false;
          }
          this.field_v = 56;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("fj.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(byte param0, char param1, int param2) {
        if (this.e((byte) -12) &&
          this.a(this, (byte) 92, param2, param1)) {
          return true;
        }
        int var4 = param2;
        if (var4 == 80) {
          return this.a(this, param0 + 317);
        }
        if (param0 == 101) {
          return false;
        }
        this.field_B = (String) null;
        return false;
    }

    public final String toString() {
        return this.a(new StringBuilder(), 0, new Hashtable(), false).toString();
    }

    final boolean a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -13) {
            this.field_o = -18;
          }
          if (param2.containsKey(this)) {
            discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param2.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fj.BB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
          fj.a(-117, (byte) 85, 62);
        }
        if (param1 == 0 &&
          null != this.field_n) {
          this.field_n.a((byte) -124, param3, true, this, param0);
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_8_0 = false;
        if (param1 < 122) {
          this.field_m = 73;
        }
        stackIn_8_0 = (this.field_q + param2 <= param0) && (this.field_m + param4 <= param3) && (this.field_q + (param2 + this.field_F) > param0) && (this.field_z + (param4 + this.field_m) > param3);
        return stackIn_8_0;
    }

    int c(int param0) {
        if (param0 <= 65) {
          return 14;
        }
        return 0;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3) {
        int var5;
        qe var6;
        int var7;
        var7 = Confined.field_J ? 1 : 0;
        this.a(this, 11579568, param3, param2);
        var5 = this.e((byte) -24) ? 1 : 0;
        if (param1) {
          if (il.field_cb != 0 &&
            var5 != 0) {
            this.a(ld.field_l, param3, (byte) 36, this, param2, il.field_cb, jh.field_R);
          }
          if (rh.field_X != 0) {
            if (!this.a(param3, wm.field_hb, (byte) 91, param2, this, m.field_a, rh.field_X)) {
              if (var5 != 0) {
                this.b(84);
                if (var7 != 0) {
                  param1 = false;
                }
              }
            } else {
              param1 = false;
            }
          }
          if (Confined.field_I == 0 &&
            i.field_w != 0) {
            this.a(-102, param2, ld.field_l, this, jh.field_R, param3);
            var6 = rk.field_k;
            if (var6 != null) {
              if (var6.field_t instanceof sn) {
                ((sn) (var6.field_t)).a((s) null, var6, (byte) 104);
              }
              rk.field_k = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              rh.field_X != 0) {
              this.b(84);
            }
          }
        } else {
          if (var5 != 0 &&
            rh.field_X != 0) {
            this.b(84);
          }
        }
        i.field_w = Confined.field_I;
        hb.a((byte) 122, this.f((byte) -108));
        if (!param0) {
          this.field_B = (String) null;
        }
        return param1;
    }

    void b(int param0) {
        if (param0 != 84) {
          fj var3 = (fj) null;
          this.a((fj) null, -38, 103, -25);
        }
    }

    fj(String param0, uk param1) {
        this(param0, bg.field_d.field_m, param1);
    }

    boolean e(byte param0) {
        int var2 = -29 % ((-74 - param0) / 49);
        return false;
    }

    boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 91) {
            field_r = (String) null;
          }
          if (!this.a(param1, (byte) 126, param0, param5, param3)) {
            return false;
          }
          this.field_o = param6;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("fj.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_q).append(",").append(this.field_m).append(" ").append(this.field_F).append("x").append(this.field_z);
          if (this.field_B != null) {
            discarded$1 = param0.append(" text=\"").append(this.field_B).append('"');
          }
          if (this.field_w) {
            discarded$2 = param0.append(" mouseover");
          }
          if (param2 != -63) {
            field_r = (String) null;
          }
          if (this.e((byte) -127)) {
            discarded$3 = param0.append(" focused");
          }
          if (null != this.field_n) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_n instanceof fj)) {
              discarded$5 = param0.append(this.field_n);
              if (var6 != 0) {
                param0 = this.a(param0, 1 + param3, param1, false);
              }
            } else {
              param0 = this.a(param0, 1 + param3, param1, false);
            }
          }
          if (this.field_t != null) {
            discarded$6 = param0.append(" listener=");
            if (!(this.field_t instanceof fj)) {
              discarded$7 = param0.append(this.field_t);
              if (var6 == 0) {
                return;
              }
            }
            param0 = this.a(param0, param3 + 1, param1, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("fj.UA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -80 % ((47 - param1) / 43);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("fj.Q(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.field_B = (String) null;
          }
          if (this.a((byte) -13, param1, param2, param0)) {
            this.a(param0, param2, (byte) -63, param1);
          }
          stackIn_5_0 = (StringBuilder) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fj.O(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    protected fj() {
        this.field_y = 0;
        this.field_v = 0;
    }

    fj(String param0, fe param1, uk param2) {
        RuntimeException runtimeException = null;
        pj var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_y = 0;
        this.field_v = 0;
        try {
          this.field_B = param0;
          this.field_t = param2;
          this.field_n = param1;
          if (this.field_n instanceof pj) {
            var4 = (pj) ((Object) this.field_n);
            this.field_F = var4.a((byte) 118, this);
            this.field_z = var4.a(-1870081887, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("fj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    fj(int param0, int param1, int param2, int param3, fe param4, uk param5) {
        this.field_y = 0;
        this.field_v = 0;
        try {
          this.field_t = param5;
          this.field_m = param1;
          this.field_z = param3;
          this.field_q = param0;
          this.field_n = param4;
          this.field_F = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Achieved";
        field_E = new int[4];
        field_x = new ci();
        field_D = "<col=FFFFFF>Invincibility:</col> this ultimate defence renders you impervious to every attack and unscathed by every collision. It lasts for 30 seconds. Finding this power-up is like going on holiday!";
        field_A = "Confirm Email:";
    }
}
