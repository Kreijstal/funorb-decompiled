/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od extends ah {
    private int[] field_t;
    static fb field_v;
    static int field_r;
    static long field_z;
    private String[] field_u;
    private int[][] field_x;
    int[] field_y;
    static String[] field_w;
    static int[] field_s;

    final void f(int param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        if (this.field_y != null) {
          for (var2 = 0; var2 < this.field_y.length; var2++) {
            this.field_y[var2] = vf.b(this.field_y[var2], 32768);
          }
        }
        if (param0 != 20865) {
          od.d((byte) -65);
        }
    }

    final static String a(int param0, long param1) {
        fj.field_k.setTime(new Date(param1));
        int var3 = fj.field_k.get(7);
        int var4 = fj.field_k.get(5);
        int var5 = fj.field_k.get(2);
        int var6 = fj.field_k.get(1);
        int var7 = fj.field_k.get(11);
        if (param0 != 10) {
          od.d((byte) 71);
        }
        int var8 = fj.field_k.get(12);
        int var9 = fj.field_k.get(13);
        return rl.field_c[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ng.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_13_0 = false;
        if (param1) {
          return false;
        }
        stackIn_13_0 = ((!(param0 < 48) &&
          !(param0 > 57)) ||
          (!(param0 < 65) &&
          !(param0 > 90)) ||
          (!(param0 < 97) &&
          !(param0 > 122)));
        return stackIn_13_0;
    }

    final void a(ka param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = stellarshard.field_B;
        try {
          while (true) {
            var3_int = param0.f(4);
            if (var3_int != 0) {
              this.a(param0, -11682, var3_int);
              continue;
            }
            break;
          }
          if (param1 != 745) {
            field_s = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("od.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 != 11) {
          return;
        }
        field_w = null;
        field_v = null;
        field_s = null;
    }

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = stellarshard.field_B;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_u == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_u[param0]);
        for (var3 = 1; var3 < this.field_u.length; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_u[var3]);
        }
        return var2.toString();
    }

    private final void a(ka param0, int param1, int param2) {
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
        li var7 = null;
        int var9 = 0;
        ka var10 = null;
        var9 = stellarshard.field_B;
        try {
          if (param2 != 1) {
            if (2 == param2) {
              var4_int = param0.f(param1 ^ -11686);
              this.field_y = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_y[var5] = param0.c((byte) 107);
              }
            } else {
              if (3 == param2) {
                var4_int = param0.f(param1 + 11686);
                this.field_t = new int[var4_int];
                this.field_x = new int[var4_int][];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param0.c((byte) 54);
                  var7 = ee.a(var6, (byte) 8);
                  if (var7 != null) {
                    this.field_t[var5] = var6;
                    array$0 = new int[var7.field_c];
                    this.field_x[var5] = array$0;
                    for (var8 = 0; var8 < var7.field_c; var8++) {
                      this.field_x[var5][var8] = param0.c((byte) 96);
                    }
                  }
                }
              } else {
                if (param2 == 4) {
                }
              }
            }
          } else {
            this.field_u = qj.a('<', param0.e((byte) 106), 10287);
          }
          if (param1 != -11682) {
            var10 = (ka) null;
            this.a((ka) null, 76, -96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("od.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    od() {
    }

    static {
        field_w = new String[]{"All scores", "My scores", "Best each"};
        field_s = new int[8192];
    }
}
