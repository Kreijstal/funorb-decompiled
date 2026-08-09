/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends qf implements Cloneable {
    static ko field_x;
    static dl[] field_y;

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = CrazyCrystals.field_B;
          if (param5 == 4261) {
            break L0;
          } else {
            bb.b(true);
            break L0;
          }
        }
        if (!this.field_u) {
          if (24 == param2) {
            if (param3 != 24) {
              jm.field_i.b(param1, -param3 + param4, 2 * param2, 3 * param3);
              return;
            } else {
              jm.field_i.a(param1, -param3 + param4);
              return;
            }
          } else {
            jm.field_i.b(param1, -param3 + param4, 2 * param2, 3 * param3);
            return;
          }
        } else {
          var7 = param2 + param1 << 1817689252;
          var8 = (param4 << -269689820) - -(param3 << -409829213);
          var9 = param2 * 4096 / 24;
          var10 = (int)(1024.0 * Math.random() - 512.0);
          jm.field_i.a(384, 576, var7, var8, var10, var9);
          return;
        }
    }

    bb(f param0) {
        super(param0);
    }

    public static void b(boolean param0) {
        field_y = null;
        field_x = null;
        if (!param0) {
            field_x = (ko) null;
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        sl stackIn_4_0 = null;
        sl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 >= param3) {
                break L1;
              } else {
                fp.field_c.a(64, param4 * 12, 12 * param1, 0, (byte) -111);
                break L1;
              }
            }
            if (!param2) {
              stackIn_6_0 = super.a(param0, param1, false, param3, param4, param5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (sl) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7);

            stackIn_9_1 = new StringBuilder().append("bb.R(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 23525) {
              stackIn_4_0 = ng.a(ii.field_e, param1, new bb(new kp(-1)), (byte) -83, rl.field_g);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bb.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean c(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                bb.b(false);
                break L1;
              }
            }
            fn.field_j = fn.field_j - 5;
            mb.field_g = mb.field_g - 5;
            fp.field_a = fp.field_a + 10;
            je.field_j = je.field_j + 5;
            b.field_a = b.field_a + 5;
            we.field_h = we.field_h + 10;
            bc.field_a.a(64, 12 * param3, param1 * 12, 0, (byte) -111);
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("bb.KA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_s > 0) {
                fp.field_c.a(64, this.field_o * this.field_m + param3 * 12, this.field_m * this.field_s + param1 * 12, 0, (byte) -111);
                break L1;
              } else {
                break L1;
              }
            }
            var5_int = -102 % ((-43 - param2) / 51);
            stackIn_4_0 = super.b(param0, param1, (byte) -105, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("bb.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    static {
    }
}
