/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class odb implements ntb {
    int field_a;
    static llb field_b;
    int field_d;
    int field_c;

    public final void b(byte param0, tv param1) {
        odb var4 = (odb) ((Object) param1);
        odb var3 = var4;
        var4.field_a = this.field_a;
        var4.field_d = this.field_d;
        if (param0 < 54) {
            return;
        }
        try {
            var4.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "odb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                this.field_a = -41;
            }
            this.field_a = param0.i(0, 32);
            this.field_d = param0.i(0, 32);
            this.field_c = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "odb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        odb var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -19) {
              L1: {
                var5 = (odb) ((Object) param0);
                var4 = 0;
                if (var5.field_a != this.field_a) {
                  System.out.println("int target_id has changed. before=" + var5.field_a + ", now=" + this.field_a);
                  var4 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_d == var5.field_d) {
                  break L2;
                } else {
                  var4 = 1;
                  System.out.println("int target_x has changed. before=" + var5.field_d + ", now=" + this.field_d);
                  break L2;
                }
              }
              L3: {
                if (var5.field_c == this.field_c) {
                  break L3;
                } else {
                  System.out.println("int target_y has changed. before=" + var5.field_c + ", now=" + this.field_c);
                  var4 = 1;
                  break L3;
                }
              }
              if (var4 == 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                System.out.println("This instance of TargetLock has changed");
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("odb.F(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.a(-632, this.field_a, 32);
              param0.a(-632, this.field_d, 32);
              param0.a(-632, this.field_c, 32);
              if (param1 < -109) {
                break L1;
              } else {
                this.field_c = -84;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("odb.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        odb var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -108 / ((22 - param0) / 59);
                var4 = (odb) ((Object) param1);
                if (this.field_a != var4.field_a) {
                  break L2;
                } else {
                  if (this.field_d != var4.field_d) {
                    break L2;
                  } else {
                    if (var4.field_c == this.field_c) {
                      stackIn_6_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_6_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("odb.C(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    static {
    }
}
