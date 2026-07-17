/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fd extends uw {
    private long[] field_h;
    private int field_f;
    private long field_l;
    static String field_i;
    static long field_k;
    private long field_e;
    private long field_j;
    static Random field_d;
    private int field_g;

    final void b(byte param0) {
        if (!(~((fd) this).field_e >= ~((fd) this).field_l)) {
            ((fd) this).field_l = ((fd) this).field_l + (-((fd) this).field_l + ((fd) this).field_e);
        }
        if (param0 != 105) {
            Object var3 = null;
            boolean discarded$0 = fd.a((js) null, (String) null, true, (String) null, (String) null, -8, -120);
        }
        ((fd) this).field_j = 0L;
    }

    final static boolean a(js param0, String param1, boolean param2, String param3, String param4, int param5, int param6) {
        uk var7 = null;
        RuntimeException var7_ref = null;
        uk var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param6 == 0) {
                break L1;
              } else {
                fd.c(127);
                break L1;
              }
            }
            if (hm.field_a != nw.field_e) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var8 = new uk(rf.field_a, param0);
              var7 = var8;
              rf.field_a.a((byte) 111, (pk) (Object) var8);
              if (fh.c(param6 ^ -123)) {
                var8.f(true);
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L2: {
                  if (!param2) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L2;
                  }
                }
                dv.field_b = stackIn_10_0 != 0;
                vr.field_G = param1;
                in.field_C = param3;
                eg.field_l = null;
                nw.field_e = ad.field_p;
                bi.field_d = param4;
                lq.field_d = param5;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7_ref;
            stackOut_13_1 = new StringBuilder().append("fd.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_12_0 != 0;
    }

    public static void c(int param0) {
        field_i = null;
        int var1 = 121 % ((75 - param0) / 32);
        field_d = null;
    }

    private final long a() {
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - ((fd) this).field_j;
        ((fd) this).field_j = var2;
        if (var4 > -5000000000L) {
            if (!(var4 >= 5000000000L)) {
                ((fd) this).field_h[((fd) this).field_g] = var4;
                ((fd) this).field_g = (1 + ((fd) this).field_g) % 10;
                if (((fd) this).field_f < 1) {
                    ((fd) this).field_f = ((fd) this).field_f + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((fd) this).field_f; var8++) {
            var6 = var6 + ((fd) this).field_h[(10 + (((fd) this).field_g - var8)) % 10];
        }
        return var6 / (long)((fd) this).field_f;
    }

    final static int b() {
        L0: {
          if (!oj.a(false)) {
            break L0;
          } else {
            if (null != pu.field_e.e((byte) 54)) {
              return pu.field_e.e((byte) 54).field_v;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final long a(byte param0) {
        int discarded$0 = 62;
        ((fd) this).field_l = ((fd) this).field_l + this.a();
        if (!(~((fd) this).field_l <= ~((fd) this).field_e)) {
            return (((fd) this).field_e + -((fd) this).field_l) / 1000000L;
        }
        int var2 = -94 / ((param0 - 42) / 37);
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            ((fd) this).b((byte) 73);
            break L0;
          }
        }
        if (~((fd) this).field_l > ~((fd) this).field_e) {
          ((fd) this).field_j = ((fd) this).field_j + (((fd) this).field_e - ((fd) this).field_l);
          ((fd) this).field_l = ((fd) this).field_l + (((fd) this).field_e + -((fd) this).field_l);
          ((fd) this).field_e = ((fd) this).field_e + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((fd) this).field_e = ((fd) this).field_e + param1;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if (((fd) this).field_l > ((fd) this).field_e) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((fd) this).field_l > ((fd) this).field_e) {
                ((fd) this).field_e = ((fd) this).field_l;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        }
    }

    fd() {
        ((fd) this).field_f = 1;
        ((fd) this).field_h = new long[10];
        ((fd) this).field_l = 0L;
        ((fd) this).field_e = 0L;
        ((fd) this).field_j = 0L;
        ((fd) this).field_g = 0;
        ((fd) this).field_l = System.nanoTime();
        ((fd) this).field_e = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Click";
        field_k = 0L;
        field_d = new Random();
    }
}
