/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RageAnimation extends EventAnimation {
    private RageEvent field_x;
    static daa field_v;
    static ok field_w;
    static String field_y;

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 > fieldTemp$0) {
          this.d(-26);
          int var2 = -71 / ((param0 - 71) / 47);
          return true;
        }
        if (this.field_l == 25) {
          this.f(121);
          return false;
        }
        return false;
    }

    final static void a(int param0, cfa param1, byte param2) {
        BitPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = sja.field_fb;
          var6.writeCipheredByte(param0, (byte) 116);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(1, 0);
          var6.writeByte(param1.field_g, 0);
          var6.writeByte(param1.field_i, 0);
          var6.writeInt(param1.field_j, -1615464796);
          var6.writeInt(param1.field_h, -1615464796);
          var6.writeInt(param1.field_k, -1615464796);
          var6.writeInt(param1.field_f, -1615464796);
          var6.a(var4, 19);
          var6.writeLengthByte((byte) 85, -var4 + var6.position);
          int var5 = 47 % ((1 - param2) / 47);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nr.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param2.previous != null) {
            param2.unlink(false);
          }
          param2.next = param1;
          param2.previous = param1.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          int var3_int = 33 / ((42 - param0) / 63);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        if (param0 != -26) {
          this.field_x = (RageEvent) null;
        }
    }

    private final void f(int param0) {
        EventEffect var3_ref = null;
        ad var7 = null;
        rq discarded$0 = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var6 = this.field_x.creature.a(49, this.screen.field_h);
        if (param0 < 12) {
          this.d(-101);
        }
        this.a(27799, new taa(this.screen, this.field_x.field_r.a(-27449, this.screen)));
        if (!var6.isDown(78)) {
          var3_ref = (EventEffect) (this.field_x.effects.b((byte) 90));
          al.a(-52, this.field_x.moveId);
          while (var3_ref != null) {
            var7 = var3_ref.target.a(-27449, this.screen);
            discarded$0 = new rq(this.screen, var7.field_s.tileX, var7.field_s.tileY);
            var3_ref.a(var6, this.screen.field_h, 12);
            var3_ref = (EventEffect) (this.field_x.effects.c(0));
          }
          return;
        }
    }

    public static void e(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
        if (param0 != 1) {
          IntrusiveNode var2 = (IntrusiveNode) null;
          RageAnimation.$cfr$intArgs$a$94cfdbf41ae0(91, (IntrusiveNode) null, (IntrusiveNode) null);
        }
    }

    RageAnimation(gj param0, RageEvent param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = "Respect";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$94cfdbf41ae0(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param2.previous != null) {
            param2.unlink(false);
          }
          param2.next = param1;
          param2.previous = param1.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          int var3_int = 33 / ((42 - param0) / 63);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
