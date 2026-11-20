/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static String field_a;
    String field_o;
    static String field_k;
    int field_e;
    int[] field_b;
    static String field_n;
    static int[][] field_c;
    int field_h;
    private long field_f;
    int field_j;
    static boolean field_l;
    private String field_i;
    static NamedSoundEffect field_g;
    private int field_d;
    private boolean field_m;

    final static Sprite a(int param0, int param1, Sprite[] param2, int param3) {
        Sprite dupTemp$0 = null;
        int var15 = 0;
        Sprite stackIn_19_0 = null;
        Sprite stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Sprite var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Sprite var23 = null;
        Sprite var24 = null;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var19Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          var4_int = param2[0].canvasWidth;
          var5 = param2[2].canvasWidth;
          var6 = param2[0].canvasHeight;
          var7 = param2[6].canvasHeight;
          var8 = 16;
          var9 = 16;
          if (0 != param1 % var8) {
            param1 = param1 + (var8 - param1 % var8);
          }
          if (param3 % var9 != 0) {
            param3 = param3 + (var9 - param3 % var9);
          }
          var11 = param1 + (var4_int + var5);
          if (param0 != -8096) {
            ij.clearSharedReferences(70);
          }
          var12 = param3 + (var7 + var6);
          for (var13 = 0; var13 < 4; var13++) {
            var23 = TrackBoundary.field_t[var13];
            if (var23 != null &&
              var23.width == var11 &&
              var12 == var23.height) {
              for (var14 = var13; var14 > 0; var14--) {
                TrackBoundary.field_t[var14] = TrackBoundary.field_t[var14 - 1];
              }
              TrackBoundary.field_t[0] = var23;
              stackIn_19_0 = var23;
              return stackIn_19_0;
            }
          }
          for (var13Lifetime1 = 3; var13Lifetime1 > 0; var13Lifetime1--) {
            TrackBoundary.field_t[var13Lifetime1] = TrackBoundary.field_t[-1 + var13Lifetime1];
          }
          dupTemp$0 = new Sprite(param1 + (var4_int + var5), var6 + (var7 + param3));
          TrackBoundary.field_t[0] = dupTemp$0;
          var24 = dupTemp$0;
          var10 = var24;
          vb.a(-98, var24);
          SoftwareRasterizer.setClip(10, 10, var4_int + param1 - (-var5 + 10), -10 + (var7 + var6 + param3));
          for (var13Lifetime2 = 0; var4_int + (param1 + var5) > var13Lifetime2; var13Lifetime2 = var13Lifetime2 + param2[4].width) {
            for (var14Lifetime1 = 0; var7 + (var6 + param3) > var14Lifetime1; var14Lifetime1 = var14Lifetime1 + param2[4].height) {
              param2[4].draw(var13Lifetime2, var14Lifetime1);
            }
          }
          SoftwareRasterizer.resetClip();
          hi.drawNineSlice(param2, var7 + var6 + param3, true, var5 + (var4_int + param1), 0, 0);
          var13Lifetime3 = (param1 * param1 + param3 * param3) / 4;
          for (var14Lifetime2 = -4; param1 + 4 > var14Lifetime2; var14Lifetime2++) {
            for (var15 = -4; 4 + param3 > var15; var15++) {
              var16 = (int)Math.sqrt((double)((var14Lifetime2 - param1 / 2) * (var14Lifetime2 - param1 / 2) + (-(param3 / 2) + var15) * (-(param3 / 2) + var15)));
              var17 = 128 + 64 * var16 / (int)Math.sqrt((double)var13Lifetime3);
              if (var17 > 256) {
                var17 = 256;
              }
              var18 = var14Lifetime2 + (var4_int + SoftwareRasterizer.width * (var6 + var15));
              var19 = SoftwareRasterizer.pixels[var18];
              var20 = var19 & 16711935;
              var20 = var20 * var17;
              var21 = 65280 & var19;
              var21 = var21 * var17;
              var20 = var20 & -16711936;
              var21 = var21 & 16711680;
              var19Lifetime1 = (var20 | var21) >> 8;
              SoftwareRasterizer.pixels[var18] = var19Lifetime1;
            }
          }
          MarkerSliderRenderer.restoreRasterTarget(-1);
          stackIn_40_0 = var10;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("ij.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (null == NetworkArchiveRequest.field_w) {
          return;
        }
        TrackObjectDefinition.detachInputListeners(-46342, NetworkArchiveRequest.field_w);
        NetworkArchiveRequest.field_w.a(wi.field_b, 50);
        NetworkArchiveRequest.field_w = null;
        if (param0 != 4) {
          ij.c(-47);
        }
        if (hh.field_c != null) {
          hh.field_c.restoreSize(125);
        }
        MouseInputHandler.field_b.requestFocus();
    }

    final static NameAvailabilityResult a(String param0, int param1, int param2) {
        NameAvailabilityResult var3 = null;
        RuntimeException var3_ref = null;
        NameAvailabilityResult stackIn_2_0 = null;
        NameAvailabilityResult stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new NameAvailabilityResult(false);
          var3.field_d = param0;
          if (param1 != 256) {
            stackIn_2_0 = (NameAvailabilityResult) null;
            return stackIn_2_0;
          }
          var3.field_b = param2;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ij.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (!this.field_m && (2 != this.field_h ||
          0 >= this.field_d)) {
          if (param0 > -36) {
            return 80;
          }
          if (this.field_f == LoadProgressDialog.field_bb) {
            return 1;
          }
          if (eg.field_b != 2) {
            return 0;
          }
          if (TutorialAction.a(2113942113, this.field_i)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static void a(boolean param0, int param1) {
        if (7 != DelegatingCanvas.field_d) {
          throw new RuntimeException();
        }
        int var2 = PolarSortVector.a((byte) 65, ArchiveIndex.b((byte) -49).field_p);
        if (var2 == 2) {
          wm.a(param0, false, 12);
        }
        if (var2 != 0) {
          return;
        }
        qd.a(20830, 3 + StrongCacheEntry.field_w);
        nm.field_b = ArchiveIndex.b((byte) -49);
        if (UsernameLoginCredentials.a(nm.field_b, true)) {
          MusicPatchPcmStream.field_r = new RaceWorld(nm.field_b, 0, false, false, t.field_l, -1);
        } else {
          ArchiveRequest.field_r = 0;
          QuickChatPhraseDefinition.field_r = t.field_l;
          fl.field_j = false;
          qn.field_k = false;
          MusicPatchPcmStream.field_r = null;
          DiskCacheStore.field_i = -1;
        }
        EntitySound.field_j = true;
        wm.a(param0, false, 10);
        ((GameMenu) (l.field_a[10])).targetCarouselOffset = 480;
        if (param1 >= -72) {
          field_k = (String) null;
        }
    }

    public static void clearSharedReferences(int param0) {
        int var1 = -26 / ((param0 - 53) / 48);
        field_k = null;
        field_c = (int[][]) null;
        field_a = null;
        field_g = null;
        field_n = null;
    }

    ij(boolean param0) {
        this.field_j = MidiPcmStream.field_H;
        this.field_f = fc.field_c;
        this.field_h = MusicPatch.field_m;
        this.field_i = TextFieldRenderer.field_u;
        this.field_e = NineSlicePanel.field_f;
        this.field_o = fi.field_kb;
        this.field_d = pj.field_o;
        if (param0) {
          this.field_b = TextLayout.field_d;
        } else {
          this.field_b = null;
        }
        this.field_m = jc.field_f;
    }

    static {
        field_n = "Two kills remaining.";
        field_c = new int[][]{new int[]{65}, new int[]{66}, new int[]{32}, new int[]{48}, new int[]{86, 81, 82, 80}};
        field_a = "pts";
    }
}
