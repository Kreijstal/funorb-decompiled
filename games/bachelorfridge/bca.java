/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bca extends ii {
    boolean field_p;
    static al[][] field_n;
    eaa field_o;

    public static void c(int param0) {
        vr var2 = null;
        if (param0 != 15) {
          var2 = (vr) null;
          bca.a(-63, (vr) null, (vr) null);
          field_n = (al[][]) null;
          return;
        } else {
          field_n = (al[][]) null;
          return;
        }
    }

    private final void a(aga param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.a(this.field_k, 9)) {
                  break L2;
                } else {
                  if (!param0.a(119, 9)) {
                    break L2;
                  } else {
                    param0.d(119, (byte) -81);
                    break L1;
                  }
                }
              }
              param0.d(this.field_k, (byte) -85);
              break L1;
            }
            if (param1 == 119) {
              break L0;
            } else {
              field_n = (al[][]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("bca.J(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    bca(lu param0) {
        super(4, param0.e((byte) 76), param0);
    }

    final void a(op param0, boolean param1) {
        if (this instanceof ew) {
            return;
        }
        if (param1) {
            return;
        }
        try {
            this.a(this.field_l.a(109, param0), 119);
            this.a(param0, -81);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bca.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bca(int param0, nq param1) {
        super(4, param0, param1);
        try {
            this.field_o = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = 26 % ((param1 - 12) / 35);
            var3 = this.field_l.a(50, param0);
            if (this.field_k != 57) {
              L1: {
                if (this.field_k == 62) {
                  break L1;
                } else {
                  if (this.field_k != 63) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              param0.a(-25, var3, 14);
              return;
            } else {
              param0.a(-25, var3, 15);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("bca.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, vr param1, vr param2) {
        try {
            if (param0 > -101) {
                vr var4 = (vr) null;
                bca.a(51, (vr) null, (vr) null);
            }
            la.field_s = param2;
            sha.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bca.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(op param0, byte param1) {
        pp var4 = null;
        int var5 = BachelorFridge.field_y;
        if (param1 != -2) {
            aga var6 = (aga) null;
            this.a((aga) null, -54);
        }
        aga var3 = this.field_l.a(53, param0);
        if (this.field_p) {
            return;
        }
        try {
            var4 = (pp) ((Object) this.field_o.b((byte) 90));
            while (var4 != null) {
                var4.a(var3, param0, 12);
                var4 = (pp) ((Object) this.field_o.c(0));
            }
            this.a(var3, param1 + 121);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bca.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(byte param0, lu param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        pp var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param1.b(this.field_k, -113);
              if (param0 <= -12) {
                break L1;
              } else {
                field_n = (al[][]) null;
                break L1;
              }
            }
            param1.d(this.field_o.g(0), 0);
            var5 = (pp) ((Object) this.field_o.b((byte) 90));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.a(param1, (byte) 92);
                var5 = (pp) ((Object) this.field_o.c(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("bca.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
    }
}
