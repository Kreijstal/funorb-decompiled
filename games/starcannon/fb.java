/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static String[] field_c;
    static lh field_t;
    static volatile int field_j;
    private String field_p;
    int field_i;
    String field_h;
    static ue field_g;
    static int[] field_n;
    static String field_d;
    static String field_f;
    private int field_o;
    private long field_s;
    int[] field_a;
    int field_q;
    private boolean field_k;
    static String field_e;
    int field_b;
    static int[] field_m;
    static int field_r;
    static int[] field_l;

    final static byte[] a(int param0, byte[] param1, ia param2, boolean param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = StarCannon.field_A;
        try {
          var4_int = param2.e(8, param0);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (!param3) {
            field_f = (String) null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new byte[var4_int];
          }
          var5 = param2.e(8, 3);
          var6 = (byte)param2.e(8, 8);
          if (0 >= var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)(var6 + param2.e(8, var5));
            }
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("fb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        ia var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = StarCannon.field_A;
        try {
          var1 = d.field_b;
          if (param0 != 10) {
            return;
          }
          while (ma.a(0)) {
            var1.d((byte) 84, 8);
            fieldTemp$0 = var1.field_g + 1;
            var1.field_g = var1.field_g + 1;
            var2 = fieldTemp$0;
            rh.a(var1, (byte) -68);
            d.field_b.b(var1.field_g - var2, 31700);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "fb.E(" + param0 + ')');
        }
    }

    final static ig a(String param0, int param1, int param2) {
        ig var3 = null;
        RuntimeException var3_ref = null;
        ig stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_r = -91;
          }
          var3 = new ig(false);
          var3.field_e = param1;
          var3.field_d = param0;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("fb.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_n = null;
        field_c = null;
        field_l = null;
        if (param0 > -8) {
          fb.a(122);
        }
        field_f = null;
        field_t = null;
        field_m = null;
        field_e = null;
    }

    final static int a(String param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26) {
            stackIn_2_0 = -38;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = ai.field_h.a(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = rh.field_h.a(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fb.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        StringBuilder var7 = null;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var6Lifetime1;
        int var9Lifetime1;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = -64 % ((49 - param1) / 61);
          var6 = 0;
          while (true) {
            var7_int = param0.indexOf("<%", var6);
            if (0 <= var7_int) {
              for (var6 = var7_int + 2; var3_int > var6; var6++) {
                if (wc.a(48, param0.charAt(var6))) {
                  continue;
                }
                break;
              }
              var8_ref_String = param0.substring(var7_int + 2, var6);
              if (!ba.a(6, (CharSequence) ((Object) var8_ref_String))) {
                continue;
              }
              if (var3_int <= var6) {
                continue;
              }
              if (62 != param0.charAt(var6)) {
                continue;
              }
              var6++;
              var9 = pd.a((CharSequence) ((Object) var8_ref_String), 10);
              var4 = var4 + (-var6 + var7_int + param2[var9].length());
              continue;
            }
            break;
          }
          var7 = new StringBuilder(var4);
          var6Lifetime1 = 0;
          var8 = 0;
          while (true) {
            var9Lifetime1 = param0.indexOf("<%", var6Lifetime1);
            if (var9Lifetime1 < 0) {
              discarded$0 = var7.append(param0.substring(var8));
              stackIn_23_0 = var7.toString();
              return stackIn_23_0;
            }
            for (var6Lifetime1 = var9Lifetime1 + 2; var6Lifetime1 < var3_int; var6Lifetime1++) {
              if (wc.a(48, param0.charAt(var6Lifetime1))) {
                continue;
              }
              break;
            }
            var10 = param0.substring(2 + var9Lifetime1, var6Lifetime1);
            if (!ba.a(6, (CharSequence) ((Object) var10))) {
              continue;
            }
            if (var6Lifetime1 >= var3_int) {
              continue;
            }
            if (param0.charAt(var6Lifetime1) != 62) {
              continue;
            }
            var6Lifetime1++;
            var11 = pd.a((CharSequence) ((Object) var10), 10);
            discarded$1 = var7.append(param0.substring(var8, var9Lifetime1));
            var8 = var6Lifetime1;
            discarded$2 = var7.append(param2[var11]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("fb.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final int b(int param0) {
        if (!this.field_k && (this.field_q != 2 ||
          this.field_o <= 0)) {
          if (param0 >= -124) {
            field_e = (String) null;
          }
          if (this.field_s == va.field_j) {
            return 1;
          }
          if (bd.field_f != 2) {
            return 0;
          }
          if (di.a((byte) 107, this.field_p)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    fb(boolean param0) {
        this.field_o = lj.field_i;
        this.field_k = cf.field_r;
        this.field_p = field_e;
        this.field_q = pf.field_e;
        if (param0) {
          this.field_a = se.field_o;
        } else {
          this.field_a = null;
        }
        this.field_s = ne.field_d;
        this.field_h = vd.field_e;
        this.field_b = tk.field_e;
        this.field_i = wc.field_f;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_d = "Use this alternative as your account name";
        field_n = new int[256];
        field_j = 0;
        field_f = "Click";
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_n[var1] = var0;
        }
        field_m = new int[8192];
        field_r = 9;
        field_l = new int[12];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$1694234bddb3(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26) {
            stackIn_2_0 = -38;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = ai.field_h.a(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = rh.field_h.a(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fb.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }
}
