/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pda extends eo {
    private String[] field_r;
    int[] field_s;
    private int[] field_o;
    static String field_q;
    private int[][] field_n;
    static int field_p;

    private final void a(lu param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        du var7 = null;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          if (param1 != 0) {
            this.field_r = (String[]) null;
          }
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param0.b(16711935);
              this.field_s = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_s[var5] = param0.e((byte) 97);
              }
            } else if (param2 == 3) {
              var4_int = param0.b(16711935);
              this.field_o = new int[var4_int];
              this.field_n = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param0.e((byte) 57);
                var7 = pga.a(false, var6);
                if (var7 != null) {
                  this.field_o[var5] = var6;
                  array$0 = new int[var7.field_d];
                  this.field_n[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_d; var8++) {
                    this.field_n[var5][var8] = param0.e((byte) 85);
                  }
                }
              }
            } else {
              if (4 == param2) {
                return;
              }
            }
          } else {
            this.field_r = fda.a(~param1, '<', param0.g(-125));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("pda.L(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!param0) {
          return;
        }
        if (null != this.field_s) {
          for (var2 = 0; var2 < this.field_s.length; var2++) {
            this.field_s[var2] = mp.a(this.field_s[var2], 32768);
          }
        }
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != -3) {
          field_p = 23;
        }
    }

    final void a(lu param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param1 < 89) {
            return;
          }
          while (true) {
            var3_int = param0.b(16711935);
            if (var3_int == 0) {
              return;
            }
            this.a(param0, 0, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pda.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    pda() {
    }

    final String d(byte param0) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = BachelorFridge.field_y;
        StringBuilder var6 = new StringBuilder(80);
        var6 = var6;
        if (null == this.field_r) {
          return "";
        }
        StringBuilder discarded$0 = var6.append(this.field_r[0]);
        int var3 = 1;
        if (param0 <= 61) {
          this.d((byte) 118);
        }
        while (var3 < this.field_r.length) {
          discarded$1 = var6.append("...");
          discarded$2 = var6.append(this.field_r[var3]);
          var3++;
        }
        return var6.toString();
    }

    static {
        field_q = "You need a rating of <%1> to play with the current options.";
        field_p = 480;
    }
}
