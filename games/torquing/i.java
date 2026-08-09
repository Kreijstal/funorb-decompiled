/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class i extends im implements ng {
    static boolean[] field_P;
    static boolean field_R;
    private lg field_O;
    static vn field_N;
    static pk field_Q;

    public static void m(int param0) {
        field_Q = null;
        field_P = null;
        if (param0 != 50) {
            return;
        }
        field_N = null;
    }

    i(ln param0, hh param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        gm var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (ab.field_l == param1) {
                var3 = ak.field_h;
                break L1;
              } else {
                if (bl.field_b == param1) {
                  this.field_o = this.field_o + 10;
                  var3 = wj.field_j;
                  if (!nh.a(-116)) {
                    break L1;
                  } else {
                    this.field_o = this.field_o + 20;
                    var3 = jg.field_v;
                    break L1;
                  }
                } else {
                  if (param1 != ip.field_b) {
                    break L1;
                  } else {
                    var3 = dn.field_c;
                    this.field_o = this.field_o + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new gm((String) (var3), (ca) null);
            var4.field_o = 80;
            var4.field_w = 0;
            var4.field_p = this.field_p;
            var4.field_k = 50;
            var4.field_q = (el) ((Object) new pc(sp.field_R, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var4, -6938);
            this.field_O = this.a((ca) (this), true, qd.field_i);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("i.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        lg discarded$1 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_O == param1) {
                this.b(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= -85) {
                break L2;
              } else {
                var7 = (String) null;
                discarded$1 = this.a((ca) null, false, (String) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("i.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] b(int param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var9 = Torquing.field_u;
        if (param0 != 10758) {
            i.m(-52);
        }
        n var2 = (n) ((Object) rj.field_v.a((long)param1, 4604));
        if (!(var2 != null)) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param1);
            for (var5 = 0; -256 < (var5 ^ -1); var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; var5 < 255; var5++) {
                var6 = -var5 + 255;
                var7 = va.a(var6, (byte) 124, var4);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[511 + -var5] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2 = new n(var11);
            rj.field_v.a((long)param1, var2, 0);
        }
        return var2.field_v;
    }

    private final void b(boolean param0) {
        if (!this.field_D) {
            return;
        }
        if (!param0) {
            field_N = (vn) null;
        }
        this.field_D = false;
    }

    private final lg a(ca param0, boolean param1, String param2) {
        lg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        lg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new lg(param2, param0);
              if (param1) {
                break L1;
              } else {
                field_R = true;
                break L1;
              }
            }
            var4.field_q = (el) ((Object) new rf());
            var5 = -6 + this.field_o;
            this.field_o = this.field_o + 38;
            var4.a((byte) -85, 15, var5, 30, -16 + (-14 + this.field_p));
            this.a(var4, -6938);
            this.e((byte) 88);
            stackIn_3_0 = (lg) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("i.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    static int c(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_R = false;
        field_P = new boolean[112];
    }
}
