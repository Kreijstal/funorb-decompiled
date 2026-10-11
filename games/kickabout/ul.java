/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static hd field_c;
    static String field_a;

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        cj.a(eb.field_b, el.field_I, sh.field_c, param2, false, param1, param3);
        if (!param0) {
          int[] var5 = (int[]) null;
          ul.a((kg) null, (byte) -34, (int[]) null);
        }
    }

    final static kg a(kg param0, byte param1, int[] param2) {
        kg var3 = null;
        RuntimeException var3_ref = null;
        kg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new kg(0, 0, 0);
          var3.field_a = param0.field_a;
          var3.field_i = param0.field_i;
          var3.field_d = param0.field_d;
          var3.field_k = param0.field_k;
          var3.field_b = param0.field_b;
          var3.field_h = param0.field_h;
          var3.field_l = param2;
          if (param1 < 44) {
            field_c = (hd) null;
          }
          var3.field_m = param0.field_m;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ul.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        try {
          if (param0 != -126) {
            field_c = (hd) null;
          }
          var2_int = -mc.field_a + 640 >> 1;
          var3 = 358;
          pt.a(mc.field_a + var2_int, -22914, var2_int, var3 + 112, var3);
          for (var4 = 0; mc.field_a > var4; var4++) {
            mk.field_a.d(var2_int + var4, var3 - 368);
          }
          on.c(var2_int, var3, mc.field_a, 112, 2, 65793);
          if (param1 != null) {
            un.field_d.a(param1.toLowerCase(), 20 + var2_int, var3 + 22, 16777215, -1);
          }
          var2_int += 10;
          ta.e(param0 ^ -7);
          var4Lifetime1 = 12 + ((mc.field_a + 640 >> 1) - 22);
          pt.a(320, param0 - 22788, var2_int, 480, 0);
          on.a(var2_int, 388, 640, 72, 8, 65793, 128);
          ta.e(122);
          pt.a(var4Lifetime1, -22914, 320, 480, 0);
          on.a(0, 388, var4Lifetime1, 72, 8, 65793, 128);
          ta.e(122);
          var5 = je.a(false);
          if (var5 != -1) {
            of.field_e = 1;
            if (var5 == 6 ||
              8 <= var5 &&
              var5 <= 13) {
              of.field_e = 3;
            }
            if (var5 >= 15) {
              of.field_e = 4;
            }
          }
          pt.a(-20 + (var2_int + mc.field_a), param0 ^ 23036, var2_int + 22 - 12, 112 + var3, var3);
          kj.a(et.field_d.field_H[0], param0 ^ -126, et.field_d.field_P[0][of.field_e].field_N, et.field_d.field_Q[0], et.field_d.field_d[0], false).c(12 + var2_int, var3 + 40);
          ta.e(120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("ul.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int var2;
        int var3;
        int var4;
        tj var5;
        var4 = Kickabout.field_G;
        var5 = et.field_d.field_V;
        if (param0 != 11) {
          return;
        }
        if (1 == ks.field_e) {
          ss.field_b.a(var5.a(true), var5.c(879306160), -100);
          return;
        }
        if (2 == ks.field_e) {
          if (mh.field_k.a(true) <= 477) {
            ss.field_b.a(448, 282, -76);
          } else {
            ss.field_b.a(448, 477, param0 - 82);
          }
          return;
        }
        if (ks.field_e == 3) {
          ss.field_b.a(810, 1110, param0 ^ -105);
          return;
        }
        if (ks.field_e == 4) {
          ss.field_b.a(ld.field_f.f(param0 - 102), ld.field_f.a(true), -93);
          return;
        }
        if (ks.field_e == 5) {
          if (sl.field_Eb) {
            ss.field_b.a(0, 0, -102);
          } else {
            ss.field_b.a(mh.field_k.f(-107), mh.field_k.a(true), param0 - 84);
          }
          return;
        }
        if (ks.field_e == 6) {
          ss.field_b.a(ld.field_f.f(-106), ld.field_f.a(true), -49);
          return;
        }
        if (ks.field_e == 7) {
          ss.field_b.a(var5.a(true), var5.c(879306160), -87);
          return;
        }
        if (ks.field_e == 8) {
          if (et.field_d.field_V.field_m != 0) {
            ss.field_b.a(var5.a(true), var5.c(879306160), -112);
          } else {
            ss.field_b.a(810, 1050, -108);
          }
          return;
        }
        if (ks.field_e == 9) {
          ss.field_b.a(mh.field_k.f(-92), mh.field_k.a(true), -72);
          return;
        }
        if (ks.field_e == 10) {
          ss.field_b.a(fc.field_c.f(param0 ^ -104), fc.field_c.a(true), -109);
          return;
        }
        if (ks.field_e == 11) {
          ss.field_b.a(var5.a(true), var5.c(879306160), -87);
          return;
        }
        if (ks.field_e == 12) {
          if (var5.field_m == 0) {
            ss.field_b.a(448, -20, -57);
          } else {
            if (var5.e(param0 ^ 112) >= 1638400) {
              ss.field_b.a(448, -20, -57);
            } else {
              if (var5.field_p <= 0) {
                ss.field_b.a(448, -20, -57);
              } else {
                ss.field_b.a(var5.a(true), var5.c(879306160), -117);
              }
            }
          }
          return;
        }
        if (ks.field_e != 13) {
          return;
        }
        if (var5.field_p < 0) {
          ss.field_b.a(0, 1344, -90);
          return;
        }
        if (var5.e(54) > 1638400) {
          ss.field_b.a(0, 1344, -90);
          return;
        }
        if (var5.field_m != 0) {
          ss.field_b.a(var5.a(true), var5.c(param0 ^ 879306171), param0 - 72);
          return;
        }
        stackIn_49_0 = (et.field_d.field_P[1][0].field_M <= 29360128) ? 0 : 1;
        var2 = stackIn_49_0;
        stackIn_52_0 = (var2 == 0) ? 515 : 380;
        var3 = stackIn_52_0;
        ss.field_b.a(var3, -4, -87);
        return;
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte param4, int param5, int param6, int param7, int param8, String param9) {
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        try {
          var11 = -64 / ((-60 - param4) / 50);
          var10_int = 8 + pb.field_C.c(param9, -10 + (param5 - 10), param6);
          if (param3) {
            stackIn_4_0 = param7;
            if (param1 > 0) {
              stackIn_5_1 = param0 - var10_int >> 1;
            } else {
              stackIn_5_1 = -4;
            }
            on.f(stackIn_4_0, stackIn_5_1 + param2, param5, var10_int, 10, 983040);
            stackIn_7_0 = param7;
            stackIn_7_1 = param2;
            if (0 >= param1) {
              stackIn_8_2 = -4;
            } else {
              stackIn_8_2 = -var10_int + param0 >> 1;
            }
            on.a(stackIn_7_0, stackIn_7_1 + stackIn_8_2, param5, var10_int, 10, 65793, 140);
          }
          pb.field_C.a(param9, param7 + 10, param2, -10 + param5 - 10, param0, 16777215, -1, param8, param1, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_13_0 = var10;
          stackIn_13_1 = new StringBuilder().append("ul.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > 122) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        ul.a(true, 12, 73, true);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_b = "overview";
        field_a = "Connection lost - attempting to reconnect";
    }
}
