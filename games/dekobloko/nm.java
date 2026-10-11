/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends w {
    w field_Rb;
    static String field_Pb;
    jd field_Sb;
    static boolean field_Qb;
    static int[] field_Nb;
    w field_Ob;

    final static void f(int param0) {
        int var1 = -114 % ((param0 - 79) / 35);
        fj.a(48, (byte) -89, hm.field_d);
    }

    public static void g(int param0) {
        field_Nb = null;
        if (param0 != 48) {
          field_Nb = (int[]) null;
        }
        field_Pb = null;
    }

    final static int a(float param0, float param1, boolean param2, float param3) {
        float var4;
        float var5;
        float var6;
        float var7;
        int var8;
        float var9;
        float var10;
        float var11;
        float var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var13Lifetime1;
        var18 = client.field_A ? 1 : 0;
        var4 = 0.0f;
        var5 = 0.0f;
        var6 = 0.0f;
        var7 = param0 * 6.0f % 6.0f;
        var8 = (int)var7;
        var9 = var7 - (float)var8;
        var10 = (-param3 + 1.0f) * param1;
        var11 = (-(var9 * param3) + 1.0f) * param1;
        var12 = param1 * (-((1.0f - var9) * param3) + 1.0f);
        var13 = var8;
        if (var13 != 0) {
          if (var13 != 1) {
            if (var13 == 2) {
              var5 = param1;
              var4 = var10;
              var6 = var12;
            } else {
              if (var13 == 3) {
                var5 = var11;
                var6 = param1;
                var4 = var10;
              } else {
                if (4 != var13) {
                  if (var13 == 5) {
                    var4 = param1;
                    var6 = var11;
                    var5 = var10;
                  }
                } else {
                  var4 = var12;
                  var6 = param1;
                  var5 = var10;
                }
              }
            }
          } else {
            var5 = param1;
            var4 = var11;
            var6 = var10;
          }
        } else {
          var6 = var10;
          var4 = param1;
          var5 = var12;
        }
        if (param2) {
          return 25;
        }
        var13Lifetime1 = 256;
        var14 = Math.min(Math.round((float)var13Lifetime1 * var4), var13Lifetime1 - 1);
        var15 = Math.min(Math.round(var5 * (float)var13Lifetime1), -1 + var13Lifetime1);
        var16 = Math.min(Math.round((float)var13Lifetime1 * var6), -1 + var13Lifetime1);
        var17 = 255 & var16 | (var15 << 8 & 65280 | 16711680 & var14 << 16);
        return var17;
    }

    private final boolean a(boolean param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int stackIn_10_0 = 0;
        if (param2 != 43) {
          this.a(97, true, false, -111);
        }
        if (!param0) {
          if (this.field_jb) {
            stackIn_10_0 = (!param6) ? 1 : 0;
          } else {
            stackIn_10_0 = 0;
          }
        } else {
          stackIn_10_0 = 1;
        }
        var8 = stackIn_10_0;
        this.field_Ob.a((byte) -94, param5, this.field_Rb.field_N, var8 != 0);
        this.a(param1, param4, param2 ^ 43, false, param3);
        return var8 != 0;
    }

    private final void b(int param0, int param1, int param2) {
        this.field_Rb.field_mb = -param0 + (this.field_mb - param2);
        this.field_Rb.field_N = this.field_N;
        this.field_Ob.field_vb = param1;
        this.field_Ob.field_mb = -param0 + (this.field_mb - param2);
        this.field_Sb.a(this.field_mb - param2, (byte) -32, this.field_N, this.field_Ob.field_N, param2, -this.field_Ob.field_Ib, this.field_Rb.field_N, 0);
    }

    final static ck g(byte param0) {
        int var4 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var1 = tm.field_a[0] * hc.field_c[0];
        byte[] var2 = tc.field_Nb[0];
        int[] var3 = new int[var1];
        int var4Lifetime1;
        for (var4 = 0; var4 < var1; var4++) {
          var3[var4] = mb.field_d[lb.a(255, (int) var2[var4])];
        }
        var4Lifetime1 = -8 % ((param0 + 40) / 42);
        ck var5 = new ck(ed.field_f, i.field_d, sg.field_d[0], fh.field_a[0], tm.field_a[0], hc.field_c[0], var3);
        oa.a(127);
        return var5;
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        Object var21;
        CharSequence var22;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime1Lifetime1;
        String var7Lifetime1Lifetime2;
        String var7Lifetime1Lifetime3;
        String var7Lifetime1Lifetime4;
        String var7Lifetime1Lifetime5;
        String var7Lifetime1Lifetime6;
        var21 = null;
        var11 = client.field_A ? 1 : 0;
        if (param1 != 1) {
          field_Qb = true;
        }
        var3 = 1;
        if (!sc.field_m &&
          null == tf.field_gb) {
          var3 = 0;
        }
        if (pk.field_r == 0 &&
          null != g.field_N) {
          var3 = 0;
        }
        if (2 == pk.field_r &&
          !hl.a((byte) -53)) {
          var3 = 0;
        }
        if (wh.field_c == 84) {
          if (var3 == 0) {
            if (0 != pk.field_r) {
              qk.a((byte) 94);
            }
          } else {
            if (dj.field_ab.length() <= 0) {
              qk.a((byte) 94);
            } else {
              var4_ref_String = dj.field_ab.toString();
              var7 = var4_ref_String;
              var7Lifetime2 = var4_ref_String;
              if (ue.a(param1 ^ 2049, var4_ref_String)) {
                var13 = (String) null;
                var12 = (String) null;
                ca.a((String) null, (String) null, wd.field_a, (byte) 90, 2, 0);
                var15 = (String) null;
                var14 = (String) null;
                ca.a((String) null, (String) null, um.field_e, (byte) 69, 2, 0);
                qk.a((byte) 94);
              } else {
                var5 = pk.field_r;
                if (var5 == 0 &&
                  null != cd.field_m) {
                  var5 = 1;
                }
                if (rf.a(0, var5) == 2) {
                  eg.a(var5, param2, 1, (byte) 71);
                }
                ce.a(param0, (byte) -85, pk.field_r, ed.field_c, -1, var4_ref_String);
                qk.a((byte) 94);
              }
            }
          }
          return true;
        }
        if (wh.field_c == 85) {
          if (var3 != 0 &&
            0 < dj.field_ab.length()) {
            vf.a(dj.field_ab, -23510, dj.field_ab.length() - 1, ' ');
            return true;
          }
          return true;
        }
        var4 = el.field_G;
        if (!kh.a((char) var4, 8212)) {
          return false;
        }
        if (var3 != 0 &&
          80 > dj.field_ab.length()) {
          discarded$0 = dj.field_ab.append((char) var4);
          var5Lifetime1 = 485;
          var17 = oa.field_f;
          var7Lifetime1 = var17;
          var7Lifetime1Lifetime1 = var17;
          var16 = b.a(param1 + 82, var17);
          var7Lifetime1Lifetime2 = var16;
          var7Lifetime1Lifetime3 = var16;
          var18 = var16;
          var7Lifetime1Lifetime4 = var18;
          var7Lifetime1Lifetime5 = var18;
          if (pk.field_r == 2) {
            var22 = (CharSequence) ((Object) ed.field_c);
            var20 = cm.$cfr$intArgs$a$53ce4ab4c593(94, oj.field_b, new String[]{ua.a(var22, true)});
            var8 = cm.$cfr$intArgs$a$53ce4ab4c593(108, im.field_j, new String[]{var16});
            var9 = ff.field_o.a(var20);
            var10 = ff.field_o.a(var8);
            if (var9 <= var10) {
              var5Lifetime1 = var5Lifetime1 - var10;
            } else {
              var5Lifetime1 = var5Lifetime1 - var9;
            }
          } else {
            var7Lifetime1Lifetime6 = "";
            if (pk.field_r == 0) {
              if (cd.field_m == null &&
                ii.field_q) {
                var7Lifetime1Lifetime6 = "[" + uc.field_b + "] ";
              }
              if (null != cd.field_m) {
                if (wh.field_b &&
                  null != f.field_q) {
                  var7Lifetime1Lifetime6 = "[" + f.field_q + "] ";
                } else {
                  var7Lifetime1Lifetime6 = "[" + cm.$cfr$intArgs$a$53ce4ab4c593(125, hf.field_a, new String[]{cd.field_m.field_Vb}) + "] ";
                }
              }
            }
            var19 = var7Lifetime1Lifetime6 + var18 + ": ";
            var5Lifetime1 = var5Lifetime1 - ff.field_o.a(var19);
          }
          if (ff.field_o.a(dj.field_ab.toString()) > var5Lifetime1) {
            vf.a(dj.field_ab, -23510, dj.field_ab.length() - 1, ' ');
          }
        }
        return true;
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        if (param2 != -15230) {
          return false;
        }
        return this.a(param3, this.field_Rb.field_N, (byte) 43, param0, param1, param4, param5);
    }

    nm(long param0, w param1, w param2, jd param3) {
        super(param0, (w) null);
        try {
          this.field_Rb = new w(0L, param2);
          this.field_Sb = new jd(0L, param3);
          this.a(this.field_Rb, -16834);
          this.a(this.field_Sb, -16834);
          this.field_Ob = param1;
          this.field_Rb.a(param1, -16834);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "nm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void h(byte param0) {
        if (param0 != 112) {
          field_Qb = false;
        }
    }

    final void a(int param0, boolean param1, boolean param2, int param3) {
        this.a(this.field_Rb.field_N, param0, 0, param2, param3);
        if (!param1) {
          nm.h((byte) 66);
        }
    }

    final static void e(int param0) {
        if (!ai.f((byte) -126)) {
          return;
        }
        bl.a(-11, 4, false);
        int var1 = -75 / ((-27 - param0) / 47);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_mb = param5;
        if (param0 != 6) {
          return;
        }
        this.field_vb = param3;
        this.field_Ib = param1;
        this.field_N = param4;
        this.b(param6, 0, param2);
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (this.field_Sb.i((byte) 7)) {
          this.field_Ob.field_Mb = this.field_Ob.field_Mb + param4;
        }
        if (this.field_Sb.h((byte) 78)) {
          this.field_Ob.field_Mb = this.field_Ob.field_Mb - param4;
        }
        if (this.field_Sb.g((byte) -127)) {
          this.field_Ob.field_Mb = this.field_Ob.field_Mb + param0;
        }
        if (this.field_Sb.f(param2)) {
          this.field_Ob.field_Mb = this.field_Ob.field_Mb - param0;
        }
        if (this.field_jb) {
          this.field_Ob.field_Mb = this.field_Ob.field_Mb - param1;
        }
        if (param3) {
          if (0 > -(this.field_Ob.field_Ib + this.field_Ob.field_Mb)) {
            this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
          }
          if (this.field_Ob.field_F + (this.field_Ob.field_N - this.field_Rb.field_N) < -(this.field_Ob.field_Mb + this.field_Ob.field_Ib)) {
            this.field_Ob.field_Mb = -this.field_Ob.field_Ib - (-this.field_Rb.field_N + (this.field_Ob.field_F + this.field_Ob.field_N));
          }
        } else {
          if (-(this.field_Ob.field_Mb + this.field_Ob.field_Ib) > this.field_Ob.field_F + this.field_Ob.field_N - this.field_Rb.field_N) {
            this.field_Ob.field_Mb = -(-this.field_Rb.field_N + (this.field_Ob.field_N + this.field_Ob.field_F)) - this.field_Ob.field_Ib;
          }
          if (-(this.field_Ob.field_Ib + this.field_Ob.field_Mb) < 0) {
            this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
          }
        }
        if (this.field_Sb.j((byte) -2)) {
          this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
          this.field_Ob.field_Mb = 0;
        }
        this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
    }

    static {
        field_Pb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_Nb = new int[128];
    }
}
