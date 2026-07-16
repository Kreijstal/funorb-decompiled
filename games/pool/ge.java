/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ge extends ma {
    static String field_o;
    static String field_n;
    static jg field_q;
    static String field_m;
    static int[] field_p;
    static String field_r;
    static le field_u;
    int field_v;
    static vh field_s;
    static String field_w;
    static String field_x;
    byte[] field_t;
    static int field_l;

    final void a(int param0, byte param1, byte[] param2, int param3) {
        int var5 = 0;
        if (param1 > -113) {
            return;
        }
        for (var5 = param0; var5 < param0 - -param3; var5++) {
            int fieldTemp$0 = ((ge) this).field_v;
            ((ge) this).field_v = ((ge) this).field_v + 1;
            param2[var5] = ((ge) this).field_t[fieldTemp$0];
        }
    }

    final int f(int param0) {
        if (param0 <= 43) {
            int discarded$0 = ((ge) this).l(-98);
        }
        ((ge) this).field_v = ((ge) this).field_v + 3;
        return (((ge) this).field_t[((ge) this).field_v + -1] & 255) + ((((ge) this).field_t[((ge) this).field_v + -3] << 1573598160 & 16711680) - -((255 & ((ge) this).field_t[-2 + ((ge) this).field_v]) << -2002738872));
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        if (param1 != 0) {
            field_n = null;
        }
        for (var5 = param2; var5 < param3 + param2; var5++) {
            int fieldTemp$0 = ((ge) this).field_v;
            ((ge) this).field_v = ((ge) this).field_v + 1;
            ((ge) this).field_t[fieldTemp$0] = param0[var5];
        }
    }

    final boolean a(boolean param0) {
        ((ge) this).field_v = ((ge) this).field_v - 4;
        if (param0) {
            boolean discarded$0 = ((ge) this).a(true);
        }
        int var2 = oa.a(0, ((ge) this).field_v, -1, ((ge) this).field_t);
        int var3 = ((ge) this).b(true);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final int i(int param0) {
        if (param0 >= -2) {
            return 77;
        }
        int var2 = ((ge) this).field_t[((ge) this).field_v] & 255;
        if (-129 < (var2 ^ -1)) {
            return -64 + ((ge) this).g(-60);
        }
        return ((ge) this).d(-1034) - 49152;
    }

    final String m(int param0) {
        if (((ge) this).field_t[((ge) this).field_v] == 0) {
            ((ge) this).field_v = ((ge) this).field_v + 1;
            return null;
        }
        if (param0 < 106) {
            ((ge) this).a((byte) -12, -102);
        }
        return ((ge) this).j(-112);
    }

    final int l(int param0) {
        ((ge) this).field_v = ((ge) this).field_v + 3;
        int var2 = (65280 & ((ge) this).field_t[-2 + ((ge) this).field_v] << -2118263256) + (((255 & ((ge) this).field_t[-3 + ((ge) this).field_v]) << 167900880) + (((ge) this).field_t[((ge) this).field_v - 1] & 255));
        if (-8388608 > (var2 ^ -1)) {
            var2 = var2 - 16777216;
        }
        if (param0 != 0) {
            return 110;
        }
        return var2;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte)(int)(param0 >> 445149112);
        int fieldTemp$1 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$1] = (byte)(int)(param0 >> 925271152);
        if (param1 >= -75) {
            return;
        }
        int fieldTemp$2 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$2] = (byte)(int)(param0 >> 1627194088);
        int fieldTemp$3 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$3] = (byte)(int)(param0 >> 366413984);
        int fieldTemp$4 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$4] = (byte)(int)(param0 >> -1866229224);
        int fieldTemp$5 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$5] = (byte)(int)(param0 >> -1589086768);
        int fieldTemp$6 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$6] = (byte)(int)(param0 >> -2010928376);
        int fieldTemp$7 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$7] = (byte)(int)param0;
    }

    private final void a(long param0, int param1) {
        int var4 = 122 % ((30 - param1) / 51);
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte)(int)(param0 >> 1187552944);
        int fieldTemp$1 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$1] = (byte)(int)(param0 >> -1535475096);
        int fieldTemp$2 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$2] = (byte)(int)(param0 >> -1173962080);
        int fieldTemp$3 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$3] = (byte)(int)(param0 >> 2079688408);
        int fieldTemp$4 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$4] = (byte)(int)(param0 >> 1793009616);
        int fieldTemp$5 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$5] = (byte)(int)(param0 >> -1077156344);
        int fieldTemp$6 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$6] = (byte)(int)param0;
    }

    final int g(int param0) {
        if (param0 >= -59) {
            int discarded$0 = ((ge) this).g(-3);
        }
        int fieldTemp$1 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        return 255 & ((ge) this).field_t[fieldTemp$1];
    }

    final int c(byte param0) {
        if (param0 != -115) {
            Object var3 = null;
            ((ge) this).a((String) null, 68);
        }
        int var2 = ((ge) this).field_t[((ge) this).field_v] & 255;
        if (-129 < (var2 ^ -1)) {
            return ((ge) this).g(-82);
        }
        return ((ge) this).d(-1034) + -32768;
    }

    final void a(String param0, int param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var3 = 0L;
        var5 = 0L;
        if (param1 >= 77) {
          var7 = param0.length();
          var8 = 19;
          L0: while (true) {
            if (0 > var8) {
              this.a(var3, -47);
              this.a(var5, 109);
              return;
            } else {
              L1: {
                var3 = var3 * 38L;
                if (var7 > var8) {
                  L2: {
                    L3: {
                      var9 = param0.charAt(var8);
                      if (65 > var9) {
                        break L3;
                      } else {
                        if (var9 <= 90) {
                          var3 = var3 + (long)(2 + (var9 + -65));
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (97 > var9) {
                        break L4;
                      } else {
                        if (var9 > 122) {
                          break L4;
                        } else {
                          var3 = var3 + (long)(-97 + var9 + 2);
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var3 = var3 + (long)(28 + (var9 - 48));
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 = var3 + 1L;
                    break L2;
                  }
                  if (var8 == 10) {
                    break L1;
                  } else {
                    var8--;
                    continue L0;
                  }
                } else {
                  if (var8 == 10) {
                    break L1;
                  } else {
                    var8--;
                    continue L0;
                  }
                }
              }
              var5 = var3;
              var3 = 0L;
              var8--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (param0 != 32052) {
            Object var10 = null;
            ((ge) this).a((String) null, 85);
        }
        int var3 = ((ge) this).field_v / 8;
        ((ge) this).field_v = 0;
        for (var4 = 0; var4 < var3; var4++) {
            var5 = ((ge) this).b(true);
            var6 = ((ge) this).b(true);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                int incrementValue$0 = var9;
                var9--;
                if ((incrementValue$0 ^ -1) >= -1) {
                    break;
                }
                var5 = var5 + (var7 + param1[3 & var7] ^ var6 + (var6 >>> -1810491163 ^ var6 << -1461911068));
                var7 = var7 + var8;
                var6 = var6 + (var7 + param1[(6753 & var7) >>> 716469259] ^ var5 + (var5 >>> -800313339 ^ var5 << -307741532));
            }
            ((ge) this).field_v = ((ge) this).field_v - 8;
            ((ge) this).a(true, var5);
            ((ge) this).a(true, var6);
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte)(param0 >> 1606445616);
        if (param1 <= 37) {
            ((ge) this).field_v = 87;
        }
        int fieldTemp$1 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$1] = (byte)(param0 >> -528716216);
        int fieldTemp$2 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$2] = (byte)param0;
    }

    final int k(int param0) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        int var2 = ((ge) this).field_t[fieldTemp$0];
        int var4 = 22 % ((param0 - 0) / 63);
        int var3 = 0;
        while (-1 < (var2 ^ -1)) {
            var3 = (var3 | var2 & 127) << -125198233;
            int fieldTemp$1 = ((ge) this).field_v;
            ((ge) this).field_v = ((ge) this).field_v + 1;
            var2 = ((ge) this).field_t[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte)(param1 >> 1786401048);
        int fieldTemp$1 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$1] = (byte)(param1 >> -375994736);
        if (!param0) {
            return;
        }
        int fieldTemp$2 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$2] = (byte)(param1 >> -760051640);
        int fieldTemp$3 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$3] = (byte)param1;
    }

    public static void e(int param0) {
        if (param0 != 4109) {
            field_m = null;
        }
        field_o = null;
        field_m = null;
        field_s = null;
        field_r = null;
        field_n = null;
        field_u = null;
        field_x = null;
        field_p = null;
        field_q = null;
        field_w = null;
    }

    final int b(boolean param0) {
        ((ge) this).field_v = ((ge) this).field_v + 4;
        if (!param0) {
            return 15;
        }
        return (255 & ((ge) this).field_t[((ge) this).field_v - 1]) + (65280 & ((ge) this).field_t[-2 + ((ge) this).field_v] << -1124121144) + (((ge) this).field_t[-4 + ((ge) this).field_v] << 357384600 & -16777216) + (16711680 & ((ge) this).field_t[-3 + ((ge) this).field_v] << 416428176);
    }

    final void a(int param0, byte param1) {
        ((ge) this).field_t[-4 + (((ge) this).field_v + -param0)] = (byte)(param0 >> 849471608);
        ((ge) this).field_t[((ge) this).field_v - param0 - 3] = (byte)(param0 >> -92103664);
        if (param1 > -90) {
            Object var4 = null;
            ((ge) this).a(125, -118, (int[]) null, -41);
        }
        ((ge) this).field_t[-2 + (-param0 + ((ge) this).field_v)] = (byte)(param0 >> -612497144);
        ((ge) this).field_t[-param0 + ((ge) this).field_v - 1] = (byte)param0;
    }

    final void a(int param0, int param1) {
        if (param1 != -32768) {
            return;
        }
        if ((param0 & -128) != 0) {
            if (!(0 == (-16384 & param0))) {
                if ((-2097152 & param0) != -1) {
                    if (!(-1 == (param0 & -268435456))) {
                        ((ge) this).a(param0 >>> 1794573564 | 128, false);
                    }
                    ((ge) this).a(128 | param0 >>> 1725818645, false);
                }
                ((ge) this).a(128 | param0 >>> 208328078, false);
            }
            ((ge) this).a(param0 >>> 1508300519 | 128, false);
        }
        ((ge) this).a(param0 & 127, false);
    }

    final int d(int param0, int param1) {
        int var3 = oa.a(param1, ((ge) this).field_v, param0, ((ge) this).field_t);
        ((ge) this).a(true, var3);
        return var3;
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte)(param1 >> 421411976);
        int fieldTemp$1 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$1] = (byte)param1;
        if (param0 != -81) {
            Object var4 = null;
            ((ge) this).a(false, (String) null);
        }
    }

    final long h(int param0) {
        long var2 = 4294967295L & (long)((ge) this).b(true);
        if (param0 != -412303328) {
            field_s = null;
        }
        long var4 = (long)((ge) this).b(true) & 4294967295L;
        return (var2 << -412303328) + var4;
    }

    final void b(int param0, byte param1) {
        if (param1 != -8) {
            return;
        }
        while (param0 > ((ge) this).field_v) {
            int fieldTemp$0 = ((ge) this).field_v;
            ((ge) this).field_v = ((ge) this).field_v + 1;
            ((ge) this).field_t[fieldTemp$0] = (byte) 0;
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4 = ((ge) this).field_v;
        ((ge) this).field_v = 0;
        byte[] var5 = new byte[var4];
        ((ge) this).a(0, (byte) -128, var5, var4);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param2);
        byte[] var8 = var7.toByteArray();
        ((ge) this).field_v = 0;
        if (param1 <= 39) {
            Object var9 = null;
            ((ge) this).a(true, (String) null);
        }
        ((ge) this).a((byte) -81, var8.length);
        ((ge) this).a(var8, (byte) 0, 0, var8.length);
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte)param0;
        if (param1) {
            int discarded$1 = ((ge) this).c(-68);
        }
    }

    final int d(byte param0) {
        ((ge) this).field_v = ((ge) this).field_v + 2;
        int var2 = (((ge) this).field_t[-1 + ((ge) this).field_v] & 255) + ((((ge) this).field_t[((ge) this).field_v + -2] & 255) << 1433810280);
        if (32767 < var2) {
            var2 = var2 - 65536;
        }
        if (param0 > -76) {
            int discarded$0 = ((ge) this).b(true);
        }
        return var2;
    }

    final String j(int param0) {
        if (param0 >= -10) {
            return null;
        }
        int var2 = ((ge) this).field_v;
        while (true) {
            int fieldTemp$0 = ((ge) this).field_v;
            ((ge) this).field_v = ((ge) this).field_v + 1;
            if (((ge) this).field_t[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = -var2 + ((ge) this).field_v - 1;
        if (0 == var3) {
            return "";
        }
        return tl.a(var3, -7510, ((ge) this).field_t, var2);
    }

    final static void a(float[] param0, int[] param1, int[] param2, float[] param3, int[] param4, int[] param5, int[] param6, byte param7, int[] param8) {
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        var9 = (float)param4[0];
        var10 = (float)param6[0];
        var11 = (float)param1[0];
        var12 = (float)param4[1] - var9;
        var13 = -var10 + (float)param6[1];
        var14 = (float)param1[1] - var11;
        var15 = -var9 + (float)param4[2];
        var16 = -var10 + (float)param6[2];
        var17 = (float)param1[2] - var11;
        var18 = -var9 + (float)param5[0];
        var19 = (float)param8[0] - var10;
        var20 = -var11 + (float)param2[0];
        var21 = (float)param5[1] - var9;
        var22 = -var10 + (float)param8[1];
        var23 = -var11 + (float)param2[1];
        var24 = (float)param5[2] - var9;
        var25 = -var10 + (float)param8[2];
        var26 = -var11 + (float)param2[2];
        if (param7 >= 23) {
          var27 = var17 * var13 - var14 * var16;
          var28 = -(var12 * var17) + var15 * var14;
          var29 = var12 * var16 - var15 * var13;
          var30 = -(var17 * var28) + var29 * var16;
          var31 = var27 * var17 - var29 * var15;
          var32 = -(var27 * var16) + var15 * var28;
          var33 = 1.0f / (var31 * var13 + var12 * var30 + var14 * var32);
          param0[1] = var33 * (var32 * var23 + (var30 * var21 + var22 * var31));
          param0[0] = (var32 * var20 + (var18 * var30 + var31 * var19)) * var33;
          param0[2] = var33 * (var32 * var26 + (var31 * var25 + var30 * var24));
          var30 = var13 * var29 - var28 * var14;
          var32 = -(var13 * var27) + var28 * var12;
          var31 = var14 * var27 - var29 * var12;
          var33 = 1.0f / (var15 * var30 + var16 * var31 + var32 * var17);
          param3[0] = var33 * (var30 * var18 + var31 * var19 + var32 * var20);
          param3[1] = var33 * (var22 * var31 + var30 * var21 + var23 * var32);
          param3[2] = (var31 * var25 + var24 * var30 + var26 * var32) * var33;
          return;
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        if (param1 >= 0) {
            if (128 > param1) {
                ((ge) this).a(param1, false);
                return;
            }
        }
        if (param0 != -49) {
            field_x = null;
        }
        if (0 <= param1) {
            if (!(-32769 >= (param1 ^ -1))) {
                ((ge) this).a((byte) -81, param1 + 32768);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void c(int param0, byte param1) {
        ((ge) this).field_t[((ge) this).field_v + (-param0 + -2)] = (byte)(param0 >> 1825337384);
        if (param1 != -92) {
            Object var4 = null;
            ((ge) this).a((String) null, 44);
        }
        ((ge) this).field_t[-1 + (((ge) this).field_v - param0)] = (byte)param0;
    }

    final String a(int param0) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        int var2 = ((ge) this).field_t[fieldTemp$0];
        if (0 != var2) {
            throw new IllegalStateException("");
        }
        if (param0 != 10762) {
            return null;
        }
        int var3 = ((ge) this).field_v;
        while (true) {
            int fieldTemp$1 = ((ge) this).field_v;
            ((ge) this).field_v = ((ge) this).field_v + 1;
            if (((ge) this).field_t[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + (-var3 + ((ge) this).field_v);
        if (0 == var4) {
            return "";
        }
        return tl.a(var4, param0 + -18272, ((ge) this).field_t, var3);
    }

    final void a(boolean param0, String param1) {
        int var3 = param1.indexOf(' ');
        if (0 <= var3) {
            throw new IllegalArgumentException("");
        }
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param1;
        ((ge) this).field_v = ((ge) this).field_v + o.a(((ge) this).field_t, var4, -24984, param1.length(), 0, ((ge) this).field_v);
        if (param0) {
            ((ge) this).field_t = null;
        }
        int fieldTemp$1 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$1] = (byte) 0;
    }

    final void b(long param0, int param1) {
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte)(int)(param0 >> -1897199520);
        if (param1 != 24136) {
            int discarded$1 = ((ge) this).i(-128);
        }
        int fieldTemp$2 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$2] = (byte)(int)(param0 >> 1246471832);
        int fieldTemp$3 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$3] = (byte)(int)(param0 >> -1370318384);
        int fieldTemp$4 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$4] = (byte)(int)(param0 >> 566256520);
        int fieldTemp$5 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$5] = (byte)(int)param0;
    }

    final int d(int param0) {
        ((ge) this).field_v = ((ge) this).field_v + 2;
        if (param0 != -1034) {
            field_s = null;
        }
        return (((ge) this).field_t[-2 + ((ge) this).field_v] << 841803048 & 65280) + (((ge) this).field_t[((ge) this).field_v + -1] & 255);
    }

    final int c(int param0) {
        int var2 = -95 / ((9 - param0) / 59);
        if (0 > ((ge) this).field_t[((ge) this).field_v]) {
            return ((ge) this).b(true) & 2147483647;
        }
        return ((ge) this).d(-1034);
    }

    ge(int param0) {
        ((ge) this).field_t = ja.a(param0, -1);
        ((ge) this).field_v = 0;
    }

    ge(byte[] param0) {
        ((ge) this).field_v = 0;
        ((ge) this).field_t = param0;
    }

    final void c(int param0, int param1) {
        if (param1 < 64) {
            if (!(-64 > param1)) {
                ((ge) this).a(param1 + 64, false);
                return;
            }
        }
        if ((param1 ^ -1) > -16385) {
            if ((param1 ^ -1) <= 16383) {
                ((ge) this).a((byte) -81, 49152 + param1);
                return;
            }
        }
        if (param0 > -84) {
            return;
        }
        throw new IllegalArgumentException();
    }

    final static String a(byte param0, pn param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        L0: {
          var4 = Pool.field_O;
          if (param0 == -24) {
            break L0;
          } else {
            var5 = null;
            ge.a((float[]) null, (int[]) null, (int[]) null, (float[]) null, (int[]) null, (int[]) null, (int[]) null, (byte) 9, (int[]) null);
            break L0;
          }
        }
        L1: {
          var2 = null;
          if (null == param1.field_j) {
            break L1;
          } else {
            L2: {
              var6 = param1.field_j;
              var3 = var6;
              var3 = var6;
              if (1 == param1.field_h) {
                var2 = (Object) (Object) ("<img=0>" + var6);
                break L2;
              } else {
                break L2;
              }
            }
            if (-3 == (param1.field_h ^ -1)) {
              var2 = (Object) (Object) ("<img=1>" + var2);
              var3 = (String) var2;
              var3 = (String) var2;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          var3 = "";
          if (-3 == (param1.field_p ^ -1)) {
            if (!param1.field_g) {
              L4: {
                if (param1.field_m != 0) {
                  break L4;
                } else {
                  if (param1.field_e == 0) {
                    var3 = nr.a(new String[1], -1, jl.field_a);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var3 = nr.a(new String[1], -1, vh.field_S);
              break L3;
            } else {
              break L3;
            }
          } else {
            L5: {
              if (param1.field_p != 0) {
                break L5;
              } else {
                if (!ej.field_l) {
                  break L5;
                } else {
                  var3 = "[" + sn.field_l + "] ";
                  break L5;
                }
              }
            }
            L6: {
              if (param1.field_p != 1) {
                break L6;
              } else {
                var3 = "[" + nr.a(new String[1], -1, th.field_c) + "] ";
                break L6;
              }
            }
            L7: {
              if (-5 != (param1.field_p ^ -1)) {
                break L7;
              } else {
                if (null == kn.field_g) {
                  break L7;
                } else {
                  var3 = "[" + kn.field_g + "] ";
                  break L7;
                }
              }
            }
            L8: {
              if ((param1.field_p ^ -1) != -4) {
                break L8;
              } else {
                var3 = "[#" + param1.field_n + "] ";
                break L8;
              }
            }
            if (param1.field_g) {
              break L3;
            } else {
              var3 = var3 + var2 + ": ";
              break L3;
            }
          }
        }
        return var3;
    }

    final void a(int param0, String param1) {
        if (param0 != -9946) {
            field_q = null;
        }
        int var3 = param1.indexOf(' ');
        if ((var3 ^ -1) <= -1) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        ((ge) this).field_v = ((ge) this).field_v + o.a(((ge) this).field_t, var4, param0 + -15038, param1.length(), 0, ((ge) this).field_v);
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        ((ge) this).field_t[fieldTemp$0] = (byte) 0;
    }

    final void a(int param0, int param1, int[] param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6 = -28 / ((param3 - -39) / 41);
        int var5 = ((ge) this).field_v;
        ((ge) this).field_v = param1;
        int var7 = (param0 + -param1) / 8;
        for (var8 = 0; var7 > var8; var8++) {
            var9 = ((ge) this).b(true);
            var10 = ((ge) this).b(true);
            var11 = -957401312;
            var12 = -1640531527;
            var13 = 32;
            while (true) {
                int incrementValue$0 = var13;
                var13--;
                if (-1 <= (incrementValue$0 ^ -1)) {
                    break;
                }
                var10 = var10 - ((var9 << -814168444 ^ var9 >>> -2134175003) + var9 ^ var11 + param2[(var11 & 8044) >>> 1819825739]);
                var11 = var11 - var12;
                var9 = var9 - (var11 - -param2[var11 & 3] ^ (var10 << 1406437572 ^ var10 >>> -53509723) - -var10);
            }
            ((ge) this).field_v = ((ge) this).field_v - 8;
            ((ge) this).a(true, var9);
            ((ge) this).a(true, var10);
        }
        ((ge) this).field_v = var5;
    }

    final void b(int param0, boolean param1) {
        ((ge) this).field_t[-1 + -param0 + ((ge) this).field_v] = (byte)param0;
        if (!param1) {
            field_o = null;
        }
    }

    final byte e(byte param0) {
        if (param0 != 105) {
            return (byte) -27;
        }
        int fieldTemp$0 = ((ge) this).field_v;
        ((ge) this).field_v = ((ge) this).field_v + 1;
        return ((ge) this).field_t[fieldTemp$0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Achievements";
        field_m = "Remove friend";
        field_r = "<%0> has won!";
        field_w = "Spectate <%0>'s game";
        field_x = "All players have left <%0>'s game.";
        field_n = "Wants a rematch.";
        field_p = new int[8192];
    }
}
