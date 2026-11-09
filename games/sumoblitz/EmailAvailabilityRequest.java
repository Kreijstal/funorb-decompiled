/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityRequest {
    private String email;
    static TextureCombineOperation SUBTRACT;
    static IntrusiveDeque powerupPickups;
    static int field_a;
    private boolean available;
    static SpriteData field_g;
    private boolean complete;

    final boolean isAvailable(int guard) {
        if (guard != -1) {
          this.email(4);
          return this.available;
        }
        return this.available;
    }

    public static void releaseStatics(int param0) {
        SUBTRACT = null;
        if (param0 > -69) {
          return;
        }
        powerupPickups = null;
        field_g = null;
    }

    final boolean isComplete(boolean guard) {
        if (!guard) {
          this.email(71);
          return this.complete;
        }
        return this.complete;
    }

    final String email(int guard) {
        if (guard <= 16) {
          powerupPickups = (IntrusiveDeque) null;
          return this.email;
        }
        return this.email;
    }

    final void complete(int guard, boolean available) {
        this.available = available ? true : false;
        this.complete = true;
        int var3 = 18 % ((guard - 38) / 60);
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 != -113) {
          EmailAvailabilityRequest.a(-103, (byte) 12, 126);
          if ((param0 & 2048) == 0) {
            return false;
          }
          if ((55 & param2) != 0) {
            return true;
          }
          return false;
        }
        if ((param0 & 2048) == 0) {
          return false;
        }
        if ((55 & param2) != 0) {
          return true;
        }
        return false;
    }

    EmailAvailabilityRequest(String email) {
        this.available = false;
        this.complete = false;
        try {
          this.email = email;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bj.<init>(" + (email != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
        SUBTRACT = new TextureCombineOperation();
    }
}
