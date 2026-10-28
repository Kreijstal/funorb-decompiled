/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static String field_d;
    static String field_a;
    static SystemTaskService field_c;
    static String field_b;

    abstract void attach(java.awt.Component component, boolean guard);

    abstract int pollRotation(int guard);

    final static void b(byte param0) {
        if (param0 != 76) {
          return;
        }
        if (null != bk.field_r) {
          bk.field_r.a((byte) -34);
        }
    }

    final static void enqueueSavedDataWrite(int guard, int opcode, SavedDataWrite write) {
        try {
          rd.field_b.addLast(-12328, write);
          SingleChildContainer.writeSavedData(-110, write, opcode);
          if (guard != 1) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ca.E(" + guard + ',' + opcode + ',' + (write != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_b = null;
        if (guard == 104) {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        MouseWheelInput.replaceCharacter(-29, 'ﾠ', (String) null, (String) null);
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static String replaceCharacter(int lengthAdjustment, char character, String input, String replacement) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var4_int = input.length();
          int var5 = replacement.length();
          int var6 = var4_int;
          int var7 = lengthAdjustment + var5;
          if (var7 != 0) {
            int var8_int = 0;
            while (true) {
              var8_int = input.indexOf((int) character, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          StringBuilder var8 = new StringBuilder(var6);
          int var9 = 0;
          while (true) {
            int var10 = input.indexOf((int) character, var9);
            if (var10 < 0) {
              StringBuilder discarded$2 = var8.append(input.substring(var9));
              String stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            StringBuilder discarded$0 = var8.append(input.substring(var9, var10));
            var9 = 1 + var10;
            StringBuilder discarded$1 = var8.append(replacement);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ca.D(").append(lengthAdjustment).append(',').append(character).append(',');
          if (input == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (replacement == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void detach(int guard, java.awt.Component component);

    static {
        field_d = null;
    }
}
