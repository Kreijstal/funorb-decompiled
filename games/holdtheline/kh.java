/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh extends gd {
    private String field_k;
    private boolean field_j;
    static String field_i;
    static hj field_l;
    private qf field_m;

    final static void b(boolean param0) {
        if ((bk.field_w ^ -1) == -11) {
          ka.a(-1);
          bk.field_w = 11;
          if (!param0) {
            de.field_K = true;
            return;
          } else {
            field_l = null;
            de.field_K = true;
            return;
          }
        } else {
          if (!ai.a(-91)) {
            ka.a(-1);
            bk.field_w = 11;
            if (param0) {
              field_l = null;
              de.field_K = true;
              return;
            } else {
              de.field_K = true;
              return;
            }
          } else {
            if (!param0) {
              de.field_K = true;
              return;
            } else {
              field_l = null;
              de.field_K = true;
              return;
            }
          }
        }
    }

    kh(nk param0, nk param1) {
        super(param0);
        ((kh) this).field_k = "";
        ((kh) this).field_j = false;
        ((kh) this).field_m = new qf(param0, param1);
    }

    final static gn a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            sk var6 = null;
            IOException var6_ref = null;
            sk var7 = null;
            rb var8 = null;
            Object stackIn_4_0 = null;
            gn stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_3_0 = null;
            gn stackOut_15_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = null;
                            if (null == kl.field_v.field_u) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            td.field_g = new ud(kl.field_v.field_u, 5200, 0);
                            kl.field_v.field_u = null;
                            var6 = new sk(255, td.field_g, new ud(kl.field_v.field_h, 12000, 0), 2097152);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7 = null;
                            if (param4 == 10600) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = null;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (gn) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            if (null != td.field_g) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (vb.field_a == null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            vb.field_a = new ud[kl.field_v.field_g.length];
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (vb.field_a[param0] != null) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            vb.field_a[param0] = new ud(kl.field_v.field_g[param0], 12000, 0);
                            kl.field_v.field_g[param0] = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var7 = new sk(param0, td.field_g, vb.field_a[param0], 2097152);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var8 = ra.field_Z.a(param0, param3, 113, var6, var7);
                            if (!param1) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var8.b((byte) -45);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = new gn((ff) (Object) var8, param2, param5);
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        var6_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var6_ref.toString());
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 0) {
            kh.b(true);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final String a(String param0, boolean param1) {
        if (((kh) this).field_m.a(param0, (byte) 84) == g.field_k) {
          return ((kh) this).field_m.a(param0, param1);
        } else {
          if (param1) {
            if (((kh) this).a(param0, (byte) 54) == g.field_k) {
              return gl.field_c;
            } else {
              return pk.field_J;
            }
          } else {
            field_i = null;
            if (((kh) this).a(param0, (byte) 54) == g.field_k) {
              return gl.field_c;
            } else {
              return pk.field_J;
            }
          }
        }
    }

    final static void a(boolean param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (!param0) {
                L0: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref == null) {
                    break L0;
                  } else {
                    try {
                      var2_ref = Runtime.getRuntime();
                      var4 = null;
                      var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                      d.field_g = 1 + (int)(var3.longValue() / 1048576L);
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return;
                    }
                    break L0;
                  }
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fd a(String param0, byte param1) {
        lc var3 = null;
        Object var4 = null;
        fd stackIn_9_0 = null;
        fd stackIn_15_0 = null;
        fd stackIn_22_0 = null;
        fd stackIn_28_0 = null;
        fd stackOut_21_0 = null;
        fd stackOut_20_0 = null;
        fd stackOut_27_0 = null;
        fd stackOut_26_0 = null;
        fd stackOut_8_0 = null;
        fd stackOut_7_0 = null;
        fd stackOut_14_0 = null;
        fd stackOut_13_0 = null;
        if (((kh) this).field_m.a(param0, (byte) 65) != g.field_k) {
          if (param1 > 52) {
            if (!param0.equals((Object) (Object) ((kh) this).field_k)) {
              var3 = we.a((byte) -85, param0);
              if (!var3.a(250)) {
                return um.field_a;
              } else {
                L0: {
                  ((kh) this).field_k = param0;
                  ((kh) this).field_j = var3.a((byte) -34);
                  if (!((kh) this).field_j) {
                    stackOut_21_0 = g.field_k;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = tg.field_d;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                return stackIn_22_0;
              }
            } else {
              L1: {
                if (!((kh) this).field_j) {
                  stackOut_27_0 = g.field_k;
                  stackIn_28_0 = stackOut_27_0;
                  break L1;
                } else {
                  stackOut_26_0 = tg.field_d;
                  stackIn_28_0 = stackOut_26_0;
                  break L1;
                }
              }
              return stackIn_28_0;
            }
          } else {
            var4 = null;
            fd discarded$1 = ((kh) this).a((String) null, (byte) -84);
            if (!param0.equals((Object) (Object) ((kh) this).field_k)) {
              var3 = we.a((byte) -85, param0);
              if (!var3.a(250)) {
                return um.field_a;
              } else {
                L2: {
                  ((kh) this).field_k = param0;
                  ((kh) this).field_j = var3.a((byte) -34);
                  if (!((kh) this).field_j) {
                    stackOut_8_0 = g.field_k;
                    stackIn_9_0 = stackOut_8_0;
                    break L2;
                  } else {
                    stackOut_7_0 = tg.field_d;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  }
                }
                return stackIn_9_0;
              }
            } else {
              L3: {
                if (!((kh) this).field_j) {
                  stackOut_14_0 = g.field_k;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = tg.field_d;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              return stackIn_15_0;
            }
          }
        } else {
          return g.field_k;
        }
    }

    static {
    }
}
