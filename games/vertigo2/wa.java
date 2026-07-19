/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static er field_f;
    private int[] field_b;
    private int[] field_a;
    private int field_c;
    private int field_k;
    private int field_j;
    static ug field_i;
    static String field_g;
    static String[][] field_e;
    static String[] field_h;
    private int field_d;

    final static boolean b(byte param0) {
        int var1 = -29 % ((param0 - -65) / 52);
        return bf.field_b == um.field_F ? true : false;
    }

    final static er[] c(int param0) {
        er[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var6 = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        byte[] var12 = null;
        int[] var14 = null;
        byte[] var16 = null;
        int[] var18 = null;
        byte[] var22 = null;
        int[] var23 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        var1 = new er[eo.field_m];
        var2 = 0;
        var3 = -51 / ((param0 - 55) / 61);
        L0: while (true) {
          if (var2 >= eo.field_m) {
            la.a((byte) 50);
            return var1;
          } else {
            var4 = vi.field_w[var2] * mh.field_c[var2];
            var22 = se.field_y[var2];
            if (!vl.field_j[var2]) {
              var11 = new int[var4];
              var23 = var11;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var4) {
                  var1[var2] = new er(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], var23);
                  var2++;
                  continue L0;
                } else {
                  var11[var7] = in.field_c[b.a(255, (int) var22[var7])];
                  var7++;
                  continue L1;
                }
              }
            } else {
              var16 = ej.field_c[var2];
              var12 = var16;
              var10 = var12;
              var6 = var10;
              var18 = new int[var4];
              var14 = var18;
              var7_ref_int__ = var14;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var4) {
                  var1[var2] = (er) ((Object) new fe(ql.field_M, vj.field_c, ca.field_a[var2], pc.field_a[var2], mh.field_c[var2], vi.field_w[var2], var18));
                  var2++;
                  continue L0;
                } else {
                  var7_ref_int__[var8] = om.a(b.a(var16[var8] << 207434488, -16777216), in.field_c[b.a(255, (int) var22[var8])]);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void b(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param0 < -34) {
            break L0;
          } else {
            wa.a(-78);
            break L0;
          }
        }
        int fieldTemp$3 = this.field_d + 1;
        this.field_d = this.field_d + 1;
        this.field_c = this.field_c + fieldTemp$3;
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -257) {
            return;
          } else {
            L2: {
              var3 = this.field_b[var2];
              if ((var2 & 2) != 0) {
                if ((var2 & 1) == 0) {
                  this.field_k = this.field_k ^ this.field_k << 1414815522;
                  break L2;
                } else {
                  this.field_k = this.field_k ^ this.field_k >>> -879670896;
                  break L2;
                }
              } else {
                if ((var2 & 1) == 0) {
                  this.field_k = this.field_k ^ this.field_k << 401665645;
                  break L2;
                } else {
                  this.field_k = this.field_k ^ this.field_k >>> -1873308634;
                  break L2;
                }
              }
            }
            this.field_k = this.field_k + this.field_b[128 + var2 & 255];
            dupTemp$4 = this.field_k + (this.field_b[b.a(var3 >> -33082046, 255)] + this.field_c);
            var4 = dupTemp$4;
            this.field_b[var2] = dupTemp$4;
            dupTemp$5 = var3 + this.field_b[b.a(255, var4 >> 34551432 >> -34706814)];
            this.field_c = dupTemp$5;
            this.field_a[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    final int a(byte param0) {
        if (this.field_j == 0) {
            this.b(-93);
            this.field_j = 256;
        }
        if (param0 != 72) {
            return -40;
        }
        int fieldTemp$0 = this.field_j - 1;
        this.field_j = this.field_j - 1;
        return this.field_a[fieldTemp$0];
    }

    public static void a(int param0) {
        field_g = null;
        field_e = (String[][]) null;
        int var1 = 48 / ((75 - param0) / 45);
        field_f = null;
        field_h = null;
        field_i = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        var5 = -1640531527;
        var3 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var6 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        var11 = 89 % ((param0 - 55) / 51);
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -257) {
                var2 = 0;
                L2: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.b(-86);
                    this.field_j = 256;
                    return;
                  } else {
                    var9 = var9 + this.field_b[var2 - -6];
                    var10 = var10 + this.field_b[7 + var2];
                    var6 = var6 + this.field_b[3 + var2];
                    var4 = var4 + this.field_b[1 + var2];
                    var3 = var3 + this.field_b[var2];
                    var5 = var5 + this.field_b[var2 + 2];
                    var8 = var8 + this.field_b[5 + var2];
                    var7 = var7 + this.field_b[var2 - -4];
                    var3 = var3 ^ var4 << 708273931;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2083656098;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -1999471768;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1022832144;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 115449610;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -764687164;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -206344216;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -762682615;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_b[var2] = var3;
                    this.field_b[1 + var2] = var4;
                    this.field_b[var2 + 2] = var5;
                    this.field_b[3 + var2] = var6;
                    this.field_b[4 + var2] = var7;
                    this.field_b[var2 + 5] = var8;
                    this.field_b[6 + var2] = var9;
                    this.field_b[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var6 = var6 + this.field_a[3 + var2];
                var8 = var8 + this.field_a[5 + var2];
                var9 = var9 + this.field_a[var2 + 6];
                var4 = var4 + this.field_a[1 + var2];
                var10 = var10 + this.field_a[7 + var2];
                var7 = var7 + this.field_a[var2 - -4];
                var3 = var3 + this.field_a[var2];
                var5 = var5 + this.field_a[var2 - -2];
                var3 = var3 ^ var4 << 1470878091;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> -1078281950;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 55775848;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -786633008;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 1218679114;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -1073119900;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -1165932344;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 163161609;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_b[var2] = var3;
                this.field_b[var2 - -1] = var4;
                this.field_b[var2 - -2] = var5;
                this.field_b[var2 + 3] = var6;
                this.field_b[4 + var2] = var7;
                this.field_b[var2 + 5] = var8;
                this.field_b[6 + var2] = var9;
                this.field_b[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << -1030118997;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 546680642;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -2126786232;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1451343824;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 1366893546;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 352355716;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 825040712;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -113103927;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    wa(int[] param0) {
        int var2_int = 0;
        try {
            this.field_a = new int[256];
            this.field_b = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_a[var2_int] = param0[var2_int];
            }
            this.d(-28);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "That name is not available";
        field_h = new String[]{"Skip to next level", "Give 1 Jet Pack", "Give 1 Life", "Give 1 Dynamite", "Force next Death Electric", "Force next Death Spikes", "Turn Fake Lag On", "Turn Fake Lag Off", "Set 20 FPS", "Set 50 FPS"};
        field_e = new String[][]{new String[]{"Co-op", "Paint-off"}, new String[]{"1", "5", "10", "15", "20", "25", "30", "35"}, new String[]{"1", "5", "10", "All"}};
    }
}
