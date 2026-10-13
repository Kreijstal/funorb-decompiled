/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class un {
    static IndexedSprite[] field_e;
    static int field_a;
    static String field_h;
    static String[] field_c;
    static RgbSprite field_d;
    static long field_g;
    static boolean field_f;
    static QuickChatParameterType field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        if (!param0) {
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
        un.a(true);
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static int a(int param0) {
        if (param0 == 1) {
          return 1900 + new Date().getYear();
        }
        un.a(false);
        return 1900 + new Date().getYear();
    }

    final static void a(byte param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          vh.field_U = param1.readUnsignedShort(65280) << 5;
          var2_int = param1.readUnsignedByte(255);
          fh.field_c = 1835008 & var2_int << 18;
          int var3 = -32 % ((param0 + 69) / 37);
          vh.field_U = vh.field_U + (var2_int >> 3);
          fh.field_c = fh.field_c + (param1.readUnsignedShort(65280) << 2);
          var2_intLifetime1 = param1.readUnsignedByte(255);
          sf.field_Z = 2064384 & var2_intLifetime1 << 15;
          fh.field_c = fh.field_c + (var2_intLifetime1 >> 6);
          sf.field_Z = sf.field_Z + (param1.readUnsignedByte(255) << 7);
          var2_intLifetime2 = param1.readUnsignedByte(255);
          sf.field_Z = sf.field_Z + (var2_intLifetime2 >> 1);
          vj.field_c = 65536 & var2_intLifetime2 << 16;
          vj.field_c = vj.field_c + param1.readUnsignedShort(65280);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "un.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_h = "Chat view has been scrolled up. Scroll down to chat.";
        field_b = new QuickChatParameterType(0, 2, 2, 1);
    }
}
