/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCredentialType {
    static String field_c;
    static volatile int pendingClickX;
    static Sprite[] field_f;
    int wireId;
    static String field_e;
    static ResourceArchive languageArchive;

    public static void releaseStatics(int guard) {
        field_c = null;
        field_e = null;
        int var1 = 22 % ((-65 - guard) / 36);
        field_f = null;
        languageArchive = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static byte[] extractBytes(Object storage, byte guard, boolean copy) {
        String stackIn_17_2 = null;
        try {
          if (storage == null) {
            return null;
          }
          if (!(storage instanceof byte[])) {
            if (!(storage instanceof ByteStorage)) {
              int var3_int = -100 % ((-31 - guard) / 55);
              throw new IllegalArgumentException();
            }
            ByteStorage var4 = (ByteStorage) (storage);
            byte[] stackIn_12_0 = var4.toByteArray(4);
            return stackIn_12_0;
          }
          byte[] var3 = (byte[]) (storage);
          if (!copy) {
            byte[] stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          byte[] stackIn_6_0 = AccountRequestDialog.copyByteArray(0, var3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var3_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("fk.B(");
          if (storage == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(',').append(copy).append(')').toString());
        }
    }

    final static void drawInsetUnevenFrame(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        AccountMessagePanel.drawUnevenFrame(param1, param0, param4, param3, param5, -90, param6, param8, param7);
        AccountMessagePanel.drawUnevenFrame(param1, -3 + param0, param4, -1, 3 + param5, 67, param6 + 3, -3 + param8, param7);
        if (param2 <= 52) {
          String var10 = (String) null;
          LoginCredentialType.findFriendByName(104, (String) null);
        }
    }

    final static boolean isDecimalText(boolean guard, CharSequence text) {
        String stackIn_7_2 = null;
        try {
          if (guard) {
            languageArchive = (ResourceArchive) null;
          }
          boolean stackIn_3_0 = RatingQuery.isIntText(10, (byte) 84, true, text);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("fk.C(").append(guard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static ContactEntry findFriendByName(int guard, String name) {
        String stackIn_25_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (null == NameAvailabilityResultSupport.field_b) {
            return null;
          }
          if (name == null) {
            return null;
          }
          if (0 == name.length()) {
            Object stackIn_7_0 = null;
            return (ContactEntry) (stackIn_7_0);
          }
          if (guard != -1465) {
            field_c = (String) null;
          }
          CharSequence var6 = (CharSequence) ((Object) name);
          String var2 = SessionCounterState.normalizeAccountName(guard ^ 1499, var6);
          if (var2 == null) {
            Object stackIn_12_0 = null;
            return (ContactEntry) (stackIn_12_0);
          }
          ContactEntry var3 = (ContactEntry) (NameAvailabilityResultSupport.field_b.get(-76, (long)var2.hashCode()));
          while (var3 != null) {
            CharSequence var7 = (CharSequence) ((Object) var3.displayName);
            String var4 = SessionCounterState.normalizeAccountName(-79, var7);
            if (var4.equals(var2)) {
              ContactEntry stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (ContactEntry) (NameAvailabilityResultSupport.field_b.nextMatch((byte) -36));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var2_ref;
          StringBuilder stackIn_24_1 = new StringBuilder().append("fk.A(").append(guard).append(',');
          if (name == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void advanceSessionCounters(int guard) {
        if (guard != 0) {
          LoginCredentialType.releaseStatics(115);
          if (SocketJs5Transport.field_r != null) {
            SocketJs5Transport.field_r.advanceCounters((byte) -127);
          }
          return;
        }
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.advanceCounters((byte) -127);
        }
    }

    LoginCredentialType(int param0) {
        this.wireId = param0;
    }

    static {
        pendingClickX = 0;
        field_c = "If you have an account, log in to start at any level you've reached.";
        field_e = "If you are ever unsure what to do, press 'ESC' in-game<br>and select 'Instructions' to view your current objective.";
    }
}
