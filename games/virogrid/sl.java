/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    private eb field_b;
    static String field_g;
    private int field_e;
    static km field_h;
    static String field_c;
    private gk field_d;
    private int field_f;
    static String field_a;

    private final void a(int param0, dm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                param1.a(false);
                param1.c(82);
                ((sl) this).field_e = ((sl) this).field_e + param1.field_p;
                break L1;
              }
            }
            if (param0 >= 25) {
              break L0;
            } else {
              field_g = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("sl.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final void a(long param0, int param1) {
        int var5 = -83;
        dm var4 = (dm) (Object) ((sl) this).field_d.a(param0, -18348);
        this.a(106, var4);
    }

    sl(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, int param1) {
        jm.a(param1, (byte) -102);
        if (param0 > -101) {
            field_g = null;
        }
    }

    final Object b(long param0, int param1) {
        mj var6 = null;
        dm var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (dm) (Object) ((sl) this).field_d.a(param0, -18348);
        if (var7 != null) {
          if (param1 == 0) {
            var9 = var7.b((byte) -109);
            if (var9 == null) {
              var7.a(false);
              var7.c(75);
              ((sl) this).field_e = ((sl) this).field_e + var7.field_p;
              return null;
            } else {
              L0: {
                if (var7.d(107)) {
                  var6 = new mj(var9, var7.field_p);
                  ((sl) this).field_d.a((l) (Object) var6, param1 ^ -112, var7.field_d);
                  ((sl) this).field_b.a(true, (wb) (Object) var6);
                  ((dm) (Object) var6).field_j = 0L;
                  var7.a(false);
                  var7.c(param1 + 69);
                  break L0;
                } else {
                  ((sl) this).field_b.a(true, (wb) (Object) var7);
                  var7.field_j = 0L;
                  break L0;
                }
              }
              return var9;
            }
          } else {
            ((sl) this).field_e = -36;
            var8 = var7.b((byte) -109);
            if (var8 == null) {
              var7.a(false);
              var7.c(75);
              ((sl) this).field_e = ((sl) this).field_e + var7.field_p;
              return null;
            } else {
              L1: {
                if (var7.d(107)) {
                  var6 = new mj(var8, var7.field_p);
                  ((sl) this).field_d.a((l) (Object) var6, param1 ^ -112, var7.field_d);
                  ((sl) this).field_b.a(true, (wb) (Object) var6);
                  ((dm) (Object) var6).field_j = 0L;
                  var7.a(false);
                  var7.c(param1 + 69);
                  break L1;
                } else {
                  ((sl) this).field_b.a(true, (wb) (Object) var7);
                  var7.field_j = 0L;
                  break L1;
                }
              }
              return var8;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, Object param1, long param2, int param3) {
        dm var6 = null;
        mj var6_ref = null;
        int var8 = Virogrid.field_F ? 1 : 0;
        try {
            if (!(((sl) this).field_f >= param0)) {
                throw new IllegalStateException();
            }
            this.a(param2, -48);
            ((sl) this).field_e = ((sl) this).field_e - param0;
            while (((sl) this).field_e < 0) {
                var6 = (dm) (Object) ((sl) this).field_b.a(-32314);
                this.a(103, var6);
            }
            var6_ref = new mj(param1, param0);
            ((sl) this).field_d.a((l) (Object) var6_ref, -121, param2);
            int var7 = 0;
            ((sl) this).field_b.a(true, (wb) (Object) var6_ref);
            ((dm) (Object) var6_ref).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "sl.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + -106 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
          sl.a(-112);
          field_h = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_g = null;
          return;
        }
    }

    private sl(int param0, int param1) {
        int var3 = 0;
        ((sl) this).field_b = new eb();
        ((sl) this).field_f = param0;
        ((sl) this).field_e = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 - -var3 < param0) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((sl) this).field_d = new gk(var3);
              return;
            }
          } else {
            ((sl) this).field_d = new gk(var3);
            return;
          }
        }
    }

    final void a(Object param0, long param1, int param2) {
        try {
            if (param2 != -14696) {
                ((sl) this).field_f = -85;
            }
            this.a(1, param0, param1, -106);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "sl.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Accept";
        field_g = "Concluded";
        field_a = "3D mode";
    }
}
