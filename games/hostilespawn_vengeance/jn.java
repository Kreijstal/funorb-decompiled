/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends fc {
    int field_D;
    static String field_K;
    static String field_E;
    static bd field_B;
    static boolean field_C;
    static p[] field_F;
    static String[] field_I;
    static int field_J;
    static vm field_G;
    static vl field_H;

    final static void l(int param0) {
        Object var2 = null;
        ij.a((byte) -17, (ji) null);
    }

    public jn() {
        super(0, 0, 0, 0, (nn) null, (mh) null);
        ((jn) this).field_D = 256;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        bd var8 = null;
        bd var9 = null;
        if (0 != param3) {
          return;
        } else {
          if (null != ((jn) this).field_A) {
            if (param2 >= 42) {
              if (((jn) this).field_D == 0) {
                return;
              } else {
                if (256 == ((jn) this).field_D) {
                  ((jn) this).field_A.a(param0 + ((jn) this).field_m, param1 + ((jn) this).field_v, (byte) 110, param3);
                  return;
                } else {
                  var9 = new bd(((jn) this).field_A.field_s, ((jn) this).field_A.field_x);
                  sb.a(var9, -125);
                  ((jn) this).field_A.a(0, 0, (byte) 60, param3);
                  eh.b(false);
                  var9.b(((jn) this).field_v + param1, param0 - -((jn) this).field_m, ((jn) this).field_D);
                  return;
                }
              }
            } else {
              var6 = null;
              jn.a((int[]) null, -119, -105, 49, -23);
              if (((jn) this).field_D == 0) {
                return;
              } else {
                if (256 == ((jn) this).field_D) {
                  ((jn) this).field_A.a(param0 + ((jn) this).field_m, param1 + ((jn) this).field_v, (byte) 110, param3);
                  return;
                } else {
                  var8 = new bd(((jn) this).field_A.field_s, ((jn) this).field_A.field_x);
                  sb.a(var8, -125);
                  ((jn) this).field_A.a(0, 0, (byte) 60, param3);
                  eh.b(false);
                  var8.b(((jn) this).field_v + param1, param0 - -((jn) this).field_m, ((jn) this).field_D);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void k(int param0) {
        Object var2 = null;
        field_E = null;
        field_K = null;
        field_H = null;
        field_F = null;
        if (param0 != 608) {
          var2 = null;
          jn.a((int[]) null, 33, 96, 74, -62);
          field_B = null;
          field_I = null;
          field_G = null;
          return;
        } else {
          field_B = null;
          field_I = null;
          field_G = null;
          return;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param1--;
              if (param1 < 0) {
                if (param2 == -1) {
                  break L0;
                } else {
                  field_E = null;
                  return;
                }
              } else {
                var9 = param0;
                var5 = var9;
                var6 = param4;
                var7 = param3;
                var9[var6] = var7 + ua.a(8355711, var9[var6] >> 1);
                param4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("jn.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    jn(ag param0) {
        super(param0.field_v, param0.field_m, param0.field_s, param0.field_x, (nn) null, (mh) null);
        try {
            param0.a(((jn) this).field_s, 0, 0, 0, ((jn) this).field_x);
            ((jn) this).field_D = 256;
            ((jn) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "jn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) nj.field_c;
        synchronized (var1_ref) {
          L0: {
            if (nm.field_j != ee.field_e) {
              pj.field_e = cm.field_a[ee.field_e];
              aj.field_e = pe.field_db[ee.field_e];
              var2 = 26 % ((-11 - param0) / 61);
              ee.field_e = 127 & ee.field_e + 1;
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 != 100) {
          L0: {
            field_I = null;
            if (param1 > 0) {
              si.d(32, 32, 608, 440);
              vg.field_c.a(param2, 0, param1);
              si.c();
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param1 > 0) {
              si.d(32, 32, 608, 440);
              vg.field_c.a(param2, 0, param1);
              si.c();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        q.field_d = 21845;
        q.field_k = 33;
        if (param0 != 256) {
            return;
        }
        q.field_h = 133;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Life signs detected! Proceed with caution.";
        field_I = new String[]{"Showing by rating", "Showing by win percentage"};
        field_K = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_H = new vl();
    }
}
