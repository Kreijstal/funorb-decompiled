/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static j field_a;
    static int field_d;
    static int field_c;
    static int[] field_b;

    final static int a(byte param0) {
        if (param0 != -124) {
            field_a = (j) null;
            return ab.field_j;
        }
        return ab.field_j;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -30254) {
            wk.a((byte) -22);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 126 / ((param0 - 2) / 39);
            stackIn_1_0 = ek.a(-36, param1, 0, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("wk.D(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            RuntimeException var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            var8 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param0.getParameter("cookieprefix");
                      var3 = var9 + "settings";
                      var4 = (String) (kj.a(param0, false, "getcookies"));
                      var5 = vi.a(';', var4, 0);
                      var6 = 0;
                      if (param1 == -45) {
                        break L2;
                      } else {
                        wk.b((byte) 74);
                        break L2;
                      }
                    }
                    L3: while (true) {
                      L4: {
                        if (var5.length <= var6) {
                          break L4;
                        } else {
                          var7 = var5[var6].indexOf('=');
                          if (var8 != 0) {
                            break L4;
                          } else {
                            L5: {
                              if (0 > var7) {
                                break L5;
                              } else {
                                if (var5[var6].substring(0, var7).trim().equals(var3)) {
                                  stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var6++;
                            if (var8 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (md.field_j != null) {
                    stackIn_16_0 = md.field_j;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return param0.getParameter("settings");
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2);

                stackIn_19_1 = new StringBuilder().append("wk.B(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              return stackIn_9_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(byte param0) {
        CharSequence[] var2;
        if (!ll.c(true)) {
          return;
        } else {
          tf.a((byte) 77, false, 4);
          if (param0 <= -88) {
            return;
          } else {
            var2 = (CharSequence[]) null;
            wk.a(96, (CharSequence[]) null);
            return;
          }
        }
    }

    static {
        field_a = new j(12, 34, 190);
    }
}
