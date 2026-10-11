/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gf implements Iterator {
    static boolean field_g;
    private li field_i;
    private el field_a;
    static sq field_f;
    private li field_c;
    private int field_b;
    static tj field_h;
    static volatile int field_e;
    static int field_d;

    public final void remove() {
        if (this.field_c == null) {
          throw new IllegalStateException();
        }
        this.field_c.c(2);
        this.field_c = null;
    }

    final static boolean a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        if (param0) {
          gf.b(16, 44, -77);
        }
        var1 = kb.field_a;
        synchronized (var1) {
          if (ah.field_l == rq.field_B) {
            return false;
          }
          de.field_f = wm.field_j[rq.field_B];
          ji.field_r = af.field_F[rq.field_B];
          rq.field_B = 127 & rq.field_B + 1;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Vertigo2.field_L ? 1 : 0;
        if (this.field_a.field_f[this.field_b - 1] != this.field_i) {
          return true;
        }
        while (this.field_b < this.field_a.field_c) {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          if (this.field_a.field_f[fieldTemp$0].field_c != this.field_a.field_f[-1 + this.field_b]) {
            this.field_i = this.field_a.field_f[this.field_b - 1].field_c;
            return true;
          }
          this.field_i = this.field_a.field_f[-1 + this.field_b];
        }
        return false;
    }

    private final void a(int param0) {
        if (param0 < -99) {
          this.field_i = this.field_a.field_f[0].field_c;
          this.field_b = 1;
          this.field_c = null;
          return;
        }
        this.a(-22);
        this.field_i = this.field_a.field_f[0].field_c;
        this.field_b = 1;
        this.field_c = null;
    }

    final static boolean a(byte param0) {
        if (param0 > -41) {
          gf.a(false);
          if (qb.field_d == null) {
            return false;
          }
          if (null != qb.field_d.k(0)) {
            return true;
          }
          return false;
        }
        if (qb.field_d == null) {
          return false;
        }
        if (null != qb.field_d.k(0)) {
          return true;
        }
        return false;
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 != -28631) {
          return -21;
        }
        if (param0 != 1) {
          return ni.field_b[param0];
        }
        if (ti.a(param1, false)) {
          return 29;
        }
        return ni.field_b[param0];
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        li var1;
        int var2;
        var2 = Vertigo2.field_L ? 1 : 0;
        if (this.field_i != this.field_a.field_f[-1 + this.field_b]) {
          var1 = this.field_i;
          this.field_i = var1.field_c;
          this.field_c = var1;
          return var1;
        }
        do {
          if (this.field_a.field_c <= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var1 = this.field_a.field_f[fieldTemp$0].field_c;
        } while (var1 == this.field_a.field_f[-1 + this.field_b]);
        this.field_c = var1;
        this.field_i = var1.field_c;
        return var1;
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
        String var28;
        String var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var36;
        String var37;
        String var38;
        Object var39;
        CharSequence var40;
        int var5Lifetime1;
        String var33Lifetime1;
        var39 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (param2 <= 28) {
          gf.a((byte) -67);
        }
        var3 = 1;
        if (!nb.field_z &&
          null == gk.field_c) {
          var3 = 0;
        }
        if (ui.field_g == 0 &&
          null != sj.field_d) {
          var3 = 0;
        }
        if (ui.field_g == 2 &&
          !dh.a((byte) 127)) {
          var3 = 0;
        }
        if (de.field_f == 84) {
          if (var3 != 0) {
            if (0 >= fb.field_D.length()) {
              fb.h(0);
            } else {
              var4_ref_String = fb.field_D.toString();
              if (!wn.a(var4_ref_String, 0)) {
                var5 = ui.field_g;
                if (var5 == 0 &&
                  gd.field_j != null) {
                  var5 = 1;
                }
                if (ab.a(0, var5) == 2) {
                  cf.a(var5, 1, param0, (byte) 118);
                }
                tf.a(ui.field_g, ea.field_b, -117, var4_ref_String, param1, -1);
                fb.h(0);
              } else {
                var13 = (String) null;
                var12 = (String) null;
                dh.a((byte) -123, pd.field_b, 2, (String) null, 0, (String) null);
                var15 = (String) null;
                var14 = (String) null;
                dh.a((byte) -7, ch.field_f, 2, (String) null, 0, (String) null);
                fb.h(0);
              }
            }
          } else {
            if (ui.field_g != 0) {
              fb.h(0);
            }
          }
          return true;
        }
        if (de.field_f == 85) {
          if (var3 == 0) {
            return true;
          }
          if (0 >= fb.field_D.length()) {
            return true;
          }
          w.a(true, ' ', fb.field_D.length() - 1, fb.field_D);
          return true;
        }
        var4 = ji.field_r;
        if (!p.a(376, (char) var4)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (fb.field_D.length() >= 80) {
          return true;
        }
        discarded$0 = fb.field_D.append((char) var4);
        var5Lifetime1 = 485;
        var17 = qe.field_V;
        var16 = jk.a(15709, var17);
        var19 = var16;
        if (ui.field_g != 2) {
          var7 = "";
          if (ui.field_g != 0) {
            var28 = var7 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var28);
            if (cg.field_f.c(fb.field_D.toString()) > var5Lifetime1) {
              w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
            }
            return true;
          }
          if (gd.field_j == null) {
            if (!fq.field_i) {
              if (gd.field_j == null) {
                var33 = var7 + var19 + ": ";
                var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var33);
                if (cg.field_f.c(fb.field_D.toString()) > var5Lifetime1) {
                  w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                }
                return true;
              }
              if (!ar.field_t) {
                var31 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
                var32 = var31 + var19 + ": ";
                var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var32);
                if (cg.field_f.c(fb.field_D.toString()) > var5Lifetime1) {
                  w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                }
                return true;
              }
              if (null == v.field_a) {
                var29 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
                var30 = var29 + var19 + ": ";
                var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var30);
                if (cg.field_f.c(fb.field_D.toString()) > var5Lifetime1) {
                  w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                }
                return true;
              }
              var7 = "[" + v.field_a + "] ";
              var33Lifetime1 = var7 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var33Lifetime1);
              if (cg.field_f.c(fb.field_D.toString()) > var5Lifetime1) {
                w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
              }
              return true;
            }
            var7 = "[" + fb.field_A + "] ";
          }
          if (gd.field_j != null) {
            if (!ar.field_t) {
              var36 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
              var37 = var36 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var37);
              if (cg.field_f.c(fb.field_D.toString()) > var5Lifetime1) {
                w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
              }
              return true;
            }
            if (null == v.field_a) {
              var34 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
              var35 = var34 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var35);
              if (cg.field_f.c(fb.field_D.toString()) > var5Lifetime1) {
                w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
              }
              return true;
            }
            var7 = "[" + v.field_a + "] ";
          }
          var38 = var7 + var19 + ": ";
          var5Lifetime1 = var5Lifetime1 - cg.field_f.c(var38);
        } else {
          var40 = (CharSequence) ((Object) ea.field_b);
          var18 = Vertigo2.a(new String[]{vj.a(var40, (byte) 8)}, di.field_B, -117);
          var8 = Vertigo2.a(new String[]{var16}, af.field_L, 15);
          var9 = cg.field_f.c(var18);
          var10 = cg.field_f.c(var8);
          if (var10 >= var9) {
            var5Lifetime1 = var5Lifetime1 - var10;
          } else {
            var5Lifetime1 = var5Lifetime1 - var9;
          }
        }
        if (cg.field_f.c(fb.field_D.toString()) <= var5Lifetime1) {
          return true;
        }
        w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
        return true;
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 >= -11) {
          field_e = -67;
          field_f = null;
          return;
        }
        field_f = null;
    }

    gf(el param0) {
        this.field_c = null;
        try {
          this.field_a = param0;
          this.a(-120);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = false;
        field_f = new sq();
        field_e = 0;
        field_h = new tj();
        field_d = -1;
    }
}
