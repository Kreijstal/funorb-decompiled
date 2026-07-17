/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pta implements fo {
    static String field_g;
    private la field_e;
    vna field_b;
    private c field_f;
    private vna field_c;
    static String field_d;
    private boolean field_a;

    public static void b(boolean param0) {
        field_d = null;
        field_g = null;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            ((pta) this).field_e = null;
            return 0;
        }
        return 0;
    }

    public final void f(int param0) {
        if (param0 == -4366) {
            return;
        }
        field_g = null;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            Object var3 = null;
            boolean discarded$0 = pta.a((CharSequence) null, -61);
            return 0;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = -68 % ((-41 - param1) / 42);
        c var4 = (c) (Object) ((pta) this).field_b.f(-80);
        while (var4 != null) {
            param0 = var4.a(param0, (byte) -39);
            var4 = (c) (Object) ((pta) this).field_b.e(121);
        }
        return param0;
    }

    final void a(uw param0, byte param1, boolean param2, int param3) {
        try {
            ((pta) this).field_a = param2 ? true : false;
            if (!param2) {
                param0.a((byte) 83, param3, (fo) this);
            }
            int var5_int = -45 / ((59 - param1) / 63);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pta.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(boolean param0) {
        c var2 = null;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          var2 = (c) (Object) ((pta) this).field_b.f(-80);
          L0: while (true) {
            if (var2 != null) {
              System.out.println((Object) (Object) var2);
              var2 = (c) (Object) ((pta) this).field_b.e(116);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_d = null;
          var2 = (c) (Object) ((pta) this).field_b.f(-80);
          L1: while (true) {
            if (var2 != null) {
              System.out.println((Object) (Object) var2);
              var2 = (c) (Object) ((pta) this).field_b.e(116);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, byte param1) {
        c var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (c) (Object) ((pta) this).field_b.f(-80);
        L0: while (true) {
          if (var3 == null) {
            if (param1 < -19) {
              return;
            } else {
              field_d = null;
              return;
            }
          } else {
            L1: {
              var3.a(-1, param0);
              if (var3.h(18407)) {
                var3.p(76);
                ((pta) this).field_c.b((byte) -88, (vg) (Object) var3);
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (c) (Object) ((pta) this).field_b.e(127);
            continue L0;
          }
        }
    }

    final void a(byte param0) {
        c var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = (c) (Object) ((pta) this).field_b.f(-80);
        L0: while (true) {
          if (var2 == null) {
            if (param0 <= 111) {
              var4 = null;
              ((pta) this).a((uw) null, (byte) -42, false, 21);
              return;
            } else {
              return;
            }
          } else {
            var2.p(88);
            ((pta) this).field_c.b((byte) -60, (vg) (Object) var2);
            var2 = (c) (Object) ((pta) this).field_b.e(112);
            continue L0;
          }
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            ((pta) this).field_e = null;
            return false;
        }
        return false;
    }

    final c a(int param0, int param1, int param2, uw param3, int param4) {
        c var6 = null;
        RuntimeException var6_ref = null;
        c stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        c stackOut_8_0 = null;
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
              if (param0 == -2698) {
                break L1;
              } else {
                ((pta) this).a((byte) 28);
                break L1;
              }
            }
            L2: {
              if (!((pta) this).field_c.d((byte) 14)) {
                var6 = (c) (Object) ((pta) this).field_c.c(param0 ^ 2800);
                var6.p(param0 + 2821);
                break L2;
              } else {
                var6 = ((pta) this).field_f.d(true);
                break L2;
              }
            }
            L3: {
              var6.a(param4, (byte) -78, param1, param2);
              if (!((pta) this).field_a) {
                break L3;
              } else {
                if (param3 == null) {
                  break L3;
                } else {
                  var6.a(param3, param0 + 8163);
                  break L3;
                }
              }
            }
            ((pta) this).field_b.b((byte) -109, (vg) (Object) var6);
            stackOut_8_0 = (c) var6;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6_ref;
            stackOut_10_1 = new StringBuilder().append("pta.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param4 + 41);
        }
        return stackIn_9_0;
    }

    public final void a(int param0, iq param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        c var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = (c) (Object) ((pta) this).field_b.f(-80);
            if (param0 > 103) {
              L1: while (true) {
                if (var5 == null) {
                  break L0;
                } else {
                  var5.a(104, param1);
                  var5 = (c) (Object) ((pta) this).field_b.e(121);
                  continue L1;
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
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("pta.DB(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public final int b(byte param0) {
        int var2 = 35 / ((param0 - -23) / 53);
        return 0;
    }

    final void a(int param0) {
        int var3 = 0;
        c var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 > 93) {
          var4 = (c) (Object) ((pta) this).field_b.f(-80);
          L0: while (true) {
            if (var4 != null) {
              var4.a(((pta) this).field_e, -63);
              var4 = (c) (Object) ((pta) this).field_b.e(109);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          int discarded$8 = ((pta) this).e((byte) 14);
          var4 = (c) (Object) ((pta) this).field_b.f(-80);
          L1: while (true) {
            if (var4 != null) {
              var4.a(((pta) this).field_e, -63);
              var4 = (c) (Object) ((pta) this).field_b.e(109);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == 0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            stackOut_2_0 = lg.a(false, param0, param1 + 1617);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("pta.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    pta(la param0, c param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
        ((pta) this).field_b = new vna();
        ((pta) this).field_c = new vna();
        try {
          L0: {
            ((pta) this).field_e = param0;
            ((pta) this).field_f = param1;
            var4_int = 0;
            L1: while (true) {
              if (param2 <= var4_int) {
                break L0;
              } else {
                ((pta) this).field_c.b((byte) -81, (vg) (Object) param1.d(true));
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("pta.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Name";
        field_d = "Similar rating";
    }
}
