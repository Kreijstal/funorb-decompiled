/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends wk implements rc {
    static int[] field_S;
    static int[] field_N;
    static boolean field_P;
    static char[] field_O;
    static we[] field_R;
    private wd field_Q;

    nh(pf param0, lg param1) {
        super(param0, 200, 150);
        Object var3 = null;
        lk var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (nb.field_c != param1) {
            if (param1 != jb.field_c) {
              if (param1 == jk.field_a) {
                var3 = pe.field_g;
                this.field_m = this.field_m + 30;
              }
            } else {
              var3 = of.field_a;
              this.field_m = this.field_m + 10;
              if (ng.a(113)) {
                var3 = k.field_E;
                this.field_m = this.field_m + 20;
              }
            }
          } else {
            var3 = ra.field_f;
          }
          var4 = new lk((String) (var3), (sk) null);
          var4.field_k = this.field_k;
          var4.field_r = 0;
          var4.field_m = 80;
          var4.field_i = 50;
          var4.field_j = (fc) ((Object) new jd(qj.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(var4, true);
          this.field_Q = this.a(-20017, (sk) (this), uk.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nh.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_S = null;
        field_N = null;
        field_O = null;
        field_R = null;
        if (param0 != -102) {
          nh.j((byte) 26);
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 6) {
            this.field_Q = (wd) null;
          }
          if (param4 != this.field_Q) {
            return;
          }
          this.m(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("nh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void m(int param0) {
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (param0 != 0) {
          field_O = (char[]) null;
        }
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        de var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        de stackIn_7_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -11560) {
            field_S = (int[]) null;
          }
          if (param2 == null) {
            stackIn_4_0 = null;
            return stackIn_4_0;
          }
          if (param2.length > 136) {
            var3 = new de();
            ((ah) ((Object) var3)).a((byte) 68, param2);
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (param0) {
            stackIn_12_0 = rd.a((byte) -91, param2);
            return stackIn_12_0;
          }
          stackIn_10_0 = (byte[]) (param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("nh.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final wd a(int param0, sk param1, String param2) {
        wd var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -20017) {
            field_N = (int[]) null;
          }
          var4 = new wd(param2, param1);
          var4.field_j = (fc) ((Object) new jh());
          var5 = -6 + this.field_m;
          this.field_m = this.field_m + 38;
          var4.b(30, 80, this.field_k - 30, 15, var5);
          this.b(var4, true);
          this.g(11213);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("nh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_O = new char[]{(char)91, (char)93, (char)35};
        field_N = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_P = false;
    }
}
