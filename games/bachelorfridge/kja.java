/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kja {
    int field_a;
    static Sprite field_e;
    int field_c;
    int field_b;
    int field_d;

    final static void a(int param0, int param1, byte param2, boolean param3) {
        wg.a(param3, -90);
        if (param2 <= -9) {
          vla.a(5, param1, param0, param3);
          return;
        }
        field_e = (Sprite) null;
        vla.a(5, param1, param0, param3);
    }

    final static UiComponent a(byte param0) {
        if (param0 != 20) {
          kja.a(-25, 95, (byte) 51, true);
          return SnowEvent.field_q.field_vb;
        }
        return SnowEvent.field_q.field_vb;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1900) {
          field_e = (Sprite) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static int a(int param0) {
        if (param0 == 27168) {
          return new Date().getYear() + 1900;
        }
        field_e = (Sprite) null;
        return new Date().getYear() + 1900;
    }

    final static void a(int param0, byte param1, ne param2) {
        BitPacketBuffer var3 = null;
        try {
          if (param1 < 1) {
            ne var4 = (ne) null;
            kja.a(80, (byte) 81, (ne) null);
          }
          var3 = sja.field_fb;
          var3.writeCipheredByte(param0, (byte) 108);
          var3.writeByte(param2.field_o, 0);
          var3.writeByte(param2.field_i, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kja.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
