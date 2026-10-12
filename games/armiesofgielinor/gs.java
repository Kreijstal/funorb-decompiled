/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs implements kh {
    static int field_b;
    static boolean field_a;
    static String[] field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          ds.field_a = new wk[op.field_c[0].length];
          if (param0) {
            field_a = true;
          }
          le.field_c = new wk[op.field_c[0].length];
          rq.a((byte) -56);
          for (var1_int = 0; var1_int < op.field_c[0].length; var1_int++) {
            ds.field_a[var1_int] = new wk(vo.field_d.field_y, vo.field_d.field_v);
            le.field_c[var1_int] = new wk(im.field_y.field_y, im.field_y.field_v);
            ds.field_a[var1_int].b();
            vo.field_d.d(0, 0, op.field_c[0][var1_int]);
            le.field_c[var1_int].b();
            im.field_y.b(0, 0, op.field_c[0][var1_int]);
          }
          rf.b(-18862);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "gs.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.field_q = var2.field_q + 1;
        int var3 = var2.field_q;
        var2.b(1, 2);
        var2.a(ln.field_d, 0, ln.field_d.length, 113);
        var2.b(1, nh.field_E);
        var2.b(1, sm.field_b);
        var2.a(tg.field_d, 0, tg.field_d.length, -72);
        if (param1 != -8006) {
          field_b = -111;
        }
        var2.e(-var3 + var2.field_q, 5930);
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          tm.a();
          hg.field_a = new int[260];
          fn.field_M = 11;
          var1_int = 0;
          var2 = -93 / ((-68 - param0) / 57);
          while (256 > var1_int) {
            var3 = 15.0;
            hg.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var3) * 255.0);
            var1_int++;
          }
          var6 = 256;
          var1_intLifetime1 = var6;
          while (var6 < hg.field_a.length) {
            hg.field_a[var6] = 255;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "gs.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -29 / ((13 - param0) / 56);
        field_c = null;
    }

    final static tu a(String param0, kl param1, kl param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tu stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param0, 106);
          var6 = param1.a((byte) -65, var5_int, param4);
          if (param3 != -53) {
            field_a = true;
          }
          stackIn_3_0 = cc.a(param1, var5_int, param2, true, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("gs.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          for (var6_int = 0; var6_int <= param0.field_w; var6_int++) {
            var7 = 152 + var6_int * 48 / param0.field_w;
            var8 = var7 | (var7 << 16 | var7 << 8);
            qn.e(param0.field_B + param1, var6_int + param4 + param0.field_p, param0.field_l, var8);
          }
          var6_intLifetime1 = 1;
          if (param2 > -79) {
            var11 = (int[]) null;
            gs.a((byte) -58, (int[]) null);
          }
          while (5 >= var6_intLifetime1) {
            var7Lifetime1 = var6_intLifetime1 + (-5 + (param1 + param0.field_B)) + (param0.field_l - (param0.field_l >> 1));
            var8Lifetime1 = -(var6_intLifetime1 * 2) + (param0.field_l >> 1);
            var9 = var6_intLifetime1 + (param4 + (param0.field_p + (-4 + param0.field_w >> 1)));
            if (var9 >= qn.field_a &&
              qn.field_f > var9) {
              if (qn.field_j < var7Lifetime1) {
                qn.field_d[var9 * qn.field_l - (-var7Lifetime1 + 1)] = rn.a(qn.field_d[-1 + (var7Lifetime1 + qn.field_l * var9)], 16711422) >> 1;
              }
              if (var8Lifetime1 + var7Lifetime1 < qn.field_e) {
                qn.field_d[qn.field_l * var9 + (var7Lifetime1 + var8Lifetime1)] = rn.a(16711422, qn.field_d[qn.field_l * var9 + var7Lifetime1 + var8Lifetime1]) >> 1;
              }
            }
            qn.e(var7Lifetime1, var9, var8Lifetime1, 0);
            var6_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("gs.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(byte param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        qu var4_ref_qu = null;
        int var4 = 0;
        qu var5 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 != 42) {
            return false;
          }
          if (ov.field_g != kl.field_k) {
            return false;
          }
          var2_long = vi.b(126);
          if (dq.field_c != 0 &&
            0 > mg.field_f) {
            var4_ref_qu = (qu) (vj.field_b.e((byte) 127));
            if (var4_ref_qu != null &&
              var2_long > var4_ref_qu.field_l) {
              var4_ref_qu.d(-111);
              fk.field_b = var4_ref_qu.field_m.length;
              mg.field_e.field_q = 0;
              for (var5_int = 0; fk.field_b > var5_int; var5_int++) {
                mg.field_e.field_o[var5_int] = var4_ref_qu.field_m[var5_int];
              }
              me.field_c = ba.field_F;
              ba.field_F = sj.field_e;
              sj.field_e = nm.field_o;
              nm.field_o = var4_ref_qu.field_o;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("gs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
        stackIn_22_0 = mg.field_f;
        try {
          while (true) {
            if (stackIn_22_0 < 0) {
              mg.field_e.field_q = 0;
              if (!es.a(param0 ^ -83, 1)) {
                return false;
              }
              mg.field_f = mg.field_e.m(255);
              mg.field_e.field_q = 0;
              fk.field_b = param1[mg.field_f];
            }
            if (!jh.g(2)) {
              return false;
            }
            if (dq.field_c == 0) {
              me.field_c = ba.field_F;
              ba.field_F = sj.field_e;
              sj.field_e = nm.field_o;
              nm.field_o = mg.field_f;
              mg.field_f = -1;
              return true;
            }
            var4 = dq.field_c;
            if (0.0 != sp.field_e) {
              var4 = (int)((double)var4 + iq.field_e.nextGaussian() * sp.field_e);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new qu(var2_long + (long)var4, mg.field_f, new byte[fk.field_b]);
            for (var6 = 0; var6 < fk.field_b; var6++) {
              var5.field_m[var6] = mg.field_e.field_o[var6];
            }
            vj.field_b.a((byte) -119, (tc) (var5));
            mg.field_f = -1;
            stackIn_22_0 = mg.field_f;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("gs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    static {
        field_a = true;
        field_c = new String[]{"This unit is not carrying any equipment.", "This unit is carrying a flag. As such, it is able to capture a single structure.", "This unit is carrying a grappling hook, enabling it attack flying units.", "This unit is wearing waders, allowing it to better traverse rivers and swamps.", "This unit is wearing boots of Elidinis, allowing it to travel very quickly over water.", "This unit is carrying a ring of life, allowing it to respawn at the nearest unoccupied allied structure when it dies."};
        field_b = 0;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
