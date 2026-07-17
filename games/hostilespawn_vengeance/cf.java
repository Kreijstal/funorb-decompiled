/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cf extends dk {
    static bd[] field_u;
    static String field_r;
    static bd field_t;
    static bd[] field_q;
    static int field_s;

    final static void a(boolean param0, boolean param1, byte param2) {
        L0: {
          if (!param0) {
            si.d();
            si.d();
            si.d();
            break L0;
          } else {
            si.a(0, 0, si.field_e, si.field_k, 0, 192);
            break L0;
          }
        }
        if (param2 <= 5) {
          field_u = null;
          lf.a((byte) 84, param0);
          return;
        } else {
          lf.a((byte) 84, param0);
          return;
        }
    }

    public static void a() {
        field_r = null;
        field_q = null;
        field_t = null;
        field_u = null;
    }

    final static void d() {
        int var1 = 0;
        if (uh.field_m == null) {
          var1 = 0;
          ul.field_P = qm.b(1, 1);
          ph.field_F = qm.b(1, 2);
          ej.field_h = qm.b(1, 7);
          tk.field_a = qm.b(1, 3);
          vd.field_C = qm.b(1, 4);
          gi.field_h = qm.b(1, 5);
          bi.field_h = qm.b(1, 6);
          he.field_t = qm.b(1, 12);
          te.field_J = qm.b(1, 8);
          if (nl.field_c == 0) {
            L0: {
              int discarded$3 = 118;
              sc.a();
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          int discarded$4 = 35;
          ib.a(uh.field_m);
          uh.field_m = null;
          ql.f(8036);
          var1 = 0;
          ul.field_P = qm.b(1, 1);
          ph.field_F = qm.b(1, 2);
          ej.field_h = qm.b(1, 7);
          tk.field_a = qm.b(1, 3);
          vd.field_C = qm.b(1, 4);
          gi.field_h = qm.b(1, 5);
          bi.field_h = qm.b(1, 6);
          he.field_t = qm.b(1, 12);
          te.field_J = qm.b(1, 8);
          if (nl.field_c != 0) {
            L2: {
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              int discarded$5 = 118;
              sc.a();
              if (wb.field_S <= 0) {
                ae.a(wd.field_a, 110, gb.field_a);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    cf() {
    }

    final static void b() {
        if (fa.field_c != 10) {
          int discarded$8 = 0;
          if (wa.b()) {
            tf.field_d = true;
            return;
          } else {
            int discarded$9 = -64;
            pf.b();
            fa.field_c = 11;
            tf.field_d = true;
            return;
          }
        } else {
          int discarded$10 = -64;
          pf.b();
          fa.field_c = 11;
          tf.field_d = true;
          return;
        }
    }

    final static void a(oc param0, byte param1, int param2, oc param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        oj var6 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = mm.field_m[param2];
              if (var6.field_w == 5) {
                L2: {
                  var6.field_p = var6.field_p + 1;
                  if (var6.field_p < 8) {
                    break L2;
                  } else {
                    var6.field_p = 0;
                    var6.field_z = var6.field_z + 1;
                    break L2;
                  }
                }
                if (var6.field_z > 2) {
                  var6.c((byte) 74);
                  bn.a(3, var6);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (var6.field_I <= 0) {
                  var6.field_z = 0;
                  var6.field_w = 5;
                  var6.e((byte) -49);
                  break L1;
                } else {
                  var6.field_p = var6.field_p + 2;
                  if (var6.field_p >= var6.field_C) {
                    var6.field_z = var6.field_z + 1;
                    var6.field_p = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param1 >= 42) {
              break L0;
            } else {
              field_u = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("cf.V(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Waiting for fonts";
        field_s = 0;
    }
}
