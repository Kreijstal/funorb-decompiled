/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends sk {
    private float field_h;
    static mg field_g;
    static ll[] field_i;
    private em field_f;

    final void a(boolean param0) {
        this.field_b.a(1, (byte) 106);
        this.field_b.a(ru.field_a, param0, ru.field_a);
        this.field_b.a((byte) 122, 0, CipherPacketBuffer.field_p);
        this.field_b.a(CipherPacketBuffer.field_p, 0, 0);
        this.field_b.c(1, (byte) -99);
        this.field_b.a((jj) null, -9135);
        this.field_b.a(0, (byte) 57);
        this.field_b.a(CipherPacketBuffer.field_p, 0, 0);
    }

    u(bf param0, em param1) {
        super(param0);
        this.field_h = 0.0f;
        try {
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_b.a(ru.field_a, true, bd.field_C);
        if (param0) {
          this.d(6);
        }
    }

    final void a(boolean param0, byte param1) {
        this.field_b.a(1, (byte) 41);
        this.field_b.a(lo.field_j, true, bd.field_C);
        if (param1 < 2) {
          this.field_h = -0.11807350814342499f;
        }
        this.field_b.a(true, 0, true, CipherPacketBuffer.field_p, false);
        this.field_b.a(un.field_i, 0, 0);
        this.field_b.c(0, (byte) -86);
        this.field_b.a(0, (byte) 127);
        this.field_b.a((byte) -74, -16777216);
        this.field_b.a(bs.field_a, 0, 0);
        this.d(18580);
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        jj var6;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 != 1786747298) {
          var6 = (jj) null;
          this.a(-79, -84, (jj) null);
        }
        this.field_b.a(1, (byte) 111);
        if ((128 & param1) != 0) {
          this.field_b.a((jj) null, -9135);
        } else {
          if ((1 & param2) != 1) {
            if (!this.field_f.field_e) {
              this.field_b.a(this.field_f.field_i[0], -9135);
            } else {
              this.field_b.a(this.field_f.field_f, -9135);
            }
          } else {
            if (this.field_f.field_e) {
              this.field_h = (float)(this.field_b.field_r % 4000) / 4000.0f;
              this.field_b.a(this.field_f.field_f, -9135);
            } else {
              var4 = this.field_b.field_r % 4000 * 16 / 4000;
              this.field_b.a(this.field_f.field_i[var4], -9135);
            }
          }
        }
        this.field_b.a(0, (byte) 44);
    }

    final static int a(cd param0, int param1, String param2, boolean param3, int param4, int param5, cd param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        PacketBuffer stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        String stackIn_12_2 = null;
        PacketBuffer stackIn_14_0 = null;
        boolean stackIn_14_1 = false;
        String stackIn_15_2 = null;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var14 = param6.b(-17233);
          var8 = param0.b(-17233);
          if (ft.field_l == null &&
            !fp.a((byte) -116, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (ca.field_f == qa.field_b) {
            q.outgoingPacket.position = 0;
            qj.field_r = null;
            if (param2 != null) {
              var9 = 0;
              fa.field_c.position = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              fa.field_c.writeInt((byte) 113, vr.field_h.nextInt());
              fa.field_c.writeInt((byte) 115, vr.field_h.nextInt());
              fa.field_c.a(false, var14);
              fa.field_c.a(false, var8);
              var15 = (CharSequence) ((Object) param2);
              fa.field_c.a(false, ArchiveProvider.a((byte) -81, var15));
              fa.field_c.writeShort(param1, 23385);
              fa.field_c.writeByte(-1336879960, param5);
              fa.field_c.writeByte(-1336879960, var9);
              q.outgoingPacket.writeByte(-1336879960, 18);
              q.outgoingPacket.position = q.outgoingPacket.position + 2;
              var10 = q.outgoingPacket.position;
              var11_ref_String = ao.a(bm.m(108), false);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              q.outgoingPacket.a(-117, var11_ref_String);
              gn.a(hp.field_j, pb.field_a, q.outgoingPacket, fa.field_c, 92);
              q.outgoingPacket.a(false, q.outgoingPacket.position - var10);
            } else {
              fa.field_c.position = 0;
              fa.field_c.writeInt((byte) 88, vr.field_h.nextInt());
              fa.field_c.writeInt((byte) 23, vr.field_h.nextInt());
              stackIn_11_0 = fa.field_c;
              stackIn_11_1 = false;
              if (param6.a(-109)) {
                stackIn_12_2 = var14;
              } else {
                stackIn_12_2 = "";
              }
              ((PacketBuffer) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_12_2);
              stackIn_14_0 = fa.field_c;
              stackIn_14_1 = false;
              if (!param0.a(-103)) {
                stackIn_15_2 = "";
              } else {
                stackIn_15_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2);
              q.outgoingPacket.writeByte(-1336879960, 16);
              q.outgoingPacket.position = q.outgoingPacket.position + 1;
              var9 = q.outgoingPacket.position;
              gn.a(hp.field_j, pb.field_a, q.outgoingPacket, fa.field_c, 78);
              q.outgoingPacket.patchByteLength(q.outgoingPacket.position - var9, (byte) 85);
            }
            fr.a(-37, -1);
            ca.field_f = mq.field_h;
          }
          if (mq.field_h == ca.field_f &&
            wo.a(1, true)) {
            var9Lifetime1 = IntKeyLookup.incomingPacket.readUnsignedByte(78);
            IntKeyLookup.incomingPacket.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ca.field_f = kf.field_m;
              sd.field_j = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                oj.a(26099, bm.m(112));
                rp.field_m = wo.field_h;
                te.b(true);
                ld.field_d = false;
                stackIn_35_0 = var9Lifetime1;
                return stackIn_35_0;
              }
              if (var9Lifetime1 == 99) {
                wo.a(km.a(1), true);
                qj.field_r = new Boolean(b.a(true, IntKeyLookup.incomingPacket));
                IntKeyLookup.incomingPacket.position = 0;
              } else {
                ag.field_s = -1;
                ca.field_f = cd.field_a;
                qs.field_b = var9Lifetime1;
              }
            }
          }
          if (ca.field_f == kf.field_m) {
            var9Lifetime2 = 2;
            if (wo.a(var9Lifetime2, true)) {
              var10Lifetime1 = IntKeyLookup.incomingPacket.readUnsignedShort((byte) 0);
              IntKeyLookup.incomingPacket.position = 0;
              if (wo.a(var10Lifetime1, true)) {
                var11 = sd.field_j.length;
                for (var12 = 0; var11 > var12; var12++) {
                  sd.field_j[var12] = IntKeyLookup.incomingPacket.d((byte) 77);
                }
                te.b(true);
                ld.field_d = false;
                stackIn_45_0 = 100 + var11;
                return stackIn_45_0;
              }
            }
          }
          if (cd.field_a == ca.field_f &&
            rm.a(0)) {
            if (qs.field_b == 255) {
              var9_ref_String = IntKeyLookup.incomingPacket.e((byte) -109);
              if (var9_ref_String != null) {
                sf.a((byte) -125, bm.m(118), var9_ref_String);
              }
            } else {
              rp.field_m = IntKeyLookup.incomingPacket.readNullTerminatedText(-17883);
            }
            te.b(true);
            ld.field_d = false;
            stackIn_55_0 = qs.field_b;
            return stackIn_55_0;
          }
          if (ft.field_l == null) {
            if (ld.field_d) {
              if (gm.g(-1) <= 30000L) {
                rp.field_m = jf.field_b;
              } else {
                rp.field_m = rm.field_c;
              }
              ld.field_d = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = sg.field_b;
            sg.field_b = ca.field_h;
            ca.field_h = var9Lifetime3;
            ld.field_d = true;
          }
          var9Lifetime4 = 74 % ((-57 - param4) / 47);
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("u.E(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, jj param2) {
        try {
          if (param1 <= 66) {
            u.a(97, 109);
          }
          this.field_b.a(param2, -9135);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "u.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          return true;
        }
        return this.field_f.b(false);
    }

    final static int a(int param0, int param1) {
        if (param0 > -106) {
          field_g = (mg) null;
        }
        param1 = param1 & 8191;
        if (param1 < 4096) {
          return param1 >= 2048 ? -lp.field_c[param1 - 2048] : lp.field_c[-param1 + 2048];
        }
        return 6144 > param1 ? -lp.field_c[-param1 + 6144] : lp.field_c[-6144 + param1];
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_i = null;
        field_g = null;
    }

    final void d(int param0) {
        ec var2 = null;
        ec var3 = null;
        if (param0 != 18580) {
          this.field_h = 1.6919490098953247f;
        }
        if (0 == this.field_b.M(7693)) {
          var2 = this.field_b.J(100);
          this.field_b.a(1, (byte) 89);
          var3 = this.field_b.d(param0 ^ 30883);
          var3.a(var2, true);
          var3.a(0.125f, 1.0f, 0.125f, 0);
          var3.b(0.0f, (byte) -125, this.field_h, 0.0f);
          this.field_b.a(qn.field_a, (byte) 123);
          this.field_b.a(0, (byte) 111);
        }
    }

    static {
    }
}
