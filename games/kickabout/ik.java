/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends tm {
    static String field_F;
    static String field_E;
    static tf field_C;
    static long field_A;
    static int field_D;

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            ik.a((byte) -8, 27, -76, -11, 111, 51, -121, -63);
          }
          stackIn_3_0 = new li(jc.a(param1[0].b(-30368), true));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ik.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_6_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        nl stackIn_40_2 = null;
        int stackIn_41_3 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        nl stackIn_44_2 = null;
        int stackIn_45_3 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        nl stackIn_62_2 = null;
        int stackIn_63_3 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        nl stackIn_66_2 = null;
        int stackIn_67_3 = 0;
        int stackIn_78_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        nl stackIn_85_2 = null;
        int stackIn_86_3 = 0;
        int stackIn_96_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        nl stackIn_102_2 = null;
        int stackIn_103_3 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        nl stackIn_106_2 = null;
        int stackIn_107_3 = 0;
        nl var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        nl var14;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        var14 = et.field_d.field_P[1][param6 + 1];
        var8 = var14;
        var9 = th.field_c[param6];
        var10 = te.field_a[param6];
        if ((param5 - 5) <= param1 &&
          (param7 + 5) >= param1 &&
          (param4 - 5) <= param3 &&
          param2 + 5 >= param3) {
          stackIn_6_0 = 1;
        } else {
          stackIn_6_0 = 0;
        }
        var11 = stackIn_6_0;
        if (var14.field_u != 7 &&
          var14.field_u != 8 &&
          var14.field_u != 9) {
          if (var14.field_u == 10) {
            if (var14.field_u == 8) {
              var14.field_L = var14.field_L + 1;
            }
            var8.field_G = 0;
            return;
          }
          if (var14.field_u != 3 &&
            var14.field_u != 12) {
            if (var11 == 0) {
              if (ld.field_f.field_u != 9 &&
                7 != ld.field_f.field_u &&
                ld.field_f.field_u != 12 &&
                ld.field_f.field_u != 3 &&
                ld.field_f.field_u != 10) {
                stackIn_34_0 = 1;
              } else {
                stackIn_34_0 = 0;
              }
              var12 = stackIn_34_0;
              var13 = 0 / ((-30 - param0) / 52);
              stackIn_44_0 = 10;
              stackIn_44_1 = var10;
              stackIn_44_2 = var8;
              stackIn_45_3 = (param6 == 1) ? 8 : 2;
              nq.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_45_3, (byte) 69, var9);
              return;
            }
            if (0 != et.field_d.field_V.field_m) {
              if (ld.field_f.field_u != 9 &&
                7 != ld.field_f.field_u &&
                ld.field_f.field_u != 12 &&
                ld.field_f.field_u != 3 &&
                ld.field_f.field_u != 10) {
                stackIn_56_0 = 1;
              } else {
                stackIn_56_0 = 0;
              }
              var12Lifetime1 = stackIn_56_0;
              var13Lifetime1 = 0 / ((-30 - param0) / 52);
              if (et.field_d.field_V.field_m == -1) {
                nq.a(30, param3, var14, 0, (byte) 42, param1);
                return;
              }
              if (et.field_d.field_V.field_m == 0) {
                if (var12Lifetime1 != 0) {
                  nq.a(30, param3, var14, 0, (byte) 42, param1);
                } else {
                  stackIn_62_0 = 10;
                  stackIn_62_1 = var10;
                  stackIn_62_2 = var8;
                  stackIn_63_3 = (param6 == 1) ? 8 : 2;
                  nq.a(stackIn_62_0, stackIn_62_1, stackIn_62_2, stackIn_63_3, (byte) 69, var9);
                }
                return;
              }
              stackIn_66_0 = 10;
              stackIn_66_1 = var10;
              stackIn_66_2 = var8;
              stackIn_67_3 = (param6 == 1) ? 8 : 2;
              nq.a(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_67_3, (byte) 69, var9);
              return;
            }
            var12Lifetime2 = -var14.a(true) + param3;
            var13Lifetime2 = param1 - var14.f(-124);
            if (var12Lifetime2 * var12Lifetime2 + var13Lifetime2 * var13Lifetime2 < 3600) {
              var14.b(0, -1);
              if (ld.field_f.field_u != 9 &&
                7 != ld.field_f.field_u &&
                ld.field_f.field_u != 12 &&
                ld.field_f.field_u != 3 &&
                ld.field_f.field_u != 10) {
                stackIn_78_0 = 1;
              } else {
                stackIn_78_0 = 0;
              }
              var12Lifetime2 = stackIn_78_0;
              var13Lifetime2 = 0 / ((-30 - param0) / 52);
              if (et.field_d.field_V.field_m == -1) {
                nq.a(30, param3, var14, 0, (byte) 42, param1);
                return;
              }
              if (et.field_d.field_V.field_m == 0 &&
                var12Lifetime2 != 0) {
                nq.a(30, param3, var14, 0, (byte) 42, param1);
                return;
              }
              stackIn_85_0 = 10;
              stackIn_85_1 = var10;
              stackIn_85_2 = var8;
              stackIn_86_3 = (param6 == 1) ? 8 : 2;
              nq.a(stackIn_85_0, stackIn_85_1, stackIn_85_2, stackIn_86_3, (byte) 69, var9);
              return;
            }
            if (ld.field_f.field_u != 9 &&
              7 != ld.field_f.field_u &&
              ld.field_f.field_u != 12 &&
              ld.field_f.field_u != 3 &&
              ld.field_f.field_u != 10) {
              stackIn_96_0 = 1;
            } else {
              stackIn_96_0 = 0;
            }
            var12Lifetime3 = stackIn_96_0;
            var13Lifetime3 = 0 / ((-30 - param0) / 52);
            if (et.field_d.field_V.field_m == -1) {
              nq.a(30, param3, var14, 0, (byte) 42, param1);
              return;
            }
            if (et.field_d.field_V.field_m == 0) {
              if (var12Lifetime3 != 0) {
                nq.a(30, param3, var14, 0, (byte) 42, param1);
              } else {
                stackIn_102_0 = 10;
                stackIn_102_1 = var10;
                stackIn_102_2 = var8;
                stackIn_103_3 = (param6 == 1) ? 8 : 2;
                nq.a(stackIn_102_0, stackIn_102_1, stackIn_102_2, stackIn_103_3, (byte) 69, var9);
              }
              return;
            }
            stackIn_106_0 = 10;
            stackIn_106_1 = var10;
            stackIn_106_2 = var8;
            stackIn_107_3 = (param6 == 1) ? 8 : 2;
            nq.a(stackIn_106_0, stackIn_106_1, stackIn_106_2, stackIn_107_3, (byte) 69, var9);
            return;
          }
          if (0 == et.field_d.field_V.field_m) {
            if (var11 == 0) {
              return;
            }
            nq.a(30, param3, var14, 0, (byte) 112, param1);
          }
          return;
        }
        if (var14.field_u == 8) {
          var14.field_L = var14.field_L + 1;
        }
        var8.field_G = 0;
    }

    public static void g(int param0) {
        int var1 = -87 % ((58 - param0) / 50);
        field_C = null;
        field_E = null;
        field_F = null;
    }

    ik(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(float param0, String param1, boolean param2, byte param3) {
        try {
          if (nm.field_d == null) {
            nm.field_d = new oj(wd.field_l, st.field_m);
            wd.field_l.a(nm.field_d, false);
          }
          if (param3 < 71) {
            ik.a((byte) -14, 61, 24, 8, -65, -11, 102, -101);
          }
          nm.field_d.a(param1, param0, 9255, param2);
          on.b();
          oa.a((byte) -106, true);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ik.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_E = "Too Low";
        field_F = "Game options";
        field_C = new tf();
    }
}
