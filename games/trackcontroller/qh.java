/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    private boolean field_d;
    static ja field_e;
    static long field_f;
    private int[] field_g;
    private int field_a;
    static String field_c;
    static ea field_b;
    private int field_h;
    static boolean field_i;

    public static void a() {
        int var1 = -12;
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void a(int param0, int param1) {
        if (param0 >= 0) {
          if (((qh) this).field_a >= param0) {
            if (((qh) this).field_a == param0) {
              ((qh) this).field_a = ((qh) this).field_a - 1;
              if (param1 != -12759) {
                ((qh) this).a(-123, 110);
                return;
              } else {
                return;
              }
            } else {
              pd.a(((qh) this).field_g, 1 + param0, ((qh) this).field_g, param0, -param0 + ((qh) this).field_a);
              ((qh) this).field_a = ((qh) this).field_a - 1;
              if (param1 != -12759) {
                ((qh) this).a(-123, 110);
                return;
              } else {
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final static hg a(kk param0, int param1, kk param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object var6 = null;
        Object stackIn_4_0 = null;
        hg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == -11948) {
                break L1;
              } else {
                var6 = null;
                hg discarded$2 = qh.a((kk) null, -65, (kk) null, -113, 27);
                break L1;
              }
            }
            if (sk.a(param3, param2, param4 + 11949, param1)) {
              stackOut_5_0 = ra.a(param4 + 11446, param0.a(param1, param3, (byte) -67));
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (hg) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("qh.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
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
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_6_0;
    }

    final void a(byte param0, int param1) {
        this.a(((qh) this).field_a - -1, true, param1);
        int var3 = 39 / ((54 - param0) / 57);
    }

    final int c(byte param0, int param1) {
        int var3 = 0;
        if (((qh) this).field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          var3 = -41 / ((param0 - 1) / 55);
          return ((qh) this).field_g[param1];
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param0 <= ((qh) this).field_a) {
          if (((qh) this).field_g.length <= param0) {
            this.b((byte) 123, param0);
            ((qh) this).field_g[param0] = param2;
            return;
          } else {
            ((qh) this).field_g[param0] = param2;
            return;
          }
        } else {
          ((qh) this).field_a = param0;
          if (((qh) this).field_g.length > param0) {
            ((qh) this).field_g[param0] = param2;
            return;
          } else {
            this.b((byte) 123, param0);
            ((qh) this).field_g[param0] = param2;
            return;
          }
        }
    }

    private final void b(byte param0, int param1) {
        int[] var5 = new int[this.b(param1, 20029)];
        int[] var3 = var5;
        pd.a(((qh) this).field_g, 0, var5, 0, ((qh) this).field_g.length);
        int var4 = 87;
        ((qh) this).field_g = var5;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var3 = ((qh) this).field_g.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (!((qh) this).field_d) {
              var3 = var3 + ((qh) this).field_h;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((qh) this).field_h;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
            field_e = null;
            return ((qh) this).field_a - -1;
        }
        return ((qh) this).field_a - -1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
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
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                  int discarded$2 = 0;
                  param1.getAppletContext().showDocument(of.a(param1, var2), "_top");
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
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("qh.D(").append(0).append(44);
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
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private qh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Type your email address again to make sure it's correct";
        field_e = new ja();
    }
}
