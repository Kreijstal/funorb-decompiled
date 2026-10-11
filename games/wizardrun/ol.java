/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ol {
    int field_a;
    static boolean field_e;
    static String field_d;
    static boolean field_b;
    static vi field_c;

    ol() {
        this.field_a = 0;
    }

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 550) {
            field_b = false;
          }
          stackIn_3_0 = s.a(param0.length, param0, 0, -124);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ol.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(kl param0, kl param1, byte param2) {
        try {
          pj.field_M = param1;
          if (param2 < 98) {
            field_e = true;
          }
          qk.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ol.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(int param0, va param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param1.g(11681);
            if (param0 < var3_int) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            if (param2 < 35) {
              field_d = (String) null;
            }
            param1.field_m = param1.field_m + fb.field_d.a(false, 0, var4, var3_int, param1.field_m, param1.field_k);
            var5 = bi.a(0, var3_int, var4, false);
            stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ol.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          kl var3 = null;
          mg var5 = null;
          mg var6 = null;
          int stackIn_12_0 = 0;
          Throwable decompiledCaughtException = null;
          if (ab.field_h == null) {
            ab.field_h = sb.field_e.a(aa.field_nb, vl.field_d, (byte) -20);
          }
          if (ab.field_h.field_a == 0) {
            return false;
          }
          dupTemp$1 = d.a((byte) 119);
          hi.field_k = dupTemp$1;
          eg.field_C = dupTemp$1;
          if (param0 < 118) {
            var3 = (kl) null;
            ol.a((kl) null, (kl) null, (byte) -16);
          }
          if (ab.field_h.field_a != 1) {
            wh.field_j = sf.field_i;
          } else {
            try {
              jc.field_H = new hi((java.net.Socket) (ab.field_h.field_e), sb.field_e);
              n.field_b.field_m = 0;
              var5 = nk.field_N;
              var6 = var5;
              var6.field_m = 0;
              wh.field_j = tj.field_G;
              stackIn_12_0 = (param1) ? -2 : -1;
              l.field_P = stackIn_12_0;
              wizardrun.field_E = stackIn_12_0;
              me.field_c = stackIn_12_0;
              cd.a(bl.field_a, n.field_b, 20443, vk.field_l, df.field_a);
              id.a((byte) -67, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              wh.field_j = sf.field_i;
              ab.field_h = null;
              return true;
            }
          }
          ab.field_h = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        if (param0) {
          field_b = true;
        }
    }

    static {
        field_e = false;
        field_b = false;
        field_d = "Press Enter or click to continue";
    }
}
