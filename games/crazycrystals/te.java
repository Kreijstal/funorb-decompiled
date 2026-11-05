/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class te {
    static un field_a;

    final static boolean a(byte param0, boolean param1) {
        try {
          boolean decompiledRegionSelector0 = false;
          Throwable decompiledCaughtException = null;
          try {
            if (vj.field_b == null) {
              vj.field_b = gf.field_b.a(fe.field_j, false, df.field_a);
            }
            if (vj.field_b.field_a == 0) {
              return false;
            }
            if (param0 != -19) {
              field_a = (un) null;
            }
            long dupTemp$1 = lo.a((byte) -29);
            mp.field_p = dupTemp$1;
            wg.field_y = dupTemp$1;
            if (vj.field_b.field_a == 1) {
              try {
                oi.field_c = new j((java.net.Socket) (vj.field_b.field_b), gf.field_b);
                tp.field_f.field_f = 0;
                md var2 = kd.field_n;
                var2.field_f = 0;
                int stackIn_14_0 = (!param1) ? -1 : -2;
                fl.field_m = stackIn_14_0;
                ea.field_n = stackIn_14_0;
                qn.field_u = stackIn_14_0;
                gj.field_k = cf.field_a;
                hn.a(mc.field_r, vn.field_f, 12, (ng) ((Object) tp.field_f), kl.field_T);
                ak.a(-1, (byte) -48);
                decompiledRegionSelector0 = false;
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                IOException iOException = (IOException) (Object) decompiledCaughtException;
                gj.field_k = tp.field_c;
                decompiledRegionSelector0 = !(CrazyCrystals.field_B == 0);
              }
              if (decompiledRegionSelector0) {
                gj.field_k = tp.field_c;
              }
            } else {
              gj.field_k = tp.field_c;
            }
            vj.field_b = null;
            return true;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw dn.a((Throwable) ((Object) var2_ref), "te.D(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void b(int param0);

    abstract te b(byte param0);

    te() {
        try {
          um.a(0, (String) null, (byte) 120);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "te.<init>()");
        }
    }

    void a(int param0) {
        try {
          if (param0 != -1) {
            field_a = (un) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "te.B(" + param0 + ')');
        }
    }

    final static void a(bh param0, int param1, String param2, byte param3, vc param4) {
        String stackIn_30_2 = null;
        String stackIn_34_2 = null;
        String stackIn_38_2 = null;
        int var9 = CrazyCrystals.field_B;
        try {
          int var5_int = 0;
          int var6 = -1;
          if (param3 != -95) {
            te.a((byte) -90);
          }
          int var7 = 1;
          while (var7 < param2.length()) {
            int var8 = param2.charAt(var7);
            if (var9 != 0) {
              return;
            }
            if (var8 == 60) {
              var6 = (var5_int >> 8) - (-param0.field_e[0] - param4.a(param2.substring(0, var7)));
            }
            if (-1 != var6) {
              param0.field_e[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param0.field_e[var7] = (var5_int >> 8) - (-param0.field_e[0] - param4.a(param2.substring(0, var7 + 1))) - param4.a((char) var8);
            }
            if (var8 == 62) {
              var6 = -1;
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var5 = decompiledCaughtParameter0;
          RuntimeException stackIn_29_0 = var5;
          StringBuilder stackIn_29_1 = new StringBuilder().append("te.F(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          StringBuilder stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          StringBuilder stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        try {
          int var1_int = 127 % ((param0 - 26) / 59);
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ')');
        }
    }

    static {
    }
}
