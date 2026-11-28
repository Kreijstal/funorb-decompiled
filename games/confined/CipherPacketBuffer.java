/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static DisplayNameSelectionPanel field_u;
    private int field_p;
    static String field_v;
    private IsaacRandom field_q;
    static String field_s;
    static PcmStreamMixer field_r;
    static String field_t;

    final void i(int param0) {
        this.field_p = this.position * param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          for (var5_int = param1; param2 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int + param3] = (byte)(this.payload[fieldTemp$0] - this.field_q.nextInt(km.a(param1, 256)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hb.NA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    final void b(boolean param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(this.field_q.nextInt(256) + param1);
        if (!param0) {
          this.j(-107);
        }
    }

    final void a(int[] param0, int param1) {
        try {
          int var3_int = -124 % ((17 - param1) / 51);
          this.field_q = new IsaacRandom(param0);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "hb.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 122) {
            return;
          }
          LightningArc.field_qb = LightningArc.field_qb + 1;
          if (-1 == RichTextLayout.field_t &&
            -1 == AcceleratingProjectile.field_Q) {
            RichTextLayout.field_t = ld.field_l;
            AcceleratingProjectile.field_Q = jh.field_R;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(DefaultTextWidgetRenderer.field_o));
          } else {
            decompiledFrameRemainder0 = (DefaultTextWidgetRenderer.field_o == null);
          }
          if (decompiledFrameRemainder0) {
            if (!DampedProjectile.field_R) {
              if (kc.field_t <= LightningArc.field_qb) {
                stackIn_18_0 = (kc.field_t + LightningArc.field_nb > LightningArc.field_qb) ? 1 : 0;
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
            var2_int = stackIn_18_0;
            if (param1 == null) {
              LightningArc.field_qb = 0;
            } else {
              if (DampedProjectile.field_R) {
                LightningArc.field_qb = kc.field_t;
              } else {
                if (var2_int == 0) {
                  LightningArc.field_qb = 0;
                } else {
                  LightningArc.field_qb = kc.field_t;
                }
              }
            }
            if (param1 != null) {
              DampedProjectile.field_R = false;
            } else {
              if (var2_int != 0) {
                DampedProjectile.field_R = true;
              }
            }
            nm.field_I = RichTextLayout.field_t;
            he.field_f = AcceleratingProjectile.field_Q;
          }
          DefaultTextWidgetRenderer.field_o = param1;
          if (!DampedProjectile.field_R &&
            LightningArc.field_qb < kc.field_t &&
            GameSession.field_D) {
            LightningArc.field_qb = 0;
            he.field_f = AcceleratingProjectile.field_Q;
            nm.field_I = RichTextLayout.field_t;
          }
          if (DampedProjectile.field_R &&
            LightningArc.field_qb == qa.field_f) {
            LightningArc.field_qb = 0;
            DampedProjectile.field_R = false;
          }
          RichTextLayout.field_t = -1;
          AcceleratingProjectile.field_Q = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("hb.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var3 = this.field_p >> 3;
        int var4 = 8 - (7 & this.field_p);
        this.field_p = this.field_p + param0;
        int var5 = param1;
        while (var4 < param0) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((GameSession.field_C[var4] & this.payload[incrementValue$0]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 != var4) {
          var5 = var5 + (this.payload[var3] >> var4 - param0 & GameSession.field_C[param0]);
        } else {
          var5 = var5 + (GameSession.field_C[var4] & this.payload[var3]);
        }
        return var5;
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final int h(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == -1) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.field_q.nextInt(param0 ^ -257) & 255;
        }
        field_r = (PcmStreamMixer) null;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.field_q.nextInt(param0 ^ -257) & 255;
    }

    final void j(int param0) {
        int var2 = 126 % ((77 - param0) / 38);
        this.position = (this.field_p + 7) / 8;
    }

    public static void clearStaticReferences(int param0) {
        field_r = null;
        field_s = null;
        field_t = null;
        if (param0 == -1) {
          field_u = null;
          field_v = null;
          return;
        }
        CipherPacketBuffer.clearStaticReferences(10);
        field_u = null;
        field_v = null;
    }

    static {
        field_s = "Score";
        field_t = "Confirm Password: ";
    }
}
