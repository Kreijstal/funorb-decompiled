/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static String field_a;
    static int field_e;
    static java.util.zip.CRC32 field_c;
    private be field_b;
    static int field_f;
    private be field_g;
    static String field_d;

    final static int e(int param0) {
        int var1 = 0;
        if (!(lg.field_W <= var1)) {
          var1 = lg.field_W;
        }
        if (var1 < bf.field_r) {
          var1 = bf.field_r;
        }
        if (param0 != -28199) {
          field_e = -18;
        }
        if (!(tg.field_e <= var1)) {
          var1 = tg.field_e;
        }
        return var1;
    }

    final be b(byte param0) {
        be var2 = this.field_g;
        if (var2 == this.field_b) {
          this.field_g = null;
          return null;
        }
        if (param0 != 20) {
          return (be) null;
        }
        this.field_g = var2.field_p;
        return var2;
    }

    final void a(be param0, int param1) {
        be var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0.field_v != null) {
            param0.e((byte) 101);
          }
          param0.field_p = this.field_b;
          param0.field_v = this.field_b.field_v;
          param0.field_v.field_p = param0;
          param0.field_p.field_v = param0;
          if (param1 != -7267) {
            var4 = (be) null;
            this.a((be) null, 54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ab.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final be a(byte param0) {
        be var2 = this.field_b.field_p;
        if (this.field_b == var2) {
          return null;
        }
        var2.e((byte) 94);
        int var3 = 27 / ((1 - param0) / 39);
        return var2;
    }

    final be b(int param0) {
        if (param0 != -2198) {
          this.b(61);
        }
        be var2 = this.field_b.field_p;
        if (this.field_b == var2) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.field_p;
        return var2;
    }

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + var6 + 1);
            } else if (97 <= var6 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (var6 + 1));
            } else {
              if (var6 >= 48 &&
                57 >= var6) {
                var2_long = var2_long + (long)(var6 + 27 - 48);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          if (param0 <= 95) {
            field_f = -6;
          }
          while (0L == var2_long % 37L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ab.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = 108 % ((-69 - param0) / 50);
        var2_ref = f.field_r;
        synchronized (var2_ref) {
          if (ea.field_n == sf.field_B) {
            return false;
          }
          wh.field_c = pf.field_i[sf.field_B];
          el.field_G = bl.field_Z[sf.field_B];
          sf.field_B = 1 + sf.field_B & 127;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    public static void d(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
          ab.e(-99);
        }
        field_d = null;
    }

    final int a(int param0) {
        int var4 = client.field_A ? 1 : 0;
        int var2 = param0;
        be var3 = this.field_b.field_p;
        while (var3 != this.field_b) {
          var2++;
          var3 = var3.field_p;
        }
        return var2;
    }

    final static boolean c(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 48) {
          ab.$cfr$intArgs$c$a284cb190b53(45);
        }
        stackIn_7_0 = (null != kb.field_i) || (jh.field_h);
        return stackIn_7_0;
    }

    public ab() {
        this.field_b = new be();
        this.field_b.field_v = this.field_b;
        this.field_b.field_p = this.field_b;
    }

    static {
        field_a = "Resign";
        field_e = 64;
        field_c = new java.util.zip.CRC32();
        field_d = "Unfortunately you are not eligible to create an account.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$c$a284cb190b53(int param0) {
        int var1 = 0;
        Object var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = 108 % ((-69 - param0) / 50);
        var2_ref = f.field_r;
        synchronized (var2_ref) {
          if (ea.field_n == sf.field_B) {
            return false;
          }
          wh.field_c = pf.field_i[sf.field_B];
          el.field_G = bl.field_Z[sf.field_B];
          sf.field_B = 1 + sf.field_B & 127;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }
}
