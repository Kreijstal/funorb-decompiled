/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk extends UiComponent {
    UiComponent field_Rb;
    static String field_Tb;
    static RgbSprite field_Sb;
    private UiComponent field_Pb;
    static int achievementTransitionMask;

    private final void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        var4 = -param2;
        var5 = -param2;
        if (this.field_Pb != null) {
          var4 = this.field_Pb.getContentWidth(71);
        }
        if (null != this.field_Rb) {
          var5 = this.field_Rb.measureContentWidth(-param1 + (-param1 + this.width) - (var4 + param2), 0);
        }
        var7 = 40 / ((-47 - param0) / 42);
        var6 = param2 + var4 + param1 + (var5 + param1);
        if (this.width < var6) {
          var5 = var5 + (this.width - var6);
          var6 = this.width;
        }
        if (this.horizontalAlignment == 1) {
          param1 = param1 + (this.width - var6) / 2;
        }
        if (2 == this.horizontalAlignment) {
          param1 = param1 + (-var6 + this.width);
        }
        if (null != this.field_Pb) {
          this.field_Pb.setBounds(this.height, 0, param1, var4, (byte) 64);
          this.field_Pb.verticalAlignment = this.verticalAlignment;
        }
        if (null != this.field_Rb) {
          this.field_Rb.setBounds(this.height, 0, param2 + (param1 + var4), var5, (byte) 64);
          this.field_Rb.verticalAlignment = this.verticalAlignment;
          if (null != this.field_Pb) {
            this.field_Rb.horizontalAlignment = 0;
          } else {
            this.field_Rb.horizontalAlignment = this.horizontalAlignment;
          }
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_13_0 = false;
        if (param0 >= -58) {
          return false;
        }
        stackIn_13_0 = ((!(param1 < 48) &&
          !(param1 > 57)) ||
          (!(param1 < 65) &&
          !(param1 > 90)) ||
          (!(param1 < 97) &&
          !(122 < param1)));
        return stackIn_13_0;
    }

    public static void d(byte param0) {
        field_Tb = null;
        field_Sb = null;
        if (param0 != 21) {
          rk.d((byte) -26);
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          PlatformServices stackIn_16_0;
          int stackIn_16_1;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          java.net.URL stackIn_16_4;
          StringBuilder stackIn_16_5;
          java.net.URL stackIn_17_2;
          java.net.URL stackIn_17_3;
          String stackIn_17_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = BrickABrac.field_J ? 1 : 0;
          try {
            if (param2 <= 27) {
              rk.a((byte) -93, 'K');
            }
            var3 = "";
            if (param1 != null) {
              var3 = pp.a(22570, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            me.a(var3, -107);
            var7 = oh.a((byte) 13, "%3a", var3, ":");
            var8 = oh.a((byte) 13, "%40", var7, "@");
            var9 = oh.a((byte) 13, "%26", var8, "&");
            var10 = oh.a((byte) 13, "%23", var9, "#");
            if (null == SecondaryHashTable.field_i) {
              return;
            }
            stackIn_16_0 = LevelPackLoader.field_e;
            stackIn_16_1 = -49;
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_4 = SecondaryHashTable.field_i.getCodeBase();
            stackIn_16_5 = new StringBuilder().append("clienterror.ws?c=").append(oj.field_m).append("&u=");
            if (ua.field_a == null) {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = "" + sb.field_e;
            } else {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = ua.field_a;
            }
            var4 = ((PlatformServices) (Object) stackIn_16_0).openUrl((byte) stackIn_16_1, new java.net.URL(stackIn_16_4, ((StringBuilder) (Object) stackIn_16_5).append(stackIn_17_6).append("&v1=").append(PlatformServices.javaVendor).append("&v2=").append(PlatformServices.javaVersion).append("&e=").append(var10).toString()));
            while (var4.status == 0) {
              wj.sleepMillis(-125, 1L);
            }
            if (var4.status == 1) {
              var5 = (DataInputStream) (var4.result);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, int param1, int param2) {
        if (param1 != 24) {
          rk.a((byte) 108, '￱');
        }
        int var4 = -param0;
        if (this.field_Pb != null) {
          var4 = this.field_Pb.getContentWidth(107);
        }
        int var5 = -param0;
        if (null != this.field_Rb) {
          var5 = this.field_Rb.getContentWidth(64);
        }
        return param2 + var4 + (param0 + var5) + param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -10411) {
          Throwable var9 = (Throwable) null;
          rk.a((String) null, (Throwable) null, 64);
        }
        this.setBounds(param5, param1, param4, param6, (byte) 64);
        this.b(param0 ^ 10436, param2, param3);
    }

    rk(long param0, UiComponent param1, UiComponent param2, UiComponent param3, RgbSprite param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Pb = new UiComponent(0L, param2);
            this.field_Pb.sprite = param4;
            this.addChild(this.field_Pb, 0);
          }
          if (param5 != null) {
            this.field_Rb = new UiComponent(0L, param3, param5);
            this.addChild(this.field_Rb, 0);
            this.markDescendantsToInheritVisualState(true);
          } else {
            this.markDescendantsToInheritVisualState(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("rk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static MeshAttributeRecord[] decodeMeshAttributeRecords(BitPacketBuffer packet, int obfuscationGuard) {
        int recordIndex = 0;
        int version = 0;
        RuntimeException failure = null;
        int count = 0;
        MeshAttributeRecord[] records = null;
        int referenceIndex = 0;
        MeshAttributeRecord record = null;
        int unusedGameFlag = 0;
        Object unsupportedResult = null;
        MeshAttributeRecord[] result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String packetSummary = null;
        RuntimeException caughtFailure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          version = packet.readBits(8, (byte) -85);
          if (version > 0) {
            unsupportedResult = null;
            return (MeshAttributeRecord[]) (unsupportedResult);
          }
          if (obfuscationGuard != 24) {
            field_Tb = (String) null;
          }
          count = packet.readBits(12, (byte) 85);
          records = new MeshAttributeRecord[count];
          for (recordIndex = 0; recordIndex < count; recordIndex++) {
            if (DirectByteStorage.readPacketFlag(false, packet)) {
              record = new MeshAttributeRecord();
              packet.readBits(24, (byte) -115);
              packet.readBits(24, (byte) 107);
              record.baseRgb = packet.readBits(24, (byte) -86);
              packet.readBits(9, (byte) 110);
              packet.readBits(12, (byte) -113);
              packet.readBits(12, (byte) -91);
              packet.readBits(12, (byte) -112);
              records[recordIndex] = record;
            } else {
              referenceIndex = packet.readBits(GameClock.a(-1 + recordIndex, 15), (byte) 98);
              records[recordIndex] = records[referenceIndex];
            }
          }
          result = records;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("rk.B(");
          if (packet == null) {
            packetSummary = "null";
          } else {
            packetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packetSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
