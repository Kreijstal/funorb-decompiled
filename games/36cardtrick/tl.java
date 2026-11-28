/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class tl {
    static IntrusiveDeque field_a;
    int field_d;
    String field_c;
    static int field_b;

    public static void clearStaticReferences(int param0) {
        if (param0 != 80) {
          return;
        }
        field_a = null;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(String param0, String param1, int param2) {
        if (param2 <= 102) {
          return;
        }
        try {
          StandardContentDialog.a((byte) -121, param0, param1, false);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "tl.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static vk a(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        vd var9 = null;
        var7 = Main.field_T;
        if (param0 != 24881) {
          return (vk) null;
        }
        var8 = EmailFormatValidator.field_j;
        var2 = var8;
        var3 = var8.readUnsignedByte(-112);
        stackIn_5_0 = (0 != (var3 & 128));
        gg.field_a = stackIn_5_0;
        IsaacRandom.field_b = 127 & var3;
        KeyboardInputHandler.field_a = var8.readUnsignedByte(102);
        ff.field_a = var8.readLong(true);
        if (IsaacRandom.field_b == 2) {
          MatchingFieldValidator.field_l = var8.readUnsignedShort((byte) 72);
          bi.field_a = var8.readUnsignedMedium(true);
        } else {
          bi.field_a = 0;
          MatchingFieldValidator.field_l = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(76) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        cd.field_g = var8.readString(false);
        if (var4 != 0) {
          GameApplet.field_c = var8.readString(false);
        } else {
          GameApplet.field_c = cd.field_g;
        }
        if (IsaacRandom.field_b == 1) {
          var8.readUnsignedShort((byte) 72);
          var8.readString(false);
        } else {
          if (IsaacRandom.field_b == 4) {
            var8.readUnsignedShort((byte) 72);
            var8.readString(false);
          }
        }
        if (!param1) {
          hi.field_b = DiskArchiveRequest.a(var8, param0 ^ 24921, 80);
          bl.field_c = null;
          return new vk(param1);
        }
        var5 = var8.readUnsignedShort((byte) 72);
        try {
          var9 = mh.field_d.a(var5, -32769);
          hi.field_b = var9.b((byte) 28);
          if (!GameApplet.field_c.equals(ri.field_c)) {
            stackIn_24_0 = var9.field_m;
          } else {
            stackIn_24_0 = null;
          }
          bl.field_c = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          DebouncedFieldValidator.a((Throwable) ((Object) var6), (byte) 111, "CC1");
          bl.field_c = null;
          hi.field_b = null;
          return new vk(param1);
        }
        return new vk(param1);
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (param0) {
          return new java.net.Socket(this.field_c, this.field_d);
        }
        this.field_d = 5;
        return new java.net.Socket(this.field_c, this.field_d);
    }

    static {
        field_a = new IntrusiveDeque();
    }
}
