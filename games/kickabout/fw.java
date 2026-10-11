/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fw extends ta {
    private boolean field_I;
    static String field_H;
    static double field_G;
    private boolean field_F;

    final static kg a(sj param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kg stackIn_2_0 = null;
        kg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_2_0 = (kg) null;
            return stackIn_2_0;
          }
          var4_int = param0.b(param1, -1);
          var5 = param0.a((byte) -70, param3, var4_int);
          stackIn_4_0 = aw.a(var5, var4_int, param0, 2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fw.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        jt var6;
        int var7;
        jt stackIn_11_0 = null;
        boolean stackIn_13_1 = false;
        var7 = Kickabout.field_G;
        super.a(0, param1, param2);
        this.field_F = gf.a(nt.field_yb, param0, tk.field_Ib, 3231);
        this.field_I = gf.a(nt.field_yb, 1, tk.field_Ib, 3231);
        cf.field_Gb.field_jb = new tf();
        for (var4 = 0; 3 > var4; var4++) {
          for (var5 = 0; 4 > var5; var5++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = new jt(ic.field_h, var4, var5);
            var6.field_J = var4 * (2 + var6.field_mb);
            var6.field_s = var5 * (5 + var6.field_q);
            stackIn_11_0 = var6;
            if (var4 != 0 && ((1 != var4 ||
              !this.field_F) &&
              (2 != var4 ||
              !this.field_I))) {
              stackIn_13_1 = false;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_13_1 = true;
            }
            stackIn_11_0.field_lb = stackIn_13_1;
            cf.field_Gb.a((byte) -104, (hd) (var6));
          }
        }
        cf.field_Gb.field_s = 665;
        cf.field_Gb.b(0, false);
    }

    public static void f(int param0) {
        field_H = null;
        int var1 = -127 % ((param0 - 61) / 56);
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var4Lifetime1;
        int var4Lifetime2;
        super.a(param0, param1);
        int var3 = this.field_j + 18;
        on.a(this.field_j + 10, 53, 365, 371, 65793, 96);
        on.a(var3, 62, 348, 24, 6, 65793, 96);
        pb.field_C.a(e.field_o, 30 + this.field_j, 80, 16777215, -1);
        on.a(var3, 95, 348, 106, 10, 65793, 96);
        on.a(var3, 207, 348, 102, 10, 65793, 96);
        on.a(var3, 314, 348, 100, 10, 65793, 96);
        for (var4 = 0; var4 < cf.field_Gb.field_jb.f(606511077).length; var4++) {
          ((jt) (cf.field_Gb.field_jb.f(param0 ^ -606511074)[var4])).j(0);
        }
        cf.field_Gb.a(96, false);
        if (!this.field_F) {
          on.a(var3, 207, 348, 102, 10, 65793, 228);
          for (var4Lifetime1 = 0; var4Lifetime1 < 3; var4Lifetime1++) {
            sh.field_g.c(30 + (var3 - var4Lifetime1), 241 - var4Lifetime1 * 2);
          }
          pb.field_C.a(fv.field_c, 70 + var3, 261, 16777215, -1);
          pb.field_C.a(we.field_d, var3, 269, 348, 40, 16777215, -1, 1, 1, 0);
        }
        if (!this.field_I) {
          on.a(var3, 314, 348, 100, 10, 65793, 228);
          for (var4Lifetime2 = 0; var4Lifetime2 < 3; var4Lifetime2++) {
            sh.field_g.c(-var4Lifetime2 + (30 + var3), -(2 * var4Lifetime2) + 348);
          }
          pb.field_C.a(fv.field_c, var3 + 70, 368, 16777215, -1);
          pb.field_C.a(we.field_d, var3, 376, 348, 40, 16777215, -1, 1, 1, 0);
        }
        un.field_d.a(ca.field_a, this.field_j + 25, 115, 16777215, -1);
        un.field_d.a(lr.field_j, 25 + this.field_j, 223, 16777215, -1);
        un.field_d.a(tu.field_C, 25 + this.field_j, 331, 16777215, -1);
    }

    final void b(int param0) {
        if (param0 != -38) {
          field_G = -0.01516130877366001;
        }
        cf.field_Gb = new hd();
        cf.field_Gb.a(true, 390, 25, 100, 440);
    }

    final void a(boolean param0, int param1) {
        if (param1 <= 99) {
          this.field_I = true;
        }
        ig.b(this.field_j, -12452);
    }

    final void a(byte param0, boolean param1) {
        jt var3_ref_jt;
        int var4;
        int var3;
        var4 = Kickabout.field_G;
        super.a((byte) 101, param1);
        cf.field_Gb.field_s = this.field_j + 25;
        cf.field_Gb.b(0, param1);
        var3_ref_jt = (jt) (cf.field_Gb.field_jb.g(24009));
        while (var3_ref_jt != null) {
          var3_ref_jt.c(3784, param1);
          if (var3_ref_jt.field_Ab != null &&
            var3_ref_jt.field_Ab.field_sb != 0) {
            cb.a(var3_ref_jt, (byte) 125);
          } else {
            if (var3_ref_jt.field_sb != 0 &&
              var3_ref_jt.i(-29050)) {
              if (var3_ref_jt.k(-9)) {
                var3_ref_jt = (jt) (cf.field_Gb.field_jb.c(33));
                continue;
              }
              rt.b(var3_ref_jt.field_Db, 97, var3_ref_jt.field_zb);
            }
          }
          var3_ref_jt = (jt) (cf.field_Gb.field_jb.c(33));
        }
        tc.a(ic.field_h.field_x, 5464);
        var3 = 4 % ((param0 - 38) / 60);
    }

    final static int h(byte param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_35_0 = 0;
          int stackIn_37_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          iw var2 = null;
          if (gt.field_t.field_o >= 4) {
            if (gt.field_t.field_l == -1) {
              return 3;
            }
            if (gt.field_t.field_l == -2) {
              return 4;
            }
            return 1;
          }
          if (param0 != 66) {
            field_G = 1.4183330929861455;
          }
          try {
            if (ci.field_a == 0) {
              iv.field_o = hf.field_e.a(true, tk.field_yb, nb.field_b);
              ci.field_a = ci.field_a + 1;
            }
            if (ci.field_a == 1) {
              if (iv.field_o.field_a == 2) {
                stackIn_16_0 = vk.a(-120, -1);
                return stackIn_16_0;
              }
              if (1 == iv.field_o.field_a) {
                ci.field_a = ci.field_a + 1;
              }
            }
            if (ci.field_a == 2) {
              je.field_e = new bh((java.net.Socket) (iv.field_o.field_b), hf.field_e);
              var2 = new iw(13);
              dh.a(or.field_c, rc.field_f, var2, -3210, wo.field_k);
              var2.a(param0 + 52, 15);
              var2.b(param0 ^ -44, gg.field_Db);
              je.field_e.a(13, (byte) -127, 0, var2.field_f);
              ci.field_a = ci.field_a + 1;
              qq.field_I = 30000L + nj.a(93);
            }
            if (ci.field_a == 3) {
              if (je.field_e.a((byte) 63) <= 0) {
                if (nj.a(param0 ^ 102) > qq.field_I) {
                  stackIn_32_0 = vk.a(-126, -2);
                  return stackIn_32_0;
                }
              } else {
                var1_int = je.field_e.b(1);
                if (var1_int != 0) {
                  stackIn_27_0 = vk.a(param0 - 182, var1_int);
                  return stackIn_27_0;
                }
                ci.field_a = ci.field_a + 1;
              }
            }
            if (ci.field_a != 4) {
              stackIn_37_0 = -1;
              return stackIn_37_0;
            }
            gt.field_t.a(je.field_e, 20, ac.field_f);
            je.field_e = null;
            ci.field_a = 0;
            iv.field_o = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return vk.a(-125, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    fw() {
        this.field_I = false;
        this.field_F = false;
    }

    static {
        field_G = 0.0;
        field_H = "Loading music";
    }
}
