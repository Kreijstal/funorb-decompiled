/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ei extends dc implements kd {
    private kl field_l;
    static he[] field_k;
    static mg field_i;
    static String field_h;
    static int field_o;
    static sa field_n;
    static int[] field_m;
    static String field_j;

    public final void a(kl param0, byte param1) {
        try {
          if (param1 != 83) {
            field_k = (he[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ei.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(boolean param0, kl param1) {
        if (!param0) {
          return;
        }
        try {
          this.a((byte) 87);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ei.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract vh a(int param0, String param1);

    final String b(byte param0) {
        if (param0 == -66) {
          return this.a((byte) 57, this.field_l.field_p);
        }
        field_j = (String) null;
        return this.a((byte) 57, this.field_l.field_p);
    }

    final vh c(byte param0) {
        if (param0 <= -64) {
          return this.a(8192, this.field_l.field_p);
        }
        this.a(true);
        return this.a(8192, this.field_l.field_p);
    }

    ei(kl param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(boolean param0) {
        if (param0) {
          field_h = (String) null;
          if (null != this.field_l.field_p) {
            return this.field_l.field_p.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_l.field_p) {
          return true;
        }
        if (this.field_l.field_p.length() != 0) {
          return false;
        }
        return true;
    }

    public static void d(int param0) {
        field_k = null;
        field_m = null;
        field_h = null;
        if (param0 == 1) {
          field_n = null;
          field_j = null;
          field_i = null;
          return;
        }
        field_i = (mg) null;
        field_n = null;
        field_j = null;
        field_i = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              param1.getAppletContext().showDocument(kk.a(var2, param1, 4767999), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("ei.S(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract String a(byte param0, String param1);

    static {
        field_i = new mg();
        field_h = "Close";
        field_n = new sa(1, 2, 2, 0);
        field_j = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_m = new int[8192];
    }
}
