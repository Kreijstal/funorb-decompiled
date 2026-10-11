/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ie extends ed implements vb {
    static String field_Lb;
    private ln field_Kb;
    static String field_Ub;
    static String field_Rb;
    static int field_Sb;
    static boolean field_Pb;
    static int field_Vb;
    static ll[] field_Tb;
    private boolean field_Wb;
    static String field_Mb;
    private boolean field_Ob;
    static String field_Jb;
    static String field_Nb;
    static mo field_Qb;

    final static boolean a(int param0, boolean param1) {
        long dupTemp$2 = 0L;
        if (nn.field_o == null) {
          nn.field_o = qg.field_b.a(ng.field_G, true, ka.field_q);
        }
        if (param0 >= -35) {
          ie.l((byte) 23);
        }
        if (nn.field_o.field_e == 0) {
          return false;
        }
        dupTemp$2 = qj.b(-26572);
        fo.field_d = dupTemp$2;
        hi.field_d = dupTemp$2;
        if (nn.field_o.field_e != 1) {
        }
        ob.field_eb = nl.field_Ib;
        nn.field_o = null;
        return true;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (!param0) {
          field_Tb = (ll[]) null;
        }
        if (this.field_Wb) {
          sc.a(true, false, false);
          return;
        }
        try {
          mo.g(-1);
          this.h(77);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ie.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    ie(h param0, ln param1) {
        super(param0, go.field_k, qe.field_l, false, false);
        try {
          this.field_Kb = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        ho var2 = null;
        if (param0 <= 19) {
          return false;
        }
        if (this.field_G &&
          !this.field_Ob) {
          var2 = pe.e(false);
          if (var2 != null) {
            this.a(var2, (byte) 119, false);
          }
        }
        return super.a((byte) 83);
    }

    final static boolean b(byte param0, String param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          try {
            if (!dl.field_s.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; var3 < param1.length(); var3++) {
              if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                return false;
              }
            }
            var4 = -39 / ((param0 - 77) / 37);
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var2_ref2;
          stackIn_22_1 = new StringBuilder().append("ie.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void m(byte param0) {
        field_Qb = null;
        field_Lb = null;
        if (param0 <= 13) {
          ie.m((byte) 103);
        }
        field_Jb = null;
        field_Nb = null;
        field_Mb = null;
        field_Ub = null;
        field_Rb = null;
        field_Tb = null;
    }

    final void l(int param0) {
        this.a(ab.a(0, param0, g.field_c), (byte) 124, true);
    }

    private final void a(ho param0, byte param1, boolean param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        me var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_Ob = true;
          if (param1 < 115) {
            field_Mb = (String) null;
          }
          if (!param0.field_f) {
            if (param0.field_b == null) {
              var4 = param0.field_e;
              if (param0.field_a == 248) {
                if (!param2) {
                  na.i((byte) 105);
                }
                var4 = g.field_c;
                this.field_Wb = true;
              }
            } else {
              var4 = ec.field_e;
              if (this.field_Kb != null) {
                this.field_Kb.a((byte) -7);
              }
            }
          } else {
            var4 = aa.field_h;
          }
          var5 = new me((ed) (this), go.field_k, var4);
          if (param0.field_f) {
            if (param0.field_h) {
              this.a((byte) -92, (qm) (new ng(this)));
              return;
            }
            var5.a(73, qn.field_lb, (wc) (this));
          } else {
            if (!this.field_Wb) {
              if (5 != param0.field_a) {
                var5.a(ae.field_b, (byte) 115, -1);
              } else {
                var5.a(ee.field_f, (byte) 111, 11);
                var5.a(ki.field_u, (byte) 10, 17);
              }
            } else {
              var5.a(116, qn.field_lb, (wc) (this));
            }
            if (3 == param0.field_a) {
              var5.a(bd.field_b, (byte) 10, 7);
            } else {
              if (param0.field_a == 6) {
                var5.a(ea.field_B, (byte) -121, 9);
              }
            }
          }
          this.a((byte) -92, (qm) (var5));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("ie.WA(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void l(byte param0) {
        uc.field_d.a(-(!fc.field_a ? 0 : 40 + (2 + (nn.field_p + 2))) + mj.field_s.field_x, 0, 0, 18, (byte) -120);
        nh.field_z.a(nn.field_p + 42, -40 + (-nn.field_p + mj.field_s.field_x) - 2, 0, 18, (byte) -120);
        nj.field_m.a(20, nn.field_p, mj.field_s.field_x, false, 0, mj.field_s.field_I - 20, 2);
        int var1 = -112 % ((param0 - 45) / 37);
    }

    static {
        field_Lb = "Character Creation";
        field_Rb = "<shad><col=<%0>>COGS</col></shad>";
        field_Ub = "Try changing the following settings:  ";
        field_Vb = 1;
        field_Jb = "This is the Book of Frost. Frost spells focus on high damage attacks and the summoning of powerful minions. You require 5 wands to purchase this spellbook; you currently have ";
        field_Mb = "Select the Lava Bomb spell below.";
    }
}
