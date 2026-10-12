/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends hs implements he {
    static int field_J;
    private no field_M;
    static int campaignPacketWord3;
    private fw field_K;

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -114, param3);
        if (param2 >= -82) {
          Widget var6 = (Widget) null;
          this.a(51, -1, -80, (Widget) null);
        }
        gl.field_e.b(mq.field_Nb, param0 - (-this.x - 4), 4 + (param1 + this.y) + gl.field_e.field_H, 16777215, -1);
    }

    wr(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetPainter) null);
        this.field_M = new no(new lu(10000536), c.field_c, 0, 0, 140, 25);
        this.field_M.a((byte) -101, new sb());
        this.field_K = new fw(ro.field_kb, (qo) (this));
        this.field_C = new Widget[]{(Widget) ((Object) this.field_M), (Widget) ((Object) this.field_K)};
        this.field_K.painter = (WidgetPainter) ((Object) new nu());
        this.e(0);
    }

    final void d(byte param0) {
        int var2 = 250;
        if (param0 < 84) {
          this.field_M = (no) null;
        }
        this.field_M.setBounds(-var2 + this.width >> 1, 140, -25 + (this.height + 20) >> 1, 8192, 25);
        this.field_K.setBounds(10 + ((-var2 + this.width >> 1) + 140), 100, 2 + (-30 + this.height + 20 >> 1), 8192, 30);
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          bw.field_g = true;
          vu.field_Q.field_X = param1;
          var2_int = so.field_b.field_a;
          var3 = so.field_b.field_g;
          var4 = vu.field_Q.field_Z.getParagraphHeight(param1, 272, vu.field_Q.field_pb);
          var5 = -(var4 / 2) + var3 / 2 - 103;
          if (param0 < 27) {
            field_J = -20;
          }
          qc.field_c.a(-(var5 * 2) + (-120 + var3), -20500, 320, var5, (var2_int - 320) / 2);
          qc.field_c.field_G = tq.a(11579568, false, qc.field_c.field_ob, 2105376, 3, 8421504);
          vu.field_Q.a(-20 + (qc.field_c.field_ob - 24), -20500, qc.field_c.field_gb - 48, 16, 24);
          td.field_g.a(24, -20500, 80, qc.field_c.field_ob - 20 - 24, 120);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (this.field_M.a(-918933630).a(false) != oo.field_g) {
          return;
        }
        if (param1 != 11) {
          return;
        }
        try {
          ak.a(this.field_M.l(param1 ^ 35), this.field_M.m(-26458), this.field_M.a((byte) -77), 30);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_8_0 = false;
        if (param1 != 95) {
          return false;
        }
        stackIn_8_0 = (param0 == 32) || (param0 == 40) || (param0 == 41);
        return stackIn_8_0;
    }

    final void a(int param0, int param1, int param2, Widget param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_K.field_I = this.field_M.a(-918933630).a(false) == oo.field_g ? true : false;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, aj param1, int param2) {
        CipherPacketBuffer var8 = null;
        CipherPacketBuffer var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var8 = vl.outgoingPacket;
          var9 = var8;
          var9.writeCipheredOpcode(32161, param2);
          var9.position = var9.position + 1;
          var4 = var9.position;
          var9.writeByte(1, 1);
          var9.writeShort(true, param1.field_s);
          var9.writeShort(true, param1.field_n);
          var9.writeShort(true, param1.field_q);
          var9.writeInt((byte) -99, param1.field_k);
          var9.writeInt((byte) -92, param1.field_m);
          var9.writeInt((byte) -103, param1.field_o);
          var9.writeInt((byte) -62, param1.field_r);
          var9.writeByte(1, param1.field_l.length);
          for (var5 = 0; var5 < param1.field_l.length; var5++) {
            var8.writeInt((byte) -70, param1.field_l[var5]);
          }
          if (param0 >= -26) {
            aj var7 = (aj) null;
            wr.a((byte) -126, (aj) null, 112);
          }
          var9.b((byte) -39, var4);
          var9.writeByteLengthPrefix(var9.position - var4, 5930);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wr.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
