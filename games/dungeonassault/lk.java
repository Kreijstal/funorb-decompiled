/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends gd {
    static int field_S;
    static int field_T;
    static String field_Q;
    static int[][] field_R;
    int field_O;
    static String field_P;

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              jj.field_d = param0;
              sn.a(93, 12);
              if (param1 == 58) {
                break L1;
              } else {
                lk.f(87);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lk.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param1 != 8187) {
            return;
        }
        int var4 = param0 + ((lk) this).field_t;
        int var5 = ((lk) this).field_i - -param2;
        wd.field_l[((lk) this).field_O].a(20 + var5, 30 + var4, true, 30);
        super.b(param0, param1, param2);
    }

    lk(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, 0);
        ((lk) this).field_O = param4;
        ((lk) this).g(255);
    }

    public static void h(int param0) {
        field_Q = null;
        field_R = null;
        field_P = null;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        L0: {
          var2 = gm.field_d.field_J[((lk) this).field_O];
          var3 = gm.field_d.field_F[((lk) this).field_O];
          var4 = null;
          if (var2 == 0) {
            if (var3 == 0) {
              break L0;
            } else {
              var4 = (Object) (Object) jk.a(new String[1], to.field_a, 30496);
              break L0;
            }
          } else {
            L1: {
              var9 = jk.a(new String[1], nh.field_i, 30496);
              var4 = (Object) (Object) var9;
              var4 = (Object) (Object) var9;
              if (var3 == 0) {
                break L1;
              } else {
                var4 = (Object) (Object) (var9 + ", " + jk.a(new String[1], to.field_a, 30496));
                break L1;
              }
            }
            if (!ve.a(false)) {
              break L0;
            } else {
              if (!hm.field_m[((lk) this).field_O]) {
                break L0;
              } else {
                if (var2 >= 5) {
                  var4 = (Object) (Object) (var4 + ", " + qh.field_j);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          var5 = li.field_b[((lk) this).field_O];
          var6 = db.field_v.b(var5);
          var7 = db.field_v.field_H - -la.field_b.field_E;
          if (var4 == null) {
            break L2;
          } else {
            L3: {
              var8 = db.field_v.b((String) var4);
              if (var8 <= var6) {
                break L3;
              } else {
                var6 = var8;
                break L3;
              }
            }
            var7 = var7 + db.field_v.field_H;
            break L2;
          }
        }
        L4: {
          ((lk) this).field_K = new cn(var6, var7);
          ((lk) this).field_H = new cn(var6, var7);
          ((lk) this).field_z = new cn(var6, var7);
          jh.c();
          ((lk) this).field_K.e();
          db.field_v.b(var5, 0, la.field_b.field_H, 12632256, -1);
          if (var4 == null) {
            break L4;
          } else {
            db.field_v.b((String) var4, 0, la.field_b.field_H * 2, 8421504, -1);
            break L4;
          }
        }
        ((lk) this).field_H.e();
        gf.a();
        ((lk) this).field_K.e(0, 0, 16744448);
        ((lk) this).field_z.e();
        gf.a();
        ((lk) this).field_K.e(0, 0, 12690143);
        jh.b();
        ((lk) this).field_K.field_A = ((lk) this).field_x + -var7 >> 1;
        ((lk) this).field_K.field_w = 60;
        ((lk) this).field_H.field_w = 60;
        ((lk) this).field_H.field_A = ((lk) this).field_x + -var7 >> 1;
        ((lk) this).field_z.field_w = 60;
        ((lk) this).field_z.field_A = ((lk) this).field_x + -var7 >> 1;
        ((lk) this).field_I = rb.a(16, ((lk) this).field_z, param0, (byte) -33);
        ((lk) this).field_N = rb.a(16, ((lk) this).field_H, 16711680, (byte) -18);
    }

    final static String a(String param0, nh param1, String param2, byte param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1.a(-14354)) {
              stackOut_4_0 = param0 + " - " + param1.b(100) + "%";
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param2;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("lk.D(");
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -125 + 41);
        }
        return stackIn_5_0;
    }

    final static void f(int param0) {
        ia.field_K = null;
        sg.field_b = null;
        ga.field_o = null;
        ro.field_B = false;
        if (param0 != 16) {
            field_S = 2;
        }
        System.gc();
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        var4 = ((lk) this).field_t + param0;
        var5 = param1 + ((lk) this).field_i;
        var7 = 63 / ((param2 - 41) / 61);
        var6 = 0;
        L0: while (true) {
          if (10 > var6) {
            gf.g(30 + var4, 20 + var5, 20 - -var6, 0, 16);
            var6++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "CONFIRM";
        field_S = 0;
        field_Q = "Your email address is used to identify this account";
    }
}
