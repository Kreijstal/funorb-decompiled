/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends ki {
    static String field_t;
    static char[] cp1252Extensions;
    static boolean field_s;

    final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -51 % ((-28 - param0) / 43);
          if (-1 < param1) {
            Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, bg.field_u[param1], 928072);
          }
          if (-1 >= param1 ||
            BrickABrac.field_J) {
            Rasterizer2D.fillVerticalGradient(param2, param3, 153, 238, 7829367, 928072);
          }
          if (this.b((byte) -105)) {
            pl.field_a.drawTransparent(param2, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "ai.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final RgbSprite c(byte param0) {
        RuntimeException var2 = null;
        RgbSprite stackIn_2_0 = null;
        RgbSprite stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -74) {
            stackIn_4_0 = kc.field_p;
            return stackIn_4_0;
          }
          stackIn_2_0 = (RgbSprite) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "ai.H(" + param0 + ')');
        }
    }

    final static void a(byte param0, float param1, String param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          ri.field_N = param2;
          if (param0 != 24) {
            ai.readLevelMetadata((byte) 116, (PacketBuffer) null);
          }
          ep.field_a = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ai.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static LevelMetadata readLevelMetadata(byte obfuscationGuard, PacketBuffer packet) {
        LevelMetadata var2 = null;
        RuntimeException var2_ref = null;
        LevelMetadata stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new LevelMetadata();
          if (obfuscationGuard != -12) {
            ai.a((byte) -119, 0.37269747257232666f, (String) null);
          }
          var2.readMetadata(obfuscationGuard - 12976, packet);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ai.A(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!AchievementIcon.field_m.a("paris", -28138)) {
            return false;
          }
          qa.field_y = pl.a("paris", "paris_near", (byte) -51, AchievementIcon.field_m);
          th.field_c = pl.a("paris", "paris_mid", (byte) 98, AchievementIcon.field_m);
          bf.field_K = pl.a("paris", "paris_far", (byte) -100, AchievementIcon.field_m);
          pl.field_a = pl.a("paris", "paris_small", (byte) 108, AchievementIcon.field_m);
          kc.field_p = pl.a("paris", "paris_character", (byte) -43, AchievementIcon.field_m);
          IntrusiveHashTable.field_i = jh.a(0, qa.field_y);
          if (param0) {
            ai.a((mh) null, (TextFont) null, (mh) null, (mh) null, (mh) null, (mh) null, (mh) null, (mh) null, (byte) 19, false, (fj) null, (mh) null);
          }
          jk.field_t = jh.a(0, th.field_c);
          MembershipBenefitsScreen.field_s = jh.a(0, bf.field_K);
          uq.b(th.field_c);
          uq.b(jk.field_t);
          uq.b(qa.field_y);
          uq.b(IntrusiveHashTable.field_i);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "ai.F(" + param0 + ')');
        }
    }

    ai(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          boolean decompiledSharedTail0 = !(!this.b((byte) -124));
          if (!decompiledSharedTail0) {
            Rasterizer2D.fillVerticalGradient(param2, param0, 306, 480, bg.field_u[param3], 928072);
            decompiledSharedTail0 = (BrickABrac.field_J);
          }
          if (decompiledSharedTail0) {
            var6 = kd.a(this.field_m, param3, (byte) -34);
            if (!var6.a((byte) -84, param3, this.field_m)) {
              ej.a(0, MembershipBenefitsScreen.field_s, 2, 0, param3, var6);
              var6.a(this.field_m, param3, (byte) 78);
            }
            wo.a(param0, param4, jk.field_t, 118, 306, 0, param2, 2, IntrusiveHashTable.field_i, var6.field_p, param3);
          }
          if (param1 >= -84) {
            ai.a((byte) -61, -0.03386414423584938f, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var6_ref), "ai.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean b(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -91) {
            this.a(false, 87, -76, -86, -25);
          }
          stackIn_19_0 = (qa.field_y != null) && (null != th.field_c) && (bf.field_K != null) && (pl.field_a != null) && (null != kc.field_p);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "ai.E(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        if (param0 != 0) {
          return;
        }
        try {
          cp1252Extensions = null;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ai.N(" + param0 + ')');
        }
    }

    final static void a(mh param0, TextFont param1, mh param2, mh param3, mh param4, mh param5, mh param6, mh param7, byte param8, boolean param9, fj param10, mh param11) {
        String stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RgbSprite[] var16 = null;
        mh var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = BrickABrac.field_J ? 1 : 0;
        try {
          th.field_d = param9;
          sj.field_a = param6;
          ki.field_i[0] = 16764000;
          ki.field_i[3] = 16736511;
          ki.field_i[1] = 6356832;
          jq.field_y = param1;
          ki.field_i[4] = 16711935;
          ki.field_i[2] = 9474303;
          r.field_C[2] = 16736352;
          ki.field_i[4] = 16711935;
          cn.field_d = 8421504;
          r.field_C[3] = 16736511;
          r.field_C[0] = 16764000;
          if (param8 != 61) {
            ai.a((mh) null, (TextFont) null, (mh) null, (mh) null, (mh) null, (mh) null, (mh) null, (mh) null, (byte) 97, false, (fj) null, (mh) null);
          }
          r.field_C[1] = 6356832;
          var12 = new RgbSprite(4, 4);
          var13 = var12.pixels;
          var14 = var12.pixels;
          var15 = var12.pixels;
          var12.pixels[15] = 7368816;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var16 = new RgbSprite[9];
          var16[4] = var12;
          DualLinkDeque.field_d = new mh(0L, param0);
          sh.field_d = new mh(0L, param2);
          DualLinkDeque.field_d.a(sh.field_d, 0);
          var17 = new mh(0L, (mh) null);
          var17.field_bb = new NodeDeque();
          AchievementIcon.field_q = new mm(0L, var17, param5, param10);
          sh.field_d.a(AchievementIcon.field_q, param8 - 61);
          kc.field_n = new mh(0L, param3);
          sh.field_d.a(kc.field_n, 0);
          g.field_n = new mh(0L, param7);
          g.field_n.field_O = jq.field_y;
          kc.field_n.a(g.field_n, 0);
          kc.field_n.c(true);
          ap.field_e = new mh(0L, (mh) null);
          ap.field_e.field_Jb = var16;
          kc.field_n.a(ap.field_e, 0);
          dp.field_w = new mh[5];
          vj.field_a = new mh[5];
          wd.field_F = new mh[5];
          ik.field_i = new mh[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_34_0 = 0;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_34_0 != var18) {
                if (var18 != 1 ||
                  !th.field_d) {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = fe.field_hb;
                  }
                } else {
                  var19 = mh.field_Z;
                }
              } else {
                if (!th.field_d) {
                  stackIn_30_0 = kb.field_Wb;
                } else {
                  stackIn_30_0 = fi.field_u;
                }
                var19 = stackIn_30_0;
              }
              if (decompiledFrameRemainder0) {
                ik.field_i[var18] = new mh(0L, param11);
                dp.field_w[var18] = new mh(0L, sj.field_a, var19);
                vj.field_a[var18] = new mh(0L, (mh) null);
                vj.field_a[var18].field_Q = 1;
                wd.field_F[var18] = new mh(0L, sj.field_a);
                wd.field_F[var18].field_Q = 1;
                ik.field_i[var18].a(dp.field_w[var18], 0);
                ik.field_i[var18].a(vj.field_a[var18], 0);
                ik.field_i[var18].a(wd.field_F[var18], 0);
                ik.field_i[var18].c(true);
                DualLinkDeque.field_d.a(ik.field_i[var18], 0);
                fe.field_pb = fe.field_pb + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            LegacyUtf8Decoder.field_c = new mh(0L, param4);
            LegacyUtf8Decoder.field_c.field_Mb = vh.field_Y;
            DualLinkDeque.field_d.a(LegacyUtf8Decoder.field_c, 0);
            stackIn_34_0 = ik.a(false) ? 1 : 0;
          }
          if (stackIn_34_0 != 0 &&
            !um.field_e) {
            return;
          }
          vd.field_a = new mo(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_44_0 = var12_ref;
          stackIn_44_1 = new StringBuilder().append("ai.M(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',');
          if (param4 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param5 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param6 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param7 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param11 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          if (!param0) {
            cp1252Extensions = (char[]) null;
          }
          if (!this.b((byte) -97)) {
            Rasterizer2D.fillVerticalGradient(param4, param2, 640, 480, bg.field_u[param3], 928072);
            if (!BrickABrac.field_J) {
              return;
            }
          }
          var6 = PowerUp.a(this.field_m, param3, -20777);
          if (!var6.a((byte) -84, param3, this.field_m)) {
            ej.a(0, bf.field_K, 1, 0, param3, var6);
            var6.a(this.field_m, param3, (byte) 78);
          }
          wo.a(param2, param1, th.field_c, 127, 640, 0, param4, 1, qa.field_y, var6.field_p, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var6_ref), "ai.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        cp1252Extensions = new char[]{'€', '\0', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\0', 'Ž', '\0', '\0', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\0', 'ž', 'Ÿ'};
        field_s = false;
    }
}
