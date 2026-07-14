/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wda extends vg implements lj, noa, gr {
    private la field_f;
    boolean field_k;
    private gpa field_g;
    fsa field_n;
    boolean field_i;
    private gpa field_h;
    static String field_m;
    static String field_l;
    boolean field_j;

    final la c(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((wda) this).field_f;
    }

    public final boolean a(int param0) {
        if (param0 >= -49) {
            return false;
        }
        return ((wda) this).field_k;
    }

    public final fsa f(byte param0) {
        int var2 = 73 / ((-32 - param0) / 50);
        return ((wda) this).field_n;
    }

    void a(kh param0, byte param1) {
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        param0.a((byte) 61, ((wda) this).c(1), 6);
        if (param1 > -78) {
          return;
        } else {
          L0: {
            stackOut_1_0 = (kh) param0;
            stackOut_1_1 = -126;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (((wda) this).field_k) {
              stackOut_3_0 = (kh) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L0;
            } else {
              stackOut_2_0 = (kh) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L0;
            }
          }
          L1: {
            ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
            stackOut_4_0 = (kh) param0;
            stackOut_4_1 = 107;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (((wda) this).field_i) {
              stackOut_6_0 = (kh) (Object) stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (kh) (Object) stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = 0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          ((kh) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2, 1);
          return;
        }
    }

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 87) {
          if (null != ((wda) this).field_n) {
            if (((wda) this).field_j) {
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
          field_m = null;
          if (null == ((wda) this).field_n) {
            return true;
          } else {
            L0: {
              if (!((wda) this).field_j) {
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

    void a(boolean param0, byte param1, ui param2, ui param3) {
        L0: {
          if (param2 != null) {
            ((wda) this).field_h = param2.a(-75, param0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 != null) {
            ((wda) this).field_g = param3.a(-47, false);
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 > -106) {
          ((wda) this).b((byte) -110);
          return;
        } else {
          return;
        }
    }

    public void m(int param0) {
        int var2 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (((wda) this).field_i) {
          return;
        } else {
          L0: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((wda) this).field_k) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ((wda) this).field_k = stackIn_4_1 != 0;
          var2 = -124 / ((param0 - 28) / 49);
          return;
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 0) {
            ((wda) this).field_k = false;
            return wma.a((byte) 8, 4, param1);
        }
        return wma.a((byte) 8, 4, param1);
    }

    final int d(byte param0) {
        if (param0 >= -43) {
            int discarded$0 = ((wda) this).a(-18, true);
            return ((wda) this).field_n.O(80);
        }
        return ((wda) this).field_n.O(80);
    }

    void c(byte param0) {
        if (param0 > -116) {
            ((wda) this).field_k = false;
        }
    }

    abstract void b(int param0);

    abstract int c(int param0);

    abstract void b(byte param0);

    public static void d(int param0) {
        field_l = null;
        field_m = null;
        if (param0 != 12072) {
            wda.d(-112);
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            ((wda) this).field_f = null;
            return ji.a(param0, 122, 4);
        }
        return ji.a(param0, 122, 4);
    }

    wda(la param0, kh param1, boolean param2) {
        this(param0, param2);
        ((wda) this).field_k = param1.b((byte) 44, 1) == 1 ? true : false;
        if (-23 >= param0.field_E) {
            ((wda) this).field_i = -2 == param1.b((byte) 44, 1) ? true : false;
        }
    }

    abstract int a(int param0, int param1);

    final lj a(boolean param0, int param1, int param2) {
        if (param1 == 1) {
          if (!vh.a(param2, param0, -27201, (lj) this)) {
            return null;
          } else {
            return (lj) this;
          }
        } else {
          ((wda) this).field_j = false;
          if (!vh.a(param2, param0, -27201, (lj) this)) {
            return null;
          } else {
            return (lj) this;
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        if (((wda) this).field_i) {
            return;
        }
        ((wda) this).field_k = param1 ? true : false;
        if (!param0) {
            ((wda) this).field_j = false;
        }
    }

    public final gpa i(byte param0) {
        if (param0 != 84) {
            return null;
        }
        return ((wda) this).field_g;
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
            wda.d(-9);
            return ((wda) this).field_h;
        }
        return ((wda) this).field_h;
    }

    final int a(boolean param0) {
        if (param0) {
            field_m = null;
            return ((wda) this).field_n.o((byte) -124);
        }
        return ((wda) this).field_n.o((byte) -124);
    }

    void a(int param0, fsa param1) {
        ((wda) this).field_n = param1;
        if (param0 < 35) {
            gpa discarded$0 = ((wda) this).i((byte) 25);
        }
    }

    public final ew h(byte param0) {
        if (param0 < 105) {
            return null;
        }
        return (ew) (Object) ((wda) this).field_n.r(0);
    }

    final int b(boolean param0) {
        if (!param0) {
            ((wda) this).field_i = true;
            return ((wda) this).field_n.M(0);
        }
        return ((wda) this).field_n.M(0);
    }

    wda(la param0, boolean param1) {
        ((wda) this).field_k = true;
        ((wda) this).field_i = false;
        ((wda) this).field_j = false;
        ir discarded$0 = new ir();
        ((wda) this).field_f = param0;
        ((wda) this).a(param1, (byte) -119, param0.e(116), (ui) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "<%0> has declined the invitation.";
        field_l = "Concluded";
    }
}
