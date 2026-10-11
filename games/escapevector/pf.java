/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    static int field_i;
    private dk[] field_c;
    wc field_b;
    static ed[] field_g;
    private int[] field_d;
    static String[] field_e;
    static String field_h;
    private dk[] field_a;
    int field_f;

    private final int a(int param0, dk[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          var3_int = this.field_b.field_h;
          if (param0 != 6481) {
            stackIn_3_0 = -57;
            return stackIn_3_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param1.length) {
              stackIn_11_0 = -1;
              return stackIn_11_0;
            }
            var5 = param1[var4];
            if (var5.field_c != var3_int) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("pf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, dk[] param2, int param3) {
        int discarded$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dk[] var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 4) {
            var9 = (dk[]) null;
            discarded$1 = this.a(-84, (dk[]) null);
          }
          var5_int = param3 - param1;
          var6 = this.a((byte) -106, param2);
          var7 = (var5_int - var6) / 2;
          var8 = param3 - var7;
          stackIn_3_0 = var8;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int b(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 89) {
          discarded$0 = this.a((byte) -26);
        }
        int var2 = this.a(6481, this.field_c);
        if (var2 == 0) {
          return 1;
        }
        if (1 == var2) {
          return 0;
        }
        if (2 == var2) {
          return 2;
        }
        if (var2 == 3) {
          return 3;
        }
        return -1;
    }

    final void d(int param0) {
        if (param0 != 100) {
          this.field_a = (dk[]) null;
        }
        em.d();
        od.b(param0 - 98);
        pb.a(4);
        this.a(this.field_c, (byte) -116);
        this.a(this.field_a, (byte) -109);
    }

    private final int a(int param0, int param1, int param2) {
        if (param0 != 1) {
          field_h = (String) null;
        }
        int var4 = this.a(param1, this.field_c, param2, 3);
        if (var4 >= 0) {
          return var4;
        }
        var4 = this.a(param1, this.field_a, param2, 3);
        if (var4 >= 0) {
          return var4;
        }
        return -1;
    }

    private final boolean b(int param0, dk[] param1, dk[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 7) {
            return true;
          }
          var4_int = this.a(6481, param1);
          if (var4_int < 0) {
            return false;
          }
          if (var4_int == 0) {
            var5 = param2[param2.length - 1].field_c;
            this.field_b.a(false, var5);
          } else {
            var5 = param1[var4_int - 1].field_c;
            this.field_b.a(false, var5);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pf.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int a(byte param0, dk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.field_p / 2 + param1.field_f;
          var4 = 16384 * var3_int / 640;
          var5 = 51 % ((param0 - 56) / 58);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("pf.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final int[] a(int param0, int param1, ih param2, byte param3) {
        int[] discarded$1 = null;
        String[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        ed[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        ih var11 = null;
        int[] var15 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 91) {
            var11 = (ih) null;
            discarded$1 = this.a(20, -91, (ih) null, (byte) -102);
          }
          if (bj.e((byte) 127)) {
            var5 = pl.field_s;
            var6 = new int[]{1, 0, 2, 3};
            var7 = pj.field_g;
            var8 = new int[]{0, 1, 2, 3};
          } else {
            var8 = new int[]{0, 1};
            var6 = new int[]{1, 0};
            var7 = new ed[]{pj.field_g[0], pj.field_g[1]};
            var5 = new String[]{pl.field_s[0], pl.field_s[1]};
          }
          var9 = var5.length;
          var15 = this.a(param0, true, var9);
          this.a(3390, param1, var5, var7, var15, param2, var8);
          stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("pf.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int[] a(ih param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        String[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 0;
          var6 = 640;
          var7 = 442;
          if (!aj.b(-96)) {
            var10 = new int[]{0};
            var8 = new int[]{4};
            var9 = new String[]{ag.field_a};
          } else {
            var9 = new String[]{cn.field_e, ag.field_a};
            var10 = new int[]{0, 1};
            var8 = new int[]{3, 4};
          }
          var11 = var9.length;
          var20 = this.a(param3, true, var11);
          if (param1 < 62) {
            field_e = (String[]) null;
          }
          var21 = vl.a(param2, param3, var11, (byte) -17);
          this.field_a = na.a(var6, var20, var7, var5_int, param0, var9, var10, false, var21);
          stackIn_6_0 = var8;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pf.CA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(dk[] param0, byte param1) {
        int var4 = 0;
        int[] discarded$1 = null;
        dk[] var3 = null;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        ih var8 = null;
        dk[] var9 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = EscapeVector.field_A;
        try {
          var9 = param0;
          var3 = var9;
          for (var4 = 0; var4 < var9.length; var4++) {
            var5 = var9[var4];
            stackIn_6_0 = (~this.field_b.field_h != ~var5.field_c) ? 0 : 1;
            var6 = stackIn_6_0;
            var5.a(-16383, var6 != 0);
          }
          if (param1 > -39) {
            var8 = (ih) null;
            discarded$1 = this.a(28, -16, (ih) null, (byte) 69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("pf.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = EscapeVector.field_A;
        var2 = 0;
        var3 = -14 % ((param0 - 15) / 58);
        while (pn.p(-98)) {
          this.field_b.a(113);
          if (nk.field_n == 97 ||
            nk.field_n == 99) {
            var4 = this.a(-101, this.field_c, this.field_a) ? 1 : 0;
            if (var4 == 0) {
              var4 = this.a(-101, this.field_a, this.field_c) ? 1 : 0;
            }
            if (var4 == 0) {
              this.field_b.a(false, 0);
            }
          }
          if (96 == nk.field_n ||
            nk.field_n == 98) {
            var4Lifetime1 = this.b(33, this.field_c, this.field_a) ? 1 : 0;
            if (var4Lifetime1 == 0) {
              var4Lifetime1 = this.b(84, this.field_a, this.field_c) ? 1 : 0;
            }
            if (var4Lifetime1 == 0) {
              this.field_b.a(false, 0);
            }
          }
          if (nk.field_n == 13) {
            pg.field_b = false;
            qk.a(var2 != 0, -87);
          }
          if (this.a(var2 != 0, (byte) 91)) {
            return true;
          }
        }
        return false;
    }

    final void e(int param0) {
        this.c((byte) 16);
        if (this.a((byte) 94)) {
          return;
        }
        if (param0 <= 61) {
          field_h = (String) null;
        }
        int var2 = this.a(1, bj.field_y, dh.field_d);
        int var3 = this.a(1, ng.field_ob, sf.field_c);
        this.field_b.a(var3, (byte) 121, var2);
        boolean discarded$0 = this.a(true, (byte) 91);
    }

    private final int a(int param0, dk[] param1, int param2, int param3) {
        int discarded$1 = 0;
        dk[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        dk var7 = null;
        int var8 = 0;
        dk[] var9 = null;
        dk[] var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          var10 = param1;
          var5 = var10;
          var6 = 0;
          while (true) {
            if (var6 >= var10.length) {
              if (param3 != 3) {
                var9 = (dk[]) null;
                discarded$1 = this.a(-122, (dk[]) null);
              }
              stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            var7 = var10[var6];
            if (!var7.a((byte) 65, param2, param0)) {
              var6++;
              continue;
            }
            break;
          }
          stackIn_5_0 = var7.field_c;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("pf.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        var2 = 84 / ((59 - param0) / 54);
        if (!this.field_b.field_e) {
          return;
        }
        var3 = 100;
        var4 = 1536 * qm.field_c / 64;
        var5 = rk.field_e;
        synchronized (var5) {
          this.a(this.field_c, (byte) -23, var3, var4);
          this.a(this.field_a, (byte) -23, var3, var4);
        }
        return;
    }

    private final void b(int param0) {
        pa.a(true);
        mj.field_d = 0;
        gi.a((byte) -113);
        if (param0 != -15268) {
          return;
        }
    }

    final static void e(byte param0) {
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_84_0 = 0;
        RuntimeException decompiledCaughtException = null;
        oh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oh var6 = null;
        int var6_int = 0;
        int var7 = 0;
        oh var7_ref_oh = null;
        int var8 = 0;
        oh var8_ref_oh = null;
        int var9 = 0;
        oh var10 = null;
        oh var11 = null;
        oh var12 = null;
        oh var1Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = EscapeVector.field_A;
        try {
          if (mh.field_e < 100 &&
            Math.random() < 0.05 * (double)(100 - mh.field_e) / 100.0) {
            var10 = new oh();
            var11 = var10;
            if (Math.random() < 0.5) {
              var11.field_m = 1;
              var11.field_i = 0;
            } else {
              var10.field_m = -1;
              var10.field_i = 640;
            }
            var11.field_q = 0 + (int)(81.0 * Math.random()) * 6;
            var11.field_h = 50 + (int)(100.0 * Math.random());
            var11.field_o = (int)(Math.random() * 200.0) + 100;
            var2 = (int)(7.0 * Math.random());
            if (var2 < 0) {
              var2 = 0;
            } else {
              if (var2 > 6) {
                var2 = 6;
              }
            }
            var11.field_l = -var2 + 6;
            var11.field_j = var2;
            wa.field_c.a(-12328, var11);
            if (var11.field_o >= 100) {
              mh.field_e = mh.field_e + 1;
            }
          }
          if (param0 > -94) {
            pf.e((byte) 116);
          }
          var1 = (oh) (wa.field_c.a(false));
          while (var1 != null) {
            if (var1.field_o > var1.field_r) {
              var1.field_r = var1.field_r + 1;
              if (var1.field_s >= var1.field_h) {
                var1.field_i = var1.field_i + var1.field_m;
              } else {
                var1.field_s = var1.field_s + 1;
              }
            } else {
              if (var1.field_s > 0) {
                var1.field_s = var1.field_s - 1;
                var1.field_i = var1.field_i + var1.field_m;
              } else {
                var1.c((byte) -33);
              }
            }
            if (var1.field_m < 0 &&
              var1.field_i <= 0) {
              var1.c((byte) -26);
            }
            if (0 < var1.field_m &&
              640 <= var1.field_i) {
              var1.c((byte) -69);
            }
            if (!var1.b((byte) 48) &&
              100 <= var1.field_o) {
              mh.field_e = mh.field_e - 1;
            }
            var2Lifetime1 = (var1.field_o - 50) / 20;
            for (var3 = 0; var3 < var2Lifetime1; var3++) {
              if (~(-(3 * (-var3 + var2Lifetime1)) + var1.field_o) == ~var1.field_r) {
                var4 = var1.field_i + var1.field_m * (var1.field_s + (var1.field_o - var1.field_r));
                var5 = var4;
                if (var1.field_m > 0) {
                  var5 += 5;
                }
                var5 = 2 + (var5 - 2) / 6 * 6;
                var5 = var5 - (var2Lifetime1 - var3) * (6 * var1.field_m);
                var6_int = (int)(Math.random() * (double)var1.field_j);
                if (var6_int > 0) {
                  var7_ref_oh = new oh();
                  var7_ref_oh.field_i = var5;
                  var7_ref_oh.field_s = 1;
                  var7_ref_oh.field_h = 1 + 6 * var6_int;
                  var7_ref_oh.field_o = 50;
                  var7_ref_oh.field_q = var1.field_q + 1;
                  var7_ref_oh.field_m = -1;
                  si.field_u.a(-12328, var7_ref_oh);
                }
                var7 = (int)(Math.random() * (double)var1.field_l);
                if (0 < var7) {
                  var8_ref_oh = new oh();
                  var8_ref_oh.field_s = 1;
                  var8_ref_oh.field_q = var1.field_q;
                  var8_ref_oh.field_o = 50;
                  var8_ref_oh.field_h = 1 + 6 * var7;
                  var8_ref_oh.field_m = 1;
                  var8_ref_oh.field_i = var5;
                  si.field_u.a(-12328, var8_ref_oh);
                }
              }
            }
            var1 = (oh) (wa.field_c.b((byte) 70));
          }
          var1Lifetime1 = (oh) (si.field_u.a(false));
          while (var1Lifetime1 != null) {
            var2Lifetime2 = 0;
            stackIn_55_0 = ~var1Lifetime1.field_r;
            stackIn_55_1 = ~var1Lifetime1.field_o;
            if (stackIn_55_0 > stackIn_55_1) {
              if (var1Lifetime1.field_s < var1Lifetime1.field_h) {
                var1Lifetime1.field_s = var1Lifetime1.field_s + 1;
              }
              var1Lifetime1.field_r = var1Lifetime1.field_r + 1;
              if (var1Lifetime1.field_s % 6 == 0) {
                var2Lifetime2 = 1;
              }
            } else {
              if (var1Lifetime1.field_s <= 0) {
                var1Lifetime1.c((byte) -59);
              } else {
                var1Lifetime1.field_q = var1Lifetime1.field_q + var1Lifetime1.field_m;
                var1Lifetime1.field_s = var1Lifetime1.field_s - 1;
              }
            }
            if (var1Lifetime1.field_m < 0 &&
              var1Lifetime1.field_i <= 0) {
              var1Lifetime1.c((byte) -56);
            }
            if (var1Lifetime1.field_m > 0 &&
              480 <= var1Lifetime1.field_i) {
              var1Lifetime1.c((byte) -113);
            }
            if (var2Lifetime2 != 0) {
              if (mh.field_e < 100) {
                stackIn_78_0 = (Math.random() < (double)((500 - mh.field_e * 5) / 100)) ? 1 : 0;
              } else {
                stackIn_78_0 = 0;
              }
              var3Lifetime1 = stackIn_78_0;
              if (mh.field_e < 100) {
                stackIn_84_0 = (Math.random() < (double)((100 - mh.field_e) * 5 / 100)) ? 1 : 0;
              } else {
                stackIn_84_0 = 0;
              }
              var4Lifetime1 = stackIn_84_0;
              var5Lifetime1 = var1Lifetime1.field_q + var1Lifetime1.field_s * var1Lifetime1.field_m;
              if (var1Lifetime1.field_m < 0) {
                var5Lifetime1--;
              }
              var6 = new oh();
              var6.field_q = var5Lifetime1;
              var6.field_m = -1;
              var6.field_i = 1 + var1Lifetime1.field_i;
              var6.field_h = 50 + (int)(Math.random() * 100.0);
              if (var3Lifetime1 == 0) {
                var6.field_o = (int)(Math.random() * 40.0) + 10;
              } else {
                var6.field_o = 100 + (int)(200.0 * Math.random());
                var7Lifetime1 = (int)(Math.random() * 7.0);
                if (var7Lifetime1 >= 0) {
                  if (6 < var7Lifetime1) {
                    var7Lifetime1 = 6;
                  }
                } else {
                  var7Lifetime1 = 0;
                }
                var6.field_j = var7Lifetime1;
                var6.field_l = -var7Lifetime1 + 6;
              }
              wa.field_c.a(-12328, var6);
              if (100 <= var6.field_o) {
                mh.field_e = mh.field_e + 1;
              }
              var12 = new oh();
              var12.field_i = var1Lifetime1.field_i;
              var12.field_q = var5Lifetime1;
              var12.field_m = 1;
              var12.field_h = 50 + (int)(Math.random() * 100.0);
              if (var4Lifetime1 == 0) {
                var12.field_o = 10 + (int)(40.0 * Math.random());
              } else {
                var12.field_o = 100 + (int)(200.0 * Math.random());
                var8 = (int)(Math.random() * 7.0);
                if (var8 >= 0) {
                  if (var8 > 6) {
                    var8 = 6;
                  }
                } else {
                  var8 = 0;
                }
                var12.field_j = var8;
                var12.field_l = 6 - var8;
              }
              wa.field_c.a(-12328, var12);
              if (100 <= var12.field_o) {
                mh.field_e = mh.field_e + 1;
              }
            }
            var1Lifetime1 = (oh) (si.field_u.b((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "pf.C(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, dk[] param2, int param3, int param4, int param5) {
        dk var10 = null;
        int var11 = 0;
        int var7_int = mj.field_d;
        if (param3 > var7_int) {
          return;
        }
        if (var7_int % param0 != 0) {
          return;
        }
        int var8 = param3 + param0 * (-1 + param2.length);
        if (param1 != 6) {
          this.field_f = 120;
        }
        if (var7_int > var8) {
          return;
        }
        int var9 = (var7_int - param3) / param0;
        if (var9 < 0 ||
          var9 >= param2.length) {
          return;
        }
        try {
          var10 = param2[var9];
          var11 = this.a((byte) 120, var10);
          rk.field_e.a(pc.field_a, param4, param5, var11);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "pf.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final boolean a(boolean param0, byte param1) {
        int var3;
        int var4;
        int var5;
        this.c(113);
        if (!this.field_b.b((byte) -18)) {
          return false;
        }
        var3 = this.field_b.field_h;
        if (var3 >= 0 &&
          this.field_d.length > var3) {
          var4 = this.field_d[var3];
          if (var4 == 3 &&
            aj.b(-100)) {
            this.b(-15268);
            return true;
          }
          if (4 == var4) {
            pg.field_b = false;
            qk.a(param0, param1 + 34);
            return true;
          }
          if (this.b((byte) 89) == var4) {
            pg.field_b = false;
            var5 = l.a(-8462, var4);
            ll.a(0, var5, param0, this.field_f);
            return true;
          }
          if (param1 == 91) {
            return false;
          }
          this.field_b = (wc) null;
          return false;
        }
        return false;
    }

    private final boolean a(int param0, dk[] param1, dk[] param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = EscapeVector.field_A;
        try {
          var4_int = this.a(6481, param1);
          if (var4_int < 0) {
            return false;
          }
          if (param1.length - 1 > var4_int) {
            var5 = param1[var4_int + 1].field_c;
            this.field_b.a(false, var5);
          } else {
            var5 = param2[0].field_c;
            this.field_b.a(false, var5);
          }
          if (param0 == -101) {
            return true;
          }
          this.field_b = (wc) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pf.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        if (mj.field_d == 0) {
          sj.a(8192, (byte) 51);
        }
        de.field_j = true;
        int var2 = 6144 * qm.field_c / 64;
        int var3 = 100;
        int var4 = 10;
        if (param0 < 4) {
          field_g = (ed[]) null;
        }
        int var5 = var4;
        this.a(var4, 6, this.field_c, var5, var3, var2);
        var5 = var5 + var4 * this.field_c.length;
        this.a(var4, 6, this.field_a, var5, var3, var2);
        if (!(mj.field_d >= 1000)) {
          mj.field_d = mj.field_d + 1;
        }
    }

    private final int[] a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param2];
        int[] var4 = var7;
        if (!param1) {
          this.d(106);
        }
        for (var5 = 0; var5 < param2; var5++) {
          var7[var5] = param0 + var5;
        }
        return var4;
    }

    private final int a(byte param0, dk[] param1) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        dk[] var4 = null;
        dk var6 = null;
        int var7 = 0;
        dk[] var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          var3_int = 0;
          if (param0 > -105) {
            var8 = (dk[]) null;
            this.a((dk[]) null, (byte) 115, 95, -46);
          }
          var4 = param1;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6.field_i > var3_int) {
              var3_int = var6.field_i;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("pf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, String[] param2, ed[] param3, int[] param4, ih param5, int[] param6) {
        int var20 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dk var12_ref_dk = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        dk[] var19 = null;
        dk var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var11Lifetime1;
        var23 = EscapeVector.field_A;
        try {
          var8_int = 2;
          var9 = param2.length;
          this.field_c = new dk[var9];
          var10 = 0;
          for (var11 = 0; var11 < var9; var11++) {
            var12_ref_dk = new dk(var8_int, param4[var11], param2[var11], param1, param3[var11], param6[var11], param5);
            this.field_c[var11] = var12_ref_dk;
            var10 = var10 + var12_ref_dk.field_p;
          }
          var11Lifetime1 = 640;
          var12 = na.a(1, var9, var11Lifetime1, var10);
          var13 = dd.a(var10, (byte) 86, var11Lifetime1, var9, var12);
          var14 = 0;
          var15 = var14 + var13;
          if (param0 != 3390) {
            return;
          }
          var16 = k.field_j.field_z / 2 + 77;
          var17 = 442;
          var18 = this.a(4, var16, this.field_c, var17);
          var19 = this.field_c;
          for (var20 = 0; var19.length > var20; var20++) {
            var21 = var19[var20];
            var22 = var18 - var21.field_i;
            var21.b((byte) 39, var15, var22);
            var15 = var15 + (var12 + var21.field_p);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("pf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void d(byte param0) {
        ih var2 = fh.field_g;
        int var3 = 10;
        int[] var4 = this.a(0, var3, var2, (byte) 102);
        int[] var5 = this.a(var2, 84, var3, var4.length);
        int var6 = var4.length + var5.length;
        int var7 = 60 / ((50 - param0) / 47);
        this.field_d = new int[var6];
        qg.a(var4, 0, this.field_d, 0, var4.length);
        qg.a(var5, 0, this.field_d, var4.length, var5.length);
        fi.a(this.field_c, 0);
        fi.a(this.field_a, 0);
    }

    final static void a(boolean param0, String param1, Throwable param2) {
        try {
          lk stackIn_13_0;
          int stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          java.net.URL stackIn_13_4;
          StringBuilder stackIn_13_5;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          String stackIn_14_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          la var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          var6 = EscapeVector.field_A;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = jg.a(param2, 41);
            }
            if (param1 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            je.a(param0, var3);
            var3 = vg.a(var3, ":", (byte) 111, "%3a");
            var3 = vg.a(var3, "@", (byte) 111, "%40");
            var3 = vg.a(var3, "&", (byte) 111, "%26");
            var7 = vg.a(var3, "#", (byte) 111, "%23");
            if (hg.field_c == null) {
              return;
            }
            stackIn_13_0 = ae.field_a;
            stackIn_13_1 = -12;
            stackIn_13_2 = null;
            stackIn_13_3 = null;
            stackIn_13_4 = hg.field_c.getCodeBase();
            stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(uf.field_n).append("&u=");
            if (null != eh.field_g) {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = eh.field_g;
            } else {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = "" + eb.field_J;
            }
            var4 = ((lk) (Object) stackIn_13_0).a((byte) stackIn_13_1, new java.net.URL(stackIn_13_4, ((StringBuilder) (Object) stackIn_13_5).append(stackIn_14_6).append("&v1=").append(lk.field_s).append("&v2=").append(lk.field_v).append("&e=").append(var7).toString()));
            while (var4.field_f == 0) {
              en.a((byte) 105, 1L);
            }
            if (var4.field_f == 1) {
              var5 = (DataInputStream) (var4.field_b);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, byte param1, int param2) {
        if (param1 != -73) {
          this.field_b = (wc) null;
        }
        this.field_b = new wc(param2);
        int var4 = this.a(bj.field_y, this.field_c, dh.field_d, 3);
        if (var4 < 0) {
          var4 = this.a(bj.field_y, this.field_a, dh.field_d, 3);
        }
        this.field_b.a(125, param0, var4, 0);
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_g = null;
        if (param0 != 459) {
          Throwable var2 = (Throwable) null;
          pf.a(false, (String) null, (Throwable) null);
        }
    }

    private final void a(dk[] param0, byte param1, int param2, int param3) {
        int var9 = 0;
        int var5_int = this.a(6481, param0);
        if (var5_int < 0) {
          return;
        }
        dk var6 = param0[var5_int];
        int var7 = var6.field_c;
        int var8 = this.field_b.field_h;
        if (param1 != -23) {
          field_e = (String[]) null;
        }
        if (var7 != var8) {
          return;
        }
        try {
          var9 = this.a((byte) -97, var6);
          rk.field_e.a(oa.field_w, param2, param3, var9);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "pf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    pf(boolean param0) {
        this.d((byte) -35);
        int var2 = this.field_d.length;
        this.a(param0, (byte) -73, var2);
        this.field_f = vh.f(104);
    }

    static {
        field_i = 1;
        field_g = new ed[7];
        field_h = "Level complete.";
        field_e = new String[16];
    }
}
