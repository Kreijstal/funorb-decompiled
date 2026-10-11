/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    static st field_a;

    final static void a(s param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            aa.field_c[var2_int] = 0;
          }
          if (param1 > -85) {
            field_a = (st) null;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < dd.field_a; var2_intLifetime1++) {
            if (param0.field_f == ve.field_b[var2_intLifetime1].field_f) {
              dupTemp$3 = ve.field_b[var2_intLifetime1].a(0);
              aa.field_c[dupTemp$3] = aa.field_c[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(0);
          aa.field_c[dupTemp$0] = aa.field_c[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; dd.field_a > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (ve.field_b[var3].field_f == param0.field_f) {
              var4 = ve.field_b[var3].a(0);
              if (gq.field_a < aa.field_c[var4]) {
                aa.field_c[var4] = aa.field_c[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              ve.field_b[incrementValue$2] = ve.field_b[var3];
            }
          }
          dd.field_a = var2_intLifetime2;
          fieldTemp$1 = dd.field_a;
          dd.field_a = dd.field_a + 1;
          ve.field_b[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("tr.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -67) {
          tr.a(118);
        }
        field_a = null;
    }

    final static void a(gk param0, byte param1) {
        ll var2 = new ll(param0.a("final_frame.jpg", (byte) -71, ""), (java.awt.Component) ((Object) ci.field_f));
        int var3 = var2.field_r;
        int var4 = var2.field_n;
        qk.a((byte) -92);
        gl.field_d = new ll(var3, 3 * var4 / 4);
        gl.field_d.b();
        var2.c(0, 0);
        gt.field_o = new ll(var3, var4 - gl.field_d.field_n);
        gt.field_o.b();
        var2.c(0, -gl.field_d.field_n);
        gt.field_o.field_p = gl.field_d.field_n;
        if (param1 > -64) {
          return;
        }
        try {
          sl.c(2765);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tr.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(rb param0, int param1, int param2, int param3, int param4) {
        try {
          param0.b(-1336879960, 12);
          param0.a(17, 23385);
          param0.a(param3, 23385);
          param0.a(param2, 23385);
          param0.b(-1336879960, param1);
          if (param4 != 0) {
            rb var6 = (rb) null;
            tr.a((rb) null, 50, -109, 117, 45);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tr.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = new st();
    }
}
