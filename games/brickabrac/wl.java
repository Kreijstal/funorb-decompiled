/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends d {
    private int field_P;
    private ia field_M;
    static String field_L;
    static int[] field_R;
    static boolean field_N;
    static String field_O;
    static mf field_K;
    static String field_Q;

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        qh var8;
        int var9;
        int var10;
        int var11;
        RgbSprite var12;
        RgbSprite var13;
        RgbSprite var14;
        var11 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        var5 = param1 + (this.field_o + (this.field_t >> 1));
        var6 = (this.field_s >> 1) + (this.field_w + param0);
        var8 = this.field_M.b((byte) -31);
        if (var8 != m.field_c &&
          SaveResultsPromptScreen.field_z != var8) {
          if (lp.field_xb == var8) {
            var13 = df.field_a[2];
            var13.f(-(var13.width >> 1) + var5, -(var13.height >> 1) + var6, 256);
          } else if (DualLinkIterator.field_c == var8) {
            var14 = df.field_a[1];
            var14.f(var5 - (var14.width >> 1), -(var14.height >> 1) + var6, 256);
          }
        } else {
          var12 = df.field_a[0];
          var9 = var12.canvasWidth << 1;
          var10 = var12.canvasHeight << 1;
          if (ik.field_c != null &&
            ik.field_c.width >= var9 &&
            var10 <= ik.field_c.height) {
            fc.a(-114, ik.field_c);
            Rasterizer2D.clear();
          } else {
            ik.field_c = new RgbSprite(var9, var10);
            fc.a(-87, ik.field_c);
          }
          var12.a(112, 144, var12.canvasWidth << 4, var12.canvasHeight << 4, -this.field_P << 10, 4096);
          sc.b(-104);
          ik.field_c.f(-var12.canvasWidth + var5, -var12.canvasHeight + var6, 256);
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
          this.field_P = this.field_P + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wl.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            wl.c(false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wl.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        cq var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        BitPacketBuffer var14 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          var14 = jl.field_e;
          var2 = var14.readUnsignedByte(255);
          var3 = (cq) (fk.field_f.first(-7));
          while (var3 != null) {
            if (var3.field_m != var2) {
              var3 = (cq) (fk.field_f.next((byte) 116));
              continue;
            }
            break;
          }
          if (var3 == null) {
            hn.a((byte) 64);
            return;
          }
          var4 = var14.readUnsignedByte(255);
          if (var4 != 0) {
            LevelCompleteScreen.field_B[0] = tb.field_cb;
            var5 = var3.field_s;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              LevelCompleteScreen.field_B[var6_int] = var14.readCp1252String(-1);
            }
            DualLinkNode.a((byte) 75, var4, var5);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              un.a((byte) -122, var14);
              if (var6_intLifetime1 == 0) {
                var3.field_k = fh.field_c;
                var3.field_n = vj.field_c;
                var3.field_j = sf.field_Z;
                var3.field_l = vh.field_U;
                MessageScreen.a(vj.field_c, fh.field_c, var6_intLifetime1, -19824, sf.field_Z, vh.field_U);
              } else {
                MessageScreen.a(vj.field_c, fh.field_c, var6_intLifetime1, -19824, sf.field_Z, vh.field_U);
              }
            }
            gr.a(12429, var5);
            dupTemp$0 = new String[2][var5];
            var3.field_r = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_u = dupTemp$1;
            var7 = dupTemp$1;
            var8 = wi.field_m;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = fj.field_Pb[var9];
              var6[0][var10] = LevelCompleteScreen.field_B[var11];
              var7[0][4 * var10] = ec.field_N[var11];
              var7[0][var10 * 4 + 1] = RankingsScreen.field_r[var11];
              var7[0][2 + var10 * 4] = ObjectHistoryBuffer.field_p[var11];
              var7[0][4 * var10 + 3] = ib.field_D[var11];
              if (ci.a(LevelCompleteScreen.field_B[var11], -40) &&
                0 == ObjectHistoryBuffer.field_p[var11] + RankingsScreen.field_r[var11] + ib.field_D[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = fj.field_Pb[var9Lifetime1 + var5];
              var6[1][var13] = LevelCompleteScreen.field_B[var11Lifetime1];
              var7[1][var13 * 4] = ec.field_N[var11Lifetime1];
              var7[1][1 + var13 * 4] = RankingsScreen.field_r[var11Lifetime1];
              var7[1][2 + 4 * var13] = ObjectHistoryBuffer.field_p[var11Lifetime1];
              var7[1][var13 * 4 + 3] = ib.field_D[var11Lifetime1];
              if (ci.a(LevelCompleteScreen.field_B[var11Lifetime1], -31) &&
                RankingsScreen.field_r[var11Lifetime1] + ObjectHistoryBuffer.field_p[var11Lifetime1] + ib.field_D[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          if (param0) {
            field_Q = (String) null;
          }
          var3.field_v = true;
          var3.unlink((byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "wl.C(" + param0 + ')');
        }
    }

    final static int a(String param0, boolean param1, int param2, m param3, int param4, m param5, int param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_2 = null;
        PacketBuffer stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var14 = param3.b(2);
          var8 = param5.b(2);
          if (eq.field_g == null &&
            !ad.a(false, param6 ^ 10004)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (rf.field_b == BitPacketBuffer.field_u) {
            k.field_h.position = 0;
            AchievementBrowserScreen.field_r = null;
            if (param0 != null) {
              var9 = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              tq.field_f.position = 0;
              tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
              tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
              tq.field_f.writePrefixedCp1252String(param6 ^ 4, var14);
              tq.field_f.writePrefixedCp1252String(0, var8);
              var15 = (CharSequence) ((Object) param0);
              tq.field_f.writePrefixedCp1252String(0, he.a(var15, -58));
              tq.field_f.writeShort((byte) 113, param4);
              tq.field_f.writeByte(89, param2);
              tq.field_f.writeByte(127, var9);
              k.field_h.writeByte(53, 18);
              k.field_h.position = k.field_h.position + 2;
              var10 = k.field_h.position;
              var11_ref_String = dj.a(true, uc.e((byte) -75));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              k.field_h.writeCp1252String(var11_ref_String, -1);
              LevelDecoder.a(k.field_h, tq.field_f, Ball.field_F, (byte) -72, to.field_g);
              k.field_h.backfillShortLength(-var10 + k.field_h.position, 255);
            } else {
              tq.field_f.position = 0;
              tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
              tq.field_f.writeInt(ji.field_e.nextInt(), (byte) -79);
              stackIn_11_0 = tq.field_f;
              stackIn_11_1 = 0;
              if (!param3.a((byte) 116)) {
                stackIn_12_2 = "";
              } else {
                stackIn_12_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_11_0).writePrefixedCp1252String(stackIn_11_1, stackIn_12_2);
              stackIn_14_0 = tq.field_f;
              stackIn_14_1 = param6 - 4;
              if (!param5.a((byte) 120)) {
                stackIn_15_2 = "";
              } else {
                stackIn_15_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_14_0).writePrefixedCp1252String(stackIn_14_1, stackIn_15_2);
              k.field_h.writeByte(-10, 16);
              k.field_h.position = k.field_h.position + 1;
              var9 = k.field_h.position;
              LevelDecoder.a(k.field_h, tq.field_f, Ball.field_F, (byte) -72, to.field_g);
              k.field_h.backfillByteLength((byte) 119, k.field_h.position - var9);
            }
            cr.a(-1, 10000);
            rf.field_b = ck.field_k;
          }
          if (ck.field_k == rf.field_b &&
            vd.a(20, 1)) {
            var9Lifetime1 = jl.field_e.readUnsignedByte(255);
            jl.field_e.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              rf.field_b = o.field_g;
              co.field_f = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                cb.a(uc.e((byte) -108), param6 + 5);
                eo.field_e = m.field_d;
                hn.a((byte) 96);
                pf.field_d = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 == 99) {
                vd.a(20, oc.d((byte) -59));
                AchievementBrowserScreen.field_r = new Boolean(kd.a(-2, jl.field_e));
                jl.field_e.position = 0;
              } else {
                si.field_a = var9Lifetime1;
                rf.field_b = vj.field_e;
                ga.field_j = -1;
              }
            }
          }
          if (rf.field_b == o.field_g) {
            var9Lifetime2 = 2;
            if (vd.a(20, var9Lifetime2)) {
              var10Lifetime1 = jl.field_e.readUnsignedShort(65280);
              jl.field_e.position = 0;
              if (vd.a(20, var10Lifetime1)) {
                var11 = co.field_f.length;
                for (var12 = 0; var11 > var12; var12++) {
                  co.field_f[var12] = jl.field_e.readPrefixedCp1252String(pn.a(param6, 251));
                }
                hn.a((byte) 79);
                pf.field_d = false;
                stackIn_43_0 = 100 + var11;
                return stackIn_43_0;
              }
            }
          }
          if (vj.field_e == rf.field_b &&
            um.b((byte) -92)) {
            if (si.field_a == 255) {
              var9_ref_String = jl.field_e.readNullableCp1252String(param6 - 4);
              if (var9_ref_String != null) {
                ui.a(param6 ^ -55, uc.e((byte) -120), var9_ref_String);
              }
            } else {
              eo.field_e = jl.field_e.readCp1252String(-1);
            }
            hn.a((byte) 106);
            pf.field_d = false;
            stackIn_51_0 = si.field_a;
            return stackIn_51_0;
          }
          if (param6 != 4) {
            field_N = false;
          }
          if (null == eq.field_g) {
            if (pf.field_d) {
              if (MembershipBenefitsScreen.f(param6 ^ -6788) > 30000L) {
                eo.field_e = hg.field_b;
              } else {
                eo.field_e = gd.field_e;
              }
              pf.field_d = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = dl.field_b;
            dl.field_b = pj.field_a;
            pj.field_a = var9Lifetime3;
            pf.field_d = true;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("wl.E(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_K = null;
        field_L = null;
        field_R = null;
        field_Q = null;
        field_O = null;
        if (param0 != 2) {
          id var2 = (id) null;
          wl.a((id) null, -2);
        }
    }

    final static void a(id param0, int param1) {
        id var2 = null;
        int var3 = 0;
        id var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          param0.unlink((byte) 111);
          if (param1 != 17574) {
            var4 = (id) null;
            wl.a((id) null, 48);
          }
          var2 = (id) (ua.field_c.first(-69));
          while (var2 != null) {
            if (var2.a(param0, param1 ^ -18005)) {
              var2 = (id) (ua.field_c.next((byte) 116));
              continue;
            }
            break;
          }
          if (var2 == null) {
            ua.field_c.addLast(param0, (byte) 3);
          } else {
            il.a(param0, 56, var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("wl.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    wl(ia param0) {
        try {
          this.field_M = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (param0 <= 6) {
          field_K = (mf) null;
        }
        if (this.field_q) {
          return this.field_M.a(-87);
        }
        return null;
    }

    static {
        field_R = new int[8192];
        field_L = "Cancel";
        field_O = "Please check if address is correct";
        field_Q = "Loading sound effects";
    }
}
