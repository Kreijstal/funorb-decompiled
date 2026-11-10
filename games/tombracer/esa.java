/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class esa {
    static String field_c;
    private PlayerProfile field_b;
    private BitSet field_d;
    static String field_a;

    final PlayerProfile a(int param0) {
        if (param0 < 72) {
          return (PlayerProfile) null;
        }
        return this.field_b;
    }

    final static boolean areCommonUiArchivesReady(ResourceArchive param0, ResourceArchive param1, int param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -26 / ((param2 - 18) / 61);
          if (!param1.b(-56)) {
            return false;
          }
          if (!param1.c("commonui", -128)) {
            return false;
          }
          if (param3.b(-37) &&
            param3.c("commonui", -125)) {
            if (param0.b(-46) &&
              param0.c("button.gif", -124)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("esa.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(BitPacketBuffer param0, int param1, byte param2) {
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 < 15) {
            return;
          }
          param0.readInt(98);
          param0.readInt(-67);
          param0.readUnsignedShort(127);
          param0.readUnsignedShort(121);
          param0.readUnsignedShort(126);
          param0.readUnsignedShort(121);
          param0.readUnsignedShort(123);
          param0.readUnsignedShort(126);
          param0.readUnsignedShort(124);
          param0.readUnsignedShort(123);
          param0.readUnsignedByte(param2 + 216);
          if (param2 != 39) {
            return;
          }
          param0.beginBitAccess((byte) -95);
          var4_int = param0.readBits((byte) 44, 8);
          this.field_d = new BitSet(var4_int);
          for (var5 = 0; var5 < var4_int; var5++) {
            if (CircleMovementLocomotor.readBitFlag(param2 ^ 5940, param0)) {
              this.field_d.set(var5);
            }
          }
          param0.endBitAccess((byte) 98);
          this.field_b.a(param0, (byte) 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("esa.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final BitSet b(byte param0) {
        int var2 = 126 / ((param0 - 61) / 41);
        return this.field_d;
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 != 102) {
          return;
        }
        field_c = null;
    }

    public esa() {
        int var2 = 0;
        int var1;
        int var3;
        this.field_b = new PlayerProfile();
        this.field_d = new BitSet(aq.a(-5640));
        var1 = 0;
        for (var2 = 0; aq.a(-5640) > var2; var2++) {
          if (var1 < 30) {
            var3 = LoadLevelCommand.a(var2, (byte) 37);
            if (!AnimatedLight.a(false, var3).field_d) {
              this.field_d.set(var2);
              var1++;
            }
            continue;
          }
          break;
        }
    }

    static {
        field_a = "You have withdrawn your request to join.";
    }
}
