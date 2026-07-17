/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kga extends rqa {
    static int field_o;

    final static phb[] a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        phb[] var7 = new phb[9];
        phb[] var4 = var7;
        var7[0] = mra.a(param0, (byte) -118, param2);
        for (var5 = 1; 9 > var5; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = mra.a(param1, (byte) -123, 64);
        return var4;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(84, 116));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kga.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0) {
        fja.field_p = new rq();
        s.field_o.b((shb) (Object) fja.field_p, 99);
    }

    final static int a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 49 / ((param0 - 53) / 41);
            stackOut_0_0 = tea.a(nua.field_p, param1, 13879);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("kga.D(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    kga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              us.field_f = param1[48];
              qaa.field_b = param1[115];
              ww.field_o = param1[75];
              bhb.field_i = param1[204];
              adb.field_a = param1[98];
              jt.field_p = param1[93];
              iea.field_d = param1[207];
              nca.field_o = param1[109];
              hrb.field_a = param1[145];
              db.field_q = param1[191];
              kg.field_o = param1[82];
              osb.field_b = param1[158];
              nn.field_a = param1[192];
              sja.field_i = param1[51];
              wj.field_p = param1[230];
              ftb.field_o = param1[104];
              foa.field_p = param1[23];
              cca.field_p = param1[99];
              fna.field_p = param1[210];
              gu.field_p = param1[92];
              jsb.field_d = param1[185];
              oq.field_v = param1[71];
              oq.field_y = param1[225];
              gs.field_c = param1[55];
              ena.field_q = param1[58];
              lob.field_b = param1[96];
              oq.field_C = param1[196];
              uda.field_b = param1[119];
              oq.field_t = param1[202];
              dcb.field_d = param1[17];
              ds.field_d = param1[203];
              dcb.field_f = param1[4];
              hw.field_b = param1[9];
              ioa.field_p = param1[73];
              qmb.field_p = param1[6];
              mp.field_o = param1[121];
              rlb.field_e = param1[142];
              jga.field_a = param1[100];
              dr.field_a = param1[125];
              wj.field_o = param1[64];
              qjb.field_d = param1[18];
              ktb.field_q = param1[37];
              bpa.field_a = param1[222];
              tua.field_a = param1[180];
              pca.field_m = param1[30];
              m.field_p = param1[167];
              fja.field_o = param1[116];
              qea.field_o = param1[134];
              oq.field_G = param1[70];
              pea.field_a = param1[149];
              ku.field_c = param1[63];
              oq.field_e = param1[224];
              oq.field_q = param1[214];
              awa.field_q = param1[166];
              bn.field_a = param1[124];
              era.field_p = param1[31];
              la.field_m = param1[83];
              de.field_q = param1[94];
              rjb.field_u = param1[211];
              oq.field_n = param1[220];
              oq.field_I = param1[32];
              klb.field_p = param1[85];
              gib.field_a = param1[206];
              ea.field_j = param1[187];
              qv.field_o = param1[7];
              gtb.field_c = param1[138];
              slb.field_a = param1[177];
              wra.field_p = param1[226];
              bka.field_p = param1[24];
              oq.field_k = param1[215];
              gka.field_q = param1[227];
              fmb.field_r = param1[157];
              eta.field_b = param1[194];
              ina.field_p = param1[176];
              ava.field_a = param1[129];
              kmb.field_f = param1[49];
              fob.field_c = param1[193];
              oq.field_p = param1[219];
              asa.field_e = param1[128];
              ooa.field_xb = param1[151];
              apb.field_a = param1[65];
              ed.field_o = param1[38];
              cqa.field_p = param1[186];
              kva.field_g = param1[56];
              jtb.field_m = param1[147];
              tea.field_b = param1[74];
              opb.field_o = param1[69];
              gaa.field_p = param1[155];
              wob.field_o = param1[91];
              mra.field_o = param1[34];
              oga.field_o = param1[12];
              fra.field_a = param1[26];
              bma.field_n = param1[118];
              ls.field_r = param1[198];
              wkb.field_a = param1[62];
              ana.field_f = param1[105];
              wk.field_a = param1[42];
              ldb.field_q = param1[126];
              cp.field_f = param1[80];
              dca.field_o = param1[87];
              aea.field_a = param1[72];
              if (param0 == 107) {
                break L1;
              } else {
                field_o = -43;
                break L1;
              }
            }
            eca.field_e = param1[103];
            bv.field_e = param1[163];
            oq.field_a = param1[221];
            cia.field_a = param1[136];
            ela.field_q = param1[229];
            gkb.field_o = param1[50];
            eg.field_o = param1[168];
            gl.field_d = param1[8];
            uua.field_o = param1[200];
            rma.field_b = param1[20];
            vha.field_p = param1[184];
            sja.field_b = param1[44];
            mq.field_j = param1[95];
            mmb.field_i = param1[131];
            cha.field_p = param1[135];
            ujb.field_h = param1[108];
            ie.field_p = param1[10];
            kcb.field_o = param1[0];
            khb.field_c = param1[140];
            laa.field_o = param1[190];
            gbb.field_o = param1[179];
            jo.field_e = param1[43];
            eha.field_q = param1[212];
            uaa.field_o = param1[188];
            mc.field_u = param1[153];
            lrb.field_e = param1[28];
            pea.field_b = param1[154];
            ee.field_p = param1[29];
            nra.field_b = param1[201];
            ljb.field_o = param1[141];
            qrb.field_a = param1[33];
            la.field_k = param1[208];
            enb.field_c = param1[171];
            wf.field_e = param1[181];
            oq.field_h = param1[232];
            np.field_o = param1[169];
            aq.field_o = param1[195];
            ge.field_c = param1[178];
            oq.field_x = param1[90];
            oq.field_g = param1[218];
            dfa.field_a = param1[123];
            bnb.field_o = param1[25];
            vqa.field_k = param1[2];
            gba.field_r = param1[15];
            wqa.field_b = param1[22];
            de.field_p = param1[59];
            di.field_p = param1[27];
            nw.field_o = param1[216];
            as.field_d = param1[13];
            tta.field_p = param1[111];
            df.field_p = param1[120];
            qqb.field_b = param1[68];
            gda.field_d = param1[40];
            ehb.field_e = param1[152];
            vc.field_p = param1[36];
            voa.field_b = param1[144];
            sib.field_i = param1[130];
            wha.field_a = param1[61];
            qra.field_o = param1[160];
            fua.field_q = param1[132];
            dla.field_c = param1[139];
            nnb.field_e = param1[122];
            cab.field_p = param1[47];
            nu.field_p = param1[52];
            vgb.field_o = param1[213];
            fd.field_p = param1[81];
            pwa.field_b = param1[170];
            fna.field_o = param1[174];
            pt.field_o = param1[97];
            voa.field_d = param1[11];
            nob.field_p = param1[79];
            vdb.field_d = param1[45];
            uh.field_q = param1[150];
            op.field_p = param1[183];
            ltb.field_p = param1[66];
            bba.field_a = param1[112];
            brb.field_o = param1[113];
            qca.field_wb = param1[117];
            fj.field_b = param1[86];
            oq.field_m = param1[205];
            qh.field_J = param1[88];
            ls.field_p = param1[143];
            ffa.field_b = param1[161];
            sl.field_a = param1[57];
            wkb.field_b = param1[133];
            clb.field_a = param1[172];
            mtb.field_o = param1[148];
            ou.field_r = param1[182];
            cva.field_o = param1[14];
            oq.field_z = param1[233];
            joa.field_a = param1[199];
            nu.field_q = param1[175];
            aea.field_b = param1[60];
            itb.field_o = param1[77];
            oq.field_o = param1[223];
            lr.field_p = param1[101];
            gra.field_o = param1[21];
            ue.field_a = param1[41];
            wr.field_o = param1[53];
            pmb.field_p = param1[16];
            ibb.field_a = param1[173];
            km.field_o = param1[156];
            mqa.field_s = param1[106];
            wda.field_s = param1[78];
            bjb.field_o = param1[231];
            upb.field_a = param1[189];
            jj.field_o = param1[107];
            wda.field_p = param1[217];
            mmb.field_g = param1[164];
            uab.field_b = param1[84];
            oq.field_j = param1[234];
            cg.field_r = param1[67];
            coa.field_f = param1[146];
            veb.field_b = param1[1];
            nsa.field_o = param1[5];
            sbb.field_p = param1[159];
            qab.field_d = param1[137];
            oq.field_w = param1[209];
            vt.field_o = param1[110];
            uja.field_b = param1[228];
            qea.field_q = param1[114];
            wja.field_b = param1[102];
            js.field_s = param1[35];
            r.field_k = param1[89];
            rta.field_p = param1[127];
            lja.field_d = param1[39];
            seb.field_o = param1[54];
            bia.field_c = param1[197];
            rla.field_x = param1[19];
            oq.field_A = param1[46];
            rn.field_o = param1[162];
            qca.field_yb = param1[76];
            spa.field_a = param1[165];
            bra.field_d = param1[3];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("kga.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 360;
    }
}
