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
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = Geoblox.field_C;
        String var6 = "(" + ad.field_o + " " + dc.field_b + " " + kg.field_n + ") " + me.field_l;
        String var1 = var6;
        if (0 < p.field_k) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < p.field_k; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & eh.field_d.field_j[var2];
                var4 = var3 >> -88682940;
                var3 = var3 & 15;
                if (-11 < (var4 ^ -1)) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if ((var3 ^ -1) <= -11) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        if (param0 != 55) {
            return (String) null;
        }
        return var1;
    }

    private final void a(int param0, qc param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        int var8 = 0;
        int var9 = 0;
        qc var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (1 == param0) {
                this.field_p = uj.a('<', true, param1.e((byte) 116));
                break L1;
              } else {
                if (2 != param0) {
                  if (3 != param0) {
                    if (-5 != (param0 ^ -1)) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param1.c((byte) 34);
                    this.field_s = new int[var4_int][];
                    this.field_o = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param1.b(true);
                          var7 = b.a(false, var6);
                          if (var7 != null) {
                            this.field_o[var5] = var6;
                            array$1 = new int[var7.field_a];
                            this.field_s[var5] = array$1;
                            var8 = 0;
                            L4: while (true) {
                              if (var7.field_a <= var8) {
                                break L3;
                              } else {
                                this.field_s[var5][var8] = param1.b(true);
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
                  this.field_m = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      this.field_m[var5] = param1.b(true);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: {
              if (param2 == -26093) {
                break L6;
              } else {
                var10 = (qc) null;
                this.a(-112, (qc) null);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("og.H(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        if (param0 != 119) {
            field_r = 0.380857914686203f;
        }
        if (!(this.field_m == null)) {
            for (var2 = 0; this.field_m.length > var2; var2++) {
                this.field_m[var2] = lb.a(this.field_m[var2], 32768);
            }
        }
    }

    public static void f(int param0) {
        String discarded$0 = null;
        if (param0 < 71) {
            discarded$0 = og.e(41);
        }
        field_q = null;
    }

    final String e(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Geoblox.field_C;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 > -7) {
            og.f(41);
        }
        if (null == this.field_p) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_p[0]);
        for (var3 = 1; this.field_p.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_p[var3]);
        }
        return var2.toString();
    }

    og() {
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        fh.b(-6011);
        kd.field_e.f(10936);
        if (param0 != 2274) {
            return;
        }
        try {
            ml.field_t = new pf(b.field_a, (String) null, cf.field_i, param2, param3);
            hk.field_C = new ei(kd.field_e, ml.field_t);
            kd.field_e.a(false, hk.field_C);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "og.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
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
        int decompiledRegionSelector0 = 0;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("og.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        String discarded$0 = null;
        if (!param2) {
            String var5 = (String) null;
            discarded$0 = og.a((String) null, (String) null, true, (String) null);
        }
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(param3.length() + var4);
            var4 = param0.indexOf(param3, param1.length() + var4);
        }
        return param0;
    }

    static {
        field_q = new c[9];
    }
}
