/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me extends fc {
    int field_j;
    static String field_k;
    static String[] field_p;
    int field_o;
    static int field_q;
    int field_r;
    private int field_n;
    int field_s;
    static byte[][][] field_i;
    int field_m;
    int field_l;

    final static ng[] d(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ng[] var1 = new ng[gi.field_o];
        int var2 = 0;
        int var3 = 112 / ((-44 - param0) / 39);
        while (var2 < gi.field_o) {
          var1[var2] = new ng(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], qk.field_M[var2], qe.field_z);
          var2++;
        }
        ff.b(112);
        return var1;
    }

    public static void a(byte param0) {
        field_i = (byte[][][]) null;
        field_k = null;
        int var1 = 56 % ((-65 - param0) / 40);
        field_p = null;
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (r.field_i != null && (param1 < 0 ||
            jc.field_a == ka.field_b)) {
            if (param0 != -1) {
              return;
            }
            if (ra.field_C.field_k == 0 &&
              qg.a(false) > qh.field_f + 10000L) {
              ra.field_C.c(param1, param0 + 8);
            }
            if (0 < ra.field_C.field_k) {
              try {
                r.field_i.a(param0 - 124, ra.field_C.field_j, ra.field_C.field_k, 0);
                qh.field_f = qg.a(false);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                lj.a((byte) 118);
              }
              ra.field_C.field_k = 0;
            }
            return;
          }
          ra.field_C.field_k = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        this.field_l = param0;
        this.field_r = this.field_r + this.field_o;
        this.field_s = this.field_s + this.field_j;
    }

    final static void a(dh param0, int param1, int param2) {
        la var5 = null;
        int var4 = 0;
        try {
          if (param1 != 0) {
            field_p = (String[]) null;
          }
          var5 = ra.field_C;
          var5.c(param2, 7);
          var5.field_k = var5.field_k + 1;
          var4 = var5.field_k;
          var5.a(1, (byte) -59);
          var5.a(param0.field_k, (byte) -61);
          var5.b(param1 ^ 16, param0.field_q);
          var5.b(false, param0.field_n);
          var5.b(false, param0.field_o);
          var5.b(false, param0.field_j);
          var5.b(false, param0.field_m);
          var5.a(var4, false);
          var5.a(true, -var4 + var5.field_k);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "me.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean e(int param0) {
        int var2 = -3 % ((0 - param0) / 34);
        this.field_l = this.field_l + this.field_n;
        return this.field_l < 26 ? true : false;
    }

    final static int a(String param0, boolean param1, int param2, kh param3, int param4, int param5, kh param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        be stackIn_17_0 = null;
        String stackIn_18_1 = null;
        be stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          var14 = param3.b(-108);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param6.b(-117);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == r.field_i &&
            !bf.a(false, (byte) 106)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (jc.field_a == gk.field_a) {
            qi.field_c = null;
            ra.field_C.field_k = 0;
            if (param0 == null) {
              ui.field_p.field_k = 0;
              ui.field_p.b(false, ta.field_c.nextInt());
              ui.field_p.b(false, ta.field_c.nextInt());
              stackIn_17_0 = ui.field_p;
              if (param3.a(-107)) {
                stackIn_18_1 = var14;
              } else {
                stackIn_18_1 = "";
              }
              ((be) (Object) stackIn_17_0).b(stackIn_18_1, 115);
              stackIn_20_0 = ui.field_p;
              if (!param6.a(-46)) {
                stackIn_21_1 = "";
              } else {
                stackIn_21_1 = var8;
              }
              ((be) (Object) stackIn_20_0).b(stackIn_21_1, 112);
              ra.field_C.a(16, (byte) -87);
              ra.field_C.field_k = ra.field_C.field_k + 1;
              var9 = ra.field_C.field_k;
              ee.a(sc.field_d, ra.field_C, fj.field_N, 0, ui.field_p);
              ra.field_C.a(true, -var9 + ra.field_C.field_k);
            } else {
              var9 = 0;
              ui.field_p.field_k = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              ui.field_p.b(false, ta.field_c.nextInt());
              ui.field_p.b(false, ta.field_c.nextInt());
              ui.field_p.b(var14, 106);
              ui.field_p.b(var8, 124);
              var15 = (CharSequence) ((Object) param0);
              ui.field_p.b(qk.a(-128, var15), 119);
              ui.field_p.b(param4, (byte) -119);
              ui.field_p.a(param2, (byte) -98);
              ui.field_p.a(var9, (byte) -66);
              ra.field_C.a(18, (byte) -92);
              ra.field_C.field_k = ra.field_C.field_k + 2;
              var10 = ra.field_C.field_k;
              var11_ref_StringLifetime4 = bg.a(gd.b((byte) 77), -22004);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              ra.field_C.a((byte) -57, var11_ref_StringLifetime4);
              ee.a(sc.field_d, ra.field_C, fj.field_N, 0, ui.field_p);
              ra.field_C.c(-var10 + ra.field_C.field_k, (byte) -96);
            }
            me.a(-1, -1);
            jc.field_a = l.field_m;
          }
          if (jc.field_a == l.field_m &&
            hf.a(1, false)) {
            var9Lifetime1 = ne.field_a.h(16383);
            ne.field_a.field_k = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              ca.field_a = new String[var9Lifetime1 - 100];
              jc.field_a = kl.field_a;
            } else {
              if (var9Lifetime1 == 248) {
                ob.a(209, gd.b((byte) 77));
                fi.field_t = gh.field_c;
                lj.a((byte) 125);
                kg.field_f = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 == 99) {
                hf.a(va.a(93), false);
                qi.field_c = new Boolean(bg.a(ne.field_a, -2));
                ne.field_a.field_k = 0;
              } else {
                uk.field_c = var9Lifetime1;
                jc.field_a = sf.field_D;
                hd.field_o = -1;
              }
            }
          }
          if (kl.field_a == jc.field_a) {
            var9Lifetime2 = 2;
            if (hf.a(var9Lifetime2, false)) {
              var10Lifetime1 = ne.field_a.d((byte) -94);
              ne.field_a.field_k = 0;
              if (hf.a(var10Lifetime1, false)) {
                var11 = ca.field_a.length;
                for (var12 = 0; var11 > var12; var12++) {
                  ca.field_a[var12] = ne.field_a.j(-1);
                }
                lj.a((byte) 121);
                kg.field_f = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          var9Lifetime3 = 77 / ((param5 - 31) / 47);
          if (jc.field_a == sf.field_D &&
            fh.a(520)) {
            if (255 == uk.field_c) {
              var10_ref_String = ne.field_a.d(19016);
              if (var10_ref_String != null) {
                dh.a(-19136, var10_ref_String, gd.b((byte) 77));
              }
            } else {
              fi.field_t = ne.field_a.g(0);
            }
            lj.a((byte) 115);
            kg.field_f = false;
            stackIn_55_0 = uk.field_c;
            return stackIn_55_0;
          }
          if (null == r.field_i) {
            if (kg.field_f) {
              if (bj.b(-21676) <= 30000L) {
                fi.field_t = cf.field_m;
              } else {
                fi.field_t = nk.field_j;
              }
              kg.field_f = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var10Lifetime2 = ke.field_c;
            ke.field_c = ma.field_c;
            ma.field_c = var10Lifetime2;
            kg.field_f = true;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("me.E(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        fh var4 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 22692) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (param2 == null) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof fh)) {
              throw new IllegalArgumentException();
            }
            var4 = (fh) (param2);
            stackIn_15_0 = var4.b((byte) -2);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param2);
          if (!param0) {
            stackIn_12_0 = var3;
            return stackIn_12_0;
          }
          stackIn_10_0 = qd.a(var3, (byte) 102);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("me.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    me(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_o = param4;
        this.field_r = param2;
        this.field_n = param5;
        this.field_m = param0;
        this.field_s = param1;
        this.field_j = param3;
    }

    static {
        field_p = new String[]{"<col=6>Track.</col><br>Push these blocks of track to assemble the model railway exhibits.", "<col=6>Immovable obstacle.</col><br>The walls of the exhibition hall. Obviously these can't be moved.", "<col=6>Smooth floor.</col><br>Track pushed onto this will continue to slide.", "<col=6>Conveyor belt.</col><br>This will push track in the direction indicated. You can push track across the belt and walk onto it, but not against it."};
        field_k = "Close";
    }
}
