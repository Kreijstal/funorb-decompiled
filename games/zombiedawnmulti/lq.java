/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static String field_c;
    static int field_d;
    static int field_b;
    static String field_a;
    private qa field_e;
    private qa field_f;

    final int a(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        qa var3 = this.field_e.field_k;
        if (param0 != 98) {
          return -26;
        }
        while (var3 != this.field_e) {
          var3 = var3.field_k;
          var2++;
        }
        return var2;
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= 74) {
          return;
        }
        lq.b(1);
    }

    final qa b(byte param0) {
        qa var2 = null;
        qa var2Lifetime1;
        if (param0 < 82) {
          field_d = 18;
          var2 = this.field_f;
          if (var2 != this.field_e) {
            this.field_f = var2.field_k;
            return var2;
          }
          this.field_f = null;
          return null;
        }
        var2Lifetime1 = this.field_f;
        if (var2Lifetime1 != this.field_e) {
          this.field_f = var2Lifetime1.field_k;
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
            lq.c(-68);
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
                stackIn_18_0 = so.field_t;
                return stackIn_18_0;
              }
            } else {
              if (lb.field_e.indexOf(var4) == -1) {
                stackIn_22_0 = so.field_t;
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
          throw fa.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void d(int param0) {
        qa var5 = null;
        qa var4 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -1) {
          lq.c(-67);
          while (true) {
            var5 = this.field_e.field_k;
            if (this.field_e == var5) {
              break;
            }
            var5.a(-4564);
          }
          this.field_f = null;
          return;
        }
        while (true) {
          var4 = this.field_e.field_k;
          if (this.field_e == var4) {
            break;
          }
          var4.a(-4564);
        }
        this.field_f = null;
    }

    final qa c(byte param0) {
        qa var2 = null;
        qa var2Lifetime1;
        if (param0 <= 84) {
          this.field_f = (qa) null;
          var2 = this.field_e.field_k;
          if (this.field_e == var2) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.field_k;
          return var2;
        }
        var2Lifetime1 = this.field_e.field_k;
        if (this.field_e == var2Lifetime1) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.field_k;
        return var2Lifetime1;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          lq.c(72);
          return fh.field_m != null ? true : false;
        }
        return fh.field_m != null ? true : false;
    }

    final qa a(int param0) {
        qa var2 = null;
        qa var2Lifetime1;
        if (param0 != 11356) {
          lq.b(-38);
          var2 = this.field_e.field_k;
          if (var2 != this.field_e) {
            var2.a(-4564);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_e.field_k;
        if (var2Lifetime1 != this.field_e) {
          var2Lifetime1.a(-4564);
          return var2Lifetime1;
        }
        return null;
    }

    final void a(int param0, qa param1) {
        try {
          if (param1.field_p != null) {
            param1.a(param0 - 34228);
          }
          param1.field_k = this.field_e;
          param1.field_p = this.field_e.field_p;
          if (param0 != 29664) {
            String var4 = (String) null;
            lq.a((byte) 122, (String) null);
          }
          param1.field_p.field_k = param1;
          param1.field_k.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "lq.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public lq() {
        this.field_e = new qa();
        this.field_e.field_k = this.field_e;
        this.field_e.field_p = this.field_e;
    }

    static {
        field_a = "Game Complete!";
        field_b = 0;
        field_c = "Connection restored.";
    }
}
