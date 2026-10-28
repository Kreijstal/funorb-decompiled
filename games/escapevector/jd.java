/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static String field_c;
    static IntrusiveDeque field_a;

    final static void a(byte param0) {
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (!GameAppletShell.field_k) {
            if (null != mm.field_b) {
              mm.field_b.fadeOut(256);
              vi.field_d.fadeOut(256);
              mm.field_b = null;
              vi.field_d = null;
            }
            return;
          }
          int var1_int = 0;
          int var2 = 0;
          int var3 = 0;
          if (param0 != -54) {
            jd.a(15, false);
          }
          oh var5_ref_oh = (oh) (wa.field_c.first(false));
          while (var5_ref_oh != null) {
            int stackIn_12_0 = var5_ref_oh.field_o;
            int stackIn_12_1 = 100;
            if (stackIn_12_0 >= stackIn_12_1 &&
              var5_ref_oh.field_q >= 0 &&
              var5_ref_oh.field_q < 480) {
              int var6 = 640 * var5_ref_oh.field_q;
              int var7 = var5_ref_oh.field_i;
              if (var5_ref_oh.field_m < 0) {
                var7 = var7 - var5_ref_oh.field_s;
              }
              int var8 = var7 + var5_ref_oh.field_s;
              for (int var9 = var7; var9 < var8; var9 += 6) {
                if (var9 >= 0 &&
                  640 > var9 &&
                  SoftwareRasterizer.pixels[var6 + var9] == 6324320) {
                  int var10 = 256 * var9 / 640;
                  var1_int = var1_int + (-var10 + 256);
                  var2 = var2 + var10;
                }
              }
            }
            var5_ref_oh = (oh) (wa.field_c.next((byte) 70));
          }
          int var4 = 0;
          oh var5_ref_ohLifetime1 = (oh) (QuickChatPhraseDefinition.field_u.first(false));
          while (var5_ref_ohLifetime1 != null) {
            if (var5_ref_ohLifetime1.field_i >= 0 &&
              var5_ref_ohLifetime1.field_i < 640) {
              int var6Lifetime1 = var5_ref_ohLifetime1.field_q;
              if (0 > var5_ref_ohLifetime1.field_m) {
                var6Lifetime1 = var6Lifetime1 - var5_ref_ohLifetime1.field_s;
              }
              int var7Lifetime1 = var6Lifetime1 + var5_ref_ohLifetime1.field_s;
              for (int var8Lifetime1 = var6Lifetime1; var8Lifetime1 < var7Lifetime1; var8Lifetime1 += 6) {
                if (var8Lifetime1 >= 0 &&
                  var8Lifetime1 < 480 &&
                  6324320 == SoftwareRasterizer.pixels[var8Lifetime1 * 640 + var5_ref_ohLifetime1.field_i]) {
                  int var9Lifetime1 = 256 * var5_ref_ohLifetime1.field_i / 640;
                  var3 = var3 + (-var9Lifetime1 + 256);
                  var4 = var4 + var9Lifetime1;
                }
              }
            }
            var5_ref_ohLifetime1 = (oh) (QuickChatPhraseDefinition.field_u.next((byte) 70));
          }
          int var5 = (int)Math.sqrt((double)((var1_int + var2) * 8));
          if (var2 + var1_int == 0) {
            stackIn_54_0 = 8192;
          } else {
            stackIn_54_0 = var2 * 16384 / (var1_int + var2);
          }
          int var6Lifetime2 = stackIn_54_0;
          int var7Lifetime2 = var4 + var3 >> 8;
          if (var4 + var3 != 0) {
            stackIn_57_0 = 16384 * var4 / (var4 + var3);
          } else {
            stackIn_57_0 = 8192;
          }
          int var8Lifetime2 = stackIn_57_0;
          if (mm.field_b == null) {
            mm.field_b = PcmSampleStream.createAtRatePercentQ6(ArchiveProvider.field_d, 100, 0, var6Lifetime2);
            vi.field_d = PcmSampleStream.createAtRatePercentQ6(pa.field_b, 100, 0, var8Lifetime2);
            mm.field_b.setLoopCount(-1);
            vi.field_d.setLoopCount(-1);
            ObjectSpriteSet.field_e.addSubstream(mm.field_b);
            ObjectSpriteSet.field_e.addSubstream(vi.field_d);
          }
          mm.field_b.rampVolumeAndPanQ6(441, IterableNodeHashTable.field_c * var5 / 64, var6Lifetime2);
          vi.field_d.rampVolumeAndPanQ6(441, var7Lifetime2 * IterableNodeHashTable.field_c / 64, var8Lifetime2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "jd.D(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_c = null;
        int var1 = 19 % ((-6 - guard) / 50);
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        if (param0 == 100 &&
          0 < vi.field_b) {
          int fieldTemp$3 = vi.field_b - 1;
          vi.field_b = vi.field_b - 1;
          byte[] var2_ref_byte__ = ei.field_l[fieldTemp$3];
          ei.field_l[vi.field_b] = null;
          return var2_ref_byte__;
        }
        if (param0 == 5000 &&
          qj.field_c > 0) {
          int fieldTemp$4 = qj.field_c - 1;
          qj.field_c = qj.field_c - 1;
          byte[] var2_ref_byte__Lifetime1 = ok.field_d[fieldTemp$4];
          ok.field_d[qj.field_c] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (!param1) {
          field_a = (IntrusiveDeque) null;
        }
        if (param0 == 30000 &&
          bm.field_c > 0) {
          int fieldTemp$5 = bm.field_c - 1;
          bm.field_c = bm.field_c - 1;
          byte[] var2_ref_byte__Lifetime2 = id.field_b[fieldTemp$5];
          id.field_b[bm.field_c] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (MarkerSliderPainter.field_n != null) {
          for (int var2 = 0; var2 < HudMessage.field_h.length; var2++) {
            if (HudMessage.field_h[var2] == param0 &&
              0 < nb.field_b[var2]) {
              int dupTemp$6 = nb.field_b[var2] - 1;
              byte[][] arrayValue$7 = MarkerSliderPainter.field_n[var2];
              nb.field_b[var2] = dupTemp$6;
              byte[] var3 = arrayValue$7[dupTemp$6];
              MarkerSliderPainter.field_n[var2][nb.field_b[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param0];
    }

    final static sn a(boolean param0) {
        if (param0) {
          jd.a((byte) -80);
        }
        String var1 = DualLinkNode.e(0);
        if (var1 != null &&
          !(0 > var1.indexOf('@'))) {
          var1 = "";
        }
        return new sn(DualLinkNode.e(0), UiTheme.c(62));
    }

    final static int a(BinaryBitmapFont param0, byte param1, String[] param2) {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (param1 != -121) {
            int stackIn_3_0 = -57;
            return stackIn_3_0;
          }
          int var3_int = 0;
          String[] var4 = param2;
          for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            var3_int = var3_int + SeekerMine.a(var6, param1 ^ -16777096, param0);
          }
          int stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("jd.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = "To Level";
    }
}
