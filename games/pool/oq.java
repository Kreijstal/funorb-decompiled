/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oq extends ge {
    static java.util.zip.CRC32 field_B;
    static String field_C;
    private li field_A;
    private int field_y;
    static String field_D;
    static vh field_z;

    final static di a(boolean param0, int param1, int param2, int param3, boolean param4) {
        di discarded$0 = null;
        if (param1 >= -2) {
            discarded$0 = oq.a(true, 72, 4, -38, true);
        }
        return ji.a(param2, param4, (byte) -56, param3, false, param0);
    }

    final void o(int param0) {
        this.field_v = (this.field_y + 7) / param0;
    }

    oq(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 < -102) {
                break L1;
              } else {
                var6 = (byte[]) null;
                this.a(33, -53, (byte[]) null, -26);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= param3) {
                break L0;
              } else {
                fieldTemp$5 = this.field_v;
                this.field_v = this.field_v + 1;
                param2[var5_int + param0] = (byte)(this.field_t[fieldTemp$5] + -this.field_A.a((byte) 7));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("oq.D(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void p(int param0) {
        this.field_y = this.field_v * param0;
    }

    final void b(boolean param0, int param1) {
        if (param0) {
            byte[] var4 = (byte[]) null;
            this.a(-89, -96, (byte[]) null, 98);
        }
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(this.field_A.a((byte) 7) + param1);
    }

    final static void n(int param0) {
        int var1 = 0;
        di discarded$0 = null;
        if (nk.field_h >= 224) {
            ap.a(256, 3815994);
        } else {
            var1 = nk.field_h % 32;
            ap.a(32 + (nk.field_h - var1), param0 ^ -3807027);
        }
        if (param0 != -11529) {
            discarded$0 = oq.a(true, -4, 116, -60, false);
        }
    }

    final int q(int param0) {
        int var2 = -125 % ((14 - param0) / 47);
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        return 255 & this.field_t[fieldTemp$0] + -this.field_A.a((byte) 7);
    }

    final int e(int param0, int param1) {
        int incrementValue$0 = 0;
        int var3 = this.field_y >> -1632069917;
        int var4 = 8 - (7 & this.field_y);
        this.field_y = this.field_y + param0;
        int var5 = 0;
        while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((co.field_ab[var4] & this.field_t[incrementValue$0]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 == var4) {
            var5 = var5 + (co.field_ab[var4] & this.field_t[var3]);
        } else {
            var5 = var5 + (this.field_t[var3] >> -param0 + var4 & co.field_ab[param0]);
        }
        if (param1 <= 15) {
            field_C = (String) null;
        }
        return var5;
    }

    final void b(int param0, int[] param1) {
        if (param0 != 32) {
            return;
        }
        try {
            this.field_A = new li(param1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "oq.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    oq(byte[] param0) {
        super(param0);
    }

    public static void c(boolean param0) {
        field_C = null;
        if (!param0) {
            field_C = (String) null;
        }
        field_B = null;
        field_z = null;
        field_D = null;
    }

    static {
        field_B = new java.util.zip.CRC32();
        field_C = "Black ball";
        field_D = "Open";
    }
}
