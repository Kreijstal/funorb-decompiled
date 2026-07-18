/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_c;
    private pf field_f;
    private int field_g;
    private vi field_b;
    private int field_a;
    static String field_e;
    static jc field_d;

    private final void a(byte param0, long param1) {
        dl var4 = (dl) (Object) ((lf) this).field_b.a(-1, param1);
        this.a(0, var4);
    }

    private final void a(Object param0, int param1, int param2, long param3) {
        dl var6 = null;
        hc var6_ref = null;
        int var7 = Transmogrify.field_A ? 1 : 0;
        try {
            if (!(1 <= ((lf) this).field_g)) {
                throw new IllegalStateException();
            }
            this.a((byte) -116, param3);
            ((lf) this).field_a = ((lf) this).field_a - 1;
            while (((lf) this).field_a < 0) {
                var6 = (dl) (Object) ((lf) this).field_f.a(false);
                this.a(0, var6);
            }
            var6_ref = new hc(param0, 1);
            if (param2 >= -73) {
                ((lf) this).field_a = 94;
            }
            ((lf) this).field_b.a((wf) (Object) var6_ref, (byte) 63, param3);
            ((lf) this).field_f.a(false, (ri) (Object) var6_ref);
            ((dl) (Object) var6_ref).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "lf.D(" + (param0 != null ? "{...}" : "null") + ',' + 1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
    }

    final void a(Object param0, int param1, long param2) {
        if (param1 != -22137) {
            return;
        }
        try {
            this.a(param0, 1, param1 ^ 22019, param2);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "lf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        qd.b(5);
        if (null != gd.field_k) {
          L0: {
            gd.a(gd.field_k, (byte) 118);
            jh.a(false);
            lk.b(false);
            eh.b((byte) 99);
            if (!ua.a((byte) 69)) {
              break L0;
            } else {
              ff.field_D.a(false, 1);
              rb.a(0, -377);
              break L0;
            }
          }
          pc.a(1);
          return;
        } else {
          L1: {
            jh.a(false);
            lk.b(false);
            eh.b((byte) 99);
            if (!ua.a((byte) 69)) {
              break L1;
            } else {
              ff.field_D.a(false, 1);
              rb.a(0, -377);
              break L1;
            }
          }
          pc.a(1);
          return;
        }
    }

    private lf() throws Throwable {
        throw new Error();
    }

    final Object a(int param0, long param1) {
        hc var6 = null;
        Object var7 = null;
        dl var9 = null;
        Object var10 = null;
        dl var11 = null;
        Object var12 = null;
        if (param0 == 17699) {
          var11 = (dl) (Object) ((lf) this).field_b.a(-1, param1);
          if (var11 != null) {
            var12 = var11.c((byte) -82);
            if (var12 == null) {
              var11.c(5);
              var11.b((byte) -121);
              ((lf) this).field_a = ((lf) this).field_a + var11.field_o;
              return null;
            } else {
              L0: {
                if (var11.d(8)) {
                  var6 = new hc(var12, var11.field_o);
                  ((lf) this).field_b.a((wf) (Object) var6, (byte) 93, var11.field_c);
                  ((lf) this).field_f.a(false, (ri) (Object) var6);
                  ((dl) (Object) var6).field_j = 0L;
                  var11.c(param0 + -17694);
                  var11.b((byte) -69);
                  break L0;
                } else {
                  ((lf) this).field_f.a(false, (ri) (Object) var11);
                  var11.field_j = 0L;
                  break L0;
                }
              }
              return var12;
            }
          } else {
            return null;
          }
        } else {
          var7 = null;
          Object discarded$1 = lf.a((byte) 50, false, (byte[]) null);
          var9 = (dl) (Object) ((lf) this).field_b.a(-1, param1);
          if (var9 != null) {
            var10 = var9.c((byte) -82);
            if (var10 == null) {
              var9.c(5);
              var9.b((byte) -121);
              ((lf) this).field_a = ((lf) this).field_a + var9.field_o;
              return null;
            } else {
              L1: {
                if (var9.d(8)) {
                  var6 = new hc(var10, var9.field_o);
                  ((lf) this).field_b.a((wf) (Object) var6, (byte) 93, var9.field_c);
                  ((lf) this).field_f.a(false, (ri) (Object) var6);
                  ((dl) (Object) var6).field_j = 0L;
                  var9.c(param0 + -17694);
                  var9.b((byte) -69);
                  break L1;
                } else {
                  ((lf) this).field_f.a(false, (ri) (Object) var9);
                  var9.field_j = 0L;
                  break L1;
                }
              }
              return var10;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, dl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (param1 != null) {
            param1.c(5);
            param1.b((byte) -119);
            ((lf) this).field_a = ((lf) this).field_a + param1.field_o;
            return;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("lf.H(").append(0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (kc.field_g < 224) {
          var1 = kc.field_g % 32;
          ec.a(kc.field_g + (32 + -var1), 9956);
          var1 = -1;
          return;
        } else {
          ec.a(256, 9956);
          var1 = -1;
          return;
        }
    }

    final static Object a(byte param0, boolean param1, byte[] param2) {
        hf var3 = null;
        RuntimeException var3_ref = null;
        hf stackIn_6_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_5_0 = null;
        byte[] stackOut_9_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length > 136) {
                var3 = new hf();
                ((dj) (Object) var3).a(param2, (byte) -128);
                stackOut_5_0 = (hf) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                L1: {
                  if (param0 == -43) {
                    break L1;
                  } else {
                    field_c = 124;
                    break L1;
                  }
                }
                stackOut_9_0 = pi.a((byte) -29, param2);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("lf.B(").append(param0).append(',').append(false).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return (Object) (Object) stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Name is available";
    }
}
