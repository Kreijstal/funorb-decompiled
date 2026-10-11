/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_u;
    private int[][] field_q;
    byte[][] field_k;
    private int field_w;
    int[] field_h;
    private int[] field_t;
    static qb field_o;
    private byte[] field_x;
    static ll[] field_n;
    int[][] field_e;
    static String field_d;
    static String field_j;
    int[] field_r;
    int[] field_i;
    static ll[] field_m;
    int field_p;
    static int[] field_a;
    static String field_s;
    n[] field_c;
    int field_g;
    int[] field_y;
    int field_f;
    int[] field_b;
    n field_l;
    static String field_v;

    private final void a(byte[] param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wk var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var17 = new wk(hb.a(false, param0));
          var4 = var17.e((byte) 31);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_g = var17.d(-10674);
            } else {
              this.field_g = 0;
            }
            var5 = var17.e((byte) 94);
            stackIn_11_0 = (0 == (var5 & 1)) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (7 > var4) {
              this.field_w = var17.n(param1 ^ -110);
            } else {
              this.field_w = var17.a((byte) -29);
            }
            var8 = 0;
            if (param1 != 12) {
              return;
            }
            this.field_r = new int[this.field_w];
            var9 = -1;
            if (7 > var4) {
              for (var10 = 0; this.field_w > var10; var10++) {
                dupTemp$0 = var8 + var17.n(-98);
                var8 = dupTemp$0;
                this.field_r[var10] = dupTemp$0;
                if (this.field_r[var10] > var9) {
                  var9 = this.field_r[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_w > var10; var10++) {
                dupTemp$1 = var8 + var17.a((byte) -29);
                var8 = dupTemp$1;
                this.field_r[var10] = dupTemp$1;
                if (var9 < this.field_r[var10]) {
                  var9 = this.field_r[var10];
                }
              }
            }
            this.field_f = var9 + 1;
            this.field_e = new int[this.field_f][];
            this.field_i = new int[this.field_f];
            this.field_y = new int[this.field_f];
            if (var7 != 0) {
              this.field_k = new byte[this.field_f][];
            }
            this.field_b = new int[this.field_f];
            this.field_h = new int[this.field_f];
            if (var6 != 0) {
              this.field_t = new int[this.field_f];
              for (var10Lifetime1 = 0; this.field_f > var10Lifetime1; var10Lifetime1++) {
                this.field_t[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_w; var10Lifetime1Lifetime1++) {
                this.field_t[this.field_r[var10Lifetime1Lifetime1]] = var17.d(hh.a(param1, -10686));
              }
              this.field_l = new n(this.field_t);
            }
            for (var10Lifetime2 = 0; this.field_w > var10Lifetime2; var10Lifetime2++) {
              this.field_h[this.field_r[var10Lifetime2]] = var17.d(-10674);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_w; var10Lifetime3++) {
                this.field_y[this.field_r[var10Lifetime3]] = var17.d(-10674);
              }
            } else {
              for (var10Lifetime3 = 0; this.field_w > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a((byte) 45, 0, var21, 64);
                this.field_k[this.field_r[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_w; var10Lifetime3++) {
                this.field_y[this.field_r[var10Lifetime3]] = var17.d(-10674);
              }
            }
            if (7 <= var4) {
              for (var10Lifetime4 = 0; this.field_w > var10Lifetime4; var10Lifetime4++) {
                this.field_b[this.field_r[var10Lifetime4]] = var17.a((byte) -29);
              }
              for (var10Lifetime4 = 0; this.field_w > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_r[var10Lifetime4];
                var12 = this.field_b[var11];
                var8Lifetime1 = 0;
                array$2 = new int[var12];
                this.field_e[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.a((byte) -29);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_e[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_i[var11] = var13 + 1;
                if (1 + var13 == var12) {
                  this.field_e[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_w; var10Lifetime4++) {
                this.field_b[this.field_r[var10Lifetime4]] = var17.n(-98);
              }
              for (var10Lifetime4 = 0; this.field_w > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_r[var10Lifetime4];
                var12 = this.field_b[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_e[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.n(-98);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_e[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_i[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.field_e[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_c = new n[var9 + 1];
              this.field_q = new int[var9 + 1][];
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_w; var10Lifetime5++) {
                var11Lifetime1 = this.field_r[var10Lifetime5];
                var12Lifetime1 = this.field_b[var11Lifetime1];
                array$8 = new int[this.field_i[var11Lifetime1]];
                this.field_q[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_i[var11Lifetime1]; var13Lifetime1++) {
                  this.field_q[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_e[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_e[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_q[var11Lifetime1][var14Lifetime1] = var17.d(hh.a(param1, -10686));
                }
                this.field_c[var11Lifetime1] = new n(this.field_q[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_106_0 = var3;
          stackIn_106_1 = new StringBuilder().append("jk.D(");
          if (param0 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_a = null;
        field_d = null;
        field_s = null;
        field_n = null;
        field_o = null;
        field_j = null;
        if (param0 != 0) {
          v var2 = (v) null;
          jk.a(2, (v) null);
        }
        field_v = null;
    }

    final static String a(int param0, jg param1) {
        String stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        jg var5 = null;
        String var6 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != 3) {
            var5 = (jg) null;
            jk.a(-73, (jg) null);
          }
          var2 = null;
          if (param1.field_g != null) {
            var6 = param1.field_g;
            var2 = var6;
            if (1 == param1.field_b) {
              var2 = "<img=0>" + var6;
            }
            if (param1.field_b == 2) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          var3 = "";
          if (param1.field_m != 2) {
            if (0 == param1.field_m &&
              hm.field_c) {
              var3 = "[" + lj.field_p + "] ";
            }
            if (param1.field_m == 1) {
              var3 = "[" + tj.a(-44, new String[]{param1.field_o}, ul.field_j) + "] ";
            }
            if (param1.field_m == 4 &&
              null != he.field_d) {
              var3 = "[" + he.field_d + "] ";
            }
            if (param1.field_m == 3) {
              var3 = "[#" + param1.field_o + "] ";
            }
            if (!param1.field_i) {
              var3 = var3 + (String) (var2) + ": ";
            }
          } else {
            if (!param1.field_i) {
              if (param1.field_d == 0 &&
                0 == param1.field_k) {
                var3 = tj.a(param0 - 130, new String[]{(String) (var2)}, ge.field_n);
              } else {
                var3 = tj.a(-18, new String[]{(String) (var2)}, pk.field_f);
              }
            }
          }
          stackIn_33_0 = var3;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("jk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw aa.a((Throwable) (stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static void a(int param0, v param1) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ob.field_Y = param1;
          if (ob.field_Y != null &&
            ob.field_Y.field_l) {
            stackIn_5_0 = 1;
          } else {
            stackIn_5_0 = 0;
          }
          li.a(stackIn_5_0, 0);
          if (param0 > -110) {
            field_s = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("jk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        int var1 = 60 % ((8 - param0) / 48);
        return re.a((byte) -68, cd.e(122));
    }

    final static void a(byte param0) {
        int var2;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == jb.field_z) {
          return;
        }
        if (param0 != 121) {
          field_v = (String) null;
        }
        if (!jb.field_z.field_i) {
          if ((1 << jb.field_z.field_I & jb.field_z.field_b) == 0) {
            if (jb.field_z.field_b != 0) {
              ce.field_g[12] = mo.field_g;
            } else {
              if ((jb.field_z.field_a | 1 << jb.field_z.field_I) == (1 << jb.field_z.field_V.s(0)) - 1) {
                ce.field_g[12] = rb.field_m;
              } else {
                ce.field_g[12] = ra.field_n;
              }
            }
          } else {
            ce.field_g[12] = eh.field_d;
          }
        } else {
          if ((1 << jb.field_z.field_I & jb.field_z.field_b) != 0) {
            ce.field_g[12] = vm.field_e;
          } else {
            if (0 == jb.field_z.field_b) {
              if ((1 << jb.field_z.field_I | jb.field_z.field_a) != -1 + (1 << jb.field_z.field_V.s(param0 ^ 121))) {
                ce.field_g[12] = nl.field_Bb;
              } else {
                ce.field_g[12] = so.field_b;
              }
            } else {
              ce.field_g[12] = ng.field_H;
            }
          }
        }
    }

    jk(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_p = mj.a(param0.length, (byte) -104, param0);
          if (param1 != this.field_p) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_x = nn.a(param0.length, (byte) -93, param0, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_x[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 12);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Game Options";
        field_s = "Your email address is used to identify this account";
        field_a = new int[]{2, 3, 4, 5, 6};
        field_d = "Not enough wands to buy (";
        field_v = "This is the Book of Underdark. Underdark spells focus on stealing health and turning minions into zombies. You require 5 wands to purchase this spellbook; you currently have ";
    }
}
