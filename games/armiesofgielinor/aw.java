/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends sm {
    static RgbSprite field_m;
    static String field_k;
    static boolean field_l;
    static int[][][] field_j;
    static String field_h;
    static wr field_i;

    final static boolean a(boolean param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!param0) {
          return false;
        }
        var1 = vi.b(-45);
        var3 = var1 - dp.field_Lb;
        if (var3 > 30000L) {
          dp.field_Lb = var1;
          mu.field_d = 0;
          return true;
        }
        var5 = 3000;
        if (7 <= mu.field_d) {
          var5 = 12000;
        } else {
          if (mu.field_d >= 5) {
            var5 = 9000;
          } else {
            if (3 <= mu.field_d) {
              var5 = 6000;
            }
          }
        }
        if (var3 <= (long)var5) {
          return false;
        }
        dp.field_Lb = var1;
        mu.field_d = mu.field_d + 1;
        return true;
    }

    final void a(int param0, jb param1) {
        RuntimeException runtimeException = null;
        jb var3 = null;
        jb var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (jb) (this.field_a.a(0));
          if (param0 != 16777062) {
            var4 = (jb) null;
            this.a(64, (jb) null);
          }
          if (var3 == null ||
            param1.field_t > var3.field_t) {
            var3 = param1;
          }
          this.field_a.addFirst(750, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("aw.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final jb a(byte param0) {
        jb var2 = null;
        jb var2Lifetime1;
        if (param0 <= -28) {
          var2 = (jb) (this.field_a.a(0));
          return var2;
        }
        this.a((byte) -5);
        var2Lifetime1 = (jb) (this.field_a.a(0));
        return var2Lifetime1;
    }

    final static og a(byte param0, mt param1) {
        int fieldTemp$4 = 0;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_15_0 = 0;
        og stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          fieldTemp$4 = param1.field_c - 1;
          param1.field_c = param1.field_c - 1;
          var2_int = fieldTemp$4;
          var3 = new StringBuilder();
          var4 = param1.b(-1);
          if (param0 <= 95) {
            field_h = (String) null;
          }
          discarded$5 = var3.append((char) var4);
          var5 = 0;
          while (!param1.a((byte) 16)) {
            var6 = param1.b(-1);
            if (var5 != 0) {
              var5 = 0;
              discarded$6 = var3.append((char) var6);
              continue;
            }
            if (var6 != 92) {
              discarded$7 = var3.append((char) var6);
            } else {
              var5 = 1;
            }
            if (var4 != var6) {
              continue;
            }
            break;
          }
          if (var4 != 34) {
            stackIn_15_0 = hf.field_h;
          } else {
            stackIn_15_0 = iu.field_x;
          }
          var6Lifetime1 = stackIn_15_0;
          stackIn_16_0 = new og(var6Lifetime1, var2_int, var3.toString());
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("aw.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(co param0, co[] param1, int param2) {
        try {
          if (param2 != -5841) {
            field_h = (String) null;
          }
          param1[param0.field_d] = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "aw.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        nt var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (nt) (s.field_a.first((byte) 104));
          while (var4 != null) {
            tf.a(param0, var4, (byte) -64);
            var4 = (nt) (s.field_a.next((byte) 123));
          }
          if (param1 == 1742) {
            return;
          }
          aw.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "aw.R(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = 13 % ((-54 - param0) / 57);
        field_h = null;
        field_k = null;
        field_m = null;
        field_j = (int[][][]) null;
        field_i = null;
    }

    aw(AiPlanner param0) {
        super(param0);
    }

    static {
        field_h = null;
    }
}
