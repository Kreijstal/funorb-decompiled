/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_a;
    static boolean field_b;
    static String field_c;

    final static fb a(String param0, boolean param1) {
        String var2 = null;
        fb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        fb stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Bounce.field_N;
        try {
          if (lf.field_q == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = ce.a(var6, 0);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (fb) (stackIn_10_0);
          }
          var3 = (fb) (lf.field_q.a((long)var2.hashCode(), 0));
          if (!param1) {
            field_b = false;
          }
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = ce.a(var7, 0);
            if (var4.equals(var2)) {
              stackIn_18_0 = var3;
              return stackIn_18_0;
            }
            var3 = (fb) (lf.field_q.b(0));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("hf.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int b(boolean param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          wi var2 = null;
          if (4 <= tb.field_p.field_l) {
            if (-1 == tb.field_p.field_d) {
              return 3;
            }
            if (tb.field_p.field_d != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (ih.field_X == 0) {
              md.field_q = vc.field_G.a(bd.field_l, a.field_a, 0);
              ih.field_X = ih.field_X + 1;
            }
            if (ih.field_X == 1) {
              if (md.field_q.field_f == 2) {
                stackIn_14_0 = qg.a(-23888, -1);
                return stackIn_14_0;
              }
              if (md.field_q.field_f == 1) {
                ih.field_X = ih.field_X + 1;
              }
            }
            if (!param0) {
              hf.a(true);
            }
            if (ih.field_X == 2) {
              mf.field_a = new pc((java.net.Socket) (md.field_q.field_e), vc.field_G);
              var2 = new wi(13);
              fj.a(pe.field_c, 6, mf.field_e, var2, fi.field_c);
              var2.a(15, (byte) 98);
              var2.b(uj.field_s, (byte) 40);
              mf.field_a.a(13, var2.field_i, 0, 0);
              ih.field_X = ih.field_X + 1;
              kk.field_B = 30000L + fa.a(76);
            }
            if (ih.field_X == 3) {
              if (mf.field_a.d(0) <= 0) {
                if (kk.field_B < fa.a(125)) {
                  stackIn_31_0 = qg.a(-23888, -2);
                  return stackIn_31_0;
                }
              } else {
                var1_int = mf.field_a.b(0);
                if (var1_int != 0) {
                  stackIn_27_0 = qg.a(-23888, var1_int);
                  return stackIn_27_0;
                }
                ih.field_X = ih.field_X + 1;
              }
            }
            if (ih.field_X != 4) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            tb.field_p.a((byte) -114, mf.field_a, ke.field_p);
            ih.field_X = 0;
            md.field_q = null;
            mf.field_a = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return qg.a(-23888, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        pf stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Bounce.field_N;
        try {
          stackIn_3_0 = q.field_N;
          stackIn_3_1 = dk.field_c;
          stackIn_4_2 = !(param0);
          ((pf) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2, true, ee.field_b);
          q.field_N.d((byte) 111);
          while (q.g((byte) -15)) {
            q.field_N.a((byte) -109, lh.field_f, gk.field_d);
          }
          if (m.field_g != -1) {
            var1_int = m.field_g;
            oh.a(-101, -1);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (param0) {
            stackIn_12_0 = 81;
            return stackIn_12_0;
          }
          if (ng.field_b) {
            stackIn_15_0 = 3;
            return stackIn_15_0;
          }
          if (qg.field_g == vc.field_F) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (!pb.field_k.a(1000)) {
            stackIn_21_0 = 1;
            return stackIn_21_0;
          }
          if (qg.field_g != fh.field_B) {
            return -1;
          }
          stackIn_25_0 = 2;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "hf.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = 111 % ((17 - param0) / 40);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        field_b = true;
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = "Press ESCAPE to quit";
    }
}
