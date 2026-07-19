/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends ms {
    static java.awt.Frame field_n;
    int field_p;
    static int[] field_t;
    String[][] field_o;
    long[][] field_r;
    int[][] field_m;
    static String field_k;
    boolean field_q;
    int field_l;
    int field_s;

    final static of a(int param0, int param1, int param2, int param3, int param4) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        of var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var5 = (of) ((Object) oi.field_b.b(param1 + -107));
        L0: while (true) {
          L1: {
            if (var5 == null) {
              break L1;
            } else {
              var8 = var5.field_p ^ -1;
              var7 = param2 ^ -1;
              if (var6 != 0) {
                if (var7 != var8) {
                  discarded$2 = of.c((byte) 50);
                  pd.a((byte) -65, param3, var5);
                  return var5;
                } else {
                  pd.a((byte) -65, param3, var5);
                  return var5;
                }
              } else {
                if (var7 != var8) {
                  var5 = (of) ((Object) oi.field_b.d((byte) 18));
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var5;
                }
              }
            }
          }
          var5 = new of();
          var5.field_s = param0;
          var5.field_l = param4;
          var5.field_p = param2;
          oi.field_b.a((ms) (var5), (byte) 39);
          if (param1 != 1) {
            discarded$3 = of.c((byte) 50);
            pd.a((byte) -65, param3, var5);
            return var5;
          } else {
            pd.a((byte) -65, param3, var5);
            return var5;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param1.getDocumentBase().getFile();
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (param0 == 8192) {
                      L2: {
                        if (var3 >= 0) {
                          var4 = var4 + var2.substring(var3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5 = new java.net.URL(param1.getCodeBase(), var4);
                      param1.getAppletContext().showDocument(td.a((byte) 122, param1, var5), "_self");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var2_ref2);
                stackOut_9_1 = new StringBuilder().append("of.F(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        po.field_a = true;
        if (param0 > -102) {
            field_t = (int[]) null;
        }
    }

    final static boolean a(fs param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
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
              var2_int = param0.e(-31302);
              if (var2_int != 1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            var4 = 88 / ((70 - param1) / 33);
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("of.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static String c(int param0) {
        int var1 = -4 / ((param0 - 48) / 36);
        if (nw.field_e == ad.field_p) {
            return in.field_C;
        }
        if (!ut.field_o.a(true)) {
            return ut.field_o.b(32);
        }
        if (!(ad.field_p != vm.field_c)) {
            return ut.field_o.b(107);
        }
        return ac.field_F;
    }

    final static boolean c(byte param0) {
        int var1 = -123 % ((67 - param0) / 50);
        if (!mc.b((byte) -89, "jaclib")) {
            return false;
        }
        return mc.b((byte) 93, "hw3d");
    }

    public static void a(int param0) {
        String discarded$2 = null;
        if (param0 != -26437) {
          discarded$2 = of.c(-86);
          field_n = null;
          field_k = null;
          field_t = null;
          return;
        } else {
          field_n = null;
          field_k = null;
          field_t = null;
          return;
        }
    }

    of() {
    }

    static {
        field_t = new int[8192];
        field_k = "Quit to website";
    }
}
