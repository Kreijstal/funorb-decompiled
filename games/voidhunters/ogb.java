/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ogb extends rqa {
    static int field_o;

    final static void a(int param0, int param1) {
        si.field_s = param1 * 400 / 150;
        si.field_p = param1 * 100 / 150;
        int var2 = 98 / ((1 - param0) / 62);
        si.field_r = (param1 << 16) / 150;
    }

    final static void a(boolean param0, int param1, int param2, int param3, dja param4, int param5, dja param6, int param7, int param8, int param9, int param10, int param11, dja param12, int param13, byte param14) {
        try {
          qha.field_o = param11;
          ehb.field_g = param8;
          if (param14 != 91) {
            field_o = 34;
          }
          vi.field_o = param10;
          pr.field_d = param13;
          kha.field_v = param9;
          pra.field_o = param1;
          wc.field_a = param6;
          uqa.field_q = param4;
          pka.field_o = param3;
          nia.field_o = param0 ? true : false;
          gva.field_a = param12;
          fk.field_e = param5;
          iva.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ogb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    ogb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        br var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ik var5_ref_ik = null;
        int[] var6 = null;
        int var8 = 0;
        faa var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = VoidHunters.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = qga.field_b;
          var2 = var9.e((byte) -117);
          var3 = var9.e((byte) -94);
          if (0 == var2) {
            var4 = (br) (ca.field_p.d(param0 ^ -8999));
            if (var4 == null) {
              ifb.l(-128);
              return;
            }
            var5 = -var9.field_e + vja.field_a;
            var11 = var4.field_d;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.e((byte) -92) << (dla.a(3, var7) << 8));
            }
            var4.b(-3846);
          } else {
            if (var2 == 1) {
              var4_int = var9.d(0);
              var5_ref_ik = (ik) (mhb.field_o.d(0));
              while (var5_ref_ik != null) {
                if (var5_ref_ik.field_f != var3 ||
                  var4_int != var5_ref_ik.field_g) {
                  var5_ref_ik = (ik) (mhb.field_o.a((byte) 11));
                  continue;
                }
                break;
              }
              if (var5_ref_ik == null) {
                ifb.l(-121);
                return;
              }
              var5_ref_ik.b(param0 ^ 11299);
              decompiledFrameRemainder0 = false;
            }
            else {
              gna.a((Throwable) null, "LR1: " + hm.e(-13514), 0);
              ifb.l(-116);
            }
          }
          if (param0 == -8999) {
            return;
          }
          field_o = 127;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ogb.D(" + param0 + ')');
        }
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
          tr.a(param0[3].a(55), false, param0[2].a(84), param0[1].a(115), param0[0].a(88));
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ogb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = 0;
    }
}
