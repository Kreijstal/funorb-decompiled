/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mma {
    final static int a(boolean param0, String param1, int param2, boolean param3, String param4, int param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_31_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_55_0 = false;
          int stackIn_83_0 = 0;
          int stackIn_89_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_105_0 = 0;
          RuntimeException stackIn_108_0 = null;
          StringBuilder stackIn_108_1 = null;
          String stackIn_109_2 = null;
          StringBuilder stackIn_111_1 = null;
          String stackIn_112_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = BachelorFridge.field_y;
          try {
            if (dma.field_b == null &&
              !ge.a(-29510, param3)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (eia.field_a == rga.field_c) {
              if (!param3) {
                uaa.field_f = li.a(26130, false, param4, param1);
              } else {
                var10 = (String) null;
                uaa.field_f = ov.a(gha.field_a, false, (String) null, param1, (byte) 94);
              }
              sja.field_fb.field_g = 0;
              sja.field_fb.d(14, 0);
              sja.field_fb.d(uaa.field_f.a((byte) -106).field_b, 0);
              hna.a(-1, 71);
              eia.field_a = kb.field_e;
            }
            if (kb.field_e == eia.field_a &&
              ii.b(1, 0)) {
              var6_int = ig.field_m.b(16711935);
              if (var6_int != 0) {
                dw.field_f = -1;
                ri.field_a = var6_int;
                eia.field_a = lf.field_a;
              } else {
                eia.field_a = mn.field_m;
              }
              ig.field_m.field_g = 0;
            }
            if (eia.field_a == mn.field_m &&
              ii.b(8, 0)) {
              bi.field_j = ig.field_m.c(-121);
              ig.field_m.field_g = 0;
              fha.a(param5, 0, uaa.field_f, param0, param3);
              eia.field_a = lba.field_c;
            }
            boolean decompiledFrameRemainder0 = true;
            if (eia.field_a == lba.field_c &&
              ii.b(1, 0)) {
              var6_intLifetime1 = ig.field_m.b(16711935);
              ij.field_m = null;
              ig.field_m.field_g = 0;
              ri.field_a = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  dw.field_f = -1;
                  eia.field_a = lf.field_a;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  vc.a((byte) -93);
                  se.field_x = false;
                  stackIn_31_0 = var6_intLifetime1;
                  return stackIn_31_0;
                }
              }
              if (decompiledFrameRemainder0) {
                dw.field_f = -1;
                eia.field_a = gca.field_f;
              }
            }
            if (eia.field_a == gca.field_f &&
              u.d((byte) -67)) {
              gha.field_a = ig.field_m.c(-108);
              kda.field_b = param1;
              hea.field_r = ig.field_m.b(16711935);
              hka.field_i = ig.field_m.b(16711935);
              dm.field_f = ig.field_m.e((byte) 115);
              var11 = ig.field_m.g((byte) 65);
              var7 = ig.field_m.b(16711935);
              if ((1 & var7) != 0) {
                gma.b(99);
              }
              stackIn_44_0 = ((16 & var7) != 0);
              hk.field_d = stackIn_44_0;
              if (!param3) {
                stackIn_49_0 = ((4 & var7) != 0);
                er.field_y = stackIn_49_0;
                stackIn_52_0 = ((var7 & 8) != 0);
                hl.field_I = stackIn_52_0;
                stackIn_55_0 = ((2 & var7) != 0);
                sea.field_j = stackIn_55_0;
                if (hl.field_I) {
                  sea.field_j = true;
                }
              }
              if (cr.field_b) {
                ig.field_m.b(16711935);
                ig.field_m.b(16711935);
                ig.field_m.f(-64);
                an.field_t = ig.field_m.e((byte) 77);
                kea.field_q = new byte[an.field_t];
                for (var8 = 0; var8 < an.field_t; var8++) {
                  kea.field_q[var8] = ig.field_m.b(true);
                }
              }
              cha.field_l = ig.field_m.g(-107);
              var12 = (CharSequence) ((Object) cha.field_l);
              tca.field_a = fq.a(0, var12);
              rja.field_o = ig.field_m.b(16711935);
              eia.field_a = uca.field_a;
              if (uaa.field_f.a((byte) -106) == bs.field_g) {
                se.field_u.a(94, nia.d(-31768));
              } else {
                if (uaa.field_f.a((byte) -106) == bna.field_x) {
                  er.field_x.a(103, nia.d(-31768));
                }
              }
              se.field_x = false;
              if (var11 != null) {
                hp.a(nia.d(-31768), var11, 3);
              }
              if (dm.field_f <= 0 &&
                !er.field_y) {
                try {
                  ac.a(nia.d(-31768), "unzap", (byte) 64);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  ac.a(nia.d(-31768), "zap", new Object[]{uga.a(gha.field_a, 48)}, (byte) 73);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (dm.field_f > 0) {
                vs.field_c = true;
              }
              sja.field_fb.b(uka.field_i, 8829);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                uka.field_i[var8Lifetime1] = uka.field_i[var8Lifetime1] + 50;
              }
              ig.field_m.b(uka.field_i, 8829);
              stackIn_83_0 = ri.field_a;
              return stackIn_83_0;
            }
            if (lf.field_a == eia.field_a &&
              u.d((byte) -67)) {
              vc.a((byte) -128);
              if (ri.field_a == 7 &&
                !se.field_x) {
                se.field_x = true;
                stackIn_89_0 = -1;
                return stackIn_89_0;
              }
              if (ri.field_a == 7) {
                ri.field_a = 3;
              }
              vt.field_m = ig.field_m.g(81);
              se.field_x = false;
              stackIn_94_0 = ri.field_a;
              return stackIn_94_0;
            }
            var6_intLifetime2 = 52 / ((-58 - param2) / 58);
            if (null == dma.field_b) {
              if (se.field_x) {
                if (ag.e(-9109) <= 30000L) {
                  vt.field_m = qd.field_n;
                } else {
                  vt.field_m = nca.field_b;
                }
                se.field_x = false;
                stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              var7 = kn.field_h;
              kn.field_h = oja.field_c;
              oja.field_c = var7;
              se.field_x = true;
            }
            stackIn_105_0 = -1;
            return stackIn_105_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_108_0 = var6;
            stackIn_108_1 = new StringBuilder().append("mma.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_109_2 = "null";
            } else {
              stackIn_109_2 = "{...}";
            }
            stackIn_111_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_112_2 = "null";
            } else {
              stackIn_112_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
