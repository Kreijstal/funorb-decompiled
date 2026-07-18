/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_d;
    private jl field_e;
    static sq field_g;
    static mi field_f;
    private r field_h;
    private r field_b;
    static long field_a;
    private jl field_c;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0) {
            var4 += 4;
            var4 += 2;
            var4++;
            return qn.field_t[var4];
        }
        var4 += 2;
        var4++;
        return qn.field_t[var4];
    }

    final static void a(int param0) {
        int var1 = 0;
        if (!sq.field_c) {
          throw new IllegalStateException();
        } else {
          mg.field_O = true;
          pm.a((byte) 52, true);
          var1 = 39 % ((param0 - 88) / 32);
          hn.field_w = 0;
          return;
        }
    }

    final static boolean a(mi param0, int param1) {
        return param0.c((byte) -109, 1) == 1;
    }

    final ae a(boolean param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        ae stackIn_3_0 = null;
        ae stackIn_7_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_2_0 = null;
        ae stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (((id) this).field_b.c(-1) == 1) {
            stackOut_2_0 = this.a(param1, 120, param2, 0);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (1 == ((id) this).field_b.b(param2, (byte) -73)) {
              stackOut_6_0 = this.a(param1, 124, 0, param2);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  var5 = null;
                  ae discarded$2 = this.a((int[]) null, 126, -12, -30);
                  break L0;
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("id.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, short param1, short param2, lg param3, boolean param4, short param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        byte stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_2_0 = 0;
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
            var6_int = param3.field_p[param1] + param3.field_p[param5] >> 1;
            var7 = param3.field_D[param1] + param3.field_D[param5] >> 1;
            var8 = param3.field_i[param1] + param3.field_i[param5] >> 1;
            param2 = (short)param3.a(var6_int + (param3.field_p[param2] + -var6_int) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param2] + -var7) / (64 + -param0), var8 + 64 * (-var8 + param3.field_i[param2]) / (64 + -param0));
            param1 = (short)param3.a(var6_int + (-var6_int + param3.field_p[param1]) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param1] + -var7) / (-param0 + 64), var8 + (-var8 + param3.field_i[param1]) * 64 / (-param0 + 64));
            param5 = (short)param3.a(var6_int + 64 * (param3.field_p[param5] + -var6_int) / (-param0 + 64), var7 + (-var7 + param3.field_D[param5]) * 64 / (-param0 + 64), var8 + 64 * (-var8 + param3.field_i[param5]) / (64 + -param0));
            stackOut_2_0 = param3.a(param2, param1, param5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("id.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + false + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
    }

    final ae a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        ae stackIn_3_0 = null;
        ae stackIn_6_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_2_0 = null;
        ae stackOut_5_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((id) this).field_h.c(-1) == 1) {
            stackOut_2_0 = this.b(param0, 0, -127, param2);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (((id) this).field_h.b(param2, (byte) -94) != 1) {
              L0: {
                if (param1 == 64) {
                  break L0;
                } else {
                  var5 = null;
                  ae discarded$2 = this.a((int[]) null, -38, -61, 48);
                  break L0;
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_5_0 = this.b(param0, param2, -128, 0);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("id.B(");
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
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final ae a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ae var8 = null;
        hp var9 = null;
        ae var10 = null;
        ae stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ae stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_4_0 = null;
        Object stackOut_8_0 = null;
        ae stackOut_16_0 = null;
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
            L1: {
              var5_int = (param3 >>> 12 | (param3 & 1342181375) << 4) ^ param2;
              var5_int = var5_int | param3 << 16;
              if (param1 > 119) {
                break L1;
              } else {
                ((id) this).field_e = null;
                break L1;
              }
            }
            var6 = (long)var5_int;
            var8 = (ae) (Object) ((id) this).field_c.a(var6, (byte) 64);
            if (var8 != null) {
              stackOut_4_0 = (ae) var8;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  if (param0[0] > 0) {
                    break L2;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (ae) (Object) stackIn_9_0;
                  }
                }
              }
              var9 = hp.a(((id) this).field_b, param3, param2);
              if (var9 != null) {
                L3: {
                  var10 = var9.a();
                  var8 = var10;
                  ((id) this).field_c.a((li) (Object) var8, var6, false);
                  if (param0 != null) {
                    param0[0] = param0[0] - var10.field_s.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_16_0 = (ae) var8;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("id.J(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final static qi a(int param0, int param1, byte param2, int param3, jj param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        qi var7 = null;
        java.awt.Frame var8 = null;
        qi stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var8 = oc.a(param5, 0, 0, param4, param3, 54);
            var6 = var8;
            if (var8 != null) {
              var7 = new qi();
              var7.field_c = var8;
              java.awt.Component discarded$2 = var7.field_c.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param3, param5);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_5_0 = (qi) var7;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6_ref;
            stackOut_7_1 = new StringBuilder().append("id.G(").append(0).append(',').append(0).append(',').append(94).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    private final ae b(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ae var8 = null;
        vh var9 = null;
        ae stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ae stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_4_0 = null;
        Object stackOut_8_0 = null;
        ae stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              var5_int = (param1 >>> 12 | (-1879044097 & param1) << 4) ^ param3;
              var5_int = var5_int | param1 << 16;
              if (param2 <= -125) {
                break L1;
              } else {
                field_a = 53L;
                break L1;
              }
            }
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (ae) (Object) ((id) this).field_c.a(var6, (byte) 64);
            if (var8 != null) {
              stackOut_4_0 = (ae) var8;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  if (param0[0] > 0) {
                    break L2;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (ae) (Object) stackIn_9_0;
                  }
                }
              }
              L3: {
                var9 = (vh) (Object) ((id) this).field_e.a(var6, (byte) 64);
                if (var9 == null) {
                  var9 = vh.a(((id) this).field_h, param1, param3);
                  if (var9 != null) {
                    ((id) this).field_e.a((li) (Object) var9, var6, false);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.c(2);
                ((id) this).field_c.a((li) (Object) var8, var6, false);
                stackOut_19_0 = (ae) var8;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("id.I(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_20_0;
    }

    id(r param0, r param1) {
        ((id) this).field_e = new jl(256);
        ((id) this).field_c = new jl(256);
        try {
            ((id) this).field_b = param0;
            ((id) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new sq();
    }
}
