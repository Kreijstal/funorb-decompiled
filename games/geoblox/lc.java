/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    String field_d;
    String field_a;
    boolean field_c;
    static int field_b;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        ja var1 = null;
        RuntimeException var1_ref = null;
        double var2 = 0.0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        double var8 = 0.0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          var1 = (ja) ((Object) wd.field_e.g(0));
          do {
            if (var1 == null) {
              if (param0 != 255) {
                field_b = -11;
              }
              break;
            }
            var1.b(true);
            var1 = (ja) ((Object) wd.field_e.d(1));
          } while (var10 == 0);
          if ((kj.field_o[99] &&
              ji.field_r.c(13519) ||
            !(~kb.field_c <= ~kc.field_a) ||
            ul.field_b == 0 &&
              !el.field_o.field_Y) && (0 < wd.field_e.a(param0 ^ -170) &&
              !el.field_o.field_N)) {
            ji.field_r.a(-48, wd.field_e.b((byte) -124));
            hd.f(2);
            kc.field_a = 0;
          }
          kc.field_a = kc.field_a + 1;
          if (wd.field_e.a(param0 ^ 143) < 3 &&
              ma.c((byte) -53) &&
              !el.field_o.b(true)) {
            var1 = (ja) ((Object) ra.field_a.b((byte) -101));
            if (null != var1) {
              var2 = 2.0 * Math.random() * 3.141592653589793;
              var4 = 240.0f * (float)Math.cos(var2) + 320.0f;
              var5 = 240.0f + (float)Math.sin(var2) * 240.0f;
              var6 = 320.0f - var4;
              var7 = -var5 + 240.0f;
              var8 = 1.0 / Math.sqrt((double)(var7 * var7 + var6 * var6));
              var7 = (float)((double)var7 * var8);
              var6 = (float)((double)var6 * var8);
              var1.a(101, var4, vd.a(param0 ^ 741924143), og.field_r * var6, nf.c((byte) -67), kc.field_a + kb.field_c * (1 + wd.field_e.a(111)), 0.0f, var5, var7 * og.field_r, ij.m(param0 ^ 131), 0.0f);
              wd.field_e.a(-47, var1);
              mf.b(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "lc.E(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -2) {
            lc.a((byte) -59);
          }
          oi.field_e = param0;
          pb.field_s = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("lc.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int[] param11, int param12) {
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        var37 = Geoblox.field_C;
        try {
          if (param10 > -74) {
            field_b = 78;
          }
          var13_int = param0;
          var14 = 1122867;
          var15 = (var14 & 16711680) >>> 16;
          var16 = var14 & 65280;
          var17 = var14 & 255;
          var18 = -param1;
          while (var18 < 0) {
            var19 = param5 * (param6 >> 16);
            if (var37 != 0) {
              return;
            }
            var20 = -param9;
            while (var20 < 0) {
              param12 = param11[var19 + (param0 >> 16)];
              param0 = param0 + param3;
              stackIn_23_0 = param12;
              {
                if (stackIn_23_0 == 0) {
                  param8++;
                } else {
                  var21 = param2[param8];
                  if (var21 == 0) {
                    param8++;
                  } else {
                    var22 = 510 & var21 >> 15;
                    var23 = (var21 & 65429) >> 8;
                    var24 = 255 & var21;
                    var25 = (var24 + var22) / 3 + var23 >> 1;
                    var26 = -(((255 & param12) + (param12 >> 8 & 255) + (param12 >> 16 & 255)) / 3) + 256;
                    var27 = var15 * (var25 << 16 >>> 16) >>> 8;
                    var28 = (var25 << 8) * var16 >>> 24;
                    var29 = var17 * var25 >>> 8;
                    var25 = (var28 << 8) + (var27 << 16) + var29;
                    var30 = var26 * ((16711680 & var25) >> 16);
                    var31 = (255 & var25 >> 8) * var26;
                    var32 = (var25 & 255) * var26;
                    var33 = ((16711680 & var21) >>> 16) * ((param12 & 16711680) >>> 16) >>> 8;
                    var34 = (var21 & 65280) * (param12 & 65280) >>> 24;
                    var35 = (255 & var21) * (255 & param12) >>> 8;
                    var36 = 256 - var26;
                    var33 = var33 * var36;
                    var34 = var34 * var36;
                    var35 = var35 * var36;
                    incrementValue$0 = param8;
                    param8++;
                    param2[incrementValue$0] = (var32 + var35 >> 8) + ((var34 + var31 >> 8 << 8) + (var30 + var33 >> 8 << 16));
                  }
                }
              }
              var20++;
            }
            param6 = param6 + param4;
            param8 = param8 + param7;
            stackIn_23_0 = var13_int;
            param0 = stackIn_23_0;
            var18++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_28_0 = var13;
          stackIn_28_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param12).append(')').toString());
        }
    }

    final static bg a(int param0, byte[] param1) {
        bg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        bg stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1) {
            stackIn_4_0 = null;
            return (bg) (stackIn_4_0);
          }
          if (param0 != 4520) {
            lc.a(-56, -44, (int[]) null, 118, 4, -55, 25, -98, -82, -78, (byte) -35, (int[]) null, -116);
          }
          var2 = new bg(param1, gh.field_m, md.field_e, rc.field_j, hl.field_K, mj.field_a);
          kj.c(true);
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("lc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        j stackIn_61_0 = null;
        RuntimeException decompiledCaughtException = null;
        pk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        j var5 = null;
        String var5_ref = null;
        String var6 = null;
        j var6_ref = null;
        String var7 = null;
        j var7_ref = null;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          if (param0 != 104) {
            field_b = 67;
          }
          var1 = eh.field_d;
          var2 = var1.c((byte) 34);
          if (var2 == 0) {
            if (ug.field_a == null) {
              ug.field_a = new vg(128);
              ca.field_i = 0;
            }
            stackIn_15_0 = (var1.c((byte) 34) != 1) ? 0 : 1;
            var3_int = stackIn_15_0;
            var4_ref_String = var1.e((byte) 105);
            if (var3_int != 0) {
              var1.e((byte) 108);
            }
            var5 = ud.a(0, var4_ref_String);
            var6 = var1.e((byte) 103);
            var7 = oe.a((CharSequence) ((Object) var4_ref_String), 12);
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = ud.a(param0 ^ 104, var6);
              if (var5 != null) {
                ug.field_a.a((long)var7.hashCode(), 113, var5);
              }
            }
            if (null == var5) {
              var5 = new j();
              ug.field_a.a((long)var7.hashCode(), 94, var5);
              fieldTemp$0 = ca.field_i;
              ca.field_i = ca.field_i + 1;
              var5.field_kb = fieldTemp$0;
              di.field_e.a(param0 ^ -86, var5);
            }
            var5.field_hb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (vk.field_a == 1) {
                vk.field_a = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (vk.field_a == 2) {
                vk.field_a = 1;
              }
              return;
            }
            if (var2 != 4) {
              gi.a((Throwable) null, "F1: " + og.e(55), (byte) 125);
              jl.a((byte) -119);
              return;
            }
            vk.field_a = 1;
            var3 = var1.e((byte) 122);
            eg.field_l = ((String) (var3)).intern();
            var4 = var1.c((byte) 34);
            pi.c(var4, param0 ^ -12742);
            return;
          }
          if (nh.field_a == null) {
            nh.field_a = new vg(128);
            mg.field_g = 0;
          }
          var3 = var1.e((byte) 108);
          if (((String) (var3)).equals("")) {
            var3 = null;
          }
          var4_ref_String = var1.e((byte) 102);
          var5_ref = var1.e((byte) 110);
          var6_ref = jg.a((byte) -62, var4_ref_String);
          if (null == var6_ref) {
            var6_ref = jg.a((byte) -62, var5_ref);
            if (null != var6_ref) {
              nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), 12).hashCode(), -63, var6_ref);
            }
          }
          if (null == var6_ref) {
            var6_ref = new j();
            nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), param0 ^ 100).hashCode(), 110, var6_ref);
            fieldTemp$1 = mg.field_g;
            mg.field_g = mg.field_g + 1;
            var6_ref.field_kb = fieldTemp$1;
            hl.field_B.a(-59, var6_ref);
          }
          if (var3 != null) {
            var3 = ((String) (var3)).intern();
          }
          var6_ref.field_hb = var4_ref_String;
          var6_ref.field_mb = (String) (var3);
          var6_ref.a(false);
          var7_ref = (j) ((Object) hl.field_B.g(0));
          L15: while (true) {
            if (null != var7_ref) {
              stackIn_61_0 = var6_ref;
              if (var8 != 0) {
                break L15;
              }
              if (ul.a(stackIn_61_0, var7_ref, (byte) 127)) {
                var7_ref = (j) ((Object) hl.field_B.d(1));
                continue;
              }
            }
            stackIn_61_0 = var7_ref;
            break;
          }
          if (stackIn_61_0 == null) {
            hl.field_B.a(-39, var6_ref);
            if (var8 == 0) {
              return;
            }
          }
          le.a(var7_ref, 121, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "lc.D(" + param0 + ')');
        }
    }

    static {
    }
}
