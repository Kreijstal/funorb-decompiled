/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

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
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = ((pf) this).field_b.field_h;
            var4 = 0;
            L1: while (true) {
              if (var4 >= param1.length) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var5 = param1[var4];
                if (var5.field_c != var3_int) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_6_0 = var4;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("pf.J(").append(6481).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    private final int a(int param0, int param1, dk[] param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
            var5_int = 442 + -param1;
            var6 = this.a((byte) -106, param2);
            var7 = (var5_int - var6) / 2;
            var8 = 442 - var7;
            stackOut_0_0 = var8;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("pf.F(").append(4).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 442 + 41);
        }
        return stackIn_1_0;
    }

    private final int b() {
        int var2 = this.a(6481, ((pf) this).field_c);
        if (var2 == 0) {
            return 1;
        }
        if (!(1 != var2)) {
            return 0;
        }
        if (!(2 != var2)) {
            return 2;
        }
        if (var2 == 3) {
            return 3;
        }
        return -1;
    }

    final void d(int param0) {
        if (param0 != 100) {
            ((pf) this).field_a = null;
        }
        em.d();
        od.b(param0 + -98);
        pb.a(4);
        this.a(((pf) this).field_c, (byte) -116);
        this.a(((pf) this).field_a, (byte) -109);
    }

    private final int a(int param0, int param1, int param2) {
        int discarded$0 = 3;
        int var4 = this.a(param1, ((pf) this).field_c, param2);
        if (var4 >= 0) {
            return var4;
        }
        int discarded$1 = 3;
        var4 = this.a(param1, ((pf) this).field_a, param2);
        if (!(var4 < 0)) {
            return var4;
        }
        return -1;
    }

    private final boolean b(int param0, dk[] param1, dk[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 > 7) {
              var4_int = this.a(6481, param1);
              if (var4_int >= 0) {
                L1: {
                  if (var4_int == 0) {
                    var5 = param2[param2.length - 1].field_c;
                    ((pf) this).field_b.a(false, var5);
                    break L1;
                  } else {
                    var5 = param1[var4_int + -1].field_c;
                    ((pf) this).field_b.a(false, var5);
                    break L1;
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("pf.P(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final int a(byte param0, dk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
            var3_int = param1.field_p / 2 + param1.field_f;
            var4 = 16384 * var3_int / 640;
            var5 = 51 % ((param0 - 56) / 58);
            stackOut_0_0 = var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("pf.EA(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    private final int[] a(int param0, int param1, ih param2, byte param3) {
        RuntimeException var5 = null;
        String[] var5_array = null;
        int[] var6 = null;
        ed[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        Object var11 = null;
        int[] var15 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
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
            L1: {
              if (param3 >= 91) {
                break L1;
              } else {
                var11 = null;
                int[] discarded$1 = this.a(20, -91, (ih) null, (byte) -102);
                break L1;
              }
            }
            L2: {
              if (bj.e((byte) 127)) {
                var5_array = pl.field_s;
                var6 = new int[]{1, 0, 2, 3};
                var7 = pj.field_g;
                var8 = new int[]{0, 1, 2, 3};
                break L2;
              } else {
                var8 = new int[]{0, 1};
                var6 = new int[]{1, 0};
                var7 = new ed[]{pj.field_g[0], pj.field_g[1]};
                var5_array = new String[]{pl.field_s[0], pl.field_s[1]};
                break L2;
              }
            }
            var9 = var5_array.length;
            var15 = this.a(param0, true, var9);
            this.a(3390, param1, var5_array, var7, var15, param2, var8);
            stackOut_5_0 = (int[]) var6;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("pf.S(").append(param0).append(44).append(param1).append(44);
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
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
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 640;
              var7 = 442;
              if (!aj.b(-96)) {
                var10 = new int[]{0};
                var8 = new int[]{4};
                var9 = new String[]{ag.field_a};
                break L1;
              } else {
                var9 = new String[]{cn.field_e, ag.field_a};
                var10 = new int[]{0, 1};
                var8 = new int[]{3, 4};
                break L1;
              }
            }
            var11 = var9.length;
            var20 = this.a(param3, true, var11);
            int discarded$2 = -17;
            var21 = vl.a(10, param3, var11);
            ((pf) this).field_a = na.a(var6, var20, var7, var5_int, param0, var9, var10, false, var21);
            stackOut_3_0 = (int[]) var8;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("pf.CA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 84 + 44 + 10 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(dk[] param0, byte param1) {
        dk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        dk[] var9 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var9 = param0;
            var3 = var9;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var9.length) {
                L2: {
                  if (param1 <= -39) {
                    break L2;
                  } else {
                    var8 = null;
                    int[] discarded$2 = this.a(28, -16, (ih) null, (byte) 69);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var9[var4];
                  if (((pf) this).field_b.field_h != var5.field_c) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L3;
                  }
                }
                var6 = stackIn_6_0;
                var5.a(-16383, var6 != 0);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("pf.H(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    private final boolean a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (!pn.p(-98)) {
            return false;
          } else {
            L1: {
              L2: {
                ((pf) this).field_b.a(113);
                if (nk.field_n == 97) {
                  break L2;
                } else {
                  if (nk.field_n != 99) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var4 = this.a(-101, ((pf) this).field_c, ((pf) this).field_a) ? 1 : 0;
                if (var4 != 0) {
                  break L3;
                } else {
                  var4 = this.a(-101, ((pf) this).field_a, ((pf) this).field_c) ? 1 : 0;
                  break L3;
                }
              }
              if (var4 != 0) {
                break L1;
              } else {
                ((pf) this).field_b.a(false, 0);
                break L1;
              }
            }
            L4: {
              L5: {
                if (96 == nk.field_n) {
                  break L5;
                } else {
                  if (nk.field_n != 98) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                var4 = this.b(33, ((pf) this).field_c, ((pf) this).field_a) ? 1 : 0;
                if (var4 == 0) {
                  var4 = this.b(84, ((pf) this).field_a, ((pf) this).field_c) ? 1 : 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 != 0) {
                break L4;
              } else {
                ((pf) this).field_b.a(false, 0);
                break L4;
              }
            }
            L7: {
              if (nk.field_n != 13) {
                break L7;
              } else {
                pg.field_b = false;
                qk.a(var2 != 0, -87);
                break L7;
              }
            }
            int discarded$5 = 91;
            if (this.a(var2 != 0)) {
              return true;
            } else {
              continue L0;
            }
          }
        }
    }

    final void e(int param0) {
        int discarded$0 = 16;
        this.c();
        int discarded$1 = 94;
        if (!(!this.a())) {
            return;
        }
        if (param0 <= 61) {
            field_h = null;
        }
        int var2 = this.a(1, bj.field_y, dh.field_d);
        int var3 = this.a(1, ng.field_ob, sf.field_c);
        ((pf) this).field_b.a(var3, (byte) 121, var2);
        int discarded$2 = 91;
        boolean discarded$3 = this.a(true);
    }

    private final int a(int param0, dk[] param1, int param2) {
        dk[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        dk var7 = null;
        int var8 = 0;
        dk[] var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var10 = param1;
            var5 = var10;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var10.length) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var7 = var10[var6];
                if (!var7.a((byte) 65, param2, param0)) {
                  var6++;
                  continue L1;
                } else {
                  stackOut_4_0 = var7.field_c;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("pf.AA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + 3 + 41);
        }
        return stackIn_10_0;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        Throwable var6 = null;
        Throwable decompiledCaughtException = null;
        var2 = -84;
        if (!((pf) this).field_b.field_e) {
          return;
        } else {
          var3 = 100;
          var4 = 1536 * qm.field_c / 64;
          var5 = (Object) (Object) rk.field_e;
          synchronized (var5) {
            L0: {
              this.a(((pf) this).field_c, (byte) -23, var3, var4);
              this.a(((pf) this).field_a, (byte) -23, var3, var4);
              break L0;
            }
          }
          return;
        }
    }

    private final void b(int param0) {
        pa.a(true);
        mj.field_d = 0;
        gi.a((byte) -113);
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        oh var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        oh var6 = null;
        int var7 = 0;
        oh var7_ref_oh = null;
        oh var8_ref_oh = null;
        int var8 = 0;
        int var9 = 0;
        oh var10 = null;
        oh var11 = null;
        oh var12 = null;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_74_0 = 0;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (mh.field_e >= 100) {
                break L1;
              } else {
                if (Math.random() < 0.05 * (double)(100 - mh.field_e) / 100.0) {
                  L2: {
                    var10 = new oh();
                    var11 = var10;
                    if (Math.random() < 0.5) {
                      var11.field_m = 1;
                      var11.field_i = 0;
                      break L2;
                    } else {
                      var10.field_m = -1;
                      var10.field_i = 640;
                      break L2;
                    }
                  }
                  L3: {
                    var11.field_q = 0 - -((int)(81.0 * Math.random()) * 6);
                    var11.field_h = 50 + (int)(100.0 * Math.random());
                    var11.field_o = (int)(Math.random() * 200.0) + 100;
                    var2 = (int)(7.0 * Math.random());
                    if (var2 < 0) {
                      var2 = 0;
                      break L3;
                    } else {
                      if (var2 <= 6) {
                        break L3;
                      } else {
                        var2 = 6;
                        break L3;
                      }
                    }
                  }
                  var11.field_l = -var2 + 6;
                  var11.field_j = var2;
                  wa.field_c.a(-12328, (hg) (Object) var11);
                  if (var11.field_o >= 100) {
                    mh.field_e = mh.field_e + 1;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L4: {
              if (param0 <= -94) {
                break L4;
              } else {
                pf.e((byte) 116);
                break L4;
              }
            }
            var1_ref = (oh) (Object) wa.field_c.a(false);
            L5: while (true) {
              if (var1_ref == null) {
                var1_ref = (oh) (Object) si.field_u.a(false);
                L6: while (true) {
                  if (var1_ref == null) {
                    break L0;
                  } else {
                    L7: {
                      var2 = 0;
                      if (~var1_ref.field_r > ~var1_ref.field_o) {
                        L8: {
                          if (~var1_ref.field_s <= ~var1_ref.field_h) {
                            break L8;
                          } else {
                            var1_ref.field_s = var1_ref.field_s + 1;
                            break L8;
                          }
                        }
                        var1_ref.field_r = var1_ref.field_r + 1;
                        if (var1_ref.field_s % 6 != 0) {
                          break L7;
                        } else {
                          var2 = 1;
                          break L7;
                        }
                      } else {
                        if (var1_ref.field_s <= 0) {
                          var1_ref.c((byte) -59);
                          break L7;
                        } else {
                          var1_ref.field_q = var1_ref.field_q + var1_ref.field_m;
                          var1_ref.field_s = var1_ref.field_s - 1;
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (var1_ref.field_m >= 0) {
                        break L9;
                      } else {
                        if (var1_ref.field_i <= 0) {
                          var1_ref.c((byte) -56);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var1_ref.field_m <= 0) {
                        break L10;
                      } else {
                        if (480 <= var1_ref.field_i) {
                          var1_ref.c((byte) -113);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var2 == 0) {
                        break L11;
                      } else {
                        L12: {
                          L13: {
                            if (mh.field_e >= 100) {
                              break L13;
                            } else {
                              if (Math.random() >= (double)((500 - mh.field_e * 5) / 100)) {
                                break L13;
                              } else {
                                stackOut_69_0 = 1;
                                stackIn_71_0 = stackOut_69_0;
                                break L12;
                              }
                            }
                          }
                          stackOut_70_0 = 0;
                          stackIn_71_0 = stackOut_70_0;
                          break L12;
                        }
                        L14: {
                          L15: {
                            var3 = stackIn_71_0;
                            if (mh.field_e >= 100) {
                              break L15;
                            } else {
                              if (Math.random() >= (double)((100 - mh.field_e) * 5 / 100)) {
                                break L15;
                              } else {
                                stackOut_73_0 = 1;
                                stackIn_75_0 = stackOut_73_0;
                                break L14;
                              }
                            }
                          }
                          stackOut_74_0 = 0;
                          stackIn_75_0 = stackOut_74_0;
                          break L14;
                        }
                        L16: {
                          var4 = stackIn_75_0;
                          var5 = var1_ref.field_q - -(var1_ref.field_s * var1_ref.field_m);
                          if (var1_ref.field_m >= 0) {
                            break L16;
                          } else {
                            var5--;
                            break L16;
                          }
                        }
                        L17: {
                          var6 = new oh();
                          var6.field_q = var5;
                          var6.field_m = -1;
                          var6.field_i = 1 + var1_ref.field_i;
                          var6.field_h = 50 - -(int)(Math.random() * 100.0);
                          if (var3 == 0) {
                            var6.field_o = (int)(Math.random() * 40.0) + 10;
                            break L17;
                          } else {
                            L18: {
                              var6.field_o = 100 + (int)(200.0 * Math.random());
                              var7 = (int)(Math.random() * 7.0);
                              if (var7 >= 0) {
                                if (6 < var7) {
                                  var7 = 6;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              } else {
                                var7 = 0;
                                break L18;
                              }
                            }
                            var6.field_j = var7;
                            var6.field_l = -var7 + 6;
                            break L17;
                          }
                        }
                        L19: {
                          wa.field_c.a(-12328, (hg) (Object) var6);
                          if (100 <= var6.field_o) {
                            mh.field_e = mh.field_e + 1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          var12 = new oh();
                          var12.field_i = var1_ref.field_i;
                          var12.field_q = var5;
                          var12.field_m = 1;
                          var12.field_h = 50 + (int)(Math.random() * 100.0);
                          if (var4 == 0) {
                            var12.field_o = 10 - -(int)(40.0 * Math.random());
                            break L20;
                          } else {
                            L21: {
                              var12.field_o = 100 - -(int)(200.0 * Math.random());
                              var8 = (int)(Math.random() * 7.0);
                              if (var8 >= 0) {
                                if (var8 <= 6) {
                                  break L21;
                                } else {
                                  var8 = 6;
                                  break L21;
                                }
                              } else {
                                var8 = 0;
                                break L21;
                              }
                            }
                            var12.field_j = var8;
                            var12.field_l = 6 + -var8;
                            break L20;
                          }
                        }
                        wa.field_c.a(-12328, (hg) (Object) var12);
                        if (100 <= var12.field_o) {
                          mh.field_e = mh.field_e + 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var1_ref = (oh) (Object) si.field_u.b((byte) 70);
                    continue L6;
                  }
                }
              } else {
                L22: {
                  if (var1_ref.field_o > var1_ref.field_r) {
                    var1_ref.field_r = var1_ref.field_r + 1;
                    if (~var1_ref.field_s <= ~var1_ref.field_h) {
                      var1_ref.field_i = var1_ref.field_i + var1_ref.field_m;
                      break L22;
                    } else {
                      var1_ref.field_s = var1_ref.field_s + 1;
                      break L22;
                    }
                  } else {
                    if (var1_ref.field_s > 0) {
                      var1_ref.field_s = var1_ref.field_s - 1;
                      var1_ref.field_i = var1_ref.field_i + var1_ref.field_m;
                      break L22;
                    } else {
                      var1_ref.c((byte) -33);
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var1_ref.field_m >= 0) {
                    break L23;
                  } else {
                    if (var1_ref.field_i <= 0) {
                      var1_ref.c((byte) -26);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                L24: {
                  if (0 >= var1_ref.field_m) {
                    break L24;
                  } else {
                    if (640 > var1_ref.field_i) {
                      break L24;
                    } else {
                      var1_ref.c((byte) -69);
                      break L24;
                    }
                  }
                }
                L25: {
                  if (var1_ref.b((byte) 48)) {
                    break L25;
                  } else {
                    if (100 <= var1_ref.field_o) {
                      mh.field_e = mh.field_e - 1;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
                var2 = (var1_ref.field_o + -50) / 20;
                var3 = 0;
                L26: while (true) {
                  if (~var3 <= ~var2) {
                    var1_ref = (oh) (Object) wa.field_c.b((byte) 70);
                    continue L5;
                  } else {
                    L27: {
                      if (~(-(3 * (-var3 + var2)) + var1_ref.field_o) != ~var1_ref.field_r) {
                        break L27;
                      } else {
                        L28: {
                          var4 = var1_ref.field_i - -(var1_ref.field_m * (var1_ref.field_s + (var1_ref.field_o - var1_ref.field_r)));
                          var5 = var4;
                          if (var1_ref.field_m > 0) {
                            var5 += 5;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          var5 = 2 - -((var5 - 2) / 6 * 6);
                          var5 = var5 - (var2 + -var3) * (6 * var1_ref.field_m);
                          var6_int = (int)(Math.random() * (double)var1_ref.field_j);
                          if (var6_int <= 0) {
                            break L29;
                          } else {
                            var7_ref_oh = new oh();
                            var7_ref_oh.field_i = var5;
                            var7_ref_oh.field_s = 1;
                            var7_ref_oh.field_h = 1 - -(6 * var6_int);
                            var7_ref_oh.field_o = 50;
                            var7_ref_oh.field_q = var1_ref.field_q - -1;
                            var7_ref_oh.field_m = -1;
                            si.field_u.a(-12328, (hg) (Object) var7_ref_oh);
                            break L29;
                          }
                        }
                        var7 = (int)(Math.random() * (double)var1_ref.field_l);
                        if (0 >= var7) {
                          break L27;
                        } else {
                          var8_ref_oh = new oh();
                          var8_ref_oh.field_s = 1;
                          var8_ref_oh.field_q = var1_ref.field_q;
                          var8_ref_oh.field_o = 50;
                          var8_ref_oh.field_h = 1 - -(6 * var7);
                          var8_ref_oh.field_m = 1;
                          var8_ref_oh.field_i = var5;
                          si.field_u.a(-12328, (hg) (Object) var8_ref_oh);
                          break L27;
                        }
                      }
                    }
                    var3++;
                    continue L26;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "pf.C(" + param0 + 41);
        }
    }

    private final void a(int param0, int param1, dk[] param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        dk var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var7_int = mj.field_d;
            if (param3 <= var7_int) {
              if (var7_int % 10 == 0) {
                var8 = param3 - -(10 * (-1 + param2.length));
                if (var7_int > var8) {
                  return;
                } else {
                  L1: {
                    var9 = (var7_int + -param3) / 10;
                    if (var9 < 0) {
                      break L1;
                    } else {
                      if (var9 < param2.length) {
                        var10 = param2[var9];
                        var11 = this.a((byte) 120, var10);
                        rk.field_e.a(pc.field_a, 100, param5, var11);
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("pf.V(").append(10).append(44).append(6).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + 100 + 44 + param5 + 41);
        }
    }

    private final boolean a(boolean param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        this.c(113);
        if (!((pf) this).field_b.b((byte) -18)) {
          return false;
        } else {
          L0: {
            var3 = ((pf) this).field_b.field_h;
            if (var3 < 0) {
              break L0;
            } else {
              if (((pf) this).field_d.length <= var3) {
                break L0;
              } else {
                L1: {
                  var4 = ((pf) this).field_d[var3];
                  if (var4 != 3) {
                    break L1;
                  } else {
                    if (aj.b(-100)) {
                      this.b(-15268);
                      return true;
                    } else {
                      break L1;
                    }
                  }
                }
                if (4 == var4) {
                  pg.field_b = false;
                  qk.a(param0, 125);
                  return true;
                } else {
                  int discarded$2 = 89;
                  if (this.b() != var4) {
                    return false;
                  } else {
                    pg.field_b = false;
                    var5 = l.a(-8462, var4);
                    ll.a(0, var5, param0, ((pf) this).field_f);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    private final boolean a(int param0, dk[] param1, dk[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = this.a(6481, param1);
            if (var4_int < 0) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              L1: {
                if (param1.length - 1 > var4_int) {
                  var5 = param1[var4_int - -1].field_c;
                  ((pf) this).field_b.a(false, var5);
                  break L1;
                } else {
                  var5 = param2[0].field_c;
                  ((pf) this).field_b.a(false, var5);
                  break L1;
                }
              }
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("pf.BA(").append(-101).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    private final void c() {
        if (!(mj.field_d != 0)) {
            sj.a(8192, (byte) 51);
        }
        de.field_j = true;
        int var2 = 6144 * qm.field_c / 64;
        int var3 = 100;
        int var4 = 10;
        int var5 = var4;
        this.a(var4, 6, ((pf) this).field_c, var5, var3, var2);
        var5 = var5 + var4 * ((pf) this).field_c.length;
        this.a(var4, 6, ((pf) this).field_a, var5, var3, var2);
        if (!(mj.field_d >= 1000)) {
            mj.field_d = mj.field_d + 1;
        }
    }

    private final int[] a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param2];
        int[] var4 = var7;
        for (var5 = 0; var5 < param2; var5++) {
            var7[var5] = param0 - -var5;
        }
        return var4;
    }

    private final int a(byte param0, dk[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        dk[] var4 = null;
        int var5 = 0;
        dk var6 = null;
        int var7 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = 0;
            var4 = param1;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                stackOut_7_0 = var3_int;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L2: {
                  var6 = var4[var5];
                  if (var6.field_i > var3_int) {
                    var3_int = var6.field_i;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("pf.D(").append(-106).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    private final void a(int param0, int param1, String[] param2, ed[] param3, int[] param4, ih param5, int[] param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
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
        int var20 = 0;
        dk var21 = null;
        int var22 = 0;
        int var23 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var23 = EscapeVector.field_A;
        try {
          L0: {
            var8_int = 2;
            var9 = param2.length;
            ((pf) this).field_c = new dk[var9];
            var10 = 0;
            var11 = 0;
            L1: while (true) {
              if (var11 >= var9) {
                var11 = 640;
                var12 = na.a(1, var9, var11, var10);
                var13 = dd.a(var10, (byte) 86, var11, var9, var12);
                var14 = 0;
                var15 = var14 + var13;
                var16 = k.field_j.field_z / 2 + 77;
                var17 = 442;
                var18 = this.a(4, var16, ((pf) this).field_c);
                var19 = ((pf) this).field_c;
                var20 = 0;
                L2: while (true) {
                  if (var19.length <= var20) {
                    break L0;
                  } else {
                    var21 = var19[var20];
                    var22 = var18 + -var21.field_i;
                    var21.b((byte) 39, var15, var22);
                    var15 = var15 + (var12 + var21.field_p);
                    var20++;
                    continue L2;
                  }
                }
              } else {
                var12_ref_dk = new dk(var8_int, param4[var11], param2[var11], param1, param3[var11], param6[var11], param5);
                ((pf) this).field_c[var11] = var12_ref_dk;
                var10 = var10 + var12_ref_dk.field_p;
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var8;
            stackOut_10_1 = new StringBuilder().append("pf.B(").append(3390).append(44).append(param1).append(44);
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    private final void d() {
        ih var2 = fh.field_g;
        int var3 = 10;
        int[] var4 = this.a(0, var3, var2, (byte) 102);
        int[] var5 = this.a(var2, 84, var3, var4.length);
        int var6 = var4.length - -var5.length;
        int var7 = 60;
        ((pf) this).field_d = new int[var6];
        qg.a(var4, 0, ((pf) this).field_d, 0, var4.length);
        qg.a(var5, 0, ((pf) this).field_d, var4.length, var5.length);
        int discarded$0 = 0;
        fi.a(((pf) this).field_c);
        int discarded$1 = 0;
        fi.a(((pf) this).field_a);
    }

    final static void a(boolean param0, String param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            la var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            lk stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            lk stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            lk stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            String stackIn_14_6 = null;
            Throwable decompiledCaughtException = null;
            lk stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            lk stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            lk stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            var6 = EscapeVector.field_A;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 == null) {
                    break L1;
                  } else {
                    int discarded$2 = 41;
                    var3_ref = jg.a(param2);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param2 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                je.a(false, var3_ref);
                var3_ref = vg.a(var3_ref, ":", (byte) 111, "%3a");
                var3_ref = vg.a(var3_ref, "@", (byte) 111, "%40");
                var3_ref = vg.a(var3_ref, "&", (byte) 111, "%26");
                var7 = vg.a(var3_ref, "#", (byte) 111, "%23");
                if (hg.field_c == null) {
                  return;
                } else {
                  L4: {
                    stackOut_11_0 = ae.field_a;
                    stackOut_11_1 = -12;
                    stackOut_11_2 = null;
                    stackOut_11_3 = null;
                    stackOut_11_4 = hg.field_c.getCodeBase();
                    stackOut_11_5 = new StringBuilder().append("clienterror.ws?c=").append(uf.field_n).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_13_5 = stackOut_11_5;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    stackIn_12_5 = stackOut_11_5;
                    if (null != eh.field_g) {
                      stackOut_13_0 = (lk) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                      stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                      stackOut_13_6 = eh.field_g;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      stackIn_14_6 = stackOut_13_6;
                      break L4;
                    } else {
                      stackOut_12_0 = (lk) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = "" + eb.field_J;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      stackIn_14_6 = stackOut_12_6;
                      break L4;
                    }
                  }
                  var4 = ((lk) (Object) stackIn_14_0).a((byte) stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + lk.field_s + "&v2=" + lk.field_v + "&e=" + var7));
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if (var4.field_f == 1) {
                          var5 = (DataInputStream) var4.field_b;
                          int discarded$3 = var5.read();
                          var5.close();
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      en.a((byte) 105, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, byte param1, int param2) {
        ((pf) this).field_b = new wc(param2);
        int discarded$0 = 3;
        int var4 = this.a(bj.field_y, ((pf) this).field_c, dh.field_d);
        if (var4 < 0) {
            int discarded$1 = 3;
            var4 = this.a(bj.field_y, ((pf) this).field_a, dh.field_d);
        }
        ((pf) this).field_b.a(125, param0, var4, 0);
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_g = null;
    }

    private final void a(dk[] param0, byte param1, int param2, int param3) {
        int var9 = 0;
        int var5_int = this.a(6481, param0);
        if (!(var5_int >= 0)) {
            return;
        }
        dk var6 = param0[var5_int];
        int var7 = var6.field_c;
        int var8 = ((pf) this).field_b.field_h;
        if (var7 != var8) {
            return;
        }
        try {
            var9 = this.a((byte) -97, var6);
            rk.field_e.a(oa.field_w, 100, param3, var9);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pf.G(" + (param0 != null ? "{...}" : "null") + 44 + -23 + 44 + 100 + 44 + param3 + 41);
        }
    }

    pf(boolean param0) {
        int discarded$0 = -35;
        this.d();
        int var2 = ((pf) this).field_d.length;
        this.a(param0, (byte) -73, var2);
        ((pf) this).field_f = vh.f(104);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 1;
        field_g = new ed[7];
        field_h = "Level complete.";
        field_e = new String[16];
    }
}
