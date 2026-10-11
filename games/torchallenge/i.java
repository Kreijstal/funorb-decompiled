/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i extends ma {
    private boolean field_n;
    static String[] field_p;
    static int field_m;
    private String field_o;
    static long field_q;
    static int field_r;

    public static void g(int param0) {
        field_p = null;
        if (param0 != -14298) {
          field_p = (String[]) null;
        }
    }

    final rj a(byte param0, String param1) {
        ef var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rj stackIn_2_0 = null;
        rj stackIn_5_0 = null;
        rj stackIn_12_0 = null;
        rj stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!lk.a(param0 ^ -7343, var4)) {
            stackIn_2_0 = lk.field_c;
            return stackIn_2_0;
          }
          if (param0 != 24) {
            stackIn_5_0 = (rj) null;
            return stackIn_5_0;
          }
          if (!param1.equals(this.field_o)) {
            var3 = wi.a(param1, (byte) 123);
            if (var3 != null &&
              var3.field_g == null) {
              this.field_n = var3.field_m;
              this.field_o = param1;
            } else {
              stackIn_12_0 = jh.field_c;
              return stackIn_12_0;
            }
          }
          if (this.field_n) {
            stackIn_17_0 = tf.field_w;
          } else {
            stackIn_17_0 = lk.field_c;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("i.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 == 17004) {
          return param1 == (-param1 & param1) ? true : false;
        }
        field_p = (String[]) null;
        return param1 == (-param1 & param1) ? true : false;
    }

    final void f(int param0) {
        this.field_o = null;
        if (param0 != 0) {
          this.f(-101);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ef var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -24) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = id.a(var5, false);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param0.equals(this.field_o)) {
            var4 = wi.a(param0, (byte) 97);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_g) {
              return null;
            }
            this.field_n = var4.field_m;
            this.field_o = param0;
          }
          if (this.field_n) {
            return uf.field_l;
          }
          stackIn_17_0 = qb.field_f;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("i.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte[] param0, byte param1, int param2, File param3) throws IOException {
        EOFException eOFException = null;
        DataInputStream var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param3)))));
          try {
            var4.readFully(param0, 0, param2);
          } catch (java.io.EOFException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            eOFException = (EOFException) (Object) decompiledCaughtException;
          }
          var4.close();
          if (param1 >= 77) {
            return;
          }
          i.a(31, -60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("i.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    i(dj param0) {
        super(param0);
        this.field_n = false;
    }

    static {
        field_p = new String[]{"Runner", "Spitter", "Thudder", "Rocketeer", "Slimer", "Grinder"};
    }
}
