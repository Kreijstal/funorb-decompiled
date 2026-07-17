/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends rc {
    static c[] field_q;
    static float field_r;
    static int field_n;
    int[] field_m;
    private int[] field_o;
    private String[] field_p;
    private int[][] field_s;

    final static String e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Geoblox.field_C;
        String var1 = "(" + ad.field_o + " " + dc.field_b + " " + kg.field_n + ") " + me.field_l;
        if (0 < p.field_k) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < p.field_k; var2++) {
                var1 = var1 + 32;
                var3 = 255 & eh.field_d.field_j[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        if (param0 != 55) {
            return null;
        }
        return var1;
    }

    private final void a(int param0, qc param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (1 == param0) {
                ((og) this).field_p = uj.a('<', true, param1.e((byte) 116));
                break L1;
              } else {
                if (2 != param0) {
                  if (3 != param0) {
                    if (param0 != 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param1.c((byte) 34);
                    ((og) this).field_s = new int[var4_int][];
                    ((og) this).field_o = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param1.b(true);
                          var7 = b.a(false, var6);
                          if (var7 != null) {
                            ((og) this).field_o[var5] = var6;
                            ((og) this).field_s[var5] = new int[var7.field_a];
                            var8 = 0;
                            L4: while (true) {
                              if (var7.field_a <= var8) {
                                break L3;
                              } else {
                                ((og) this).field_s[var5][var8] = param1.b(true);
                                var8++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param1.c((byte) 34);
                  ((og) this).field_m = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      ((og) this).field_m[var5] = param1.b(true);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("og.H(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + -26093 + 41);
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        if (param0 != 119) {
            field_r = 0.380857914686203f;
        }
        if (!(((og) this).field_m == null)) {
            for (var2 = 0; ((og) this).field_m.length > var2; var2++) {
                ((og) this).field_m[var2] = lb.a(((og) this).field_m[var2], 32768);
            }
        }
    }

    public static void f(int param0) {
        if (param0 < 71) {
            String discarded$0 = og.e(41);
        }
        field_q = null;
    }

    final String e(byte param0) {
        int var3 = 0;
        int var4 = Geoblox.field_C;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 > -7) {
            og.f(41);
        }
        if (null == ((og) this).field_p) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((og) this).field_p[0]);
        for (var3 = 1; ((og) this).field_p.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((og) this).field_p[var3]);
        }
        return var2.toString();
    }

    og() {
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        int discarded$0 = -6011;
        fh.b();
        kd.field_e.f(10936);
        try {
            ml.field_t = new pf(b.field_a, (String) null, cf.field_i, param2, param3);
            hk.field_C = new ei(kd.field_e, (el) (Object) ml.field_t);
            kd.field_e.a(false, (el) (Object) hk.field_C);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "og.C(" + 2274 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, qc param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == 0) {
              L1: while (true) {
                var3_int = param1.c((byte) 34);
                if (0 != var3_int) {
                  this.a(var3_int, param1, -26093);
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("og.B(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(param3.length() + var4);
            var4 = param0.indexOf(param3, param1.length() + var4);
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new c[9];
    }
}
