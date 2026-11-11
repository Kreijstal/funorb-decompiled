/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    static int field_a;

    final static void queueSoundRelease(fla param0, int param1) {
        try {
          int var2_int = 104 % ((param1 - 4) / 38);
          nl.field_f.addLast((byte) -77, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rs.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 != 124) {
          fla var2 = (fla) null;
          rs.queueSoundRelease((fla) null, -74);
          if (SnakePitTile.a(false)) {
            return ModelFactory.field_a.d(true);
          }
          return -1;
        }
        if (SnakePitTile.a(false)) {
          return ModelFactory.field_a.d(true);
        }
        return -1;
    }

    static {
        field_a = 1;
    }
}
