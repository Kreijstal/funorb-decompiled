/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    j[] field_g;
    static hj field_d;
    int field_e;
    static fa[] field_c;
    int field_a;
    static String field_h;
    private static long[] field_b;
    static java.applet.Applet field_f;

    public static void d(int param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 0) {
            cg.d(51);
        }
        field_h = null;
    }

    final j a(int param0) {
        j var2 = null;
        j var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = OrbDefence.field_D ? 1 : 0;
        if (((cg) this).field_e != 0) {
          L0: {
            var2 = ((cg) this).field_g[0];
            if (param0 == -2) {
              break L0;
            } else {
              ((cg) this).field_a = -105;
              break L0;
            }
          }
          int fieldTemp$2 = ((cg) this).field_e - 1;
          ((cg) this).field_e = ((cg) this).field_e - 1;
          ((cg) this).field_g[0] = ((cg) this).field_g[fieldTemp$2];
          var3 = ((cg) this).field_g[fieldTemp$2];
          var4 = 0;
          var9 = ((cg) this).field_g[0].field_d;
          L1: while (true) {
            L2: {
              var5 = 1 + 2 * var4;
              if (var5 < ((cg) this).field_e) {
                L3: {
                  var6 = var4 * 2 - -2;
                  var7 = ((cg) this).field_g[var5].field_d;
                  if (((cg) this).field_e <= var6) {
                    break L3;
                  } else {
                    var8 = ((cg) this).field_g[var6].field_d;
                    if (var7 > var8) {
                      var7 = var8;
                      var5++;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var9 < var7) {
                  break L2;
                } else {
                  ((cg) this).field_g[var4] = ((cg) this).field_g[var5];
                  ((cg) this).field_g[var5] = var3;
                  var4 = var5;
                  continue L1;
                }
              } else {
                break L2;
              }
            }
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(j param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        j var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((cg) this).field_e < ((cg) this).field_a) {
                break L1;
              } else {
                int discarded$4 = -1;
                this.c();
                break L1;
              }
            }
            L2: {
              int fieldTemp$5 = ((cg) this).field_e;
              ((cg) this).field_e = ((cg) this).field_e + 1;
              var3_int = fieldTemp$5;
              ((cg) this).field_g[var3_int] = param0;
              var5 = param0.field_d;
              if (param1 == -83) {
                break L2;
              } else {
                field_b = null;
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (var3_int <= 0) {
                  break L4;
                } else {
                  var4 = -1 + var3_int >> 1;
                  var6 = ((cg) this).field_g[var4];
                  if (((cg) this).field_g[var4].field_d > var5) {
                    ((cg) this).field_g[var4] = param0;
                    ((cg) this).field_g[var3_int] = var6;
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cg.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ((cg) this).field_e == 0 ? true : false;
    }

    final static void a(mg param0, java.math.BigInteger param1, int param2, java.math.BigInteger param3, mg param4) {
        try {
            jc.a(param0, 53, 0, param4.field_j, param4.field_i, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "cg.F(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final void c() {
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        ((cg) this).field_a = ((cg) this).field_a << 1;
        j[] var5 = new j[((cg) this).field_a];
        j[] var2 = var5;
        for (var3 = 0; var3 < ((cg) this).field_e; var3++) {
            var5[var3] = ((cg) this).field_g[var3];
        }
        ((cg) this).field_g = var2;
    }

    cg(int param0) {
        if (param0 <= 0) {
            param0 = 16;
        }
        ((cg) this).field_a = param0;
        ((cg) this).field_g = new j[((cg) this).field_a];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_d = new hj(640, 480);
        field_h = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = new long[256];
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                field_b[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
