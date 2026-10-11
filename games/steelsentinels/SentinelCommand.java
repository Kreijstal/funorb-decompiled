/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SentinelCommand extends IntrusiveNode {
    boolean field_q;
    static boolean field_v;
    static NodeDeque field_w;
    boolean field_p;
    int actionVariant;
    static int field_o;
    int startTick;
    int actionType;
    int field_B;
    int field_u;
    int field_y;
    int endTick;
    boolean activated;
    static int field_t;

    public static void a(byte param0) {
        field_w = null;
        if (param0 >= -102) {
          byte[] var2 = (byte[]) null;
          SentinelCommand.a(-111, (byte[]) null);
        }
    }

    final static u a(int param0, byte[] param1) {
        u var2 = null;
        RuntimeException var2_ref = null;
        u stackIn_5_0 = null;
        u stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 < 57) {
            stackIn_5_0 = (u) null;
            return stackIn_5_0;
          }
          var2 = new u(param1, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
          uh.a(9324);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("je.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    SentinelCommand(int param0, int param1, int param2) {
        int var4;
        this.startTick = param2;
        this.actionType = param0;
        this.field_q = false;
        this.actionVariant = param1;
        this.field_p = false;
        var4 = 50;
        this.activated = false;
        if (this.actionType == 6) {
          var4 = 5;
        }
        if (this.actionType == 5) {
          this.activated = true;
          var4 = 125;
        }
        if (this.actionType == 12) {
          this.activated = false;
          var4 = 5;
        }
        if (this.actionType == 3) {
          this.activated = true;
          var4 = 100;
        }
        if (0 == this.actionType) {
          var4 = 10;
          if (this.actionVariant == 0) {
            var4 = 25;
          }
          if (1 == this.actionVariant) {
            var4 = 20;
          }
          if (this.actionVariant == 2) {
            var4 = 35;
          }
          if (3 == this.actionVariant) {
            var4 = 50;
          }
          if (6 == this.actionVariant) {
            var4 = 40;
            this.activated = true;
          }
          if (this.actionVariant == 7) {
            var4 = 50;
            this.activated = true;
          }
          if (8 == this.actionVariant) {
            var4 = 100;
            this.activated = true;
          }
          if (this.actionVariant == 9) {
            var4 = 30;
            this.activated = true;
          }
          if (this.actionVariant == 10) {
            var4 = 20;
            this.activated = true;
          }
          if (this.actionVariant == 4) {
            var4 = 75;
          }
          if (5 == this.actionVariant) {
            var4 = 75;
          }
        }
        if (this.actionType == 7) {
          this.activated = true;
          var4 = 25;
          if (3 == this.actionVariant) {
            var4 = 100;
          }
        }
        if (this.actionType == 8) {
          var4 = 25;
          this.activated = true;
        }
        if (this.actionType == 9) {
          this.activated = true;
          var4 = 25;
        }
        if (11 == this.actionType) {
          var4 = 25;
          this.activated = false;
        }
        if (this.actionType == 10) {
          var4 = 1;
        }
        this.endTick = var4 + this.startTick;
    }

    static {
        field_v = false;
        field_o = 0;
        field_w = new NodeDeque();
    }
}
