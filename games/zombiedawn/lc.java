/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private int field_b;
    static char field_c;
    private wm field_e;
    private int field_f;
    static int field_i;
    static volatile boolean field_d;
    private ii field_g;
    static int field_h;
    static ec field_a;
    static vn[] field_k;
    static int field_j;

    private final void a(long param0, int param1, int param2, Object param3) {
        bj var6 = null;
        jl var6_ref = null;
        int var7 = ZombieDawn.field_J;
        try {
            if (((lc) this).field_f < 1) {
                throw new IllegalStateException();
            }
            this.a((byte) -20, param0);
            ((lc) this).field_b = ((lc) this).field_b - 1;
            while (0 > ((lc) this).field_b) {
                var6 = (bj) (Object) ((lc) this).field_g.a(78);
                this.a(var6, 108);
            }
            var6_ref = new jl(param3, 1);
            ((lc) this).field_e.a(param0, true, (le) (Object) var6_ref);
            ((lc) this).field_g.a(0, (nb) (Object) var6_ref);
            ((bj) (Object) var6_ref).field_n = 0L;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "lc.G(" + param0 + ',' + 1 + ',' + 32500 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(bj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param1 > 100) {
              L1: {
                if (param0 != null) {
                  param0.b(-27598);
                  param0.c((byte) -79);
                  ((lc) this).field_b = ((lc) this).field_b + param0.field_r;
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("lc.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              uh.field_g = stackIn_4_0 != 0;
              if (!param1) {
                break L2;
              } else {
                b.field_p = new int[100];
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= b.field_p.length) {
                    oe.field_c = jp.a((byte) 125, 48);
                    break L2;
                  } else {
                    b.field_p[var2_int] = 256 / b.field_p.length * (var2_int * 65793);
                    var2_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) (Object) runtimeException, "lc.I(" + true + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, long param1) {
        bj var4 = (bj) (Object) ((lc) this).field_e.a(false, param1);
        this.a(var4, 123);
    }

    final void a(long param0, Object param1, int param2) {
        try {
            if (param2 != -16709) {
                ((lc) this).field_b = 11;
            }
            this.a(param0, 1, 32500, param1);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "lc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            Object var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(rc.a(-1, param0, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param1 == -2895) {
                    break L3;
                  } else {
                    var3 = null;
                    lc.a((java.applet.Applet) null, 6);
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("lc.F(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(dj param0, dj param1, byte param2) {
        try {
            ge.field_b = param1;
            int var3_int = 58;
            nl.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "lc.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 80 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_k = null;
    }

    final static int a(int param0, byte param1) {
        param0 = (1431655765 & param0) + ((param0 & -1431655765) >>> 1);
        param0 = ((param0 & -858993458) >>> 2) + (858993459 & param0);
        param0 = (param0 >>> 4) + param0 & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final Object a(long param0, int param1) {
        jl var6 = null;
        bj var8 = (bj) (Object) ((lc) this).field_e.a(false, param0);
        if (var8 == null) {
            return null;
        }
        if (param1 != 1431655765) {
            Object var7 = null;
            this.a((bj) null, 58);
        }
        Object var5 = var8.d((byte) 87);
        if (var5 == null) {
            var8.b(param1 ^ -1431649945);
            var8.c((byte) -21);
            ((lc) this).field_b = ((lc) this).field_b + var8.field_r;
            return null;
        }
        if (var8.b(true)) {
            var6 = new jl(var5, var8.field_r);
            ((lc) this).field_e.a(var8.field_f, true, (le) (Object) var6);
            ((lc) this).field_g.a(0, (nb) (Object) var6);
            ((bj) (Object) var6).field_n = 0L;
            var8.b(-27598);
            var8.c((byte) -60);
        } else {
            ((lc) this).field_g.a(0, (nb) (Object) var8);
            var8.field_n = 0L;
        }
        return var5;
    }

    private lc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 1;
        field_i = -1;
        field_d = true;
        field_j = 15;
    }
}
