/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static int field_b;
    static boolean[] field_a;
    static FlightSession flightSession;

    final static void a(int param0, byte param1, ht param2) {
        CipherPacketBuffer var3 = null;
        try {
          if (param1 != -92) {
            sg.a((byte) -18);
          }
          var3 = q.outgoingPacket;
          var3.writeCipheredOpcode(param1 ^ -33, param0);
          var3.writeByte(param1 - 1336879868, param2.field_l);
          var3.writeByte(-1336879960, param2.field_f);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "sg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 107) {
          sg.a((byte) 52);
          return om.field_c.a(117);
        }
        return om.field_c.a(117);
    }

    public static void a(byte param0) {
        if (param0 <= 102) {
          flightSession = (FlightSession) null;
          flightSession = null;
          field_a = null;
          return;
        }
        flightSession = null;
        field_a = null;
    }

    static {
    }
}
