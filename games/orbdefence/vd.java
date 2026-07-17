/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    private mh field_d;
    private ki field_b;
    static String field_f;
    private ki field_c;
    static String[] field_e;
    static mg field_a;
    private mh field_g;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = OrbDefence.field_D ? 1 : 0;
        try {
            ge.field_g.b(0);
            if (param0 <= 23) {
                Object var3 = null;
                vd.a(true, -101, (String) null);
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                jl.field_b[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                qf.field_o[var1_int] = 0L;
            }
            m.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vd.G(" + param0 + 41);
        }
    }

    final dl a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        dl stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        dl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl stackOut_2_0 = null;
        dl stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (((vd) this).field_c.a((byte) 117) == 1) {
            stackOut_2_0 = this.a(param2, param0, param1 + -219, 0);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (param1 == 92) {
              if (((vd) this).field_c.a((byte) 104, param0) != 1) {
                throw new RuntimeException();
              } else {
                stackOut_8_0 = this.a(param2, 0, param1 + -220, param0);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (dl) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vd.D(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L0;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final dl a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        dl stackIn_2_0 = null;
        dl stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl stackOut_7_0 = null;
        dl stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((vd) this).field_b.a((byte) 122) != 1) {
            L0: {
              if (param2 > 73) {
                break L0;
              } else {
                vd.a(56);
                break L0;
              }
            }
            if (1 == ((vd) this).field_b.a((byte) 119, param0)) {
              stackOut_7_0 = this.a(65527, param1, 0, param0);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              throw new RuntimeException();
            }
          } else {
            stackOut_1_0 = this.a(65527, param1, param0, 0);
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("vd.C(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
    }

    private final dl a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        dl var8 = null;
        cm var9 = null;
        int var10 = 0;
        dl var11 = null;
        dl stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        dl stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl stackOut_2_0 = null;
        dl stackOut_14_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var5_int = param1 ^ ((-536866817 & param3) << 4 | param3 >>> 12);
            var5_int = var5_int | param3 << 16;
            var6 = (long)var5_int;
            var8 = (dl) (Object) ((vd) this).field_g.a(var6, -1);
            if (var8 != null) {
              stackOut_2_0 = (dl) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (0 < param0[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var9 = cm.a(((vd) this).field_c, param3, param1);
              var10 = -10 / ((param2 - -57) / 57);
              if (var9 != null) {
                L2: {
                  var11 = var9.a();
                  var8 = var11;
                  ((vd) this).field_g.a(var6, (byte) -91, (ca) (Object) var8);
                  if (param0 != null) {
                    param0[0] = param0[0] - var11.field_g.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_14_0 = (dl) var8;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (dl) (Object) stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("vd.E(");
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
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_15_0;
    }

    private final dl a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        dl var8 = null;
        nj var9 = null;
        dl stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        dl stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl stackOut_2_0 = null;
        Object stackOut_10_0 = null;
        dl stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5_int = (65527 & param3 << 4 | param3 >>> 12) ^ param2;
            var5_int = var5_int | param3 << 16;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (dl) (Object) ((vd) this).field_g.a(var6, -1);
            if (var8 != null) {
              stackOut_2_0 = (dl) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1[0] > 0) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var9 = (nj) (Object) ((vd) this).field_d.a(var6, -1);
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = nj.a(((vd) this).field_b, param3, param2);
                  if (var9 != null) {
                    ((vd) this).field_d.a(var6, (byte) -93, (ca) (Object) var9);
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (dl) (Object) stackIn_11_0;
                  }
                }
              }
              var8 = var9.a(param1);
              if (var8 != null) {
                var9.b(57);
                ((vd) this).field_g.a(var6, (byte) 117, (ca) (Object) var8);
                stackOut_16_0 = (dl) var8;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("vd.F(").append(65527).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_17_0;
    }

    public static void b() {
        field_a = null;
        field_f = null;
        field_e = null;
    }

    final static void a(boolean param0, int param1, String param2) {
        try {
            jc.field_j = param0;
            if (param1 != -536866817) {
                field_e = null;
            }
            oe.field_p = true;
            oj.field_q = new dh(bm.field_d, qc.field_b, param2, vh.field_j, jc.field_j);
            bm.field_d.b((byte) 74, (pj) (Object) oj.field_q);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vd.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    vd(ki param0, ki param1) {
        ((vd) this).field_d = new mh(256);
        ((vd) this).field_g = new mh(256);
        try {
            ((vd) this).field_c = param0;
            ((vd) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create";
    }
}
