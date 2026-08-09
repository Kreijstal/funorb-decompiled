/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static String field_c;
    static bg field_b;
    static String field_a;

    final static void a(int param0, int param1, wb param2) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        ld var7 = sn.field_c;
        ld var8 = var7;
        var8.d((byte) -82, param1);
        var8.field_o = var8.field_o + 1;
        int var4 = var8.field_o;
        var8.c(1, 25564);
        var8.b((byte) 121, param2.field_w);
        var8.b((byte) 124, param2.field_v);
        var8.b((byte) 124, param2.field_s);
        var8.a((byte) 120, param2.field_u);
        var8.a((byte) 80, param2.field_o);
        var8.a((byte) 108, param2.field_t);
        if (param0 != -20680) {
            return;
        }
        try {
            var8.a((byte) 93, param2.field_n);
            var8.c(param2.field_r.length, 25564);
            for (var5 = 0; var5 < param2.field_r.length; var5++) {
                var7.a((byte) 109, param2.field_r[var5]);
            }
            var8.e(-118, var4);
            var8.g(-1, -var4 + var8.field_o);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ab.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, int param1, boolean param2, long param3, boolean param4) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var6;
        int var7;
        int var8;
        StringBuilder var9;
        int var10;
        int var11;
        int var12;
        var12 = MinerDisturbance.field_ab;
        if (param4) {
          L0: {
            var6 = 44;
            var7 = 46;
            if (param1 == 0) {
              var6 = 46;
              var7 = 44;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param1 != 2) {
              break L1;
            } else {
              var7 = 160;
              break L1;
            }
          }
          L2: {
            var8 = 0;
            if (-1L < (param3 ^ -1L)) {
              param3 = -param3;
              var8 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var9 = new StringBuilder(26);
            if ((param0 ^ -1) < -1) {
              var10 = 0;
              L4: while (true) {
                if (var10 >= param0) {
                  discarded$0 = var9.append((char) var6);
                  break L3;
                } else {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  discarded$1 = var9.append((char)(var11 + 48 + -(10 * (int)param3)));
                  var10++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          var10 = 0;
          L5: while (true) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            discarded$2 = var9.append((char)(48 + (var11 - 10 * (int)param3)));
            if (-1L == (param3 ^ -1L)) {
              L6: {
                if (var8 == 0) {
                  break L6;
                } else {
                  discarded$3 = var9.append('-');
                  break L6;
                }
              }
              return var9.reverse().toString();
            } else {
              if (param2) {
                var10++;
                if (0 == var10 % 3) {
                  discarded$4 = var9.append((char) var7);
                  continue L5;
                } else {
                  continue L5;
                }
              } else {
                continue L5;
              }
            }
          }
        } else {
          return (String) null;
        }
    }

    final static void a(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var5 = mg.field_e;
              var1 = var5;
              var2 = 0;
              if (param0 == -20707) {
                break L1;
              } else {
                field_b = (bg) null;
                break L1;
              }
            }
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "ab.A(" + param0 + ')');
        }
    }

    final static ci a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            ci var5 = null;
            vj var5_ref = null;
            wb var6 = null;
            ci stackIn_3_0 = null;
            vj stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("n");
                      if (param0 < -76) {
                        break L2;
                      } else {
                        var6 = (wb) null;
                        ab.a(-60, -22, (wb) null);
                        break L2;
                      }
                    }
                    var5 = (ci) (var4.newInstance());
                    var5.a(param2, param3, 13961, param1);
                    stackIn_3_0 = (ci) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new vj();
                  ((ci) ((Object) var5_ref)).a(param2, param3, 13961, param1);
                  stackIn_5_0 = (vj) (var5_ref);
                  return (ci) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("ab.G(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            kd.a((java.awt.Component) ((Object) param1), true);
            if (param0 == -13) {
              L1: {
                dl.a((java.awt.Component) ((Object) param1), (byte) 73);
                if (null != pf.field_e) {
                  pf.field_e.a((java.awt.Component) ((Object) param1), 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ab.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1267078881;
        param0 = param0 | param0 >>> -1203620670;
        param0 = param0 | param0 >>> -983899644;
        param0 = param0 | param0 >>> 1205186920;
        if (param1 != 15952) {
            return 103;
        }
        param0 = param0 | param0 >>> 681646512;
        return param0 - -1;
    }

    public static void b(int param0) {
        if (param0 != -14839) {
            ab.b(85);
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_c = null;
        field_b = new bg(4, 1, 1, 1);
        field_a = "to keep fullscreen or";
    }
}
