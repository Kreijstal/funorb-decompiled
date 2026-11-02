/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static IndexedSprite[] field_h;
    static UiComponent field_i;
    private String field_f;
    UiComponent field_g;
    static Sprite[] field_l;
    pna field_a;
    private long field_e;
    private int[] field_c;
    private int field_b;
    static int[] field_d;
    String field_j;
    int field_k;

    final void b(boolean param0) {
        String var3;
        int var4;
        uha var5;
        var4 = BachelorFridge.field_y;
        if (null == SnowAnimation.field_w) {
          var5 = SuperSpeedAllEvent.c(-12411, this.field_k);
          if (var5 != null) {
            var3 = var5.field_Jb;
            if (var5.field_Wb) {
              this.field_a.a(lga.a(param0, new String[]{var3}, WidgetTheme.field_a), true, 2);
              this.field_a.a(lga.a(true, new String[]{var3}, cc.field_a), true, 3);
            } else {
              if (var5.field_zb) {
                this.field_a.a(lga.a(true, new String[]{var3}, o.field_i), true, 2);
              } else {
                if (!var5.field_gc &&
                  var5.field_Fb && (!var5.field_Zb ||
                  var5.field_zb)) {
                  this.field_a.a(lga.a(param0, new String[]{var3}, p.field_m), true, 2);
                }
              }
              if (var5.field_gc) {
                this.field_a.a(lga.a(true, new String[]{var3}, MidiNote.field_s), true, 3);
              }
            }
          }
        }
        if (!param0) {
          this.a((byte) -72, true);
        }
    }

    final void a(int param0, gs param1) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.field_i) {
            return;
          }
          if (param0 > -26) {
            this.field_c = (int[]) null;
          }
          this.field_b = param1.field_p;
          if (0 == param1.field_p) {
            if (ShuffleSpecial.field_p == 0) {
              this.field_a.a(eea.field_c, true, 12);
            }
            this.field_a.a(d.field_D, true, 13);
          }
          if (param1.field_p == 1) {
            if (ri.field_c == 0) {
              this.field_a.a(ffa.field_i, true, 12);
            }
            this.field_a.a(GasCloudAnimation.field_B, true, 13);
          }
          if (param1.field_p == 2) {
            if (0 == fj.field_g) {
              this.field_a.a(iea.field_c, true, 12);
            }
            this.field_a.a(ho.field_f, true, 13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ik.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(int param0) {
        String var3 = null;
        if (null != this.field_j &&
          ~this.field_e != ~ge.field_F) {
          var3 = this.b(param0 - 13144);
          String var2 = var3;
          this.field_a.a(lga.a(true, new String[]{var3}, wba.field_d), true, 17);
        }
        if (param0 != 21654) {
          field_l = (Sprite[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        ema var4;
        String var5;
        int var6;
        ema var7;
        var6 = BachelorFridge.field_y;
        if (param0 <= 113) {
          return;
        }
        if (null != this.field_j &&
          this.field_e != ge.field_F &&
          SnowAnimation.field_w != null &&
          ZombiesEvent.d(-117)) {
          var7 = gf.a(this.field_e, false);
          var4 = ImageProducerRasterBuffer.a(this.field_e, 28791);
          var5 = this.b(8510);
          if (var4 != null) {
            if (!SnowAnimation.field_w.field_Zb ||
              !(0 > SnowAnimation.field_w.field_Nb)) {
              this.field_a.a(lga.a(true, new String[]{var5}, gka.field_m), true, 1);
            }
          } else {
            if (var7 != null &&
              SnowAnimation.field_w.field_Fb &&
              SnowAnimation.field_w.field_Rb < SnowAnimation.field_w.field_Pb) {
              if (var7.field_wb) {
                this.field_a.a(lga.a(true, new String[]{var5}, HailAnimation.field_w), true, 1);
              } else {
                if (param1 &&
                  var7.field_Ob) {
                  this.field_a.a(lga.a(true, new String[]{var5}, BattleState.field_q), true, 0);
                  this.field_a.a(lga.a(true, new String[]{var5}, CreatureProfile.field_r), true, 1);
                } else {
                  this.field_a.a(lga.a(true, new String[]{var5}, vca.field_m), true, 0);
                }
              }
            }
          }
        }

    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        field_d = null;
        field_i = null;
        field_h = null;
        if (param0 <= 34) {
          field_d = (int[]) null;
        }
    }

    final static Sprite b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        Sprite var6 = new Sprite(param0, param0);
        Sprite var3 = var6;
        if (param2 != 2) {
          return (Sprite) null;
        }
        for (var4 = 0; var4 < var3.field_v.length; var4++) {
          var6.field_v[var4] = param1;
        }
        return var3;
    }

    private final boolean c(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var5;
        var5 = BachelorFridge.field_y;
        if (param1 != 10960) {
          discarded$1 = this.a(-100, 21, 18);
        }
        if (param0 == 0) {
          bia.a((byte) 35, this.field_e, param2);
        } else {
          if (param0 == 1) {
            BuffVendorAnimation.a(this.field_e, param2, 2);
          } else {
            if (2 != param0) {
              if (param0 != 3) {
                if (param0 == 10) {
                  CreatureOrder.a(param2, this.field_k, false);
                } else {
                  if (param0 != 15) {
                    if (param0 != 16) {
                      return false;
                    }
                    PacketBuffer.a(0, param2, (byte) 87);
                  } else {
                    PacketBuffer.a(this.field_k, param2, (byte) -101);
                  }
                }
              } else {
                rja.a(param2, this.field_k, param1 - 10959);
              }
            } else {
              ep.a(false, param2, this.field_k);
            }
          }
        }
        return true;
    }

    final void a(byte param0, boolean param1) {
        this.field_a.a(param1, 7802);
        if (param0 >= -119) {
          this.field_g = (UiComponent) null;
        }
    }

    final void a(int[] param0, byte param1, int param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        nea var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (param1 >= -105) {
            this.a(false);
          }
          if (null != this.field_j && (~ge.field_F != ~this.field_e ||
            param2 == 2)) {
            if (um.field_c != 2) {
              return;
            }
            var7 = this.b(8510);
            var4 = var7;
            var5 = DisableAnimation.b(-100, this.field_j);
            var6 = DisableAnimation.a((byte) 5, this.field_j) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_a.a(lga.a(true, new String[]{var7}, faa.field_a), true, 4);
              this.field_a.a(lga.a(true, new String[]{var7}, hba.field_v), true, 6);
              if (param0 != null &&
                2 != param2 &&
                !hl.field_I) {
                this.field_c = param0;
                this.field_a.a(lga.a(true, new String[]{var7}, pe.field_n), true, 19);
              }
            }
            if (var5 != null) {
              if (!sha.a((byte) -24, this.field_j) &&
                !hl.field_I) {
                if (!sea.field_j) {
                  this.field_a.a(lga.a(true, new String[]{var7}, jv.field_m), true, 8);
                }
                this.field_a.a(lga.a(true, new String[]{var7}, lga.field_i), true, 18);
                if (param0 != null) {
                  this.field_c = param0;
                  this.field_a.a(lga.a(true, new String[]{var7}, pe.field_n), true, 19);
                }
              }
              this.field_a.a(lga.a(true, new String[]{var7}, gl.field_g), true, 5);
            }
            if (var6 == 0) {
              return;
            }
            this.field_a.a(lga.a(true, new String[]{var7}, oj.field_n), true, 7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("ik.D(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var5;
        var5 = BachelorFridge.field_y;
        if (param0 != -14) {
          discarded$1 = this.d(35, -60, 45);
        }
        if (8 == param2) {
          BuffVendorAnimation.a(this.field_e, this.field_j, false);
        } else {
          if (param2 != 18) {
            if (param2 != 11) {
              if (param2 != 12) {
                if (param2 != 13) {
                  if (14 != param2) {
                    if (20 != param2) {
                      if (19 != param2) {
                        return false;
                      }
                      ew.a(this.field_c, this.field_e, this.field_b, false, this.field_j);
                      return true;
                    }
                    HomingMissileEvent.d(param0 + 14);
                  } else {
                    kw.a(true);
                  }
                } else {
                  HomingMissileEvent.a(param0 ^ -108, this.field_b, param1, 2);
                }
              } else {
                HomingMissileEvent.a(123, this.field_b, param1, 1);
              }
            } else {
              HomingMissileEvent.a(param0 ^ -117, this.field_b, param1, 0);
            }
          } else {
            BufferedSocket.a(this.field_j, (byte) 89, this.field_e);
          }
        }
        return true;
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != 8510) {
          this.field_k = 101;
        }
        if (null == this.field_f) {
          var2 = this.field_j;
        } else {
          var2 = this.field_f;
        }
        return var2;
    }

    final boolean a(boolean param0) {
        String discarded$1 = null;
        boolean stackIn_6_0 = false;
        if (!param0) {
          discarded$1 = this.b(-99);
        }
        stackIn_6_0 = (null != this.field_a) && (this.field_a.g(0));
        return stackIn_6_0;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3, int param4) {
        int var6 = this.field_a.b(param1, 74);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$0 = this.c(var6, 10960, param4);
        boolean discarded$3 = this.d(param2, var6, 96);
        if (!param0) {
          return false;
        }
        boolean discarded$4 = this.a(-14, param2, var6);
        boolean discarded$5 = this.e(var6, param3, -12211);
        return true;
    }

    final static void a(int param0, FridgeCreature param1, int param2, int param3) {
        BitPacketBuffer var4 = null;
        int var5 = 0;
        if (AttackUpAllAnimation.e(-29919)) {
          return;
        }
        try {
          var4 = sja.field_fb;
          var4.writeCipheredByte(85, (byte) 117);
          sja.field_fb.position = sja.field_fb.position + 2;
          var5 = sja.field_fb.position;
          rha.a(param1.field_g, var4, (byte) -116);
          var4.writeByte(param0, 0);
          var4.writeByte(param3, param2 ^ param2);
          sja.field_fb.writeLengthShort((byte) -88, sja.field_fb.position - var5);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ik.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean e(int param0, int param1, int param2) {
        if (param0 == 17) {
          wt.field_n = new uq(this.field_g.field_D, this.field_g.field_M, this.field_g.field_sb, this.field_g.field_p, param1, qaa.field_d, mda.field_c, SlowAllEvent.field_s, qs.field_m, RageAnimation.field_v, dla.field_k, this.field_j, this.field_e);
          return true;
        }
        if (param2 != -12211) {
          return true;
        }
        return false;
    }

    private final boolean d(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        Object var4;
        String var4_ref;
        String var5;
        if (param2 <= 12) {
          discarded$1 = this.a(79, -108, -76);
        }
        var4 = null;
        if (param1 == 4) {
          var4_ref = lda.a(-26181, param0, this.field_j);
        } else {
          if (param1 != 5) {
            if (param1 != 6) {
              if (param1 != 7) {
                return false;
              }
              var4_ref = DreamsSpecial.a(2, this.field_j, this.field_f, param0);
            } else {
              var4_ref = ip.a(this.field_j, (byte) -80, param0);
            }
          } else {
            var4_ref = via.a(param0, this.field_j, -100);
          }
        }
        if (var4_ref == null) {
          return true;
        }
        var5 = (String) null;
        vf.a(this.field_j, 0, 124, (String) null, var4_ref, 2);
        return true;
    }

    ik(UiComponent param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_a = new pna(SpecialOrder.field_o);
          this.field_f = param3;
          this.field_j = param2;
          this.field_k = param4;
          this.field_g = param0;
          this.field_b = param5;
          this.field_e = param1;
          this.field_c = param6;
          param0.field_t = true;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
