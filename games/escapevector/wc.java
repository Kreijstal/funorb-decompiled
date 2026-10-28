/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    boolean field_e;
    static String field_b;
    private int field_g;
    int field_h;
    boolean field_j;
    private int field_a;
    static TrackerMusicDefinition field_d;
    private int field_c;
    private int field_i;
    int field_k;
    static int field_l;
    private int field_f;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 49) {
          wc.a(false, -49, true);
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          this.field_g = -57;
          if (this.field_g != 2) {
            return this.field_c == 96 ? true : false;
          }
          return true;
        }
        if (this.field_g == 2) {
          return true;
        }
        if (this.field_c != 96) {
          return false;
        }
        return true;
    }

    final boolean b(int param0) {
        if (param0 == -98) {
          return this.field_c == 97 ? true : false;
        }
        this.field_a = -21;
        return this.field_c == 97 ? true : false;
    }

    final static int c(int param0) {
        if (param0 != -31119) {
          wc.a(97, -30, 91, (byte) 54);
          return bl.field_h;
        }
        return bl.field_h;
    }

    final boolean b(byte param0) {
        if (param0 != -18) {
          this.a((byte) -45, -80, 2, 65, -24, 89, 16);
          if (0 != this.field_i) {
            return true;
          }
          if (this.field_c != 84) {
            return 83 == this.field_c ? true : false;
          }
          return true;
        }
        if (0 != this.field_i) {
          return true;
        }
        if (this.field_c == 84) {
          return true;
        }
        if (83 != this.field_c) {
          return false;
        }
        return true;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
          return true;
        }
        return this.field_c == 103 ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 == 0) {
          int var6 = this.a((byte) 113, param2, dh.field_d, param3, param4, UiContainer.field_y, param1);
          int var7 = this.a((byte) 124, param2, sf.field_c, param3, param4, ng.field_ob, param1);
          this.a(var7, (byte) 118, var6);
          return;
        }
    }

    final void a(boolean param0, int param1) {
        if (this.field_a == 0) {
          this.field_e = true;
          this.field_j = false;
          this.field_h = param1;
          if (param0) {
            this.field_c = -57;
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        this.field_c = -57;
    }

    final void c(byte param0) {
        this.field_e = false;
        this.field_c = 0;
        if (param0 != 6) {
          return;
        }
        this.field_g = 0;
        this.field_i = 0;
        if (this.field_a != 0) {
          if (0 == this.field_a) {
            this.field_c = nk.field_n;
          }
        } else if (nk.field_n != 98) {
          if (0 != this.field_a) {
            if (0 == this.field_a &&
              nk.field_n == 99) {
              this.field_h = this.field_h + 1;
              this.field_j = false;
              this.field_e = true;
              if (this.field_h >= this.field_k) {
                this.field_h = 0;
              }
            }
            return;
          }
          this.field_c = nk.field_n;
        } else if (this.field_h > 0) {
          this.field_e = true;
          this.field_j = false;
          this.field_h = this.field_h - 1;
          if (0 == this.field_a) {
            this.field_c = nk.field_n;
            if (0 == this.field_a &&
              nk.field_n == 99) {
              this.field_h = this.field_h + 1;
              this.field_j = false;
              this.field_e = true;
              if (this.field_h >= this.field_k) {
                this.field_h = 0;
              }
            }
            return;
          }
        } else {
          this.field_h = this.field_k;
          this.field_e = true;
          this.field_j = false;
          this.field_h = this.field_h - 1;
          if (0 == this.field_a) {
            this.field_c = nk.field_n;
          }
        }
        if (0 != this.field_a) {
          return;
        }
        if (nk.field_n != 99) {
          return;
        }
        this.field_h = this.field_h + 1;
        this.field_j = false;
        this.field_e = true;
        if (this.field_h < this.field_k) {
          return;
        }
        this.field_h = 0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_j = param1 ? true : false;
        this.field_a = 0;
        if (param0 <= 89) {
          return;
        }
        if (this.field_j) {
          this.field_h = param2;
          return;
        }
        this.field_h = param3;
    }

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        int var9 = 0;
        int var13 = EscapeVector.obfuscationControl;
        nn.field_a = kh.a(param2, (byte) 126, "commonui", "frame_top");
        bn.field_d = kh.a(param2, (byte) -114, "commonui", "frame_bottom");
        cc.field_j = fe.a("commonui", param2, "jagex_logo_grey", true);
        fk.field_f = kh.a(param2, (byte) -81, "commonui", "button");
        EditableTextWidget.field_E = ui.a("validation", param2, "commonui", (byte) 77);
        ke.field_c = (BitmapFont) ((Object) ac.a("arezzo12", -110, param2, "commonui", param3));
        Js5Transport.field_a = (BitmapFont) ((Object) ac.a("arezzo14", -124, param2, "commonui", param3));
        dl.field_b = (BitmapFont) ((Object) ac.a("arezzo14bold", -93, param2, "commonui", param3));
        Sprite var17 = new Sprite(param1.a(-4, "", "button.gif"), (java.awt.Component) ((Object) of.field_d));
        AccountRegistrationPanel.a(param2, 50, "dropdown", "commonui");
        IndexedSprite[] var5 = ae.a("commonui", "screen_options", (byte) -65, param2);
        SoundCache.field_f = new IndexedSprite[4];
        CachedArchiveProvider.field_w = new IndexedSprite[4];
        ej.field_f = new IndexedSprite[4];
        IndexedSprite[][] var6 = new IndexedSprite[][]{SoundCache.field_f, ej.field_f, CachedArchiveProvider.field_w};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_l;
        for (int var8 = 1; var19.length > var8; var8++) {
          var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        int var8Lifetime1 = var5[0].field_k[0];
        var19[2][var8Lifetime1] = 16777215;
        var19[1][var8Lifetime1] = 2394342;
        var19[3][var8Lifetime1] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
          IndexedSprite[] var14 = var6[var9];
          IndexedSprite[] var10 = var14;
          for (int var11_int = 0; var14.length > var11_int; var11_int++) {
            var14[var11_int] = ValidationState.a(-50, var5[var9], var19[var11_int]);
          }
        }
        var9 = var17.height;
        hf.a(-123);
        var17.g();
        SoftwareRasterizer.c(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
        Sprite var15 = new Sprite(var9, var9);
        Sprite var18 = var15;
        var18.g();
        var17.d(0, 0);
        if (param0 != 83) {
          return;
        }
        try {
          Sprite var11 = new Sprite(var9, var9);
          var11.g();
          var17.d(-var17.width + var9, 0);
          Sprite var12 = new Sprite(-(var9 * 2) + var17.width, var9);
          var12.g();
          var17.d(-var9, 0);
          dl.a((byte) -109);
          fk.field_f = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wc.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean g(int param0) {
        int var2 = -51 / ((param0 - 67) / 37);
        return this.field_c == 96 ? true : false;
    }

    final boolean d(int param0) {
        if (param0 == -10809) {
          return this.field_c == 102 ? true : false;
        }
        this.field_h = 24;
        return this.field_c == 102 ? true : false;
    }

    final static dc a(int param0, int param1, int param2, byte param3) {
        dc var4 = new dc();
        var4.field_h = new int[param2];
        var4.field_j = param0;
        if (param3 == -51) {
          en.field_i.addLast(-12328, var4);
          ArchiveRequest.a(param1, var4, -755);
          return var4;
        }
        field_d = (TrackerMusicDefinition) null;
        en.field_i.addLast(-12328, var4);
        ArchiveRequest.a(param1, var4, -755);
        return var4;
    }

    final void a(int param0, byte param1, int param2) {
        if (this.field_k <= param2) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.field_k) {
          throw new IllegalArgumentException();
        }
        this.field_g = 0;
        this.field_i = 0;
        this.field_e = false;
        this.field_c = 0;
        if (0 != qi.field_N) {
          this.field_a = qi.field_N;
          this.field_g = qi.field_N;
          this.field_i = qi.field_N;
          this.field_j = true;
          this.field_h = param0;
          this.field_f = FullscreenFocusCanvas.field_h;
        }
        if (this.field_a == 0) {
          if (qi.field_N == 0) {
            if (eb.field_K != 0) {
              if (param1 < 116) {
                return;
              }
              if (this.field_a != 0) {
                return;
              }
              if (!this.field_j &&
                !TextFieldValidator.field_h) {
                return;
              }
              if (param2 >= 0) {
                if (param2 == this.field_h) {
                  this.field_h = param2;
                  this.field_j = true;
                  return;
                }
                this.field_e = true;
                this.field_h = param2;
                this.field_j = true;
                return;
              }
              if (this.field_j) {
                this.field_h = -1;
              }
              return;
            }
            this.field_a = 0;
          }
        } else if (eb.field_K != 0) {
          if (0 >= this.field_f) {
            this.field_f = l.field_H;
            this.field_g = this.field_a;
          }
          this.field_f = this.field_f - 1;
          if (qi.field_N == 0 &&
            eb.field_K == 0) {
            this.field_a = 0;
          }
        } else if (qi.field_N == 0 &&
          eb.field_K == 0) {
          this.field_a = 0;
        }
        if (param1 < 116) {
          return;
        }
        if (this.field_a != 0) {
          return;
        }
        if (!this.field_j &&
          !TextFieldValidator.field_h) {
          return;
        }
        if (param2 < 0) {
          if (!this.field_j) {
            return;
          }
          this.field_h = -1;
          return;
        }
        if (param2 != this.field_h) {
          this.field_e = true;
        }
        this.field_h = param2;
        this.field_j = true;
    }

    final static void a(int param0, int param1, boolean param2, int param3, PacketBuffer param4) {
        try {
          param4.f(12, -123);
          param4.h(-119, 17);
          param4.h(-114, param3);
          param4.h(92, param0);
          param4.f(param1, -123);
          if (!param2) {
            field_b = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "wc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        this.field_e = false;
        this.field_i = 0;
        this.field_c = 0;
        this.field_g = 0;
        if (this.field_a == 0) {
          this.field_c = nk.field_n;
        }
        if (param0 >= 69) {
          return;
        }
        this.f(103);
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param2) {
          SoftwareRasterizer.a(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 192);
          if (param1 != 1983) {
            wc.a(97, 35, -50, (byte) 98);
            se.a(param2, param1 + 15130);
            return;
          }
          se.a(param2, param1 + 15130);
          return;
        }
        SoftwareRasterizer.clearFramebuffer();
        if (param1 != 1983) {
          wc.a(97, 35, -50, (byte) 98);
          se.a(param2, param1 + 15130);
          return;
        }
        se.a(param2, param1 + 15130);
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_a = 0;
        if (param2 != 4767999) {
          this.a(114, true, -119);
          this.field_j = param1 ? true : false;
          if (!this.field_j) {
            return;
          }
          this.field_h = param0;
          return;
        }
        this.field_j = param1 ? true : false;
        if (!this.field_j) {
          return;
        }
        this.field_h = param0;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return this.field_a != 0 ? true : false;
        }
        this.a(65, 8, 125, -70, -123);
        return this.field_a != 0 ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != 23518) {
          return false;
        }
        if (this.field_g == 1) {
          return true;
        }
        if (this.field_c == 97) {
          return true;
        }
        if (this.field_c == 84) {
          return true;
        }
        if (this.field_c != 83) {
          return false;
        }
        return true;
    }

    final int a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 > param2) {
          if (param0 > 112) {
            return -1;
          }
          this.b((byte) -27);
          return -1;
        }
        if (param4 <= param2) {
          if (param0 > 112) {
            return -1;
          }
          this.b((byte) -27);
          return -1;
        }
        if (param5 >= param1) {
          if (param1 + this.field_k * param3 > param5) {
            return (param5 - param1) / param3;
          }
          if (param0 > 112) {
            return -1;
          }
          this.b((byte) -27);
          return -1;
        }
        if (param0 > 112) {
          return -1;
        }
        this.b((byte) -27);
        return -1;
    }

    wc(int param0) {
        this.field_j = false;
        this.field_h = 0;
        this.field_k = param0;
    }

    static {
        field_b = "Hard";
    }
}
