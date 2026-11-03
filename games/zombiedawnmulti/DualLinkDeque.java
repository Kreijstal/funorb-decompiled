/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualLinkDeque {
    static String field_c;
    static int field_d;
    static int field_b;
    static String field_a;
    private DualLinkNode field_e;
    private DualLinkNode field_f;

    final int size(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        DualLinkNode var3 = this.field_e.secondaryPrevious;
        if (param0 != 98) {
          return -26;
        }
        while (var3 != this.field_e) {
          var3 = var3.secondaryPrevious;
          var2++;
        }
        return var2;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= 74) {
          return;
        }
        DualLinkDeque.b(1);
    }

    final DualLinkNode next(byte param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 < 82) {
          field_d = 18;
          var2 = this.field_f;
          if (var2 != this.field_e) {
            this.field_f = var2.secondaryPrevious;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        var2Lifetime1 = this.field_f;
        if (var2Lifetime1 != this.field_e) {
          this.field_f = var2Lifetime1.secondaryPrevious;
          return var2Lifetime1;
        }
        this.field_f = null;
        return null;
    }

    final static ma a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        ma stackIn_5_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_18_0 = null;
        ma stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 != 1) {
            DualLinkDeque.releaseStatics(-68);
          }
          if (0 == var2_int) {
            stackIn_5_0 = jo.field_e;
            return stackIn_5_0;
          }
          if (var2_int > 63) {
            stackIn_9_0 = er.field_f;
            return stackIn_9_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (45 == var4) {
              if (var3 == 0 ||
                var3 == -1 + var2_int) {
                stackIn_18_0 = UnitStateEvent.field_t;
                return stackIn_18_0;
              }
            } else {
              if (lb.field_e.indexOf(var4) == -1) {
                stackIn_22_0 = UnitStateEvent.field_t;
                return stackIn_22_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("lq.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void clear(int param0) {
        DualLinkNode var5 = null;
        DualLinkNode var4 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -1) {
          DualLinkDeque.releaseStatics(-67);
          while (true) {
            var5 = this.field_e.secondaryPrevious;
            if (this.field_e == var5) {
              break;
            }
            var5.a(-4564);
          }
          this.field_f = null;
          return;
        }
        while (true) {
          var4 = this.field_e.secondaryPrevious;
          if (this.field_e == var4) {
            break;
          }
          var4.a(-4564);
        }
        this.field_f = null;
    }

    final DualLinkNode first(byte param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 <= 84) {
          this.field_f = (DualLinkNode) null;
          var2 = this.field_e.secondaryPrevious;
          if (this.field_e == var2) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.secondaryPrevious;
          return var2;
        }
        var2Lifetime1 = this.field_e.secondaryPrevious;
        if (this.field_e == var2Lifetime1) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.secondaryPrevious;
        return var2Lifetime1;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          DualLinkDeque.releaseStatics(72);
          return NavigationGrid.field_m != null ? true : false;
        }
        return NavigationGrid.field_m != null ? true : false;
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 11356) {
          DualLinkDeque.b(-38);
          var2 = this.field_e.secondaryPrevious;
          if (var2 != this.field_e) {
            var2.a(-4564);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_e.secondaryPrevious;
        if (var2Lifetime1 != this.field_e) {
          var2Lifetime1.a(-4564);
          return var2Lifetime1;
        }
        return null;
    }

    final void add(int param0, DualLinkNode param1) {
        try {
          if (param1.secondaryNext != null) {
            param1.a(param0 - 34228);
          }
          param1.secondaryPrevious = this.field_e;
          param1.secondaryNext = this.field_e.secondaryNext;
          if (param0 != 29664) {
            String var4 = (String) null;
            DualLinkDeque.a((byte) 122, (String) null);
          }
          param1.secondaryNext.secondaryPrevious = param1;
          param1.secondaryPrevious.secondaryNext = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lq.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public DualLinkDeque() {
        this.field_e = new DualLinkNode();
        this.field_e.secondaryPrevious = this.field_e;
        this.field_e.secondaryNext = this.field_e;
    }

    static {
        field_a = "Game Complete!";
        field_b = 0;
        field_c = "Connection restored.";
    }
}
