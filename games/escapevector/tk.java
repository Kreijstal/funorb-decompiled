/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static Sprite[] field_a;
    static qh field_b;

    public static void b(int param0) {
        if (param0 != 31167) {
          qh[] var2 = (qh[]) null;
          tk.a(false, (qh[]) null);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 23403) {
          tk.b(-66);
        }
        return FullscreenFocusCanvas.field_e.a(false);
    }

    final static Sprite[] a(boolean param0, qh[] param1) {
        String stackIn_15_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (!nm.a((byte) -73, param1)) {
            Object stackIn_3_0 = null;
            return (Sprite[]) (stackIn_3_0);
          }
          Sprite[] var3 = new Sprite[param1.length];
          if (param0) {
            Sprite[] stackIn_6_0 = (Sprite[]) null;
            return stackIn_6_0;
          }
          for (int var4 = 0; var4 < param1.length; var4++) {
            var3[var4] = param1[var4].b(94);
          }
          Sprite[] stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var2;
          StringBuilder stackIn_14_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          qd var5 = (qd) (RasterSnapshot.field_l.first(false));
          int var3 = -57 / ((-46 - param0) / 51);
          while (var5 != null) {
            DebouncedValidator.a(var5, param1, true);
            var5 = (qd) (RasterSnapshot.field_l.next((byte) 70));
          }
          IntrusiveNode var2 = bc.field_b.first(false);
          while (var2 != null) {
            km.a(param1, 122);
            var2 = bc.field_b.next((byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "tk.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new Sprite[7];
    }
}
