/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aba extends pk implements fca {
    static boolean field_f;
    private lka field_e;

    final jg c(byte param0) {
        if (param0 != 35) {
          field_f = true;
          return this.a(this.field_e.field_w, false);
        } else {
          return this.a(this.field_e.field_w, false);
        }
    }

    public final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 5) {
          if (null != this.field_e.field_w) {
            if (this.field_e.field_w.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_f = true;
          if (null == this.field_e.field_w) {
            return true;
          } else {
            L0: {
              if (this.field_e.field_w.length() != 0) {
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

    final static kv[] a(kv param0, boolean param1) {
        kv[] var2 = null;
        RuntimeException var2_ref = null;
        kv var3 = null;
        kv[] var4 = null;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var3 = (kv) null;
                aba.a((kv) null, true);
                break L1;
              }
            }
            var4 = new kv[9];
            var2 = var4;
            var4[4] = param0;
            stackIn_3_0 = (kv[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("aba.CA(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(lka param0, byte param1) {
        try {
            int var3_int = 96 % ((param1 - 0) / 49);
            this.a(574);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "aba.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(byte param0) {
        if (param0 < 97) {
            return (String) null;
        }
        return this.a((byte) 112, this.field_e.field_w);
    }

    final static void a(byte param0, int param1) {
        int var2 = 84 % ((param0 - -18) / 34);
        ol.a(jga.field_y[param1], true);
    }

    public final void a(lka param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.c((byte) 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("aba.G(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static pp a(lu param0, int param1) {
        RuntimeException var2 = null;
        lu var3 = null;
        eba stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 9) {
                break L1;
              } else {
                var3 = (lu) null;
                aba.a((lu) null, 85);
                break L1;
              }
            }
            stackIn_3_0 = new eba();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("aba.BA(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (pp) ((Object) stackIn_3_0);
    }

    abstract jg a(String param0, boolean param1);

    abstract String a(byte param0, String param1);

    aba(lka param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "aba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
