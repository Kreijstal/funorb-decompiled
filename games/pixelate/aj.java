/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends fa {
    int[] field_r;
    static gp field_k;
    static long field_m;
    static int field_t;
    int[] field_u;
    int field_p;
    static int field_n;
    int field_s;
    ei[] field_v;
    byte[][][] field_w;
    int[] field_q;
    ei[] field_l;
    static int[] field_o;

    final static Object a(boolean param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bh var4 = null;
        Object stackIn_2_0 = null;
        bh stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              var3_int = -39 / ((param2 - -35) / 52);
              if (param1.length <= 136) {
                if (param0) {
                  stackIn_10_0 = re.a(true, param1);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) (param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var4 = new bh();
                ((gf) ((Object) var4)).a(param1, true);
                stackIn_5_0 = (bh) (var4);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("aj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_o = null;
        if (param0 != -38) {
            return;
        }
        field_k = null;
    }

    final static void a(fm param0, fm param1, boolean param2, int param3) {
        try {
            nk.a(eg.field_k, c.field_Y, ug.field_s, sc.field_g, (byte) 125, kj.field_l, dn.field_c, bl.field_d, qk.field_d, param2, mg.field_h, l.field_q);
            h.field_V = eh.a("chatfilter", "lobby", (byte) 47, param1);
            rg.field_a[1] = a.field_J;
            int var4_int = -115 % ((param3 - 44) / 59);
            rg.field_a[0] = kc.field_m;
            rg.field_a[2] = wd.field_e;
            ck.a(65793, ig.field_d, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "aj.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean b(byte param0) {
        byte[] var2;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        if (param0 <= -42) {
          if (!ik.field_a) {
            if (jg.a((byte) 78)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (!db.field_U) {
              L0: {
                if (!jg.a((byte) 78)) {
                  stackIn_21_0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 1;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackIn_17_0 = 1;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          var2 = (byte[]) null;
          aj.a(false, (byte[]) null, -36);
          if (ik.field_a) {
            if (db.field_U) {
              return true;
            } else {
              L1: {
                if (!jg.a((byte) 78)) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (!jg.a((byte) 78)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    aj() {
    }

    static {
        field_o = new int[]{303, 375, 440, 498, 560};
    }
}
