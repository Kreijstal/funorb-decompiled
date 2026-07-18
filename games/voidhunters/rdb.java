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
            int discarded$0 = ((rdb) this).a(46);
            return ((rdb) this).field_e;
        }
        return ((rdb) this).field_e;
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 >= -54) {
          return true;
        } else {
          L0: {
            var4 = param0 - ((rdb) this).field_e;
            var5 = param2 - ((rdb) this).field_d;
            var6 = ar.a(var4, (byte) 106, var5);
            if (51200 <= var6) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                ((rdb) this).field_e = -114;
            }
            ((rdb) this).field_e = param0.i(0, 32);
            ((rdb) this).field_d = param0.i(0, 32);
            ((rdb) this).field_g = param0.i(0, 1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rdb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(lta param0, boolean param1) {
        int var3_int = 0;
        try {
            var3_int = qpb.a(param1, ((rdb) this).field_g, 13894143);
            kq.a(param0.field_a * 51200.0f, (byte) 89, param0.b(true, ((rdb) this).field_d), var3_int, param0.a(((rdb) this).field_e, (byte) 121));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rdb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int d(int param0) {
        int var2 = 28 % ((param0 - 55) / 49);
        return ((rdb) this).field_g;
    }

    final void a(int param0, pe param1) {
        RuntimeException runtimeException = null;
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
              if (param0 == 3128) {
                break L1;
              } else {
                boolean discarded$2 = ((rdb) this).a(-54, (byte) 92, -6);
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
            stackOut_3_1 = new StringBuilder().append("rdb.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 >= -109) {
                ((rdb) this).field_d = -98;
            }
            param0.a(-632, ((rdb) this).field_e, 32);
            param0.a(-632, ((rdb) this).field_d, 32);
            param0.a(-632, ((rdb) this).field_g, 1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rdb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        rdb var6 = null;
        rdb var7 = null;
        try {
            var6 = (rdb) (Object) param1;
            var7 = var6;
            var7.field_g = var6.field_g;
            var7.field_e = var6.field_e;
            if (param0 < 54) {
                Object var4 = null;
                boolean discarded$0 = ((rdb) this).a((byte) 14, (tv) null);
            }
            var7.field_d = var6.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rdb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -111 % ((param1 - -20) / 61);
        ((rdb) this).field_g = param0;
    }

    final int a(int param0) {
        if (param0 < 56) {
            ((rdb) this).field_d = -12;
            return ((rdb) this).field_d;
        }
        return ((rdb) this).field_d;
    }

    public static void c() {
        field_f = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rdb var4 = null;
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
        int stackOut_4_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 28 % ((22 - param0) / 59);
                var4 = (rdb) (Object) param1;
                if (var4.field_e != var4.field_e) {
                  break L2;
                } else {
                  if (var4.field_d != var4.field_d) {
                    break L2;
                  } else {
                    if (var4.field_g == var4.field_g) {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("rdb.C(").append(param0).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    rdb() {
    }

    rdb(int param0, int param1, int param2) {
        ((rdb) this).field_g = param2;
        ((rdb) this).field_d = param1;
        ((rdb) this).field_e = param0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        rdb var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5 = (rdb) (Object) param0;
            if (param1 < -19) {
              L1: {
                var4 = 0;
                if (var5.field_e == var5.field_e) {
                  break L1;
                } else {
                  System.out.println("int x has changed. before=" + var5.field_e + ", now=" + var5.field_e);
                  var4 = 1;
                  break L1;
                }
              }
              L2: {
                if (var5.field_d != var5.field_d) {
                  var4 = 1;
                  System.out.println("int y has changed. before=" + var5.field_d + ", now=" + var5.field_d);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5.field_g != var5.field_g) {
                  System.out.println("int team has changed. before=" + var5.field_g + ", now=" + var5.field_g);
                  var4 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (var4 == 0) {
                break L0;
              } else {
                System.out.println("This instance of SpawnPoint has changed");
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("rdb.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You can ask to join this game";
    }
}
