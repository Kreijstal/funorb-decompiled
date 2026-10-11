/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends rk {
    static int field_r;
    private String[] field_v;
    static int[] field_q;
    static o field_s;
    private int[] field_w;
    static int field_t;
    int[] field_p;
    private int[][] field_u;

    final String d(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = wizardrun.field_H;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_v) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_v[0]);
        for (var3 = 1; var3 < this.field_v.length; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_v[var3]);
        }
        if (param0 != 10592) {
          field_t = 109;
        }
        return var2.toString();
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        if (this.field_p != null) {
          for (var2 = 0; this.field_p.length > var2; var2++) {
            this.field_p[var2] = sd.a(this.field_p[var2], 32768);
          }
        }
        if (param0 >= -118) {
          va var4 = (va) null;
          this.a(92, (va) null, 16);
        }
    }

    final static boolean a(byte param0) {
        int var2 = 0;
        pk var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        pk var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          var4 = (pk) (kj.field_d.b((byte) 46));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_r; var2++) {
            if (null != var4.field_l[var2] &&
              var4.field_l[var2].field_a == 0) {
              return false;
            }
            if (null != var4.field_m[var2] &&
              var4.field_m[var2].field_a == 0) {
              return false;
            }
          }
          if (param0 > 60) {
            return true;
          }
          field_t = -99;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "ac.J(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
          return;
        }
        tf.a(-20232);
    }

    private final void a(int param0, va param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        bh var7 = null;
        int var9 = 0;
        var9 = wizardrun.field_H;
        try {
          if (param0 < 24) {
            field_r = 59;
          }
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param1.f(255);
              this.field_p = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_p[var5] = param1.j(-14477);
              }
            } else if (param2 == 3) {
              var4_int = param1.f(255);
              this.field_w = new int[var4_int];
              this.field_u = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param1.j(-14477);
                var7 = nh.a(0, var6);
                if (var7 != null) {
                  this.field_w[var5] = var6;
                  array$0 = new int[var7.field_f];
                  this.field_u[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_f; var8++) {
                    this.field_u[var5][var8] = param1.j(-14477);
                  }
                }
              }
            } else {
              if (param2 != 4) {
                return;
              }
            }
          } else {
            this.field_v = tj.a(param1.d(0), -22710, '<');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ac.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
          field_s = (o) null;
        }
        field_s = null;
        field_q = null;
    }

    ac() {
    }

    final void a(va param0, int param1) {
        int var3_int = 0;
        int var4 = wizardrun.field_H;
        int var3_intLifetime1;
        try {
          while (true) {
            var3_int = param0.f(255);
            if (var3_int == 0) {
              break;
            }
            this.a(117, param0, var3_int);
          }
          var3_intLifetime1 = 44 % ((-38 - param1) / 36);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ac.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_q = new int[4];
    }
}
