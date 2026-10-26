/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends vo {
    private String field_f;
    static RenderSprite[][] field_k;
    static String[] field_e;
    private uu field_h;
    static dk field_m;
    private boolean field_i;
    static rk field_j;
    static String field_l;
    static String field_g;

    ii(bm param0, bm param1) {
        super(param0);
        this.field_f = "";
        this.field_i = false;
        try {
          this.field_h = new uu(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_m = null;
        field_l = null;
        field_k = (RenderSprite[][]) null;
        field_j = null;
        if (param0 == -22) {
          field_e = null;
          field_g = null;
          return;
        }
        field_g = (String) null;
        field_e = null;
        field_g = null;
    }

    final static int a(byte param0, jb param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == CipherPacketBuffer.field_p) {
            stackIn_12_0 = 5890;
            return stackIn_12_0;
          }
          if (ac.field_b == param1) {
            stackIn_3_0 = 34167;
            return stackIn_3_0;
          }
          if (un.field_i == param1) {
            stackIn_6_0 = 34168;
            return stackIn_6_0;
          }
          if (param1 == bs.field_a) {
            stackIn_10_0 = 34166;
            return stackIn_10_0;
          }
          if (param0 < 63) {
            field_e = (String[]) null;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ii.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.a(param0, 8192) == bt.field_a) {
            stackIn_2_0 = this.field_h.a(param0, (byte) 72);
            return stackIn_2_0;
          }
          if (param1 != 72) {
            this.field_i = true;
          }
          if (this.a(param0, 8192) != bt.field_a) {
            stackIn_9_0 = gh.field_o;
            return stackIn_9_0;
          }
          stackIn_7_0 = dk.field_i;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ii.EA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final pt a(String param0, int param1) {
        id var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        pt stackIn_2_0 = null;
        pt stackIn_6_0 = null;
        pt stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.a(param0, param1 ^ 0) == bt.field_a) {
            stackIn_2_0 = bt.field_a;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_f)) {
            var3 = rq.a(-111, param0);
            if (!var3.a(false)) {
              stackIn_6_0 = ce.field_t;
              return stackIn_6_0;
            }
            this.field_f = param0;
            this.field_i = var3.a(param1 - 10107);
          }
          if (param1 != 8192) {
            var4 = (String) null;
            this.a((String) null, (byte) 79);
          }
          if (this.field_i) {
            stackIn_13_0 = fd.field_a;
          } else {
            stackIn_13_0 = bt.field_a;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ii.DA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"Press 1 for speed increase", "Press 2 for improved fire rate", "Press 3 for improved manoeuvrability", "Press 4 for extra armour", "Press 5 for extra life", "Press 6 for extra wingmen", "Press 7 for score multiplier"};
        field_l = "settings";
        ek.a((byte) 116, 1600);
        field_g = "Passwords can only contain letters and numbers";
    }
}
