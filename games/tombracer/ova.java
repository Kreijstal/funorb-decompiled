/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ova extends me {
    static String field_j;
    static String field_k;

    public static void d() {
        field_k = null;
        field_j = null;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 25 / ((29 - param2) / 57);
        return false;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        la var5 = null;
        var2 = 16777215;
        if (param0 >= -13) {
          return;
        } else {
          var3 = 160;
          rba.a(192, 160, 3145728, 240, (byte) 22, var3, 200);
          tp.a(200, (byte) -85, var3, 5242880, 2, 160, 240);
          oka.a("Room Completed", var2, eda.field_f, -1, var3 + 40, 320, 0);
          var4 = 240;
          var5 = ((ova) this).field_g.field_G[0].field_b[0];
          var4 += 20;
          oka.a("Total Time: " + dea.a(((ova) this).field_g.field_G[0].field_c, (byte) -8), var2, kn.field_p, -1, var4, 320, 0);
          var4 += 20;
          oka.a("Deaths: " + var5.v(0), var2, kn.field_p, -1, var4, 320, 0);
          return;
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3, int param4) {
        return et.b(param1, param0, -81) - iia.d(param3, param4, 2);
    }

    final void a(byte param0) {
        if (param0 > -107) {
            Object var3 = null;
            ova.a((byte) 21, true, 36, (lu) null, true);
        }
    }

    ova(qh param0) {
        super(param0);
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    final static boolean c(int param0) {
        if (param0 != 2) {
            return false;
        }
        lqa var1 = uv.b(false);
        if (var1 == null) {
            return false;
        }
        return var1.field_f;
    }

    final static void a(byte param0, boolean param1, int param2, lu param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            qi.field_K[0] = lpa.field_p.nextInt();
            qi.field_K[1] = lpa.field_p.nextInt();
            jg.field_a.field_h = 0;
            qi.field_K[3] = (int)ra.field_L;
            qi.field_K[2] = (int)(ra.field_L >> 32);
            jg.field_a.a(qi.field_K[0], (byte) 80);
            jg.field_a.a(qi.field_K[1], (byte) 124);
            jg.field_a.a(qi.field_K[2], (byte) -28);
            if (param0 >= 19) {
              L1: {
                jg.field_a.a(qi.field_K[3], (byte) 104);
                int discarded$1 = 77;
                ni.a(jg.field_a);
                jg.field_a.f(-1477662136, param2);
                param3.a(jg.field_a, false);
                ql.field_k.field_h = 0;
                if (!param1) {
                  ql.field_k.i(16, 0);
                  break L1;
                } else {
                  ql.field_k.i(18, 0);
                  break L1;
                }
              }
              L2: {
                ql.field_k.field_h = ql.field_k.field_h + 2;
                var5_int = ql.field_k.field_h;
                ql.field_k.a(lr.field_c, (byte) 125);
                ql.field_k.a(1736565456, du.field_h);
                var6 = 0;
                if (ft.field_a) {
                  var6 = var6 | 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (q.field_r) {
                  var6 = var6 | 4;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param4) {
                  var6 = var6 | 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (ji.field_d != null) {
                  var6 = var6 | 16;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                ql.field_k.i(var6, 0);
                var7 = qla.a(0, di.a(46));
                if (var7 == null) {
                  var7 = "";
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ql.field_k.a(var7, false);
                if (null == ji.field_d) {
                  break L7;
                } else {
                  ql.field_k.a(ji.field_d, (byte) 0);
                  break L7;
                }
              }
              bna.a(oca.field_a, false, c.field_f, (uia) (Object) ql.field_k, jg.field_a);
              ql.field_k.b(ql.field_k.field_h - var5_int, (byte) 114);
              bl.a(-1, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ova.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "This game option has not yet been unlocked for use.";
        field_k = "Who can join";
    }
}
