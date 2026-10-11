/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends ik {
    static String field_m;
    static String[] field_h;
    static ko field_j;
    static String field_l;
    String field_i;
    static String field_k;
    static String field_n;

    void a(boolean param0, int param1, int param2) {
        if (param2 == 1) {
          go.field_l.a(this.field_i, this.field_a, 15 + this.field_d, param1, -1);
          return;
        }
        this.a(true, 102, -32);
        go.field_l.a(this.field_i, this.field_a, 15 + this.field_d, param1, -1);
    }

    public static void c(int param0) {
        field_k = null;
        field_l = null;
        field_j = null;
        if (param0 == -2) {
          field_h = null;
          field_m = null;
          field_n = null;
          return;
        }
        field_j = (ko) null;
        field_h = null;
        field_m = null;
        field_n = null;
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = CrazyCrystals.field_B;
        try {
          var3 = sm.a((byte) 127, param0, param2);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (param1 != 66) {
            field_m = (String) null;
          }
          var4 = 0;
          while (true) {
            if (param2.length() <= var4) {
              return null;
            }
            if (oh.a(param2.charAt(var4), (byte) 108)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_12_0 = vg.field_c;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("nk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    nk(int param0, int param1, String param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param2;
          this.field_a = param0;
          this.field_d = param1;
          this.field_b = go.field_l.a(param2);
          if (param3 == 1) {
            this.field_a = this.field_a - this.field_b;
          } else {
            if (param3 == 2) {
              this.field_a = this.field_a - this.field_b / 2;
            }
          }
          this.field_c = 20;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_m = "This is a log.<br><br>You can break it by<br>dropping a rock on it.";
        field_n = "Achievements";
        field_l = "(Including <%0>)";
        field_k = "Change display name";
    }
}
