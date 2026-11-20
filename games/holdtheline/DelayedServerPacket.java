/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedServerPacket extends IntrusiveNode {
    static String field_m;
    long releaseTime;
    static String[] field_j;
    static SpriteAsset field_q;
    static String field_p;
    int opcode;
    static int field_n;
    static boolean field_k;
    byte[] payload;

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 1) {
          ResourceArchive var5 = (ResourceArchive) null;
          DelayedServerPacket.a(-70, (ResourceArchive) null);
          return AgeValidator.a(true);
        }
        return AgeValidator.a(true);
    }

    final static boolean hasRepeatedCharacter(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          var2_int = param0.charAt(0);
          var3 = param1;
          while (true) {
            if (param0.length() <= var3) {
              return true;
            }
            if (var2_int == param0.charAt(var3)) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("aa.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_m = null;
        if (param0 > 30) {
          field_j = null;
          field_p = null;
          field_q = null;
          return;
        }
        DelayedServerPacket.clearSharedReferences(-108);
        field_j = null;
        field_p = null;
        field_q = null;
    }

    final static void a(int param0, ResourceArchive param1) {
        Sprite var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new Sprite(param1.getNamedFile("", false, "final_frame.jpg"), (java.awt.Component) ((Object) MouseInputHandler.field_b));
          var3 = var2.width;
          var4 = var2.height;
          lj.a((byte) -120);
          TickClock.field_c = new Sprite(var3, var4 * 3 / 4);
          TickClock.field_c.bindRaster();
          var2.drawUnkeyed(0, 0);
          EmailConfirmationValidator.field_l = new Sprite(var3, var4 - TickClock.field_c.height);
          EmailConfirmationValidator.field_l.bindRaster();
          var2.drawUnkeyed(0, -TickClock.field_c.height);
          EmailConfirmationValidator.field_l.offsetY = TickClock.field_c.height;
          dm.b((byte) -10);
          if (param0 == -18916) {
            return;
          }
          DelayedServerPacket.clearSharedReferences(-19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("aa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    DelayedServerPacket(long param0, int param1, byte[] param2) {
        try {
          this.releaseTime = param0;
          this.opcode = param1;
          this.payload = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "aa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Powerups are activated by pressing <img=0>.";
        field_k = false;
    }
}
