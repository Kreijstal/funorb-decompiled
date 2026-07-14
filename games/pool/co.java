/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class co extends eq {
    private sl field_bb;
    private sl field_eb;
    private sl field_Z;
    static int field_db;
    private boolean field_cb;
    static int[] field_ab;

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        param8 = param8 - param5[1];
        param6 = param6 - param5[0];
        param1 = param1 - param5[1];
        param2 = param2 - param5[2];
        param7 = param7 - param5[2];
        param9 = param9 - param5[0];
        var10 = param5[9] * param9 + param1 * param5[10] + param7 * param5[11] >> -2026476080;
        if (var10 <= 0) {
          return;
        } else {
          var11 = param6 * param5[9] + param8 * param5[10] + param2 * param5[11] >> -519630352;
          if (var11 <= 0) {
            return;
          } else {
            var12 = param5[4] * param1 + param9 * param5[3] + param7 * param5[5] >> 27126919;
            var13 = param7 * param5[8] + param1 * param5[7] + param5[6] * param9 >> 829452231;
            var14 = param5[4] * param8 + (param6 * param5[3] + param2 * param5[5]) >> -1958439289;
            var13 = fb.field_d + (qh.field_c + var13 / var10);
            var12 = fb.field_q + (qh.field_b - -(var12 / var10));
            var15 = param8 * param5[param0] + param6 * param5[6] + param2 * param5[8] >> -56908889;
            var14 = var14 / var11 + fb.field_q + qh.field_b;
            var15 = fb.field_d + qh.field_c + var15 / var11;
            qh.b(var12, var13, var14, var15, param4, param3);
            return;
          }
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 <= -79) {
          param0 = o.a('_', "", param0, 1);
          var3 = qa.a(param2, 0);
          if (0 == param0.indexOf(param2)) {
            if (0 != param0.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_db = 112;
          param0 = o.a('_', "", param0, 1);
          var3 = qa.a(param2, 0);
          if (0 != param0.indexOf(param2)) {
            return true;
          } else {
            L0: {
              if (0 == param0.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_ab = null;
            field_ab = null;
            return;
        }
        field_ab = null;
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 25) {
            break L0;
          } else {
            int discarded$2 = ((co) this).h((byte) 122);
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((co) this).field_bb.field_m) + -1;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final boolean g(byte param0) {
        if (null != ((co) this).field_Z.field_m) {
          if (((co) this).field_Z.field_m.length() != 0) {
            if (null != ((co) this).field_bb.field_m) {
              if (((co) this).field_bb.field_m.length() != 0) {
                if (null != ((co) this).field_eb.field_m) {
                  if (((co) this).field_eb.field_m.length() != 0) {
                    if (param0 != 114) {
                      field_db = -125;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final String e(int param0) {
        String var2 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        String stackOut_6_0 = null;
        if (param0 <= -10) {
          var2 = ((co) this).field_bb.e(-122);
          if (var2 == null) {
            if (!((co) this).field_s) {
              return null;
            } else {
              L0: {
                if (((co) this).field_p != null) {
                  stackOut_7_0 = ((co) this).field_p;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = ((co) this).field_m;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0;
            }
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    co(fp param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((co) this).a(param4, param2, param5, false, param3);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, param2, param3, param4);
        var6 = -130 + param0 >> 1863653953;
        if (((co) this).field_cb) {
          ((co) this).field_bb.a(25, var6, param2, false, 0);
          ((co) this).field_Z.a(25, 45 + var6, param2, param3, 0);
          ((co) this).field_eb.a(40, var6 + 90, param2, false, 0);
          return;
        } else {
          ((co) this).field_Z.a(25, var6, param2, false, 0);
          ((co) this).field_bb.a(25, var6 - -45, param2, false, 0);
          ((co) this).field_eb.a(40, var6 + 90, param2, false, 0);
          return;
        }
    }

    final int h(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            if (param0 > 13) {
              break L0;
            } else {
              ((co) this).field_Z = null;
              break L0;
            }
          }
          stackOut_2_0 = Integer.parseInt(((co) this).field_eb.field_m);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final void a(int param0, sn param1) {
        super.a(param0, param1);
        ((co) this).field_Z.field_t = (cc) (Object) param1;
        ((co) this).field_bb.field_t = (cc) (Object) param1;
        ((co) this).field_eb.field_t = (cc) (Object) param1;
    }

    private co(fp param0, boolean param1) {
        super(0, 0, 0, 0, (fp) null);
        ((co) this).field_Z = (sl) (Object) new ga("", (cc) null, 2);
        ((co) this).field_bb = (sl) (Object) new ga("", (cc) null, 2);
        ((co) this).field_eb = (sl) (Object) new ga("", (cc) null, 4);
        ((co) this).field_cb = param1 ? true : false;
        ((co) this).field_eb.field_z = param0;
        ((co) this).field_bb.field_z = param0;
        ((co) this).field_Z.field_z = param0;
        if (!((co) this).field_cb) {
            ((co) this).a(true, (ei) (Object) ((co) this).field_Z);
            ((co) this).a(true, (ei) (Object) ((co) this).field_bb);
        } else {
            ((co) this).a(true, (ei) (Object) ((co) this).field_bb);
            ((co) this).a(true, (ei) (Object) ((co) this).field_Z);
        }
        ((co) this).a(true, (ei) (Object) ((co) this).field_eb);
    }

    final int h(byte param0) {
        NumberFormatException var2 = null;
        Object var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == -119) {
            break L0;
          } else {
            var3 = null;
            ((co) this).a(-106, (sn) null);
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((co) this).field_Z.field_m);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -104, param2, param3);
        if (!(-1 == (param0 ^ -1))) {
            return;
        }
        param3 = param3 + ((co) this).field_D;
        param2 = param2 + ((co) this).field_C;
        int var5 = 30 % ((-42 - param1) / 53);
        this.a(param2, param3, 75, (ei) (Object) ((co) this).field_Z, dp.field_h);
        this.a(param2, param3, 114, (ei) (Object) ((co) this).field_bb, pc.field_c);
        this.a(param2, param3, 91, (ei) (Object) ((co) this).field_eb, bb.field_a);
    }

    private final void a(int param0, int param1, int param2, ei param3, String param4) {
        if (param2 <= 65) {
          return;
        } else {
          qk.field_a.b(param4, (param3.field_l >> -2008029759) + param0 - -param3.field_C, -5 + (param3.field_D + param1), 16777215, -1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
