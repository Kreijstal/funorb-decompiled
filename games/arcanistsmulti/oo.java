/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends tf {
    static int field_y;
    static ih field_C;
    char[] field_n;
    boolean field_A;
    int[] field_D;
    char[] field_z;
    int[] field_p;
    String field_w;
    static String field_r;
    static String[] field_v;
    static String field_q;
    static String field_E;
    static dj field_x;
    static volatile long field_s;
    static String field_m;
    static String field_o;
    static vn field_B;
    static vg[] field_u;
    static qb field_t;

    private final void a(wk param0, int param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char stackOut_15_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char stackOut_10_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (1 == param1) {
                ((oo) this).field_w = param0.l(-1);
                break L1;
              } else {
                if (param1 == 2) {
                  var5 = param0.e((byte) -112);
                  ((oo) this).field_n = new char[var5];
                  ((oo) this).field_p = new int[var5];
                  var6 = 0;
                  L2: while (true) {
                    if (var5 <= var6) {
                      break L1;
                    } else {
                      L3: {
                        ((oo) this).field_p[var6] = param0.n(-98);
                        var7 = param0.o(6);
                        stackOut_14_0 = ((oo) this).field_n;
                        stackOut_14_1 = var6;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var7 == 0) {
                          stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L3;
                        } else {
                          stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = hm.a((byte) var7, -112);
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          break L3;
                        }
                      }
                      stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  if (param1 == 3) {
                    var5 = param0.e((byte) 34);
                    ((oo) this).field_z = new char[var5];
                    ((oo) this).field_D = new int[var5];
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= var5) {
                        break L1;
                      } else {
                        L5: {
                          ((oo) this).field_D[var6] = param0.n(-98);
                          var7 = param0.o(6);
                          stackOut_8_0 = ((oo) this).field_z;
                          stackOut_8_1 = var6;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var7 != 0) {
                            stackOut_10_0 = (char[]) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = hm.a((byte) var7, -104);
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L5;
                          } else {
                            stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 0;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L5;
                          }
                        }
                        stackIn_11_0[stackIn_11_1] = (char) stackIn_11_2;
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    if (param1 != 4) {
                      break L1;
                    } else {
                      ((oo) this).field_A = true;
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("oo.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + 127 + 41);
        }
    }

    public static void e() {
        field_C = null;
        field_t = null;
        field_r = null;
        field_x = null;
        field_E = null;
        field_v = null;
        field_m = null;
        field_q = null;
        field_B = null;
        field_u = null;
        field_o = null;
    }

    final static void c(int param0) {
        uh var1 = (uh) (Object) lk.field_j.d(true);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        de.a(var1.field_j, var1.field_o, var1.field_p);
        de.h(var1.field_k, var1.field_g, var1.field_r, var1.field_h);
        var1.field_j = null;
        km.field_a.b((pg) (Object) var1, -1);
        if (param0 != -15405) {
            oo.g(-25);
        }
    }

    final static vh d() {
        if (!(null != fm.field_c)) {
            fm.field_c = new vh();
            fm.field_c.a((byte) -105, ia.field_c);
            fm.field_c.field_d = 14;
            fm.field_c.field_c = 2763306;
            fm.field_c.field_q = vc.field_e;
            fm.field_c.field_w = 6;
            fm.field_c.field_e = 0;
            fm.field_c.field_C = 7697781;
            fm.field_c.field_s = 5;
            fm.field_c.field_k = 4;
        }
        return fm.field_c;
    }

    final void f(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 >= -24) {
            field_u = null;
        }
        if (null != ((oo) this).field_D) {
            for (var2 = 0; var2 < ((oo) this).field_D.length; var2++) {
                ((oo) this).field_D[var2] = fj.b(((oo) this).field_D[var2], 32768);
            }
        }
        if (!(null == ((oo) this).field_p)) {
            var4 = 0;
            var2 = var4;
            while (((oo) this).field_p.length > var4) {
                ((oo) this).field_p[var4] = fj.b(((oo) this).field_p[var4], 32768);
                var4++;
            }
        }
    }

    final void a(byte param0, wk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 100) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param1.e((byte) -98);
              if (0 != var3_int) {
                int discarded$4 = 127;
                this.a(param1, var3_int);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("oo.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    oo() {
        ((oo) this).field_A = false;
    }

    final static void g(int param0) {
        int discarded$0 = 0;
        ba.c();
        ee.a(param0, (byte) 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new ih();
        field_E = "Unable to delete friend - system busy";
        field_v = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_o = "Won";
        field_q = "Murky Swamp:";
        field_m = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_r = "Book of Seas";
        field_s = 0L;
    }
}
