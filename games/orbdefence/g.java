/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends aa {
    private int field_f;
    private long field_j;
    private int field_h;
    private long field_i;
    static int[] field_g;
    private long field_k;
    private long[] field_e;

    final void b(int param0) {
        if (~((g) this).field_i > ~((g) this).field_j) {
            ((g) this).field_i = ((g) this).field_i + (-((g) this).field_i + ((g) this).field_j);
        }
        ((g) this).field_k = (long)param0;
    }

    public static void b() {
        field_g = null;
        int var1 = 31;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (param0 == -21342) {
            break L0;
          } else {
            ((g) this).field_h = 48;
            break L0;
          }
        }
        if (((g) this).field_j > ((g) this).field_i) {
          ((g) this).field_k = ((g) this).field_k + (((g) this).field_j - ((g) this).field_i);
          ((g) this).field_i = ((g) this).field_i + (-((g) this).field_i + ((g) this).field_j);
          ((g) this).field_j = ((g) this).field_j + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((g) this).field_j = ((g) this).field_j + param1;
              var4++;
              if (10 <= var4) {
                break L2;
              } else {
                if (~((g) this).field_i < ~((g) this).field_j) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (~((g) this).field_j <= ~((g) this).field_i) {
                break L3;
              } else {
                ((g) this).field_j = ((g) this).field_i;
                break L3;
              }
            }
            return var4;
          }
        }
    }

    final long a(int param0) {
        L0: {
          int discarded$2 = 0;
          ((g) this).field_i = ((g) this).field_i + this.a();
          if (param0 == 17990) {
            break L0;
          } else {
            break L0;
          }
        }
        if (((g) this).field_i < ((g) this).field_j) {
          return (((g) this).field_j - ((g) this).field_i) / 1000000L;
        } else {
          return 0L;
        }
    }

    final static String a(CharSequence param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = jj.a(14461, bk.a(124, param0));
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = (String) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("g.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -119 + 41);
        }
        return stackIn_4_0;
    }

    final static String[] a(int param0, char param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        String[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var11 = (CharSequence) (Object) param2;
            int discarded$3 = 126;
            var3_int = bi.a(var11, param1);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var7 = 85 % ((param0 - -27) / 51);
            var6 = 0;
            var8 = 0;
            L1: while (true) {
              if (var3_int <= var8) {
                var4[var3_int] = param2.substring(var6);
                stackOut_8_0 = (String[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var9 = var6;
                L2: while (true) {
                  if (param1 == param2.charAt(var9)) {
                    int incrementValue$4 = var5;
                    var5++;
                    var4[incrementValue$4] = param2.substring(var6, var9);
                    var6 = var9 + 1;
                    var8++;
                    continue L1;
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("g.A(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    private final long a() {
        long var2 = 0L;
        long var4 = 0L;
        int var9 = 0;
        L0: {
          var9 = OrbDefence.field_D ? 1 : 0;
          var2 = System.nanoTime();
          var4 = -((g) this).field_k + var2;
          ((g) this).field_k = var2;
          if (var4 <= -5000000000L) {
            break L0;
          } else {
            if (5000000000L > var4) {
              ((g) this).field_e[((g) this).field_f] = var4;
              ((g) this).field_f = (((g) this).field_f - -1) % 10;
              if (1 <= ((g) this).field_h) {
                break L0;
              } else {
                ((g) this).field_h = ((g) this).field_h + 1;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        return 29L;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = f.a(param1, var4, -123).getFile();
                    Object discarded$6 = gm.a(true, "updatelinks", new Object[2], param1);
                    Object discarded$7 = gm.a(true, "updatelinks", new Object[2], param1);
                    Object discarded$8 = gm.a(true, "updatelinks", new Object[2], param1);
                    Object discarded$9 = gm.a(true, "updatelinks", new Object[2], param1);
                    Object discarded$10 = gm.a(true, "updatelinks", new Object[2], param1);
                    Object discarded$11 = gm.a(true, "updatelinks", new Object[2], param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("g.D(").append(1).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    g() {
        ((g) this).field_f = 0;
        ((g) this).field_h = 1;
        ((g) this).field_i = 0L;
        ((g) this).field_k = 0L;
        ((g) this).field_j = 0L;
        ((g) this).field_e = new long[10];
        ((g) this).field_i = System.nanoTime();
        ((g) this).field_j = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[128];
    }
}
