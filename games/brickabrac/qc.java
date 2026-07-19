/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qc extends nm {
    static jp[] field_l;
    static vl field_n;
    static volatile boolean field_i;
    static int field_o;
    int field_j;
    static mf field_k;
    int field_m;

    final static oh a(String param0, int param1) {
        RuntimeException var2 = null;
        oh stackIn_5_0 = null;
        oh stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        oh stackOut_4_0 = null;
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
            if (ka.field_l != jm.field_f) {
              if (param1 == 0) {
                L1: {
                  if (up.field_v != ka.field_l) {
                    break L1;
                  } else {
                    if (!param0.equals(om.field_pc)) {
                      break L1;
                    } else {
                      ka.field_l = ej.field_P;
                      stackOut_8_0 = he.field_H;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                he.field_H = null;
                ka.field_l = jm.field_f;
                om.field_pc = param0;
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (oh) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("qc.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return (oh) ((Object) stackIn_11_0);
          }
        }
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 0) {
            return;
        }
        field_l = null;
        field_k = null;
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            IOException var2 = null;
            int var3 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var3 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != vd.field_f) {
                    vd.field_f.b((byte) 30);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (on.field_x != null) {
                    on.field_x.a((byte) 68);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param0 == 14676) {
                  L3: {
                    if (oc.field_k == null) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          oc.field_k.a(false);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      break L3;
                    }
                  }
                  L6: {
                    if (null != v.field_g) {
                      var1_int = 0;
                      L7: while (true) {
                        if (var1_int >= v.field_g.length) {
                          break L6;
                        } else {
                          if (null != v.field_g[var1_int]) {
                            try {
                              L8: {
                                v.field_g[var1_int].a(false);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var2 = (IOException) (Object) decompiledCaughtException;
                                break L9;
                              }
                            }
                            var1_int++;
                            continue L7;
                          } else {
                            var1_int++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw qb.a((Throwable) ((Object) var1), "qc.E(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(int param0) {
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (m.a(param0 ^ 27146)) {
              discarded$17 = wo.field_b.a(rj.field_b, fh.field_g, param0 + -27268, true);
              if (param0 == 27144) {
                wo.field_b.i(82);
                L1: while (true) {
                  if (!jl.a((byte) 5)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    discarded$18 = wo.field_b.a(go.field_b, dc.field_b, true);
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L2: {
                if (null == ua.field_d) {
                  break L2;
                } else {
                  if (!ua.field_d.field_e) {
                    break L2;
                  } else {
                    nc.b(109);
                    wo.field_b.a(-80, new ek(wo.field_b, ch.field_a));
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "qc.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    qc(int param0) {
        this(param0, -1);
    }

    final static String a(long param0, byte param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = BrickABrac.field_J ? 1 : 0;
        if (0L >= param0) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (0L == param0 % 37L) {
            return null;
        }
        int var3 = 0;
        if (param1 != 3) {
            qc.c(21);
        }
        long var4 = param0;
        while ((var4 ^ -1L) != -1L) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while ((param0 ^ -1L) != -1L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = af.field_B[(int)(var7 + -(37L * param0))];
            if (!(var9 != 95)) {
                var10 = var6.length() - 1;
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    qc(int param0, int param1) {
        this.field_j = param1;
        this.field_m = param0;
    }

    static {
        field_i = true;
        field_n = new vl();
    }
}
