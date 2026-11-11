/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CharacterChoiceFactory implements BitDecodableFactory {
    static int field_f;
    static int[] field_e;
    static UiComponent field_g;
    static Sprite[] field_b;
    static ToolkitSprite field_a;
    static String field_d;
    static UiComponent field_c;

    public final BitDecodable[] createArray(int param0, int param1) {
        if (param1 != -26955) {
          return (BitDecodable[]) null;
        }
        return (BitDecodable[]) ((Object) new CharacterChoice[param0]);
    }

    public final BitDecodable create(byte param0) {
        if (param0 > -17) {
          return (BitDecodable) null;
        }
        return (BitDecodable) ((Object) new CharacterChoice());
    }

    final static void a(byte[] param0, boolean param1, int param2, int param3, int param4, int param5) {
        BitPacketBuffer var10 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var10 = ql.field_k;
          var10.writeCipheredOpcode(param5, -2988);
          var10.position = var10.position + 1;
          var7 = var10.position;
          var10.writeByte(4, 0);
          var10.writeByte(param4, 0);
          var8 = param2;
          if (param1) {
            var8 += 128;
          }
          int var9 = -69 / ((-65 - param3) / 34);
          var10.writeByte(var8, 0);
          var10.writeBytes(0, param0, param0.length, 91);
          var10.backpatchByteLength(-var7 + var10.position, (byte) -1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pq.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
          CharacterChoiceFactory.releaseStatics(-39);
        }
    }

    final static void detachCanvasInput(java.awt.Canvas param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          PlantModel.detachKeyboardHandler(-18520, (java.awt.Component) ((Object) param0));
          tia.detachMouseHandler(0, (java.awt.Component) ((Object) param0));
          if (param1) {
            return;
          }
          if (tja.field_q == null) {
            return;
          }
          tja.field_q.detachWheelListener(116, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("pq.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        afa.field_c = LegacyOpenGlSpriteTexture.getTooltipStyle(-57);
        ej.field_a = new jta();
        if (param0 <= 112) {
          return;
        }
        LegacyOpenGlFlowingWaterEffect.a(true, true, (byte) 97);
    }

    static {
        field_f = 0;
        field_e = SwitchComponent.e(true);
        field_d = "Solicitation";
    }
}
