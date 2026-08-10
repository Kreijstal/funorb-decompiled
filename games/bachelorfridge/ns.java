/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ns extends jm {
    static kv[] field_m;
    nq field_n;

    ns(lu param0) {
        this(qi.a(param0, (byte) 9));
    }

    final void b(lu param0, byte param1) {
        try {
            er.a(this.field_n, 108, param0);
            int var3_int = -18 / ((param1 - 37) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ns.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != -11) {
            ns.a(-52);
        }
    }

    final void a(boolean param0, op param1) {
        aga var3 = this.field_n.a(107, param1);
        if (!(var3 != null)) {
            return;
        }
        try {
            var3.j(-106);
            var3.field_A = param0 ? true : false;
            param1.field_R = false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ns.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              uka.field_j = false;
              eea.field_b = false;
              if (oq.field_b == null) {
                break L1;
              } else {
                if (!oq.field_b.field_C) {
                  break L1;
                } else {
                  L2: {
                    if (-9 == (param2 ^ -1)) {
                      L3: {
                        param2 = 2;
                        if (!gfa.field_i) {
                          param0 = uba.field_q;
                          break L3;
                        } else {
                          param0 = vfa.field_q;
                          break L3;
                        }
                      }
                      ola.field_e.a(-113, dk.field_p);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if (param2 != 10) {
                      break L4;
                    } else {
                      var3_int = 0;
                      bga.c((byte) -106);
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (uka.field_j) {
                          param0 = lga.a(true, new String[]{param0}, ok.field_Cb);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (!sna.field_s) {
                          break L7;
                        } else {
                          param0 = kda.field_a;
                          break L7;
                        }
                      }
                      oq.field_b.a(param2, param0, true);
                      break L5;
                    }
                  }
                  if (-257 == (param2 ^ -1)) {
                    break L1;
                  } else {
                    if (-11 == (param2 ^ -1)) {
                      break L1;
                    } else {
                      if (gfa.field_i) {
                        break L1;
                      } else {
                        ola.field_e.b(false);
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            if (param1 == -11) {
              break L0;
            } else {
              var4 = (String) null;
              ns.a((String) null, 125, 54);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("ns.D(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ns(nq param0) {
        try {
            this.field_j = 8;
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ns.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ub param0, int param1) {
        try {
            param0.a(27799, new gka(param0.field_o, (ns) (this)));
            if (param1 > -2) {
                op var4 = (op) null;
                this.a(false, (op) null);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ns.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
