/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class le extends ksa {
    int field_h;
    rt field_d;
    boolean field_g;
    le[] field_e;
    gab field_f;

    final int[][] a(byte param0, int param1, int param2) {
        int[] var4;
        int[][] var5;
        int[] var6;
        if (param0 >= 30) {
          if (this.field_e[param1].field_g) {
            var6 = this.field_e[param1].a(param2, true);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[2] = var6;
            var5[0] = var6;
            return var5;
          } else {
            return this.field_e[param1].a(255, param2);
          }
        } else {
          return (int[][]) null;
        }
    }

    void c(int param0) {
        if (this.field_g) {
          this.field_f.a(false);
          this.field_f = null;
          if (param0 <= -23) {
            return;
          } else {
            this.field_g = true;
            return;
          }
        } else {
          this.field_d.a(1);
          this.field_d = null;
          if (param0 <= -23) {
            return;
          } else {
            this.field_g = true;
            return;
          }
        }
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == -9163) {
          L0: {
            if (255 == this.field_h) {
              stackIn_11_0 = param2;
              break L0;
            } else {
              stackIn_11_0 = this.field_h;
              break L0;
            }
          }
          var4 = stackIn_11_0;
          if (!this.field_g) {
            this.field_d = new rt(var4, param2, param1);
            return;
          } else {
            this.field_f = new gab(var4, param2, param1);
            return;
          }
        } else {
          L1: {
            this.a(-12, 12);
            if (255 == this.field_h) {
              stackIn_4_0 = param2;
              break L1;
            } else {
              stackIn_4_0 = this.field_h;
              break L1;
            }
          }
          var4 = stackIn_4_0;
          if (!this.field_g) {
            this.field_d = new rt(var4, param2, param1);
            return;
          } else {
            this.field_f = new gab(var4, param2, param1);
            return;
          }
        }
    }

    final int[] a(int param0, int param1, int param2) {
        if (param2 == 255) {
          if (!this.field_e[param0].field_g) {
            return this.field_e[param0].a(255, param1)[0];
          } else {
            return this.field_e[param0].a(param1, true);
          }
        } else {
          this.d((byte) -6);
          if (!this.field_e[param0].field_g) {
            return this.field_e[param0].a(255, param1)[0];
          } else {
            return this.field_e[param0].a(param1, true);
          }
        }
    }

    int d(byte param0) {
        if (param0 <= 62) {
            this.field_d = (rt) null;
            return -1;
        }
        return -1;
    }

    int a(int param0) {
        if (param0 != -1) {
            ds var3 = (ds) null;
            this.a(97, 76, (ds) null);
            return -1;
        }
        return -1;
    }

    int[] a(int param0, boolean param1) {
        if (!param1) {
            this.a(-12);
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    void c(byte param0) {
        if (param0 >= -35) {
            this.c((byte) -62);
        }
    }

    int[][] a(int param0, int param1) {
        ds var4;
        if (param0 != 255) {
          var4 = (ds) null;
          this.a(-96, -51, (ds) null);
          throw new IllegalStateException("This operation does not have a colour output");
        } else {
          throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    final static arb a(asb param0, byte param1, asb param2, int param3, int param4) {
        RuntimeException var5 = null;
        asb var6 = null;
        Object stackIn_4_0 = null;
        arb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -21) {
                break L1;
              } else {
                var6 = (asb) null;
                le.a((asb) null, (byte) 32, (asb) null, -82, 9);
                break L1;
              }
            }
            if (pa.a(param4, 2, param0, param3)) {
              stackIn_6_0 = coa.a(param2.a(param4, param3, (byte) 13), 11);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("le.Q(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (arb) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    le(int param0, boolean param1) {
        this.field_e = new le[param0];
        this.field_g = param1 ? true : false;
    }

    void a(int param0, int param1, ds param2) {
        try {
            if (param1 > -60) {
                this.field_g = false;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "le.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
