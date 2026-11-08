/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ed extends qk implements ButtonListener {
    static String field_tb;
    static char field_Bb;
    static String field_xb;
    private boolean field_Ab;
    static String field_Eb;
    static String field_Db;
    static DiskCacheWorker field_yb;
    private boolean field_zb;
    private boolean field_Fb;
    static int[] field_Ib;
    private boolean field_Gb;
    static int field_Cb;
    private om field_ub;
    private BitmapFont field_wb;
    static Sprite field_vb;
    static int field_Hb;

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        UiComponent var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -120) {
            var6 = (UiComponent) null;
            this.handleKeyInput((UiComponent) null, (byte) -14, 'Y', 108);
          }
          if (param3 != 13) {
            stackIn_6_0 = super.handleKeyInput(param0, (byte) -122, param2, param3);
            return stackIn_6_0;
          }
          this.h(77);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ed.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void h(int param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        if (param0 != 77) {
          return;
        }
        if (this.field_Ab) {
          fj.c(-120);
          return;
        }
        if (!this.field_Fb) {
          return;
        }
        pn.c(-11090);
    }

    ed(h param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new me((ed) null, param1, param2), 77, 10, 10);
        try {
          this.field_wb = param1;
          this.field_Ab = param3 ? true : false;
          this.field_Fb = param4 ? true : false;
          this.field_Gb = false;
          this.field_zb = false;
          this.field_ub = new om(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ub.field_I = true;
          this.addChild(-105, this.field_ub);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_17_1 = false;
        int stackIn_36_0 = 0;
        boolean stackIn_37_1 = false;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        boolean stackIn_55_1 = false;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        boolean stackIn_79_1 = false;
        int stackIn_93_0 = 0;
        int stackIn_97_0 = 0;
        boolean stackIn_98_1 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        int var2Lifetime2;
        int var3Lifetime2;
        if (null == SpriteState.field_z) {
          if (null == r.field_b) {
            var2 = 25 % ((38 - param1) / 34);
            if (cb.field_b &&
              MusicCrossfadeStream.field_A) {
              if (hi.field_a &&
                SocketJs5Transport.field_r) {
                stackIn_93_0 = 1;
              } else {
                stackIn_93_0 = 0;
              }
              var3 = stackIn_93_0;
              stackIn_97_0 = 0;
              stackIn_98_1 = (param0) && (gj.a(29372)) && (var3 == 0);
              ui.a(stackIn_97_0, stackIn_98_1);
              if (var3 != 0) {
                if (!param0) {
                  ml.a(false, -101);
                  return;
                }
                if (!gj.a(29372)) {
                  ml.a(false, -101);
                  return;
                }
                ml.a(true, -101);
              }
            }
            return;
          }
          r.field_b.a(param0, -26449);
          var2Lifetime2 = 25 % ((38 - param1) / 34);
          if (!cb.field_b) {
            return;
          }
          if (!MusicCrossfadeStream.field_A) {
            return;
          }
          if (hi.field_a &&
            SocketJs5Transport.field_r) {
            stackIn_74_0 = 1;
          } else {
            stackIn_74_0 = 0;
          }
          var3Lifetime2 = stackIn_74_0;
          stackIn_78_0 = 0;
          stackIn_79_1 = (param0) && (gj.a(29372)) && (var3Lifetime2 == 0);
          ui.a(stackIn_78_0, stackIn_79_1);
          if (var3Lifetime2 == 0) {
            return;
          }
          if (!param0) {
            ml.a(false, -101);
          } else {
            if (!gj.a(29372)) {
              ml.a(false, -101);
            } else {
              ml.a(true, -101);
            }
          }
          return;
        }
        SpriteState.field_z.a(param0, EmailLoginCredentials.field_j, 0, true, 0, 96, EmailLoginCredentials.field_f);
        if (null == r.field_b) {
          var2Lifetime1 = 25 % ((38 - param1) / 34);
          if (!cb.field_b) {
            return;
          }
          if (!MusicCrossfadeStream.field_A) {
            return;
          }
          if (hi.field_a &&
            SocketJs5Transport.field_r) {
            stackIn_12_0 = 1;
          } else {
            stackIn_12_0 = 0;
          }
          var3Lifetime1 = stackIn_12_0;
          stackIn_16_0 = 0;
          stackIn_17_1 = (param0) && (gj.a(29372)) && (var3Lifetime1 == 0);
          ui.a(stackIn_16_0, stackIn_17_1);
        } else {
          r.field_b.a(param0, -26449);
          var2Lifetime1 = 25 % ((38 - param1) / 34);
          if (!cb.field_b) {
            return;
          }
          if (!MusicCrossfadeStream.field_A) {
            return;
          }
          if (!hi.field_a) {
            var3Lifetime1 = 0;
            stackIn_36_0 = 0;
            stackIn_37_1 = (param0) && (gj.a(29372)) && (var3Lifetime1 == 0);
            ui.a(stackIn_36_0, stackIn_37_1);
          } else {
            stackIn_50_0 = (!SocketJs5Transport.field_r) ? 0 : 1;
            var3Lifetime1 = stackIn_50_0;
            stackIn_54_0 = 0;
            stackIn_55_1 = (param0) && (gj.a(29372)) && (var3Lifetime1 == 0);
            ui.a(stackIn_54_0, stackIn_55_1);
          }
        }
        if (var3Lifetime1 == 0) {
          return;
        }
        if (!param0) {
          ml.a(false, -101);
        } else {
          if (!gj.a(29372)) {
            ml.a(false, -101);
          } else {
            ml.a(true, -101);
          }
        }
    }

    public static void releaseStatics(int param0) {
        field_yb = null;
        field_xb = null;
        field_Ib = null;
        field_Db = null;
        field_vb = null;
        field_tb = null;
        field_Eb = null;
        if (param0 != -29222) {
          ed.releaseStatics(-73);
        }
    }

    final void g(boolean param0) {
        this.field_ub.setColours(4210752, param0, 2121792);
        me var2 = new me(this, this.field_wb, Bzip2State.field_k);
        var2.a(r.field_e, (byte) 3, 15);
        this.a((byte) -92, (UiComponent) (var2));
    }

    final void a(boolean param0, String param1, int param2) {
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        me stackIn_14_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        me var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        me var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_Gb) {
            return;
          }
          stackIn_6_1 = (param0);
          this.field_Gb = stackIn_6_1;
          stackIn_9_1 = (256 == param2);
          this.field_zb = stackIn_9_1;
          this.field_ub.setColours(4210752, param0, 8405024);
          var6 = new me(this, this.field_wb, param1);
          var4 = var6;
          if (5 != param2) {
            if (256 == param2) {
              var6.a(118, sk.field_b, (UiListener) (this));
            } else {
              stackIn_14_0 = var6;
              if (!this.field_Ab) {
                stackIn_15_1 = ae.field_b;
              } else {
                stackIn_15_1 = sk.field_b;
              }
              ((me) (Object) stackIn_14_0).a(stackIn_15_1, (byte) 111, -1);
            }
          } else {
            var6.a(DebouncedValidator.field_f, (byte) 106, 11);
            var6.a(ki.field_u, (byte) 111, 17);
          }
          if (param2 != 3) {
            if (param2 == 4) {
              var6.a(ad.field_e, (byte) -117, 8);
            } else {
              if (6 == param2) {
                var6.a(DiskCacheRequest.field_B, (byte) -114, 9);
              } else {
                if (param2 == 9) {
                  var6.a(81, fk.field_j, (UiListener) (this));
                }
              }
            }
          } else {
            var6.a(LoginCredentials.field_b, (byte) 110, 7);
          }
          this.a((byte) -92, (UiComponent) (var6));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("ed.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String k(int param0) {
        if (param0 != -952) {
          field_tb = (String) null;
          if (in.field_Gb == sk.field_a) {
            return ln.field_Q;
          }
          if (hb.field_Gb == sk.field_a) {
            return KeyboardInputHandler.field_j;
          }
          if (!SingleChildContainer.field_z.a((byte) -81)) {
            return KeyboardInputHandler.field_j;
          }
          return ge.field_g;
        }
        if (in.field_Gb == sk.field_a) {
          return ln.field_Q;
        }
        if (hb.field_Gb == sk.field_a) {
          return KeyboardInputHandler.field_j;
        }
        if (!SingleChildContainer.field_z.a((byte) -81)) {
          return KeyboardInputHandler.field_j;
        }
        return ge.field_g;
    }

    final static void loadJagexLogoSound(byte param0, ResourceArchive param1) {
        VorbisSample var2 = null;
        try {
          VorbisSample.decodeSetup(param1.a("", "headers.packvorbis", -1));
          if (param0 != -17) {
            field_tb = (String) null;
          }
          var2 = VorbisSample.loadNamed(param1, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ed.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public void a(boolean param0, int param1, int param2, int param3, TextButton param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return;
          }
          if (!this.field_zb) {
            fk.openUrl(cd.getApplet(104), false, "tochangedisplayname.ws");
            return;
          }
          DebouncedValidator.a(3, (byte) 30);
          this.h(77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ed.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 90) {
          return;
        }
        if (pm.field_b != null) {
          SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.field_i, SoftwareRasterizer.field_c, -SoftwareRasterizer.field_i + SoftwareRasterizer.field_h, SoftwareRasterizer.field_k - SoftwareRasterizer.field_c);
          pm.field_b.drawFullScreen(param1, true);
        }
    }

    final static void j(int param0) {
        int var1 = DiskCacheRequest.field_F * DiskCacheRequest.field_F;
        int var2 = -(jo.field_e * jo.field_e) + var1;
        int var3 = (-ma.field_N + TextLine.field_k) * var2 / var1 + ma.field_N;
        IntKeyLookup.field_g.setBounds(640, sa.field_Hb, var3, param0, (byte) -120);
        IsaacRandom.a(5, TextLine.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
    }

    static {
        field_Db = "Security";
        field_Eb = "IMP MASTER - ";
        field_Ib = new int[]{21, 22, 23};
        field_tb = "This is <%0>'s RuneScape clan if they have one.";
        field_xb = "End Game";
        field_Cb = -1;
    }
}
