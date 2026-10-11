/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi extends kd {
    int field_z;
    static int field_y;
    int field_B;
    static gk[] field_C;
    static String field_G;
    int field_D;
    int field_F;
    int field_H;
    int field_A;

    public static void g(int param0) {
        field_C = null;
        if (param0 != 573) {
          return;
        }
        try {
          field_G = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "wi.D(" + param0 + ')');
        }
    }

    final static void a(int param0, pe param1, int param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
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
        int stackIn_36_0Lifetime1;
        int stackIn_36_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = SteelSentinels.field_G;
        try {
          var5_int = ve.a(-122, (param0 - param2) * 3);
          var6 = param2 * 3;
          kk.b((byte) 34);
          var7 = var5_int - 10;
          if (param1.field_K > 0 &&
            null != param1.field_P) {
            fb.b(0);
          }
          if (param4 != 2147483647) {
            return;
          }
          wl.field_D = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param1.field_w)))) {
            var9 = param1.field_G[var8];
            var10 = param1.field_j[var8];
            var11 = param1.field_x[var8];
            stackOut_11_0 = param3;
            stackIn_45_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = eh.field_d[var9];
                var13 = n.field_p[var9];
                var14 = eh.field_d[var10] - var12;
                var15 = eh.field_d[var11] - var12;
                var16 = -var13 + n.field_p[var10];
                var17 = n.field_p[var11] - var13;
              }
              if (!stackIn_12_0 ||
                !(var14 * var17 - var16 * var15 >= 0)) {
                var12Lifetime1 = km.field_h[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = km.field_h[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = km.field_h[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + (var13Lifetime1 + var12Lifetime1) + var14;
                      stackIn_25_0 = -1;
                      stackIn_25_1 = ck.field_c.length;
                      if (var7 >= 0) {
                        stackIn_26_2 = var15 >> var7;
                      } else {
                        stackIn_26_2 = var15 << -var7;
                      }
                      var16 = stackIn_25_0 + (stackIn_25_1 - stackIn_26_2);
                      var17 = ck.field_c[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_36_0 = -1;
                          stackIn_36_1 = ~var16;
                          if (stackIn_36_0 < stackIn_36_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ck.field_c[var16];
                          continue;
                        }
                        stackIn_36_0Lifetime1 = var16 << 4;
                        stackIn_36_1Lifetime1 = var17;
                        var18 = stackIn_36_0Lifetime1 + stackIn_36_1Lifetime1;
                        um.field_bb[var18] = var8;
                        ck.field_c[var16] = var17 + 1;
                        if (param1.field_K > 0 &&
                          null != param1.field_P) {
                          dupTemp$0 = param1.field_P[var8];
                          qe.field_a[dupTemp$0] = qe.field_a[dupTemp$0] + 1;
                        }
                        wl.field_D = wl.field_D + 1;
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
            stackIn_45_0 = ~param1.field_K;
          }
          if (stackIn_45_0 < -1 &&
            null != param1.field_P) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(qe.field_a.length <= var9Lifetime1)) {
              var10Lifetime1 = qe.field_a[var9Lifetime1];
              qe.field_a[var9Lifetime1] = var8Lifetime1;
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
          stackIn_61_0 = var5;
          stackIn_61_1 = new StringBuilder().append("wi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static ah a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ah var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        ah stackIn_15_0 = null;
        ah stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          if (null != pi.field_a &&
            param0 != null &&
            param0.length() != 0) {
            var2 = ui.a(1, (CharSequence) ((Object) param0));
            if (var2 == null) {
              stackIn_12_0 = null;
              return (ah) (stackIn_12_0);
            }
            if (param1 < 112) {
              stackIn_15_0 = (ah) null;
              return stackIn_15_0;
            }
            var3 = (ah) (pi.field_a.a((long)var2.hashCode(), (byte) 93));
            while (null != var3) {
              var4 = ui.a(1, (CharSequence) ((Object) var3.field_dc));
              if (var4.equals(var2)) {
                stackIn_20_0 = var3;
                return stackIn_20_0;
              }
              var3 = (ah) (pi.field_a.c((byte) 121));
              if (var5 == 0) {
                continue;
              }
              break;
            }
            stackIn_23_0 = null;
            return (ah) (stackIn_23_0);
          }
          stackIn_9_0 = null;
          return (ah) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_27_0 = var2_ref;
          stackIn_27_1 = new StringBuilder().append("wi.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(byte param0) {
        try {
          sl.field_m = mm.a(95);
          sb.field_Z = 0;
          if (param0 > -104) {
            field_y = -62;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "wi.A(" + param0 + ')');
        }
    }

    wi() {
    }

    static {
        field_G = "There are no valid types of game that match your preferences.";
    }
}
