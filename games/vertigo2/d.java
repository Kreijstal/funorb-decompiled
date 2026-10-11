/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class d extends iq {
    private boolean field_D;
    static float field_C;
    boolean field_F;
    private boolean field_E;
    boolean field_G;

    void a(int param0, int param1, byte param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (null != this.field_v &&
            this.field_v instanceof ij) {
            ((ij) (this.field_v)).a(param3, this, (byte) -123, param1, param0);
          }
          if (param2 < 111) {
            this.a(51, -64, (byte) -111, 64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "d.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 < rk.field_y &&
            ce.field_c) {
            bi.d(0, 0, bi.field_e, td.field_c.field_C);
            oc.field_v.b(param1, 0);
          }
          if (param0 < 47) {
            field_C = 1.5664135217666626f;
          }
          if (ko.field_P <= 0 &&
            mp.field_b <= 0) {
            return;
          }
          if (im.field_g) {
            bi.d(0, 0, bi.field_e, td.field_c.field_C);
            wc.field_m.b(param1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "d.KA(" + param0 + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 > -107) {
            return true;
          }
          if (this.field_F &&
            this.a(0, param2, param1, param0, param6)) {
            this.a((byte) 116, param3);
            this.field_A = param4;
            if (null != this.field_v &&
              this.field_v instanceof wf) {
              ((wf) (this.field_v)).a(true, param2, param1, this, param0, param6, param4);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("d.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -37 / ((param0 - 31) / 55);
          var3 = 0;
          if (param1 < 0 ||
            65536 <= param1) {
            var3 += 16;
            param1 = param1 >>> 16;
          }
          if (256 <= param1) {
            param1 = param1 >>> 8;
            var3 += 8;
          }
          if (param1 >= 16) {
            var3 += 4;
            param1 = param1 >>> 4;
          }
          if (param1 >= 4) {
            var3 += 2;
            param1 = param1 >>> 2;
          }
          if (param1 >= 1) {
            var3++;
            param1 = param1 >>> 1;
          }
          stackIn_20_0 = var3 + param1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "d.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_22_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            return true;
          }
          stackIn_22_0 = ((!(param0 < 48) &&
            !(param0 > 57)) ||
            (!(65 > param0) &&
            !(param0 > 90)) ||
            (!(param0 < 97) &&
            !(param0 > 122)));
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "d.GA(" + param0 + ',' + param1 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -79) {
            this.a((Hashtable) null, -24, (byte) 81, (StringBuilder) null);
          }
          if (this.a(param3, param2 ^ 78, param1, param0)) {
            this.a(param0, param3, true, param1);
            if (this.field_G) {
              discarded$0 = param3.append(" active");
            }
            if (!this.field_F) {
              discarded$1 = param3.append(" disabled");
            }
          }
          stackIn_14_0 = (StringBuilder) (param3);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("d.FA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 116) {
            return true;
          }
          if (this.field_F &&
            this.field_E) {
            param1.d((byte) 2);
            this.field_D = true;
            if (null != this.field_v &&
              this.field_v instanceof hg) {
              ((hg) (this.field_v)).a(9787, (iq) (this), this.field_D);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("d.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        mi var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        tp var6 = null;
        tp var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        tp var6Lifetime1;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 <= 10) {
            return;
          }
          var1 = id.field_f;
          var2 = var1.h(-11);
          if (var2 == 0) {
            if (null == jn.field_g) {
              jn.field_g = new fi(128);
              vd.field_a = 0;
            }
            stackIn_14_0 = (1 != var1.h(-11)) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.f(128);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.f(128);
            }
            var6 = or.a(56, var4_ref_String);
            var7_ref = var1.f(128);
            var8 = rc.a((CharSequence) ((Object) var4_ref_String), 320);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = or.a(56, var7_ref);
              if (var6 != null) {
                jn.field_g.a(var6, (long)var8.hashCode(), 72);
              }
            }
            if (null == var6) {
              var6 = new tp();
              jn.field_g.a(var6, (long)var8.hashCode(), 98);
              fieldTemp$1 = vd.field_a;
              vd.field_a = vd.field_a + 1;
              var6.field_Pb = fieldTemp$1;
              vj.field_d.a(var6, false);
            }
            var6.field_Mb = var4_ref_String;
            var6.field_Ib = var7_ref;
            var6.field_Hb = var5;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (1 == ba.field_d) {
                ba.field_d = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (ba.field_d == 2) {
                ba.field_d = 1;
              }
              return;
            }
            if (var2 != 4) {
              ke.a((Throwable) null, "F1: " + or.a(118), 0);
              rm.b((byte) -57);
              return;
            }
            ba.field_d = 1;
            var3 = var1.f(128);
            dg.field_d = ((String) (var3)).intern();
            var4 = var1.h(-11);
            ir.a(var4, (byte) -65);
            return;
          }
          if (se.field_A == null) {
            se.field_A = new fi(128);
            sq.field_b = 0;
          }
          var3Lifetime1 = var1.f(128);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.f(128);
          var5Lifetime1 = var1.f(128);
          var6Lifetime1 = vo.a(var4_ref_StringLifetime1, 0);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = vo.a(var5Lifetime1, 0);
            if (null != var6Lifetime1) {
              se.field_A.a(var6Lifetime1, (long)rc.a((CharSequence) ((Object) var4_ref_StringLifetime1), 320).hashCode(), -107);
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new tp();
            se.field_A.a(var6Lifetime1, (long)rc.a((CharSequence) ((Object) var4_ref_StringLifetime1), 320).hashCode(), -111);
            fieldTemp$0 = sq.field_b;
            sq.field_b = sq.field_b + 1;
            var6Lifetime1.field_Pb = fieldTemp$0;
            tm.field_a.a(var6Lifetime1, false);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Ib = var5Lifetime1;
          var6Lifetime1.field_Mb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Lb = (String) (var3Lifetime1);
          var6Lifetime1.c(2);
          var7 = (tp) (tm.field_a.a((byte) 100));
          while (var7 != null) {
            if (md.a(1308, var7, var6Lifetime1)) {
              var7 = (tp) (tm.field_a.b(50));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          if (null != var7) {
            jn.a(var6Lifetime1, var7, 18724);
            if (var9 == 0) {
              return;
            }
          }
          tm.field_a.a(var6Lifetime1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "d.IA(" + param0 + ')');
        }
    }

    d(String param0, ur param1, uf param2) {
        super(param0, param1, param2);
        this.field_D = false;
        this.field_F = true;
        this.field_E = true;
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 3) {
            this.field_F = false;
          }
          stackIn_4_0 = this.field_D;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "d.OA(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_D) {
            this.field_D = false;
            if (this.field_v != null &&
              this.field_v instanceof hg) {
              ((hg) (this.field_v)).a(9787, (iq) (this), this.field_D);
            }
          }
          if (param0 != 2) {
            this.field_F = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "d.MA(" + param0 + ')');
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_v != null &&
            this.field_v instanceof wf) {
            ((wf) (this.field_v)).a(97, param3, param2, param4, param5, this);
          }
          this.field_A = 0;
          if (param1 != 46) {
            this.a('u', -8, -87, (iq) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("d.HA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            d.b(24, 69);
          }
          if (this.f(param1 ^ 101) && (84 == param2 ||
            83 == param2)) {
            this.a(-1, 1, (byte) 113, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("d.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    d(String param0, uf param1) {
        this(param0, eb.field_c.field_p, param1);
    }

    void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a((byte) 34, param1, param2, param3);
          if (this.field_A != 0 &&
            ~q.field_v != ~this.field_A) {
            if (this.a(0, param2, param1, ed.field_n, gb.field_d) &&
              q.field_v == 0) {
              this.a(ed.field_n - param1, this.field_A, (byte) 117, gb.field_d - param2);
            }
            this.a(param3, (byte) 46, param1, param2, ed.field_n, gb.field_d);
          }
          if (param0 < 6) {
            d.a('ﾬ', -84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("d.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    protected d() {
        this.field_D = false;
        this.field_F = true;
        this.field_E = true;
        try {
          this.field_B = eb.field_c.field_q;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "d.<init>()");
        }
    }

    static {
    }
}
