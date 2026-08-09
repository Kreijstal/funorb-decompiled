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
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            String stackIn_6_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (mb.a(param1, "getcookies", true));
                    var4 = uj.a(-89, ';', var3);
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var6 = var4[var5].indexOf('=');
                          if ((var6 ^ -1) > -1) {
                            break L3;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param0)) {
                              stackIn_6_0 = var4[var5].substring(var6 - -1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param2 < 77) {
                    field_r = (hl[]) null;
                    stackIn_13_0 = null;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("fh.N(");

                if (param0 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

                if (param1 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_13_0);
            } else {
              return stackIn_6_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        java.applet.Applet var4 = null;
        we var5 = null;
        dg var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var6 = (dg) ((Object) vb.field_k.c(-3905));
              if (param1 == 8100) {
                break L1;
              } else {
                var4 = (java.applet.Applet) null;
                fh.a((String) null, (java.applet.Applet) null, (byte) -52);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 == null) {
                var5 = (we) ((Object) ma.field_h.c(-3905));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    la.a(0, var5, param0);
                    var5 = (we) ((Object) ma.field_h.a(param1 + -25013));
                    continue L3;
                  }
                }
              } else {
                tj.a((byte) 69, var6, param0);
                var6 = (dg) ((Object) vb.field_k.a(param1 + -25013));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "fh.K(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        int var1 = 43 % ((param0 - -7) / 39);
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
            throw sd.a((Throwable) ((Object) runtimeException), "fh.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    fh(int param0) {
        this(nb.field_c, param0);
    }

    static {
        field_r = new hl[8];
    }
}
