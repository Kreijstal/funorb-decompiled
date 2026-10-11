/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends sc {
    private int field_r;
    private int field_m;
    private int field_n;
    private boolean field_q;
    private ok field_l;
    private int field_p;
    static rf field_s;
    static int field_t;
    static int field_k;
    private String field_u;
    private int field_o;

    final void a(int param0, int param1, int param2, String param3, ok param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        sd var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param3 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_l == param4 &&
            this.field_q &&
            this.field_n == 1 &&
            this.field_u != null &&
            this.field_u.equals(param3)) {
            return;
          }
          this.field_l = param4;
          this.field_n = 1;
          this.field_q = true;
          var6 = this.a(param2, (byte) -123, param4, param3);
          var7 = param4.c(param3);
          var6.field_e[0] = param0 - (var7 >> 1);
          var6.field_e[param3.length()] = (var7 >> 1) + param0;
          var8 = -98 % ((param1 - 34) / 43);
          pe.a(param4, var6, param3, 0, 3694);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_26_0 = var6_ref;
          stackIn_26_1 = new StringBuilder().append("c.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, ok param3, String param4) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        sd var6 = null;
        RuntimeException var6_ref = null;
        try {
          if (null == param4) {
            this.field_c = null;
            return;
          }
          if (this.field_l == param3 &&
            this.field_q &&
            0 == this.field_n &&
            null != this.field_u &&
            this.field_u.equals(param4)) {
            return;
          }
          this.field_n = 0;
          this.field_l = param3;
          this.field_q = true;
          this.field_u = param4;
          var6 = this.a(param0, (byte) -107, param3, param4);
          if (param2 != -24) {
            this.field_o = -118;
          }
          var6.field_e[0] = param1;
          var6.field_e[param4.length()] = param1 + param3.c(param4);
          pe.a(param3, var6, param4, 0, 3694);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("c.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        try {
          field_s = null;
          int var1_int = -18 / ((param0 - 5) / 58);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "c.B(" + param0 + ')');
        }
    }

    private final sd a(int param0, byte param1, ok param2, String param3) {
        sd var5 = null;
        RuntimeException var5_ref = null;
        sd stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -79) {
            c.a(true, (mi) null);
          }
          var5 = new sd(-param2.field_C + param0, param2.field_D + param0, param3.length());
          this.field_c = new sd[]{var5};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("c.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, ok param7) {
        sd discarded$0 = null;
        sd stackIn_66_0;
        sd stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        sd stackIn_67_0 = null;
        sd stackIn_67_1 = null;
        int stackIn_67_4 = 0;
        ok stackIn_73_0 = null;
        sd stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int stackIn_74_3;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        sd var14 = null;
        int var15 = 0;
        int var12Lifetime1;
        var15 = Confined.field_J ? 1 : 0;
        try {
          if (param5 == 0) {
            param5 = param7.field_v;
          }
          if (param3 != 3) {
            discarded$0 = this.a(114, (byte) 78, (ok) null, (String) null);
          }
          if (param0 == null) {
            this.field_c = null;
            return;
          }
          if (param7 == this.field_l &&
            !this.field_q &&
            ~param2 == ~this.field_n &&
            ~this.field_p == ~param4 &&
            this.field_r == param5 &&
            ~param6 == ~this.field_m &&
            param1 == this.field_o &&
            null != this.field_u &&
            this.field_u.equals(param0)) {
            return;
          }
          this.field_n = param2;
          this.field_p = param4;
          this.field_r = param5;
          this.field_m = param6;
          this.field_l = param7;
          this.field_q = false;
          this.field_u = param0;
          this.field_o = param1;
          var9 = new String[param7.b(param0, param1) + 1];
          var10 = Math.max(1, param7.a(param0, new int[]{param1}, var9));
          if (this.field_p == 3 &&
            var10 == 1) {
            this.field_p = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_p == 0) {
            var11 = param7.field_C;
            decompiledFrameRemainder0 = (var15 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_p != 1) {
              if (this.field_p != 2) {
                var12 = (-(this.field_r * var10) + this.field_m) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param7.field_C;
                this.field_r = this.field_r + var12;
                if (var15 != 0) {
                  var11 = -param7.field_D + this.field_m - this.field_r * var10;
                  var11 = (this.field_m - var10 * this.field_r >> 1) + param7.field_C;
                }
              } else {
                var11 = -param7.field_D + this.field_m - this.field_r * var10;
                if (var15 != 0) {
                  var11 = (this.field_m - var10 * this.field_r >> 1) + param7.field_C;
                }
              }
            } else {
              var11 = (this.field_m - var10 * this.field_r >> 1) + param7.field_C;
            }
          }
          this.field_c = new sd[var10];
          var12Lifetime1 = 0;
          while (var12Lifetime1 < var10) {
            var13 = var9[var12Lifetime1];
            if (var15 != 0) {
              return;
            }
            stackIn_66_0 = null;
            stackIn_66_1 = null;
            stackIn_66_2 = var11 - param7.field_C;
            stackIn_66_3 = param7.field_D + var11;
            if (null != var13) {
              stackIn_67_0 = null;
              stackIn_67_1 = null;
              stackIn_67_4 = var13.length();
            } else {
              stackIn_67_0 = null;
              stackIn_67_1 = null;
              stackIn_67_4 = 0;
            }
            var14 = new sd(stackIn_66_2, stackIn_66_3, stackIn_67_4);
            var14.field_e[0] = 0;
            if (var13 != null) {
              var14.field_e[var13.length()] = param7.c(var13);
              stackIn_73_0 = (ok) (param7);
              stackIn_73_1 = var14;
              stackIn_73_2 = var13;
              if (3 == param2) {
                stackIn_74_3 = this.a(param7.c(var13), param1, param3 ^ 28437, var13);
              } else {
                stackIn_74_3 = 0;
              }
              pe.a(stackIn_73_0, stackIn_73_1, stackIn_73_2, stackIn_74_3, 3694);
            }
            var11 = var11 + param5;
            this.field_c[var12Lifetime1] = var14;
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_80_0 = var9_ref;
          stackIn_80_1 = new StringBuilder().append("c.H(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(')').toString());
        }
    }

    final static in a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_7_0 = null;
        in stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 71) {
            c.a((String) null, 38);
          }
          if (na.field_S == wh.field_fb) {
            stackIn_7_0 = null;
            return (in) (stackIn_7_0);
          }
          if (na.field_S == b.field_a &&
            param0.equals(ee.field_F)) {
            na.field_S = ml.field_a;
            stackIn_13_0 = lm.field_e;
            return stackIn_13_0;
          }
          lm.field_e = null;
          ee.field_F = param0;
          na.field_S = wh.field_fb;
          stackIn_15_0 = null;
          return (in) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("c.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ok param0, String param1, int param2, int param3, int param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        sd var6 = null;
        RuntimeException var6_ref = null;
        try {
          if (null == param1) {
            this.field_c = null;
            return;
          }
          if (this.field_l == param0 &&
            this.field_q &&
            this.field_n == 2 &&
            null != this.field_u &&
            this.field_u.equals(param1)) {
            return;
          }
          this.field_u = param1;
          this.field_n = 2;
          this.field_q = true;
          this.field_l = param0;
          var6 = this.a(param2, (byte) -93, param0, param1);
          var6.field_e[0] = -param0.c(param1) + param3;
          if (param4 > -85) {
            this.field_q = true;
          }
          var6.field_e[param1.length()] = param3;
          pe.a(param0, var6, param1, 0, 3694);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_27_0 = var6_ref;
          stackIn_27_1 = new StringBuilder().append("c.G(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, mi param1) {
        RuntimeException stackIn_698_0 = null;
        StringBuilder stackIn_698_1 = null;
        String stackIn_699_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        byte[] var2Lifetime104;
        byte[] var2Lifetime105;
        byte[] var2Lifetime106;
        byte[] var2Lifetime107;
        byte[] var2Lifetime108;
        byte[] var2Lifetime109;
        byte[] var2Lifetime110;
        byte[] var2Lifetime111;
        byte[] var2Lifetime112;
        byte[] var2Lifetime113;
        byte[] var2Lifetime114;
        byte[] var2Lifetime115;
        byte[] var2Lifetime116;
        byte[] var2Lifetime117;
        byte[] var2Lifetime118;
        byte[] var2Lifetime119;
        byte[] var2Lifetime120;
        byte[] var2Lifetime121;
        byte[] var2Lifetime122;
        byte[] var2Lifetime123;
        byte[] var2Lifetime124;
        byte[] var2Lifetime125;
        byte[] var2Lifetime126;
        byte[] var2Lifetime127;
        byte[] var2Lifetime128;
        byte[] var2Lifetime129;
        byte[] var2Lifetime130;
        byte[] var2Lifetime131;
        byte[] var2Lifetime132;
        byte[] var2Lifetime133;
        byte[] var2Lifetime134;
        byte[] var2Lifetime135;
        byte[] var2Lifetime136;
        byte[] var2Lifetime137;
        byte[] var2Lifetime138;
        byte[] var2Lifetime139;
        byte[] var2Lifetime140;
        byte[] var2Lifetime141;
        byte[] var2Lifetime142;
        byte[] var2Lifetime143;
        byte[] var2Lifetime144;
        byte[] var2Lifetime145;
        byte[] var2Lifetime146;
        byte[] var2Lifetime147;
        byte[] var2Lifetime148;
        byte[] var2Lifetime149;
        byte[] var2Lifetime150;
        byte[] var2Lifetime151;
        byte[] var2Lifetime152;
        byte[] var2Lifetime153;
        byte[] var2Lifetime154;
        byte[] var2Lifetime155;
        byte[] var2Lifetime156;
        byte[] var2Lifetime157;
        byte[] var2Lifetime158;
        byte[] var2Lifetime159;
        byte[] var2Lifetime160;
        byte[] var2Lifetime161;
        byte[] var2Lifetime162;
        byte[] var2Lifetime163;
        byte[] var2Lifetime164;
        byte[] var2Lifetime165;
        byte[] var2Lifetime166;
        byte[] var2Lifetime167;
        byte[] var2Lifetime168;
        byte[] var2Lifetime169;
        byte[] var2Lifetime170;
        byte[] var2Lifetime171;
        byte[] var2Lifetime172;
        byte[] var2Lifetime173;
        byte[] var2Lifetime174;
        byte[] var2Lifetime175;
        byte[] var2Lifetime176;
        byte[] var2Lifetime177;
        byte[] var2Lifetime178;
        byte[] var2Lifetime179;
        byte[] var2Lifetime180;
        byte[] var2Lifetime181;
        byte[] var2Lifetime182;
        byte[] var2Lifetime183;
        byte[] var2Lifetime184;
        byte[] var2Lifetime185;
        byte[] var2Lifetime186;
        byte[] var2Lifetime187;
        byte[] var2Lifetime188;
        byte[] var2Lifetime189;
        byte[] var2Lifetime190;
        byte[] var2Lifetime191;
        byte[] var2Lifetime192;
        byte[] var2Lifetime193;
        byte[] var2Lifetime194;
        byte[] var2Lifetime195;
        byte[] var2Lifetime196;
        byte[] var2Lifetime197;
        try {
          mn.field_e = param1;
          var2 = wm.a("keycode_energyweapon1", (byte) 101);
          if (null != var2) {
            ql.field_u = 255 & var2[0];
          }
          var2Lifetime1 = wm.a("keycode_energyweapon2", (byte) 87);
          if (var2Lifetime1 != null) {
            nl.field_b = var2Lifetime1[0] & 255;
          }
          var2Lifetime2 = wm.a("keycode_energyweapon3", (byte) 85);
          if (var2Lifetime2 != null) {
            ln.field_b = var2Lifetime2[0] & 255;
          }
          var2Lifetime3 = wm.a("keycode_energyweapon4", (byte) 84);
          if (null != var2Lifetime3) {
            oc.field_e = 255 & var2Lifetime3[0];
          }
          var2Lifetime4 = wm.a("keycode_missile1", (byte) 123);
          if (null != var2Lifetime4) {
            ja.field_d = var2Lifetime4[0] & 255;
          }
          var2Lifetime5 = wm.a("keycode_missile2", (byte) 55);
          if (null != var2Lifetime5) {
            ib.field_W = 255 & var2Lifetime5[0];
          }
          var2Lifetime6 = wm.a("keycode_missile3", (byte) 62);
          if (null != var2Lifetime6) {
            vf.field_l = 255 & var2Lifetime6[0];
          }
          var2Lifetime7 = wm.a("keycode_missile4", (byte) 103);
          if (null != var2Lifetime7) {
            sb.field_f = var2Lifetime7[0] & 255;
          }
          var2Lifetime8 = wm.a("keyname_energyweapon1", (byte) 52);
          if (var2Lifetime8 != null) {
            ek.field_k = va.a(0, var2Lifetime8);
          }
          var2Lifetime9 = wm.a("keyname_energyweapon2", (byte) 38);
          if (var2Lifetime9 != null) {
            kc.field_r = va.a(0, var2Lifetime9);
          }
          var2Lifetime10 = wm.a("keyname_energyweapon3", (byte) 101);
          if (null != var2Lifetime10) {
            r.field_b = va.a(0, var2Lifetime10);
          }
          var2Lifetime11 = wm.a("keyname_energyweapon4", (byte) 55);
          if (var2Lifetime11 != null) {
            rb.field_g = va.a(0, var2Lifetime11);
          }
          var2Lifetime12 = wm.a("keyname_missile1", (byte) 62);
          if (var2Lifetime12 != null) {
            ic.field_d = va.a(0, var2Lifetime12);
          }
          var2Lifetime13 = wm.a("keyname_missile2", (byte) 35);
          if (null != var2Lifetime13) {
            s.field_L = va.a(0, var2Lifetime13);
          }
          var2Lifetime14 = wm.a("keyname_missile3", (byte) 50);
          if (null != var2Lifetime14) {
            qn.field_x = va.a(0, var2Lifetime14);
          }
          var2Lifetime15 = wm.a("keyname_missile4", (byte) 72);
          if (var2Lifetime15 != null) {
            cf.field_db = va.a(0, var2Lifetime15);
          }
          var2Lifetime16 = wm.a("achievement_names,0", (byte) 127);
          if (var2Lifetime16 != null) {
            he.field_b[0] = va.a(0, var2Lifetime16);
          }
          var2Lifetime17 = wm.a("achievement_names,1", (byte) 62);
          if (null != var2Lifetime17) {
            he.field_b[1] = va.a(0, var2Lifetime17);
          }
          var2Lifetime18 = wm.a("achievement_names,2", (byte) 106);
          if (var2Lifetime18 != null) {
            he.field_b[2] = va.a(0, var2Lifetime18);
          }
          var2Lifetime19 = wm.a("achievement_names,3", (byte) 64);
          if (null != var2Lifetime19) {
            he.field_b[3] = va.a(0, var2Lifetime19);
          }
          var2Lifetime20 = wm.a("achievement_names,4", (byte) 30);
          if (null != var2Lifetime20) {
            he.field_b[4] = va.a(0, var2Lifetime20);
          }
          var2Lifetime21 = wm.a("achievement_names,5", (byte) 120);
          if (null != var2Lifetime21) {
            he.field_b[5] = va.a(0, var2Lifetime21);
          }
          var2Lifetime22 = wm.a("achievement_names,6", (byte) 94);
          if (var2Lifetime22 != null) {
            he.field_b[6] = va.a(0, var2Lifetime22);
          }
          var2Lifetime23 = wm.a("achievement_names,7", (byte) 87);
          if (null != var2Lifetime23) {
            he.field_b[7] = va.a(0, var2Lifetime23);
          }
          var2Lifetime24 = wm.a("achievement_names,8", (byte) 110);
          if (null != var2Lifetime24) {
            he.field_b[8] = va.a(0, var2Lifetime24);
          }
          var2Lifetime25 = wm.a("achievement_names,9", (byte) 28);
          if (null != var2Lifetime25) {
            he.field_b[9] = va.a(0, var2Lifetime25);
          }
          var2Lifetime26 = wm.a("achievement_names,10", (byte) 93);
          if (var2Lifetime26 != null) {
            he.field_b[10] = va.a(0, var2Lifetime26);
          }
          var2Lifetime27 = wm.a("achievement_names,11", (byte) 65);
          if (null != var2Lifetime27) {
            he.field_b[11] = va.a(0, var2Lifetime27);
          }
          var2Lifetime28 = wm.a("achievement_names,12", (byte) 61);
          if (var2Lifetime28 != null) {
            he.field_b[12] = va.a(0, var2Lifetime28);
          }
          var2Lifetime29 = wm.a("achievement_names,13", (byte) 84);
          if (var2Lifetime29 != null) {
            he.field_b[13] = va.a(0, var2Lifetime29);
          }
          if (!param0) {
            return;
          }
          var2Lifetime30 = wm.a("achievement_names,14", (byte) 122);
          if (null != var2Lifetime30) {
            he.field_b[14] = va.a(0, var2Lifetime30);
          }
          var2Lifetime31 = wm.a("achievement_names,15", (byte) 52);
          if (null != var2Lifetime31) {
            he.field_b[15] = va.a(0, var2Lifetime31);
          }
          var2Lifetime32 = wm.a("achievement_names,16", (byte) 94);
          if (var2Lifetime32 != null) {
            he.field_b[16] = va.a(0, var2Lifetime32);
          }
          var2Lifetime33 = wm.a("achievement_names,17", (byte) 91);
          if (null != var2Lifetime33) {
            he.field_b[17] = va.a(0, var2Lifetime33);
          }
          var2Lifetime34 = wm.a("achievement_names,18", (byte) 44);
          if (null != var2Lifetime34) {
            he.field_b[18] = va.a(0, var2Lifetime34);
          }
          var2Lifetime35 = wm.a("achievement_names,19", (byte) 47);
          if (var2Lifetime35 != null) {
            he.field_b[19] = va.a(0, var2Lifetime35);
          }
          var2Lifetime36 = wm.a("achievement_criteria,0", (byte) 70);
          if (var2Lifetime36 != null) {
            jf.field_c[0] = va.a(0, var2Lifetime36);
          }
          var2Lifetime37 = wm.a("achievement_criteria,1", (byte) 85);
          if (var2Lifetime37 != null) {
            jf.field_c[1] = va.a(0, var2Lifetime37);
          }
          var2Lifetime38 = wm.a("achievement_criteria,2", (byte) 110);
          if (null != var2Lifetime38) {
            jf.field_c[2] = va.a(0, var2Lifetime38);
          }
          var2Lifetime39 = wm.a("achievement_criteria,3", (byte) 34);
          if (var2Lifetime39 != null) {
            jf.field_c[3] = va.a(0, var2Lifetime39);
          }
          var2Lifetime40 = wm.a("achievement_criteria,4", (byte) 72);
          if (null != var2Lifetime40) {
            jf.field_c[4] = va.a(0, var2Lifetime40);
          }
          var2Lifetime41 = wm.a("achievement_criteria,5", (byte) 77);
          if (null != var2Lifetime41) {
            jf.field_c[5] = va.a(0, var2Lifetime41);
          }
          var2Lifetime42 = wm.a("achievement_criteria,6", (byte) 42);
          if (var2Lifetime42 != null) {
            jf.field_c[6] = va.a(0, var2Lifetime42);
          }
          var2Lifetime43 = wm.a("achievement_criteria,7", (byte) 36);
          if (var2Lifetime43 != null) {
            jf.field_c[7] = va.a(0, var2Lifetime43);
          }
          var2Lifetime44 = wm.a("achievement_criteria,8", (byte) 76);
          if (null != var2Lifetime44) {
            jf.field_c[8] = va.a(0, var2Lifetime44);
          }
          var2Lifetime45 = wm.a("achievement_criteria,9", (byte) 108);
          if (null != var2Lifetime45) {
            jf.field_c[9] = va.a(0, var2Lifetime45);
          }
          var2Lifetime46 = wm.a("achievement_criteria,10", (byte) 106);
          if (var2Lifetime46 != null) {
            jf.field_c[10] = va.a(0, var2Lifetime46);
          }
          var2Lifetime47 = wm.a("achievement_criteria,11", (byte) 114);
          if (null != var2Lifetime47) {
            jf.field_c[11] = va.a(0, var2Lifetime47);
          }
          var2Lifetime48 = wm.a("achievement_criteria,12", (byte) 62);
          if (null != var2Lifetime48) {
            jf.field_c[12] = va.a(0, var2Lifetime48);
          }
          var2Lifetime49 = wm.a("achievement_criteria,13", (byte) 59);
          if (null != var2Lifetime49) {
            jf.field_c[13] = va.a(0, var2Lifetime49);
          }
          var2Lifetime50 = wm.a("achievement_criteria,14", (byte) 53);
          if (var2Lifetime50 != null) {
            jf.field_c[14] = va.a(0, var2Lifetime50);
          }
          var2Lifetime51 = wm.a("achievement_criteria,15", (byte) 33);
          if (null != var2Lifetime51) {
            jf.field_c[15] = va.a(0, var2Lifetime51);
          }
          var2Lifetime52 = wm.a("achievement_criteria,16", (byte) 123);
          if (var2Lifetime52 != null) {
            jf.field_c[16] = va.a(0, var2Lifetime52);
          }
          var2Lifetime53 = wm.a("achievement_criteria,17", (byte) 57);
          if (null != var2Lifetime53) {
            jf.field_c[17] = va.a(0, var2Lifetime53);
          }
          var2Lifetime54 = wm.a("achievement_criteria,18", (byte) 111);
          if (null != var2Lifetime54) {
            jf.field_c[18] = va.a(0, var2Lifetime54);
          }
          var2Lifetime55 = wm.a("achievement_criteria,19", (byte) 47);
          if (var2Lifetime55 != null) {
            jf.field_c[19] = va.a(0, var2Lifetime55);
          }
          var2Lifetime56 = wm.a("clickToSkip", (byte) 83);
          if (var2Lifetime56 != null) {
            mn.field_c = va.a(0, var2Lifetime56);
          }
          var2Lifetime57 = wm.a("oneMetreToLevelN", (byte) 88);
          if (var2Lifetime57 != null) {
            ee.field_P = va.a(0, var2Lifetime57);
          }
          var2Lifetime58 = wm.a("nMetresToLevelN", (byte) 39);
          if (null != var2Lifetime58) {
            ve.field_d = va.a(0, var2Lifetime58);
          }
          var2Lifetime59 = wm.a("homingAlienShots", (byte) 101);
          if (null != var2Lifetime59) {
            ng.field_a = va.a(0, var2Lifetime59);
          }
          var2Lifetime60 = wm.a("gameOver", (byte) 100);
          if (null != var2Lifetime60) {
            qk.field_b = va.a(0, var2Lifetime60);
          }
          var2Lifetime61 = wm.a("shieldLost", (byte) 97);
          if (null != var2Lifetime61) {
            fg.field_nb = va.a(0, var2Lifetime61);
          }
          var2Lifetime62 = wm.a("confined", (byte) 83);
          if (var2Lifetime62 != null) {
            ca.field_q = va.a(0, var2Lifetime62);
          }
          var2Lifetime63 = wm.a("level", (byte) 120);
          if (var2Lifetime63 != null) {
            ll.field_c = va.a(0, var2Lifetime63);
          }
          var2Lifetime64 = wm.a("distance", (byte) 51);
          if (var2Lifetime64 != null) {
            jn.field_O = va.a(0, var2Lifetime64);
          }
          var2Lifetime65 = wm.a("score", (byte) 74);
          if (var2Lifetime65 != null) {
            hb.field_s = va.a(0, var2Lifetime65);
          }
          var2Lifetime66 = wm.a("pressEscForOptions", (byte) 82);
          if (null != var2Lifetime66) {
            hk.field_f = va.a(0, var2Lifetime66);
          }
          var2Lifetime67 = wm.a("devQuoteIanT", (byte) 53);
          if (null != var2Lifetime67) {
            ve.field_e = va.a(0, var2Lifetime67);
          }
          var2Lifetime68 = wm.a("collisionCourse", (byte) 74);
          if (null != var2Lifetime68) {
            di.field_f = va.a(0, var2Lifetime68);
          }
          var2Lifetime69 = wm.a("intro1_GoodMorning", (byte) 52);
          if (null != var2Lifetime69) {
            sb.field_e = va.a(0, var2Lifetime69);
          }
          var2Lifetime70 = wm.a("intro2_TheJourneyWentSmoothly", (byte) 114);
          if (null != var2Lifetime70) {
            cd.field_k = va.a(0, var2Lifetime70);
          }
          var2Lifetime71 = wm.a("intro3_TheAliensHaveAdvancedTechnology", (byte) 109);
          if (var2Lifetime71 != null) {
            eb.field_j = va.a(0, var2Lifetime71);
          }
          var2Lifetime72 = wm.a("intro4_IfWeCouldGetWeCouldBecome", (byte) 121);
          if (var2Lifetime72 != null) {
            m.field_h = va.a(0, var2Lifetime72);
          }
          var2Lifetime73 = wm.a("intro5_OthersHaveTriedAndFailed", (byte) 69);
          if (null != var2Lifetime73) {
            sa.field_W = va.a(0, var2Lifetime73);
          }
          var2Lifetime74 = wm.a("intro6_FlyYourShipInConfined", (byte) 32);
          if (var2Lifetime74 != null) {
            ke.field_L = va.a(0, var2Lifetime74);
          }
          var2Lifetime75 = wm.a("intro7_ShieldDescription1", (byte) 66);
          if (null != var2Lifetime75) {
            vf.field_t = va.a(0, var2Lifetime75);
          }
          var2Lifetime76 = wm.a("intro7_ShieldDescription2", (byte) 108);
          if (null != var2Lifetime76) {
            uh.field_a = va.a(0, var2Lifetime76);
          }
          var2Lifetime77 = wm.a("intro8_ShieldMeters", (byte) 51);
          if (var2Lifetime77 != null) {
            qa.field_b = va.a(0, var2Lifetime77);
          }
          var2Lifetime78 = wm.a("intro9_RapidFireDescription", (byte) 40);
          if (var2Lifetime78 != null) {
            oh.field_e = va.a(0, var2Lifetime78);
          }
          var2Lifetime79 = wm.a("intro10_SpreadFireDescription", (byte) 127);
          if (null != var2Lifetime79) {
            mg.field_h = va.a(0, var2Lifetime79);
          }
          var2Lifetime80 = wm.a("intro11_ReadyEnergyMeter", (byte) 104);
          if (var2Lifetime80 != null) {
            li.field_e = va.a(0, var2Lifetime80);
          }
          var2Lifetime81 = wm.a("intro12_MissileDescription", (byte) 97);
          if (var2Lifetime81 != null) {
            al.field_b = va.a(0, var2Lifetime81);
          }
          var2Lifetime82 = wm.a("missile", (byte) 39);
          if (null != var2Lifetime82) {
            mh.field_a = va.a(0, var2Lifetime82);
          }
          var2Lifetime83 = wm.a("intro13_ChargeCannon1", (byte) 78);
          if (var2Lifetime83 != null) {
            sc.field_e = va.a(0, var2Lifetime83);
          }
          var2Lifetime84 = wm.a("intro13_ChargeCannon2", (byte) 88);
          if (null != var2Lifetime84) {
            tj.field_E = va.a(0, var2Lifetime84);
          }
          var2Lifetime85 = wm.a("intro14_ThisIsTheExtentOfOurKnowledge", (byte) 127);
          if (var2Lifetime85 != null) {
            cg.field_b = va.a(0, var2Lifetime85);
          }
          var2Lifetime86 = wm.a("intro15_GoodLuck", (byte) 87);
          if (null != var2Lifetime86) {
            rb.field_i = va.a(0, var2Lifetime86);
          }
          var2Lifetime87 = wm.a("ending1_SettingCourseForEarth", (byte) 51);
          if (var2Lifetime87 != null) {
            rk.field_b = va.a(0, var2Lifetime87);
          }
          var2Lifetime88 = wm.a("ending2_Congratulations", (byte) 39);
          if (var2Lifetime88 != null) {
            qh.field_z = va.a(0, var2Lifetime88);
          }
          var2Lifetime89 = wm.a("ending3_OwingToYourHeroism", (byte) 93);
          if (null != var2Lifetime89) {
            oe.field_S = va.a(0, var2Lifetime89);
          }
          var2Lifetime90 = wm.a("ending4_ThankYouForPlaying", (byte) 54);
          if (var2Lifetime90 != null) {
            li.field_f = va.a(0, var2Lifetime90);
          }
          var2Lifetime91 = wm.a("tryTheArrowKeys", (byte) 107);
          if (var2Lifetime91 != null) {
            vd.field_l = va.a(0, var2Lifetime91);
          }
          var2Lifetime92 = wm.a("ctrl", (byte) 63);
          if (var2Lifetime92 != null) {
            si.field_a = va.a(0, var2Lifetime92);
          }
          var2Lifetime93 = wm.a("startingControls", (byte) 119);
          if (null != var2Lifetime93) {
            fh.field_e = va.a(0, var2Lifetime93);
          }
          var2Lifetime94 = wm.a("upgradeControls", (byte) 43);
          if (null != var2Lifetime94) {
            da.field_a = va.a(0, var2Lifetime94);
          }
          var2Lifetime95 = wm.a("missiles", (byte) 83);
          if (var2Lifetime95 != null) {
            ci.field_d = va.a(0, var2Lifetime95);
          }
          var2Lifetime96 = wm.a("specialEnergyWeapons", (byte) 33);
          if (null != var2Lifetime96) {
            lf.field_h = va.a(0, var2Lifetime96);
          }
          var2Lifetime97 = wm.a("basicEnergyWeapon", (byte) 71);
          if (null != var2Lifetime97) {
            pn.field_b = va.a(0, var2Lifetime97);
          }
          var2Lifetime98 = wm.a("holdCtrlToFire", (byte) 82);
          if (null != var2Lifetime98) {
            pf.field_i = va.a(0, var2Lifetime98);
          }
          var2Lifetime99 = wm.a("arrowKeys1", (byte) 86);
          if (var2Lifetime99 != null) {
            ba.field_T = va.a(0, var2Lifetime99);
          }
          var2Lifetime100 = wm.a("arrowKeys2", (byte) 127);
          if (var2Lifetime100 != null) {
            ue.field_s = va.a(0, var2Lifetime100);
          }
          var2Lifetime101 = wm.a("arrowKeys3", (byte) 63);
          if (null != var2Lifetime101) {
            q.field_k = va.a(0, var2Lifetime101);
          }
          var2Lifetime102 = wm.a("useKeyboardForUpgrades", (byte) 113);
          if (null != var2Lifetime102) {
            ol.field_b = va.a(0, var2Lifetime102);
          }
          var2Lifetime103 = wm.a("mouseSteering", (byte) 45);
          if (var2Lifetime103 != null) {
            eg.field_m = va.a(0, var2Lifetime103);
          }
          var2Lifetime104 = wm.a("clickAndHoldToFire", (byte) 97);
          if (var2Lifetime104 != null) {
            qj.field_a = va.a(0, var2Lifetime104);
          }
          var2Lifetime105 = wm.a("ctrlAlsoStillWorks", (byte) 41);
          if (null != var2Lifetime105) {
            u.field_U = va.a(0, var2Lifetime105);
          }
          var2Lifetime106 = wm.a("pressArrowsToReturnToKeyboardControl", (byte) 66);
          if (null != var2Lifetime106) {
            sg.field_u = va.a(0, var2Lifetime106);
          }
          var2Lifetime107 = wm.a("instructions_ShieldMeter", (byte) 45);
          if (var2Lifetime107 != null) {
            hm.field_ib = va.a(0, var2Lifetime107);
          }
          var2Lifetime108 = wm.a("instructions_BossMeter", (byte) 28);
          if (var2Lifetime108 != null) {
            oj.field_z = va.a(0, var2Lifetime108);
          }
          var2Lifetime109 = wm.a("instructions_ReadyEnergyMeter", (byte) 88);
          if (var2Lifetime109 != null) {
            rj.field_d = va.a(0, var2Lifetime109);
          }
          var2Lifetime110 = wm.a("instructions_LivesIndicator", (byte) 31);
          if (var2Lifetime110 != null) {
            ug.field_Z = va.a(0, var2Lifetime110);
          }
          var2Lifetime111 = wm.a("lookOutForExtraLives", (byte) 73);
          if (var2Lifetime111 != null) {
            b.field_j = va.a(0, var2Lifetime111);
          }
          var2Lifetime112 = wm.a("instructions_RapidFire", (byte) 43);
          if (var2Lifetime112 != null) {
            wm.field_fb = va.a(0, var2Lifetime112);
          }
          var2Lifetime113 = wm.a("instructions_SpreadFire", (byte) 35);
          if (null != var2Lifetime113) {
            a.field_a = va.a(0, var2Lifetime113);
          }
          var2Lifetime114 = wm.a("instructions_ShieldPowerUp", (byte) 116);
          if (var2Lifetime114 != null) {
            mb.field_H = va.a(0, var2Lifetime114);
          }
          var2Lifetime115 = wm.a("instructions_ConcussionMissiles", (byte) 66);
          if (var2Lifetime115 != null) {
            uh.field_d = va.a(0, var2Lifetime115);
          }
          var2Lifetime116 = wm.a("instructions_ChargeCannon", (byte) 123);
          if (var2Lifetime116 != null) {
            rf.field_b = va.a(0, var2Lifetime116);
          }
          var2Lifetime117 = wm.a("instructions_HomingMissiles", (byte) 76);
          if (var2Lifetime117 != null) {
            ee.field_J = va.a(0, var2Lifetime117);
          }
          var2Lifetime118 = wm.a("instructions_WingPods", (byte) 123);
          if (var2Lifetime118 != null) {
            nd.field_u = va.a(0, var2Lifetime118);
          }
          var2Lifetime119 = wm.a("instructions_NuclearMissiles", (byte) 60);
          if (null != var2Lifetime119) {
            kn.field_a = va.a(0, var2Lifetime119);
          }
          var2Lifetime120 = wm.a("instructions_ClusterMissiles", (byte) 69);
          if (var2Lifetime120 != null) {
            mm.field_fb = va.a(0, var2Lifetime120);
          }
          var2Lifetime121 = wm.a("instructions_DisruptionCannon", (byte) 98);
          if (var2Lifetime121 != null) {
            pk.field_f = va.a(0, var2Lifetime121);
          }
          var2Lifetime122 = wm.a("instructions_ExtraLife", (byte) 85);
          if (var2Lifetime122 != null) {
            rd.field_Ib = va.a(0, var2Lifetime122);
          }
          var2Lifetime123 = wm.a("instructions_Mine", (byte) 118);
          if (var2Lifetime123 != null) {
            di.field_b = va.a(0, var2Lifetime123);
          }
          var2Lifetime124 = wm.a("instructions_Lasers", (byte) 65);
          if (var2Lifetime124 != null) {
            qm.field_A = va.a(0, var2Lifetime124);
          }
          var2Lifetime125 = wm.a("instructions_PowerShots", (byte) 40);
          if (var2Lifetime125 != null) {
            kd.field_q = va.a(0, var2Lifetime125);
          }
          var2Lifetime126 = wm.a("instructions_Cloak", (byte) 104);
          if (var2Lifetime126 != null) {
            bf.field_S = va.a(0, var2Lifetime126);
          }
          var2Lifetime127 = wm.a("instructions_ClusterMine", (byte) 124);
          if (var2Lifetime127 != null) {
            te.field_g = va.a(0, var2Lifetime127);
          }
          var2Lifetime128 = wm.a("instructions_LightningCannon", (byte) 94);
          if (var2Lifetime128 != null) {
            on.field_b = va.a(0, var2Lifetime128);
          }
          var2Lifetime129 = wm.a("instructions_PowerUpAttractor", (byte) 115);
          if (var2Lifetime129 != null) {
            di.field_e = va.a(0, var2Lifetime129);
          }
          var2Lifetime130 = wm.a("instructions_Invincibility", (byte) 45);
          if (null != var2Lifetime130) {
            fj.field_D = va.a(0, var2Lifetime130);
          }
          var2Lifetime131 = wm.a("instructions_HomingEnergyWeapons", (byte) 51);
          if (var2Lifetime131 != null) {
            vj.field_b = va.a(0, var2Lifetime131);
          }
          var2Lifetime132 = wm.a("powerUpsAwardedForScore", (byte) 105);
          if (null != var2Lifetime132) {
            ve.field_c = va.a(0, var2Lifetime132);
          }
          var2Lifetime133 = wm.a("extraLives", (byte) 81);
          if (null != var2Lifetime133) {
            tj.field_F = va.a(0, var2Lifetime133);
          }
          var2Lifetime134 = wm.a("dataSheet_PowerUpAttractor", (byte) 75);
          if (null != var2Lifetime134) {
            aj.field_b = va.a(0, var2Lifetime134);
          }
          var2Lifetime135 = wm.a("dataSheet_NuclearMissiles", (byte) 77);
          if (null != var2Lifetime135) {
            af.field_bb = va.a(0, var2Lifetime135);
          }
          var2Lifetime136 = wm.a("dataSheet_OtherMissiles", (byte) 71);
          if (null != var2Lifetime136) {
            bk.field_i = va.a(0, var2Lifetime136);
          }
          var2Lifetime137 = wm.a("dataSheet_Shield", (byte) 94);
          if (null != var2Lifetime137) {
            ae.field_c = va.a(0, var2Lifetime137);
          }
          var2Lifetime138 = wm.a("dataSheet_EnergyWeapons", (byte) 112);
          if (var2Lifetime138 != null) {
            qi.field_d = va.a(0, var2Lifetime138);
          }
          var2Lifetime139 = wm.a("dataSheet_WingPods", (byte) 82);
          if (null != var2Lifetime139) {
            hm.field_rb = va.a(0, var2Lifetime139);
          }
          var2Lifetime140 = wm.a("youDropPowerUpsIfYouDie", (byte) 118);
          if (var2Lifetime140 != null) {
            lk.field_c = va.a(0, var2Lifetime140);
          }
          var2Lifetime141 = wm.a("thisPageWillBeUnlockedOnAchievement", (byte) 82);
          if (null != var2Lifetime141) {
            hl.field_b = va.a(0, var2Lifetime141);
          }
          var2Lifetime142 = wm.a("difficultyNormal", (byte) 56);
          if (var2Lifetime142 != null) {
            uc.field_Z = va.a(0, var2Lifetime142);
          }
          var2Lifetime143 = wm.a("difficultyHard", (byte) 107);
          if (var2Lifetime143 != null) {
            sj.field_pb = va.a(0, var2Lifetime143);
          }
          var2Lifetime144 = wm.a("viewInternal", (byte) 105);
          if (null != var2Lifetime144) {
            pc.field_k = va.a(0, var2Lifetime144);
          }
          var2Lifetime145 = wm.a("viewExternal", (byte) 92);
          if (null != var2Lifetime145) {
            ie.field_c = va.a(0, var2Lifetime145);
          }
          var2Lifetime146 = wm.a("brightnessColon", (byte) 115);
          if (null != var2Lifetime146) {
            pm.field_u = va.a(0, var2Lifetime146);
          }
          var2Lifetime147 = wm.a("difficultyColon", (byte) 65);
          if (null != var2Lifetime147) {
            ef.field_ub = va.a(0, var2Lifetime147);
          }
          var2Lifetime148 = wm.a("viewModeColon", (byte) 70);
          if (null != var2Lifetime148) {
            qa.field_e = va.a(0, var2Lifetime148);
          }
          var2Lifetime149 = wm.a("swapUpDownColon", (byte) 94);
          if (null != var2Lifetime149) {
            cc.field_p = va.a(0, var2Lifetime149);
          }
          var2Lifetime150 = wm.a("devQuoteMiniboss", (byte) 119);
          if (var2Lifetime150 != null) {
            lk.field_a = va.a(0, var2Lifetime150);
          }
          var2Lifetime151 = wm.a("normalDifficulty", (byte) 113);
          if (null != var2Lifetime151) {
            ca.field_s = va.a(0, var2Lifetime151);
          }
          var2Lifetime152 = wm.a("hardDifficulty", (byte) 124);
          if (var2Lifetime152 != null) {
            kk.field_a = va.a(0, var2Lifetime152);
          }
          var2Lifetime153 = wm.a("rapidFire", (byte) 29);
          if (null != var2Lifetime153) {
            kd.field_s = va.a(0, var2Lifetime153);
          }
          var2Lifetime154 = wm.a("youAlreadyHaveRapidFire", (byte) 93);
          if (null != var2Lifetime154) {
            hj.field_i = va.a(0, var2Lifetime154);
          }
          var2Lifetime155 = wm.a("spreadFire", (byte) 58);
          if (null != var2Lifetime155) {
            ii.field_i = va.a(0, var2Lifetime155);
          }
          var2Lifetime156 = wm.a("youAlreadyHaveSpreadFire", (byte) 31);
          if (null != var2Lifetime156) {
            ae.field_e = va.a(0, var2Lifetime156);
          }
          var2Lifetime157 = wm.a("lasers", (byte) 95);
          if (null != var2Lifetime157) {
            mg.field_c = va.a(0, var2Lifetime157);
          }
          var2Lifetime158 = wm.a("howToFireLasers", (byte) 66);
          if (null != var2Lifetime158) {
            tn.field_D = va.a(0, var2Lifetime158);
          }
          var2Lifetime159 = wm.a("youAlreadyHaveLasers", (byte) 75);
          if (null != var2Lifetime159) {
            rh.field_db = va.a(0, var2Lifetime159);
          }
          var2Lifetime160 = wm.a("chargeCannon", (byte) 104);
          if (var2Lifetime160 != null) {
            ah.field_Z = va.a(0, var2Lifetime160);
          }
          var2Lifetime161 = wm.a("howToFireChargeCannon", (byte) 30);
          if (var2Lifetime161 != null) {
            ck.field_b = va.a(0, var2Lifetime161);
          }
          var2Lifetime162 = wm.a("youAlreadyHaveChargeCannon", (byte) 50);
          if (null != var2Lifetime162) {
            qf.field_b = va.a(0, var2Lifetime162);
          }
          var2Lifetime163 = wm.a("disruptionCannon", (byte) 86);
          if (var2Lifetime163 != null) {
            fa.field_T = va.a(0, var2Lifetime163);
          }
          var2Lifetime164 = wm.a("howToFireDisruptionCannon", (byte) 48);
          if (var2Lifetime164 != null) {
            ld.field_b = va.a(0, var2Lifetime164);
          }
          var2Lifetime165 = wm.a("youAlreadyHaveDisruptionCannon", (byte) 99);
          if (var2Lifetime165 != null) {
            vg.field_Q = va.a(0, var2Lifetime165);
          }
          var2Lifetime166 = wm.a("lightningCannon", (byte) 126);
          if (var2Lifetime166 != null) {
            wi.field_b = va.a(0, var2Lifetime166);
          }
          var2Lifetime167 = wm.a("howToFireLightningCannon", (byte) 49);
          if (null != var2Lifetime167) {
            vg.field_K = va.a(0, var2Lifetime167);
          }
          var2Lifetime168 = wm.a("youAlreadyHaveLightningCannon", (byte) 103);
          if (null != var2Lifetime168) {
            f.field_b = va.a(0, var2Lifetime168);
          }
          var2Lifetime169 = wm.a("wingPod", (byte) 124);
          if (null != var2Lifetime169) {
            gb.field_b = va.a(0, var2Lifetime169);
          }
          var2Lifetime170 = wm.a("youAlreadyHaveFiveWingPods", (byte) 36);
          if (var2Lifetime170 != null) {
            dn.field_a = va.a(0, var2Lifetime170);
          }
          var2Lifetime171 = wm.a("powerShots", (byte) 76);
          if (var2Lifetime171 != null) {
            wd.field_e = va.a(0, var2Lifetime171);
          }
          var2Lifetime172 = wm.a("homingEnergyWeapons", (byte) 92);
          if (var2Lifetime172 != null) {
            ne.field_a = va.a(0, var2Lifetime172);
          }
          var2Lifetime173 = wm.a("nConcussionMissiles", (byte) 102);
          if (null != var2Lifetime173) {
            ah.field_R = va.a(0, var2Lifetime173);
          }
          var2Lifetime174 = wm.a("howToFireConcussionMissiles", (byte) 114);
          if (null != var2Lifetime174) {
            dc.field_M = va.a(0, var2Lifetime174);
          }
          var2Lifetime175 = wm.a("oneConcussionMissile", (byte) 126);
          if (var2Lifetime175 != null) {
            ek.field_e = va.a(0, var2Lifetime175);
          }
          var2Lifetime176 = wm.a("youAlreadyHave20ConcussionMissiles", (byte) 40);
          if (null != var2Lifetime176) {
            rn.field_b = va.a(0, var2Lifetime176);
          }
          var2Lifetime177 = wm.a("nHomingMissiles", (byte) 39);
          if (null != var2Lifetime177) {
            hf.field_X = va.a(0, var2Lifetime177);
          }
          var2Lifetime178 = wm.a("howToFireHomingMissiles", (byte) 28);
          if (var2Lifetime178 != null) {
            tm.field_e = va.a(0, var2Lifetime178);
          }
          var2Lifetime179 = wm.a("oneHomingMissile", (byte) 52);
          if (null != var2Lifetime179) {
            md.field_b = va.a(0, var2Lifetime179);
          }
          var2Lifetime180 = wm.a("youAlreadyHave20HomingMissiles", (byte) 55);
          if (var2Lifetime180 != null) {
            sc.field_j = va.a(0, var2Lifetime180);
          }
          var2Lifetime181 = wm.a("nClusterMissiles", (byte) 127);
          if (var2Lifetime181 != null) {
            kn.field_b = va.a(0, var2Lifetime181);
          }
          var2Lifetime182 = wm.a("howToFireClusterMissiles", (byte) 61);
          if (null != var2Lifetime182) {
            jh.field_U = va.a(0, var2Lifetime182);
          }
          var2Lifetime183 = wm.a("oneClusterMissile", (byte) 62);
          if (var2Lifetime183 != null) {
            wh.field_ab = va.a(0, var2Lifetime183);
          }
          var2Lifetime184 = wm.a("youAlreadyHave10ClusterMissiles", (byte) 126);
          if (var2Lifetime184 != null) {
            ke.field_ab = va.a(0, var2Lifetime184);
          }
          var2Lifetime185 = wm.a("oneNuclearMissile", (byte) 76);
          if (null != var2Lifetime185) {
            ah.field_W = va.a(0, var2Lifetime185);
          }
          var2Lifetime186 = wm.a("howToFireNuclearMissiles", (byte) 37);
          if (null != var2Lifetime186) {
            ae.field_b = va.a(0, var2Lifetime186);
          }
          var2Lifetime187 = wm.a("youAlreadyHave4NuclearMissiles", (byte) 56);
          if (null != var2Lifetime187) {
            gi.field_hb = va.a(0, var2Lifetime187);
          }
          var2Lifetime188 = wm.a("shield", (byte) 115);
          if (null != var2Lifetime188) {
            dj.field_Ib = va.a(0, var2Lifetime188);
          }
          var2Lifetime189 = wm.a("shieldUpgrade", (byte) 103);
          if (var2Lifetime189 != null) {
            vm.field_ab = va.a(0, var2Lifetime189);
          }
          var2Lifetime190 = wm.a("shieldRestored", (byte) 79);
          if (null != var2Lifetime190) {
            pi.field_P = va.a(0, var2Lifetime190);
          }
          var2Lifetime191 = wm.a("invincibility", (byte) 53);
          if (null != var2Lifetime191) {
            km.field_a = va.a(0, var2Lifetime191);
          }
          var2Lifetime192 = wm.a("cloak", (byte) 102);
          if (null != var2Lifetime192) {
            na.field_Q = va.a(0, var2Lifetime192);
          }
          var2Lifetime193 = wm.a("powerUpAttractor", (byte) 104);
          if (null != var2Lifetime193) {
            dj.field_W = va.a(0, var2Lifetime193);
          }
          var2Lifetime194 = wm.a("nextPowerUpAttractor_LevelN", (byte) 98);
          if (null != var2Lifetime194) {
            oe.field_X = va.a(0, var2Lifetime194);
          }
          var2Lifetime195 = wm.a("extraLife", (byte) 98);
          if (null != var2Lifetime195) {
            q.field_n = va.a(0, var2Lifetime195);
          }
          var2Lifetime196 = wm.a("wingPodLost", (byte) 84);
          if (null != var2Lifetime196) {
            db.field_u = va.a(0, var2Lifetime196);
          }
          var2Lifetime197 = wm.a("logInAsMemberToPlay", (byte) 125);
          if (null != var2Lifetime197) {
            va.a(0, var2Lifetime197);
          }
          mn.field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_698_0 = var2_ref;
          stackIn_698_1 = new StringBuilder().append("c.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_699_2 = "null";
          } else {
            stackIn_699_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_698_0), ((StringBuilder) (Object) stackIn_698_1).append(stackIn_699_2).append(')').toString());
        }
    }

    public c() {
    }

    static {
        field_s = new rf();
        field_t = -1;
    }
}
