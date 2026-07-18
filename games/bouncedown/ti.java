/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class ti extends ba implements wc {
    static int field_O;
    private uh field_N;
    private int field_M;

    final String d(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          if (((ti) this).field_g) {
            if (null == ((ti) this).field_q) {
              return null;
            } else {
              ll.a(uc.field_C - (((ti) this).field_M + -((ti) this).field_k), true, ll.field_y);
              return ((ti) this).field_q;
            }
          } else {
            return null;
          }
        } else {
          var3 = null;
          ((ti) this).a(57, 60, -66, (lk) null);
          if (((ti) this).field_g) {
            if (null == ((ti) this).field_q) {
              return null;
            } else {
              ll.a(uc.field_C - (((ti) this).field_M + -((ti) this).field_k), true, ll.field_y);
              return ((ti) this).field_q;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (param0 != -1) {
                field_O = 53;
            }
            ((ti) this).field_M = -param1 + (uc.field_C - ((ti) this).field_r);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ti.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(uh param0, boolean param1) {
        try {
            if (!param1) {
                Object var4 = null;
                ti.a((Throwable) null, (byte) 122, (String) null);
            }
            ((ti) this).field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ti.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        super.h(param0);
        if (!(null == ((ti) this).field_N)) {
            ((ti) this).field_N.d((byte) 115);
        }
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            mk var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            si stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            si stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            si stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            String stackIn_16_5 = null;
            Throwable decompiledCaughtException = null;
            si stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            si stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            si stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            String stackOut_14_5 = null;
            var6 = Bounce.field_N;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 != null) {
                    var3_ref = ae.a((byte) -114, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1 == 100) {
                  ej.a((int) param1, var3_ref);
                  var7 = ak.a(param1 + -57, ":", "%3a", var3_ref);
                  var8 = ak.a(15, "@", "%40", var7);
                  var9 = ak.a(88, "&", "%26", var8);
                  var10 = ak.a(param1 ^ 48, "#", "%23", var9);
                  if (gk.field_j != null) {
                    L4: {
                      stackOut_13_0 = jj.field_a;
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = gk.field_j.getCodeBase();
                      stackOut_13_4 = new StringBuilder().append("clienterror.ws?c=").append(nd.field_E).append("&u=");
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      if (ke.field_m != null) {
                        stackOut_15_0 = (si) (Object) stackIn_15_0;
                        stackOut_15_1 = null;
                        stackOut_15_2 = null;
                        stackOut_15_3 = (java.net.URL) (Object) stackIn_15_3;
                        stackOut_15_4 = (StringBuilder) (Object) stackIn_15_4;
                        stackOut_15_5 = ke.field_m;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
                        stackIn_16_4 = stackOut_15_4;
                        stackIn_16_5 = stackOut_15_5;
                        break L4;
                      } else {
                        stackOut_14_0 = (si) (Object) stackIn_14_0;
                        stackOut_14_1 = null;
                        stackOut_14_2 = null;
                        stackOut_14_3 = (java.net.URL) (Object) stackIn_14_3;
                        stackOut_14_4 = (StringBuilder) (Object) stackIn_14_4;
                        stackOut_14_5 = "" + al.field_h;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        stackIn_16_4 = stackOut_14_4;
                        stackIn_16_5 = stackOut_14_5;
                        break L4;
                      }
                    }
                    var4 = ((si) (Object) stackIn_16_0).a(new java.net.URL(stackIn_16_3, stackIn_16_5 + "&v1=" + si.field_r + "&v2=" + si.field_d + "&e=" + var10), false);
                    L5: while (true) {
                      if (0 != var4.field_f) {
                        if (1 == var4.field_f) {
                          var5 = (DataInputStream) var4.field_e;
                          int discarded$2 = var5.read();
                          var5.close();
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        int discarded$3 = 19406;
                        wh.a(1L);
                        continue L5;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void l() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        oh var9 = null;
        int var10 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        int stackIn_30_0 = 0;
        String stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        oh stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        String stackOut_35_0 = null;
        String stackOut_34_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        oh stackOut_46_0 = null;
        oh stackOut_45_0 = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            var1_int = jl.field_a;
            L1: {
              var2 = 0;
              if (ne.field_u != 2) {
                break L1;
              } else {
                var3_long = fa.a(-23) + -gd.field_a;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (se.field_E.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = m.field_a[var3];
                  if (var4 < 0) {
                    var5 = bc.field_a;
                    break L3;
                  } else {
                    if (var4 != cf.field_f.field_b) {
                      var5 = de.field_f;
                      break L3;
                    } else {
                      var5 = ag.field_c;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = se.field_E[var3];
                  if (ne.field_u != 2) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (t.field_r.length > eb.field_E.length) {
                          stackOut_19_0 = t.field_r.length;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = eb.field_E.length;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_20_0;
                        if (6 > var3) {
                          break L6;
                        } else {
                          if (var3 < var7 + 6) {
                            L7: {
                              if (eb.field_E.length + (var3 + -6 - var7) < 0) {
                                stackOut_25_0 = "";
                                stackIn_26_0 = stackOut_25_0;
                                break L7;
                              } else {
                                stackOut_24_0 = eb.field_E[-var7 + (var3 + -6 - -eb.field_E.length)];
                                stackIn_26_0 = stackOut_24_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (ll.field_E.length >= vb.field_k.length) {
                          stackOut_29_0 = ll.field_E.length;
                          stackIn_30_0 = stackOut_29_0;
                          break L8;
                        } else {
                          stackOut_28_0 = vb.field_k.length;
                          stackIn_30_0 = stackOut_28_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_30_0;
                      if (var3 < 7 - -var7) {
                        break L4;
                      } else {
                        if (var3 < var8 + (var7 + 7)) {
                          L9: {
                            if (var3 - 7 + -var7 < ll.field_E.length) {
                              stackOut_35_0 = ll.field_E[-7 + var3 + -var7];
                              stackIn_36_0 = stackOut_35_0;
                              break L9;
                            } else {
                              stackOut_34_0 = "";
                              stackIn_36_0 = stackOut_34_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_36_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (-2 != var4) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  if (var4 < 0) {
                    stackOut_41_0 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    break L11;
                  } else {
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L11;
                  }
                }
                L12: {
                  int discarded$1 = 1;
                  var7 = vh.a(stackIn_42_0 != 0, var6);
                  var8 = bi.field_h + -(var7 >> 1);
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + hj.field_a;
                      if (cf.field_f.field_b != var4) {
                        stackOut_46_0 = d.field_F;
                        stackIn_47_0 = stackOut_46_0;
                        break L13;
                      } else {
                        stackOut_45_0 = le.field_a;
                        stackIn_47_0 = stackOut_45_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_47_0;
                      if (var9 != null) {
                        var9.a(var1_int, -kk.field_z + var8, (kk.field_z << 1) + var7, -21907, (cl.field_m << 1) + pb.field_j);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + cl.field_m;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var4 < 0) {
                    ba.field_E.b(var6, var8, qd.field_b + var1_int, var5, -1);
                    var1_int = var1_int + k.field_D;
                    var3++;
                    break L15;
                  } else {
                    jc.field_h.b(var6, var8, ed.field_d + var1_int, var5, -1);
                    var1_int = var1_int + (cl.field_m - -hj.field_a + pb.field_j);
                    var3++;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "ti.Q(" + 6 + ')');
        }
    }

    public final uh a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((ti) this).field_N;
    }

    ti(String param0, sk param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a() {
        bc.field_a = 16741888;
        de.field_f = 16697912;
        ag.field_c = 16777215;
    }

    static {
    }
}
