/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj implements gl {
    private int field_a;
    private int field_c;
    static String field_g;
    static boolean field_k;
    private int field_f;
    static String field_e;
    private int field_h;
    private int field_i;
    private mm field_j;
    static ck field_d;
    private int field_b;

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == dj.field_cb) {
                break L0;
              } else {
                try {
                  L1: {
                    dj.field_cb.a(0L, (byte) -109);
                    dj.field_cb.a(de.field_V.field_r, (byte) 117, de.field_V.field_n, 24);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param0 != 64) {
                    return;
                  } else {
                    de.field_V.field_n = de.field_V.field_n + 24;
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            if (param0 != 64) {
              return;
            } else {
              de.field_V.field_n = de.field_V.field_n + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ke a(int param0, boolean param1) {
        ec var3 = null;
        ec var4 = null;
        ec var5 = null;
        ec var6 = null;
        ke var7 = null;
        ec var8 = null;
        ec var9 = null;
        ke var10 = null;
        ec var11 = null;
        L0: {
          var7 = new ke(4);
          var10 = var7;
          if (!ph.n(-30146)) {
            var7.a(new ec(22, sf.field_E[0], (mm) (Object) a.field_t), 127);
            var7.a(new ec(22, sf.field_E[1], (mm) (Object) a.field_t), 120);
            var7.a(new ec(22, sf.field_E[2], (mm) (Object) a.field_t), 117);
            var8 = var7.field_f[0];
            var3 = var8;
            var4 = var7.field_f[1];
            var7.field_f[2].field_n = 185;
            var4.field_n = 185;
            var8.field_n = 185;
            var7.field_f[0].field_l = 120 + -(var7.field_f[0].field_n / 2);
            var7.field_f[1].field_l = -(var7.field_f[1].field_n / 2) + 320;
            var7.field_f[2].field_l = -(var7.field_f[2].field_n / 2) + 520;
            var5 = var7.field_f[0];
            var6 = var7.field_f[1];
            var7.field_f[2].field_m = 372;
            var6.field_m = 372;
            var5.field_m = 372;
            break L0;
          } else {
            var9 = new ec(20, qn.field_rb, (mm) (Object) a.field_t);
            var9.field_l = 320 - var9.field_n / 2;
            var9.field_m = 372;
            var10.a(var9, 122);
            break L0;
          }
        }
        var11 = new ec(13, pc.field_f, (mm) (Object) a.field_t);
        var11.field_l = -(var11.field_n / 2) + 320;
        var11.field_m = 415;
        var10.a(var11, 115);
        var10.field_q = 272;
        var10.field_y = 500;
        var10.field_w = 70;
        var10.field_z = 76;
        var10.a(fc.field_e, param1, -129);
        if (param0 > -3) {
          field_e = null;
          return var10;
        } else {
          return var10;
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        b var12 = null;
        ce stackIn_3_0 = null;
        ce stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = client.field_A ? 1 : 0;
          if (param4 instanceof b) {
            stackOut_2_0 = (ce) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ce) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (b) (Object) stackIn_3_0;
          hk.a(param4.field_u + param1, param2 - -param4.field_D, param4.field_t, param4.field_y, ((qj) this).field_b);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = -(2 * var12.field_L) + param4.field_t;
        var8 = var12.field_L + param4.field_u + param1;
        var9 = param4.field_D + param2 + var12.field_K;
        hk.b(var8, var9, var7 + var8, var9, ((qj) this).field_i);
        if (param3 <= -60) {
          var10 = -1 + var12.b(true);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              if (null != ((qj) this).field_j) {
                ((qj) this).field_j.b(var12.field_E, var8 - -(var7 / 2), var12.field_K + ((qj) this).field_j.field_S + var9, ((qj) this).field_f, ((qj) this).field_c);
                return;
              } else {
                return;
              }
            } else {
              hk.e(var12.b(-1, var10) * var7 / var12.i(-15317) + var8, var9, ((qj) this).field_h, ((qj) this).field_a);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_g = null;
        if (param0 <= 118) {
            return;
        }
        field_e = null;
    }

    final static String a(byte[] param0, int param1) {
        if (param1 != 2) {
          field_k = false;
          return un.a(param0, 0, 0, param0.length);
        } else {
          return un.a(param0, 0, 0, param0.length);
        }
    }

    qj(mm param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((qj) this).field_f = param1;
        ((qj) this).field_h = param5;
        ((qj) this).field_a = param6;
        ((qj) this).field_c = param2;
        ((qj) this).field_b = param4;
        ((qj) this).field_j = param0;
        ((qj) this).field_i = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "On";
        field_e = "Location";
    }
}
