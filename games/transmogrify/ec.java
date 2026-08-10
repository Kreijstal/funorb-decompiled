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
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            kc.field_g = param0;
            var2 = (od) ((Object) lb.field_f.a((byte) -95));
            L1: while (true) {
              if (var2 == null) {
                L2: {
                  if (param1 == 9956) {
                    break L2;
                  } else {
                    ec.a(true, true, 47);
                    break L2;
                  }
                }
                L3: {
                  if (null == nc.field_q) {
                    break L3;
                  } else {
                    var2 = (od) ((Object) nc.field_q.a((byte) -95));
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        L5: {
                          if (var2.field_i.b(8)) {
                            var2.field_j.i(128 + var2.field_k * kc.field_g >> -690821016);
                            break L5;
                          } else {
                            var2.c(5);
                            break L5;
                          }
                        }
                        var2 = (od) ((Object) nc.field_q.a(true));
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L6: {
                  if (!var2.field_i.b(param1 + -9948)) {
                    var2.c(param1 + -9951);
                    break L6;
                  } else {
                    var2.field_j.i(128 + var2.field_k * kc.field_g >> 595263304);
                    break L6;
                  }
                }
                var2 = (od) ((Object) lb.field_f.a(true));
                continue L1;
              }
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
        int var3;
        if (param0) {
          sb.c(0, 0, sb.field_c, sb.field_g, 0, 192);
          kh.a(-75, param0);
          var3 = 119 % ((-73 - param2) / 42);
          return;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new hb(param3.field_h, -param2 + param0);
            ji.a(param3.field_l, param2, var4.field_l, param1, var4.field_l.length);
            stackIn_1_0 = (hb) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ec.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static ci a(boolean param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 != 77) {
          ec.a(true, (byte) 79, -120, 125, true);
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
