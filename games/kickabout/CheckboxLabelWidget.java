/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxLabelWidget extends hd {
    static BinaryBitmapFont field_Ab;
    private int field_zb;
    private String field_Hb;
    static String field_yb;
    static hd field_Cb;
    static String field_Eb;
    static String field_Db;
    static String field_Bb;
    static String field_Fb;
    boolean field_Gb;

    final static int a(long param0, int param1, byte param2) {
        if (param2 >= 96) {
          param1 = (int)(param0 * (long)param1 >> 16);
          return param1;
        }
        CheckboxLabelWidget.a('￸', 47);
        param1 = (int)(param0 * (long)param1 >> 16);
        return param1;
    }

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (vt.a(param0, true)) {
          return true;
        }
        if (param0 == 45) {
          return true;
        }
        if (160 == param0) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (param1 == 160) {
          return false;
        }
        CheckboxLabelWidget.a('1', 48);
        return false;
    }

    final static void c(int param0, boolean param1) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        gm var7 = null;
        gm var8 = null;
        int var2_intLifetime1;
        var4 = Kickabout.field_G;
        try {
          for (var2_int = 0; 2 > var2_int; var2_int++) {
            for (var3 = 1; 5 > var3; var3++) {
              et.field_d.field_P[var2_int][var3].directionMask = 0;
              et.field_d.field_E.b(22997);
            }
          }
          et.field_d.participantStatus[0].controlledSlot = 0;
          ks.field_e = param0;
          ic.field_i = false;
          et.field_d.participantStatus[1].controlledSlot = 0;
          if (ks.field_e == 1) {
            EmailAvailabilityValidator.field_k.a(29360128, false, 0, 107085824);
            EmailAvailabilityValidator.field_k.field_R = 1024;
            EmailAvailabilityValidator.field_k.setDirectionFromMask(4, 26214);
            et.field_d.field_V.a(29360128, 0, (byte) 26, 44040192);
            vb.field_d = 1;
          } else {
            if (ks.field_e != 2) {
              if (ks.field_e != 3) {
                if (4 != ks.field_e) {
                  if (ks.field_e != 5) {
                    if (6 == ks.field_e) {
                      ld.field_f.a(655360, param1, 0, 19005440);
                      vb.field_d = 1;
                      var5 = 0;
                      var2_intLifetime1 = var5;
                      while (3 > var5) {
                        KitStyleTile.field_zb[var5] = 740;
                        ((gm) (et.field_d.field_P[1][1 + var5])).a(400 + var5 * 100 << 16, param1, 0, -(var5 * 40) + 330 << 16);
                        var5++;
                      }
                    } else {
                      if (ks.field_e == 7) {
                        vb.field_d = 3;
                        var8 = (gm) (et.field_d.field_P[1][4]);
                        var8.a(-13107200, false, 0, 22937600);
                        et.field_d.participantStatus[1].controlledSlot = 4;
                        var8.directionMask = 8;
                        ld.field_f.directionMask = 4;
                      } else {
                        if (ks.field_e == 8) {
                          vb.field_d = 3;
                        } else {
                          if (ks.field_e != 9) {
                            if (ks.field_e != 10) {
                              if (ks.field_e == 11) {
                                vb.field_d = 4;
                              } else {
                                if (12 == ks.field_e) {
                                  vb.field_d = 4;
                                } else {
                                  if (ks.field_e != 13) {
                                    if (ks.field_e == 14) {
                                      um.field_e.beginPhase(26415, 2);
                                      et.field_d.disableLocal = false;
                                      AnimationSkeleton.field_m = 500;
                                    }
                                  } else {
                                    vb.field_d = 4;
                                    var7 = (gm) (et.field_d.field_P[1][0]);
                                    var7.a(29360128, false, 0, -19005440);
                                    var7.field_o = 8;
                                    var7.directionMask = 0;
                                  }
                                }
                              }
                            } else {
                              vb.field_d = 1;
                              fc.field_c.a(1310720, false, 0, 36438016);
                            }
                          } else {
                            vb.field_d = 3;
                            EmailAvailabilityValidator.field_k.a(0, false, 0, 44040192);
                          }
                        }
                      }
                    }
                  } else {
                    vb.field_d = 3;
                  }
                } else {
                  ld.field_f.a(42270720, false, 0, 41287680);
                  vb.field_d = 1;
                }
              } else {
                vb.field_d = 1;
              }
            } else {
              vb.field_d = 1;
            }
          }
          sl.field_Eb = true;
          LoginCredentials.a(-25246, false, param1, false, false, false, false);
          mk.b(-1622);
          et.field_d.field_x = new PlayArea[]{new PlayArea(-800, -800, 1800, 1800)};
          et.field_d.field_B = et.field_d.field_x;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "jw.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_Db = null;
          field_Bb = null;
          field_Fb = null;
          field_Cb = null;
          field_Eb = null;
          field_yb = null;
          field_Ab = null;
          return;
        }
        CheckboxLabelWidget.a(76);
        field_Db = null;
        field_Bb = null;
        field_Fb = null;
        field_Cb = null;
        field_Eb = null;
        field_yb = null;
        field_Ab = null;
    }

    CheckboxLabelWidget(String param0, BitmapFont param1) {
        this(param0, param1, -1);
    }

    final void a(boolean param0, byte param1) {
        int var3;
        int var4;
        int var5;
        Sprite var6;
        int var7;
        int stackIn_5_0 = 0;
        Sprite[] stackIn_9_0 = null;
        int stackIn_12_1 = 0;
        Sprite[] stackIn_24_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        Sprite[] stackIn_48_0 = null;
        int stackIn_51_1 = 0;
        int var7Lifetime1;
        var3 = this.field_F + (this.field_q + this.field_zb >> 1);
        regionExit1: {
          if (!this.field_lb) {
            stackIn_40_0 = 65793;
          } else {
            if (!this.field_gb) {
              var4 = 65793;
              stackIn_5_0 = (!this.field_lb) ? 7829367 : 16777215;
              var5 = stackIn_5_0;
              if (param1 == 46) {
                if (!this.field_lb) {
                  stackIn_9_0 = sq.field_F;
                } else {
                  stackIn_9_0 = gk.field_a;
                }
                stackIn_12_1 = (!this.field_Gb) ? 0 : 1;
                var6 = stackIn_9_0[stackIn_12_1];
                SoftwareRasterizer.a(this.field_F, this.field_T, this.field_q, this.field_mb, 6, var4, 128);
                if (param0 &&
                  this.field_lb) {
                  if (this.field_gb) {
                    this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                    var6.c(-26 + var3, this.field_T + ((this.field_mb - var6.field_v >> 1) - 2));
                    return;
                  }
                  var7 = IntTripleCommand.h(40);
                  if (0 <= var7) {
                    SoftwareRasterizer.f(this.field_F, this.field_T, this.field_q, this.field_mb, 6, 65793 * var7);
                  }
                }
                this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                var6.c(-26 + var3, this.field_T + ((this.field_mb - var6.field_v >> 1) - 2));
                return;
              }
              this.a(true, (byte) -8);
              if (!this.field_lb) {
                stackIn_24_0 = sq.field_F;
              } else {
                stackIn_24_0 = gk.field_a;
              }
              stackIn_27_1 = (!this.field_Gb) ? 0 : 1;
              var6 = stackIn_24_0[stackIn_27_1];
              break regionExit1;
            }
            stackIn_40_0 = 16777215;
          }
          var4 = stackIn_40_0;
          stackIn_43_0 = (!this.field_lb) ? 7829367 : 16777215;
          var5 = stackIn_43_0;
          if (param1 != 46) {
            this.a(true, (byte) -8);
          }
          if (!this.field_lb) {
            stackIn_48_0 = sq.field_F;
          } else {
            stackIn_48_0 = gk.field_a;
          }
          stackIn_51_1 = (!this.field_Gb) ? 0 : 1;
          var6 = stackIn_48_0[stackIn_51_1];
        }
        SoftwareRasterizer.a(this.field_F, this.field_T, this.field_q, this.field_mb, 6, var4, 128);
        if (param0 &&
          this.field_lb &&
          !this.field_gb) {
          var7Lifetime1 = IntTripleCommand.h(40);
          if (0 <= var7Lifetime1) {
            SoftwareRasterizer.f(this.field_F, this.field_T, this.field_q, this.field_mb, 6, 65793 * var7Lifetime1);
          }
        }
        this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
        var6.c(-26 + var3, this.field_T + ((this.field_mb - var6.field_v >> 1) - 2));
    }

    CheckboxLabelWidget(String param0, BitmapFont param1, int param2) {
        try {
          this.field_X = param1;
          this.field_Hb = param0;
          this.field_zb = 45 + this.field_X.a(param0);
          this.field_mb = 30;
          this.field_q = -1 == param2 ? this.field_zb : param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Db = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_Eb = "Bid bigger than Buyout";
        field_yb = "Loading...";
        field_Bb = "Warning! Once used, trinkets may be replaced but not removed.";
        field_Fb = "No players";
    }
}
