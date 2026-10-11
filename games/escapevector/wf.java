/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static String field_b;
    static String[] field_c;
    static ed field_e;
    private cn field_a;
    private hg field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_c = null;
        if (param0) {
          return;
        }
        field_b = null;
    }

    final hg a(byte param0, hg param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        hg var4 = null;
        Object stackIn_6_0 = null;
        hg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_a.field_d.field_d;
          }
          if (this.field_a.field_d == var3) {
            this.field_d = null;
            stackIn_6_0 = null;
            return (hg) (stackIn_6_0);
          }
          this.field_d = var3.field_d;
          if (param0 < 33) {
            var4 = (hg) null;
            this.a((byte) 25, (hg) null);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("wf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final hg c(int param0) {
        hg var2 = this.field_a.field_d.field_b;
        if (this.field_a.field_d == var2) {
          this.field_d = null;
          return null;
        }
        if (param0 == 15) {
          this.field_d = var2.field_b;
          return var2;
        }
        return (hg) null;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param1 != 24787) {
          return 37;
        }
        if (0 < param0) {
          var2 = 1;
          if (param0 > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (255 < param0) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (15 < param0) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (3 < param0) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          var2Lifetime1 += 16;
          param0 = param0 >> 16;
        }
        if (-256 > param0) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    final hg a(int param0, hg param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        hg stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_a.field_d.field_b;
          } else {
            var3 = param1;
          }
          if (param0 != -12818) {
            field_e = (ed) null;
          }
          if (var3 != this.field_a.field_d) {
            this.field_d = var3.field_b;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_d = null;
          stackIn_7_0 = null;
          return (hg) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("wf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final hg a(byte param0) {
        if (param0 <= 35) {
          return (hg) null;
        }
        hg var2 = this.field_d;
        if (this.field_a.field_d == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_d;
        return var2;
    }

    final hg a(int param0) {
        hg var2 = this.field_d;
        if (var2 == this.field_a.field_d) {
          this.field_d = null;
          return null;
        }
        if (param0 > 23) {
          this.field_d = var2.field_b;
          return var2;
        }
        return (hg) null;
    }

    final hg b(int param0) {
        hg var2 = null;
        hg var2Lifetime1;
        if (param0 != -31616) {
          hg var3 = (hg) null;
          this.a(-5, (hg) null);
          var2 = this.field_a.field_d.field_d;
          if (this.field_a.field_d == var2) {
            this.field_d = null;
            return null;
          }
          this.field_d = var2.field_d;
          return var2;
        }
        var2Lifetime1 = this.field_a.field_d.field_d;
        if (this.field_a.field_d == var2Lifetime1) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2Lifetime1.field_d;
        return var2Lifetime1;
    }

    wf(cn param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Loading extra data";
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
