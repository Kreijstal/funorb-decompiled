/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleToken extends IntrusiveNode {
    IntrusiveDeque field_i;
    static String field_n;
    static int[] field_l;
    static int field_k;
    String text;
    static int field_g;
    int field_h;
    static boolean field_o;
    int kind;
    static String field_j;
    static int field_f;

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        apa stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var1_int = aqa.field_d - wt.field_a;
          wt.field_a = -(var1_int >> 1) + Transform3D.field_a;
          aqa.field_d = wt.field_a + var1_int;
          wp.field_b = -(aa.field_c >> 1) + AllPlatformsMazeComponent.field_N;
          var2 = wp.field_b;
          if (param0 <= 79) {
            return;
          }
          for (var3 = 0; cna.field_b.length > var3; var3++) {
            var4 = ComponentTargetList.field_c[var3];
            if (var4 < 0) {
              var5 = OpenGlToolkit.field_H;
            } else {
              if (lp.field_h.selectedIndex == var4) {
                var5 = RewardChoiceSlot.field_a;
              } else {
                var5 = RotaterMountComponent.field_I;
              }
            }
            var6 = cna.field_b[var3];
            stackIn_12_0 = -50;
            stackIn_13_1 = !(var4 < 0);
            var7 = apa.$cfr$intArgs$a$62abead39cee(stackIn_12_0, stackIn_13_1, var6);
            var8 = -(var7 >> 1) + Transform3D.field_a;
            if (var4 >= 0) {
              if (lp.field_h.selectedIndex == var4) {
                stackIn_17_0 = pua.field_c;
              } else {
                stackIn_17_0 = QuickChatPhraseDefinition.field_o;
              }
              var9 = stackIn_17_0;
              var2 = var2 + aqa.field_a;
              if (var9 != null) {
                var9.drawFrame((byte) 57, (S2CCharacterChoicePacket.field_a << 1) + var7, var2, var8 - S2CCharacterChoicePacket.field_a, FurnitureModel.field_n + (RenderLayer.field_d << 1));
              }
              var2 = var2 + RenderLayer.field_d;
            }
            if (0 > var4) {
              LegacyOpenGlTexture.field_b.drawText(var6, var8, sb.field_d + var2, var5, -1);
              var2 = var2 + CharacterSelectPhase.field_x;
            } else {
              OpenGlUnderwaterEffect.field_d.drawText(var6, var8, var2 + OpenGlBufferObject.field_f, var5, -1);
              var2 = var2 + (aqa.field_a + RenderLayer.field_d + FurnitureModel.field_n);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1), "mi.A(" + param0 + ')');
        }
    }

    public final String toString() {
        if (QuickChatPhraseSource.field_f == this.kind) {
          return "Method{" + this.text + "}";
        }
        if (this.kind == CrusherModel.field_o) {
          return "Number{" + this.text + "}";
        }
        if (PressureSwitchBehaviour.field_r == this.kind) {
          return "Boolean{" + this.text + "}";
        }
        if (LoginMethod.field_d == this.kind) {
          return "Char{" + this.text + "}";
        }
        if (LegacyOpenGlReflectionEffect.field_e == this.kind) {
          return "String{" + this.text + "}";
        }
        if (lna.field_a == this.kind) {
          return "ArgStart";
        }
        if (rs.field_a == this.kind) {
          return "ArgEnd";
        }
        if (this.kind == qba.field_c) {
          return "ArgComma";
        }
        return "Unknown";
    }

    ConsoleToken(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public static void releaseStatics(byte param0) {
        if (param0 == 101) {
          field_l = null;
          field_n = null;
          field_j = null;
          return;
        }
        ConsoleToken.releaseStatics((byte) -114);
        field_l = null;
        field_n = null;
        field_j = null;
    }

    ConsoleToken(int param0, int param1, String param2) {
        try {
          this.kind = param0;
          this.text = param2;
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "mi.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ConsoleValue evaluate(int param0, ConsoleMethod[] param1) throws ConsoleEvaluationException, ConsoleParseException {
        int incrementValue$0 = 0;
        ConsoleValue stackIn_9_0 = null;
        ConsoleValue stackIn_13_0 = null;
        ConsoleValue stackIn_17_0 = null;
        ConsoleValue stackIn_20_0 = null;
        ConsoleValue stackIn_22_0 = null;
        ConsoleValue stackIn_26_0 = null;
        ConsoleValue stackIn_33_0 = null;
        ConsoleValue stackIn_37_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ConsoleToken var5 = null;
        int var6 = 0;
        ConsoleValue[] var7 = null;
        ConsoleValue[] var8 = null;
        String var9 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -1) {
            this.text = (String) null;
          }
          try {
            if (QuickChatPhraseSource.field_f == this.kind) {
              var7 = new ConsoleValue[this.field_i.size((byte) -16)];
              var8 = var7;
              var4 = 0;
              var5 = (ConsoleToken) (this.field_i.first(-80));
              while (var5 != null) {
                incrementValue$0 = var4;
                var4++;
                var7[incrementValue$0] = var5.evaluate(-1, param1);
                var5 = (ConsoleToken) (this.field_i.next(114));
              }
              stackIn_9_0 = BeamSegment.invokeConsoleMethod(param1, 19, this.text, var8);
              return stackIn_9_0;
            }
            if (CrusherModel.field_o == this.kind) {
              var3_int = Character.toLowerCase(this.text.charAt(this.text.length() - 1));
              if (var3_int == 102) {
                stackIn_13_0 = new ConsoleValue(Float.valueOf(this.text).floatValue());
                return stackIn_13_0;
              }
              if (var3_int == 108) {
                stackIn_17_0 = new ConsoleValue(Long.parseLong(this.text.substring(0, this.text.length() - 1)));
                return stackIn_17_0;
              }
              if (this.text.indexOf('.') == -1) {
                stackIn_22_0 = new ConsoleValue(Integer.parseInt(this.text));
                return stackIn_22_0;
              }
              stackIn_20_0 = new ConsoleValue(Double.valueOf(this.text).doubleValue());
              return stackIn_20_0;
            }
            if (PressureSwitchBehaviour.field_r == this.kind) {
              stackIn_26_0 = new ConsoleValue(this.text.equals("true"));
              return stackIn_26_0;
            }
            if (this.kind == LoginMethod.field_d) {
              var9 = this.text.substring(1, this.text.length() - 1);
              if (var9.length() != 1) {
                throw new ConsoleEvaluationException("Invalid char value: " + var9);
              }
              stackIn_33_0 = new ConsoleValue(var9.charAt(0));
              return stackIn_33_0;
            }
            if (LegacyOpenGlReflectionEffect.field_e == this.kind) {
              stackIn_37_0 = new ConsoleValue(this.text.substring(1, -1 + this.text.length()));
              return stackIn_37_0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (NumberFormatException) (Object) decompiledCaughtException;
            throw new ConsoleEvaluationException("NumberFormatException on: " + this.text);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_43_0 = var3_ref;
          stackIn_43_1 = new StringBuilder().append("mi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    static {
        field_l = new int[]{15, 35, 12, 7, 18, 33};
        field_n = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_k = 33;
        field_j = "Players";
        field_o = false;
        field_f = -1;
    }
}
