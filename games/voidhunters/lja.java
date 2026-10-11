/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lja implements ntb {
    static String field_c;
    int field_e;
    static int field_b;
    static int field_d;
    int field_g;
    private int field_h;
    private int field_a;
    static int field_f;

    final void a(int param0, lta param1, int[] param2, int param3, pe param4, int param5, int param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        anb var21 = null;
        ml var22 = null;
        mqb var23 = null;
        int var17Lifetime1;
        try {
          var23 = param4.h(this.field_e, -125);
          if (param6 < 73) {
            this.field_a = 55;
          }
          if (var23 != null) {
            var9 = skb.a(param2, 84);
            var10 = param5 + (var9 * fc.a(param0, (byte) -96) >> 16);
            var11 = param3 + (eu.a(param0, 85) * var9 >> 16);
            var12 = -var10 + var23.d(false);
            var13 = -var11 + var23.g((byte) 124);
            var14 = ar.a(var12, (byte) 118, var13);
            var15 = -this.field_a + var14;
            var16 = 39219;
            if (0 < var15) {
              var17 = var15 * 512 / this.field_a;
              if (var17 > 255) {
                var17 = 255;
              }
              var16 = 39219 + (var17 << 16);
            }
            var17Lifetime1 = param1.a(var23.d(false), (byte) 115);
            var18 = param1.b(true, var23.g((byte) 119));
            var19 = param1.a(var10, (byte) 122);
            var20 = param1.b(true, var11);
            c.a(var18, var17Lifetime1, var19, var20, -16777216, var16);
            if (var23.l((byte) -68) >= 0) {
              var21 = param4.d((byte) -27, var23.l((byte) -102));
              if (var21 == null) {
                return;
              }
              var22 = var21.field_k.c(var23.l(127), -97);
              if (var22 == null) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("lja.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(int param0, mqb param1) {
        if (param0 != 32) {
          return;
        }
        try {
          if (this.field_h != ls.field_r) {
            this.field_h = ls.field_r;
            param1.f(true);
            param1.a(param0 ^ 86, true);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "lja.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(byte param0) {
        if (param0 != 126) {
          return -65;
        }
        if (1 == fra.field_a) {
          return 2048;
        }
        return ldb.field_q;
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, byte param7, pe param8, int param9, anb param10) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        mqb var22 = null;
        int var23 = 0;
        int var24 = 0;
        mqb var25 = null;
        int var14Lifetime1;
        try {
          if (param7 <= 3) {
            this.field_a = 3;
          }
          if (-1 == this.field_e &&
            this.field_g == 0) {
            var12_int = param5 + (param9 * fc.a(param4, (byte) 30) - eu.a(param4, 103) * param6 >> 16);
            var13 = param1 + (param9 * eu.a(param4, 43) + fc.a(param4, (byte) 87) * param6 >> 16);
            var14 = skb.a(param2, -71);
            var15 = param5 + (fc.a(param4, (byte) -63) * var14 >> 16);
            var16 = (var14 * eu.a(param4, 76) >> 16) + param1;
            var17 = -var12_int + param0;
            var18 = param3 - var13;
            var19 = ecb.a(var18, (byte) -77, var17);
            var20 = rrb.a(22433, var19 - param4);
            if (Math.abs(var20) > 256) {
              return;
            }
            this.field_a = bia.field_c;
            var21 = -1;
            if (param10 instanceof sg) {
              var21 = ((sg) (param10)).o((byte) -117);
            }
            var22 = new mqb(new ml(28), param10.field_l, var21);
            var14Lifetime1 = skb.a(var22.field_k.i((byte) -112).field_v, 80);
            var22.a(param4, -17);
            var23 = fc.a(param4, (byte) -127) * var14Lifetime1 >> 16;
            var24 = eu.a(param4, 77) * var14Lifetime1 >> 16;
            var22.a(var23 * 2 + var15, var24 * 2 + var16, (byte) 100);
            param8.a((byte) 67, var22);
            var22.field_h = param10.field_h;
            var22.field_f = param10.field_f;
            qba.a(20382, var15, 12, var16, 50);
            var22.a(var16, param4, var15, joa.field_a, 1948934248);
            param10.a(var16, rrb.a(22433, param4 + 4096), var15, joa.field_a, 1948934248);
            this.field_e = var22.field_l;
            this.field_g = pca.field_i[0].d((byte) 64);
            this.field_h = this.field_a;
            return;
          }
          var25 = param8.h(this.field_e, -103);
          if (var25 != null) {
            if (-1 != var25.l((byte) 123)) {
              qba.a(20382, var25.d(false), 13, var25.g((byte) -69), 50);
            }
            this.a(32, var25);
            qba.a(20382, param5, 14, param1, 50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_20_0 = var12;
          stackIn_20_1 = new StringBuilder().append("lja.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void e(byte param0) {
        String var2 = (String) null;
        uhb.a((String) null, bfa.field_p, 0);
        if (param0 <= 11) {
          lja.e((byte) 76);
        }
    }

    final void a(anb param0, pe param1, int param2, boolean param3, byte param4, int param5, int param6, int[] param7) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        anb var17 = null;
        int var18_int = 0;
        ml var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21_int = 0;
        long var21 = 0L;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        mqb var33 = null;
        int var10Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        var32 = VoidHunters.field_G;
        try {
          var33 = param1.h(this.field_e, -126);
          if (var33 == null) {
            if (this.field_e != -1) {
              this.field_e = -1;
              param0.d((byte) -85);
            }
            if (this.field_g > 0) {
              this.field_g = this.field_g - 1;
              param0.d((byte) 40);
            }
          } else {
            param0.d((byte) -74);
            var10 = skb.a(param7, -82);
            var11 = param5 + (var10 * fc.a(param6, (byte) -125) >> 16);
            var12 = param2 + (var10 * eu.a(param6, 39) >> 16);
            var13 = var33.d(false) - var11;
            var14 = var33.g((byte) -54) - var12;
            var15 = ar.a(var13, (byte) 114, var14);
            var16 = var15 - this.field_a;
            if (var16 > 0) {
              var13 = (var13 << 8) / this.field_a;
              var14 = (var14 << 8) / this.field_a;
              var17_int = var16 / Math.max(1, this.field_a >> 8);
              if (bhb.field_i < var15) {
                var33.field_k.a(var33.field_k.i((byte) -112).field_p, (byte) -109);
              } else {
                if (var17_int > nra.field_b) {
                  var17_int = nra.field_b;
                  var16 = var17_int * this.field_a >> 8;
                }
                var18_int = (var16 * uua.field_o >> 8) * var13;
                var19 = var18_int >> 8;
                var20 = var14 * (uua.field_o * var16 >> 8);
                var21_int = var20 >> 8;
                var33.a(-var21_int, var33.d(false), var33.g((byte) 122), (byte) -128, -var19);
                param0.a(var21_int, var11, var12, (byte) -117, var19);
                if (-1 == var33.l((byte) -106)) {
                  this.a(32, var33);
                }
              }
            }
            if (var33.l((byte) 120) >= 0) {
              var17 = param1.d((byte) -27, var33.l((byte) 121));
              if (var17 == null) {
                var33.f(true);
                return;
              }
              var18 = var17.field_k.c(var33.l(-109), -121);
              if (var18 == null) {
                var33.f(true);
                return;
              }
              if (this.field_h > bia.field_c >> 1) {
                this.field_h = bia.field_c >> 1;
              }
              var19Lifetime1 = eu.a(var18.field_b, 126);
              var20Lifetime1 = fc.a(var18.field_b, (byte) -76);
              var21 = (long)var18.field_r + ((long)var20Lifetime1 * (long)var33.o(23463) - (long)var33.q(32) * (long)var19Lifetime1 >> 16);
              var23 = (long)var18.field_n + ((long)var33.o(23463) * (long)var19Lifetime1 + (long)var33.q(32) * (long)var20Lifetime1 >> 16);
              var25 = (int)var21 - var33.d(false);
              var26 = (int)var23 - var33.g((byte) -29);
              var27 = var33.c((byte) -121) - var17.c((byte) -112);
              var28 = var33.f(0) - var17.f(0);
              var29 = Math.min(var33.e(false), var17.e(false) / 4);
              var30 = (var25 - var27) * var29 / 2;
              var31 = (-var28 + var26) * var29 / 2;
              var33.a(var31, var33.d(false), var33.g((byte) 124), (byte) -118, var30);
              var17.a(-var31, (int)var21, (int)var23, (byte) -123, -var30);
            }
            if (this.field_a > this.field_h) {
              this.field_a = this.field_a - ds.field_d;
              if (this.field_h > this.field_a) {
                this.field_a = this.field_h;
              }
              if (this.field_h == ls.field_r &&
                0 <= var33.l((byte) -34)) {
                var33.f(true);
                var33.field_f = 0;
                var33.field_h = 0;
              }
            }
            if (param3) {
              var33.field_k.a(var33.field_k.i((byte) -112).field_p, (byte) -114);
            }
          }
          var10Lifetime1 = 51 % ((param4 - 69) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_41_0 = var9;
          stackIn_41_1 = new StringBuilder().append("lja.N(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        int var1 = 87 % ((46 - param0) / 63);
        field_c = null;
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_e, 32);
          if (param1 >= -109) {
            this.field_a = -1;
          }
          param0.a(-632, this.field_h, 32);
          param0.a(-632, this.field_a, 32);
          param0.a(-632, this.field_g, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "lja.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 != -113) {
          return true;
        }
        return this.field_e == -1 ? true : false;
    }

    public lja() {
        this.field_e = -1;
    }

    final int a(byte param0) {
        if (param0 != 12) {
          field_d = -53;
        }
        return dla.field_c;
    }

    final void a(pe param0, int param1) {
        mqb var3 = null;
        pe var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != 19278) {
            var4 = (pe) null;
            this.a(-123, (lta) null, (int[]) null, -18, (pe) null, 75, 40);
          }
          var3 = param0.h(this.field_e, 101);
          if (var3 != null) {
            var3.n(620);
            this.field_e = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("lja.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lja var5 = null;
        try {
          var5 = (lja) (param0);
          if (param1 > -19) {
            return;
          }
          var4 = 0;
          if (var5.field_e != this.field_e) {
            var4 = 1;
            System.out.println("int hook_id has changed. before=" + var5.field_e + ", now=" + this.field_e);
          }
          if (var5.field_h != this.field_h) {
            System.out.println("int target_rope_length has changed. before=" + var5.field_h + ", now=" + this.field_h);
            var4 = 1;
          }
          if (var5.field_a != this.field_a) {
            System.out.println("int rope_length has changed. before=" + var5.field_a + ", now=" + this.field_a);
            var4 = 1;
          }
          if (var5.field_g != this.field_g) {
            System.out.println("int reload has changed. before=" + var5.field_g + ", now=" + this.field_g);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of GrappleLauncherBehaviour has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("lja.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_e = param0.i(0, 32);
          this.field_h = param0.i(0, 32);
          this.field_a = param0.i(0, 32);
          this.field_g = param0.i(0, 32);
          if (param1) {
            this.field_g = -16;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "lja.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        lja var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -37 % ((param0 - 22) / 59);
          var4 = (lja) (param1);
          stackIn_7_0 = (this.field_e != var4.field_e) || (var4.field_h != this.field_h) || (this.field_a != var4.field_a) || (this.field_g != var4.field_g);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lja.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        lja var6 = null;
        lja var7 = null;
        try {
          var6 = (lja) (param1);
          var7 = var6;
          var7.field_h = this.field_h;
          if (param0 <= 54) {
            anb var4 = (anb) null;
            this.a(-126, -1, (int[]) null, -127, 86, -67, -61, (byte) 75, (pe) null, -84, (anb) null);
          }
          var7.field_e = this.field_e;
          var7.field_g = this.field_g;
          var7.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "lja.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Win by destroying the enemy VIP";
        field_b = 80;
        field_d = 1;
    }
}
