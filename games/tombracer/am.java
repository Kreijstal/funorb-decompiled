/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends dg {
    private int field_m;
    private bua field_p;
    static int field_n;
    static int field_o;

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        ka var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (null != ((am) this).field_p) {
              L1: {
                var7 = -80 / ((param4 - -38) / 47);
                var9 = ((am) this).field_p.b((byte) 74);
                if (var9 == null) {
                  break L1;
                } else {
                  var8 = dfa.a(4096 + -((am) this).field_h.g(-25787) >> 2, 2048, -40);
                  gqa.a(var8, -83584144, param1, param2, var9, param3);
                  break L1;
                }
              }
              if (((am) this).field_m == 1) {
                var10 = wma.a(49, 12166, 1);
                var8 = dfa.a(4096 - ((am) this).field_h.g(-25787) >> 2, 2048, 86);
                gqa.a(var8, -83584144, param1, param2, var10, param3);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("am.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, uw param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qea var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a((byte) 52, param1, param2);
              if (param0 > 50) {
                break L1;
              } else {
                field_n = -110;
                break L1;
              }
            }
            var9 = ((am) this).a(46).e(true);
            ((am) this).field_g = var9.a(100, 0);
            var5 = 0;
            var7 = ((am) this).field_m;
            if (var7 == 1) {
              ((am) this).field_p = new bua(1, 48);
              ((am) this).field_p.a(3, true, (byte) -109, 1);
              var5 = var9.a(20, 0);
              ((am) this).field_p.b(-125, var5);
              return;
            } else {
              if (2 != var7) {
                if (0 != var7) {
                  if (var7 == 3) {
                    L2: {
                      var6 = 77;
                      if (33 <= ((am) this).field_g) {
                        break L2;
                      } else {
                        var6 = 77;
                        break L2;
                      }
                    }
                    L3: {
                      if (((am) this).field_g >= 66) {
                        var6 = 79;
                        break L3;
                      } else {
                        var6 = 78;
                        break L3;
                      }
                    }
                    ((am) this).field_p = new bua(1, var6);
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  ((am) this).field_p = new bua(1, 47);
                  ((am) this).field_p.a(3, true, (byte) -90, 0);
                  var5 = var9.a(20, 0);
                  ((am) this).field_p.b(125, var5);
                  return;
                }
              } else {
                ((am) this).field_p = new bua(1, 50);
                ((am) this).field_p.a(3, true, (byte) 62, 2);
                var5 = var9.a(20, 0);
                ((am) this).field_p.b(-83, var5);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("am.V(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public final void f(int param0) {
        super.f(param0);
        if (((am) this).field_p != null) {
            ((am) this).field_p.a(0);
        }
    }

    final void b(int param0, byte param1) {
        ((am) this).field_m = param0;
        if (param1 != 77) {
            field_n = -49;
        }
    }

    final void a(int param0, la param1, kh param2) {
        super.a(124, param1, param2);
        if (param0 < 119) {
            ((am) this).field_m = 77;
        }
        if (param1.field_E <= 17) {
            return;
        }
        try {
            ((am) this).field_m = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "am.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = -114 % ((-8 - param0) / 40);
            super.a((byte) -105, param1);
            param1.a((byte) 30, ((am) this).field_m, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "am.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    am(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    am(int param0) {
        super(param0);
    }

    static {
    }
}
