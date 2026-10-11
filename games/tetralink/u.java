/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private ec field_f;
    private ah field_c;
    static String field_d;
    static int field_a;
    static hl field_b;
    static fg field_g;
    private ah field_e;

    public static void b(int param0) {
        if (param0 == 32768) {
          field_b = null;
          field_g = null;
          field_d = null;
          return;
        }
        u.b(61);
        field_b = null;
        field_g = null;
        field_d = null;
    }

    final static boolean a(int param0) {
        if (!cl.field_e) {
          return false;
        }
        if (param0 <= 79) {
          field_b = (hl) null;
          if (sf.field_d == 0) {
            return true;
          }
          return false;
        }
        if (sf.field_d == 0) {
          return true;
        }
        return false;
    }

    final static String a(int param0, fj param1) {
        String stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        Object var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String var5 = null;
        Object var3Lifetime1;
        Object var3Lifetime1Lifetime1;
        var4 = TetraLink.field_J;
        try {
          var2 = null;
          if (param0 != 18440) {
            field_d = (String) null;
          }
          if (param1.field_e != null) {
            var5 = param1.field_e;
            var2 = var5;
            var3 = var2;
            var2 = var5;
            var2 = var5;
            if (param1.field_k == 1) {
              var2 = "<img=0>" + var5;
            }
            if (param1.field_k == 2) {
              var2 = "<img=1>" + (String) (var2);
              var3Lifetime1 = var2;
              var3Lifetime1Lifetime1 = var2;
            }
          }
          var3_ref = "";
          if (param1.field_i == 2) {
            if (!param1.field_l) {
              if (param1.field_g == 0 &&
                0 == param1.field_s) {
                var3_ref = sk.a(new String[]{(String) (var2)}, vd.field_b, 119);
              } else {
                var3_ref = sk.a(new String[]{(String) (var2)}, mc.field_h, param0 ^ 18544);
              }
            }
          } else {
            if (0 == param1.field_i &&
              go.field_c) {
              var3_ref = "[" + nm.field_v + "] ";
            }
            if (param1.field_i == 1) {
              var3_ref = "[" + sk.a(new String[]{param1.field_c}, qe.field_e, 127) + "] ";
            }
            if (param1.field_i == 4 &&
              ec.field_h != null) {
              var3_ref = "[" + ec.field_h + "] ";
            }
            if (param1.field_i == 3) {
              var3_ref = "[#" + param1.field_c + "] ";
            }
            if (!param1.field_l) {
              var3_ref = var3_ref + (String) (var2) + ": ";
            }
          }
          stackIn_30_0 = var3_ref;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("u.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oi.a((Throwable) (stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final j a(int param0, int param1) {
        j var3;
        byte[] var4;
        j var5;
        j var6;
        var3 = (j) (this.field_f.a((byte) 119, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4 = this.field_e.a(22, param0, 1);
        } else {
          var4 = this.field_c.a(-107, param0 & 32767, 1);
        }
        if (param1 < -125) {
          var6 = new j();
          if (var4 != null) {
            var6.a(new bh(var4), 15067);
          }
          if (param0 >= 32768) {
            var6.g(25271);
          }
          this.field_f.a(var6, (long)param0, (byte) 50);
          return var6;
        }
        this.a(-123, -16);
        var5 = new j();
        if (var4 != null) {
          var5.a(new bh(var4), 15067);
        }
        if (param0 >= 32768) {
          var5.g(25271);
        }
        this.field_f.a(var5, (long)param0, (byte) 50);
        return var5;
    }

    u(int param0, ah param1, ah param2, sm param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = new ec(64);
        try {
          this.field_c = param2;
          this.field_e = param1;
          if (this.field_e != null) {
            this.field_e.b(-23126, 1);
          }
          if (null == this.field_c) {
            return;
          }
          this.field_c.b(-23126, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("u.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_d = "Play free version";
    }
}
