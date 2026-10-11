/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String[] field_b;
    static String field_c;
    static int field_a;

    final static void a(vr param0, boolean param1, ln param2, byte param3) {
        int var5 = 0;
        ln[] var4 = null;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 != -2) {
            field_b = (String[]) null;
          }
          if (param0.field_k) {
            param2.field_N = 0;
            return;
          }
          if (param0.field_l) {
            param2.field_N = 1;
            return;
          }
          param2.field_N = 0;
          var8 = param2.field_D;
          var4 = var8;
          for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (param2.field_y != var6.field_y ||
              param1 &&
              ec.field_r[var6.field_p]) {
              param2.field_N = param2.field_N + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("kd.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, byte[] param4, CharSequence param5) {
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6_int = -param1 + param0;
          if (param2 != -97) {
            stackIn_3_0 = -19;
            return stackIn_3_0;
          }
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param5.charAt(param1 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[param3 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param4[var7 + param3] = (byte)-126;
                    break;
                  case 402:
                    param4[param3 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param4[var7 + param3] = (byte)-124;
                    break;
                  case 8230:
                    param4[param3 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param4[var7 + param3] = (byte)-122;
                    break;
                  case 8225:
                    param4[var7 + param3] = (byte)-121;
                    break;
                  case 710:
                    param4[param3 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param4[var7 + param3] = (byte)-119;
                    break;
                  case 352:
                    param4[param3 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param4[param3 + var7] = (byte)-117;
                    break;
                  case 338:
                    param4[param3 + var7] = (byte)-116;
                    break;
                  case 381:
                    param4[var7 + param3] = (byte)-114;
                    break;
                  case 8216:
                    param4[var7 + param3] = (byte)-111;
                    break;
                  case 8217:
                    param4[var7 + param3] = (byte)-110;
                    break;
                  case 8220:
                    param4[param3 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param4[var7 + param3] = (byte)-108;
                    break;
                  case 8226:
                    param4[var7 + param3] = (byte)-107;
                    break;
                  case 8211:
                    param4[param3 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param4[var7 + param3] = (byte)-105;
                    break;
                  case 732:
                    param4[var7 + param3] = (byte)-104;
                    break;
                  case 8482:
                    param4[param3 + var7] = (byte)-103;
                    break;
                  case 353:
                    param4[var7 + param3] = (byte)-102;
                    break;
                  case 8250:
                    param4[param3 + var7] = (byte)-101;
                    break;
                  case 339:
                    param4[param3 + var7] = (byte)-100;
                    break;
                  case 382:
                    param4[var7 + param3] = (byte)-98;
                    break;
                  default:
                    param4[var7 + param3] = (byte)63;
                    break;
                  case 376:
                    param4[param3 + var7] = (byte)-97;
                    break;
                }
              } else {
                param4[var7 + param3] = (byte)var8;
              }
            }
          }
          stackIn_70_0 = var6_int;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("kd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_35_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_41_2 = false;
        v stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        v var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -119) {
            return;
          }
          var1_int = uq.field_k;
          var2 = 0;
          if (2 == eh.field_C) {
            var3_long = pr.a(14274) - br.field_p;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; var3 < kr.field_f.length; var3++) {
            var4 = ss.field_a[var3];
            if (0 <= var4) {
              if (dc.field_l.field_c == var4) {
                var5 = es.field_n;
              } else {
                var5 = ah.field_P;
              }
            } else {
              var5 = rm.field_b;
            }
            var6 = kr.field_f[var3];
            if (eh.field_C == 2 &&
              var2 == 1) {
              if (kp.field_o.length >= el.field_d.length) {
                stackIn_20_0 = kp.field_o.length;
              } else {
                stackIn_20_0 = el.field_d.length;
              }
              var7 = stackIn_20_0;
              if (hm.field_p.length > field_b.length) {
                stackIn_23_0 = hm.field_p.length;
              } else {
                stackIn_23_0 = field_b.length;
              }
              var8 = stackIn_23_0;
              if (var3 >= 6 &&
                var3 < var7 + 6) {
                if (kp.field_o.length + var3 + (-6 - var7) < 0) {
                  stackIn_29_0 = "";
                } else {
                  stackIn_29_0 = kp.field_o[-6 + var3 - (-kp.field_o.length + var7)];
                }
                var6 = stackIn_29_0;
              }
              if (var7 + 7 <= var3 &&
                var3 < var8 + 7 + var7) {
                if (-var7 + (var3 - 7) < field_b.length) {
                  stackIn_35_0 = field_b[-7 + (var3 - var7)];
                } else {
                  stackIn_35_0 = "";
                }
                var6 = stackIn_35_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            stackIn_40_0 = var6;
            stackIn_40_1 = 0;
            stackIn_41_2 = !(var4 < 0);
            var7Lifetime1 = vm.a(stackIn_40_0, stackIn_40_1, stackIn_41_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + cn.field_w;
            if (0 <= var4) {
              var1_int = var1_int + sm.field_b;
              if (dc.field_l.field_c == var4) {
                stackIn_45_0 = cs.field_l;
              } else {
                stackIn_45_0 = kr.field_a;
              }
              var9 = stackIn_45_0;
              if (var9 != null) {
                var9.a((ar.field_i << 1) + id.field_b, -tr.field_Lb + var8Lifetime1, var1_int, (tr.field_Lb << 1) + var7Lifetime1, -106);
              }
              var1_int = var1_int + ar.field_i;
            }
            if (0 <= var4) {
              ql.field_n.d(var6, var8Lifetime1, var1_int + je.field_g, var5, -1);
              var1_int = var1_int + (id.field_b + (sm.field_b + ar.field_i));
            } else {
              um.field_c.d(var6, var8Lifetime1, dp.field_v + var1_int, var5, -1);
              var1_int = var1_int + e.field_d;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kd.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 <= 74) {
          kd.a((byte) -48);
        }
    }

    final static void a(int param0, int param1) {
        if (ah.field_U >= param1) {
          return;
        }
        if (param0 != 23299) {
          field_c = (String) null;
        }
        u.field_c = new int[param1];
        cb.field_o = new int[param1];
        ah.field_U = param1;
        wb.field_b = new int[param1];
        rl.field_b = new boolean[param1];
        ol.field_a = new int[param1];
        hs.field_i = new int[param1];
        oe.field_i = new int[param1];
        u.field_d = new int[param1];
        ei.field_d = new int[param1];
        ig.field_c = new int[param1];
        ue.field_e = new int[param1];
        ja.field_i = new int[param1];
    }

    static {
        field_c = "Offer draw";
    }
}
