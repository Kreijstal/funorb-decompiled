/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kf extends qb {
    long field_g;
    int field_h;
    byte[] field_i;
    static String field_j;

    final static int a(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_24_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_33_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          pb var2 = null;
          if (dg.field_H.field_b >= 4) {
            if (dg.field_H.field_l == -1) {
              return 3;
            }
            if (-2 == dg.field_H.field_l) {
              return 4;
            }
            return 1;
          }
          try {
            if (ed.field_c == 0) {
              d.field_a = bi.field_b.a(al.field_c, (byte) -122, ak.field_O);
              ed.field_c = ed.field_c + 1;
            }
            if (param0 <= 58) {
              kf.b((byte) 115);
            }
            if (ed.field_c == 1) {
              if (d.field_a.field_a == 2) {
                stackIn_14_0 = ma.a(2, -1);
                return stackIn_14_0;
              }
              if (1 == d.field_a.field_a) {
                ed.field_c = ed.field_c + 1;
              }
            }
            if (2 == ed.field_c) {
              tf.field_r = new jd((java.net.Socket) (d.field_a.field_e), bi.field_b);
              var2 = new pb(13);
              nf.a(var2, false, cc.field_c, eh.field_l, pf.field_h);
              var2.b(-9469, 15);
              var2.a(-246, oj.field_d);
              tf.field_r.a(0, (byte) -89, 13, var2.field_g);
              ed.field_c = ed.field_c + 1;
              lc.field_b = id.a(70) + 30000L;
            }
            if (ed.field_c == 3) {
              if (tf.field_r.b(-108) <= 0) {
                if (id.a(120) > lc.field_b) {
                  stackIn_29_0 = ma.a(2, -2);
                  return stackIn_29_0;
                }
              } else {
                var1_int = tf.field_r.a(0);
                if (var1_int != 0) {
                  stackIn_24_0 = ma.a(2, var1_int);
                  return stackIn_24_0;
                }
                ed.field_c = ed.field_c + 1;
              }
            }
            if (4 != ed.field_c) {
              return -1;
            }
            dg.field_H.a(tf.field_r, ii.field_d, false);
            d.field_a = null;
            tf.field_r = null;
            ed.field_c = 0;
            stackIn_33_0 = 0;
            return stackIn_33_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ma.a(2, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != wc.field_B) {
          var1 = wc.field_B;
          synchronized (var1) {
            wc.field_B = null;
          }
        }
        if (param0 != 0) {
          field_j = (String) null;
        }
    }

    final static ic a(qk param0, int param1, int param2, int param3, qk param4) {
        RuntimeException var5 = null;
        ic stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ic stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (ic) null;
            return stackIn_2_0;
          }
          if (tc.a(param2, param3, 25479, param0)) {
            stackIn_7_0 = pa.a(param4.a(param2, (byte) -115, param3), -1);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (ic) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("kf.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 <= 104) {
          field_j = (String) null;
        }
    }

    kf(long param0, int param1, byte[] param2) {
        try {
          this.field_h = param1;
          this.field_i = param2;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "kf.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Waiting for graphics";
    }
}
