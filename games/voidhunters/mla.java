/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mla extends rqa {
    static llb field_q;
    static String field_o;
    static float[] field_s;
    static float[] field_p;
    static String field_r;

    final static asb a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          ga var8 = null;
          asb stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (gia.field_k.field_d != null) {
              cba.field_e = new gdb(gia.field_k.field_d, 5200, 0);
              gia.field_k.field_d = null;
              var6 = new fo(255, cba.field_e, new gdb(gia.field_k.field_t, 12000, 0), 2097152);
            }
            var7 = null;
            if (null != cba.field_e) {
              if (null == btb.field_d) {
                btb.field_d = new gdb[gia.field_k.field_l.length];
              }
              if (null == btb.field_d[param4]) {
                btb.field_d[param4] = new gdb(gia.field_k.field_l[param4], 12000, 0);
                gia.field_k.field_l[param4] = null;
              }
              var7 = new fo(param4, cba.field_e, btb.field_d[param4], 2097152);
            }
            var8 = ho.field_a.a(param4, 5, (fo) (var6), (fo) (var7), param3);
            if (param1) {
              var8.b((byte) -82);
            }
            if (param2 > -48) {
              mla.a(false, false, 36, false, -48, -32);
            }
            stackIn_15_0 = new asb(var8, param0, param5);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_q = null;
          field_o = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        }
        mla.a(-123);
        field_q = null;
        field_o = null;
        field_r = null;
        field_p = null;
        field_s = null;
    }

    final static int a(String param0, ds param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -56) {
            stackIn_2_0 = 66;
            return stackIn_2_0;
          }
          var3_int = param1.field_e;
          var5 = (CharSequence) ((Object) param0);
          var4 = hi.a(var5, 96);
          param1.b((byte) 124, var4.length);
          param1.field_e = param1.field_e + eob.field_o.b(var4.length, var4, param1.field_h, 104, param1.field_e, 0);
          stackIn_4_0 = -var3_int + param1.field_e;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mla.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    mla(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oq.field_E = param0[0].a(93);
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mla.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        field_s = new float[16384];
        field_o = "Spinning blade";
        field_p = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
          field_p[var2] = (float)Math.sin(var0 * (double)var2);
          field_s[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_r = "This is your RuneScape clan if you have one.";
    }
}
