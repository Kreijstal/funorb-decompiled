/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static String field_a;

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            if (param1 != -27844) {
              ka.a(-22);
            }
            JavaScriptBridge.callWithArguments(RichTextLayout.c(-14047), 22347, "resizing", new Object[]{new Integer(param0)});
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = -117 % ((param0 - 69) / 55);
        field_a = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          ug.field_A.a(NanoFrameTimer.field_g, true, mk.field_m, (byte) 124);
          ug.field_A.f(true);
          while (IterableNodeHashTable.a((byte) -72)) {
            ug.field_A.a((byte) 86, IsaacRandom.field_b, da.field_b);
          }
          if (param0 != 2) {
            field_a = (String) null;
          }
          if (il.field_c != -1) {
            var1_int = il.field_c;
            ni.a(-126, -1);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (gb.field_d) {
            stackIn_12_0 = 3;
            return stackIn_12_0;
          }
          if (MouseWheelInput.field_c == DualLinkNode.field_i) {
            stackIn_15_0 = 1;
            return stackIn_15_0;
          }
          if (!qa.field_c.b(12)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (DualLinkNode.field_i != bk.field_c) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.wrapClientException((Throwable) ((Object) var1), "ka.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Suggested names: ";
    }
}
