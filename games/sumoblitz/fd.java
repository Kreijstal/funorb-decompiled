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
        if (!((this.field_e ^ -1L) >= (this.field_l ^ -1L))) {
            this.field_l = this.field_l + (-this.field_l + this.field_e);
        }
        if (param0 != 105) {
            String var3 = (String) null;
            fd.a((js) null, (String) null, true, (String) null, (String) null, -8, -120);
        }
        this.field_j = 0L;
    }

    final static boolean a(js param0, String param1, boolean param2, String param3, String param4, int param5, int param6) {
        uk var7 = null;
        RuntimeException var7_ref = null;
        uk var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = new uk(rf.field_a, param0);
              var7 = var8;
              rf.field_a.a((byte) 111, var8);
              if (fh.c(param6 ^ -123)) {
                var8.f(true);
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (!param2) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = 1;
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
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("fd.H(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void c(int param0) {
        field_i = null;
        int var1 = 121 % ((75 - param0) / 32);
        field_d = null;
    }

    private final long a(int param0) {
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_j;
        this.field_j = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (!(var4 >= 5000000000L)) {
                this.field_h[this.field_g] = var4;
                this.field_g = (1 + this.field_g) % 10;
                if (-2 < (this.field_f ^ -1)) {
                    this.field_f = this.field_f + 1;
                }
            }
        }
        long var6 = 0L;
        if (param0 < 49) {
            this.field_e = -118L;
        }
        for (var8 = 1; var8 <= this.field_f; var8++) {
            var6 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
        }
        return var6 / (long)this.field_f;
    }

    final static int b(int param0) {
        if (param0 != 3878) {
            return 25;
        }
        if (!oj.a(false) || null == pu.field_e.e((byte) 54)) {
            return -1;
        }
        return pu.field_e.e((byte) 54).field_v;
    }

    final long a(byte param0) {
        this.field_l = this.field_l + this.a(62);
        if (!((this.field_l ^ -1L) <= (this.field_e ^ -1L))) {
            return (this.field_e + -this.field_l) / 1000000L;
        }
        int var2 = -94 / ((param0 - 42) / 37);
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            this.b((byte) 73);
            break L0;
          }
        }
        if ((this.field_l ^ -1L) > (this.field_e ^ -1L)) {
          this.field_j = this.field_j + (this.field_e - this.field_l);
          this.field_l = this.field_l + (this.field_e + -this.field_l);
          this.field_e = this.field_e + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              this.field_e = this.field_e + param1;
              var4++;
              if ((var4 ^ -1) <= -11) {
                break L2;
              } else {
                if (this.field_l > this.field_e) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (this.field_l > this.field_e) {
                this.field_e = this.field_l;
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
        this.field_f = 1;
        this.field_h = new long[10];
        this.field_l = 0L;
        this.field_e = 0L;
        this.field_j = 0L;
        this.field_g = 0;
        this.field_l = System.nanoTime();
        this.field_e = System.nanoTime();
    }

    static {
        field_i = "Click";
        field_k = 0L;
        field_d = new Random();
    }
}
