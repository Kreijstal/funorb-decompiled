/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends rqa {
    static int field_p;
    static String field_q;
    static String field_o;

    tl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -22699) {
          tl.e((byte) -97);
          alb.field_b = param2;
          pba.field_r = param0;
          return;
        }
        alb.field_b = param2;
        pba.field_r = param0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            tl.b(125, -116, 41);
          }
          si.a(231, 62, param0[0].a(21));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tl.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -15) {
          tl.b(-46, 57, -52);
          field_q = null;
          return;
        }
        field_q = null;
    }

    final static boolean b(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
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
        String var35;
        String var36;
        String var37;
        String var38;
        String var39;
        String var40;
        String var41;
        String var42;
        String var43;
        String var44;
        String var45;
        Object var46;
        CharSequence var47;
        int var5Lifetime1;
        var46 = null;
        var11 = VoidHunters.field_G;
        var3 = 1;
        if (!lf.field_o &&
          qw.field_l == null) {
          var3 = 0;
        }
        if (0 == ow.field_b &&
          ohb.field_o != null) {
          var3 = 0;
        }
        if (2 == ow.field_b &&
          !ws.a(param2 + 85)) {
          var3 = 0;
        }
        if (param2 == ~pma.field_o) {
          if (var3 == 0) {
            if (ow.field_b == 0) {
              return true;
            }
            dr.a(26718);
            return true;
          }
          if (awa.field_p.length() <= 0) {
            dr.a(26718);
            return true;
          }
          var4_ref_String = awa.field_p.toString();
          if (!hnb.a((byte) -92, var4_ref_String)) {
            var5 = ow.field_b;
            if (var5 == 0 &&
              lqa.field_o != null) {
              var5 = 1;
            }
            if (2 == jia.a(var5, (byte) 19)) {
              mea.a(1, (byte) -76, param1, var5);
            }
            va.a(var4_ref_String, param2 - 25634, -1, param0, ow.field_b, waa.field_x);
          } else {
            var13 = (String) null;
            var12 = (String) null;
            lh.a((byte) -70, 0, (String) null, (String) null, wl.field_p, 2);
            var15 = (String) null;
            var14 = (String) null;
            lh.a((byte) -62, 0, (String) null, (String) null, lv.field_o, 2);
          }
          dr.a(26718);
          return true;
        }
        if (pma.field_o == 85) {
          if (var3 != 0 &&
            awa.field_p.length() > 0) {
            npa.a(-1 + awa.field_p.length(), false, awa.field_p, ' ');
          }
          return true;
        }
        var4 = jl.field_r;
        if (!oga.a((char) var4, (byte) 32)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (awa.field_p.length() >= 80) {
          return true;
        }
        discarded$0 = awa.field_p.append((char) var4);
        var5Lifetime1 = 485;
        var17 = kca.field_a;
        var16 = gfb.a(1, var17);
        var19 = var16;
        if (ow.field_b != 2) {
          var7 = "";
          if (0 != ow.field_b) {
            var35 = var7 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - ej.field_c.b(var35);
            if (var5Lifetime1 >= ej.field_c.b(awa.field_p.toString())) {
              return true;
            }
            npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
            return true;
          }
          if (lqa.field_o == null) {
            if (!cqb.field_e) {
              if (lqa.field_o != null) {
                if (!nv.field_n) {
                  var38 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
                  var39 = var38 + var19 + ": ";
                  var5Lifetime1 = var5Lifetime1 - ej.field_c.b(var39);
                  if (var5Lifetime1 < ej.field_c.b(awa.field_p.toString())) {
                    npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
                  }
                  return true;
                }
                if (null == vla.field_E) {
                  var36 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
                  var37 = var36 + var19 + ": ";
                  var5Lifetime1 = var5Lifetime1 - ej.field_c.b(var37);
                  if (var5Lifetime1 < ej.field_c.b(awa.field_p.toString())) {
                    npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
                  }
                  return true;
                }
                var7 = "[" + vla.field_E + "] ";
              }
              var40 = var7 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - ej.field_c.b(var40);
              if (var5Lifetime1 >= ej.field_c.b(awa.field_p.toString())) {
                return true;
              }
              npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
              return true;
            }
            var7 = "[" + bib.field_e + "] ";
          }
          if (lqa.field_o != null) {
            if (!nv.field_n) {
              var43 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
              var44 = var43 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - ej.field_c.b(var44);
              if (var5Lifetime1 >= ej.field_c.b(awa.field_p.toString())) {
                return true;
              }
              npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
              return true;
            }
            if (null == vla.field_E) {
              var41 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
              var42 = var41 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - ej.field_c.b(var42);
              if (var5Lifetime1 >= ej.field_c.b(awa.field_p.toString())) {
                return true;
              }
              npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
              return true;
            }
            var7 = "[" + vla.field_E + "] ";
          }
          var45 = var7 + var19 + ": ";
          var5Lifetime1 = var5Lifetime1 - ej.field_c.b(var45);
        } else {
          var47 = (CharSequence) ((Object) waa.field_x);
          var18 = isa.a(tia.field_G, new String[]{joa.a(var47, false)}, 108);
          var8 = isa.a(ejb.field_o, new String[]{var16}, param2 ^ -30);
          var9 = ej.field_c.b(var18);
          var10 = ej.field_c.b(var8);
          if (var10 >= var9) {
            var5Lifetime1 = var5Lifetime1 - var10;
          } else {
            var5Lifetime1 = var5Lifetime1 - var9;
          }
        }
        if (var5Lifetime1 >= ej.field_c.b(awa.field_p.toString())) {
          return true;
        }
        npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
        return true;
    }

    static {
        field_o = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "Small defence chassis";
    }
}
