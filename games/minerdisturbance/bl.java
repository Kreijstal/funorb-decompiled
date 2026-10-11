/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class bl extends al {
    static String field_u;
    int field_y;
    static ea field_x;
    static ea field_w;
    static int[] field_z;
    static ud[] field_v;

    final static void a(boolean param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = MinerDisturbance.field_ab;
          try {
            if (aj.field_c != null) {
              aj.field_c.b((byte) 35);
            }
            if (uf.field_r != null) {
              uf.field_r.a((byte) -32);
            }
            if (null != fe.field_z) {
              try {
                fe.field_z.b(-30821);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (aa.field_h != null) {
              for (var1_int = 0; aa.field_h.length > var1_int; var1_int++) {
                if (aa.field_h[var1_int] != null) {
                  try {
                    aa.field_h[var1_int].b(-30821);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
            }
            if (!param0) {
              bl.b((byte) 56);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw lj.a((Throwable) ((Object) var1_ref), "bl.J(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean h(int param0);

    abstract Object f(int param0);

    final static boolean g(int param0) {
        if (mf.field_i < param0) {
          if (bd.field_k < 0) {
            return false;
          }
          if (qd.field_O[99]) {
            return false;
          }
          if (2 == rj.field_f) {
            return false;
          }
          if (!qe.field_b[4]) {
            return false;
          }
          if (sk.field_d < -30 &&
            mh.field_e[ca.field_k - 1][hf.field_t].g()) {
            if (di.field_K == -1) {
              return true;
            }
            if (sk.field_d <= 30) {
              return false;
            }
            if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
              return false;
            }
            if (di.field_K == 1) {
              return true;
            }
            return false;
          }
          if (sk.field_d <= 30) {
            return false;
          }
          if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
            return false;
          }
          if (di.field_K != 1) {
            return false;
          }
          return true;
        }
        if (bd.field_k >= 0) {
          if (mh.field_e[ca.field_k][hf.field_t + 1].g()) {
            return true;
          }
          if (-80 > sk.field_d &&
            mh.field_e[ca.field_k - 1][hf.field_t + 1].g()) {
            return true;
          }
          if (sk.field_d > 80 &&
            mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
            return true;
          }
          if (bd.field_k >= 0 &&
            !qd.field_O[99] &&
            2 != rj.field_f &&
            qe.field_b[4]) {
            if (sk.field_d < -30 &&
              mh.field_e[ca.field_k - 1][hf.field_t].g()) {
              if (di.field_K == -1) {
                return true;
              }
              if (sk.field_d > 30 &&
                mh.field_e[ca.field_k + 1][hf.field_t].g() &&
                di.field_K == 1) {
                return true;
              }
              return false;
            }
            if (sk.field_d > 30 &&
              mh.field_e[ca.field_k + 1][hf.field_t].g() &&
              di.field_K == 1) {
              return true;
            }
          }
          return false;
        }
        if (bd.field_k < 0) {
          return false;
        }
        if (qd.field_O[99]) {
          return false;
        }
        if (2 == rj.field_f) {
          return false;
        }
        if (!qe.field_b[4]) {
          return false;
        }
        if (sk.field_d >= -30) {
          if (sk.field_d <= 30) {
            return false;
          }
          if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
            return false;
          }
          if (di.field_K != 1) {
            return false;
          }
          return true;
        }
        if (!mh.field_e[ca.field_k - 1][hf.field_t].g()) {
          if (sk.field_d <= 30) {
            return false;
          }
          if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
            return false;
          }
          if (di.field_K != 1) {
            return false;
          }
          return true;
        }
        if (di.field_K == -1) {
          return true;
        }
        if (sk.field_d <= 30) {
          return false;
        }
        if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
          return false;
        }
        if (di.field_K == 1) {
          return true;
        }
        return false;
    }

    final static ea a(int param0, bj param1, byte param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -121 / ((-15 - param2) / 55);
          if (cn.a(param0, 258, param3, param1)) {
            stackIn_4_0 = qc.c(255);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (ea) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("bl.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = 35 % ((24 - param0) / 34);
        field_w = null;
        field_z = null;
        field_u = null;
        field_v = null;
        field_x = null;
    }

    bl(int param0) {
        this.field_y = param0;
    }

    static {
        field_u = "<%0> <times> 2,500 = <%1>";
        field_z = new int[8192];
    }
}
