/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContactEntry extends LegacyWidgetStyle {
    String displayName;
    String location;
    static long field_mb;
    static String[] field_nb;
    int insertionOrder;

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          ContactEntry.requestAchievements(-28, 85);
          field_nb = null;
          return;
        }
        field_nb = null;
    }

    final static AchievementQuery requestAchievements(int opcode, int guard) {
        if (guard >= 89) {
          AchievementQuery var2 = new AchievementQuery();
          SavedDataQuerySupport.field_b.addLast(-12328, var2);
          DirectByteStorage.writeAchievementQuery(opcode, -22);
          return var2;
        }
        return (AchievementQuery) null;
    }

    ContactEntry() {
        super(0L, (LegacyWidgetStyle) null);
    }

    final static boolean isValidAccountName(int guard, CharSequence name) {
        String stackIn_7_2 = null;
        try {
          if (guard < 51) {
            CharSequence var3 = (CharSequence) null;
            ContactEntry.isValidAccountName(-9, (CharSequence) null);
          }
          boolean stackIn_3_0 = PacketBuffer.isValidAccountName(false, name, 113);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("tg.I(").append(guard).append(',');
          if (name == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String currentDisplayName(int guard) {
        if (guard != 0) {
          return (String) null;
        }
        if (null == ThreeSliceButtonPainter.field_r) {
          return "";
        }
        return ThreeSliceButtonPainter.field_r;
    }

    static {
    }
}
