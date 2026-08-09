/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends Exception {
    static ff field_e;
    static String field_b;
    static String field_d;
    int field_f;
    static String[] field_g;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 <= 33) {
          fi.a((byte) -20);
          field_d = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static void a(hd param0, hd param1, int param2, hd param3, hd param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            if (null == jl.field_f) {
              L1: {
                vg.field_Wb = false;
                if (iw.field_l) {
                  var5 = ie.field_H;
                  break L1;
                } else {
                  if (!kb.field_C) {
                    var5 = bf.field_n;
                    break L1;
                  } else {
                    var5 = hp.field_c;
                    break L1;
                  }
                }
              }
              L2: {
                var7 = (String) null;
                nv.a(0, ag.field_e, var5, (String) null, (byte) 34);
                ei.field_b.field_ab = ag.field_e + (-((ag.field_e & 16711422) >> -1739319487) + ((vv.field_o.field_ab & 16711422) >> -1220406943));
                ei.field_b.field_H = ag.field_e + (-((ag.field_e & 16711422) >> 2029510369) - -(8355711 & vv.field_o.field_H >> -1965734239));
                ei.field_b.field_ub = -((16711423 & ag.field_e) >> 82208641) + ag.field_e - -(vv.field_o.field_ub >> -1540265023 & 8355711);
                qt.field_n = ij.field_s;
                jl.field_f = ei.field_b;
                mu.field_Y = new hd(0L, param0);
                h.field_e = new hd(0L, param1);
                dj.field_D = new hd(0L, (hd) null);
                Kickabout.field_H = new hd(0L, param4);
                ei.field_b = new hd(0L, param3);
                ei.field_b.field_X = nl.field_i;
                Kickabout.field_H.a((byte) -112, ei.field_b);
                ij.field_s = new hd(0L, qt.field_n);
                Kickabout.field_H.a((byte) -126, ij.field_s);
                if (param2 == 14594) {
                  break L2;
                } else {
                  field_e = (ff) null;
                  break L2;
                }
              }
              gl.field_c = new hd(0L, vv.field_o, rr.field_h);
              b.field_N = new hd(0L, vv.field_o);
              mu.field_Y.a((byte) -111, h.field_e);
              mu.field_Y.a((byte) -121, dj.field_D);
              dj.field_D.a((byte) -119, Kickabout.field_H);
              dj.field_D.a((byte) -104, gl.field_c);
              dj.field_D.a((byte) -111, b.field_N);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("fi.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    fi(int param0) {
        this.field_f = param0;
    }

    static {
        field_e = new ff(7, 0, 1, 1);
        field_b = "You have been outbid on this auction. Your bid of <%0> was returned to you.";
        field_g = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_d = "Experience";
        field_a = "Hide lobby chat";
        field_c = "Report abuse";
    }
}
