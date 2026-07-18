/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fh extends hd {
    static hl[] field_r;
    static hl field_q;

    fh(qe param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_p, -1, 2147483647, false);
    }

    final static String a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            String stackIn_7_0 = null;
            Object stackIn_11_0 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            Object stackOut_10_0 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              try {
                var3 = (String) mb.a(param1, "getcookies", true);
                var4 = uj.a(-89, ';', var3);
                var5 = 0;
                L0: while (true) {
                  if (var4.length > var5) {
                    L1: {
                      var6 = var4[var5].indexOf('=');
                      if (var6 < 0) {
                        break L1;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                          stackOut_6_0 = var4[var5].substring(var6 - -1).trim();
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    var5++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = decompiledCaughtException;
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                return (String) (Object) stackIn_11_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var3_ref2;
                stackOut_12_1 = new StringBuilder().append("fh.N(");
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param0 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L2;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L2;
                }
              }
              L3: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L3;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L3;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + 120 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        dg var4 = null;
        we var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            var4 = (dg) (Object) vb.field_k.c(-3905);
            L1: while (true) {
              if (var4 == null) {
                var5 = (we) (Object) ma.field_h.c(-3905);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    la.a(0, var5, 5);
                    var5 = (we) (Object) ma.field_h.a(-16913);
                    continue L2;
                  }
                }
              } else {
                tj.a((byte) 69, var4, 5);
                var4 = (dg) (Object) vb.field_k.a(-16913);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "fh.K(" + 5 + ',' + 8100 + ')');
        }
    }

    public static void b(byte param0) {
        int var1 = 0;
        field_q = null;
        field_r = null;
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        try {
            if (!(!param1)) {
                sk.a(param0 + param4.field_s, param4.field_i, param4.field_f, true, param4.field_j + param3);
            }
            int var6_int = -54 / ((param2 - 2) / 54);
            super.a(param0, param1, 66, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fh.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    fh(int param0) {
        this(nb.field_c, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new hl[8];
    }
}
