/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dv implements ntb {
    int field_e;
    static ij field_c;
    static Object field_b;
    boolean field_a;
    static int field_f;
    static String field_d;

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        tv var4 = null;
        dv var6 = null;
        dv var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (dv) ((Object) param1);
            var7 = var6;
            var7.field_a = this.field_a;
            var7.field_e = this.field_e;
            if (param0 > 54) {
              break L0;
            } else {
              var4 = (tv) null;
              this.b((byte) -57, (tv) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("dv.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 < 97) {
          dv.a((byte) -23);
          jt.a(param5, param4, param1, (byte) -122, 31, param2, param0);
          return;
        } else {
          jt.a(param5, param4, param1, (byte) -122, 31, param2, param0);
          return;
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        dv var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = (dv) ((Object) param0);
              if (param1 <= -19) {
                break L1;
              } else {
                var5 = (tv) null;
                this.a((byte) -95, (tv) null);
                break L1;
              }
            }
            L2: {
              var4 = 0;
              if (var6.field_e != this.field_e) {
                var4 = 1;
                System.out.println("int option has changed. before=" + var6.field_e + ", now=" + this.field_e);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var6.field_a != this.field_a) {
                System.out.println("boolean unvote has changed. before=" + var6.field_a + ", now=" + this.field_a);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of PlayerVote has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("dv.F(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            this.field_e = param0.i(0, 32);
            this.field_a = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "dv.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            param0.a(-632, this.field_e, 32);
            vq.a(param0, -70, this.field_a);
            if (param1 >= -109) {
                this.field_a = false;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "dv.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        dv var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (dv) ((Object) param1);
                var4 = 9 % ((param0 - 22) / 59);
                if (this.field_e != var3.field_e) {
                  break L2;
                } else {
                  L3: {
                    stackIn_3_0 = this.field_a;

                    if (var3.field_a) {
                      stackIn_4_0 = stackIn_3_0;
                      stackIn_4_1 = 0;
                      break L3;
                    } else {
                      stackIn_4_0 = stackIn_3_0;
                      stackIn_4_1 = 1;
                      break L3;
                    }
                  }
                  if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("dv.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -98) {
            field_c = (ij) null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    dv() {
    }

    dv(int param0, boolean param1) {
        this.field_e = param0;
        this.field_a = param1 ? true : false;
    }

    static {
        field_c = new ij();
        field_d = "Fastest";
    }
}
