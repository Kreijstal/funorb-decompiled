/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static int field_b;
    static am field_c;
    static PcmSample field_a;

    final static void a(int param0) {
        if (oi.field_c != null) {
          oi.field_c.close((byte) -118);
          oi.field_c = null;
        }
        if (param0 != 4) {
          field_a = (PcmSample) null;
        }
    }

    final static int a(String param0, boolean param1, String param2, int param3, boolean param4, boolean param5) {
        try {
          int stackIn_4_0 = 0;
          CipherPacketBuffer stackIn_24_0 = null;
          boolean stackIn_25_1 = false;
          int stackIn_34_0 = 0;
          boolean stackIn_45_0 = false;
          boolean stackIn_48_0 = false;
          int stackIn_74_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_97_0 = 0;
          RuntimeException stackIn_100_0 = null;
          StringBuilder stackIn_100_1 = null;
          String stackIn_101_2 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = CrazyCrystals.field_B;
          try {
            if (oi.field_c == null &&
              !te.a((byte) -19, param4)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (param1) {
              field_b = -101;
            }
            if (gj.field_k == cf.field_a) {
              if (param4) {
                var10 = (String) null;
                mk.field_c = rn.a(0, false, go.field_h, param0, (String) null);
              } else {
                mk.field_c = oh.a(false, param0, param1, param2);
              }
              tp.field_f.position = 0;
              tp.field_f.writeByte(true, 14);
              tp.field_f.writeByte(true, mk.field_c.a(0).field_b);
              ak.a(-1, (byte) -48);
              gj.field_k = of.field_F;
            }
            if (gj.field_k == of.field_F &&
              fq.a(1, (byte) 50)) {
              var6_int = kd.field_n.readUnsignedByte(255);
              kd.field_n.position = 0;
              if (var6_int == 0) {
                gj.field_k = ul.field_j;
              } else {
                bf.field_b = var6_int;
                rk.field_b = -1;
                gj.field_k = GameCanvas.field_a;
              }
            }
            if (gj.field_k == ul.field_j &&
              fq.a(8, (byte) 90)) {
              stackIn_24_0 = kd.field_n;
              stackIn_25_1 = !(param1);
              CipherPacketBuffer.field_m = ((CipherPacketBuffer) (Object) stackIn_24_0).readLong(stackIn_25_1);
              kd.field_n.position = 0;
              tf.a(param4, (byte) 75, mk.field_c, param3, param5);
              gj.field_k = ImageProducerRasterBuffer.field_k;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ImageProducerRasterBuffer.field_k == gj.field_k &&
              fq.a(1, (byte) -70)) {
              var6_intLifetime1 = kd.field_n.readUnsignedByte(255);
              bf.field_b = var6_intLifetime1;
              NetworkArchiveRequest.field_r = null;
              kd.field_n.position = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  rk.field_b = -1;
                  gj.field_k = GameCanvas.field_a;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  jj.a(4);
                  ec.field_g = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                gj.field_k = fm.field_y;
                rk.field_b = -1;
              }
            }
            if (fm.field_y == gj.field_k &&
              ol.f((byte) 60)) {
              go.field_h = kd.field_n.readLong(true);
              rb.field_h = kd.field_n.readUnsignedByte(255);
              kd.field_n.readUnsignedByte(255);
              mo.field_l = kd.field_n.readUnsignedShort((byte) -7);
              var6 = kd.field_n.readNullableString(0);
              var7 = kd.field_n.readUnsignedByte(255);
              if ((var7 & 1) != 0) {
                jl.b(65);
              }
              if (!param4) {
                stackIn_45_0 = ((4 & var7) != 0);
                BufferedRandomAccessFile.field_j = stackIn_45_0;
                stackIn_48_0 = ((8 & var7) != 0);
                ne.field_b = stackIn_48_0;
                if (!ne.field_b) {
                }
              }
              if (ag.field_b) {
                kd.field_n.readUnsignedByte(255);
                kd.field_n.readUnsignedByte(255);
                kd.field_n.readInt((byte) -29);
                um.field_f = kd.field_n.readUnsignedShort((byte) -7);
                SecondaryIntrusiveDeque.field_f = new byte[um.field_f];
                for (var8 = 0; var8 < um.field_f; var8++) {
                  SecondaryIntrusiveDeque.field_f[var8] = kd.field_n.readByte((byte) 113);
                }
              }
              je.field_g = kd.field_n.readString(119);
              var11 = (CharSequence) ((Object) je.field_g);
              lk.field_b = fe.a(60136, var11);
              kl.field_V = kd.field_n.readUnsignedByte(255);
              gj.field_k = ek.field_h;
              if (mk.field_c.a(0) == of.field_C) {
                gg.field_d.a(1, le.b((byte) -20));
              } else {
                if (mk.field_c.a(0) == uo.field_n) {
                  wp.field_c.a(1, le.b((byte) -20));
                }
              }
              ec.field_g = false;
              if (var6 != null) {
                ah.a(-77, var6, le.b((byte) -20));
              }
              if (mo.field_l <= 0 &&
                !BufferedRandomAccessFile.field_j) {
                try {
                  hi.a(le.b((byte) -20), "unzap", -115);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  hi.a(-3729, "zap", le.b((byte) -20), new Object[]{DiskCacheWorker.a(37, go.field_h)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (mo.field_l > 0) {
                fj.field_d = true;
              }
              tp.field_f.a(pj.field_r, true);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                pj.field_r[var8Lifetime1] = pj.field_r[var8Lifetime1] + 50;
              }
              kd.field_n.a(pj.field_r, true);
              stackIn_74_0 = bf.field_b;
              return stackIn_74_0;
            }
            if (GameCanvas.field_a == gj.field_k &&
              ol.f((byte) 60)) {
              jj.a(4);
              if (bf.field_b == 7 &&
                !ec.field_g) {
                ec.field_g = true;
                stackIn_87_0 = -1;
                return stackIn_87_0;
              }
              if (bf.field_b == 7) {
                bf.field_b = 3;
              }
              re.field_j = kd.field_n.readString(123);
              ec.field_g = false;
              stackIn_85_0 = bf.field_b;
              return stackIn_85_0;
            }
            if (oi.field_c == null) {
              if (ec.field_g) {
                if (30000L < wd.d(-1322)) {
                  re.field_j = MouseWheelInput.field_f;
                } else {
                  re.field_j = re.field_k;
                }
                ec.field_g = false;
                stackIn_94_0 = 3;
                return stackIn_94_0;
              }
              var6_intLifetime2 = fe.field_j;
              fe.field_j = gj.field_l;
              gj.field_l = var6_intLifetime2;
              ec.field_g = true;
            }
            stackIn_97_0 = -1;
            return stackIn_97_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_100_0 = var6_ref;
            stackIn_100_1 = new StringBuilder().append("jj.C(");
            if (param0 == null) {
              stackIn_101_2 = "null";
            } else {
              stackIn_101_2 = "{...}";
            }
            stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            throw dn.wrapClientException((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = -60 % ((-53 - param0) / 42);
        field_c = null;
        field_a = null;
    }

    static {
    }
}
