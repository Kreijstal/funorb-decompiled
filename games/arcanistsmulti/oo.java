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

    private final void a(wk param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char stackIn_16_2 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char stackOut_15_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char stackOut_14_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        char stackOut_9_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          var4 = -1 % ((-32 - param2) / 44);
          if (1 == param1) {
            ((oo) this).field_w = param0.l(-1);
            break L0;
          } else {
            if (param1 == 2) {
              var5 = param0.e((byte) -112);
              ((oo) this).field_n = new char[var5];
              ((oo) this).field_p = new int[var5];
              var6 = 0;
              L1: while (true) {
                if (var5 <= var6) {
                  break L0;
                } else {
                  L2: {
                    ((oo) this).field_p[var6] = param0.n(-98);
                    var7 = param0.o(6);
                    stackOut_13_0 = ((oo) this).field_n;
                    stackOut_13_1 = var6;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (var7 == 0) {
                      stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = (char)0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      break L2;
                    } else {
                      stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = hm.a((byte) var7, -112);
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      break L2;
                    }
                  }
                  stackIn_16_0[stackIn_16_1] = stackIn_16_2;
                  var6++;
                  continue L1;
                }
              }
            } else {
              if (param1 == 3) {
                var5 = param0.e((byte) 34);
                ((oo) this).field_z = new char[var5];
                ((oo) this).field_D = new int[var5];
                var6 = 0;
                L3: while (true) {
                  if (var6 >= var5) {
                    break L0;
                  } else {
                    L4: {
                      ((oo) this).field_D[var6] = param0.n(-98);
                      var7 = param0.o(6);
                      stackOut_7_0 = ((oo) this).field_z;
                      stackOut_7_1 = var6;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var7 != 0) {
                        stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = hm.a((byte) var7, -104);
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L4;
                      } else {
                        stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 0;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L4;
                      }
                    }
                    stackIn_10_0[stackIn_10_1] = (char) stackIn_10_2;
                    var6++;
                    continue L3;
                  }
                }
              } else {
                if ((param1 ^ -1) != -5) {
                  break L0;
                } else {
                  ((oo) this).field_A = true;
                  break L0;
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_t = null;
        field_r = null;
        field_x = null;
        field_E = null;
        field_v = null;
        field_m = null;
        field_q = null;
        field_B = null;
        if (param0 != 31908) {
            return;
        }
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

    final static vh d(int param0) {
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
        if (param0 != -9685) {
            field_s = 4L;
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
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 >= 100) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param1.e((byte) -98);
          if (0 != var3) {
            this.a(param1, var3, 127);
            continue L1;
          } else {
            return;
          }
        }
    }

    oo() {
        ((oo) this).field_A = false;
    }

    final static void g(int param0) {
        ba.c(0);
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
