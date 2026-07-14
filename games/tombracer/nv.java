/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nv extends vg implements lj, fo, noa, gr {
    boolean field_f;
    static String field_h;
    fsa field_g;
    private gpa field_j;
    boolean field_k;
    private boolean field_i;
    private gpa field_l;
    private la field_m;

    final boolean d(int param0) {
        hca var2 = null;
        if (param0 != 8031) {
          ((nv) this).field_m = null;
          var2 = ((nv) this).m((byte) 19);
          return io.a(var2.c(-47), ((nv) this).field_g.e(9648), (byte) -57, var2.a((byte) 55), ((nv) this).field_g.d(3), var2.e(9648), ((nv) this).field_g.a((byte) 55), ((nv) this).field_g.c(param0 ^ -8057), var2.d(3));
        } else {
          var2 = ((nv) this).m((byte) 19);
          return io.a(var2.c(-47), ((nv) this).field_g.e(9648), (byte) -57, var2.a((byte) 55), ((nv) this).field_g.d(3), var2.e(9648), ((nv) this).field_g.a((byte) 55), ((nv) this).field_g.c(param0 ^ -8057), var2.d(3));
        }
    }

    int a(int param0, ep param1, up param2) {
        if (param0 != 25940) {
            ((nv) this).field_m = null;
            return 0;
        }
        return 0;
    }

    abstract int a(boolean param0);

    public final gpa i(byte param0) {
        if (param0 != 84) {
            return null;
        }
        return ((nv) this).field_l;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        if (param2 != 1) {
            return true;
        }
        return false;
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
            return null;
        }
        return ((nv) this).field_j;
    }

    public final fsa f(byte param0) {
        int var2 = 119 / ((-32 - param0) / 50);
        return ((nv) this).field_g;
    }

    void a(ffa param0, byte param1, gma param2, int param3) {
        if (param1 < 18) {
            fsa discarded$0 = ((nv) this).e(-16);
        }
    }

    void c(boolean param0) {
        if (param0) {
            return;
        }
        ((nv) this).field_i = true;
    }

    void a(int param0, ui param1, boolean param2, ui param3) {
        int var5 = 0;
        if (param1 != null) {
          L0: {
            ((nv) this).field_j = param1.a(84, param2);
            if (param3 != null) {
              ((nv) this).field_l = param3.a(-57, false);
              break L0;
            } else {
              break L0;
            }
          }
          var5 = -32 / ((param0 - -58) / 57);
          return;
        } else {
          L1: {
            if (param3 != null) {
              ((nv) this).field_l = param3.a(-57, false);
              break L1;
            } else {
              break L1;
            }
          }
          var5 = -32 / ((param0 - -58) / 57);
          return;
        }
    }

    final hca m(byte param0) {
        if (param0 != 19) {
          ((nv) this).field_g = null;
          return ((nv) this).field_g.H(param0 ^ -108);
        } else {
          return ((nv) this).field_g.H(param0 ^ -108);
        }
    }

    int a(int param0, up param1, pc param2) {
        if (param0 >= -85) {
            boolean discarded$0 = ((nv) this).d(-76);
            return 0;
        }
        return 0;
    }

    public void m(int param0) {
        int var2 = 98 % ((28 - param0) / 49);
        if (!(!((nv) this).field_k)) {
            return;
        }
        ((nv) this).field_f = !((nv) this).field_f ? true : false;
    }

    public final boolean a(int param0) {
        if (param0 > -49) {
            return false;
        }
        return ((nv) this).field_f;
    }

    public final ew h(byte param0) {
        if (param0 <= 105) {
            ((nv) this).c(false);
            return (ew) (Object) ((nv) this).field_g.r(0);
        }
        return (ew) (Object) ((nv) this).field_g.r(0);
    }

    nv(la param0, kh param1, boolean param2) {
        this(param0, param2);
        ((nv) this).field_f = param1.b((byte) 44, 1) == 1 ? true : false;
        if ((param0.field_E ^ -1) <= -23) {
            ((nv) this).field_k = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        }
    }

    final la b(boolean param0) {
        if (!param0) {
            lj discarded$0 = ((nv) this).a(-83, 93, false);
            return ((nv) this).field_m;
        }
        return ((nv) this).field_m;
    }

    public final int b(byte param0) {
        int var2 = 53 % ((param0 - -23) / 53);
        return ((nv) this).field_g.d(3);
    }

    public static void j(int param0) {
        if (param0 != 18416) {
            return;
        }
        field_h = null;
    }

    void a(boolean param0, fsa param1) {
        if (!param0) {
            ((nv) this).m(23);
            ((nv) this).field_g = param1;
            return;
        }
        ((nv) this).field_g = param1;
    }

    int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 < 79) {
            field_h = null;
            return 0;
        }
        return 0;
    }

    boolean a(int param0, int param1, pc param2, int param3) {
        if (param1 != 1) {
            Object var6 = null;
            ((nv) this).a(false, (fsa) null);
            return false;
        }
        return false;
    }

    void g(int param0) {
        if (param0 != -2) {
            int discarded$0 = ((nv) this).a(-30, -37);
        }
    }

    int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7 = 88 % ((param4 - 62) / 52);
        return 0;
    }

    final qea o(byte param0) {
        if (param0 != 46) {
            return null;
        }
        return ((nv) this).field_g.y(1751085328);
    }

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 87) {
          if (null != ((nv) this).field_g) {
            if (((nv) this).field_i) {
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
          boolean discarded$7 = ((nv) this).p((byte) -104);
          if (null == ((nv) this).field_g) {
            return true;
          } else {
            L0: {
              if (!((nv) this).field_i) {
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

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return ((nv) this).field_i;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            ((nv) this).n((byte) 65);
            return ((nv) this).field_g.e(9648);
        }
        return ((nv) this).field_g.e(9648);
    }

    void a(boolean param0, kh param1) {
        param1.a((byte) -127, ((nv) this).a(param0), 6);
        param1.a((byte) -126, !((nv) this).field_f ? 0 : 1, 1);
        param1.a((byte) 112, !((nv) this).field_k ? 0 : 1, 1);
    }

    void h(int param0) {
        if (param0 != 28701) {
            boolean discarded$0 = ((nv) this).a(46);
        }
    }

    void b(int param0, iq param1) {
        if (param0 < 112) {
            ((nv) this).n((byte) -120);
        }
    }

    final dt i(int param0) {
        if (param0 != 12340) {
            return null;
        }
        return ((nv) this).field_g.x(param0 + 3130);
    }

    final fsa e(int param0) {
        Object var3 = null;
        if (param0 != 6) {
          var3 = null;
          ((nv) this).a(-63, (iq) null);
          return ((nv) this).field_g.r(param0 ^ 6);
        } else {
          return ((nv) this).field_g.r(param0 ^ 6);
        }
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            ((nv) this).a((byte) -24, false);
            return ((nv) this).field_g.g((byte) 115);
        }
        return ((nv) this).field_g.g((byte) 115);
    }

    abstract int a(int param0, int param1);

    public final void f(int param0) {
        if (param0 != -4366) {
            Object var3 = null;
            int discarded$0 = ((nv) this).a(18, -54, (up) null, 115, (byte) 119, -22);
        }
    }

    boolean p(byte param0) {
        if (param0 != 120) {
            Object var3 = null;
            ((nv) this).a((ffa) null, (byte) -1, (gma) null, 16);
            return false;
        }
        return false;
    }

    abstract void k(int param0);

    lj a(int param0, int param1, boolean param2) {
        Object var5 = null;
        if (param0 == 0) {
          if (!vh.a(param1, param2, -27201, (lj) this)) {
            return null;
          } else {
            return (lj) this;
          }
        } else {
          var5 = null;
          ((nv) this).a(-91, (ui) null, true, (ui) null);
          if (!vh.a(param1, param2, -27201, (lj) this)) {
            return null;
          } else {
            return (lj) this;
          }
        }
    }

    public final void a(int param0, iq param1) {
        if (param0 < 103) {
            fsa discarded$0 = ((nv) this).f((byte) -97);
        }
    }

    final void a(byte param0, boolean param1) {
        ((nv) this).field_k = param1 ? true : false;
        if (param0 != -24) {
            ((nv) this).field_m = null;
        }
    }

    void n(byte param0) {
        if (param0 < 68) {
            ((nv) this).field_f = true;
        }
    }

    nv(la param0, boolean param1) {
        ((nv) this).field_f = true;
        ((nv) this).field_i = false;
        ((nv) this).field_k = false;
        ((nv) this).field_m = param0;
        ((nv) this).a(48, param0.e(-38), param1, (ui) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "ON";
    }
}
