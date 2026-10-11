/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dib extends ev {
    private int field_i;
    private int field_g;
    private int field_f;
    static String field_j;
    private int field_h;

    final static void a(File param0, int param1, byte[] param2, byte param3) throws IOException {
        DataInputStream var4 = null;
        try {
          var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param0)))));
          try {
            var4.readFully(param2, 0, param1);
          } catch (EOFException eOFException) {
          }
          if (param3 != 119) {
            field_j = (String) null;
          }
          var4.close();
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dib.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 <= 49) {
          String var5 = (String) null;
          dib.a((String) null, 68);
          if (param2 >= 256) {
            return param1;
          }
          if (param2 <= 0) {
            return param3;
          }
          var4 = 256 - param2;
          return (16711935 & var4 * (param3 & 16711935) + param2 * (16711935 & param1) >>> 8) + (-16711936 & ((-16711855 & param1) >>> 8) * param2 + ((param3 & -16711919) >>> 8) * var4);
        }
        if (param2 >= 256) {
          return param1;
        }
        if (param2 <= 0) {
          return param3;
        }
        var4Lifetime1 = 256 - param2;
        return (16711935 & var4Lifetime1 * (param3 & 16711935) + param2 * (16711935 & param1) >>> 8) + (-16711936 & ((-16711855 & param1) >>> 8) * param2 + ((param3 & -16711919) >>> 8) * var4Lifetime1);
    }

    dib(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_g = param0;
        this.field_i = param2;
        this.field_f = param1;
        this.field_h = param3;
    }

    final static tsa[] a(String param0, int param1) {
        int incrementValue$1 = 0;
        ij var2 = null;
        RuntimeException var2_ref = null;
        tsa[] var3 = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        tsa[] stackIn_4_0 = null;
        tsa[] stackIn_7_0 = null;
        tsa[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0.equals(tkb.field_o)) {
            stackIn_4_0 = neb.field_q;
            return stackIn_4_0;
          }
          var2 = ck.a(-1, param0);
          var3 = new tsa[var2.c(3)];
          var4 = 0;
          var5 = (tsa) (var2.d(0));
          if (param1 < 32) {
            stackIn_7_0 = (tsa[]) null;
            return stackIn_7_0;
          }
          while (var5 != null) {
            incrementValue$1 = var4;
            var4++;
            var3[incrementValue$1] = var5;
            var5 = (tsa) (var2.a((byte) 82));
          }
          neb.field_q = var3;
          tkb.field_o = param0;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("dib.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * this.field_g >> 12;
        int var5 = this.field_i * param2 >> 12;
        int var6 = this.field_f * param1 >> 12;
        int var8 = 62 % ((-48 - param0) / 40);
        int var7 = this.field_h * param1 >> 12;
        pda.a(var7, var4, this.field_d, var6, -2, var5, this.field_a);
    }

    final void b(byte param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var4 = param1 * this.field_g >> 12;
        int var5 = this.field_i * param1 >> 12;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 == -112) {
          var6 = param2 * this.field_f >> 12;
          var7 = this.field_h * param2 >> 12;
          fcb.a(this.field_e, var7, var6, var4, var5, (byte) -117);
          return;
        }
        dib.a((byte) 92, -127, 80, 107);
        var6Lifetime1 = param2 * this.field_f >> 12;
        var7Lifetime1 = this.field_h * param2 >> 12;
        fcb.a(this.field_e, var7Lifetime1, var6Lifetime1, var4, var5, (byte) -117);
    }

    final void a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = this.field_g * param2 >> 12;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param1 == 110) {
          var5 = this.field_i * param2 >> 12;
          var6 = param0 * this.field_f >> 12;
          var7 = this.field_h * param0 >> 12;
          kpa.a(this.field_a, var5, this.field_e, var6, this.field_d, var4, var7, 0);
          return;
        }
        field_j = (String) null;
        var5Lifetime1 = this.field_i * param2 >> 12;
        var6Lifetime1 = param0 * this.field_f >> 12;
        var7Lifetime1 = this.field_h * param0 >> 12;
        kpa.a(this.field_a, var5Lifetime1, this.field_e, var6Lifetime1, this.field_d, var4, var7Lifetime1, 0);
    }

    final static boolean a(int param0, int param1) {
        if (param0 >= 93) {
          return 2 <= param1 ? true : false;
        }
        field_j = (String) null;
        return 2 <= param1 ? true : false;
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 == 89) {
          return;
        }
        dib.a((byte) 40);
    }

    static {
        field_j = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
