/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    static tf field_b;
    static ii field_e;
    static boolean field_d;
    static int field_a;
    static int field_c;
    static String field_f;

    final static void a(int param0, boolean param1) {
        pc var2 = aa.field_f;
        var2.g(param0, 15514);
        var2.e(160, 2);
        var2.e(160, 4);
        if (param1) {
          var2.e(160, hk.a((byte) -102));
          return;
        }
        ro.b(16, true);
        var2.e(160, hk.a((byte) -102));
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        if (param0) {
          field_b = (tf) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        pc var2 = aa.field_f;
        var2.g(param1, 15514);
        if (param0 > 124) {
          var2.e(160, 1);
          var2.e(160, 2);
          return;
        }
    }

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fm.field_b != null) {
            fm.field_b.field_W.a((byte) -98, args);
          }
          if (param1 != 2) {
            return;
          }
          if (aa.field_c == null) {
            return;
          }
          aa.field_c.field_S.a((byte) -90, args);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ro.F(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, tf[][] param1, int param2, int param3, fm param4, String[] param5, int[] param6, String[][] param7, hh[] param8, int param9, int[] param10, byte[] param11, String[][] param12, fm param13, tf[][] param14, byte[] param15, fm param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        String[] var19 = null;
        try {
          var19 = (String[]) null;
          d.a(param16, param13, true, param11, param7, param2, param8, param6, (String[]) null, 1, param0, param12, param9, param10, param1, param4, param5, param15, param14);
          if (param3 != -15690) {
            var18 = (String[]) null;
            ro.a((String[]) null, -104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("ro.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param7 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param11 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param12 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param13 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param15 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static int b(int param0, boolean param1) {
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_84_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          oe.field_Sb = oe.field_Sb + 65536;
          while (fp.a(true, ui.field_j, oe.field_Sb) >= 65536) {
            oe.field_Sb = oe.field_Sb - ui.field_j;
            qk.field_e = qk.field_e + 1;
          }
          var2_int = -1;
          if (wg.field_g != null) {
            var2_int = wg.field_g.length;
          } else {
            if (li.field_a != null) {
              var2_int = li.field_a.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (ui.field_a > jn.field_q) {
              jn.field_q = jn.field_q + 1;
              if (ui.field_k < jn.field_q && (null == wg.field_g ||
                null == wg.field_g[ae.field_b])) {
                jn.field_q = jn.field_q - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (jn.field_q >= ui.field_a &&
                  wg.field_g[(ae.field_b + 1) % var2_int] == null) {
                  jn.field_q = jn.field_q - 1;
                }
              }
            }
            if (ui.field_a <= jn.field_q) {
              jc.field_b = ae.field_b;
              if (!pm.field_e) {
                ae.field_b = ae.field_b - 1;
                if (ae.field_b < 0) {
                  ae.field_b = ae.field_b + var2_int;
                }
              } else {
                ae.field_b = ae.field_b + 1;
                if (ae.field_b >= var2_int) {
                  ae.field_b = ae.field_b - var2_int;
                }
              }
              jn.field_q = jn.field_q - ui.field_a;
            }
            if (jn.field_q > ui.field_k) {
              pm.field_e = true;
            }
          }
          if (param0 >= -21) {
            field_c = 69;
          }
          if (gp.field_Kb != null) {
            var3 = 357 - gp.field_Kb.field_B / 2;
            var4 = 0;
            if (nm.field_c != 0 &&
              ji.field_c > var3 &&
              ji.field_c < gp.field_Kb.field_E + var3) {
              if (-gp.field_Kb.field_F + 269 < uo.field_a &&
                269 > uo.field_a) {
                jn.field_q = ui.field_a;
                pm.field_e = false;
                var4 = 1;
              }
              if (586 < uo.field_a &&
                uo.field_a < 586 + gp.field_Kb.field_F) {
                var4 = 1;
                pm.field_e = true;
                jn.field_q = ui.field_a;
              }
            }
            if (var4 == 0 &&
              jn.field_q > ui.field_k &&
              bg.field_k > var3 &&
              var3 + gp.field_Kb.field_E > bg.field_k) {
              if (uf.field_d > -gp.field_Kb.field_F + 269 &&
                269 > uf.field_d) {
                jn.field_q = ui.field_k;
              }
              if (uf.field_d > 586 &&
                uf.field_d < gp.field_Kb.field_F + 586) {
                jn.field_q = ui.field_k;
              }
            }
          }
          if (param1) {
            a.field_I.a(el.a(ji.field_c, (byte) 126, uo.field_a), el.a(bg.field_k, (byte) -77, uf.field_d), -1);
            if (a.field_I.a(19)) {
              if (a.field_I.field_j == 0) {
                stackIn_63_0 = 3;
                return stackIn_63_0;
              }
              if (a.field_I.field_j == 1) {
                stackIn_67_0 = 2;
                return stackIn_67_0;
              }
            }
            stackIn_70_0 = 116;
            while (bh.$cfr$intArgs$b$c4997cb15529(stackIn_70_0)) {
              a.field_I.a(99, 0);
              if (a.field_I.a(57)) {
                if (a.field_I.field_j == 0) {
                  stackIn_75_0 = 3;
                  return stackIn_75_0;
                }
                if (a.field_I.field_j == 1) {
                  stackIn_79_0 = 1;
                  return stackIn_79_0;
                }
              }
              if (ke.field_a != 13) {
                stackIn_70_0 = 116;
                continue;
              }
              stackIn_82_0 = 1;
              return stackIn_82_0;
            }
          }
          stackIn_84_0 = 0;
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ro.D(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_f = "Twisted Logic";
    }
}
