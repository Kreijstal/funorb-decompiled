/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DamageEffect extends EventEffect {
    private int field_l;
    boolean field_j;
    private int field_k;
    static String field_i;

    final void a(BattleCreature param0, BattleState param1, int param2) {
        try {
          if (param2 != 12) {
            this.field_l = -27;
          }
          this.a((byte) -27, param0, param1, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "iv.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(PacketBuffer param0, byte param1) {
        int var3_int = 0;
        try {
          super.a(param0, (byte) -28);
          FlirtAnimation.a(this.target, 107, param0);
          var3_int = 32767 & this.field_f;
          if (this.field_j) {
            var3_int = var3_int | 32768;
          }
          param0.b(var3_int, -111);
          var3_int = var3_int | this.field_l << 5 & 224;
          param0.writeByte(var3_int, 0);
          param0.writeByte(this.field_k, 0);
          int var4 = -49 / ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "iv.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final AnimationNode a(ad param0, gj param1, boolean param2, int param3) {
        AnimationNode discarded$0 = null;
        Object stackIn_48_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        BattleCreature var6 = null;
        BattleCreature var7 = null;
        Object var8 = null;
        gj var9 = null;
        BattleState var10 = null;
        BattleState var11 = null;
        try {
          var10 = param1.field_h;
          var11 = var10;
          var6 = param0.field_s;
          var7 = this.target.a(120, var11);
          if (param2) {
            var9 = (gj) null;
            discarded$0 = this.a(-99, (byte) -20, (ad) null, -42, (gj) null);
          }
          var8 = null;
          if (var7.a(13, (byte) -91)) {
            var6.a(5, var7, (byte) 2);
          }
          if (var7.a(this.field_f, var6, (byte) 2)) {
            return null;
          }
          if (this.field_k != 23 &&
            this.field_k != 15 &&
            this.field_k != 21 &&
            this.field_k != 22 &&
            45 != this.field_k &&
            this.field_k != 46 &&
            this.field_k != 48 &&
            this.field_k != 49 &&
            50 != this.field_k &&
            this.field_k != 0) {
            var7.b((byte) 116, this.field_k);
            var7.d(15);
            var11.field_T.field_t[var6.ownerIndex] = sr.a(var10.field_T.field_t[var6.ownerIndex], 1L << aj.a((byte) -20, this.field_k));
          }
          if (!var7.a(32, (byte) -117)) {
            if (this.field_k == 15) {
              var8 = this.a(1, (byte) -13, param0, param3, param1);
            }
            if (this.field_k == 45) {
              var8 = this.a(2, (byte) -13, param0, param3, param1);
            }
            if (this.field_k == 46) {
              var8 = this.a(3, (byte) -13, param0, param3, param1);
            }
            if (23 == this.field_k) {
              var8 = this.a(-1, (byte) -13, param0, param3, param1);
            }
          }
          if (this.field_k == 48) {
            param1.a(param0, this.target.a(-27449, param1), false);
          }
          if (this.field_k == 49) {
            var11.a(1, var6, 15, param3, -113);
          }
          if (this.field_k == 50) {
            var11.a(1, var6, 14, param3, -74);
          }
          if (this.field_k == 21) {
            var7.statusTurns = var7.statusTurns << 1;
          }
          if (39 == this.field_k) {
            var7.shield = 50;
          }
          if (this.field_k == 22) {
            var7.statusTurns = var7.statusTurns * 3;
          }
          stackIn_48_0 = var8;
          return (AnimationNode) (stackIn_48_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_51_0 = var5;
          stackIn_51_1 = new StringBuilder().append("iv.G(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, hh param3, String param4, boolean param5, hh param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        PacketBuffer stackIn_14_0 = null;
        String stackIn_15_1 = null;
        PacketBuffer stackIn_17_0 = null;
        String stackIn_18_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = BachelorFridge.field_y;
        try {
          var14 = param3.a(param0 + 14);
          var8 = param6.a(-1);
          if (param0 != -15) {
            stackIn_3_0 = -75;
            return stackIn_3_0;
          }
          if (null == dma.field_b &&
            !ge.a(-29510, false)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (eia.field_a == rga.field_c) {
            vg.field_l = null;
            sja.field_fb.position = 0;
            if (param4 != null) {
              var9 = 0;
              ProxySocketConnector.field_g.position = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              ProxySocketConnector.field_g.writeInt(ia.field_k.nextInt(), -1615464796);
              ProxySocketConnector.field_g.writeInt(ia.field_k.nextInt(), -1615464796);
              ProxySocketConnector.field_g.a(var14, param0 ^ -73);
              ProxySocketConnector.field_g.a(var8, 104);
              var15 = (CharSequence) ((Object) param4);
              ProxySocketConnector.field_g.a(qfa.a(20, var15), 117);
              ProxySocketConnector.field_g.b(param1, -119);
              ProxySocketConnector.field_g.writeByte(param2, param0 + 15);
              ProxySocketConnector.field_g.writeByte(var9, 0);
              sja.field_fb.writeByte(18, 0);
              sja.field_fb.position = sja.field_fb.position + 2;
              var10 = sja.field_fb.position;
              var11_ref_String = pi.a(11713, nia.d(-31768));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              sja.field_fb.writeString((byte) -50, var11_ref_String);
              wd.a(SlowAllEvent.field_q, (byte) -67, sja.field_fb, ProxySocketConnector.field_g, SuperSpeedSpecial.field_p);
              sja.field_fb.writeLengthShort((byte) -88, sja.field_fb.position - var10);
            } else {
              ProxySocketConnector.field_g.position = 0;
              ProxySocketConnector.field_g.writeInt(ia.field_k.nextInt(), -1615464796);
              ProxySocketConnector.field_g.writeInt(ia.field_k.nextInt(), -1615464796);
              stackIn_14_0 = ProxySocketConnector.field_g;
              if (param3.a(true)) {
                stackIn_15_1 = var14;
              } else {
                stackIn_15_1 = "";
              }
              ((PacketBuffer) (Object) stackIn_14_0).a(stackIn_15_1, 90);
              stackIn_17_0 = ProxySocketConnector.field_g;
              if (param6.a(true)) {
                stackIn_18_1 = var8;
              } else {
                stackIn_18_1 = "";
              }
              ((PacketBuffer) (Object) stackIn_17_0).a(stackIn_18_1, 74);
              sja.field_fb.writeByte(16, param0 + 15);
              sja.field_fb.position = sja.field_fb.position + 1;
              var9 = sja.field_fb.position;
              wd.a(SlowAllEvent.field_q, (byte) -89, sja.field_fb, ProxySocketConnector.field_g, SuperSpeedSpecial.field_p);
              sja.field_fb.writeLengthByte((byte) -97, sja.field_fb.position - var9);
            }
            hna.a(-1, 116);
            eia.field_a = dc.field_k;
          }
          if (eia.field_a == dc.field_k &&
            CreatureEvent.b(1, param0 ^ -15)) {
            var9Lifetime1 = ig.field_m.readUnsignedByte(16711935);
            ig.field_m.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              eia.field_a = RasterBuffer.field_g;
              vd.field_B = new String[var9Lifetime1 - 100];
            } else {
              if (var9Lifetime1 == 248) {
                SauceOfFlameSpecial.a(nia.d(-31768), (byte) 87);
                vt.field_m = oja.field_e;
                vc.a((byte) -77);
                DiskCacheRequest.field_x = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 == 99) {
                CreatureEvent.b(md.d((byte) -125), param0 ^ -15);
                vg.field_l = new Boolean(qla.a((byte) 112, ig.field_m));
                ig.field_m.position = 0;
              } else {
                eia.field_a = mba.field_b;
                ri.field_a = var9Lifetime1;
                dw.field_f = -1;
              }
            }
          }
          if (eia.field_a == RasterBuffer.field_g) {
            var9Lifetime2 = 2;
            if (CreatureEvent.b(var9Lifetime2, 0)) {
              var10Lifetime1 = ig.field_m.readUnsignedShort((byte) 118);
              ig.field_m.position = 0;
              if (CreatureEvent.b(var10Lifetime1, 0)) {
                var11 = vd.field_B.length;
                for (var12 = 0; var12 < var11; var12++) {
                  vd.field_B[var12] = ig.field_m.i(0);
                }
                vc.a((byte) -91);
                DiskCacheRequest.field_x = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if (mba.field_b == eia.field_a &&
            StickyEvent.d((byte) -67)) {
            if (ri.field_a != 255) {
              vt.field_m = ig.field_m.readString(125);
            } else {
              var9_ref_String = ig.field_m.readNullableString((byte) 56);
              if (var9_ref_String != null) {
                hp.a(nia.d(param0 - 31753), var9_ref_String, 3);
              }
            }
            vc.a((byte) -121);
            DiskCacheRequest.field_x = false;
            stackIn_55_0 = ri.field_a;
            return stackIn_55_0;
          }
          if (dma.field_b == null) {
            if (DiskCacheRequest.field_x) {
              if (ag.e(-9109) <= 30000L) {
                vt.field_m = qd.field_n;
              } else {
                vt.field_m = nca.field_b;
              }
              DiskCacheRequest.field_x = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = kn.field_h;
            kn.field_h = oja.field_c;
            DiskCacheRequest.field_x = true;
            oja.field_c = var9Lifetime3;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("iv.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 >= -30) {
          field_i = (String) null;
        }
    }

    final void a(byte param0, BattleCreature param1, BattleState param2, int param3) {
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        BattleCreature var8 = null;
        var7 = BachelorFridge.field_y;
        try {
          var8 = this.target.a(91, param2);
          if (var8.a(13, (byte) -69)) {
            param1.a(5, var8, (byte) 2);
          }
          if (var8.a(this.field_f, param1, (byte) 2)) {
            return;
          }
          if (this.field_k != 23 &&
            this.field_k != 15 &&
            this.field_k != 21 &&
            22 != this.field_k &&
            this.field_k != 45 &&
            this.field_k != 46 &&
            this.field_k != 48 &&
            49 != this.field_k &&
            this.field_k != 50 &&
            this.field_k != 0) {
            if (this.field_k == 2) {
              param2.field_T.field_p[param1.ownerIndex] = param2.field_T.field_p[param1.ownerIndex] + 1;
            }
            if (this.field_k == 3 ||
              13 == this.field_k ||
              this.field_k == 14 ||
              this.field_k == 16 ||
              17 == this.field_k ||
              this.field_k == 18 ||
              this.field_k == 19 ||
              this.field_k == 32 ||
              this.field_k == 33) {
              param2.field_T.field_I[param1.ownerIndex] = param2.field_T.field_I[param1.ownerIndex] + 1;
            }
            if (this.field_k == 1 ||
              this.field_k == 4 ||
              5 == this.field_k ||
              this.field_k == 6 ||
              this.field_k == 7 ||
              8 == this.field_k ||
              9 == this.field_k ||
              this.field_k == 10 ||
              11 == this.field_k ||
              12 == this.field_k ||
              28 == this.field_k ||
              29 == this.field_k ||
              this.field_k == 30 ||
              this.field_k == 34 ||
              this.field_k == 36 ||
              this.field_k == 37 ||
              this.field_k == 38 ||
              this.field_k == 39 ||
              this.field_k == 40 ||
              this.field_k == 41 ||
              this.field_k == 51 ||
              this.field_k == 52 ||
              53 == this.field_k) {
              param2.field_T.field_D[param1.ownerIndex] = param2.field_T.field_D[param1.ownerIndex] + 1;
            }
            var8.b((byte) 115, this.field_k);
            var8.d(67);
            param2.field_T.field_t[param1.ownerIndex] = sr.a(param2.field_T.field_t[param1.ownerIndex], 1L << aj.a((byte) -20, this.field_k));
          }
          if (var8.statusId != 32) {
            if (15 == this.field_k) {
              if (!param2.a(param3, var8, 1, param1, -1)) {
                var8.b((byte) 116, 8);
              } else {
                param2.field_T.field_c[param1.ownerIndex] = param2.field_T.field_c[param1.ownerIndex] + 1;
              }
            }
            if (this.field_k == 45) {
              if (param2.a(param3, var8, 2, param1, -1)) {
                param2.field_T.field_c[param1.ownerIndex] = param2.field_T.field_c[param1.ownerIndex] + 1;
              } else {
                var8.b((byte) 112, 8);
              }
            }
            if (this.field_k == 46) {
              if (!param2.a(param3, var8, 3, param1, -1)) {
                var8.b((byte) 122, 8);
              } else {
                param2.field_T.field_c[param1.ownerIndex] = param2.field_T.field_c[param1.ownerIndex] + 1;
              }
            }
            if (this.field_k == 23) {
              param2.a(param3, var8, -1, param1, -1);
            }
          }
          if (this.field_k == 48) {
            param2.a(var8, param1, 4);
          }
          if (this.field_k == 49) {
            param2.a(1, param1, 15, param3, -92);
          }
          if (this.field_k == 50) {
            param2.a(1, param1, 14, param3, -82);
          }
          if (this.field_k == 21) {
            var8.statusTurns = var8.statusTurns << 1;
          }
          if (this.field_k == 22) {
            var8.statusTurns = var8.statusTurns * 3;
          }
          var6 = 79 / ((param0 - 21) / 42);
          if (this.field_k == 39) {
            var8.shield = 50;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_93_0 = var5;
          stackIn_93_1 = new StringBuilder().append("iv.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          stackIn_96_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',');
          if (param2 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_93_0), ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(',').append(param3).append(')').toString());
        }
    }

    DamageEffect(CreatureRef param0, boolean param1, int param2, int param3, int param4) {
        try {
          this.target = param0;
          this.field_l = param2;
          this.field_j = param1 ? true : false;
          this.field_k = param4;
          this.field_f = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "iv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          DamageEffect.b(true);
        }
        int var1 = saa.field_b * saa.field_b;
        int var2 = -(FishRainSpecial.field_t * FishRainSpecial.field_t) + var1;
        int var3 = fs.field_f + (pda.field_p - fs.field_f) * var2 / var1;
        i.field_a.a(120, 31407, 640, ce.field_t, var3);
        taa.a(5, gba.field_Bb, 91, -24 + pda.field_p, lm.field_d, 0, 640);
    }

    private final AnimationNode a(int param0, byte param1, ad param2, int param3, gj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        BattleState var8 = null;
        BattleCreature var9 = null;
        Object stackIn_6_0 = null;
        rka stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = this.target.a(param1 ^ -90, param4.field_h);
          if (param1 != -13) {
            var8 = (BattleState) null;
            this.a((BattleCreature) null, (BattleState) null, 127);
          }
          var7 = param4.field_h.b(var9, 126, param3, param0);
          if (var7 < param0) {
            param4.a(-16007, this.target.a(-27449, param4), 8);
          }
          if (var7 > 0) {
            stackIn_8_0 = new rka(param4, this.target, new CreatureRef(param2.field_s), param3, var7);
            return (AnimationNode) ((Object) stackIn_8_0);
          }
          stackIn_6_0 = null;
          return (AnimationNode) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("iv.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_i = "You must have an account to enter the arena.";
    }
}
