/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends hd {
    private boolean field_Jb;
    static boolean field_Rb;
    static long field_Ib;
    static String field_Vb;
    private StringBuilder field_Ub;
    static int field_Ob;
    private int field_Mb;
    private boolean field_Hb;
    private wu field_Gb;
    private int field_Tb;
    private bu field_Pb;
    static String field_Cb;
    static boolean field_Wb;
    private long field_Sb;
    static int field_zb;
    static hd field_Qb;
    static nb[] field_Db;
    private hd field_yb;
    static String field_Kb;
    static gq field_Bb;
    private int field_Ab;
    private int field_Eb;
    private int field_Fb;
    private hd field_Nb;
    hd field_Lb;

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        StringBuilder discarded$0 = null;
        if (param0 != 32) {
          return;
        }
        if (this.field_Mb != this.field_Fb) {
          var2 = this.field_Mb <= this.field_Fb ? this.field_Mb : this.field_Fb;
          var3 = this.field_Mb <= this.field_Fb ? this.field_Fb : this.field_Mb;
          this.field_Fb = var2;
          this.field_Mb = var2;
          var4 = this.field_Ub.toString().substring(var3, this.field_Ub.length());
          dj.a(var2, ' ', param0 - 11439, this.field_Ub);
          discarded$0 = this.field_Ub.append(var4);
          this.field_Lb.field_E = this.field_Ub.toString();
        }
    }

    vg(long param0, hd param1, hd param2, hd param3, int param4) {
        super(param0, param1);
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_Sb = 0L;
        this.field_Tb = -1;
        this.field_Jb = false;
        this.field_Hb = false;
        try {
          this.field_Eb = param4;
          this.field_Nb = new hd(0L, param2);
          this.field_Lb = new hd(0L, param3);
          this.field_yb = new hd(0L, param3);
          this.field_nb = true;
          stackIn_3_1 = null;
          stackIn_3_2 = null;
          if (this.field_Eb != -1) {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = this.field_Eb;
          } else {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = 256;
          }
          this.field_Ub = new StringBuilder(stackIn_4_3);
          this.field_Lb.field_E = this.field_Ub.toString();
          this.field_yb.field_E = "";
          this.field_yb.field_V = "|";
          this.field_jb = new tf();
          this.a((byte) -123, this.field_Nb);
          this.a((byte) -113, this.field_Lb);
          this.a((byte) -115, this.field_yb);
          this.field_wb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("vg.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void m(int param0) {
        if (param0 != 96) {
          vg.a(49);
        }
        field_Kb = null;
        field_Vb = null;
        field_Cb = null;
        field_Bb = null;
        field_Db = null;
        field_Qb = null;
    }

    private final void c(boolean param0) {
        if (param0) {
          field_Wb = false;
        }
        if (null == this.field_Pb) {
          return;
        }
        String var2 = this.i((byte) 35);
        if (var2.length() == 0) {
          return;
        }
        java.awt.datatransfer.StringSelection var3 = new java.awt.datatransfer.StringSelection(this.i((byte) 35));
        this.field_Pb.a((byte) 68, (java.awt.datatransfer.Transferable) ((Object) var3));
    }

    final void k(int param0) {
        int discarded$0 = 0;
        dj.a(0, ' ', -11407, this.field_Ub);
        this.field_Mb = 0;
        this.field_Fb = 0;
        if (param0 != -19174) {
          discarded$0 = this.h(-14);
        }
        this.field_Lb.field_E = this.field_Ub.toString();
    }

    final static void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        jm var6_ref_jm = null;
        int var7 = 0;
        byte[] var8 = null;
        jm var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        jm var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        int var6Lifetime1;
        var7 = Kickabout.field_G;
        try {
          if (go.field_b != 0) {
            var2_long = nj.a(param1 - 75);
            var4 = go.field_b;
            if (0.0 != m.field_a) {
              var4 = (int)((double)var4 + ac.field_d.nextGaussian() * m.field_a);
              if (0 > var4) {
                var4 = 0;
              }
            }
            if (or.field_d.field_n > 0) {
              var14 = new byte[or.field_d.field_n];
              var11 = var14;
              var8 = var11;
              var17 = var8;
              for (var6 = 0; var6 < var14.length; var6++) {
                var8[var6] = or.field_d.field_f[var6];
              }
              var6_ref_jm = new jm((long)var4 + var2_long, or.field_d.field_n, var17);
              am.field_g.a(var6_ref_jm, 3);
              or.field_d.field_n = 0;
            }
            var9 = (jm) (am.field_g.g(24009));
            var13 = var9;
            if (var13 != null &&
              var13.field_f < var2_long) {
              var13.c((byte) -109);
              var10 = 0;
              var6Lifetime1 = var10;
              while (var10 < var13.field_j) {
                or.field_d.field_f[var10] = var9.field_k[var10];
                var10++;
              }
              or.field_d.field_n = var13.field_j;
            }
          }
          c.a(param0, false);
          if (param1 != 0) {
            field_Qb = (hd) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "vg.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(bu param0, int param1) {
        if (param1 != -17421) {
          return;
        }
        try {
          this.field_Pb = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vg.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, byte param1) {
        int var3 = 20 / ((62 - param1) / 58);
        if (null != this.field_Lb) {
          this.field_Lb.field_y = param0;
        }
    }

    final static void a(boolean param0, wd param1, int param2) {
        ml var3 = null;
        try {
          var3 = or.field_d;
          var3.b(param2, (byte) 98);
          if (!param0) {
            vg.c(-62, -59);
          }
          var3.a(127, param1.field_k);
          var3.a(115, param1.field_p);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vg.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int j(int param0) {
        if (param0 != -1) {
          return 64;
        }
        return this.field_Mb;
    }

    final static boolean e(int param0, int param1) {
        int var2 = param1;
        nv.a(var2, m.field_a, i.field_B, 0, var2);
        if (param0 != -63) {
          vg.b(-62, 88);
        }
        return true;
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        int dupTemp$1 = 0;
        try {
          this.field_Ub.setLength(0);
          if (param1 != -23174) {
            this.f(24, 5);
          }
          var3_int = param0.length();
          if (this.field_Eb != -1 &&
            this.field_Eb < var3_int) {
            var3_int = this.field_Eb;
          }
          discarded$0 = this.field_Ub.append(param0.substring(0, var3_int));
          dupTemp$1 = this.field_Ub.length();
          this.field_Fb = dupTemp$1;
          this.field_Mb = dupTemp$1;
          this.field_Lb.field_E = this.field_Ub.toString();
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vg.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1) {
        sr.field_c = rt.field_G[param0];
        ks.field_g = fi.field_g[param0];
        if (param1 != 31900) {
          field_Qb = (hd) null;
        }
        ep.field_e = ss.field_a[param0];
    }

    private final void h(byte param0) {
        if (null == this.field_Pb) {
          return;
        }
        this.c(false);
        if (param0 <= 42) {
          this.b(-41);
        }
        this.l(32);
    }

    private final void k(byte param0) {
        if (param0 != 38) {
          return;
        }
        if (null == this.field_Pb) {
          return;
        }
        this.field_Gb = this.field_Pb.a(15);
    }

    private final int d(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        var3 = param1;
        var4 = 0;
        var5 = this.field_Ub.length();
        while (var4 < param0) {
          if (var5 > var3) {
            incrementValue$1 = var3;
            var3++;
            var4 = var4 + this.field_Lb.field_X.a(this.field_Ub.charAt(incrementValue$1));
            continue;
          }
          break;
        }
        return var3;
    }

    final boolean a(int param0, char param1, int param2) {
        int discarded$0 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int stackIn_31_0 = 0;
        int stackIn_52_0 = 0;
        int var4;
        String var5;
        if (param1 != 60 &&
          param1 != 62) {
          if (param2 != 875) {
            discarded$0 = this.d(-84, 20);
          }
          if (param1 >= 32 &&
            param1 <= 126) {
            if (this.field_Fb != this.field_Mb) {
              this.l(32);
            }
            if (this.field_Eb != -1 &&
              this.field_Ub.length() >= this.field_Eb) {
              return true;
            }
            if (this.field_Mb == this.field_Ub.length()) {
              discarded$1 = this.field_Ub.append(param1);
            } else {
              var5 = this.field_Ub.toString().substring(this.field_Mb, this.field_Ub.length());
              dj.a(this.field_Mb, ' ', param2 - 12282, this.field_Ub);
              discarded$2 = this.field_Ub.append(param1);
              discarded$3 = this.field_Ub.append(var5);
            }
            this.field_Lb.field_E = this.field_Ub.toString();
            this.field_Mb = this.field_Mb + 1;
            this.field_Fb = this.field_Mb;
            return true;
          }
          if (85 == param0) {
            if (this.field_Mb != this.field_Fb) {
              this.l(32);
              return true;
            }
            if (this.field_Mb > 0) {
              this.field_Fb = -1 + this.field_Mb;
              this.l(32);
              return true;
            }
          } else {
            if (param0 != 101) {
              if (param0 == 13) {
                this.k(-19174);
                return true;
              }
              if (param0 != 96) {
                if (param0 == 97) {
                  if (this.field_Mb < this.field_Ub.length()) {
                    if (ne.field_G[82]) {
                      stackIn_52_0 = this.i(-100);
                    } else {
                      stackIn_52_0 = this.field_Mb + 1;
                    }
                    var4 = stackIn_52_0;
                    this.a(var4, (byte) -115);
                    return true;
                  }
                } else {
                  if (102 == param0) {
                    this.a(0, (byte) -126);
                    return true;
                  }
                  if (param0 == 103) {
                    this.a(this.field_Ub.length(), (byte) -103);
                    return true;
                  }
                  if (ne.field_G[82] &&
                    65 == param0) {
                    this.h((byte) 74);
                    return true;
                  }
                  if (ne.field_G[82] &&
                    param0 == 66) {
                    this.c(false);
                    return true;
                  }
                  if (ne.field_G[82] &&
                    param0 == 67) {
                    this.k((byte) 38);
                    return true;
                  }
                }
              } else {
                if (this.field_Mb > 0) {
                  if (ne.field_G[82]) {
                    stackIn_31_0 = this.h(26864);
                  } else {
                    stackIn_31_0 = this.field_Mb - 1;
                  }
                  var4 = stackIn_31_0;
                  this.a(var4, (byte) -103);
                  return true;
                }
              }
            } else {
              if (this.field_Fb != this.field_Mb) {
                this.l(32);
                return true;
              }
              if (this.field_Mb < this.field_Ub.length()) {
                this.field_Fb = 1 + this.field_Mb;
                this.l(32);
                return true;
              }
            }
          }
          return false;
        }
        return false;
    }

    final String j(byte param0) {
        if (param0 != -16) {
          return (String) null;
        }
        return this.field_Ub.toString();
    }

    final String i(byte param0) {
        if (param0 != 35) {
          this.field_yb = (hd) null;
        }
        String var2 = this.field_Ub.toString();
        int var3 = this.field_Mb <= this.field_Fb ? this.field_Mb : this.field_Fb;
        int var4 = this.field_Mb <= this.field_Fb ? this.field_Fb : this.field_Mb;
        return var2.substring(var3, var4);
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var2 = this.field_Ub.length();
        var3 = 112 / ((param0 - 27) / 50);
        if (this.field_Mb == var2) {
          return this.field_Mb;
        }
        for (var4 = this.field_Mb + 1; var4 < var2; var4++) {
          if (!pi.a(-41, this.field_Ub.charAt(-1 + var4))) {
            continue;
          }
          break;
        }
        return var4;
    }

    final void f(int param0, int param1) {
        this.field_Mb = param1;
        this.field_Fb = param1;
        if (param0 > -22) {
          this.a(88, -94, -16, -118, -110);
        }
    }

    final static String a(int param0) {
        int var1 = 100 / ((36 - param0) / 50);
        String var2 = "";
        if (pb.field_E != null) {
          var2 = pb.field_E.a(124);
        }
        if (var2.length() == 0) {
          var2 = ue.f((byte) 99);
        }
        if (0 == var2.length()) {
          var2 = pc.field_d;
        }
        return var2;
    }

    private final void a(int param0, byte param1) {
        this.field_Mb = param0;
        if (param1 > -70) {
          vg.c(-51, -118);
        }
        if (!ne.field_G[81]) {
          this.field_Fb = this.field_Mb;
        }
    }

    private final int h(int param0) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        if (param0 != 26864) {
          this.l(11);
        }
        if (this.field_Mb == 0) {
          return this.field_Mb;
        }
        for (var2 = this.field_Mb - 1; var2 > 0; var2--) {
          if (!pi.a(-41, this.field_Ub.charAt(-1 + var2))) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void a(String param0, int param1) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Eb != -1) {
            var3_int = this.field_Eb - this.field_Ub.length();
            if (0 == var3_int) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (param1 >= -1) {
            field_Wb = true;
          }
          if (this.field_Mb != this.field_Ub.length()) {
            var4 = this.field_Ub.toString().substring(this.field_Mb, this.field_Ub.length());
            dj.a(this.field_Mb, ' ', -11407, this.field_Ub);
            discarded$4 = this.field_Ub.append(param0);
            discarded$5 = this.field_Ub.append(var4);
          } else {
            discarded$6 = this.field_Ub.append(param0);
          }
          this.field_Lb.field_E = this.field_Ub.toString();
          this.field_Mb = this.field_Ub.length();
          this.field_Fb = this.field_Mb;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vg.IA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    vg(long param0, hd param1, hd param2, hd param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var4 = this.field_Ub.length();
        if (param0 < 0) {
          param0 = 0;
        } else {
          if (var4 < param0) {
            param0 = var4;
          }
        }
        if (param1 >= -83) {
          this.c(false);
        }
        if (param2 >= 0) {
          if (var4 < param2) {
            param2 = var4;
          }
        } else {
          param2 = 0;
        }
        this.field_Mb = param0;
        this.field_Fb = param2;
    }

    final void b(int param0) {
        try {
          int dupTemp$0 = 0;
          boolean stackIn_14_1 = false;
          int stackIn_28_0 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          long var3_long = 0L;
          int var3 = 0;
          int var4_int = 0;
          Exception var4 = null;
          int var5 = 0;
          int var6 = 0;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          var6 = Kickabout.field_G;
          var2 = this.d(el.field_A - this.field_F - this.field_Lb.field_D, param0 ^ param0);
          if (this.field_sb == 1) {
            this.a(var2, (byte) -112);
            this.field_Jb = true;
            var3_long = nj.a(-69);
            stackIn_14_1 = !(var3_long - this.field_Sb >= 250L);
            this.field_Hb = stackIn_14_1;
            if (this.field_Hb) {
              this.field_Fb = this.h(26864);
              this.field_Mb = this.i(-26);
              if (this.field_Mb > 0 &&
                32 == this.field_Ub.charAt(this.field_Mb - 1)) {
                this.field_Mb = this.field_Mb - 1;
              }
              this.field_Tb = this.field_Mb;
            }
            this.field_Sb = var3_long;
          } else {
            if (1 == nl.field_p &&
              this.field_Jb) {
              if (this.field_Hb &&
                var2 < this.field_Tb &&
                this.field_Fb < var2) {
                var2 = this.field_Tb;
              }
              this.field_Mb = var2;
            } else {
              this.field_Jb = false;
            }
          }
          if (!this.field_wb) {
            dupTemp$0 = this.field_Ub.length();
            this.field_Fb = dupTemp$0;
            this.field_Mb = dupTemp$0;
          }
          this.field_yb.field_s = this.field_Lb.field_X.a(this.field_Ub.toString().substring(0, this.field_Mb));
          if (this.field_Fb != this.field_Mb) {
            var3 = this.field_Lb.field_s + this.field_Lb.field_X.a(this.field_Ub.toString().substring(0, this.field_Fb));
            if (var3 < this.field_yb.field_s) {
              stackIn_28_0 = var3;
            } else {
              stackIn_28_0 = this.field_yb.field_s;
            }
            var4_int = stackIn_28_0;
            var5 = Math.abs(-this.field_yb.field_s + var3);
            this.field_Nb.a(true, var5, var4_int + this.field_Lb.field_D, 2, this.field_Ab);
          } else {
            this.field_Nb.a(true, 0, this.field_yb.field_s, 2, this.field_Ab);
          }
          if (this.field_Gb != null &&
            this.field_Gb.field_a != 0) {
            var7 = (java.awt.datatransfer.Transferable) (this.field_Gb.field_b);
            try {
              var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
              this.l(32);
              this.a(var8, -41);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_Gb = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -630) {
          field_Db = (nb[]) null;
        }
        this.a(true, param4, param1, param2, param3);
        this.field_Lb.a(true, param4, 0, 0, param3);
        this.field_yb.a(true, param4, 0, 0, param3);
        this.field_Ab = param3 - 4;
    }

    static {
        field_Rb = true;
        field_Ob = 0;
        field_Vb = "Location";
        field_Bb = null;
        field_Db = new nb[89];
        field_Kb = "If you do nothing the game will revert to normal view in <%0> second.";
        field_Cb = "Try changing the following settings:  ";
        field_Wb = true;
    }
}
