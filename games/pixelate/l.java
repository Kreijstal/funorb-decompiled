/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class l extends de {
    static ea field_r;
    static ak field_s;
    static String field_u;
    static String field_t;
    static gp field_p;
    static ak field_q;
    static String field_o;

    l(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void e(int param0) {
        field_t = null;
        field_r = null;
        if (param0 != 2219) {
          l.e(8);
          field_u = null;
          field_p = null;
          field_o = null;
          field_s = null;
          field_q = null;
          return;
        } else {
          field_u = null;
          field_p = null;
          field_o = null;
          field_s = null;
          field_q = null;
          return;
        }
    }

    final static void b(int param0, boolean param1) {
        Object var3 = null;
        if (param0 == 19854) {
          L0: {
            if (!tm.a((byte) 127)) {
              break L0;
            } else {
              param1 = false;
              break L0;
            }
          }
          am.a((byte) 29, param1);
          if (dk.field_b) {
            t.a(nd.field_b.field_g.field_D, nd.field_b.field_g.field_S, nd.field_b.field_g.field_K, nd.field_b.field_g.field_nb);
            nd.field_b.field_g.a(param1, 0);
            no.a(param1, (byte) 34);
            return;
          } else {
            no.a(param1, (byte) 34);
            return;
          }
        } else {
          L1: {
            var3 = null;
            l.a(false, -75, -15, true, 99, -28L, (String) null, -112, -64, true, 118, -87, 71, (cb) null);
            if (!tm.a((byte) 127)) {
              break L1;
            } else {
              param1 = false;
              break L1;
            }
          }
          am.a((byte) 29, param1);
          if (!dk.field_b) {
            no.a(param1, (byte) 34);
            return;
          } else {
            t.a(nd.field_b.field_g.field_D, nd.field_b.field_g.field_S, nd.field_b.field_g.field_K, nd.field_b.field_g.field_nb);
            nd.field_b.field_g.a(param1, 0);
            no.a(param1, (byte) 34);
            return;
          }
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        if (param0 < -116) {
          if (param2 == 0) {
            ((l) this).a(param1, true);
            return;
          } else {
            return;
          }
        } else {
          l.b(116, true);
          if (param2 != 0) {
            return;
          } else {
            ((l) this).a(param1, true);
            return;
          }
        }
    }

    final void c(byte param0) {
        la.a(nc.field_a, nc.field_a, false, -25528);
        if (param0 > -13) {
            l.e(-78);
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, long param5, String param6, int param7, int param8, boolean param9, int param10, int param11, int param12, cb param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                vi.field_o = new pc(param8);
                aa.field_f = new pc(param2);
                bj.field_a = param1;
                hf.field_n = param7;
                op.field_p = param13;
                if (!param9) {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                } else {
                  stackOut_1_0 = 1;
                  stackIn_3_0 = stackOut_1_0;
                  break L0;
                }
              }
              L1: {
                vm.field_d = stackIn_3_0 != 0;
                hf.field_t = param5;
                if (!param3) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              uj.field_Lb = stackIn_6_0 != 0;
              cd.field_b = param11;
              pc.field_q = param12;
              ra.field_c = param4;
              ii.field_B = param6;
              gd.field_g = param10;
              if (null != op.field_p.field_e) {
                {
                  L2: {
                    vi.field_p = new uo(op.field_p.field_e, 64, 0);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var15_ref;
                stackOut_12_1 = new StringBuilder().append("l.I(").append(false).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param6 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L3;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L3;
                }
              }
              L4: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param13 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L4;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L4;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        if (qo.field_o != qa.field_f.field_i) {
            wa.field_i = wa.field_i + (qa.field_f.field_i + -qo.field_o);
            qo.field_o = qa.field_f.field_i;
            if (!(oh.field_b <= 0)) {
                oh.field_b = oh.field_b - 1;
            }
            if (!(oh.field_b <= 0)) {
                r.b(-96);
            }
            return;
        }
        if (!(oh.field_b <= 0)) {
            oh.field_b = oh.field_b - 1;
        }
        if (!(oh.field_b <= 0)) {
            r.b(-96);
        }
    }

    final void a(int param0) {
        tc var2 = null;
        int var3 = 0;
        ((l) this).d((byte) -65);
        ((l) this).b((byte) -71);
        if (param0 != 11) {
          ((l) this).a((byte) 119, false, 7);
          var2 = qj.field_e;
          var3 = 1 + (var2.field_w + var2.field_z);
          int discarded$2 = var2.a(ie.field_F, 50, 160, 540, 200, 16777215, 0, 1, 1, var3);
          return;
        } else {
          var2 = qj.field_e;
          var3 = 1 + (var2.field_w + var2.field_z);
          int discarded$3 = var2.a(ie.field_F, 50, 160, 540, 200, 16777215, 0, 1, 1, var3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ea(3);
        field_t = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_u = "Waiting for sound effects";
        field_o = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
