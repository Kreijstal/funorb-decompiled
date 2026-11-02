/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gka extends AnimationNode {
    static String field_m;
    private BattleScreen field_p;
    private ns field_o;
    static rga field_n;
    private boolean field_j;
    private ActorAnimation field_k;
    private mr field_l;
    private boolean field_q;
    static String field_r;

    final static void a(int param0, int param1) {
        int var2 = -95 / ((12 - param0) / 62);
        bs.field_k = param1;
        if (null != uf.field_c) {
          uf.field_c.a(23679, param1);
          if (null != kw.field_j) {
            kw.field_j.a(param1, true);
            return;
          }
          return;
        }
        if (null == kw.field_j) {
          return;
        }
        kw.field_j.a(param1, true);
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        field_m = null;
        if (param0 != -3) {
          field_n = (rga) null;
          field_n = null;
          return;
        }
        field_n = null;
    }

    private final void d(int param0) {
        if (param0 < 80) {
          this.field_k = (ActorAnimation) null;
        }
    }

    final static CreatureProfile a(PacketBuffer param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CreatureProfile var3 = null;
        Object stackIn_2_0 = null;
        CreatureProfile stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.readUnsignedByte(16711935);
          if (var2_int == param1) {
            stackIn_2_0 = null;
            return (CreatureProfile) (stackIn_2_0);
          }
          var3 = new CreatureProfile(gfa.field_a[var2_int]);
          var3.a(param0, false);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("gka.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isFinished(byte param0) {
        if (this.field_k.isLinked((byte) -106)) {
          return false;
        }
        int var2 = 112 % ((71 - param0) / 47);
        if (!this.field_q) {
          this.field_q = true;
          MartyrAnimation.a(43, (byte) 126);
        }
        if (this.field_j) {
          this.addChild(27799, new fha(this.field_l));
          this.d(91);
          return true;
        }
        this.field_p.field_s.field_d = this.field_p.field_s.field_d - 2;
        if (!(0 > this.field_p.field_s.field_d)) {
          return false;
        }
        CreatureActor var3 = this.field_o.field_n.a(-27449, this.field_p);
        this.field_k = new ActorAnimation(this.field_p, var3);
        this.addChild(27799, this.field_k);
        this.field_j = true;
        this.field_l = new mr(this.field_p, this.field_o, var3.field_s.tileX, var3.field_s.tileY);
        return false;
    }

    gka(BattleScreen param0, ns param1) {
        this.field_q = false;
        try {
          this.field_p = param0;
          this.field_o = param1;
          this.field_k = new ActorAnimation(this.field_p, (this.field_p.field_h.width >> 1) - 1, -3);
          this.addChild(27799, this.field_k);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "gka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Kick <%0> from this game";
        field_n = new rga();
        field_r = "Fly captured!";
    }
}
