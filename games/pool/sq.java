/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sq {
    static int[] field_a;
    static int field_b;
    al field_d;
    static no field_c;

    abstract int a(boolean param0);

    int e(int param0) {
        if (param0 <= 64) {
            ((sq) this).field_d = null;
        }
        return ((sq) this).field_d.field_n;
    }

    final static boolean k(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            sq.a((String[]) null, false, -52, (String) null);
        }
        return ie.a((byte) 28, hk.d(71));
    }

    void a(qe param0, boolean param1) {
        qe stackIn_1_0 = null;
        qe stackIn_2_0 = null;
        qe stackIn_3_0 = null;
        qe stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        qe stackOut_0_0 = null;
        qe stackOut_1_0 = null;
        qe stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        qe stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          L1: {
            param0.field_z = ((sq) this).a(-1);
            stackOut_0_0 = (qe) param0;
            stackIn_3_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (0 != param0.field_u) {
              break L1;
            } else {
              stackOut_1_0 = (qe) (Object) stackIn_1_0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!((sq) this).a(param0.field_L, -35)) {
                break L1;
              } else {
                stackOut_2_0 = (qe) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L0;
              }
            }
          }
          stackOut_3_0 = (qe) (Object) stackIn_3_0;
          stackOut_3_1 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          break L0;
        }
        L2: {
          stackIn_4_0.field_E = stackIn_4_1 != 0;
          if (!param1) {
            break L2;
          } else {
            ((sq) this).field_d = null;
            break L2;
          }
        }
        param0.field_I = ((sq) this).j(0);
    }

    abstract int a(int param0);

    abstract int[] a(int param0, byte param1);

    abstract boolean a(int param0, byte param1, qe param2);

    abstract int i(int param0);

    abstract int b(int param0);

    void n(int param0) {
        if (param0 != 11828) {
            ((sq) this).field_d = null;
        }
    }

    abstract int h(int param0);

    final void l(int param0) {
        qe var2 = ((sq) this).field_d.j(45);
        var2.field_u = ((sq) this).b(-120);
        int var3 = -67 % ((param0 - -14) / 58);
        if (!(0 > var2.field_L)) {
            ((sq) this).a(var2, false);
        }
    }

    abstract boolean c(qe param0, int param1);

    int c(int param0, int param1) {
        if (param0 >= -36) {
            boolean discarded$0 = sq.k(73);
        }
        return param1;
    }

    abstract boolean f(int param0);

    abstract byte b(int param0, int param1);

    public static void d(int param0) {
        field_a = null;
        if (param0 != 13) {
            Object var2 = null;
            sq.a((String[]) null, false, 81, (String) null);
        }
        field_c = null;
    }

    abstract dd b(qe param0, int param1);

    int m(int param0) {
        if (param0 != 0) {
            field_a = null;
            return 0;
        }
        return 0;
    }

    final static void b(byte param0) {
        al.field_B = new tm[7];
        al.field_B[0] = (tm) (Object) new mf();
        al.field_B[1] = (tm) (Object) new vl();
        al.field_B[2] = (tm) (Object) new jr();
        al.field_B[3] = (tm) (Object) new to();
        if (param0 != 118) {
            boolean discarded$0 = sq.k(35);
        }
        al.field_B[4] = (tm) (Object) new lm();
        al.field_B[5] = (tm) (Object) new ac();
        al.field_B[6] = (tm) (Object) new ul();
    }

    int a(qe param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = (1 + param0.field_L) % ((sq) this).field_d.field_n;
        var4 = 1;
        L0: while (true) {
          L1: {
            if (var4 > ((sq) this).field_d.field_n) {
              break L1;
            } else {
              var3 = (var4 + param0.field_L) % ((sq) this).field_d.field_n;
              if (((sq) this).a((byte) -112, var3)) {
                if ((((sq) this).field_d.field_p & 1 << var3) == 0) {
                  break L1;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
          L2: {
            if (param1 >= 82) {
              break L2;
            } else {
              field_b = 82;
              break L2;
            }
          }
          return var3;
        }
    }

    abstract boolean a(int param0, int param1);

    final static int g(int param0) {
        if (param0 <= 107) {
            boolean discarded$0 = sq.k(-99);
        }
        return or.field_b;
    }

    final static void a(String[] args, boolean param1, int param2, String param3) {
        String[] var4 = null;
        Object var5 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            field_b = 100;
            break L0;
          }
        }
        L1: {
          pa.field_I = td.field_f;
          if ((param2 ^ -1) != -256) {
            L2: {
              if (param2 > -101) {
                break L2;
              } else {
                if (-106 >= param2) {
                  var4 = args;
                  gf.a(92, var4);
                  uf.field_gb = jo.a(args, 57);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            uf.field_gb = gg.a(param2, true, param3);
            break L1;
          } else {
            L3: {
              if (j.field_b >= 13) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            uf.field_gb = ta.a(stackIn_6_0 != 0, -30914);
            var5 = null;
            gf.a(108, (String[]) null);
            break L1;
          }
        }
    }

    abstract void c(int param0);

    sq(al param0) {
        ((sq) this).field_d = param0;
    }

    boolean a(byte param0, int param1) {
        int var3 = 35 % ((-16 - param0) / 46);
        return true;
    }

    void a(ge param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((sq) this).a(-101);
        }
    }

    String a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = Pool.field_O;
        if (param0 >= ((sq) this).field_d.field_n) {
            return null;
        }
        if (-3 == (((sq) this).field_d.field_n ^ -1)) {
            return nr.a(param1, param0 ^ -2, w.field_g);
        }
        int var3 = 0;
        for (var4_int = 0; param1.length > var4_int; var4_int++) {
            if (var4_int > 0) {
                var3 += 4;
            }
            var3 = var3 + param1[var4_int].length();
        }
        StringBuilder var4 = new StringBuilder(var3);
        for (var5 = 0; param1.length > var5; var5++) {
            if (!((var5 ^ -1) >= -1)) {
                StringBuilder discarded$0 = var4.append("<br>");
            }
            StringBuilder discarded$1 = var4.append(param1[var5]);
        }
        return var4.toString();
    }

    abstract int a(byte param0);

    int b(byte param0, int param1) {
        if (param0 >= -113) {
            field_a = null;
        }
        return 1 << param1;
    }

    int j(int param0) {
        if (param0 != 0) {
            return 82;
        }
        return -1;
    }

    void a(int param0, int param1, int param2) {
        if (param1 != -1) {
            int discarded$0 = ((sq) this).j(100);
        }
    }

    abstract boolean a(int param0, byte param1, int param2);

    abstract int a(qe param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
    }
}
