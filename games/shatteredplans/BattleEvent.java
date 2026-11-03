/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BattleEvent extends IntrusiveNode {
    static String field_s;
    int field_l;
    Player field_w;
    Star field_p;
    IntrusiveDeque field_v;
    Player field_i;
    static qr field_u;
    int field_n;
    static String[] field_x;
    int[] field_j;
    static SecondaryNodeHashTable field_q;
    int[] field_k;
    static int field_o;
    Territory field_m;
    Player[] field_h;
    static int field_t;
    static String field_r;

    final static fb a(int param0, int param1) {
        if (param1 != 30888) {
          return (fb) null;
        }
        return IsaacBackedRandom.field_b == null ? null : (fb) (IsaacBackedRandom.field_b.get(65280, (long)param0));
    }

    public static void a(int param0) {
        field_q = null;
        field_u = null;
        if (param0 <= 5) {
          field_s = (String) null;
        }
        field_r = null;
        field_x = null;
        field_s = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_n = this.field_n + param0;
        this.field_v.addLast((byte) -113, new BattleContribution(this.field_w, param1, param0, param2));
        int var5 = -83 / ((48 - param3) / 45);
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 14775) {
          field_r = (String) null;
        }
        this.field_n = this.field_n + param2;
        this.field_v.addLast((byte) -113, new BattleContribution(this.field_w, param0, param2, 0));
    }

    final static void a(int param0, wj param1, boolean param2) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        CipherPacketBuffer var7 = js.field_f;
        CipherPacketBuffer var8 = var7;
        var8.h(param0, 255);
        var8.position = var8.position + 1;
        int var4 = var8.position;
        var8.writeByte(1, (byte) -86);
        var8.writeShort(param1.field_h, 255);
        var8.writeShort(param1.field_m, 255);
        var8.writeShort(param1.field_j, 255);
        var8.writeInt(11135, param1.field_q);
        var8.writeInt(11135, param1.field_o);
        var8.writeInt(11135, param1.field_p);
        var8.writeInt(11135, param1.field_l);
        var8.writeByte(param1.field_i.length, (byte) -104);
        if (!param2) {
          return;
        }
        try {
          for (var5 = 0; var5 < param1.field_i.length; var5++) {
            var7.writeInt(11135, param1.field_i[var5]);
          }
          var8.writeChecksum(var4, -24);
          var8.patchLengthByte(-var4 + var8.position, (byte) 127);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "eg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 73) {
          BattleEvent.b(44, -8, 127);
        }
        return null != ck.field_a ? true : false;
    }

    final static tq c(int param0, int param1) {
        tq var2 = new tq(param0, false);
        if (param1 != 0) {
          field_u = (qr) null;
        }
        return var2;
    }

    final void a(byte param0, int[] param1) {
        try {
          if (param0 <= 35) {
            this.field_j = (int[]) null;
          }
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "eg.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, FleetMove param2, int param3) {
        try {
          this.field_v.addLast((byte) -113, new BattleContribution(param2, param3, param0));
          this.field_n = this.field_n + param3;
          if (param1 != 0) {
            this.field_w = (Player) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "eg.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    BattleEvent(Star param0, Player[] param1, int[] param2) {
        try {
          this.field_h = param1;
          this.field_p = param0;
          this.field_j = (int[]) ((Object) param2.clone());
          this.field_w = this.field_p.field_y;
          this.field_v = new IntrusiveDeque();
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        QuaternaryLinkNode.field_w = param0;
        if (param2 != 0) {
          field_u = (qr) null;
        }
        ObjectList.field_i = param1;
    }

    static {
        field_s = "Try changing the following settings:  ";
        field_x = new String[]{"<%0> Souls", "<%0> Ships", "<%0> Suns", "the <%0> Moon", "<%0> Peace", "the <%0> War", "<%0> Stars", "the <%0> People", "the <%0> Lights", "the <%0> Gate", "<%0> Empires", "<%0> Worlds", "<%0> Shadow", "<%0> Thunder", "the <%0> Storm", "<%0> Night", "<%0> Triumphs", "<%0> Steel", "<%0> Dreams"};
        field_r = "Players: <%0>/<%1>";
    }
}
