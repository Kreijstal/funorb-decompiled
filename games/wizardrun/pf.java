/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static int field_f;
    private oi field_d;
    static String field_c;
    static boolean field_g;
    static o field_b;
    private wl field_a;
    static char[] field_e;

    final static int c(byte param0) {
        int var1 = 48 / ((-9 - param0) / 52);
        return -fe.field_l + sj.field_n;
    }

    final wl b(int param0) {
        wl var2;
        var2 = this.field_a;
        if (param0 == 35) {
          if (this.field_d.field_a == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_b;
            return var2;
          }
        } else {
          field_c = (String) null;
          if (this.field_d.field_a == var2) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_b;
            return var2;
          }
        }
    }

    final wl a(wl param0, int param1) {
        wl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        wl stackIn_10_0 = null;
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
              if (param1 < -59) {
                break L1;
              } else {
                field_b = (o) null;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                var3 = param0;
                break L2;
              } else {
                var3 = this.field_d.field_a.field_b;
                break L2;
              }
            }
            if (var3 == this.field_d.field_a) {
              this.field_a = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_b;
              stackIn_10_0 = (wl) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("pf.F(");

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
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wl) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 < 107) {
            return -123;
        }
        int var3 = param0 >>> -1554317377;
        return (param0 - -var3) / param2 - var3;
    }

    final wl a(byte param0) {
        wl var2;
        var2 = this.field_d.field_a.field_b;
        if (this.field_d.field_a != var2) {
          this.field_a = var2.field_b;
          if (param0 != 31) {
            this.field_a = (wl) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final wl a(int param0, wl param1) {
        wl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        wl stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_d.field_a.field_c;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (var3 == this.field_d.field_a) {
              this.field_a = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = -120 % ((param0 - 11) / 37);
              this.field_a = var3.field_c;
              stackIn_8_0 = (wl) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("pf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wl) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final wl a(boolean param0) {
        wl var2;
        var2 = this.field_a;
        if (var2 != this.field_d.field_a) {
          this.field_a = var2.field_c;
          if (!param0) {
            field_g = true;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final wl b(byte param0) {
        wl var2 = this.field_d.field_a.field_c;
        int var3 = -75 / ((-15 - param0) / 61);
        if (!(this.field_d.field_a != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_c;
        return var2;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 91) {
            field_f = -44;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    pf(oi param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Visit the Account Management section on the main site to view.";
        field_e = new char[]{(char)91, (char)93, (char)35};
    }
}
