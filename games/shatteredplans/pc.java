/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pc extends hs {
    static String field_o;
    static String field_p;
    static int field_q;
    static String field_r;
    static bi field_n;
    static int field_m;

    final static void c(int param0) {
        lg.field_e = null;
        int var1 = 119 % ((param0 - -40) / 34);
    }

    pc(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
        this.field_e = this.field_a;
    }

    public final l a(byte param0) throws jn {
        int var3;
        ln var4;
        int var5;
        int var6;
        int var7_int;
        ln[] var7;
        ln[] var8;
        int var9;
        ln var10;
        int var12;
        l var13;
        int stackIn_9_0 = 0;
        jd[] stackIn_11_0;
        int stackIn_11_1;
        jd stackIn_11_2;
        jd stackIn_11_3;
        ln stackIn_11_4;
        ln[] stackIn_11_5;
        int stackIn_11_6;
        jd[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        jd stackIn_12_2 = null;
        jd stackIn_12_3 = null;
        ln stackIn_12_4 = null;
        ln[] stackIn_12_5 = null;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        jd[] stackIn_14_0;
        int stackIn_14_1;
        jd stackIn_14_2;
        jd stackIn_14_3;
        ln stackIn_14_4;
        ln[] stackIn_14_5;
        int stackIn_14_6;
        int stackIn_14_7;
        jd[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        jd stackIn_15_2 = null;
        jd stackIn_15_3 = null;
        ln stackIn_15_4 = null;
        ln[] stackIn_15_5 = null;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        jd[] stackIn_17_0;
        int stackIn_17_1;
        jd stackIn_17_2;
        jd stackIn_17_3;
        ln stackIn_17_4;
        ln[] stackIn_17_5;
        int stackIn_17_6;
        int stackIn_17_7;
        jd[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        jd stackIn_18_2 = null;
        jd stackIn_18_3 = null;
        ln stackIn_18_4 = null;
        ln[] stackIn_18_5 = null;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        jd[] stackIn_20_0;
        int stackIn_20_1;
        jd stackIn_20_2;
        jd stackIn_20_3;
        ln stackIn_20_4;
        ln[] stackIn_20_5;
        int stackIn_20_6;
        int stackIn_20_7;
        jd[] stackIn_21_0;
        int stackIn_21_1;
        jd stackIn_21_2;
        jd stackIn_21_3;
        ln stackIn_21_4;
        ln[] stackIn_21_5;
        int stackIn_21_6;
        int stackIn_21_7;
        int stackIn_21_8;
        ln stackIn_35_0 = null;
        ln stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int var11;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          var13 = super.a((byte) 119);
          var3 = this.field_c * this.field_b / 2;
          if (0 == this.field_b * this.field_c % 2) {
            var3 = var3 - this.field_c / 2;
            break L0;
          } else {
            break L0;
          }
        }
        var4 = this.a(var3, this.field_c, this.field_b, -120, var13.field_e.length);
        var4.field_L = 2;
        var5 = 0;
        L1: while (true) {
          if (-5 >= (var5 ^ -1)) {
            L2: {
              var4.field_I = ks.field_c + " " + String.valueOf((char)(65 + qf.a((byte) 114, 26, var13.field_j))) + String.valueOf((char)(65 + qf.a((byte) 30, 26, var13.field_j))) + String.valueOf((char)(65 + qf.a((byte) 24, 26, var13.field_j))) + "-" + 5;
              var4.field_x = 30;
              var4.field_B = 8;
              var4.field_u = true;
              var6 = 68 % ((-67 - param0) / 44);
              var4.field_r = new jd[6];
              if (var3 / this.field_c % 2 != 0) {
                stackIn_9_0 = 0;
                break L2;
              } else {
                stackIn_9_0 = 1;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_9_0;
              stackIn_11_0 = var4.field_r;

              stackIn_11_1 = 0;

              stackIn_11_2 = null;

              stackIn_11_3 = null;

              stackIn_11_4 = (ln) (var4);

              stackIn_11_5 = this.field_f;

              stackIn_11_6 = var3 - this.field_c;

              if (var5 == 0) {
                stackIn_12_0 = (jd[]) ((Object) stackIn_11_0);
                stackIn_12_1 = stackIn_11_1;
                stackIn_12_2 = null;
                stackIn_12_3 = null;
                stackIn_12_4 = (ln) ((Object) stackIn_11_4);
                stackIn_12_5 = (ln[]) ((Object) stackIn_11_5);
                stackIn_12_6 = stackIn_11_6;
                stackIn_12_7 = 0;
                break L3;
              } else {
                stackIn_12_0 = (jd[]) ((Object) stackIn_11_0);
                stackIn_12_1 = stackIn_11_1;
                stackIn_12_2 = null;
                stackIn_12_3 = null;
                stackIn_12_4 = (ln) ((Object) stackIn_11_4);
                stackIn_12_5 = (ln[]) ((Object) stackIn_11_5);
                stackIn_12_6 = stackIn_11_6;
                stackIn_12_7 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_12_0[stackIn_12_1] = new jd(stackIn_12_4, stackIn_12_5[stackIn_12_6 - stackIn_12_7], (ln) null, var4.field_A, (int)((double)var4.field_S - rh.field_d * 200.0 * 0.5), 0);
              stackIn_14_0 = var4.field_r;

              stackIn_14_1 = 1;

              stackIn_14_2 = null;

              stackIn_14_3 = null;

              stackIn_14_4 = (ln) (var4);

              stackIn_14_5 = this.field_f;

              stackIn_14_6 = var3;

              stackIn_14_7 = this.field_c;

              if (var5 != 0) {
                stackIn_15_0 = (jd[]) ((Object) stackIn_14_0);
                stackIn_15_1 = stackIn_14_1;
                stackIn_15_2 = null;
                stackIn_15_3 = null;
                stackIn_15_4 = (ln) ((Object) stackIn_14_4);
                stackIn_15_5 = (ln[]) ((Object) stackIn_14_5);
                stackIn_15_6 = stackIn_14_6;
                stackIn_15_7 = stackIn_14_7;
                stackIn_15_8 = 0;
                break L4;
              } else {
                stackIn_15_0 = (jd[]) ((Object) stackIn_14_0);
                stackIn_15_1 = stackIn_14_1;
                stackIn_15_2 = null;
                stackIn_15_3 = null;
                stackIn_15_4 = (ln) ((Object) stackIn_14_4);
                stackIn_15_5 = (ln[]) ((Object) stackIn_14_5);
                stackIn_15_6 = stackIn_14_6;
                stackIn_15_7 = stackIn_14_7;
                stackIn_15_8 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_15_0[stackIn_15_1] = new jd(stackIn_15_4, stackIn_15_5[stackIn_15_6 - (stackIn_15_7 - stackIn_15_8)], (ln) null, 100 + var4.field_A, (int)((double)var4.field_S - 0.25 * (200.0 * rh.field_d)), 0);
              var4.field_r[2] = new jd(var4, this.field_f[var3 - -1], (ln) null, 100 + var4.field_A, (int)((double)var4.field_S + 0.25 * (rh.field_d * 200.0)), 0);
              stackIn_17_0 = var4.field_r;

              stackIn_17_1 = 3;

              stackIn_17_2 = null;

              stackIn_17_3 = null;

              stackIn_17_4 = (ln) (var4);

              stackIn_17_5 = this.field_f;

              stackIn_17_6 = -this.field_c;

              stackIn_17_7 = var3;

              if (var5 == 0) {
                stackIn_18_0 = (jd[]) ((Object) stackIn_17_0);
                stackIn_18_1 = stackIn_17_1;
                stackIn_18_2 = null;
                stackIn_18_3 = null;
                stackIn_18_4 = (ln) ((Object) stackIn_17_4);
                stackIn_18_5 = (ln[]) ((Object) stackIn_17_5);
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 1;
                break L5;
              } else {
                stackIn_18_0 = (jd[]) ((Object) stackIn_17_0);
                stackIn_18_1 = stackIn_17_1;
                stackIn_18_2 = null;
                stackIn_18_3 = null;
                stackIn_18_4 = (ln) ((Object) stackIn_17_4);
                stackIn_18_5 = (ln[]) ((Object) stackIn_17_5);
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 0;
                break L5;
              }
            }
            L6: {
              stackIn_18_0[stackIn_18_1] = new jd(stackIn_18_4, stackIn_18_5[stackIn_18_6 + (stackIn_18_7 + stackIn_18_8)], (ln) null, var4.field_A, (int)(rh.field_d * 200.0 * 0.5 + (double)var4.field_S), 0);
              stackIn_20_0 = var4.field_r;

              stackIn_20_1 = 4;

              stackIn_20_2 = null;

              stackIn_20_3 = null;

              stackIn_20_4 = (ln) (var4);

              stackIn_20_5 = this.field_f;

              stackIn_20_6 = var3;

              stackIn_20_7 = this.field_c;

              if (var5 == 0) {
                stackIn_21_0 = (jd[]) ((Object) stackIn_20_0);
                stackIn_21_1 = stackIn_20_1;
                stackIn_21_2 = null;
                stackIn_21_3 = null;
                stackIn_21_4 = (ln) ((Object) stackIn_20_4);
                stackIn_21_5 = (ln[]) ((Object) stackIn_20_5);
                stackIn_21_6 = stackIn_20_6;
                stackIn_21_7 = stackIn_20_7;
                stackIn_21_8 = 0;
                break L6;
              } else {
                stackIn_21_0 = (jd[]) ((Object) stackIn_20_0);
                stackIn_21_1 = stackIn_20_1;
                stackIn_21_2 = null;
                stackIn_21_3 = null;
                stackIn_21_4 = (ln) ((Object) stackIn_20_4);
                stackIn_21_5 = (ln[]) ((Object) stackIn_20_5);
                stackIn_21_6 = stackIn_20_6;
                stackIn_21_7 = stackIn_20_7;
                stackIn_21_8 = 1;
                break L6;
              }
            }
            stackIn_21_0[stackIn_21_1] = new jd(stackIn_21_4, stackIn_21_5[stackIn_21_6 - (stackIn_21_7 + stackIn_21_8)], (ln) null, -100 + var4.field_A, (int)(0.25 * (200.0 * rh.field_d) + (double)var4.field_S), 0);
            var4.field_r[5] = new jd(var4, this.field_f[-1 + var3], (ln) null, -100 + var4.field_A, (int)((double)var4.field_S - 0.25 * (200.0 * rh.field_d)), 0);
            var7_int = 0;
            L7: while (true) {
              if (-7 >= (var7_int ^ -1)) {
                var4.field_D = new ln[]{};
                var7 = new ln[var13.field_e.length - -1];
                ps.a(var13.field_e, 0, var7, 0, var13.field_e.length);
                var7[var13.field_e.length] = var4;
                var13.field_e = var7;
                var13.a(26253);
                var13.b((byte) 80);
                var8 = var13.field_e;
                var9 = 0;
                L8: while (true) {
                  if (var9 >= var8.length) {
                    return var13;
                  } else {
                    var10 = var8[var9];
                    if (2 == var10.field_L) {
                      if (var10 != var4) {
                        var11 = 0;
                        L9: while (true) {
                          if (4 <= var11) {
                            L10: {
                              stackIn_35_0 = (ln) (var10);

                              if (var10.field_p % 2 != 0) {
                                stackIn_36_0 = (ln) ((Object) stackIn_35_0);
                                stackIn_36_1 = 7;
                                break L10;
                              } else {
                                stackIn_36_0 = (ln) ((Object) stackIn_35_0);
                                stackIn_36_1 = 6;
                                break L10;
                              }
                            }
                            stackIn_36_0.field_B = stackIn_36_1;
                            var10.field_I = ks.field_c + " " + String.valueOf((char)(qf.a((byte) 46, 26, var13.field_j) - -65)) + String.valueOf((char)(qf.a((byte) 20, 26, var13.field_j) - -65)) + String.valueOf((char)(65 + qf.a((byte) 5, 26, var13.field_j))) + "-" + 2;
                            var10.field_x = 15;
                            var9++;
                            continue L8;
                          } else {
                            var10.field_G[var11] = -2;
                            var11++;
                            continue L9;
                          }
                        }
                      } else {
                        var9++;
                        continue L8;
                      }
                    } else {
                      var9++;
                      continue L8;
                    }
                  }
                }
              } else {
                var4.field_r[var7_int].field_g = (int)(0.5 * (200.0 * rh.field_d));
                var7_int++;
                continue L7;
              }
            }
          } else {
            var4.field_G[var5] = -5;
            var5++;
            continue L1;
          }
        }
    }

    final static int a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var6 = (CharSequence) null;
                pc.a(false, (CharSequence) null);
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_7_0 = var3;
                break L0;
              } else {
                var3 = q.a((byte) -123, param1.charAt(var4)) + (var3 << -2091368667) - var3;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("pc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static String a(boolean param0) {
        if (param0) {
            CharSequence var2 = (CharSequence) null;
            pc.a(false, (CharSequence) null);
        }
        return sa.field_a.e(-1);
    }

    final void a(boolean param0, l param1) throws jn {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          L0: {
            L1: {
              this.field_f = new ln[this.field_c * this.field_b];
              var3_int = this.field_f.length / 2;
              if (-1 != (this.field_c * this.field_b % 2 ^ -1)) {
                break L1;
              } else {
                var3_int = var3_int - this.field_c / 2;
                break L1;
              }
            }
            L2: {
              this.field_f[var3_int] = li.field_b;
              this.field_f[var3_int - 1] = li.field_b;
              this.field_f[1 + var3_int] = li.field_b;
              this.field_f[this.field_c + var3_int] = li.field_b;
              this.field_f[var3_int - this.field_c] = li.field_b;
              if (var3_int / this.field_c % 2 != 0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_5_0;
              if (var4 != 0) {
                this.field_f[-1 + (-this.field_c + var3_int)] = li.field_b;
                this.field_f[-1 + (this.field_c + var3_int)] = li.field_b;
                break L3;
              } else {
                this.field_f[1 + (-this.field_c + var3_int)] = li.field_b;
                this.field_f[var3_int + this.field_c - -1] = li.field_b;
                break L3;
              }
            }
            super.a(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("pc.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public static void d(int param0) {
        field_r = null;
        if (param0 <= 57) {
            field_r = (String) null;
        }
        field_n = null;
        field_o = null;
        field_p = null;
    }

    static {
        field_o = "Elapsed time";
        field_p = "Type your age in years";
        field_m = 480;
    }
}
