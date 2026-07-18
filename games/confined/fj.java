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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((fj) this).field_o = 0;
              if (param0 <= -18) {
                break L1;
              } else {
                ((fj) this).a(-49, 87, 70, 119, -98);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("fj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int[] a(int param0, byte param1, int param2) {
        if (param1 <= 118) {
            field_s = null;
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
        ((fj) this).a(-125, ((fj) this).field_F, ((fj) this).field_m, ((fj) this).field_z, ((fj) this).field_q);
    }

    public static void e() {
        field_s = null;
        field_r = null;
        field_x = null;
        field_E = null;
        field_A = null;
        field_u = null;
        field_G = null;
        field_D = null;
    }

    void a(fj param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((fj) this).a(ld.field_l, (byte) 125, param2, jh.field_R, param3) ? 1 : 0;
              if (var5_int != 0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((fj) this).field_w) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_6_0 == stackIn_6_1) {
                break L3;
              } else {
                L4: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5_int == 0) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L4;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L4;
                  }
                }
                ((fj) this).field_w = stackIn_10_1 != 0;
                if (null == ((fj) this).field_t) {
                  break L3;
                } else {
                  if (!(((fj) this).field_t instanceof td)) {
                    break L3;
                  } else {
                    ((td) (Object) ((fj) this).field_t).a(var5_int != 0, (fj) this, -10);
                    break L3;
                  }
                }
              }
            }
            L5: {
              if (param1 == 11579568) {
                break L5;
              } else {
                String discarded$2 = ((fj) this).f((byte) -73);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("fj.V(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -109) {
            field_s = null;
        }
        ((fj) this).field_z = param3;
        ((fj) this).field_m = param2;
        ((fj) this).field_q = param4;
        ((fj) this).field_F = param1;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          int incrementValue$19 = param0;
          param0--;
          if (incrementValue$19 == 0) {
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
            tj.a(2652240, 70, (byte) 23, 484, var3 - (-var2_int + -8), 70);
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
            pn.field_a.a(q.field_k, 540, var6 - -12, 4243584, -1);
            var6 += 20;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          int incrementValue$20 = param0;
          param0--;
          if (incrementValue$20 != 0) {
            break L1;
          } else {
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
            int discarded$21 = pn.field_a.a(eg.field_m, 92, 60, 472, 100, 4243584, -1, 0, 0, 20);
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
            var2_int = pn.field_a.c(u.field_U);
            var3 = (768 + -var2_int) / 2;
            tj.a(2652240, 264, (byte) 14, var3 - 8, 170, 264);
            pn.field_a.c(u.field_U, var3, 270, 4243584, -1);
            tj.a(2652240, 264, (byte) 34, 546, var2_int + (var3 - -8), 264);
            tj.a(2652240, 264, (byte) 37, 546, 546, 256);
            pn.field_a.c(sg.field_u, 76, 308, 4243584, -1);
            break L1;
          }
        }
        L2: {
          int incrementValue$22 = param0;
          param0--;
          if (0 != incrementValue$22) {
            break L2;
          } else {
            fn.h(84, 88, 204, 114);
            lm.field_c.d(-76, 88);
            fn.h(78, 114, 210, 166);
            lm.field_c.d(-76, 88);
            fn.h(80, 166, 202, 192);
            lm.field_c.d(-76, 88);
            fn.c();
            var2_int = 0;
            L3: while (true) {
              if (var2_int >= 3) {
                tj.a(1088164, 104, (byte) 89, 112, 112, 70);
                tj.a(1088164, 70, (byte) 50, 212, 112, 70);
                int discarded$23 = pn.field_a.a(hm.field_ib, 220, 60, 340, 40, 4243584, -1, 0, 0, 20);
                tj.a(10110754, 120, (byte) 110, 232, 176, 120);
                int discarded$24 = pn.field_a.a(oj.field_z, 240, 110, 320, 40, 4243584, -1, 0, 0, 20);
                tj.a(11038741, 136, (byte) 107, 144, 144, 204);
                tj.a(11038741, 204, (byte) 52, 212, 144, 204);
                tj.a(11038741, 204, (byte) 87, 212, 212, 170);
                tj.a(11038741, 170, (byte) 104, 218, 212, 170);
                int discarded$25 = pn.field_a.a(rj.field_d, 226, 160, 334, 60, 4243584, -1, 0, 0, 20);
                fn.h(90, 0, 640, 254);
                lm.field_c.d(-470, 224);
                fn.h(110, 254, 640, 288);
                lm.field_c.d(-470, 224);
                fn.h(118, 288, 640, 307);
                lm.field_c.d(-470, 224);
                fn.c();
                ol.a(122, 30613, 2, 9, 232);
                int discarded$26 = pn.field_a.a(ug.field_Z, 178, 230, 252, 60, 4243584, -1, 0, 0, 20);
                pn.field_a.a(b.field_j, 466, 296, 4243584, -1);
                kc.a(false, 265, 17, 470);
                break L2;
              } else {
                dn.field_c[var2_int].c(var2_int * 32 + 100, 96);
                var2_int++;
                continue L3;
              }
            }
          }
        }
        L4: {
          int incrementValue$27 = param0;
          param0--;
          if (incrementValue$27 != 0) {
            break L4;
          } else {
            kc.a(false, 64, 0, 76);
            kc.a(false, 129, 1, 96);
            kc.a(false, 194, 14, 76);
            kc.a(false, 259, 10, 96);
            int discarded$28 = pn.field_a.a(wm.field_fb, 132, 58, 412, 60, 4243584, -1, 3, 1, 20);
            int discarded$29 = pn.field_a.a(a.field_a, 152, 123, 412, 60, 4243584, -1, 3, 1, 20);
            int discarded$30 = pn.field_a.a(mb.field_H, 132, 188, 412, 60, 4243584, -1, 3, 1, 20);
            int discarded$31 = pn.field_a.a(b.a(new String[1], uh.field_d, 1177), 152, 253, 412, 60, 4243584, -1, 3, 1, 20);
            break L4;
          }
        }
        L5: {
          int incrementValue$32 = param0;
          param0--;
          if (incrementValue$32 != 0) {
            break L5;
          } else {
            int discarded$33 = 1;
            if (ll.a(0)) {
              break L5;
            } else {
              kc.a(false, 64, 3, 96);
              kc.a(false, 129, 11, 76);
              kc.a(false, 194, 6, 96);
              kc.a(false, 259, 13, 76);
              int discarded$34 = pn.field_a.a(b.a(new String[1], rf.field_b, 1177), 152, 58, 412, 60, 4243584, -1, 3, 1, 20);
              int discarded$35 = pn.field_a.a(b.a(new String[1], ee.field_J, 1177), 132, 123, 412, 60, 4243584, -1, 3, 1, 20);
              int discarded$36 = pn.field_a.a(nd.field_u, 152, 188, 412, 60, 4243584, -1, 3, 1, 20);
              int discarded$37 = pn.field_a.a(b.a(new String[1], kn.field_a, 1177), 132, 253, 412, 60, 4243584, -1, 3, 1, 20);
              break L5;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var4 = ((fj) this).c(111);
        for (var5_int = 0; var4 >= var5_int; var5_int++) {
            ((fj) this).a(param2, var5_int, (byte) 40, param1);
        }
        int discarded$0 = -99;
        String var5 = al.a();
        if (!(var5 == null)) {
            bg.field_d.a(var5, (byte) 50, nm.field_I, he.field_f);
        }
        if (param0 != -47) {
            ((fj) this).field_F = -77;
        }
    }

    String f(byte param0) {
        if (param0 > -82) {
            return null;
        }
        return !((fj) this).field_w ? null : ((fj) this).field_C;
    }

    boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 418) {
                break L1;
              } else {
                var4 = null;
                ((fj) this).a((fj) null, -54, -54, -83);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("fj.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, byte param2, fj param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param2 == 36) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((fj) this).field_v = 56;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("fj.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(byte param0, char param1, int param2) {
        if (((fj) this).e((byte) -12)) {
            if (((fj) this).a((fj) this, (byte) 92, param2, param1)) {
                return true;
            }
        }
        int var4 = param2;
        if (!(var4 != 80)) {
            return ((fj) this).a((fj) this, param0 + 317);
        }
        if (param0 != 101) {
            ((fj) this).field_B = null;
            return false;
        }
        return false;
    }

    public final String toString() {
        return ((fj) this).a(new StringBuilder(), 0, new Hashtable(), false).toString();
    }

    final boolean a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -13) {
                break L1;
              } else {
                ((fj) this).field_o = -18;
                break L1;
              }
            }
            if (param2.containsKey(this)) {
              StringBuilder discarded$4 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$5 = param2.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("fj.BB(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
            int[] discarded$0 = fj.a(-117, (byte) 85, 62);
        }
        if (param1 == 0) {
            if (null != ((fj) this).field_n) {
                ((fj) this).field_n.a((byte) -124, param3, true, (fj) this, param0);
            }
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 >= 122) {
            break L0;
          } else {
            ((fj) this).field_m = 73;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((fj) this).field_q + param2 > param0) {
              break L2;
            } else {
              if (((fj) this).field_m + param4 > param3) {
                break L2;
              } else {
                if (((fj) this).field_q + (param2 - -((fj) this).field_F) <= param0) {
                  break L2;
                } else {
                  if (((fj) this).field_z + (param4 - -((fj) this).field_m) <= param3) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    int c(int param0) {
        if (param0 <= 65) {
            return 14;
        }
        return 0;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        qe var6 = null;
        int var7 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          ((fj) this).a((fj) this, 11579568, param3, param2);
          var5 = ((fj) this).e((byte) -24) ? 1 : 0;
          if (!param1) {
            if (var5 == 0) {
              break L0;
            } else {
              if (rh.field_X == 0) {
                break L0;
              } else {
                ((fj) this).b(84);
                break L0;
              }
            }
          } else {
            L1: {
              if (il.field_cb == 0) {
                break L1;
              } else {
                if (var5 == 0) {
                  break L1;
                } else {
                  boolean discarded$4 = ((fj) this).a(ld.field_l, param3, (byte) 36, (fj) this, param2, il.field_cb, jh.field_R);
                  break L1;
                }
              }
            }
            L2: {
              if (rh.field_X == 0) {
                break L2;
              } else {
                if (((fj) this).a(param3, wm.field_hb, (byte) 91, param2, (fj) this, m.field_a, rh.field_X)) {
                  param1 = false;
                  break L2;
                } else {
                  if (var5 == 0) {
                    break L2;
                  } else {
                    ((fj) this).b(84);
                    break L2;
                  }
                }
              }
            }
            if (Confined.field_I != 0) {
              break L0;
            } else {
              if (i.field_w != 0) {
                L3: {
                  ((fj) this).a(-102, param2, ld.field_l, (fj) this, jh.field_R, param3);
                  var6 = rk.field_k;
                  if (var6 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (!(var6.field_t instanceof sn)) {
                        break L4;
                      } else {
                        ((sn) (Object) var6.field_t).a((s) null, var6, (byte) 104);
                        break L4;
                      }
                    }
                    rk.field_k = null;
                    break L3;
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L5: {
          i.field_w = Confined.field_I;
          hb.a((byte) 122, ((fj) this).f((byte) -108));
          if (param0) {
            break L5;
          } else {
            ((fj) this).field_B = null;
            break L5;
          }
        }
        return param1;
    }

    void b(int param0) {
        if (param0 != 84) {
            Object var3 = null;
            ((fj) this).a((fj) null, -38, 103, -25);
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
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 91) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            if (((fj) this).a(param1, (byte) 126, param0, param5, param3)) {
              ((fj) this).field_o = param6;
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("fj.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((fj) this).field_q).append(",").append(((fj) this).field_m).append(" ").append(((fj) this).field_F).append("x").append(((fj) this).field_z);
              if (((fj) this).field_B == null) {
                break L1;
              } else {
                StringBuilder discarded$9 = param0.append(" text=\"").append(((fj) this).field_B).append('"');
                break L1;
              }
            }
            L2: {
              if (((fj) this).field_w) {
                StringBuilder discarded$10 = param0.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 == -63) {
                break L3;
              } else {
                field_r = null;
                break L3;
              }
            }
            L4: {
              if (!((fj) this).e((byte) -127)) {
                break L4;
              } else {
                StringBuilder discarded$11 = param0.append(" focused");
                break L4;
              }
            }
            L5: {
              if (null != ((fj) this).field_n) {
                StringBuilder discarded$12 = param0.append(" renderer=");
                if (((fj) this).field_n instanceof fj) {
                  param0 = ((fj) this).a(param0, 1 + param3, param1, false);
                  break L5;
                } else {
                  StringBuilder discarded$13 = param0.append((Object) (Object) ((fj) this).field_n);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (((fj) this).field_t == null) {
                break L6;
              } else {
                StringBuilder discarded$14 = param0.append(" listener=");
                if (((fj) this).field_t instanceof fj) {
                  param0 = ((fj) this).a(param0, param3 + 1, param1, false);
                  break L6;
                } else {
                  StringBuilder discarded$15 = param0.append((Object) (Object) ((fj) this).field_t);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("fj.UA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = -80 % ((47 - param1) / 43);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("fj.Q(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0 != 0;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                ((fj) this).field_B = null;
                break L1;
              }
            }
            L2: {
              if (!((fj) this).a((byte) -13, param1, param2, param0)) {
                break L2;
              } else {
                ((fj) this).a(param0, param2, (byte) -63, param1);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("fj.O(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    protected fj() {
        ((fj) this).field_y = 0;
        ((fj) this).field_v = 0;
    }

    fj(String param0, fe param1, uk param2) {
        RuntimeException runtimeException = null;
        pj var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((fj) this).field_y = 0;
        ((fj) this).field_v = 0;
        try {
          L0: {
            L1: {
              ((fj) this).field_B = param0;
              ((fj) this).field_t = param2;
              ((fj) this).field_n = param1;
              if (!(((fj) this).field_n instanceof pj)) {
                break L1;
              } else {
                var4 = (pj) (Object) ((fj) this).field_n;
                ((fj) this).field_F = var4.a((byte) 118, (fj) this);
                ((fj) this).field_z = var4.a(-1870081887, (fj) this);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("fj.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    fj(int param0, int param1, int param2, int param3, fe param4, uk param5) {
        ((fj) this).field_y = 0;
        ((fj) this).field_v = 0;
        try {
            ((fj) this).field_t = param5;
            ((fj) this).field_m = param1;
            ((fj) this).field_z = param3;
            ((fj) this).field_q = param0;
            ((fj) this).field_n = param4;
            ((fj) this).field_F = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Achieved";
        field_E = new int[4];
        field_x = new ci();
        field_D = "<col=FFFFFF>Invincibility:</col> this ultimate defence renders you impervious to every attack and unscathed by every collision. It lasts for 30 seconds. Finding this power-up is like going on holiday!";
        field_A = "Confirm Email:";
    }
}
