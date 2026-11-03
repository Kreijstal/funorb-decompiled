/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OhNoEvent extends SpecialEvent {
    int field_r;
    int field_q;
    static int field_s;

    OhNoEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    final int[][] d(byte param0) {
        if (param0 != 2) {
          OhNoEvent.d(-82);
          return (int[][]) null;
        }
        return (int[][]) null;
    }

    final static void d(int param0) {
        ho.field_j = null;
        hna.field_h = null;
        mla.field_b = null;
        SetFriendlyEffect.field_k = null;
        ls.field_a = null;
        du.field_b = null;
        sj.field_k = null;
        ge.field_K = null;
        iga.field_a = null;
        SnowAnimation.field_y = null;
        RageSpecial.field_p = null;
        uu.field_vb = null;
        iw.field_b = null;
        kka.field_f = null;
        co.field_b = null;
        hh.field_b = null;
        DreamsEvent.field_r = null;
        il.field_a = null;
        hl.field_D = null;
        lf.field_b = null;
        DefaultWidgetRenderer.field_h = null;
        BuffVendorAnimation.field_C = null;
        ik.field_h = null;
        nia.field_l = null;
        PacketBuffer.field_f = null;
        BattleState.field_I = null;
        rw.field_a = null;
        if (null != dj.field_c) {
          dj.field_c.field_s.field_k = null;
        }
        vj.field_m = null;
        lw.field_b = null;
        hb.field_k = null;
        ShieldAnimation.field_v = null;
        fe.field_j = null;
        am.field_M = null;
        ve.field_m = (Sprite[][]) null;
        bfa.field_b = null;
        StickyAnimation.field_x = null;
        wd.field_w = null;
        IncomingAnimation.field_v = null;
        un.field_m = null;
        GasCloudEvent.field_q = null;
        aea.field_k = null;
        lga.field_k = null;
        hp.field_b = null;
        nha.field_a = null;
        de.field_F = null;
        sia.field_g = null;
        nv.field_wb = null;
        en.field_a = null;
        pk.field_b = null;
        qna.field_l = null;
        pfa.field_g = null;
        cba.field_c = null;
        ff.field_u = null;
        MusicPatch.field_g = (IndexedSprite[][]) null;
        ela.field_j = null;
        qq.field_i = null;
        it.field_i = null;
        vi.field_f = null;
        as.field_a = null;
        SauceOfFlameAnimation.field_v = (IndexedSprite[][]) null;
        ed.field_f = null;
        ula.field_h = null;
        IterableDualLinkDeque.field_d = null;
        SleepAnimation.field_y = null;
        ip.field_f = null;
        nca.field_a = null;
        if (param0 == 34) {
          DelegatingCanvas.field_c = null;
          ena.field_l = null;
          CurryArenaTheme.field_g = null;
          ld.field_l = null;
          fw.field_f = null;
          sv.field_c = null;
          il.field_b = null;
          Runtime.getRuntime().gc();
          return;
        }
        PacketBuffer var2 = (PacketBuffer) null;
        OhNoEvent.b((byte) 59, (PacketBuffer) null);
        DelegatingCanvas.field_c = null;
        ena.field_l = null;
        CurryArenaTheme.field_g = null;
        ld.field_l = null;
        fw.field_f = null;
        sv.field_c = null;
        il.field_b = null;
        Runtime.getRuntime().gc();
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        BattleState var4 = null;
        OhNoAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (BattleState) null;
            this.a((BattleState) null, 123);
          }
          stackIn_3_0 = new OhNoAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("iba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static EventEffect b(byte param0, PacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ClearTileFlagEffect stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -101) {
            OhNoEvent.d(107);
          }
          var2_int = param1.readUnsignedByte(16711935);
          var3 = param1.readUnsignedByte(16711935);
          stackIn_3_0 = new ClearTileFlagEffect(var2_int, var3);
          return (EventEffect) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("iba.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    OhNoEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 103);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
          this.field_q = param0.readUnsignedByte(16711935);
          this.field_r = param0.readUnsignedByte(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "iba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          this.creature.a(91, param0);
          param0.setTerrain((byte) -85, 34, this.field_q, this.field_r);
          int var3_int = -88 % ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "iba.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        super.a((byte) -62, param1);
        param1.writeByte(this.field_q, 0);
        if (param0 >= -12) {
          return;
        }
        try {
          param1.writeByte(this.field_r, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "iba.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
