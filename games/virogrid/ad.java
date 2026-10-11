/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static String field_f;
    static String field_a;
    static mg field_b;
    static String field_j;
    private eh field_k;
    private sl field_d;
    static boolean field_h;
    static boolean field_l;
    private eh field_e;
    static int field_i;
    static int field_c;
    static double[] field_g;

    final th a(byte param0, int param1) {
        th var3;
        byte[] var4;
        th var5;
        th var6;
        th var3Lifetime1;
        th var3Lifetime2;
        byte[] var4Lifetime1;
        if (param0 == 125) {
          var3 = (th) (this.field_d.b((long)param1, 0));
          if (var3 != null) {
            return var3;
          }
          if (param1 < 32768) {
            var4 = this.field_e.a(1, param1, 0);
          } else {
            var4 = this.field_k.a(1, 32767 & param1, 0);
          }
          var6 = new th();
          if (var4 != null) {
            var6.a(new jc(var4), 0);
          }
          if (param1 >= 32768) {
            var6.d(false);
          }
          this.field_d.a(var6, (long)param1, param0 ^ -14619);
          return var6;
        }
        field_c = -78;
        var3Lifetime1 = (th) (this.field_d.b((long)param1, 0));
        if (var3Lifetime1 != null) {
          return var3Lifetime1;
        }
        if (param1 < 32768) {
          var4Lifetime1 = this.field_e.a(1, param1, 0);
        } else {
          var4Lifetime1 = this.field_k.a(1, 32767 & param1, 0);
        }
        var5 = new th();
        var3Lifetime2 = var5;
        if (var4Lifetime1 != null) {
          var5.a(new jc(var4Lifetime1), 0);
        }
        if (param1 >= 32768) {
          var5.d(false);
        }
        this.field_d.a(var5, (long)param1, param0 ^ -14619);
        return var5;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 90) {
          return;
        }
        field_a = null;
        field_f = null;
        field_j = null;
        field_g = null;
    }

    ad(int param0, eh param1, eh param2, be param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_d = new sl(64);
        try {
          this.field_e = param1;
          this.field_k = param2;
          if (this.field_e != null) {
            this.field_e.d((byte) 91, 1);
          }
          if (null == this.field_k) {
            return;
          }
          this.field_k.d((byte) 88, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ad.<init>(").append(param0).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (param1 == 15232) {
          if (kn.a(param0, (byte) -69)) {
            return true;
          }
          if (45 != param0 &&
            param0 != 160 &&
            32 != param0 &&
            95 != param0) {
            return false;
          }
          return true;
        }
        ad.a(')', -111);
        if (kn.a(param0, (byte) -69)) {
          return true;
        }
        if (45 == param0) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (32 == param0) {
          return true;
        }
        if (95 == param0) {
          return true;
        }
        return false;
    }

    static {
        field_a = "<%0> would need a rating of <%1> to play with the current options.";
        field_l = true;
        field_f = "ON";
        field_c = 22;
    }
}
