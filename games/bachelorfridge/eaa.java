/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eaa {
    static long field_a;
    static eaa field_d;
    bw field_g;
    static boolean field_c;
    static String field_f;
    private bw field_e;
    static int field_b;

    final bw c(int param0) {
        bw var2 = null;
        var2 = ((eaa) this).field_e;
        if (((eaa) this).field_g != var2) {
          ((eaa) this).field_e = var2.field_b;
          if (param0 != 0) {
            ((eaa) this).field_g = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((eaa) this).field_e = null;
          return null;
        }
    }

    final bw a(bw param0, int param1) {
        bw var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        bw stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        bw stackOut_9_0 = null;
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
                field_a = 81L;
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                var3 = ((eaa) this).field_g.field_b;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (var3 == ((eaa) this).field_g) {
              ((eaa) this).field_e = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (bw) (Object) stackIn_8_0;
            } else {
              ((eaa) this).field_e = var3.field_b;
              stackOut_9_0 = (bw) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("eaa.Q(");
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final int g(int param0) {
        int var4 = BachelorFridge.field_y;
        int var2 = param0;
        bw var3 = ((eaa) this).field_g.field_b;
        while (((eaa) this).field_g != var3) {
            var2++;
            var3 = var3.field_b;
        }
        return var2;
    }

    final bw b(byte param0) {
        if (param0 != 90) {
            return null;
        }
        bw var2 = ((eaa) this).field_g.field_b;
        if (!(var2 != ((eaa) this).field_g)) {
            ((eaa) this).field_e = null;
            return null;
        }
        ((eaa) this).field_e = var2.field_b;
        return var2;
    }

    final bw c(byte param0) {
        bw var2 = null;
        var2 = ((eaa) this).field_e;
        if (var2 != ((eaa) this).field_g) {
          ((eaa) this).field_e = var2.field_e;
          if (param0 != 116) {
            bw discarded$2 = ((eaa) this).b((byte) -39);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((eaa) this).field_e = null;
          return null;
        }
    }

    final void d(int param0) {
        bw var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        L0: while (true) {
          var2 = ((eaa) this).field_g.field_b;
          if (var2 == ((eaa) this).field_g) {
            if (param0 <= 56) {
              bw discarded$2 = ((eaa) this).c((byte) -57);
              ((eaa) this).field_e = null;
              return;
            } else {
              ((eaa) this).field_e = null;
              return;
            }
          } else {
            var2.a(false);
            continue L0;
          }
        }
    }

    final static void f(int param0) {
        ld.a(16777215, 0, 45, 0);
        ld.a(12648447, 3, 45, 3);
        ld.a(16777152, 5, 45, 5);
        ld.a(49407, 2, 45, 2);
        ld.a(12648384, 4, 45, 4);
        ld.a(16760832, 1, 45, 1);
        ld.a(12632256, 7, 45, 7);
        ld.a(16711872, 6, 45, 6);
    }

    final int a(byte param0, bw[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bw var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = ((eaa) this).field_g.field_b;
              if (param0 >= 65) {
                break L1;
              } else {
                boolean discarded$4 = ((eaa) this).e(98);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == ((eaa) this).field_g) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                int incrementValue$5 = var3_int;
                var3_int++;
                param1[incrementValue$5] = (bw) (Object) param1;
                var4 = var4.field_b;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("eaa.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 12917) {
          L0: {
            bw discarded$10 = ((eaa) this).c((byte) -117);
            if (((eaa) this).field_g.field_b != ((eaa) this).field_g) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((eaa) this).field_g.field_b != ((eaa) this).field_g) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 7) {
            field_a = 30L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(int param0, bw param1) {
        if (!(param1.field_e == null)) {
            param1.a(false);
        }
        param1.field_b = ((eaa) this).field_g.field_b;
        param1.field_e = ((eaa) this).field_g;
        param1.field_e.field_b = param1;
        if (param0 > -2) {
            return;
        }
        try {
            param1.field_b.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eaa.P(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(eaa param0, bw param1, boolean param2) {
        bw var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var4 = ((eaa) this).field_g.field_e;
            ((eaa) this).field_g.field_e = param1.field_e;
            param1.field_e.field_b = ((eaa) this).field_g;
            if (param1 == ((eaa) this).field_g) {
              break L0;
            } else {
              param1.field_e = param0.field_g.field_e;
              param1.field_e.field_b = param1;
              var4.field_b = param0.field_g;
              param0.field_g.field_e = var4;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4_ref;
            stackOut_3_1 = new StringBuilder().append("eaa.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 1 + 41);
        }
    }

    final void a(eaa param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param0, ((eaa) this).field_g.field_b, true);
              if (param1 == 12632256) {
                break L1;
              } else {
                var4 = null;
                this.a((eaa) null, (bw) null, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("eaa.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final bw a(int param0) {
        bw var2 = null;
        Object var3 = null;
        var2 = ((eaa) this).field_g.field_e;
        if (((eaa) this).field_g != var2) {
          ((eaa) this).field_e = var2.field_e;
          if (param0 != 6) {
            var3 = null;
            ((eaa) this).a((bw) null, false);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((eaa) this).field_e = null;
          return null;
        }
    }

    final bw a(byte param0) {
        bw var2 = null;
        var2 = ((eaa) this).field_g.field_e;
        if (param0 == -124) {
          if (((eaa) this).field_g == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(bw param0, boolean param1) {
        try {
            if (null != param0.field_e) {
                param0.a(!param1 ? true : false);
            }
            param0.field_b = ((eaa) this).field_g;
            if (!param1) {
                Object var4 = null;
                bw discarded$0 = ((eaa) this).a((bw) null, 125);
            }
            param0.field_e = ((eaa) this).field_g.field_e;
            param0.field_e.field_b = param0;
            param0.field_b.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eaa.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final bw a(boolean param0) {
        bw var2 = ((eaa) this).field_g.field_b;
        if (var2 == ((eaa) this).field_g) {
            return null;
        }
        var2.a(param0);
        return var2;
    }

    public eaa() {
        ((eaa) this).field_g = new bw();
        ((eaa) this).field_g.field_e = ((eaa) this).field_g;
        ((eaa) this).field_g.field_b = ((eaa) this).field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_f = "Show all game chat";
        field_b = -1;
        field_d = new eaa();
    }
}
