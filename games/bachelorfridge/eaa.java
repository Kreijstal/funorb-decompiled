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
        bw var2;
        var2 = this.field_e;
        if (this.field_g != var2) {
          this.field_e = var2.field_b;
          if (param0 != 0) {
            this.field_g = (bw) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final bw a(bw param0, int param1) {
        bw var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        bw stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                var3 = this.field_g.field_b;
                break L2;
              } else {
                var3 = param0;
                break L2;
              }
            }
            if (var3 == this.field_g) {
              this.field_e = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_e = var3.field_b;
              stackIn_10_0 = (bw) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("eaa.Q(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bw) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final int g(int param0) {
        int var4 = BachelorFridge.field_y;
        int var2 = param0;
        bw var3 = this.field_g.field_b;
        while (this.field_g != var3) {
            var2++;
            var3 = var3.field_b;
        }
        return var2;
    }

    final bw b(byte param0) {
        if (param0 != 90) {
            return (bw) null;
        }
        bw var2 = this.field_g.field_b;
        if (!(var2 != this.field_g)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_b;
        return var2;
    }

    final bw c(byte param0) {
        bw var2;
        var2 = this.field_e;
        if (var2 != this.field_g) {
          this.field_e = var2.field_e;
          if (param0 != 116) {
            this.b((byte) -39);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final void d(int param0) {
        bw var2;
        int var3;
        var3 = BachelorFridge.field_y;
        L0: while (true) {
          var2 = this.field_g.field_b;
          if (var2 == this.field_g) {
            if (param0 <= 56) {
              this.c((byte) -57);
              this.field_e = null;
              return;
            } else {
              this.field_e = null;
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
        ld.a(16760832, 1, param0 ^ 31910, 1);
        ld.a(12632256, 7, 45, 7);
        if (param0 != 31883) {
          eaa.b(60);
          ld.a(16711872, 6, param0 + -31838, 6);
          return;
        } else {
          ld.a(16711872, 6, param0 + -31838, 6);
          return;
        }
    }

    final int a(byte param0, bw[] param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        bw var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = this.field_g.field_b;
              if (param0 >= 65) {
                break L1;
              } else {
                this.e(98);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == this.field_g) {
                stackIn_6_0 = var3_int;
                break L0;
              } else {
                incrementValue$1 = var3_int;
                var3_int++;
                param1[incrementValue$1] = var4;
                var4 = var4.field_b;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("eaa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 12917) {
          L0: {
            this.c((byte) -117);
            if (this.field_g.field_b != this.field_g) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_g.field_b != this.field_g) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        param1.field_b = this.field_g.field_b;
        param1.field_e = this.field_g;
        param1.field_e.field_b = param1;
        if (param0 > -2) {
            return;
        }
        try {
            param1.field_b.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eaa.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(eaa param0, bw param1, boolean param2) {
        bw var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = this.field_g.field_e;
              this.field_g.field_e = param1.field_e;
              param1.field_e.field_b = this.field_g;
              if (param2) {
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            if (param1 == this.field_g) {
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
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("eaa.I(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void a(eaa param0, int param1) {
        try {
            this.a(param0, this.field_g.field_b, true);
            if (param1 != 12632256) {
                bw var4 = (bw) null;
                this.a((eaa) null, (bw) null, true);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eaa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bw a(int param0) {
        bw var2;
        bw var3;
        var2 = this.field_g.field_e;
        if (this.field_g != var2) {
          this.field_e = var2.field_e;
          if (param0 != 6) {
            var3 = (bw) null;
            this.a((bw) null, false);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final bw a(byte param0) {
        bw var2;
        var2 = this.field_g.field_e;
        if (param0 == -124) {
          if (this.field_g == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          return (bw) null;
        }
    }

    final void a(bw param0, boolean param1) {
        try {
            if (null != param0.field_e) {
                param0.a(!param1 ? true : false);
            }
            param0.field_b = this.field_g;
            if (!param1) {
                bw var4 = (bw) null;
                this.a((bw) null, 125);
            }
            param0.field_e = this.field_g.field_e;
            param0.field_e.field_b = param0;
            param0.field_b.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eaa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bw a(boolean param0) {
        bw var2 = this.field_g.field_b;
        if (var2 == this.field_g) {
            return null;
        }
        var2.a(param0);
        return var2;
    }

    public eaa() {
        this.field_g = new bw();
        this.field_g.field_e = this.field_g;
        this.field_g.field_b = this.field_g;
    }

    static {
        field_c = true;
        field_f = "Show all game chat";
        field_b = -1;
        field_d = new eaa();
    }
}
