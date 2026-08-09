/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gg implements ip {
    static dd[] field_b;
    static boolean[] field_d;
    static int field_f;
    static String field_c;
    private long field_e;
    static String field_a;
    static int field_g;

    abstract String f(int param0);

    final static byte[] a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 43 / ((param0 - 33) / 60);
            stackIn_1_0 = me.field_r.a(false, param1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("gg.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (10 <= fk.field_ab) {
            if (-14 < (sf.field_y ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          gg.e(39);
          if (10 <= fk.field_ab) {
            if (-14 < (sf.field_y ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void b(int param0) {
        if (param0 != 11755) {
            this.field_e = 87L;
            this.field_e = rl.a((byte) -109);
            return;
        }
        this.field_e = rl.a((byte) -109);
    }

    public static void e(int param0) {
        if (param0 != -1) {
            return;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static wc a(int param0, boolean param1, String param2) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        java.applet.Applet var4 = null;
        wc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new wc(false);
              if (param1) {
                break L1;
              } else {
                var4 = (java.applet.Applet) null;
                gg.a((java.applet.Applet) null, (byte) 49);
                break L1;
              }
            }
            var3.field_g = param0;
            var3.field_b = param2;
            stackIn_3_0 = (wc) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("gg.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final na c(int param0) {
        if (this.d(-3)) {
          return wm.field_Pb;
        } else {
          if (param0 == -31873) {
            if ((350L + this.field_e ^ -1L) < (rl.a((byte) -101) ^ -1L)) {
              return ji.field_h;
            } else {
              return this.g(param0 ^ 17779);
            }
          } else {
            field_g = -106;
            if ((350L + this.field_e ^ -1L) < (rl.a((byte) -101) ^ -1L)) {
              return ji.field_h;
            } else {
              return this.g(param0 ^ 17779);
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param0.getDocumentBase().getFile();
                      var4 = var2;
                      var4 = var2;
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (-1 < (var3 ^ -1)) {
                        break L2;
                      } else {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(p.a((byte) -103, var5, param0), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L3;
                  }
                }
                if (param1 < -45) {
                  break L0;
                } else {
                  gg.a(false);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref);

                stackIn_10_1 = new StringBuilder().append("gg.D(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract na g(int param0);

    public final String a(int param0) {
        if (!this.d(-3)) {
          if (rl.a((byte) -123) >= this.field_e - -350L) {
            if (param0 <= 61) {
              field_c = (String) null;
              return this.f(-120);
            } else {
              return this.f(-120);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        field_f = 0;
        field_c = "You can join this game";
        field_a = "Logging in...";
        field_g = -1;
    }
}
