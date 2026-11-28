/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ql {
    private v field_k;
    private GridPoint[] field_r;
    private v field_i;
    private v field_v;
    private v field_H;
    private GridPoint field_l;
    private v field_t;
    private GridPoint field_h;
    private GridPoint field_g;
    private GridPoint field_o;
    private v field_d;
    private GridPoint field_A;
    private v field_D;
    private v field_q;
    private v field_y;
    private oj field_x;
    private GridPoint field_u;
    private GridPoint field_z;
    private v field_p;
    private int field_f;
    private v field_w;
    private GridPoint field_j;
    static PacketBuffer field_s;
    static RgbSprite field_C;
    private GridPoint field_G;
    static boolean field_n;
    private v field_m;
    private GridPoint field_F;
    static int[] field_e;
    static String field_E;
    static IndexedSprite[] field_B;

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        var3 = param0;
        while (var3 < ProxySocketFactory.field_j) {
          if (TextHotspotBounds.field_m[var3] != null &&
            TextHotspotBounds.field_m[var3].field_i == 27) {
            var2 = 1;
          } else {
            var3++;
            continue;
          }
          break;
        }
        if (var2 == 0) {
          ti.a(229, (byte) -118, 26);
        }
        return;
    }

    final void d(int param0) {
        int var3;
        GridPoint var4;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var4 = TextHotspotBounds.field_m[0].field_j;
        if (0 == this.field_D.field_a) {
          if (VolumeRampingMidiPcmStream.field_Q[5]) {
            this.field_D.field_a = 2;
          } else {
            if (SocketArchiveNetworkClient.a(var4, (byte) -97, this.field_l) < 2) {
              this.field_D.field_a = 1;
            }
          }
        }
        if (null != this.field_x &&
          this.field_x.field_I <= 0) {
          this.field_D.field_a = 2;
          this.field_x = null;
          this.field_H.field_a = 2;
        }
        if (~this.field_H.field_a == param0 &&
          VolumeRampingMidiPcmStream.field_Q[5]) {
          this.field_H.field_a = 1;
        }
        if (this.field_q.field_a == 0 &&
          SocketArchiveNetworkClient.a(var4, (byte) -117, this.field_F) < 2) {
          this.field_q.field_a = 1;
        }
        if (this.field_v.field_a == 0 &&
          SocketArchiveNetworkClient.a(var4, (byte) -76, this.field_j) < 2) {
          this.field_v.field_a = 1;
        }
        if (this.field_m.field_a == 0 &&
          SocketArchiveNetworkClient.a(var4, (byte) -97, this.field_z) < 2) {
          this.field_m.field_a = 1;
        }
        if (this.field_t.field_a == 0 &&
          2 > SocketArchiveNetworkClient.a(var4, (byte) -125, this.field_u)) {
          this.field_t.field_a = 1;
          this.field_p.field_a = 1;
          if (!VolumeRampingMidiPcmStream.field_Q[5] &&
            !VolumeRampingMidiPcmStream.field_Q[7]) {
            this.field_t.field_a = 2;
          } else {
            this.field_p.field_a = 2;
          }
        }
        if (this.field_w.field_a == 0 &&
          SocketArchiveNetworkClient.a(var4, (byte) -73, this.field_g) < 2) {
          this.field_w.field_a = 1;
        }
        if (this.field_k.field_a == 0) {
          if (2 > SocketArchiveNetworkClient.a(var4, (byte) -127, this.field_r[0])) {
            this.field_k.field_a = 1;
            this.field_k.field_d = this.field_r[0].field_g * 24;
            this.field_k.field_l = 24 * (this.field_r[0].field_e + 2);
          } else {
            if (2 > SocketArchiveNetworkClient.a(var4, (byte) -107, this.field_r[1])) {
              this.field_k.field_l = -this.field_k.field_m + 24 * (-2 + this.field_r[1].field_e);
              this.field_k.field_a = 1;
              this.field_k.field_d = (this.field_r[1].field_g - 2) * 24 - this.field_k.field_h;
            }
          }
        }
        if (this.field_i.field_a == 0 &&
          2 > SocketArchiveNetworkClient.a(var4, (byte) -110, this.field_G)) {
          this.field_i.field_a = 1;
        }
        if (this.field_y.field_a == 0 &&
          SocketArchiveNetworkClient.a(var4, (byte) -88, this.field_h) < 2) {
          this.field_y.field_a = 1;
        }
        if ((ng.field_u & 15) == 0 &&
          null != this.field_x) {
          this.a(this.field_A, -1);
        }
        super.d(param0 ^ 0);
    }

    final static int c(byte param0) {
        if (param0 > -19) {
          field_s = (PacketBuffer) null;
          return 1;
        }
        return 1;
    }

    final void a(int param0, oj param1) {
        int var4 = 0;
        GridPoint var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          this.field_f = this.field_f - 1;
          if (this.field_f == 1) {
            var5 = TextHotspotBounds.field_m[0].field_j;
            this.field_d.field_a = 1;
            if (var5.field_g < 40) {
              this.field_d.field_l = 1968;
              this.field_d.field_d = 552;
            } else {
              if (var5.field_e < 48) {
                this.field_d.field_l = 360;
                this.field_d.field_d = 1536;
              } else {
                this.field_d.field_l = 1776;
                this.field_d.field_d = 2136;
              }
            }
          }
          if (this.field_f == 0) {
            r.field_a = 0;
            le.field_D = 500;
            tb.field_N = le.field_D;
          } else {
            r.field_a = 1;
            TextLineMetrics.field_d = TextLineMetrics.field_d - 7;
            tb.field_N = 150;
          }
          var3_int = -76 % ((23 - param0) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ob.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void e(int param0) {
        int[] var2;
        int var3;
        int var4;
        int[] var5;
        int[] var7;
        int[] var8;
        int var6;
        int var3Lifetime1;
        var4 = HostileSpawn.field_I ? 1 : 0;
        this.field_f = 3;
        var8 = ln.field_a.field_v;
        var7 = var8;
        var5 = var7;
        var2 = var5;
        this.field_o = new GridPoint(var8[2], var8[3]);
        this.field_l = new GridPoint(var8[4], var8[5]);
        this.field_F = new GridPoint(var8[10], var8[11]);
        this.field_j = new GridPoint(var8[16], var8[17]);
        this.field_z = new GridPoint(var8[12], var8[13]);
        this.field_g = new GridPoint(var8[18], var8[19]);
        this.field_G = new GridPoint(var8[14], var8[15]);
        this.field_h = new GridPoint(var8[22], var8[23]);
        this.field_u = new GridPoint(var8[24], var8[25]);
        this.field_r[0] = new GridPoint(var8[28], var8[29]);
        this.field_r[1] = new GridPoint(var8[30], var8[31]);
        this.field_D = new v(BufferedSocket.field_p, 48 + 24 * this.field_l.field_e, -20 + 24 * (this.field_l.field_g - 3));
        this.field_H = new v(sa.field_e, 24 * var8[6], -30 + (-96 + var8[7] * 24), 150);
        this.field_q = new v(sa.field_b, 0, 48 + 24 * this.field_F.field_g);
        this.field_q.field_l = -this.field_q.field_m + (this.field_F.field_e - 3) * 24;
        this.field_v = new v(u.field_b, 24 * this.field_j.field_e - 24, 48 + this.field_j.field_g * 24);
        this.field_m = new v(DebouncedFieldValidator.field_h, this.field_z.field_e * 24, -96 + this.field_z.field_g * 24 - 30);
        this.field_t = new v(DualLinkDeque.field_f, 0, this.field_u.field_g * 24);
        this.field_t.field_l = 48 + 24 * this.field_u.field_e;
        this.field_p = new v(m.field_p, 0, this.field_u.field_g * 24);
        this.field_p.field_l = (2 + this.field_u.field_e) * 24;
        this.field_w = new v(m.field_j, this.field_g.field_e * 24, 24 * this.field_g.field_g - 102);
        this.field_k = new v(bi.field_e, 0, 0);
        this.field_i = new v(eg.field_p, 0, 24 * (this.field_G.field_g + 2));
        this.field_i.field_l = 24 * (this.field_G.field_e + 2);
        this.field_y = new v(qa.field_a, 0, (this.field_h.field_g + 2) * 24);
        this.field_y.field_l = 48 + 24 * this.field_h.field_e;
        if (VolumeRampingMidiPcmStream.field_Q[5]) {
          this.field_D.field_a = 2;
          this.field_H.field_a = 2;
        }
        this.field_A = new GridPoint();
        var3 = 0;
        while (ll.field_a > var3) {
          if (wh.field_b[var3] != null &&
            wh.field_b[var3].field_i == 0 &&
            wh.field_b[var3].field_h == 4) {
            this.field_A.copyCoordinatesFrom((byte) 46, wh.field_b[var3].field_j);
          } else {
            var3++;
            continue;
          }
          break;
        }
        var6 = 0;
        var3Lifetime1 = var6;
        while (ProxySocketFactory.field_j > var6) {
          if (null != TextHotspotBounds.field_m[var6] &&
            TextHotspotBounds.field_m[var6].field_i == 20 &&
            SocketArchiveNetworkClient.a(TextHotspotBounds.field_m[var6].field_j, (byte) -87, this.field_l) < 8) {
            this.field_x = TextHotspotBounds.field_m[var6];
          } else {
            var6++;
            continue;
          }
          break;
        }
        this.field_d = new v(e.field_k, 0, 0);
        CrossfadingMidiPcmStream.a(param0, param0 ^ 1);
        LabeledWidgetContainer.field_E.copyCoordinatesFrom((byte) 46, this.field_o);
        return;
    }

    final void b(byte param0) {
        int var3;
        GridPoint var4;
        var3 = -77 % ((param0 + 48) / 38);
        var4 = TextHotspotBounds.field_m[0].field_j;
        this.field_D.e(-115);
        this.field_H.e(-114);
        if (this.field_H.field_a == 1 &&
          this.field_H.field_d + this.field_H.field_h >= 24 * var4.field_g) {
          this.field_H.field_a = 2;
        }
        this.field_q.e(-126);
        if (this.field_q.field_a == 1 &&
          this.field_q.field_l + this.field_q.field_m > 24 * var4.field_e) {
          this.field_q.field_a = 2;
        }
        this.field_v.e(-119);
        this.field_i.e(-114);
        this.field_y.e(-111);
        this.field_m.e(-127);
        this.field_t.e(-128);
        this.field_p.e(-107);
        this.field_w.e(-106);
        this.field_k.e(-120);
        this.field_d.e(-125);
    }

    public static void clearStaticReferences(byte param0) {
        field_s = null;
        field_C = null;
        field_e = null;
        if (param0 > -80) {
          field_B = (IndexedSprite[]) null;
        }
        field_B = null;
        field_E = null;
    }

    final String a(boolean param0) {
        if (param0) {
          field_e = (int[]) null;
        }
        return DebouncedFieldValidator.field_i;
    }

    public ob() {
        this.field_r = new GridPoint[2];
    }

    static {
        field_s = new PacketBuffer(256);
        field_e = new int[]{24, 27, 5};
        field_E = "Achievements";
    }
}
