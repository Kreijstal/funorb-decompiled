/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jd extends lg implements sv {
    static String field_e;
    static int[] field_h;
    static String[] field_i;
    static ut[] field_d;
    static int[] field_g;
    private ga field_f;

    final static tv a(byte param0, boolean param1) {
        ml var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ml var8 = null;
        bg var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_20_0 = null;
        L0: {
          var7 = Kickabout.field_G;
          var8 = un.field_e;
          var2 = var8;
          var3 = var8.h((byte) -112);
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          lo.field_l = stackIn_3_0 != 0;
          jn.field_ob = 127 & var3;
          ie.field_F = var8.h((byte) -108);
          i.field_z = var8.i((byte) -124);
          if (jn.field_ob != 2) {
            sc.field_E = 0;
            cj.field_G = 0;
            break L1;
          } else {
            sc.field_E = var8.a((byte) 81);
            cj.field_G = var8.i(-119);
            break L1;
          }
        }
        L2: {
          if (var8.h((byte) -116) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          sr.field_d = var8.a(-114);
          if (var4 != 0) {
            hr.field_f = var8.a(69);
            break L3;
          } else {
            hr.field_f = sr.field_d;
            break L3;
          }
        }
        L4: {
          if (jn.field_ob == 1) {
            oh.field_f = var8.a((byte) 81);
            vp.field_e = var8.a(42);
            break L4;
          } else {
            if (jn.field_ob == 4) {
              oh.field_f = var8.a((byte) 81);
              vp.field_e = var8.a(42);
              break L4;
            } else {
              oh.field_f = 0;
              vp.field_e = null;
              break L4;
            }
          }
        }
        if (!param1) {
          ee.field_a = gw.a(80, (byte) -96, (iw) (Object) var8);
          gk.field_b = null;
          return new tv(param1);
        } else {
          var5 = var8.a((byte) 81);
          try {
            L5: {
              L6: {
                var9 = lm.field_j.a(-39, var5);
                ee.field_a = var9.g((byte) -98);
                if (hr.field_f.equals((Object) (Object) ow.field_e)) {
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = var9.field_n;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              gk.field_b = stackIn_22_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            bd.a("CC1", (Throwable) (Object) var6, 1);
            ee.field_a = null;
            gk.field_b = null;
            return new tv(param1);
          }
          return new tv(param1);
        }
    }

    abstract rv a(String param0, int param1);

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -28) {
          if (((jd) this).field_f.field_q != null) {
            if (((jd) this).field_f.field_q.length() == 0) {
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
          field_h = null;
          if (((jd) this).field_f.field_q == null) {
            return true;
          } else {
            L0: {
              if (((jd) this).field_f.field_q.length() != 0) {
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

    final rv a(boolean param0) {
        if (param0) {
          rv discarded$2 = ((jd) this).a(true);
          return ((jd) this).a(((jd) this).field_f.field_q, -5);
        } else {
          return ((jd) this).a(((jd) this).field_f.field_q, -5);
        }
    }

    public final void a(int param0, ga param1) {
        try {
            int var3_int = -82 % ((param0 - 8) / 47);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "jd.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(byte param0, ga param1) {
        if (param0 < 65) {
            return;
        }
        try {
            ((jd) this).a(116);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "jd.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        po.a(-27, param1);
        int discarded$0 = 15;
        jg.a(13, (byte) -26, param1);
    }

    final String e(int param0) {
        if (param0 != -1) {
            return null;
        }
        return ((jd) this).a((byte) 25, ((jd) this).field_f.field_q);
    }

    jd(ga param0) {
        try {
            ((jd) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "jd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    abstract String a(byte param0, String param1);

    public static void b() {
        int var1 = 0;
        field_g = null;
        field_d = null;
        field_e = null;
        field_h = null;
        field_i = null;
    }

    final static boolean f(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (!la.a(100)) {
            if (eq.field_d <= 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "quickplay";
        field_h = new int[8192];
        field_i = new String[]{"Match me up with a player of similar rating", "Match me up with a player in the same, or nearest league", "Match me up with a player who's team is of a similar level"};
    }
}
