/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ta {
    static int field_w;
    private ea field_s;
    private dk field_a;
    private int field_m;
    private int field_v;
    private int field_j;
    private int field_d;
    static String field_k;
    private dk field_f;
    private int field_y;
    private int field_h;
    private int[][] field_x;
    private int[] field_t;
    private int field_c;
    private gf field_o;
    private int[] field_u;
    private dk[][] field_p;
    private dk field_r;
    private int field_e;
    private int field_b;
    private int[] field_l;
    private int field_q;
    private dk[] field_i;
    static String field_g;
    private int field_z;
    private gf field_n;

    private final void e(boolean param0) {
        Object var2 = null;
        if (null != ((ta) this).field_f) {
            var2 = (Object) (Object) hg.field_a;
        }
        en var3 = ce.field_f;
        if (!(!var3.field_c)) {
            var2 = (Object) (Object) cc.field_l;
        }
        if (!(var2 != null)) {
            return;
        }
        ih var4 = fh.field_g;
        int var5 = var4.field_x + var4.field_r;
        int var6 = -var5 + ((ta) this).field_q + -3 - -var4.field_r;
        int var7 = 320;
        int var8 = 10551200;
        var4.c((String) var2, var7, var6, var8, -1);
    }

    private final void g(byte param0) {
        int var2 = 10;
        int var3 = var2;
        int var4 = 2;
        ih var5 = fh.field_g;
        int var7 = 8 / ((18 - param0) / 59);
        int var6 = this.e(-108);
        var6 = this.a(var5, 117, var3, var4, ((ta) this).field_q, var6);
        var6 = this.a(-1, var5, var6, var3, ((ta) this).field_q, var4);
        var6 = this.a(440, var5, (byte) 57, var6, var4, var3);
        this.a(true);
        int discarded$0 = this.b(var6, 8);
        this.b((byte) 98);
        int var8 = ((ta) this).d((byte) -71);
        this.g(var8, 0);
    }

    private final void f(boolean param0) {
        if (!(mj.field_d != 0)) {
            sj.a(8192, (byte) 51);
        }
        de.field_j = true;
        this.a(64, ((ta) this).field_f);
        this.a(64, ((ta) this).field_r);
        this.a(64, ((ta) this).field_a);
        if (1000 > mj.field_d) {
            mj.field_d = mj.field_d + 1;
        }
    }

    private final void a(boolean param0) {
        int var2 = 103;
        int var3 = 40;
        int var4 = 40;
        int var5 = 40;
        int var6 = 3170352;
        int var7 = 6340704;
        this.a(var2, var7, 640, 0, var4, var6, var5, var3);
        this.a(var7, 1, 2, var6, var5);
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        wc var3 = null;
        int var4 = 0;
        L0: {
          var2 = 0;
          var3 = di.field_d;
          var4 = var3.field_h;
          if (var4 < 0) {
            break L0;
          } else {
            if (var4 < ((ta) this).field_x[((ta) this).field_h].length) {
              ((ta) this).field_m = var4;
              if (var3.b((byte) -18)) {
                ((ta) this).field_z = ((ta) this).field_m;
                return true;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
        }
        ((ta) this).field_m = -1;
        return false;
    }

    private final boolean e(int param0, int param1) {
        int var3 = 0;
        if (!(param1 >= 0)) {
            return false;
        }
        if (!(param1 != ((ta) this).field_c)) {
            var3 = -1 + ((ta) this).field_h;
            if (!(0 <= var3)) {
                var3 = ((ta) this).field_y + -1;
            }
            this.c(var3, (byte) -94);
            return true;
        }
        if (((ta) this).field_e != param1) {
            return false;
        }
        var3 = 1 + ((ta) this).field_h;
        if (((ta) this).field_y <= var3) {
            var3 = 0;
        }
        this.c(var3, (byte) 110);
        return true;
    }

    private final void b(int param0, ed param1) {
        ih var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (!(param1 != null)) {
            return;
        }
        int var3_int = this.g(true);
        if (!(var3_int >= 0)) {
            return;
        }
        try {
            var4 = fh.field_g;
            var5 = var4.field_r + var4.field_x;
            var6 = hk.field_r[var3_int];
            var7 = ((((ta) this).field_n.field_m + -param1.field_z) / 2 + -var5) / 3;
            var8 = var7 + ((ta) this).field_n.field_k - -var4.field_r;
            var9 = 320;
            lb.a(var8, var6, 16777215, -110, var9);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ta.D(" + 2 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(byte param0, boolean param1, boolean param2) {
        int var6 = 0;
        int var4 = 0;
        if (this.c((byte) -16)) {
            return var4 != 0;
        }
        if (param2) {
            var6 = this.l(-8477);
            if (0 > var6) {
                return var4 != 0;
            }
            if (this.e(-124, var6)) {
                return var4 != 0;
            }
            if (((ta) this).field_j == var6) {
                pa.a(true);
            }
            if (((ta) this).field_v == var6) {
                kh.a(lh.b((byte) -116), -1230, true);
            }
            if (!(((ta) this).field_d != var6)) {
                pl.field_q.b(-26480, param1);
                di.field_d = null;
            }
            e.field_a = false;
            ce.field_f.a(true);
            mj.field_d = 0;
            gi.a((byte) -71);
            var4 = 1;
            return var4 != 0;
        }
        return var4 != 0;
    }

    final static void m(int param0) {
        lj.a(4, 43);
    }

    private final int[] a(byte param0, int param1, int param2, int param3) {
        int var8 = EscapeVector.field_A;
        if (param3 == 1) {
            param1 = param1 + 20;
        }
        int[] var9 = new int[param3];
        int[] var5 = var9;
        int var6 = 0;
        int var7 = param1;
        while (var6 < param3) {
            var9[var6] = var7;
            var6++;
            var7 = var7 + 40;
        }
        return var9;
    }

    private final int a(int param0, int param1, ih param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var5_int = this.g(true);
            if (0 > var5_int) {
              stackOut_2_0 = param3 / 2 + param0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var6 = param2.b(kg.field_a + " ");
                var7 = param2.b("" + jb.field_t[var5_int]);
                var8 = var6 - -var7;
                var9 = param2.b(vg.field_T + " ");
                var10 = param2.b("" + jb.field_s[var5_int]);
                var11 = var10 + var9;
                if (var11 > var8) {
                  stackOut_6_0 = var11;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = var8;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                var13 = 0;
                var14 = (-var12 + param3) / 2 + param0;
                if (var13 == 0) {
                  stackOut_9_0 = var6;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var9;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var15 = stackIn_10_0;
              var16 = var15 + var14;
              stackOut_10_0 = var16;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ta.Q(").append(param0).append(',').append(15930).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    private final void b(byte param0) {
        int[] var2 = new int[]{3170352, 8421504, 8421504};
        int[] var3 = new int[]{6340704, 16777215, 16777215};
        int var5 = -4;
        int[] var4 = new int[]{6340704, 16777215, 16777215};
        if (!(null == ((ta) this).field_f)) {
            ((ta) this).field_f.a(var3, var2, (byte) -123, var4);
        }
        if (!(((ta) this).field_r == null)) {
            ((ta) this).field_r.a(var3, var2, (byte) -126, var4);
        }
        if (((ta) this).field_a != null) {
            ((ta) this).field_a.a(var3, var2, (byte) -126, var4);
        }
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ed[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ed var20 = null;
        int var21 = 0;
        int var22 = 0;
        dk var23 = null;
        int var24 = 0;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        var24 = EscapeVector.field_A;
        if (((ta) this).field_p != null) {
          return ((ta) this).field_u[((ta) this).field_h];
        } else {
          var2 = 1;
          var3 = 103;
          var4 = 40;
          var5 = 40;
          var6 = new int[]{36, 40};
          this.a((byte) -105);
          var7 = new int[]{36, 40};
          ((ta) this).field_p = new dk[((ta) this).field_y][];
          var8 = 0;
          L0: while (true) {
            if (((ta) this).field_y <= var8) {
              return ((ta) this).field_u[((ta) this).field_h];
            } else {
              var9 = ((ta) this).field_u[var8];
              var10 = this.a((byte) 89, var9);
              var37 = this.b(22387, var10, var9);
              var38 = this.a(var37, (byte) 100, var4);
              var39 = this.a(var38, (byte) -115);
              var40 = this.a((byte) -99, var3, var5, var10);
              var15 = this.a(var8, (byte) -116);
              ((ta) this).field_p[var8] = new dk[var9];
              var16 = 0;
              L1: while (true) {
                if (var10 <= var16) {
                  var8++;
                  continue L0;
                } else {
                  var17 = var37[var16];
                  var18 = 0;
                  L2: while (true) {
                    if (var18 >= var17) {
                      var16++;
                      continue L1;
                    } else {
                      var19 = this.a(var18, var37, 6340704, var16);
                      var20 = var15[var19];
                      var21 = var18 * var4 + var39[var16];
                      var22 = var40[var16];
                      var23 = new dk(var2, var19, var20, var6, var7);
                      var23.a(var5, 0, var4);
                      var23.b((byte) 22, var21, var22);
                      ((ta) this).field_p[var8][var19] = var23;
                      var18++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void g(int param0) {
        ((ta) this).field_o.c(117);
        int var2 = di.field_d.field_h;
        if (!((ta) this).field_s.e((byte) -7)) {
            ((ta) this).field_s.a(256);
        } else {
            nm.a((byte) -77, var2, ((ta) this).field_p[((ta) this).field_h]);
        }
        if (!(null == ((ta) this).field_i)) {
            nm.a((byte) -115, var2, ((ta) this).field_i);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = sm.a(param2, 31, ((ta) this).field_p[((ta) this).field_h], param1);
        if (var4 >= 0) {
            return var4;
        }
        if (((ta) this).field_f != null) {
            if (!(!((ta) this).field_f.a((byte) 65, param1, param2))) {
                return ((ta) this).field_f.field_c;
            }
        }
        if (null != ((ta) this).field_r) {
            if (((ta) this).field_r.a((byte) 65, param1, param2)) {
                return ((ta) this).field_r.field_c;
            }
        }
        if (param0 != -3) {
            return 57;
        }
        if (((ta) this).field_a != null) {
            if (((ta) this).field_a.a((byte) 65, param1, param2)) {
                return ((ta) this).field_a.field_c;
            }
        }
        if (!(((ta) this).field_i == null)) {
            var4 = sm.a(param2, 57, ((ta) this).field_i, param1);
            if (!(var4 < 0)) {
                return var4;
            }
        }
        return -1;
    }

    private final int a(byte param0, int param1) {
        if (param1 <= 4) {
            return 1;
        }
        return 2;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = param1 / ((ta) this).field_y;
        if (param2 == 0) {
            var4 = var4 + param1 % ((ta) this).field_y;
        }
        return var4;
    }

    private final boolean k(int param0) {
        int var2 = 0;
        if (pn.p(-98)) {
            di.field_d.a(118);
            qk.a(((ta) this).field_t, 0);
            if (!(nk.field_n != 13)) {
                di.field_d.a(false, ((ta) this).field_d);
            }
            this.a(20364);
            var2 = this.a((byte) -91, false, s.a((byte) 15, nk.field_n)) ? 1 : 0;
            return var2 != 0;
        }
        return var2 != 0;
    }

    private final int[] a(int[] param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = -33;
            var4 = new int[param0.length];
            var5 = 0;
            L1: while (true) {
              if (param0.length <= var5) {
                stackOut_4_0 = (int[]) var4;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var6 = param0[var5];
                var7 = (-var6 + 640) / 2;
                var4[var5] = var7;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ta.S(");
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -115 + ')');
        }
        return stackIn_5_0;
    }

    private final boolean c(int param0, int param1) {
        if (!(!bj.e((byte) -119))) {
            return false;
        }
        return ce.field_f.f(param1, 1);
    }

    private final void c(boolean param0) {
        ih var2 = fh.field_g;
        int var3 = 320;
        int var4 = 10;
        int var5 = ((ta) this).field_n.field_k - -var4 - -var2.field_r;
        var2.c(s.field_C, var3, var5, 10551200, -1);
    }

    private final int[] b(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        L0: {
          var9 = EscapeVector.field_A;
          if (((ta) this).field_b != param0) {
            var3 = ce.field_f.a(((ta) this).field_b, true);
            var4 = ce.field_f.c(((ta) this).field_b, 1);
            var10 = new int[var4];
            var2 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                break L0;
              } else {
                L2: {
                  var7 = ce.field_f.b(var5, (byte) 55) ? 1 : 0;
                  var8 = ce.field_f.a(var5, (byte) -126, ((ta) this).field_b) ? 1 : 0;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    if (var8 != 0) {
                      break L2;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                if (var10.length > var6) {
                  int incrementValue$1 = var6;
                  var6++;
                  var10[incrementValue$1] = var5;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            var2 = ((ta) this).field_l;
            break L0;
          }
        }
        return var2;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        ((ta) this).field_e = -1;
        ((ta) this).field_c = -1;
        if (1 >= ((ta) this).field_y) {
          ((ta) this).field_i = null;
          return param0;
        } else {
          L0: {
            if (((ta) this).field_y > 2) {
              stackOut_5_0 = 2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_6_0;
            ((ta) this).field_i = new dk[var3];
            if (param1 == 8) {
              break L1;
            } else {
              int discarded$3 = ((ta) this).c(46);
              break L1;
            }
          }
          L2: {
            var4 = 0;
            var5 = 0;
            var6 = ((ta) this).field_o.field_k + (-ah.field_j.field_z + ((ta) this).field_o.field_m) / 2;
            if (((ta) this).field_h <= 0) {
              break L2;
            } else {
              int incrementValue$4 = param0;
              param0++;
              ((ta) this).field_c = incrementValue$4;
              var7 = ((ta) this).field_o.field_j + -(ah.field_j.field_A / 2);
              ((ta) this).field_i[var4] = new dk(var5, ((ta) this).field_c, of.field_a);
              ((ta) this).field_i[var4].b((byte) 127, var7, var6);
              ((ta) this).field_i[var4].a(ah.field_j.field_z, 0, ah.field_j.field_A);
              si.a(-92, ((ta) this).field_i[var4]);
              var4++;
              break L2;
            }
          }
          L3: {
            if (((ta) this).field_y - 1 > ((ta) this).field_h) {
              int incrementValue$5 = param0;
              param0++;
              ((ta) this).field_e = incrementValue$5;
              var7 = ((ta) this).field_o.field_j + (((ta) this).field_o.field_g - ah.field_j.field_A / 2);
              ((ta) this).field_i[var4] = new dk(var5, ((ta) this).field_e, ah.field_j);
              ((ta) this).field_i[var4].b((byte) 122, var7, var6);
              ((ta) this).field_i[var4].a(ah.field_j.field_z, 0, ah.field_j.field_A);
              si.a(-110, ((ta) this).field_i[var4]);
              break L3;
            } else {
              break L3;
            }
          }
          return param0;
        }
    }

    final int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = EscapeVector.field_A;
          if (((ta) this).field_f != null) {
            var2 = ((ta) this).field_j;
            break L0;
          } else {
            if (((ta) this).field_r != null) {
              var2 = ((ta) this).field_v;
              break L0;
            } else {
              var2 = ((ta) this).field_d;
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 5201) {
            break L1;
          } else {
            int[] discarded$1 = this.b(75);
            break L1;
          }
        }
        return var2;
    }

    final boolean j(int param0) {
        if (!(((ta) this).field_s.e((byte) -7))) {
            ((ta) this).field_s.a((byte) 62);
        }
        this.f(true);
        int var2 = 0;
        var2 = this.k(-70) ? 1 : 0;
        if (param0 >= -111) {
            return true;
        }
        if (!(var2 == 0)) {
            return var2 != 0;
        }
        var2 = this.h((byte) -30) ? 1 : 0;
        if (var2 != 0) {
            return var2 != 0;
        }
        return var2 != 0;
    }

    private final void g(int param0, int param1) {
        ((ta) this).field_t = new int[param0];
        int var3 = 0;
        var3 = qe.a(((ta) this).field_t, var3, true, ((ta) this).field_x[((ta) this).field_h]);
        if (0 <= ((ta) this).field_j) {
            int incrementValue$0 = var3;
            var3++;
            ((ta) this).field_t[incrementValue$0] = ((ta) this).field_j;
        }
        if (!(((ta) this).field_v < 0)) {
            int incrementValue$1 = var3;
            var3++;
            ((ta) this).field_t[incrementValue$1] = ((ta) this).field_v;
        }
        int incrementValue$2 = var3;
        var3++;
        ((ta) this).field_t[incrementValue$2] = ((ta) this).field_d;
        if (!(((ta) this).field_c < 0)) {
            int incrementValue$3 = var3;
            var3++;
            ((ta) this).field_t[incrementValue$3] = ((ta) this).field_c;
        }
        if (!(0 > ((ta) this).field_e)) {
            int incrementValue$4 = var3;
            var3++;
            ((ta) this).field_t[incrementValue$4] = ((ta) this).field_e;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        param0 = -(param4 / 2) + param0;
        param4 = 3 * param4;
        param7 = param7 * 9;
        int var9 = (-param7 + 640) / 2;
        ((ta) this).field_o = new gf(var9, param0, param7, param4, 40);
        ((ta) this).field_o.a(15135, 6340704, 0, 3170352);
    }

    private final int a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            L1: while (true) {
              if (param3 <= var6) {
                var5_int = var5_int + param0;
                stackOut_6_0 = var5_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var5_int = var5_int + param1[var6];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ta.GB(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 6340704 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    private final boolean h(byte param0) {
        int var2 = 0;
        di.field_d.a(((ta) this).a(-3, sf.field_c, ng.field_ob), (byte) 119, ((ta) this).a(-3, dh.field_d, bj.field_y));
        this.a(20364);
        var2 = this.a((byte) -91, true, s.a((byte) 15, -1)) ? 1 : 0;
        int var3 = 61;
        if (!(var2 == 0)) {
            return var2 != 0;
        }
        return var2 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var6 = ((ta) this).field_o.field_k - -((ta) this).field_o.field_m - -5;
          var7 = 20;
          if (null != ((ta) this).field_f) {
            var7 = 10;
            break L0;
          } else {
            if (((ta) this).field_r != null) {
              var7 = 10;
              break L0;
            } else {
              break L0;
            }
          }
        }
        var8 = -((ta) this).field_o.field_k + (-((ta) this).field_o.field_m + -var7) + 440;
        var9 = ((ta) this).field_o.field_j - 3 * ah.field_j.field_A / 2;
        var10 = 3 * ah.field_j.field_A + ((ta) this).field_o.field_g;
        ((ta) this).field_n = new gf(var9, var6, var10, var8, 40);
        ((ta) this).field_n.a(15135, 6340704, 1, 3170352);
    }

    private final dk d(boolean param0) {
        int var2 = di.field_d.field_h;
        if (var2 < 0) {
            return null;
        }
        dk var3 = m.a(((ta) this).field_p[((ta) this).field_h], var2, 0);
        if (!(var3 == null)) {
            return var3;
        }
        if (((ta) this).field_f != null) {
            if (((ta) this).field_j == var2) {
                return ((ta) this).field_f;
            }
        }
        if (null != ((ta) this).field_r) {
            if (((ta) this).field_v == var2) {
                return ((ta) this).field_r;
            }
        }
        if (((ta) this).field_d != var2) {
            return null;
        }
        return ((ta) this).field_a;
    }

    private final void a(int param0, ed param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ih var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var3_int = this.g(true);
              if (0 > var3_int) {
                return;
              } else {
                var4 = fh.field_g;
                var5 = var4.field_r + var4.field_x;
                var6 = 6340704;
                var7 = 10551200;
                var8 = kg.field_a + " ";
                var9 = "" + jb.field_t[var3_int];
                var10 = vg.field_T + " ";
                var11 = "" + jb.field_s[var3_int];
                var12 = (640 + param1.field_A) / 2;
                var13 = -var12 + (((ta) this).field_n.field_g + ((ta) this).field_n.field_j);
                var14 = this.a(var12, 15930, var4, var13);
                var15 = var5 * 2;
                var16 = ((ta) this).field_n.field_k - (-((-var15 + ((ta) this).field_n.field_m) / 2) + -var4.field_r);
                var4.b(var8, var14, var16, var6, -1);
                var4.a(var9, var14, var16, var7, -1);
                var16 = var16 + var5;
                var4.b(var10, var14, var16, var6, -1);
                var4.a(var11, var14, var16, var7, -1);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ta.C(").append(2).append(',');
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final void f(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        en var2 = ce.field_f;
        int var3 = var2.c(((ta) this).field_b, 1);
        ((ta) this).field_y = this.b(var3, (byte) 123);
        ((ta) this).field_u = new int[((ta) this).field_y];
        for (var4 = 0; var4 < ((ta) this).field_y; var4++) {
            var5 = this.a((byte) 125, var3, var4);
            ((ta) this).field_u[var4] = var5;
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ed var5 = null;
        dk[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        gb var15 = null;
        gb var16 = null;
        int[] var20 = null;
        L0: {
          var3 = 640;
          var4 = 480;
          var5 = new ed(var3, var4);
          var20 = new int[4];
          var7 = ((ta) this).field_p[((ta) this).field_h];
          em.a(var20);
          var5.g();
          nm.a((byte) -103, -1, var7);
          md.field_D.a(124);
          em.b(var20);
          var5.f();
          var8 = qm.a(var7, (byte) 26);
          var9 = on.a(var7, -49);
          var10 = vg.a(var7, (byte) -122);
          var11 = pb.a((byte) 2, var7);
          var5.field_z = var11 + -var10;
          var5.field_q = var5.field_q - var8;
          var5.field_A = var9 + -var8;
          var5.field_v = var5.field_v - var10;
          var12 = 40;
          var13 = 0;
          if (pf.field_i == param1) {
            var13 = 0;
            break L0;
          } else {
            if (lj.field_f != param1) {
              break L0;
            } else {
              var13 = -var5.field_A + var3 - 1;
              break L0;
            }
          }
        }
        var14 = var8;
        var15 = new gb(var13, var10);
        var16 = new gb(var14, var10);
        ((ta) this).field_s = new ea(var15, var16, var5, var12);
    }

    private final int a(int param0, ih param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (((ta) this).field_b != 0) {
              ((ta) this).field_v = -1;
              ((ta) this).field_r = null;
              stackOut_2_0 = param2;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var7_int = 3;
              var8 = na.field_m;
              var9 = ic.a(var8, 16777215, param1);
              var10 = (-var9 + 640) / 2;
              ((ta) this).field_r = new dk(var7_int, param2, var8, 10, 2, param1);
              ((ta) this).field_r.b((byte) 124, var10, param4);
              ((ta) this).field_v = param2;
              stackOut_4_0 = ((ta) this).field_v - -1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7;
            stackOut_6_1 = new StringBuilder().append("ta.T(").append(-1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + 10 + ',' + param4 + ',' + 2 + ')');
        }
        return stackIn_5_0;
    }

    private final void h(int param0) {
        int var3 = 0;
        int var2 = di.field_d.field_h;
        if (!(null == ((ta) this).field_f)) {
            var3 = ((ta) this).field_f.field_c == var2 ? 1 : 0;
            ((ta) this).field_f.a(-16383, var3 != 0);
        }
        if (param0 != -1) {
            int discarded$0 = this.b(72, 122);
        }
        if (null != ((ta) this).field_r) {
            var3 = var2 == ((ta) this).field_r.field_c ? 1 : 0;
            ((ta) this).field_r.a(-16383, var3 != 0);
        }
        if (((ta) this).field_a != null) {
            var3 = var2 == ((ta) this).field_a.field_c ? 1 : 0;
            ((ta) this).field_a.a(param0 + -16382, var3 != 0);
        }
    }

    private final void a(int param0) {
        dk var2 = null;
        int var3 = 0;
        if (di.field_d.field_e) {
            var2 = this.d(true);
            var3 = nk.a(-93, var2);
            rk.field_e.a(oa.field_w, 100, qm.field_c * 1536 / 64, var3);
        }
    }

    private final ed b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        int var2 = this.g(true);
        if (var2 < 0) {
            return null;
        }
        ed var3 = this.f(-4343, var2);
        if (!(var3 == null)) {
            var4 = (640 + -var3.field_A) / 2;
            var5 = ((ta) this).field_n.field_k - -((((ta) this).field_n.field_m + -var3.field_z) / 2);
            var3.e(var4, var5);
        }
        return var3;
    }

    private final int a(int param0, ih param1, byte param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
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
            var7_int = 3;
            var8 = ag.field_a;
            var9 = ic.a(var8, 16777215, param1);
            var10 = (640 - var9) / 2;
            ((ta) this).field_a = new dk(var7_int, param3, var8, 10, 2, param1);
            ((ta) this).field_a.b((byte) 121, var10, 440);
            ((ta) this).field_d = param3;
            stackOut_2_0 = 1 + ((ta) this).field_d;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("ta.DB(").append(440).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 57 + ',' + param3 + ',' + 2 + ',' + 10 + ')');
        }
        return stackIn_3_0;
    }

    final int d(byte param0) {
        if (param0 >= -48) {
            return 57;
        }
        int var2 = 0;
        var2 = var2 + ((ta) this).field_x[((ta) this).field_h].length;
        if (0 <= ((ta) this).field_j) {
            var2++;
        }
        if (!(((ta) this).field_v < 0)) {
            var2++;
        }
        if (!(((ta) this).field_d < 0)) {
            var2++;
        }
        if (((ta) this).field_c >= 0) {
            var2++;
        }
        if (0 <= ((ta) this).field_e) {
            var2++;
        }
        return var2;
    }

    private final void d(int param0) {
        ed var4 = null;
        int var2 = -32;
        ((ta) this).field_n.c(50);
        int var3 = this.g(true);
        if (var3 >= 0) {
            var4 = this.b(true);
            this.b(2, var4);
            this.a(var4, (byte) -33);
            this.a(2, var4);
        } else {
            this.c(true);
        }
        this.e(true);
    }

    private final void a(ed param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ih var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 == null) {
              return;
            } else {
              var3_int = this.g(true);
              if (0 > var3_int) {
                return;
              } else {
                L1: {
                  var4 = fh.field_g;
                  var5 = 10551200;
                  var6 = 6340704;
                  var7 = mf.field_f[var3_int];
                  if (!this.a(var3_int, 6144)) {
                    stackOut_8_0 = he.field_q;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = bg.field_d;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                var8 = stackIn_9_0;
                var9 = var7 + "<br>" + "<col=" + Integer.toHexString(var6) + ">" + var8;
                var10 = 18;
                var11 = var10 + ((ta) this).field_n.field_j;
                var12 = -var11 + -var10 + (-param0.field_A + 640) / 2;
                var13 = var4.b(var9, var12, 0);
                var14 = ((ta) this).field_n.field_k + (((ta) this).field_n.field_m + -var13) / 2;
                int discarded$1 = var4.a(var9, var11, var14, var12, var13, var5, -1, 0, 0, 0);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ta.FB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -33 + ')');
        }
    }

    private final void e(byte param0) {
        en var2 = ce.field_f;
        if (var2.b(-106)) {
            ((ta) this).field_b = 0;
        } else {
            ((ta) this).field_b = 1;
        }
    }

    private final int g(boolean param0) {
        if (((ta) this).field_z >= 0) {
            if (((ta) this).field_x[((ta) this).field_h].length > ((ta) this).field_z) {
                return ((ta) this).field_x[((ta) this).field_h][((ta) this).field_z];
            }
        }
        if (0 <= ((ta) this).field_m) {
            if (!(((ta) this).field_x[((ta) this).field_h].length <= ((ta) this).field_m)) {
                return ((ta) this).field_x[((ta) this).field_h][((ta) this).field_m];
            }
        }
        return -1;
    }

    private final ed[] a(int param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        int[] var8 = ((ta) this).field_x[param0];
        int[] var3 = var8;
        ed[] var4 = new ed[var8.length];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var8[var5];
            var4[var5] = this.f(-4343, var6);
        }
        return var4;
    }

    private final int[] a(int[] param0, byte param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var9 = new int[param0.length];
            var4 = var9;
            var5 = 0;
            L1: while (true) {
              if (param0.length <= var5) {
                var5 = 0;
                stackOut_4_0 = (int[]) var4;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var6 = param0[var5];
                var7 = 40 * var6;
                var9[var5] = var7;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("ta.RA(");
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 100 + ',' + 40 + ')');
        }
        return stackIn_5_0;
    }

    public static void f(int param0) {
        field_k = null;
        field_g = null;
    }

    final void i(int param0) {
        em.d();
        od.b(2);
        pb.a(4);
        if (param0 != 3) {
            ((ta) this).field_i = null;
        }
        this.g(16317);
        this.d(-3);
        this.h(param0 + -4);
    }

    private final int[] b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        int[] var8 = new int[param1];
        int[] var4 = var8;
        for (var5 = 0; var5 < param1; var5++) {
            var6 = param2 / param1;
            if (!(0 != var5)) {
                var6 = var6 + param2 % param1;
            }
            var8[var5] = var6;
        }
        return var8;
    }

    private final void a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        int[] var2 = this.b(0);
        ((ta) this).field_x = new int[((ta) this).field_y][];
        int var3 = 0;
        for (var4 = 0; ((ta) this).field_y > var4; var4++) {
            var5 = ((ta) this).field_u[var4];
            ((ta) this).field_x[var4] = new int[var5];
            for (var6 = 0; var6 < var5; var6++) {
                int incrementValue$0 = var3;
                var3++;
                var7 = var2[incrementValue$0];
                ((ta) this).field_x[var4][var6] = var7;
            }
        }
    }

    private final int b(int param0, byte param1) {
        int var3 = param0 / 8;
        if (param0 % 8 != 0) {
            var3++;
        }
        ((ta) this).field_y = var3 / 2;
        if (((ta) this).field_y <= 0) {
            ((ta) this).field_y = 1;
        }
        if (!(0 == var3 % 2)) {
            var3++;
        }
        return ((ta) this).field_y;
    }

    private final void a(int param0, dk param1) {
        int var4 = 0;
        if (param1 == null) {
            return;
        }
        int var3_int = mj.field_d;
        if (var3_int != param1.field_q) {
            return;
        }
        try {
            var4 = nk.a(-87, param1);
            rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, var4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ta.P(" + 64 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = di.field_d.field_h;
          if (0 > var2) {
            break L0;
          } else {
            if (((ta) this).field_t.length > var2) {
              var3 = ((ta) this).field_t[var2];
              return var3;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    private final ed f(int param0, int param1) {
        ed var3 = hn.field_c;
        if (this.a(param1, 6144)) {
            var3 = ce.field_f.b(param1, 117);
        }
        if (!(!this.c(73, param1))) {
            var3 = rm.field_e;
        }
        return var3;
    }

    private final boolean a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = ((ta) this).field_l;
        int[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(param0 != var5)) {
                return true;
            }
        }
        return false;
    }

    private final int a(ih param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (!aj.b(-122)) {
              ((ta) this).field_j = -1;
              ((ta) this).field_f = null;
              stackOut_2_0 = param5;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var7_int = 3;
              var8 = cn.field_e;
              var9 = ic.a(var8, 16777215, param0);
              ((ta) this).field_f = new dk(var7_int, param5, var8, 10, 2, param0);
              var10 = (640 + -var9) / 2;
              var11 = -57;
              ((ta) this).field_f.b((byte) 13, var10, param4);
              ((ta) this).field_j = param5;
              stackOut_4_0 = ((ta) this).field_j - -1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7;
            stackOut_6_1 = new StringBuilder().append("ta.G(");
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 117 + ',' + 10 + ',' + 2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_5_0;
    }

    private final void c(int param0, byte param1) {
        int var3 = lj.field_f;
        if (param0 < ((ta) this).field_h) {
            var3 = pf.field_i;
        } else {
            var3 = lj.field_f;
        }
        ((ta) this).field_h = param0;
        if (((ta) this).field_h >= ((ta) this).field_y) {
            ((ta) this).field_h = ((ta) this).field_y - 1;
        }
        ((ta) this).field_z = -1;
        if (!(0 <= ((ta) this).field_h)) {
            ((ta) this).field_h = 0;
        }
        ((ta) this).field_m = -1;
        this.g((byte) -60);
        int var4 = ((ta) this).d((byte) -128);
        this.g(var4, 0);
        di.field_d = new wc(var4);
        int var5 = da.field_b.c(5201);
        int var6 = da.field_b.a(-3, dh.field_d, bj.field_y);
        di.field_d.a(117, true, var6, var5);
        mj.field_d = 0;
        gi.a((byte) -70);
        int var7 = -97 % ((param1 - -21) / 32);
        this.d(4551, var3);
    }

    ta() {
        ((ta) this).field_q = 400;
        ((ta) this).field_z = -1;
        ((ta) this).field_h = 0;
        ((ta) this).field_m = -1;
        this.e((byte) 111);
        ((ta) this).field_l = ce.field_f.a(((ta) this).field_b, (byte) -32);
        this.f((byte) -128);
        this.g((byte) 102);
        this.d(4551, pf.field_i);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Type your age in years";
        field_w = 0;
        field_g = "Log in";
    }
}
