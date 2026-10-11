/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SentinelCommand extends IntrusiveNode {
    boolean field_q;
    static boolean field_v;
    static NodeDeque field_w;
    boolean scheduled;
    int actionVariant;
    static int field_o;
    int startTick;
    int actionType;
    int aimAngle;
    int targetWorldX;
    int targetWorldY;
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
          NodeHashTable.a(9324);
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

    SentinelCommand(int actionType, int actionVariant, int startTick) {
        int durationTicks;
        this.startTick = startTick;
        this.actionType = actionType;
        this.field_q = false;
        this.actionVariant = actionVariant;
        this.scheduled = false;
        durationTicks = 50;
        this.activated = false;
        if (this.actionType == 6) {
          durationTicks = 5;
        }
        if (this.actionType == 5) {
          this.activated = true;
          durationTicks = 125;
        }
        if (this.actionType == 12) {
          this.activated = false;
          durationTicks = 5;
        }
        if (this.actionType == 3) {
          this.activated = true;
          durationTicks = 100;
        }
        if (0 == this.actionType) {
          durationTicks = 10;
          if (this.actionVariant == 0) {
            durationTicks = 25;
          }
          if (1 == this.actionVariant) {
            durationTicks = 20;
          }
          if (this.actionVariant == 2) {
            durationTicks = 35;
          }
          if (3 == this.actionVariant) {
            durationTicks = 50;
          }
          if (6 == this.actionVariant) {
            durationTicks = 40;
            this.activated = true;
          }
          if (this.actionVariant == 7) {
            durationTicks = 50;
            this.activated = true;
          }
          if (8 == this.actionVariant) {
            durationTicks = 100;
            this.activated = true;
          }
          if (this.actionVariant == 9) {
            durationTicks = 30;
            this.activated = true;
          }
          if (this.actionVariant == 10) {
            durationTicks = 20;
            this.activated = true;
          }
          if (this.actionVariant == 4) {
            durationTicks = 75;
          }
          if (5 == this.actionVariant) {
            durationTicks = 75;
          }
        }
        if (this.actionType == 7) {
          this.activated = true;
          durationTicks = 25;
          if (3 == this.actionVariant) {
            durationTicks = 100;
          }
        }
        if (this.actionType == 8) {
          durationTicks = 25;
          this.activated = true;
        }
        if (this.actionType == 9) {
          this.activated = true;
          durationTicks = 25;
        }
        if (11 == this.actionType) {
          durationTicks = 25;
          this.activated = false;
        }
        if (this.actionType == 10) {
          durationTicks = 1;
        }
        this.endTick = durationTicks + this.startTick;
    }

    static {
        field_v = false;
        field_o = 0;
        field_w = new NodeDeque();
    }
}
