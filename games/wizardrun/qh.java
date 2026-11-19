/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qh {
    ob field_i;
    static byte[][] field_a;
    int field_e;
    static ResourceArchive field_c;
    static int field_j;
    ob field_f;
    static int field_g;
    static int keyQueueWriteIndex;
    static int field_l;
    int field_k;
    int field_h;
    int field_d;

    final static int a(String param0, int param1, boolean param2, int param3, String param4, boolean param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_9_0 = 0;
          int stackIn_34_0 = 0;
          boolean stackIn_48_0 = false;
          boolean stackIn_51_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_90_0 = 0;
          int stackIn_97_0 = 0;
          int stackIn_100_0 = 0;
          RuntimeException stackIn_103_0 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
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
          var9 = wizardrun.field_H;
          try {
            if (null == jc.field_H &&
              !ol.a(124, param5)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (param3 != -9) {
              stackIn_9_0 = -113;
              return stackIn_9_0;
            }
            if (NodeHashTableIterator.field_j == FadingDialog.field_G) {
              if (!param5) {
                eh.field_e = qb.a(param0, false, (byte) -90, param4);
              } else {
                var10 = (String) null;
                eh.field_e = uk.a((String) null, 8355711, WidgetContainer.field_D, false, param0);
              }
              n.field_b.position = 0;
              n.field_b.writeByte((byte) 11, 14);
              n.field_b.writeByte((byte) 11, eh.field_e.a(true).field_a);
              id.a((byte) -67, -1);
              NodeHashTableIterator.field_j = pj.field_P;
            }
            if (NodeHashTableIterator.field_j == pj.field_P &&
              hc.a(1, param3 ^ 28257)) {
              var6_int = AccountCreationForm.field_N.readUnsignedByte(255);
              if (var6_int == 0) {
                NodeHashTableIterator.field_j = bd.field_b;
              } else {
                NodeHashTableIterator.field_j = MouseWheelInput.field_c;
                ra.field_k = var6_int;
                DelegatingCanvas.field_c = -1;
              }
              AccountCreationForm.field_N.position = 0;
            }
            if (bd.field_b == NodeHashTableIterator.field_j &&
              hc.a(8, -28266)) {
              tg.field_g = AccountCreationForm.field_N.readLong((byte) 0);
              AccountCreationForm.field_N.position = 0;
              gi.a(param2, eh.field_e, true, param5, param1);
              NodeHashTableIterator.field_j = vb.field_F;
            }
            boolean decompiledFrameRemainder0 = true;
            if (NodeHashTableIterator.field_j == vb.field_F &&
              hc.a(1, -28266)) {
              var6_intLifetime1 = AccountCreationForm.field_N.readUnsignedByte(255);
              sf.field_b = null;
              ra.field_k = var6_intLifetime1;
              AccountCreationForm.field_N.position = 0;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  DelegatingCanvas.field_c = -1;
                  NodeHashTableIterator.field_j = MouseWheelInput.field_c;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ql.a(-57);
                  n.field_a = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                DelegatingCanvas.field_c = -1;
                NodeHashTableIterator.field_j = fc.field_b;
              }
            }
            if (fc.field_b == NodeHashTableIterator.field_j &&
              bd.b(param3 + 71)) {
              WidgetContainer.field_D = AccountCreationForm.field_N.readLong((byte) 0);
              TextHotspotRange.field_m = AccountCreationForm.field_N.readUnsignedByte(255);
              AccountCreationForm.field_N.readUnsignedByte(255);
              ArchiveProvider.field_a = AccountCreationForm.field_N.readUnsignedShort(-14477);
              var11 = AccountCreationForm.field_N.readNullableCp1252String(-1);
              var7 = AccountCreationForm.field_N.readUnsignedByte(255);
              if ((1 & var7) != 0) {
                fi.f(95);
              }
              if (!param5) {
                stackIn_48_0 = ((8 & var7) != 0);
                WidgetPainterState.field_d = stackIn_48_0;
                stackIn_51_0 = (0 != (4 & var7));
                kd.field_c = stackIn_51_0;
                if (WidgetPainterState.field_d) {
                }
              }
              if (cb.field_g) {
                AccountCreationForm.field_N.readUnsignedByte(255);
                AccountCreationForm.field_N.readUnsignedByte(param3 ^ -248);
                AccountCreationForm.field_N.readInt(255);
                ga.field_b = AccountCreationForm.field_N.readUnsignedShort(-14477);
                DirectByteStorage.field_f = new byte[ga.field_b];
                for (var8 = 0; ga.field_b > var8; var8++) {
                  DirectByteStorage.field_f[var8] = AccountCreationForm.field_N.readByte(0);
                }
              }
              d.field_a = AccountCreationForm.field_N.readCp1252String(0);
              var12 = (CharSequence) ((Object) d.field_a);
              IntrusiveNode.field_a = MouseWheelInput.a(-124, var12);
              RasterSnapshot.field_t = AccountCreationForm.field_N.readUnsignedByte(255);
              NodeHashTableIterator.field_j = BufferedSocket.field_l;
              if (eh.field_e.a(true) == Js5Index.field_v) {
                StripedProgressBar.field_C.a(jg.f(param3 + 10), 8910);
              } else {
                if (eh.field_e.a(true) == UrlPacketDownloader.field_c) {
                  IndexedSpriteState.field_e.a(jg.f(1), param3 ^ -8903);
                }
              }
              n.field_a = false;
              if (var11 != null) {
                MidiEnvelope.a(26017, jg.f(1), var11);
              }
              if (ArchiveProvider.field_a <= 0 &&
                !kd.field_c) {
                try {
                  cl.a(jg.f(param3 ^ -10), -3264, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  cl.a(new Object[]{WeightedLruCache.a(WidgetContainer.field_D, param3 + 77)}, "zap", 30383, jg.f(1));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (ArchiveProvider.field_a > 0) {
                IntrusiveDequeCursor.field_g = true;
              }
              n.field_b.initializeCipher(uh.field_d, (byte) 109);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                uh.field_d[var8Lifetime1] = uh.field_d[var8Lifetime1] + 50;
              }
              AccountCreationForm.field_N.initializeCipher(uh.field_d, (byte) 109);
              stackIn_79_0 = ra.field_k;
              return stackIn_79_0;
            }
            if (NodeHashTableIterator.field_j == MouseWheelInput.field_c &&
              bd.b(param3 + 85)) {
              ql.a(-77);
              if (ra.field_k == 7 &&
                !n.field_a) {
                n.field_a = true;
                stackIn_85_0 = -1;
                return stackIn_85_0;
              }
              if (7 == ra.field_k) {
                ra.field_k = 3;
              }
              bh.field_g = AccountCreationForm.field_N.readCp1252String(0);
              n.field_a = false;
              stackIn_90_0 = ra.field_k;
              return stackIn_90_0;
            }
            if (jc.field_H == null) {
              if (n.field_a) {
                if (eh.a(2) > 30000L) {
                  bh.field_g = sa.field_b;
                } else {
                  bh.field_g = TextLayoutLine.field_d;
                }
                n.field_a = false;
                stackIn_97_0 = 3;
                return stackIn_97_0;
              }
              var6_intLifetime2 = vl.field_d;
              vl.field_d = FadingDialog.field_J;
              n.field_a = true;
              FadingDialog.field_J = var6_intLifetime2;
            }
            stackIn_100_0 = -1;
            return stackIn_100_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_103_0 = var6;
            stackIn_103_1 = new StringBuilder().append("qh.H(");
            if (param0 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            throw bd.wrapException((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = (byte[][]) null;
        if (param0 != -25) {
          String var2 = (String) null;
          qh.a((String) null, 125, true, 98, (String) null, false);
        }
        field_c = null;
    }

    final void a(byte param0) {
        if (this.field_f.field_b < 0) {
          this.field_f.field_b = this.field_f.field_b + 240;
          this.field_i.field_b = this.field_i.field_b - 1;
        }
        if (!(this.field_f.field_b < 240)) {
          this.field_f.field_b = this.field_f.field_b - 240;
          this.field_i.field_b = this.field_i.field_b + 1;
        }
        if (param0 <= 51) {
          tg var3 = (tg) null;
          this.b((tg) null, 94);
        }
    }

    final void a(int param0, PcmSample[] param1, tg param2, int param3, int param4, int param5, PcmStreamMixer param6, boolean param7, byte param8) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        ob var12 = null;
        int var10_intLifetime1;
        var11 = wizardrun.field_H;
        try {
          if (2 != param0) {
            if (1 == this.b(param2, -4) &&
              this.field_f.field_a == 0 &&
              this.field_e < 0) {
              this.field_e = 0;
            }
            if (this.b(param2, -4) == 0 ||
              this.field_e > 0 ||
              !(this.field_f.field_a <= 0)) {
              this.a(param2, -80);
              if (param3 == 0) {
                return;
              }
            }
            if (param0 == 0) {
              var12 = new ob(this.field_i);
              this.field_i.field_b = this.field_i.field_b + this.field_h;
              if (this.b(param2, -4) == 0) {
                this.field_h = -this.field_h;
              }
              this.field_i = var12;
            }
          }
          if (this.field_h < 0) {
            this.field_f.field_b = this.field_f.field_b - param4;
          } else {
            this.field_f.field_b = this.field_f.field_b + param4;
          }
          if (param5 == 1) {
            if (32 * this.field_f.field_b / 240 + this.field_i.field_b * 32 <= 0) {
              this.field_h = 1;
              this.field_f.field_b = this.field_f.field_b + param4;
            }
            if (this.field_f.field_b * 32 / 240 - (-(32 * this.field_i.field_b) - this.field_d) > 640) {
              this.field_f.field_b = this.field_f.field_b - param4;
              this.field_h = -1;
            }
          } else {
            if (this.field_i.field_b >= -2 &&
              this.field_i.field_b <= 20) {
              var10_int = 102 % ((param8 - 83) / 43);
              this.a((byte) 67);
              return;
            }
            this.field_k = 1;
          }
          var10_intLifetime1 = 102 % ((param8 - 83) / 43);
          this.a((byte) 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_38_0 = var10;
          stackIn_38_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(tg param0, int param1) {
        tg var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -29) {
            var4 = (tg) null;
            this.a((tg) null, 121);
          }
          if (this.field_e > -60) {
            this.field_e = this.field_e - 2;
          }
          this.field_f.field_a = this.field_f.field_a + this.field_e;
          if (this.field_f.field_a < 0) {
            if (this.b(param0, -4) == 0) {
              this.field_f.field_a = this.field_f.field_a + 240;
              this.field_i.field_a = this.field_i.field_a - 1;
            } else {
              this.field_e = 0;
              this.field_f.field_a = 0;
            }
          }
          if (this.field_f.field_a >= 240) {
            if (this.field_i.field_a >= 15) {
              return;
            }
            this.field_f.field_a = this.field_f.field_a - 240;
            this.field_i.field_a = this.field_i.field_a + 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("qh.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, PcmStreamMixer param1, boolean param2, PcmSample[] param3, byte param4, tg param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_e > -60) {
            this.field_e = this.field_e - 2;
          }
          this.field_f.field_a = this.field_f.field_a + this.field_e;
          if (0 > this.field_f.field_a) {
            this.field_f.field_a = this.field_f.field_a + 240;
            this.field_i.field_a = this.field_i.field_a - 1;
          }
          if (param4 != -15) {
            return;
          }
          if (this.field_h >= 0) {
            this.field_f.field_b = this.field_f.field_b + param0;
          } else {
            this.field_f.field_b = this.field_f.field_b - param0;
          }
          if (this.field_f.field_a >= 240) {
            this.field_f.field_a = this.field_f.field_a - 240;
            this.field_i.field_a = this.field_i.field_a + 1;
          }
          if (this.field_i.field_b >= -1 &&
            this.field_i.field_b <= 20) {
            this.a((byte) 85);
            return;
          }
          this.field_k = 1;
          this.a((byte) 85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("qh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          qh.b(false);
        }
    }

    final int b(tg param0, int param1) {
        ob var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ob var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          this.a((byte) 66);
          var6 = new ob(this.field_i);
          var3 = var6;
          var3.field_a = var3.field_a - 1;
          var4 = param1 + (32 * this.field_f.field_b / 240 + this.field_d);
          if (0 > var3.field_a) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          while (0 < var4) {
            if (1 == param0.field_f[var6.a((byte) -68)]) {
              stackIn_8_0 = 1;
              return stackIn_8_0;
            }
            var3.field_b = var3.field_b + 1;
            var4 -= 32;
          }
          stackIn_11_0 = 0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("qh.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    qh() {
        this.field_h = 0;
        this.field_k = 0;
        this.field_e = 0;
        this.field_d = 24;
        this.field_i = new ob();
        this.field_f = new ob();
    }

    final static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Sprite var6 = null;
        Sprite var7 = null;
        Sprite var8 = null;
        Sprite var7Lifetime1;
        Sprite var7Lifetime2;
        int var3Lifetime1;
        var4 = wizardrun.field_H;
        try {
          SoftwareRasterizer.drawRectOutline(243, 197, 369, 143, 16777215);
          SoftwareRasterizer.fillRect(244, 198, 367, 141, 0);
          if (null == f.field_d) {
            if (null != AudioServiceThread.field_a) {
              AudioServiceThread.field_a.a(NameSuggestionsPanel.field_G, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = f.field_d[ej.field_c];
          var7 = var6;
          var7Lifetime1 = var6;
          if (var6 == null) {
            if (null != AudioServiceThread.field_a) {
              AudioServiceThread.field_a.a(NameSuggestionsPanel.field_G, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          } else {
            var6.drawTransparent(245, 199);
          }
          if (MidiPcmStream.field_M > WidgetTheme.field_j) {
            var7Lifetime2 = f.field_d[ra.field_o];
            if (var7Lifetime2 != null) {
              var2_int = (60 + var7Lifetime2.fullWidth) * WidgetTheme.field_j / MidiPcmStream.field_M;
              var3 = var2_int - 30;
              if (!RasterSnapshot.field_j) {
                GrowableIntList.a((-var3 + var7Lifetime2.fullWidth) * 256 / 30, -256 * var3 / 30, 245, var7Lifetime2, 199, -107);
              } else {
                GrowableIntList.a(-256 * var3 / 30, 256 * (-var3 + var7Lifetime2.fullWidth) / 30, 245, var7Lifetime2, 199, -83);
              }
            }
          }
          if (!param0) {
            field_c = (ResourceArchive) null;
          }
          if (null != AudioServiceThread.field_a) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (f.field_d.length > var5) {
              var8 = f.field_d[var5];
              if (var8 != null && (var8.fullWidth != 365 ||
                var8.fullHeight != 139)) {
                if (var2 == null) {
                  var2 = Integer.toString(var5);
                } else {
                  var2 = (String) (var2) + ", " + var5;
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            AudioServiceThread.field_a.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.wrapException((Throwable) ((Object) var1), "qh.I(" + param0 + ')');
        }
    }

    static {
        field_a = new byte[50][];
        keyQueueWriteIndex = 0;
    }
}
