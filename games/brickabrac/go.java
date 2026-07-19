/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class go {
    static char field_b;
    static String field_f;
    static int field_c;
    static int field_e;
    static jp field_d;
    static jg field_a;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 != -7393) {
            field_b = '￾';
        }
    }

    final static String a(byte param0) {
        int var1 = -46 % ((53 - param0) / 63);
        return jl.field_e.d(-1);
    }

    final static mf a(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            jq var8 = null;
            mf stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            mf stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (ec.field_P.field_q == null) {
                    break L1;
                  } else {
                    oc.field_k = new jg(ec.field_P.field_q, 5200, 0);
                    ec.field_P.field_q = null;
                    var6 = new ve(255, oc.field_k, new jg(ec.field_P.field_m, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  if (oc.field_k == null) {
                    break L2;
                  } else {
                    L3: {
                      if (v.field_g != null) {
                        break L3;
                      } else {
                        v.field_g = new jg[ec.field_P.field_s.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (v.field_g[param1] != null) {
                        break L4;
                      } else {
                        v.field_g[param1] = new jg(ec.field_P.field_s[param1], 12000, 0);
                        ec.field_P.field_s[param1] = null;
                        break L4;
                      }
                    }
                    var7 = new ve(param1, oc.field_k, v.field_g[param1], 2097152);
                    break L2;
                  }
                }
                L5: {
                  if (param5) {
                    break L5;
                  } else {
                    go.a(78);
                    break L5;
                  }
                }
                L6: {
                  var8 = dp.field_v.a(81, param2, (ve) (var6), param1, (ve) (var7));
                  if (param0) {
                    var8.f(-10476);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_13_0 = new mf(var8, param4, param3);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_14_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = 0;
        field_f = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
