/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class kh extends gd {
    private String field_k;
    private boolean field_j;
    static String field_i;
    static hj field_l;
    private qf field_m;

    final static void b(boolean param0) {
        if (bk.field_w == 10) {
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
        try {
            ((kh) this).field_m = new qf(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static gn a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            rb var8 = null;
            Object stackIn_4_0 = null;
            gn stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            gn stackOut_15_0 = null;
            Object stackOut_3_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null == kl.field_v.field_u) {
                    break L1;
                  } else {
                    td.field_g = new ud(kl.field_v.field_u, 5200, 0);
                    kl.field_v.field_u = null;
                    var6 = (Object) (Object) new sk(255, td.field_g, new ud(kl.field_v.field_h, 12000, 0), 2097152);
                    break L1;
                  }
                }
                var7 = null;
                if (param4 == 10600) {
                  L2: {
                    if (null != td.field_g) {
                      L3: {
                        if (vb.field_a == null) {
                          vb.field_a = new ud[kl.field_v.field_g.length];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (vb.field_a[param0] != null) {
                          break L4;
                        } else {
                          vb.field_a[param0] = new ud(kl.field_v.field_g[param0], 12000, 0);
                          kl.field_v.field_g[param0] = null;
                          break L4;
                        }
                      }
                      var7 = (Object) (Object) new sk(param0, td.field_g, vb.field_a[param0], 2097152);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    var8 = ra.field_Z.a(param0, param3, 113, (sk) var6, (sk) var7);
                    if (!param1) {
                      break L5;
                    } else {
                      var8.b((byte) -45);
                      break L5;
                    }
                  }
                  stackOut_15_0 = new gn((ff) (Object) var8, param2, param5);
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_3_0 = null;
                  stackIn_4_0 = stackOut_3_0;
                  return (gn) (Object) stackIn_4_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_16_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_l = null;
        field_i = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((kh) this).field_m.a(param0, (byte) 84) == g.field_k) {
              stackOut_2_0 = ((kh) this).field_m.a(param0, param1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_i = null;
                  break L1;
                }
              }
              if (((kh) this).a(param0, (byte) 54) != g.field_k) {
                stackOut_9_0 = pk.field_J;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = gl.field_c;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("kh.L(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final static void a(boolean param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                        d.field_g = 1 + (int)(var3.longValue() / 1048576L);
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fd a(String param0, byte param1) {
        lc var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        fd stackIn_2_0 = null;
        fd stackIn_9_0 = null;
        fd stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_8_0 = null;
        fd stackOut_13_0 = null;
        fd stackOut_12_0 = null;
        fd stackOut_1_0 = null;
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
            if (((kh) this).field_m.a(param0, (byte) 65) != g.field_k) {
              L1: {
                if (param1 > 52) {
                  break L1;
                } else {
                  var4 = null;
                  fd discarded$2 = ((kh) this).a((String) null, (byte) -84);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals((Object) (Object) ((kh) this).field_k)) {
                  var3 = we.a((byte) -85, param0);
                  if (var3.a(250)) {
                    ((kh) this).field_k = param0;
                    ((kh) this).field_j = var3.a((byte) -34);
                    break L2;
                  } else {
                    stackOut_8_0 = um.field_a;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!((kh) this).field_j) {
                  stackOut_13_0 = g.field_k;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = tg.field_d;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = g.field_k;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("kh.N(");
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
          throw kk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    static {
    }
}
