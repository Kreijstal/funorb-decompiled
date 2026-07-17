/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    String field_l;
    static sj field_e;
    String field_g;
    int field_d;
    bj field_j;
    static String field_a;
    static ta field_k;
    String field_m;
    static ea field_h;
    private static int[] field_c;
    static char[] field_n;
    static ta field_b;
    static hg field_f;
    static hg field_o;
    static bj field_i;

    final static String a(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var5 = MinerDisturbance.field_ab;
        var6 = "(" + lc.field_s + " " + rd.field_a + " " + ud.field_a + ") " + oj.field_K;
        if (rj.field_d > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (rj.field_d > var2) {
              var7 = var1 + 32;
              var3 = kj.field_a.field_u[var2] & 255;
              var4 = var3 >> 4;
              var3 = var3 & 15;
              stackOut_11_0 = var4;
              stackOut_11_1 = 10;
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (var5 != 0) {
                if (stackIn_14_0 <= stackIn_14_1) {
                  field_e = null;
                  return var7;
                } else {
                  return var7;
                }
              } else {
                L1: {
                  L2: {
                    if (stackIn_12_0 >= stackIn_12_1) {
                      break L2;
                    } else {
                      var4 += 48;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4 += 55;
                  break L1;
                }
                L3: {
                  L4: {
                    if (var3 < 10) {
                      break L4;
                    } else {
                      var3 += 55;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 += 48;
                  break L3;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
                var2++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  if (param0 <= 48) {
                    field_e = null;
                    return var1;
                  } else {
                    return var1;
                  }
                }
              }
            } else {
              if (param0 <= 48) {
                field_e = null;
                return var1;
              } else {
                return var1;
              }
            }
          }
        } else {
          if (param0 <= 48) {
            field_e = null;
            return var6;
          } else {
            return var6;
          }
        }
    }

    final static void a(bj param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pb var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ld var8 = null;
        ld var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param1 == 347664612) {
              var8 = new ld(param0.a("", 0, "logo.fo3d"));
              var9 = var8;
              var3 = var9.d((byte) -54);
              var9.f((byte) 16);
              bl.field_v = tk.a(-123, var9);
              aj.field_b = new pb[var3];
              pa.field_b = new int[var3][];
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var4 >= var3) {
                    var9.o(-98);
                    break L2;
                  } else {
                    aj.field_b[var4] = lj.a(var8, (byte) -62);
                    var4++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                var4 = 0;
                L3: while (true) {
                  if (var3 <= var4) {
                    break L0;
                  } else {
                    var5 = aj.field_b[var4];
                    var5.a(1, 6, 6, 6, (byte) -81);
                    var5.a(true);
                    var6 = new int[]{var5.field_v + var5.field_H >> 1, var5.field_h + var5.field_l >> 1, var5.field_J + var5.field_j >> 1};
                    pa.field_b[var4] = var6;
                    var5.a(-var6[2], -var6[1], 0, -var6[0]);
                    var4++;
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("hj.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_n = null;
        field_o = null;
        field_k = null;
        field_e = null;
        field_h = null;
        field_f = null;
    }

    private hj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_e = new sj("usename");
        field_a = "Just play";
        field_k = new ta();
        field_c = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)((var0 << 1) - -1);
            var2 = (int)((var4 * var4 >> 18) + -32768L);
            var3 = (int)((var6 * var6 >> 18) - 32768L);
            if (field_c.length <= var3) {
                var3 = -1 + field_c.length;
            }
            for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
                field_c[var1] = var0;
            }
        }
        field_n = new char[128];
        field_b = new ta();
    }
}
