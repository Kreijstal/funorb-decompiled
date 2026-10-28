/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static String field_a;
    static AccountRequestDialog field_b;

    public static void releaseStatics(byte guard) {
        field_a = null;
        if (guard > -103) {
          field_a = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (param1 != 17205) {
            be.releaseStatics((byte) 71);
          }
          SavedDataWrite var4 = (SavedDataWrite) (rd.field_b.first(false));
          while (var4 != null) {
            SingleChildContainer.writeSavedData(-118, var4, param0);
            var4 = (SavedDataWrite) (rd.field_b.next((byte) 70));
          }
          IntrusiveNode var2 = SpriteState.field_w.first(false);
          while (var2 != null) {
            MarkerSlider.writeSavedDataQuery(param0, (byte) -63);
            var2 = SpriteState.field_w.next((byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "be.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Play Tutorial";
        IntrusiveDeque discarded$0 = new IntrusiveDeque();
    }
}
