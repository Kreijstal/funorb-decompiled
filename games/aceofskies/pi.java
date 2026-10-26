/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends mi {
    static qr field_x;
    private sp field_w;
    private int field_y;

    final boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -42) {
            return false;
          }
          this.c((byte) 100);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pi.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 4096) {
          field_x = (qr) null;
        }
        field_x = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        pt var8;
        int var9;
        int var10;
        int var11;
        ea var12;
        ll var13;
        ll var14;
        ll var15;
        var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        super.a((byte) 125, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        var5 = (this.field_q >> 1) + (param3 + this.field_p);
        var6 = (this.field_n >> 1) + param2 + this.field_h;
        var8 = this.field_w.b(true);
        if (param0 < 64) {
          var12 = (ea) null;
          this.a((ea) null, (byte) -125);
        }
        if (jc.field_Pc != var8 &&
          ce.field_t != var8) {
          if (var8 == bt.field_a) {
            var13 = gu.field_c[2];
            var13.d(var5 - (var13.field_r >> 1), -(var13.field_n >> 1) + var6, 256);
            return;
          }
          if (fd.field_a != var8) {
            return;
          }
          var14 = gu.field_c[1];
          var14.d(-(var14.field_r >> 1) + var5, var6 - (var14.field_n >> 1), 256);
          return;
        }
        var15 = gu.field_c[0];
        var9 = var15.field_v << 1;
        var10 = var15.field_q << 1;
        if (ms.field_c != null &&
          ms.field_c.field_r >= var9 &&
          var10 <= ms.field_c.field_n) {
          cm.a(ms.field_c, -14492);
          vp.a();
        } else {
          ms.field_c = new ll(var9, var10);
          cm.a(ms.field_c, -14492);
        }
        var15.a(112, 144, var15.field_v << 4, var15.field_q << 4, -this.field_y << 10, 4096);
        sl.c(2765);
        ms.field_c.d(var5 - var15.field_v, -var15.field_q + var6, 256);
        return;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        try {
          this.field_y = this.field_y + 1;
          super.a((byte) 67, param1, param2, param3);
          if (param0 <= 13) {
            pi.a(-28);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pi.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String c(byte param0) {
        if (this.field_g) {
          return this.field_w.a(true);
        }
        if (param0 <= -41) {
          return null;
        }
        this.field_y = 87;
        return null;
    }

    final static int a(int param0, String param1, int param2, boolean param3, String param4, boolean param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_41_0 = false;
          boolean stackIn_44_0 = false;
          int stackIn_70_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_84_0 = 0;
          int stackIn_93_0 = 0;
          int stackIn_95_0 = 0;
          RuntimeException stackIn_98_0 = null;
          StringBuilder stackIn_98_1 = null;
          String stackIn_99_2 = null;
          StringBuilder stackIn_101_1 = null;
          String stackIn_102_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            if (ft.field_l == null &&
              !fp.a((byte) 82, param5)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (qa.field_b == ca.field_f) {
              if (!param5) {
                dq.field_a = op.a(param4, false, param1, false);
              } else {
                var10 = (String) null;
                dq.field_a = wb.a(false, (String) null, param4, as.field_b, true);
              }
              q.outgoingPacket.position = 0;
              q.outgoingPacket.writeByte(param2 - 1336879960, 14);
              q.outgoingPacket.writeByte(-1336879960, dq.field_a.a(param2 ^ -69).field_c);
              fr.a(param2 - 21, -1);
              ca.field_f = pg.field_a;
            }
            if (ca.field_f == pg.field_a &&
              wo.a(1, true)) {
              var6_int = IntKeyLookup.incomingPacket.readUnsignedByte(117);
              if (0 == var6_int) {
                ca.field_f = qo.field_a;
              } else {
                ca.field_f = aj.field_u;
                qs.field_b = var6_int;
                ag.field_s = -1;
              }
              IntKeyLookup.incomingPacket.position = 0;
            }
            if (qo.field_a == ca.field_f &&
              wo.a(8, true)) {
              of.field_a = IntKeyLookup.incomingPacket.readLong((byte) 90);
              IntKeyLookup.incomingPacket.position = 0;
              AceOfSkies.a(param0, param5, dq.field_a, param3, -12209);
              ca.field_f = he.field_o;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ca.field_f == he.field_o &&
              wo.a(1, true)) {
              var6_intLifetime1 = IntKeyLookup.incomingPacket.readUnsignedByte(param2 ^ 63);
              fb.field_b = null;
              qs.field_b = var6_intLifetime1;
              IntKeyLookup.incomingPacket.position = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  ca.field_f = aj.field_u;
                  ag.field_s = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  te.b(true);
                  ld.field_d = false;
                  stackIn_29_0 = var6_intLifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ca.field_f = ScorchMark.field_a;
                ag.field_s = -1;
              }
            }
            if (ScorchMark.field_a == ca.field_f &&
              rm.a(0)) {
              as.field_b = IntKeyLookup.incomingPacket.readLong((byte) -87);
              ln.field_d = IntKeyLookup.incomingPacket.readUnsignedByte(37);
              IntKeyLookup.incomingPacket.readUnsignedByte(param2 ^ 103);
              qr.field_a = IntKeyLookup.incomingPacket.readUnsignedShort((byte) 0);
              var11 = IntKeyLookup.incomingPacket.e((byte) -122);
              var7 = IntKeyLookup.incomingPacket.readUnsignedByte(118);
              if (0 != (1 & var7)) {
                Bullet.b(param2 + 0);
              }
              if (!param5) {
                stackIn_41_0 = ((var7 & 8) != 0);
                um.field_j = stackIn_41_0;
                stackIn_44_0 = ((var7 & 4) != 0);
                g.field_k = stackIn_44_0;
                if (!um.field_j) {
                }
              }
              if (HighscoreNameEntry.field_a) {
                IntKeyLookup.incomingPacket.readUnsignedByte(-83);
                IntKeyLookup.incomingPacket.readUnsignedByte(105);
                IntKeyLookup.incomingPacket.readInt((byte) 123);
                ag.field_r = IntKeyLookup.incomingPacket.readUnsignedShort((byte) 0);
                nc.field_c = new byte[ag.field_r];
                for (var8 = 0; ag.field_r > var8; var8++) {
                  nc.field_c[var8] = IntKeyLookup.incomingPacket.readByte(0);
                }
              }
              fj.playerDisplayName = IntKeyLookup.incomingPacket.readNullTerminatedText(-17883);
              var12 = (CharSequence) ((Object) fj.playerDisplayName);
              cf.normalizedPlayerName = vu.normalizePlayerName(param2 ^ 127, var12);
              un.field_c = IntKeyLookup.incomingPacket.readUnsignedByte(param2 ^ -95);
              ca.field_f = wq.field_e;
              if (dq.field_a.a(-78) == SteeringMode.field_a) {
                ef.field_k.a(bm.m(param2 + 113), (byte) 125);
              } else {
                if (dq.field_a.a(-87) == ds.field_e) {
                  lp.field_f.a(bm.m(111), (byte) 8);
                }
              }
              ld.field_d = false;
              if (var11 != null) {
                sf.a((byte) -122, bm.m(123), var11);
              }
              if (qr.field_a <= 0 &&
                !g.field_k) {
                try {
                  fe.a("unzap", (byte) -108, bm.m(115));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  fe.a("zap", -15201, new Object[]{vf.a(as.field_b, 28304)}, bm.m(119));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (qr.field_a > 0) {
                te.field_h = true;
              }
              q.outgoingPacket.initializeOpcodeCipher(true, bm.field_w);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                bm.field_w[var8Lifetime1] = bm.field_w[var8Lifetime1] + 50;
              }
              IntKeyLookup.incomingPacket.initializeOpcodeCipher(true, bm.field_w);
              stackIn_70_0 = qs.field_b;
              return stackIn_70_0;
            }
            if (param2 != 0) {
              field_x = (qr) null;
            }
            if (ca.field_f == aj.field_u &&
              rm.a(0)) {
              te.b(true);
              if (qs.field_b == 7 &&
                !ld.field_d) {
                ld.field_d = true;
                stackIn_84_0 = -1;
                return stackIn_84_0;
              }
              if (7 == qs.field_b) {
                qs.field_b = 3;
              }
              rp.field_m = IntKeyLookup.incomingPacket.readNullTerminatedText(-17883);
              ld.field_d = false;
              stackIn_82_0 = qs.field_b;
              return stackIn_82_0;
            }
            if (null == ft.field_l) {
              if (ld.field_d) {
                if (30000L < gm.g(-1)) {
                  rp.field_m = rm.field_c;
                } else {
                  rp.field_m = jf.field_b;
                }
                ld.field_d = false;
                stackIn_93_0 = 3;
                return stackIn_93_0;
              }
              var6_intLifetime2 = sg.field_b;
              sg.field_b = ca.field_h;
              ca.field_h = var6_intLifetime2;
              ld.field_d = true;
            }
            stackIn_95_0 = -1;
            return stackIn_95_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_98_0 = var6;
            stackIn_98_1 = new StringBuilder().append("pi.V(").append(param0).append(',');
            if (param1 == null) {
              stackIn_99_2 = "null";
            } else {
              stackIn_99_2 = "{...}";
            }
            stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_102_2 = "null";
            } else {
              stackIn_102_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    pi(sp param0) {
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new qr();
    }
}
