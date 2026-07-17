/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static dm field_b;
    static int field_d;
    static int field_a;
    static tf field_e;
    private rc field_g;
    static String field_f;
    private rc field_c;

    final rc a(int param0) {
        rc var2 = null;
        int var3 = 0;
        var3 = -123 % ((param0 - 21) / 32);
        var2 = ((wd) this).field_c;
        if (((wd) this).field_g == var2) {
          ((wd) this).field_c = null;
          return null;
        } else {
          ((wd) this).field_c = var2.field_k;
          return var2;
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -10943) {
            field_f = null;
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    final void a(rc param0, boolean param1) {
        if (!(param0.field_l == null)) {
            param0.a((byte) 45);
        }
        param0.field_k = ((wd) this).field_g.field_k;
        param0.field_l = ((wd) this).field_g;
        if (param1) {
            return;
        }
        try {
            param0.field_l.field_k = param0;
            param0.field_k.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wd.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void c() {
        int discarded$0 = -120;
        kb.b();
    }

    final rc a(boolean param0) {
        rc var2 = null;
        var2 = ((wd) this).field_g.field_k;
        if (param0) {
          if (((wd) this).field_g == var2) {
            return null;
          } else {
            var2.a((byte) 65);
            return var2;
          }
        } else {
          wd.a((byte) -92);
          if (((wd) this).field_g == var2) {
            return null;
          } else {
            var2.a((byte) 65);
            return var2;
          }
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        rc var3 = null;
        int var4 = 0;
        var4 = Geoblox.field_C;
        var2 = 0;
        if (param0 != 67) {
          field_b = null;
          var3 = ((wd) this).field_g.field_k;
          L0: while (true) {
            if (((wd) this).field_g == var3) {
              return var2;
            } else {
              var3 = var3.field_k;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((wd) this).field_g.field_k;
          L1: while (true) {
            if (((wd) this).field_g == var3) {
              return var2;
            } else {
              var3 = var3.field_k;
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, rc param1) {
        try {
            if (!(param1.field_l == null)) {
                param1.a((byte) 62);
            }
            int var3_int = -75 % ((param0 - 62) / 46);
            param1.field_l = ((wd) this).field_g.field_l;
            param1.field_k = ((wd) this).field_g;
            param1.field_l.field_k = param1;
            param1.field_k.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wd.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0) {
        jk.field_d = 2;
        if (param0 < 45) {
            wd.a(true, -75);
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        re var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var4 = (re) (Object) nj.field_f.g(0);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$2 = 107;
                ik.a(var4, param1);
                var4 = (re) (Object) nj.field_f.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "wd.K(" + 1 + 44 + param1 + 41);
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("wd.F(").append(69).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    public wd() {
        ((wd) this).field_g = new rc();
        ((wd) this).field_g.field_k = ((wd) this).field_g;
        ((wd) this).field_g.field_l = ((wd) this).field_g;
    }

    final static df a(boolean param0, long param1, String param2, String param3) {
        RuntimeException var6 = null;
        th stackIn_4_0 = null;
        nk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        nk stackOut_5_0 = null;
        th stackOut_3_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              if (param1 != 0L) {
                break L1;
              } else {
                if (param2 != null) {
                  stackOut_5_0 = new nk(param2, param3);
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = new th(param1, param3);
            stackIn_4_0 = stackOut_3_0;
            return (df) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("wd.G(").append(1).append(44).append(param1).append(44);
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 41);
        }
        return (df) (Object) stackIn_6_0;
    }

    final rc c(byte param0) {
        rc var2 = null;
        var2 = ((wd) this).field_g.field_k;
        if (var2 != ((wd) this).field_g) {
          ((wd) this).field_c = var2.field_k;
          if (param0 != 121) {
            wd.b(67);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((wd) this).field_c = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new dm(460, 460);
        field_d = (-field_b.field_o + 480) / 2;
        field_a = (640 + -field_b.field_s) / 2;
        field_e = new tf();
    }
}
