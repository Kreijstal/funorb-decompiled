/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rna {
    private eaa field_c;
    static String field_b;
    static String[] field_a;
    private bw field_d;

    final bw c(byte param0) {
        bw var2 = null;
        var2 = ((rna) this).field_c.field_g.field_e;
        if (param0 >= 118) {
          if (var2 == ((rna) this).field_c.field_g) {
            ((rna) this).field_d = null;
            return null;
          } else {
            ((rna) this).field_d = var2.field_e;
            return var2;
          }
        } else {
          return null;
        }
    }

    final bw a(byte param0) {
        bw var2 = null;
        if (param0 == 0) {
          var2 = ((rna) this).field_d;
          if (((rna) this).field_c.field_g == var2) {
            ((rna) this).field_d = null;
            return null;
          } else {
            ((rna) this).field_d = var2.field_b;
            return var2;
          }
        } else {
          return null;
        }
    }

    final bw b(byte param0) {
        bw var2 = null;
        int var3 = 0;
        var3 = 30 / ((param0 - -47) / 53);
        var2 = ((rna) this).field_c.field_g.field_b;
        if (var2 == ((rna) this).field_c.field_g) {
          ((rna) this).field_d = null;
          return null;
        } else {
          ((rna) this).field_d = var2.field_b;
          return var2;
        }
    }

    final static boolean b() {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var1 = f.b((byte) 73);
        var3 = -pla.field_g + var1;
        if (30000L >= var3) {
          L0: {
            var5 = 3000;
            if (qla.field_f >= 7) {
              var5 = 12000;
              break L0;
            } else {
              if (qla.field_f < 5) {
                if (qla.field_f < 3) {
                  break L0;
                } else {
                  var5 = 6000;
                  if (~(long)var5 > ~var3) {
                    qla.field_f = qla.field_f + 1;
                    pla.field_g = var1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = 9000;
                if (~(long)var5 <= ~var3) {
                  return false;
                } else {
                  qla.field_f = qla.field_f + 1;
                  pla.field_g = var1;
                  return true;
                }
              }
            }
          }
          if (~(long)var5 > ~var3) {
            qla.field_f = qla.field_f + 1;
            pla.field_g = var1;
            return true;
          } else {
            return false;
          }
        } else {
          pla.field_g = var1;
          qla.field_f = 0;
          return true;
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final bw d(byte param0) {
        bw var2 = ((rna) this).field_d;
        if (param0 != -124) {
            return null;
        }
        if (!(((rna) this).field_c.field_g != var2)) {
            ((rna) this).field_d = null;
            return null;
        }
        ((rna) this).field_d = var2.field_e;
        return var2;
    }

    final bw a(bw param0, byte param1) {
        bw var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        bw stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        bw stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1 == -86) {
              L1: {
                if (param0 == null) {
                  var3 = ((rna) this).field_c.field_g.field_e;
                  break L1;
                } else {
                  var3 = param0;
                  break L1;
                }
              }
              if (var3 != ((rna) this).field_c.field_g) {
                ((rna) this).field_d = var3.field_e;
                stackOut_9_0 = (bw) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                ((rna) this).field_d = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (bw) (Object) stackIn_8_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bw) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("rna.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final bw a(int param0, bw param1) {
        bw var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        bw stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        bw stackOut_10_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((rna) this).field_c.field_g.field_b;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (param0 == 6000) {
              if (var3 == ((rna) this).field_c.field_g) {
                ((rna) this).field_d = null;
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (bw) (Object) stackIn_9_0;
              } else {
                ((rna) this).field_d = var3.field_b;
                stackOut_10_0 = (bw) var3;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (bw) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("rna.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    rna(eaa param0) {
        try {
            ((rna) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rna.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Offer unrated rematch";
    }
}
