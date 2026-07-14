/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qe extends hd {
    static int field_k;
    static Random field_j;
    private java.nio.ByteBuffer field_i;

    final static void a(int param0, int param1, dd param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        if (param7 != 5120) {
          var12 = null;
          qe.a(-46, 27, (dd) null, -27, -105, -46, -75, -59, 119);
          var9 = param4 + param8 + (param2.field_q - param3);
          var10 = param1 + (param8 + (param2.field_q + param4));
          var11 = param5 + param2.field_v - -(param2.field_t >> 1721481697);
          gb.g(var9, 0, var10, var11 - -param0);
          param2.a(-1 + param8, param5 - 1, param6);
          param2.a(param8 - 1, param5 - -1, param6);
          gb.b(ab.field_c);
          gb.g(1 + var9, 0, var10 - -1, var11 - -param0);
          param2.a(1 + param8, param5 - 1, param6);
          param2.a(1 + param8, param5 + 1, param6);
          gb.b(ab.field_c);
          var10 = -param3 + param8 + param2.field_q + (param2.field_w + -param4);
          var9 = param8 + param2.field_w + (param2.field_q - param4 + -param1);
          gb.g(var9, var11 + -param0, var10, 480);
          param2.a(param8 - 1, param5 - 1, param6);
          param2.a(param8 + -1, 1 + param5, param6);
          gb.b(ab.field_c);
          gb.g(1 + var9, var11 - param0, 1 + var10, 480);
          param2.a(param8 + 1, param5 + -1, param6);
          param2.a(1 + param8, 1 + param5, param6);
          gb.b(ab.field_c);
          return;
        } else {
          var9 = param4 + param8 + (param2.field_q - param3);
          var10 = param1 + (param8 + (param2.field_q + param4));
          var11 = param5 + param2.field_v - -(param2.field_t >> 1721481697);
          gb.g(var9, 0, var10, var11 - -param0);
          param2.a(-1 + param8, param5 - 1, param6);
          param2.a(param8 - 1, param5 - -1, param6);
          gb.b(ab.field_c);
          gb.g(1 + var9, 0, var10 - -1, var11 - -param0);
          param2.a(1 + param8, param5 - 1, param6);
          param2.a(1 + param8, param5 + 1, param6);
          gb.b(ab.field_c);
          var10 = -param3 + param8 + param2.field_q + (param2.field_w + -param4);
          var9 = param8 + param2.field_w + (param2.field_q - param4 + -param1);
          gb.g(var9, var11 + -param0, var10, 480);
          param2.a(param8 - 1, param5 - 1, param6);
          param2.a(param8 + -1, 1 + param5, param6);
          gb.b(ab.field_c);
          gb.g(1 + var9, var11 - param0, 1 + var10, 480);
          param2.a(param8 + 1, param5 + -1, param6);
          param2.a(1 + param8, 1 + param5, param6);
          gb.b(ab.field_c);
          return;
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 != 256) {
          return null;
        } else {
          var3 = new byte[((qe) this).field_i.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$4 = ((qe) this).field_i.position(0);
          java.nio.ByteBuffer discarded$5 = ((qe) this).field_i.get(var3);
          return var3;
        }
    }

    public static void c(int param0) {
        Object var2 = null;
        if (param0 != -1) {
          var2 = null;
          qe.a(112, -6, (dd) null, 97, -24, -108, -83, 92, -73);
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    final void a(int param0, byte[] param1) {
        Object var4 = null;
        ((qe) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
        if (param0 >= -97) {
          var4 = null;
          qe.a(-71, 115, (dd) null, -77, 80, 37, 76, 99, 49);
          java.nio.Buffer discarded$8 = ((qe) this).field_i.position(0);
          java.nio.ByteBuffer discarded$9 = ((qe) this).field_i.put(param1);
          return;
        } else {
          java.nio.Buffer discarded$10 = ((qe) this).field_i.position(0);
          java.nio.ByteBuffer discarded$11 = ((qe) this).field_i.put(param1);
          return;
        }
    }

    qe() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new Random();
    }
}
