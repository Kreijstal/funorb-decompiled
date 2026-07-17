/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends hd {
    private int field_Cb;
    static String field_Ib;
    private int field_Hb;
    private hd field_Lb;
    private hd field_Nb;
    private int field_Fb;
    static ut field_zb;
    private int[] field_Kb;
    private int field_Ab;
    private ut[] field_Ob;
    static char[] field_yb;
    static String field_Db;
    private int field_Eb;
    static String field_Jb;
    private int field_Gb;
    private vu[] field_Bb;
    private int field_Mb;

    final static void b(int param0, byte param1, int param2) {
        if (param1 != 60) {
            return;
        }
        sk.field_d.field_n[param0] = -param2;
    }

    final static boolean b(int param0) {
        return mj.field_a == nr.field_f;
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        ((gu) this).b(0, param1);
        if (!(param1)) {
            return -2;
        }
        int var3 = 109 % ((param0 - -76) / 43);
        for (var4 = 0; var4 < ((gu) this).field_Ab; var4++) {
            if (!(0 == ((gu) this).field_Bb[var4].field_sb)) {
                return ((gu) this).field_Kb[var4];
            }
        }
        if (0 != wj.field_A) {
            return -1;
        }
        return ((gu) this).field_Gb;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Kickabout.field_G;
          if (0 != ((gu) this).field_Ab) {
            break L0;
          } else {
            ((gu) this).field_Bb[((gu) this).field_Ab] = new vu(0L, (hd) null, (hd) null, ((gu) this).field_Nb, (ut) null, ga.field_M);
            ((gu) this).field_Bb[((gu) this).field_Ab].field_p = 1;
            ((gu) this).a((byte) -111, (hd) (Object) ((gu) this).field_Bb[((gu) this).field_Ab]);
            ((gu) this).field_Kb[((gu) this).field_Ab] = -1;
            ((gu) this).field_Ab = ((gu) this).field_Ab + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((gu) this).field_Ab) {
            var6 = var6 + 2 * ((gu) this).field_Mb;
            var7 = ((gu) this).field_Fb - -(((gu) this).field_Ab * ((gu) this).field_Cb) + ((gu) this).field_Fb;
            var8 = ou.b(var6, param2, param1, param0 ^ 127);
            var9 = nj.a(param3, param4, var7, 29079);
            ((gu) this).a(true, var6, var8, var9, var7);
            var10 = param0;
            L2: while (true) {
              if (var10 >= ((gu) this).field_Ab) {
                return;
              } else {
                ((gu) this).field_Bb[var10].a(((gu) this).field_Eb, ((gu) this).field_Hb, -(((gu) this).field_Mb * 2) + var6, ((gu) this).field_Cb * var10 + ((gu) this).field_Fb, ((gu) this).field_Mb, 15114, ((gu) this).field_Cb);
                var10++;
                continue L2;
              }
            }
          } else {
            var8 = ((gu) this).field_Bb[var7].b(((gu) this).field_Eb, 0, ((gu) this).field_Hb);
            if (var8 > var6) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
            ((gu) this).field_Bb[((gu) this).field_Ab] = new vu((long)param0, (hd) null, (hd) null, ((gu) this).field_Lb, (ut) null, param2);
            ((gu) this).field_Bb[((gu) this).field_Ab].field_S = ((gu) this).field_Ob;
            ((gu) this).field_Bb[((gu) this).field_Ab].field_ob = true;
            ((gu) this).field_Bb[((gu) this).field_Ab].field_p = 1;
            ((gu) this).a((byte) -115, (hd) (Object) ((gu) this).field_Bb[((gu) this).field_Ab]);
            ((gu) this).field_Kb[((gu) this).field_Ab] = param1;
            ((gu) this).field_Ab = ((gu) this).field_Ab + 1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gu.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0) {
        if (!(((gu) this).field_Gb == param0)) {
            return false;
        }
        if (cc.field_e != 13) {
            return true;
        }
        ((gu) this).field_Gb = -1;
        return true;
    }

    final static sj a(boolean param0, int param1, int param2, boolean param3, int param4) {
        if (param4 <= 107) {
            return null;
        }
        return uj.a(param1, (byte) 112, param2, param0, false, param3);
    }

    final void a(String param0, boolean param1, int param2, ut param3) {
        try {
            ((gu) this).field_Bb[((gu) this).field_Ab] = new vu(0L, (hd) null, (hd) null, ((gu) this).field_Lb, param3, param0);
            ((gu) this).field_Bb[((gu) this).field_Ab].field_S = ((gu) this).field_Ob;
            ((gu) this).field_Bb[((gu) this).field_Ab].field_ob = param1 ? true : false;
            ((gu) this).field_Bb[((gu) this).field_Ab].field_p = 1;
            ((gu) this).a((byte) -117, (hd) (Object) ((gu) this).field_Bb[((gu) this).field_Ab]);
            ((gu) this).field_Kb[((gu) this).field_Ab] = param2;
            ((gu) this).field_Ab = ((gu) this).field_Ab + 1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gu.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    gu(gu param0) {
        this((hd) (Object) param0, param0.field_Ob, param0.field_Nb, param0.field_Lb, param0.field_Mb, param0.field_Hb, param0.field_Eb, param0.field_Fb, param0.field_Cb);
    }

    final static void a(byte param0, pt param1, boolean param2) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var3 = (jb) (Object) np.field_Jb.g(24009);
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  np.field_Jb.a((gn) (Object) new bm(param1, param2), 3);
                  if (param0 == -25) {
                    break L2;
                  } else {
                    gu.b(-42, (byte) 4, 39);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (!(var3 instanceof bm)) {
                    break L3;
                  } else {
                    if (!((bm) (Object) var3).field_J.a(param1, param0 ^ -5275)) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                var3 = (jb) (Object) np.field_Jb.c(33);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("gu.H(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    public static void h(byte param0) {
        field_zb = null;
        field_Jb = null;
        field_Ib = null;
        field_yb = null;
        field_Db = null;
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 > -75) {
            field_yb = null;
        }
        ml var3 = or.field_d;
        var3.b(param2, (byte) -76);
        var3.a(111, 3);
        var3.a(125, 9);
        var3.g(-1207444472, param0);
    }

    gu(hd param0, ut[] param1, hd param2, hd param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((gu) this).field_Kb = new int[256];
        ((gu) this).field_Bb = new vu[256];
        ((gu) this).field_Gb = -2;
        try {
            ((gu) this).field_Lb = param3;
            ((gu) this).field_Nb = param2;
            ((gu) this).field_Fb = param7;
            ((gu) this).field_Hb = param5;
            ((gu) this).field_Cb = param8;
            ((gu) this).field_Eb = param6;
            ((gu) this).field_Ob = param1;
            ((gu) this).field_Mb = param4;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = "scroll up";
        field_Jb = null;
        field_yb = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_Db = "Click a player on the left to view.";
    }
}
