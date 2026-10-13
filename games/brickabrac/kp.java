/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kp {
    static NodeDeque achievementNotifications;
    static TextFont field_b;
    static RgbSprite[] field_e;
    static int field_a;
    static Vector field_d;

    final static void a(int param0, byte param1, pn param2) {
        BitPacketBuffer var6 = null;
        int var5 = 0;
        try {
          var6 = k.field_h;
          int var4 = 107 / ((44 - param1) / 45);
          var6.writeCipheredOpcode(-13413, param0);
          var6.position = var6.position + 1;
          var5 = var6.position;
          var6.writeByte(-117, 1);
          var6.writeByte(-99, param2.field_p);
          var6.writeSignedSmart(param2.field_n, (byte) 117);
          var6.writeInt(param2.field_t, (byte) -79);
          var6.writeInt(param2.field_r, (byte) -79);
          var6.writeInt(param2.field_l, (byte) -79);
          var6.writeInt(param2.field_k, (byte) -79);
          var6.appendCrc32(3, var5);
          var6.backfillByteLength((byte) 124, -var5 + var6.position);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "kp.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 10 % ((param0 + 8) / 43);
        achievementNotifications = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    static {
        achievementNotifications = new NodeDeque();
    }
}
