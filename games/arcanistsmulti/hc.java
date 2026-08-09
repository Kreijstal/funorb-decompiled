/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    private String field_b;
    static String field_d;
    private boolean field_c;
    static db field_i;
    static String field_g;
    static int[] field_e;
    static String field_a;
    static boolean field_f;
    static db field_h;

    hc(String param0) {
        this(param0, false);
    }

    final static String b(byte param0) {
        if (param0 < -105) {
          if (sk.field_a == in.field_Gb) {
            return kf.field_a;
          } else {
            return vh.field_o;
          }
        } else {
          field_d = (String) null;
          if (sk.field_a == in.field_Gb) {
            return kf.field_a;
          } else {
            return vh.field_o;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param1 == 27901) {
                      break L1;
                    } else {
                      field_f = true;
                      break L1;
                    }
                  }
                  var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                  param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("hc.B(");

                if (param0 == null) {
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
              throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hc(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((hc) (this)).field_c = stackIn_4_1 != 0;
              if (this.field_b != null) {
                break L2;
              } else {
                this.field_b = "";
                break L2;
              }
            }
            if (this.field_b.length() == 0) {
              this.field_c = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("hc.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1) {
          L0: {
            field_a = (String) null;
            if (hb.field_Gb != sk.field_a) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (hb.field_Gb != sk.field_a) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final String b(int param0) {
        int var2 = -73 % ((19 - param0) / 42);
        return this.field_b;
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 != -60) {
          hc.a((byte) -54);
          field_e = null;
          field_g = null;
          field_i = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_i = null;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.field_c;
    }

    static {
        field_d = "Location";
        field_i = new db();
        field_g = "You can only cast this spell once per turn";
        field_a = "Character's Spells";
        field_h = new db();
    }
}
