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
        if (param0 > 33) {
          field_d = null;
          field_b = null;
          return;
        }
        fi.a((byte) -20);
        field_d = null;
        field_b = null;
    }

    final static void a(hd param0, hd param1, int param2, hd param3, hd param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = Kickabout.field_G;
        try {
          if (null != jl.field_f) {
            return;
          }
          vg.field_Wb = false;
          if (iw.field_l) {
            var5 = ie.field_H;
          } else {
            if (!kb.field_C) {
              var5 = bf.field_n;
            } else {
              var5 = hp.field_c;
            }
          }
          var7 = (String) null;
          nv.a(0, ag.field_e, var5, (String) null, (byte) 34);
          ei.field_b.field_ab = ag.field_e + (-((ag.field_e & 16711422) >> 1) + ((vv.field_o.field_ab & 16711422) >> 1));
          ei.field_b.field_H = ag.field_e + (-((ag.field_e & 16711422) >> 1) + (8355711 & vv.field_o.field_H >> 1));
          ei.field_b.field_ub = -((16711423 & ag.field_e) >> 1) + ag.field_e + (vv.field_o.field_ub >> 1 & 8355711);
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
          if (param2 != 14594) {
            field_e = (ff) null;
          }
          gl.field_c = new hd(0L, vv.field_o, rr.field_h);
          b.field_N = new hd(0L, vv.field_o);
          mu.field_Y.a((byte) -111, h.field_e);
          mu.field_Y.a((byte) -121, dj.field_D);
          dj.field_D.a((byte) -119, Kickabout.field_H);
          dj.field_D.a((byte) -104, gl.field_c);
          dj.field_D.a((byte) -111, b.field_N);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("fi.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
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
