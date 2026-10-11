/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rfa extends ug implements sia {
    static String field_B;
    static jea field_C;

    abstract boolean a(int param0, kh param1, byte param2);

    final void c(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        java.awt.Canvas var2 = kw.b((byte) -97);
        if (wna.c(-127)) {
          fh.a(vka.A(90), var2, param0 ^ 0);
          return;
        }
        if (!lla.field_b) {
          dba.a(var2, (byte) 101);
          return;
        }
        if (!av.field_e &&
          !vpa.a(109)) {
          ima.a(100.0f, th.field_u, -75);
          dba.a(var2, (byte) 111);
          return;
        }
        cna.field_a = true;
        if (param0 != 0) {
          return;
        }
        for (var3 = -1 + kra.field_c.size(); var3 >= 0; var3--) {
          ((sia) (kra.field_c.elementAt(var3))).b(param0 + 1);
        }
        if (!cna.field_a) {
          this.c(true);
        } else {
          pka.a(false);
          fga.a(0, false, 0, var2);
        }
    }

    final void a(eb param0, int param1) {
        try {
          dma.field_l = param0;
          this.b((byte) 106, true);
          if (param1 <= 34) {
            return;
          }
          try {
            this.s(-1);
            this.j(-13);
            this.o(9822);
            this.g((byte) -126);
            this.p(22);
            this.d((byte) 87);
            vca.field_c[9] = -1;
            vca.field_c[10] = -1;
            kra.field_c = new Vector();
            aca.a((sia) (this), 19711);
          } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rfa.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected rfa() {
    }

    private final void c(boolean param0) {
        if (!param0) {
          field_B = (String) null;
        }
    }

    public abstract void a(boolean param0, boolean param1);

    public static void w(int param0) {
        field_C = null;
        if (param0 < 105) {
          iu[] var2 = (iu[]) null;
          rfa.a((iu[]) null, 100);
        }
        field_B = null;
    }

    abstract void b(int param0, int param1);

    private final void b(boolean param0) {
        boolean stackIn_3_0 = false;
        int stackIn_46_1 = 0;
        boolean stackIn_47_2 = false;
        int stackIn_63_0 = 0;
        int stackIn_64_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        sia var6;
        int var3Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        stackIn_3_0 = !param0;
        if (lca.a(stackIn_3_0)) {
          this.a(param0, false);
        } else {
          if (!una.a((byte) 127)) {
            if (fja.h(105)) {
              stackIn_46_1 = -85;
              stackIn_47_2 = (null != dq.field_f);
              var3 = this.a(stackIn_46_1, stackIn_47_2);
              if (var3 != 1 &&
                var3 != 2) {
                this.a(true, false);
              } else {
                if (dq.field_f != null) {
                  og.b(0);
                }
                if (2 == var3) {
                  hha.a(di.a(110), (byte) -95);
                }
                this.a(true, false);
              }
            } else {
              if (ofa.d(true)) {
                if (sr.a(119)) {
                  au.b(false);
                } else {
                  var3 = kc.a(true);
                  if (var3 == 1) {
                    ts.a((byte) -63, ura.field_a, true);
                  }
                  this.a(true, false);
                }
              } else {
                if (!sr.a(125)) {
                  var2 = 1;
                  var3 = -1;
                  while (es.a(true)) {
                    if (fna.field_h == -1) {
                      if (fna.field_h == -1 &&
                        var3 != -1) {
                        fna.field_h = var3;
                        var3 = -1;
                      }
                    } else {
                      if (on.a((byte) 15, fna.field_h)) {
                        var3 = fna.field_h;
                        continue;
                      }
                    }
                    var4 = 0;
                    while (kra.field_c.size() > var4) {
                      if (((sia) (kra.field_c.elementAt(var4))).a((byte) -72, kda.field_td, fna.field_h)) {
                        break;
                      }
                      var4++;
                    }
                  }
                } else {
                  au.b(!param0);
                }
              }
            }
          } else {
            if (sr.a(126)) {
              au.b(false);
            } else {
              var3 = vk.c(107);
              if (var3 != 2) {
                if (var3 == 3) {
                  in.a(-30600, true);
                  this.a(true, false);
                } else {
                  if (var3 == 4) {
                    ts.a((byte) -63, ck.field_b, false);
                    kpa.field_c = true;
                    this.a(true, false);
                  } else {
                    this.a(true, false);
                  }
                }
              } else {
                og.b(0);
              }
            }
          }
        }
        if (!param0) {
          return;
        }
        for (var3Lifetime1 = 0; kra.field_c.size() > var3Lifetime1; var3Lifetime1++) {
          var6 = (sia) (kra.field_c.elementAt(var3Lifetime1));
          var6.a(true, var2 != 0);
          stackIn_63_0 = var2;
          if (var6.a(-2)) {
            stackIn_64_1 = 0;
          } else {
            stackIn_64_1 = 1;
          }
          var2 = stackIn_63_0 & stackIn_64_1;
        }
    }

    public abstract void b(int param0);

    public final boolean a(int param0) {
        if (param0 != -2) {
          field_C = (jea) null;
          return true;
        }
        return true;
    }

    final static iu[] a(iu[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        iu var3 = null;
        int var4 = 0;
        iu[] stackIn_3_0 = null;
        iu[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 < 111) {
            stackIn_3_0 = (iu[]) null;
            return stackIn_3_0;
          }
          while (param0.length > var2_int) {
            var3 = param0[var2_int];
            param0[var2_int].field_p = 0;
            var3.field_o = 0;
            param0[var2_int].field_n = param0[var2_int].field_m;
            param0[var2_int].field_k = param0[var2_int].field_q;
            var2_int++;
          }
          stackIn_7_0 = (iu[]) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("rfa.HB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        int var2;
        int var3;
        int var4;
        cga var5;
        var4 = TombRacer.field_G ? 1 : 0;
        if (dq.field_f != null &&
          dq.field_f.field_b) {
          og.b(0);
          vd.b(1);
        }
        stackIn_5_1 = -127;
        stackIn_6_2 = (dq.field_f != null);
        this.c((byte) stackIn_5_1, stackIn_6_2);
        if (lpa.field_w) {
          dma.field_l.a((byte) -38);
          lpa.field_w = false;
        }
        if (wna.c(-128)) {
          this.r(114);
          if (wna.c(-112)) {
            return;
          }
        }
        this.u(97);
        if (!lla.field_b) {
          tc.a(pg.field_y, -2886);
          if (dma.field_l.b(-4171)) {
            dma.field_l.b((byte) -49);
            lla.field_b = true;
          }
        } else {
          if (!av.field_e) {
            if (!vpa.a(84)) {
              if (dma.field_l.a(-127)) {
                av.field_e = true;
                this.v(24230);
                ln.A(116);
              }
            } else {
              this.b(true);
            }
          } else {
            this.b(true);
          }
        }
        if (!vpa.a(66)) {
          while (true) {
            var5 = (cga) (sua.field_H.c(119));
            if (var5 == null) {
              break;
            }
            woa.a(4, var5, false);
          }
        }
        dra.a(param0);
        vsa.c((byte) 120, 0);
        if (uma.b(-1)) {
          var2 = this.t(8);
          if (0 == var2 ||
            var2 == 1) {
            this.b(var2, 120);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.h((byte) 84)) {
            var3 = 1;
          }
          if (!uma.b(-1)) {
            var3 = 0;
          }
          if (var3 != 0) {
            dw.b((byte) -16);
          }
        }
    }

    abstract void v(int param0);

    private final void u(int param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 68 % ((param0 - 52) / 40);
        while (cj.a(vca.field_c, 0)) {
          if (this.a(oka.field_z, vc.field_q, (byte) 105)) {
            continue;
          }
          this.m(-5);
        }
    }

    public abstract boolean a(byte param0, char param1, int param2);

    abstract boolean h(byte param0);

    static {
    }
}
