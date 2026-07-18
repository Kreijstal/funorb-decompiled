/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static bi field_f;
    static int[] field_e;
    private mn field_b;
    private rk field_c;
    static long field_d;
    static double[] field_a;

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        qf var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          if (param2 != null) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param0) {
                stackOut_8_0 = (byte[]) var3;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                int discarded$2 = 194;
                stackOut_6_0 = ug.a(var3);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              if (param2 instanceof qf) {
                var4 = (qf) param2;
                stackOut_12_0 = var4.a(87);
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("vb.G(").append(param0).append(',').append(6).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L0;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L0;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static void b(byte param0) {
        if (!(fd.field_j)) {
            throw new IllegalStateException();
        }
        qf.field_g = true;
        if (param0 < 104) {
            boolean discarded$0 = vb.a((byte) -90, '￘');
        }
        aa.a((byte) -118, false);
        rk.field_e = 0;
    }

    final rk b(rk param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        Object stackIn_5_0 = null;
        rk stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        rk stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((vb) this).field_b.field_a.field_h;
                break L1;
              }
            }
            if (((vb) this).field_b.field_a != var3) {
              L2: {
                ((vb) this).field_c = var3.field_h;
                if (param1 == 6) {
                  break L2;
                } else {
                  var4 = null;
                  rk discarded$2 = ((vb) this).a((rk) null, 28);
                  break L2;
                }
              }
              stackOut_8_0 = (rk) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((vb) this).field_c = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (rk) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("vb.D(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final rk a(rk param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        rk stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        rk stackOut_9_0 = null;
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
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((vb) this).field_c = null;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = ((vb) this).field_b.field_a.field_a;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (var3 == ((vb) this).field_b.field_a) {
              ((vb) this).field_c = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (rk) (Object) stackIn_8_0;
            } else {
              ((vb) this).field_c = var3.field_a;
              stackOut_9_0 = (rk) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("vb.B(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (ld.a((byte) -21, param1)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var6 = gk.field_y;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    L2: {
                      if (param0 == -37) {
                        break L2;
                      } else {
                        vb.b((byte) -35);
                        break L2;
                      }
                    }
                    var7 = pa.field_d;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L3: while (true) {
                      if (var7.length <= var8) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        var4 = var7[var8];
                        if (var4 != param1) {
                          var8++;
                          continue L3;
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2_ref, "vb.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final rk c(int param0) {
        rk var2 = ((vb) this).field_b.field_a.field_a;
        if (var2 == ((vb) this).field_b.field_a) {
            ((vb) this).field_c = null;
            return null;
        }
        if (param0 != 7) {
            return null;
        }
        ((vb) this).field_c = var2.field_a;
        return var2;
    }

    vb(mn param0) {
        try {
            ((vb) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "vb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final rk a(byte param0) {
        if (param0 != 120) {
            vb.b((byte) -33);
        }
        rk var2 = ((vb) this).field_b.field_a.field_h;
        if (((vb) this).field_b.field_a == var2) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var2.field_h;
        return var2;
    }

    public static void d() {
        field_f = null;
        field_a = null;
        field_e = null;
    }

    final rk a(int param0) {
        if (param0 != 0) {
            field_d = -121L;
        }
        rk var2 = ((vb) this).field_c;
        if (((vb) this).field_b.field_a == var2) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var2.field_a;
        return var2;
    }

    final rk b(int param0) {
        int var2 = -88 % ((param0 - 17) / 35);
        rk var3 = ((vb) this).field_c;
        if (var3 == ((vb) this).field_b.field_a) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var3.field_h;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[1024];
        field_a = new double[]{6.0, 6.0, 7.0, 8.0, 6.0, 4.0, 5.0, 6.0, 5.5, 6.0, 7.0, 6.0, 5.0, 6.0, 6.0, 8.0, 5.0, 8.0, 8.0, 6.0, 10.0, 9.0, 8.0, 7.0, 7.0};
    }
}
