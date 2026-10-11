/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static byte[][] field_d;
    private jl field_b;
    private jl field_a;
    static ej field_f;
    static String field_e;
    static int field_c;

    final jl a(byte param0) {
        int var3 = 29 / ((-69 - param0) / 34);
        jl var2 = this.field_a;
        if (this.field_b == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_o;
        return var2;
    }

    final jl a(int param0) {
        jl var2 = null;
        jl var2Lifetime1;
        if (param0 != 0) {
          field_e = (String) null;
          var2 = this.field_a;
          if (var2 != this.field_b) {
            this.field_a = var2.field_q;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_a;
        if (var2Lifetime1 != this.field_b) {
          this.field_a = var2Lifetime1.field_q;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    final jl d(int param0) {
        jl var2 = this.field_b.field_o;
        int var3 = -78 / ((param0 + 30) / 50);
        if (this.field_b == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_o;
        return var2;
    }

    final jl c(boolean param0) {
        jl var2 = null;
        jl var2Lifetime1;
        if (param0) {
          this.a(-10);
          var2 = this.field_b.field_o;
          if (var2 == this.field_b) {
            return null;
          }
          var2.b(!param0 ? true : false);
          return var2;
        }
        var2Lifetime1 = this.field_b.field_o;
        if (var2Lifetime1 != this.field_b) {
          var2Lifetime1.b(!param0 ? true : false);
          return var2Lifetime1;
        }
        return null;
    }

    final void a(boolean param0) {
        jl var2 = null;
        int var3 = Confined.field_J ? 1 : 0;
        while (true) {
          var2 = this.field_b.field_o;
          if (var2 == this.field_b) {
            break;
          }
          var2.b(true);
        }
        if (param0) {
          this.field_a = null;
          return;
        }
        field_d = (byte[][]) null;
        this.field_a = null;
    }

    final int b(boolean param0) {
        int var2 = 0;
        jl var3 = null;
        int var4 = Confined.field_J ? 1 : 0;
        jl var3Lifetime1;
        int var2Lifetime1;
        if (param0) {
          var2 = 0;
          var3 = this.field_b.field_o;
          while (this.field_b != var3) {
            var2++;
            var3 = var3.field_o;
          }
          return var2;
        }
        field_f = (ej) null;
        var2Lifetime1 = 0;
        var3Lifetime1 = this.field_b.field_o;
        while (this.field_b != var3Lifetime1) {
          var2Lifetime1++;
          var3Lifetime1 = var3Lifetime1.field_o;
        }
        return var2Lifetime1;
    }

    public wd() {
        this.field_b = new jl();
        this.field_b.field_o = this.field_b;
        this.field_b.field_q = this.field_b;
    }

    final static void a(long param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          int var3_int = 0;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param0);
            var3_int = -14 / ((81 - param1) / 34);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final jl c(int param0) {
        jl var2 = this.field_b.field_q;
        if (this.field_b == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_q;
        if (param0 < -81) {
          return var2;
        }
        return (jl) null;
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lc.a(true, param2)) {
            return false;
          }
          if (wc.a(param2, param0 ^ -14)) {
            return false;
          }
          if (ef.a(96, param2)) {
            return false;
          }
          if (param1.length() == param0) {
            return true;
          }
          if (nm.a(param1, (byte) -89, param2)) {
            return false;
          }
          if (qd.a(param1, param2, false)) {
            return false;
          }
          if (!ig.a(param1, 0, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("wd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(jl param0, byte param1) {
        try {
          if (null != param0.field_q) {
            param0.b(true);
          }
          param0.field_q = this.field_b.field_q;
          int var3_int = 121 / ((67 - param1) / 46);
          param0.field_o = this.field_b;
          param0.field_q.field_o = param0;
          param0.field_o.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = (byte[][]) null;
        field_f = null;
        if (param0 != -17765) {
          wd.a(34L, 30);
        }
    }

    static {
        field_d = new byte[1000][];
        field_f = new ej();
        field_e = "Power shots";
        field_c = 2;
    }
}
