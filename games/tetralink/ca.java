/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class ca {
    int field_e;
    static Random field_i;
    String field_a;
    static String field_h;
    static String field_b;
    static int field_c;
    static int[] field_f;
    static long field_g;
    static String field_d;

    final static boolean c(int param0) {
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -25945) {
            field_b = (String) null;
          }
          stackIn_8_0 = (fn.field_R >= 10) && (!bh.field_r) && (!r.d(0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "ca.L(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        field_i = null;
        field_b = null;
        field_h = null;
        field_d = null;
        if (param0 != 0) {
          return;
        }
        try {
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ca.J(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        try {
          var1_int = nn.f((byte) -102);
          var2 = ed.h(32768);
          nm.field_o.a(ab.field_Q - fl.field_b, ja.field_j - ng.field_D, (byte) -21, (ng.field_D << 1) + var1_int, var2 + (fl.field_b << 1));
          if (param0 >= -2) {
            ca.a(false, (byte) 121);
          }
          na.c(true);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ca.G(" + param0 + ')');
        }
    }

    final static void a(float param0, float param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (cl.field_g == 2) {
            return;
          }
          rn.field_d = rn.field_d + param0;
          if (cl.field_g == 1) {
            cl.field_g = 0;
          }
          if (rn.field_d < 64.0f) {
            rn.field_d = 64.0f;
          }
          if (rn.field_d > 440.0f) {
            rn.field_d = 440.0f;
          }
          dj.field_h = dj.field_h + param1;
          ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
          ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
          eo.a(param2 ^ 2505);
          ah.field_a = dh.field_e;
          if (param2 == -2452) {
            return;
          }
          field_i = (Random) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "ca.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        RuntimeException var2 = null;
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_5_0 = new java.net.Socket(this.field_a, this.field_e);
            return stackIn_5_0;
          }
          stackIn_2_0 = (java.net.Socket) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ca.K(" + param0 + ')');
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TetraLink.field_J;
        try {
          if (param0 ||
            qb.field_N == null) {
            lg.field_S = false;
          }
          if (param0) {
            if (0 >= qd.field_ab) {
              if (ng.field_t <= 0) {
                if (am.field_f > 0) {
                  am.field_f = am.field_f - 1;
                }
              } else {
                ng.field_t = ng.field_t - 1;
              }
            } else {
              qd.field_ab = qd.field_ab - 1;
            }
          } else {
            if (qb.field_N == null) {
              if (qe.field_a != null) {
                if (qd.field_ab <= 0) {
                  if (am.field_f <= 0) {
                    if (ma.field_f > ng.field_t) {
                      if (ng.field_t == 0) {
                        ic.a(true, (byte) -128);
                      }
                      ng.field_t = ng.field_t + 1;
                    }
                  } else {
                    am.field_f = am.field_f - 1;
                  }
                } else {
                  qd.field_ab = qd.field_ab - 1;
                }
              } else {
                lg.field_S = false;
                if (ng.field_t > 0) {
                  ng.field_t = ng.field_t - 1;
                } else {
                  if (am.field_f > 0) {
                    am.field_f = am.field_f - 1;
                  } else {
                    if (qd.field_ab < ma.field_f) {
                      if (0 == qd.field_ab) {
                        pd.b(false);
                      }
                      qd.field_ab = qd.field_ab + 1;
                    }
                  }
                }
              }
            } else {
              if (qd.field_ab > 0) {
                qd.field_ab = qd.field_ab - 1;
              } else {
                if (ng.field_t <= 0) {
                  if (am.field_f < ma.field_f) {
                    if (am.field_f == 0) {
                      ic.a(false, (byte) -128);
                    }
                    am.field_f = am.field_f + 1;
                  }
                } else {
                  ng.field_t = ng.field_t - 1;
                }
              }
            }
          }
          if (param1 == 16) {
            return;
          }
          ca.b(-74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ca.I(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_i = new Random();
        field_h = "Shortcut Reference";
        field_b = "Decline invitation to <%0>'s game";
        field_f = new int[4];
        field_d = "(1 player wants to join)";
    }
}
