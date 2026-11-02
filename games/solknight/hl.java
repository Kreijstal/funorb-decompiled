/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static int[] field_a;
    private DualLinkNode field_b;
    private DualLinkNode field_c;

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
        DualLinkNode var3;
        int var4;
        DualLinkNode var3Lifetime1;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        if (param0 == -29749) {
          var3 = this.field_b.secondaryPrevious;
          while (var3 != this.field_b) {
            var2++;
            var3 = var3.secondaryPrevious;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          return var2;
        }
        this.c(127);
        var3Lifetime1 = this.field_b.secondaryPrevious;
        while (var3Lifetime1 != this.field_b) {
          var2++;
          var3Lifetime1 = var3Lifetime1.secondaryPrevious;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    final DualLinkNode c(int param0) {
        if (param0 != 0) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_b.secondaryPrevious;
        if (var2 != this.field_b) {
          var2.unlinkSecondary(97);
          return var2;
        }
        return null;
    }

    final void a(DualLinkNode param0, int param1) {
        try {
          if (param0.secondaryNext != null) {
            param0.unlinkSecondary(97);
          }
          param0.secondaryPrevious = this.field_b;
          param0.secondaryNext = this.field_b.secondaryNext;
          param0.secondaryNext.secondaryPrevious = param0;
          if (param1 != 0) {
            field_a = (int[]) null;
          }
          param0.secondaryPrevious.secondaryNext = param0;
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

    final DualLinkNode d(int param0) {
        DualLinkNode var2 = this.field_b.secondaryPrevious;
        if (var2 == this.field_b) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.secondaryPrevious;
        if (param0 > 113) {
          return var2;
        }
        return (DualLinkNode) null;
    }

    final DualLinkNode b(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != -1) {
          field_a = (int[]) null;
          var2 = this.field_c;
          if (this.field_b != var2) {
            this.field_c = var2.secondaryPrevious;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_c;
        if (this.field_b != var2Lifetime1) {
          this.field_c = var2Lifetime1.secondaryPrevious;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    public hl() {
        this.field_b = new DualLinkNode();
        this.field_b.secondaryNext = this.field_b;
        this.field_b.secondaryPrevious = this.field_b;
    }

    static {
        field_a = new int[8192];
    }
}
