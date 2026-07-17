/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends lm {
    int[] field_u;
    static int[] field_w;
    private int[][] field_B;
    private String[] field_y;
    private int[] field_x;
    static int[] field_z;
    static oh field_v;
    static vj field_t;
    static String field_A;

    final void a(int param0, we param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -5) {
                break L1;
              } else {
                kp.b((byte) -35);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param1.f(255);
              if (var3_int == 0) {
                break L0;
              } else {
                this.a(var3_int, 83, param1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("kp.C(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final void a(int param0, int param1, we param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        wm var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                if (2 == param0) {
                  var4_int = param2.f(255);
                  ((kp) this).field_u = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (~var4_int >= ~var5) {
                      break L1;
                    } else {
                      ((kp) this).field_u[var5] = param2.a((byte) -115);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param0 == 3) {
                    var4_int = param2.f(255);
                    ((kp) this).field_B = new int[var4_int][];
                    ((kp) this).field_x = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (~var5 <= ~var4_int) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param2.a((byte) 52);
                          var7 = go.a(var6, -52);
                          if (var7 == null) {
                            break L4;
                          } else {
                            ((kp) this).field_x[var5] = var6;
                            ((kp) this).field_B[var5] = new int[var7.field_e];
                            var8 = 0;
                            L5: while (true) {
                              if (~var7.field_e >= ~var8) {
                                break L4;
                              } else {
                                ((kp) this).field_B[var5][var8] = param2.a((byte) -118);
                                var8++;
                                continue L5;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (param0 != 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                ((kp) this).field_y = dd.a(param2.h(5), (byte) -117, '<');
                break L1;
              }
            }
            var4_int = -62;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("kp.G(").append(param0).append(44).append(83).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static void b(byte param0) {
        byte[] var2 = null;
        if (param0 != 74) {
            kp.d((byte) -64);
        }
        if (jg.a((byte) 83)) {
            ef.field_a = true;
        } else {
            var2 = bo.a(param0 ^ 181);
            byte[] var1 = var2;
            int discarded$0 = 6;
            og discarded$1 = hm.a(param0 + 41, var2);
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_A = null;
        field_t = null;
        field_z = null;
        if (param0 != -58) {
            kp.b((byte) -3);
        }
        field_w = null;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 123) {
            ((kp) this).field_B = null;
        }
        if (!(null == ((kp) this).field_u)) {
            for (var2 = 0; ((kp) this).field_u.length > var2; var2++) {
                ((kp) this).field_u[var2] = bq.a(((kp) this).field_u[var2], 32768);
            }
        }
    }

    final static void c() {
        int var1 = 37;
        if (!(to.field_t == null)) {
            to.field_t.f();
        }
        if (!(ib.field_h == null)) {
            ib.field_h.f();
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(null != ((kp) this).field_y)) {
            return "";
        }
        StringBuilder discarded$8 = var5.append(((kp) this).field_y[0]);
        if (param0 != -54) {
            ((kp) this).field_B = null;
        }
        for (var3 = 1; ((kp) this).field_y.length > var3; var3++) {
            StringBuilder discarded$9 = var2.append("...");
            StringBuilder discarded$10 = var5.append(((kp) this).field_y[var3]);
        }
        return var2.toString();
    }

    kp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_w = new int[32];
        field_z = new int[32];
        for (var0 = 0; field_z.length > var0; var0++) {
            field_z[var0] = 66561 * ((var0 << 6) / field_z.length);
        }
        for (var0 = 0; var0 < field_w.length; var0++) {
            field_w[var0] = (var0 << 6) / field_w.length * 262401;
        }
        field_A = "Please check if address is correct";
    }
}
