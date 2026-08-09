/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_c;
    private qb field_d;
    private bk field_e;
    static String field_b;
    static volatile int field_a;

    final qb b(byte param0) {
        qb var2 = this.field_e.field_a.field_d;
        if (!(var2 != this.field_e.field_a)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_d;
        if (param0 != -33) {
            return (qb) null;
        }
        return var2;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != -2057) {
            field_a = 11;
        }
    }

    final qb a(int param0, qb param1) {
        qb var3 = null;
        RuntimeException var3_ref = null;
        qb var4 = null;
        Object stackIn_8_0 = null;
        qb stackIn_10_0 = null;
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
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_e.field_a.field_d;
                break L1;
              }
            }
            L2: {
              if (param0 == 25755) {
                break L2;
              } else {
                var4 = (qb) null;
                this.a((byte) 72, (qb) null);
                break L2;
              }
            }
            if (this.field_e.field_a == var3) {
              this.field_d = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_d = var3.field_d;
              stackIn_10_0 = (qb) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("qd.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qb) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final qb a(byte param0, qb param1) {
        qb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        qb stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = this.field_e.field_a.field_a;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (var3 != this.field_e.field_a) {
              this.field_d = var3.field_a;
              var4 = 95 / ((param0 - -78) / 33);
              stackIn_7_0 = (qb) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_d = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("qd.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qb) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = param2.length();
              if (param0 <= -54) {
                break L1;
              } else {
                qd.c(-56);
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4) {
                stackIn_10_0 = var3_int;
                break L0;
              } else {
                L3: {
                  if (param1 == param2.charAt(var5)) {
                    var3_int++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("qd.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final qb a(byte param0) {
        qb var2 = this.field_d;
        if (!(this.field_e.field_a != var2)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_a;
        if (param0 < 55) {
            return (qb) null;
        }
        return var2;
    }

    final qb c(byte param0) {
        qb var2 = this.field_e.field_a.field_a;
        if (this.field_e.field_a == var2) {
            this.field_d = null;
            return null;
        }
        if (param0 != -13) {
            this.field_e = (bk) null;
        }
        this.field_d = var2.field_a;
        return var2;
    }

    final qb a(int param0) {
        qb var2 = this.field_d;
        if (param0 != 28869) {
            return (qb) null;
        }
        if (!(this.field_e.field_a != var2)) {
            this.field_d = null;
            return null;
        }
        this.field_d = var2.field_d;
        return var2;
    }

    final static nk b(int param0) {
        if (tj.field_F == jc.field_P) {
            throw new IllegalStateException();
        }
        int var1 = -14 % ((param0 - -25) / 60);
        if (gg.field_b != jc.field_P) {
            return null;
        }
        jc.field_P = tj.field_F;
        return mh.field_a;
    }

    qd(bk param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Accept";
        field_a = 0;
    }
}
