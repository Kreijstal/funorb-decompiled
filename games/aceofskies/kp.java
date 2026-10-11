/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    wf field_e;
    static kc field_a;
    private wf field_c;
    static kc field_d;
    static String field_b;
    static int[] field_f;

    final wf b(int param0) {
        wf var2 = null;
        wf var2Lifetime1;
        if (param0 != 4095) {
          this.field_c = (wf) null;
          var2 = this.field_e.field_c;
          if (this.field_e != var2) {
            var2.c(-124);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_e.field_c;
        if (this.field_e != var2Lifetime1) {
          var2Lifetime1.c(-124);
          return var2Lifetime1;
        }
        return null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return this.field_e.field_a == this.field_e ? true : false;
        }
        this.field_e = (wf) null;
        return this.field_e.field_a == this.field_e ? true : false;
    }

    final wf a(int param0) {
        if (param0 <= 50) {
          return (wf) null;
        }
        wf var2 = this.field_c;
        if (this.field_e != var2) {
          this.field_c = var2.field_c;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final static int a(int param0, as param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 80 / ((-18 - param0) / 45);
          if (param1 == bd.field_C) {
            stackIn_15_0 = 7681;
            return stackIn_15_0;
          }
          if (ru.field_a == param1) {
            stackIn_13_0 = 8448;
            return stackIn_13_0;
          }
          if (param1 == du.field_l) {
            stackIn_4_0 = 34165;
            return stackIn_4_0;
          }
          if (param1 == lo.field_j) {
            stackIn_7_0 = 260;
            return stackIn_7_0;
          }
          if (fs.field_d != param1) {
            throw new IllegalArgumentException();
          }
          stackIn_11_0 = 34023;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("kp.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = -40;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = pk.field_e.a(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = nh.field_c.a(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kp.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final wf e(int param0) {
        wf var2 = this.field_e.field_a;
        if (param0 <= 119) {
          return (wf) null;
        }
        if (var2 != this.field_e) {
          var2.c(-124);
          return var2;
        }
        return null;
    }

    final wf a(byte param0) {
        wf var2 = this.field_e.field_c;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_c;
        if (param0 <= -26) {
          return var2;
        }
        return (wf) null;
    }

    public static void f(int param0) {
        field_b = null;
        field_f = null;
        if (param0 == -19854) {
          field_d = null;
          field_a = null;
          return;
        }
        as var2 = (as) null;
        kp.a(-73, (as) null);
        field_d = null;
        field_a = null;
    }

    final void a(int param0, wf param1) {
        try {
          if (null != param1.field_c) {
            param1.c(-128);
          }
          param1.field_c = this.field_e.field_c;
          param1.field_a = this.field_e;
          if (param0 < 65) {
            String var4 = (String) null;
            kp.a(false, (String) null, true);
          }
          param1.field_c.field_a = param1;
          param1.field_a.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kp.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(wf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_c != null) {
            param0.c(param1 - 25736);
          }
          param0.field_a = this.field_e.field_a;
          param0.field_c = this.field_e;
          param0.field_c.field_a = param0;
          param0.field_a.field_c = param0;
          if (param1 == 25611) {
            return;
          }
          this.field_e = (wf) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kp.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final wf b(byte param0) {
        wf var2 = null;
        wf var2Lifetime1;
        if (param0 != 103) {
          String var3 = (String) null;
          kp.a(false, (String) null, true);
          var2 = this.field_c;
          if (var2 != this.field_e) {
            this.field_c = var2.field_a;
            return var2;
          }
          this.field_c = null;
          return null;
        }
        var2Lifetime1 = this.field_c;
        if (var2Lifetime1 != this.field_e) {
          this.field_c = var2Lifetime1.field_a;
          return var2Lifetime1;
        }
        this.field_c = null;
        return null;
    }

    final wf d(int param0) {
        wf var2 = this.field_e.field_a;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        }
        if (param0 == 268435455) {
          this.field_c = var2.field_a;
          return var2;
        }
        kp.f(-106);
        this.field_c = var2.field_a;
        return var2;
    }

    final void c(int param0) {
        wf var2 = null;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        while (true) {
          var2 = this.field_e.field_a;
          if (var2 == this.field_e) {
            break;
          }
          var2.c(param0 - 268435583);
        }
        if (param0 == 268435455) {
          this.field_c = null;
          return;
        }
        wf var4 = (wf) null;
        this.a((wf) null, 37);
        this.field_c = null;
    }

    public kp() {
        this.field_e = new wf();
        this.field_e.field_c = this.field_e;
        this.field_e.field_a = this.field_e;
    }

    static {
        field_a = new kc();
        field_d = new kc();
        field_b = ",";
        field_f = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
