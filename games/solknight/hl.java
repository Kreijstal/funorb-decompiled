/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static int[] field_a;
    private ec field_b;
    private ec field_c;

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 != 24574) {
          field_a = (int[]) null;
          hf.a(param2, 17072, param0, (String) null);
          return;
        }
        hf.a(param2, 17072, param0, (String) null);
    }

    final int a(int param0) {
        int var2;
        ec var3;
        int var4;
        ec var3Lifetime1;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        if (param0 == -29749) {
          var3 = this.field_b.field_i;
          while (var3 != this.field_b) {
            var2++;
            var3 = var3.field_i;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          return var2;
        }
        this.c(127);
        var3Lifetime1 = this.field_b.field_i;
        while (var3Lifetime1 != this.field_b) {
          var2++;
          var3Lifetime1 = var3Lifetime1.field_i;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    final ec c(int param0) {
        if (param0 != 0) {
          return (ec) null;
        }
        ec var2 = this.field_b.field_i;
        if (var2 != this.field_b) {
          var2.a(97);
          return var2;
        }
        return null;
    }

    final void a(ec param0, int param1) {
        try {
          if (param0.field_k != null) {
            param0.a(97);
          }
          param0.field_i = this.field_b;
          param0.field_k = this.field_b.field_k;
          param0.field_k.field_i = param0;
          if (param1 != 0) {
            field_a = (int[]) null;
          }
          param0.field_i.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "hl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -113) {
          hl.a(true, -54, false);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String a(String param0, String param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        int var4Lifetime1;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param3) {
          var4 = param0.indexOf(param2);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (-1 == var4))) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(var4 + param2.length());
            stackIn_7_0 = (String) (param0);
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_7_0).indexOf(param2, var4 + param1.length());
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_7_0 = (String) (param0);
          }
          return stackIn_7_0;
        }
        field_a = (int[]) null;
        var4Lifetime1 = param0.indexOf(param2);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (-1 == var4Lifetime1))) {
          param0 = param0.substring(0, var4Lifetime1) + param1 + param0.substring(var4Lifetime1 + param2.length());
          stackIn_13_0 = (String) (param0);
          if (var5 == 0) {
            var4Lifetime1 = ((String) (Object) stackIn_13_0).indexOf(param2, var4Lifetime1 + param1.length());
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_13_0 = (String) (param0);
        }
        return stackIn_13_0;
    }

    final ec d(int param0) {
        ec var2 = this.field_b.field_i;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_i;
        if (param0 > 113) {
          return var2;
        }
        return (ec) null;
    }

    final ec b(int param0) {
        ec var2 = null;
        ec var2Lifetime1;
        if (param0 != -1) {
          field_a = (int[]) null;
          var2 = this.field_c;
          if (this.field_b != var2) {
            this.field_c = var2.field_i;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_c;
        if (this.field_b != var2Lifetime1) {
          this.field_c = var2Lifetime1.field_i;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    public hl() {
        this.field_b = new ec();
        this.field_b.field_k = this.field_b;
        this.field_b.field_i = this.field_b;
    }

    static {
        field_a = new int[8192];
    }
}
