/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends ug {
    private NodeDeque field_T;
    static vd field_S;
    static long field_R;
    static int[][][] field_G;
    static boolean field_V;
    static SceneWidget field_U;

    final void h(byte param0) {
        int var4 = SteelSentinels.obfuscationControl;
        NodeIterator var2 = new NodeIterator(this.field_T);
        bb var3 = (bb) (var2.b(2));
        while (var3 != null) {
          if (var3.i(-8350)) {
            var3.unlink(4);
          }
          var3 = (bb) (var2.d(2));
        }
        if (param0 != -4) {
          return;
        }
        this.field_J = (lh) ((Object) this.i(-1850));
    }

    final void h(int param0) {
        int var4 = SteelSentinels.obfuscationControl;
        NodeIterator var2 = new NodeIterator(this.field_T);
        if (param0 < 119) {
          this.field_T = (NodeDeque) null;
        }
        bb var3 = (bb) (var2.b(2));
        while (var3 != null) {
          var3.field_Q = false;
          var3 = (bb) (var2.d(2));
        }
        this.field_J = null;
    }

    final static int a(String param0, boolean param1, int param2, byte param3, int param4, ik param5, ik param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        PacketBuffer stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_17_2 = null;
        PacketBuffer stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_20_2 = null;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
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
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var16 = null;
        var13 = SteelSentinels.obfuscationControl;
        try {
          var15 = param5.a(2134230754);
          var8 = param6.a(2134230754);
          if (rb.field_h == null &&
            !rc.a(119, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (lj.field_d == rn.field_v) {
            mm.field_g.position = 0;
            ma.field_bb = null;
            if (param0 == null) {
              ne.field_y.position = 0;
              ne.field_y.writeInt(true, rb.field_g.nextInt());
              ne.field_y.writeInt(true, rb.field_g.nextInt());
              stackIn_16_0 = ne.field_y;
              stackIn_16_1 = 13588;
              if (!param5.a((byte) 51)) {
                stackIn_17_2 = "";
              } else {
                stackIn_17_2 = var15;
              }
              ((PacketBuffer) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_17_2);
              stackIn_19_0 = ne.field_y;
              stackIn_19_1 = 13588;
              if (!param6.a((byte) 51)) {
                stackIn_20_2 = "";
              } else {
                stackIn_20_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_20_2);
              mm.field_g.writeByte((byte) 127, 16);
              mm.field_g.position = mm.field_g.position + 1;
              var9 = mm.field_g.position;
              qi.a(jd.field_ib, ne.field_y, mm.field_g, qe.field_d, 5);
              mm.field_g.b((byte) -32, -var9 + mm.field_g.position);
            } else {
              var9 = 0;
              ne.field_y.position = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              ne.field_y.writeInt(true, rb.field_g.nextInt());
              ne.field_y.writeInt(true, rb.field_g.nextInt());
              ne.field_y.a(13588, var15);
              ne.field_y.a(13588, var8);
              var17 = (CharSequence) ((Object) param0);
              ne.field_y.a(13588, pd.a(-105, var17));
              ne.field_y.writeShort(param4, 104);
              ne.field_y.writeByte((byte) 124, param2);
              ne.field_y.writeByte((byte) 117, var9);
              mm.field_g.writeByte((byte) 117, 18);
              mm.field_g.position = mm.field_g.position + 2;
              var10 = mm.field_g.position;
              var11_ref_String = SceneWidget.a(-58, Projectile.d((byte) -21));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              mm.field_g.a(var11_ref_String, -63);
              qi.a(jd.field_ib, ne.field_y, mm.field_g, qe.field_d, 5);
              mm.field_g.c(30, -var10 + mm.field_g.position);
            }
            gj.a(0, -1);
            rn.field_v = mc.field_c;
          }
          if (mc.field_c == rn.field_v &&
            ve.a((byte) -96, 1)) {
            var9Lifetime1 = rf.field_d.readUnsignedByte((byte) -62);
            rf.field_d.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              vh.field_d = new String[var9Lifetime1 - 100];
              rn.field_v = bl.field_k;
            } else {
              if (var9Lifetime1 == 248) {
                bj.a(-117, Projectile.d((byte) -21));
                di.field_e = ng.field_o;
                pm.m(83);
                ui.field_T = false;
                stackIn_32_0 = var9Lifetime1;
                return stackIn_32_0;
              }
              if (var9Lifetime1 == 99) {
                ve.a((byte) -85, rf.a(-58));
                ma.field_bb = new Boolean(ai.a(rf.field_d, -32599));
                rf.field_d.position = 0;
              } else {
                rn.field_v = fg.field_Yb;
                jg.field_f = -1;
                ch.field_N = var9Lifetime1;
              }
            }
          }
          if (param3 >= -22) {
            var14 = (String) null;
            ka.a(true, -27, -92, 49, (String) null, 58, 48, 104);
          }
          if (rn.field_v == bl.field_k) {
            var9Lifetime2 = 2;
            if (ve.a((byte) -128, var9Lifetime2)) {
              var10Lifetime1 = rf.field_d.readUnsignedShort((byte) -60);
              rf.field_d.position = 0;
              if (ve.a((byte) -97, var10Lifetime1)) {
                var11 = vh.field_d.length;
                for (var12 = 0; var12 < var11; var12++) {
                  vh.field_d[var12] = rf.field_d.e((byte) -97);
                }
                pm.m(-46);
                ui.field_T = false;
                stackIn_44_0 = 100 + var11;
                return stackIn_44_0;
              }
            }
          }
          if (fg.field_Yb == rn.field_v &&
            pm.n(37)) {
            if (ch.field_N == 255) {
              var9_ref_String = rf.field_d.g(-77);
              if (var9_ref_String != null) {
                ri.a(var9_ref_String, Projectile.d((byte) -21), 124);
              }
            } else {
              di.field_e = rf.field_d.h(1);
            }
            pm.m(-98);
            ui.field_T = false;
            stackIn_54_0 = ch.field_N;
            return stackIn_54_0;
          }
          if (null == rb.field_h) {
            if (ui.field_T) {
              if (ki.l(150) <= 30000L) {
                di.field_e = bc.field_mb;
              } else {
                di.field_e = CipherPacketBuffer.field_E;
              }
              ui.field_T = false;
              stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            var9Lifetime3 = ll.field_l;
            ll.field_l = fe.field_F;
            fe.field_F = var9Lifetime3;
            ui.field_T = true;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("ka.KA(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param6 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final bb i(int param0) {
        NodeIterator var2;
        bb var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        var2 = new NodeIterator(this.field_T);
        if (param0 != -1850) {
          field_R = -76L;
        }
        var3 = (bb) (var2.b(2));
        while (var3 != null) {
          if (var3.field_Q) {
            return var3;
          }
          var3 = (bb) (var2.d(2));
        }
        return null;
    }

    public static void f(byte param0) {
        field_S = null;
        field_U = null;
        field_G = (int[][][]) null;
        if (param0 <= 124) {
          ka.f((byte) 57);
        }
    }

    final void a(lh param0, int param1) {
        bb var3 = null;
        try {
          if (!(param0 instanceof bb)) {
            throw new IllegalArgumentException();
          }
          var3 = (bb) (param0);
          this.field_T.a(var3, -21459);
          var3.field_Q = true;
          var3.a(1, (lh) (this));
          int var4 = 82 % ((-51 - param1) / 61);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ka.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final lh a(byte param0) {
        NodeIterator var2;
        bb var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        if (param0 != -2) {
          field_R = 108L;
        }
        var2 = new NodeIterator(this.field_T);
        var3 = (bb) (var2.b(2));
        while (var3 != null) {
          if (var3.field_Q) {
            return var3.h(-1);
          }
          var3 = (bb) (var2.d(param0 ^ -4));
        }
        return null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = SteelSentinels.obfuscationControl;
        if (null != this.field_p) {
          this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
        }
        NodeIterator var5 = new NodeIterator(this.field_T);
        lh var6 = (lh) (var5.c(2));
        while (var6 != null) {
          var6.a(this.field_z + param0, (byte) -109, param2 + this.field_o, param3);
          var6 = (lh) (var5.a(true));
        }
        if (param1 > -99) {
          this.i(117);
        }
    }

    final void g(byte param0) {
        int var4 = SteelSentinels.obfuscationControl;
        if (param0 != 103) {
          return;
        }
        NodeIterator var2 = new NodeIterator(this.field_T);
        bb var3 = (bb) (var2.b(2));
        while (var3 != null) {
          if (var3.j(-102)) {
            var3.unlink(param0 - 99);
          }
          var3 = (bb) (var2.d(2));
        }
    }

    final static String a(byte param0, String param1, String param2, cm param3) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -13) {
            field_G = (int[][][]) null;
          }
          if (param3.a(true)) {
            stackIn_6_0 = param1 + " - " + param3.a((byte) -33) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ka.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (CombatWorld.field_H.field_Eb != 0 &&
            !fj.field_e) {
            if (!uc.field_g) {
              jn.field_g = true;
            } else {
              pd.j(13171);
            }
          }
          if (jn.field_g) {
            ac.a(param1, param7, param1, param4, 20, param5, param2, param3, -126);
            hh.field_a.a((byte) 121, param0);
            if (param0) {
              if (vc.field_f.field_Eb != 0) {
                jn.field_g = false;
              }
              if (qa.field_N.field_Eb != 0) {
                pg.d(53);
                jn.field_g = false;
              }
            }
          }
          if (param6 < 126) {
            field_S = (vd) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ka.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public ka() {
        super(0, 0, IntrusiveNode.field_l, DualNode.field_u, (qk) null, (tn) null);
        this.field_T = new NodeDeque();
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (param1) {
            ka.f((byte) 92);
          }
          var10 = (CharSequence) ((Object) param2);
          var3_int = pd.a(2019550017, var10, param0);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param0 != param2.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ka.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        int var0_int = 0;
        field_S = new vd();
        field_G = new int[13][26][];
        for (var0_int = 0; 13 > var0_int; var0_int++) {
          field_G[var0_int][25] = new int[8];
          field_G[var0_int][25][2] = 25;
          field_G[var0_int][25][3] = 8;
          field_G[var0_int][25][4] = 5;
          field_G[var0_int][25][0] = 32;
          field_G[var0_int][25][1] = 10;
          field_G[var0_int][25][7] = 8;
          field_G[var0_int][25][5] = 32;
          field_G[var0_int][25][6] = 10;
        }
        int[][] var0 = field_G[0];
        var0[10] = new int[]{0, 5921, -5550, -104, 729};
        var0[15] = new int[]{-5921, 4070, -1480, -1041, 0};
        var0[25] = new int[]{70, 10, 25, 3, 5, 50, 10, 3};
        var0[14] = new int[]{9621, -2590, 2960, -989, 0};
        var0[5] = new int[]{0, 0, 0, 0, 0};
        var0[9] = new int[]{0, 2960, -2960, 0, 416};
        var0[6] = new int[]{0, 0, 0, 0, 0};
        var0[16] = new int[]{-6291, 4810, -2220, -416, 0};
        var0[3] = new int[]{0, 3330, 0, 0, 0};
        var0[18] = new int[]{-8511, 5921, 0, 0, -572};
        var0[17] = new int[]{-8511, 5180, 0, 0, -572};
        var0[11] = new int[]{0, 9621, -8511, -364, 1041};
        var0[19] = new int[]{-8511, 5921, 0, 0, -572};
        var0[22] = new int[]{0, 0, 0, 0, 0};
        var0[12] = new int[]{0, 12212, -10731, -520, 1250};
        var0[20] = new int[]{0, 0, 0, 0, 0};
        var0[2] = new int[]{0, 2960, 0, 104, 0};
        var0[4] = new int[]{0, 1850, 0, 0, 0};
        var0[23] = new int[]{0, 0, 0, 0, 0};
        var0[1] = new int[]{0, 2960, 0, 0, 0};
        var0[13] = new int[]{2220, 5550, 3700, -208, -208};
        var0[24] = new int[]{0, 0, 0, 0, 0};
        var0[21] = new int[]{0, 0, 0, 0, 0};
        var0[8] = new int[]{0, 0, 0, 0, 0};
        var0[7] = new int[]{0, 0, 0, 0, 0};
        var0[0] = new int[]{0, 1850, 0, 0, 0};
        var0 = field_G[1];
        var0[25] = new int[]{32, 5, 25, 7, 3, 26, 4, 7};
        var0[22] = new int[]{-1850, -11471, -6661, -16282, 0, -1850, 8511, -2590, -14432, -2960, 0, 0, -781};
        var0[7] = new int[]{-740, -7031, 1480, -5180, 12212, 1850, 3330, 0, 0, 0, 0, 0, -1458};
        var0[20] = new int[]{2220, 3700, 2960, -10731, 17392, -1480, 1850, -7771, -12212, -7401, 1850, -364, -520};
        var0[14] = new int[]{0, 11101, 4810, -8511, 17392, -1110, 12582, 5921, -10361, 16652, -2960, -1979, 1562};
        var0[11] = new int[]{1480, 7771, 0, 0, 0, 1480, 7401, 1110, 0, 0, 740, -156, 1302};
        var0[17] = new int[]{-1850, 4810, -6291, -13692, -7771, 5921, 4810, 0, -12582, 12952, 1110, -104, -729};
        var0[21] = new int[]{1480, -9251, -7031, -11471, -5550, -2220, 5921, -10361, -5921, -6291, 0, 104, -937};
        var0[24] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var0[6] = new int[]{10361, 6661, 2590, -4440, 8511, 2960, -740, 0, 0, 0, 1480, 625, -1093};
        var0[4] = new int[]{3700, 6291, 740, -740, 0, 0, -6291, -740, -4810, -2960, 0, 156, -989};
        var0[16] = new int[]{-5000, 3700, -4810, -10731, 0, -1480, 0, -6661, -8881, -740, -6661, -1822, 2500};
        var0[15] = new int[]{5180, -1110, 0, -4070, 3000, 6661, 0, 5000, -3330, 6000, 740, -1510, -104};
        var0[0] = new int[]{0, 0, 0, 0, 0, 2960, 5921, -740, 0, 0, 0, 104, -1145};
        var0[12] = new int[]{1500, 4000, 4000, 3000, 0, 1500, 3500, 3000, 3500, 0, -3000, -100, 2100};
        var0[8] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var0[5] = new int[]{5550, 11101, 0, 4070, 740, 0, -3330, 740, 0, 0, 1110, 520, -885};
        var0[18] = new int[]{-2220, 9991, -3330, -10731, -5921, 1110, -8881, -8881, -14432, -1110, 0, -364, 104};
        var0[3] = new int[]{5180, 2220, 0, 0, 0, 9621, 4440, 1480, -7771, 12952, 740, 729, -885};
        var0[9] = new int[]{3330, 0, 0, 0, 0, 1110, -2000, 0, 0, -740, 1480, 572, -416};
        var0[13] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var0[2] = new int[]{1850, -2590, 0, -740, 1110, 5921, 11471, 740, 3700, 0, 1110, 677, -1145};
        var0[19] = new int[]{-1480, 8511, -7771, -5921, -5921, -1850, -8881, -8511, -8881, -6661, -740, 520, -260};
        var0[23] = new int[]{-2220, -7031, -8511, -8881, -7031, 3700, 6291, -740, -11101, 7401, 0, 677, -937};
        var0[1] = new int[]{-4070, -7771, -1480, -3330, -1850, 5180, 6661, 740, -740, 0, 0, 416, -1458};
        var0[10] = new int[]{4000, -4000, 0, 0, 0, 4000, -4000, 0, 0, -740, 2960, 1041, -1197};
        var0 = field_G[2];
        var0[23] = new int[]{11842, 4070, 740, 5921, -21463, -6291, -2187, -2500};
        var0[21] = new int[]{11842, 4070, -5921, 2590, -24424, -9621, -156, -1875};
        var0[11] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        var0[13] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        var0[3] = new int[]{15172, 9621, -12582, 0, -7031, 9251, -364, -2395};
        var0[12] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        var0[10] = new int[]{10361, 1850, -3330, 3330, -17763, 0, -677, -1875};
        var0[7] = new int[]{15172, 6291, -11101, 6661, -14062, 9621, -260, -2395};
        var0[25] = new int[]{128, 7, 28, 8, 2, 100, 5, 5};
        var0[2] = new int[]{13322, 7771, -4440, 15912, -14802, -1480, 0, -2500};
        var0[24] = new int[]{11842, 4070, 740, 5921, -21463, -6291, -2187, -2500};
        var0[19] = new int[]{10361, 4070, -22943, -6291, -1850, 2220, -104, -1093};
        var0[5] = new int[]{14802, 6661, -17763, -5921, 8881, 10361, -677, -2343};
        var0[4] = new int[]{15172, 8141, -13692, 3330, 9251, 7401, -520, -2395};
        var0[6] = new int[]{15912, 7771, -13322, -2960, 6661, 15172, -572, -2395};
        var0[17] = new int[]{11842, 4070, 740, 5921, -21463, -6291, -520, -1250};
        var0[18] = new int[]{11842, 4070, -5921, 14432, -17392, -740, -989, -781};
        var0[1] = new int[]{15172, 6291, 9251, 12212, -17763, -6661, -781, -2500};
        var0[16] = new int[]{-1850, -1850, -17763, -4070, -2220, 2590, -156, 364};
        var0[9] = new int[]{9991, 6291, -5180, 10731, -15542, -1850, 572, -1822};
        var0[0] = new int[]{2220, 3330, -8141, -2590, -740, 7401, 364, -989};
        var0[14] = new int[]{7401, -1110, -1110, 4810, -17392, 0, -989, -833};
        var0[20] = new int[]{11842, 4070, -17763, -1480, -3330, 11471, -937, -781};
        var0[8] = new int[]{14802, 6291, 6291, 7031, -14432, 0, -625, -2395};
        var0[15] = new int[]{-2960, 0, -9621, 5180, 0, 1480, -364, 572};
        var0[22] = new int[]{11842, 4070, 740, 5921, -21463, -6291, -2187, -2500};
        var0 = field_G[3];
        var0[8] = new int[]{1110, -2220, 1110, 0, 0, 0, 5921, 4810, -2220, 1110, 0, 0, -2960, -1480, 0, 0, 0, 0, -1110, -208, 0};
        var0[15] = new int[]{-3330, -4810, 2220, 2960, 0, -1480, 2960, 9251, -2220, -1850, 740, -2220, 2590, 740, -9991, -3700, -1850, 1850, 740, -468, 0};
        var0[12] = new int[]{-3330, -9251, -5180, 0, 0, 0, -4070, -1480, 0, 0, 2590, 6291, 0, 0, 740, 9251, 0, 0, 3330, 0, 0};
        var0[5] = new int[]{0, -12212, -3700, 0, 0, 1480, 4070, 4070, 0, 0, 3700, 3330, 0, 0, 4070, -3330, -740, 3700, -740, 0, 0};
        var0[21] = new int[]{-9251, -13322, -17763, -9251, -8881, -5921, -740, 1850, -1850, 1480, 2590, -3700, -8881, -6291, 6661, 1850, -3330, -740, -7771, 208, 0};
        var0[24] = new int[]{-9251, 2220, 0, -5180, -9251, -5921, -740, 1850, -1850, 1480, -2590, -17763, -8881, -6291, 6661, 1850, -3330, -740, -7771, 208, 0};
        var0[3] = new int[]{0, -1110, -2590, -3330, -1480, 740, -2220, -4070, 0, 0, -4440, -1850, 0, 0, 5550, 9991, 3330, 5550, -740, 0, 0};
        var0[18] = new int[]{-7401, 1480, 0, -2960, -5550, -8511, -1850, -5921, -9251, -8881, -8881, -14432, -7401, -8141, 12952, 0, -5921, 740, -7771, -156, 0};
        var0[13] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2220, 0, 0};
        var0[7] = new int[]{1110, -5180, -3330, 0, 0, 740, 8511, 11842, 4440, 4440, 6661, 8511, -3330, 0, -1110, -3700, 0, 0, -1110, 0, 0};
        var0[4] = new int[]{0, -2960, -5550, -4070, -1480, 2220, -2590, 1850, 0, 0, -3330, 0, 0, 0, 5550, 7771, 0, 1480, -740, -312, 0};
        var0[9] = new int[]{0, 1850, 13692, 0, 0, 0, -4810, -2590, 0, 0, -5180, -3330, 0, 0, -740, 0, 0, 0, 1110, -156, 0};
        var0[16] = new int[]{2220, 0, 1480, 1480, -1850, 2220, -5921, -1850, 0, 0, -9621, -4810, 4440, 0, 0, 2960, -1110, -1850, -1110, -208, 0};
        var0[2] = new int[]{0, 6291, 8141, 0, 2590, 740, 1110, -5550, -2220, 0, -6661, -5921, -740, 0, 7031, 10361, 0, 0, -740, 208, 0};
        var0[0] = new int[]{-740, 0, -1110, 0, 0, 1110, 3700, 9251, 0, 0, 0, 0, 0, 0, -2220, -2960, 1110, 0, 0, -104, 0};
        var0[14] = new int[]{-7031, -4440, -7401, 0, -1480, -1110, 1850, 14062, 11842, 15542, -740, 6661, 5921, 11471, 4440, 3330, 9251, 13322, 1480, -989, 0};
        var0[11] = new int[]{-3700, 2220, -4440, -2590, 2590, 0, -5550, -7031, 1480, 3700, -740, 740, 0, 0, 740, 7401, 0, 0, 1110, -208, 0};
        var0[10] = new int[]{0, 4440, 9251, 3330, 5550, 0, -1110, 740, 0, 0, -1850, -3330, -1850, 0, 740, 6291, 0, 0, 3700, -156, 0};
        var0[17] = new int[]{-9251, 0, 9991, -3700, -5180, -5921, -740, 1850, -1850, 1480, -8881, -17392, -8881, -6291, 6661, 1850, -3330, -740, -7771, 208, 0};
        var0[22] = new int[]{-9251, -8511, -17392, -3700, -7401, -7401, -2590, 1850, -3330, -7771, -24424, -17392, -9621, -7401, 6661, -740, -3330, -740, -7771, 208, 0};
        var0[20] = new int[]{-9251, -17763, -17763, -5921, -5550, -7031, -1110, -7771, -1480, -4440, -2220, -2960, -9621, -6291, 0, 3700, 3700, -740, -7771, -468, 0};
        var0[1] = new int[]{1480, 2590, 4440, 0, 0, 0, 4440, -1480, -3330, 1110, -5921, -8511, -4070, -2960, 5550, 5921, 0, 0, 0, 0, 0};
        var0[6] = new int[]{0, -8881, -7031, -1110, 0, 1110, 6661, 9991, 0, 0, 5550, 7771, 1480, 0, -3700, -6291, 740, 0, -740, 208, 0};
        var0[25] = new int[]{20, 5, 40, 8, 3, 10, 5, 8};
        var0[19] = new int[]{-9621, 4810, -3700, -1110, -8511, -3330, -740, 3700, -8141, -3700, -3700, -11101, -8881, -7031, 2960, -7771, 4070, 740, -7771, -104, 0};
        var0[23] = new int[]{-9251, -740, -9251, -5921, -8881, -5921, -740, 1850, -1850, 1480, -7771, -17763, -8881, -6291, 6661, 1850, -3330, -740, -7771, 208, 0};
        var0 = field_G[4];
        var0[19] = new int[]{-7771, -1480, -7401, -7401, -740, 8881, 7031, -1145, -2500};
        var0[0] = new int[]{-8511, -1480, 0, 1110, 10361, 0, 416, 520, 729};
        var0[6] = new int[]{-4070, 10731, 15542, -5921, 3330, 0, 364, 468, 1041};
        var0[10] = new int[]{-7771, 9251, 0, 0, 17763, 12212, 885, 989, -625};
        var0[15] = new int[]{2960, 17763, 25904, -13322, -2960, 740, -1093, 0};
        var0[21] = new int[]{-2960, 1110, -6661, -12952, -4070, -8141, 7401, -937, -2500};
        var0[23] = new int[]{-9621, 4070, 10731, -8881, -1110, -7771, 4440, -625, -1770};
        var0[7] = new int[]{-6291, 7771, 11471, -2220, 3330, 0, -740, 104, 1250};
        var0[17] = new int[]{-11842, -1110, -7771, -2960, -740, -6661, 5180, -885, -1718};
        var0[20] = new int[]{-4810, 2590, -8881, -17392, -2590, -2590, 6661, -989, -1979};
        var0[12] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        var0[3] = new int[]{-3700, 3700, 0, -5921, 9621, 17022, 740, 208, 625};
        var0[1] = new int[]{-8141, -740, 0, 2220, 9621, 0, 2220, 572, 468};
        var0[2] = new int[]{-8141, 1480, 0, 1480, 12952, 11471, 1850, 520, 104};
        var0[14] = new int[]{4810, 4440, 12952, -11101, 740, 12582, -885, 0, 0};
        var0[22] = new int[]{-5921, 2590, 0, -12212, -5921, -7771, 6661, -677, -2500};
        var0[13] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        var0[4] = new int[]{-1480, 10731, 0, -9621, -1110, -4070, 364, 572, 937};
        var0[9] = new int[]{-10731, 0, 0, -1110, 12582, 0, 677, 885, -1614};
        var0[11] = new int[]{1110, 7031, 0, -3330, 10361, 17763, 0, 156, 677};
        var0[8] = new int[]{-10361, 4440, 0, -2590, 7031, 0, 208, 416, 677};
        var0[24] = new int[]{-15172, 0, -3700, -6291, -1110, -8141, 5550, -781, -2083};
        var0[25] = new int[]{23, 5, 10, 8, 3, 10, 5, 8};
        var0[16] = new int[]{2960, 23684, 28864, -6291, -5921, -7771, -1041, 0};
        var0[5] = new int[]{0, 14062, 7401, -7401, -1110, 740, 3330, 468, 208};
        var0[18] = new int[]{-11471, -1850, -8141, -8511, 3330, 11471, 7031, -885, -2500};
        var0 = field_G[5];
        var0[17] = new int[]{-2220, -15912, -8881, -5550, 2220, -11471, -1110, -22943, -8141, -5180, -9991, -13692, -2220, -1850, 520, -677};
        var0[8] = new int[]{740, 0, -5550, -2960, -4070, -8141, 1480, -5180, 6291, 0, 2220, -3700, 1110, 0, 0, 0};
        var0[7] = new int[]{1110, -3330, -1850, -3700, 7401, -17392, -1850, 14062, 7771, 0, 8141, 6661, 4440, 0, 520, -1458};
        var0[16] = new int[]{740, -12952, -2590, -9251, -1850, 35526, -1480, 28864, 7031, 1110, 13322, 11842, 6661, -1110, 1562, -260};
        var0[1] = new int[]{0, -1480, -2220, -2590, 2220, -11471, -740, 11471, 5550, 2960, 10731, 5921, 1110, 740, 520, -1145};
        var0[0] = new int[]{0, -1850, -2220, -2960, 2220, -11101, -1110, 12212, 7401, -1110, 740, 5180, 2220, 1110, 416, -1302};
        var0[9] = new int[]{0, -1850, -1850, -2960, 2220, -11101, -1110, 12212, 7401, -740, 0, 5180, 1850, 0, 416, -1197};
        var0[11] = new int[]{3700, -9251, -7771, -5921, 1480, -17763, 0, -17763, -4440, 0, 8511, 12952, 4070, 0, 1562, -1875};
        var0[19] = new int[]{740, -13322, -17763, -1480, -15542, -4070, 0, -17763, -11471, -7401, 3330, 6291, -1110, 0, 520, -1145};
        var0[13] = new int[]{4440, 7401, 3700, 0, -17022, -740, 2960, 8881, -35526, 4070, -1480, -12212, 5180, 0, -1197, 260};
        var0[15] = new int[]{0, -4440, 4070, -5180, 8141, -1480, 0, -4070, 1110, -740, 1480, 1850, 6291, -2590, -2500, 572};
        var0[24] = new int[]{740, 0, -5550, -2960, -4070, -8141, 1480, -5180, 6291, 0, 2220, -3700, 1110, 0, 0, 0};
        var0[22] = new int[]{-2960, -11101, -4440, -11101, -7031, -17763, -7771, -7401, -26644, 0, -12952, -9251, -4810, -1850, 0, -468};
        var0[3] = new int[]{2220, 0, -6661, -740, -2960, -8881, 1480, -17763, 0, -1480, 0, 2960, -1110, 1850, 208, -1927};
        var0[4] = new int[]{1110, -7771, -4810, 1110, -7401, -10731, 3330, -11471, 8141, -1480, 1850, 2220, 740, 2220, 364, -1614};
        var0[20] = new int[]{1110, -22943, -4810, -11101, -7401, -5180, 1110, -10361, -740, -3330, 0, 6291, -5550, -740, 260, -1614};
        var0[23] = new int[]{-4810, -17392, -8141, -8141, 5180, -23684, -1480, 6291, 3700, 2590, -4810, -7031, -4070, -3700, 520, 364};
        var0[5] = new int[]{0, -5550, -3700, -2220, -6661, -15912, 2590, -9621, 2590, -740, 0, 1110, 3330, 0, 364, -1354};
        var0[14] = new int[]{1850, 9621, 27384, 7031, -27384, 0, 2960, 1480, 34785, 2590, -5550, -24424, -740, 3330, -2500, 833};
        var0[12] = new int[]{2960, -17022, 5180, -1110, -6661, -16282, 1850, -17763, -4810, 2220, 6291, 6291, 3330, 0, 1250, -1041};
        var0[18] = new int[]{1110, -15912, -15172, -5550, -9621, -7031, -1480, -35526, 14802, -9251, -1110, 1850, -1480, -740, 781, -1562};
        var0[25] = new int[]{35, 7, 52, 7, 5, 35, 7, 7};
        var0[6] = new int[]{0, -7771, -1850, -3700, 1850, -14062, 1110, -10361, -2220, 740, 2590, 5180, 5180, -1480, 416, -1510};
        var0[2] = new int[]{1110, -1850, -2590, -740, 0, -9621, 0, 17392, 6291, 2590, 6661, 5921, 0, 1480, 364, -1562};
        var0[21] = new int[]{-4810, -14802, -3330, -16282, 6291, -28124, -5550, -5550, 8511, -1110, -13322, 4440, -7771, 0, 208, -260};
        var0[10] = new int[]{0, -9251, 4440, -2220, -3700, -17022, 0, -15912, -3330, 1480, 3700, 8511, 2590, 0, 885, -625};
        var0 = field_G[6];
        var0[11] = new int[]{-6291, -1480, -4070, 0, -11101, 740, 740, 740, -740, 7771, -1110, -2500, 0};
        var0[5] = new int[]{0, 0};
        var0[3] = new int[]{-1480, 1850, 1110, -740, -11101, -2220, 740, 0, -3330, -1480, 0, -1354, 0};
        var0[22] = new int[]{0, 0};
        var0[18] = new int[]{-9621, -1110, 2960, -5921, -9991, -1110, 3700, -9251, -11101, 2220, -7401, -1927, 0};
        var0[8] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        var0[13] = new int[]{0, 0};
        var0[20] = new int[]{-9991, -5921, -5180, -5921, -3700, -4810, 0, -12212, -12582, 0, -6661, -2239, 0};
        var0[6] = new int[]{0, 0};
        var0[16] = new int[]{-2220, 4810, -1110, 0, -6661, 3330, 0, 1110, -5180, -1480, 0, -1666, 0};
        var0[10] = new int[]{-6291, -9621, 0, 0, -17763, -740, 1480, 1110, 8141, 1480, 0, -2239, 0};
        var0[17] = new int[]{-6661, -3700, -1850, -5921, -7771, -2220, 0, -9991, -12582, 0, -7771, -1979, 0};
        var0[1] = new int[]{-3700, -1110, 1850, -740, -15542, -740, 740, 3330, -1480, -1110, 0, -1666, 0};
        var0[4] = new int[]{-5921, -1110, 0, -740, -17763, -1480, 0, 2220, -1480, -1850, 0, -1510, 0};
        var0[23] = new int[]{0, 0};
        var0[19] = new int[]{-11471, -5550, -2960, -5921, -2960, -3700, 0, -11471, -13322, 2220, -7031, -2135, 0};
        var0[12] = new int[]{0, 0};
        var0[9] = new int[]{-6291, -5921, 5921, 0, -17392, -740, 740, 1110, 3330, 3700, 0, -1666, 0};
        var0[7] = new int[]{0, 0};
        var0[0] = new int[]{-740, -3700, 0, 0, -18503, 0, 0, 0, -740, 0, 0, -729, -312};
        var0[24] = new int[]{0, 0};
        var0[14] = new int[]{-8141, 5921, -2590, 0, -6661, 3330, 1480, 1110, -3700, 1480, 0, -2031, 0};
        var0[21] = new int[]{0, 0};
        var0[25] = new int[]{80, 2, 25, 4, 3, 80, 2, 4};
        var0[2] = new int[]{-2590, 2960, 1480, -740, -9251, -740, 0, 1850, -2960, -1480, 0, -1562, 0};
        var0[15] = new int[]{4070, 8881, 1480, 0, -6661, 5180, -740, 1110, -7771, -2590, 0, -1666, 0};
        var0 = field_G[7];
        var0[24] = new int[]{-740, 0, 2960, -3330, -740, -8881, -11842, -5550, -12212, -7031, 4440, -416, 0};
        var0[3] = new int[]{-740, 1480, 0, 4070, 6291, 5180, -740, -6661, -2960, 0, 6661, -208, 208};
        var0[5] = new int[]{-740, 1110, -6661, -10731, -6291, 3330, 2590, -1110, 0, 0, 5550, -260, 0};
        var0[23] = new int[]{-740, 1480, -7401, -3700, 1110, -7401, -1850, 2590, 12212, 9251, 5550, -104, 0};
        var0[25] = new int[]{33, 6, 25, 8, 4, 22, 6, 8};
        var0[12] = new int[]{-740, 3700, 9621, 0, 11471, 1480, -7031, -6291, 8141, 7031, 8511, -364, 2239};
        var0[14] = new int[]{0, 0, 5550, -1110, 1850, 17392, -7401, -8141, -3330, 5550, 7401, -1354, 0};
        var0[6] = new int[]{-740, 3700, -7031, -9621, 0, -1110, 5550, 1850, -1110, 0, 5921, 0, 0};
        var0[4] = new int[]{-1850, 1110, -7031, -4070, -2590, 7771, -1480, -4070, 1480, 0, 5550, -312, 416};
        var0[20] = new int[]{-1850, 1110, -13692, -9621, -10361, -8881, 1110, -2960, 1480, -7031, 5550, -364, 156};
        var0[2] = new int[]{-740, 1480, 0, 4440, 8881, 2590, -5921, -4810, -3330, 0, 5180, 364, 572};
        var0[21] = new int[]{-740, 1110, -10361, -6661, -8141, -7031, 4070, -1110, 0, 0, 10731, -416, -156};
        var0[11] = new int[]{-740, 1480, 5550, 4810, 9621, 0, -7031, -3700, 3330, 0, 8511, 260, 1614};
        var0[9] = new int[]{-740, 1480, 9251, 2220, 0, 0, -3330, -4810, -3330, 0, 740, 0, 1197};
        var0[17] = new int[]{-2220, -4440, 2960, -1110, 5550, -7031, -10731, -4440, -8511, -7401, 9251, -156, 312};
        var0[1] = new int[]{-740, -4440, 5180, 2220, 0, 0, -2960, -9991, -3700, 0, 5550, 0, 572};
        var0[16] = new int[]{0, 0, -4810, 5180, 9621, 10361, 2220, -12952, -3700, 4070, 5550, -937, 0};
        var0[7] = new int[]{-740, 1480, -5921, -4440, -4070, 0, -1850, 2590, 12212, 9251, 5180, 208, 0};
        var0[8] = new int[]{-740, 0, 2960, -3330, -740, 0, -6661, -2220, 4070, 8881, 5921, -572, 416};
        var0[15] = new int[]{0, 0, -4440, 2220, -2220, 740, -9621, -8881, -8141, -3330, 10361, -1979, 0};
        var0[13] = new int[]{-740, 1480, 9251, 2220, 0, 0, -3700, -4810, -3330, 0, 740, 0, 1197};
        var0[19] = new int[]{-740, 1480, -4070, 0, 2220, -2590, 2220, -4070, -2960, -7401, 7031, -937, 208};
        var0[10] = new int[]{-740, 1480, 0, 7031, 9621, 0, -9991, -4070, -3330, 0, 8511, 885, 1197};
        var0[0] = new int[]{-740, 1480, 9251, 2220, 0, 0, -3700, -4810, -3330, 0, 740, 0, 1197};
        var0[18] = new int[]{-740, 1480, 740, 4440, 8881, 2590, -13692, -4070, 0, -7771, 9991, -156, 572};
        var0[22] = new int[]{-740, 3700, -11842, -5550, -3700, -8141, 7031, 1110, 2220, 5180, 9621, 0, 0};
        var0 = field_G[8];
        var0[20] = new int[]{0, 0, 0, 0};
        var0[0] = new int[]{0, 0, 104, 0};
        var0[19] = new int[]{-8511, -1850, 0, 0};
        var0[1] = new int[]{0, 0, 104, 0};
        var0[17] = new int[]{-8141, -3330, 0, 0};
        var0[3] = new int[]{0, -740, 104, 0};
        var0[7] = new int[]{1110, 740, 0, 0};
        var0[14] = new int[]{1480, 2220, -104, 0};
        var0[4] = new int[]{0, 0, 0, 0};
        var0[8] = new int[]{0, 0, 0, 0};
        var0[10] = new int[]{0, 0, 0, 0};
        var0[15] = new int[]{1480, -740, -468, 0};
        var0[24] = new int[]{0, 0, 0, 0};
        var0[21] = new int[]{0, 0, 0, 0};
        var0[23] = new int[]{0, 0, 0, 0};
        var0[12] = new int[]{0, 0, 0, 0};
        var0[9] = new int[]{0, 3330, 208, 0};
        var0[22] = new int[]{0, 0, 0, 0};
        var0[5] = new int[]{0, 0, 0, 0};
        var0[2] = new int[]{0, 740, 104, 0};
        var0[6] = new int[]{0, 0, 0, 0};
        var0[16] = new int[]{-1850, 1110, -104, 0};
        var0[11] = new int[]{0, 0, 0, 0};
        var0[13] = new int[]{0, 0, 0, 0};
        var0[18] = new int[]{-8511, -2590, 0, 0};
        var0[25] = new int[]{32, 3, 85, 3, 1, 32, 3, 3};
        var0 = field_G[9];
        var0[17] = new int[]{8511, 4810, 1480, 4070, 2960, 1850, -312, 0};
        var0[20] = new int[]{8511, 740, 0, 1850, 0, 0, 208, 0};
        var0[13] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        var0[3] = new int[]{5921, 740, 4070, 1110, 0, 2220, 156, 0};
        var0[1] = new int[]{8511, 4810, 1480, 4070, 2960, 1850, 0, 0};
        var0[18] = new int[]{7401, 2960, 3330, 2960, 1850, 1110, -156, 0};
        var0[11] = new int[]{16652, 2960, 3330, 6291, -2220, 3330, 1250, 1250};
        var0[25] = new int[]{32, 8, 25, 8, 4, 32, 8, 8};
        var0[10] = new int[]{12212, -1110, 3700, 1850, -1110, -1110, 572, 520};
        var0[16] = new int[]{9991, 2590, 1850, 3700, 0, 0, 104, 0};
        var0[19] = new int[]{5921, 740, 4070, 1110, 0, 2220, -104, 0};
        var0[24] = new int[]{9991, 4810, 4810, 5550, 2960, 4440, -156, 0};
        var0[15] = new int[]{8511, 1850, 2590, 0, -1480, -3330, -364, 1041};
        var0[2] = new int[]{7401, 2960, 3330, 2960, 1850, 1110, 104, 0};
        var0[5] = new int[]{9251, 3330, -1850, 4810, 740, -3330, 260, 0};
        var0[23] = new int[]{8881, 5921, 4070, 6291, 2590, 2590, 0, 0};
        var0[21] = new int[]{9251, 3330, -1850, 4810, 740, -3330, 364, 0};
        var0[6] = new int[]{9251, 4810, 1110, 5550, 2590, -3330, 208, 0};
        var0[7] = new int[]{8881, 5921, 4070, 6291, 2590, 2590, 156, 0};
        var0[9] = new int[]{8511, 2590, 0, 3700, 1480, -1110, 0, 0};
        var0[8] = new int[]{9991, 4810, 4810, 5550, 2960, 4440, 104, 0};
        var0[22] = new int[]{9251, 4810, 1110, 5550, 2590, -3330, 208, 0};
        var0[0] = new int[]{8511, 2590, 0, 3700, 1480, -1110, 0, 0};
        var0[14] = new int[]{1480, 6291, 7401, 0, 4810, 4810, -416, 2031};
        var0[4] = new int[]{8511, 740, 0, 1850, 0, 0, 208, 0};
        var0[12] = new int[]{6661, 6291, 5921, 2960, 4810, 4810, 468, 2135};
        var0 = field_G[10];
        var0[18] = new int[]{-3700, 2590, -3330, -8141, -7401, -7401, 4440, 0, 5921, 0, 0, 2590, 1979, -520};
        var0[10] = new int[]{-7771, 0, 0, 0, 0, 1850, 9991, 3700, 4070, 0, 0, 8141, 1145, 0};
        var0[4] = new int[]{3330, 5550, -3330, 5921, 0, -6661, -1110, -2590, -1850, -4440, 0, 0, 104, 0};
        var0[20] = new int[]{1850, 0, -3330, 5921, 0, -12212, -1480, -2590, -8141, -7401, 0, 4810, 1562, -312};
        var0[11] = new int[]{-2590, 2960, 0, 0, 0, 1850, 9991, 3700, 8881, 11842, 0, 2220, 520, 1197};
        var0[8] = new int[]{-5180, -740, 740, -1850, 2220, 7031, 3330, 2590, 0, 0, 0, 0, 0, -156};
        var0[24] = new int[]{-8881, -740, 740, -8511, -7771, 1110, 5921, 5921, 7401, -2960, 0, 3700, 833, 0};
        var0[6] = new int[]{3700, 10361, -1480, 9251, 9251, -2960, 1110, -2590, 0, 0, 0, 2590, 364, -416};
        var0[13] = new int[]{8881, -2590, 1480, 10361, 1850, -9621, -740, -4440, 14062, 17763, 0, 2220, -1510, 2500};
        var0[17] = new int[]{-5921, 0, -3330, -7771, -8141, -2220, 5550, 0, 0, 0, 0, 3700, 1197, -364};
        var0[5] = new int[]{5921, 5550, -3330, 5921, 0, -2960, -3700, -2590, 0, -7771, 0, 1850, 104, -260};
        var0[19] = new int[]{-1850, 1480, -3330, -8141, -7771, -15172, -1480, -4810, -4070, -11101, 0, 1110, 2187, -885};
        var0[12] = new int[]{2220, 2960, 0, 10361, 1850, -3700, 11471, 1110, 9991, 17763, 0, 2220, -468, 2395};
        var0[0] = new int[]{-2590, -3330, 0, 0, 0, 5921, 2960, 0, 0, 0, 0, -1480, 0, 0};
        var0[1] = new int[]{-4070, -6291, -3330, -3330, -6291, 5921, 2960, 0, 0, 0, 0, 740, 0, -1041};
        var0[22] = new int[]{-7031, 1850, -1480, -7401, -6661, 740, 0, -2590, -8881, -8141, 0, 2590, 1458, -364};
        var0[14] = new int[]{8141, 3700, 8141, 17392, 17392, -11842, -6291, -4440, 11842, 18503, 0, 2220, -1510, 1093};
        var0[2] = new int[]{-5180, -1480, -3330, 0, 0, 5550, 8141, 0, 5921, 0, 0, 1850, 520, -989};
        var0[15] = new int[]{-2960, 8511, 4440, 20723, 23684, -11842, -7771, -7771, 4070, 12212, 0, -1850, -1510, 1093};
        var0[3] = new int[]{-1850, 1480, -3330, 0, 0, 0, 7031, 2960, 10731, 13322, 0, 1110, 208, -885};
        var0[7] = new int[]{-2220, 4070, 1110, 2960, 5180, 1480, 1110, -2590, 0, 0, 0, 1850, -104, -625};
        var0[16] = new int[]{6291, 16282, 13692, 22943, 28124, 0, -8141, -1850, -4440, -7771, 0, -5550, -1510, 1093};
        var0[21] = new int[]{740, 5921, -3330, 5550, 9991, -4070, 2590, -6291, -8141, -8141, 0, 5180, 1354, 0};
        var0[9] = new int[]{-2590, -3330, 0, 0, 0, 5921, 2960, 0, 0, 0, 0, -1480, 0, -156};
        var0[25] = new int[]{47, 6, 25, 8, 5, 47, 6, 8};
        var0[23] = new int[]{-10731, -4810, 1110, -7771, -8881, 2960, -1480, -2590, 0, 0, 0, 5550, 468, -104};
        var0 = field_G[11];
        var0[14] = new int[]{5921, 2590, 3330, 8511, 0, 7401, 9621, 12582, -11842, -9621, 0, 2960, 12952, -2291, -1822};
        var0[12] = new int[]{5921, 2590, 3330, -3700, 1480, 4070, 0, 0, -2960, 5550, 740, 0, 0, 312, -1406};
        var0[0] = new int[]{0, 2590, 3330, -3330, -4440, 2220, -1480, 0, 1110, 4070, 740, 0, 0, 364, 156};
        var0[25] = new int[]{43, 4, 90, 8, 5, 12, 4, 8};
        var0[20] = new int[]{5180, 2960, 1480, 0, 1110, 3330, 1110, 0, -8141, -10731, -4070, -7771, -7771, -520, -2083};
        var0[10] = new int[]{2960, 2590, 3330, -8141, -1480, 4070, 0, 0, -1850, 7401, 740, 0, 0, 1145, -1302};
        var0[22] = new int[]{4440, 2960, 1480, -5921, 5180, 8141, 5921, 9251, -4070, -5180, -6661, -7771, -8141, -104, -1770};
        var0[11] = new int[]{5921, 2590, 3330, -9991, -1480, 4070, 0, 0, 0, 12952, 740, 0, 0, 1145, -2187};
        var0[1] = new int[]{2220, 2960, 1480, -6291, 0, 1110, 1110, -740, 4070, 14062, 740, 11471, 12212, 781, -364};
        var0[18] = new int[]{4440, 2960, 1480, 0, 0, 1850, -7771, -7771, -2220, 8511, 740, 7031, 0, -520, -416};
        var0[16] = new int[]{4070, 2590, 3330, 2960, 10361, 4070, 15542, 17763, 740, -9251, -5180, -4810, -5550, -572, -1666};
        var0[23] = new int[]{5180, 1850, 1480, -12212, -7031, 5180, -5180, -7401, 3330, -3330, -2960, -1850, -7401, -781, -1354};
        var0[15] = new int[]{3330, 2590, 3330, -2960, 1850, 6291, 11101, 17763, -7401, -17763, 0, -1850, -1110, -937, -989};
        var0[8] = new int[]{4070, 2590, 3330, -7401, -8511, 2220, -5180, -10731, 5180, 9991, 5180, 8881, 8141, 364, -1927};
        var0[24] = new int[]{6661, 2590, 3330, -7401, -6661, 5180, -8141, -8141, 2590, 4070, 5180, 4440, 8141, -781, -1927};
        var0[21] = new int[]{4070, 2960, 1480, -740, 9621, 5550, 7031, 0, -7401, -5180, -6661, -7771, -7031, -104, -1458};
        var0[13] = new int[]{5921, 2590, 3330, 2590, 3700, 3700, 5180, 0, -10361, -3700, 740, 5921, 9251, -364, 468};
        var0[2] = new int[]{3330, 2960, 1480, 0, 0, 1850, 0, 0, -2220, 8511, 740, 7031, 0, 0, -1354};
        var0[5] = new int[]{3330, 2960, 1480, 12212, 9621, 5550, 7031, 0, -7401, -5180, -6661, -740, 0, 885, -1666};
        var0[4] = new int[]{3330, 2960, 1480, 8141, 5180, 3330, 1480, 0, -8141, -10731, -4070, -5550, -8881, 260, -2343};
        var0[19] = new int[]{4810, 2960, 1480, -2960, 0, 1850, 0, -8881, -12952, -13322, 1480, -8511, -7031, -260, -1718};
        var0[7] = new int[]{3330, 1850, 1480, -8511, -3700, 5180, -740, -1850, 3330, 4810, -2960, -740, 0, 312, -1927};
        var0[6] = new int[]{3330, 2960, 1480, -4070, 5180, 8141, 5921, 9251, -4070, -5180, -6661, -740, 0, 364, -2500};
        var0[17] = new int[]{5550, 2960, 1480, -6291, 0, 0, -7771, -8141, 4070, 14062, 740, 11471, 12212, -312, -1354};
        var0[3] = new int[]{3700, 2960, 1480, 1850, 2220, 1850, 0, 1110, -7401, -2220, 1480, 1110, 7031, 0, -2500};
        var0[9] = new int[]{0, 2590, 3330, -3330, -4440, 2220, -1480, 0, 1110, 4070, 740, 0, 0, 364, 156};
        field_V = true;
    }
}
