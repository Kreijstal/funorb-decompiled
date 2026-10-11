/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cnb extends rqa {
    static ij field_q;
    static int field_p;
    static int field_o;

    final static void f(byte param0) {
        if (param0 != -74) {
          field_q = (ij) null;
        }
        kma.a(mqb.field_x, true, -17833, bfa.field_p);
        kmb.field_c = true;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(219, 119));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cnb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    cnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, dj param1, dj param2, int param3, int param4, String param5, boolean param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        ds stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_18_2 = null;
        ds stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_21_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
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
        String var9_ref_String = null;
        int var10 = 0;
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
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = VoidHunters.field_G;
        try {
          var14 = param1.b((byte) 41);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param2.b((byte) 69);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == ov.field_o &&
            !ne.a(false, (byte) -11)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (tc.field_c == wd.field_p) {
            ehb.field_f = null;
            dpa.field_p.field_e = 0;
            if (param5 == null) {
              ss.field_p.field_e = 0;
              ss.field_p.d(jeb.field_b.nextInt(), 332614536);
              ss.field_p.d(jeb.field_b.nextInt(), param4 + 332614536);
              stackIn_17_0 = ss.field_p;
              stackIn_17_1 = 0;
              if (!param1.a(true)) {
                stackIn_18_2 = "";
              } else {
                stackIn_18_2 = var14;
              }
              ((ds) (Object) stackIn_17_0).b((byte) stackIn_17_1, stackIn_18_2);
              stackIn_20_0 = ss.field_p;
              stackIn_20_1 = 0;
              if (!param2.a(true)) {
                stackIn_21_2 = "";
              } else {
                stackIn_21_2 = var8;
              }
              ((ds) (Object) stackIn_20_0).b((byte) stackIn_20_1, stackIn_21_2);
              dpa.field_p.c(0, 16);
              dpa.field_p.field_e = dpa.field_p.field_e + 1;
              var9 = dpa.field_p.field_e;
              ufa.a(dpa.field_p, (byte) -105, jnb.field_p, bib.field_g, ss.field_p);
              dpa.field_p.e(-var9 + dpa.field_p.field_e, -129);
            } else {
              var9 = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              ss.field_p.field_e = 0;
              ss.field_p.d(jeb.field_b.nextInt(), 332614536);
              ss.field_p.d(jeb.field_b.nextInt(), param4 ^ 332614536);
              ss.field_p.b((byte) 0, var14);
              ss.field_p.b((byte) 0, var8);
              var15 = (CharSequence) ((Object) param5);
              ss.field_p.b((byte) 0, esb.a(param4 + 22, var15));
              ss.field_p.a(param3, true);
              ss.field_p.c(param4 + 0, param0);
              ss.field_p.c(0, var9);
              dpa.field_p.c(param4 + 0, 18);
              dpa.field_p.field_e = dpa.field_p.field_e + 2;
              var10 = dpa.field_p.field_e;
              var11_ref_StringLifetime4 = kh.a(-6465, vpa.b((byte) -114));
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              dpa.field_p.a(true, var11_ref_StringLifetime4);
              ufa.a(dpa.field_p, (byte) -108, jnb.field_p, bib.field_g, ss.field_p);
              dpa.field_p.a(dpa.field_p.field_e - var10, -124);
            }
            lnb.b(-1, 113);
            tc.field_c = bs.field_d;
          }
          if (tc.field_c == bs.field_d &&
            boa.a(1, 30000)) {
            var9Lifetime1 = qga.field_b.e((byte) -124);
            qga.field_b.field_e = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              tc.field_c = ct.field_a;
              gob.field_a = new String[var9Lifetime1 - 100];
            } else {
              if (var9Lifetime1 == 248) {
                kl.a(vpa.b((byte) -124), param4 ^ 0);
                dgb.field_b = owa.field_j;
                ifb.l(param4 - 125);
                hha.field_o = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (99 != var9Lifetime1) {
                tc.field_c = qva.field_k;
                vja.field_a = -1;
                ow.field_a = var9Lifetime1;
              } else {
                boa.a(wmb.a(param4 + 24655), 30000);
                ehb.field_f = new Boolean(cb.a(param4 - 2, qga.field_b));
                qga.field_b.field_e = 0;
              }
            }
          }
          if (tc.field_c == ct.field_a) {
            var9Lifetime2 = 2;
            if (boa.a(var9Lifetime2, param4 ^ 30000)) {
              var10Lifetime1 = qga.field_b.e(1869);
              qga.field_b.field_e = 0;
              if (boa.a(var10Lifetime1, param4 + 30000)) {
                var11 = gob.field_a.length;
                for (var12 = 0; var12 < var11; var12++) {
                  gob.field_a[var12] = qga.field_b.g(-1609246200);
                }
                ifb.l(-122);
                hha.field_o = false;
                stackIn_43_0 = var11 + 100;
                return stackIn_43_0;
              }
            }
          }
          if (param4 != 0) {
            cnb.f((byte) 86);
          }
          if (tc.field_c == qva.field_k &&
            ci.b((byte) 46)) {
            if (ow.field_a == 255) {
              var9_ref_String = qga.field_b.m(0);
              if (var9_ref_String != null) {
                pcb.a(vpa.b((byte) -123), var9_ref_String, -1);
              }
            } else {
              dgb.field_b = qga.field_b.a(-1);
            }
            ifb.l(-122);
            hha.field_o = false;
            stackIn_55_0 = ow.field_a;
            return stackIn_55_0;
          }
          if (ov.field_o == null) {
            if (hha.field_o) {
              if (30000L < mw.e(0)) {
                dgb.field_b = fd.field_o;
              } else {
                dgb.field_b = uv.field_f;
              }
              hha.field_o = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = pcb.field_p;
            pcb.field_p = bia.field_d;
            bia.field_d = var9Lifetime3;
            hha.field_o = true;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("cnb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void e(byte param0) {
        int var1 = -18 % ((-34 - param0) / 59);
        field_q = null;
    }

    static {
        field_q = new ij();
        field_p = 100;
        field_o = 1;
    }
}
