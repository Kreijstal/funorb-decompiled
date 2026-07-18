/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static byte[][][] field_a;
    static boolean field_h;
    static bh field_d;
    static int field_i;
    private rk field_c;
    static String field_e;
    static nj field_g;
    static String field_b;
    private rk field_f;

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) tc.field_m;
        synchronized (var1) {
          L0: {
            sh.field_c = ve.field_d;
            oc.field_a = oc.field_a + 1;
            pg.field_n = wizardrun.field_T;
            fi.field_B = gj.field_a;
            ih.field_a = jf.field_i;
            jf.field_i = false;
            w.field_c = fi.field_w;
            tf.field_e = mh.field_pb;
            dh.field_b = dc.field_t;
            fi.field_w = 0;
            break L0;
          }
        }
    }

    final rk d(int param0) {
        rk var2 = null;
        var2 = ((th) this).field_f;
        if (((th) this).field_c != var2) {
          if (param0 <= 3) {
            ((th) this).field_f = null;
            ((th) this).field_f = var2.field_i;
            return var2;
          } else {
            ((th) this).field_f = var2.field_i;
            return var2;
          }
        } else {
          ((th) this).field_f = null;
          return null;
        }
    }

    final rk a(int param0) {
        rk var2 = null;
        var2 = ((th) this).field_c.field_i;
        if (param0 == 0) {
          if (((th) this).field_c == var2) {
            ((th) this).field_f = null;
            return null;
          } else {
            ((th) this).field_f = var2.field_i;
            return var2;
          }
        } else {
          rk discarded$7 = ((th) this).b(68);
          if (((th) this).field_c == var2) {
            ((th) this).field_f = null;
            return null;
          } else {
            ((th) this).field_f = var2.field_i;
            return var2;
          }
        }
    }

    final int c(int param0) {
        int var2 = 0;
        rk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var2 = 0;
        var3 = ((th) this).field_c.field_i;
        L0: while (true) {
          if (((th) this).field_c == var3) {
            if (param0 != 4) {
              return -16;
            } else {
              return var2;
            }
          } else {
            var3 = var3.field_i;
            var2++;
            continue L0;
          }
        }
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_5_0 = (StringBuilder) param0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                param0.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("th.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + ' ' + ',' + 0 + ',' + 1 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_g = null;
        field_b = null;
        field_d = null;
    }

    final void a(rk param0, int param1) {
        try {
            if (param1 != 14) {
                rk discarded$0 = ((th) this).a(-10);
            }
            if (param0.field_l != null) {
                param0.b(false);
            }
            param0.field_i = ((th) this).field_c;
            param0.field_l = ((th) this).field_c.field_l;
            param0.field_l.field_i = param0;
            param0.field_i.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "th.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final rk b(int param0) {
        rk var2 = null;
        var2 = ((th) this).field_c.field_i;
        if (param0 >= 33) {
          if (((th) this).field_c == var2) {
            return null;
          } else {
            var2.b(false);
            return var2;
          }
        } else {
          field_g = null;
          if (((th) this).field_c == var2) {
            return null;
          } else {
            var2.b(false);
            return var2;
          }
        }
    }

    public th() {
        ((th) this).field_c = new rk();
        ((th) this).field_c.field_l = ((th) this).field_c;
        ((th) this).field_c.field_i = ((th) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bh(14, 0, 4, 1);
        field_b = "Just play";
    }
}
