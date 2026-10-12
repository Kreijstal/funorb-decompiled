/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vt extends IntrusiveNode {
    static int[] field_m;
    static RgbSprite field_k;
    static int field_n;
    static int field_l;

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (NodeIterator.field_a) {
          return BestScoreStrategy.field_i.a(rs.field_q, ui.field_i, 80);
        }
        if (iu.field_h) {
          return cd.a(param2, param0, false);
        }
        if (po.a(param0, 6150, param2)) {
          return true;
        }
        if (vi.field_d) {
          return false;
        }
        if (param3 > 25) {
          return ro.b(param1, (byte) -59, param2);
        }
        field_k = (RgbSprite) null;
        return ro.b(param1, (byte) -59, param2);
    }

    public static void a(boolean param0) {
        field_k = null;
        field_m = null;
        if (param0) {
          vt.a(true);
        }
    }

    final static void a(int param0) {
        MoveEvent.instructionsPanel = new InstructionsPanel();
        MoveEvent.instructionsPanel.initializePanel(111);
        IntPair var1 = MoveEvent.instructionsPanel.getPanelStart((byte) 126);
        if (var1 == null) {
          return;
        }
        IntPair var2 = MoveEvent.instructionsPanel.getPanelEnd((byte) -108);
        if (var2 == null) {
          return;
        }
        int var3 = MoveEvent.instructionsPanel.getRowSpacing(-1);
        if (var3 < 0) {
          return;
        }
        if (param0 > -112) {
          return;
        }
        if (null == MoveEvent.instructionsPanel.itemIds) {
          return;
        }
        if (MoveEvent.instructionsPanel.itemIds.length != 0) {
          gb.configureTutorialStage(var3, 7, var1.first, var2.first, var1.second, var2.second, MoveEvent.instructionsPanel.itemIds, -40);
          return;
        }
    }

    final static int readTwoTierUnsignedInt(int obfuscationGuard, int longBits, int shortBits, CipherPacketBuffer packet) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == -9202) {
            stackIn_4_0 = ju.a(packet, 1 << shortBits, 1 << longBits, longBits, (byte) -122, shortBits);
            return stackIn_4_0;
          }
          stackIn_2_0 = 101;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("vt.LA(").append(obfuscationGuard).append(',').append(longBits).append(',').append(shortBits).append(',');
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    vt() {
    }

    final static boolean a(int param0, tu param1, int param2, RgbSprite[] param3, String param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param1.a(param4) + (param3[0].field_A << 1) >> 1;
          if (param5 > -104) {
            field_m = (int[]) null;
          }
          var7 = -var6_int + param0;
          var8 = param0 + var6_int;
          if (var7 >= 0) {
            if (var8 > 640) {
              param0 = param0 - (var8 - 640);
            }
          } else {
            param0 = param0 - var7;
          }
          stackIn_8_0 = wg.a(-33, -var6_int + param0, var6_int + param0, param2, param3[0].field_x + param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("vt.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
