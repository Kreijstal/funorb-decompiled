/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class StripedProgressWidget extends UiWidget {
    private int field_E;
    private RgbSprite field_z;
    private int field_v;
    private int field_C;
    private int field_I;
    boolean field_H;
    static String[] field_G;
    private int field_w;
    static int field_x;
    private RgbSprite[] field_y;
    static boolean field_F;
    private RgbSprite field_D;
    int field_A;
    private RgbSprite field_B;
    private int field_u;

    private final RgbSprite createCapMask(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = CrazyCrystals.field_B;
        if (param0 != 255) {
          this.field_D = (RgbSprite) null;
        }
        int var2 = this.field_f >> 1;
        RgbSprite var3 = new RgbSprite(var2, this.field_f);
        em.a((byte) 38, var3);
        for (var4 = 0; this.field_f > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_f) * var4);
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(255.0 * var6) : 255;
            }
            SoftwareRasterizer.setPixel(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        lg.a(1);
        return var3;
    }

    final void setBounds(int param0, int param1, int param2, int param3, byte param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.refreshTextures(0);
    }

    private final void refreshTextures(int param0) {
        this.field_y = new RgbSprite[]{this.createStripeTexture(this.field_w, this.field_C, 2), this.createStripeTexture(this.field_u, this.field_E, 2)};
        this.field_z = this.createCapMask(param0 + 255);
        this.field_B = this.field_z.copyMirroredHorizontally();
        this.field_D = new RgbSprite(this.field_f >> 1, this.field_f);
        if (param0 != 0) {
          field_G = (String[]) null;
        }
    }

    final static int i(int param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (param0 != 1) {
            return -110;
          }
          if (oi.field_d.field_j >= 4) {
            if (oi.field_d.field_p == -1) {
              return 3;
            }
            if (oi.field_d.field_p == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (jh.field_e == 0) {
              AgeValidator.field_k = cc.field_a.requestDirectSocket(cb.field_m, false, em.field_g);
              jh.field_e = jh.field_e + 1;
            }
            if (jh.field_e == 1) {
              if (AgeValidator.field_k.status == 2) {
                stackIn_16_0 = TextFieldValidator.a(-1, (byte) -114);
                return stackIn_16_0;
              }
              if (AgeValidator.field_k.status == 1) {
                jh.field_e = jh.field_e + 1;
              }
            }
            if (2 == jh.field_e) {
              so.field_c = new BufferedSocket((java.net.Socket) (AgeValidator.field_k.result), cc.field_a);
              var2 = new PacketBuffer(13);
              EmailFormatValidator.a(kn.field_q, WallTile.field_x, 12, var2, fk.field_v);
              var2.writeByte(true, 15);
              var2.writeInt(ah.field_e, -16384);
              so.field_c.queueWrite(0, 114, var2.payload, 13);
              jh.field_e = jh.field_e + 1;
              TextFieldValidator.field_f = lo.correctedCurrentTimeMillis((byte) 114) + 30000L;
            }
            if (jh.field_e == 3) {
              if (so.field_c.availableBytes(0) > 0) {
                var1_int = so.field_c.readSingleByte(param0 + 4);
                if (var1_int != 0) {
                  stackIn_30_0 = TextFieldValidator.a(var1_int, (byte) -105);
                  return stackIn_30_0;
                }
                jh.field_e = jh.field_e + 1;
              } else {
                if (lo.correctedCurrentTimeMillis((byte) -49) > TextFieldValidator.field_f) {
                  stackIn_26_0 = TextFieldValidator.a(-2, (byte) -103);
                  return stackIn_26_0;
                }
              }
            }
            if (jh.field_e != 4) {
              return -1;
            }
            oi.field_d.attachSocket(MidiNoteMask.field_h, so.field_c, false);
            jh.field_e = 0;
            so.field_c = null;
            AgeValidator.field_k = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return TextFieldValidator.a(-3, (byte) -100);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          if (this.field_H) {
            this.field_I = this.field_I + 1;
            if (this.field_I > 2 * this.field_v) {
              this.field_I = this.field_I - 2 * this.field_v;
            }
          }
          int var5_int = -58 / ((param1 + 50) / 59);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "co.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    StripedProgressWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    private final RgbSprite createStripeTexture(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = CrazyCrystals.field_B;
        RgbSprite var14 = new RgbSprite(param2 * this.field_v, this.field_f);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        em.a((byte) 38, var14);
        int var5 = this.field_f >> 1;
        for (var6 = 0; var6 < this.field_f; var6++) {
          var7 = (var6 >> 1) * (-1 + 2 * this.field_v) % (this.field_v * 2);
          var8 = 16711935 & param0;
          var9 = param0 & 65280;
          var10 = -var5 + var6;
          var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
          var12 = var11 >= 256 ? var8 | var9 : (var11 * var9 & 16711680 | var11 * var8 & -16711936) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_v, var12);
          SoftwareRasterizer.drawHorizontalLine(-(this.field_v * 2) + var7, var6, this.field_v, var12);
          var9Lifetime1 = param1 & 65280;
          var8Lifetime1 = param1 & 16711935;
          var12Lifetime1 = 256 > var11 ? (16711680 & var9Lifetime1 * var11 | var8Lifetime1 * var11 & -16711936) >>> 8 : var9Lifetime1 | var8Lifetime1;
          SoftwareRasterizer.drawHorizontalLine(this.field_v + var7, var6, this.field_v, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.field_v + var7, var6, this.field_v, var12Lifetime1);
        }
        lg.a(1);
        return var14;
    }

    private final void drawStripeTexture(byte param0, RgbSprite param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          var5_int = this.field_g + param3;
          qp.a(this.field_z.field_l + param3, this.field_f + param2, var5_int - this.field_z.field_l, (byte) 73, param2);
          if (param0 <= 0) {
            this.setBounds(-15, -31, 68, -69, (byte) -1);
          }
          for (var6 = -this.field_I + param3; var6 < var5_int; var6 = var6 + param1.field_l) {
            param1.draw(var6, param2);
          }
          lg.a(1);
          if (this.field_z.field_l + param3 >= SoftwareRasterizer.field_c) {
            em.a((byte) 38, this.field_D);
            param1.draw(-this.field_I, 0);
            param1.draw(2 * this.field_v - this.field_I, 0);
            this.field_B.drawMultiply(0, 0);
            lg.a(1);
            this.field_D.draw(param3, param2);
          }
          if (SoftwareRasterizer.field_g >= var5_int - this.field_z.field_l) {
            em.a((byte) 38, this.field_D);
            for (var7 = this.field_I + (-this.field_z.field_l + this.field_g); var7 > 2 * this.field_v; var7 = var7 - this.field_v * 2) {
            }
            param1.draw(-var7, 0);
            param1.draw(-var7 + 2 * this.field_v, 0);
            this.field_z.drawMultiply(0, 0);
            lg.a(1);
            this.field_D.draw(-this.field_z.field_l + var5_int, param2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("co.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void drawWidget(int param0, byte param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        int var5 = param2 + this.field_r;
        int var6 = this.field_j + param0;
        this.drawStripeTexture((byte) 118, this.field_y[0], var6, var5);
        if (param1 > -12) {
          return;
        }
        if (this.field_A < 65536) {
          qp.a((this.field_A * this.field_g >> 16) + var5, this.field_f + var6, var5 + this.field_g, (byte) 73, var6);
          this.drawStripeTexture((byte) 119, this.field_y[1], var6, var5);
          lg.a(1);
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_G = null;
        if (param0 != 2) {
          StripedProgressWidget.clearDeclaredStaticReferences(-117);
        }
    }

    final void setColours(byte param0, int param1, int param2) {
        this.field_u = param2 >> 1 & 8355711;
        this.field_w = param2;
        this.field_C = param1;
        this.field_E = (16711422 & param1) >> 1;
        this.refreshTextures(0);
        int var4 = 111 / ((param0 + 60) / 40);
    }

    final static void d(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        fq var6;
        var5 = CrazyCrystals.field_B;
        if (param0 > -50) {
          field_G = (String[]) null;
        }
        var6 = oe.field_a[2];
        var2 = 48 * var6.field_m / var6.field_p;
        var3 = var6.field_s * var2 + 24 + 48 * var6.field_t;
        var4 = -var3 + 264;
        if (uo.field_o != 0) {
          if (uo.field_o == 1) {
            ah.a(ma.field_o, var4, 1, (byte) -53, 1);
            ah.a(dn.field_b, var4, 9, (byte) 89, 9);
            aj.a(32293, CipherPacketBuffer.field_k[1], var4, 12, 9, ProxySocketConnector.field_f);
            ah.a(fn.field_g, var4, 14, (byte) 116, 14);
          } else {
            if (uo.field_o != 2) {
              if (uo.field_o == 3) {
                ah.a(lp.field_c, var4, 5, (byte) 102, 5);
                ah.a(cl.field_i, var4, 10, (byte) -67, 10);
                ah.a(jp.field_b, var4, 13, (byte) 101, 13);
                ah.a(hm.field_a, var4, 19, (byte) -57, 19);
              } else {
                ah.a(g.field_a, var4, 3, (byte) 119, 3);
                ah.a(hc.field_c, var4, 3, (byte) -71, 6);
                aj.a(32293, CipherPacketBuffer.field_k[0], var4, 9, 9, DraggableWidgetContainer.field_M);
                aj.a(32293, CipherPacketBuffer.field_k[1], var4, 13, 12, am.field_f);
                aj.a(32293, CipherPacketBuffer.field_k[1], var4, 25, 25, tn.field_o);
                aj.a(32293, CipherPacketBuffer.field_k[2], var4, 28, 27, GameAppletShell.field_f);
              }
            } else {
              ah.a(vp.field_g, var4, 2, (byte) -94, 1);
              ah.a(rb.field_i, var4, 2, (byte) -67, 5);
              ah.a(FrameTimer.field_c, var4, 12, (byte) 97, 12);
              ah.a(fp.field_f, var4, 19, (byte) -38, 19);
              ah.a(cb.field_q, var4, 24, (byte) 122, 24);
              ah.a(DraggableWidgetContainer.field_C, var4, 30, (byte) 103, 30);
            }
          }
        } else {
          ah.a(ao.field_d, var4, 3, (byte) -115, 3);
          ah.a(m.field_m, var4, 6, (byte) -38, 6);
          ah.a(TextLayout.field_f, var4, 9, (byte) -63, 9);
          ah.a(cm.field_c, var4, 14, (byte) 86, 14);
        }
    }

    private StripedProgressWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_E = param8;
        this.field_w = param5;
        this.field_u = param7;
        this.field_C = param6;
        this.field_v = param4;
        this.setBounds(param3, param0, param1, param2, (byte) -52);
    }

    static {
        field_G = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = false;
    }
}
