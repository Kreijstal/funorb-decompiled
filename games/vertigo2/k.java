/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class k {
    private java.util.zip.Inflater field_a;
    static String field_d;
    static er field_c;
    static String field_b;

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        bs var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              sj.field_d = null;
              gd.field_j = null;
              qn.field_q = false;
              if (mk.field_J != null) {
                mk.field_J.c(0);
                mk.field_J = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              kd.field_l = null;
              if (null != nr.field_p) {
                nr.field_p.c(0);
                nr.field_p = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              lh.field_b = null;
              if (null == kq.field_Rb) {
                break L3;
              } else {
                kq.field_Rb.c(0);
                kq.field_Rb = null;
                break L3;
              }
            }
            ck.field_I = null;
            if (null != kd.field_l) {
              var3 = (bs) (Object) kd.field_l.b(29);
              L4: while (true) {
                if (var3 == null) {
                  kd.field_l = null;
                  break L0;
                } else {
                  var3.a(-123);
                  var3 = (bs) (Object) kd.field_l.a((byte) -60);
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "k.B(" + false + ')');
        }
    }

    public k() {
        this(-1, 1000000, 1000000);
    }

    public static void b() {
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static ve[] a() {
        return new ve[]{g.field_f, dk.field_o, gi.field_t, ti.field_b, f.field_H, kk.field_e, br.field_Y, bd.field_e, bj.field_g, tg.field_c, bp.field_y, kq.field_Lb, rp.field_f, nb.field_B};
    }

    final void a(ed param0, byte param1, byte[] param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  if (param0.field_p[param0.field_u] != 31) {
                    break L1;
                  } else {
                    if (param0.field_p[param0.field_u + 1] == -117) {
                      L2: {
                        if (((k) this).field_a != null) {
                          break L2;
                        } else {
                          ((k) this).field_a = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          if (param1 == 88) {
                            ((k) this).field_a.setInput(param0.field_p, 10 + param0.field_u, -8 + (-10 + -param0.field_u + param0.field_p.length));
                            int discarded$2 = ((k) this).field_a.inflate(param2);
                            break L3;
                          } else {
                            return;
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var4 = (Exception) (Object) decompiledCaughtException;
                        ((k) this).field_a.reset();
                        throw new RuntimeException("");
                      }
                      ((k) this).field_a.reset();
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var4_ref;
                stackOut_13_1 = new StringBuilder().append("k.A(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              L5: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L5;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L5;
                }
              }
              throw wn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private k(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has withdrawn the request to join.";
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
