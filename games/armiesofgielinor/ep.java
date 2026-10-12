/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep {
    private double field_d;
    private int field_g;
    private int field_m;
    static ResourceArchive field_b;
    private int[] field_i;
    static String field_h;
    static int field_o;
    static boolean field_f;
    private int field_j;
    private int field_q;
    private double field_e;
    static String field_a;
    private int field_l;
    private double field_k;
    private int field_n;
    static boolean[][] field_p;
    private int field_c;

    private final int a(byte param0, int param1) {
        if (param0 > -22) {
          return 69;
        }
        return (-mj.field_b + so.field_b.field_g >> 1) + param1;
    }

    private final RgbSprite b(int param0, int param1) {
        if (param0 >= -15) {
          this.a(29);
        }
        return new RgbSprite(PopupPresentation.field_j.getFileByName("intro" + (param1 + 1) + ".jpg", -125, ""), (java.awt.Component) ((Object) VerticalScrollbar.p(0)));
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_l = this.field_l + 1;
        if (0 < this.field_m) {
          fieldTemp$0 = this.field_m - 1;
          this.field_m = this.field_m - 1;
          if (0 == fieldTemp$0) {
            this.field_j = this.field_j + 1;
            if (this.field_j == 1) {
              this.field_m = 200;
            } else {
              if (2 == this.field_j) {
                this.field_m = 50;
              }
            }
          }
        }
        if (this.field_j != 3) {
          return;
        }
        if (this.field_n <= 0) {
          if (this.field_i.length <= this.field_c) {
            CipherPacketBuffer.a(false, 0, 1, jt.field_a);
          }
          if (this.field_g != 0) {
            if (1 == this.field_g) {
              this.field_e = this.field_e - 0.256;
            }
          } else {
            this.field_e = this.field_e + 0.256;
          }
          this.field_l = this.field_l + 1;
          if (this.field_e >= 11.904) {
            if (this.field_k > 2521.0 &&
              2552.0 > this.field_k) {
              this.field_e = this.field_e - 0.256;
            } else {
              this.field_e = 11.904;
              this.field_g = 1;
            }
          } else {
            if (0.0 >= this.field_e) {
              this.field_g = 0;
              this.field_e = 0.0;
              this.field_n = this.field_i[this.field_c];
              this.field_c = this.field_c + 1;
            }
          }
        } else {
          this.field_n = this.field_n - 1;
        }
        if (0.0 == this.field_e) {
          this.field_e = 0.175;
        }
        this.field_k = this.field_k + this.field_e;
        if (this.field_k >= 2835.0) {
          this.field_k = 2835.0;
          this.field_q = this.field_q + 1;
        }
        if (param0) {
          field_f = false;
        }
    }

    final void a(int param0) {
        int discarded$0 = 0;
        int var9 = 0;
        int stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        int stackIn_43_4;
        int stackIn_44_5;
        int stackIn_48_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        OutOfMemoryError var2_ref_OutOfMemoryError = null;
        double var3 = 0.0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7_ref_String__ = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        String[] var13 = null;
        int var4Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var8Lifetime1Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 256) {
          discarded$0 = this.a(53, -105);
        }
        if (this.field_j != 3) {
          SoftwareRaster.b();
          var12 = new String[10];
          var13 = var12;
          var3_int = nr.field_e.a(ts.field_b, new int[]{1000}, var13);
          for (var4 = 0; var4 < var3_int; var4++) {
            var5 = this.a((byte) -90, var4 * 20 + 200);
            fe.c(var12[var4], this.a(320, 4592), var5, nd.field_b, true);
          }
          if (this.field_j != 1) {
            var4Lifetime1 = (this.field_m << 8) / 50;
            if (this.field_j == 2) {
              var4Lifetime1 = 256 - var4Lifetime1;
            }
            SoftwareRaster.b(this.a(0, param0 ^ 4336), this.a((byte) -56, 0), so.field_b.field_a, so.field_b.field_g, 65793, var4Lifetime1);
          }
        } else {
          if (ck.field_c == null) {
            ck.field_c = new RgbSprite[16];
            try {
              for (var2 = 0; var2 < 16; var2++) {
                ck.field_c[var2] = this.b(GrowthEvent.bitwiseXor(param0, -383), var2);
              }
            } catch (java.lang.OutOfMemoryError decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref_OutOfMemoryError = (OutOfMemoryError) (Object) decompiledCaughtException;
            }
          }
          var2 = -(int)(256.0 * (this.field_k - this.field_d) / 8.75) + 256;
          var3 = this.field_k;
          var5 = (int)(16.0 * this.field_k);
          if (var2 > 0) {
            var3 = (double)this.a(-320, 4592);
            this.a(var5, (byte) -79);
            SoftwareRaster.b(0, 0, so.field_b.field_a, so.field_b.field_g, 65793, var2);
          } else {
            this.a(var5, (byte) -79);
          }
          if (this.field_c < 5) {
            var6 = -1 + this.field_c;
            if (this.field_g == 1) {
              var6++;
            }
            if (var6 >= 0 &&
              ParasiteEvent.field_A.length > var6) {
              var7_ref_String__ = new String[10];
              var8 = TrianglePulse.field_i.a(ParasiteEvent.field_A[var6], new int[]{620}, var7_ref_String__);
              for (var9 = 0; var9 < var8; var9++) {
                var10 = 435 + 16 * var9;
                TrianglePulse.field_i.a(var7_ref_String__[var9], this.a(320, 4592), this.a((byte) -104, var10), 16777215, 65793, 256 - (int)(this.field_e * 256.0 / 11.904));
              }
            }
          }
          var6Lifetime1 = this.field_l * 200;
          if (this.field_q > 0) {
            var7 = this.field_q - 100;
            if (0 < var7) {
              var7 = (int)Math.pow(1.1, (double)var7);
              stackIn_43_0 = 0;
              stackIn_43_1 = 0;
              stackIn_43_2 = so.field_b.field_a;
              stackIn_43_3 = so.field_b.field_g;
              stackIn_43_4 = 65793;
              if (var7 <= 256) {
                stackIn_44_5 = var7;
              } else {
                stackIn_44_5 = 256;
              }
              SoftwareRaster.b(stackIn_43_0, stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4, stackIn_44_5);
            }
            var8Lifetime1 = this.field_q << 2;
            stackIn_48_0 = (var8Lifetime1 <= 256) ? var8Lifetime1 : 256;
            var8Lifetime1Lifetime1 = stackIn_48_0;
            ol.field_y.e(this.a(-(int)this.field_k + 3002, 4592), this.a((byte) -81, 90), var8Lifetime1Lifetime1);
            if (var7 >= 160000) {
              CipherPacketBuffer.a(false, 0, 1, jt.field_a);
            }
          } else {
            SoftwareRaster.a((int)(16.0 * (-var3 + (double)this.a(1105, param0 + 4336))), this.a((byte) -73, 119) << 4, 480, (SocketResourceClient.b(var6Lifetime1, 100) >> 13) + 32, fe.field_o[1]);
            SoftwareRaster.a((int)(16.0 * (-var3 + (double)this.a(1068, 4592))), this.a((byte) -42, 219) << 4, 480, 32 + (SocketResourceClient.b(800 + var6Lifetime1, 100) >> 13), fe.field_o[2]);
            SoftwareRaster.a((int)(16.0 * ((double)this.a(1105, 4592) - var3)), this.a((byte) -39, 286) << 4, 480, (SocketResourceClient.b(var6Lifetime1 + 1600, param0 - 156) >> 13) + 32, fe.field_o[3]);
            SoftwareRaster.a((int)(16.0 * (-var3 + (double)this.a(1443, 4592))), this.a((byte) -89, 116) << 4, 480, 32 + (SocketResourceClient.b(2400 + var6Lifetime1, 100) >> 13), fe.field_o[4]);
            SoftwareRaster.a((int)((-var3 + (double)this.a(1478, 4592)) * 16.0), this.a((byte) -62, 207) << 4, 480, 32 + (SocketResourceClient.b(var6Lifetime1 + 3200, param0 ^ 356) >> 13), fe.field_o[5]);
            SoftwareRaster.a((int)(16.0 * (-var3 + (double)this.a(1446, 4592))), this.a((byte) -103, 295) << 4, 480, 32 + (SocketResourceClient.b(4000 + var6Lifetime1, 100) >> 13), fe.field_o[6]);
            SoftwareRaster.b((int)(this.a(1890.0 - this.field_k, 16) * 16.0), this.a((byte) -78, 160) << 4, 1600, 32 + (SocketResourceClient.b(150 + (var6Lifetime1 >> 1), 100) >> 14), fe.field_o[0]);
            SoftwareRaster.a((int)(16.0 * (-var3 + (double)this.a(2614, 4592))), this.a((byte) -74, 219) << 4, 80, (SocketResourceClient.b(var6Lifetime1, 100) >> 13) + 32 >> 2, fe.field_o[1]);
            var7 = 256 + (SocketResourceClient.b(var6Lifetime1 / 4, 100) - 65536);
            if (var7 > 0) {
              ih.field_H.e((int)(-var3 + (double)this.a(2568, 4592)), this.a((byte) -29, 141), var7);
            }
            var7 = 256 + (SocketResourceClient.b(var6Lifetime1 / 2, 100) - 65536);
            if (var7 > 0) {
              ih.field_H.e((int)((double)this.a(2516, 4592) - var3), this.a((byte) -119, 206), var7);
            }
            var7 = -65536 + SocketResourceClient.b(var6Lifetime1 / 3, 100) + 256;
            if (var7 > 0) {
              ih.field_H.e((int)((double)this.a(2665, param0 + 4336) - var3), this.a((byte) -53, 168), var7);
            }
          }
        }
    }

    final static void a(ClientUiComponent param0, int param1, ClientUiComponent param2) {
        try {
          if (null == param2.children) {
            param2.children = new NodeDeque();
          }
          if (null == param0.children) {
            param0.children = new NodeDeque();
          }
          if (null == DiskCacheRequest.friendsByName) {
            DiskCacheRequest.friendsByName = new DualNodeHashTable(64);
          }
          if (param1 > -20) {
            field_o = -46;
          }
          if (bk.ignoredAccountsByName == null) {
            bk.ignoredAccountsByName = new DualNodeHashTable(64);
          }
          ot.ignoreEntries = param0.children;
          wh.friendEntries = param2.children;
          da.clearSocialLists(-123);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ep.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var17;
        int var6Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != -79) {
          return;
        }
        var17 = new int[SoftwareRaster.height];
        var4 = -param0;
        var4 = var4 + kv.field_F;
        var5 = -1;
        for (var6 = us.field_a; var6 < 16; var6++) {
          var7 = var4;
          var8 = (var7 >> 4) + this.a(0, 4592);
          if (SoftwareRaster.width > var8) {
            if (null == ck.field_c[var6]) {
              ck.field_c[var6] = this.b(-99, var6);
            }
            var9 = ck.field_c[var6].pixelWidth;
            var4 = var4 + (var9 << 4);
            var10 = var8 + var9;
            if (var10 >= 0) {
              var11 = -(var7 & 15) + 15;
              if (var8 < 0) {
                var9 = var9 + var8;
                var11 = var11 - (var8 << 4);
                var8 = 0;
              }
              if (SoftwareRaster.width < var10) {
                var9 = var9 - (var10 - SoftwareRaster.width);
              }
              var12 = this.a((byte) -34, 0);
              if (var5 < 0) {
                var5 = var8;
              }
              if (0 > var12) {
                var12 = 0;
              }
              fe.a(ck.field_c[var6], var11, 0, var8, var12, var9, var17);
            } else {
              us.field_a = 1 + var6;
              kv.field_F = kv.field_F + (var9 << 4);
              ck.field_c[var6] = null;
            }
            continue;
          }
          break;
        }
        for (var6Lifetime1 = 0; var6Lifetime1 < 64; var6Lifetime1++) {
          SoftwareRaster.d(var6Lifetime1 + var5, this.a((byte) -45, 0), SoftwareRaster.height, 0, 255 - (var6Lifetime1 << 2));
        }
        return;
    }

    final static int b(byte param0) {
        try {
          int stackIn_13_0 = 0;
          int stackIn_25_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_37_0 = 0;
          int stackIn_39_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (ai.field_T.errorCount >= 4) {
            if (-1 == ai.field_T.errorCode) {
              return 3;
            }
            if (ai.field_T.errorCode == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (ta.field_N == 0) {
              kd.field_R = vq.field_c.openSocketAsync(LeaderEscortCondition.field_i, (byte) 114, db.field_c);
              ta.field_N = ta.field_N + 1;
            }
            if (ta.field_N == 1) {
              if (2 == kd.field_R.status) {
                stackIn_13_0 = OwnerChangeEvent.a(-1, (byte) 101);
                return stackIn_13_0;
              }
              if (1 == kd.field_R.status) {
                ta.field_N = ta.field_N + 1;
              }
            }
            if (ta.field_N == 2) {
              jj.field_g = new BufferedSocket((java.net.Socket) (kd.field_R.result), vq.field_c);
              var2 = new PacketBuffer(13);
              it.a(hq.field_e, false, MoveAttackRequest.field_x, var2, ek.field_e);
              var2.writeByte(1, 15);
              var2.writeInt((byte) -124, vq.field_d);
              jj.field_g.write(var2.payload, (byte) 20, 0, 13);
              ta.field_N = ta.field_N + 1;
              UnitInfoPopup.field_s = 30000L + vi.monotonicMillis(103);
            }
            if (3 == ta.field_N) {
              if (jj.field_g.available((byte) 43) <= 0) {
                if (vi.monotonicMillis(97) > UnitInfoPopup.field_s) {
                  stackIn_30_0 = OwnerChangeEvent.a(-2, (byte) 101);
                  return stackIn_30_0;
                }
              } else {
                var1_int = jj.field_g.readByte(70);
                if (var1_int != 0) {
                  stackIn_25_0 = OwnerChangeEvent.a(var1_int, (byte) 101);
                  return stackIn_25_0;
                }
                ta.field_N = ta.field_N + 1;
              }
            }
            if (4 == ta.field_N) {
              ai.field_T.attachTransport(jj.field_g, ts.field_m, -68);
              kd.field_R = null;
              ta.field_N = 0;
              jj.field_g = null;
              stackIn_34_0 = 0;
              return stackIn_34_0;
            }
            if (param0 < -117) {
              stackIn_39_0 = -1;
              return stackIn_39_0;
            }
            stackIn_37_0 = 37;
            return stackIn_37_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return OwnerChangeEvent.a(-3, (byte) 101);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        String var4 = null;
        try {
          if (!param0) {
            field_p = (boolean[][]) null;
          }
          var4 = sb.field_i.text;
          String var3 = var4;
          sb.field_i.text = param1;
          UnitCycler.field_g.draw(param2, 20);
          sb.field_i.text = var4;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ep.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != 4592) {
          this.field_m = -45;
        }
        return (so.field_b.field_a - ce.field_Q >> 1) + param0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_p = (boolean[][]) null;
        if (param0 != 11) {
          field_o = 9;
        }
        field_a = null;
    }

    ep(ResourceArchive param0) {
        this.field_m = 50;
        this.field_i = new int[]{350, 350, 450, 450, 3500};
        this.field_q = 0;
        this.field_e = 0.0;
        this.field_j = 0;
        this.field_g = 1;
        this.field_n = 0;
        this.field_c = 0;
        this.field_l = 0;
        try {
          kv.field_F = 0;
          PopupPresentation.field_j = param0;
          us.field_a = 0;
          this.field_d = 301.25;
          this.field_k = this.field_d;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ep.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final double a(double param0, int param1) {
        RgbSprite discarded$0 = null;
        if (param1 != 16) {
          discarded$0 = this.b(-62, 105);
        }
        return (double)(-ce.field_Q + so.field_b.field_a >> 1) + param0;
    }

    static {
        field_o = 0;
        field_f = true;
        field_h = "Players";
        field_a = "Toggle map";
    }
}
