/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rdb extends ksa implements ntb {
    private int field_e;
    private int field_g;
    private int field_d;
    static String field_f;

    final int a(boolean param0) {
        if (!param0) {
            this.a(46);
            return this.field_e;
        }
        return this.field_e;
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_4_0 = 0;
        if (param1 >= -54) {
          return true;
        } else {
          L0: {
            var4 = param0 - this.field_e;
            var5 = param2 - this.field_d;
            var6 = ar.a(var4, (byte) 106, var5);
            if (51200 <= var6) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                this.field_e = -114;
            }
            this.field_e = param0.i(0, 32);
            this.field_d = param0.i(0, 32);
            this.field_g = param0.i(0, 1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rdb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(lta param0, boolean param1) {
        int var3_int = 0;
        try {
            var3_int = qpb.a(param1, this.field_g, 13894143);
            kq.a(param0.field_a * 51200.0f, (byte) 89, param0.b(true, this.field_d), var3_int, param0.a(this.field_e, (byte) 121));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rdb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int d(int param0) {
        int var2 = 28 % ((param0 - 55) / 49);
        return this.field_g;
    }

    final void a(int param0, pe param1) {
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
              if (param0 == 3128) {
                break L1;
              } else {
                this.a(-54, (byte) 92, -6);
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

            stackIn_5_1 = new StringBuilder().append("rdb.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 >= -109) {
                this.field_d = -98;
            }
            param0.a(-632, this.field_e, 32);
            param0.a(-632, this.field_d, 32);
            param0.a(-632, this.field_g, 1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rdb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        rdb var6 = null;
        rdb var7 = null;
        try {
            var6 = (rdb) ((Object) param1);
            var7 = var6;
            var7.field_g = this.field_g;
            var7.field_e = this.field_e;
            if (param0 < 54) {
                tv var4 = (tv) null;
                this.a((byte) 14, (tv) null);
            }
            var7.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rdb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -111 % ((param1 - -20) / 61);
        this.field_g = param0;
    }

    final int a(int param0) {
        if (param0 < 56) {
            this.field_d = -12;
            return this.field_d;
        }
        return this.field_d;
    }

    public static void c(int param0) {
        if (param0 != 51200) {
            field_f = (String) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        rdb var4 = null;
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
                var3_int = 28 % ((22 - param0) / 59);
                var4 = (rdb) ((Object) param1);
                if (this.field_e != var4.field_e) {
                  break L2;
                } else {
                  if (var4.field_d != this.field_d) {
                    break L2;
                  } else {
                    if (var4.field_g == this.field_g) {
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

            stackIn_9_1 = new StringBuilder().append("rdb.C(").append(param0).append(',');

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

    rdb() {
    }

    rdb(int param0, int param1, int param2) {
        this.field_g = param2;
        this.field_d = param1;
        this.field_e = param0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        rdb var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (rdb) ((Object) param0);
            if (param1 < -19) {
              L1: {
                var4 = 0;
                if (this.field_e == var5.field_e) {
                  break L1;
                } else {
                  System.out.println("int x has changed. before=" + var5.field_e + ", now=" + this.field_e);
                  var4 = 1;
                  break L1;
                }
              }
              L2: {
                if (this.field_d != var5.field_d) {
                  var4 = 1;
                  System.out.println("int y has changed. before=" + var5.field_d + ", now=" + this.field_d);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5.field_g != this.field_g) {
                  System.out.println("int team has changed. before=" + var5.field_g + ", now=" + this.field_g);
                  var4 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (var4 == 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                System.out.println("This instance of SpawnPoint has changed");
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
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("rdb.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_f = "You can ask to join this game";
    }
}
