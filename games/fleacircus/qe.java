/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qe extends hd {
    static int field_k;
    static Random field_j;
    private java.nio.ByteBuffer field_i;

    final static void a(int param0, int param1, dd param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            if (param7 != 5120) {
                dd var12 = (dd) null;
                qe.a(-46, 27, (dd) null, -27, -105, -46, -75, -59, 119);
            }
            var9_int = param4 + param8 + (param2.field_q - param3);
            var10 = param1 + (param8 + (param2.field_q + param4));
            var11 = param5 + param2.field_v - -(param2.field_t >> 1721481697);
            gb.g(var9_int, 0, var10, var11 - -param0);
            param2.a(-1 + param8, param5 - 1, param6);
            param2.a(param8 - 1, param5 - -1, param6);
            gb.b(ab.field_c);
            gb.g(1 + var9_int, 0, var10 - -1, var11 - -param0);
            param2.a(1 + param8, param5 - 1, param6);
            param2.a(1 + param8, param5 + 1, param6);
            gb.b(ab.field_c);
            var10 = -param3 + param8 + param2.field_q + (param2.field_w + -param4);
            var9_int = param8 + param2.field_w + (param2.field_q - param4 + -param1);
            gb.g(var9_int, var11 + -param0, var10, 480);
            param2.a(param8 - 1, param5 - 1, param6);
            param2.a(param8 + -1, 1 + param5, param6);
            gb.b(ab.field_c);
            gb.g(1 + var9_int, var11 - param0, 1 + var10, 480);
            param2.a(param8 + 1, param5 + -1, param6);
            param2.a(1 + param8, 1 + param5, param6);
            gb.b(ab.field_c);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qe.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final byte[] b(int param0) {
        byte[] var2;
        byte[] var3;
        if (param0 != 256) {
          return (byte[]) null;
        } else {
          var3 = new byte[this.field_i.capacity()];
          var2 = var3;
          this.field_i.position(0);
          this.field_i.get(var3);
          return var3;
        }
    }

    public static void c(int param0) {
        dd var2;
        if (param0 != -1) {
          var2 = (dd) null;
          qe.a(112, -6, (dd) null, 97, -24, -108, -83, 92, -73);
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    final void a(int param0, byte[] param1) {
        try {
            this.field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 >= -97) {
                dd var4 = (dd) null;
                qe.a(-71, 115, (dd) null, -77, 80, 37, 76, 99, 49);
            }
            this.field_i.position(0);
            this.field_i.put(param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qe.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qe() {
    }

    static {
        field_j = new Random();
    }
}
