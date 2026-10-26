/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fr {
    String field_f;
    static char field_e;
    String[] field_c;
    boolean field_b;
    boolean field_d;
    int field_a;

    final static void a(float param0, float param1, int param2, float param3, float param4, int param5, byte[] param6, int param7, int param8, float param9, int param10, int param11, ai param12) {
        int var13_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        try {
          for (var13_int = param2; param5 > var13_int; var13_int++) {
            qh.a(param2 + 2, param12, param10, param0, param9, param4, param1, param11, param5, param6, param3, var13_int, param8, param7);
            param11 = param11 + param7 * param8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_6_0 = var13;
          stackIn_6_1 = new StringBuilder().append("fr.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 != 0) {
          field_e = 'L';
        }
        if (param0) {
          gq.field_e = gq.field_e + 1;
          us.a(param1 + 2069944240);
        }
        if (param2) {
          ef.field_m = ef.field_m + 1;
          er.a((byte) -128);
        }
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != ft.field_l && (param1 < 0 ||
            ca.field_f == wq.field_e)) {
            if (param0 >= -12) {
              fr.a(36, 96);
            }
            if (q.outgoingPacket.position == 0 &&
              10000L + co.field_e < kh.a(-64)) {
              q.outgoingPacket.writeCipheredOpcode(44, param1);
            }
            if (0 < q.outgoingPacket.position) {
              try {
                ft.field_l.a(q.outgoingPacket.position, 0, 76, q.outgoingPacket.payload);
                co.field_e = kh.a(-84);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                te.b(true);
              }
              q.outgoingPacket.position = 0;
            }
            return;
          }
          q.outgoingPacket.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    fr(boolean param0) {
        this.field_b = param0 ? true : false;
    }

    static {
    }
}
