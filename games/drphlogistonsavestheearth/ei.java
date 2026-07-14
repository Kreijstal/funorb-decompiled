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
        if (param1 != 83) {
            field_k = null;
        }
    }

    public final void a(boolean param0, kl param1) {
        if (!param0) {
            return;
        }
        ((ei) this).a((byte) 87);
    }

    abstract vh a(int param0, String param1);

    final String b(byte param0) {
        if (param0 != -66) {
          field_j = null;
          return ((ei) this).a((byte) 57, ((ei) this).field_l.field_p);
        } else {
          return ((ei) this).a((byte) 57, ((ei) this).field_l.field_p);
        }
    }

    final vh c(byte param0) {
        if (param0 > -64) {
          boolean discarded$2 = ((ei) this).a(true);
          return ((ei) this).a(8192, ((ei) this).field_l.field_p);
        } else {
          return ((ei) this).a(8192, ((ei) this).field_l.field_p);
        }
    }

    ei(kl param0) {
        ((ei) this).field_l = param0;
    }

    public final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          if (null != ((ei) this).field_l.field_p) {
            if (((ei) this).field_l.field_p.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_h = null;
          if (null == ((ei) this).field_l.field_p) {
            return true;
          } else {
            L0: {
              if (((ei) this).field_l.field_p.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_m = null;
        field_h = null;
        if (param0 != 1) {
          field_i = null;
          field_n = null;
          field_j = null;
          field_i = null;
          return;
        } else {
          field_n = null;
          field_j = null;
          field_i = null;
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(kk.a(var2, param1, 4767999), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract String a(byte param0, String param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new mg();
        field_h = "Close";
        field_n = new sa(1, 2, 2, 0);
        field_j = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_m = new int[8192];
    }
}
