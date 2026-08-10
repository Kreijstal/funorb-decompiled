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
        if (param0 != -66) {
          field_j = (String) null;
          return this.a((byte) 57, this.field_l.field_p);
        } else {
          return this.a((byte) 57, this.field_l.field_p);
        }
    }

    final vh c(byte param0) {
        if (param0 > -64) {
          this.a(true);
          return this.a(8192, this.field_l.field_p);
        } else {
          return this.a(8192, this.field_l.field_p);
        }
    }

    ei(kl param0) {
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (!param0) {
          if (null != this.field_l.field_p) {
            if (this.field_l.field_p.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_h = (String) null;
          if (null == this.field_l.field_p) {
            return true;
          } else {
            L0: {
              if (this.field_l.field_p.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
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
          field_i = (mg) null;
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
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (!param0) {
                      var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                      param1.getAppletContext().showDocument(kk.a(var2, param1, 4767999), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("ei.S(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
