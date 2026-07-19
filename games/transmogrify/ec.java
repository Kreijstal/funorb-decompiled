/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ec {
    static rc field_d;
    int field_e;
    static qj field_b;
    static int[] field_c;
    String field_a;

    final static void a(int param0, int param1) {
        od var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_9_0 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            kc.field_g = param0;
            var2 = (od) ((Object) lb.field_f.a((byte) -95));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2.field_i.b(param1 + -9948);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (!stackIn_4_0) {
                            break L5;
                          } else {
                            var2.field_j.i(128 + var2.field_k * kc.field_g >> 595263304);
                            if (var3 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var2.c(param1 + -9951);
                        break L4;
                      }
                      var2 = (od) ((Object) lb.field_f.a(true));
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = param1;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L6: {
                if (stackIn_10_0 == 9956) {
                  break L6;
                } else {
                  ec.a(true, true, 47);
                  break L6;
                }
              }
              L7: {
                if (null == nc.field_q) {
                  break L7;
                } else {
                  var2 = (od) ((Object) nc.field_q.a((byte) -95));
                  L8: while (true) {
                    if (var2 == null) {
                      break L7;
                    } else {
                      if (var3 == 0) {
                        L9: {
                          L10: {
                            if (var2.field_i.b(8)) {
                              break L10;
                            } else {
                              var2.c(5);
                              if (var3 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var2.field_j.i(128 + var2.field_k * kc.field_g >> -690821016);
                          break L9;
                        }
                        var2 = (od) ((Object) nc.field_q.a(true));
                        continue L8;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "ec.M(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 0) {
            field_c = (int[]) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = 0;
        if (param0) {
          sb.c(0, 0, sb.field_c, sb.field_g, 0, 192);
          if (!Transmogrify.field_A) {
            kh.a(-75, param0);
            var3 = 119 % ((-73 - param2) / 42);
            return;
          } else {
            sb.c();
            kh.a(-75, param0);
            var3 = 119 % ((-73 - param2) / 42);
            return;
          }
        } else {
          sb.c();
          kh.a(-75, param0);
          var3 = 119 % ((-73 - param2) / 42);
          return;
        }
    }

    final static hb a(int param0, int param1, int param2, hb param3) {
        hb var4 = null;
        RuntimeException var4_ref = null;
        hb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new hb(param3.field_h, -param2 + param0);
            ji.a(param3.field_l, param2, var4.field_l, param1, var4.field_l.length);
            stackOut_0_0 = (hb) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("ec.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static ci a(boolean param0, byte param1, int param2, int param3, boolean param4) {
        ci discarded$2 = null;
        if (param1 != 77) {
          discarded$2 = ec.a(true, (byte) 79, -120, 125, true);
          return mh.a(-26159, param4, param0, false, param2, param3);
        } else {
          return mh.a(-26159, param4, param0, false, param2, param3);
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
            if (!(null == wg.field_d)) {
                wg.field_d.r(77);
            }
            ok.field_a = new ff(param0, param2, false, true, true);
            int var3_int = -114 / ((57 - param1) / 56);
            l.field_d.b(-88, ok.field_a);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ec.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != -9008) {
          field_c = (int[]) null;
          return new java.net.Socket(this.field_a, this.field_e);
        } else {
          return new java.net.Socket(this.field_a, this.field_e);
        }
    }

    static {
        field_d = new rc();
        field_c = new int[8192];
        field_b = new qj();
    }
}
