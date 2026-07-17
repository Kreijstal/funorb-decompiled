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
            er.a(((ns) this).field_n, 108, param0);
            int var3_int = -18 / ((param1 - 37) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ns.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != -11) {
            ns.a(-52);
        }
    }

    final void a(boolean param0, op param1) {
        aga var3 = ((ns) this).field_n.a(107, param1);
        if (!(var3 != null)) {
            return;
        }
        try {
            var3.j(-106);
            var3.field_A = param0 ? true : false;
            param1.field_R = false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ns.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
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
                    if (param2 == 8) {
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
                      int discarded$2 = -106;
                      bga.c();
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (uka.field_j) {
                          param0 = lga.a(true, new String[1], ok.field_Cb);
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
                  if (param2 == 256) {
                    break L1;
                  } else {
                    if (param2 == 10) {
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
              var4 = null;
              ns.a((String) null, 125, 54);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("ns.D(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    ns(nq param0) {
        try {
            ((ns) this).field_j = 8;
            ((ns) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ns.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(ub param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              param0.a(27799, (at) (Object) new gka(param0.field_o, (ns) this));
              if (param1 <= -2) {
                break L1;
              } else {
                var4 = null;
                ((ns) this).a(false, (op) null);
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
            stackOut_3_1 = new StringBuilder().append("ns.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    static {
    }
}
