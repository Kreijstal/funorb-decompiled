/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private int field_f;
    static volatile boolean field_e;
    static byte[][] field_b;
    private uf field_g;
    private uf[] field_d;
    private int field_c;
    private uf field_a;

    final static void a(int param0, ci param1) {
        try {
            ja.c((byte) -52);
            if (param0 != 1) {
                Object var3 = null;
                il.a(74, (ci) null);
            }
            l.a(param1.field_z, param1.field_q, param1.field_u);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "il.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(uf param0, long param1, byte param2) {
        uf var5 = null;
        try {
            if (param2 >= -62) {
                uf discarded$0 = ((il) this).a(false);
            }
            if (!(null == param0.field_a)) {
                param0.b((byte) 12);
            }
            var5 = ((il) this).field_d[(int)((long)(((il) this).field_c - 1) & param1)];
            param0.field_d = var5;
            param0.field_a = var5.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            param0.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "il.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void b() {
        field_b = null;
        int var1 = -117;
    }

    final static ci a(String param0, String param1, fa param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ci stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        ci stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4_int = param2.c(param3, param1);
            var5 = param2.a(-117, var4_int, param0);
            stackOut_0_0 = hl.a(param2, var5, (byte) -90, var4_int);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("il.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
    }

    final uf a(byte param0, long param1) {
        uf var4 = null;
        uf var5 = null;
        int var6 = 0;
        uf var7 = null;
        uf var8 = null;
        var6 = Terraphoenix.field_V;
        if (param0 == 46) {
          var7 = ((il) this).field_d[(int)((long)(-1 + ((il) this).field_c) & param1)];
          var4 = var7;
          ((il) this).field_g = var7.field_d;
          L0: while (true) {
            if (var4 == ((il) this).field_g) {
              ((il) this).field_g = null;
              return null;
            } else {
              if (((il) this).field_g.field_g == param1) {
                var5 = ((il) this).field_g;
                ((il) this).field_g = ((il) this).field_g.field_d;
                return var5;
              } else {
                ((il) this).field_g = ((il) this).field_g.field_d;
                continue L0;
              }
            }
          }
        } else {
          ((il) this).field_g = null;
          var8 = ((il) this).field_d[(int)((long)(-1 + ((il) this).field_c) & param1)];
          var4 = var8;
          ((il) this).field_g = var8.field_d;
          L1: while (true) {
            if (var4 == ((il) this).field_g) {
              ((il) this).field_g = null;
              return null;
            } else {
              if (((il) this).field_g.field_g == param1) {
                var5 = ((il) this).field_g;
                ((il) this).field_g = ((il) this).field_g.field_d;
                return var5;
              } else {
                ((il) this).field_g = ((il) this).field_g.field_d;
                continue L1;
              }
            }
          }
        }
    }

    final uf a(byte param0) {
        ((il) this).field_f = 0;
        if (param0 != 117) {
            return null;
        }
        return ((il) this).a(true);
    }

    final uf a(boolean param0) {
        int var3 = 0;
        uf var4 = null;
        uf var5 = null;
        uf var9 = null;
        uf var12 = null;
        var3 = Terraphoenix.field_V;
        if (((il) this).field_f > 0) {
          if (((il) this).field_a != ((il) this).field_d[-1 + ((il) this).field_f]) {
            var12 = ((il) this).field_a;
            ((il) this).field_a = var12.field_d;
            return var12;
          } else {
            if (!param0) {
              return null;
            } else {
              L0: while (true) {
                if (((il) this).field_f < ((il) this).field_c) {
                  int fieldTemp$2 = ((il) this).field_f;
                  ((il) this).field_f = ((il) this).field_f + 1;
                  var4 = ((il) this).field_d[fieldTemp$2].field_d;
                  var9 = var4;
                  if (var4 == ((il) this).field_d[((il) this).field_f - 1]) {
                    continue L0;
                  } else {
                    ((il) this).field_a = var9.field_d;
                    return var9;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          if (!param0) {
            return null;
          } else {
            L1: while (true) {
              if (((il) this).field_f < ((il) this).field_c) {
                int fieldTemp$3 = ((il) this).field_f;
                ((il) this).field_f = ((il) this).field_f + 1;
                var4 = ((il) this).field_d[fieldTemp$3].field_d;
                var5 = var4;
                if (var4 == ((il) this).field_d[((il) this).field_f - 1]) {
                  continue L1;
                } else {
                  ((il) this).field_a = var5.field_d;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
            L1: {
              if (param0 >= 70) {
                break L1;
              } else {
                var3 = null;
                ci discarded$2 = il.a((String) null, (String) null, (fa) null, -14);
                break L1;
              }
            }
            stackOut_2_0 = nj.field_i.a("", param1, -21653);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("il.E(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    il(int param0) {
        int var2 = 0;
        uf var3 = null;
        ((il) this).field_f = 0;
        ((il) this).field_d = new uf[param0];
        ((il) this).field_c = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            uf dupTemp$2 = new uf();
            var3 = dupTemp$2;
            ((il) this).field_d[var2] = dupTemp$2;
            var3.field_d = var3;
            var3.field_a = var3;
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
        field_b = new byte[1000][];
        field_e = true;
    }
}
