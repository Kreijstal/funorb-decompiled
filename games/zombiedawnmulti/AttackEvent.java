/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AttackEvent extends GameEvent {
    static String field_j;
    private int field_l;
    private int field_k;
    private int field_m;
    static IndexedSprite field_n;
    private int field_i;

    public static void releaseStatics(byte param0) {
        if (param0 < 116) {
          return;
        }
        field_n = null;
        field_j = null;
    }

    final static void b(boolean param0, int param1) {
        int var3 = 0;
        CipherPacketBuffer var2 = ma.field_a;
        int var3Lifetime1;
        var2.writeCipheredOpcode((byte) -35, param1);
        var2.position = var2.position + 1;
        if (param0) {
          var3 = var2.position;
          var2.writeByte(-116, 2);
          var2.writeBytes(ScoreUpdateEvent.field_k, ScoreUpdateEvent.field_k.length, 0, 123);
          var2.writeByte(123, pb.field_h);
          var2.writeByte(125, sc.field_f);
          var2.writeBytes(tg.field_a, tg.field_a.length, 0, 119);
          var2.e(113, var2.position - var3);
          return;
        }
        AttackEvent.b(true, -17);
        var3Lifetime1 = var2.position;
        var2.writeByte(-116, 2);
        var2.writeBytes(ScoreUpdateEvent.field_k, ScoreUpdateEvent.field_k.length, 0, 123);
        var2.writeByte(123, pb.field_h);
        var2.writeByte(125, sc.field_f);
        var2.writeBytes(tg.field_a, tg.field_a.length, 0, 119);
        var2.e(113, var2.position - var3Lifetime1);
    }

    final void removeFromQueue(byte param0) {
        if (param0 <= -47) {
          super.removeFromQueue((byte) -82);
          ic.field_c.addFirst((IntrusiveNode) (this), false);
          return;
        }
        GameScreen var3 = (GameScreen) null;
        this.apply(70, (GameScreen) null);
        super.removeFromQueue((byte) -82);
        ic.field_c.addFirst((IntrusiveNode) (this), false);
    }

    final void apply(int param0, GameScreen param1) {
        try {
          param1.applyAttack(-1181, this.field_l, this.field_m, this.field_i, this.field_k);
          if (param0 != 0) {
            this.field_k = 117;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawDebugOverlay(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          this.field_l = 93;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        super.setTick(param4 - 14, param0);
        this.field_m = param3;
        if (param4 == 14) {
          this.field_k = param2;
          this.field_i = param1;
          this.field_l = param5;
          return;
        }
        this.field_i = -59;
        this.field_k = param2;
        this.field_i = param1;
        this.field_l = param5;
    }

    final static void a(int param0, int param1, int param2) {
        am.field_c = param1;
        if (param2 != 1633) {
          field_j = (String) null;
          AgeValidator.field_r = param0;
          return;
        }
        AgeValidator.field_r = param0;
    }

    AttackEvent() {
    }

    static {
        field_j = "All games";
    }
}
