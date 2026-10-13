/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private String field_l;
    static boolean field_a;
    static int field_j;
    static String field_k;
    static int field_i;
    static int field_b;
    static int field_h;
    private boolean field_g;
    static String field_d;
    static qh field_c;
    static ie field_f;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 != 2) {
          field_h = 108;
          if (wo.field_b == null) {
            return false;
          }
          if (null != wo.field_b.g(-113)) {
            return true;
          }
          return false;
        }
        if (wo.field_b == null) {
          return false;
        }
        if (null != wo.field_b.g(-113)) {
          return true;
        }
        return false;
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (rk.a((byte) -125, param1)) {
            return true;
          }
          if (!param0) {
            m.a(-100);
          }
          var6 = ce.field_f;
          var2 = var6;
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (~param1 == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = si.field_n;
          var3Lifetime1 = 0;
          while (true) {
            if (var2Lifetime1.length <= var3Lifetime1) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 != param1) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "m.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!MatchResultScreen.field_s) {
            return false;
          }
          if (ng.field_b == 2 &&
            kb.field_Qb != null) {
            var3 = (CharSequence) ((Object) param1);
            if (kb.field_Qb.equals(gb.a(var3, param0 - 13073))) {
              if (param0 == 13134) {
                return true;
              }
              field_e = (String) null;
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("m.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    m(String param0) {
        this(param0, false);
    }

    public static void c(int param0) {
        field_d = null;
        field_k = null;
        if (param0 == 2) {
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        }
        m.c(1);
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final String b(int param0) {
        if (param0 != 2) {
          field_k = (String) null;
          return this.field_l;
        }
        return this.field_l;
    }

    final boolean a(byte param0) {
        if (param0 <= 24) {
          field_k = (String) null;
          return this.field_g;
        }
        return this.field_g;
    }

    m(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = param0;
          if (null == this.field_l) {
            this.field_l = "";
          }
          stackIn_6_1 = (param1);
          this.field_g = stackIn_6_1;
          if (this.field_l.length() != 0) {
            return;
          }
          this.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("m.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = 0;
        field_k = "Loading fonts";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_e = "Visit the Account Management section on the main site to view.";
        field_c = new qh();
    }
}
