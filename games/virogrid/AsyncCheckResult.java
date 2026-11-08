/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AsyncCheckResult {
    private boolean field_d;
    static String field_h;
    static String field_g;
    private boolean field_b;
    static ModelMesh field_c;
    static float field_a;
    private String field_f;
    static int field_e;

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_c = null;
        field_g = null;
        if (param0 != 123) {
          AsyncCheckResult.releaseStatics((byte) 16);
        }
    }

    AsyncCheckResult(String param0) {
        this.field_b = false;
        this.field_d = false;
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isAccepted(byte param0) {
        int var2 = 66 / ((param0 - 14) / 53);
        return this.field_d;
    }

    final String getText(int param0) {
        if (param0 != 32) {
          String var3 = (String) null;
          AsyncCheckResult.wrapException((Throwable) null, (String) null);
          return this.field_f;
        }
        return this.field_f;
    }

    final static ClientException wrapException(Throwable param0, String param1) {
        ClientException var2 = null;
        if (!(param0 instanceof ClientException)) {
          var2 = new ClientException(param0, param1);
        } else {
          var2 = (ClientException) ((Object) param0);
          var2.field_c = var2.field_c + ' ' + param1;
        }
        return var2;
    }

    final void complete(boolean param0, int param1) {
        if (param1 != 11358) {
          return;
        }
        this.field_d = param0 ? true : false;
        this.field_b = true;
    }

    final boolean isComplete(int param0) {
        if (param0 > -42) {
          return false;
        }
        return this.field_b;
    }

    static {
        field_h = "End Game";
        field_g = "Hide players in <%0>'s game";
        field_e = 0;
    }
}
