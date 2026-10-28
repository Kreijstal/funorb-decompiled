/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameAvailabilityResult {
    boolean field_a;
    String field_f;
    String[] field_c;
    static String[] field_b;
    int field_g;
    boolean field_e;
    static PcmSample field_d;

    public static void releaseStatics(byte guard) {
        field_b = null;
        field_d = null;
        if (guard != -10) {
          field_b = (String[]) null;
        }
    }

    final static void a(byte param0) {
        try {
          boolean decompiledRegionSelector0 = false;
          if (SavedDataWrite.field_h != null) {
            try {
              SavedDataWrite.field_h.seek(0, 0L);
              SavedDataWrite.field_h.write(true, QuickChatDynamicCommand.incomingPackets.position, QuickChatDynamicCommand.incomingPackets.payload, 24);
              decompiledRegionSelector0 = false;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              Exception var1 = (Exception) (Object) decompiledCaughtException;
              decompiledRegionSelector0 = true;
            }
            if (!decompiledRegionSelector0) {
              QuickChatDynamicCommand.incomingPackets.position = QuickChatDynamicCommand.incomingPackets.position + 24;
              if (param0 > -44) {
                NameAvailabilityResult.a((byte) -105);
              }
              return;
            }
          }
          QuickChatDynamicCommand.incomingPackets.position = QuickChatDynamicCommand.incomingPackets.position + 24;
          if (param0 <= -44) {
            return;
          }
          NameAvailabilityResult.a((byte) -105);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    NameAvailabilityResult(boolean param0) {
        this.field_a = param0 ? true : false;
    }

    static {
        field_b = new String[]{"infracstructure_glow_asteroid", "infracstructure_glow_ice", null, "infracstructure_glow_alien", null};
    }
}
