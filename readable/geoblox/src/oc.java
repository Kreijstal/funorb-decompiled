/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc implements dh {
    static Sprite boardSceneRaster;
    static BufferedSocket field_e;
    static int field_f;
    static String field_a;
    static int field_c;
    static int previousMenuScreenId;

    final static void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Geoblox.field_C;
        fe.sunBackgroundSprite.drawRunEncoded(0, 0);
        ne.sunForegroundSprite.draw(320 - (ne.sunForegroundSprite.fullWidth >> 1), param0 - (ne.sunForegroundSprite.fullHeight >> 1));
        kh.screenTitleSprites[0].draw(0, 20);
        int var1 = -70 + MatchingTextValidator.field_j;
        if (var1 >= 0) {
            if (!((double)var1 * 0.0174532925 < 1.5707963267948966)) {
                var2 = tl.introFaceFrames[vc.field_h].fullWidth >> 1;
                if (vc.field_h >= 11) {
                    var3 = (MatchingTextValidator.field_j - fh.field_c >> 1) * (MatchingTextValidator.field_j - fh.field_c >> 1) >> 1;
                    tl.introFaceFrames[vc.field_h].drawGrayModulated(-(tl.introFaceFrames[vc.field_h].fullWidth >> 1) + 320, var3 + (-(tl.introFaceFrames[vc.field_h].fullHeight >> 1) + 240), si.field_j);
                    qh.introGeometryFrames[0].draw(var2 + 320, -34 + var3 - (qh.introGeometryFrames[0].fullHeight >> 1) + 240);
                    qh.introGeometryFrames[1].draw(-var2 + 320 - qh.introGeometryFrames[1].fullWidth, -(qh.introGeometryFrames[1].fullHeight >> 1) + (240 + var3 + 22));
                    return;
                }
                var3 = MatchingTextValidator.field_j << 2;
                if (var2 + 320 < 1000 - var3) {
                    qh.introGeometryFrames[0].draw(1000 - var3, -34 + (240 - (qh.introGeometryFrames[0].fullHeight >> 1)));
                } else {
                    qh.introGeometryFrames[0].draw(320 + var2, 206 - (qh.introGeometryFrames[0].fullHeight >> 1));
                }
                if (-qh.introGeometryFrames[1].fullWidth + (320 - var2) > var3 - 1200) {
                    qh.introGeometryFrames[1].draw(var3 - 1200, 22 + (240 - (qh.introGeometryFrames[1].fullHeight >> 1)));
                    tl.introFaceFrames[vc.field_h].drawGrayModulated(320 - var2, 240 - (tl.introFaceFrames[vc.field_h].fullHeight >> 1), si.field_j);
                    return;
                }
                qh.introGeometryFrames[1].draw(-qh.introGeometryFrames[1].fullWidth - var2 + 320, 240 - (qh.introGeometryFrames[1].fullHeight >> 1) + 22);
                tl.introFaceFrames[vc.field_h].drawGrayModulated(320 - var2, 240 - (tl.introFaceFrames[vc.field_h].fullHeight >> 1), si.field_j);
                return;
            }
            kh.screenTitleSprites[0].drawAdditive(0, 20, (int)(0.5 + Math.sin(2.0 * ((double)var1 * 0.0174532925)) * 90.0));
        }
        var2 = tl.introFaceFrames[vc.field_h].fullWidth >> 1;
        if (vc.field_h >= 11) {
            var3 = (MatchingTextValidator.field_j - fh.field_c >> 1) * (MatchingTextValidator.field_j - fh.field_c >> 1) >> 1;
            tl.introFaceFrames[vc.field_h].drawGrayModulated(-(tl.introFaceFrames[vc.field_h].fullWidth >> 1) + 320, var3 + (-(tl.introFaceFrames[vc.field_h].fullHeight >> 1) + 240), si.field_j);
            qh.introGeometryFrames[0].draw(var2 + 320, -34 + var3 - (qh.introGeometryFrames[0].fullHeight >> 1) + 240);
            qh.introGeometryFrames[1].draw(-var2 + 320 - qh.introGeometryFrames[1].fullWidth, -(qh.introGeometryFrames[1].fullHeight >> 1) + (240 + var3 + 22));
            return;
        }
        var3 = MatchingTextValidator.field_j << 2;
        if (var2 + 320 < 1000 - var3) {
            qh.introGeometryFrames[0].draw(1000 - var3, -34 + (240 - (qh.introGeometryFrames[0].fullHeight >> 1)));
            if (-qh.introGeometryFrames[1].fullWidth + (320 - var2) > var3 - 1200) {
                qh.introGeometryFrames[1].draw(var3 - 1200, 22 + (240 - (qh.introGeometryFrames[1].fullHeight >> 1)));
                tl.introFaceFrames[vc.field_h].drawGrayModulated(320 - var2, 240 - (tl.introFaceFrames[vc.field_h].fullHeight >> 1), si.field_j);
                return;
            }
            qh.introGeometryFrames[1].draw(-qh.introGeometryFrames[1].fullWidth - var2 + 320, 240 - (qh.introGeometryFrames[1].fullHeight >> 1) + 22);
            tl.introFaceFrames[vc.field_h].drawGrayModulated(320 - var2, 240 - (tl.introFaceFrames[vc.field_h].fullHeight >> 1), si.field_j);
            return;
        }
        qh.introGeometryFrames[0].draw(320 + var2, 206 - (qh.introGeometryFrames[0].fullHeight >> 1));
        if (-qh.introGeometryFrames[1].fullWidth + (320 - var2) > var3 - 1200) {
            qh.introGeometryFrames[1].draw(var3 - 1200, 22 + (240 - (qh.introGeometryFrames[1].fullHeight >> 1)));
            tl.introFaceFrames[vc.field_h].drawGrayModulated(320 - var2, 240 - (tl.introFaceFrames[vc.field_h].fullHeight >> 1), si.field_j);
            return;
        }
        qh.introGeometryFrames[1].draw(-qh.introGeometryFrames[1].fullWidth - var2 + 320, 240 - (qh.introGeometryFrames[1].fullHeight >> 1) + 22);
        tl.introFaceFrames[vc.field_h].drawGrayModulated(320 - var2, 240 - (tl.introFaceFrames[vc.field_h].fullHeight >> 1), si.field_j);
    }

    public static void a(boolean param0) {
        field_e = null;
        boardSceneRaster = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          var6_int = param4.field_v + param0;
          var7 = param4.field_m + param2;
          ik.a(var6_int, param4.field_h, var7, param4.field_r, -1540604944);
          var8 = oa.field_e[1];
          if (param4 instanceof hk) {
            if (((hk) ((Object) param4)).field_y) {
              var8.drawAdditive(var6_int - (-1 - (-var8.fullWidth + param4.field_r >> 1)), (-var8.fullHeight + param4.field_h >> 1) + 1 + var7, 256);
            }
          }
          if (param4.e((byte) 54)) {
            ImageProducerRasterBuffer.a(var7 + 2, -4 + param4.field_r, 14164, -4 + param4.field_h, var6_int + 2);
          }
          if (param1 < -5) {
            return;
          }
          field_c = 68;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var6);
          stackIn_11_1 = new StringBuilder().append("oc.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var2 = -117 / ((-46 - param0) / 50);
        tl var1 = (tl) ((Object) sg.field_b.removeLast(1));
        if (!(var1 != null)) {
            var1 = new tl();
        }
        var1.a(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, SoftwareRasterizer.clipTop, SoftwareRasterizer.framebuffer, true);
        MatchingTextValidator.field_l.addLast(-88, var1);
    }

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1_ref_java_lang_reflect_Method = null;
            int var1 = 0;
            Exception var1_ref_Exception = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var1_ref_java_lang_reflect_Method = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1_ref_java_lang_reflect_Method == null) {
                var1 = -93 / ((-13 - param0) / 47);
                return;
              }
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1_ref_java_lang_reflect_Method.invoke((Object) (var2), (Object[]) null));
                li.field_c = 1 + (int)(var3.longValue() / 1048576L);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                var1 = -93 / ((-13 - param0) / 47);
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
              var1 = -93 / ((-13 - param0) / 47);
              return;
            }
            var1 = -93 / ((-13 - param0) / 47);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = 80;
        boardSceneRaster = new Sprite(640, 640);
    }
}
