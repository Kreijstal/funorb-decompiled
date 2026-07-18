/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private gp field_i;
    static String field_j;
    static byte[] field_c;
    static tj field_b;
    private long field_d;
    static String field_e;
    private int field_h;
    private int field_g;
    private gp field_a;
    private gp[] field_f;

    final static void a(int param0, boolean param1, String param2) {
        try {
            bf.field_a = param1;
            ed.field_t = true;
            df.field_l = new fj(ch.field_e, sg.field_a, param2, tk.field_e, bf.field_a);
            ch.field_e.b((iq) (Object) df.field_l, 0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "fi.B(" + 31820 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(gp param0, long param1, int param2) {
        gp var5 = null;
        try {
            if (!(null == param0.field_o)) {
                param0.a(-107);
            }
            int var6 = 118 / ((param2 - -20) / 35);
            var5 = ((fi) this).field_f[(int)(param1 & (long)(-1 + ((fi) this).field_g))];
            param0.field_p = var5;
            param0.field_o = var5.field_o;
            param0.field_o.field_p = param0;
            param0.field_n = param1;
            param0.field_p.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "fi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final gp a(byte param0) {
        int var3 = 0;
        gp var4 = null;
        gp var5 = null;
        gp var29 = null;
        gp var57 = null;
        gp var58 = null;
        gp var59 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (((fi) this).field_h <= 0) {
          if (param0 != -60) {
            gp discarded$6 = ((fi) this).a(-90);
            L0: while (true) {
              if (((fi) this).field_g > ((fi) this).field_h) {
                int fieldTemp$7 = ((fi) this).field_h;
                ((fi) this).field_h = ((fi) this).field_h + 1;
                var4 = ((fi) this).field_f[fieldTemp$7].field_p;
                var59 = var4;
                if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                  continue L0;
                } else {
                  ((fi) this).field_a = var59.field_p;
                  return var59;
                }
              } else {
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (((fi) this).field_g > ((fi) this).field_h) {
                int fieldTemp$8 = ((fi) this).field_h;
                ((fi) this).field_h = ((fi) this).field_h + 1;
                var4 = ((fi) this).field_f[fieldTemp$8].field_p;
                var58 = var4;
                if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                  continue L1;
                } else {
                  ((fi) this).field_a = var58.field_p;
                  return var58;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          if (((fi) this).field_a == ((fi) this).field_f[((fi) this).field_h - 1]) {
            if (param0 != -60) {
              gp discarded$9 = ((fi) this).a(-90);
              L2: while (true) {
                if (((fi) this).field_g > ((fi) this).field_h) {
                  int fieldTemp$10 = ((fi) this).field_h;
                  ((fi) this).field_h = ((fi) this).field_h + 1;
                  var4 = ((fi) this).field_f[fieldTemp$10].field_p;
                  var29 = var4;
                  if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                    continue L2;
                  } else {
                    ((fi) this).field_a = var29.field_p;
                    return var29;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L3: while (true) {
                if (((fi) this).field_g > ((fi) this).field_h) {
                  int fieldTemp$11 = ((fi) this).field_h;
                  ((fi) this).field_h = ((fi) this).field_h + 1;
                  var4 = ((fi) this).field_f[fieldTemp$11].field_p;
                  var5 = var4;
                  if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                    continue L3;
                  } else {
                    ((fi) this).field_a = var5.field_p;
                    return var5;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var57 = ((fi) this).field_a;
            ((fi) this).field_a = var57.field_p;
            return var57;
          }
        }
    }

    final static co a(int param0, r param1, r param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        co stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        co stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = 0;
            if (hq.a(124, param0, param3, param1)) {
              stackOut_3_0 = m.a(param2.a(param0, param3, (byte) -103), 0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (co) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("fi.H(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ',' + 70 + ')');
        }
        return stackIn_4_0;
    }

    final gp b(int param0) {
        int var2 = 59 / ((-72 - param0) / 53);
        ((fi) this).field_h = 0;
        return ((fi) this).a((byte) -60);
    }

    final gp a(int param0, long param1) {
        gp var4 = null;
        gp var5 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        ((fi) this).field_d = param1;
        if (param0 == 3661) {
          var4 = ((fi) this).field_f[(int)((long)(((fi) this).field_g - 1) & param1)];
          ((fi) this).field_i = var4.field_p;
          L0: while (true) {
            if (var4 != ((fi) this).field_i) {
              if (~param1 == ~((fi) this).field_i.field_n) {
                var5 = ((fi) this).field_i;
                ((fi) this).field_i = ((fi) this).field_i.field_p;
                return var5;
              } else {
                ((fi) this).field_i = ((fi) this).field_i.field_p;
                continue L0;
              }
            } else {
              ((fi) this).field_i = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final gp a(int param0) {
        gp var2 = null;
        gp var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != ((fi) this).field_i) {
          if (param0 <= -89) {
            var2 = ((fi) this).field_f[(int)(((fi) this).field_d & (long)(-1 + ((fi) this).field_g))];
            L0: while (true) {
              if (((fi) this).field_i != var2) {
                if (~((fi) this).field_i.field_n == ~((fi) this).field_d) {
                  var3 = ((fi) this).field_i;
                  ((fi) this).field_i = ((fi) this).field_i.field_p;
                  return var3;
                } else {
                  ((fi) this).field_i = ((fi) this).field_i.field_p;
                  continue L0;
                }
              } else {
                ((fi) this).field_i = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    fi(int param0) {
        int var2 = 0;
        gp var3 = null;
        ((fi) this).field_h = 0;
        ((fi) this).field_g = param0;
        ((fi) this).field_f = new gp[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            gp dupTemp$2 = new gp();
            var3 = dupTemp$2;
            ((fi) this).field_f[var2] = dupTemp$2;
            var3.field_p = var3;
            var3.field_o = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Average rating";
        field_b = new tj();
    }
}
