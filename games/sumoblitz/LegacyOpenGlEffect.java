/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlEffect {
    static String[] monthShortNames;
    static int[] field_d;
    static ToolkitFont field_c;
    LegacyOpenGlGraphicsToolkit toolkit;

    final static AccountServiceResult accountSuccess(boolean showUnderageInfo, int guard) {
        AccountServiceResult var2 = new AccountServiceResult(true);
        var2.showUnderageInfo = showUnderageInfo ? true : false;
        if (guard == 8192) {
          return var2;
        }
        field_d = (int[]) null;
        return var2;
    }

    final static void readStatusFlagReply(int guard) {
        if (guard == 8192) {
          IntrusiveDequeCursor.field_b = false;
          NativeLibraryExtractor.incomingPacket.readUnsignedByte(guard ^ -23110);
          return;
        }
        field_d = (int[]) null;
        IntrusiveDequeCursor.field_b = false;
        NativeLibraryExtractor.incomingPacket.readUnsignedByte(guard ^ -23110);
    }

    abstract void disable(int guard);

    abstract void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture);

    abstract void refreshState(int guard, boolean lighting);

    abstract void enable(byte guard, boolean lighting);

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_d = null;
        monthShortNames = null;
        if (param0 != -76) {
          field_c = (ToolkitFont) null;
        }
    }

    abstract boolean isSupported(byte guard);

    LegacyOpenGlEffect(LegacyOpenGlGraphicsToolkit owner) {
        try {
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bq.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    abstract void setParameters(byte guard, int parameters0, int parameters1);

    static {
        field_d = new int[8192];
        monthShortNames = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
