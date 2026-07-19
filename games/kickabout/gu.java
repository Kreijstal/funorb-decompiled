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
        if (param0 != -20010) {
            field_Ib = (String) null;
        }
        return mj.field_a == nr.field_f ? true : false;
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        this.b(0, param1);
        if (!(param1)) {
            return -2;
        }
        int var3 = 109 % ((param0 - -76) / 43);
        for (var4 = 0; var4 < this.field_Ab; var4++) {
            if (!(0 == this.field_Bb[var4].field_sb)) {
                return this.field_Kb[var4];
            }
        }
        if (0 != wj.field_A) {
            return -1;
        }
        return this.field_Gb;
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
          if (0 != this.field_Ab) {
            break L0;
          } else {
            this.field_Bb[this.field_Ab] = new vu(0L, (hd) null, (hd) null, this.field_Nb, (ut) null, ga.field_M);
            this.field_Bb[this.field_Ab].field_p = 1;
            this.a((byte) -111, (hd) (this.field_Bb[this.field_Ab]));
            this.field_Kb[this.field_Ab] = -1;
            this.field_Ab = this.field_Ab + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (var7 >= this.field_Ab) {
            var6 = var6 + 2 * this.field_Mb;
            var7 = this.field_Fb - -(this.field_Ab * this.field_Cb) + this.field_Fb;
            var8 = ou.b(var6, param2, param1, param0 ^ 127);
            var9 = nj.a(param3, param4, var7, 29079);
            this.a(true, var6, var8, var9, var7);
            var10 = param0;
            L2: while (true) {
              if (var10 >= this.field_Ab) {
                return;
              } else {
                this.field_Bb[var10].a(this.field_Eb, this.field_Hb, -(this.field_Mb * 2) + var6, this.field_Cb * var10 + this.field_Fb, this.field_Mb, 15114, this.field_Cb);
                var10++;
                continue L2;
              }
            }
          } else {
            var8 = this.field_Bb[var7].b(this.field_Eb, 0, this.field_Hb);
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
            this.field_Bb[this.field_Ab] = new vu((long)param0, (hd) null, (hd) null, this.field_Lb, (ut) null, param2);
            this.field_Bb[this.field_Ab].field_S = this.field_Ob;
            this.field_Bb[this.field_Ab].field_ob = true;
            this.field_Bb[this.field_Ab].field_p = 1;
            this.a((byte) -115, (hd) (this.field_Bb[this.field_Ab]));
            this.field_Kb[this.field_Ab] = param1;
            this.field_Ab = this.field_Ab + 1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "gu.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        if (!(this.field_Gb == param0)) {
            return false;
        }
        if (-14 != (cc.field_e ^ -1)) {
            return true;
        }
        this.field_Gb = -1;
        return true;
    }

    final static sj a(boolean param0, int param1, int param2, boolean param3, int param4) {
        if (param4 <= 107) {
            return (sj) null;
        }
        return uj.a(param1, (byte) 112, param2, param0, false, param3);
    }

    final void a(String param0, boolean param1, int param2, ut param3) {
        try {
            this.field_Bb[this.field_Ab] = new vu(0L, (hd) null, (hd) null, this.field_Lb, param3, param0);
            this.field_Bb[this.field_Ab].field_S = this.field_Ob;
            this.field_Bb[this.field_Ab].field_ob = param1 ? true : false;
            this.field_Bb[this.field_Ab].field_p = 1;
            this.a((byte) -117, (hd) (this.field_Bb[this.field_Ab]));
            this.field_Kb[this.field_Ab] = param2;
            this.field_Ab = this.field_Ab + 1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "gu.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    gu(gu param0) {
        this(param0, param0.field_Ob, param0.field_Nb, param0.field_Lb, param0.field_Mb, param0.field_Hb, param0.field_Eb, param0.field_Fb, param0.field_Cb);
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
        int decompiledRegionSelector0 = 0;
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
            var3 = (jb) ((Object) np.field_Jb.g(24009));
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  np.field_Jb.a(new bm(param1, param2), 3);
                  if (param0 == -25) {
                    break L2;
                  } else {
                    gu.b(-42, (byte) 4, 39);
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (!(var3 instanceof bm)) {
                    break L3;
                  } else {
                    if (!((bm) ((Object) var3)).field_J.a(param1, param0 ^ -5275)) {
                      break L3;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var3 = (jb) ((Object) np.field_Jb.c(33));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("gu.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void h(byte param0) {
        if (param0 < 13) {
            return;
        }
        field_zb = null;
        field_Jb = null;
        field_Ib = null;
        field_yb = null;
        field_Db = null;
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 > -75) {
            field_yb = (char[]) null;
        }
        ml var3 = or.field_d;
        var3.b(param2, (byte) -76);
        var3.a(111, 3);
        var3.a(125, 9);
        var3.g(-1207444472, param0);
    }

    gu(hd param0, ut[] param1, hd param2, hd param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Kb = new int[256];
        this.field_Bb = new vu[256];
        this.field_Gb = -2;
        try {
            this.field_Lb = param3;
            this.field_Nb = param2;
            this.field_Fb = param7;
            this.field_Hb = param5;
            this.field_Cb = param8;
            this.field_Eb = param6;
            this.field_Ob = param1;
            this.field_Mb = param4;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "gu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_Ib = "scroll up";
        field_Jb = null;
        field_yb = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_Db = "Click a player on the left to view.";
    }
}
