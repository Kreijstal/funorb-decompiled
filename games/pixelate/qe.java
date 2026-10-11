/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends lm {
    int[] field_D;
    static int[] field_v;
    String field_C;
    char[] field_x;
    static jl field_A;
    char[] field_t;
    static ll field_w;
    boolean field_y;
    static int field_u;
    int[] field_z;

    final void a(byte param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        int var2Lifetime1;
        if (param0 != 92) {
          return;
        }
        if (this.field_D != null) {
          for (var2 = 0; var2 < this.field_D.length; var2++) {
            this.field_D[var2] = bq.a(this.field_D[var2], 32768);
          }
        }
        if (null != this.field_z) {
          var4 = 0;
          var2Lifetime1 = var4;
          while (var4 < this.field_z.length) {
            this.field_z[var4] = bq.a(this.field_z[var4], 32768);
            var4++;
          }
        }
    }

    public static void g(int param0) {
        field_A = null;
        int var1 = -33 / ((10 - param0) / 52);
        field_w = null;
        field_v = null;
    }

    final void a(boolean param0, we param1) {
        int var3_int = 0;
        int var4 = 0;
        we var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0) {
            var5 = (we) null;
            this.a(113, 78, (we) null);
          }
          while (true) {
            var3_int = param1.f(255);
            if (0 == var3_int) {
              return;
            }
            this.a(var3_int, 3, param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qe.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static eh a(String param0, int param1, byte param2) {
        eg var3 = null;
        RuntimeException var3_ref = null;
        eg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 111) {
            field_v = (int[]) null;
          }
          var3 = new eg();
          ((eh) ((Object) var3)).field_e = param1;
          ((eh) ((Object) var3)).field_b = param0;
          stackIn_3_0 = var3;
          return (eh) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("qe.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    qe() {
        this.field_y = false;
    }

    private final void a(int param0, int param1, we param2) {
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_10_2 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char stackIn_19_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        we var8 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != 1) {
            if (2 == param0) {
              var4_int = param2.f(param1 + 252);
              this.field_x = new char[var4_int];
              this.field_z = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_z[var5] = param2.a((byte) -128);
                var6 = param2.a(0);
                stackIn_18_0 = this.field_x;
                stackIn_18_1 = var5;
                if (var6 == 0) {
                  stackIn_19_2 = (char)0;
                } else {
                  stackIn_19_2 = cm.a((byte) var6, 63);
                }
                stackIn_18_0[stackIn_18_1] = stackIn_19_2;
              }
            } else {
              if (3 == param0) {
                var4_int = param2.f(255);
                this.field_t = new char[var4_int];
                this.field_D = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  this.field_D[var5] = param2.a((byte) -113);
                  var6 = param2.a(0);
                  stackIn_9_0 = this.field_t;
                  stackIn_9_1 = var5;
                  if (0 == var6) {
                    stackIn_10_2 = (char)0;
                  } else {
                    stackIn_10_2 = cm.a((byte) var6, 63);
                  }
                  stackIn_9_0[stackIn_9_1] = stackIn_10_2;
                }
              } else {
                if (param0 == 4) {
                  this.field_y = true;
                }
              }
            }
          } else {
            this.field_C = param2.h(param1 ^ 6);
          }
          if (param1 != 3) {
            var8 = (we) null;
            this.a(true, (we) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("qe.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_v = new int[8192];
    }
}
