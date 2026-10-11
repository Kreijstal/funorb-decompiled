/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wh extends uh {
    static int[] field_x;
    static boolean[] field_v;
    static he[] field_u;
    int field_w;

    final static boolean a(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = nj.a(nb.a(73), 8);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "wh.I(" + param0 + ')');
        }
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          mf.field_u = null;
          oi.field_c = false;
          boolean decompiledSharedTail0 = !(sg.field_a);
          if (!decompiledSharedTail0) {
            ol.field_a.c(false);
            decompiledSharedTail0 = (var2 != 0);
          }
          if (decompiledSharedTail0) {
            var1_int = rh.field_a;
            if (var1_int > 0) {
              if (var1_int != 1) {
                mf.field_u = a.a(5044, hi.field_i, new String[]{Integer.toString(var1_int)});
              }
              if (var1_int == 1 ||
                var2 != 0) {
                mf.field_u = sj.field_b;
              }
              mf.field_u = dm.a(0, new CharSequence[]{(CharSequence) ((Object) mf.field_u), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) fm.field_b)});
            }
            ol.field_a.d(true);
            sd.a((byte) -124);
          }
          if (!param0) {
            field_x = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "wh.H(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2, ja param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        int stackIn_43_0Lifetime1;
        int stackIn_43_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = oi.a((param4 - param0) * 3, (byte) 1);
          var6 = 3 * param0;
          vg.d((byte) 103);
          var7 = var5_int - 10;
          if (0 < param3.field_G &&
            null != param3.field_O) {
            ff.a((byte) -2);
          }
          eg.field_i = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param3.field_m)))) {
            var9 = param3.field_h[var8];
            var10 = param3.field_a[var8];
            var11 = param3.field_K[var8];
            stackOut_10_0 = param1;
            stackIn_53_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var19 == 0) {
              if (stackIn_11_0) {
                var12 = fa.field_j[var9];
                var13 = gf.field_p[var9];
                var14 = fa.field_j[var10] - var12;
                var15 = fa.field_j[var11] - var12;
                var16 = -var13 + gf.field_p[var10];
                var17 = gf.field_p[var11] - var13;
              }
              if (!stackIn_11_0 ||
                !(-(var16 * var15) + var14 * var17 >= 0)) {
                var12Lifetime1 = aj.field_b[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = aj.field_b[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = aj.field_b[var11];
                    if (var14 != -2147483648) {
                      var15 = var12Lifetime1 + (var13Lifetime1 + var14 - var6);
                      if (var7 >= 0) {
                        stackIn_32_0 = var15 >> var7;
                      } else {
                        stackIn_32_0 = var15 << -var7;
                      }
                      var16 = -stackIn_32_0 + (of.field_w.length - 1);
                      var17 = of.field_w[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_43_0 = ~var16;
                          stackIn_43_1 = -1;
                          if (stackIn_43_0 > stackIn_43_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = of.field_w[var16];
                          continue;
                        }
                        stackIn_43_0Lifetime1 = var16 << 4;
                        stackIn_43_1Lifetime1 = -var17;
                        var18 = stackIn_43_0Lifetime1 - stackIn_43_1Lifetime1;
                        p.field_c[var18] = var8;
                        of.field_w[var16] = 1 + var17;
                        if (param3.field_G > 0 &&
                          param3.field_O != null) {
                          dupTemp$0 = param3.field_O[var8];
                          uh.field_h[dupTemp$0] = uh.field_h[dupTemp$0] + 1;
                        }
                        eg.field_i = eg.field_i + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_53_0 = param2;
          }
          if (stackIn_53_0 <= 71) {
            wh.b(true);
          }
          if (param3.field_G > 0 &&
            null != param3.field_O) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= uh.field_h.length)) {
              var10Lifetime1 = uh.field_h[var9Lifetime1];
              uh.field_h[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_70_0 = var5;
          stackIn_70_1 = new StringBuilder().append("wh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, String param1, byte param2, String[] param3) {
        int var5 = 0;
        boolean stackIn_23_0 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 < 96) {
            field_x = (int[]) null;
          }
          fk.field_q = wg.field_u;
          if (255 != param0) {
            if (param0 >= 100 &&
              param0 <= 105) {
              jj.field_d = sa.a((byte) 3, param3);
              if (var5 == 0) {
                return;
              }
            }
            jj.field_d = kj.a(param0, 4, param1);
            if (var5 == 0) {
              return;
            }
          }
          stackIn_23_0 = !(13 <= rd.field_z);
          jj.field_d = b.a(stackIn_23_0, 77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("wh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    abstract boolean a(byte param0);

    public static void c(byte param0) {
        try {
          field_v = null;
          field_u = null;
          field_x = null;
          if (param0 != -86) {
            field_x = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "wh.G(" + param0 + ')');
        }
    }

    abstract Object b(byte param0);

    wh(int param0) {
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "wh.<init>(" + param0 + ')');
        }
    }

    final static void a(int param0, vj param1, vj param2, vj param3, boolean param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ib.field_f = ug.a("", param0 ^ param0);
          ib.field_f.a(false, -87);
          kk.a(param0 + 168, param3, param1, param2);
          lc.c((byte) 109);
          lc.field_h = pj.field_D;
          fk.field_q = pj.field_D;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wh.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_x = new int[]{100, 50, 75, 75, 110, 10000, 8, 200, 10, 40, 160, 20000, 100, 250, 300, 350, 400, 30000, 50000, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, 0, 0, 0, 0, 100, 300, 15, 75, 100, 25, 75, 125, 75, 150, 150, 25, 75, 25, 25, 25, 25, 25, 25, 50, 50, 25, 25, 25, 25, 25, 75, 75, 75, 10, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80};
        field_v = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }
}
